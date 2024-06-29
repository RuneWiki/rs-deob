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

@OriginalClass("client!pc")
public class class137 implements Runnable {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lqd;")
    public class147 field2825 = null;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Ljava/io/File;")
    public File field2826 = null;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Z")
    private boolean field2836 = false;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Ljava/io/File;")
    private File field2843 = null;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field2839 = null;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Ldd;")
    private class32 field2834 = null;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lqd;")
    public class147 field2842 = null;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lqd;")
    public class147 field2828 = null;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "Ldd;")
    private class32 field2840 = null;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2837;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field2832;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2831 = 3;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Luh;")
    private class187 field2841;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2827;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Ljava/lang/String;")
    private static String field2830;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2833;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2829;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2838;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[Lqd;")
    public class147[] field2835;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public final void method868(byte arg0) {
        if (arg0 != -52) {
            this.field2828 = null;
        }
        synchronized (this) {
            this.field2836 = true;
            this.notifyAll();
        }
        try {
            this.field2832.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2842 != null) {
            try {
                this.field2842.method929(false);
            } catch (IOException var7) {
            }
        }
        if (this.field2825 != null) {
            try {
                this.field2825.method929(false);
            } catch (IOException var6) {
            }
        }
        if (this.field2835 != null) {
            for (int var3 = 0; var3 < this.field2835.length; var3++) {
                if (this.field2835[var3] != null) {
                    try {
                        this.field2835[var3].method929(false);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2828 != null) {
            try {
                this.field2828.method929(false);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ldd;")
    public final class32 method869(byte arg0, String arg1, Class arg2, Class[] arg3) {
        if (arg0 < 40) {
            field2829 = null;
        }
        return this.method875(0, 1, new Object[] { arg2, arg1, arg3 }, 8, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Runnable;IZ)Ldd;")
    public final class32 method870(Runnable arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method877(-67, -74);
        }
        return this.method875(arg1, 1, arg0, 2, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Luh;")
    public final class187 method871(int arg0) {
        int var2 = 73 % ((28 - arg0) / 57);
        return this.field2841;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ldd;")
    public final class32 method872(Class arg0, String arg1, byte arg2) {
        if (arg2 <= 7) {
            this.method875(89, -36, null, -73, 36);
        }
        return this.method875(0, 1, new Object[] { arg0, arg1 }, 9, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
    private final void method873(String arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2830, "/tmp/", "" };
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
                        if (this.field2828 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2828 = new class147(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2828 = null;
                            }
                        }
                        if (this.field2843 == null) {
                            try {
                                File var14 = new File(var11, arg0);
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
                                this.field2842 = new class147(var16, "rw", 52428800L);
                                this.field2835 = new class147[arg1];
                                for (int var17 = 0; var17 < arg1; var17++) {
                                    this.field2835[var17] = new class147(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2825 = new class147(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2826 = this.field2843 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2842.method929(arg3);
                                    for (int var18 = 0; var18 < arg1; var18++) {
                                        this.field2835[var18].method929(false);
                                    }
                                    this.field2825.method929(false);
                                } catch (Exception var19) {
                                }
                                this.field2826 = this.field2843 = null;
                                this.field2835 = null;
                                this.field2842 = this.field2825 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2828 != null && this.field2843 != null) {
                        return;
                    }
                }
            }
        }
        if (arg3) {
            this.method872(null, null, (byte) -81);
        }
        if (this.field2843 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/String;)Ldd;")
    public final class32 method874(int arg0, int arg1, String arg2) {
        return arg1 == 0 ? this.method875(arg0, arg1 + 1, arg2, 1, 0) : null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILjava/lang/Object;II)Ldd;")
    private final class32 method875(int arg0, int arg1, Object arg2, int arg3, int arg4) {
        class32 var6 = new class32();
        var6.field687 = arg3;
        var6.field684 = arg0;
        var6.field682 = arg2;
        synchronized (this) {
            if (this.field2840 == null) {
                this.field2840 = this.field2834 = var6;
            } else {
                this.field2840.field685 = var6;
                this.field2840 = var6;
            }
            if (arg1 != 1) {
                this.field2836 = false;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/net/URL;)Ldd;")
    public final class32 method876(int arg0, URL arg1) {
        return arg0 == 4 ? this.method875(0, 1, arg1, 4, 0) : null;
    }

    @OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class32 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2836) {
                        return;
                    }
                    if (this.field2834 != null) {
                        var2 = this.field2834;
                        this.field2834 = this.field2834.field685;
                        if (this.field2834 == null) {
                            this.field2840 = null;
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
                int var3 = var2.field687;
                if (var3 == 1) {
                    var2.field683 = new Socket(InetAddress.getByName((String) var2.field682), var2.field684);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field682);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field684);
                    var2.field683 = var4;
                } else if (var3 == 4) {
                    var2.field683 = new DataInputStream(((URL) var2.field682).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field682;
                    var2.field683 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field682;
                    var2.field683 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field686 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field686 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class137(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field2839 = arg1;
        field2833 = "1.1";
        field2827 = "Unknown";
        try {
            field2827 = System.getProperty("java.vendor");
            field2833 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field2830 = System.getProperty("user.home");
            if (field2830 != null) {
                field2830 = field2830 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2830 == null) {
            field2830 = "~/";
        }
        try {
            this.field2837 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2829 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2829 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2838 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2838 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method873(arg3, arg4, arg2, false);
        }
        this.field2836 = false;
        this.field2832 = new Thread(this);
        this.field2832.setPriority(10);
        this.field2832.setDaemon(true);
        this.field2832.start();
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Ldd;")
    public final class32 method877(int arg0, int arg1) {
        return arg0 == 3 ? this.method875(arg1, 1, null, 3, 0) : null;
    }
}
