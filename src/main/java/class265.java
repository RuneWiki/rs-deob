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

@OriginalClass("client!tk")
public class class265 implements Runnable {

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field4179 = null;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Loh;")
    private class18 field4176 = null;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Z")
    private boolean field4171 = false;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Lfk;")
    public class51 field4183 = null;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lfk;")
    public class51 field4169 = null;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Loh;")
    private class18 field4189 = null;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Lfk;")
    public class51 field4186 = null;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4181;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field4184;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field4178 = 3;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "J")
    public static volatile long field4188;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Lnl;")
    private class34 field4180;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4170;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4172;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Ljava/lang/String;")
    private static String field4173;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4174;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4175;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4177;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4182;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4185;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4190;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "[Lfk;")
    public class51[] field4187;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/String;)Loh;", line = 5)
    public final class18 method1906(int arg0, String arg1) {
        return arg0 == 6641 ? this.method1908(16, (byte) 2, 0, 0, arg1) : (class18) null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)Loh;", line = 15)
    public final class18 method1907(boolean arg0) {
        return arg0 ? this.method1908(5, (byte) 2, 0, 0, (Object) null) : (class18) null;
    }

    @OriginalMember(owner = "client!tk", name = "run", descriptor = "()V", line = 28)
    public final void run() {
        while (true) {
            class18 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4171) {
                        return;
                    }
                    if (this.field4176 != null) {
                        var2 = this.field4176;
                        this.field4176 = this.field4176.field237;
                        if (this.field4176 == null) {
                            this.field4189 = null;
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
                int var5 = var2.field239;
                if (var5 == 1) {
                    if (field4188 > class200.method1375(-16185)) {
                        throw new IOException();
                    }
                    var2.field241 = new Socket(InetAddress.getByName((String) var2.field242), var2.field240);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field242);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field240);
                    var2.field241 = var6;
                } else if (var5 == 4) {
                    if (class200.method1375(-16185) < field4188) {
                        throw new IOException();
                    }
                    var2.field241 = new DataInputStream(((URL) var2.field242).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field242);
                    var2.field241 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field242);
                    var2.field241 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field238 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field238 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBIILjava/lang/Object;)Loh;", line = 128)
    private final class18 method1908(int arg0, byte arg1, int arg2, int arg3, Object arg4) {
        class18 var6 = new class18();
        var6.field239 = arg0;
        var6.field242 = arg4;
        var6.field240 = arg3;
        synchronized (this) {
            if (arg1 != 2) {
                this.method1910((Class[]) null, 124, (Class) null, (String) null);
            }
            if (this.field4189 == null) {
                this.field4189 = this.field4176 = var6;
            } else {
                this.field4189.field237 = var6;
                this.field4189 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)Loh;", line = 161)
    public final class18 method1909(int arg0, boolean arg1) {
        if (!arg1) {
            this.field4186 = (class51) null;
        }
        return this.method1908(3, (byte) 2, 0, arg0, (Object) null);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Loh;", line = 178)
    public final class18 method1910(Class[] arg0, int arg1, Class arg2, String arg3) {
        if (arg1 > -56) {
            field4188 = 81L;
        }
        return this.method1908(8, (byte) 2, 0, 0, new Object[] { arg2, arg3, arg0 });
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BILjava/awt/Component;I)Loh;", line = 190)
    public final class18 method1911(byte arg0, int arg1, Component arg2, int arg3) {
        Point var5 = arg2.getLocationOnScreen();
        return arg0 < 113 ? (class18) null : this.method1908(14, (byte) 2, var5.y + arg3, arg1 - -var5.x, (Object) null);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Lnl;", line = 202)
    public final class34 method1912(byte arg0) {
        if (arg0 != 106) {
            this.method1906(68, (String) null);
        }
        return this.field4180;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V", line = 219)
    public final void method1913(boolean arg0) {
        field4188 = class200.method1375(-16185) + 5000L;
        if (arg0) {
            this.field4179 = (Applet) null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z", line = 233)
    public final boolean method1914(int arg0) {
        if (arg0 != 26960) {
            field4172 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;IZ)Loh;", line = 250)
    public final class18 method1915(String arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method1918((Frame) null, -4);
        }
        return this.method1908(1, (byte) 2, 0, arg1, arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZLjava/awt/Component;)Loh;", line = 263)
    public final class18 method1916(boolean arg0, boolean arg1, Component arg2) {
        if (!arg0) {
            this.method1917(114);
        }
        return this.method1908(15, (byte) 2, 0, arg1 ? 1 : 0, arg2);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 273)
    public final void method1917(int arg0) {
        if (arg0 != 2) {
            return;
        }
        synchronized (this) {
            this.field4171 = true;
            this.notifyAll();
        }
        try {
            this.field4184.join();
        } catch (InterruptedException var14) {
        }
        if (this.field4186 != null) {
            try {
                this.field4186.method316(arg0 ^ 0x3);
            } catch (IOException var13) {
            }
        }
        if (this.field4183 != null) {
            try {
                this.field4183.method316(1);
            } catch (IOException var12) {
            }
        }
        if (this.field4187 != null) {
            for (int var7 = 0; var7 < this.field4187.length; var7++) {
                if (this.field4187[var7] != null) {
                    try {
                        this.field4187[var7].method316(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4169 != null) {
            try {
                this.field4169.method316(1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 460)
    public class265(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4170 = "1.1";
        field4175 = "Unknown";
        this.field4179 = arg0;
        try {
            field4175 = System.getProperty("java.vendor");
            field4170 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field4174 = System.getProperty("os.name");
        } catch (Exception var19) {
            field4174 = "Unknown";
        }
        field4172 = field4174.toLowerCase();
        try {
            field4182 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field4182 = "";
        }
        try {
            field4177 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field4177 = "";
        }
        try {
            field4173 = System.getProperty("user.home");
            if (field4173 != null) {
                field4173 = field4173 + "/";
            }
        } catch (Exception var16) {
        }
        if (field4173 == null) {
            field4173 = "~/";
        }
        try {
            this.field4181 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field4190 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4190 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field4185 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4185 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field4171 = false;
        this.field4184 = new Thread(this);
        this.field4184.setPriority(10);
        this.field4184.setDaemon(true);
        this.field4184.start();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Frame;I)Loh;", line = 334)
    public final class18 method1918(Frame arg0, int arg1) {
        return arg1 == 10661 ? this.method1908(7, (byte) 2, 0, 0, arg0) : (class18) null;
    }

    static {
        new Hashtable(16);
        field4188 = 0L;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)Loh;", line = 350)
    public final class18 method1919(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 95 / ((-arg3 - 29) / 41);
        return this.method1908(6, (byte) 2, (arg2 << 16) + arg4, (arg0 << 16) + arg1, (Object) null);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/Class;)Loh;", line = 364)
    public final class18 method1920(int arg0, Class arg1) {
        if (arg0 != -19961) {
            this.field4186 = (class51) null;
        }
        return this.method1908(10, (byte) 2, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(ILjava/lang/String;)Loh;", line = 392)
    public final class18 method1921(int arg0, String arg1) {
        return arg0 == 10 ? this.method1908(12, (byte) 2, 0, 0, arg1) : (class18) null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/net/URL;B)Loh;", line = 406)
    public final class18 method1922(URL arg0, byte arg1) {
        return arg1 <= 67 ? (class18) null : this.method1908(4, (byte) 2, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Loh;", line = 418)
    public final class18 method1923(Class arg0, byte arg1, String arg2) {
        if (arg1 != 17) {
            field4170 = (String) null;
        }
        return this.method1908(9, (byte) 2, 0, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Loh;", line = 430)
    public final class18 method1924(Component arg0, Point arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= 76) {
            this.field4171 = true;
        }
        return this.method1908(17, (byte) 2, arg3, arg5, new Object[] { arg0, arg2, arg1 });
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/Class;I)Loh;", line = 441)
    public final class18 method1925(Class arg0, int arg1) {
        if (arg1 >= -75) {
            this.field4179 = (Applet) null;
        }
        return this.method1908(11, (byte) 2, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBLjava/lang/Runnable;)Loh;", line = 540)
    public final class18 method1926(int arg0, byte arg1, Runnable arg2) {
        if (arg1 != 49) {
            this.field4186 = (class51) null;
        }
        return this.method1908(2, (byte) 2, 0, arg0, arg2);
    }
}
