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

@OriginalClass("mapview!i")
public class class16 implements Runnable {

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Lr;")
    private class29 field129 = null;

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "Lr;")
    private class29 field133 = null;

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "I")
    public int field135 = 0;

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "Ljava/lang/String;")
    private String field131 = null;

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field132 = null;

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "Ljava/lang/String;")
    private String field141 = null;

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "Z")
    private boolean field138 = false;

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "Ljava/lang/String;")
    public String field142 = null;

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Ljava/lang/String;")
    public String field128 = null;

    @OriginalMember(owner = "mapview!i", name = "n", descriptor = "Lc;")
    public class5 field139 = null;

    @OriginalMember(owner = "mapview!i", name = "s", descriptor = "Lc;")
    public class5 field144 = null;

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field127;

    @OriginalMember(owner = "mapview!i", name = "o", descriptor = "[Lc;")
    public class5[] field140;

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "Ljava/lang/Thread;")
    private Thread field136;

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "I")
    public static int field130 = 3;

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Ljava/lang/String;")
    public static String field134;

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "Ljava/lang/String;")
    public static String field137;

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "Ljava/lang/String;")
    private static String field143;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field126;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(II)Lr;", line = 5)
    public final class29 method87(int arg0, int arg1) {
        int var3 = -60 / ((-arg1 - 15) / 34);
        return this.method96(0, (byte) -110, 1, arg0, null);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 22)
    public final void method88(byte arg0) {
        if (arg0 <= 20) {
            this.method94(-127, -103);
        }
        synchronized (this) {
            this.field138 = true;
            this.notifyAll();
        }
        try {
            this.field136.join();
        } catch (InterruptedException var12) {
        }
        if (this.field139 != null) {
            try {
                this.field139.method24(-112);
            } catch (IOException var11) {
            }
        }
        if (this.field144 != null) {
            try {
                this.field144.method24(-125);
            } catch (IOException var10) {
            }
        }
        if (this.field140 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field140.length; var7++) {
            if (this.field140[var7] != null) {
                try {
                    this.field140[var7].method24(-122);
                } catch (IOException var9) {
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IZLjava/lang/Runnable;)Lr;", line = 79)
    public final class29 method89(int arg0, boolean arg1, Runnable arg2) {
        if (arg1) {
            this.method94(55, -87);
        }
        return this.method96(0, (byte) -114, 2, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(B)V", line = 95)
    private final void method90(byte arg0) {
        try {
            File var2 = new File(this.field131 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field131 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var9) {
        }
        try {
            DataInputStream var5 = new DataInputStream(new FileInputStream(this.field131 + "uid.dat"));
            this.field135 = var5.readInt() + 1;
            int var6 = 32 % ((-arg0 - 12) / 61);
            var5.close();
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Lr;", line = 125)
    public final class29 method91(Class arg0, boolean arg1, String arg2) {
        if (arg1) {
            this.method94(59, -72);
        }
        return this.method96(0, (byte) -126, 10, 0, new Object[] { arg0, arg2 });
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([Ljava/lang/Class;Ljava/lang/Class;ILjava/lang/String;)Lr;", line = 139)
    public final class29 method92(Class[] arg0, Class arg1, int arg2, String arg3) {
        return arg2 < 108 ? (class29) null : this.method96(0, (byte) -102, 9, 0, new Object[] { arg1, arg3, arg0 });
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BLjava/net/URL;)Lr;", line = 150)
    public final class29 method93(byte arg0, URL arg1) {
        if (arg0 != -66) {
            field134 = null;
        }
        return this.method96(0, (byte) -125, 4, 0, arg1);
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 432)
    public class16(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field134 = "1.1";
        field137 = "Unknown";
        this.field127 = arg2;
        this.field132 = arg1;
        try {
            field137 = System.getProperty("java.vendor");
            field134 = System.getProperty("java.version");
            field143 = System.getProperty("user.home");
            if (field143 != null) {
                field143 = field143 + "/";
            }
        } catch (Exception var11) {
        }
        try {
            if (arg1 == null) {
                field126 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field126 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var10) {
        }
        if (arg0) {
            this.method95(arg4, (byte) 13, arg3);
            this.field139 = new class5(new File(this.field141 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field140 = new class5[arg5];
            for (int var9 = 0; var9 < arg5; var9++) {
                this.field140[var9] = new class5(new File(this.field141 + "main_file_cache.idx" + var9), "rw", 1048576L);
            }
            this.field144 = new class5(new File(this.field141 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method90((byte) -108);
        }
        this.field138 = false;
        this.field136 = new Thread(this);
        this.field136.setPriority(10);
        this.field136.setDaemon(true);
        this.field136.start();
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(II)Lr;", line = 180)
    public final class29 method94(int arg0, int arg1) {
        return arg0 >= -86 ? (class29) null : this.method96(0, (byte) -117, 3, arg1, null);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 198)
    private final void method95(String arg0, byte arg1, int arg2) {
        int var4 = 36 % ((arg1 + 67) / 44);
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        if (field143 == null) {
            field143 = "~/";
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field143, "/tmp/", "" };
        String var6 = ".file_store_" + arg2;
        for (int var7 = 0; var7 < var5.length; var7++) {
            try {
                String var8 = var5[var7];
                if (var8.length() > 0) {
                    File var9 = new File(var8);
                    if (!var9.exists()) {
                        continue;
                    }
                }
                File var10 = new File(var8 + var6);
                if (var10.exists() || var10.mkdir()) {
                    if (arg0.length() > 0) {
                        var10 = new File(var10, arg0);
                        if (!var10.exists() && !var10.mkdir()) {
                            continue;
                        }
                    }
                    this.field128 = this.field131 = var10.getParent() + "/";
                    this.field142 = this.field141 = var10.getPath() + "/";
                    return;
                }
            } catch (Exception var12) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IBIILjava/lang/Object;)Lr;", line = 283)
    private final class29 method96(int arg0, byte arg1, int arg2, int arg3, Object arg4) {
        class29 var6 = new class29();
        var6.field319 = arg4;
        var6.field317 = arg3;
        var6.field322 = arg2;
        synchronized (this) {
            if (this.field129 == null) {
                this.field129 = this.field133 = var6;
            } else {
                this.field129.field318 = var6;
                this.field129 = var6;
            }
            this.notify();
        }
        return arg1 > -98 ? (class29) null : var6;
    }

    @OriginalMember(owner = "mapview!i", name = "run", descriptor = "()V", line = 328)
    public final void run() {
        while (true) {
            class29 var2;
            synchronized (this) {
                while (true) {
                    if (this.field138) {
                        return;
                    }
                    if (this.field133 != null) {
                        var2 = this.field133;
                        this.field133 = this.field133.field318;
                        if (this.field133 == null) {
                            this.field129 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }
            try {
                int var5 = var2.field322;
                if (var5 == 1) {
                    var2.field321 = new Socket(this.field127, var2.field317);
                } else if (var5 == 2) {
                    Thread var8 = new Thread((Runnable) var2.field319);
                    var8.setDaemon(true);
                    var8.start();
                    var8.setPriority(var2.field317);
                    var2.field321 = var8;
                } else if (var5 == 4) {
                    var2.field321 = new DataInputStream(((URL) var2.field319).openStream());
                } else if (var5 == 9) {
                    Object[] var6 = (Object[]) var2.field319;
                    var2.field321 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var5 == 10) {
                    Object[] var7 = (Object[]) var2.field319;
                    var2.field321 = ((Class) var7[0]).getDeclaredField((String) var7[1]);
                } else {
                    throw new Exception();
                }
                var2.field320 = 1;
            } catch (Exception var10) {
                var2.field320 = 2;
            }
        }
    }
}
