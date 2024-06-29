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

@OriginalClass("client!qe")
public class class149 implements Runnable {

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lvh;")
    public class197 field3140 = null;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lvh;")
    public class197 field3138 = null;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Ljava/io/File;")
    private File field3133 = null;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Ljava/io/File;")
    public File field3146 = null;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Z")
    private boolean field3143 = false;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lje;")
    private class87 field3135 = null;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Ljava/applet/Applet;")
    public Applet field3145 = null;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lvh;")
    public class197 field3144 = null;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Lje;")
    private class87 field3149 = null;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3139;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field3132;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field3147 = 3;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lwf;")
    private class204 field3137;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Ljava/lang/String;")
    private static String field3131;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3134;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3141;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3136;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3148;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[Lvh;")
    public class197[] field3142;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/net/URL;)Lje;")
    public final class87 method1041(int arg0, URL arg1) {
        if (arg0 < 58) {
            this.field3145 = null;
        }
        return this.method1048(arg1, 0, 0, 4, (byte) 40);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public final void method1042(int arg0) {
        synchronized (this) {
            this.field3143 = true;
            this.notifyAll();
        }
        if (arg0 < 69) {
            this.field3140 = null;
        }
        try {
            this.field3132.join();
        } catch (InterruptedException var8) {
        }
        if (this.field3138 != null) {
            try {
                this.field3138.method1289(1);
            } catch (IOException var7) {
            }
        }
        if (this.field3140 != null) {
            try {
                this.field3140.method1289(1);
            } catch (IOException var6) {
            }
        }
        if (this.field3142 != null) {
            for (int var3 = 0; var3 < this.field3142.length; var3++) {
                if (this.field3142[var3] != null) {
                    try {
                        this.field3142[var3].method1289(1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field3144 != null) {
            try {
                this.field3144.method1289(1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lje;")
    public final class87 method1043(int arg0, int arg1) {
        if (arg1 <= 57) {
            this.field3137 = null;
        }
        return this.method1048(null, 0, arg0, 3, (byte) 125);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method1044(String arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3131, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
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
                        if (this.field3144 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3144 = new class197(var13, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field3144 = null;
                            }
                        }
                        if (this.field3133 == null) {
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
                                this.field3138 = new class197(var16, "rw", 104857600L);
                                this.field3142 = new class197[arg2];
                                for (int var17 = 0; var17 < arg2; var17++) {
                                    this.field3142[var17] = new class197(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3140 = new class197(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3146 = this.field3133 = var14;
                            } catch (Exception var21) {
                                try {
                                    this.field3138.method1289(1);
                                    for (int var18 = 0; var18 < arg2; var18++) {
                                        this.field3142[var18].method1289(1);
                                    }
                                    this.field3140.method1289(1);
                                } catch (Exception var20) {
                                }
                                this.field3142 = null;
                                this.field3146 = this.field3133 = null;
                                this.field3138 = this.field3140 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field3144 != null && this.field3133 != null) {
                        return;
                    }
                }
            }
        }
        int var19 = 102 % ((arg1 - 78) / 42);
        if (this.field3133 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lje;")
    public final class87 method1045(Runnable arg0, byte arg1, int arg2) {
        int var4 = -88 % ((23 - arg1) / 62);
        return this.method1048(arg0, 0, arg2, 2, (byte) 115);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;[Ljava/lang/Class;)Lje;")
    public final class87 method1046(Class arg0, int arg1, String arg2, Class[] arg3) {
        if (arg1 != 2) {
            this.method1048(null, -14, -10, 106, (byte) -31);
        }
        return this.method1048(new Object[] { arg0, arg2, arg3 }, 0, 0, 8, (byte) 90);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLjava/lang/String;)Lje;")
    public final class87 method1047(int arg0, byte arg1, String arg2) {
        if (arg1 != -61) {
            field3131 = null;
        }
        return this.method1048(arg2, 0, arg0, 1, (byte) 70);
    }

    @OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class87 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3143) {
                        return;
                    }
                    if (this.field3149 != null) {
                        var2 = this.field3149;
                        this.field3149 = this.field3149.field2061;
                        if (this.field3149 == null) {
                            this.field3135 = null;
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
                int var3 = var2.field2063;
                if (var3 == 1) {
                    var2.field2060 = new Socket(InetAddress.getByName((String) var2.field2059), var2.field2062);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2059);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2062);
                    var2.field2060 = var4;
                } else if (var3 == 4) {
                    var2.field2060 = new DataInputStream(((URL) var2.field2059).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2059;
                    var2.field2060 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2059;
                    var2.field2060 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field2058 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field2058 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/Object;IIIB)Lje;")
    private final class87 method1048(Object arg0, int arg1, int arg2, int arg3, byte arg4) {
        class87 var6 = new class87();
        var6.field2062 = arg2;
        var6.field2059 = arg0;
        var6.field2063 = arg3;
        synchronized (this) {
            if (this.field3135 == null) {
                this.field3135 = this.field3149 = var6;
            } else {
                this.field3135.field2061 = var6;
                this.field3135 = var6;
            }
            if (arg4 <= 28) {
                this.method1043(83, 1);
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lwf;")
    public final class204 method1049(byte arg0) {
        if (arg0 != 28) {
            field3148 = null;
        }
        return this.field3137;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Lje;")
    public final class87 method1050(String arg0, Class arg1, int arg2) {
        if (arg2 != 0) {
            field3147 = 55;
        }
        return this.method1048(new Object[] { arg1, arg0 }, 0, 0, 9, (byte) 31);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class149(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field3134 = "Unknown";
        field3141 = "1.1";
        this.field3145 = arg1;
        try {
            field3134 = System.getProperty("java.vendor");
            field3141 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3131 = System.getProperty("user.home");
            if (field3131 != null) {
                field3131 = field3131 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3131 == null) {
            field3131 = "~/";
        }
        try {
            this.field3139 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3136 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3136 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3148 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3148 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1044(arg3, -116, arg4, arg2);
        }
        this.field3143 = false;
        this.field3132 = new Thread(this);
        this.field3132.setPriority(10);
        this.field3132.setDaemon(true);
        this.field3132.start();
    }
}
