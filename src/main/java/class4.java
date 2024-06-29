import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 implements Runnable {

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lpe;")
    public class262 field56 = null;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lpe;")
    public class262 field62 = null;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field52 = null;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Z")
    private boolean field65 = false;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lpe;")
    public class262 field63 = null;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "Lta;")
    private class82 field68 = null;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lta;")
    private class82 field64 = null;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field55;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field57;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field66 = 3;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "J")
    public static volatile long field71;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lck;")
    private class275 field60;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Ljava/lang/String;")
    public static String field53;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/lang/String;")
    public static String field54;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Ljava/lang/String;")
    public static String field58;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/lang/String;")
    private static String field59;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Ljava/lang/String;")
    public static String field61;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Ljava/lang/String;")
    public static String field67;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Ljava/lang/String;")
    public static String field70;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field72;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field73;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "[Lpe;")
    public class262[] field69;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Lta;", line = 5)
    public final class82 method18(int arg0) {
        if (arg0 != 0) {
            field54 = (String) null;
        }
        return this.method34(0, 5, (Object) null, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z", line = 17)
    public final boolean method19(int arg0) {
        if (arg0 <= 99) {
            this.field52 = (Applet) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lta;", line = 31)
    public final class82 method20(int arg0, Runnable arg1, byte arg2) {
        int var4 = 69 / ((arg2 - 67) / 54);
        return this.method34(0, 2, arg1, false, arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILjava/awt/Component;BLjava/awt/Point;[I)Lta;", line = 40)
    public final class82 method21(int arg0, int arg1, Component arg2, byte arg3, Point arg4, int[] arg5) {
        return arg3 <= 59 ? (class82) null : this.method34(arg0, 17, new Object[] { arg2, arg5, arg4 }, false, arg1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lta;", line = 53)
    public final class82 method22(int arg0, int arg1) {
        int var3 = -100 % ((arg1 + 26) / 41);
        return this.method34(0, 3, (Object) null, false, arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/net/URL;B)Lta;", line = 61)
    public final class82 method23(URL arg0, byte arg1) {
        return arg1 < 2 ? (class82) null : this.method34(0, 4, arg0, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 76)
    public final void method24(byte arg0) {
        synchronized (this) {
            this.field65 = true;
            this.notifyAll();
        }
        try {
            if (arg0 >= -37) {
                return;
            }
            this.field57.join();
        } catch (InterruptedException var14) {
        }
        if (this.field56 != null) {
            try {
                this.field56.method1838(1);
            } catch (IOException var13) {
            }
        }
        if (this.field62 != null) {
            try {
                this.field62.method1838(1);
            } catch (IOException var12) {
            }
        }
        if (this.field69 != null) {
            for (int var7 = 0; var7 < this.field69.length; var7++) {
                if (this.field69[var7] != null) {
                    try {
                        this.field69[var7].method1838(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field63 != null) {
            try {
                this.field63.method1838(1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/lang/Class;)Lta;", line = 133)
    public final class82 method25(byte arg0, Class arg1) {
        if (arg0 < 58) {
            this.method25((byte) 125, (Class) null);
        }
        return this.method34(0, 11, arg1, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 144)
    public final void method26(int arg0) {
        if (arg0 != 5000) {
            field54 = (String) null;
        }
        field71 = class224.method1536(false) + 5000L;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIZ)Lta;", line = 154)
    public final class82 method27(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.field69 = (class262[]) null;
        }
        return this.method34((arg0 << 16) + arg1, 6, (Object) null, false, (arg3 << 16) + arg2);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lta;", line = 164)
    public final class82 method28(int arg0, String arg1, Class arg2) {
        if (arg0 != 9) {
            this.method19(-27);
        }
        return this.method34(0, 9, new Object[] { arg2, arg1 }, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZLjava/awt/Component;)Lta;", line = 177)
    public final class82 method29(int arg0, boolean arg1, Component arg2) {
        return arg0 > -59 ? (class82) null : this.method34(0, 15, arg2, false, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;III)Lta;", line = 188)
    public final class82 method30(Component arg0, int arg1, int arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        if (arg3 != -7244) {
            this.field56 = (class262) null;
        }
        return this.method34(var5.y + arg1, 14, (Object) null, false, var5.x + arg2);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;)Lta;", line = 201)
    public final class82 method31(int arg0, String arg1) {
        if (arg0 != -9) {
            this.method22(21, -119);
        }
        return this.method34(0, 12, arg1, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 461)
    public class4(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field67 = "1.1";
        this.field52 = arg0;
        field53 = "Unknown";
        try {
            field53 = System.getProperty("java.vendor");
            field67 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field61 = System.getProperty("os.name");
        } catch (Exception var19) {
            field61 = "Unknown";
        }
        field70 = field61.toLowerCase();
        try {
            field58 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field58 = "";
        }
        try {
            field54 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field54 = "";
        }
        try {
            field59 = System.getProperty("user.home");
            if (field59 != null) {
                field59 = field59 + "/";
            }
        } catch (Exception var16) {
        }
        if (field59 == null) {
            field59 = "~/";
        }
        try {
            this.field55 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field73 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field73 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field72 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field72 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field65 = false;
        this.field57 = new Thread(this);
        this.field57.setPriority(10);
        this.field57.setDaemon(true);
        this.field57.start();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLjava/lang/String;)Lta;", line = 220)
    public final class82 method32(int arg0, byte arg1, String arg2) {
        if (arg1 < 102) {
            this.method34(73, 121, (Object) null, false, 31);
        }
        return this.method34(0, 1, arg2, false, arg0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lta;", line = 235)
    public final class82 method33(byte arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 > -120) {
            field66 = 66;
        }
        return this.method34(0, 8, new Object[] { arg2, arg1, arg3 }, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IILjava/lang/Object;ZI)Lta;", line = 249)
    private final class82 method34(int arg0, int arg1, Object arg2, boolean arg3, int arg4) {
        class82 var6 = new class82();
        var6.field1501 = arg1;
        var6.field1502 = arg2;
        var6.field1497 = arg4;
        synchronized (this) {
            if (arg3) {
                field67 = (String) null;
            }
            if (this.field68 == null) {
                this.field68 = this.field64 = var6;
            } else {
                this.field68.field1498 = var6;
                this.field68 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Lck;", line = 281)
    public final class275 method35(byte arg0) {
        int var2 = -125 / ((-arg0 - 54) / 63);
        return this.field60;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/Class;)Lta;", line = 291)
    public final class82 method36(int arg0, Class arg1) {
        if (arg0 > -90) {
            this.method30((Component) null, -55, -96, 16);
        }
        return this.method34(0, 10, arg1, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "run", descriptor = "()V", line = 306)
    public final void run() {
        while (true) {
            class82 var2;
            synchronized (this) {
                while (true) {
                    if (this.field65) {
                        return;
                    }
                    if (this.field64 != null) {
                        var2 = this.field64;
                        this.field64 = this.field64.field1498;
                        if (this.field64 == null) {
                            this.field68 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            }
            try {
                int var5 = var2.field1501;
                if (var5 == 1) {
                    if (field71 > class224.method1536(false)) {
                        throw new IOException();
                    }
                    var2.field1499 = new Socket(InetAddress.getByName((String) var2.field1502), var2.field1497);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field1502);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field1497);
                    var2.field1499 = var8;
                } else if (var5 == 4) {
                    if (class224.method1536(false) < field71) {
                        throw new IOException();
                    }
                    var2.field1499 = new DataInputStream(((URL) var2.field1502).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field1502);
                    var2.field1499 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field1502);
                    var2.field1499 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field1500 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field1500 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/lang/String;)Lta;", line = 404)
    public final class82 method37(byte arg0, String arg1) {
        if (arg0 != 8) {
            this.field64 = (class82) null;
        }
        return this.method34(0, 16, arg1, false, 0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Frame;B)Lta;", line = 416)
    public final class82 method38(Frame arg0, byte arg1) {
        return arg1 <= 69 ? (class82) null : this.method34(0, 7, arg0, false, 0);
    }

    static {
        new Hashtable(16);
        field71 = 0L;
    }
}
