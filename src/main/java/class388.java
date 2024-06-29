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

@OriginalClass("client!gba")
public class class388 implements Runnable {

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "Z")
    private boolean field5172 = false;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "Lrg;")
    public class611 field5183 = null;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "Lrg;")
    public class611 field5181 = null;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Lba;")
    private class661 field5186 = null;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "Z")
    public boolean field5176 = false;

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "Z")
    public boolean field5192 = false;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "Lba;")
    private class661 field5179 = null;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "Lrg;")
    public class611 field5195 = null;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5178;

    @OriginalMember(owner = "client!gba", name = "B", descriptor = "[Lrg;")
    public class611[] field5198;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "Ljava/lang/Object;")
    private Object field5188;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "Lwb;")
    private class178 field5189;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "Ljava/lang/Object;")
    private Object field5171;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "Ljava/lang/Object;")
    private Object field5193;

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "Loda;")
    private class607 field5194;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field5185;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "J")
    private static volatile long field5175 = 0L;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    private static int field5187;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gba", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field5199;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gba", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field5200;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gba", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field5201;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gba", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field5202;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5174;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5177;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5180;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "Ljava/lang/String;")
    private static String field5182;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5184;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "Ljava/lang/String;")
    private static String field5190;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "Ljava/lang/String;")
    private static String field5191;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5196;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5173;

    @OriginalMember(owner = "client!gba", name = "A", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5197;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lba;")
    public final class661 method2220(Runnable arg0, int arg1, byte arg2) {
        if (arg2 <= 56) {
            this.method2228(null, true, 77, null, -27, null);
        }
        return this.method2234(arg0, 0, 2, 0, arg1);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lrg;")
    private static final class611 method2221(int arg0, int arg1, String arg2, String arg3) {
        String var4;
        if (arg1 == 33) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_rc.dat";
        } else if (arg1 == 34) {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg3 + "_preferences" + arg2 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field5191, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class611(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
        }
        if (arg0 == 25) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lba;")
    public final class661 method2222(int arg0, String arg1, Class arg2) {
        int var4 = 7 % ((-arg0 - 35) / 56);
        return this.method2234(new Object[] { arg2, arg1 }, 0, 9, 0, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public final void method2223(int arg0) {
        synchronized (this) {
            this.field5172 = true;
            this.notifyAll();
        }
        try {
            this.field5185.join();
            if (arg0 > -67) {
                this.method2229(null, null, 66, null);
            }
        } catch (InterruptedException var8) {
        }
        if (this.field5195 != null) {
            try {
                this.field5195.method3390(0);
            } catch (IOException var7) {
            }
        }
        if (this.field5183 != null) {
            try {
                this.field5183.method3390(0);
            } catch (IOException var6) {
            }
        }
        if (this.field5198 != null) {
            for (int var3 = 0; var3 < this.field5198.length; var3++) {
                if (this.field5198[var3] != null) {
                    try {
                        this.field5198[var3].method3390(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5181 != null) {
            try {
                this.field5181.method3390(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Frame;I)Lba;")
    public final class661 method2224(Frame arg0, int arg1) {
        return arg1 > -56 ? null : this.method2234(arg0, 0, 7, 0, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;B)Lba;")
    public final class661 method2225(String arg0, byte arg1) {
        if (arg1 < 64) {
            this.method2222(12, null, null);
        }
        return this.method2234(arg0, 0, 16, 0, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)Lba;")
    public final class661 method2226(int arg0, boolean arg1) {
        if (!arg1) {
            this.method2226(111, false);
        }
        return this.method2234(null, 0, 3, 0, arg0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Z")
    public final boolean method2227(byte arg0) {
        if (arg0 > -99) {
            this.method2236(null, (byte) 47, false);
        }
        if (!this.field5176) {
            return false;
        } else if (this.field5192) {
            return this.field5189 != null;
        } else {
            return this.field5171 != null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Point;ZILjava/awt/Component;I[I)Lba;")
    public final class661 method2228(Point arg0, boolean arg1, int arg2, Component arg3, int arg4, int[] arg5) {
        return arg1 ? this.method2234(new Object[] { arg3, arg5, arg0 }, arg2, 17, 0, arg4) : null;
    }

    @OriginalMember(owner = "client!gba", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class661 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5172) {
                        return;
                    }
                    if (this.field5179 != null) {
                        var2 = this.field5179;
                        this.field5179 = this.field5179.field9422;
                        if (this.field5179 == null) {
                            this.field5186 = null;
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
                int var3 = var2.field9425;
                if (var3 == 1) {
                    if (class529.method2982((byte) -69) < field5175) {
                        throw new IOException();
                    }
                    var2.field9421 = new Socket(InetAddress.getByName((String) var2.field9423), var2.field9424);
                } else if (var3 == 22) {
                    if (field5175 > class529.method2982((byte) -69)) {
                        throw new IOException();
                    }
                    try {
                        var2.field9421 = class249.method1509((String) var2.field9423, -37, var2.field9424).method1662(-1);
                    } catch (class663 var29) {
                        var2.field9421 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field9423);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field9424);
                    var2.field9421 = var4;
                } else if (var3 == 4) {
                    if (class529.method2982((byte) -69) < field5175) {
                        throw new IOException();
                    }
                    var2.field9421 = new DataInputStream(((URL) var2.field9423).openStream());
                } else if (var3 == 8) {
                    Object[] var22 = (Object[]) var2.field9423;
                    if (this.field5176 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field9421 = ((Class) var22[0]).getDeclaredMethod((String) var22[1], (Class[]) var22[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field9423;
                    if (this.field5176 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field9421 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field9421 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var19 = (Transferable) var2.field9423;
                    Clipboard var20 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var20.setContents(var19, null);
                } else if (!this.field5176) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field5175 > class529.method2982((byte) -69)) {
                        throw new IOException();
                    }
                    String var18 = (var2.field9424 >> 24 & 0xFF) + "." + (var2.field9424 >> 16 & 0xFF) + "." + (var2.field9424 >> 8 & 0xFF) + "." + (var2.field9424 & 0xFF);
                    var2.field9421 = InetAddress.getByName(var18).getHostName();
                } else if (var3 == 21) {
                    if (field5175 > class529.method2982((byte) -69)) {
                        throw new IOException();
                    }
                    var2.field9421 = InetAddress.getByName((String) var2.field9423).getAddress();
                } else if (var3 == 5) {
                    if (this.field5192) {
                        var2.field9421 = this.field5189.method1202(true);
                    } else {
                        var2.field9421 = Class.forName("g").getMethod("listmodes").invoke(this.field5171);
                    }
                } else if (var3 == 6) {
                    Frame var6 = new Frame("Jagex Full Screen");
                    var2.field9421 = var6;
                    var6.setResizable(false);
                    if (this.field5192) {
                        this.field5189.method1201((byte) -82, var2.field9419 & 0xFFFF, var2.field9419 >> 16, var2.field9424 & 0xFFFF, var6, var2.field9424 >>> 16);
                    } else {
                        Class.forName("g").getMethod("enter", field5199 == null ? (field5199 = method2240("java.awt.Frame")) : field5199, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field5171, var6, Integer.valueOf(var2.field9424 >>> 16), new Integer(var2.field9424 & 0xFFFF), Integer.valueOf(var2.field9419 >> 16), new Integer(var2.field9419 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field5192) {
                        this.field5189.method1203(5654, (Frame) var2.field9423);
                    } else {
                        Class.forName("g").getMethod("exit").invoke(this.field5171);
                    }
                } else if (var3 == 12) {
                    class611 var17 = method2221(25, field5187, (String) var2.field9423, field5190);
                    var2.field9421 = var17;
                } else if (var3 == 13) {
                    class611 var7 = method2221(25, field5187, (String) var2.field9423, "");
                    var2.field9421 = var7;
                } else if (this.field5176 && var3 == 14) {
                    int var8 = var2.field9424;
                    int var9 = var2.field9419;
                    if (this.field5192) {
                        this.field5194.method3373(var8, (byte) 8, var9);
                    } else {
                        Class.forName("wk").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field5193, Integer.valueOf(var8), new Integer(var9));
                    }
                } else if (this.field5176 && var3 == 15) {
                    boolean var10 = var2.field9424 != 0;
                    Component var11 = (Component) var2.field9423;
                    if (this.field5192) {
                        this.field5194.method3372(var10, var11, (byte) 71);
                    } else {
                        Class.forName("wk").getDeclaredMethod("showcursor", field5200 == null ? (field5200 = method2240("java.awt.Component")) : field5200, Boolean.TYPE).invoke(this.field5193, var11, Boolean.valueOf(var10));
                    }
                } else if (!this.field5192 && var3 == 17) {
                    Object[] var12 = (Object[]) var2.field9423;
                    Class.forName("wk").getDeclaredMethod("setcustomcursor", field5200 == null ? (field5200 = method2240("java.awt.Component")) : field5200, field5201 == null ? (field5201 = method2240("[I")) : field5201, Integer.TYPE, Integer.TYPE, field5202 == null ? (field5202 = method2240("java.awt.Point")) : field5202).invoke(this.field5193, (Component) var12[0], (int[]) var12[1], Integer.valueOf(var2.field9424), new Integer(var2.field9419), (Point) var12[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field5196.startsWith("win")) {
                            throw new Exception();
                        }
                        String var13 = (String) var2.field9423;
                        if (!var13.startsWith("http://") && !var13.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var15 = 0;
                        while (true) {
                            if (var13.length() <= var15) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                                var2.field9421 = null;
                                break;
                            }
                            if (var14.indexOf(var13.charAt(var15)) == -1) {
                                throw new Exception();
                            }
                            var15++;
                        }
                    } catch (Exception var31) {
                        var2.field9421 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field9420 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field9420 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lba;")
    public final class661 method2229(String arg0, Class arg1, int arg2, Class[] arg3) {
        if (arg2 != 29497) {
            this.method2222(-17, null, null);
        }
        return this.method2234(new Object[] { arg1, arg0, arg3 }, 0, 8, arg2 - 29497, 0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZLjava/net/URL;)Lba;")
    public final class661 method2230(boolean arg0, URL arg1) {
        return arg0 ? this.method2234(arg1, 0, 4, 0, 0) : null;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
    public final void method2231(int arg0) {
        field5175 = class529.method2982((byte) -69) + 5000L;
        int var2 = -112 % ((arg0 + 42) / 42);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)Lba;")
    public final class661 method2232(boolean arg0) {
        return arg0 ? null : this.method2234(null, 0, 5, 0, 0);
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2233(int arg0) {
        if (arg0 != -14) {
            field5190 = null;
        }
        return this.field5188;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lba;")
    private final class661 method2234(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class661 var6 = new class661();
        var6.field9423 = arg0;
        var6.field9424 = arg4;
        var6.field9419 = arg1;
        var6.field9425 = arg2;
        synchronized (this) {
            if (this.field5186 == null) {
                this.field5186 = this.field5179 = var6;
            } else {
                this.field5186.field9422 = var6;
                this.field5186 = var6;
            }
            this.notify();
        }
        if (arg3 != 0) {
            this.field5198 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZZILjava/lang/String;)Lba;")
    public final class661 method2235(boolean arg0, boolean arg1, int arg2, String arg3) {
        if (arg1) {
            this.method2231(108);
        }
        return this.method2234(arg3, 0, arg0 ? 22 : 1, 0, arg2);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;BZ)Lba;")
    public final class661 method2236(String arg0, byte arg1, boolean arg2) {
        if (arg1 != -106) {
            method2237(null, (byte) 77);
        }
        return arg2 ? this.method2234(arg0, 0, 12, arg1 ^ 0xFFFFFF96, 0) : this.method2234(arg0, 0, 13, arg1 + 106, 0);
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Ljava/lang/String;B)Lrg;")
    public static final class611 method2237(String arg0, byte arg1) {
        return arg1 <= 53 ? null : method2221(25, field5187, arg0, field5190);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
    public final boolean method2238(File arg0, int arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg2, arg1, arg2.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIII)Lba;")
    public final class661 method2239(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -915136816) {
            this.field5195 = null;
        }
        return this.method2234(null, (arg2 << 16) + arg3, 6, 0, (arg4 << 16) + arg1);
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class388(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field5174 = "1.1";
        this.field5176 = arg3;
        field5187 = arg0;
        field5190 = arg1;
        field5180 = "Unknown";
        try {
            field5180 = System.getProperty("java.vendor");
            field5174 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field5180.toLowerCase().indexOf("microsoft") != -1) {
            this.field5192 = true;
        }
        try {
            field5182 = System.getProperty("os.name");
        } catch (Exception var19) {
            field5182 = "Unknown";
        }
        field5196 = field5182.toLowerCase();
        try {
            field5177 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field5177 = "";
        }
        try {
            field5184 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field5184 = "";
        }
        try {
            field5191 = System.getProperty("user.home");
            if (field5191 != null) {
                field5191 = field5191 + "/";
            }
        } catch (Exception var16) {
        }
        if (field5191 == null) {
            field5191 = "~/";
        }
        try {
            this.field5178 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field5192) {
            try {
                field5197 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field5173 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class40.method221(field5190, true, field5187);
        if (this.field5176) {
            this.field5181 = new class611(class40.method222((byte) -126, field5187, null, "random.dat"), "rw", 25L);
            this.field5195 = new class611(class40.method223("main_file_cache.dat2", -65), "rw", 209715200L);
            this.field5183 = new class611(class40.method223("main_file_cache.idx255", 109), "rw", 1048576L);
            this.field5198 = new class611[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field5198[var5] = new class611(class40.method223("main_file_cache.idx" + var5, 123), "rw", 1048576L);
            }
            if (this.field5192) {
                try {
                    this.field5188 = Class.forName("gga").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field5192) {
                    this.field5189 = new class178();
                } else {
                    this.field5171 = Class.forName("g").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field5192) {
                    this.field5194 = new class607();
                } else {
                    this.field5193 = Class.forName("wk").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field5176 && !this.field5192) {
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
        this.field5172 = false;
        this.field5185 = new Thread(this);
        this.field5185.setPriority(10);
        this.field5185.setDaemon(true);
        this.field5185.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2240(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
