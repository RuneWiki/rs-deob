package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("cj")
public class class100 implements Runnable {

    @ObfuscatedName("cj.l")
    public final Thread field1303 = new Thread(this);

    @ObfuscatedName("cj.q")
    public volatile boolean field1299;

    @ObfuscatedName("cj.f")
    public Queue field1305 = new LinkedList();

    public class100() {
        this.field1303.setPriority(1);
        this.field1303.start();
    }

    public void run() {
        while (!this.field1299) {
            try {
                class101 var2;
                synchronized (this) {
                    var2 = (class101) this.field1305.poll();
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
                    var6 = var2.field1311.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1308 = var8;
                    }
                    var2.field1307 = true;
                } catch (IOException var18) {
                    var2.field1307 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class425.method5430((String) null, var21);
            }
        }
    }

    @ObfuscatedName("cj.l(Ljava/net/URL;I)Lco;")
    public class101 method2275(URL arg0) {
        class101 var2 = new class101(arg0);
        synchronized (this) {
            this.field1305.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("cj.q(I)V")
    public void method2271() {
        this.field1299 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1303.join();
        } catch (InterruptedException var5) {
        }
    }
}
