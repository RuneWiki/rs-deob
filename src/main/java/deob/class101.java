package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("ck")
public abstract class class101 implements Runnable {

    @ObfuscatedName("ck.v")
    public final Thread field1331 = new Thread(this);

    @ObfuscatedName("ck.c")
    public volatile boolean field1330;

    @ObfuscatedName("ck.i")
    public Queue field1332 = new LinkedList();

    public class101() {
        this.field1331.setPriority(1);
        this.field1331.start();
    }

    public void run() {
        while (!this.field1330) {
            try {
                class103 var2;
                synchronized (this) {
                    var2 = (class103) this.field1332.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2399(var2);
            } catch (Exception var8) {
                class462.method5173((String) null, var8);
            }
        }
    }

    @ObfuscatedName("ck.c(Ljava/net/URLConnection;B)V")
    public void method2400(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
    }

    @ObfuscatedName("ck.i(Ljava/net/URLConnection;Lcw;B)V")
    public void method2401(URLConnection arg0, class103 arg1) {
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
                byte[] var6 = class353.method5239(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class353.method2506(var6);
            }
            arg1.field1339 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("ck.f(Ljava/net/URL;B)Lcw;")
    public class103 method2402(URL arg0) {
        class103 var2 = new class103(arg0);
        synchronized (this) {
            this.field1332.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("ck.b(B)V")
    public void method2403() {
        this.field1330 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1331.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("ck.v(Lcw;I)V")
    public abstract void method2399(class103 arg0) throws IOException;
}
