package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("dz")
public class class114 implements Runnable {

    @ObfuscatedName("dz.f")
    public final Thread field1419 = new Thread(this);

    @ObfuscatedName("dz.e")
    public volatile boolean field1417;

    @ObfuscatedName("dz.v")
    public Queue field1416 = new LinkedList();

    public class114() {
        this.field1419.setPriority(1);
        this.field1419.start();
    }

    public void run() {
        while (!this.field1417) {
            try {
                class115 var2;
                synchronized (this) {
                    var2 = (class115) this.field1416.poll();
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
                    var6 = var2.field1428.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1426 = var8;
                    }
                    var2.field1427 = true;
                } catch (IOException var18) {
                    var2.field1427 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class407.method5131((String) null, var21);
            }
        }
    }

    @ObfuscatedName("dz.f(Ljava/net/URL;I)Ldc;")
    public class115 method2224(URL arg0) {
        class115 var2 = new class115(arg0);
        synchronized (this) {
            this.field1416.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("dz.e(S)V")
    public void method2222() {
        this.field1417 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1419.join();
        } catch (InterruptedException var5) {
        }
    }
}
