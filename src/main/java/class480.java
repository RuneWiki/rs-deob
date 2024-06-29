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

@OriginalClass("client!lt")
public class class480 implements Runnable {

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "Ljava/applet/Applet;")
    public Applet field7072 = null;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Z")
    private boolean field7071 = false;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Lwp;")
    private class121 field7069 = null;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "Lwp;")
    private class121 field7087 = null;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "Lhl;")
    public class371 field7083 = null;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "Lhl;")
    public class371 field7085 = null;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "Lhl;")
    public class371 field7090 = null;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "Ljava/lang/String;")
    private String field7086;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    private int field7075;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7078;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field7073;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field7076 = 3;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7079 = new Hashtable(16);

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "J")
    public static volatile long field7092 = 0L;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "Led;")
    private class501 field7077;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7070;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7074;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "Ljava/lang/String;")
    private static String field7080;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "Ljava/lang/String;")
    public static String field7081;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "Ljava/lang/String;")
    public static String field7082;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "Ljava/lang/String;")
    public static String field7088;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "Ljava/lang/String;")
    public static String field7089;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7091;

    @OriginalMember(owner = "client!lt", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7093;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "[Lhl;")
    public class371[] field7084;

    @OriginalMember(owner = "client!lt", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class121 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7071) {
                        return;
                    }
                    if (this.field7087 != null) {
                        var2 = this.field7087;
                        this.field7087 = this.field7087.field2116;
                        if (this.field7087 == null) {
                            this.field7069 = null;
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
                int var3 = var2.field2117;
                if (var3 == 1) {
                    if (class423.method2578(-19698) < field7092) {
                        throw new IOException();
                    }
                    var2.field2115 = new Socket(InetAddress.getByName((String) var2.field2118), var2.field2114);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field2118);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field2114);
                    var2.field2115 = var9;
                } else if (var3 == 4) {
                    if (field7092 > class423.method2578(-19698)) {
                        throw new IOException();
                    }
                    var2.field2115 = new DataInputStream(((URL) var2.field2118).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field2118;
                    var2.field2115 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field2118;
                    var2.field2115 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var4 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2115 = var4.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field2118;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field2119 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field2119 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILjava/lang/Runnable;)Lwp;")
    public final class121 method2860(int arg0, int arg1, Runnable arg2) {
        return arg0 >= -77 ? null : this.method2886(0, arg2, 0, 2, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public final File method2861(String arg0, int arg1) {
        if (arg1 < 121) {
            this.method2871(12, 62, null, 57, null, null);
        }
        return method2868((byte) 111, this.field7075, arg0, this.field7086);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Lwp;")
    public final class121 method2862(boolean arg0, Class[] arg1, Class arg2, String arg3) {
        return arg0 ? this.method2886(0, new Object[] { arg2, arg3, arg1 }, 0, 8, 0) : null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/Class;)Lwp;")
    public final class121 method2863(int arg0, Class arg1) {
        if (arg0 != 19986) {
            field7091 = null;
        }
        return this.method2886(0, arg1, 0, 20, 0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILjava/lang/Object;II)Lwp;")
    private final class121 method2864(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class121 var6 = new class121();
        synchronized (var6) {
            var6.field2117 = arg1;
            var6.field2114 = arg3;
            var6.field2118 = arg2;
            synchronized (this) {
                if (arg0 != -20) {
                    field7093 = null;
                }
                if (this.field7069 == null) {
                    this.field7069 = this.field7087 = var6;
                } else {
                    this.field7069.field2116 = var6;
                    this.field7069 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public final void method2865(int arg0) {
        synchronized (this) {
            this.field7071 = true;
            this.notifyAll();
        }
        try {
            if (arg0 >= -12) {
                field7081 = null;
            }
            this.field7073.join();
        } catch (InterruptedException var8) {
        }
        if (this.field7085 != null) {
            try {
                this.field7085.method2276(-2771);
            } catch (IOException var7) {
            }
        }
        if (this.field7083 != null) {
            try {
                this.field7083.method2276(-2771);
            } catch (IOException var6) {
            }
        }
        if (this.field7084 != null) {
            for (int var3 = 0; var3 < this.field7084.length; var3++) {
                if (this.field7084[var3] != null) {
                    try {
                        this.field7084[var3].method2276(-2771);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field7090 != null) {
            try {
                this.field7090.method2276(-2771);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(Ljava/lang/String;I)Lwp;")
    public final class121 method2866(String arg0, int arg1) {
        return arg1 == -25185 ? this.method2886(0, arg0, 0, 16, 0) : null;
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public final void method2867(int arg0) {
        field7092 = (long) arg0 + class423.method2578(-19698);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static final File method2868(byte arg0, int arg1, String arg2, String arg3) {
        File var4 = (File) field7079.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7080, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field7079.put(arg2, var12);
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
        if (arg0 < 2) {
            field7082 = null;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;)Lwp;")
    public final class121 method2869(int arg0, String arg1) {
        if (arg0 != 18176) {
            field7080 = null;
        }
        return this.method2886(0, arg1, 0, 21, 0);
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)Led;")
    public final class501 method2870(int arg0) {
        if (arg0 != 0) {
            this.method2870(99);
        }
        return this.field7077;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILjava/awt/Component;ILjava/awt/Point;[I)Lwp;")
    public final class121 method2871(int arg0, int arg1, Component arg2, int arg3, Point arg4, int[] arg5) {
        if (arg3 != 17) {
            this.field7075 = -84;
        }
        return this.method2886(0, new Object[] { arg2, arg5, arg4 }, arg1, 17, arg0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lwp;")
    public final class121 method2872(String arg0, Class arg1, int arg2) {
        if (arg2 < 22) {
            this.method2888(true, null);
        }
        return this.method2886(0, new Object[] { arg1, arg0 }, 0, 9, 0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lwp;")
    public final class121 method2873(Component arg0, byte arg1, boolean arg2) {
        if (arg1 >= -63) {
            this.field7078 = null;
        }
        return this.method2886(0, arg0, 0, 15, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)Z")
    public final boolean method2874(int arg0) {
        if (arg0 != 10000) {
            this.method2886(-126, null, 5, -85, -37);
        }
        return false;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIII)Lwp;")
    public final class121 method2875(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < 108) {
            this.method2872(null, null, 77);
        }
        return this.method2886(0, null, (arg3 << 16) + arg2, 6, (arg4 << 16) + arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Lwp;")
    public final class121 method2876(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field7090 = null;
        }
        return this.method2886(0, null, 0, 3, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "(I)Lwp;")
    public final class121 method2877(int arg0) {
        return arg0 == 0 ? this.method2886(0, null, 0, 18, 0) : null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;ZI)Lwp;")
    public final class121 method2878(String arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            return arg1 ? this.method2886(0, arg0, 0, 12, 0) : this.method2886(0, arg0, 0, 13, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lwp;")
    public final class121 method2879(Transferable arg0, int arg1) {
        int var3 = -47 % ((47 - arg1) / 47);
        return this.method2886(0, arg0, 0, 19, 0);
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(ILjava/lang/Class;)V")
    public final void method2880(int arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg0 >= -71) {
            method2868((byte) -87, -103, null, null);
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field7082.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field7082.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method2861("sw3d.dll", 122).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Frame;I)Lwp;")
    public final class121 method2881(Frame arg0, int arg1) {
        if (arg1 != 7) {
            this.field7071 = false;
        }
        return this.method2886(0, arg0, 0, 7, 0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZILjava/lang/String;)Lwp;")
    public final class121 method2882(boolean arg0, int arg1, String arg2) {
        if (!arg0) {
            this.method2873(null, (byte) -118, true);
        }
        return this.method2886(0, arg2, 0, 1, arg1);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lwp;")
    public final class121 method2883(Component arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 29) {
            Point var5 = arg0.getLocationOnScreen();
            return this.method2886(arg2 - 29, null, arg3 + var5.y, 14, var5.x + arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public final byte[] method2884(String arg0, boolean arg1) {
        if (arg1) {
            field7091 = null;
        }
        class121 var3 = this.method2864(-20, 21, arg0, 0, 0);
        return (byte[]) var3.field2115;
    }

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "(I)Lwp;")
    public final class121 method2885(int arg0) {
        if (arg0 > -124) {
            this.field7085 = null;
        }
        return this.method2886(0, null, 0, 5, 0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/Object;III)Lwp;")
    private final class121 method2886(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class121 var6 = new class121();
        if (arg0 != 0) {
            this.method2883(null, -1, (byte) -98, -90);
        }
        var6.field2118 = arg1;
        var6.field2114 = arg4;
        var6.field2117 = arg3;
        synchronized (this) {
            if (this.field7069 == null) {
                this.field7069 = this.field7087 = var6;
            } else {
                this.field7069.field2116 = var6;
                this.field7069 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BLjava/net/URL;)Lwp;")
    public final class121 method2887(byte arg0, URL arg1) {
        int var3 = -36 % ((arg0 - 84) / 35);
        return this.method2886(0, arg1, 0, 4, 0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLjava/lang/Class;)Lwp;")
    public final class121 method2888(boolean arg0, Class arg1) {
        if (!arg0) {
            this.method2862(false, null, null, null);
        }
        return this.method2886(0, arg1, 0, 11, 0);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class480(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field7086 = arg2;
        field7089 = "1.1";
        field7074 = "Unknown";
        this.field7075 = arg1;
        this.field7072 = arg0;
        try {
            field7074 = System.getProperty("java.vendor");
            field7089 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field7081 = System.getProperty("os.name");
        } catch (Exception var11) {
            field7081 = "Unknown";
        }
        field7082 = field7081.toLowerCase();
        try {
            field7070 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field7070 = "";
        }
        try {
            field7088 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field7088 = "";
        }
        try {
            field7080 = System.getProperty("user.home");
            if (field7080 != null) {
                field7080 = field7080 + "/";
            }
        } catch (Exception var8) {
        }
        if (field7080 == null) {
            field7080 = "~/";
        }
        try {
            this.field7078 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field7091 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field7091 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field7093 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field7093 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field7071 = false;
        this.field7073 = new Thread(this);
        this.field7073.setPriority(10);
        this.field7073.setDaemon(true);
        this.field7073.start();
    }
}
