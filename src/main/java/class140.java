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
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class140 implements Runnable {

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lhr;")
    public class218 field1819 = null;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "Ldn;")
    private class548 field1827 = null;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Z")
    public boolean field1823 = false;

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "Lhr;")
    public class218 field1830 = null;

    @OriginalMember(owner = "client!ufa", name = "x", descriptor = "Z")
    public boolean field1841 = false;

    @OriginalMember(owner = "client!ufa", name = "v", descriptor = "Ldn;")
    private class548 field1839 = null;

    @OriginalMember(owner = "client!ufa", name = "u", descriptor = "Lhr;")
    public class218 field1838 = null;

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "Z")
    private boolean field1843 = false;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1829;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "[Lhr;")
    public class218[] field1825;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "Ljava/lang/Object;")
    private Object field1826;

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "Ldu;")
    private class383 field1832;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "Ljava/lang/Object;")
    private Object field1820;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "Ljava/lang/Object;")
    private Object field1824;

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "Lvp;")
    private class617 field1833;

    @OriginalMember(owner = "client!ufa", name = "A", descriptor = "Ljava/lang/Thread;")
    private Thread field1844;

    @OriginalMember(owner = "client!ufa", name = "B", descriptor = "J")
    private static volatile long field1845 = 0L;

    @OriginalMember(owner = "client!ufa", name = "y", descriptor = "I")
    private static int field1842;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ufa", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field1846;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ufa", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field1847;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ufa", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field1848;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ufa", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field1849;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1818;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1821;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1822;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1828;

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "Ljava/lang/String;")
    private static String field1831;

    @OriginalMember(owner = "client!ufa", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1834;

    @OriginalMember(owner = "client!ufa", name = "s", descriptor = "Ljava/lang/String;")
    private static String field1836;

    @OriginalMember(owner = "client!ufa", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1837;

    @OriginalMember(owner = "client!ufa", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1835;

    @OriginalMember(owner = "client!ufa", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1840;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1063(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/awt/Point;ILjava/awt/Component;II[I)Ldn;", line = 5)
    public final class548 method1043(Point arg0, int arg1, Component arg2, int arg3, int arg4, int[] arg5) {
        if (arg4 != 17) {
            this.method1043(null, -48, null, 39, 106, null);
        }
        return this.method1050(arg1, 24002, 17, new Object[] { arg2, arg5, arg0 }, arg3);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V", line = 20)
    public final void method1044(int arg0) {
        field1845 = class584.method3191(1) + 5000L;
        if (arg0 != 0) {
            field1845 = 93L;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;BZ)Ldn;", line = 31)
    public final class548 method1045(String arg0, byte arg1, boolean arg2) {
        if (arg1 == -48) {
            return arg2 ? this.method1050(0, 24002, 12, arg0, 0) : this.method1050(0, 24002, 13, arg0, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V", line = 47)
    public final void method1046(byte arg0) {
        synchronized (this) {
            if (arg0 >= -98) {
                return;
            }
            this.field1843 = true;
            this.notifyAll();
        }
        try {
            this.field1844.join();
        } catch (InterruptedException var10) {
        }
        if (this.field1830 != null) {
            try {
                this.field1830.method1397(true);
            } catch (IOException var9) {
            }
        }
        if (this.field1819 != null) {
            try {
                this.field1819.method1397(true);
            } catch (IOException var8) {
            }
        }
        if (this.field1825 != null) {
            for (int var3 = 0; var3 < this.field1825.length; var3++) {
                if (this.field1825[var3] != null) {
                    try {
                        this.field1825[var3].method1397(true);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field1838 != null) {
            try {
                this.field1838.method1397(true);
            } catch (IOException var6) {
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZLjava/awt/Frame;)Ldn;", line = 105)
    public final class548 method1047(boolean arg0, Frame arg1) {
        if (arg0) {
            this.method1043(null, -96, null, 37, -13, null);
        }
        return this.method1050(0, 24002, 7, arg1, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)Ldn;", line = 115)
    public final class548 method1048(int arg0) {
        int var2 = 97 / ((-arg0 - 25) / 60);
        return this.method1050(0, 24002, 5, null, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)Ldn;", line = 124)
    public final class548 method1049(int arg0, int arg1) {
        return arg1 == -16719 ? this.method1050(arg0, 24002, 3, null, 0) : null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIILjava/lang/Object;I)Ldn;", line = 139)
    private final class548 method1050(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg1 != 24002) {
            return null;
        }
        class548 var6 = new class548();
        var6.field7112 = arg3;
        var6.field7111 = arg0;
        var6.field7109 = arg2;
        var6.field7107 = arg4;
        synchronized (this) {
            if (this.field1827 == null) {
                this.field1827 = this.field1839 = var6;
            } else {
                this.field1827.field7110 = var6;
                this.field1827 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILjava/lang/String;)Ldn;", line = 180)
    public final class548 method1051(int arg0, String arg1) {
        int var3 = 10 / ((arg0 - 77) / 48);
        return this.method1050(0, 24002, 16, arg1, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 688)
    public class140(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field1836 = arg1;
        field1842 = arg0;
        field1837 = "1.1";
        field1834 = "Unknown";
        this.field1823 = arg3;
        try {
            field1834 = System.getProperty("java.vendor");
            field1837 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field1834.toLowerCase().indexOf("microsoft") != -1) {
            this.field1841 = true;
        }
        try {
            field1821 = System.getProperty("os.name");
        } catch (Exception var19) {
            field1821 = "Unknown";
        }
        field1828 = field1821.toLowerCase();
        try {
            field1822 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field1822 = "";
        }
        try {
            field1818 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field1818 = "";
        }
        try {
            field1831 = System.getProperty("user.home");
            if (field1831 != null) {
                field1831 = field1831 + "/";
            }
        } catch (Exception var16) {
        }
        if (field1831 == null) {
            field1831 = "~/";
        }
        try {
            this.field1829 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field1841) {
            try {
                field1840 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field1835 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class180.method1200(field1836, field1842, (byte) -96);
        if (this.field1823) {
            this.field1838 = new class218(class180.method1202(1755, field1842, "random.dat", null), "rw", 25L);
            this.field1830 = new class218(class180.method1201((byte) -87, "main_file_cache.dat2"), "rw", 209715200L);
            this.field1819 = new class218(class180.method1201((byte) -87, "main_file_cache.idx255"), "rw", 1048576L);
            this.field1825 = new class218[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1825[var5] = new class218(class180.method1201((byte) -87, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field1841) {
                try {
                    this.field1826 = Class.forName("laa").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field1841) {
                    this.field1832 = new class383();
                } else {
                    this.field1820 = Class.forName("pu").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field1841) {
                    this.field1833 = new class617();
                } else {
                    this.field1824 = Class.forName("us").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field1823 && !this.field1841) {
            ThreadGroup var6 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
                var6 = var7;
            }
            Thread[] var8 = new Thread[1000];
            var6.enumerate(var8);
            for (int var9 = 0; var9 < var8.length; var9++) {
                if (var8[var9] != null && var8[var9].getName().startsWith("AWT")) {
                    var8[var9].setPriority(1);
                }
            }
        }
        this.field1843 = false;
        this.field1844 = new Thread(this);
        this.field1844.setPriority(10);
        this.field1844.setDaemon(true);
        this.field1844.start();
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/net/URL;B)Ldn;", line = 193)
    public final class548 method1052(URL arg0, byte arg1) {
        if (arg1 > -102) {
            this.field1838 = null;
        }
        return this.method1050(0, 24002, 4, arg0, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ldn;", line = 215)
    public final class548 method1053(byte arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 < 78) {
            this.method1057(null, -50, (byte) 34);
        }
        return this.method1050(0, 24002, 8, new Object[] { arg2, arg1, arg3 }, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZLjava/lang/String;I)Ldn;", line = 234)
    public final class548 method1054(int arg0, boolean arg1, String arg2, int arg3) {
        int var5 = -18 / ((arg0 - 26) / 53);
        return this.method1050(arg3, 24002, arg1 ? 22 : 1, arg2, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "([BLjava/io/File;I)Z", line = 243)
    public final boolean method1055(byte[] arg0, File arg1, int arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg0, arg2, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ufa", name = "run", descriptor = "()V", line = 262)
    public final void run() {
        while (true) {
            class548 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1843) {
                        return;
                    }
                    if (this.field1839 != null) {
                        var2 = this.field1839;
                        this.field1839 = this.field1839.field7110;
                        if (this.field1839 == null) {
                            this.field1827 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var30) {
                    }
                }
            }
            try {
                int var3 = var2.field7109;
                if (var3 == 1) {
                    if (class584.method3191(1) < field1845) {
                        throw new IOException();
                    }
                    var2.field7113 = new Socket(InetAddress.getByName((String) var2.field7112), var2.field7111);
                } else if (var3 == 22) {
                    if (field1845 > class584.method3191(1)) {
                        throw new IOException();
                    }
                    try {
                        var2.field7113 = class553.method2967(var2.field7111, 116, (String) var2.field7112).method1386((byte) 34);
                    } catch (class120 var29) {
                        var2.field7113 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var5 = new Thread((Runnable) var2.field7112);
                    var5.setDaemon(true);
                    var5.start();
                    var5.setPriority(var2.field7111);
                    var2.field7113 = var5;
                } else if (var3 == 4) {
                    if (class584.method3191(1) < field1845) {
                        throw new IOException();
                    }
                    var2.field7113 = new DataInputStream(((URL) var2.field7112).openStream());
                } else if (var3 == 8) {
                    Object[] var23 = (Object[]) var2.field7112;
                    if (this.field1823 && ((Class) var23[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7113 = ((Class) var23[0]).getDeclaredMethod((String) var23[1], (Class[]) var23[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field7112;
                    if (this.field1823 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7113 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field7113 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var21 = (Transferable) var2.field7112;
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var22.setContents(var21, null);
                } else if (!this.field1823) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class584.method3191(1) < field1845) {
                        throw new IOException();
                    }
                    String var8 = (var2.field7111 >> 24 & 0xFF) + "." + (var2.field7111 >> 16 & 0xFF) + "." + ((var2.field7111 & 0xFFCE) >> 8) + "." + (var2.field7111 & 0xFF);
                    var2.field7113 = InetAddress.getByName(var8).getHostName();
                } else if (var3 == 21) {
                    if (class584.method3191(1) < field1845) {
                        throw new IOException();
                    }
                    var2.field7113 = InetAddress.getByName((String) var2.field7112).getAddress();
                } else if (var3 == 5) {
                    if (this.field1841) {
                        var2.field7113 = this.field1832.method2181((byte) -77);
                    } else {
                        var2.field7113 = Class.forName("pu").getMethod("listmodes").invoke(this.field1820);
                    }
                } else if (var3 == 6) {
                    Frame var9 = new Frame("Jagex Full Screen");
                    var2.field7113 = var9;
                    var9.setResizable(false);
                    if (this.field1841) {
                        this.field1832.method2180(var2.field7111 >>> 16, var2.field7107 >> 16, var2.field7107 & 0xFFFF, var2.field7111 & 0xFFFF, (byte) -126, var9);
                    } else {
                        Class.forName("pu").getMethod("enter", field1846 == null ? (field1846 = method1063("java.awt.Frame")) : field1846, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field1820, var9, Integer.valueOf(var2.field7111 >>> 16), new Integer(var2.field7111 & 0xFFFF), Integer.valueOf(var2.field7107 >> 16), new Integer(var2.field7107 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field1841) {
                        this.field1832.method2179((byte) 67, (Frame) var2.field7112);
                    } else {
                        Class.forName("pu").getMethod("exit").invoke(this.field1820);
                    }
                } else if (var3 == 12) {
                    class218 var10 = method1056(field1836, (String) var2.field7112, 127, field1842);
                    var2.field7113 = var10;
                } else if (var3 == 13) {
                    class218 var20 = method1056("", (String) var2.field7112, 127, field1842);
                    var2.field7113 = var20;
                } else if (this.field1823 && var3 == 14) {
                    int var18 = var2.field7111;
                    int var19 = var2.field7107;
                    if (this.field1841) {
                        this.field1833.method3374(var19, -4, var18);
                    } else {
                        Class.forName("us").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field1824, Integer.valueOf(var18), new Integer(var19));
                    }
                } else if (this.field1823 && var3 == 15) {
                    boolean var11 = var2.field7111 != 0;
                    Component var12 = (Component) var2.field7112;
                    if (this.field1841) {
                        this.field1833.method3373(var12, var11, 22192);
                    } else {
                        Class.forName("us").getDeclaredMethod("showcursor", field1847 == null ? (field1847 = method1063("java.awt.Component")) : field1847, Boolean.TYPE).invoke(this.field1824, var12, Boolean.valueOf(var11));
                    }
                } else if (!this.field1841 && var3 == 17) {
                    Object[] var13 = (Object[]) var2.field7112;
                    Class.forName("us").getDeclaredMethod("setcustomcursor", field1847 == null ? (field1847 = method1063("java.awt.Component")) : field1847, field1848 == null ? (field1848 = method1063("[I")) : field1848, Integer.TYPE, Integer.TYPE, field1849 == null ? (field1849 = method1063("java.awt.Point")) : field1849).invoke(this.field1824, (Component) var13[0], (int[]) var13[1], Integer.valueOf(var2.field7111), new Integer(var2.field7107), (Point) var13[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field1828.startsWith("win")) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field7112;
                        if (!var14.startsWith("http://") && !var14.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var15 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var16 = 0;
                        while (true) {
                            if (var14.length() <= var16) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                                var2.field7113 = null;
                                break;
                            }
                            if (var15.indexOf(var14.charAt(var16)) == -1) {
                                throw new Exception();
                            }
                            var16++;
                        }
                    } catch (Exception var31) {
                        var2.field7113 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field7108 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field7108 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lhr;", line = 560)
    private static final class218 method1056(String arg0, String arg1, int arg2, int arg3) {
        String var4;
        if (arg3 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg3 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
        }
        if (arg2 < 126) {
            field1834 = null;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field1831, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class218(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Ldn;", line = 610)
    public final class548 method1057(Runnable arg0, int arg1, byte arg2) {
        return arg2 <= 100 ? null : this.method1050(arg1, 24002, 2, arg0, 0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ldn;", line = 620)
    public final class548 method1058(int arg0, Class arg1, String arg2) {
        return arg0 == 11946 ? this.method1050(0, 24002, 9, new Object[] { arg1, arg2 }, 0) : null;
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)Z", line = 632)
    public final boolean method1059(int arg0) {
        if (arg0 != 1) {
            this.method1043(null, -32, null, -27, -104, null);
        }
        if (!this.field1823) {
            return false;
        } else if (this.field1841) {
            return this.field1832 != null;
        } else {
            return this.field1820 != null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIII)Ldn;", line = 650)
    public final class548 method1060(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -3492) {
            this.method1045(null, (byte) 6, true);
        }
        return this.method1050((arg2 << 16) + arg1, 24002, 6, null, (arg0 << 16) + arg4);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 676)
    public final Object method1061(boolean arg0) {
        return arg0 ? this.field1826 : null;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(ILjava/lang/String;)Lhr;", line = 843)
    public static final class218 method1062(int arg0, String arg1) {
        return arg0 == -7585 ? method1056(field1836, arg1, 127, field1842) : null;
    }
}
