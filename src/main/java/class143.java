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

@OriginalClass("client!w")
public class class143 implements Runnable {

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lr;")
    public class41 field2635 = null;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lkd;")
    private class203 field2630 = null;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field2638 = null;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Z")
    private boolean field2631 = false;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lkd;")
    private class203 field2646 = null;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lr;")
    public class41 field2629 = null;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lr;")
    public class41 field2650 = null;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2633;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field2634;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field2644 = 3;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "J")
    public static volatile long field2647;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lic;")
    private class140 field2645;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2632;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2637;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2639;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Ljava/lang/String;")
    private static String field2640;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2641;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2642;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2643;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2648;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2649;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[Lr;")
    public class41[] field2636;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/lang/Object;I)Lkd;")
    private final class203 method993(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        class203 var6 = new class203();
        if (arg0 != 0) {
            this.field2650 = null;
        }
        var6.field3643 = arg3;
        var6.field3641 = arg1;
        var6.field3645 = arg2;
        synchronized (this) {
            if (this.field2630 == null) {
                this.field2630 = this.field2646 = var6;
            } else {
                this.field2630.field3644 = var6;
                this.field2630 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILjava/lang/String;)Lkd;")
    public final class203 method994(int arg0, int arg1, String arg2) {
        return arg1 == -32322 ? this.method993(0, 1, arg0, arg2, 0) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;I)Lkd;")
    public final class203 method995(String arg0, int arg1) {
        if (arg1 != 0) {
            this.field2636 = null;
        }
        return this.method993(0, 12, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lkd;")
    public final class203 method996(Runnable arg0, int arg1, boolean arg2) {
        return arg2 ? null : this.method993(0, 2, arg1, arg0, 0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLjava/awt/Component;Z)Lkd;")
    public final class203 method997(byte arg0, Component arg1, boolean arg2) {
        if (arg0 > -70) {
            this.method1003((byte) -13, (String) null);
        }
        return this.method993(0, 15, arg2 ? 1 : 0, arg1, 0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public final void method998(byte arg0) {
        synchronized (this) {
            this.field2631 = true;
            if (arg0 > 0) {
                field2643 = null;
            }
            this.notifyAll();
        }
        try {
            this.field2634.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2650 != null) {
            try {
                this.field2650.method307(-31335);
            } catch (IOException var7) {
            }
        }
        if (this.field2635 != null) {
            try {
                this.field2635.method307(-31335);
            } catch (IOException var6) {
            }
        }
        if (this.field2636 != null) {
            for (int var3 = 0; var3 < this.field2636.length; var3++) {
                if (this.field2636[var3] != null) {
                    try {
                        this.field2636[var3].method307(-31335);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2629 != null) {
            try {
                this.field2629.method307(-31335);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BIILjava/awt/Component;)Lkd;")
    public final class203 method999(byte arg0, int arg1, int arg2, Component arg3) {
        int var5 = -78 / ((-arg0 - 47) / 51);
        Point var6 = arg3.getLocationOnScreen();
        return this.method993(0, 14, var6.x + arg2, (Object) null, arg1 + var6.y);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public final void method1000(int arg0) {
        int var2 = 81 % ((-arg0 - 59) / 47);
        field2647 = class180.method1236(103) + 5000L;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/net/URL;I)Lkd;")
    public final class203 method1001(URL arg0, int arg1) {
        if (arg1 != 0) {
            field2632 = null;
        }
        return this.method993(0, 4, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!w", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class203 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2631) {
                        return;
                    }
                    if (this.field2646 != null) {
                        var2 = this.field2646;
                        this.field2646 = this.field2646.field3644;
                        if (this.field2646 == null) {
                            this.field2630 = null;
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
                int var3 = var2.field3641;
                if (var3 == 1) {
                    if (class180.method1236(111) < field2647) {
                        throw new IOException();
                    }
                    var2.field3642 = new Socket(InetAddress.getByName((String) var2.field3643), var2.field3645);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3643);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3645);
                    var2.field3642 = var6;
                } else if (var3 == 4) {
                    if (field2647 > class180.method1236(124)) {
                        throw new IOException();
                    }
                    var2.field3642 = new DataInputStream(((URL) var2.field3643).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3643;
                    var2.field3642 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3643;
                    var2.field3642 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3646 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3646 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Lkd;")
    public final class203 method1002(Class[] arg0, Class arg1, String arg2, int arg3) {
        return arg3 == 3 ? this.method993(0, 8, 0, new Object[] { arg1, arg2, arg0 }, 0) : null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLjava/lang/String;)Lkd;")
    public final class203 method1003(byte arg0, String arg1) {
        int var3 = -106 % ((arg0 - 70) / 45);
        return this.method993(0, 16, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)Lic;")
    public final class140 method1004(int arg0) {
        if (arg0 != 26207) {
            this.method1000(103);
        }
        return this.field2645;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lkd;")
    public final class203 method1005(int arg0, Class arg1, String arg2) {
        if (arg0 != -7468) {
            this.method998((byte) -102);
        }
        return this.method993(0, 9, 0, new Object[] { arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class143(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2638 = arg0;
        field2643 = "Unknown";
        field2637 = "1.1";
        try {
            field2643 = System.getProperty("java.vendor");
            field2637 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2632 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2632 = "Unknown";
        }
        field2639 = field2632.toLowerCase();
        try {
            field2642 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2642 = "";
        }
        try {
            field2641 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2641 = "";
        }
        try {
            field2640 = System.getProperty("user.home");
            if (field2640 != null) {
                field2640 = field2640 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2640 == null) {
            field2640 = "~/";
        }
        try {
            this.field2633 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2649 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2649 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2648 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2648 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2631 = false;
        this.field2634 = new Thread(this);
        this.field2634.setPriority(10);
        this.field2634.setDaemon(true);
        this.field2634.start();
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lkd;")
    public final class203 method1006(int arg0, int arg1) {
        if (arg1 != 5000) {
            this.method1005(-85, (Class) null, (String) null);
        }
        return this.method993(0, 3, arg0, (Object) null, 0);
    }

    static {
        new Hashtable(16);
        field2647 = 0L;
    }
}
