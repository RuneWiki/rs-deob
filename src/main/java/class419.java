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

@OriginalClass("client!et")
public class class419 implements Runnable {

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lqt;")
    private class449 field6173 = null;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "Lqt;")
    private class449 field6182 = null;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lrp;")
    public class300 field6171 = null;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field6180 = null;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "Z")
    private boolean field6185 = false;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "Lrp;")
    public class300 field6184 = null;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "Lrp;")
    public class300 field6192 = null;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Ljava/lang/String;")
    private String field6177;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "I")
    private int field6190;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field6191;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "Ljava/lang/Thread;")
    private Thread field6174;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "I")
    public static int field6188 = 3;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field6181 = new Hashtable(16);

    @OriginalMember(owner = "client!et", name = "y", descriptor = "J")
    public static volatile long field6195 = 0L;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "Lqn;")
    private class46 field6172;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Ljava/lang/String;")
    private static String field6175;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6176;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6178;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "Ljava/lang/String;")
    public static String field6183;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6186;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "Ljava/lang/String;")
    public static String field6187;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "Ljava/lang/String;")
    public static String field6189;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6193;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field6194;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "[Lrp;")
    public class300[] field6179;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIZI)Lqt;", line = 3)
    public final class449 method2549(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        return arg3 ? this.method2560((arg4 << 16) + arg0, (arg2 << 16) + arg1, null, 0, 6) : null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/awt/Frame;)Lqt;", line = 16)
    public final class449 method2550(byte arg0, Frame arg1) {
        return arg0 == -64 ? this.method2560(0, 0, arg1, arg0 ^ 0xFFFFFFC0, 7) : null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/String;I)Lqt;", line = 26)
    public final class449 method2551(int arg0, String arg1, int arg2) {
        if (arg0 != 0) {
            this.field6185 = true;
        }
        return this.method2560(arg2, 0, arg1, arg0, 1);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 39)
    public final byte[] method2552(String arg0, int arg1) {
        class449 var3 = this.method2572(0, arg0, 0, 0, 21);
        if (arg1 != 14) {
            this.method2556(null, true);
        }
        return (byte[]) var3.field6613;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;I)Lqt;", line = 51)
    public final class449 method2553(Class[] arg0, String arg1, Class arg2, int arg3) {
        return arg3 == 2 ? this.method2560(0, 0, new Object[] { arg2, arg1, arg0 }, 0, 8) : null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lqt;", line = 63)
    public final class449 method2554(byte arg0) {
        return arg0 == -128 ? this.method2560(0, 0, null, arg0 + 128, 18) : null;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V", line = 76)
    public final void method2555(byte arg0) {
        synchronized (this) {
            this.field6185 = true;
            this.notifyAll();
        }
        try {
            this.field6174.join();
        } catch (InterruptedException var8) {
        }
        if (this.field6192 != null) {
            try {
                this.field6192.method1884(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field6171 != null) {
            try {
                this.field6171.method1884(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field6179 != null) {
            for (int var3 = 0; var3 < this.field6179.length; var3++) {
                if (this.field6179[var3] != null) {
                    try {
                        this.field6179[var3].method1884(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 <= -51 && this.field6184 != null) {
            try {
                this.field6184.method1884(-1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/io/File;", line = 131)
    public final File method2556(String arg0, boolean arg1) {
        return arg1 ? null : method2571(arg0, 0, this.field6190, this.field6177);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Lqn;", line = 145)
    public final class46 method2557(int arg0) {
        return arg0 == 18 ? this.field6172 : null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/awt/Component;Z)Lqt;", line = 155)
    public final class449 method2558(int arg0, Component arg1, boolean arg2) {
        if (arg0 != -23993) {
            this.method2576((byte) 77);
        }
        return this.method2560(arg2 ? 1 : 0, 0, arg1, 0, 15);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/lang/Class;)Lqt;", line = 166)
    public final class449 method2559(byte arg0, Class arg1) {
        int var3 = 17 % ((-arg0 - 62) / 58);
        return this.method2560(0, 0, arg1, 0, 20);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 695)
    public class419(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field6180 = arg0;
        this.field6177 = arg2;
        field6187 = "1.1";
        this.field6190 = arg1;
        field6186 = "Unknown";
        try {
            field6186 = System.getProperty("java.vendor");
            field6187 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field6176 = System.getProperty("os.name");
        } catch (Exception var11) {
            field6176 = "Unknown";
        }
        field6189 = field6176.toLowerCase();
        try {
            field6178 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field6178 = "";
        }
        try {
            field6183 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field6183 = "";
        }
        try {
            field6175 = System.getProperty("user.home");
            if (field6175 != null) {
                field6175 = field6175 + "/";
            }
        } catch (Exception var8) {
        }
        if (field6175 == null) {
            field6175 = "~/";
        }
        try {
            this.field6191 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field6193 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field6193 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field6194 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field6194 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field6185 = false;
        this.field6174 = new Thread(this);
        this.field6174.setPriority(10);
        this.field6174.setDaemon(true);
        this.field6174.start();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILjava/lang/Object;II)Lqt;", line = 178)
    private final class449 method2560(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class449 var6 = new class449();
        var6.field6615 = arg0;
        var6.field6612 = arg2;
        if (arg3 != 0) {
            this.run();
        }
        var6.field6616 = arg4;
        synchronized (this) {
            if (this.field6182 == null) {
                this.field6182 = this.field6173 = var6;
            } else {
                this.field6182.field6614 = var6;
                this.field6182 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLjava/lang/String;)Lqt;", line = 210)
    public final class449 method2561(byte arg0, String arg1) {
        if (arg0 > -43) {
            this.method2574(null, -71);
        }
        return this.method2560(0, 0, arg1, 0, 12);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BI)Lqt;", line = 227)
    public final class449 method2562(byte arg0, int arg1) {
        if (arg0 != 122) {
            this.method2568((byte) -75);
        }
        return this.method2560(arg1, 0, null, 0, 3);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Class;I)V", line = 237)
    public final void method2563(Class arg0, int arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field6189.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        int var8 = -106 / ((arg1 - 49) / 34);
        var5.invoke(var7, Boolean.TRUE);
        if (!field6189.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method2556("sw3d.dll", false).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILjava/lang/Runnable;)Lqt;", line = 271)
    public final class449 method2564(int arg0, int arg1, Runnable arg2) {
        int var4 = -93 / ((20 - arg0) / 51);
        return this.method2560(arg1, 0, arg2, 0, 2);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lqt;", line = 286)
    public final class449 method2565(Transferable arg0, byte arg1) {
        return arg1 == 87 ? this.method2560(0, 0, arg0, 0, 19) : null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Point;Ljava/awt/Component;I[III)Lqt;", line = 296)
    public final class449 method2566(Point arg0, Component arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg5 != -23853) {
            this.method2549(108, 85, -42, true, -69);
        }
        return this.method2560(arg2, arg4, new Object[] { arg1, arg3, arg0 }, 0, 17);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Ljava/lang/String;I)Lqt;", line = 307)
    public final class449 method2567(String arg0, int arg1) {
        return arg1 == 14 ? this.method2560(0, 0, arg0, 0, 16) : null;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(B)Lqt;", line = 318)
    public final class449 method2568(byte arg0) {
        if (arg0 != -80) {
            this.field6185 = true;
        }
        return this.method2560(0, 0, null, 0, 5);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Class;Z)Lqt;", line = 328)
    public final class449 method2569(Class arg0, boolean arg1) {
        if (arg1) {
            this.field6171 = null;
        }
        return this.method2560(0, 0, arg0, 0, 11);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Component;ZII)Lqt;", line = 341)
    public final class449 method2570(Component arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field6181 = null;
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method2560(var5.x + arg2, var5.y + arg3, null, 0, 14);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Ljava/io/File;", line = 354)
    public static final File method2571(String arg0, int arg1, int arg2, String arg3) {
        File var4 = (File) field6181.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field6175, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = arg1; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg0;
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
                                field6181.put(arg0, var12);
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

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/Object;III)Lqt;", line = 445)
    private final class449 method2572(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class449 var6 = new class449();
        synchronized (var6) {
            var6.field6616 = arg4;
            var6.field6615 = arg3;
            var6.field6612 = arg1;
            synchronized (this) {
                if (arg2 != 0) {
                    return null;
                }
                if (this.field6182 == null) {
                    this.field6182 = this.field6173 = var6;
                } else {
                    this.field6182.field6614 = var6;
                    this.field6182 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var14) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lqt;", line = 483)
    public final class449 method2573(int arg0, Class arg1, String arg2) {
        if (arg0 > -77) {
            method2571(null, 97, 25, null);
        }
        return this.method2560(0, 0, new Object[] { arg1, arg2 }, 0, 9);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/net/URL;I)Lqt;", line = 496)
    public final class449 method2574(URL arg0, int arg1) {
        return arg1 >= -97 ? null : this.method2560(0, 0, arg0, 0, 4);
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(Ljava/lang/String;I)Lqt;", line = 512)
    public final class449 method2575(String arg0, int arg1) {
        if (arg1 <= 71) {
            this.method2570(null, true, 35, 67);
        }
        return this.method2560(0, 0, arg0, 0, 21);
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V", line = 522)
    public final void method2576(byte arg0) {
        if (arg0 != 62) {
            this.field6174 = null;
        }
        field6195 = class437.method2644(arg0 ^ 0xFFFFFFA6) + 5000L;
    }

    @OriginalMember(owner = "client!et", name = "run", descriptor = "()V", line = 536)
    public final void run() {
        while (true) {
            class449 var2;
            synchronized (this) {
                while (true) {
                    if (this.field6185) {
                        return;
                    }
                    if (this.field6173 != null) {
                        var2 = this.field6173;
                        this.field6173 = this.field6173.field6614;
                        if (this.field6173 == null) {
                            this.field6182 = null;
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
                int var3 = var2.field6616;
                if (var3 == 1) {
                    if (field6195 > class437.method2644(-55)) {
                        throw new IOException();
                    }
                    var2.field6613 = new Socket(InetAddress.getByName((String) var2.field6612), var2.field6615);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field6612);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field6615);
                    var2.field6613 = var9;
                } else if (var3 == 4) {
                    if (field6195 > class437.method2644(-128)) {
                        throw new IOException();
                    }
                    var2.field6613 = new DataInputStream(((URL) var2.field6612).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field6612;
                    var2.field6613 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field6612;
                    var2.field6613 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else if (var3 == 18) {
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6613 = var8.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field6612;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else {
                    throw new Exception("");
                }
                var2.field6617 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6617 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(B)Z", line = 682)
    public final boolean method2577(byte arg0) {
        if (arg0 >= -85) {
            field6178 = null;
        }
        return false;
    }
}
