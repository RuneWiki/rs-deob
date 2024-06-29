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

@OriginalClass("client!ae")
public class class40 implements Runnable {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lei;")
    private class329 field546 = null;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field549 = null;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Lfca;")
    public class135 field557 = null;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lfca;")
    public class135 field563 = null;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lei;")
    private class329 field543 = null;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lfca;")
    public class135 field551 = null;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Z")
    private boolean field553 = false;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Ljava/lang/String;")
    private String field558;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field556;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Ljava/lang/Thread;")
    private Thread field555;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field554 = 3;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field545 = new Hashtable(16);

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "J")
    public static volatile long field566 = 0L;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Ltba;")
    private class647 field559;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/lang/String;")
    public static String field544;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Ljava/lang/String;")
    private static String field548;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Ljava/lang/String;")
    public static String field550;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Ljava/lang/String;")
    public static String field560;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Ljava/lang/String;")
    public static String field561;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Ljava/lang/String;")
    public static String field562;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Ljava/lang/String;")
    public static String field564;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field565;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field567;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[Lfca;")
    public class135[] field547;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public final void method345(int arg0) {
        if (arg0 == -16733) {
            field566 = class508.method2860(false) + 5000L;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;)Lei;")
    public final class329 method346(int arg0, String arg1) {
        return arg0 == -7113 ? this.method367(true, 21, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;I)Lei;")
    public final class329 method347(int arg0, String arg1, int arg2) {
        if (arg0 != 2471) {
            this.method361(null, -29, false);
        }
        return this.method367(true, 1, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/net/URL;)Lei;")
    public final class329 method348(int arg0, URL arg1) {
        return arg0 == 17746 ? this.method367(true, 4, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILjava/lang/Object;II)Lei;")
    private final class329 method349(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class329 var6 = new class329();
        synchronized (var6) {
            var6.field4736 = arg2;
            var6.field4738 = arg4;
            var6.field4740 = arg1;
            synchronized (this) {
                int var9 = 19 / ((arg3 + 5) / 62);
                if (this.field543 == null) {
                    this.field543 = this.field546 = var6;
                } else {
                    this.field543.field4741 = var6;
                    this.field543 = var6;
                }
                this.notify();
            }
            try {
                var6.wait();
            } catch (InterruptedException var10) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
    public final boolean method350(int arg0) {
        if (arg0 >= -37) {
            this.field557 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIBII)Lei;")
    public final class329 method351(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 >= -38) {
            field560 = null;
        }
        return this.method367(true, 6, (arg3 << 16) + arg4, (arg0 << 16) + arg1, null);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;I[Ljava/lang/Class;Ljava/lang/String;)Lei;")
    public final class329 method352(Class arg0, int arg1, Class[] arg2, String arg3) {
        if (arg1 >= -13) {
            this.method350(3);
        }
        return this.method367(true, 8, 0, 0, new Object[] { arg0, arg3, arg2 });
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Lei;")
    public final class329 method353(Runnable arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method345(-76);
        }
        return this.method367(true, 2, arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Lei;")
    public final class329 method354(int arg0, int arg1) {
        if (arg1 != -21666) {
            this.method361(null, 56, true);
        }
        return this.method367(true, 3, arg0, 0, null);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[ILjava/awt/Point;Ljava/awt/Component;II)Lei;")
    public final class329 method355(int arg0, int[] arg1, Point arg2, Component arg3, int arg4, int arg5) {
        int var7 = 86 / ((arg4 + 11) / 44);
        return this.method367(true, 17, arg0, arg5, new Object[] { arg3, arg1, arg2 });
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(ILjava/lang/String;)Lei;")
    public final class329 method356(int arg0, String arg1) {
        if (arg0 != -14714) {
            this.field547 = null;
        }
        return this.method367(true, 16, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Lei;")
    public final class329 method357(byte arg0) {
        if (arg0 > -71) {
            field545 = null;
        }
        return this.method367(true, 5, 0, 0, null);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;")
    public static final File method358(String arg0, String arg1, int arg2, byte arg3) {
        File var4 = (File) field545.get(arg0);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field548, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        if (arg3 != 76) {
            return null;
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg1 == null ? "" : arg1 + "/") + arg0;
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
                                field545.put(arg0, var12);
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

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Frame;I)Lei;")
    public final class329 method359(Frame arg0, int arg1) {
        if (arg1 != 0) {
            method358(null, null, 94, (byte) 75);
        }
        return this.method367(true, 7, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public final void method360(int arg0) {
        synchronized (this) {
            this.field553 = true;
            this.notifyAll();
        }
        try {
            if (arg0 != 0) {
                this.method365(null, 72, (byte) 27, 45);
            }
            this.field555.join();
        } catch (InterruptedException var8) {
        }
        if (this.field551 != null) {
            try {
                this.field551.method1036(arg0 ^ 0x54);
            } catch (IOException var7) {
            }
        }
        if (this.field563 != null) {
            try {
                this.field563.method1036(78);
            } catch (IOException var6) {
            }
        }
        if (this.field547 != null) {
            for (int var3 = 0; var3 < this.field547.length; var3++) {
                if (this.field547[var3] != null) {
                    try {
                        this.field547[var3].method1036(115);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field557 != null) {
            try {
                this.field557.method1036(-72);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lei;")
    public final class329 method361(Component arg0, int arg1, boolean arg2) {
        int var4 = 118 % ((arg1 + 30) / 59);
        return this.method367(true, 15, arg2 ? 1 : 0, 0, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Lei;")
    public final class329 method362(int arg0) {
        if (arg0 != 18) {
            this.field549 = null;
        }
        return this.method367(true, 18, 0, 0, null);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
    public final boolean method363(File arg0, int arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg0);
            var4.write(arg2, 0, arg2.length);
            if (arg1 < 33) {
                this.method352(null, -18, null, null);
            }
            var4.close();
            return true;
        } catch (IOException var5) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;B)Lei;")
    public final class329 method364(boolean arg0, String arg1, byte arg2) {
        if (arg2 != 68) {
            this.field547 = null;
        }
        return arg0 ? this.method367(true, 12, 0, 0, arg1) : this.method367(true, 13, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;IBI)Lei;")
    public final class329 method365(Component arg0, int arg1, byte arg2, int arg3) {
        Point var5 = arg0.getLocationOnScreen();
        return arg2 > -42 ? null : this.method367(true, 14, var5.x + arg1, var5.y + arg3, null);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;Z)Lei;")
    public final class329 method366(Transferable arg0, boolean arg1) {
        if (arg1) {
            field564 = null;
        }
        return this.method367(true, 19, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIILjava/lang/Object;)Lei;")
    private final class329 method367(boolean arg0, int arg1, int arg2, int arg3, Object arg4) {
        if (!arg0) {
            this.field543 = null;
        }
        class329 var6 = new class329();
        var6.field4740 = arg1;
        var6.field4738 = arg2;
        var6.field4736 = arg4;
        synchronized (this) {
            if (this.field543 == null) {
                this.field543 = this.field546 = var6;
            } else {
                this.field543.field4741 = var6;
                this.field543 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lei;")
    public final class329 method368(Class arg0, byte arg1, String arg2) {
        return arg1 == 60 ? this.method367(true, 9, 0, 0, new Object[] { arg0, arg2 }) : null;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Ltba;")
    public final class647 method369(int arg0) {
        int var2 = -62 / ((25 - arg0) / 40);
        return this.field559;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;B)V")
    public final void method370(Class arg0, byte arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field564.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        if (arg1 != 61) {
            this.method345(-92);
        }
        var5.invoke(var7, Boolean.TRUE);
        if (!field564.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method371("sw3d.dll", 1).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
    public final File method371(String arg0, int arg1) {
        int var3 = 82 % ((-arg1 - 62) / 43);
        return method358(arg0, this.field558, this.field552, (byte) 76);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjava/lang/String;)[B")
    public final byte[] method372(boolean arg0, String arg1) {
        if (arg0) {
            class329 var3 = this.method349(0, 21, arg1, 115, 0);
            return (byte[]) var3.field4737;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class329 var2;
            synchronized (this) {
                while (true) {
                    if (this.field553) {
                        return;
                    }
                    if (this.field546 != null) {
                        var2 = this.field546;
                        this.field546 = this.field546.field4741;
                        if (this.field546 == null) {
                            this.field543 = null;
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
                int var3 = var2.field4740;
                if (var3 == 1) {
                    if (class508.method2860(false) < field566) {
                        throw new IOException();
                    }
                    var2.field4737 = new Socket(InetAddress.getByName((String) var2.field4736), var2.field4738);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4736);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4738);
                    var2.field4737 = var4;
                } else if (var3 == 4) {
                    if (class508.method2860(false) < field566) {
                        throw new IOException();
                    }
                    var2.field4737 = new DataInputStream(((URL) var2.field4736).openStream());
                } else if (var3 == 8) {
                    Object[] var9 = (Object[]) var2.field4736;
                    var2.field4737 = ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                } else if (var3 == 9) {
                    Object[] var8 = (Object[]) var2.field4736;
                    var2.field4737 = ((Class) var8[0]).getDeclaredField((String) var8[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4737 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field4736;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field4739 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4739 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
    public class40(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        field560 = "Unknown";
        this.field558 = arg2;
        this.field552 = arg1;
        field562 = "1.1";
        this.field549 = arg0;
        try {
            field560 = System.getProperty("java.vendor");
            field562 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field544 = System.getProperty("os.name");
        } catch (Exception var11) {
            field544 = "Unknown";
        }
        field564 = field544.toLowerCase();
        try {
            field561 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field561 = "";
        }
        try {
            field550 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field550 = "";
        }
        try {
            field548 = System.getProperty("user.home");
            if (field548 != null) {
                field548 = field548 + "/";
            }
        } catch (Exception var8) {
        }
        if (field548 == null) {
            field548 = "~/";
        }
        try {
            this.field556 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field565 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field565 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field567 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field567 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field553 = false;
        this.field555 = new Thread(this);
        this.field555.setPriority(10);
        this.field555.setDaemon(true);
        this.field555.start();
    }
}
