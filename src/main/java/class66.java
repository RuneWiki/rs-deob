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

@OriginalClass("client!gt")
public class class66 implements Runnable {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "Lkm;")
    public class95 field1038 = null;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "Lkm;")
    public class95 field1056 = null;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Lwk;")
    private class329 field1048 = null;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "Lkm;")
    public class95 field1057 = null;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "Z")
    private boolean field1045 = false;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Lwk;")
    private class329 field1053 = null;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "Ljava/applet/Applet;")
    public Applet field1062 = null;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/lang/String;")
    private String field1055;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1058;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field1043;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field1042 = 3;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field1047 = new Hashtable(16);

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "J")
    public static volatile long field1061 = 0L;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Lik;")
    private class538 field1039;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1040;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1044;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1046;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1050;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1051;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "Ljava/lang/String;")
    private static String field1052;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1054;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1059;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1060;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "[Lkm;")
    public class95[] field1041;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Lwk;", line = 8)
    public final class329 method444(int arg0, byte arg1) {
        if (arg1 >= -126) {
            this.field1045 = false;
        }
        return this.method455((byte) -90, 3, 0, arg0, null);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Component;III)Lwk;", line = 18)
    public final class329 method445(Component arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 14) {
            this.method470(-117, null);
        }
        Point var5 = arg0.getLocationOnScreen();
        return this.method455((byte) -121, 14, var5.y + arg2, var5.x + arg3, null);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/net/URL;I)Lwk;", line = 31)
    public final class329 method446(URL arg0, int arg1) {
        return arg1 == 19779 ? this.method455((byte) -22, 4, 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Z", line = 43)
    public final boolean method447(int arg0) {
        if (arg0 <= 88) {
            field1061 = 79L;
        }
        return false;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Runnable;B)Lwk;", line = 59)
    public final class329 method448(int arg0, Runnable arg1, byte arg2) {
        return arg2 < 71 ? null : this.method455((byte) -21, 2, 0, arg0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/Class;)Lwk;", line = 71)
    public final class329 method449(int arg0, Class arg1) {
        return arg0 == 26530 ? this.method455((byte) -90, 11, 0, 0, arg1) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Class;I)V", line = 83)
    public final void method450(Class arg0, int arg1) throws Exception {
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field1054.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg0, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        if (arg1 != 18238) {
            this.method452(null, -29);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field1054.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg0, this.method468("sw3d.dll", (byte) 126).toString());
        var5.invoke(var7, Boolean.FALSE);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)Lik;", line = 126)
    public final class538 method451(boolean arg0) {
        if (arg0) {
            this.method451(false);
        }
        return this.field1039;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)Lwk;", line = 140)
    public final class329 method452(String arg0, int arg1) {
        if (arg1 <= 61) {
            this.method468(null, (byte) 121);
        }
        return this.method455((byte) -8, 21, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/Frame;B)Lwk;", line = 152)
    public final class329 method453(Frame arg0, byte arg1) {
        if (arg1 != -21) {
            this.field1043 = null;
        }
        return this.method455((byte) -119, 7, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Ljava/io/File;", line = 163)
    public static final File method454(int arg0, String arg1, String arg2, int arg3) {
        File var4 = (File) field1047.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1052, "/tmp/", "" };
        if (arg0 != -9) {
            method454(7, null, null, -25);
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
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
                                field1047.put(arg1, var12);
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

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIIILjava/lang/Object;)Lwk;", line = 252)
    private final class329 method455(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        class329 var6 = new class329();
        if (arg0 >= -1) {
            return null;
        }
        var6.field4973 = arg3;
        var6.field4971 = arg1;
        var6.field4976 = arg4;
        synchronized (this) {
            if (this.field1053 == null) {
                this.field1053 = this.field1048 = var6;
            } else {
                this.field1053.field4972 = var6;
                this.field1053 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Ljava/lang/String;I)Lwk;", line = 284)
    public final class329 method456(String arg0, int arg1) {
        return arg1 == 0 ? this.method455((byte) -86, 16, 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;I)Lwk;", line = 294)
    public final class329 method457(Transferable arg0, int arg1) {
        return arg1 == -10606 ? this.method455((byte) -79, 19, 0, 0, arg0) : null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)Lwk;", line = 304)
    public final class329 method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 >= -101 ? null : this.method455((byte) -53, 6, (arg0 << 16) + arg4, (arg3 << 16) + arg1, null);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 318)
    public final void method459(byte arg0) {
        int var2 = -52 % ((57 - arg0) / 57);
        synchronized (this) {
            this.field1045 = true;
            this.notifyAll();
        }
        try {
            this.field1043.join();
        } catch (InterruptedException var9) {
        }
        if (this.field1057 != null) {
            try {
                this.field1057.method800(false);
            } catch (IOException var8) {
            }
        }
        if (this.field1056 != null) {
            try {
                this.field1056.method800(false);
            } catch (IOException var7) {
            }
        }
        if (this.field1041 != null) {
            for (int var4 = 0; var4 < this.field1041.length; var4++) {
                if (this.field1041[var4] != null) {
                    try {
                        this.field1041[var4].method800(false);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field1038 != null) {
            try {
                this.field1038.method800(false);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILjava/lang/String;)Lwk;", line = 374)
    public final class329 method460(int arg0, int arg1, String arg2) {
        if (arg1 != 10503) {
            this.method463(null, null, 66, null);
        }
        return this.method455((byte) -58, 1, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZLjava/awt/Component;I)Lwk;", line = 384)
    public final class329 method461(boolean arg0, Component arg1, int arg2) {
        if (arg2 <= 26) {
            this.method469(76);
        }
        return this.method455((byte) -16, 15, 0, arg0 ? 1 : 0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[IILjava/awt/Component;ILjava/awt/Point;)Lwk;", line = 396)
    public final class329 method462(int arg0, int[] arg1, int arg2, Component arg3, int arg4, Point arg5) {
        if (arg0 != 17) {
            this.method470(-74, null);
        }
        return this.method455((byte) -119, 17, arg4, arg2, new Object[] { arg3, arg1, arg5 });
    }

    @OriginalMember(owner = "client!gt", name = "run", descriptor = "()V", line = 414)
    public final void run() {
        while (true) {
            class329 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1045) {
                        return;
                    }
                    if (this.field1048 != null) {
                        var2 = this.field1048;
                        this.field1048 = this.field1048.field4972;
                        if (this.field1048 == null) {
                            this.field1053 = null;
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
                int var3 = var2.field4971;
                if (var3 == 1) {
                    if (field1061 > class375.method2397((byte) -75)) {
                        throw new IOException();
                    }
                    var2.field4975 = new Socket(InetAddress.getByName((String) var2.field4976), var2.field4973);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4976);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4973);
                    var2.field4975 = var4;
                } else if (var3 == 4) {
                    if (field1061 > class375.method2397((byte) -75)) {
                        throw new IOException();
                    }
                    var2.field4975 = new DataInputStream(((URL) var2.field4976).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field4976;
                    var2.field4975 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field4976;
                    var2.field4975 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field4975 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var8 = (Transferable) var2.field4976;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, null);
                } else {
                    throw new Exception("");
                }
                var2.field4974 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field4974 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;ILjava/lang/Class;)Lwk;", line = 534)
    public final class329 method463(String arg0, Class[] arg1, int arg2, Class arg3) {
        if (arg2 != 2) {
            this.field1049 = -15;
        }
        return this.method455((byte) -37, 8, 0, 0, new Object[] { arg3, arg0, arg1 });
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILjava/lang/Object;Z)Lwk;", line = 544)
    private final class329 method464(int arg0, int arg1, int arg2, Object arg3, boolean arg4) {
        class329 var6 = new class329();
        synchronized (var6) {
            var6.field4971 = arg1;
            var6.field4973 = arg0;
            var6.field4976 = arg3;
            synchronized (this) {
                if (arg4) {
                    this.field1049 = -55;
                }
                if (this.field1053 == null) {
                    this.field1053 = this.field1048 = var6;
                } else {
                    this.field1053.field4972 = var6;
                    this.field1053 = var6;
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

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lwk;", line = 580)
    public final class329 method465(Class arg0, String arg1, int arg2) {
        return arg2 == 10000 ? this.method455((byte) -81, 9, 0, 0, new Object[] { arg0, arg1 }) : null;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lwk;", line = 591)
    public final class329 method466(int arg0) {
        if (arg0 != -15864) {
            field1052 = null;
        }
        return this.method455((byte) -50, 5, 0, 0, null);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)V", line = 602)
    public final void method467(boolean arg0) {
        if (arg0) {
            field1061 = class375.method2397((byte) -75) + 5000L;
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 707)
    public class66(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field1049 = arg1;
        field1046 = "1.1";
        this.field1055 = arg2;
        field1040 = "Unknown";
        this.field1062 = arg0;
        try {
            field1040 = System.getProperty("java.vendor");
            field1046 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field1051 = System.getProperty("os.name");
        } catch (Exception var11) {
            field1051 = "Unknown";
        }
        field1054 = field1051.toLowerCase();
        try {
            field1044 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field1044 = "";
        }
        try {
            field1050 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field1050 = "";
        }
        try {
            field1052 = System.getProperty("user.home");
            if (field1052 != null) {
                field1052 = field1052 + "/";
            }
        } catch (Exception var8) {
        }
        if (field1052 == null) {
            field1052 = "~/";
        }
        try {
            this.field1058 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field1059 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1059 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field1060 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1060 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field1045 = false;
        this.field1043 = new Thread(this);
        this.field1043.setPriority(10);
        this.field1043.setDaemon(true);
        this.field1043.start();
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/io/File;", line = 627)
    public final File method468(String arg0, byte arg1) {
        return arg1 == 126 ? method454(-9, arg0, this.field1055, this.field1049) : null;
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Lwk;", line = 637)
    public final class329 method469(int arg0) {
        if (arg0 != 18) {
            this.method456(null, -5);
        }
        return this.method455((byte) -17, 18, 0, 0, null);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(ILjava/lang/Class;)Lwk;", line = 647)
    public final class329 method470(int arg0, Class arg1) {
        if (arg0 >= -38) {
            this.method462(117, null, 44, null, -29, null);
        }
        return this.method455((byte) -105, 20, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 667)
    public final byte[] method471(int arg0, String arg1) {
        class329 var3 = this.method464(0, 21, 0, arg1, false);
        if (arg0 < 47) {
            field1047 = null;
        }
        return (byte[]) var3.field4975;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;ZB)Lwk;", line = 687)
    public final class329 method472(String arg0, boolean arg1, byte arg2) {
        if (arg2 == 12) {
            return arg1 ? this.method455((byte) -3, 12, 0, 0, arg0) : this.method455((byte) -75, 13, 0, 0, arg0);
        } else {
            return null;
        }
    }
}
