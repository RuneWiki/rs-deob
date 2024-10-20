package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cc")
public class class104 implements Runnable {

    @ObfuscatedName("cc.i")
    public class103 field1664 = null;

    @ObfuscatedName("cc.a")
    public class103 field1657 = null;

    @ObfuscatedName("cc.f")
    public Thread field1658;

    @ObfuscatedName("cc.c")
    public boolean field1654 = false;

    @ObfuscatedName("cc.d")
    public EventQueue field1660;

    public class104() {
        Statics.field1662 = "Unknown";
        Statics.field1656 = "1.1";
        try {
            Statics.field1662 = System.getProperty("java.vendor");
            Statics.field1656 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1660 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1654 = false;
        this.field1658 = new Thread(this);
        this.field1658.setPriority(10);
        this.field1658.setDaemon(true);
        this.field1658.start();
    }

    @ObfuscatedName("cc.i(B)V")
    public final void method1812() {
        synchronized (this) {
            this.field1654 = true;
            this.notifyAll();
        }
        try {
            this.field1658.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1654) {
                        return;
                    }
                    if (this.field1664 != null) {
                        var2 = this.field1664;
                        this.field1664 = this.field1664.field1650;
                        if (this.field1664 == null) {
                            this.field1657 = null;
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
                int var5 = var2.field1648;
                if (var5 == 1) {
                    var2.field1653 = new Socket(InetAddress.getByName((String) var2.field1652), var2.field1651);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1652);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1651);
                    var2.field1653 = var6;
                } else if (var5 == 4) {
                    var2.field1653 = new DataInputStream(((URL) var2.field1652).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1651 >> 24 & 0xFF) + "." + (var2.field1651 >> 16 & 0xFF) + "." + (var2.field1651 >> 8 & 0xFF) + "." + (var2.field1651 & 0xFF);
                    var2.field1653 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1649 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1649 = 2;
            }
        }
    }

    @ObfuscatedName("cc.a(IIILjava/lang/Object;I)Lct;")
    public final class103 method1816(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1648 = arg0;
        var5.field1651 = arg1;
        var5.field1652 = arg3;
        synchronized (this) {
            if (this.field1657 == null) {
                this.field1657 = this.field1664 = var5;
            } else {
                this.field1657.field1650 = var5;
                this.field1657 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cc.c(Ljava/lang/String;IB)Lct;")
    public final class103 method1814(String arg0, int arg1) {
        return this.method1816(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cc.g(Ljava/lang/Runnable;II)Lct;")
    public final class103 method1815(Runnable arg0, int arg1) {
        return this.method1816(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cc.z(II)Lct;")
    public final class103 method1825(int arg0) {
        return this.method1816(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cc.t(Ljava/net/URL;I)Lct;")
    public final class103 method1817(URL arg0) {
        return this.method1816(4, 0, 0, arg0);
    }
}
