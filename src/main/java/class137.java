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
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lhh;")
    public class86 field1825 = null;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "Ljava/applet/Applet;")
    public Applet field1828 = null;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Lhh;")
    public class86 field1824 = null;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lhh;")
    public class86 field1821 = null;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Ltc;")
    private class236 field1822 = null;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "Ltc;")
    private class236 field1840 = null;

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "Z")
    private boolean field1841 = false;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Ljava/lang/String;")
    private String field1832;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    private int field1834;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1826;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field1827;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public static int field1839 = 3;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field1830 = new Hashtable(16);

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "J")
    public static volatile long field1843 = 0L;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Lee;")
    private class480 field1831;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Ljava/lang/String;")
    private static String field1820;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1829;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1833;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1835;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1836;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1837;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1838;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1842;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1844;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "[Lhh;")
    public class86[] field1823;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIBLjava/lang/Object;I)Ltc;", line = 3)
    private final class236 method828(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        class236 var6 = new class236();
        var6.field3148 = arg1;
        var6.field3152 = arg3;
        int var7 = -52 % ((arg2 + 58) / 39);
        var6.field3147 = arg4;
        synchronized (this) {
            if (this.field1822 == null) {
                this.field1822 = this.field1840 = var6;
            } else {
                this.field1822.field3150 = var6;
                this.field1822 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;I)Ltc;", line = 36)
    public final class236 method829(int arg0, String arg1, int arg2) {
        if (arg2 != -12048) {
            this.method833(null, true, 100, -103, 83);
        }
        return this.method828(0, arg0, (byte) -115, arg1, 1);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;B)Ltc;", line = 46)
    public final class236 method830(String arg0, byte arg1) {
        return arg1 == 58 ? this.method828(0, 0, (byte) -101, arg0, 21) : null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Class;I)Ltc;", line = 59)
    public final class236 method831(Class arg0, int arg1) {
        return arg1 == 17761 ? this.method828(0, 0, (byte) 89, arg0, 20) : null;
    }

    @OriginalMember(owner = "client!fq", name = "run", descriptor = "()V", line = 69)
    public final void run() {
        while (true) {
            class236 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1841) {
                        return;
                    }
                    if (this.field1840 != null) {
                        var2 = this.field1840;
                        this.field1840 = this.field1840.field3150;
                        if (this.field1840 == null) {
                            this.field1822 = null;
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
                int var3 = var2.field3147;
                if (var3 == 1) {
                    if (field1843 > class45.method252((byte) -8)) {
                        throw new IOException();
                    }
                    var2.field3151 = new Socket(InetAddress.getByName((String) var2.field3152), var2.field3148);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3152);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3148);
                    var2.field3151 = var4;
                } else if (var3 == 4) {
                    if (field1843 > class45.method252((byte) -8)) {
                        throw new IOException();
                    }
                    var2.field3151 = new DataInputStream(((URL) var2.field3152).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3152;
                    var2.field3151 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field3152;
                    var2.field3151 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3151 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field3152;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else {
                    throw new Exception("");
                }
                var2.field3149 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3149 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/net/URL;)Ltc;", line = 190)
    public final class236 method832(int arg0, URL arg1) {
        if (arg0 >= -127) {
            this.field1840 = null;
        }
        return this.method828(0, 0, (byte) 60, arg1, 4);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Object;ZIII)Ltc;", line = 203)
    private final class236 method833(Object arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class236 var6 = new class236();
        synchronized (var6) {
            var6.field3148 = arg4;
            var6.field3152 = arg0;
            var6.field3147 = arg3;
            synchronized (this) {
                if (this.field1822 == null) {
                    this.field1822 = this.field1840 = var6;
                } else {
                    this.field1822.field3150 = var6;
                    this.field1822 = var6;
                }
                this.notify();
                if (!arg1) {
                    field1837 = null;
                }
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ltc;", line = 240)
    public final class236 method834(int arg0, String arg1, Class[] arg2, Class arg3) {
        return arg0 == 21 ? this.method828(0, 0, (byte) -121, new Object[] { arg3, arg1, arg2 }, 8) : null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Ltc;", line = 254)
    public final class236 method835(Class arg0, byte arg1, String arg2) {
        if (arg1 != -126) {
            this.field1827 = null;
        }
        return this.method828(0, 0, (byte) -100, new Object[] { arg0, arg2 }, 9);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 271)
    public final void method836(int arg0) {
        synchronized (this) {
            this.field1841 = true;
            if (arg0 != 0) {
                return;
            }
            this.notifyAll();
        }
        try {
            this.field1827.join();
        } catch (InterruptedException var10) {
        }
        if (this.field1825 != null) {
            try {
                this.field1825.method472(-29827);
            } catch (IOException var9) {
            }
        }
        if (this.field1824 != null) {
            try {
                this.field1824.method472(-29827);
            } catch (IOException var8) {
            }
        }
        if (this.field1823 != null) {
            for (int var3 = 0; var3 < this.field1823.length; var3++) {
                if (this.field1823[var3] != null) {
                    try {
                        this.field1823[var3].method472(arg0 - 29827);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field1821 != null) {
            try {
                this.field1821.method472(-29827);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 709)
    public class137(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field1832 = arg2;
        this.field1834 = arg1;
        field1837 = "Unknown";
        field1836 = "1.1";
        this.field1828 = arg0;
        try {
            field1837 = System.getProperty("java.vendor");
            field1836 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1829 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1829 = "Unknown";
        }
        field1833 = field1829.toLowerCase();
        try {
            field1838 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1838 = "";
        }
        try {
            field1835 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1835 = "";
        }
        try {
            field1820 = System.getProperty("user.home");
            if (field1820 != null) {
                field1820 = field1820 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1820 == null) {
            field1820 = "~/";
        }
        try {
            this.field1826 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1842 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1842 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1844 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1844 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1841 = false;
        this.field1827 = new Thread(this);
        this.field1827.setPriority(10);
        this.field1827.setDaemon(true);
        this.field1827.start();
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Frame;I)Ltc;", line = 340)
    public final class236 method837(Frame arg0, int arg1) {
        return arg1 == 7 ? this.method828(0, 0, (byte) -106, arg0, 7) : null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Ltc;", line = 350)
    public final class236 method838(Runnable arg0, int arg1, byte arg2) {
        return arg2 >= -105 ? null : this.method828(0, arg1, (byte) 87, arg0, 2);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 364)
    public static final File method839(byte arg0, String arg1, String arg2, int arg3) {
        File var4 = (File) field1830.get(arg2);
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 2) {
            method839((byte) -100, null, null, -76);
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1820, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg1 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg1)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field1830.put(arg2, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var11 != null) {
                                var11.close();
                                Object var15 = null;
                            }
                        } catch (Exception var16) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Point;[IILjava/awt/Component;II)Ltc;", line = 456)
    public final class236 method840(Point arg0, int[] arg1, int arg2, Component arg3, int arg4, int arg5) {
        return arg5 == -3790 ? this.method828(arg2, arg4, (byte) 67, new Object[] { arg3, arg1, arg0 }, 17) : null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIII)Ltc;", line = 466)
    public final class236 method841(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 55 / ((arg2 - 1) / 63);
        return this.method828((arg0 << 16) + arg4, (arg3 << 16) + arg1, (byte) -120, null, 6);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Z", line = 476)
    public final boolean method842(boolean arg0) {
        if (arg0) {
            this.field1841 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Ljava/lang/String;B)[B", line = 491)
    public final byte[] method843(String arg0, byte arg1) {
        class236 var3 = this.method833(arg0, true, 0, 21, 0);
        int var4 = -1 / ((70 - arg1) / 35);
        return (byte[]) var3.field3151;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Ljava/lang/Class;I)V", line = 507)
    public final void method844(Class arg0, int arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        if (arg1 != -5) {
            this.field1834 = 101;
        }
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field1833.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field1833.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method851(88, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)Ltc;", line = 546)
    public final class236 method845(int arg0) {
        return arg0 >= -87 ? null : this.method828(0, 0, (byte) -114, null, 5);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Ltc;", line = 556)
    public final class236 method846(byte arg0) {
        if (arg0 <= 2) {
            this.method838(null, -41, (byte) -122);
        }
        return this.method828(0, 0, (byte) -125, null, 18);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLjava/lang/Class;)Ltc;", line = 567)
    public final class236 method847(byte arg0, Class arg1) {
        return arg0 == -109 ? this.method828(0, 0, (byte) -123, arg1, 11) : null;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)V", line = 582)
    public final void method848(byte arg0) {
        field1843 = class45.method252((byte) -8) + 5000L;
        if (arg0 != -27) {
            this.field1841 = true;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Ltc;", line = 596)
    public final class236 method849(Transferable arg0, int arg1) {
        return arg1 == 19 ? this.method828(0, 0, (byte) -124, arg0, 19) : null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;ZZ)Ltc;", line = 607)
    public final class236 method850(String arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            return arg1 ? this.method828(0, 0, (byte) -124, arg0, 12) : this.method828(0, 0, (byte) 4, arg0, 13);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 622)
    public final File method851(int arg0, String arg1) {
        if (arg0 <= 59) {
            this.method833(null, false, 59, 99, 10);
        }
        return method839((byte) 2, this.field1832, arg1, this.field1834);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIILjava/awt/Component;)Ltc;", line = 632)
    public final class236 method852(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 != 1339) {
            this.method831(null, 107);
        }
        Point var5 = arg3.getLocationOnScreen();
        return this.method828(arg1 + var5.y, var5.x + arg2, (byte) -125, null, 14);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)Ltc;", line = 644)
    public final class236 method853(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1834 = -82;
        }
        return this.method828(0, arg1, (byte) -100, null, 3);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLjava/lang/String;)Ltc;", line = 668)
    public final class236 method854(byte arg0, String arg1) {
        int var3 = -72 % ((-arg0 - 46) / 54);
        return this.method828(0, 0, (byte) -127, arg1, 16);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLjava/awt/Component;Z)Ltc;", line = 681)
    public final class236 method855(boolean arg0, Component arg1, boolean arg2) {
        return arg0 ? this.method828(0, arg2 ? 1 : 0, (byte) -107, arg1, 15) : null;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)Lee;", line = 700)
    public final class480 method856(int arg0) {
        if (arg0 != 0) {
            field1842 = null;
        }
        return this.field1831;
    }
}
