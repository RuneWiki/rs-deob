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

@OriginalClass("client!qn")
public class class44 implements Runnable {

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Z")
    private boolean field653 = false;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "Lde;")
    public class353 field665 = null;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "Lit;")
    private class439 field666 = null;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "Ljava/applet/Applet;")
    public Applet field668 = null;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Lde;")
    public class353 field657 = null;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "Lit;")
    private class439 field672 = null;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Lde;")
    public class353 field673 = null;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Ljava/lang/String;")
    private String field652;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field656;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "Ljava/lang/Thread;")
    private Thread field671;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field670 = 3;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field664 = new Hashtable(16);

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "J")
    public static volatile long field675 = 0L;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Lcd;")
    private class197 field654;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field655;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field659;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Ljava/lang/String;")
    public static String field660;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "Ljava/lang/String;")
    private static String field662;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Ljava/lang/String;")
    public static String field663;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Ljava/lang/String;")
    public static String field667;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "Ljava/lang/String;")
    public static String field669;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field674;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field676;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "[Lde;")
    public class353[] field658;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)Lit;", line = 4)
    public final class439 method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 17659) {
            field676 = null;
        }
        return this.method334((arg3 << 16) + arg1, null, 6, (arg4 << 16) + arg2, (byte) -46);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLjava/awt/datatransfer/Transferable;)Lit;", line = 16)
    public final class439 method321(boolean arg0, Transferable arg1) {
        if (arg0) {
            this.field652 = null;
        }
        return this.method334(0, arg1, 19, 0, (byte) -24);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lit;", line = 30)
    public final class439 method322(String arg0, Class arg1, int arg2) {
        if (arg2 != 0) {
            field674 = null;
        }
        return this.method334(0, new Object[] { arg1, arg0 }, 9, 0, (byte) -47);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/awt/Frame;)Lit;", line = 44)
    public final class439 method323(byte arg0, Frame arg1) {
        return arg0 == 25 ? this.method334(0, arg1, 7, 0, (byte) -20) : null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Class;Z)Lit;", line = 54)
    public final class439 method324(Class arg0, boolean arg1) {
        if (arg1) {
            this.method344(77, -40, 106, null);
        }
        return this.method334(0, arg0, 11, 0, (byte) -28);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Lit;", line = 64)
    public final class439 method325(int arg0, int arg1) {
        if (arg0 != 0) {
            field659 = null;
        }
        return this.method334(0, null, 3, arg1, (byte) -106);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Z)Lit;", line = 78)
    public final class439 method326(String arg0, boolean arg1) {
        if (arg1) {
            this.method340((byte) 68, null);
        }
        return this.method334(0, arg0, 16, 0, (byte) -117);
    }

    @OriginalMember(owner = "client!qn", name = "run", descriptor = "()V", line = 88)
    public final void run() {
        while (true) {
            class439 var2;
            synchronized (this) {
                while (true) {
                    if (this.field653) {
                        return;
                    }
                    if (this.field666 != null) {
                        var2 = this.field666;
                        this.field666 = this.field666.field6418;
                        if (this.field666 == null) {
                            this.field672 = null;
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
                int var3 = var2.field6413;
                if (var3 == 1) {
                    if (class109.method653(false) < field675) {
                        throw new IOException();
                    }
                    var2.field6416 = new Socket(InetAddress.getByName((String) var2.field6415), var2.field6414);
                } else if (var3 == 2) {
                    Thread var9 = new Thread((Runnable) var2.field6415);
                    var9.setDaemon(true);
                    var9.start();
                    var9.setPriority(var2.field6414);
                    var2.field6416 = var9;
                } else if (var3 == 4) {
                    if (field675 > class109.method653(false)) {
                        throw new IOException();
                    }
                    var2.field6416 = new DataInputStream(((URL) var2.field6415).openStream());
                } else if (var3 == 8) {
                    Object[] var8 = (Object[]) var2.field6415;
                    var2.field6416 = ((Class) var8[0]).getDeclaredMethod((String) var8[1], (Class[]) var8[2]);
                } else if (var3 == 9) {
                    Object[] var4 = (Object[]) var2.field6415;
                    var2.field6416 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field6416 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var5 = (Transferable) var2.field6415;
                    Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var6.setContents(var5, null);
                } else {
                    throw new Exception("");
                }
                var2.field6417 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field6417 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V", line = 209)
    public final void method327(boolean arg0) {
        field675 = class109.method653(!arg0) + 5000L;
        if (!arg0) {
            this.method331(105);
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 651)
    public class44(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field652 = arg2;
        field659 = "Unknown";
        this.field661 = arg1;
        this.field668 = arg0;
        field669 = "1.1";
        try {
            field659 = System.getProperty("java.vendor");
            field669 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field655 = System.getProperty("os.name");
        } catch (Exception var11) {
            field655 = "Unknown";
        }
        field660 = field655.toLowerCase();
        try {
            field663 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field663 = "";
        }
        try {
            field667 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field667 = "";
        }
        try {
            field662 = System.getProperty("user.home");
            if (field662 != null) {
                field662 = field662 + "/";
            }
        } catch (Exception var8) {
        }
        if (field662 == null) {
            field662 = "~/";
        }
        try {
            this.field656 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field674 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field674 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field676 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field676 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field653 = false;
        this.field671 = new Thread(this);
        this.field671.setPriority(10);
        this.field671.setDaemon(true);
        this.field671.start();
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lit;", line = 228)
    private final class439 method328(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class439 var6 = new class439();
        synchronized (var6) {
            var6.field6415 = arg0;
            if (arg3 >= -10) {
                this.method320(34, -19, 125, 59, 112);
            }
            var6.field6414 = arg2;
            var6.field6413 = arg4;
            synchronized (this) {
                if (this.field672 == null) {
                    this.field672 = this.field666 = var6;
                } else {
                    this.field672.field6418 = var6;
                    this.field672 = var6;
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

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[IILjava/awt/Component;ILjava/awt/Point;)Lit;", line = 265)
    public final class439 method329(int arg0, int[] arg1, int arg2, Component arg3, int arg4, Point arg5) {
        int var7 = -40 / ((6 - arg2) / 58);
        return this.method334(arg4, new Object[] { arg3, arg1, arg5 }, 17, arg0, (byte) -96);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 274)
    public final byte[] method330(String arg0, int arg1) {
        if (arg1 < 49) {
            this.field666 = null;
        }
        class439 var3 = this.method328(arg0, 0, 0, -50, 21);
        return (byte[]) var3.field6416;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 287)
    public final void method331(int arg0) {
        synchronized (this) {
            this.field653 = true;
            this.notifyAll();
        }
        try {
            this.field671.join();
        } catch (InterruptedException var8) {
        }
        if (this.field657 != null) {
            try {
                this.field657.method2141(-98);
            } catch (IOException var7) {
            }
        }
        if (this.field673 != null) {
            try {
                this.field673.method2141(-126);
            } catch (IOException var6) {
            }
        }
        if (this.field658 != null) {
            for (int var3 = 0; var3 < this.field658.length; var3++) {
                if (this.field658[var3] != null) {
                    try {
                        this.field658[var3].method2141(-58);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 <= 62) {
            this.method328(null, -108, 72, 21, -27);
        }
        if (this.field665 != null) {
            try {
                this.field665.method2141(-108);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lit;", line = 341)
    public final class439 method332(Runnable arg0, int arg1, int arg2) {
        return arg1 == 2 ? this.method334(0, arg0, 2, arg2, (byte) -17) : null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBLjava/lang/String;)Lit;", line = 354)
    public final class439 method333(int arg0, byte arg1, String arg2) {
        if (arg1 != 111) {
            this.method339(null, null, 98, null);
        }
        return this.method334(0, arg2, 1, arg0, (byte) -60);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lit;", line = 365)
    private final class439 method334(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        class439 var6 = new class439();
        if (arg4 > -12) {
            this.method336(9);
        }
        var6.field6415 = arg1;
        var6.field6413 = arg2;
        var6.field6414 = arg3;
        synchronized (this) {
            if (this.field672 == null) {
                this.field672 = this.field666 = var6;
            } else {
                this.field672.field6418 = var6;
                this.field672 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Lit;", line = 396)
    public final class439 method335(byte arg0) {
        return arg0 == 59 ? this.method334(0, null, 18, 0, (byte) -127) : null;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)Lcd;", line = 412)
    public final class197 method336(int arg0) {
        if (arg0 > -26) {
            this.field661 = 18;
        }
        return this.field654;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;B)Lit;", line = 422)
    public final class439 method337(String arg0, byte arg1) {
        int var3 = -123 / ((52 - arg1) / 58);
        return this.method334(0, arg0, 21, 0, (byte) -87);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Z", line = 433)
    public final boolean method338(byte arg0) {
        if (arg0 != 54) {
            this.field661 = -36;
        }
        return false;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Class;)Lit;", line = 449)
    public final class439 method339(Class[] arg0, String arg1, int arg2, Class arg3) {
        if (arg2 != 1983) {
            this.field666 = null;
        }
        return this.method334(0, new Object[] { arg3, arg1, arg0 }, 8, 0, (byte) -113);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLjava/net/URL;)Lit;", line = 462)
    public final class439 method340(byte arg0, URL arg1) {
        return arg0 == 2 ? this.method334(0, arg1, 4, 0, (byte) -42) : null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZBLjava/awt/Component;)Lit;", line = 484)
    public final class439 method341(boolean arg0, byte arg1, Component arg2) {
        if (arg1 != 3) {
            field655 = null;
        }
        return this.method334(0, arg2, 15, arg0 ? 1 : 0, (byte) -96);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Class;B)Lit;", line = 494)
    public final class439 method342(Class arg0, byte arg1) {
        if (arg1 < 63) {
            this.method340((byte) -73, null);
        }
        return this.method334(0, arg0, 20, 0, (byte) -42);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)Lit;", line = 507)
    public final class439 method343(int arg0, String arg1) {
        return arg0 == 14 ? this.method334(0, arg1, 12, 0, (byte) -109) : null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILjava/awt/Component;)Lit;", line = 518)
    public final class439 method344(int arg0, int arg1, int arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        int var6 = -24 / ((-arg0 - 38) / 41);
        return this.method334(var5.y + arg1, null, 14, arg2 + var5.x, (byte) -121);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 535)
    public final File method345(int arg0, String arg1) {
        return arg0 == 0 ? method346(this.field652, arg1, this.field661, (byte) 104) : null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;", line = 545)
    public static final File method346(String arg0, String arg1, int arg2, byte arg3) {
        int var4 = 97 / ((arg3 + 55) / 57);
        File var5 = (File) field664.get(arg1);
        if (var5 != null) {
            return var5;
        }
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field662, "/tmp/", "" };
        String[] var7 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var6.length; var10++) {
                    String var11 = var6[var10] + var7[var9] + "/" + (arg0 == null ? "" : arg0 + "/") + arg1;
                    RandomAccessFile var12 = null;
                    try {
                        File var13 = new File(var11);
                        if (var8 != 0 || var13.exists()) {
                            String var14 = var6[var10];
                            if (var8 != 1 || var14.length() <= 0 || (new File(var14)).exists()) {
                                (new File(var6[var10] + var7[var9])).mkdir();
                                if (arg0 != null) {
                                    (new File(var6[var10] + var7[var9] + "/" + arg0)).mkdir();
                                }
                                var12 = new RandomAccessFile(var13, "rw");
                                int var15 = var12.read();
                                var12.seek(0L);
                                var12.write(var15);
                                var12.seek(0L);
                                var12.close();
                                field664.put(arg1, var13);
                                return var13;
                            }
                        }
                    } catch (Exception var18) {
                        try {
                            if (var12 != null) {
                                var12.close();
                                Object var16 = null;
                            }
                        } catch (Exception var17) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)Lit;", line = 636)
    public final class439 method347(int arg0) {
        if (arg0 != 29756) {
            this.run();
        }
        return this.method334(0, null, 5, 0, (byte) -120);
    }
}
