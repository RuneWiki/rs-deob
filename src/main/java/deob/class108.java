package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

@ObfuscatedName("dk")
public abstract class class108 implements Runnable {

    @ObfuscatedName("dk.a")
    public final Thread field1386 = new Thread(this);

    @ObfuscatedName("dk.f")
    public volatile boolean field1385;

    @ObfuscatedName("dk.c")
    public Queue field1389 = new LinkedList();

    @ObfuscatedName("dk.x")
    public int field1387;

    public class108(int arg0) {
        this.field1386.setPriority(1);
        this.field1386.start();
        this.field1387 = arg0;
    }

    public void run() {
        while (!this.field1385) {
            try {
                class110 var2;
                synchronized (this) {
                    var2 = (class110) this.field1389.poll();
                    if (var2 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException var6) {
                        }
                        continue;
                    }
                }
                this.method2581(var2);
            } catch (Exception var8) {
                class489.method7161((String) null, var8);
            }
        }
    }

    @ObfuscatedName("dk.f(Ljava/net/URLConnection;I)V")
    public void method2566(URLConnection arg0) {
        arg0.setConnectTimeout(5000);
        arg0.setReadTimeout(5000);
        arg0.setUseCaches(false);
        arg0.setRequestProperty("Connection", "close");
        arg0.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1387);
    }

    @ObfuscatedName("dk.c(Ljava/net/URLConnection;Lde;I)V")
    public void method2567(URLConnection arg0, class110 arg1) {
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
                byte[] var6 = class373.method442(5000);
                int var7 = var3.read(var6, 0, var6.length);
                while (var7 > -1) {
                    byte[] var8 = new byte[var5.length + var7];
                    System.arraycopy(var5, 0, var8, 0, var5.length);
                    System.arraycopy(var6, 0, var8, var5.length, var7);
                    var5 = var8;
                }
                class373.method3658(var6);
            }
            arg1.field1396 = var5;
        } catch (IOException var12) {
        }
        if (var3 != null) {
            try {
                var3.close();
            } catch (IOException var11) {
            }
        }
    }

    @ObfuscatedName("dk.x(Ljava/net/URL;I)Lde;")
    public class110 method2565(URL arg0) {
        class110 var2 = new class110(arg0);
        synchronized (this) {
            this.field1389.add(var2);
            this.notify();
            return var2;
        }
    }

    @ObfuscatedName("dk.h(B)V")
    public void method2579() {
        this.field1385 = true;
        try {
            synchronized (this) {
                this.notify();
            }
            this.field1386.join();
        } catch (InterruptedException var5) {
        }
    }

    @ObfuscatedName("dk.a(Lde;I)V")
    public abstract void method2581(class110 arg0) throws IOException;
}
