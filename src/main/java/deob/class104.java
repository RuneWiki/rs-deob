package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("ct")
public class class104 implements Runnable {

    @ObfuscatedName("ct.x")
    public class103 field1671 = null;

    @ObfuscatedName("ct.q")
    public class103 field1670 = null;

    @ObfuscatedName("ct.d")
    public Thread field1673;

    @ObfuscatedName("ct.k")
    public boolean field1674 = false;

    @ObfuscatedName("ct.j")
    public EventQueue field1675;

    public class104() {
        Statics.field1672 = "Unknown";
        Statics.field1679 = "1.1";
        try {
            Statics.field1672 = System.getProperty("java.vendor");
            Statics.field1679 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1675 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1674 = false;
        this.field1673 = new Thread(this);
        this.field1673.setPriority(10);
        this.field1673.setDaemon(true);
        this.field1673.start();
    }

    @ObfuscatedName("ct.q(I)V")
    public final void method1818() {
        synchronized (this) {
            this.field1674 = true;
            this.notifyAll();
        }
        try {
            this.field1673.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1674) {
                        return;
                    }
                    if (this.field1671 != null) {
                        var2 = this.field1671;
                        this.field1671 = this.field1671.field1664;
                        if (this.field1671 == null) {
                            this.field1670 = null;
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
                int var5 = var2.field1661;
                if (var5 == 1) {
                    var2.field1665 = new Socket(InetAddress.getByName((String) var2.field1667), var2.field1666);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1667);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1666);
                    var2.field1665 = var6;
                } else if (var5 == 4) {
                    var2.field1665 = new DataInputStream(((URL) var2.field1667).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1666 >> 24 & 0xFF) + "." + (var2.field1666 >> 16 & 0xFF) + "." + (var2.field1666 >> 8 & 0xFF) + "." + (var2.field1666 & 0xFF);
                    var2.field1665 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1668 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1668 = 2;
            }
        }
    }

    @ObfuscatedName("ct.d(IIILjava/lang/Object;I)Lcn;")
    public final class103 method1821(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1661 = arg0;
        var5.field1666 = arg1;
        var5.field1667 = arg3;
        synchronized (this) {
            if (this.field1670 == null) {
                this.field1670 = this.field1671 = var5;
            } else {
                this.field1670.field1664 = var5;
                this.field1670 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("ct.k(Ljava/lang/String;II)Lcn;")
    public final class103 method1819(String arg0, int arg1) {
        return this.method1821(1, arg1, 0, arg0);
    }

    @ObfuscatedName("ct.j(Ljava/lang/Runnable;IB)Lcn;")
    public final class103 method1838(Runnable arg0, int arg1) {
        return this.method1821(2, arg1, 0, arg0);
    }

    @ObfuscatedName("ct.s(II)Lcn;")
    public final class103 method1824(int arg0) {
        return this.method1821(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("ct.o(Ljava/net/URL;I)Lcn;")
    public final class103 method1825(URL arg0) {
        return this.method1821(4, 0, 0, arg0);
    }
}
