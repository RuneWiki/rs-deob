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

@OriginalClass("client!de")
public class class27 implements Runnable {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Ljava/io/File;")
    public File field650 = null;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ljb;")
    private class64 field653 = null;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field654 = null;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public int field657 = 0;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Ljb;")
    private class64 field659 = null;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Laf;")
    public class7 field652 = null;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Z")
    private boolean field660 = false;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Laf;")
    public class7 field658 = null;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Ljava/io/File;")
    private File field661 = null;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field645;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/lang/Thread;")
    private Thread field647;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field656 = 3;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lca;")
    private class16 field643;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljava/lang/String;")
    private static String field646;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljava/lang/String;")
    public static String field649;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Ljava/lang/String;")
    public static String field655;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field648;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field651;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Laf;")
    public class7[] field644;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method217(int arg0) {
        synchronized (this) {
            this.field660 = true;
            this.notifyAll();
            if (arg0 != 0) {
                this.field657 = 11;
            }
        }
        try {
            this.field647.join();
        } catch (InterruptedException var7) {
        }
        if (this.field652 != null) {
            try {
                this.field652.method37((byte) 92);
            } catch (IOException var6) {
            }
        }
        if (this.field658 != null) {
            try {
                this.field658.method37((byte) 55);
            } catch (IOException var5) {
            }
        }
        if (this.field644 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field644.length; var3++) {
            if (this.field644[var3] != null) {
                try {
                    this.field644[var3].method37((byte) 117);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class64 var2;
            synchronized (this) {
                while (true) {
                    if (this.field660) {
                        return;
                    }
                    if (this.field659 != null) {
                        var2 = this.field659;
                        this.field659 = this.field659.field1595;
                        if (this.field659 == null) {
                            this.field653 = null;
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
                int var3 = var2.field1593;
                if (var3 == 1) {
                    var2.field1596 = new Socket(InetAddress.getByName((String) var2.field1591), var2.field1594);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1591);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1594);
                    var2.field1596 = var6;
                } else if (var3 == 4) {
                    var2.field1596 = new DataInputStream(((URL) var2.field1591).openStream());
                } else if (var3 == 8) {
                    Object[] var4 = (Object[]) var2.field1591;
                    var2.field1596 = ((Class) var4[0]).getDeclaredMethod((String) var4[1], (Class[]) var4[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1591;
                    var2.field1596 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field1592 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field1592 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/net/URL;)Ljb;")
    public final class64 method218(int arg0, URL arg1) {
        if (arg0 >= -3) {
            this.field657 = -115;
        }
        return this.method224(arg1, 0, 4, 0, 77);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILjava/lang/String;)Ljb;")
    public final class64 method219(int arg0, int arg1, String arg2) {
        if (arg0 != -19431) {
            this.method225(5, -78, null, -62);
        }
        return this.method224(arg2, arg1, 1, 0, 115);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLjava/lang/Runnable;)Ljb;")
    public final class64 method220(int arg0, boolean arg1, Runnable arg2) {
        if (arg1) {
            field651 = null;
        }
        return this.method224(arg2, arg0, 2, 0, 119);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Class;B[Ljava/lang/Class;Ljava/lang/String;)Ljb;")
    public final class64 method221(Class arg0, byte arg1, Class[] arg2, String arg3) {
        if (arg1 < 34) {
            this.field653 = null;
        }
        return this.method224(new Object[] { arg0, arg3, arg2 }, 0, 8, 0, 63);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Lca;")
    public final class16 method222(byte arg0) {
        if (arg0 > -19) {
            this.method222((byte) -114);
        }
        return this.field643;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Ljb;")
    public final class64 method223(int arg0, boolean arg1) {
        if (arg1) {
            this.field660 = true;
        }
        return this.method224(null, arg0, 3, 0, 60);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Object;IIII)Ljb;")
    private final class64 method224(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 58) {
            return null;
        }
        class64 var6 = new class64();
        var6.field1594 = arg1;
        var6.field1593 = arg2;
        var6.field1591 = arg0;
        synchronized (this) {
            if (this.field653 == null) {
                this.field653 = this.field659 = var6;
            } else {
                this.field653.field1595 = var6;
                this.field653 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILjava/lang/String;I)V")
    private final void method225(int arg0, int arg1, String arg2, int arg3) {
        if (arg1 < 32 || arg1 > 34) {
            arg1 = 32;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", field646, "" };
        boolean var6 = false;
        String[] var7 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var5.length; var10++) {
                    try {
                        String var11 = var5[var10];
                        if (var11.length() > 0 && !(new File(var11)).exists()) {
                            continue;
                        }
                        File var12 = new File(var11 + var7[var9]);
                        if (var8 == 1 && !var12.exists()) {
                            boolean var13 = var12.mkdir();
                            if (!var13) {
                                continue;
                            }
                        }
                        if (!var6) {
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
                                    var6 = true;
                                    DataInputStream var18 = new DataInputStream(new FileInputStream(var14));
                                    this.field657 = var18.readInt() + 1;
                                    var18.close();
                                }
                            } catch (Exception var26) {
                            }
                        }
                        if (this.field661 == null) {
                            try {
                                File var19 = new File(var12, arg2);
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
                                this.field652 = new class7(var21, "rw", 52428800L);
                                this.field644 = new class7[arg3];
                                for (int var22 = 0; var22 < arg3; var22++) {
                                    this.field644[var22] = new class7(new File(var19, "main_file_cache.idx" + var22), "rw", 1048576L);
                                }
                                this.field658 = new class7(new File(var19, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field650 = this.field661 = var19;
                            } catch (Exception var25) {
                                try {
                                    this.field652.method37((byte) 23);
                                    for (int var23 = 0; var23 < arg3; var23++) {
                                        this.field644[var23].method37((byte) 99);
                                    }
                                    this.field658.method37((byte) 50);
                                } catch (Exception var24) {
                                }
                                this.field644 = null;
                                this.field652 = this.field658 = null;
                                this.field650 = this.field661 = null;
                            }
                        }
                    } catch (Exception var27) {
                    }
                    if (var6 && this.field661 != null) {
                        return;
                    }
                }
            }
        }
        if (arg0 != 4) {
            field655 = null;
        }
        if (this.field661 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljb;")
    public final class64 method226(Class arg0, String arg1, int arg2) {
        return arg2 == -24656 ? this.method224(new Object[] { arg0, arg1 }, 0, 9, 0, 92) : null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class27(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field649 = "1.1";
        field655 = "Unknown";
        this.field654 = arg1;
        try {
            field655 = System.getProperty("java.vendor");
            field649 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field646 = System.getProperty("user.home");
            if (field646 != null) {
                field646 = field646 + "/";
            }
        } catch (Exception var9) {
        }
        if (field646 == null) {
            field646 = "~/";
        }
        try {
            this.field645 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field651 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field651 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field648 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field648 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method225(4, arg2, arg3, arg4);
        }
        this.field660 = false;
        this.field647 = new Thread(this);
        this.field647.setPriority(10);
        this.field647.setDaemon(true);
        this.field647.start();
    }
}
