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

@OriginalClass("client!ne")
public class class76 implements Runnable {

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field1086 = null;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Lbc;")
    private class285 field1087 = null;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lih;")
    public class331 field1077 = null;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
    private boolean field1079 = false;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lih;")
    public class331 field1075 = null;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Lih;")
    public class331 field1091 = null;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lbc;")
    private class285 field1080 = null;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1078;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field1088;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field1085 = 3;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "J")
    public static volatile long field1093;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lkl;")
    private class414 field1082;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1074;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1076;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1081;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1083;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Ljava/lang/String;")
    private static String field1089;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1090;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1092;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1094;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1095;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[Lih;")
    public class331[] field1084;

    static {
        new Hashtable(16);
        field1093 = 0L;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lbc;", line = 3)
    public final class285 method586(Runnable arg0, byte arg1, int arg2) {
        if (arg1 != 103) {
            this.method607(121, (Class) null);
        }
        return this.method598(-12773, 0, arg2, 2, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/net/URL;)Lbc;", line = 20)
    public final class285 method587(int arg0, URL arg1) {
        if (arg0 != 4) {
            field1095 = null;
        }
        return this.method598(arg0 ^ 0xFFFFCE1F, 0, 0, 4, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILjava/lang/String;)Lbc;", line = 33)
    public final class285 method588(byte arg0, int arg1, String arg2) {
        return arg0 >= -37 ? null : this.method598(-12773, 0, arg1, 1, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)Lbc;", line = 46)
    public final class285 method589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg4 == 1353396240 ? this.method598(arg4 ^ 0xAF54FE0B, (arg3 << 16) + arg0, (arg1 << 16) + arg2, 6, (Object) null) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 56)
    public final void method590(boolean arg0) {
        synchronized (this) {
            this.field1079 = true;
            this.notifyAll();
            if (arg0) {
                this.method597(-21, (String) null);
            }
        }
        try {
            this.field1088.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1091 != null) {
            try {
                this.field1091.method2009(-118);
            } catch (IOException var7) {
            }
        }
        if (this.field1075 != null) {
            try {
                this.field1075.method2009(-56);
            } catch (IOException var6) {
            }
        }
        if (this.field1084 != null) {
            for (int var3 = 0; var3 < this.field1084.length; var3++) {
                if (this.field1084[var3] != null) {
                    try {
                        this.field1084[var3].method2009(-56);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1077 != null) {
            try {
                this.field1077.method2009(-86);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lbc;", line = 116)
    public final class285 method591(int arg0) {
        if (arg0 != -1939) {
            this.method613(true, (String) null);
        }
        return this.method598(-12773, 0, 0, 13, (Object) null);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/awt/Component;Z)Lbc;", line = 126)
    public final class285 method592(byte arg0, Component arg1, boolean arg2) {
        if (arg0 > -59) {
            this.field1082 = null;
        }
        return this.method598(-12773, 0, arg2 ? 1 : 0, 15, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Lbc;", line = 137)
    public final class285 method593(boolean arg0, Class arg1, Class[] arg2, String arg3) {
        if (!arg0) {
            this.run();
        }
        return this.method598(-12773, 0, 0, 8, new Object[] { arg1, arg3, arg2 });
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/Frame;)Lbc;", line = 150)
    public final class285 method594(int arg0, Frame arg1) {
        if (arg0 != 19905) {
            this.method608(-46, 36);
        }
        return this.method598(-12773, 0, 0, 7, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Lbc;", line = 161)
    public final class285 method595(int arg0) {
        return arg0 < 68 ? null : this.method598(-12773, 0, 0, 18, (Object) null);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Lbc;", line = 172)
    public final class285 method596(int arg0) {
        return arg0 == 5 ? this.method598(arg0 ^ 0xFFFFCE1E, 0, 0, 5, (Object) null) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 182)
    public final byte[] method597(int arg0, String arg1) {
        class285 var3 = this.method602(arg0 ^ 0xFFFFFFAC, 0, arg1, 0, arg0);
        return (byte[]) var3.field3871;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIILjava/lang/Object;)Lbc;", line = 199)
    private final class285 method598(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class285 var6 = new class285();
        var6.field3872 = arg4;
        var6.field3873 = arg3;
        var6.field3874 = arg2;
        synchronized (this) {
            if (this.field1087 == null) {
                this.field1087 = this.field1080 = var6;
            } else {
                this.field1087.field3870 = var6;
                this.field1087 = var6;
            }
            if (arg0 == -12773) {
                this.notify();
                return var6;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Lbc;", line = 231)
    public final class285 method599(int arg0) {
        if (arg0 > -28) {
            field1092 = null;
        }
        return this.method598(-12773, 0, 0, 12, (Object) null);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lbc;", line = 247)
    public final class285 method600(Transferable arg0, byte arg1) {
        if (arg1 <= 16) {
            this.method594(14, (Frame) null);
        }
        return this.method598(-12773, 0, 0, 19, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Lkl;", line = 257)
    public final class414 method601(int arg0) {
        if (arg0 != 33) {
            this.field1088 = null;
        }
        return this.field1082;
    }

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V", line = 270)
    public final void run() {
        while (true) {
            class285 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1079) {
                        return;
                    }
                    if (this.field1080 != null) {
                        var2 = this.field1080;
                        this.field1080 = this.field1080.field3870;
                        if (this.field1080 == null) {
                            this.field1087 = null;
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
                int var3 = var2.field3873;
                if (var3 == 1) {
                    if (field1093 > class199.method1372(30938)) {
                        throw new IOException();
                    }
                    var2.field3871 = new Socket(InetAddress.getByName((String) var2.field3872), var2.field3874);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field3872);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field3874);
                    var2.field3871 = var9;
                } else if (var3 == 4) {
                    if (field1093 > class199.method1372(30938)) {
                        throw new IOException();
                    }
                    var2.field3871 = new DataInputStream(((URL) var2.field3872).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field3872;
                    var2.field3871 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field3872;
                    var2.field3871 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3871 = var4.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field3872;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field3875 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3875 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 569)
    public class76(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1074 = "Unknown";
        field1090 = "1.1";
        this.field1086 = arg0;
        try {
            field1074 = System.getProperty("java.vendor");
            field1090 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1076 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1076 = "Unknown";
        }
        field1083 = field1076.toLowerCase();
        try {
            field1092 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1092 = "";
        }
        try {
            field1081 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1081 = "";
        }
        try {
            field1089 = System.getProperty("user.home");
            if (field1089 != null) {
                field1089 = field1089 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1089 == null) {
            field1089 = "~/";
        }
        try {
            this.field1078 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1095 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1095 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1094 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1094 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1079 = false;
        this.field1088 = new Thread(this);
        this.field1088.setPriority(10);
        this.field1088.setDaemon(true);
        this.field1088.start();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILjava/lang/Object;II)Lbc;", line = 397)
    private final class285 method602(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class285 var6 = new class285();
        synchronized (var6) {
            var6.field3873 = arg4;
            var6.field3872 = arg2;
            var6.field3874 = arg3;
            synchronized (this) {
                if (this.field1087 == null) {
                    this.field1087 = this.field1080 = var6;
                } else {
                    this.field1087.field3870 = var6;
                    this.field1087 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            if (arg0 >= -25) {
                this.field1078 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;IILjava/awt/Point;[II)Lbc;", line = 437)
    public final class285 method603(Component arg0, int arg1, int arg2, Point arg3, int[] arg4, int arg5) {
        return arg5 <= 29 ? null : this.method598(-12773, arg2, arg1, 17, new Object[] { arg0, arg4, arg3 });
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/Class;I)Lbc;", line = 447)
    public final class285 method604(Class arg0, int arg1) {
        if (arg1 != 11) {
            field1094 = null;
        }
        return this.method598(-12773, 0, 0, 10, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/Class;)Lbc;", line = 457)
    public final class285 method605(boolean arg0, Class arg1) {
        if (!arg0) {
            this.method605(true, (Class) null);
        }
        return this.method598(-12773, 0, 0, 20, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Z", line = 467)
    public final boolean method606(int arg0) {
        return arg0 != -34;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/Class;)Lbc;", line = 483)
    public final class285 method607(int arg0, Class arg1) {
        if (arg0 != 9) {
            this.method604((Class) null, -117);
        }
        return this.method598(-12773, 0, 0, 11, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lbc;", line = 494)
    public final class285 method608(int arg0, int arg1) {
        return arg0 < 119 ? null : this.method598(-12773, 0, arg1, 3, (Object) null);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;B)Lbc;", line = 516)
    public final class285 method609(String arg0, byte arg1) {
        if (arg1 != -76) {
            this.method592((byte) 81, (Component) null, true);
        }
        return this.method598(arg1 - 12697, 0, 0, 21, arg0);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 533)
    public final void method610(boolean arg0) {
        field1093 = class199.method1372(30938) + 5000L;
        if (!arg0) {
            this.method602(-92, -90, (Object) null, 71, 97);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lbc;", line = 543)
    public final class285 method611(boolean arg0, String arg1, Class arg2) {
        if (arg0) {
            this.method603((Component) null, 34, 69, (Point) null, (int[]) null, 124);
        }
        return this.method598(-12773, 0, 0, 9, new Object[] { arg2, arg1 });
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILjava/awt/Component;)Lbc;", line = 555)
    public final class285 method612(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        return arg1 == 5081 ? this.method598(arg1 - 17854, var5.y + arg0, arg2 + var5.x, 14, (Object) null) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLjava/lang/String;)Lbc;", line = 649)
    public final class285 method613(boolean arg0, String arg1) {
        if (!arg0) {
            this.method592((byte) -74, (Component) null, true);
        }
        return this.method598(-12773, 0, 0, 16, arg1);
    }
}
