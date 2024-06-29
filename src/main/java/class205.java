import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class205 implements Runnable {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lh;")
    private class139 field3680 = null;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lh;")
    private class139 field3682 = null;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Lhe;")
    public class191 field3689 = null;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lhe;")
    public class191 field3693 = null;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lhe;")
    public class191 field3690 = null;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Z")
    private boolean field3685 = false;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "Ljava/io/File;")
    private File field3695 = null;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Ljava/io/File;")
    public File field3698 = null;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field3696 = null;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3679;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field3688;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field3681 = 3;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "J")
    public static long field3686 = Long.MAX_VALUE;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Li;")
    private class257 field3692;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3683;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3687;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3697;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Ljava/lang/String;")
    private static String field3699;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3684;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3691;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "[Lhe;")
    public class191[] field3694;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Lh;")
    public final class139 method1390(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method1399(false);
        }
        return this.method1400(0, (byte) 0, null, arg1, 3);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/net/URL;I)Lh;")
    public final class139 method1391(URL arg0, int arg1) {
        if (arg1 != -15586) {
            field3684 = null;
        }
        return this.method1400(0, (byte) 0, arg0, 0, 4);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/Class;I)Lh;")
    public final class139 method1392(Class arg0, int arg1) {
        return arg1 == 13 ? this.method1400(0, (byte) 0, arg0, 0, 13) : null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)Lh;")
    public final class139 method1393(int arg0, String arg1) {
        return arg0 == 0 ? this.method1400(0, (byte) 0, arg1, 0, 12) : null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/Class;)Lh;")
    public final class139 method1394(byte arg0, Class arg1) {
        if (arg0 != 64) {
            field3699 = null;
        }
        return this.method1400(0, (byte) 0, arg1, 0, 11);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIILjava/lang/String;)V")
    private final void method1395(int arg0, int arg1, int arg2, String arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3699, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    try {
                        String var10 = var5[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var6[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field3693 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3693 = new class191(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field3693 = null;
                            }
                        }
                        if (this.field3695 == null) {
                            try {
                                File var14 = new File(var11, arg3);
                                if (var7 == 1 && !var14.exists()) {
                                    boolean var15 = var14.mkdir();
                                    if (!var15) {
                                        continue;
                                    }
                                }
                                File var16 = new File(var14, "main_file_cache.dat2");
                                if (var7 == 0 && !var16.exists()) {
                                    continue;
                                }
                                this.field3689 = new class191(var16, "rw", 104857600L);
                                this.field3694 = new class191[arg0];
                                for (int var17 = 0; var17 < arg0; var17++) {
                                    this.field3694[var17] = new class191(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3690 = new class191(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3698 = this.field3695 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field3689.method1263(127);
                                    for (int var18 = 0; var18 < arg0; var18++) {
                                        this.field3694[var18].method1263(arg1 + 862);
                                    }
                                    this.field3690.method1263(arg1 ^ 0xFFFFFD66);
                                } catch (Exception var19) {
                                }
                                this.field3694 = null;
                                this.field3689 = this.field3690 = null;
                                this.field3698 = this.field3695 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field3693 != null && this.field3695 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3695 == null) {
            throw new RuntimeException();
        } else if (arg1 != -749) {
            this.method1396(-87);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method1396(int arg0) {
        synchronized (this) {
            this.field3685 = true;
            this.notifyAll();
        }
        try {
            this.field3688.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3689 != null) {
            try {
                this.field3689.method1263(117);
            } catch (IOException var7) {
            }
        }
        if (this.field3690 != null) {
            try {
                this.field3690.method1263(125);
            } catch (IOException var6) {
            }
        }
        if (this.field3694 != null) {
            for (int var3 = 0; var3 < this.field3694.length; var3++) {
                if (this.field3694[var3] != null) {
                    try {
                        this.field3694[var3].method1263(127);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3693 != null) {
            try {
                this.field3693.method1263(127);
            } catch (IOException var4) {
            }
        }
        if (arg0 != -24464) {
            this.method1396(124);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBLjava/lang/String;)Lh;")
    public final class139 method1397(int arg0, byte arg1, String arg2) {
        return arg1 == -40 ? this.method1400(0, (byte) 0, arg2, arg0, 1) : null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILjava/lang/Runnable;)Lh;")
    public final class139 method1398(int arg0, int arg1, Runnable arg2) {
        if (arg1 != 0) {
            this.method1401(null, null, null, 124);
        }
        return this.method1400(0, (byte) 0, arg2, arg0, 2);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)Li;")
    public final class257 method1399(boolean arg0) {
        if (arg0) {
            this.method1394((byte) -108, null);
        }
        return this.field3692;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBLjava/lang/Object;II)Lh;")
    private final class139 method1400(int arg0, byte arg1, Object arg2, int arg3, int arg4) {
        class139 var6 = new class139();
        if (arg1 != 0) {
            this.method1395(74, 34, -107, null);
        }
        var6.field2136 = arg4;
        var6.field2138 = arg2;
        var6.field2139 = arg3;
        synchronized (this) {
            if (this.field3680 == null) {
                this.field3680 = this.field3682 = var6;
            } else {
                this.field3680.field2137 = var6;
                this.field3680 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;I)Lh;")
    public final class139 method1401(Class arg0, String arg1, Class[] arg2, int arg3) {
        if (arg3 != 13) {
            field3687 = null;
        }
        return this.method1400(0, (byte) 0, new Object[] { arg0, arg1, arg2 }, 0, 8);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lh;")
    public final class139 method1402(String arg0, int arg1, Class arg2) {
        if (arg1 != 4631) {
            field3686 = 14L;
        }
        return this.method1400(0, (byte) 0, new Object[] { arg2, arg0 }, 0, 9);
    }

    @OriginalMember(owner = "client!lj", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class139 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3685) {
                        return;
                    }
                    if (this.field3682 != null) {
                        var2 = this.field3682;
                        this.field3682 = this.field3682.field2137;
                        if (this.field3682 == null) {
                            this.field3680 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            try {
                int var3 = var2.field2136;
                if (var3 == 1) {
                    var2.field2135 = new Socket(InetAddress.getByName((String) var2.field2138), var2.field2139);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2138);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2139);
                    var2.field2135 = var4;
                } else if (var3 == 4) {
                    var2.field2135 = new DataInputStream(((URL) var2.field2138).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field2138;
                    var2.field2135 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2138;
                    var2.field2135 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2140 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2140 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class205(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3683 = "Unknown";
        field3697 = "1.1";
        this.field3696 = arg1;
        try {
            field3683 = System.getProperty("java.vendor");
            field3697 = System.getProperty("java.version");
        } catch (Exception var13) {
        }
        try {
            field3687 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var12) {
            field3687 = "unknown";
        }
        try {
            field3699 = System.getProperty("user.home");
            if (field3699 != null) {
                field3699 = field3699 + "/";
            }
        } catch (Exception var11) {
        }
        if (field3699 == null) {
            field3699 = "~/";
        }
        try {
            this.field3679 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var10) {
        }
        try {
            if (arg1 == null) {
                field3684 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3684 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field3691 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3691 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        field3686 = 67108864L;
        try {
            Runtime var6 = Runtime.getRuntime();
            field3686 = (Long) Class.forName("java.lang.Runtime").getMethod("maxMemory").invoke(var6);
        } catch (Exception var7) {
        }
        if (arg0) {
            this.method1395(arg4, -749, arg2, arg3);
        }
        this.field3685 = false;
        this.field3688 = new Thread(this);
        this.field3688.setPriority(10);
        this.field3688.setDaemon(true);
        this.field3688.start();
    }
}
