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

@OriginalClass("client!e")
public class class41 implements Runnable {

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lqa;")
    public class153 field898 = null;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lqa;")
    public class153 field906 = null;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field907 = null;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Ljava/io/File;")
    public File field895 = null;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lqa;")
    public class153 field909 = null;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lhf;")
    private class76 field903 = null;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lhf;")
    private class76 field897 = null;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
    private boolean field900 = false;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Ljava/io/File;")
    private File field913 = null;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field912;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field908;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field896 = 3;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lgf;")
    private class66 field902;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/lang/String;")
    public static String field899;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Ljava/lang/String;")
    public static String field905;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Ljava/lang/String;")
    private static String field911;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field904;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field910;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "[Lqa;")
    public class153[] field901;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lhf;")
    public final class76 method384(int arg0, byte arg1) {
        return arg1 == 39 ? this.method391((byte) 62, 3, 0, arg0, null) : null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Lgf;")
    public final class66 method385(boolean arg0) {
        if (!arg0) {
            this.field897 = null;
        }
        return this.field902;
    }

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class76 var2;
            synchronized (this) {
                while (true) {
                    if (this.field900) {
                        return;
                    }
                    if (this.field903 != null) {
                        var2 = this.field903;
                        this.field903 = this.field903.field1809;
                        if (this.field903 == null) {
                            this.field897 = null;
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
                int var3 = var2.field1805;
                if (var3 == 1) {
                    var2.field1804 = new Socket(InetAddress.getByName((String) var2.field1808), var2.field1807);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field1808);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field1807);
                    var2.field1804 = var4;
                } else if (var3 == 4) {
                    var2.field1804 = new DataInputStream(((URL) var2.field1808).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field1808;
                    var2.field1804 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1808;
                    var2.field1804 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1806 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1806 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method386(String arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field911, "/tmp/", "" };
        if (arg1 != 1) {
            this.run();
        }
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var5.length; var8++) {
                for (int var9 = 0; var9 < var6.length; var9++) {
                    try {
                        String var10 = var6[var9];
                        if (var10.length() > 0 && !(new File(var10)).exists()) {
                            continue;
                        }
                        File var11 = new File(var10 + var5[var8]);
                        if (var7 == 1 && !var11.exists()) {
                            boolean var12 = var11.mkdir();
                            if (!var12) {
                                continue;
                            }
                        }
                        if (this.field898 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field898 = new class153(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field898 = null;
                            }
                        }
                        if (this.field913 == null) {
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
                                this.field906 = new class153(var16, "rw", 104857600L);
                                this.field901 = new class153[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field901[var17] = new class153(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field909 = new class153(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field895 = this.field913 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field906.method1033(-1);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field901[var18].method1033(arg1 - 2);
                                    }
                                    this.field909.method1033(-1);
                                } catch (Exception var19) {
                                }
                                this.field906 = this.field909 = null;
                                this.field901 = null;
                                this.field895 = this.field913 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field898 != null && this.field913 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field913 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/Runnable;ZI)Lhf;")
    public final class76 method387(Runnable arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method388(-70, null);
        }
        return this.method391((byte) 34, 2, 0, arg2, arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/net/URL;)Lhf;")
    public final class76 method388(int arg0, URL arg1) {
        if (arg0 != 3927) {
            this.method384(-49, (byte) 108);
        }
        return this.method391((byte) 70, 4, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lhf;")
    public final class76 method389(int arg0, Class[] arg1, String arg2, Class arg3) {
        if (arg0 != 8) {
            field905 = null;
        }
        return this.method391((byte) 24, 8, 0, 0, new Object[] { arg3, arg2, arg1 });
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Lhf;")
    public final class76 method390(Class arg0, byte arg1, String arg2) {
        if (arg1 >= -118) {
            this.method386(null, 103, -56, 57);
        }
        return this.method391((byte) 107, 9, 0, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIILjava/lang/Object;)Lhf;")
    private final class76 method391(byte arg0, int arg1, int arg2, int arg3, Object arg4) {
        class76 var6 = new class76();
        var6.field1807 = arg3;
        var6.field1808 = arg4;
        var6.field1805 = arg1;
        synchronized (this) {
            if (this.field897 == null) {
                this.field897 = this.field903 = var6;
            } else {
                this.field897.field1809 = var6;
                this.field897 = var6;
            }
            this.notify();
        }
        if (arg0 < 14) {
            field905 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public final void method392(byte arg0) {
        synchronized (this) {
            this.field900 = true;
            this.notifyAll();
            int var3 = -102 % ((arg0 + 6) / 32);
        }
        try {
            this.field908.join();
        } catch (InterruptedException var9) {
        }
        if (this.field906 != null) {
            try {
                this.field906.method1033(-1);
            } catch (IOException var8) {
            }
        }
        if (this.field909 != null) {
            try {
                this.field909.method1033(-1);
            } catch (IOException var7) {
            }
        }
        if (this.field901 != null) {
            for (int var4 = 0; var4 < this.field901.length; var4++) {
                if (this.field901[var4] != null) {
                    try {
                        this.field901[var4].method1033(-1);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field898 != null) {
            try {
                this.field898.method1033(-1);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;BI)Lhf;")
    public final class76 method393(String arg0, byte arg1, int arg2) {
        return arg1 <= 66 ? null : this.method391((byte) 79, 1, 0, arg2, arg0);
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class41(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field905 = "1.1";
        field899 = "Unknown";
        this.field907 = arg1;
        try {
            field899 = System.getProperty("java.vendor");
            field905 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field911 = System.getProperty("user.home");
            if (field911 != null) {
                field911 = field911 + "/";
            }
        } catch (Exception var9) {
        }
        if (field911 == null) {
            field911 = "~/";
        }
        try {
            this.field912 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field904 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field904 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field910 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field910 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method386(arg3, 1, arg2, arg4);
        }
        this.field900 = false;
        this.field908 = new Thread(this);
        this.field908.setPriority(10);
        this.field908.setDaemon(true);
        this.field908.start();
    }
}
