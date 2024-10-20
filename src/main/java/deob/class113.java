package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("do")
public class class113 implements Runnable {

    @ObfuscatedName("do.v")
    public final Thread field1418 = new Thread(this);

    @ObfuscatedName("do.n")
    public volatile boolean field1419;

    @ObfuscatedName("do.f")
    public Queue field1421 = new LinkedList();

    public class113() {
        this.field1418.setPriority(1);
        this.field1418.start();
    }

    public void run() {
        while (!this.field1419) {
            try {
                class114 var2;
                synchronized (this) {
                    var2 = (class114) this.field1421.poll();
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
                    var6 = var2.field1426.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1424 = var8;
                    }
                    var2.field1423 = true;
                } catch (IOException var18) {
                    var2.field1423 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class406.method4407((String) null, var21);
            }
        }
    }

    @ObfuscatedName("do.v(Ljava/net/URL;I)Ldf;")
    public class114 method2189(URL arg0) {
        class114 var2 = new class114(arg0);
        synchronized (this) {
            this.field1421.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("do.n(I)V")
    public void method2190() {
        this.field1419 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1418.join();
        } catch (InterruptedException var5) {
        }
    }
}
