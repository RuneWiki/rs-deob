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

@OriginalClass("client!rj")
public class class648 implements Runnable {

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Z")
    public boolean field9138 = false;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Lcu;")
    public class479 field9150 = null;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lcu;")
    public class479 field9134 = null;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Z")
    public boolean field9151 = false;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lvfa;")
    private class264 field9153 = null;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Lcu;")
    public class479 field9141 = null;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Z")
    private boolean field9144 = false;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Lvfa;")
    private class264 field9160 = null;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field9152;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[Lcu;")
    public class479[] field9155;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/Object;")
    private Object field9139;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Ljava/lang/Object;")
    private Object field9148;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Lhca;")
    private class189 field9149;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Ljava/lang/Object;")
    private Object field9147;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Lib;")
    private class14 field9158;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field9154;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "J")
    private static volatile long field9142 = 0L;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    private static int field9159;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field9162;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rj", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field9163;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rj", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field9164;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field9165;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field9135;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9136;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field9137;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Ljava/lang/String;")
    private static String field9140;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field9143;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Ljava/lang/String;")
    private static String field9146;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Ljava/lang/String;")
    private static String field9156;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Ljava/lang/String;")
    public static String field9157;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field9145;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field9161;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/net/URL;I)Lvfa;")
    public final class264 method3624(URL arg0, int arg1) {
        if (arg1 != 4851) {
            this.field9154 = null;
        }
        return this.method3633(arg0, 0, -32698, 4, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/io/File;[B)Z")
    public final boolean method3625(int arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            if (arg0 <= 45) {
                this.field9150 = null;
            }
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lvfa;")
    public final class264 method3626(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 0) {
            field9159 = 109;
        }
        return this.method3633(arg1, arg0, -32698, 2, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public final void method3627(int arg0) {
        field9142 = class571.method3150(124) + (long) arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Lvfa;")
    public final class264 method3628(int arg0, byte arg1) {
        return arg1 == 116 ? this.method3633(null, arg0, arg1 - 32814, 3, 0) : null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)Lcu;")
    private static final class479 method3629(int arg0, String arg1, String arg2, byte arg3) {
        String var4;
        if (arg0 == 33) {
            var4 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
        } else if (arg0 == 34) {
            var4 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
        } else {
            var4 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", field9146, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
        int var6 = 0;
        if (arg3 != 35) {
            method3629(-3, null, null, (byte) 55);
        }
        while (var6 < var5.length) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class479(new File(var7, var4), "rw", 10000L);
                } catch (Exception var9) {
                }
            }
            var6++;
        }
        return null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Lvfa;")
    public final class264 method3630(byte arg0) {
        if (arg0 >= -2) {
            this.field9154 = null;
        }
        return this.method3633(null, 0, -32698, 5, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;B)Lcu;")
    public static final class479 method3631(String arg0, byte arg1) {
        if (arg1 != -101) {
            field9142 = 113L;
        }
        return method3629(field9159, arg0, field9140, (byte) 35);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)Lvfa;")
    public final class264 method3632(int arg0, String arg1) {
        return arg0 == 0 ? this.method3633(arg1, 0, -32698, 16, 0) : null;
    }

    @OriginalMember(owner = "client!rj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class264 var2;
            synchronized (this) {
                while (true) {
                    if (this.field9144) {
                        return;
                    }
                    if (this.field9153 != null) {
                        var2 = this.field9153;
                        this.field9153 = this.field9153.field3353;
                        if (this.field9153 == null) {
                            this.field9160 = null;
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
                int var3 = var2.field3355;
                if (var3 == 1) {
                    if (field9142 > class571.method3150(101)) {
                        throw new IOException();
                    }
                    var2.field3356 = new Socket(InetAddress.getByName((String) var2.field3357), var2.field3354);
                } else if (var3 == 22) {
                    if (field9142 > class571.method3150(107)) {
                        throw new IOException();
                    }
                    try {
                        var2.field3356 = class685.method3854(var2.field3354, 101, (String) var2.field3357).method1909(-123);
                    } catch (class406 var29) {
                        var2.field3356 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var22 = new Thread((Runnable) var2.field3357);
                    var22.setDaemon(true);
                    var22.start();
                    var22.setPriority(var2.field3354);
                    var2.field3356 = var22;
                } else if (var3 == 4) {
                    if (field9142 > class571.method3150(102)) {
                        throw new IOException();
                    }
                    var2.field3356 = new DataInputStream(((URL) var2.field3357).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3357;
                    if (this.field9151 && ((Class) var4[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3356 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3357;
                    if (this.field9151 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3356 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3356 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field3357;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else if (!this.field9151) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (class571.method3150(96) < field9142) {
                        throw new IOException();
                    }
                    String var9 = (var2.field3354 >> 24 & 0xFF) + "." + (var2.field3354 >> 16 & 0xFF) + "." + ((var2.field3354 & 0xFFA8) >> 8) + "." + (var2.field3354 & 0xFF);
                    var2.field3356 = InetAddress.getByName(var9).getHostName();
                } else if (var3 == 21) {
                    if (field9142 > class571.method3150(97)) {
                        throw new IOException();
                    }
                    var2.field3356 = InetAddress.getByName((String) var2.field3357).getAddress();
                } else if (var3 == 5) {
                    if (this.field9138) {
                        var2.field3356 = this.field9149.method1152(-111);
                    } else {
                        var2.field3356 = Class.forName("wv").getMethod("listmodes").invoke(this.field9148);
                    }
                } else if (var3 == 6) {
                    Frame var21 = new Frame("Jagex Full Screen");
                    var2.field3356 = var21;
                    var21.setResizable(false);
                    if (this.field9138) {
                        this.field9149.method1153(var21, var2.field3354 & 0xFFFF, true, var2.field3359 >> 16, var2.field3359 & 0xFFFF, var2.field3354 >>> 16);
                    } else {
                        Class.forName("wv").getMethod("enter", field9165 == null ? (field9165 = method3644("java.awt.Frame")) : field9165, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field9148, var21, Integer.valueOf(var2.field3354 >>> 16), new Integer(var2.field3354 & 0xFFFF), Integer.valueOf(var2.field3359 >> 16), new Integer(var2.field3359 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field9138) {
                        this.field9149.method1154((Frame) var2.field3357, false);
                    } else {
                        Class.forName("wv").getMethod("exit").invoke(this.field9148);
                    }
                } else if (var3 == 12) {
                    class479 var10 = method3629(field9159, (String) var2.field3357, field9140, (byte) 35);
                    var2.field3356 = var10;
                } else if (var3 == 13) {
                    class479 var11 = method3629(field9159, (String) var2.field3357, "", (byte) 35);
                    var2.field3356 = var11;
                } else if (this.field9151 && var3 == 14) {
                    int var19 = var2.field3354;
                    int var20 = var2.field3359;
                    if (this.field9138) {
                        this.field9158.method108(var20, (byte) -128, var19);
                    } else {
                        Class.forName("qv").getDeclaredMethod("movemouse", Integer.TYPE, Integer.TYPE).invoke(this.field9147, Integer.valueOf(var19), new Integer(var20));
                    }
                } else if (this.field9151 && var3 == 15) {
                    boolean var12 = var2.field3354 != 0;
                    Component var13 = (Component) var2.field3357;
                    if (this.field9138) {
                        this.field9158.method107(var13, (byte) -112, var12);
                    } else {
                        Class.forName("qv").getDeclaredMethod("showcursor", field9162 == null ? (field9162 = method3644("java.awt.Component")) : field9162, Boolean.TYPE).invoke(this.field9147, var13, Boolean.valueOf(var12));
                    }
                } else if (!this.field9138 && var3 == 17) {
                    Object[] var14 = (Object[]) var2.field3357;
                    Class.forName("qv").getDeclaredMethod("setcustomcursor", field9162 == null ? (field9162 = method3644("java.awt.Component")) : field9162, field9163 == null ? (field9163 = method3644("[I")) : field9163, Integer.TYPE, Integer.TYPE, field9164 == null ? (field9164 = method3644("java.awt.Point")) : field9164).invoke(this.field9147, (Component) var14[0], (int[]) var14[1], Integer.valueOf(var2.field3354), new Integer(var2.field3359), (Point) var14[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field9143.startsWith("win")) {
                            throw new Exception();
                        }
                        String var15 = (String) var2.field3357;
                        if (!var15.startsWith("http://") && !var15.startsWith("https://")) {
                            throw new Exception();
                        }
                        String var16 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        int var17 = 0;
                        while (true) {
                            if (var17 >= var15.length()) {
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                                var2.field3356 = null;
                                break;
                            }
                            if (var16.indexOf(var15.charAt(var17)) == -1) {
                                throw new Exception();
                            }
                            var17++;
                        }
                    } catch (Exception var31) {
                        var2.field3356 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3358 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field3358 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lvfa;")
    private final class264 method3633(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class264 var6 = new class264();
        var6.field3357 = arg0;
        if (arg2 != -32698) {
            field9137 = null;
        }
        var6.field3355 = arg3;
        var6.field3354 = arg1;
        var6.field3359 = arg4;
        synchronized (this) {
            if (this.field9160 == null) {
                this.field9160 = this.field9153 = var6;
            } else {
                this.field9160.field3353 = var6;
                this.field9160 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lvfa;")
    public final class264 method3634(Class arg0, String arg1, Class[] arg2, int arg3) {
        if (arg3 != 1727313032) {
            this.field9151 = false;
        }
        return this.method3633(new Object[] { arg0, arg1, arg2 }, 0, arg3 - 1727345730, 8, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Z")
    public final boolean method3635(boolean arg0) {
        if (!this.field9151) {
            return false;
        }
        if (arg0) {
            this.method3635(false);
        }
        if (this.field9138) {
            return this.field9149 != null;
        } else {
            return this.field9148 != null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBZLjava/lang/String;)Lvfa;")
    public final class264 method3636(int arg0, byte arg1, boolean arg2, String arg3) {
        int var5 = 28 % ((67 - arg1) / 56);
        return this.method3633(arg3, arg0, -32698, arg2 ? 22 : 1, 0);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3637(byte arg0) {
        if (arg0 >= -84) {
            field9135 = null;
        }
        return this.field9139;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lvfa;")
    public final class264 method3638(String arg0, Class arg1, int arg2) {
        return arg2 == 0 ? this.method3633(new Object[] { arg1, arg0 }, 0, -32698, 9, 0) : null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([ILjava/awt/Point;IIZLjava/awt/Component;)Lvfa;")
    public final class264 method3639(int[] arg0, Point arg1, int arg2, int arg3, boolean arg4, Component arg5) {
        if (!arg4) {
            field9142 = -80L;
        }
        return this.method3633(new Object[] { arg5, arg0, arg1 }, arg2, -32698, 17, arg3);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V")
    public final void method3640(int arg0) {
        synchronized (this) {
            this.field9144 = true;
            this.notifyAll();
        }
        try {
            this.field9154.join();
        } catch (InterruptedException var8) {
        }
        if (this.field9150 != null) {
            try {
                this.field9150.method2603((byte) -127);
            } catch (IOException var7) {
            }
        }
        if (this.field9134 != null) {
            try {
                this.field9134.method2603((byte) -127);
            } catch (IOException var6) {
            }
        }
        if (this.field9155 != null) {
            for (int var3 = 0; var3 < this.field9155.length; var3++) {
                if (this.field9155[var3] != null) {
                    try {
                        this.field9155[var3].method2603((byte) -128);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 > -117) {
            this.field9138 = true;
        }
        if (this.field9141 != null) {
            try {
                this.field9141.method2603((byte) -128);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;BZ)Lvfa;")
    public final class264 method3641(String arg0, byte arg1, boolean arg2) {
        if (arg1 != -28) {
            field9157 = null;
        }
        return arg2 ? this.method3633(arg0, 0, -32698, 12, 0) : this.method3633(arg0, 0, -32698, 13, 0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBII)Lvfa;")
    public final class264 method3642(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = 48 / ((arg2 - 60) / 63);
        return this.method3633(null, (arg3 << 16) + arg4, -32698, 6, (arg1 << 16) + arg0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/Frame;B)Lvfa;")
    public final class264 method3643(Frame arg0, byte arg1) {
        return arg1 == -36 ? this.method3633(arg0, 0, -32698, 7, 0) : null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V")
    public class648(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field9140 = arg1;
        field9137 = "Unknown";
        field9157 = "1.1";
        this.field9151 = arg3;
        field9159 = arg0;
        try {
            field9137 = System.getProperty("java.vendor");
            field9157 = System.getProperty("java.version");
        } catch (Exception var20) {
        }
        if (field9137.toLowerCase().indexOf("microsoft") != -1) {
            this.field9138 = true;
        }
        try {
            field9156 = System.getProperty("os.name");
        } catch (Exception var19) {
            field9156 = "Unknown";
        }
        field9143 = field9156.toLowerCase();
        try {
            field9135 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var18) {
            field9135 = "";
        }
        try {
            field9136 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var17) {
            field9136 = "";
        }
        try {
            field9146 = System.getProperty("user.home");
            if (field9146 != null) {
                field9146 = field9146 + "/";
            }
        } catch (Exception var16) {
        }
        if (field9146 == null) {
            field9146 = "~/";
        }
        try {
            this.field9152 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field9138) {
            try {
                field9161 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field9145 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class443.method2373(field9159, 0, field9140);
        if (this.field9151) {
            this.field9141 = new class479(class443.method2371("random.dat", null, (byte) 33, field9159), "rw", 25L);
            this.field9150 = new class479(class443.method2372("main_file_cache.dat2", (byte) -106), "rw", 209715200L);
            this.field9134 = new class479(class443.method2372("main_file_cache.idx255", (byte) -106), "rw", 1048576L);
            this.field9155 = new class479[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field9155[var5] = new class479(class443.method2372("main_file_cache.idx" + var5, (byte) -106), "rw", 1048576L);
            }
            if (this.field9138) {
                try {
                    this.field9139 = Class.forName("rt").getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field9138) {
                    this.field9149 = new class189();
                } else {
                    this.field9148 = Class.forName("wv").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field9138) {
                    this.field9158 = new class14();
                } else {
                    this.field9147 = Class.forName("qv").getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field9151 && !this.field9138) {
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
        this.field9144 = false;
        this.field9154 = new Thread(this);
        this.field9154.setPriority(10);
        this.field9154.setDaemon(true);
        this.field9154.start();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3644(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
