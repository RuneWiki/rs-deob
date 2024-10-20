package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("db")
public class class127 implements Runnable {

    @ObfuscatedName("db.i")
    public class48 field1961;

    @ObfuscatedName("db.b")
    public class137 field1972 = null;

    @ObfuscatedName("db.l")
    public class137 field1963 = null;

    @ObfuscatedName("db.m")
    public Thread field1964;

    @ObfuscatedName("db.w")
    public boolean field1965 = false;

    @ObfuscatedName("db.e")
    public EventQueue field1966;

    public class127() {
        Statics.field1969 = "Unknown";
        Statics.field1960 = "1.1";
        try {
            Statics.field1969 = System.getProperty("java.vendor");
            Statics.field1960 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1966 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1965 = false;
        this.field1964 = new Thread(this);
        this.field1964.setPriority(10);
        this.field1964.setDaemon(true);
        this.field1964.start();
    }

    @ObfuscatedName("db.v(B)V")
    public final void method2478() {
        synchronized (this) {
            this.field1965 = true;
            this.notifyAll();
        }
        try {
            this.field1964.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class137 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1965) {
                        return;
                    }
                    if (this.field1972 != null) {
                        var2 = this.field1972;
                        this.field1972 = this.field1972.field2093;
                        if (this.field1972 == null) {
                            this.field1963 = null;
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
                int var5 = var2.field2098;
                if (var5 == 1) {
                    var2.field2097 = new Socket(InetAddress.getByName((String) var2.field2100), var2.field2099);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2100);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2099);
                    var2.field2097 = var6;
                } else if (var5 == 4) {
                    var2.field2097 = new DataInputStream(((URL) var2.field2100).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2099 >> 24 & 0xFF) + "." + (var2.field2099 >> 16 & 0xFF) + "." + (var2.field2099 >> 8 & 0xFF) + "." + (var2.field2099 & 0xFF);
                    var2.field2097 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2101 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2101 = 2;
            }
        }
    }

    @ObfuscatedName("db.i(IIILjava/lang/Object;I)Lei;")
    public final class137 method2496(int arg0, int arg1, int arg2, Object arg3) {
        class137 var5 = new class137();
        var5.field2098 = arg0;
        var5.field2099 = arg1;
        var5.field2100 = arg3;
        synchronized (this) {
            if (this.field1963 == null) {
                this.field1963 = this.field1972 = var5;
            } else {
                this.field1963.field2093 = var5;
                this.field1963 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("db.b(Ljava/lang/String;IB)Lei;")
    public final class137 method2502(String arg0, int arg1) {
        return this.method2496(1, arg1, 0, arg0);
    }

    @ObfuscatedName("db.l(Ljava/lang/Runnable;II)Lei;")
    public final class137 method2481(Runnable arg0, int arg1) {
        return this.method2496(2, arg1, 0, arg0);
    }

    @ObfuscatedName("db.m(IB)Lei;")
    public final class137 method2482(int arg0) {
        return this.method2496(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("db.w(Ljava/net/URL;I)Lei;")
    public final class137 method2483(URL arg0) {
        return this.method2496(4, 0, 0, arg0);
    }

    @ObfuscatedName("db.e(I)Laf;")
    public final class48 method2484() {
        return this.field1961;
    }
}
