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

@OriginalClass("client!la")
public class class139 implements Runnable {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ljava/applet/Applet;")
    public Applet field2441 = null;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Lvm;")
    public class77 field2450 = null;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Lpg;")
    private class205 field2448 = null;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lpg;")
    private class205 field2449 = null;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Lvm;")
    public class77 field2443 = null;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Z")
    private boolean field2454 = false;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lvm;")
    public class77 field2452 = null;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2440;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field2444;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2442 = 3;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "J")
    public static volatile long field2456;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lkd;")
    private class76 field2438;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2437;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Ljava/lang/String;")
    private static String field2445;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2446;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2447;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2451;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2453;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2455;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2457;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2458;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "[Lvm;")
    public class77[] field2439;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BILjava/awt/Component;I)Lpg;", line = 6)
    public final class205 method952(byte arg0, int arg1, Component arg2, int arg3) {
        Point var5 = arg2.getLocationOnScreen();
        int var6 = 45 % ((arg0) / 43);
        return this.method956(var5.x + arg3, (Object) null, var5.y + arg1, 14, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;)Lpg;", line = 17)
    public final class205 method953(byte arg0, String arg1) {
        if (arg0 >= -37) {
            this.field2440 = (EventQueue) null;
        }
        return this.method956(0, arg1, 0, 16, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lpg;", line = 31)
    public final class205 method954(Runnable arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.method970((String) null, 89, (byte) -22);
        }
        return this.method956(arg2, arg0, 0, 2, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)Lpg;", line = 44)
    public final class205 method955(int arg0, String arg1) {
        if (arg0 != 0) {
            this.field2440 = (EventQueue) null;
        }
        return this.method956(0, arg1, 0, 12, false);
    }

    @OriginalMember(owner = "client!la", name = "run", descriptor = "()V", line = 57)
    public final void run() {
        while (true) {
            class205 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2454) {
                        return;
                    }
                    if (this.field2448 != null) {
                        var2 = this.field2448;
                        this.field2448 = this.field2448.field3689;
                        if (this.field2448 == null) {
                            this.field2449 = null;
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
                int var5 = var2.field3687;
                if (var5 == 1) {
                    if (field2456 > class118.method835(-1272)) {
                        throw new IOException();
                    }
                    var2.field3685 = new Socket(InetAddress.getByName((String) var2.field3690), var2.field3688);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field3690);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field3688);
                    var2.field3685 = var8;
                } else if (var5 == 4) {
                    if (class118.method835(-1272) < field2456) {
                        throw new IOException();
                    }
                    var2.field3685 = new DataInputStream(((URL) var2.field3690).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field3690);
                    var2.field3685 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) ((Object[]) var2.field3690);
                    var2.field3685 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field3686 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field3686 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/Object;IIZ)Lpg;", line = 155)
    private final class205 method956(int arg0, Object arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field2451 = (String) null;
        }
        class205 var6 = new class205();
        var6.field3687 = arg3;
        var6.field3690 = arg1;
        var6.field3688 = arg0;
        synchronized (this) {
            if (this.field2449 == null) {
                this.field2449 = this.field2448 = var6;
            } else {
                this.field2449.field3689 = var6;
                this.field2449 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 455)
    public class139(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2441 = arg0;
        field2451 = "1.1";
        field2455 = "Unknown";
        try {
            field2455 = System.getProperty("java.vendor");
            field2451 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field2446 = System.getProperty("os.name");
        } catch (Exception var19) {
            field2446 = "Unknown";
        }
        field2437 = field2446.toLowerCase();
        try {
            field2447 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field2447 = "";
        }
        try {
            field2453 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field2453 = "";
        }
        try {
            field2445 = System.getProperty("user.home");
            if (field2445 != null) {
                field2445 = field2445 + "/";
            }
        } catch (Exception var16) {
        }
        if (field2445 == null) {
            field2445 = "~/";
        }
        try {
            this.field2440 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field2458 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2458 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field2457 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2457 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field2454 = false;
        this.field2444 = new Thread(this);
        this.field2444.setPriority(10);
        this.field2444.setDaemon(true);
        this.field2444.start();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/Class;B)Lpg;", line = 199)
    public final class205 method957(Class arg0, byte arg1) {
        if (arg1 != -1) {
            this.method962(-8);
        }
        return this.method956(0, arg0, 0, 11, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Frame;I)Lpg;", line = 210)
    public final class205 method958(Frame arg0, int arg1) {
        if (arg1 != 0) {
            this.field2454 = true;
        }
        return this.method956(0, arg0, 0, 7, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lpg;", line = 222)
    public final class205 method959(int arg0, int arg1) {
        if (arg0 != -24846) {
            this.method959(70, 42);
        }
        return this.method956(arg1, (Object) null, 0, 3, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lpg;", line = 232)
    public final class205 method960(Component arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            this.field2438 = (class76) null;
        }
        return this.method956(arg1 ? 1 : 0, arg0, 0, 15, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lpg;", line = 243)
    public final class205 method961(int arg0) {
        if (arg0 != -20288) {
            this.method955(-57, (String) null);
        }
        return this.method956(0, (Object) null, 0, 5, false);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V", line = 262)
    public final void method962(int arg0) {
        synchronized (this) {
            this.field2454 = true;
            this.notifyAll();
        }
        try {
            this.field2444.join();
        } catch (InterruptedException var14) {
        }
        if (this.field2443 != null) {
            try {
                this.field2443.method503((byte) -76);
            } catch (IOException var13) {
            }
        }
        if (arg0 != 0) {
            this.method953((byte) -93, (String) null);
        }
        if (this.field2452 != null) {
            try {
                this.field2452.method503((byte) -108);
            } catch (IOException var12) {
            }
        }
        if (this.field2439 != null) {
            for (int var7 = 0; var7 < this.field2439.length; var7++) {
                if (this.field2439[var7] != null) {
                    try {
                        this.field2439[var7].method503((byte) -88);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field2450 != null) {
            try {
                this.field2450.method503((byte) -104);
            } catch (IOException var10) {
            }
        }
    }

    static {
        new Hashtable(16);
        field2456 = 0L;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/net/URL;I)Lpg;", line = 325)
    public final class205 method963(URL arg0, int arg1) {
        int var3 = -34 / ((15 - arg1) / 58);
        return this.method956(0, arg0, 0, 4, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/Class;Z)Lpg;", line = 334)
    public final class205 method964(Class arg0, boolean arg1) {
        if (arg1) {
            this.method958((Frame) null, 98);
        }
        return this.method956(0, arg0, 0, 10, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Lkd;", line = 347)
    public final class76 method965(boolean arg0) {
        if (arg0) {
            field2457 = (Method) null;
        }
        return this.field2438;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lpg;", line = 363)
    public final class205 method966(String arg0, Class[] arg1, Class arg2, byte arg3) {
        if (arg3 <= 98) {
            this.field2439 = (class77[]) null;
        }
        return this.method956(0, new Object[] { arg2, arg0, arg1 }, 0, 8, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)Lpg;", line = 380)
    public final class205 method967(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 106 / ((arg3 - 62) / 54);
        return this.method956((arg4 << 16) + arg2, (Object) null, (arg0 << 16) + arg1, 6, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lpg;", line = 392)
    public final class205 method968(String arg0, Class arg1, int arg2) {
        int var4 = -39 % ((-arg2 - 57) / 46);
        return this.method956(0, new Object[] { arg1, arg0 }, 0, 9, false);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Z", line = 405)
    public final boolean method969(byte arg0) {
        int var2 = 105 / ((-arg0 - 74) / 49);
        return false;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;IB)Lpg;", line = 414)
    public final class205 method970(String arg0, int arg1, byte arg2) {
        return arg2 >= -101 ? (class205) null : this.method956(arg1, arg0, 0, 1, false);
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V", line = 427)
    public final void method971(int arg0) {
        field2456 = class118.method835(-1272) + 5000L;
        int var2 = 84 / ((-arg0 - 34) / 54);
    }
}
