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

@OriginalClass("client!dj")
public class class288 implements Runnable {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lci;")
    private class382 field3959 = null;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Lvr;")
    public class116 field3971 = null;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "Lvr;")
    public class116 field3970 = null;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "Lci;")
    private class382 field3968 = null;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Lvr;")
    public class116 field3962 = null;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field3975 = null;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Z")
    private boolean field3961 = false;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Ljava/lang/String;")
    private String field3964;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3969;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field3979;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field3965 = 3;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field3974 = new Hashtable(16);

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "J")
    public static volatile long field3983 = 0L;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Lpn;")
    private class635 field3981;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3960;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3963;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3967;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3972;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3973;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3976;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Ljava/lang/String;")
    private static String field3978;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3980;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3982;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "[Lvr;")
    public class116[] field3966;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)Lci;")
    public final class382 method1832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 >= -105 ? null : this.method1853(null, -27332, 6, (arg1 << 16) + arg0, (arg3 << 16) + arg4);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/net/URL;I)Lci;")
    public final class382 method1833(URL arg0, int arg1) {
        if (arg1 >= -40) {
            this.field3971 = null;
        }
        return this.method1853(arg0, -27332, 4, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Lci;")
    public final class382 method1834(boolean arg0) {
        if (arg0) {
            this.method1837(null, -97);
        }
        return this.method1853(null, -27332, 18, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BLjava/io/File;B)Z")
    public final boolean method1835(byte[] arg0, File arg1, byte arg2) {
        try {
            if (arg2 != 86) {
                this.field3962 = null;
            }
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg0, 0, arg0.length);
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)Z")
    public final boolean method1836(int arg0) {
        return arg0 != 16;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public final File method1837(String arg0, int arg1) {
        if (arg1 != -8300) {
            this.run();
        }
        return method1856(106, arg0, this.field3977, this.field3964);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lpn;")
    public final class635 method1838(byte arg0) {
        if (arg0 != -119) {
            this.field3979 = null;
        }
        return this.field3981;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lci;")
    public final class382 method1839(int arg0, Transferable arg1) {
        if (arg0 != 0) {
            field3960 = null;
        }
        return this.method1853(arg1, arg0 - 27332, 19, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;ZB)Lci;")
    public final class382 method1840(String arg0, boolean arg1, byte arg2) {
        if (arg2 != 102) {
            this.method1833(null, 85);
        }
        return arg1 ? this.method1853(arg0, -27332, 12, 0, 0) : this.method1853(arg0, -27332, 13, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Lci;")
    public final class382 method1841(int arg0) {
        return arg0 < 116 ? null : this.method1853(null, -27332, 5, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Component;Z)Lci;")
    public final class382 method1842(int arg0, Component arg1, boolean arg2) {
        if (arg0 != 17038) {
            field3972 = null;
        }
        return this.method1853(arg1, -27332, 15, 0, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Ljava/lang/String;I)Lci;")
    public final class382 method1843(String arg0, int arg1) {
        return arg1 == 26573 ? this.method1853(arg0, -27332, 16, 0, 0) : null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
    public final void method1844(byte arg0) {
        synchronized (this) {
            this.field3961 = true;
            this.notifyAll();
        }
        try {
            this.field3979.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3970 != null) {
            try {
                this.field3970.method821(arg0 ^ 0x460A);
            } catch (IOException var7) {
            }
        }
        if (this.field3962 != null) {
            try {
                this.field3962.method821(17981);
            } catch (IOException var6) {
            }
        }
        if (this.field3966 != null) {
            for (int var3 = 0; var3 < this.field3966.length; var3++) {
                if (this.field3966[var3] != null) {
                    try {
                        this.field3966[var3].method821(arg0 ^ 0x460A);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3971 != null) {
            try {
                this.field3971.method821(17981);
            } catch (IOException var4) {
            }
        }
        if (arg0 != 55) {
            this.method1836(71);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
    public final void method1845(byte arg0) {
        if (arg0 != 65) {
            this.method1859(false, null, null);
        }
        field3983 = class488.method2835(arg0 + 30095) + 5000L;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Frame;)Lci;")
    public final class382 method1846(int arg0, Frame arg1) {
        if (arg0 != 7) {
            field3963 = null;
        }
        return this.method1853(arg1, -27332, 7, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)Lci;")
    public final class382 method1847(int arg0, String arg1) {
        if (arg0 != 11810) {
            this.method1843(null, 0);
        }
        return this.method1853(arg1, -27332, 21, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lci;")
    public final class382 method1848(int arg0, Runnable arg1, int arg2) {
        if (arg0 != -10) {
            this.field3970 = null;
        }
        return this.method1853(arg1, -27332, 2, 0, arg2);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)Lci;")
    public final class382 method1849(int arg0, boolean arg1) {
        if (arg1) {
            this.method1837(null, -35);
        }
        return this.method1853(null, -27332, 3, 0, arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BILjava/lang/Object;II)Lci;")
    private final class382 method1850(byte arg0, int arg1, Object arg2, int arg3, int arg4) {
        class382 var6 = new class382();
        synchronized (var6) {
            var6.field5130 = arg1;
            if (arg0 >= -13) {
                this.field3961 = false;
            }
            var6.field5135 = arg4;
            var6.field5133 = arg2;
            synchronized (this) {
                if (this.field3968 == null) {
                    this.field3968 = this.field3959 = var6;
                } else {
                    this.field3968.field5131 = var6;
                    this.field3968 = var6;
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

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;I)Lci;")
    public final class382 method1851(int arg0, String arg1, int arg2) {
        if (arg2 != 3298) {
            this.field3969 = null;
        }
        return this.method1853(arg1, -27332, 1, 0, arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public final byte[] method1852(String arg0, byte arg1) {
        class382 var3 = this.method1850((byte) -89, 21, arg0, 0, 0);
        int var4 = 13 / ((arg1 + 45) / 50);
        return (byte[]) var3.field5132;
    }

    @OriginalMember(owner = "client!dj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class382 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3961) {
                        return;
                    }
                    if (this.field3959 != null) {
                        var2 = this.field3959;
                        this.field3959 = this.field3959.field5131;
                        if (this.field3959 == null) {
                            this.field3968 = null;
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
                int var3 = var2.field5130;
                if (var3 == 1) {
                    if (field3983 > class488.method2835(30160)) {
                        throw new IOException();
                    }
                    var2.field5132 = new Socket(InetAddress.getByName((String) var2.field5133), var2.field5135);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field5133);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field5135);
                    var2.field5132 = var4;
                } else if (var3 == 4) {
                    if (class488.method2835(30160) < field3983) {
                        throw new IOException();
                    }
                    var2.field5132 = new DataInputStream(((URL) var2.field5133).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field5133;
                    var2.field5132 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var9 = (Object[]) var2.field5133;
                    var2.field5132 = ((Class) var9[0]).getDeclaredField((String) var9[1]);
                } else if (var3 == 18) {
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field5132 = var6.getContents(null);
                } else if (var3 == 19) {
                    Transferable var7 = (Transferable) var2.field5133;
                    Clipboard var8 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var8.setContents(var7, null);
                } else {
                    throw new Exception("");
                }
                var2.field5134 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field5134 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lci;")
    private final class382 method1853(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class382 var6 = new class382();
        var6.field5133 = arg0;
        var6.field5135 = arg4;
        var6.field5130 = arg2;
        synchronized (this) {
            if (arg1 != -27332) {
                field3978 = null;
            }
            if (this.field3968 == null) {
                this.field3968 = this.field3959 = var6;
            } else {
                this.field3968.field5131 = var6;
                this.field3968 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lci;")
    public final class382 method1854(Class[] arg0, String arg1, int arg2, Class arg3) {
        return arg2 == -8390 ? this.method1853(new Object[] { arg3, arg1, arg0 }, -27332, 8, 0, 0) : null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/awt/Component;I)Lci;")
    public final class382 method1855(int arg0, int arg1, Component arg2, int arg3) {
        if (arg3 == 14) {
            Point var5 = arg2.getLocationOnScreen();
            return this.method1853(null, -27332, 14, var5.y + arg0, var5.x + arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
    public static final File method1856(int arg0, String arg1, int arg2, String arg3) {
        File var4 = (File) field3974.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3978, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg1;
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
                                field3974.put(arg1, var12);
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
        if (arg0 < 55) {
            field3982 = null;
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III[ILjava/awt/Point;Ljava/awt/Component;)Lci;")
    public final class382 method1857(int arg0, int arg1, int arg2, int[] arg3, Point arg4, Component arg5) {
        if (arg0 != 17) {
            this.method1839(5, null);
        }
        return this.method1853(new Object[] { arg5, arg3, arg4 }, -27332, 17, arg1, arg2);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/Class;)V")
    public final void method1858(int arg0, Class arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field3967.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field3967.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method1837("sw3d.dll", -8300).toString());
        var5.invoke(var7, Boolean.FALSE);
        if (arg0 != -20260) {
            field3982 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lci;")
    public final class382 method1859(boolean arg0, String arg1, Class arg2) {
        if (!arg0) {
            this.method1859(false, null, null);
        }
        return this.method1853(new Object[] { arg2, arg1 }, -27332, 9, 0, 0);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class288(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field3977 = arg1;
        field3976 = "1.1";
        this.field3975 = arg0;
        field3963 = "Unknown";
        this.field3964 = arg2;
        try {
            field3963 = System.getProperty("java.vendor");
            field3976 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field3960 = System.getProperty("os.name");
        } catch (Exception var11) {
            field3960 = "Unknown";
        }
        field3967 = field3960.toLowerCase();
        try {
            field3972 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field3972 = "";
        }
        try {
            field3973 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field3973 = "";
        }
        try {
            field3978 = System.getProperty("user.home");
            if (field3978 != null) {
                field3978 = field3978 + "/";
            }
        } catch (Exception var8) {
        }
        if (field3978 == null) {
            field3978 = "~/";
        }
        try {
            this.field3969 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field3980 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3980 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field3982 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3982 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field3961 = false;
        this.field3979 = new Thread(this);
        this.field3979.setPriority(10);
        this.field3979.setDaemon(true);
        this.field3979.start();
    }
}
