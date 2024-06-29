import java.applet.Applet;
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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class110 implements Runnable {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Lgb;")
    private class39 field2696 = null;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Ljava/lang/String;")
    private String field2695 = null;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lnb;")
    public class80 field2698 = null;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Ljava/lang/String;")
    public String field2707 = null;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Ljava/lang/String;")
    public String field2699 = null;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lgb;")
    private class39 field2708 = null;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Ljava/lang/String;")
    private String field2710 = null;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field2712 = null;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lnb;")
    public class80 field2714 = null;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Z")
    private boolean field2713 = false;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field2716 = 0;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field2709;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[Lnb;")
    public class80[] field2703;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field2705;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2711 = 3;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lu;")
    private class118 field2700;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lmd;")
    private class76 field2704;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2701;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2702;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "Ljava/lang/String;")
    private static String field2715;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2697;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2706;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)Lgb;", line = 3)
    public final class39 method836(byte arg0, int arg1) {
        return arg0 > -119 ? null : this.method846(0, false, 3, null, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 25)
    private final void method837(boolean arg0, String arg1, int arg2) {
        if (field2715 == null) {
            field2715 = "~/";
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field2715, "/tmp/", "" };
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String var5 = ".file_store_" + arg2;
        if (arg0) {
            this.method839((byte) 122, -34);
        }
        for (int var6 = 0; var6 < var4.length; var6++) {
            try {
                String var7 = var4[var6];
                if (var7.length() > 0) {
                    File var8 = new File(var7);
                    if (!var8.exists()) {
                        continue;
                    }
                }
                File var9 = new File(var7 + var5);
                if (var9.exists() || var9.mkdir()) {
                    if (arg1.length() > 0) {
                        var9 = new File(var9, arg1);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field2699 = this.field2695 = var9.getParent() + "/";
                    this.field2707 = this.field2710 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Lu;", line = 100)
    public final class118 method838(boolean arg0) {
        return arg0 ? null : this.field2700;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)Lgb;", line = 111)
    public final class39 method839(byte arg0, int arg1) {
        int var3 = -29 % ((-arg0 - 9) / 52);
        return this.method846(0, false, 1, null, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 125)
    private final void method840(int arg0) {
        try {
            File var2 = new File(this.field2695 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field2695 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == -1996) {
                DataInputStream var4 = new DataInputStream(new FileInputStream(this.field2695 + "uid.dat"));
                this.field2716 = var4.readInt() + 1;
                var4.close();
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 458)
    public class110(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field2701 = "Unknown";
        this.field2712 = arg1;
        this.field2709 = arg2;
        field2702 = "1.1";
        try {
            field2701 = System.getProperty("java.vendor");
            field2702 = System.getProperty("java.version");
            field2715 = System.getProperty("user.home");
            if (field2715 != null) {
                field2715 = field2715 + "/";
            }
        } catch (Exception var10) {
        }
        try {
            if (arg1 == null) {
                field2706 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2706 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field2697 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2697 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method837(false, arg4, arg3);
            this.field2714 = new class80(new File(this.field2710 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field2703 = new class80[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field2703[var7] = new class80(new File(this.field2710 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field2698 = new class80(new File(this.field2710 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method840(-1996);
        }
        this.field2713 = false;
        this.field2705 = new Thread(this);
        this.field2705.setPriority(10);
        this.field2705.setDaemon(true);
        this.field2705.start();
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lmd;", line = 157)
    public final class76 method841(int arg0) {
        return arg0 == 1 ? this.field2704 : null;
    }

    @OriginalMember(owner = "client!sb", name = "run", descriptor = "()V", line = 172)
    public final void run() {
        while (true) {
            class39 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2713) {
                        return;
                    }
                    if (this.field2696 != null) {
                        var2 = this.field2696;
                        this.field2696 = this.field2696.field1102;
                        if (this.field2696 == null) {
                            this.field2708 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var10) {
                    }
                }
            }
            try {
                int var3 = var2.field1101;
                if (var3 == 1) {
                    var2.field1100 = new Socket(this.field2709, var2.field1103);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field1098);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field1103);
                    var2.field1100 = var6;
                } else if (var3 == 4) {
                    var2.field1100 = new DataInputStream(((URL) var2.field1098).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field1098;
                    var2.field1100 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var4 = (Object[]) var2.field1098;
                    var2.field1100 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field1099 = 1;
            } catch (Exception var9) {
                var2.field1099 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Runnable;BI)Lgb;", line = 277)
    public final class39 method842(Runnable arg0, byte arg1, int arg2) {
        int var4 = 94 % ((13 - arg1) / 42);
        return this.method846(0, false, 2, arg0, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/net/URL;B)Lgb;", line = 287)
    public final class39 method843(URL arg0, byte arg1) {
        if (arg1 <= 116) {
            this.method843(null, (byte) 83);
        }
        return this.method846(0, false, 4, arg0, 0);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 318)
    public final void method844(int arg0) {
        synchronized (this) {
            this.field2713 = true;
            this.notifyAll();
        }
        try {
            this.field2705.join();
        } catch (InterruptedException var7) {
        }
        if (this.field2700 != null) {
            this.field2700.method911(-71);
        }
        if (arg0 != -11) {
            this.method839((byte) 21, -125);
        }
        if (this.field2714 != null) {
            try {
                this.field2714.method614(-127);
            } catch (IOException var6) {
            }
        }
        if (this.field2698 != null) {
            try {
                this.field2698.method614(-114);
            } catch (IOException var5) {
            }
        }
        if (this.field2703 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2703.length; var3++) {
            if (this.field2703[var3] != null) {
                try {
                    this.field2703[var3].method614(arg0 + 7);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;[Ljava/lang/Class;)Lgb;", line = 382)
    public final class39 method845(Class arg0, boolean arg1, String arg2, Class[] arg3) {
        if (!arg1) {
            this.method837(false, null, 105);
        }
        return this.method846(0, false, 9, new Object[] { arg0, arg2, arg3 }, 0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZILjava/lang/Object;I)Lgb;", line = 399)
    private final class39 method846(int arg0, boolean arg1, int arg2, Object arg3, int arg4) {
        if (arg1) {
            this.field2700 = null;
        }
        class39 var6 = new class39();
        var6.field1098 = arg3;
        var6.field1101 = arg2;
        var6.field1103 = arg4;
        synchronized (this) {
            if (this.field2708 == null) {
                this.field2708 = this.field2696 = var6;
            } else {
                this.field2708.field1102 = var6;
                this.field2708 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)Lgb;", line = 432)
    public final class39 method847(int arg0) {
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Lgb;", line = 444)
    public final class39 method848(String arg0, int arg1, Class arg2) {
        return arg1 == 0 ? this.method846(0, false, 10, new Object[] { arg2, arg0 }, 0) : null;
    }
}
