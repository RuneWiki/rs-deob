package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dx")
public class class127 implements Runnable {

    @ObfuscatedName("dx.f")
    public class48 field1958;

    @ObfuscatedName("dx.j")
    public class137 field1956 = null;

    @ObfuscatedName("dx.l")
    public class137 field1953 = null;

    @ObfuscatedName("dx.g")
    public Thread field1960;

    @ObfuscatedName("dx.k")
    public boolean field1959 = false;

    @ObfuscatedName("dx.p")
    public EventQueue field1955;

    public class127() {
        Statics.field1957 = "Unknown";
        Statics.field1954 = "1.1";
        try {
            Statics.field1957 = System.getProperty("java.vendor");
            Statics.field1954 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1955 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1959 = false;
        this.field1960 = new Thread(this);
        this.field1960.setPriority(10);
        this.field1960.setDaemon(true);
        this.field1960.start();
    }

    @ObfuscatedName("dx.f(I)V")
    public final void method2529() {
        synchronized (this) {
            this.field1959 = true;
            this.notifyAll();
        }
        try {
            this.field1960.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class137 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1959) {
                        return;
                    }
                    if (this.field1956 != null) {
                        var2 = this.field1956;
                        this.field1956 = this.field1956.field2082;
                        if (this.field1956 == null) {
                            this.field1953 = null;
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
                int var5 = var2.field2080;
                if (var5 == 1) {
                    var2.field2079 = new Socket(InetAddress.getByName((String) var2.field2081), var2.field2076);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2081);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2076);
                    var2.field2079 = var6;
                } else if (var5 == 4) {
                    var2.field2079 = new DataInputStream(((URL) var2.field2081).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2076 >> 24 & 0xFF) + "." + (var2.field2076 >> 16 & 0xFF) + "." + (var2.field2076 >> 8 & 0xFF) + "." + (var2.field2076 & 0xFF);
                    var2.field2079 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2078 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2078 = 2;
            }
        }
    }

    @ObfuscatedName("dx.j(IIILjava/lang/Object;B)Les;")
    public final class137 method2543(int arg0, int arg1, int arg2, Object arg3) {
        class137 var5 = new class137();
        var5.field2080 = arg0;
        var5.field2076 = arg1;
        var5.field2081 = arg3;
        synchronized (this) {
            if (this.field1953 == null) {
                this.field1953 = this.field1956 = var5;
            } else {
                this.field1953.field2082 = var5;
                this.field1953 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dx.l(Ljava/lang/String;II)Les;")
    public final class137 method2528(String arg0, int arg1) {
        return this.method2543(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dx.g(Ljava/lang/Runnable;II)Les;")
    public final class137 method2547(Runnable arg0, int arg1) {
        return this.method2543(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dx.k(II)Les;")
    public final class137 method2533(int arg0) {
        return this.method2543(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dx.p(Ljava/net/URL;S)Les;")
    public final class137 method2531(URL arg0) {
        return this.method2543(4, 0, 0, arg0);
    }

    @ObfuscatedName("dx.y(I)Laf;")
    public final class48 method2535() {
        return this.field1958;
    }
}
