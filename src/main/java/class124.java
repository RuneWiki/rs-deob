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

@OriginalClass("client!te")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lue;")
    public class110 field2136 = null;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field2139 = null;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Z")
    private boolean field2134 = false;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "Lue;")
    public class110 field2146 = null;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lh;")
    private class107 field2150 = null;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Lh;")
    private class107 field2148 = null;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lue;")
    public class110 field2138 = null;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2143;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2141;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field2149 = 3;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "J")
    public static volatile long field2153;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Lm;")
    private class242 field2145;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2133;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2135;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2137;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2140;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2142;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2144;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2151;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2152;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2154;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[Lue;")
    public class110[] field2147;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILjava/lang/Runnable;)Lh;", line = 6)
    public final class107 method802(int arg0, int arg1, Runnable arg2) {
        int var4 = 111 / ((arg1 - 48) / 52);
        return this.method811(2, arg2, arg0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)Lh;", line = 17)
    public final class107 method803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 62) {
            this.method804(false);
        }
        return this.method811(6, (Object) null, (arg2 << 16) + arg1, true, (arg0 << 16) + arg3);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Lh;", line = 28)
    public final class107 method804(boolean arg0) {
        return arg0 ? this.method811(5, (Object) null, 0, arg0, 0) : (class107) null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lh;", line = 39)
    public final class107 method805(Class arg0, Class[] arg1, String arg2, int arg3) {
        return arg3 >= -117 ? (class107) null : this.method811(8, new Object[] { arg0, arg2, arg1 }, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;II)Lh;", line = 53)
    public final class107 method806(String arg0, int arg1, int arg2) {
        if (arg2 != -27289) {
            this.method819((Point) null, 51, 48, (Component) null, (byte) -37, (int[]) null);
        }
        return this.method811(1, arg0, arg1, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 65)
    public final void method807(int arg0) {
        synchronized (this) {
            this.field2134 = true;
            this.notifyAll();
        }
        if (arg0 != 9694) {
            this.method812((Class) null, -26);
        }
        try {
            this.field2141.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2138 != null) {
            try {
                this.field2138.method711(arg0 - 9694);
            } catch (IOException var13) {
            }
        }
        if (this.field2146 != null) {
            try {
                this.field2146.method711(0);
            } catch (IOException var12) {
            }
        }
        if (this.field2147 != null) {
            for (int var7 = 0; var7 < this.field2147.length; var7++) {
                if (this.field2147[var7] != null) {
                    try {
                        this.field2147[var7].method711(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2136 != null) {
            try {
                this.field2136.method711(0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V", line = 126)
    public final void method808(int arg0) {
        if (arg0 == 0) {
            field2153 = class338.method2339((byte) -120) + 5000L;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/awt/Frame;)Lh;", line = 138)
    public final class107 method809(int arg0, Frame arg1) {
        if (arg0 != 2) {
            field2144 = (String) null;
        }
        return this.method811(7, arg1, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Z", line = 154)
    public final boolean method810(int arg0) {
        return arg0 != -18246;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/Object;IZI)Lh;", line = 168)
    private final class107 method811(int arg0, Object arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.field2148 = (class107) null;
        }
        class107 var6 = new class107();
        var6.field1850 = arg2;
        var6.field1849 = arg1;
        var6.field1848 = arg0;
        synchronized (this) {
            if (this.field2150 == null) {
                this.field2150 = this.field2148 = var6;
            } else {
                this.field2150.field1851 = var6;
                this.field2150 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 455)
    public class124(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2133 = "Unknown";
        this.field2139 = arg0;
        field2151 = "1.1";
        try {
            field2133 = System.getProperty("java.vendor");
            field2151 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2144 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2144 = "Unknown";
        }
        field2140 = field2144.toLowerCase();
        try {
            field2142 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2142 = "";
        }
        try {
            field2137 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2137 = "";
        }
        try {
            field2135 = System.getProperty("user.home");
            if (field2135 != null) {
                field2135 = field2135 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2135 == null) {
            field2135 = "~/";
        }
        try {
            this.field2143 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2152 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2152 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2154 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2154 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2134 = false;
        this.field2141 = new Thread(this);
        this.field2141.setPriority(10);
        this.field2141.setDaemon(true);
        this.field2141.start();
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V", line = 207)
    public final void run() {
        while (true) {
            class107 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2134) {
                        return;
                    }
                    if (this.field2148 != null) {
                        var2 = this.field2148;
                        this.field2148 = this.field2148.field1851;
                        if (this.field2148 == null) {
                            this.field2150 = null;
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
                int var5 = var2.field1848;
                if (var5 == 1) {
                    if (class338.method2339((byte) -120) < field2153) {
                        throw new IOException();
                    }
                    var2.field1853 = new Socket(InetAddress.getByName((String) var2.field1849), var2.field1850);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field1849);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field1850);
                    var2.field1853 = var8;
                } else if (var5 == 4) {
                    if (field2153 > class338.method2339((byte) -120)) {
                        throw new IOException();
                    }
                    var2.field1853 = new DataInputStream(((URL) var2.field1849).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field1849);
                    var2.field1853 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field1849);
                    var2.field1853 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1852 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field1852 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/Class;I)Lh;", line = 307)
    public final class107 method812(Class arg0, int arg1) {
        if (arg1 != 0) {
            this.method815((String) null, -102);
        }
        return this.method811(11, arg0, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/Component;III)Lh;", line = 322)
    public final class107 method813(Component arg0, int arg1, int arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        if (arg1 != 27141) {
            this.method811(-46, (Object) null, -65, true, -11);
        }
        return this.method811(14, (Object) null, var5.x + arg3, true, arg2 + var5.y);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lh;", line = 334)
    public final class107 method814(int arg0, String arg1, Class arg2) {
        if (arg0 > -72) {
            this.method813((Component) null, -12, -68, -78);
        }
        return this.method811(9, new Object[] { arg2, arg1 }, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;I)Lh;", line = 344)
    public final class107 method815(String arg0, int arg1) {
        return arg1 <= 43 ? (class107) null : this.method811(12, arg0, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Lm;", line = 358)
    public final class242 method816(int arg0) {
        return arg0 == 9 ? this.field2145 : (class242) null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)Lh;", line = 382)
    public final class107 method817(int arg0, String arg1) {
        if (arg0 != -10972) {
            this.method821((URL) null, -113);
        }
        return this.method811(16, arg1, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Ljava/lang/Class;I)Lh;", line = 392)
    public final class107 method818(Class arg0, int arg1) {
        if (arg1 != 0) {
            this.field2143 = (EventQueue) null;
        }
        return this.method811(10, arg0, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/Point;IILjava/awt/Component;B[I)Lh;", line = 407)
    public final class107 method819(Point arg0, int arg1, int arg2, Component arg3, byte arg4, int[] arg5) {
        if (arg4 != -89) {
            field2153 = 6L;
        }
        return this.method811(17, new Object[] { arg3, arg5, arg0 }, arg2, true, arg1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/awt/Component;Z)Lh;", line = 421)
    public final class107 method820(int arg0, Component arg1, boolean arg2) {
        return arg0 == -31224 ? this.method811(15, arg1, arg2 ? 1 : 0, true, 0) : (class107) null;
    }

    static {
        new Hashtable(16);
        field2153 = 0L;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/net/URL;I)Lh;", line = 443)
    public final class107 method821(URL arg0, int arg1) {
        return arg1 >= 0 ? (class107) null : this.method811(4, arg0, 0, true, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lh;", line = 536)
    public final class107 method822(int arg0, int arg1) {
        int var3 = 11 % ((arg1 + 59) / 41);
        return this.method811(3, (Object) null, arg0, true, 0);
    }
}
