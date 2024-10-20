package deob;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("dz")
public class class123 implements Runnable {

    @ObfuscatedName("dz.h")
    public class47 field1934;

    @ObfuscatedName("dz.v")
    public class133 field1935 = null;

    @ObfuscatedName("dz.q")
    public class133 field1936 = null;

    @ObfuscatedName("dz.s")
    public Thread field1937;

    @ObfuscatedName("dz.g")
    public boolean field1938 = false;

    @ObfuscatedName("dz.u")
    public EventQueue field1933;

    public class123() {
        Statics.field1932 = "Unknown";
        Statics.field1939 = "1.1";
        try {
            Statics.field1932 = System.getProperty("java.vendor");
            Statics.field1939 = System.getProperty("java.version");
        } catch (Exception var4) {
        }
        try {
            this.field1933 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field1938 = false;
        this.field1937 = new Thread(this);
        this.field1937.setPriority(10);
        this.field1937.setDaemon(true);
        this.field1937.start();
    }

    @ObfuscatedName("dz.v(I)V")
    public final void method2515() {
        synchronized (this) {
            this.field1938 = true;
            this.notifyAll();
        }
        try {
            this.field1937.join();
        } catch (InterruptedException var4) {
        }
    }

    public final void run() {
        while (true) {
            class133 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1938) {
                        return;
                    }
                    if (this.field1935 != null) {
                        var2 = this.field1935;
                        this.field1935 = this.field1935.field2062;
                        if (this.field1935 == null) {
                            this.field1936 = null;
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
                int var5 = var2.field2061;
                if (var5 == 1) {
                    var2.field2064 = new Socket(InetAddress.getByName((String) var2.field2059), var2.field2063);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2059);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2063);
                    var2.field2064 = var6;
                } else if (var5 == 4) {
                    var2.field2064 = new DataInputStream(((URL) var2.field2059).openStream());
                } else if (var5 == 3) {
                    String var7 = (var2.field2063 >> 24 & 0xFF) + "." + (var2.field2063 >> 16 & 0xFF) + "." + (var2.field2063 >> 8 & 0xFF) + "." + (var2.field2063 & 0xFF);
                    var2.field2064 = InetAddress.getByName(var7).getHostName();
                }
                var2.field2060 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2060 = 2;
            }
        }
    }

    @ObfuscatedName("dz.q(IIILjava/lang/Object;I)Lee;")
    public final class133 method2506(int arg0, int arg1, int arg2, Object arg3) {
        class133 var5 = new class133();
        var5.field2061 = arg0;
        var5.field2063 = arg1;
        var5.field2059 = arg3;
        synchronized (this) {
            if (this.field1936 == null) {
                this.field1936 = this.field1935 = var5;
            } else {
                this.field1936.field2062 = var5;
                this.field1936 = var5;
            }
            this.notify();
            return var5;
        }
    }

    @ObfuscatedName("dz.s(Ljava/lang/String;II)Lee;")
    public final class133 method2497(String arg0, int arg1) {
        return this.method2506(1, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.g(Ljava/lang/Runnable;IB)Lee;")
    public final class133 method2498(Runnable arg0, int arg1) {
        return this.method2506(2, arg1, 0, arg0);
    }

    @ObfuscatedName("dz.u(II)Lee;")
    public final class133 method2504(int arg0) {
        return this.method2506(3, arg0, 0, (Object) null);
    }

    @ObfuscatedName("dz.d(Ljava/net/URL;B)Lee;")
    public final class133 method2513(URL arg0) {
        return this.method2506(4, 0, 0, arg0);
    }

    @ObfuscatedName("dz.y(I)Law;")
    public final class47 method2495() {
        return this.field1934;
    }
}
