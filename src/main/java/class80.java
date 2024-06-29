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

@OriginalClass("client!wa")
public class class80 implements Runnable {

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Z")
    private boolean field1156 = false;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lnn;")
    public class120 field1154 = null;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lo;")
    private class285 field1148 = null;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lnn;")
    public class120 field1153 = null;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Ljava/applet/Applet;")
    public Applet field1157 = null;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Lo;")
    private class285 field1163 = null;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lnn;")
    public class120 field1167 = null;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1158;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field1160;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1151 = 3;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "J")
    public static volatile long field1165;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lub;")
    private class62 field1159;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1147;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1149;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1150;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1152;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1161;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1162;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1164;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1166;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1168;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[Lnn;")
    public class120[] field1155;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Component;IB)Lo;", line = 4)
    public final class285 method610(int arg0, Component arg1, int arg2, byte arg3) {
        if (arg3 != -111) {
            this.method611((byte) 38);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method622((Object) null, var5.x + arg2, var5.y + arg0, 14, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lub;", line = 20)
    public final class62 method611(byte arg0) {
        if (arg0 <= 114) {
            this.field1163 = (class285) null;
        }
        return this.field1159;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lo;", line = 31)
    public final class285 method612(Runnable arg0, int arg1, int arg2) {
        int var4 = -120 % ((arg1 - 25) / 38);
        return this.method622(arg0, arg2, 0, 2, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 41)
    public final void method613(int arg0) {
        field1165 = class29.method174(27763) + 5000L;
        int var2 = -71 % ((arg0 + 63) / 36);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lo;", line = 54)
    public final class285 method614(Class[] arg0, Class arg1, int arg2, String arg3) {
        int var5 = 50 % ((arg2 - 67) / 43);
        return this.method622(new Object[] { arg1, arg3, arg0 }, 0, 0, 8, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lo;", line = 65)
    public final class285 method615(String arg0, byte arg1, Class arg2) {
        int var4 = 76 % ((arg1 + 46) / 59);
        return this.method622(new Object[] { arg2, arg0 }, 0, 0, 9, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Frame;I)Lo;", line = 76)
    public final class285 method616(Frame arg0, int arg1) {
        if (arg1 != 9) {
            this.method629(true);
        }
        return this.method622(arg0, 0, 0, 7, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLjava/awt/Component;B)Lo;", line = 89)
    public final class285 method617(boolean arg0, Component arg1, byte arg2) {
        if (arg2 > -33) {
            this.field1167 = (class120) null;
        }
        return this.method622(arg1, arg0 ? 1 : 0, 0, 15, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;I)Lo;", line = 100)
    public final class285 method618(int arg0, String arg1, int arg2) {
        int var4 = -97 / ((arg2 - 30) / 37);
        return this.method622(arg1, arg0, 0, 1, -30608);
    }

    static {
        new Hashtable(16);
        field1165 = 0L;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/Class;)Lo;", line = 113)
    public final class285 method619(int arg0, Class arg1) {
        if (arg0 != -26049) {
            this.method623((byte) -77, (String) null);
        }
        return this.method622(arg1, 0, 0, 11, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/net/URL;B)Lo;", line = 124)
    public final class285 method620(URL arg0, byte arg1) {
        if (arg1 > -28) {
            this.field1155 = (class120[]) null;
        }
        return this.method622(arg0, 0, 0, 4, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;I)Lo;", line = 134)
    public final class285 method621(Component arg0, int[] arg1, int arg2, int arg3, Point arg4, int arg5) {
        if (arg5 != 28581) {
            this.run();
        }
        return this.method622(new Object[] { arg0, arg1, arg4 }, arg3, arg2, 17, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 457)
    public class80(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field1161 = "1.1";
        this.field1157 = arg0;
        field1149 = "Unknown";
        try {
            field1149 = System.getProperty("java.vendor");
            field1161 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field1162 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1162 = "Unknown";
        }
        field1164 = field1162.toLowerCase();
        try {
            field1152 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1152 = "";
        }
        try {
            field1147 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1147 = "";
        }
        try {
            field1150 = System.getProperty("user.home");
            if (field1150 != null) {
                field1150 = field1150 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1150 == null) {
            field1150 = "~/";
        }
        try {
            this.field1158 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field1168 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1168 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field1166 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1166 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field1156 = false;
        this.field1160 = new Thread(this);
        this.field1160.setPriority(10);
        this.field1160.setDaemon(true);
        this.field1160.start();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lo;", line = 153)
    private final class285 method622(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class285 var6 = new class285();
        if (arg4 != -30608) {
            return (class285) null;
        }
        var6.field4242 = arg3;
        var6.field4239 = arg0;
        var6.field4240 = arg1;
        synchronized (this) {
            if (this.field1163 == null) {
                this.field1163 = this.field1148 = var6;
            } else {
                this.field1163.field4243 = var6;
                this.field1163 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLjava/lang/String;)Lo;", line = 187)
    public final class285 method623(byte arg0, String arg1) {
        int var3 = -81 % ((45 - arg0) / 44);
        return this.method622(arg1, 0, 0, 16, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z", line = 210)
    public final boolean method624(boolean arg0) {
        if (!arg0) {
            this.method614((Class[]) null, (Class) null, -103, (String) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lo;", line = 230)
    public final class285 method625(int arg0, int arg1) {
        int var3 = -42 / ((arg0 + 63) / 49);
        return this.method622((Object) null, arg1, 0, 3, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)Lo;", line = 241)
    public final class285 method626(byte arg0) {
        int var2 = -8 % ((arg0 - 31) / 42);
        return this.method622((Object) null, 0, 0, 5, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/Class;I)Lo;", line = 249)
    public final class285 method627(Class arg0, int arg1) {
        if (arg1 <= 121) {
            this.method628(-118, -100, -70, 63, 120);
        }
        return this.method622(arg0, 0, 0, 10, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)Lo;", line = 266)
    public final class285 method628(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -69 / ((-arg2 - 23) / 60);
        return this.method622((Object) null, (arg0 << 16) + arg3, (arg1 << 16) + arg4, 6, -30608);
    }

    @OriginalMember(owner = "client!wa", name = "run", descriptor = "()V", line = 282)
    public final void run() {
        while (true) {
            class285 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1156) {
                        return;
                    }
                    if (this.field1148 != null) {
                        var2 = this.field1148;
                        this.field1148 = this.field1148.field4243;
                        if (this.field1148 == null) {
                            this.field1163 = null;
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
                int var5 = var2.field4242;
                if (var5 == 1) {
                    if (field1165 > class29.method174(27763)) {
                        throw new IOException();
                    }
                    var2.field4244 = new Socket(InetAddress.getByName((String) var2.field4239), var2.field4240);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field4239);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field4240);
                    var2.field4244 = var6;
                } else if (var5 == 4) {
                    if (class29.method174(27763) < field1165) {
                        throw new IOException();
                    }
                    var2.field4244 = new DataInputStream(((URL) var2.field4239).openStream());
                } else if (var5 == 8) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field4239);
                    var2.field4244 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) ((Class[]) var8[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field4239);
                    var2.field4244 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field4241 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field4241 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V", line = 379)
    public final void method629(boolean arg0) {
        synchronized (this) {
            this.field1156 = arg0;
            this.notifyAll();
        }
        try {
            this.field1160.join();
        } catch (InterruptedException var14) {
        }
        if (this.field1167 != null) {
            try {
                this.field1167.method870(0);
            } catch (IOException var13) {
            }
        }
        if (this.field1153 != null) {
            try {
                this.field1153.method870(0);
            } catch (IOException var12) {
            }
        }
        if (this.field1155 != null) {
            for (int var7 = 0; var7 < this.field1155.length; var7++) {
                if (this.field1155[var7] != null) {
                    try {
                        this.field1155[var7].method870(0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field1154 != null) {
            try {
                this.field1154.method870(0);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/lang/String;)Lo;", line = 439)
    public final class285 method630(int arg0, String arg1) {
        if (arg0 >= -99) {
            this.method630(28, (String) null);
        }
        return this.method622(arg1, 0, 0, 12, -30608);
    }
}
