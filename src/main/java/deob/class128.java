package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dz")
public class class128 implements Runnable {

    @ObfuscatedName("dz.a")
    public class49 field1996;

    @ObfuscatedName("dz.w")
    public class138 field1997 = null;

    @ObfuscatedName("dz.m")
    public class138 field2004 = null;

    @ObfuscatedName("dz.h")
    public Thread field1999;

    @ObfuscatedName("dz.i")
    public boolean field2000 = false;

    @ObfuscatedName("dz.r")
    public EventQueue field2001;

    public class128() {
        Statics.field1994 = "Unknown";
        Statics.field1995 = "1.1";
        try {
            Statics.field1994 = System.getProperty("java.vendor");
            Statics.field1995 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2001 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2000 = false;
        this.field1999 = new Thread(this);
        this.field1999.setPriority(10);
        this.field1999.setDaemon(true);
        this.field1999.start();
    }

    @ObfuscatedName("dz.w(B)V")
    public final void method2617() {
        synchronized (this) {
            this.field2000 = true;
            this.notifyAll();
        }
        try {
            this.field1999.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2000) {
                        return;
                    }
                    if (this.field1997 != null) {
                        var2 = this.field1997;
                        this.field1997 = this.field1997.field2119;
                        if (this.field1997 == null) {
                            this.field2004 = null;
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
                int var5 = var2.field2116;
                if (var5 == 1) {
                    var2.field2118 = new Socket(InetAddress.getByName((String) var2.field2111), var2.field2117);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2111);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2117);
                    var2.field2118 = var6;
                } else if (var5 == 4) {
                    var2.field2118 = new DataInputStream(((URL) var2.field2111).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2117 >> 24 & 0xFF) + "." + (var2.field2117 >> 16 & 0xFF) + "." + (var2.field2117 >> 8 & 0xFF) + "." + (var2.field2117 & 0xFF);
                    var2.field2118 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2115 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2115 = 2;
            }
        }
    }

    @ObfuscatedName("dz.m(IIILjava/lang/Object;I)Les;")
    public final class138 method2608(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2116 = arg0;
        var5.field2117 = arg1;
        var5.field2111 = arg3;
        synchronized (this) {
            if (this.field2004 == null) {
                this.field2004 = this.field1997 = var5;
            } else {
                this.field2004.field2119 = var5;
                this.field2004 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dz.h(Ljava/lang/String;IB)Les;")
    public final class138 method2609(String arg0, int arg1) {
        return this.method2608(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.i(Ljava/lang/Runnable;IB)Les;")
    public final class138 method2610(Runnable arg0, int arg1) {
        return this.method2608(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.r(II)Les;")
    public final class138 method2611(int arg0) {
        return this.method2608(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dz.l(Ljava/net/URL;B)Les;")
    public final class138 method2612(URL arg0) {
        return this.method2608(4, 0, 0, arg0);
    }

    @ObfuscatedName("dz.f(I)Law;")
    public final class49 method2613() {
        return this.field1996;
    }
}
