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

@OriginalClass("client!ul")
public class class411 implements Runnable {

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
    private boolean field5810 = false;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Lkr;")
    public class536 field5804 = null;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lgm;")
    private class81 field5808 = null;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lgm;")
    private class81 field5821 = null;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lkr;")
    public class536 field5813 = null;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "Lkr;")
    public class536 field5822 = null;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Ljava/applet/Applet;")
    public Applet field5824 = null;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    private int field5805;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "Ljava/lang/String;")
    private String field5819;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field5803;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field5814;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5809 = 3;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field5817 = new Hashtable(16);

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "J")
    public static volatile long field5827 = 0L;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lmt;")
    private class278 field5807;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5806;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5811;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5812;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5815;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5816;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5820;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Ljava/lang/String;")
    private static String field5823;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5825;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field5826;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[Lkr;")
    public class536[] field5818;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)Lmt;", line = 8)
    public final class278 method2435(int arg0) {
        if (arg0 != 0) {
            this.field5810 = true;
        }
        return this.field5807;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lgm;", line = 20)
    public final class81 method2436(Runnable arg0, int arg1, int arg2) {
        return arg1 == 24305 ? this.method2438((byte) 5, 0, 2, arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 32)
    public final byte[] method2437(int arg0, String arg1) {
        if (arg0 != -30326) {
            this.method2435(-75);
        }
        class81 var3 = this.method2458(arg1, 0, 21, arg0 + 30326, 0);
        return (byte[]) var3.field1311;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIILjava/lang/Object;I)Lgm;", line = 44)
    private final class81 method2438(byte arg0, int arg1, int arg2, Object arg3, int arg4) {
        class81 var6 = new class81();
        var6.field1309 = arg4;
        var6.field1310 = arg2;
        var6.field1313 = arg3;
        if (arg0 != 5) {
            return null;
        }
        synchronized (this) {
            if (this.field5808 == null) {
                this.field5808 = this.field5821 = var6;
            } else {
                this.field5808.field1312 = var6;
                this.field5808 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 74)
    public static final File method2439(int arg0, String arg1, String arg2, int arg3) {
        File var4 = (File) field5817.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field5823, "/tmp/", "" };
        if (arg3 > -101) {
            field5816 = null;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg2 == null ? "" : arg2 + "/") + arg1;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg2 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg2)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field5817.put(arg1, var12);
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

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Lgm;", line = 162)
    public final class81 method2440(int arg0, String arg1, Class arg2, Class[] arg3) {
        int var5 = 47 % ((arg0 - 15) / 34);
        return this.method2438((byte) 5, 0, 8, new Object[] { arg2, arg1, arg3 }, 0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;II)Lgm;", line = 177)
    public final class81 method2441(String arg0, int arg1, int arg2) {
        return arg2 >= -18 ? null : this.method2438((byte) 5, 0, 1, arg0, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z", line = 191)
    public final boolean method2442(int arg0) {
        int var2 = 93 / ((23 - arg0) / 50);
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Class;I)Lgm;", line = 205)
    public final class81 method2443(Class arg0, int arg1) {
        return arg1 == 0 ? this.method2438((byte) 5, 0, 11, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/awt/Frame;)Lgm;", line = 218)
    public final class81 method2444(boolean arg0, Frame arg1) {
        if (arg0) {
            this.method2458(null, -58, 107, 48, 9);
        }
        return this.method2438((byte) 5, 0, 7, arg1, 0);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 695)
    public class411(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field5816 = "1.1";
        field5811 = "Unknown";
        this.field5805 = arg1;
        this.field5819 = arg2;
        this.field5824 = arg0;
        try {
            field5811 = System.getProperty("java.vendor");
            field5816 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field5806 = System.getProperty("os.name");
        } catch (Exception var11) {
            field5806 = "Unknown";
        }
        field5820 = field5806.toLowerCase();
        try {
            field5815 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field5815 = "";
        }
        try {
            field5812 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field5812 = "";
        }
        try {
            field5823 = System.getProperty("user.home");
            if (field5823 != null) {
                field5823 = field5823 + "/";
            }
        } catch (Exception var8) {
        }
        if (field5823 == null) {
            field5823 = "~/";
        }
        try {
            this.field5803 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field5825 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field5825 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field5826 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field5826 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field5810 = false;
        this.field5814 = new Thread(this);
        this.field5814.setPriority(10);
        this.field5814.setDaemon(true);
        this.field5814.start();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/awt/Component;IBLjava/awt/Point;[II)Lgm;", line = 234)
    public final class81 method2445(Component arg0, int arg1, byte arg2, Point arg3, int[] arg4, int arg5) {
        if (arg2 != 2) {
            this.field5804 = null;
        }
        return this.method2438((byte) 5, arg5, 17, new Object[] { arg0, arg4, arg3 }, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 245)
    public final File method2446(String arg0, int arg1) {
        return arg1 == 21 ? method2439(this.field5805, arg0, this.field5819, arg1 ^ 0xFFFFFF9B) : null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Lgm;", line = 268)
    public final class81 method2447(byte arg0, Transferable arg1) {
        return arg0 == -37 ? this.method2438((byte) 5, 0, 19, arg1, 0) : null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)Lgm;", line = 279)
    public final class81 method2448(int arg0, byte arg1) {
        int var3 = -77 % ((-arg1 - 55) / 34);
        return this.method2438((byte) 5, 0, 3, null, arg0);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)Lgm;", line = 290)
    public final class81 method2449(int arg0) {
        int var2 = 127 / ((-arg0 - 27) / 63);
        return this.method2438((byte) 5, 0, 18, null, 0);
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V", line = 299)
    public final void method2450(int arg0) {
        if (arg0 != 1791807024) {
            this.field5824 = null;
        }
        field5827 = class165.method1188((byte) 26) + 5000L;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 309)
    public final void method2451(boolean arg0) {
        synchronized (this) {
            if (arg0) {
                this.method2446(null, 116);
            }
            this.field5810 = true;
            this.notifyAll();
        }
        try {
            this.field5814.join();
        } catch (InterruptedException var8) {
        }
        if (this.field5822 != null) {
            try {
                this.field5822.method3165(-7527);
            } catch (IOException var7) {
            }
        }
        if (this.field5813 != null) {
            try {
                this.field5813.method3165(-7527);
            } catch (IOException var6) {
            }
        }
        if (this.field5818 != null) {
            for (int var3 = 0; var3 < this.field5818.length; var3++) {
                if (this.field5818[var3] != null) {
                    try {
                        this.field5818[var3].method3165(-7527);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field5804 != null) {
            try {
                this.field5804.method3165(-7527);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBLjava/awt/Component;I)Lgm;", line = 362)
    public final class81 method2452(int arg0, byte arg1, Component arg2, int arg3) {
        if (arg1 == 35) {
            Point var5 = arg2.getLocationOnScreen();
            return this.method2438((byte) 5, arg3 + var5.y, 14, null, var5.x + arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/awt/Component;Z)Lgm;", line = 377)
    public final class81 method2453(byte arg0, Component arg1, boolean arg2) {
        return arg0 >= -115 ? null : this.method2438((byte) 5, 0, 15, arg1, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILjava/lang/String;)Lgm;", line = 387)
    public final class81 method2454(int arg0, String arg1) {
        return arg0 == 16 ? this.method2438((byte) 5, 0, 16, arg1, 0) : null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)Lgm;", line = 400)
    public final class81 method2455(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1732491344) {
            field5817 = null;
        }
        return this.method2438((byte) 5, (arg3 << 16) + arg1, 6, null, (arg4 << 16) + arg0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/net/URL;I)Lgm;", line = 413)
    public final class81 method2456(URL arg0, int arg1) {
        if (arg1 < 124) {
            field5825 = null;
        }
        return this.method2438((byte) 5, 0, 4, arg0, 0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lgm;", line = 424)
    public final class81 method2457(byte arg0, Class arg1, String arg2) {
        return arg0 < 78 ? null : this.method2438((byte) 5, 0, 9, new Object[] { arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lgm;", line = 436)
    private final class81 method2458(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class81 var6 = new class81();
        synchronized (var6) {
            var6.field1309 = arg1;
            var6.field1313 = arg0;
            var6.field1310 = arg2;
            synchronized (this) {
                if (this.field5808 == null) {
                    this.field5808 = this.field5821 = var6;
                } else {
                    this.field5808.field1312 = var6;
                    this.field5808 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            if (arg3 != 0) {
                this.method2435(-92);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Ljava/lang/String;I)Lgm;", line = 476)
    public final class81 method2459(String arg0, int arg1) {
        if (arg1 != 0) {
            this.method2449(92);
        }
        return this.method2438((byte) 5, 0, 21, arg0, 0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Lgm;", line = 490)
    public final class81 method2460(byte arg0) {
        if (arg0 >= -53) {
            this.method2461(null, -21);
        }
        return this.method2438((byte) 5, 0, 5, null, 0);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Ljava/lang/Class;I)Lgm;", line = 504)
    public final class81 method2461(Class arg0, int arg1) {
        int var3 = -25 / ((arg1 + 59) / 55);
        return this.method2438((byte) 5, 0, 20, arg0, 0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/lang/Class;)V", line = 514)
    public final void method2462(byte arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        int var6 = 74 % (arg0 / 36);
        if (!field5820.startsWith("mac")) {
            Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var7, Boolean.TRUE);
            var7.invoke(var4, arg1, "jawt");
            var5.invoke(var7, Boolean.FALSE);
        }
        Method var8 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var8, Boolean.TRUE);
        if (!field5820.startsWith("win")) {
            throw new Exception();
        }
        var8.invoke(var4, arg1, this.method2446("sw3d.dll", 21).toString());
        var5.invoke(var8, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/lang/String;Z)Lgm;", line = 548)
    public final class81 method2463(boolean arg0, String arg1, boolean arg2) {
        if (arg0) {
            this.method2457((byte) -97, null, null);
        }
        return arg2 ? this.method2438((byte) 5, 0, 12, arg1, 0) : this.method2438((byte) 5, 0, 13, arg1, 0);
    }

    @OriginalMember(owner = "client!ul", name = "run", descriptor = "()V", line = 567)
    public final void run() {
        while (true) {
            class81 var2;
            synchronized (this) {
                while (true) {
                    if (this.field5810) {
                        return;
                    }
                    if (this.field5821 != null) {
                        var2 = this.field5821;
                        this.field5821 = this.field5821.field1312;
                        if (this.field5821 == null) {
                            this.field5808 = null;
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
                int var3 = var2.field1310;
                if (var3 == 1) {
                    if (field5827 > class165.method1188((byte) 26)) {
                        throw new IOException();
                    }
                    var2.field1311 = new Socket(InetAddress.getByName((String) var2.field1313), var2.field1309);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1313);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1309);
                    var2.field1311 = var4;
                } else if (var3 == 4) {
                    if (class165.method1188((byte) 26) < field5827) {
                        throw new IOException();
                    }
                    var2.field1311 = new DataInputStream(((URL) var2.field1313).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field1313;
                    var2.field1311 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1313;
                    var2.field1311 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field1311 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field1313;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else {
                    throw new Exception("");
                }
                var2.field1314 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field1314 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }
}
