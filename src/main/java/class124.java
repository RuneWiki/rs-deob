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

@OriginalClass("client!jh")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lnc;")
    private class161 field1931 = null;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Z")
    private boolean field1934 = false;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lnc;")
    private class161 field1940 = null;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Ln;")
    public class313 field1938 = null;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Ln;")
    public class313 field1943 = null;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "Ljava/applet/Applet;")
    public Applet field1951 = null;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Ln;")
    public class313 field1946 = null;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1945;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field1935;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field1933 = 3;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "J")
    public static volatile long field1950;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "Ldk;")
    private class37 field1944;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1930;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1932;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1936;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Ljava/lang/String;")
    private static String field1937;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1941;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1942;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1947;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1948;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1949;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "[Ln;")
    public class313[] field1939;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)Lnc;", line = 4)
    public final class161 method890(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method904((String) null, 86, 78);
        }
        return this.method900(16, arg0, 0, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 14)
    public final void method891(boolean arg0) {
        synchronized (this) {
            this.field1934 = arg0;
            this.notifyAll();
        }
        try {
            this.field1935.join();
        } catch (InterruptedException var14) {
        }
        if (this.field1943 != null) {
            try {
                this.field1943.method2203(-1);
            } catch (IOException var13) {
            }
        }
        if (this.field1946 != null) {
            try {
                this.field1946.method2203(-1);
            } catch (IOException var12) {
            }
        }
        if (this.field1939 != null) {
            for (int var7 = 0; var7 < this.field1939.length; var7++) {
                if (this.field1939[var7] != null) {
                    try {
                        this.field1939[var7].method2203(-1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field1938 != null) {
            try {
                this.field1938.method2203(-1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lnc;", line = 68)
    public final class161 method892(Class arg0, int arg1, String arg2) {
        return arg1 == 0 ? this.method900(9, new Object[] { arg0, arg2 }, 0, 0, true) : (class161) null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lnc;", line = 83)
    public final class161 method893(int arg0, int arg1) {
        if (arg1 >= -20) {
            this.method904((String) null, -85, -93);
        }
        return this.method900(3, (Object) null, arg0, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;B)Lnc;", line = 96)
    public final class161 method894(String arg0, byte arg1) {
        if (arg1 > -105) {
            this.method895((byte) 36, (Class) null);
        }
        return this.method900(12, arg0, 0, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/lang/Class;)Lnc;", line = 107)
    public final class161 method895(byte arg0, Class arg1) {
        if (arg0 != 113) {
            this.method901((int[]) null, 30, false, (Component) null, 95, (Point) null);
        }
        return this.method900(11, arg1, 0, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 468)
    public class124(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1947 = "Unknown";
        this.field1951 = arg0;
        field1930 = "1.1";
        try {
            field1947 = System.getProperty("java.vendor");
            field1930 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field1936 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1936 = "Unknown";
        }
        field1932 = field1936.toLowerCase();
        try {
            field1942 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1942 = "";
        }
        try {
            field1941 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1941 = "";
        }
        try {
            field1937 = System.getProperty("user.home");
            if (field1937 != null) {
                field1937 = field1937 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1937 == null) {
            field1937 = "~/";
        }
        try {
            this.field1945 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field1949 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1949 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field1948 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1948 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field1934 = false;
        this.field1935 = new Thread(this);
        this.field1935.setPriority(10);
        this.field1935.setDaemon(true);
        this.field1935.start();
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZLjava/net/URL;)Lnc;", line = 121)
    public final class161 method896(boolean arg0, URL arg1) {
        return arg0 ? this.method900(4, arg1, 0, 0, arg0) : (class161) null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 131)
    public final void method897(int arg0) {
        field1950 = class283.method2038((byte) 123) + 5000L;
        if (arg0 != 5981) {
            field1930 = (String) null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lnc;", line = 142)
    public final class161 method898(Runnable arg0, byte arg1, int arg2) {
        return arg1 >= -47 ? (class161) null : this.method900(2, arg0, arg2, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lnc;", line = 152)
    public final class161 method899(Component arg0, int arg1, boolean arg2) {
        if (arg1 != -16026) {
            this.method898((Runnable) null, (byte) 33, 67);
        }
        return this.method900(15, arg0, arg2 ? 1 : 0, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/Object;IIZ)Lnc;", line = 167)
    private final class161 method900(int arg0, Object arg1, int arg2, int arg3, boolean arg4) {
        class161 var6 = new class161();
        var6.field2663 = arg1;
        var6.field2662 = arg0;
        var6.field2665 = arg2;
        synchronized (this) {
            if (!arg4) {
                this.method900(82, (Object) null, 59, 95, false);
            }
            if (this.field1931 == null) {
                this.field1931 = this.field1940 = var6;
            } else {
                this.field1931.field2660 = var6;
                this.field1931 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIZLjava/awt/Component;ILjava/awt/Point;)Lnc;", line = 198)
    public final class161 method901(int[] arg0, int arg1, boolean arg2, Component arg3, int arg4, Point arg5) {
        if (arg2) {
            field1933 = -19;
        }
        return this.method900(17, new Object[] { arg3, arg0, arg5 }, arg4, arg1, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lnc;", line = 212)
    public final class161 method902(Class[] arg0, Class arg1, int arg2, String arg3) {
        return arg2 == 0 ? this.method900(8, new Object[] { arg1, arg3, arg0 }, 0, 0, true) : (class161) null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Frame;B)Lnc;", line = 223)
    public final class161 method903(Frame arg0, byte arg1) {
        int var3 = 116 / ((arg1 - 63) / 60);
        return this.method900(7, arg0, 0, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;II)Lnc;", line = 231)
    public final class161 method904(String arg0, int arg1, int arg2) {
        return arg1 <= 41 ? (class161) null : this.method900(1, arg0, arg2, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Ldk;", line = 248)
    public final class37 method905(int arg0) {
        return arg0 == -4602 ? this.field1944 : (class37) null;
    }

    @OriginalMember(owner = "client!jh", name = "run", descriptor = "()V", line = 262)
    public final void run() {
        while (true) {
            class161 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1934) {
                        return;
                    }
                    if (this.field1940 != null) {
                        var2 = this.field1940;
                        this.field1940 = this.field1940.field2660;
                        if (this.field1940 == null) {
                            this.field1931 = null;
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
                int var5 = var2.field2662;
                if (var5 == 1) {
                    if (field1950 > class283.method2038((byte) 122)) {
                        throw new IOException();
                    }
                    var2.field2664 = new Socket(InetAddress.getByName((String) var2.field2663), var2.field2665);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field2663);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field2665);
                    var2.field2664 = var8;
                } else if (var5 == 4) {
                    if (field1950 > class283.method2038((byte) 125)) {
                        throw new IOException();
                    }
                    var2.field2664 = new DataInputStream(((URL) var2.field2663).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field2663);
                    var2.field2664 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field2663);
                    var2.field2664 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field2661 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field2661 = 2;
            }
        }
    }

    static {
        new Hashtable(16);
        field1950 = 0L;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Z", line = 373)
    public final boolean method906(int arg0) {
        return arg0 == 19747 ? false : false;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIILjava/awt/Component;)Lnc;", line = 388)
    public final class161 method907(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 != 14) {
            this.field1940 = (class161) null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method900(14, (Object) null, arg2 + var5.x, var5.y + arg1, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/Class;)Lnc;", line = 401)
    public final class161 method908(int arg0, Class arg1) {
        if (arg0 != -3) {
            this.field1934 = false;
        }
        return this.method900(10, arg1, 0, 0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIII)Lnc;", line = 422)
    public final class161 method909(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg0 <= 6 ? (class161) null : this.method900(6, (Object) null, (arg2 << 16) + arg4, (arg3 << 16) - -arg1, true);
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)Lnc;", line = 436)
    public final class161 method910(int arg0) {
        if (arg0 != 0) {
            field1950 = 58L;
        }
        return this.method900(5, (Object) null, 0, 0, true);
    }
}
