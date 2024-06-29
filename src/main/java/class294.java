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

@OriginalClass("client!ko")
public class class294 implements Runnable {

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Ljp;")
    public class199 field4109 = null;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "Z")
    private boolean field4108 = false;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "Ljp;")
    public class199 field4117 = null;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Laa;")
    private class283 field4119 = null;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field4121 = null;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Laa;")
    private class283 field4120 = null;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "Ljp;")
    public class199 field4124 = null;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4111;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field4125;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field4112 = 3;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "J")
    public static volatile long field4129;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "Ljq;")
    private class300 field4110;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4113;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4114;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Ljava/lang/String;")
    private static String field4115;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4116;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4122;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4123;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4126;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4127;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4128;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "[Ljp;")
    public class199[] field4118;

    static {
        new Hashtable(16);
        field4129 = 0L;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Class;I)Laa;", line = 6)
    public final class283 method1896(Class arg0, int arg1) {
        int var3 = 36 / ((34 - arg1) / 56);
        return this.method1919((byte) -97, 0, 11, 0, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Laa;", line = 18)
    public final class283 method1897(int arg0) {
        if (arg0 != 13) {
            this.field4118 = null;
        }
        return this.method1919((byte) -124, 0, 13, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Laa;", line = 30)
    public final class283 method1898(byte arg0) {
        int var2 = -91 / ((arg0 + 56) / 54);
        return this.method1919((byte) -105, 0, 18, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Laa;", line = 40)
    public final class283 method1899(byte arg0, Transferable arg1) {
        if (arg0 >= -69) {
            this.method1916((byte) -125, -1, (Runnable) null);
        }
        return this.method1919((byte) 112, 0, 19, 0, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 50)
    public final byte[] method1900(byte arg0, String arg1) {
        class283 var3 = this.method1918(arg1, 78, 0, 21, 0);
        return arg0 <= 111 ? null : (byte[]) var3.field3999;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/awt/Component;[IILjava/awt/Point;ZI)Laa;", line = 62)
    public final class283 method1901(Component arg0, int[] arg1, int arg2, Point arg3, boolean arg4, int arg5) {
        if (!arg4) {
            this.field4124 = null;
        }
        return this.method1919((byte) -120, arg2, 17, arg5, new Object[] { arg0, arg1, arg3 });
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V", line = 78)
    public final void method1902(int arg0) {
        if (arg0 != 22805) {
            return;
        }
        synchronized (this) {
            this.field4108 = true;
            this.notifyAll();
        }
        try {
            this.field4125.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4117 != null) {
            try {
                this.field4117.method1304(0);
            } catch (IOException var7) {
            }
        }
        if (this.field4109 != null) {
            try {
                this.field4109.method1304(arg0 - 22805);
            } catch (IOException var6) {
            }
        }
        if (this.field4118 != null) {
            for (int var3 = 0; var3 < this.field4118.length; var3++) {
                if (this.field4118[var3] != null) {
                    try {
                        this.field4118[var3].method1304(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4124 != null) {
            try {
                this.field4124.method1304(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z", line = 135)
    public final boolean method1903(byte arg0) {
        if (arg0 < 89) {
            this.field4120 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ko", name = "run", descriptor = "()V", line = 149)
    public final void run() {
        while (true) {
            class283 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4108) {
                        return;
                    }
                    if (this.field4120 != null) {
                        var2 = this.field4120;
                        this.field4120 = this.field4120.field4000;
                        if (this.field4120 == null) {
                            this.field4119 = null;
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
                int var3 = var2.field3997;
                if (var3 == 1) {
                    if (class385.method2442(-6631) < field4129) {
                        throw new IOException();
                    }
                    var2.field3999 = new Socket(InetAddress.getByName((String) var2.field4001), var2.field4002);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4001);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4002);
                    var2.field3999 = var4;
                } else if (var3 == 4) {
                    if (class385.method2442(-6631) < field4129) {
                        throw new IOException();
                    }
                    var2.field3999 = new DataInputStream(((URL) var2.field4001).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4001;
                    var2.field3999 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field4001;
                    var2.field3999 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3999 = var7.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var8 = (Transferable) var2.field4001;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field3998 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3998 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 591)
    public class294(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field4121 = arg0;
        field4116 = "Unknown";
        field4123 = "1.1";
        try {
            field4116 = System.getProperty("java.vendor");
            field4123 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4113 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4113 = "Unknown";
        }
        field4126 = field4113.toLowerCase();
        try {
            field4122 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4122 = "";
        }
        try {
            field4114 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4114 = "";
        }
        try {
            field4115 = System.getProperty("user.home");
            if (field4115 != null) {
                field4115 = field4115 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4115 == null) {
            field4115 = "~/";
        }
        try {
            this.field4111 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4127 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4127 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4128 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4128 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4108 = false;
        this.field4125 = new Thread(this);
        this.field4125.setPriority(10);
        this.field4125.setDaemon(true);
        this.field4125.start();
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)Laa;", line = 274)
    public final class283 method1904(boolean arg0) {
        return arg0 ? this.method1919((byte) 86, 0, 5, 0, (Object) null) : null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)Laa;", line = 289)
    public final class283 method1905(int arg0, String arg1) {
        return arg0 == 0 ? this.method1919((byte) 102, 0, 16, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Laa;", line = 308)
    public final class283 method1906(int arg0) {
        if (arg0 != 2) {
            this.method1896((Class) null, -2);
        }
        return this.method1919((byte) -97, 0, 12, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Laa;", line = 319)
    public final class283 method1907(Class arg0, Class[] arg1, int arg2, String arg3) {
        if (arg2 > -6) {
            this.method1905(52, (String) null);
        }
        return this.method1919((byte) -113, 0, 8, 0, new Object[] { arg0, arg3, arg1 });
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)Laa;", line = 329)
    public final class283 method1908(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 == 2 ? this.method1919((byte) -127, (arg3 << 16) + arg4, 6, (arg1 << 16) + arg0, (Object) null) : null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLjava/lang/Class;)Laa;", line = 342)
    public final class283 method1909(boolean arg0, Class arg1) {
        return arg0 ? null : this.method1919((byte) 33, 0, 10, 0, arg1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;I)Laa;", line = 352)
    public final class283 method1910(String arg0, int arg1) {
        if (arg1 != 21) {
            this.field4110 = null;
        }
        return this.method1919((byte) -117, 0, 21, 0, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/net/URL;B)Laa;", line = 363)
    public final class283 method1911(URL arg0, byte arg1) {
        int var3 = -125 / ((-arg1 - 29) / 34);
        return this.method1919((byte) 81, 0, 4, 0, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILjava/lang/String;)Laa;", line = 373)
    public final class283 method1912(int arg0, int arg1, String arg2) {
        return arg1 == 1 ? this.method1919((byte) 1, arg0, 1, 0, arg2) : null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Laa;", line = 387)
    public final class283 method1913(int arg0, int arg1) {
        if (arg1 > -7) {
            field4123 = null;
        }
        return this.method1919((byte) -119, arg0, 3, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V", line = 401)
    public final void method1914(int arg0) {
        field4129 = class385.method2442(-6631) + 5000L;
        if (arg0 != 0) {
            this.method1909(false, (Class) null);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Laa;", line = 411)
    public final class283 method1915(String arg0, int arg1, Class arg2) {
        return arg1 == 1 ? this.method1919((byte) 9, 0, 9, 0, new Object[] { arg2, arg0 }) : null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BILjava/lang/Runnable;)Laa;", line = 426)
    public final class283 method1916(byte arg0, int arg1, Runnable arg2) {
        if (arg0 != -63) {
            this.method1898((byte) -70);
        }
        return this.method1919((byte) 65, arg1, 2, 0, arg2);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/awt/Frame;I)Laa;", line = 438)
    public final class283 method1917(Frame arg0, int arg1) {
        int var3 = -60 % ((arg1 + 49) / 63);
        return this.method1919((byte) -107, 0, 7, 0, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Object;IIII)Laa;", line = 458)
    private final class283 method1918(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class283 var6 = new class283();
        synchronized (var6) {
            var6.field3997 = arg3;
            var6.field4002 = arg2;
            var6.field4001 = arg0;
            synchronized (this) {
                if (arg1 < 28) {
                    this.field4108 = false;
                }
                if (this.field4119 == null) {
                    this.field4119 = this.field4120 = var6;
                } else {
                    this.field4119.field4000 = var6;
                    this.field4119 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIIILjava/lang/Object;)Laa;", line = 497)
    private final class283 method1919(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        class283 var6 = new class283();
        var6.field4002 = arg1;
        var6.field3997 = arg2;
        var6.field4001 = arg4;
        synchronized (this) {
            int var8 = 92 % ((arg0 + 51) / 44);
            if (this.field4119 == null) {
                this.field4119 = this.field4120 = var6;
            } else {
                this.field4119.field4000 = var6;
                this.field4119 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Ljq;", line = 526)
    public final class300 method1920(int arg0) {
        return arg0 == 13 ? this.field4110 : null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/awt/Component;BI)Laa;", line = 541)
    public final class283 method1921(int arg0, Component arg1, byte arg2, int arg3) {
        int var5 = 74 / ((arg2 + 53) / 61);
        Point var6 = arg1.getLocationOnScreen();
        return this.method1919((byte) 59, var6.x + arg0, 14, arg3 + var6.y, (Object) null);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/Class;B)Laa;", line = 552)
    public final class283 method1922(Class arg0, byte arg1) {
        if (arg1 != -84) {
            field4122 = null;
        }
        return this.method1919((byte) -128, 0, 20, 0, arg0);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZBLjava/awt/Component;)Laa;", line = 565)
    public final class283 method1923(boolean arg0, byte arg1, Component arg2) {
        int var4 = 91 / ((-arg1 - 26) / 43);
        return this.method1919((byte) -115, arg0 ? 1 : 0, 15, 0, arg2);
    }
}
