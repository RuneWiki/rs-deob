package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cd")
public class class104 implements Runnable {

    @ObfuscatedName("cd.u")
    public class103 field1694 = null;

    @ObfuscatedName("cd.h")
    public class103 field1695 = null;

    @ObfuscatedName("cd.r")
    public Thread field1696;

    @ObfuscatedName("cd.o")
    public boolean field1692 = false;

    @ObfuscatedName("cd.l")
    public EventQueue field1697;

    public class104() {
        Statics.field1701 = "Unknown";
        Statics.field1693 = "1.1";
        try {
            Statics.field1701 = System.getProperty("java.vendor");
            Statics.field1693 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1697 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1692 = false;
        this.field1696 = new Thread(this);
        this.field1696.setPriority(10);
        this.field1696.setDaemon(true);
        this.field1696.start();
    }

    @ObfuscatedName("cd.r(I)V")
    public final void method1882() {
        synchronized (this) {
            this.field1692 = true;
            this.notifyAll();
        }
        try {
            this.field1696.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1692) {
                        return;
                    }
                    if (this.field1694 != null) {
                        var2 = this.field1694;
                        this.field1694 = this.field1694.field1683;
                        if (this.field1694 == null) {
                            this.field1695 = null;
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
                int var5 = var2.field1688;
                if (var5 == 1) {
                    var2.field1691 = new Socket(InetAddress.getByName((String) var2.field1690), var2.field1689);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1690);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1689);
                    var2.field1691 = var6;
                } else if (var5 == 4) {
                    var2.field1691 = new DataInputStream(((URL) var2.field1690).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1689 >> 24 & 0xFF) + "." + (var2.field1689 >> 16 & 0xFF) + "." + (var2.field1689 >> 8 & 0xFF) + "." + (var2.field1689 & 0xFF);
                    var2.field1691 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1687 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1687 = 2;
            }
        }
    }

    @ObfuscatedName("cd.o(IIILjava/lang/Object;I)Lcw;")
    public final class103 method1907(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1688 = arg0;
        var5.field1689 = arg1;
        var5.field1690 = arg3;
        synchronized (this) {
            if (this.field1695 == null) {
                this.field1695 = this.field1694 = var5;
            } else {
                this.field1695.field1683 = var5;
                this.field1695 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cd.l(Ljava/lang/String;IS)Lcw;")
    public final class103 method1884(String arg0, int arg1) {
        return this.method1907(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cd.n(Ljava/lang/Runnable;II)Lcw;")
    public final class103 method1885(Runnable arg0, int arg1) {
        return this.method1907(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cd.m(II)Lcw;")
    public final class103 method1892(int arg0) {
        return this.method1907(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cd.w(Ljava/net/URL;I)Lcw;")
    public final class103 method1887(URL arg0) {
        return this.method1907(4, 0, 0, arg0);
    }
}
