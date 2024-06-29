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

@OriginalClass("client!cf")
public class class21 implements Runnable {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lfc;")
    private class39 field315 = null;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljava/io/File;")
    public File field323 = null;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lfc;")
    private class39 field326 = null;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Lca;")
    public class16 field328 = null;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljava/applet/Applet;")
    public Applet field319 = null;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Ljava/io/File;")
    private File field331 = null;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
    private boolean field314 = false;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lca;")
    public class16 field321 = null;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lca;")
    public class16 field330 = null;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field316;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field325;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field324 = 3;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lj;")
    private class62 field329;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Ljava/lang/String;")
    private static String field317;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field320;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Ljava/lang/String;")
    public static String field327;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field322;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field332;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[Lca;")
    public class16[] field318;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Lfc;")
    public final class39 method115(int arg0, String arg1, Class[] arg2, Class arg3) {
        int var5 = -12 / ((arg0 + 44) / 40);
        return this.method121(0, new Object[] { arg3, arg1, arg2 }, 0, 8, 22);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lfc;")
    public final class39 method116(int arg0, int arg1) {
        return arg1 == 3 ? this.method121(0, null, arg0, 3, arg1 ^ 0x7) : null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Class;)Lfc;")
    public final class39 method117(boolean arg0, String arg1, Class arg2) {
        if (!arg0) {
            this.method118((byte) 26, null);
        }
        return this.method121(0, new Object[] { arg2, arg1 }, 0, 9, 50);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/net/URL;)Lfc;")
    public final class39 method118(byte arg0, URL arg1) {
        if (arg0 != 117) {
            this.run();
        }
        return this.method121(0, arg1, 0, 4, -118);
    }

    @OriginalMember(owner = "client!cf", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class39 var2;
            synchronized (this) {
                while (true) {
                    if (this.field314) {
                        return;
                    }
                    if (this.field326 != null) {
                        var2 = this.field326;
                        this.field326 = this.field326.field865;
                        if (this.field326 == null) {
                            this.field315 = null;
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
                int var3 = var2.field868;
                if (var3 == 1) {
                    var2.field870 = new Socket(InetAddress.getByName((String) var2.field867), var2.field869);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field867);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field869);
                    var2.field870 = var4;
                } else if (var3 == 4) {
                    var2.field870 = new DataInputStream(((URL) var2.field867).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field867;
                    var2.field870 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field867;
                    var2.field870 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field866 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field866 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method119(String arg0, int arg1, int arg2, int arg3) {
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field317, "/tmp/", "" };
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        if (arg1 != 11776) {
            this.method123(null, -35, -7);
        }
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
                        if (this.field328 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field328 = new class16(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field328 = null;
                            }
                        }
                        if (this.field331 == null) {
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
                                this.field321 = new class16(var16, "rw", 52428800L);
                                this.field318 = new class16[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field318[var17] = new class16(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field330 = new class16(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field323 = this.field331 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field321.method96((byte) 21);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field318[var18].method96((byte) 21);
                                    }
                                    this.field330.method96((byte) 21);
                                } catch (Exception var19) {
                                }
                                this.field321 = this.field330 = null;
                                this.field323 = this.field331 = null;
                                this.field318 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field328 != null && this.field331 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field331 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public final void method120(int arg0) {
        synchronized (this) {
            this.field314 = true;
            this.notifyAll();
        }
        try {
            this.field325.join();
            if (arg0 != 32) {
                this.run();
            }
        } catch (InterruptedException var8) {
        }
        if (this.field321 != null) {
            try {
                this.field321.method96((byte) 21);
            } catch (IOException var7) {
            }
        }
        if (this.field330 != null) {
            try {
                this.field330.method96((byte) 21);
            } catch (IOException var6) {
            }
        }
        if (this.field318 != null) {
            for (int var3 = 0; var3 < this.field318.length; var3++) {
                if (this.field318[var3] != null) {
                    try {
                        this.field318[var3].method96((byte) 21);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field328 != null) {
            try {
                this.field328.method96((byte) 21);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/Object;III)Lfc;")
    private final class39 method121(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class39 var6 = new class39();
        var6.field867 = arg1;
        var6.field869 = arg2;
        var6.field868 = arg3;
        synchronized (this) {
            if (this.field315 == null) {
                this.field315 = this.field326 = var6;
            } else {
                this.field315.field865 = var6;
                this.field315 = var6;
            }
            this.notify();
            int var8 = 69 / ((arg4 + 60) / 57);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Lj;")
    public final class62 method122(int arg0) {
        if (arg0 != 0) {
            this.field319 = null;
        }
        return this.field329;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lfc;")
    public final class39 method123(Runnable arg0, int arg1, int arg2) {
        int var4 = -108 / ((arg2 + 50) / 59);
        return this.method121(0, arg0, arg1, 2, 24);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;I)Lfc;")
    public final class39 method124(int arg0, String arg1, int arg2) {
        if (arg0 != 1) {
            this.method122(-77);
        }
        return this.method121(0, arg1, arg2, 1, -119);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class21(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field319 = arg1;
        field327 = "1.1";
        field320 = "Unknown";
        try {
            field320 = System.getProperty("java.vendor");
            field327 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field317 = System.getProperty("user.home");
            if (field317 != null) {
                field317 = field317 + "/";
            }
        } catch (Exception var9) {
        }
        if (field317 == null) {
            field317 = "~/";
        }
        try {
            this.field316 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field322 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field322 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field332 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field332 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method119(arg3, 11776, arg4, arg2);
        }
        this.field314 = false;
        this.field325 = new Thread(this);
        this.field325.setPriority(10);
        this.field325.setDaemon(true);
        this.field325.start();
    }
}
