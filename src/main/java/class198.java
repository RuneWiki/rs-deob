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

@OriginalClass("client!ug")
public class class198 implements Runnable {

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Ldh;")
    public class119 field3464 = null;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Ldh;")
    public class119 field3458 = null;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Ldh;")
    public class119 field3461 = null;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lbc;")
    private class174 field3460 = null;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field3473 = null;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lbc;")
    private class174 field3471 = null;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Z")
    private boolean field3478 = false;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3468;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field3472;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3469 = 3;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "J")
    public static volatile long field3477;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lhl;")
    private class39 field3467;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3457;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3459;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3462;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Ljava/lang/String;")
    private static String field3463;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3465;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3466;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3474;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3475;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3476;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "[Ldh;")
    public class119[] field3470;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lbc;")
    public final class174 method1349(Class arg0, Class[] arg1, String arg2, int arg3) {
        return arg3 == -18275 ? this.method1359(new Object[] { arg0, arg2, arg1 }, 8, 0, 0, 117) : null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lbc;")
    public final class174 method1350(int arg0, int arg1) {
        int var3 = 99 / ((54 - arg1) / 42);
        return this.method1359((Object) null, 3, 0, arg0, 124);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lbc;")
    public final class174 method1351(String arg0, Class arg1, int arg2) {
        if (arg2 <= 96) {
            this.method1350(93, -128);
        }
        return this.method1359(new Object[] { arg1, arg0 }, 9, 0, 0, -102);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public final void method1352(int arg0) {
        synchronized (this) {
            this.field3478 = true;
            this.notifyAll();
        }
        if (arg0 != 0) {
            this.field3473 = null;
        }
        try {
            this.field3472.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3461 != null) {
            try {
                this.field3461.method849(54);
            } catch (IOException var7) {
            }
        }
        if (this.field3458 != null) {
            try {
                this.field3458.method849(arg0 ^ 0x4F);
            } catch (IOException var6) {
            }
        }
        if (this.field3470 != null) {
            for (int var3 = 0; var3 < this.field3470.length; var3++) {
                if (this.field3470[var3] != null) {
                    try {
                        this.field3470[var3].method849(arg0 ^ 0xFFFFFFCD);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3464 != null) {
            try {
                this.field3464.method849(arg0 + 127);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/net/URL;B)Lbc;")
    public final class174 method1353(URL arg0, byte arg1) {
        return arg1 == 49 ? this.method1359(arg0, 4, 0, 0, 3) : null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([ILjava/awt/Point;IILjava/awt/Component;I)Lbc;")
    public final class174 method1354(int[] arg0, Point arg1, int arg2, int arg3, Component arg4, int arg5) {
        if (arg3 != 0) {
            field3465 = null;
        }
        return this.method1359(new Object[] { arg4, arg0, arg1 }, 17, arg2, arg5, -76);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1355(int arg0) {
        if (arg0 != 18530) {
            this.method1362(-93, (String) null);
        }
        field3477 = class77.method569((byte) -10) + 5000L;
    }

    @OriginalMember(owner = "client!ug", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class174 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3478) {
                        return;
                    }
                    if (this.field3460 != null) {
                        var2 = this.field3460;
                        this.field3460 = this.field3460.field3026;
                        if (this.field3460 == null) {
                            this.field3471 = null;
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
                int var3 = var2.field3027;
                if (var3 == 1) {
                    if (field3477 > class77.method569((byte) -118)) {
                        throw new IOException();
                    }
                    var2.field3028 = new Socket(InetAddress.getByName((String) var2.field3024), var2.field3023);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3024);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3023);
                    var2.field3028 = var4;
                } else if (var3 == 4) {
                    if (class77.method569((byte) 39) < field3477) {
                        throw new IOException();
                    }
                    var2.field3028 = new DataInputStream(((URL) var2.field3024).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field3024;
                    var2.field3028 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3024;
                    var2.field3028 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3025 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3025 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lbc;")
    public final class174 method1356(Component arg0, int arg1, boolean arg2) {
        return arg1 < 72 ? null : this.method1359(arg0, 15, 0, arg2 ? 1 : 0, -71);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Lhl;")
    public final class39 method1357(int arg0) {
        return arg0 == 0 ? this.field3467 : null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILjava/lang/String;)Lbc;")
    public final class174 method1358(int arg0, int arg1, String arg2) {
        return arg1 > -103 ? null : this.method1359(arg2, 1, 0, arg0, -107);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lbc;")
    private final class174 method1359(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class174 var6 = new class174();
        var6.field3024 = arg0;
        var6.field3023 = arg3;
        var6.field3027 = arg1;
        int var7 = 10 % ((arg4 - 79) / 34);
        synchronized (this) {
            if (this.field3471 == null) {
                this.field3471 = this.field3460 = var6;
            } else {
                this.field3471.field3026 = var6;
                this.field3471 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/String;)Lbc;")
    public final class174 method1360(int arg0, String arg1) {
        if (arg0 != 15815) {
            this.method1358(32, -96, (String) null);
        }
        return this.method1359(arg1, 16, 0, 0, -126);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lbc;")
    public final class174 method1361(Runnable arg0, int arg1, int arg2) {
        return arg1 == 4 ? this.method1359(arg0, 2, 0, arg2, -110) : null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(ILjava/lang/String;)Lbc;")
    public final class174 method1362(int arg0, String arg1) {
        if (arg0 != 10) {
            this.run();
        }
        return this.method1359(arg1, 12, 0, 0, -91);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILjava/awt/Component;)Lbc;")
    public final class174 method1363(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg2 != 23519) {
            this.field3471 = null;
        }
        return this.method1359((Object) null, 14, arg1 + var5.y, var5.x + arg0, -71);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class198(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3474 = "1.1";
        field3462 = "Unknown";
        this.field3473 = arg0;
        try {
            field3462 = System.getProperty("java.vendor");
            field3474 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3465 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3465 = "Unknown";
        }
        field3457 = field3465.toLowerCase();
        try {
            field3459 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3459 = "";
        }
        try {
            field3466 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3466 = "";
        }
        try {
            field3463 = System.getProperty("user.home");
            if (field3463 != null) {
                field3463 = field3463 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3463 == null) {
            field3463 = "~/";
        }
        try {
            this.field3468 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3476 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3476 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3475 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3475 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3478 = false;
        this.field3472 = new Thread(this);
        this.field3472.setPriority(10);
        this.field3472.setDaemon(true);
        this.field3472.start();
    }

    static {
        new Hashtable(16);
        field3477 = 0L;
    }
}
