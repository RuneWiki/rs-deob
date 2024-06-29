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

@OriginalClass("client!vc")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lcl;")
    private class114 field2178 = null;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lcl;")
    private class114 field2179 = null;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lee;")
    public class309 field2188 = null;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
    private boolean field2176 = false;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field2181 = null;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lee;")
    public class309 field2189 = null;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lee;")
    public class309 field2185 = null;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2187;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field2175;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field2190 = 3;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "J")
    public static volatile long field2195;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lsc;")
    private class152 field2186;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2177;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2180;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2182;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2183;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/lang/String;")
    private static String field2191;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2192;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2193;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2194;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2196;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[Lee;")
    public class309[] field2184;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lcl;", line = 6)
    public final class114 method1007(Component arg0, byte arg1, boolean arg2) {
        if (arg1 > -114) {
            field2195 = -26L;
        }
        return this.method1009(0, true, 15, arg2 ? 1 : 0, arg0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([ILjava/awt/Point;IZILjava/awt/Component;)Lcl;", line = 20)
    public final class114 method1008(int[] arg0, Point arg1, int arg2, boolean arg3, int arg4, Component arg5) {
        if (!arg3) {
            field2196 = (Method) null;
        }
        return this.method1009(arg4, true, 17, arg2, new Object[] { arg5, arg0, arg1 });
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZIILjava/lang/Object;)Lcl;", line = 34)
    private final class114 method1009(int arg0, boolean arg1, int arg2, int arg3, Object arg4) {
        class114 var6 = new class114();
        var6.field1593 = arg2;
        if (!arg1) {
            field2182 = (String) null;
        }
        var6.field1592 = arg4;
        var6.field1596 = arg3;
        synchronized (this) {
            if (this.field2178 == null) {
                this.field2178 = this.field2179 = var6;
            } else {
                this.field2178.field1594 = var6;
                this.field2178 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;Z)Lcl;", line = 64)
    public final class114 method1010(String arg0, boolean arg1) {
        return arg1 ? this.method1009(0, true, 12, 0, arg0) : (class114) null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;IB)Lcl;", line = 77)
    public final class114 method1011(String arg0, int arg1, byte arg2) {
        if (arg2 != -8) {
            field2177 = (String) null;
        }
        return this.method1009(0, true, 1, arg1, arg0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLjava/awt/Frame;)Lcl;", line = 89)
    public final class114 method1012(byte arg0, Frame arg1) {
        if (arg0 != -34) {
            this.field2185 = (class309) null;
        }
        return this.method1009(0, true, 7, 0, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 433)
    public class137(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2181 = arg0;
        field2180 = "1.1";
        field2192 = "Unknown";
        try {
            field2192 = System.getProperty("java.vendor");
            field2180 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2182 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2182 = "Unknown";
        }
        field2193 = field2182.toLowerCase();
        try {
            field2177 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2177 = "";
        }
        try {
            field2183 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2183 = "";
        }
        try {
            field2191 = System.getProperty("user.home");
            if (field2191 != null) {
                field2191 = field2191 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2191 == null) {
            field2191 = "~/";
        }
        try {
            this.field2187 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2194 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2194 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2196 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2196 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2176 = false;
        this.field2175 = new Thread(this);
        this.field2175.setPriority(10);
        this.field2175.setDaemon(true);
        this.field2175.start();
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLjava/net/URL;)Lcl;", line = 105)
    public final class114 method1013(boolean arg0, URL arg1) {
        if (arg0) {
            field2191 = (String) null;
        }
        return this.method1009(0, !arg0, 4, 0, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lcl;", line = 118)
    public final class114 method1014(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 6) {
            this.field2181 = (Applet) null;
        }
        return this.method1009(0, true, 2, arg2, arg0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Z", line = 135)
    public final boolean method1015(byte arg0) {
        int var2 = -13 % ((32 - arg0) / 37);
        return false;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLjava/lang/Class;)Lcl;", line = 143)
    public final class114 method1016(byte arg0, Class arg1) {
        return arg0 == 114 ? this.method1009(0, true, 10, 0, arg1) : (class114) null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lcl;", line = 157)
    public final class114 method1017(byte arg0) {
        int var2 = 12 % ((32 - arg0) / 63);
        return this.method1009(0, true, 5, 0, (Object) null);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lcl;", line = 168)
    public final class114 method1018(String arg0, int arg1, Class arg2) {
        return arg1 > -126 ? (class114) null : this.method1009(0, true, 9, 0, new Object[] { arg2, arg0 });
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/Class;)Lcl;", line = 178)
    public final class114 method1019(int arg0, Class arg1) {
        if (arg0 != 6) {
            this.method1027((byte) 44);
        }
        return this.method1009(0, true, 11, 0, arg1);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 191)
    public final void method1020(byte arg0) {
        synchronized (this) {
            this.field2176 = true;
            this.notifyAll();
        }
        try {
            this.field2175.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2189 != null) {
            try {
                this.field2189.method2135(108);
            } catch (IOException var13) {
            }
        }
        if (this.field2188 != null) {
            try {
                this.field2188.method2135(114);
            } catch (IOException var12) {
            }
        }
        if (this.field2184 != null) {
            for (int var7 = 0; var7 < this.field2184.length; var7++) {
                if (this.field2184[var7] != null) {
                    try {
                        this.field2184[var7].method2135(117);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (arg0 > 102 && this.field2185 != null) {
            try {
                this.field2185.method2135(119);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V", line = 251)
    public final void method1021(byte arg0) {
        field2195 = class219.method1609(-898) + 5000L;
        int var2 = 17 % ((74 - arg0) / 42);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Lcl;", line = 264)
    public final class114 method1022(int arg0, byte arg1) {
        if (arg1 <= 15) {
            this.method1026(78, (String) null);
        }
        return this.method1009(0, true, 3, arg0, (Object) null);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)Lcl;", line = 283)
    public final class114 method1023(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -108) {
            field2177 = (String) null;
        }
        return this.method1009((arg2 << 16) + arg0, true, 6, (arg1 << 16) + arg4, (Object) null);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lcl;", line = 301)
    public final class114 method1024(byte arg0, Class[] arg1, Class arg2, String arg3) {
        int var5 = -35 / ((arg0 - 27) / 60);
        return this.method1009(0, true, 8, 0, new Object[] { arg2, arg3, arg1 });
    }

    static {
        new Hashtable(16);
        field2195 = 0L;
    }

    @OriginalMember(owner = "client!vc", name = "run", descriptor = "()V", line = 322)
    public final void run() {
        while (true) {
            class114 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2176) {
                        return;
                    }
                    if (this.field2179 != null) {
                        var2 = this.field2179;
                        this.field2179 = this.field2179.field1594;
                        if (this.field2179 == null) {
                            this.field2178 = null;
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
                int var5 = var2.field1593;
                if (var5 == 1) {
                    if (class219.method1609(-898) < field2195) {
                        throw new IOException();
                    }
                    var2.field1591 = new Socket(InetAddress.getByName((String) var2.field1592), var2.field1596);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field1592);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field1596);
                    var2.field1591 = var8;
                } else if (var5 == 4) {
                    if (class219.method1609(-898) < field2195) {
                        throw new IOException();
                    }
                    var2.field1591 = new DataInputStream(((URL) var2.field1592).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field1592);
                    var2.field1591 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field1592);
                    var2.field1591 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field1595 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field1595 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLjava/awt/Component;II)Lcl;", line = 425)
    public final class114 method1025(byte arg0, Component arg1, int arg2, int arg3) {
        int var5 = 39 % ((arg0 + 29) / 48);
        Point var6 = arg1.getLocationOnScreen();
        return this.method1009(var6.y + arg3, true, 14, var6.x + arg2, (Object) null);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/lang/String;)Lcl;", line = 515)
    public final class114 method1026(int arg0, String arg1) {
        return arg0 == 0 ? this.method1009(0, true, 16, 0, arg1) : (class114) null;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)Lsc;", line = 527)
    public final class152 method1027(byte arg0) {
        int var2 = 75 % ((arg0 - 37) / 61);
        return this.field2186;
    }
}
