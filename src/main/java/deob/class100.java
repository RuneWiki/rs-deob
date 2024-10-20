package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("cq")
public class class100 implements Runnable {

    @ObfuscatedName("cq.c")
    public final Thread field1295 = new Thread(this);

    @ObfuscatedName("cq.b")
    public volatile boolean field1296;

    @ObfuscatedName("cq.p")
    public Queue field1297 = new LinkedList();

    public class100() {
        this.field1295.setPriority(1);
        this.field1295.start();
    }

    public void run() {
        while (!this.field1296) {
            try {
                class101 var2;
                synchronized (this) {
                    var2 = (class101) this.field1297.poll();
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
                    var6 = var2.field1300.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1302 = var8;
                    }
                    var2.field1304 = true;
                } catch (IOException var18) {
                    var2.field1304 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class443.method6513((String) null, var21);
            }
        }
    }

    @ObfuscatedName("cq.c(Ljava/net/URL;I)Lcf;")
    public class101 method2355(URL arg0) {
        class101 var2 = new class101(arg0);
        synchronized (this) {
            this.field1297.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("cq.b(I)V")
    public void method2353() {
        this.field1296 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1295.join();
        } catch (InterruptedException var5) {
        }
    }
}
