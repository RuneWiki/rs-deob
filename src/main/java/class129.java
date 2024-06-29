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

@OriginalClass("client!ml")
public class class129 implements Runnable {

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "Lnc;")
    public class141 field2150 = null;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lwi;")
    private class256 field2160 = null;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lwi;")
    private class256 field2157 = null;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lnc;")
    public class141 field2161 = null;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field2162 = null;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Z")
    private boolean field2164 = false;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Lnc;")
    public class141 field2171 = null;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2158;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field2159;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2154 = 3;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "J")
    public static volatile long field2167;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Ldh;")
    private class163 field2168;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2151;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2152;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2153;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2155;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2156;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2165;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2166;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2169;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2170;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "[Lnc;")
    public class141[] field2163;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;I)Lwi;", line = 8)
    public final class256 method911(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field2163 = (class141[]) null;
        }
        return this.method930(0, 12, arg0, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Lwi;", line = 21)
    public final class256 method912(byte arg0, String arg1, Class arg2) {
        return arg0 == 68 ? this.method930(0, 9, new Object[] { arg2, arg1 }, 0, true) : (class256) null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lwi;", line = 32)
    public final class256 method913(byte arg0) {
        if (arg0 != -102) {
            this.field2164 = true;
        }
        return this.method930(0, 5, (Object) null, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 45)
    public final void method914(int arg0) {
        if (arg0 > -12) {
            this.field2158 = (EventQueue) null;
        }
        field2167 = class67.method501(-114) + 5000L;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)Lwi;", line = 57)
    public final class256 method915(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -23272) {
            this.method927(-19, (URL) null);
        }
        return this.method930((arg3 << 16) + arg1, 6, (Object) null, (arg2 << 16) + arg4, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lwi;", line = 70)
    public final class256 method916(Class[] arg0, String arg1, Class arg2, int arg3) {
        if (arg3 != 16) {
            this.method912((byte) 122, (String) null, (Class) null);
        }
        return this.method930(0, 8, new Object[] { arg2, arg1, arg0 }, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/Class;)Lwi;", line = 85)
    public final class256 method917(byte arg0, Class arg1) {
        return arg0 >= -24 ? (class256) null : this.method930(0, 10, arg1, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Ldh;", line = 96)
    public final class163 method918(int arg0) {
        if (arg0 != 9644) {
            this.method931((String) null, (byte) -112, 28);
        }
        return this.field2168;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 108)
    public final void method919(byte arg0) {
        if (arg0 != -45) {
            field2169 = (Method) null;
        }
        synchronized (this) {
            this.field2164 = true;
            this.notifyAll();
        }
        try {
            this.field2159.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2150 != null) {
            try {
                this.field2150.method1038(-1);
            } catch (IOException var13) {
            }
        }
        if (this.field2171 != null) {
            try {
                this.field2171.method1038(-1);
            } catch (IOException var12) {
            }
        }
        if (this.field2163 != null) {
            for (int var7 = 0; var7 < this.field2163.length; var7++) {
                if (this.field2163[var7] != null) {
                    try {
                        this.field2163[var7].method1038(-1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2161 != null) {
            try {
                this.field2161.method1038(-1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lwi;", line = 169)
    public final class256 method920(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field2162 = (Applet) null;
        }
        return this.method930(arg1, 2, arg0, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 470)
    public class129(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2153 = "1.1";
        this.field2162 = arg0;
        field2156 = "Unknown";
        try {
            field2156 = System.getProperty("java.vendor");
            field2153 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2165 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2165 = "Unknown";
        }
        field2166 = field2165.toLowerCase();
        try {
            field2151 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2151 = "";
        }
        try {
            field2155 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2155 = "";
        }
        try {
            field2152 = System.getProperty("user.home");
            if (field2152 != null) {
                field2152 = field2152 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2152 == null) {
            field2152 = "~/";
        }
        try {
            this.field2158 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2170 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2170 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2169 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2169 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2164 = false;
        this.field2159 = new Thread(this);
        this.field2159.setPriority(10);
        this.field2159.setDaemon(true);
        this.field2159.start();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/lang/Class;)Lwi;", line = 193)
    public final class256 method921(boolean arg0, Class arg1) {
        if (!arg0) {
            field2166 = (String) null;
        }
        return this.method930(0, 11, arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Frame;)Lwi;", line = 204)
    public final class256 method922(int arg0, Frame arg1) {
        if (arg0 != 1) {
            this.method919((byte) 11);
        }
        return this.method930(0, 7, arg1, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lwi;", line = 224)
    public final class256 method923(int arg0, int arg1) {
        return arg0 <= 25 ? (class256) null : this.method930(arg1, 3, (Object) null, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Component;Z)Lwi;", line = 235)
    public final class256 method924(int arg0, Component arg1, boolean arg2) {
        return arg0 == 0 ? this.method930(arg2 ? 1 : 0, 15, arg1, 0, true) : (class256) null;
    }

    static {
        new Hashtable(16);
        field2167 = 0L;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Component;III[ILjava/awt/Point;)Lwi;", line = 258)
    public final class256 method925(Component arg0, int arg1, int arg2, int arg3, int[] arg4, Point arg5) {
        return arg2 == 4727 ? this.method930(arg3, 17, new Object[] { arg0, arg4, arg5 }, arg1, true) : (class256) null;
    }

    @OriginalMember(owner = "client!ml", name = "run", descriptor = "()V", line = 274)
    public final void run() {
        while (true) {
            class256 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2164) {
                        return;
                    }
                    if (this.field2160 != null) {
                        var2 = this.field2160;
                        this.field2160 = this.field2160.field4268;
                        if (this.field2160 == null) {
                            this.field2157 = null;
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
                int var5 = var2.field4270;
                if (var5 == 1) {
                    if (field2167 > class67.method501(-123)) {
                        throw new IOException();
                    }
                    var2.field4269 = new Socket(InetAddress.getByName((String) var2.field4266), var2.field4267);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field4266);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field4267);
                    var2.field4269 = var8;
                } else if (var5 == 4) {
                    if (field2167 > class67.method501(-103)) {
                        throw new IOException();
                    }
                    var2.field4269 = new DataInputStream(((URL) var2.field4266).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field4266);
                    var2.field4269 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field4266);
                    var2.field4269 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field4265 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field4265 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/lang/String;)Lwi;", line = 376)
    public final class256 method926(int arg0, String arg1) {
        if (arg0 != 6) {
            this.field2164 = true;
        }
        return this.method930(0, 16, arg1, 0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/net/URL;)Lwi;", line = 386)
    public final class256 method927(int arg0, URL arg1) {
        return arg0 == 0 ? this.method930(0, 4, arg1, 0, true) : (class256) null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Z", line = 396)
    public final boolean method928(int arg0) {
        if (arg0 != 2) {
            this.method927(-53, (URL) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILjava/awt/Component;)Lwi;", line = 418)
    public final class256 method929(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg2 != 14) {
            this.method927(-74, (URL) null);
        }
        return this.method930(arg1 + var5.x, 14, (Object) null, var5.y + arg0, true);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILjava/lang/Object;IZ)Lwi;", line = 432)
    private final class256 method930(int arg0, int arg1, Object arg2, int arg3, boolean arg4) {
        class256 var6 = new class256();
        var6.field4266 = arg2;
        var6.field4270 = arg1;
        var6.field4267 = arg0;
        if (!arg4) {
            return (class256) null;
        }
        synchronized (this) {
            if (this.field2157 == null) {
                this.field2157 = this.field2160 = var6;
            } else {
                this.field2157.field4268 = var6;
                this.field2157 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;BI)Lwi;", line = 459)
    public final class256 method931(String arg0, byte arg1, int arg2) {
        if (arg1 != 43) {
            field2156 = (String) null;
        }
        return this.method930(arg2, 1, arg0, 0, true);
    }
}
