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
public class class282 implements Runnable {

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lqk;")
    public class57 field4847 = null;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field4845 = null;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Z")
    private boolean field4857 = false;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Llh;")
    private class22 field4859 = null;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lqk;")
    public class57 field4858 = null;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lqk;")
    public class57 field4850 = null;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Llh;")
    private class22 field4852 = null;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4851;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field4849;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4846 = 3;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Lfl;")
    private class215 field4844;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Ljava/lang/String;")
    private static String field4842;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4843;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4848;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4853;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4854;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4856;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4860;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4861;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4862;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[Lqk;")
    public class57[] field4855;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/net/URL;)Llh;", line = 5)
    public final class22 method1947(int arg0, URL arg1) {
        return arg0 == 29393 ? this.method1953(arg1, -111, 4, 0, 0) : (class22) null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;B)Llh;", line = 18)
    public final class22 method1948(int arg0, String arg1, byte arg2) {
        if (arg2 != -16) {
            field4854 = (String) null;
        }
        return this.method1953(arg1, -75, 1, arg0, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Llh;", line = 29)
    public final class22 method1949(Class[] arg0, int arg1, String arg2, Class arg3) {
        if (arg1 != 0) {
            field4860 = (String) null;
        }
        return this.method1953(new Object[] { arg3, arg2, arg0 }, -120, 8, 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/Class;Z)Llh;", line = 43)
    public final class22 method1950(Class arg0, boolean arg1) {
        if (!arg1) {
            this.method1952((byte) 3, false, (Component) null);
        }
        return this.method1953(arg0, -113, 11, 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Lfl;", line = 54)
    public final class215 method1951(byte arg0) {
        return arg0 < 55 ? (class215) null : this.field4844;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BZLjava/awt/Component;)Llh;", line = 67)
    public final class22 method1952(byte arg0, boolean arg1, Component arg2) {
        if (arg0 != 36) {
            field4848 = (String) null;
        }
        return this.method1953(arg2, -76, 15, arg1 ? 1 : 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 436)
    public class282(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4853 = "Unknown";
        field4860 = "1.1";
        this.field4845 = arg0;
        try {
            field4853 = System.getProperty("java.vendor");
            field4860 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field4843 = System.getProperty("os.name");
        } catch (Exception var19) {
            field4843 = "Unknown";
        }
        field4848 = field4843.toLowerCase();
        try {
            field4854 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field4854 = "";
        }
        try {
            field4856 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field4856 = "";
        }
        try {
            field4842 = System.getProperty("user.home");
            if (field4842 != null) {
                field4842 = field4842 + "/";
            }
        } catch (Exception var16) {
        }
        if (field4842 == null) {
            field4842 = "~/";
        }
        try {
            this.field4851 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field4862 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4862 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field4861 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4861 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field4857 = false;
        this.field4849 = new Thread(this);
        this.field4849.setPriority(10);
        this.field4849.setDaemon(true);
        this.field4849.start();
    }

    static {
        new Hashtable(16);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/Object;IIII)Llh;", line = 95)
    private final class22 method1953(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -57) {
            this.method1954((Class) null, true);
        }
        class22 var6 = new class22();
        var6.field376 = arg3;
        var6.field374 = arg0;
        var6.field373 = arg2;
        synchronized (this) {
            if (this.field4859 == null) {
                this.field4859 = this.field4852 = var6;
            } else {
                this.field4859.field372 = var6;
                this.field4859 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Ljava/lang/Class;Z)Llh;", line = 129)
    public final class22 method1954(Class arg0, boolean arg1) {
        if (!arg1) {
            field4843 = (String) null;
        }
        return this.method1953(arg0, -98, 10, 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/Frame;I)Llh;", line = 139)
    public final class22 method1955(Frame arg0, int arg1) {
        if (arg1 != 0) {
            this.method1957((Component) null, -58, 111, -110);
        }
        return this.method1953(arg0, -78, 7, 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/lang/String;)Llh;", line = 150)
    public final class22 method1956(byte arg0, String arg1) {
        return arg0 <= 16 ? (class22) null : this.method1953(arg1, -124, 16, 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/Component;III)Llh;", line = 166)
    public final class22 method1957(Component arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field4846 = -90;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method1953((Object) null, -73, 14, var5.x + arg2, var5.y + arg3);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/Runnable;I)Llh;", line = 178)
    public final class22 method1958(int arg0, Runnable arg1, int arg2) {
        return arg2 == 16711 ? this.method1953(arg1, -116, 2, arg0, 0) : (class22) null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)Llh;", line = 190)
    public final class22 method1959(int arg0, String arg1) {
        if (arg0 != 0) {
            field4860 = (String) null;
        }
        return this.method1953(arg1, arg0 - 101, 12, 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBII)Llh;", line = 201)
    public final class22 method1960(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -67) {
            this.method1954((Class) null, false);
        }
        return this.method1953((Object) null, -58, 6, (arg3 << 16) + arg0, (arg1 << 16) - -arg4);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z", line = 231)
    public final boolean method1961(int arg0) {
        if (arg0 != 10869) {
            field4856 = (String) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 248)
    public final void method1962(boolean arg0) {
        synchronized (this) {
            this.field4857 = arg0;
            this.notifyAll();
        }
        try {
            this.field4849.join();
        } catch (InterruptedException var14) {
        }
        if (this.field4847 != null) {
            try {
                this.field4847.method441(52);
            } catch (IOException var13) {
            }
        }
        if (this.field4858 != null) {
            try {
                this.field4858.method441(68);
            } catch (IOException var12) {
            }
        }
        if (this.field4855 != null) {
            for (int var7 = 0; var7 < this.field4855.length; var7++) {
                if (this.field4855[var7] != null) {
                    try {
                        this.field4855[var7].method441(121);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4850 != null) {
            try {
                this.field4850.method441(70);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Llh;", line = 302)
    public final class22 method1963(int arg0, byte arg1) {
        if (arg1 != -4) {
            field4861 = (Method) null;
        }
        return this.method1953((Object) null, -100, 3, arg0, 0);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Llh;", line = 318)
    public final class22 method1964(int arg0) {
        return arg0 > -108 ? (class22) null : this.method1953((Object) null, -85, 5, 0, 0);
    }

    @OriginalMember(owner = "client!te", name = "run", descriptor = "()V", line = 332)
    public final void run() {
        while (true) {
            class22 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4857) {
                        return;
                    }
                    if (this.field4852 != null) {
                        var2 = this.field4852;
                        this.field4852 = this.field4852.field372;
                        if (this.field4852 == null) {
                            this.field4859 = null;
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
                int var5 = var2.field373;
                if (var5 == 1) {
                    var2.field377 = new Socket(InetAddress.getByName((String) var2.field374), var2.field376);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field374);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field376);
                    var2.field377 = var6;
                } else if (var5 == 4) {
                    var2.field377 = new DataInputStream(((URL) var2.field374).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field374);
                    var2.field377 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field374);
                    var2.field377 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field375 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field375 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Llh;", line = 428)
    public final class22 method1965(Class arg0, String arg1, byte arg2) {
        return arg2 == -50 ? this.method1953(new Object[] { arg0, arg1 }, -101, 9, 0, 0) : (class22) null;
    }
}
