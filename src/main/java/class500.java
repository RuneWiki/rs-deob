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

@OriginalClass("client!dq")
public class class500 implements Runnable {

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Lsf;")
    public class368 field7372 = null;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Z")
    private boolean field7368 = false;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field7381 = null;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Lsf;")
    public class368 field7382 = null;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Low;")
    private class234 field7378 = null;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "Low;")
    private class234 field7380 = null;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Lsf;")
    public class368 field7371 = null;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Ljava/lang/String;")
    private String field7369;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    private int field7375;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7383;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Ljava/lang/Thread;")
    private Thread field7373;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field7379 = 3;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7377 = new Hashtable(16);

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "J")
    public static volatile long field7391 = 0L;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "Lpv;")
    private class50 field7388;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7367;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7370;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7374;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "Ljava/lang/String;")
    private static String field7376;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "Ljava/lang/String;")
    public static String field7384;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "Ljava/lang/String;")
    public static String field7385;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "Ljava/lang/String;")
    public static String field7386;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7389;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7390;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "[Lsf;")
    public class368[] field7387;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILjava/lang/String;)Low;")
    public final class234 method2975(boolean arg0, int arg1, String arg2) {
        if (arg1 != 8) {
            method2979(89, null, (byte) 11, null);
        }
        return arg0 ? this.method3003(arg2, 12, 0, (byte) 36, 0) : this.method3003(arg2, 13, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Low;")
    public final class234 method2976(String arg0, Class arg1, int arg2) {
        if (arg2 != 0) {
            field7389 = null;
        }
        return this.method3003(new Object[] { arg1, arg0 }, 9, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/Class;)V")
    public final void method2977(byte arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field7386.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        if (arg0 >= -117) {
            field7386 = null;
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field7386.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method2978(false, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/io/File;")
    public final File method2978(boolean arg0, String arg1) {
        if (arg0) {
            this.method2994(-109, null);
        }
        return method2979(this.field7375, this.field7369, (byte) 127, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class234 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7368) {
                        return;
                    }
                    if (this.field7380 != null) {
                        var2 = this.field7380;
                        this.field7380 = this.field7380.field3325;
                        if (this.field7380 == null) {
                            this.field7378 = null;
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
                int var3 = var2.field3321;
                if (var3 == 1) {
                    if (class58.method427((byte) -19) < field7391) {
                        throw new IOException();
                    }
                    var2.field3324 = new Socket(InetAddress.getByName((String) var2.field3323), var2.field3320);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3323);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3320);
                    var2.field3324 = var4;
                } else if (var3 == 4) {
                    if (field7391 > class58.method427((byte) -19)) {
                        throw new IOException();
                    }
                    var2.field3324 = new DataInputStream(((URL) var2.field3323).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3323;
                    var2.field3324 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field3323;
                    var2.field3324 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3324 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field3323;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field3322 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field3322 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Ljava/io/File;")
    public static final File method2979(int arg0, String arg1, byte arg2, String arg3) {
        File var4 = (File) field7377.get(arg3);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7376, "/tmp/", "" };
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
                                field7377.put(arg3, var12);
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
        if (arg2 <= 126) {
            method2979(-14, null, (byte) 118, null);
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public final byte[] method2980(int arg0, String arg1) {
        if (arg0 == 13388) {
            class234 var3 = this.method3002(0, 21, (byte) 71, arg1, 0);
            return (byte[]) var3.field3324;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/Class;)Low;")
    public final class234 method2981(int arg0, Class arg1) {
        if (arg0 != 11) {
            this.method2976(null, null, 60);
        }
        return this.method3003(arg1, 11, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/net/URL;)Low;")
    public final class234 method2982(byte arg0, URL arg1) {
        if (arg0 != -23) {
            this.method3002(71, -40, (byte) 61, null, -99);
        }
        return this.method3003(arg1, 4, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Z")
    public final boolean method2983(byte arg0) {
        if (arg0 != 12) {
            this.method2992(null, -120);
        }
        return false;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)Lpv;")
    public final class50 method2984(boolean arg0) {
        if (arg0) {
            this.method3000(10, 11, -56, -23, -48);
        }
        return this.field7388;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILjava/awt/Component;Ljava/awt/Point;I[I)Low;")
    public final class234 method2985(int arg0, int arg1, Component arg2, Point arg3, int arg4, int[] arg5) {
        return arg0 == 17 ? this.method3003(new Object[] { arg2, arg5, arg3 }, 17, arg1, (byte) 36, arg4) : null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
    public final void method2986(byte arg0) {
        synchronized (this) {
            this.field7368 = true;
            this.notifyAll();
        }
        try {
            this.field7373.join();
        } catch (InterruptedException var8) {
        }
        if (this.field7372 != null) {
            try {
                this.field7372.method2344((byte) -93);
            } catch (IOException var7) {
            }
        }
        if (this.field7371 != null) {
            try {
                this.field7371.method2344((byte) -93);
            } catch (IOException var6) {
            }
        }
        if (this.field7387 != null) {
            for (int var3 = 0; var3 < this.field7387.length; var3++) {
                if (this.field7387[var3] != null) {
                    try {
                        this.field7387[var3].method2344((byte) -93);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 != 32) {
            this.method2993(-40);
        }
        if (this.field7382 != null) {
            try {
                this.field7382.method2344((byte) -93);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Class;)Low;")
    public final class234 method2987(Class[] arg0, String arg1, boolean arg2, Class arg3) {
        return arg2 ? this.method3003(new Object[] { arg3, arg1, arg0 }, 8, 0, (byte) 36, 0) : null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Component;IZ)Low;")
    public final class234 method2988(Component arg0, int arg1, boolean arg2) {
        int var4 = -125 / ((arg1 - 7) / 53);
        return this.method3003(arg0, 15, arg2 ? 1 : 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/awt/Component;IZ)Low;")
    public final class234 method2989(int arg0, Component arg1, int arg2, boolean arg3) {
        Point var5 = arg1.getLocationOnScreen();
        if (!arg3) {
            this.field7378 = null;
        }
        return this.method3003(null, 14, arg2 + var5.x, (byte) 36, var5.y + arg0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Low;")
    public final class234 method2990(int arg0) {
        if (arg0 != 0) {
            this.method3000(-84, -73, -31, 15, 37);
        }
        return this.method3003(null, 18, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;I)Low;")
    public final class234 method2991(int arg0, String arg1, int arg2) {
        if (arg2 != 1) {
            this.run();
        }
        return this.method3003(arg1, 1, arg0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/Frame;I)Low;")
    public final class234 method2992(Frame arg0, int arg1) {
        int var3 = -78 / ((-arg1 - 59) / 48);
        return this.method3003(arg0, 7, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
    public final void method2993(int arg0) {
        if (arg0 != 30734) {
            field7376 = null;
        }
        field7391 = class58.method427((byte) -19) + 5000L;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(ILjava/lang/String;)Low;")
    public final class234 method2994(int arg0, String arg1) {
        return arg0 == 27414 ? this.method3003(arg1, 21, 0, (byte) 36, 0) : null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)Low;")
    public final class234 method2995(boolean arg0) {
        return arg0 ? null : this.method3003(null, 5, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/lang/String;)Low;")
    public final class234 method2996(byte arg0, String arg1) {
        int var3 = 102 / ((16 - arg0) / 52);
        return this.method3003(arg1, 16, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Low;")
    public final class234 method2997(Transferable arg0, int arg1) {
        if (arg1 != -5276) {
            this.field7382 = null;
        }
        return this.method3003(arg0, 19, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Low;")
    public final class234 method2998(int arg0, int arg1) {
        return arg1 > -113 ? null : this.method3003(null, 3, arg0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(BLjava/lang/Class;)Low;")
    public final class234 method2999(byte arg0, Class arg1) {
        if (arg0 >= -89) {
            this.method3001(-47, null, 68);
        }
        return this.method3003(arg1, 20, 0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIII)Low;")
    public final class234 method3000(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg4 == -503554192 ? this.method3003(null, 6, (arg0 << 16) + arg3, (byte) 36, (arg2 << 16) + arg1) : null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/Runnable;I)Low;")
    public final class234 method3001(int arg0, Runnable arg1, int arg2) {
        if (arg2 != 0) {
            field7367 = null;
        }
        return this.method3003(arg1, 2, arg0, (byte) 36, 0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIBLjava/lang/Object;I)Low;")
    private final class234 method3002(int arg0, int arg1, byte arg2, Object arg3, int arg4) {
        int var6 = -35 / ((arg2 + 36) / 48);
        class234 var7 = new class234();
        synchronized (var7) {
            var7.field3320 = arg0;
            var7.field3321 = arg1;
            var7.field3323 = arg3;
            synchronized (this) {
                if (this.field7378 == null) {
                    this.field7378 = this.field7380 = var7;
                } else {
                    this.field7378.field3325 = var7;
                    this.field7378 = var7;
                }
                this.notify();
            }
            try {
                var7.wait();
            } catch (InterruptedException var10) {
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Object;IIBI)Low;")
    private final class234 method3003(Object arg0, int arg1, int arg2, byte arg3, int arg4) {
        class234 var6 = new class234();
        var6.field3321 = arg1;
        var6.field3323 = arg0;
        var6.field3320 = arg2;
        synchronized (this) {
            if (arg3 != 36) {
                this.method2978(true, null);
            }
            if (this.field7378 == null) {
                this.field7378 = this.field7380 = var6;
            } else {
                this.field7378.field3325 = var6;
                this.field7378 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class500(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field7385 = "Unknown";
        field7367 = "1.1";
        this.field7369 = arg2;
        this.field7375 = arg1;
        this.field7381 = arg0;
        try {
            field7385 = System.getProperty("java.vendor");
            field7367 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field7384 = System.getProperty("os.name");
        } catch (Exception var11) {
            field7384 = "Unknown";
        }
        field7386 = field7384.toLowerCase();
        try {
            field7374 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field7374 = "";
        }
        try {
            field7370 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field7370 = "";
        }
        try {
            field7376 = System.getProperty("user.home");
            if (field7376 != null) {
                field7376 = field7376 + "/";
            }
        } catch (Exception var8) {
        }
        if (field7376 == null) {
            field7376 = "~/";
        }
        try {
            this.field7383 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field7390 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field7390 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field7389 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field7389 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field7368 = false;
        this.field7373 = new Thread(this);
        this.field7373.setPriority(10);
        this.field7373.setDaemon(true);
        this.field7373.start();
    }
}
