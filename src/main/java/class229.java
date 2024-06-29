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

@OriginalClass("client!wc")
public class class229 implements Runnable {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ljj;")
    public class104 field4192 = null;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljj;")
    public class104 field4197 = null;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lqe;")
    private class96 field4194 = null;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Ljj;")
    public class104 field4202 = null;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lqe;")
    private class96 field4196 = null;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field4207 = null;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Z")
    private boolean field4203 = false;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4210;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field4198;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field4193 = 3;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "J")
    public static volatile long field4211;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Lad;")
    private class251 field4201;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4195;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4199;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Ljava/lang/String;")
    private static String field4200;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4204;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4205;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4206;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4208;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4209;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4212;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[Ljj;")
    public class104[] field4191;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lqe;")
    public final class96 method1628(Class arg0, String arg1, int arg2) {
        if (arg2 != 6921) {
            this.method1641(false, -59);
        }
        return this.method1634(0, new Object[] { arg0, arg1 }, 9, 0, (byte) -115);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjava/lang/String;)Lqe;")
    public final class96 method1629(boolean arg0, String arg1) {
        if (!arg0) {
            this.method1634(-37, (Object) null, -21, 5, (byte) -52);
        }
        return this.method1634(0, arg1, 16, 0, (byte) -97);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lqe;")
    public final class96 method1630(Component arg0, int arg1, boolean arg2) {
        if (arg1 <= 112) {
            this.method1639(false);
        }
        return this.method1634(arg2 ? 1 : 0, arg0, 15, 0, (byte) -113);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;I)Lqe;")
    public final class96 method1631(Class arg0, Class[] arg1, String arg2, int arg3) {
        if (arg3 != 0) {
            field4206 = null;
        }
        return this.method1634(0, new Object[] { arg0, arg2, arg1 }, 8, 0, (byte) -110);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lad;")
    public final class251 method1632(byte arg0) {
        return arg0 > -79 ? null : this.field4201;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;B)Lqe;")
    public final class96 method1633(String arg0, byte arg1) {
        return arg1 == -117 ? this.method1634(0, arg0, 12, 0, (byte) -105) : null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lqe;")
    private final class96 method1634(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        class96 var6 = new class96();
        var6.field1697 = arg0;
        var6.field1698 = arg2;
        var6.field1701 = arg1;
        synchronized (this) {
            if (this.field4194 == null) {
                this.field4194 = this.field4196 = var6;
            } else {
                this.field4194.field1700 = var6;
                this.field4194 = var6;
            }
            this.notify();
        }
        if (arg4 >= -81) {
            this.method1636(false, 23, (Runnable) null);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/lang/String;)Lqe;")
    public final class96 method1635(int arg0, int arg1, String arg2) {
        if (arg0 != 0) {
            field4209 = null;
        }
        return this.method1634(arg1, arg2, 1, 0, (byte) -110);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZILjava/lang/Runnable;)Lqe;")
    public final class96 method1636(boolean arg0, int arg1, Runnable arg2) {
        if (arg0) {
            this.field4198 = null;
        }
        return this.method1634(arg1, arg2, 2, 0, (byte) -97);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public final void method1637(byte arg0) {
        field4211 = class53.method405(117) + 5000L;
        if (arg0 <= 69) {
            this.method1641(false, 29);
        }
    }

    @OriginalMember(owner = "client!wc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class96 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4203) {
                        return;
                    }
                    if (this.field4196 != null) {
                        var2 = this.field4196;
                        this.field4196 = this.field4196.field1700;
                        if (this.field4196 == null) {
                            this.field4194 = null;
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
                int var3 = var2.field1698;
                if (var3 == 1) {
                    if (field4211 > class53.method405(97)) {
                        throw new IOException();
                    }
                    var2.field1699 = new Socket(InetAddress.getByName((String) var2.field1701), var2.field1697);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1701);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1697);
                    var2.field1699 = var6;
                } else if (var3 == 4) {
                    if (field4211 > class53.method405(16)) {
                        throw new IOException();
                    }
                    var2.field1699 = new DataInputStream(((URL) var2.field1701).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field1701;
                    var2.field1699 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field1701;
                    var2.field1699 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field1696 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1696 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[ILjava/awt/Point;ILjava/awt/Component;I)Lqe;")
    public final class96 method1638(boolean arg0, int[] arg1, Point arg2, int arg3, Component arg4, int arg5) {
        if (!arg0) {
            field4193 = -127;
        }
        return this.method1634(arg3, new Object[] { arg4, arg1, arg2 }, 17, arg5, (byte) -83);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public final void method1639(boolean arg0) {
        synchronized (this) {
            this.field4203 = arg0;
            this.notifyAll();
        }
        try {
            this.field4198.join();
        } catch (InterruptedException var8) {
        }
        if (this.field4202 != null) {
            try {
                this.field4202.method751((byte) 36);
            } catch (IOException var7) {
            }
        }
        if (this.field4197 != null) {
            try {
                this.field4197.method751((byte) 36);
            } catch (IOException var6) {
            }
        }
        if (this.field4191 != null) {
            for (int var3 = 0; var3 < this.field4191.length; var3++) {
                if (this.field4191[var3] != null) {
                    try {
                        this.field4191[var3].method751((byte) 36);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4192 != null) {
            try {
                this.field4192.method751((byte) 36);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBILjava/awt/Component;)Lqe;")
    public final class96 method1640(int arg0, byte arg1, int arg2, Component arg3) {
        if (arg1 < 81) {
            this.field4202 = null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method1634(arg0 + var5.x, (Object) null, 14, var5.y + arg2, (byte) -117);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)Lqe;")
    public final class96 method1641(boolean arg0, int arg1) {
        if (arg0) {
            this.method1636(false, 100, (Runnable) null);
        }
        return this.method1634(arg1, (Object) null, 3, 0, (byte) -118);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/net/URL;B)Lqe;")
    public final class96 method1642(URL arg0, byte arg1) {
        if (arg1 != -36) {
            field4209 = null;
        }
        return this.method1634(0, arg0, 4, 0, (byte) -127);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class229(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field4207 = arg0;
        field4206 = "Unknown";
        field4195 = "1.1";
        try {
            field4206 = System.getProperty("java.vendor");
            field4195 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4208 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4208 = "Unknown";
        }
        field4205 = field4208.toLowerCase();
        try {
            field4204 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4204 = "";
        }
        try {
            field4199 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4199 = "";
        }
        try {
            field4200 = System.getProperty("user.home");
            if (field4200 != null) {
                field4200 = field4200 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4200 == null) {
            field4200 = "~/";
        }
        try {
            this.field4210 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4209 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4209 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4212 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4212 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4203 = false;
        this.field4198 = new Thread(this);
        this.field4198.setPriority(10);
        this.field4198.setDaemon(true);
        this.field4198.start();
    }

    static {
        new Hashtable(16);
        field4211 = 0L;
    }
}
