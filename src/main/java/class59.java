import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
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

@OriginalClass("client!ja")
public class class59 implements Runnable {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lfl;")
    private class248 field924 = null;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lec;")
    public class24 field926 = null;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Z")
    private boolean field932 = false;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field934 = null;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lec;")
    public class24 field925 = null;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lfl;")
    private class248 field931 = null;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lec;")
    public class24 field936 = null;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field935;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field937;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field927 = 3;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "J")
    public static volatile long field942;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Ltl;")
    private class67 field929;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ljava/lang/String;")
    public static String field922;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Ljava/lang/String;")
    public static String field923;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Ljava/lang/String;")
    public static String field928;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Ljava/lang/String;")
    public static String field933;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/lang/String;")
    public static String field938;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Ljava/lang/String;")
    public static String field939;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Ljava/lang/String;")
    private static String field940;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field941;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field943;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[Lec;")
    public class24[] field930;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Ltl;")
    public final class67 method466(int arg0) {
        if (arg0 != 951863312) {
            field927 = -27;
        }
        return this.field929;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/Runnable;Z)Lfl;")
    public final class248 method467(int arg0, Runnable arg1, boolean arg2) {
        if (!arg2) {
            this.method478(-39, 19, 42, -105, (Object) null);
        }
        return this.method478(2, arg0, 0, 2, arg1);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjava/net/URL;)Lfl;")
    public final class248 method468(boolean arg0, URL arg1) {
        return arg0 ? this.method478(2, 0, 0, 4, arg1) : null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method469(int arg0) {
        field942 = class269.method1823(-101) + 5000L;
        if (arg0 != 248) {
            this.method468(true, (URL) null);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lfl;")
    public final class248 method470(Class arg0, int arg1, String arg2) {
        return arg1 > -13 ? null : this.method478(2, 0, 0, 9, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILjava/awt/Component;)Lfl;")
    public final class248 method471(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg0 != 14) {
            this.run();
        }
        return this.method478(arg0 - 12, arg2 - -var5.x, var5.y + arg1, 14, (Object) null);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjava/awt/Component;I)Lfl;")
    public final class248 method472(boolean arg0, Component arg1, int arg2) {
        return arg2 == 5 ? this.method478(2, arg0 ? 1 : 0, 0, 15, arg1) : null;
    }

    @OriginalMember(owner = "client!ja", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class248 var2;
            synchronized (this) {
                while (true) {
                    if (this.field932) {
                        return;
                    }
                    if (this.field931 != null) {
                        var2 = this.field931;
                        this.field931 = this.field931.field3829;
                        if (this.field931 == null) {
                            this.field924 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var3 = var2.field3832;
                if (var3 == 1) {
                    if (field942 > class269.method1823(-76)) {
                        throw new IOException();
                    }
                    var2.field3831 = new Socket(InetAddress.getByName((String) var2.field3830), var2.field3833);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3830);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3833);
                    var2.field3831 = var4;
                } else if (var3 == 4) {
                    if (class269.method1823(-34) < field942) {
                        throw new IOException();
                    }
                    var2.field3831 = new DataInputStream(((URL) var2.field3830).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field3830;
                    var2.field3831 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3830;
                    var2.field3831 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3828 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3828 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lfl;")
    public final class248 method473(int arg0, int arg1) {
        if (arg1 >= -70) {
            field933 = null;
        }
        return this.method478(2, arg0, 0, 3, (Object) null);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Point;[ILjava/awt/Component;III)Lfl;")
    public final class248 method474(Point arg0, int[] arg1, Component arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 8) {
            this.method470((Class) null, -122, (String) null);
        }
        return this.method478(arg5 - 6, arg4, arg3, 17, new Object[] { arg2, arg1, arg0 });
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        synchronized (this) {
            if (arg0) {
                this.field937 = null;
            }
            this.field932 = true;
            this.notifyAll();
        }
        try {
            this.field937.join();
        } catch (InterruptedException var8) {
        }
        if (this.field936 != null) {
            try {
                this.field936.method199(91);
            } catch (IOException var7) {
            }
        }
        if (this.field925 != null) {
            try {
                this.field925.method199(120);
            } catch (IOException var6) {
            }
        }
        if (this.field930 != null) {
            for (int var3 = 0; var3 < this.field930.length; var3++) {
                if (this.field930[var3] != null) {
                    try {
                        this.field930[var3].method199(117);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field926 != null) {
            try {
                this.field926.method199(115);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lfl;")
    public final class248 method476(byte arg0, String arg1, Class[] arg2, Class arg3) {
        if (arg0 != 83) {
            this.method474((Point) null, (int[]) null, (Component) null, 112, -14, -24);
        }
        return this.method478(arg0 - 81, 0, 0, 8, new Object[] { arg3, arg1, arg2 });
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;)Lfl;")
    public final class248 method477(int arg0, String arg1) {
        if (arg0 <= 88) {
            this.method468(false, (URL) null);
        }
        return this.method478(2, 0, 0, 12, arg1);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIILjava/lang/Object;)Lfl;")
    private final class248 method478(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (arg0 != 2) {
            this.method466(111);
        }
        class248 var6 = new class248();
        var6.field3832 = arg3;
        var6.field3830 = arg4;
        var6.field3833 = arg1;
        synchronized (this) {
            if (this.field924 == null) {
                this.field924 = this.field931 = var6;
            } else {
                this.field924.field3829 = var6;
                this.field924 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;I)Lfl;")
    public final class248 method479(String arg0, int arg1) {
        return arg1 <= 73 ? null : this.method478(2, 0, 0, 16, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBLjava/lang/String;)Lfl;")
    public final class248 method480(int arg0, byte arg1, String arg2) {
        return arg1 >= -75 ? null : this.method478(2, arg0, 0, 1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class59(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field923 = "Unknown";
        this.field934 = arg0;
        field938 = "1.1";
        try {
            field923 = System.getProperty("java.vendor");
            field938 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field922 = System.getProperty("os.name");
        } catch (Exception var11) {
            field922 = "Unknown";
        }
        field939 = field922.toLowerCase();
        try {
            field933 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field933 = "";
        }
        try {
            field928 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field928 = "";
        }
        try {
            field940 = System.getProperty("user.home");
            if (field940 != null) {
                field940 = field940 + "/";
            }
        } catch (Exception var8) {
        }
        if (field940 == null) {
            field940 = "~/";
        }
        try {
            this.field935 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field941 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field941 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field943 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field943 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field932 = false;
        this.field937 = new Thread(this);
        this.field937.setPriority(10);
        this.field937.setDaemon(true);
        this.field937.start();
    }

    static {
        new Hashtable(16);
        field942 = 0L;
    }
}
