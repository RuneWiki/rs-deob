package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dd")
public class class128 implements Runnable {

    @ObfuscatedName("dd.e")
    public class49 field1987;

    @ObfuscatedName("dd.f")
    public class138 field1989 = null;

    @ObfuscatedName("dd.w")
    public class138 field1986 = null;

    @ObfuscatedName("dd.t")
    public Thread field1991;

    @ObfuscatedName("dd.s")
    public boolean field1992 = false;

    @ObfuscatedName("dd.c")
    public EventQueue field1993;

    public class128() {
        Statics.field1990 = "Unknown";
        Statics.field1988 = "1.1";
        try {
            Statics.field1990 = System.getProperty("java.vendor");
            Statics.field1988 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1993 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1992 = false;
        this.field1991 = new Thread(this);
        this.field1991.setPriority(10);
        this.field1991.setDaemon(true);
        this.field1991.start();
    }

    @ObfuscatedName("dd.e(B)V")
    public final void method2544() {
        synchronized (this) {
            this.field1992 = true;
            this.notifyAll();
        }
        try {
            this.field1991.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1992) {
                        return;
                    }
                    if (this.field1989 != null) {
                        var2 = this.field1989;
                        this.field1989 = this.field1989.field2124;
                        if (this.field1989 == null) {
                            this.field1986 = null;
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
                int var5 = var2.field2119;
                if (var5 == 1) {
                    var2.field2125 = new Socket(InetAddress.getByName((String) var2.field2122), var2.field2123);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2122);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2123);
                    var2.field2125 = var6;
                } else if (var5 == 4) {
                    var2.field2125 = new DataInputStream(((URL) var2.field2122).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2123 >> 24 & 0xFF) + "." + (var2.field2123 >> 16 & 0xFF) + "." + (var2.field2123 >> 8 & 0xFF) + "." + (var2.field2123 & 0xFF);
                    var2.field2125 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2118 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2118 = 2;
            }
        }
    }

    @ObfuscatedName("dd.f(IIILjava/lang/Object;I)Let;")
    public final class138 method2557(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2119 = arg0;
        var5.field2123 = arg1;
        var5.field2122 = arg3;
        synchronized (this) {
            if (this.field1986 == null) {
                this.field1986 = this.field1989 = var5;
            } else {
                this.field1986.field2124 = var5;
                this.field1986 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dd.w(Ljava/lang/String;II)Let;")
    public final class138 method2546(String arg0, int arg1) {
        return this.method2557(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dd.t(Ljava/lang/Runnable;II)Let;")
    public final class138 method2547(Runnable arg0, int arg1) {
        return this.method2557(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dd.s(II)Let;")
    public final class138 method2548(int arg0) {
        return this.method2557(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dd.c(Ljava/net/URL;I)Let;")
    public final class138 method2559(URL arg0) {
        return this.method2557(4, 0, 0, arg0);
    }

    @ObfuscatedName("dd.d(I)Lan;")
    public final class49 method2551() {
        return this.field1987;
    }
}
