package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ce")
public abstract class class101 implements Runnable {

    @ObfuscatedName("ce.o")
    public final Thread field1358 = new Thread(this);

    @ObfuscatedName("ce.q")
    public volatile boolean field1356;

    @ObfuscatedName("ce.l")
    public Queue field1357 = new LinkedList();

    public class101() {
        this.field1358.setPriority(1);
        this.field1358.start();
    }

    public void run() {
        while (!this.field1356) {
            try {
                class103 var2;
                synchronized (this) {
                    var2 = (class103) this.field1357.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2392(var2);
            } catch (Exception var8) {
                class464.method5148((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ce.q(Ljava/net/URLConnection;B)V")
    public void method2382(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
    }

    @ObfuscatedName("ce.l(Ljava/net/URLConnection;Lcb;B)V")
    public void method2383(URLConnection arg0, class103 arg1) {
        DataInputStream var3 = null;
        try {
            int var4 = arg0.getContentLength();
            var3 = new DataInputStream(arg0.getInputStream());
            byte[] var5;
            if (var4 >= 0) {
                var5 = new byte[var4];
                var3.readFully(var5);
            } else {
                var5 = new byte[0];
                byte[] var6 = class354.method2542(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                Statics.method2961(var6);
            }
            arg1.field1365 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("ce.k(Ljava/net/URL;I)Lcb;")
    public class103 method2399(URL arg0) {
        class103 var2 = new class103(arg0);
        synchronized (this) {
            this.field1357.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ce.a(I)V")
    public void method2389() {
        this.field1356 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1358.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ce.o(Lcb;I)V")
    public abstract void method2392(class103 arg0) throws IOException;
}
