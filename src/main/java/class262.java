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

@OriginalClass("client!tj")
public class class262 implements Runnable {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lpa;")
    public class206 field4546 = null;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
    private boolean field4550 = false;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lpa;")
    public class206 field4555 = null;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field4557 = null;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "Lpa;")
    public class206 field4561 = null;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Lqf;")
    private class235 field4564 = null;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lqf;")
    private class235 field4559 = null;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4553;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field4554;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4547 = 3;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "J")
    public static volatile long field4565;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lmd;")
    private class213 field4549;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4548;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4551;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4556;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4558;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Ljava/lang/String;")
    private static String field4560;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4562;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4563;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4566;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4567;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[Lpa;")
    public class206[] field4552;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BILjava/lang/Runnable;)Lqf;")
    public final class235 method1724(byte arg0, int arg1, Runnable arg2) {
        int var4 = -37 % ((arg0 - 55) / 37);
        return this.method1729(arg1, 1, 0, 2, arg2);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;Z)Lqf;")
    public final class235 method1725(String arg0, boolean arg1) {
        if (!arg1) {
            this.method1732(true);
        }
        return this.method1729(0, 1, 0, 16, arg0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/net/URL;)Lqf;")
    public final class235 method1726(int arg0, URL arg1) {
        if (arg0 != 24911) {
            this.method1731(false, (byte) -66, (Component) null);
        }
        return this.method1729(0, 1, 0, 4, arg1);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lqf;")
    public final class235 method1727(Class[] arg0, String arg1, Class arg2, int arg3) {
        if (arg3 != 0) {
            this.field4564 = null;
        }
        return this.method1729(0, arg3 + 1, 0, 8, new Object[] { arg2, arg1, arg0 });
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method1728(int arg0) {
        if (arg0 <= 56) {
            this.method1727((Class[]) null, (String) null, (Class) null, -17);
        }
        field4565 = class25.method182(true) + 5000L;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIILjava/lang/Object;)Lqf;")
    private final class235 method1729(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (arg1 != 1) {
            this.method1731(false, (byte) 102, (Component) null);
        }
        class235 var6 = new class235();
        var6.field4119 = arg3;
        var6.field4118 = arg0;
        var6.field4116 = arg4;
        synchronized (this) {
            if (this.field4564 == null) {
                this.field4564 = this.field4559 = var6;
            } else {
                this.field4564.field4115 = var6;
                this.field4564 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)Lqf;")
    public final class235 method1730(int arg0, String arg1) {
        return arg0 == 0 ? this.method1729(0, 1, 0, 12, arg1) : null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZBLjava/awt/Component;)Lqf;")
    public final class235 method1731(boolean arg0, byte arg1, Component arg2) {
        int var4 = 109 / ((arg1 - 4) / 36);
        return this.method1729(arg0 ? 1 : 0, 1, 0, 15, arg2);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Lmd;")
    public final class213 method1732(boolean arg0) {
        return arg0 ? null : this.field4549;
    }

    @OriginalMember(owner = "client!tj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class235 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4550) {
                        return;
                    }
                    if (this.field4559 != null) {
                        var2 = this.field4559;
                        this.field4559 = this.field4559.field4115;
                        if (this.field4559 == null) {
                            this.field4564 = null;
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
                int var3 = var2.field4119;
                if (var3 == 1) {
                    if (class25.method182(true) < field4565) {
                        throw new IOException();
                    }
                    var2.field4117 = new Socket(InetAddress.getByName((String) var2.field4116), var2.field4118);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field4116);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field4118);
                    var2.field4117 = var6;
                } else if (var3 == 4) {
                    if (class25.method182(true) < field4565) {
                        throw new IOException();
                    }
                    var2.field4117 = new DataInputStream(((URL) var2.field4116).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field4116;
                    var2.field4117 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field4116;
                    var2.field4117 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field4114 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field4114 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public final void method1733(byte arg0) {
        synchronized (this) {
            this.field4550 = true;
            this.notifyAll();
        }
        try {
            int var3 = -72 / ((arg0 - 44) / 42);
            this.field4554.join();
        } catch (InterruptedException var9) {
        }
        if (this.field4555 != null) {
            try {
                this.field4555.method1426(-10272);
            } catch (IOException var8) {
            }
        }
        if (this.field4546 != null) {
            try {
                this.field4546.method1426(-10272);
            } catch (IOException var7) {
            }
        }
        if (this.field4552 != null) {
            for (int var4 = 0; var4 < this.field4552.length; var4++) {
                if (this.field4552[var4] != null) {
                    try {
                        this.field4552[var4].method1426(-10272);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field4561 != null) {
            try {
                this.field4561.method1426(-10272);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lqf;")
    public final class235 method1734(int arg0, int arg1) {
        if (arg0 != -23116) {
            this.method1729(-8, 8, -20, 1, (Object) null);
        }
        return this.method1729(arg1, 1, 0, 3, (Object) null);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lqf;")
    public final class235 method1735(String arg0, int arg1, Class arg2) {
        int var4 = 126 % ((arg1 + 57) / 59);
        return this.method1729(0, 1, 0, 9, new Object[] { arg2, arg0 });
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILjava/lang/String;)Lqf;")
    public final class235 method1736(int arg0, int arg1, String arg2) {
        return arg0 > -52 ? null : this.method1729(arg1, 1, 0, 1, arg2);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/awt/Component;II)Lqf;")
    public final class235 method1737(int arg0, Component arg1, int arg2, int arg3) {
        if (arg2 != 8626) {
            this.method1729(41, 44, 108, -9, (Object) null);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method1729(var5.x + arg0, 1, var5.y + arg3, 14, (Object) null);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class262(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4563 = "Unknown";
        field4562 = "1.1";
        this.field4557 = arg0;
        try {
            field4563 = System.getProperty("java.vendor");
            field4562 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4556 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4556 = "Unknown";
        }
        field4551 = field4556.toLowerCase();
        try {
            field4558 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4558 = "";
        }
        try {
            field4548 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4548 = "";
        }
        try {
            field4560 = System.getProperty("user.home");
            if (field4560 != null) {
                field4560 = field4560 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4560 == null) {
            field4560 = "~/";
        }
        try {
            this.field4553 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4566 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4566 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4567 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4567 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4550 = false;
        this.field4554 = new Thread(this);
        this.field4554.setPriority(10);
        this.field4554.setDaemon(true);
        this.field4554.start();
    }

    static {
        new Hashtable(16);
        field4565 = 0L;
    }
}
