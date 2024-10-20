package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("db")
public class class123 implements Runnable {

    @ObfuscatedName("db.a")
    public class47 field1950;

    @ObfuscatedName("db.g")
    public class133 field1942 = null;

    @ObfuscatedName("db.u")
    public class133 field1943 = null;

    @ObfuscatedName("db.k")
    public Thread field1944;

    @ObfuscatedName("db.m")
    public boolean field1945 = false;

    @ObfuscatedName("db.t")
    public EventQueue field1946;

    public class123() {
        Statics.field1940 = "Unknown";
        Statics.field1939 = "1.1";
        try {
            Statics.field1940 = System.getProperty("java.vendor");
            Statics.field1939 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1946 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1945 = false;
        this.field1944 = new Thread(this);
        this.field1944.setPriority(10);
        this.field1944.setDaemon(true);
        this.field1944.start();
    }

    @ObfuscatedName("db.a(I)V")
    public final void method2494() {
        synchronized (this) {
            this.field1945 = true;
            this.notifyAll();
        }
        try {
            this.field1944.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1945) {
                        return;
                    }
                    if (this.field1942 != null) {
                        var2 = this.field1942;
                        this.field1942 = this.field1942.field2075;
                        if (this.field1942 == null) {
                            this.field1943 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var5 = var2.field2072;
                if (var5 == 1) {
                    var2.field2067 = new Socket(InetAddress.getByName((String) var2.field2074), var2.field2073);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2074);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2073);
                    var2.field2067 = var6;
                } else if (var5 == 4) {
                    var2.field2067 = new DataInputStream(((URL) var2.field2074).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2073 >> 24 & 0xFF) + "." + (var2.field2073 >> 16 & 0xFF) + "." + (var2.field2073 >> 8 & 0xFF) + "." + (var2.field2073 & 0xFF);
                    var2.field2067 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2071 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2071 = 2;
            }
        }
    }

    @ObfuscatedName("db.g(IIILjava/lang/Object;I)Ler;")
    public final class133 method2478(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2072 = arg0;
        var5.field2073 = arg1;
        var5.field2074 = arg3;
        synchronized (this) {
            if (this.field1943 == null) {
                this.field1943 = this.field1942 = var5;
            } else {
                this.field1943.field2075 = var5;
                this.field1943 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("db.u(Ljava/lang/String;II)Ler;")
    public final class133 method2483(String arg0, int arg1) {
        return this.method2478(1, arg1, 0, arg0);
    }

    @ObfuscatedName("db.k(Ljava/lang/Runnable;II)Ler;")
    public final class133 method2480(Runnable arg0, int arg1) {
        return this.method2478(2, arg1, 0, arg0);
    }

    @ObfuscatedName("db.m(II)Ler;")
    public final class133 method2476(int arg0) {
        return this.method2478(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("db.t(Ljava/net/URL;I)Ler;")
    public final class133 method2485(URL arg0) {
        return this.method2478(4, 0, 0, arg0);
    }

    @ObfuscatedName("db.l(B)Lam;")
    public final class47 method2481() {
        return this.field1950;
    }
}
