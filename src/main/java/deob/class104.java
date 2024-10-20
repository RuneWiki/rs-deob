package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("cd")
public class class104 implements Runnable {

    @ObfuscatedName("cd.g")
    public class103 field1682 = null;

    @ObfuscatedName("cd.v")
    public class103 field1679 = null;

    @ObfuscatedName("cd.y")
    public Thread field1683;

    @ObfuscatedName("cd.p")
    public boolean field1681 = false;

    @ObfuscatedName("cd.j")
    public EventQueue field1680;

    public class104() {
        Statics.field1678 = "Unknown";
        Statics.field1689 = "1.1";
        try {
            Statics.field1678 = System.getProperty("java.vendor");
            Statics.field1689 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1680 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1681 = false;
        this.field1683 = new Thread(this);
        this.field1683.setPriority(10);
        this.field1683.setDaemon(true);
        this.field1683.start();
    }

    @ObfuscatedName("cd.v(B)V")
    public final void method1939() {
        synchronized (this) {
            this.field1681 = true;
            this.notifyAll();
        }
        try {
            this.field1683.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class103 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1681) {
                        return;
                    }
                    if (this.field1682 != null) {
                        var2 = this.field1682;
                        this.field1682 = this.field1682.field1669;
                        if (this.field1682 == null) {
                            this.field1679 = null;
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
                int var5 = var2.field1673;
                if (var5 == 1) {
                    var2.field1675 = new Socket(InetAddress.getByName((String) var2.field1674), var2.field1672);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1674);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1672);
                    var2.field1675 = var6;
                } else if (var5 == 4) {
                    var2.field1675 = new DataInputStream(((URL) var2.field1674).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field1672 >> 24 & 0xFF) + "." + (var2.field1672 >> 16 & 0xFF) + "." + (var2.field1672 >> 8 & 0xFF) + "." + (var2.field1672 & 0xFF);
                    var2.field1675 = InetAddress.getByName(var7).getHostName();
                }
                var2.field1671 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1671 = 2;
            }
        }
    }

    @ObfuscatedName("cd.y(IIILjava/lang/Object;I)Lcu;")
    public final class103 method1955(int arg0, int arg1, int arg2, Object arg3) {
        class103 var5 = new class103();
        var5.field1673 = arg0;
        var5.field1672 = arg1;
        var5.field1674 = arg3;
        synchronized (this) {
            if (this.field1679 == null) {
                this.field1679 = this.field1682 = var5;
            } else {
                this.field1679.field1669 = var5;
                this.field1679 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("cd.p(Ljava/lang/String;II)Lcu;")
    public final class103 method1942(String arg0, int arg1) {
        return this.method1955(1, arg1, 0, arg0);
    }

    @ObfuscatedName("cd.j(Ljava/lang/Runnable;II)Lcu;")
    public final class103 method1954(Runnable arg0, int arg1) {
        return this.method1955(2, arg1, 0, arg0);
    }

    @ObfuscatedName("cd.s(II)Lcu;")
    public final class103 method1944(int arg0) {
        return this.method1955(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("cd.k(Ljava/net/URL;I)Lcu;")
    public final class103 method1938(URL arg0) {
        return this.method1955(4, 0, 0, arg0);
    }
}
