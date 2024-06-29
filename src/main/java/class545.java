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

@OriginalClass("client!tq")
public class class545 implements Runnable {

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Z")
    private boolean field7785 = false;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "Lwr;")
    public class393 field7781 = null;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Loc;")
    private class175 field7783 = null;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Lwr;")
    public class393 field7791 = null;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "Lwr;")
    public class393 field7803 = null;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "Z")
    public boolean field7804 = false;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "Loc;")
    private class175 field7800 = null;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "Z")
    public boolean field7802 = false;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7807;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "[Lwr;")
    public class393[] field7789;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "Ljava/lang/Object;")
    private Object field7793;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "Ljava/lang/Object;")
    private Object field7784;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Lam;")
    private class549 field7799;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Lmr;")
    private class125 field7796;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field7795;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field7782;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "J")
    private static volatile long field7805 = 0L;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    private static int field7794;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tq", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field7808;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tq", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field7809;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tq", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field7810;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tq", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field7811;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Ljava/lang/String;")
    private static String field7786;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7787;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7788;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "Ljava/lang/String;")
    private static String field7792;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "Ljava/lang/String;")
    public static String field7798;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "Ljava/lang/String;")
    private static String field7801;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "Ljava/lang/String;")
    public static String field7806;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7790;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7797;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[BLjava/io/File;)Z")
    public final boolean method3159(int arg0, byte[] arg1, File arg2) {
        try {
            if (arg0 < 89) {
                field7806 = null;
            }
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg1, 0, arg1.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)Lwr;")
    private static final class393 method3160(String arg0, int arg1, byte arg2, String arg3) {
        String var4;
        if (arg1 == 33) {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + "_rc.dat";
        } else if (arg1 == 34) {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg0 + "_preferences" + arg3 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field7786, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class393(new File(var7, var4), "rw", 10000L);
                } catch (Exception var10) {
                }
            }
        }
        int var9 = -17 / ((arg2 + 54) / 62);
        return null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZLjava/lang/String;)Loc;")
    public final class175 method3161(boolean arg0, boolean arg1, String arg2) {
        if (arg0) {
            return null;
        } else if (arg1) {
            return this.method3173(0, arg2, (byte) -74, 12, 0);
        } else {
            return this.method3173(0, arg2, (byte) -74, 13, 0);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/net/URL;B)Loc;")
    public final class175 method3162(URL arg0, byte arg1) {
        if (arg1 <= 74) {
            this.run();
        }
        return this.method3173(0, arg0, (byte) -74, 4, 0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;BI)Loc;")
    public final class175 method3163(int[] arg0, Point arg1, int arg2, Component arg3, byte arg4, int arg5) {
        if (arg4 > -60) {
            this.method3176((byte) -11);
        }
        return this.method3173(arg5, new Object[] { arg3, arg0, arg1 }, (byte) -74, 17, arg2);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Loc;")
    public final class175 method3164(byte arg0) {
        if (arg0 != 104) {
            field7787 = null;
        }
        return this.method3173(0, null, (byte) -74, 5, 0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)Z")
    public final boolean method3165(boolean arg0) {
        if (!this.field7804) {
            return false;
        } else if (!arg0) {
            return true;
        } else if (this.field7802) {
            return this.field7799 != null;
        } else {
            return this.field7784 != null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Loc;")
    public final class175 method3166(String arg0, Class arg1, int arg2, Class[] arg3) {
        return arg2 == 0 ? this.method3173(0, new Object[] { arg1, arg0, arg3 }, (byte) -74, 8, 0) : null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;)Loc;")
    public final class175 method3167(int arg0, String arg1) {
        if (arg0 != 22846) {
            method3160(null, 26, (byte) 27, null);
        }
        return this.method3173(0, arg1, (byte) -74, 16, 0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIII)Loc;")
    public final class175 method3168(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 23) {
            this.field7804 = true;
        }
        return this.method3173((arg4 << 16) + arg1, null, (byte) -74, 6, (arg2 << 16) + arg3);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)Loc;")
    public final class175 method3169(int arg0, byte arg1) {
        if (arg1 <= 119) {
            this.field7793 = null;
        }
        return this.method3173(0, null, (byte) -74, 3, arg0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Loc;")
    public final class175 method3170(String arg0, boolean arg1, Class arg2) {
        if (arg1) {
            field7788 = null;
        }
        return this.method3173(0, new Object[] { arg2, arg0 }, (byte) -74, 9, 0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZILjava/lang/String;)Loc;")
    public final class175 method3171(int arg0, boolean arg1, int arg2, String arg3) {
        return arg2 > -103 ? null : this.method3173(0, arg3, (byte) -74, arg1 ? 22 : 1, arg0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public final void method3172(int arg0) {
        synchronized (this) {
            this.field7785 = true;
            this.notifyAll();
        }
        try {
            if (arg0 <= 123) {
                return;
            }
            this.field7782.join();
        } catch (InterruptedException var8) {
        }
        if (this.field7791 != null) {
            try {
                this.field7791.method2528((byte) 95);
            } catch (IOException var7) {
            }
        }
        if (this.field7803 != null) {
            try {
                this.field7803.method2528((byte) 99);
            } catch (IOException var6) {
            }
        }
        if (this.field7789 != null) {
            for (int var3 = 0; var3 < this.field7789.length; var3++) {
                if (this.field7789[var3] != null) {
                    try {
                        this.field7789[var3].method2528((byte) 111);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field7781 != null) {
            try {
                this.field7781.method2528((byte) 102);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/Object;BII)Loc;")
    private final class175 method3173(int arg0, Object arg1, byte arg2, int arg3, int arg4) {
        class175 var6 = new class175();
        var6.field2143 = arg3;
        if (arg2 != -74) {
            this.method3176((byte) 34);
        }
        var6.field2142 = arg0;
        var6.field2139 = arg1;
        var6.field2141 = arg4;
        synchronized (this) {
            if (this.field7800 == null) {
                this.field7800 = this.field7783 = var6;
            } else {
                this.field7800.field2137 = var6;
                this.field7800 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!tq", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class175 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7785) {
                        return;
                    }
                    if (this.field7783 != null) {
                        var2 = this.field7783;
                        this.field7783 = this.field7783.field2137;
                        if (this.field7783 == null) {
                            this.field7800 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var28) {
                    }
                }
            }
            try {
                int var3 = var2.field2143;
                if (var3 == 1) {
                    if (class84.method550((byte) -90) < field7805) {
                        throw new IOException();
                    }
                    var2.field2140 = new Socket(InetAddress.getByName((String) var2.field2139), var2.field2141);
                } else if (var3 == 22) {
                    if (field7805 > class84.method550((byte) -95)) {
                        throw new IOException();
                    }
                    var2.field2140 = class560.method3241((String) var2.field2139, var2.field2141, -117).method893((byte) -68);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2139);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2141);
                    var2.field2140 = var4;
                } else if (var3 == 4) {
                    if (class84.method550((byte) -82) < field7805) {
                        throw new IOException();
                    }
                    var2.field2140 = new DataInputStream(((URL) var2.field2139).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field2139;
                    if (this.field7804 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2140 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var21 = (Object[]) var2.field2139;
                    if (this.field7804 && ((Class) var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field2140 = ((Class) var21[0]).getDeclaredField((String) var21[1]);
                } else if (var3 == 18) {
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2140 = var5.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field2139;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field7804) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class84.method550((byte) -101) < field7805) {
                        throw new IOException();
                    }
                    String var18 = (var2.field2141 >> 24 & 0xFF) + "." + ((var2.field2141 & 0xFF4328) >> 16) + "." + (var2.field2141 >> 8 & 0xFF) + "." + (var2.field2141 & 0xFF);
                    var2.field2140 = InetAddress.getByName(var18).getHostName();
                } else if (var3 == 21) {
                    if (class84.method550((byte) -114) < field7805) {
                        throw new IOException();
                    }
                    var2.field2140 = InetAddress.getByName((String) var2.field2139).getAddress();
                } else if (var3 == 5) {
                    if (this.field7802) {
                        var2.field2140 = this.field7799.method3189(0);
                    } else {
                        var2.field2140 = Class.forName("in").getMethod("listmodes").invoke(this.field7784);
                    }
                } else if (var3 == 6) {
                    Frame var17 = new Frame("Jagex Full Screen");
                    var2.field2140 = var17;
                    var17.setResizable(false);
                    if (this.field7802) {
                        this.field7799.method3188(var2.field2142 >> 16, var2.field2141 >>> 16, var2.field2141 & 0xFFFF, var2.field2142 & 0xFFFF, 2957, var17);
                    } else {
                        Class.forName("in").getMethod("enter", field7811 == null ? (field7811 = method3178("java.awt.Frame")) : field7811, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field7784, var17, Integer.valueOf(var2.field2141 >>> 16), new Integer(var2.field2141 & 0xFFFF), Integer.valueOf(var2.field2142 >> 16), new Integer(var2.field2142 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field7802) {
                        this.field7799.method3190(-5473, (Frame) var2.field2139);
                    } else {
                        Class.forName("in").getMethod("exit").invoke(this.field7784);
                    }
                } else if (var3 == 12) {
                    class393 var6 = method3160(field7792, field7794, (byte) -119, (String) var2.field2139);
                    var2.field2140 = var6;
                } else if (var3 == 13) {
                    class393 var7 = method3160("", field7794, (byte) 45, (String) var2.field2139);
                    var2.field2140 = var7;
                } else if (this.field7804 && var3 == 14) {
                    int var15 = var2.field2141;
                    int var16 = var2.field2142;
                    if (this.field7802) {
                        this.field7796.method770(var15, 13212, var16);
                    } else {
                        Class.forName("oi").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field7795, Integer.valueOf(var15), new Integer(var16));
                    }
                } else if (this.field7804 && var3 == 15) {
                    boolean var13 = var2.field2141 != 0;
                    Component var14 = (Component) var2.field2139;
                    if (this.field7802) {
                        this.field7796.method771((byte) -11, var14, var13);
                    } else {
                        Class.forName("oi").getDeclaredMethod("showcursor", field7808 == null ? (field7808 = method3178("java.awt.Component")) : field7808, Boolean.TYPE).invoke(this.field7795, var14, Boolean.valueOf(var13));
                    }
                } else if (!this.field7802 && var3 == 17) {
                    Object[] var12 = (Object[]) var2.field2139;
                    Class.forName("oi").getDeclaredMethod("setcustomcursor", field7808 == null ? (field7808 = method3178("java.awt.Component")) : field7808, field7809 == null ? (field7809 = method3178("[I")) : field7809, Integer.TYPE, Integer.TYPE, field7810 == null ? (field7810 = method3178("java.awt.Point")) : field7810).invoke(this.field7795, (Component) var12[0], (int[]) var12[1], Integer.valueOf(var2.field2141), new Integer(var2.field2142), (Point) var12[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field7788.startsWith("win")) {
                            throw new Exception();
                        }
                        String var8 = (String) var2.field2139;
                        if (!var8.startsWith("http://") && !var8.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var9 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var8.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var8 + "\"");
                                var2.field2140 = null;
                                break;
                            }
                            if (var9.indexOf(var8.charAt(var10)) == -1) {
                                throw new Exception();
                            }
                            var10++;
                        }
                    } catch (Exception var29) {
                        var2.field2140 = var29;
                        throw var29;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field2138 = 1;
            } catch (ThreadDeath var30) {
                throw var30;
            } catch (Throwable var31) {
                var2.field2138 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLjava/awt/Frame;)Loc;")
    public final class175 method3174(boolean arg0, Frame arg1) {
        return arg0 ? null : this.method3173(0, arg1, (byte) -74, 7, 0);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3175(byte arg0) {
        if (arg0 != 21) {
            field7790 = null;
        }
        return this.field7793;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)V")
    public final void method3176(byte arg0) {
        if (arg0 != 109) {
            this.method3159(-73, null, null);
        }
        field7805 = class84.method550((byte) -114) + 5000L;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILjava/lang/Runnable;)Loc;")
    public final class175 method3177(int arg0, int arg1, Runnable arg2) {
        int var4 = 89 / ((-arg1 - 70) / 56);
        return this.method3173(0, arg2, (byte) -74, 2, arg0);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class545(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field7792 = arg1;
        field7798 = "Unknown";
        this.field7804 = arg3;
        field7787 = "1.1";
        field7794 = arg0;
        try {
            field7798 = System.getProperty("java.vendor");
            field7787 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field7798.toLowerCase().indexOf("microsoft") != -1) {
            this.field7802 = true;
        }
        try {
            field7801 = System.getProperty("os.name");
        } catch (Exception var19) {
            field7801 = "Unknown";
        }
        field7788 = field7801.toLowerCase();
        try {
            field7806 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field7806 = "";
        }
        try {
            System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
        }
        try {
            field7786 = System.getProperty("user.home");
            if (field7786 != null) {
                field7786 = field7786 + "/";
            }
        } catch (Exception var16) {
        }
        if (field7786 == null) {
            field7786 = "~/";
        }
        try {
            this.field7807 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field7802) {
            try {
                field7797 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field7790 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class370.method2387(field7794, -11175, field7792);
        if (this.field7804) {
            this.field7781 = new class393(class370.method2385("random.dat", null, field7794, -98), "rw", 25L);
            this.field7791 = new class393(class370.method2386("main_file_cache.dat2", 88), "rw", 209715200L);
            this.field7803 = new class393(class370.method2386("main_file_cache.idx255", -105), "rw", 1048576L);
            this.field7789 = new class393[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field7789[var5] = new class393(class370.method2386("main_file_cache.idx" + var5, -103), "rw", 1048576L);
            }
            if (this.field7802) {
                try {
                    this.field7793 = Class.forName("jc").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field7802) {
                    this.field7799 = new class549();
                } else {
                    this.field7784 = Class.forName("in").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field7802) {
                    this.field7796 = new class125();
                } else {
                    this.field7795 = Class.forName("oi").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field7804 && !this.field7802) {
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
        this.field7785 = false;
        this.field7782 = new Thread(this);
        this.field7782.setPriority(10);
        this.field7782.setDaemon(true);
        this.field7782.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3178(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
