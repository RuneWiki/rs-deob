package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dz")
public class class128 implements Runnable {

    @ObfuscatedName("dz.l")
    public class49 field1941;

    @ObfuscatedName("dz.c")
    public class138 field1942 = null;

    @ObfuscatedName("dz.u")
    public class138 field1951 = null;

    @ObfuscatedName("dz.w")
    public Thread field1944;

    @ObfuscatedName("dz.i")
    public boolean field1945 = false;

    @ObfuscatedName("dz.r")
    public EventQueue field1943;

    public class128() {
        Statics.field1946 = "Unknown";
        Statics.field1947 = "1.1";
        try {
            Statics.field1946 = System.getProperty("java.vendor");
            Statics.field1947 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1943 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1945 = false;
        this.field1944 = new Thread(this);
        this.field1944.setPriority(10);
        this.field1944.setDaemon(true);
        this.field1944.start();
    }

    @ObfuscatedName("dz.c(I)V")
    public final void method2565() {
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
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1945) {
                        return;
                    }
                    if (this.field1942 != null) {
                        var2 = this.field1942;
                        this.field1942 = this.field1942.field2069;
                        if (this.field1942 == null) {
                            this.field1951 = null;
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
                int var5 = var2.field2071;
                if (var5 == 1) {
                    var2.field2074 = new Socket(InetAddress.getByName((String) var2.field2073), var2.field2072);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2073);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2072);
                    var2.field2074 = var6;
                } else if (var5 == 4) {
                    var2.field2074 = new DataInputStream(((URL) var2.field2073).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2072 >> 24 & 0xFF) + "." + (var2.field2072 >> 16 & 0xFF) + "." + (var2.field2072 >> 8 & 0xFF) + "." + (var2.field2072 & 0xFF);
                    var2.field2074 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2070 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2070 = 2;
            }
        }
    }

    @ObfuscatedName("dz.u(IIILjava/lang/Object;I)Lex;")
    public final class138 method2564(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2071 = arg0;
        var5.field2072 = arg1;
        var5.field2073 = arg3;
        synchronized (this) {
            if (this.field1951 == null) {
                this.field1951 = this.field1942 = var5;
            } else {
                this.field1951.field2069 = var5;
                this.field1951 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dz.w(Ljava/lang/String;IB)Lex;")
    public final class138 method2581(String arg0, int arg1) {
        return this.method2564(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.i(Ljava/lang/Runnable;IB)Lex;")
    public final class138 method2566(Runnable arg0, int arg1) {
        return this.method2564(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.r(II)Lex;")
    public final class138 method2567(int arg0) {
        return this.method2564(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dz.f(Ljava/net/URL;I)Lex;")
    public final class138 method2568(URL arg0) {
        return this.method2564(4, 0, 0, arg0);
    }

    @ObfuscatedName("dz.g(I)Laz;")
    public final class49 method2569() {
        return this.field1941;
    }
}
