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

@OriginalClass("client!or")
public class class173 implements Runnable {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Loh;")
    public class453 field2615 = null;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "Loh;")
    public class453 field2621 = null;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "Lgp;")
    private class464 field2624 = null;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "Loh;")
    public class453 field2626 = null;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Ljava/applet/Applet;")
    public Applet field2623 = null;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "Lgp;")
    private class464 field2630 = null;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "Z")
    private boolean field2634 = false;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    private int field2625;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Ljava/lang/String;")
    private String field2617;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2614;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field2627;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field2628 = 3;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field2635 = new Hashtable(16);

    @OriginalMember(owner = "client!or", name = "y", descriptor = "J")
    public static volatile long field2638 = 0L;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "Ldh;")
    private class253 field2629;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "Ljava/lang/String;")
    private static String field2616;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2618;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2619;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2620;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2622;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2631;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2632;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2636;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2637;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "[Loh;")
    public class453[] field2633;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIILjava/lang/Object;)Lgp;", line = 4)
    private final class464 method1175(int arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (arg2 < 82) {
            this.field2634 = false;
        }
        class464 var6 = new class464();
        synchronized (var6) {
            var6.field6698 = arg3;
            var6.field6697 = arg1;
            var6.field6700 = arg4;
            synchronized (this) {
                if (this.field2630 == null) {
                    this.field2630 = this.field2624 = var6;
                } else {
                    this.field2630.field6696 = var6;
                    this.field2630 = var6;
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

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/Class;)V", line = 41)
    public final void method1176(int arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        int var4 = 124 % ((-arg0 - 46) / 54);
        Runtime var5 = Runtime.getRuntime();
        Method var6 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field2631.startsWith("mac")) {
            Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var6.invoke(var7, Boolean.TRUE);
            var7.invoke(var5, arg1, "jawt");
            var6.invoke(var7, Boolean.FALSE);
        }
        Method var8 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var6.invoke(var8, Boolean.TRUE);
        if (!field2631.startsWith("win")) {
            throw new Exception();
        }
        var8.invoke(var5, arg1, this.method1198("sw3d.dll", 17464).toString());
        var6.invoke(var8, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;B)[B", line = 76)
    public final byte[] method1177(String arg0, byte arg1) {
        if (arg1 <= 85) {
            this.method1179(null, -125);
        }
        class464 var3 = this.method1175(0, 21, 93, 0, arg0);
        return (byte[]) var3.field6695;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lgp;", line = 91)
    public final class464 method1178(int arg0, Transferable arg1) {
        if (arg0 != 8602) {
            this.field2617 = null;
        }
        return this.method1195((byte) 45, 0, 0, arg1, 19);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/net/URL;I)Lgp;", line = 107)
    public final class464 method1179(URL arg0, int arg1) {
        if (arg1 > -88) {
            this.field2615 = null;
        }
        return this.method1195((byte) 45, 0, 0, arg0, 4);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lgp;", line = 121)
    public final class464 method1180(int arg0) {
        if (arg0 != 0) {
            this.method1200(-13, null, 104, false, null, null);
        }
        return this.method1195((byte) 45, 0, 0, null, 5);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;II)Lgp;", line = 131)
    public final class464 method1181(String arg0, int arg1, int arg2) {
        if (arg1 < 61) {
            field2636 = null;
        }
        return this.method1195((byte) 45, arg2, 0, arg0, 1);
    }

    @OriginalMember(owner = "client!or", name = "run", descriptor = "()V", line = 144)
    public final void run() {
        while (true) {
            class464 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2634) {
                        return;
                    }
                    if (this.field2624 != null) {
                        var2 = this.field2624;
                        this.field2624 = this.field2624.field6696;
                        if (this.field2624 == null) {
                            this.field2630 = null;
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
                int var3 = var2.field6697;
                if (var3 == 1) {
                    if (field2638 > class254.method1522((byte) -51)) {
                        throw new IOException();
                    }
                    var2.field6695 = new Socket(InetAddress.getByName((String) var2.field6700), var2.field6698);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field6700);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field6698);
                    var2.field6695 = var4;
                } else if (var3 == 4) {
                    if (class254.method1522((byte) -51) < field2638) {
                        throw new IOException();
                    }
                    var2.field6695 = new DataInputStream(((URL) var2.field6700).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field6700;
                    var2.field6695 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field6700;
                    var2.field6695 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6695 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field6700;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field6699 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6699 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lgp;", line = 265)
    public final class464 method1182(Runnable arg0, byte arg1, int arg2) {
        if (arg1 != -121) {
            this.method1189(-11, null);
        }
        return this.method1195((byte) 45, arg2, 0, arg0, 2);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 693)
    public class173(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field2620 = "1.1";
        field2619 = "Unknown";
        this.field2625 = arg1;
        this.field2617 = arg2;
        this.field2623 = arg0;
        try {
            field2619 = System.getProperty("java.vendor");
            field2620 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field2622 = System.getProperty("os.name");
        } catch (Exception var11) {
            field2622 = "Unknown";
        }
        field2631 = field2622.toLowerCase();
        try {
            field2632 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field2632 = "";
        }
        try {
            field2618 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field2618 = "";
        }
        try {
            field2616 = System.getProperty("user.home");
            if (field2616 != null) {
                field2616 = field2616 + "/";
            }
        } catch (Exception var8) {
        }
        if (field2616 == null) {
            field2616 = "~/";
        }
        try {
            this.field2614 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field2636 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2636 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field2637 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2637 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field2634 = false;
        this.field2627 = new Thread(this);
        this.field2627.setPriority(10);
        this.field2627.setDaemon(true);
        this.field2627.start();
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V", line = 278)
    public final void method1183(int arg0) {
        synchronized (this) {
            this.field2634 = true;
            this.notifyAll();
            if (arg0 != 21230) {
                this.field2614 = null;
            }
        }
        try {
            this.field2627.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2626 != null) {
            try {
                this.field2626.method2659(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field2621 != null) {
            try {
                this.field2621.method2659(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field2633 != null) {
            for (int var3 = 0; var3 < this.field2633.length; var3++) {
                if (this.field2633[var3] != null) {
                    try {
                        this.field2633[var3].method2659(arg0 ^ 0xFFFFAD11);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2615 != null) {
            try {
                this.field2615.method2659(-1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Ljava/io/File;", line = 333)
    public static final File method1184(String arg0, int arg1, String arg2, int arg3) {
        File var4 = (File) field2635.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2616, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        if (arg3 != 2) {
            return null;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg0 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg0)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field2635.put(arg2, var12);
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

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lgp;", line = 431)
    public final class464 method1185(int arg0, String arg1, Class arg2) {
        if (arg0 < 103) {
            this.method1181(null, 0, 126);
        }
        return this.method1195((byte) 45, 0, 0, new Object[] { arg2, arg1 }, 9);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZLjava/awt/Component;)Lgp;", line = 441)
    public final class464 method1186(int arg0, int arg1, boolean arg2, Component arg3) {
        if (arg2) {
            Point var5 = arg3.getLocationOnScreen();
            return this.method1195((byte) 45, var5.x + arg1, var5.y + arg0, null, 14);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)Ldh;", line = 453)
    public final class253 method1187(int arg0) {
        if (arg0 != 0) {
            field2616 = null;
        }
        return this.field2629;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;Z)Lgp;", line = 469)
    public final class464 method1188(String arg0, boolean arg1) {
        if (!arg1) {
            this.method1197(-93, null, false);
        }
        return this.method1195((byte) 45, 0, 0, arg0, 16);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;)Lgp;", line = 481)
    public final class464 method1189(int arg0, String arg1) {
        if (arg0 != -31589) {
            this.method1196(null, -91);
        }
        return this.method1195((byte) 45, 0, 0, arg1, 21);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/Class;I)Lgp;", line = 491)
    public final class464 method1190(Class arg0, int arg1) {
        return arg1 <= 33 ? null : this.method1195((byte) 45, 0, 0, arg0, 20);
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Lgp;", line = 508)
    public final class464 method1191(int arg0) {
        if (arg0 != 0) {
            this.field2617 = null;
        }
        return this.method1195((byte) 45, 0, 0, null, 18);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(II)Lgp;", line = 519)
    public final class464 method1192(int arg0, int arg1) {
        return arg1 == 3 ? this.method1195((byte) 45, arg0, 0, null, 3) : null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 533)
    public final void method1193(byte arg0) {
        if (arg0 == 102) {
            field2638 = class254.method1522((byte) -51) + 5000L;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/awt/Frame;I)Lgp;", line = 543)
    public final class464 method1194(Frame arg0, int arg1) {
        if (arg1 != 0) {
            this.field2629 = null;
        }
        return this.method1195((byte) 45, 0, 0, arg0, 7);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BIILjava/lang/Object;I)Lgp;", line = 561)
    private final class464 method1195(byte arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg0 != 45) {
            field2622 = null;
        }
        class464 var6 = new class464();
        var6.field6698 = arg1;
        var6.field6700 = arg3;
        var6.field6697 = arg4;
        synchronized (this) {
            if (this.field2630 == null) {
                this.field2630 = this.field2624 = var6;
            } else {
                this.field2630.field6696 = var6;
                this.field2630 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Ljava/lang/Class;I)Lgp;", line = 592)
    public final class464 method1196(Class arg0, int arg1) {
        return arg1 == 10 ? this.method1195((byte) 45, 0, 0, arg0, 11) : null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/Component;Z)Lgp;", line = 602)
    public final class464 method1197(int arg0, Component arg1, boolean arg2) {
        if (arg0 != 0) {
            this.method1203(-28, -80, -52, -73, 72);
        }
        return this.method1195((byte) 45, arg2 ? 1 : 0, 0, arg1, 15);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;", line = 612)
    public final File method1198(String arg0, int arg1) {
        return arg1 == 17464 ? method1184(this.field2617, this.field2625, arg0, 2) : null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/lang/String;Z)Lgp;", line = 622)
    public final class464 method1199(int arg0, String arg1, boolean arg2) {
        if (arg0 == -14340) {
            return arg2 ? this.method1195((byte) 45, 0, 0, arg1, 12) : this.method1195((byte) 45, 0, 0, arg1, 13);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/Component;IZ[ILjava/awt/Point;)Lgp;", line = 646)
    public final class464 method1200(int arg0, Component arg1, int arg2, boolean arg3, int[] arg4, Point arg5) {
        return arg3 ? this.method1195((byte) 45, arg0, arg2, new Object[] { arg1, arg4, arg5 }, 17) : null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I[Ljava/lang/Class;)Lgp;", line = 663)
    public final class464 method1201(String arg0, Class arg1, int arg2, Class[] arg3) {
        if (arg2 != 0) {
            field2636 = null;
        }
        return this.method1195((byte) 45, 0, 0, new Object[] { arg1, arg0, arg3 }, 8);
    }

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)Z", line = 676)
    public final boolean method1202(int arg0) {
        if (arg0 != 0) {
            field2616 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)Lgp;", line = 772)
    public final class464 method1203(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg4 == 6 ? this.method1195((byte) 45, (arg3 << 16) + arg1, (arg0 << 16) + arg2, null, 6) : null;
    }
}
