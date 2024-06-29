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

@OriginalClass("client!qg")
public class class181 implements Runnable {

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lfg;")
    public class63 field3584 = null;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lp;")
    private class163 field3585 = null;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Ljava/io/File;")
    private File field3582 = null;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lfg;")
    public class63 field3592 = null;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lfg;")
    public class63 field3590 = null;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lp;")
    private class163 field3589 = null;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Z")
    private boolean field3598 = false;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Ljava/io/File;")
    public File field3595 = null;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Ljava/applet/Applet;")
    public Applet field3599 = null;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field3594;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Ljava/lang/Thread;")
    private Thread field3597;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field3581 = 3;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lqd;")
    private class178 field3591;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljava/lang/String;")
    private static String field3587;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3593;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3596;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3583;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3588;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[Lfg;")
    public class63[] field3586;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Lqd;")
    public final class178 method1288(byte arg0) {
        int var2 = 49 % ((6 - arg0) / 58);
        return this.field3591;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lp;")
    public final class163 method1289(int arg0, Runnable arg1, int arg2) {
        if (arg0 != 2) {
            this.method1294(-7, 32);
        }
        return this.method1292(2, arg1, 0, 0, arg2);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;II)Lp;")
    public final class163 method1290(String arg0, int arg1, int arg2) {
        if (arg2 <= 60) {
            this.field3591 = null;
        }
        return this.method1292(1, arg0, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method1291(int arg0) {
        synchronized (this) {
            this.field3598 = true;
            this.notifyAll();
            int var3 = -91 % ((12 - arg0) / 51);
        }
        try {
            this.field3597.join();
        } catch (InterruptedException var9) {
        }
        if (this.field3592 != null) {
            try {
                this.field3592.method446(0);
            } catch (IOException var8) {
            }
        }
        if (this.field3584 != null) {
            try {
                this.field3584.method446(0);
            } catch (IOException var7) {
            }
        }
        if (this.field3586 != null) {
            for (int var4 = 0; var4 < this.field3586.length; var4++) {
                if (this.field3586[var4] != null) {
                    try {
                        this.field3586[var4].method446(0);
                    } catch (IOException var6) {
                    }
                }
            }
        }
        if (this.field3590 != null) {
            try {
                this.field3590.method446(0);
            } catch (IOException var5) {
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Object;III)Lp;")
    private final class163 method1292(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class163 var6 = new class163();
        var6.field3135 = arg1;
        if (arg3 != 0) {
            return null;
        }
        var6.field3134 = arg4;
        var6.field3133 = arg0;
        synchronized (this) {
            if (this.field3585 == null) {
                this.field3585 = this.field3589 = var6;
            } else {
                this.field3585.field3132 = var6;
                this.field3585 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qg", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class163 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3598) {
                        return;
                    }
                    if (this.field3589 != null) {
                        var2 = this.field3589;
                        this.field3589 = this.field3589.field3132;
                        if (this.field3589 == null) {
                            this.field3585 = null;
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
                int var3 = var2.field3133;
                if (var3 == 1) {
                    var2.field3131 = new Socket(InetAddress.getByName((String) var2.field3135), var2.field3134);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3135);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3134);
                    var2.field3131 = var6;
                } else if (var3 == 4) {
                    var2.field3131 = new DataInputStream(((URL) var2.field3135).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3135;
                    var2.field3131 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3135;
                    var2.field3131 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3136 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3136 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lp;")
    public final class163 method1293(String arg0, int arg1, Class arg2) {
        int var4 = -87 / ((-arg1 - 40) / 40);
        return this.method1292(9, new Object[] { arg2, arg0 }, 0, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lp;")
    public final class163 method1294(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method1288((byte) 118);
        }
        return this.method1292(3, null, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLjava/net/URL;)Lp;")
    public final class163 method1295(boolean arg0, URL arg1) {
        if (arg0) {
            this.method1289(-54, null, -124);
        }
        return this.method1292(4, arg1, 0, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;B)Lp;")
    public final class163 method1296(String arg0, Class arg1, Class[] arg2, byte arg3) {
        int var5 = 21 / ((-arg3 - 45) / 37);
        return this.method1292(8, new Object[] { arg1, arg0, arg2 }, 0, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;III)V")
    private final void method1297(String arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field3587, "/tmp/", "" };
        if (arg1 != 22086) {
            return;
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
                        if (this.field3590 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field3590 = new class63(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field3590 = null;
                            }
                        }
                        if (this.field3582 == null) {
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
                                this.field3592 = new class63(var16, "rw", 104857600L);
                                this.field3586 = new class63[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field3586[var17] = new class63(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field3584 = new class63(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field3595 = this.field3582 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field3592.method446(arg1 - 22086);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field3586[var18].method446(0);
                                    }
                                    this.field3584.method446(arg1 ^ 0x5646);
                                } catch (Exception var19) {
                                }
                                this.field3586 = null;
                                this.field3595 = this.field3582 = null;
                                this.field3592 = this.field3584 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field3590 != null && this.field3582 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field3582 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class181(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        this.field3599 = arg1;
        field3593 = "1.1";
        field3596 = "Unknown";
        try {
            field3596 = System.getProperty("java.vendor");
            field3593 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field3587 = System.getProperty("user.home");
            if (field3587 != null) {
                field3587 = field3587 + "/";
            }
        } catch (Exception var9) {
        }
        if (field3587 == null) {
            field3587 = "~/";
        }
        try {
            this.field3594 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field3588 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3588 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field3583 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field3583 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method1297(arg3, 22086, arg2, arg4);
        }
        this.field3598 = false;
        this.field3597 = new Thread(this);
        this.field3597.setPriority(10);
        this.field3597.setDaemon(true);
        this.field3597.start();
    }
}
