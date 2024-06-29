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

@OriginalClass("client!vb")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public int field3026 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lk;")
    public class60 field3025 = null;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Ljava/lang/String;")
    public String field3034 = null;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lud;")
    private class121 field3033 = null;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Ljava/lang/String;")
    private String field3039 = null;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Ljava/lang/String;")
    public String field3040 = null;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljava/lang/String;")
    private String field3028 = null;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Lud;")
    private class121 field3038 = null;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Z")
    private boolean field3042 = false;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Ljava/applet/Applet;")
    public Applet field3036 = null;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lk;")
    public class60 field3030 = null;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field3041;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lk;")
    public class60[] field3027;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/lang/Thread;")
    private Thread field3029;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field3024 = 3;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lma;")
    private class73 field3031;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lbb;")
    private class9 field3043;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3032;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Ljava/lang/String;")
    private static String field3035;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3037;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field3044;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/net/URL;)Lud;", line = 5)
    public final class121 method981(int arg0, URL arg1) {
        if (arg0 != -16938) {
            this.method992(-66);
        }
        return this.method989(4, arg1, 0, 0, (byte) -50);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 17)
    private final void method982(int arg0, String arg1, int arg2) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        if (field3035 == null) {
            field3035 = "~/";
        }
        String var4 = ".file_store_" + arg0;
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", field3035, "/tmp/", "" };
        for (int var6 = arg2; var6 < var5.length; var6++) {
            try {
                String var7 = var5[var6];
                if (var7.length() > 0) {
                    File var8 = new File(var7);
                    if (!var8.exists()) {
                        continue;
                    }
                }
                File var9 = new File(var7 + var4);
                if (var9.exists() || var9.mkdir()) {
                    if (arg1.length() > 0) {
                        var9 = new File(var9, arg1);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field3040 = this.field3039 = var9.getParent() + "/";
                    this.field3034 = this.field3028 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V", line = 455)
    public class124(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field3041 = arg2;
        this.field3036 = arg1;
        field3032 = "Unknown";
        field3037 = "1.1";
        try {
            field3032 = System.getProperty("java.vendor");
            field3037 = System.getProperty("java.version");
            field3035 = System.getProperty("user.home");
            if (field3035 != null) {
                field3035 = field3035 + "/";
            }
        } catch (Exception var9) {
        }
        try {
            if (arg1 == null) {
                field3044 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field3044 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var8) {
        }
        if (arg0) {
            this.method982(arg3, arg4, 0);
            this.field3025 = new class60(new File(this.field3028 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field3027 = new class60[arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                this.field3027[var7] = new class60(new File(this.field3028 + "main_file_cache.idx" + var7), "rw", 1048576L);
            }
            this.field3030 = new class60(new File(this.field3028 + "main_file_cache.idx255"), "rw", 1048576L);
            this.method991(99999999);
        }
        this.field3042 = false;
        this.field3029 = new Thread(this);
        this.field3029.setPriority(10);
        this.field3029.setDaemon(true);
        this.field3029.start();
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)Lud;", line = 102)
    public final class121 method983(int arg0, boolean arg1) {
        if (!arg1) {
            this.field3039 = null;
        }
        return this.method989(1, null, arg0, 0, (byte) -116);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lud;", line = 125)
    public final class121 method984(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method984(39, 103);
        }
        return this.method989(3, null, arg1, 0, (byte) 51);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Lud;", line = 139)
    public final class121 method985(int arg0) {
        int var2 = 63 / ((arg0 - 11) / 52);
        return null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lud;", line = 158)
    public final class121 method986(int arg0, Runnable arg1, int arg2) {
        return arg0 == 0 ? this.method989(2, arg1, arg2, 0, (byte) -54) : null;
    }

    @OriginalMember(owner = "client!vb", name = "run", descriptor = "()V", line = 169)
    public final void run() {
        while (true) {
            class121 var2;
            synchronized (this) {
                while (true) {
                    if (this.field3042) {
                        return;
                    }
                    if (this.field3038 != null) {
                        var2 = this.field3038;
                        this.field3038 = this.field3038.field2961;
                        if (this.field3038 == null) {
                            this.field3033 = null;
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
                int var3 = var2.field2963;
                if (var3 == 1) {
                    var2.field2959 = new Socket(this.field3041, var2.field2962);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2960);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2962);
                    var2.field2959 = var4;
                } else if (var3 == 4) {
                    var2.field2959 = new DataInputStream(((URL) var2.field2960).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2960;
                    var2.field2959 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var6 = (Object[]) var2.field2960;
                    var2.field2959 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else {
                    throw new Exception();
                }
                var2.field2964 = 1;
            } catch (Exception var9) {
                var2.field2964 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 269)
    public final void method987(byte arg0) {
        if (arg0 > -125) {
            field3044 = null;
        }
        synchronized (this) {
            this.field3042 = true;
            this.notifyAll();
        }
        try {
            this.field3029.join();
        } catch (InterruptedException var7) {
        }
        if (this.field3043 != null) {
            this.field3043.method55(24500);
        }
        if (this.field3025 != null) {
            try {
                this.field3025.method482(-29352);
            } catch (IOException var6) {
            }
        }
        if (this.field3030 != null) {
            try {
                this.field3030.method482(-29352);
            } catch (IOException var5) {
            }
        }
        if (this.field3027 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field3027.length; var3++) {
            if (this.field3027[var3] != null) {
                try {
                    this.field3027[var3].method482(-29352);
                } catch (IOException var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Lma;", line = 320)
    public final class73 method988(byte arg0) {
        if (arg0 != -47) {
            this.method982(70, null, -20);
        }
        return this.field3031;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/lang/Object;IIB)Lud;", line = 336)
    private final class121 method989(int arg0, Object arg1, int arg2, int arg3, byte arg4) {
        int var6 = 30 % ((arg4 - 8) / 37);
        class121 var7 = new class121();
        var7.field2963 = arg0;
        var7.field2962 = arg2;
        var7.field2960 = arg1;
        synchronized (this) {
            if (this.field3033 == null) {
                this.field3033 = this.field3038 = var7;
            } else {
                this.field3033.field2961 = var7;
                this.field3033 = var7;
            }
            this.notify();
            return var7;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/Class;Ljava/lang/String;)Lud;", line = 370)
    public final class121 method990(Class[] arg0, int arg1, Class arg2, String arg3) {
        int var5 = 89 % ((arg1 - 91) / 32);
        return this.method989(9, new Object[] { arg2, arg3, arg0 }, 0, 0, (byte) 106);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 380)
    private final void method991(int arg0) {
        try {
            File var2 = new File(this.field3039 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field3039 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field3039 + "uid.dat"));
            this.field3026 = var4.readInt() + 1;
            if (arg0 != 99999999) {
                this.method990(null, 98, null, null);
            }
            var4.close();
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)Lbb;", line = 414)
    public final class9 method992(int arg0) {
        return arg0 == 2 ? this.field3043 : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Lud;", line = 441)
    public final class121 method993(Class arg0, int arg1, String arg2) {
        if (arg1 != 0) {
            this.field3031 = null;
        }
        return this.method989(10, new Object[] { arg0, arg2 }, 0, 0, (byte) 66);
    }
}
