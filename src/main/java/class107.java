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

@OriginalClass("client!ke")
public class class107 implements Runnable {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lfh;")
    public class191 field1872 = null;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field1876 = null;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lfh;")
    public class191 field1874 = null;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lkg;")
    private class70 field1870 = null;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lkg;")
    private class70 field1878 = null;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lfh;")
    public class191 field1875 = null;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Z")
    private boolean field1880 = false;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1881;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field1886;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1884 = 3;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "J")
    public static volatile long field1889;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lc;")
    private class295 field1877;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1869;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1871;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1873;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1879;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1882;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1883;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1885;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1887;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1888;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[Lfh;")
    public class191[] field1868;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILjava/awt/Component;)Lkg;", line = 5)
    public final class70 method799(int arg0, int arg1, int arg2, Component arg3) {
        if (arg2 >= -84) {
            field1871 = (String) null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method811(14, var5.y + arg0, (byte) -55, var5.x + arg1, (Object) null);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lkg;", line = 19)
    public final class70 method800(int arg0, Runnable arg1, int arg2) {
        if (arg0 >= -26) {
            this.field1877 = (class295) null;
        }
        return this.method811(2, 0, (byte) -55, arg2, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z", line = 29)
    public final boolean method801(int arg0) {
        return arg0 != 1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lkg;", line = 45)
    public final class70 method802(String arg0, Class[] arg1, int arg2, Class arg3) {
        return arg2 == -11760 ? this.method811(8, 0, (byte) -55, 0, new Object[] { arg3, arg0, arg1 }) : (class70) null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/String;)Lkg;", line = 59)
    public final class70 method803(int arg0, String arg1) {
        int var3 = 1 % ((arg0 + 42) / 36);
        return this.method811(16, 0, (byte) -55, 0, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Lkg;", line = 79)
    public final class70 method804(byte arg0) {
        if (arg0 >= -43) {
            this.field1878 = (class70) null;
        }
        return this.method811(5, 0, (byte) -55, 0, (Object) null);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lkg;", line = 90)
    public final class70 method805(Class arg0, byte arg1, String arg2) {
        return arg1 == 67 ? this.method811(9, 0, (byte) -55, 0, new Object[] { arg0, arg2 }) : (class70) null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)Lkg;", line = 102)
    public final class70 method806(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 6) {
            this.method807(true, false, (Component) null);
        }
        return this.method811(6, (arg2 << 16) + arg3, (byte) -55, (arg0 << 16) + arg1, (Object) null);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZLjava/awt/Component;)Lkg;", line = 112)
    public final class70 method807(boolean arg0, boolean arg1, Component arg2) {
        if (!arg0) {
            this.method806(-71, -4, -121, -49, -63);
        }
        return this.method811(15, 0, (byte) -55, arg1 ? 1 : 0, arg2);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Lc;", line = 122)
    public final class295 method808(byte arg0) {
        return arg0 >= -125 ? (class295) null : this.field1877;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/awt/Frame;)Lkg;", line = 134)
    public final class70 method809(byte arg0, Frame arg1) {
        if (arg0 != -96) {
            field1885 = (String) null;
        }
        return this.method811(7, 0, (byte) -55, 0, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 444)
    public class107(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field1876 = arg0;
        field1885 = "Unknown";
        field1869 = "1.1";
        try {
            field1885 = System.getProperty("java.vendor");
            field1869 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field1882 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1882 = "Unknown";
        }
        field1883 = field1882.toLowerCase();
        try {
            field1871 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1871 = "";
        }
        try {
            field1879 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1879 = "";
        }
        try {
            field1873 = System.getProperty("user.home");
            if (field1873 != null) {
                field1873 = field1873 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1873 == null) {
            field1873 = "~/";
        }
        try {
            this.field1881 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field1888 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1888 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field1887 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1887 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field1880 = false;
        this.field1886 = new Thread(this);
        this.field1886.setPriority(10);
        this.field1886.setDaemon(true);
        this.field1886.start();
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLjava/lang/Class;)Lkg;", line = 148)
    public final class70 method810(byte arg0, Class arg1) {
        return arg0 == -6 ? this.method811(11, 0, (byte) -55, 0, arg1) : (class70) null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIBILjava/lang/Object;)Lkg;", line = 162)
    private final class70 method811(int arg0, int arg1, byte arg2, int arg3, Object arg4) {
        if (arg2 != -55) {
            this.field1875 = (class191) null;
        }
        class70 var6 = new class70();
        var6.field1262 = arg0;
        var6.field1257 = arg4;
        var6.field1259 = arg3;
        synchronized (this) {
            if (this.field1870 == null) {
                this.field1870 = this.field1878 = var6;
            } else {
                this.field1870.field1261 = var6;
                this.field1870 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;II)Lkg;", line = 197)
    public final class70 method812(String arg0, int arg1, int arg2) {
        if (arg2 != 14038) {
            field1879 = (String) null;
        }
        return this.method811(1, 0, (byte) -55, arg1, arg0);
    }

    @OriginalMember(owner = "client!ke", name = "run", descriptor = "()V", line = 216)
    public final void run() {
        while (true) {
            class70 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1880) {
                        return;
                    }
                    if (this.field1878 != null) {
                        var2 = this.field1878;
                        this.field1878 = this.field1878.field1261;
                        if (this.field1878 == null) {
                            this.field1870 = null;
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
                int var5 = var2.field1262;
                if (var5 == 1) {
                    if (class69.method535(true) < field1889) {
                        throw new IOException();
                    }
                    var2.field1260 = new Socket(InetAddress.getByName((String) var2.field1257), var2.field1259);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field1257);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field1259);
                    var2.field1260 = var8;
                } else if (var5 == 4) {
                    if (class69.method535(true) < field1889) {
                        throw new IOException();
                    }
                    var2.field1260 = new DataInputStream(((URL) var2.field1257).openStream());
                } else if (var5 == 8) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field1257);
                    var2.field1260 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) ((Class[]) var6[2]));
                } else if (var5 == 9) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field1257);
                    var2.field1260 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field1258 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field1258 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 318)
    public final void method813(int arg0) {
        synchronized (this) {
            this.field1880 = true;
            this.notifyAll();
        }
        try {
            this.field1886.join();
        } catch (InterruptedException var14) {
        }
        if (arg0 != 0) {
            this.method818((URL) null, -10);
        }
        if (this.field1875 != null) {
            try {
                this.field1875.method1376(-1);
            } catch (IOException var13) {
            }
        }
        if (this.field1874 != null) {
            try {
                this.field1874.method1376(-1);
            } catch (IOException var12) {
            }
        }
        if (this.field1868 != null) {
            for (int var7 = 0; var7 < this.field1868.length; var7++) {
                if (this.field1868[var7] != null) {
                    try {
                        this.field1868[var7].method1376(~arg0);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field1872 != null) {
            try {
                this.field1872.method1376(-1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 375)
    public final void method814(int arg0) {
        field1889 = class69.method535(true) + 5000L;
        if (arg0 != 0) {
            field1887 = (Method) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lkg;", line = 385)
    public final class70 method815(int arg0, int arg1) {
        return arg1 > -100 ? (class70) null : this.method811(3, 0, (byte) -55, arg0, (Object) null);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILjava/lang/Class;)Lkg;", line = 406)
    public final class70 method816(int arg0, Class arg1) {
        if (arg0 > -81) {
            this.field1881 = (EventQueue) null;
        }
        return this.method811(10, 0, (byte) -55, 0, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;I)Lkg;", line = 419)
    public final class70 method817(String arg0, int arg1) {
        return arg1 == -7930 ? this.method811(12, 0, (byte) -55, 0, arg0) : (class70) null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/net/URL;I)Lkg;", line = 435)
    public final class70 method818(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.field1886 = (Thread) null;
        }
        return this.method811(4, 0, (byte) -55, 0, arg0);
    }

    static {
        new Hashtable(16);
        field1889 = 0L;
    }
}
