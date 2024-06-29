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

@OriginalClass("client!fb")
public class class29 implements Runnable {

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lne;")
    public class51 field429 = null;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Ldj;")
    private class187 field424 = null;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Z")
    private boolean field438 = false;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Ldj;")
    private class187 field431 = null;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field436 = null;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lne;")
    public class51 field441 = null;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lne;")
    public class51 field434 = null;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field426;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ljava/lang/Thread;")
    private Thread field422;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field427 = 3;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "J")
    public static volatile long field442;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lk;")
    private class179 field425;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field428;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljava/lang/String;")
    private static String field430;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Ljava/lang/String;")
    public static String field432;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field433;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field435;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field437;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field439;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field440;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field443;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[Lne;")
    public class51[] field423;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/net/URL;)Ldj;")
    public final class187 method165(int arg0, URL arg1) {
        int var3 = -3 % ((arg0 - 2) / 62);
        return this.method170(0, arg1, 0, 0, 4);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBILjava/awt/Component;[ILjava/awt/Point;)Ldj;")
    public final class187 method166(int arg0, byte arg1, int arg2, Component arg3, int[] arg4, Point arg5) {
        return arg1 < 99 ? null : this.method170(arg0, new Object[] { arg3, arg4, arg5 }, 0, arg2, 17);
    }

    @OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class187 var2;
            synchronized (this) {
                while (true) {
                    if (this.field438) {
                        return;
                    }
                    if (this.field424 != null) {
                        var2 = this.field424;
                        this.field424 = this.field424.field3362;
                        if (this.field424 == null) {
                            this.field431 = null;
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
                int var3 = var2.field3361;
                if (var3 == 1) {
                    if (class81.method608(19644) < field442) {
                        throw new IOException();
                    }
                    var2.field3357 = new Socket(InetAddress.getByName((String) var2.field3360), var2.field3359);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3360);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3359);
                    var2.field3357 = var4;
                } else if (var3 == 4) {
                    if (class81.method608(19644) < field442) {
                        throw new IOException();
                    }
                    var2.field3357 = new DataInputStream(((URL) var2.field3360).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3360;
                    var2.field3357 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field3360;
                    var2.field3357 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field3358 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3358 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;Z)Ldj;")
    public final class187 method167(String arg0, boolean arg1) {
        return arg1 ? this.method170(0, arg0, 0, 0, 12) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Ldj;")
    public final class187 method168(Class[] arg0, int arg1, String arg2, Class arg3) {
        if (arg1 != -21828) {
            this.method166(-128, (byte) -47, -91, (Component) null, (int[]) null, (Point) null);
        }
        return this.method170(0, new Object[] { arg3, arg2, arg0 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Ldj;")
    public final class187 method169(Component arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            this.method165(-84, (URL) null);
        }
        return this.method170(arg2 ? 1 : 0, arg0, 0, 0, 15);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/Object;III)Ldj;")
    private final class187 method170(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class187 var6 = new class187();
        var6.field3359 = arg0;
        var6.field3360 = arg1;
        var6.field3361 = arg4;
        synchronized (this) {
            if (this.field431 == null) {
                this.field431 = this.field424 = var6;
            } else {
                this.field431.field3362 = var6;
                this.field431 = var6;
            }
            this.notify();
            if (arg2 != 0) {
                this.method176((String) null, (byte) 39);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method171(int arg0) {
        synchronized (this) {
            this.field438 = true;
            this.notifyAll();
        }
        try {
            this.field422.join();
        } catch (InterruptedException var8) {
        }
        if (this.field441 != null) {
            try {
                this.field441.method336(-1);
            } catch (IOException var7) {
            }
        }
        if (arg0 < 10) {
            this.run();
        }
        if (this.field434 != null) {
            try {
                this.field434.method336(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field423 != null) {
            for (int var3 = 0; var3 < this.field423.length; var3++) {
                if (this.field423[var3] != null) {
                    try {
                        this.field423[var3].method336(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field429 != null) {
            try {
                this.field429.method336(-1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ldj;")
    public final class187 method172(Class arg0, String arg1, int arg2) {
        if (arg2 != -26556) {
            field443 = null;
        }
        return this.method170(0, new Object[] { arg0, arg1 }, arg2 ^ 0xFFFF9844, 0, 9);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        field442 = class81.method608(19644) + 5000L;
        if (arg0) {
            this.method171(-128);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZLjava/lang/String;)Ldj;")
    public final class187 method174(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            field443 = null;
        }
        return this.method170(arg0, arg2, 0, 0, 1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/Runnable;I)Ldj;")
    public final class187 method175(int arg0, Runnable arg1, int arg2) {
        return arg0 == 2 ? this.method170(arg2, arg1, 0, 0, 2) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;B)Ldj;")
    public final class187 method176(String arg0, byte arg1) {
        if (arg1 != -102) {
            this.method168((Class[]) null, -110, (String) null, (Class) null);
        }
        return this.method170(0, arg0, 0, 0, 16);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Lk;")
    public final class179 method177(int arg0) {
        int var2 = 106 / ((-arg0 - 34) / 35);
        return this.field425;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Ldj;")
    public final class187 method178(byte arg0, int arg1) {
        return arg0 == 26 ? this.method170(arg1, (Object) null, 0, 0, 3) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZILjava/awt/Component;)Ldj;")
    public final class187 method179(int arg0, boolean arg1, int arg2, Component arg3) {
        if (arg1) {
            field432 = null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method170(var5.x + arg0, (Object) null, 0, var5.y + arg2, 14);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class29(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field436 = arg0;
        field437 = "Unknown";
        field432 = "1.1";
        try {
            field437 = System.getProperty("java.vendor");
            field432 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field439 = System.getProperty("os.name");
        } catch (Exception var11) {
            field439 = "Unknown";
        }
        field433 = field439.toLowerCase();
        try {
            field435 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field435 = "";
        }
        try {
            field428 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field428 = "";
        }
        try {
            field430 = System.getProperty("user.home");
            if (field430 != null) {
                field430 = field430 + "/";
            }
        } catch (Exception var8) {
        }
        if (field430 == null) {
            field430 = "~/";
        }
        try {
            this.field426 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field440 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field440 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field443 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field443 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field438 = false;
        this.field422 = new Thread(this);
        this.field422.setPriority(10);
        this.field422.setDaemon(true);
        this.field422.start();
    }

    static {
        new Hashtable(16);
        field442 = 0L;
    }
}
