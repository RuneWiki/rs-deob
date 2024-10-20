package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cm")
public class class104 implements Runnable {

    @ObfuscatedName("cm.f")
    public class103 field1656 = null;

    @ObfuscatedName("cm.k")
    public class103 field1657 = null;

    @ObfuscatedName("cm.g")
    public Thread field1658;

    @ObfuscatedName("cm.n")
    public boolean field1659 = false;

    @ObfuscatedName("cm.a")
    public EventQueue field1660;

    public class104() {
        Statics.field1666 = "Unknown";
        Statics.field1664 = "1.1";
        try {
            Statics.field1666 = System.getProperty("java.vendor");
            Statics.field1664 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1660 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1659 = false;
        this.field1658 = new Thread(this);
        this.field1658.setPriority(10);
        this.field1658.setDaemon(true);
        this.field1658.start();
    }

    @ObfuscatedName("cm.f(B)V")
    public final void method1818() {
        synchronized (this) {
            this.field1659 = true;
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
                    if (this.field1659) {
                        return;
                    }
                    if (this.field1656 != null) {
                        var2 = this.field1656;
                        this.field1656 = this.field1656.field1645;
                        if (this.field1656 == null) {
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
                int var5 = var2.field1650;
                if (var5 == 1) {
                    var2.field1653 = new Socket(InetAddress.getByName((String) var2.field1652), var2.field1649);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1652);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1649);
                    var2.field1653 = var6;
                } else if (var5 == 4) {
                    var2.field1653 = new DataInputStream(((URL) var2.field1652).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1649 >> 24 & 0xFF) + "." + (var2.field1649 >> 16 & 0xFF) + "." + (var2.field1649 >> 8 & 0xFF) + "." + (var2.field1649 & 0xFF);
                    var2.field1653 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1651 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1651 = 2;
            }
        }
    }

    @ObfuscatedName("cm.k(IIILjava/lang/Object;I)Lcj;")
    public final class103 method1838(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1650 = arg0;
        var5.field1649 = arg1;
        var5.field1652 = arg3;
        synchronized (this) {
            if (this.field1657 == null) {
                this.field1657 = this.field1656 = var5;
            } else {
                this.field1657.field1645 = var5;
                this.field1657 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cm.a(Ljava/lang/String;II)Lcj;")
    public final class103 method1819(String arg0, int arg1) {
        return this.method1838(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cm.q(Ljava/lang/Runnable;II)Lcj;")
    public final class103 method1820(Runnable arg0, int arg1) {
        return this.method1838(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cm.w(IB)Lcj;")
    public final class103 method1816(int arg0) {
        return this.method1838(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cm.v(Ljava/net/URL;I)Lcj;")
    public final class103 method1817(URL arg0) {
        return this.method1838(4, 0, 0, arg0);
    }
}
