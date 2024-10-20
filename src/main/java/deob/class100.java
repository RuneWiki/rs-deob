package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("cz")
public class class100 implements Runnable {

    @ObfuscatedName("cz.c")
    public final Thread field1334 = new Thread(this);

    @ObfuscatedName("cz.l")
    public volatile boolean field1332;

    @ObfuscatedName("cz.s")
    public Queue field1333 = new LinkedList();

    public class100() {
        this.field1334.setPriority(1);
        this.field1334.start();
    }

    public void run() {
        while (!this.field1332) {
            try {
                class101 var2;
                synchronized (this) {
                    var2 = (class101) this.field1333.poll();
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
                    var6 = var2.field1337.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1338 = var8;
                    }
                    var2.field1340 = true;
                } catch (IOException var18) {
                    var2.field1340 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class445.method3452((String) null, var21);
            }
        }
    }

    @ObfuscatedName("cz.c(Ljava/net/URL;I)Lcm;")
    public class101 method2287(URL arg0) {
        class101 var2 = new class101(arg0);
        synchronized (this) {
            this.field1333.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("cz.l(B)V")
    public void method2288() {
        this.field1332 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1334.join();
        } catch (InterruptedException var5) {
        }
    }
}
