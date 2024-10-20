package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("df")
public class class128 implements Runnable {

    @ObfuscatedName("df.g")
    public class49 field2008;

    @ObfuscatedName("df.n")
    public class138 field2012 = null;

    @ObfuscatedName("df.t")
    public class138 field2010 = null;

    @ObfuscatedName("df.e")
    public Thread field2007;

    @ObfuscatedName("df.q")
    public boolean field2006 = false;

    @ObfuscatedName("df.z")
    public EventQueue field2009;

    public class128() {
        Statics.field2018 = "Unknown";
        Statics.field2013 = "1.1";
        try {
            Statics.field2018 = System.getProperty("java.vendor");
            Statics.field2013 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field2009 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field2006 = false;
        this.field2007 = new Thread(this);
        this.field2007.setPriority(10);
        this.field2007.setDaemon(true);
        this.field2007.start();
    }

    @ObfuscatedName("df.g(I)V")
    public final void method2538() {
        synchronized (this) {
            this.field2006 = true;
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
                    if (this.field2006) {
                        return;
                    }
                    if (this.field2012 != null) {
                        var2 = this.field2012;
                        this.field2012 = this.field2012.field2142;
                        if (this.field2012 == null) {
                            this.field2010 = null;
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
                int var5 = var2.field2140;
                if (var5 == 1) {
                    var2.field2134 = new Socket(InetAddress.getByName((String) var2.field2141), var2.field2139);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2141);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2139);
                    var2.field2134 = var6;
                } else if (var5 == 4) {
                    var2.field2134 = new DataInputStream(((URL) var2.field2141).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2139 >> 24 & 0xFF) + "." + (var2.field2139 >> 16 & 0xFF) + "." + (var2.field2139 >> 8 & 0xFF) + "." + (var2.field2139 & 0xFF);
                    var2.field2134 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2138 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2138 = 2;
            }
        }
    }

    @ObfuscatedName("df.n(IIILjava/lang/Object;I)Lej;")
    public final class138 method2543(int arg0, int arg1, int arg2, Object arg3) {
        class138 var5 = new class138();
        var5.field2140 = arg0;
        var5.field2139 = arg1;
        var5.field2141 = arg3;
        synchronized (this) {
            if (this.field2010 == null) {
                this.field2010 = this.field2012 = var5;
            } else {
                this.field2010.field2142 = var5;
                this.field2010 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("df.t(Ljava/lang/String;II)Lej;")
    public final class138 method2545(String arg0, int arg1) {
        return this.method2543(1, arg1, 0, arg0);
    }

    @ObfuscatedName("df.e(Ljava/lang/Runnable;II)Lej;")
    public final class138 method2541(Runnable arg0, int arg1) {
        return this.method2543(2, arg1, 0, arg0);
    }

    @ObfuscatedName("df.q(II)Lej;")
    public final class138 method2561(int arg0) {
        return this.method2543(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("df.z(Ljava/net/URL;B)Lej;")
    public final class138 method2542(URL arg0) {
        return this.method2543(4, 0, 0, arg0);
    }

    @ObfuscatedName("df.v(I)Lae;")
    public final class49 method2544() {
        return this.field2008;
    }
}
