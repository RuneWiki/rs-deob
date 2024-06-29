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

@OriginalClass("client!js")
public class class216 implements Runnable {

    @OriginalMember(owner = "client!js", name = "g", descriptor = "Lsr;")
    public class164 field2914 = null;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field2917 = null;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "Lsr;")
    public class164 field2919 = null;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Z")
    private boolean field2923 = false;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "Ljk;")
    private class446 field2921 = null;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "Lsr;")
    public class164 field2920 = null;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "Ljk;")
    private class446 field2929 = null;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    private int field2912;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "Ljava/lang/String;")
    private String field2922;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2928;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field2916;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field2911 = 3;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2927 = new Hashtable(16);

    @OriginalMember(owner = "client!js", name = "y", descriptor = "J")
    public static volatile long field2932 = 0L;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "Lcq;")
    private class325 field2924;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2908;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2909;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2910;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2915;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2918;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2925;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "Ljava/lang/String;")
    private static String field2926;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2930;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2931;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "[Lsr;")
    public class164[] field2913;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)Ljk;")
    public final class446 method1351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -246664304) {
            this.method1354(107, null, -115, 108);
        }
        return this.method1358(null, (arg0 << 16) + arg4, (byte) 102, 6, (arg3 << 16) + arg1);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)Ljava/io/File;")
    public static final File method1352(int arg0, String arg1, boolean arg2, String arg3) {
        File var4 = (File) field2927.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2926, "/tmp/", "" };
        if (arg2) {
            method1352(-43, null, true, null);
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg3;
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
                                field2927.put(arg3, var12);
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

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILjava/lang/Runnable;)Ljk;")
    public final class446 method1353(int arg0, int arg1, Runnable arg2) {
        if (arg1 != -34) {
            this.field2913 = null;
        }
        return this.method1358(arg2, arg0, (byte) 102, 2, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/awt/Component;II)Ljk;")
    public final class446 method1354(int arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        return arg3 == 14 ? this.method1358(null, var5.x + arg2, (byte) 102, 14, var5.y + arg0) : null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLjava/lang/Class;)Ljk;")
    public final class446 method1355(boolean arg0, Class arg1) {
        if (!arg0) {
            this.field2919 = null;
        }
        return this.method1358(arg1, 0, (byte) 102, 11, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/String;)Ljk;")
    public final class446 method1356(int arg0, String arg1) {
        if (arg0 != 19) {
            this.method1355(false, null);
        }
        return this.method1358(arg1, 0, (byte) 102, 16, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)Ljk;")
    public final class446 method1357(byte arg0, int arg1) {
        return arg0 == -33 ? this.method1358(null, arg1, (byte) 102, 3, 0) : null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;IBII)Ljk;")
    private final class446 method1358(Object arg0, int arg1, byte arg2, int arg3, int arg4) {
        class446 var6 = new class446();
        var6.field6103 = arg0;
        var6.field6102 = arg1;
        if (arg2 != 102) {
            this.method1361(-102);
        }
        var6.field6101 = arg3;
        synchronized (this) {
            if (this.field2921 == null) {
                this.field2921 = this.field2929 = var6;
            } else {
                this.field2921.field6099 = var6;
                this.field2921 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Z")
    public final boolean method1359(int arg0) {
        return arg0 != -5;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Ljk;")
    public final class446 method1360(int arg0) {
        return arg0 == 0 ? this.method1358(null, 0, (byte) 102, 5, 0) : null;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
    public final void method1361(int arg0) {
        if (arg0 != 3) {
            this.field2916 = null;
        }
        field2932 = class498.method2854(-116) + 5000L;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/awt/Frame;)Ljk;")
    public final class446 method1362(int arg0, Frame arg1) {
        if (arg0 > -64) {
            this.method1358(null, -4, (byte) -114, 26, 9);
        }
        return this.method1358(arg1, 0, (byte) 102, 7, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Ljk;")
    public final class446 method1363(boolean arg0) {
        return arg0 ? this.method1358(null, 0, (byte) 102, 18, 0) : null;
    }

    @OriginalMember(owner = "client!js", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class446 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2923) {
                        return;
                    }
                    if (this.field2929 != null) {
                        var2 = this.field2929;
                        this.field2929 = this.field2929.field6099;
                        if (this.field2929 == null) {
                            this.field2921 = null;
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
                int var3 = var2.field6101;
                if (var3 == 1) {
                    if (field2932 > class498.method2854(-127)) {
                        throw new IOException();
                    }
                    var2.field6104 = new Socket(InetAddress.getByName((String) var2.field6103), var2.field6102);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field6103);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field6102);
                    var2.field6104 = var4;
                } else if (var3 == 4) {
                    if (class498.method2854(-125) < field2932) {
                        throw new IOException();
                    }
                    var2.field6104 = new DataInputStream(((URL) var2.field6103).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field6103;
                    var2.field6104 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field6103;
                    var2.field6104 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6104 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field6103;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field6100 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6100 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
    public final void method1364(int arg0) {
        synchronized (this) {
            this.field2923 = true;
            this.notifyAll();
        }
        try {
            this.field2916.join();
            if (arg0 < 59) {
                this.field2928 = null;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field2920 != null) {
            try {
                this.field2920.method1109((byte) -63);
            } catch (IOException var7) {
            }
        }
        if (this.field2914 != null) {
            try {
                this.field2914.method1109((byte) -63);
            } catch (IOException var6) {
            }
        }
        if (this.field2913 != null) {
            for (int var3 = 0; var3 < this.field2913.length; var3++) {
                if (this.field2913[var3] != null) {
                    try {
                        this.field2913[var3].method1109((byte) -63);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2919 != null) {
            try {
                this.field2919.method1109((byte) -63);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(ILjava/lang/String;)Ljk;")
    public final class446 method1365(int arg0, String arg1) {
        if (arg0 > -93) {
            this.method1367(null, 60);
        }
        return this.method1358(arg1, 0, (byte) 102, 21, 0);
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(ILjava/lang/String;)Ljk;")
    public final class446 method1366(int arg0, String arg1) {
        if (arg0 != 16) {
            this.method1351(-9, 20, -92, -39, -76);
        }
        return this.method1358(arg1, 0, (byte) 102, 12, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/net/URL;I)Ljk;")
    public final class446 method1367(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.method1351(-39, -18, 29, 49, 87);
        }
        return this.method1358(arg0, 0, (byte) 102, 4, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Class;B)Ljk;")
    public final class446 method1368(Class arg0, byte arg1) {
        return arg1 == -27 ? this.method1358(arg0, 0, (byte) 102, 20, 0) : null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Ljk;")
    public final class446 method1369(byte arg0, String arg1, Class arg2) {
        return arg0 == -23 ? this.method1358(new Object[] { arg2, arg1 }, 0, (byte) 102, 9, 0) : null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Component;Ljava/awt/Point;[IIII)Ljk;")
    public final class446 method1370(Component arg0, Point arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 17) {
            this.method1357((byte) -3, 96);
        }
        return this.method1358(new Object[] { arg0, arg2, arg1 }, arg5, (byte) 102, 17, arg4);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Ljk;")
    private final class446 method1371(Object arg0, int arg1, int arg2, byte arg3, int arg4) {
        class446 var6 = new class446();
        synchronized (var6) {
            var6.field6103 = arg0;
            var6.field6102 = arg4;
            var6.field6101 = arg1;
            synchronized (this) {
                if (this.field2921 == null) {
                    this.field2921 = this.field2929 = var6;
                } else {
                    this.field2921.field6099 = var6;
                    this.field2921 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var10) {
            }
            int var9 = -99 / ((24 - arg3) / 58);
            return var6;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IZLjava/awt/Component;)Ljk;")
    public final class446 method1372(int arg0, boolean arg1, Component arg2) {
        return arg0 == 15 ? this.method1358(arg2, arg1 ? 1 : 0, (byte) 102, 15, 0) : null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/lang/String;)Ljava/io/File;")
    public final File method1373(byte arg0, String arg1) {
        if (arg0 != 91) {
            this.method1372(75, true, null);
        }
        return method1352(this.field2912, this.field2922, false, arg1);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)Lcq;")
    public final class325 method1374(boolean arg0) {
        if (arg0) {
            this.field2916 = null;
        }
        return this.field2924;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Ljk;")
    public final class446 method1375(Transferable arg0, boolean arg1) {
        return arg1 ? null : this.method1358(arg0, 0, (byte) 102, 19, 0);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IILjava/lang/String;)Ljk;")
    public final class446 method1376(int arg0, int arg1, String arg2) {
        return arg0 == 1 ? this.method1358(arg2, arg1, (byte) 102, 1, 0) : null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljk;")
    public final class446 method1377(int arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 != 8) {
            this.field2922 = null;
        }
        return this.method1358(new Object[] { arg2, arg1, arg3 }, 0, (byte) 102, 8, 0);
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(ILjava/lang/String;)[B")
    public final byte[] method1378(int arg0, String arg1) {
        class446 var3 = this.method1371(arg1, 21, arg0, (byte) 115, 0);
        return (byte[]) var3.field6104;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILjava/lang/Class;)V")
    public final void method1379(int arg0, Class arg1) throws Exception {
        if (arg0 <= 42) {
            return;
        }
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field2915.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field2915.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method1373((byte) 91, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class216(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field2912 = arg1;
        this.field2917 = arg0;
        field2910 = "Unknown";
        field2918 = "1.1";
        this.field2922 = arg2;
        try {
            field2910 = System.getProperty("java.vendor");
            field2918 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2908 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2908 = "Unknown";
        }
        field2915 = field2908.toLowerCase();
        try {
            field2925 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2925 = "";
        }
        try {
            field2909 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2909 = "";
        }
        try {
            field2926 = System.getProperty("user.home");
            if (field2926 != null) {
                field2926 = field2926 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2926 == null) {
            field2926 = "~/";
        }
        try {
            this.field2928 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2930 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2930 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2931 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2931 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2923 = false;
        this.field2916 = new Thread(this);
        this.field2916.setPriority(10);
        this.field2916.setDaemon(true);
        this.field2916.start();
    }
}
