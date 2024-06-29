import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 implements Runnable {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Ljava/io/File;")
    private File field621 = null;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
    private boolean field627 = false;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public int field630 = 0;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Ljava/io/File;")
    public File field633 = null;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lab;")
    public class3 field634 = null;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field632 = null;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Ltf;")
    private class138 field636 = null;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lab;")
    public class3 field637 = null;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Ltf;")
    private class138 field638 = null;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field624;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field628;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field639 = 3;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lr;")
    private class118 field629;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field625;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field631;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Ljava/lang/String;")
    private static String field635;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field622;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field626;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[Lab;")
    public class3[] field623;

    @OriginalMember(owner = "client!dd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class138 var2;
            synchronized (this) {
                while (true) {
                    if (this.field627) {
                        return;
                    }
                    if (this.field636 != null) {
                        var2 = this.field636;
                        this.field636 = this.field636.field3143;
                        if (this.field636 == null) {
                            this.field638 = null;
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
                int var3 = var2.field3141;
                if (var3 == 1) {
                    var2.field3144 = new Socket(InetAddress.getByName((String) var2.field3140), var2.field3142);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field3140);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field3142);
                    var2.field3144 = var6;
                } else if (var3 == 4) {
                    var2.field3144 = new DataInputStream(((URL) var2.field3140).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field3140;
                    var2.field3144 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field3140;
                    var2.field3144 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field3145 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field3145 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;[Ljava/lang/Class;)Ltf;")
    public final class138 method195(String arg0, int arg1, Class arg2, Class[] arg3) {
        if (arg1 != -23273) {
            this.method204(null, 23, 27, false);
        }
        return this.method199(0, new Object[] { arg2, arg0, arg3 }, 0, 8, 104);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILjava/lang/String;)Ltf;")
    public final class138 method196(int arg0, int arg1, String arg2) {
        if (arg1 >= -32) {
            this.method197(-74);
        }
        return this.method199(arg0, arg2, 0, 1, -107);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lr;")
    public final class118 method197(int arg0) {
        if (arg0 < 66) {
            this.method202((byte) -16, 39);
        }
        return this.field629;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public final void method198(boolean arg0) {
        synchronized (this) {
            this.field627 = true;
            this.notifyAll();
        }
        try {
            this.field628.join();
        } catch (InterruptedException var7) {
        }
        if (this.field634 != null) {
            try {
                this.field634.method9((byte) -50);
            } catch (IOException var6) {
            }
        }
        if (this.field637 != null) {
            try {
                this.field637.method9((byte) -50);
            } catch (IOException var5) {
            }
        }
        if (this.field623 != null) {
            for (int var3 = 0; var3 < this.field623.length; var3++) {
                if (this.field623[var3] != null) {
                    try {
                        this.field623[var3].method9((byte) -50);
                    } catch (IOException var4) {
                    }
                }
            }
        }
        if (arg0) {
            field625 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/Object;III)Ltf;")
    private final class138 method199(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class138 var6 = new class138();
        var6.field3141 = arg3;
        var6.field3140 = arg1;
        var6.field3142 = arg0;
        synchronized (this) {
            if (this.field638 == null) {
                this.field638 = this.field636 = var6;
            } else {
                this.field638.field3143 = var6;
                this.field638 = var6;
            }
            this.notify();
            int var8 = 51 % ((arg4 - 9) / 63);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ltf;")
    public final class138 method200(String arg0, int arg1, Class arg2) {
        if (arg1 > -117) {
            field635 = null;
        }
        return this.method199(0, new Object[] { arg2, arg0 }, 0, 9, 100);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLjava/lang/Runnable;)Ltf;")
    public final class138 method201(int arg0, byte arg1, Runnable arg2) {
        return arg1 == -57 ? this.method199(arg0, arg2, 0, 2, 84) : null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Ltf;")
    public final class138 method202(byte arg0, int arg1) {
        if (arg0 != -104) {
            this.method203(null, 50);
        }
        return this.method199(arg1, null, 0, 3, 96);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/net/URL;I)Ltf;")
    public final class138 method203(URL arg0, int arg1) {
        if (arg1 != 9) {
            this.method199(-113, null, -105, -8, -74);
        }
        return this.method199(0, arg0, 0, 4, -127);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;IIZ)V")
    private final void method204(String arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field635, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        boolean var7 = false;
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var6[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var7) {
                            try {
                                File var14 = new File(var12, "uid.dat");
                                if (var8 == 1 && (!var14.exists() || var14.length() < 4L)) {
                                    int var15 = -1;
                                    Random var16 = new Random();
                                    while (var15 == -1) {
                                        var15 = var16.nextInt();
                                    }
                                    DataOutputStream var17 = new DataOutputStream(new FileOutputStream(var14));
                                    var17.writeInt(var15);
                                    var17.close();
                                }
                                if (var14.exists()) {
                                    var7 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field630 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field621 == null) {
                            try {
                                File var19 = new File(var12, arg0);
                                if (var8 == 1 && !var19.exists()) {
                                    boolean var20 = var19.mkdir();
                                    if (!var20) {
                                        continue;
                                    }
                                }
                                File var21 = new File(var19, "main_file_cache.dat2");
                                if (var8 == 0 && !var21.exists()) {
                                    continue;
                                }
                                this.field634 = new class3(var21, "rw", 52428800L);
                                this.field623 = new class3[arg1];
                                for (int var22 = 0; var22 < arg1; var22++) {
                                    this.field623[var22] = new class3(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field637 = new class3(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field633 = this.field621 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field634.method9((byte) -50);
                                    for (int var23 = 0; var23 < arg1; var23++) {
                                        this.field623[var23].method9((byte) -50);
                                    }
                                    this.field637.method9((byte) -50);
                                } catch (Exception var24) {
                                }
                                this.field623 = null;
                                this.field634 = this.field637 = null;
                                this.field633 = this.field621 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var7 && this.field621 != null) {
                        return;
                    }
                }
            }
        }
        if (!arg3) {
            this.field623 = null;
        }
        if (this.field621 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class26(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field631 = "1.1";
        field625 = "Unknown";
        this.field632 = arg1;
        try {
            field625 = System.getProperty("java.vendor");
            field631 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field635 = System.getProperty("user.home");
            if (field635 != null) {
                field635 = field635 + "/";
            }
        } catch (Exception var9) {
        }
        if (field635 == null) {
            field635 = "~/";
        }
        try {
            this.field624 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field622 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field622 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field626 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field626 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method204(arg3, arg4, arg2, true);
        }
        this.field627 = false;
        this.field628 = new Thread(this);
        this.field628.setPriority(10);
        this.field628.setDaemon(true);
        this.field628.start();
    }
}
