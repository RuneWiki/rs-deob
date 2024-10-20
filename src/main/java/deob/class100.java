package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("cf")
public class class100 implements Runnable {

    @ObfuscatedName("cf.i")
    public final Thread field1291 = new Thread(this);

    @ObfuscatedName("cf.w")
    public volatile boolean field1288;

    @ObfuscatedName("cf.s")
    public Queue field1289 = new LinkedList();

    public class100() {
        this.field1291.setPriority(1);
        this.field1291.start();
    }

    public void run() {
        while (!this.field1288) {
            try {
                class101 var2;
                synchronized (this) {
                    var2 = (class101) this.field1289.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var17) {
                        }
                        continue;
                    }
                }
                DataInputStream var5 = null;
                URLConnection var6 = null;
                try {
                    var6 = var2.field1295.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1297 = var8;
                    }
                    var2.field1296 = true;
                } catch (IOException var18) {
                    var2.field1296 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class425.method2652((String) null, var21);
            }
        }
    }

    @ObfuscatedName("cf.i(Ljava/net/URL;B)Lcm;")
    public class101 method2304(URL arg0) {
        class101 var2 = new class101(arg0);
        synchronized (this) {
            this.field1289.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("cf.w(B)V")
    public void method2291() {
        this.field1288 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1291.join();
        } catch (InterruptedException var5) {
        }
    }
}
