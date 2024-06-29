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

@OriginalClass("client!pb")
public class class2 implements Runnable {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lrh;")
    public class488 field12 = null;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lrh;")
    public class488 field22 = null;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field27 = null;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Ljl;")
    private class495 field25 = null;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
    private boolean field28 = false;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Ljl;")
    private class495 field26 = null;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lrh;")
    public class488 field13 = null;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    private int field19;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljava/lang/String;")
    private String field17;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field11;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Ljava/lang/Thread;")
    private Thread field18;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field15 = 3;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field31 = new Hashtable(16);

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "J")
    public static volatile long field32 = 0L;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lnc;")
    private class151 field21;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field10;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ljava/lang/String;")
    public static String field14;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field16;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field23;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field24;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Ljava/lang/String;")
    public static String field29;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Ljava/lang/String;")
    private static String field30;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field33;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field34;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[Lrh;")
    public class488[] field20;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public final void method6(boolean arg0) {
        field32 = class246.method1705((byte) 28) + 5000L;
        if (arg0) {
            field32 = 41L;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Ljl;")
    public final class495 method7(Runnable arg0, byte arg1, int arg2) {
        if (arg1 < 80) {
            this.method29(-76, null, 127, -121, 23);
        }
        return this.method31((byte) 61, 0, 2, arg0, arg2);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public final byte[] method8(byte arg0, String arg1) {
        class495 var3 = this.method29(0, arg1, 21, -2, 0);
        if (arg0 != -10) {
            this.field28 = true;
        }
        return (byte[]) var3.field7462;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/Class;I)V")
    public final void method9(Class arg0, int arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        if (arg1 >= -2) {
            return;
        }
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field23.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field23.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method10(8, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
    public final File method10(int arg0, String arg1) {
        return arg0 == 8 ? method23(this.field17, arg1, this.field19, -3) : null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;B)Ljl;")
    public final class495 method11(String arg0, byte arg1) {
        return arg1 <= 67 ? null : this.method31((byte) 61, 0, 16, arg0, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Z")
    public final boolean method12(byte arg0) {
        int var2 = 37 / ((-arg0 - 68) / 34);
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Frame;I)Ljl;")
    public final class495 method13(Frame arg0, int arg1) {
        if (arg1 != 28877) {
            this.field11 = null;
        }
        return this.method31((byte) 61, 0, 7, arg0, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/Class;)Ljl;")
    public final class495 method14(byte arg0, Class arg1) {
        if (arg0 != -106) {
            this.field21 = null;
        }
        return this.method31((byte) 61, 0, 20, arg1, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Ljl;")
    public final class495 method15(int arg0, int arg1) {
        return arg0 == 31697 ? this.method31((byte) 61, 0, 3, null, arg1) : null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;IBI)Ljl;")
    public final class495 method16(Component arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 117) {
            Point var5 = arg0.getLocationOnScreen();
            return this.method31((byte) 61, var5.y + arg3, 14, null, var5.x + arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Lnc;")
    public final class151 method17(boolean arg0) {
        return arg0 ? null : this.field21;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(BLjava/lang/String;)Ljl;")
    public final class495 method18(byte arg0, String arg1) {
        return arg0 >= -124 ? null : this.method31((byte) 61, 0, 21, arg1, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLjava/lang/String;)Ljl;")
    public final class495 method19(int arg0, boolean arg1, String arg2) {
        if (arg0 != 19) {
            this.field13 = null;
        }
        return arg1 ? this.method31((byte) 61, 0, 12, arg2, 0) : this.method31((byte) 61, 0, 13, arg2, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/Class;[Ljava/lang/Class;Ljava/lang/String;)Ljl;")
    public final class495 method20(int arg0, Class arg1, Class[] arg2, String arg3) {
        return arg0 == 0 ? this.method31((byte) 61, 0, 8, new Object[] { arg1, arg3, arg2 }, 0) : null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(BLjava/lang/Class;)Ljl;")
    public final class495 method21(byte arg0, Class arg1) {
        if (arg0 > -114) {
            this.method27(29);
        }
        return this.method31((byte) 61, 0, 11, arg1, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZBLjava/awt/Component;)Ljl;")
    public final class495 method22(boolean arg0, byte arg1, Component arg2) {
        if (arg1 != -62) {
            field23 = null;
        }
        return this.method31((byte) 61, 0, 15, arg2, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;")
    public static final File method23(String arg0, String arg1, int arg2, int arg3) {
        File var4 = (File) field31.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field30, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        if (arg3 != -3) {
            method23(null, null, 35, -55);
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
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
                                field31.put(arg1, var12);
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

    @OriginalMember(owner = "client!pb", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class495 var2;
            synchronized (this) {
                while (true) {
                    if (this.field28) {
                        return;
                    }
                    if (this.field26 != null) {
                        var2 = this.field26;
                        this.field26 = this.field26.field7460;
                        if (this.field26 == null) {
                            this.field25 = null;
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
                int var3 = var2.field7459;
                if (var3 == 1) {
                    if (field32 > class246.method1705((byte) 28)) {
                        throw new IOException();
                    }
                    var2.field7462 = new Socket(InetAddress.getByName((String) var2.field7461), var2.field7463);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field7461);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field7463);
                    var2.field7462 = var9;
                } else if (var3 == 4) {
                    if (field32 > class246.method1705((byte) 28)) {
                        throw new IOException();
                    }
                    var2.field7462 = new DataInputStream(((URL) var2.field7461).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field7461;
                    var2.field7462 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field7461;
                    var2.field7462 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field7462 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var4 = (Transferable) var2.field7461;
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var5.setContents(var4, null);
                } else {
                    throw new Exception("");
                }
                var2.field7458 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field7458 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Ljl;")
    public final class495 method24(int arg0) {
        if (arg0 != -32693) {
            this.field13 = null;
        }
        return this.method31((byte) 61, 0, 18, null, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/net/URL;)Ljl;")
    public final class495 method25(int arg0, URL arg1) {
        if (arg0 < 81) {
            this.method8((byte) 32, null);
        }
        return this.method31((byte) 61, 0, 4, arg1, 0);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Ljl;")
    public final class495 method26(byte arg0) {
        return arg0 == 36 ? this.method31((byte) 61, 0, 5, null, 0) : null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public final void method27(int arg0) {
        synchronized (this) {
            this.field28 = true;
            this.notifyAll();
        }
        try {
            this.field18.join();
        } catch (InterruptedException var8) {
        }
        if (this.field13 != null) {
            try {
                this.field13.method2994(-30563);
            } catch (IOException var7) {
            }
        }
        if (arg0 <= 105) {
            field10 = null;
        }
        if (this.field22 != null) {
            try {
                this.field22.method2994(-30563);
            } catch (IOException var6) {
            }
        }
        if (this.field20 != null) {
            for (int var3 = 0; var3 < this.field20.length; var3++) {
                if (this.field20[var3] != null) {
                    try {
                        this.field20[var3].method2994(-30563);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field12 != null) {
            try {
                this.field12.method2994(-30563);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljl;")
    public final class495 method28(byte arg0, Class arg1, String arg2) {
        if (arg0 < 26) {
            this.field18 = null;
        }
        return this.method31((byte) 61, 0, 9, new Object[] { arg1, arg2 }, 0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/Object;III)Ljl;")
    private final class495 method29(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class495 var6 = new class495();
        synchronized (var6) {
            var6.field7463 = arg0;
            var6.field7459 = arg2;
            var6.field7461 = arg1;
            synchronized (this) {
                if (this.field25 == null) {
                    this.field25 = this.field26 = var6;
                } else {
                    this.field25.field7460 = var6;
                    this.field25 = var6;
                }
                this.notify();
            }
            try {
                if (arg3 != -2) {
                    field10 = null;
                }
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)Ljl;")
    public final class495 method30(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg1 == -653598992 ? this.method31((byte) 61, (arg4 << 16) + arg3, 6, null, (arg2 << 16) + arg0) : null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BIILjava/lang/Object;I)Ljl;")
    private final class495 method31(byte arg0, int arg1, int arg2, Object arg3, int arg4) {
        class495 var6 = new class495();
        if (arg0 != 61) {
            return null;
        }
        var6.field7461 = arg3;
        var6.field7463 = arg4;
        var6.field7459 = arg2;
        synchronized (this) {
            if (this.field25 == null) {
                this.field25 = this.field26 = var6;
            } else {
                this.field25.field7460 = var6;
                this.field25 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;II)Ljl;")
    public final class495 method32(String arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field22 = null;
        }
        return this.method31((byte) 61, 0, 1, arg0, arg2);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;IB[ILjava/awt/Point;)Ljl;")
    public final class495 method33(int arg0, Component arg1, int arg2, byte arg3, int[] arg4, Point arg5) {
        if (arg3 != 113) {
            this.method7(null, (byte) -93, 99);
        }
        return this.method31((byte) 61, arg2, 17, new Object[] { arg1, arg4, arg5 }, arg0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Ljl;")
    public final class495 method34(Transferable arg0, byte arg1) {
        if (arg1 < 74) {
            field10 = null;
        }
        return this.method31((byte) 61, 0, 19, arg0, 0);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class2(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field29 = "Unknown";
        this.field19 = arg1;
        field10 = "1.1";
        this.field17 = arg2;
        this.field27 = arg0;
        try {
            field29 = System.getProperty("java.vendor");
            field10 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field24 = System.getProperty("os.name");
        } catch (Exception var11) {
            field24 = "Unknown";
        }
        field23 = field24.toLowerCase();
        try {
            field16 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field16 = "";
        }
        try {
            field14 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field14 = "";
        }
        try {
            field30 = System.getProperty("user.home");
            if (field30 != null) {
                field30 = field30 + "/";
            }
        } catch (Exception var8) {
        }
        if (field30 == null) {
            field30 = "~/";
        }
        try {
            this.field11 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field34 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field34 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field33 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field33 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field28 = false;
        this.field18 = new Thread(this);
        this.field18.setPriority(10);
        this.field18.setDaemon(true);
        this.field18.start();
    }
}
