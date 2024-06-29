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

@OriginalClass("client!lb")
public class class207 implements Runnable {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lud;")
    public class15 field3502 = null;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Llc;")
    private class251 field3503 = null;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field3504 = null;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lud;")
    public class15 field3508 = null;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    private boolean field3512 = false;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Llc;")
    private class251 field3513 = null;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Lud;")
    public class15 field3519 = null;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3509;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field3511;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3500 = 3;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "J")
    public static volatile long field3517;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lae;")
    private class91 field3507;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3498;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3501;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3505;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3506;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3510;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Ljava/lang/String;")
    private static String field3514;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3515;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3516;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3518;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "[Lud;")
    public class15[] field3499;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Runnable;II)Llc;")
    public final class251 method1423(Runnable arg0, int arg1, int arg2) {
        int var4 = -89 % ((-arg1 - 9) / 62);
        return this.method1433(arg0, 19387, 2, 0, arg2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;)Llc;")
    public final class251 method1424(int arg0, String arg1) {
        if (arg0 != 16) {
            this.method1424(23, (String) null);
        }
        return this.method1433(arg1, arg0 ^ 0x4BAB, 16, 0, 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/net/URL;I)Llc;")
    public final class251 method1425(URL arg0, int arg1) {
        int var3 = -20 % ((arg1 - 15) / 47);
        return this.method1433(arg0, 19387, 4, 0, 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public final void method1426(byte arg0) {
        synchronized (this) {
            this.field3512 = true;
            this.notifyAll();
            if (arg0 >= -97) {
                this.method1429(-57);
            }
        }
        try {
            this.field3511.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3508 != null) {
            try {
                this.field3508.method116(10388);
            } catch (IOException var7) {
            }
        }
        if (this.field3519 != null) {
            try {
                this.field3519.method116(10388);
            } catch (IOException var6) {
            }
        }
        if (this.field3499 != null) {
            for (int var3 = 0; var3 < this.field3499.length; var3++) {
                if (this.field3499[var3] != null) {
                    try {
                        this.field3499[var3].method116(10388);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3502 != null) {
            try {
                this.field3502.method116(10388);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public final void method1427(boolean arg0) {
        field3517 = class149.method1024(-14898) + 5000L;
        if (arg0) {
            field3505 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Llc;")
    public final class251 method1428(Class[] arg0, String arg1, int arg2, Class arg3) {
        if (arg2 != -24647) {
            this.method1423((Runnable) null, 67, 40);
        }
        return this.method1433(new Object[] { arg3, arg1, arg0 }, 19387, 8, 0, 0);
    }

    @OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class251 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3512) {
                        return;
                    }
                    if (this.field3503 != null) {
                        var2 = this.field3503;
                        this.field3503 = this.field3503.field4485;
                        if (this.field3503 == null) {
                            this.field3513 = null;
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
                int var3 = var2.field4486;
                if (var3 == 1) {
                    if (class149.method1024(-14898) < field3517) {
                        throw new IOException();
                    }
                    var2.field4483 = new Socket(InetAddress.getByName((String) var2.field4484), var2.field4487);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4484);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4487);
                    var2.field4483 = var4;
                } else if (var3 == 4) {
                    if (class149.method1024(-14898) < field3517) {
                        throw new IOException();
                    }
                    var2.field4483 = new DataInputStream(((URL) var2.field4484).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4484;
                    var2.field4483 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field4484;
                    var2.field4483 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field4488 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field4488 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lae;")
    public final class91 method1429(int arg0) {
        if (arg0 != -16166) {
            this.field3513 = null;
        }
        return this.field3507;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Llc;")
    public final class251 method1430(int arg0, Class arg1, String arg2) {
        if (arg0 != 16) {
            this.method1435((String) null, 21, 4);
        }
        return this.method1433(new Object[] { arg1, arg2 }, 19387, 9, 0, 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/awt/Component;B)Llc;")
    public final class251 method1431(boolean arg0, Component arg1, byte arg2) {
        if (arg2 != -94) {
            field3498 = null;
        }
        return this.method1433(arg1, 19387, 15, 0, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/awt/Component;BI)Llc;")
    public final class251 method1432(int arg0, Component arg1, byte arg2, int arg3) {
        if (arg2 <= 96) {
            this.method1427(true);
        }
        Point var5 = arg1.getLocationOnScreen();
        return this.method1433((Object) null, 19387, 14, arg0 + var5.y, var5.x + arg3);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Object;IIII)Llc;")
    private final class251 method1433(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class251 var6 = new class251();
        var6.field4487 = arg4;
        var6.field4486 = arg2;
        var6.field4484 = arg0;
        if (arg1 != 19387) {
            this.method1424(-107, (String) null);
        }
        synchronized (this) {
            if (this.field3513 == null) {
                this.field3513 = this.field3503 = var6;
            } else {
                this.field3513.field4485 = var6;
                this.field3513 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)Llc;")
    public final class251 method1434(String arg0, int arg1) {
        if (arg1 != 1) {
            field3510 = null;
        }
        return this.method1433(arg0, 19387, 12, 0, 0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;II)Llc;")
    public final class251 method1435(String arg0, int arg1, int arg2) {
        return arg1 < 102 ? null : this.method1433(arg0, 19387, 1, 0, arg2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Llc;")
    public final class251 method1436(byte arg0, int arg1) {
        if (arg0 != 79) {
            this.field3511 = null;
        }
        return this.method1433((Object) null, 19387, 3, 0, arg1);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class207(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3510 = "1.1";
        this.field3504 = arg0;
        field3498 = "Unknown";
        try {
            field3498 = System.getProperty("java.vendor");
            field3510 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3515 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3515 = "Unknown";
        }
        field3506 = field3515.toLowerCase();
        try {
            field3505 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3505 = "";
        }
        try {
            field3501 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3501 = "";
        }
        try {
            field3514 = System.getProperty("user.home");
            if (field3514 != null) {
                field3514 = field3514 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3514 == null) {
            field3514 = "~/";
        }
        try {
            this.field3509 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3516 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3516 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3518 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3518 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3512 = false;
        this.field3511 = new Thread(this);
        this.field3511.setPriority(10);
        this.field3511.setDaemon(true);
        this.field3511.start();
    }

    static {
        new Hashtable(16);
        field3517 = 0L;
    }
}
