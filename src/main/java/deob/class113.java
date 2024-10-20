package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("de")
public class class113 implements Runnable {

    @ObfuscatedName("de.f")
    public final Thread field1398 = new Thread(this);

    @ObfuscatedName("de.o")
    public volatile boolean field1402;

    @ObfuscatedName("de.u")
    public Queue field1397 = new LinkedList();

    public class113() {
        this.field1398.setPriority(1);
        this.field1398.start();
    }

    public void run() {
        while (!this.field1402) {
            try {
                class114 var2;
                synchronized (this) {
                    var2 = (class114) this.field1397.poll();
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
                    var6 = var2.field1406.openConnection();
                    var6.setConnectTimeout(5000);
                    var6.setReadTimeout(5000);
                    var6.setUseCaches(false);
                    var6.setRequestProperty("Connection", "close");
                    int var7 = var6.getContentLength();
                    if (var7 >= 0) {
                        byte[] var8 = new byte[var7];
                        var5 = new DataInputStream(var6.getInputStream());
                        var5.readFully(var8);
                        var2.field1410 = var8;
                    }
                    var2.field1405 = true;
                } catch (IOException var18) {
                    var2.field1405 = true;
                } finally {
                    if (var5 != null) {
                        var5.close();
                    }
                    if (var6 != null && var6 instanceof HttpURLConnection) {
                        ((HttpURLConnection) var6).disconnect();
                    }
                }
            } catch (Exception var21) {
                class405.method3718((String) null, var21);
            }
        }
    }

    @ObfuscatedName("de.f(Ljava/net/URL;I)Lda;")
    public class114 method2103(URL arg0) {
        class114 var2 = new class114(arg0);
        synchronized (this) {
            this.field1397.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("de.o(I)V")
    public void method2108() {
        this.field1402 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1398.join();
        } catch (InterruptedException var5) {
        }
    }
}
