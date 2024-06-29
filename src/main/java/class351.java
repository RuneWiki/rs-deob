import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class351 implements Runnable {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/applet/Applet;")
    public Applet field4888 = null;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "Ljc;")
    public class253 field4891 = null;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "Z")
    private boolean field4893 = false;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "Lmq;")
    private class295 field4898 = null;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Ljc;")
    public class253 field4890 = null;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "Lmq;")
    private class295 field4907 = null;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "Ljc;")
    public class253 field4908 = null;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field4901;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field4892;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field4889 = 3;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "J")
    public static volatile long field4906;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "Luh;")
    private class92 field4909;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4894;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4895;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Ljava/lang/String;")
    private static String field4896;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4897;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4899;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4900;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4903;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4904;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field4905;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "[Ljc;")
    public class253[] field4902;

    static {
        new Hashtable(16);
        field4906 = 0L;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/Class;[Ljava/lang/Class;ILjava/lang/String;)Lmq;", line = 3)
    public final class295 method2236(Class arg0, Class[] arg1, int arg2, String arg3) {
        return arg2 >= -77 ? null : this.method2243(false, new Object[] { arg0, arg3, arg1 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Luh;", line = 14)
    public final class92 method2237(int arg0) {
        int var2 = -49 / ((-arg0 - 23) / 54);
        return this.field4909;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)Lmq;", line = 30)
    public final class295 method2238(int arg0) {
        if (arg0 <= 91) {
            this.field4891 = null;
        }
        return this.method2243(false, (Object) null, 0, 0, 13);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;II)Lmq;", line = 44)
    public final class295 method2239(String arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field4906 = -46L;
        }
        return this.method2243(false, arg0, arg1, 0, 1);
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)Lmq;", line = 54)
    public final class295 method2240(int arg0) {
        return arg0 == 0 ? this.method2243(false, (Object) null, 0, 0, 12) : null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/net/URL;I)Lmq;", line = 66)
    public final class295 method2241(URL arg0, int arg1) {
        return arg1 == -24458 ? this.method2243(false, arg0, 0, 0, 4) : null;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 591)
    public class351(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field4897 = "1.1";
        this.field4888 = arg0;
        field4903 = "Unknown";
        try {
            field4903 = System.getProperty("java.vendor");
            field4897 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field4899 = System.getProperty("os.name");
        } catch (Exception var11) {
            field4899 = "Unknown";
        }
        field4895 = field4899.toLowerCase();
        try {
            field4900 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field4900 = "";
        }
        try {
            field4894 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field4894 = "";
        }
        try {
            field4896 = System.getProperty("user.home");
            if (field4896 != null) {
                field4896 = field4896 + "/";
            }
        } catch (Exception var8) {
        }
        if (field4896 == null) {
            field4896 = "~/";
        }
        try {
            this.field4901 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field4905 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field4905 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field4904 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field4904 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field4893 = false;
        this.field4892 = new Thread(this);
        this.field4892.setPriority(10);
        this.field4892.setDaemon(true);
        this.field4892.start();
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;I)Lmq;", line = 84)
    public final class295 method2242(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method2263(false, (Class) null, (String) null);
        }
        return this.method2243(false, arg0, 0, 0, 16);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLjava/lang/Object;III)Lmq;", line = 94)
    private final class295 method2243(boolean arg0, Object arg1, int arg2, int arg3, int arg4) {
        class295 var6 = new class295();
        var6.field4069 = arg2;
        var6.field4067 = arg1;
        var6.field4071 = arg4;
        synchronized (this) {
            if (this.field4907 == null) {
                this.field4907 = this.field4898 = var6;
            } else {
                this.field4907.field4066 = var6;
                this.field4907 = var6;
            }
            this.notify();
            if (arg0) {
                this.field4888 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lmq;", line = 126)
    public final class295 method2244(int arg0, Transferable arg1) {
        return arg0 >= -100 ? null : this.method2243(false, arg1, 0, 0, 19);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)Z", line = 141)
    public final boolean method2245(byte arg0) {
        return arg0 < 0 ? false : false;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZI)Lmq;", line = 155)
    public final class295 method2246(boolean arg0, int arg1) {
        if (arg0) {
            this.method2254(124, 125, -94, 119, (Object) null);
        }
        return this.method2243(false, (Object) null, arg1, 0, 3);
    }

    @OriginalMember(owner = "client!kq", name = "run", descriptor = "()V", line = 165)
    public final void run() {
        while (true) {
            class295 var2;
            synchronized (this) {
                while (true) {
                    if (this.field4893) {
                        return;
                    }
                    if (this.field4898 != null) {
                        var2 = this.field4898;
                        this.field4898 = this.field4898.field4066;
                        if (this.field4898 == null) {
                            this.field4907 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field4071;
                if (var3 == 1) {
                    if (class224.method1425(-26805) < field4906) {
                        throw new IOException();
                    }
                    var2.field4070 = new Socket(InetAddress.getByName((String) var2.field4067), var2.field4069);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4067);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4069);
                    var2.field4070 = var4;
                } else if (var3 == 4) {
                    if (class224.method1425(-26805) < field4906) {
                        throw new IOException();
                    }
                    var2.field4070 = new DataInputStream(((URL) var2.field4067).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4067;
                    var2.field4070 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field4067;
                    var2.field4070 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4070 = var6.getContents((Object) null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field4067;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, (ClipboardOwner) null);
                } else {
                    throw new Exception("");
                }
                var2.field4068 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4068 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)Lmq;", line = 286)
    public final class295 method2247(int arg0) {
        return arg0 == 0 ? this.method2243(false, (Object) null, 0, 0, 18) : null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLjava/awt/Frame;)Lmq;", line = 300)
    public final class295 method2248(boolean arg0, Frame arg1) {
        if (!arg0) {
            this.method2240(-15);
        }
        return this.method2243(false, arg1, 0, 0, 7);
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)Lmq;", line = 311)
    public final class295 method2249(int arg0) {
        if (arg0 >= -9) {
            this.field4898 = null;
        }
        return this.method2243(false, (Object) null, 0, 0, 5);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/Class;I)Lmq;", line = 323)
    public final class295 method2250(Class arg0, int arg1) {
        return arg1 == -2 ? this.method2243(false, arg0, 0, 0, 11) : null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BZLjava/awt/Component;)Lmq;", line = 339)
    public final class295 method2251(byte arg0, boolean arg1, Component arg2) {
        return arg0 > -96 ? null : this.method2243(false, arg2, arg1 ? 1 : 0, 0, 15);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBIII)Lmq;", line = 350)
    public final class295 method2252(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = 56 % ((-arg1 - 22) / 38);
        return this.method2243(false, (Object) null, (arg3 << 16) + arg2, (arg4 << 16) + arg0, 6);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(Ljava/lang/String;I)Lmq;", line = 365)
    public final class295 method2253(String arg0, int arg1) {
        return arg1 <= 120 ? null : this.method2243(false, arg0, 0, 0, 21);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIILjava/lang/Object;)Lmq;", line = 375)
    private final class295 method2254(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class295 var6 = new class295();
        synchronized (var6) {
            var6.field4069 = arg2;
            var6.field4067 = arg4;
            var6.field4071 = arg1;
            synchronized (this) {
                if (this.field4907 == null) {
                    this.field4907 = this.field4898 = var6;
                } else {
                    this.field4907.field4066 = var6;
                    this.field4907 = var6;
                }
                this.notify();
            }
            try {
                if (arg3 != 1) {
                    this.method2242((String) null, -8);
                }
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 416)
    public final byte[] method2255(int arg0, String arg1) {
        if (arg0 != -6552) {
            this.method2251((byte) -92, true, (Component) null);
        }
        class295 var3 = this.method2254(0, 21, 0, arg0 + 6553, arg1);
        return (byte[]) var3.field4070;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIBLjava/awt/Component;)Lmq;", line = 430)
    public final class295 method2256(int arg0, int arg1, byte arg2, Component arg3) {
        if (arg2 < 7) {
            field4897 = null;
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method2243(false, (Object) null, arg1 + var5.x, var5.y + arg0, 14);
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)V", line = 445)
    public final void method2257(int arg0) {
        field4906 = class224.method1425(-26805) + 5000L;
        int var2 = 68 / ((-arg0 - 65) / 43);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/Class;)Lmq;", line = 457)
    public final class295 method2258(int arg0, Class arg1) {
        return arg0 == 0 ? this.method2243(false, arg1, 0, 0, 10) : null;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(ILjava/lang/Class;)Lmq;", line = 474)
    public final class295 method2259(int arg0, Class arg1) {
        int var3 = -111 / ((-arg0 - 88) / 37);
        return this.method2243(false, arg1, 0, 0, 20);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILjava/awt/Point;Ljava/awt/Component;I[I)Lmq;", line = 483)
    public final class295 method2260(int arg0, int arg1, Point arg2, Component arg3, int arg4, int[] arg5) {
        if (arg4 != 17) {
            this.field4890 = null;
        }
        return this.method2243(false, new Object[] { arg3, arg5, arg2 }, arg0, arg1, 17);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILjava/lang/Runnable;)Lmq;", line = 496)
    public final class295 method2261(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 29171) {
            this.method2257(-116);
        }
        return this.method2243(false, arg2, arg0, 0, 2);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V", line = 513)
    public final void method2262(byte arg0) {
        synchronized (this) {
            this.field4893 = true;
            this.notifyAll();
        }
        try {
            this.field4892.join();
        } catch (InterruptedException var8) {
        }
        if (arg0 != 90) {
            this.method2237(123);
        }
        if (this.field4890 != null) {
            try {
                this.field4890.method1562(-8060);
            } catch (IOException var7) {
            }
        }
        if (this.field4891 != null) {
            try {
                this.field4891.method1562(-8060);
            } catch (IOException var6) {
            }
        }
        if (this.field4902 != null) {
            for (int var3 = 0; var3 < this.field4902.length; var3++) {
                if (this.field4902[var3] != null) {
                    try {
                        this.field4902[var3].method1562(arg0 - 8150);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field4908 != null) {
            try {
                this.field4908.method1562(-8060);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLjava/lang/Class;Ljava/lang/String;)Lmq;", line = 577)
    public final class295 method2263(boolean arg0, Class arg1, String arg2) {
        if (!arg0) {
            this.method2238(26);
        }
        return this.method2243(false, new Object[] { arg1, arg2 }, 0, 0, 9);
    }
}
