package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("di")
public abstract class class108 implements Runnable {

    @ObfuscatedName("di.f")
    public final Thread field1411 = new Thread(this);

    @ObfuscatedName("di.w")
    public volatile boolean field1408;

    @ObfuscatedName("di.v")
    public Queue field1409 = new LinkedList();

    @ObfuscatedName("di.s")
    public int field1407;

    public class108(int arg0) {
        this.field1411.setPriority(1);
        this.field1411.start();
        this.field1407 = arg0;
    }

    public void run() {
        while (!this.field1408) {
            try {
                class110 var2;
                synchronized (this) {
                    var2 = (class110) this.field1409.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2713(var2);
            } catch (Exception var8) {
                class500.method2855((String) null, var8);
            }
        }
    }

    @ObfuscatedName("di.w(Ljava/net/URLConnection;I)V")
    public void method2718(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1407);
    }

    @ObfuscatedName("di.v(Ljava/net/URLConnection;Ldg;I)V")
    public void method2722(URLConnection arg0, class110 arg1) {
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
                byte[] var6 = class380.method5045(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class380.method5041(var6);
            }
            arg1.field1424 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("di.s(Ljava/net/URL;I)Ldg;")
    public class110 method2721(URL arg0) {
        class110 var2 = new class110(arg0);
        synchronized (this) {
            this.field1409.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("di.z(I)V")
    public void method2716() {
        this.field1408 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1411.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("di.f(Ldg;I)V")
    public abstract void method2713(class110 arg0) throws IOException;
}
