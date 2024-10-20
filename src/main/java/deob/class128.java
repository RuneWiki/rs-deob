package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dx")
public class class128 implements Runnable {

    @ObfuscatedName("dx.z")
    public class49 field2001;

    @ObfuscatedName("dx.y")
    public class138 field2002 = null;

    @ObfuscatedName("dx.e")
    public class138 field2003 = null;

    @ObfuscatedName("dx.g")
    public Thread field2007;

    @ObfuscatedName("dx.f")
    public boolean field2005 = false;

    @ObfuscatedName("dx.m")
    public EventQueue field2006;

    public class128() {
        Statics.field2000 = "Unknown";
        Statics.field3140 = "1.1";
        try {
            Statics.field2000 = System.getProperty("java.vendor");
            Statics.field3140 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2006 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2005 = false;
        this.field2007 = new Thread(this);
        this.field2007.setPriority(10);
        this.field2007.setDaemon(true);
        this.field2007.start();
    }

    @ObfuscatedName("dx.z(I)V")
    public final void method2627() {
        synchronized (this) {
            this.field2005 = true;
            this.notifyAll();
        }
        try {
            this.field2007.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2005) {
                        return;
                    }
                    if (this.field2002 != null) {
                        var2 = this.field2002;
                        this.field2002 = this.field2002.field2115;
                        if (this.field2002 == null) {
                            this.field2003 = null;
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
                    var2.field2114 = new Socket(InetAddress.getByName((String) var2.field2121), var2.field2120);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2121);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2120);
                    var2.field2114 = var6;
                } else if (var5 == 4) {
                    var2.field2114 = new DataInputStream(((URL) var2.field2121).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2120 >> 24 & 0xFF) + "." + (var2.field2120 >> 16 & 0xFF) + "." + (var2.field2120 >> 8 & 0xFF) + "." + (var2.field2120 & 0xFF);
                    var2.field2114 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2118 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2118 = 2;
            }
        }
    }

    @ObfuscatedName("dx.y(IIILjava/lang/Object;B)Les;")
    public final class138 method2619(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2119 = arg0;
        var5.field2120 = arg1;
        var5.field2121 = arg3;
        synchronized (this) {
            if (this.field2003 == null) {
                this.field2003 = this.field2002 = var5;
            } else {
                this.field2003.field2115 = var5;
                this.field2003 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dx.e(Ljava/lang/String;II)Les;")
    public final class138 method2623(String arg0, int arg1) {
        return this.method2619(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dx.g(Ljava/lang/Runnable;II)Les;")
    public final class138 method2624(Runnable arg0, int arg1) {
        return this.method2619(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dx.f(IS)Les;")
    public final class138 method2620(int arg0) {
        return this.method2619(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dx.m(Ljava/net/URL;B)Les;")
    public final class138 method2626(URL arg0) {
        return this.method2619(4, 0, 0, arg0);
    }

    @ObfuscatedName("dx.a(I)Lap;")
    public final class49 method2642() {
        return this.field2001;
    }
}
