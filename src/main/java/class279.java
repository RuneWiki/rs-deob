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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class279 implements Runnable {

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "Llaa;")
    public class578 field3635 = null;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "Llaa;")
    public class578 field3636 = null;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "Ljr;")
    private class441 field3638 = null;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "Ljr;")
    private class441 field3641 = null;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "Ljava/applet/Applet;")
    public Applet field3644 = null;

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "Llaa;")
    public class578 field3646 = null;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "Z")
    private boolean field3648 = false;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "Ljava/lang/String;")
    private String field3647;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3632;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "Ljava/lang/Thread;")
    private Thread field3631;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field3639 = 3;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field3634 = new Hashtable(16);

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "J")
    public static volatile long field3650 = 0L;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "Lkaa;")
    private class160 field3629;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3630;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3633;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "Ljava/lang/String;")
    private static String field3637;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3640;

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3643;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3645;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3649;

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3651;

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3652;

    @OriginalMember(owner = "client!gaa", name = "y", descriptor = "[Llaa;")
    public class578[] field3653;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljr;")
    public final class441 method1719(String arg0, int arg1, Class arg2) {
        if (arg1 != 9) {
            this.method1737((byte) -32);
        }
        return this.method1725(0, 0, new Object[] { arg2, arg0 }, -111, 9);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public final byte[] method1720(String arg0, int arg1) {
        class441 var3 = this.method1729((byte) 122, 0, 21, 0, arg0);
        if (arg1 != -5856) {
            this.method1742((byte) 75, null);
        }
        return (byte[]) var3.field6000;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)Ljr;")
    public final class441 method1721(int arg0, int arg1) {
        if (arg1 != 3) {
            field3633 = null;
        }
        return this.method1725(0, arg0, null, -103, 3);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZZLjava/awt/Component;)Ljr;")
    public final class441 method1722(boolean arg0, boolean arg1, Component arg2) {
        if (arg1) {
            this.method1735(null, -22);
        }
        return this.method1725(0, arg0 ? 1 : 0, arg2, -100, 15);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([IIILjava/awt/Component;Ljava/awt/Point;I)Ljr;")
    public final class441 method1723(int[] arg0, int arg1, int arg2, Component arg3, Point arg4, int arg5) {
        if (arg5 < 2) {
            method1726(75, -27, null, null);
        }
        return this.method1725(arg2, arg1, new Object[] { arg3, arg0, arg4 }, -102, 17);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLjava/lang/String;)Ljr;")
    public final class441 method1724(boolean arg0, String arg1) {
        return arg0 ? null : this.method1725(0, 0, arg1, -121, 16);
    }

    @OriginalMember(owner = "client!gaa", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class441 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3648) {
                        return;
                    }
                    if (this.field3638 != null) {
                        var2 = this.field3638;
                        this.field3638 = this.field3638.field5997;
                        if (this.field3638 == null) {
                            this.field3641 = null;
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
                int var3 = var2.field5999;
                if (var3 == 1) {
                    if (field3650 > class348.method2175(-116)) {
                        throw new IOException();
                    }
                    var2.field6000 = new Socket(InetAddress.getByName((String) var2.field6002), var2.field5998);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field6002);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field5998);
                    var2.field6000 = var9;
                } else if (var3 == 4) {
                    if (field3650 > class348.method2175(-116)) {
                        throw new IOException();
                    }
                    var2.field6000 = new DataInputStream(((URL) var2.field6002).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field6002;
                    var2.field6000 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var7 = (Object[]) var2.field6002;
                    var2.field6000 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6000 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var4 = (Transferable) var2.field6002;
                    Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var5.setContents(var4, null);
                } else {
                    throw new Exception("");
                }
                var2.field6001 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6001 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILjava/lang/Object;II)Ljr;")
    private final class441 method1725(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class441 var6 = new class441();
        var6.field5998 = arg1;
        var6.field6002 = arg2;
        if (arg3 > -98) {
            this.method1743((byte) -30, null);
        }
        var6.field5999 = arg4;
        synchronized (this) {
            if (this.field3641 == null) {
                this.field3641 = this.field3638 = var6;
            } else {
                this.field3641.field5997 = var6;
                this.field3641 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
    public static final File method1726(int arg0, int arg1, String arg2, String arg3) {
        File var4 = (File) field3634.get(arg2);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3637, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
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
                                field3634.put(arg2, var12);
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
        if (arg1 <= 56) {
            field3639 = -67;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZBLjava/lang/String;)Ljr;")
    public final class441 method1727(boolean arg0, byte arg1, String arg2) {
        int var4 = 79 % ((13 - arg1) / 45);
        return arg0 ? this.method1725(0, 0, arg2, -106, 12) : this.method1725(0, 0, arg2, -127, 13);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public final void method1728(byte arg0) {
        field3650 = class348.method2175(-120) + 5000L;
        if (arg0 < 69) {
            field3639 = 42;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIILjava/lang/Object;)Ljr;")
    private final class441 method1729(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        class441 var6 = new class441();
        synchronized (var6) {
            if (arg0 < 113) {
                this.field3631 = null;
            }
            var6.field5998 = arg3;
            var6.field6002 = arg4;
            var6.field5999 = arg2;
            synchronized (this) {
                if (this.field3641 == null) {
                    this.field3641 = this.field3638 = var6;
                } else {
                    this.field3641.field5997 = var6;
                    this.field3641 = var6;
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

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IILjava/lang/Runnable;)Ljr;")
    public final class441 method1730(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 2) {
            this.method1728((byte) 89);
        }
        return this.method1725(0, arg0, arg2, -103, 2);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILjava/awt/Component;II)Ljr;")
    public final class441 method1731(int arg0, Component arg1, int arg2, int arg3) {
        Point var5 = arg1.getLocationOnScreen();
        return arg3 < 104 ? null : this.method1725(var5.y + arg2, arg0 - -var5.x, null, -114, 14);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZLjava/lang/Class;)V")
    public final void method1732(boolean arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field3649.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        if (!arg0) {
            field3630 = null;
        }
        var5.invoke(var7, Boolean.TRUE);
        if (!field3649.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method1741("sw3d.dll", 95).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
    public final boolean method1733(File arg0, byte[] arg1, byte arg2) {
        if (arg2 > -50) {
            return true;
        }
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg1, 0, arg1.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;II)Ljr;")
    public final class441 method1734(String arg0, int arg1, int arg2) {
        if (arg2 != -31887) {
            this.field3641 = null;
        }
        return this.method1725(0, arg1, arg0, -104, 1);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/net/URL;I)Ljr;")
    public final class441 method1735(URL arg0, int arg1) {
        return arg1 == -10950 ? this.method1725(0, 0, arg0, -99, 4) : null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljr;")
    public final class441 method1736(byte arg0, String arg1, Class arg2, Class[] arg3) {
        return arg0 == 10 ? this.method1725(0, 0, new Object[] { arg2, arg1, arg3 }, -117, 8) : null;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
    public final void method1737(byte arg0) {
        synchronized (this) {
            if (arg0 > -28) {
                this.method1725(108, 101, null, -126, 49);
            }
            this.field3648 = true;
            this.notifyAll();
        }
        try {
            this.field3631.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3635 != null) {
            try {
                this.field3635.method3252(0);
            } catch (IOException var7) {
            }
        }
        if (this.field3636 != null) {
            try {
                this.field3636.method3252(0);
            } catch (IOException var6) {
            }
        }
        if (this.field3653 != null) {
            for (int var3 = 0; var3 < this.field3653.length; var3++) {
                if (this.field3653[var3] != null) {
                    try {
                        this.field3653[var3].method3252(0);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3646 != null) {
            try {
                this.field3646.method3252(0);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)Z")
    public final boolean method1738(boolean arg0) {
        if (arg0) {
            this.method1736((byte) -100, null, null, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)Ljr;")
    public final class441 method1739(byte arg0) {
        if (arg0 > -88) {
            this.method1721(88, 65);
        }
        return this.method1725(0, 0, null, -110, 18);
    }

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "(B)Lkaa;")
    public final class160 method1740(byte arg0) {
        return arg0 == 51 ? this.field3629 : null;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public final File method1741(String arg0, int arg1) {
        return arg1 < 91 ? null : method1726(this.field3642, 101, arg0, this.field3647);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/lang/String;)Ljr;")
    public final class441 method1742(byte arg0, String arg1) {
        int var3 = -2 % ((-arg0 - 71) / 48);
        return this.method1725(0, 0, arg1, -110, 21);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/awt/datatransfer/Transferable;)Ljr;")
    public final class441 method1743(byte arg0, Transferable arg1) {
        return arg0 < 93 ? null : this.method1725(0, 0, arg1, -113, 19);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/awt/Frame;I)Ljr;")
    public final class441 method1744(Frame arg0, int arg1) {
        return arg1 >= -66 ? null : this.method1725(0, 0, arg0, -101, 7);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIII)Ljr;")
    public final class441 method1745(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 44) {
            this.method1738(true);
        }
        return this.method1725((arg1 << 16) + arg3, (arg4 << 16) - -arg2, null, -116, 6);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)Ljr;")
    public final class441 method1746(int arg0) {
        if (arg0 != 21690) {
            this.method1721(43, 102);
        }
        return this.method1725(0, 0, null, -99, 5);
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class279(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field3630 = "1.1";
        field3645 = "Unknown";
        this.field3642 = arg1;
        this.field3647 = arg2;
        this.field3644 = arg0;
        try {
            field3645 = System.getProperty("java.vendor");
            field3630 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3640 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3640 = "Unknown";
        }
        field3649 = field3640.toLowerCase();
        try {
            field3643 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3643 = "";
        }
        try {
            field3633 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3633 = "";
        }
        try {
            field3637 = System.getProperty("user.home");
            if (field3637 != null) {
                field3637 = field3637 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3637 == null) {
            field3637 = "~/";
        }
        try {
            this.field3632 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3651 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3651 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3652 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3652 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3648 = false;
        this.field3631 = new Thread(this);
        this.field3631.setPriority(10);
        this.field3631.setDaemon(true);
        this.field3631.start();
    }
}
