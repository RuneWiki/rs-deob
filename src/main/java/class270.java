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

@OriginalClass("client!cb")
public class class270 implements Runnable {

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lje;")
    public class68 field4675 = null;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lje;")
    public class68 field4673 = null;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field4677 = null;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
    private boolean field4679 = false;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lni;")
    private class23 field4669 = null;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lni;")
    private class23 field4680 = null;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lje;")
    public class68 field4684 = null;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4686;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field4672;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4676 = 3;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Lli;")
    private class209 field4687;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4670;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4671;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4674;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4678;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Ljava/lang/String;")
    private static String field4681;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4682;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4685;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4688;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4689;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[Lje;")
    public class68[] field4683;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Lni;", line = 6)
    public final class23 method1886(String arg0, int arg1, Class arg2, Class[] arg3) {
        if (arg1 > -11) {
            field4670 = (String) null;
        }
        return this.method1893(0, new Object[] { arg2, arg0, arg3 }, 0, 8, (byte) -104);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILjava/awt/Component;)Lni;", line = 19)
    public final class23 method1887(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg1 != -2743) {
            this.method1899(-35);
        }
        return this.method1893(var5.x + arg2, (Object) null, var5.y + arg0, 14, (byte) -119);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Lni;", line = 30)
    public final class23 method1888(int arg0, int arg1) {
        if (arg1 != -11057) {
            this.method1898((Class) null, (byte) 67);
        }
        return this.method1893(arg0, (Object) null, 0, 3, (byte) -104);
    }

    @OriginalMember(owner = "client!cb", name = "run", descriptor = "()V", line = 43)
    public final void run() {
        while (true) {
            class23 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4679) {
                        return;
                    }
                    if (this.field4680 != null) {
                        var2 = this.field4680;
                        this.field4680 = this.field4680.field561;
                        if (this.field4680 == null) {
                            this.field4669 = null;
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
                int var5 = var2.field559;
                if (var5 == 1) {
                    var2.field562 = new Socket(InetAddress.getByName((String) var2.field564), var2.field563);
                } else if (var5 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field564);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field563);
                    var2.field562 = var6;
                } else if (var5 == 4) {
                    var2.field562 = new DataInputStream(((URL) var2.field564).openStream());
                } else if (var5 == 8) {
                    Object[] var7 = (Object[]) ((Object[]) var2.field564);
                    var2.field562 = ((Class) var7[0]).getDeclaredMethod((String) var7[1], (Class[]) ((Class[]) var7[2]));
                } else if (var5 == 9) {
                    Object[] var8 = (Object[]) ((Object[]) var2.field564);
                    var2.field562 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else {
                    throw new Exception();
                }
                var2.field560 = 1;
            } catch (ThreadDeath var11) {
                throw var11;
            } catch (Throwable var12) {
                var2.field560 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/awt/Frame;)Lni;", line = 132)
    public final class23 method1889(int arg0, Frame arg1) {
        return arg0 == 2 ? this.method1893(0, arg1, 0, 7, (byte) -105) : (class23) null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)Lni;", line = 143)
    public final class23 method1890(String arg0, int arg1) {
        if (arg1 <= 3) {
            this.method1904((byte) -46, -32, (Runnable) null);
        }
        return this.method1893(0, arg0, 0, 16, (byte) -109);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lni;", line = 157)
    public final class23 method1891(Class arg0, int arg1, String arg2) {
        return arg1 == 2 ? this.method1893(0, new Object[] { arg0, arg2 }, 0, 9, (byte) -120) : (class23) null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)Lni;", line = 167)
    public final class23 method1892(int arg0, String arg1) {
        if (arg0 != 0) {
            field4670 = (String) null;
        }
        return this.method1893(0, arg1, 0, 12, (byte) -108);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 438)
    public class270(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field4677 = arg0;
        field4685 = "Unknown";
        field4671 = "1.1";
        try {
            field4685 = System.getProperty("java.vendor");
            field4671 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        try {
            field4670 = System.getProperty("os.name");
        } catch (Exception var19) {
            field4670 = "Unknown";
        }
        field4678 = field4670.toLowerCase();
        try {
            field4674 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field4674 = "";
        }
        try {
            field4682 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field4682 = "";
        }
        try {
            field4681 = System.getProperty("user.home");
            if (field4681 != null) {
                field4681 = field4681 + "/";
            }
        } catch (Exception var16) {
        }
        if (field4681 == null) {
            field4681 = "~/";
        }
        try {
            this.field4686 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        try {
            if (arg0 == null) {
                field4688 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4688 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var14) {
        }
        try {
            if (arg0 == null) {
                field4689 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4689 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var13) {
        }
        this.field4679 = false;
        this.field4672 = new Thread(this);
        this.field4672.setPriority(10);
        this.field4672.setDaemon(true);
        this.field4672.start();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lni;", line = 193)
    private final class23 method1893(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        class23 var6 = new class23();
        var6.field564 = arg1;
        var6.field559 = arg3;
        var6.field563 = arg0;
        synchronized (this) {
            if (this.field4669 == null) {
                this.field4669 = this.field4680 = var6;
            } else {
                this.field4669.field561 = var6;
                this.field4669 = var6;
            }
            if (arg4 >= -101) {
                this.method1902(1, (String) null, -27);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/net/URL;)Lni;", line = 223)
    public final class23 method1894(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.method1891((Class) null, -16, (String) null);
        }
        return this.method1893(0, arg1, 0, 4, (byte) -105);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lli;", line = 235)
    public final class209 method1895(byte arg0) {
        if (arg0 != 32) {
            this.method1887(-43, 41, -45, (Component) null);
        }
        return this.field4687;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 248)
    public final void method1896(int arg0) {
        synchronized (this) {
            this.field4679 = true;
            this.notifyAll();
        }
        try {
            this.field4672.join();
        } catch (InterruptedException var14) {
        }
        if (this.field4675 != null) {
            try {
                this.field4675.method457(arg0 ^ 0x6);
            } catch (IOException var13) {
            }
        }
        if (this.field4673 != null) {
            try {
                this.field4673.method457(1);
            } catch (IOException var12) {
            }
        }
        if (arg0 != 7) {
            field4674 = (String) null;
        }
        if (this.field4683 != null) {
            for (int var7 = 0; var7 < this.field4683.length; var7++) {
                if (this.field4683[var7] != null) {
                    try {
                        this.field4683[var7].method457(1);
                    } catch (IOException var11) {
                    }
                }
            }
        }
        if (this.field4684 != null) {
            try {
                this.field4684.method457(1);
            } catch (IOException var10) {
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lni;", line = 316)
    public final class23 method1897(Component arg0, boolean arg1, int arg2) {
        return arg2 == 0 ? this.method1893(arg1 ? 1 : 0, arg0, 0, 15, (byte) -108) : (class23) null;
    }

    static {
        new Hashtable(16);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Class;B)Lni;", line = 339)
    public final class23 method1898(Class arg0, byte arg1) {
        return arg1 == -29 ? this.method1893(0, arg0, 0, 10, (byte) -102) : (class23) null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)Z", line = 350)
    public final boolean method1899(int arg0) {
        return arg0 >= -41 ? false : false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)Lni;", line = 369)
    public final class23 method1900(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -7 / ((arg3 + 7) / 37);
        return this.method1893((arg0 << 16) + arg1, (Object) null, (arg2 << 16) + arg4, 6, (byte) -110);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)Lni;", line = 380)
    public final class23 method1901(byte arg0) {
        if (arg0 != -3) {
            this.method1890((String) null, 57);
        }
        return this.method1893(0, (Object) null, 0, 5, (byte) -126);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;I)Lni;", line = 393)
    public final class23 method1902(int arg0, String arg1, int arg2) {
        return arg0 <= 46 ? (class23) null : this.method1893(arg2, arg1, 0, 1, (byte) -126);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/Class;)Lni;", line = 404)
    public final class23 method1903(int arg0, Class arg1) {
        if (arg0 != 27068) {
            this.method1889(25, (Frame) null);
        }
        return this.method1893(0, arg1, 0, 11, (byte) -102);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BILjava/lang/Runnable;)Lni;", line = 427)
    public final class23 method1904(byte arg0, int arg1, Runnable arg2) {
        return arg0 > -100 ? (class23) null : this.method1893(arg1, arg2, 0, 2, (byte) -102);
    }
}
