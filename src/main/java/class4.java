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

@OriginalClass("client!ft")
public class class4 implements Runnable {

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Lem;")
    public class203 field30 = null;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Lpga;")
    private class494 field32 = null;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "Lpga;")
    private class494 field29 = null;

    @OriginalMember(owner = "client!ft", name = "u", descriptor = "Lem;")
    public class203 field42 = null;

    @OriginalMember(owner = "client!ft", name = "w", descriptor = "Lem;")
    public class203 field44 = null;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "Z")
    private boolean field34 = false;

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "Z")
    public boolean field47 = false;

    @OriginalMember(owner = "client!ft", name = "B", descriptor = "Z")
    public boolean field49 = false;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field24;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "[Lem;")
    public class203[] field31;

    @OriginalMember(owner = "client!ft", name = "t", descriptor = "Ljava/lang/Object;")
    private Object field41;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Ldc;")
    private class5 field27;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "Ljava/lang/Object;")
    private Object field37;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Ljava/lang/Object;")
    private Object field26;

    @OriginalMember(owner = "client!ft", name = "y", descriptor = "Lql;")
    private class684 field46;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field23;

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "J")
    private static volatile long field39 = 0L;

    @OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
    private static int field43;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field50;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field51;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field52;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ft", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field53;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Ljava/lang/String;")
    public static String field22;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "Ljava/lang/String;")
    public static String field28;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "Ljava/lang/String;")
    public static String field33;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "Ljava/lang/String;")
    public static String field35;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "Ljava/lang/String;")
    private static String field36;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "Ljava/lang/String;")
    public static String field40;

    @OriginalMember(owner = "client!ft", name = "x", descriptor = "Ljava/lang/String;")
    private static String field45;

    @OriginalMember(owner = "client!ft", name = "A", descriptor = "Ljava/lang/String;")
    private static String field48;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field25;

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field38;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method32(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;B)Lem;", line = 4)
    public static final class203 method12(String arg0, byte arg1) {
        if (arg1 != -118) {
            field25 = null;
        }
        return method23(arg0, (byte) -43, field43, field45);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I)Lpga;", line = 20)
    public final class494 method13(String arg0, int arg1) {
        if (arg1 != 16) {
            this.field27 = null;
        }
        return this.method19(0, -53, 0, 16, arg0);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZLjava/lang/String;I)Lpga;", line = 30)
    public final class494 method14(boolean arg0, String arg1, int arg2) {
        int var4 = -35 % ((42 - arg2) / 41);
        return arg0 ? this.method19(0, 111, 0, 12, arg1) : this.method19(0, 81, 0, 13, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)Lpga;", line = 43)
    public final class494 method15(boolean arg0, int arg1) {
        return arg0 ? this.method19(arg1, 87, 0, 3, null) : null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIII)Lpga;", line = 57)
    public final class494 method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 601653552) {
            field36 = null;
        }
        return this.method19((arg0 << 16) + arg1, 110, (arg2 << 16) + arg4, 6, null);
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 695)
    public class4(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field28 = "Unknown";
        field45 = arg1;
        field43 = arg0;
        this.field49 = arg3;
        field35 = "1.1";
        try {
            field28 = System.getProperty("java.vendor");
            field35 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field28.toLowerCase().indexOf("microsoft") != -1) {
            this.field47 = true;
        }
        try {
            field36 = System.getProperty("os.name");
        } catch (Exception var19) {
            field36 = "Unknown";
        }
        field22 = field36.toLowerCase();
        try {
            field40 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field40 = "";
        }
        try {
            field33 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field33 = "";
        }
        try {
            field48 = System.getProperty("user.home");
            if (field48 != null) {
                field48 = field48 + "/";
            }
        } catch (Exception var16) {
        }
        if (field48 == null) {
            field48 = "~/";
        }
        try {
            this.field24 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field47) {
            try {
                field25 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field38 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class154.method1078(field43, field45, -1);
        if (this.field49) {
            this.field42 = new class203(class154.method1076(null, field43, false, "random.dat"), "rw", 25L);
            this.field30 = new class203(class154.method1077(false, "main_file_cache.dat2"), "rw", 209715200L);
            this.field44 = new class203(class154.method1077(false, "main_file_cache.idx255"), "rw", 1048576L);
            this.field31 = new class203[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field31[var5] = new class203(class154.method1077(false, "main_file_cache.idx" + var5), "rw", 1048576L);
            }
            if (this.field47) {
                try {
                    this.field41 = Class.forName("pp").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field47) {
                    this.field27 = new class5();
                } else {
                    this.field37 = Class.forName("pfa").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field47) {
                    this.field46 = new class684();
                } else {
                    this.field26 = Class.forName("vn").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field49 && !this.field47) {
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
        this.field34 = false;
        this.field23 = new Thread(this);
        this.field23.setPriority(10);
        this.field23.setDaemon(true);
        this.field23.start();
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 73)
    public final void method17(int arg0) {
        synchronized (this) {
            this.field34 = true;
            this.notifyAll();
        }
        try {
            this.field23.join();
            if (arg0 < 20) {
                field45 = null;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field30 != null) {
            try {
                this.field30.method1344((byte) 124);
            } catch (IOException var7) {
            }
        }
        if (this.field44 != null) {
            try {
                this.field44.method1344((byte) 127);
            } catch (IOException var6) {
            }
        }
        if (this.field31 != null) {
            for (int var3 = 0; var3 < this.field31.length; var3++) {
                if (this.field31[var3] != null) {
                    try {
                        this.field31[var3].method1344((byte) 124);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field42 != null) {
            try {
                this.field42.method1344((byte) 124);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/net/URL;)Lpga;", line = 138)
    public final class494 method18(int arg0, URL arg1) {
        return arg0 > -21 ? null : this.method19(0, 118, 0, 4, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIILjava/lang/Object;)Lpga;", line = 159)
    private final class494 method19(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        class494 var6 = new class494();
        int var7 = 55 / ((arg1 - 17) / 45);
        var6.field7025 = arg2;
        var6.field7023 = arg4;
        var6.field7022 = arg0;
        var6.field7020 = arg3;
        synchronized (this) {
            if (this.field29 == null) {
                this.field29 = this.field32 = var6;
            } else {
                this.field29.field7021 = var6;
                this.field29 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ft", name = "run", descriptor = "()V", line = 196)
    public final void run() {
        while (true) {
            class494 var2;
            synchronized (this) {
                while (true) {
                    if (this.field34) {
                        return;
                    }
                    if (this.field32 != null) {
                        var2 = this.field32;
                        this.field32 = this.field32.field7021;
                        if (this.field32 == null) {
                            this.field29 = null;
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
                int var3 = var2.field7020;
                if (var3 == 1) {
                    if (field39 > class490.method2840(true)) {
                        throw new IOException();
                    }
                    var2.field7019 = new Socket(InetAddress.getByName((String) var2.field7023), var2.field7022);
                } else if (var3 == 22) {
                    if (class490.method2840(true) < field39) {
                        throw new IOException();
                    }
                    try {
                        var2.field7019 = class298.method1922((String) var2.field7023, var2.field7022, (byte) -51).method688((byte) -81);
                    } catch (class75 var29) {
                        var2.field7019 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field7023);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field7022);
                    var2.field7019 = var4;
                } else if (var3 == 4) {
                    if (class490.method2840(true) < field39) {
                        throw new IOException();
                    }
                    var2.field7019 = new DataInputStream(((URL) var2.field7023).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field7023;
                    if (this.field49 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7019 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field7023;
                    if (this.field49 && ((Class) var6[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field7019 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field7019 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var21 = (Transferable) var2.field7023;
                    Clipboard var22 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var22.setContents(var21, null);
                } else if (!this.field49) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class490.method2840(true) < field39) {
                        throw new IOException();
                    }
                    String var20 = (var2.field7022 >> 24 & 0xFF) + "." + ((var2.field7022 & 0xFF4322) >> 16) + "." + ((var2.field7022 & 0xFF3A) >> 8) + "." + (var2.field7022 & 0xFF);
                    var2.field7019 = InetAddress.getByName(var20).getHostName();
                } else if (var3 == 21) {
                    if (field39 > class490.method2840(true)) {
                        throw new IOException();
                    }
                    var2.field7019 = InetAddress.getByName((String) var2.field7023).getAddress();
                } else if (var3 == 5) {
                    if (this.field47) {
                        var2.field7019 = this.field27.method34(0);
                    } else {
                        var2.field7019 = Class.forName("pfa").getMethod("listmodes").invoke(this.field37);
                    }
                } else if (var3 == 6) {
                    Frame var19 = new Frame("Jagex Full Screen");
                    var2.field7019 = var19;
                    var19.setResizable(false);
                    if (this.field47) {
                        this.field27.method35(var19, var2.field7022 >>> 16, (byte) -118, var2.field7022 & 0xFFFF, var2.field7025 & 0xFFFF, var2.field7025 >> 16);
                    } else {
                        Class.forName("pfa").getMethod("enter", field53 == null ? (field53 = method32("java.awt.Frame")) : field53, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field37, var19, Integer.valueOf(var2.field7022 >>> 16), new Integer(var2.field7022 & 0xFFFF), Integer.valueOf(var2.field7025 >> 16), new Integer(var2.field7025 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field47) {
                        this.field27.method33((Frame) var2.field7023, 0);
                    } else {
                        Class.forName("pfa").getMethod("exit").invoke(this.field37);
                    }
                } else if (var3 == 12) {
                    class203 var8 = method23((String) var2.field7023, (byte) -43, field43, field45);
                    var2.field7019 = var8;
                } else if (var3 == 13) {
                    class203 var18 = method23((String) var2.field7023, (byte) -43, field43, "");
                    var2.field7019 = var18;
                } else if (this.field49 && var3 == 14) {
                    int var9 = var2.field7022;
                    int var10 = var2.field7025;
                    if (this.field47) {
                        this.field46.method3780(var9, var10, (byte) 115);
                    } else {
                        Class.forName("vn").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field26, Integer.valueOf(var9), new Integer(var10));
                    }
                } else if (this.field49 && var3 == 15) {
                    boolean var16 = var2.field7022 != 0;
                    Component var17 = (Component) var2.field7023;
                    if (this.field47) {
                        this.field46.method3781(var16, (byte) 104, var17);
                    } else {
                        Class.forName("vn").getDeclaredMethod("showcursor", field50 == null ? (field50 = method32("java.awt.Component")) : field50, Boolean.TYPE).invoke(this.field26, var17, Boolean.valueOf(var16));
                    }
                } else if (!this.field47 && var3 == 17) {
                    Object[] var11 = (Object[]) var2.field7023;
                    Class.forName("vn").getDeclaredMethod("setcustomcursor", field50 == null ? (field50 = method32("java.awt.Component")) : field50, field51 == null ? (field51 = method32("[I")) : field51, Integer.TYPE, Integer.TYPE, field52 == null ? (field52 = method32("java.awt.Point")) : field52).invoke(this.field26, (Component) var11[0], (int[]) var11[1], Integer.valueOf(var2.field7022), new Integer(var2.field7025), (Point) var11[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field22.startsWith("win")) {
                            throw new Exception();
                        }
                        String var12 = (String) var2.field7023;
                        if (!var12.startsWith("http://") && !var12.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        for (int var14 = 0; var14 < var12.length(); var14++) {
                            if (var13.indexOf(var12.charAt(var14)) == -1) {
                                throw new Exception();
                            }
                        }
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                        var2.field7019 = null;
                    } catch (Exception var31) {
                        var2.field7019 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field7024 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field7024 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;IZ)Lpga;", line = 490)
    public final class494 method20(int arg0, String arg1, int arg2, boolean arg3) {
        if (arg0 != 0) {
            this.method24((byte) -75);
        }
        return this.method19(arg2, -31, 0, arg3 ? 22 : 1, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([BBLjava/io/File;)Z", line = 504)
    public final boolean method21(byte[] arg0, byte arg1, File arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg2);
            var4.write(arg0, 0, arg0.length);
            int var5 = 106 % ((arg1 + 58) / 47);
            var4.close();
            return true;
        } catch (IOException var6) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lpga;", line = 527)
    public final class494 method22(Runnable arg0, int arg1, byte arg2) {
        return arg2 >= -117 ? null : this.method19(arg1, 79, 0, 2, arg0);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)Lem;", line = 538)
    private static final class203 method23(String arg0, byte arg1, int arg2, String arg3) {
        String var4;
        if (arg2 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg0 + "_rc.dat";
        } else if (arg2 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg0 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg0 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field48, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        if (arg1 != -43) {
            method12(null, (byte) -128);
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class203(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Z", line = 581)
    public final boolean method24(byte arg0) {
        if (!this.field49) {
            return false;
        }
        int var2 = 99 % ((33 - arg0) / 46);
        if (this.field47) {
            return this.field27 != null;
        } else {
            return this.field37 != null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 598)
    public final Object method25(int arg0) {
        if (arg0 != 0) {
            this.method20(-103, null, -28, false);
        }
        return this.field41;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I[Ljava/lang/Class;Ljava/lang/Class;)Lpga;", line = 611)
    public final class494 method26(String arg0, int arg1, Class[] arg2, Class arg3) {
        int var5 = -28 % ((-arg1 - 76) / 36);
        return this.method19(0, -62, 0, 8, new Object[] { arg3, arg0, arg2 });
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lpga;", line = 623)
    public final class494 method27(String arg0, int arg1, Class arg2) {
        if (arg1 > -75) {
            field43 = -82;
        }
        return this.method19(0, 120, 0, 9, new Object[] { arg2, arg0 });
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/awt/Point;IILjava/awt/Component;[II)Lpga;", line = 634)
    public final class494 method28(Point arg0, int arg1, int arg2, Component arg3, int[] arg4, int arg5) {
        if (arg2 != 17) {
            field45 = null;
        }
        return this.method19(arg5, arg2 ^ 0x65, arg1, 17, new Object[] { arg3, arg4, arg0 });
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)Lpga;", line = 649)
    public final class494 method29(byte arg0) {
        int var2 = -1 / ((47 - arg0) / 47);
        return this.method19(0, -128, 0, 5, null);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/awt/Frame;)Lpga;", line = 662)
    public final class494 method30(int arg0, Frame arg1) {
        if (arg0 != 8192) {
            this.method29((byte) 107);
        }
        return this.method19(0, arg0 ^ 0xFFFFDFA2, 0, 7, arg1);
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)V", line = 677)
    public final void method31(byte arg0) {
        field39 = class490.method2840(true) + 5000L;
        int var2 = -119 / ((arg0 + 10) / 55);
    }
}
