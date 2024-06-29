import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class355 implements Runnable {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Lwj;")
    public class11 field5091 = null;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Lwj;")
    public class11 field5093 = null;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field5106 = null;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Z")
    private boolean field5107 = false;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lgj;")
    private class405 field5097 = null;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Lgj;")
    private class405 field5108 = null;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lwj;")
    public class11 field5101 = null;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5094;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field5095;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field5092 = 3;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "J")
    public static volatile long field5110;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lbn;")
    private class167 field5096;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/lang/String;")
    private static String field5090;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5098;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5099;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5100;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5103;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5104;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5105;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5109;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5111;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[Lwj;")
    public class11[] field5102;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method2149(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                field5098 = null;
            }
            this.field5107 = true;
            this.notifyAll();
        }
        try {
            this.field5095.join();
        } catch (InterruptedException var8) {
        }
        if (this.field5101 != null) {
            try {
                this.field5101.method86((byte) 63);
            } catch (IOException var7) {
            }
        }
        if (this.field5091 != null) {
            try {
                this.field5091.method86((byte) 26);
            } catch (IOException var6) {
            }
        }
        if (this.field5102 != null) {
            for (int var3 = 0; var3 < this.field5102.length; var3++) {
                if (this.field5102[var3] != null) {
                    try {
                        this.field5102[var3].method86((byte) -120);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5093 != null) {
            try {
                this.field5093.method86((byte) -126);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class405 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5107) {
                        return;
                    }
                    if (this.field5097 != null) {
                        var2 = this.field5097;
                        this.field5097 = this.field5097.field5756;
                        if (this.field5097 == null) {
                            this.field5108 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field5758;
                if (var3 == 1) {
                    if (class434.method2591(-19310) < field5110) {
                        throw new IOException();
                    }
                    var2.field5755 = new Socket(InetAddress.getByName((String) var2.field5754), var2.field5757);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field5754);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field5757);
                    var2.field5755 = var9;
                } else if (var3 == 4) {
                    if (field5110 > class434.method2591(-19310)) {
                        throw new IOException();
                    }
                    var2.field5755 = new DataInputStream(((URL) var2.field5754).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field5754;
                    var2.field5755 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field5754;
                    var2.field5755 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5755 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field5754;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field5759 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5759 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIILjava/awt/Component;BLjava/awt/Point;)Lgj;")
    public final class405 method2150(int[] arg0, int arg1, int arg2, Component arg3, byte arg4, Point arg5) {
        if (arg4 != -36) {
            this.field5108 = null;
        }
        return this.method2169(arg2, 17, 2, new Object[] { arg3, arg0, arg5 }, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Lbn;")
    public final class167 method2151(boolean arg0) {
        return arg0 ? null : this.field5096;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public final void method2152(byte arg0) {
        if (arg0 > -39) {
            this.method2174((Class) null, (byte) -13);
        }
        field5110 = class434.method2591(-19310) + 5000L;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILjava/awt/Component;)Lgj;")
    public final class405 method2153(boolean arg0, int arg1, Component arg2) {
        if (arg1 != 0) {
            this.method2155(123, 92, 105, -10, -102);
        }
        return this.method2169(0, 15, 2, arg2, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Lgj;")
    public final class405 method2154(int arg0) {
        return arg0 >= -55 ? null : this.method2169(0, 12, 2, (Object) null, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)Lgj;")
    public final class405 method2155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 == 439 ? this.method2169((arg4 << 16) + arg1, 6, arg2 - 437, (Object) null, (arg3 << 16) + arg0) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/Class;)Lgj;")
    public final class405 method2156(byte arg0, Class arg1) {
        return arg0 < 58 ? null : this.method2169(0, 11, 2, arg1, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lgj;")
    public final class405 method2157(int arg0, boolean arg1, Runnable arg2) {
        return arg1 ? this.method2169(0, 2, 2, arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/net/URL;I)Lgj;")
    public final class405 method2158(URL arg0, int arg1) {
        return arg1 <= 102 ? null : this.method2169(0, 4, 2, arg0, 0);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z")
    public final boolean method2159(byte arg0) {
        if (arg0 <= 60) {
            this.field5094 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/Class;)Lgj;")
    public final class405 method2160(int arg0, Class arg1) {
        return arg0 == 0 ? this.method2169(0, 10, 2, arg1, 0) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public final byte[] method2161(String arg0, boolean arg1) {
        if (!arg1) {
            this.method2155(-123, -105, 18, -61, -3);
        }
        class405 var3 = this.method2165(0, 0, 21, arg0, 0);
        return (byte[]) var3.field5755;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)Lgj;")
    public final class405 method2162(String arg0, byte arg1) {
        return arg1 == -122 ? this.method2169(0, 16, 2, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lgj;")
    public final class405 method2163(byte arg0, Class arg1, String arg2) {
        return arg0 == 69 ? this.method2169(0, 9, 2, new Object[] { arg1, arg2 }, 0) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;[Ljava/lang/Class;)Lgj;")
    public final class405 method2164(Class arg0, byte arg1, String arg2, Class[] arg3) {
        if (arg1 <= 44) {
            field5103 = null;
        }
        return this.method2169(0, 8, 2, new Object[] { arg0, arg2, arg3 }, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/lang/Object;I)Lgj;")
    private final class405 method2165(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class405 var6 = new class405();
        synchronized (var6) {
            var6.field5758 = arg2;
            var6.field5757 = arg4;
            var6.field5754 = arg3;
            synchronized (this) {
                if (this.field5108 == null) {
                    this.field5108 = this.field5097 = var6;
                } else {
                    this.field5108.field5756 = var6;
                    this.field5108 = var6;
                }
                this.notify();
            }
            if (arg1 != 0) {
                this.field5093 = null;
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Component;III)Lgj;")
    public final class405 method2166(Component arg0, int arg1, int arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        return arg3 == 14 ? this.method2169(arg2 + var5.y, 14, arg3 - 12, (Object) null, var5.x + arg1) : null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Lgj;")
    public final class405 method2167(int arg0) {
        if (arg0 != 0) {
            this.field5101 = null;
        }
        return this.method2169(0, 5, 2, (Object) null, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/String;)Lgj;")
    public final class405 method2168(boolean arg0, String arg1) {
        if (!arg0) {
            this.field5106 = null;
        }
        return this.method2169(0, 21, 2, arg1, 0);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIILjava/lang/Object;I)Lgj;")
    private final class405 method2169(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class405 var6 = new class405();
        if (arg2 != 2) {
            this.method2159((byte) -71);
        }
        var6.field5754 = arg3;
        var6.field5758 = arg1;
        var6.field5757 = arg4;
        synchronized (this) {
            if (this.field5108 == null) {
                this.field5108 = this.field5097 = var6;
            } else {
                this.field5108.field5756 = var6;
                this.field5108 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lgj;")
    public final class405 method2170(int arg0, Transferable arg1) {
        return arg0 == 19 ? this.method2169(0, 19, 2, arg1, 0) : null;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Lgj;")
    public final class405 method2171(int arg0) {
        int var2 = -104 % ((3 - arg0) / 33);
        return this.method2169(0, 18, 2, (Object) null, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Frame;I)Lgj;")
    public final class405 method2172(Frame arg0, int arg1) {
        if (arg1 > -116) {
            this.method2161((String) null, true);
        }
        return this.method2169(0, 7, 2, arg0, 0);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Lgj;")
    public final class405 method2173(boolean arg0) {
        return arg0 ? null : this.method2169(0, 13, 2, (Object) null, 0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/Class;B)Lgj;")
    public final class405 method2174(Class arg0, byte arg1) {
        return arg1 == 35 ? this.method2169(0, 20, 2, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLjava/lang/String;)Lgj;")
    public final class405 method2175(int arg0, byte arg1, String arg2) {
        if (arg1 <= 25) {
            this.method2172((Frame) null, 86);
        }
        return this.method2169(0, 1, 2, arg2, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class355(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field5106 = arg0;
        field5100 = "Unknown";
        field5104 = "1.1";
        try {
            field5100 = System.getProperty("java.vendor");
            field5104 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5099 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5099 = "Unknown";
        }
        field5105 = field5099.toLowerCase();
        try {
            field5103 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5103 = "";
        }
        try {
            field5098 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5098 = "";
        }
        try {
            field5090 = System.getProperty("user.home");
            if (field5090 != null) {
                field5090 = field5090 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5090 == null) {
            field5090 = "~/";
        }
        try {
            this.field5094 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5111 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5111 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5109 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5109 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5107 = false;
        this.field5095 = new Thread(this);
        this.field5095.setPriority(10);
        this.field5095.setDaemon(true);
        this.field5095.start();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lgj;")
    public final class405 method2176(int arg0, int arg1) {
        if (arg1 <= 82) {
            this.method2150((int[]) null, -56, -51, (Component) null, (byte) 96, (Point) null);
        }
        return this.method2169(0, 3, 2, (Object) null, arg0);
    }

    static {
        new Hashtable(16);
        field5110 = 0L;
    }
}
