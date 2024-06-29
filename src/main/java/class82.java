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

@OriginalClass("client!nd")
public class class82 implements Runnable {

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Ljava/lang/String;")
    private String field1866 = null;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Z")
    private boolean field1860 = false;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Lqb;")
    private class97 field1863 = null;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lr;")
    public class100 field1862 = null;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Ljava/lang/String;")
    private String field1864 = null;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public int field1872 = 0;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Ljava/lang/String;")
    public String field1876 = null;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "Ljava/lang/String;")
    public String field1873 = null;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lr;")
    public class100 field1861 = null;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "Ljava/applet/Applet;")
    public Applet field1871 = null;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lqb;")
    private class97 field1878 = null;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field1877;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "[Lr;")
    public class100[] field1870;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "[Lr;")
    public class100[] field1869;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Ljava/lang/Thread;")
    private Thread field1880;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field1874 = 3;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lgb;")
    private class39 field1865;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Lqd;")
    private class99 field1875;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1867;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1879;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1868;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Runnable;II)Lqb;")
    public final class97 method617(Runnable arg0, int arg1, int arg2) {
        return arg1 == -10172 ? this.method624(arg0, 118, arg2, 0, 2) : null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Lqb;")
    public final class97 method618(int arg0, byte arg1) {
        if (arg1 <= 126) {
            this.field1880 = null;
        }
        return this.method624(null, 125, arg0, 0, 3);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    private final void method619(String arg0, byte arg1, int arg2) {
        if (arg2 < 32 || arg2 > 34) {
            arg2 = 32;
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
        if (arg1 <= 17) {
            this.field1871 = null;
        }
        String var5 = ".file_store_" + arg2;
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
                    if (arg0.length() > 0) {
                        var9 = new File(var9, arg0);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field1873 = this.field1864 = var9.getParent() + "/";
                    this.field1876 = this.field1866 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Lqd;")
    public final class99 method620(int arg0) {
        if (arg0 != -2321) {
            this.field1865 = null;
        }
        return this.field1875;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public final void method621(int arg0) {
        synchronized (this) {
            this.field1860 = true;
            this.notifyAll();
        }
        try {
            this.field1880.join();
        } catch (InterruptedException var9) {
        }
        if (this.field1865 != null) {
            this.field1865.method312((byte) 97);
        }
        if (this.field1862 != null) {
            try {
                this.field1862.method714(-1);
            } catch (IOException var8) {
            }
        }
        if (this.field1869 != null) {
            for (int var3 = 0; var3 < this.field1869.length; var3++) {
                if (this.field1869[var3] != null) {
                    try {
                        this.field1869[var3].method714(-1);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field1861 != null) {
            try {
                this.field1861.method714(-1);
            } catch (IOException var6) {
            }
        }
        if (this.field1870 != null) {
            for (int var4 = 0; var4 < this.field1870.length; var4++) {
                if (this.field1870[var4] != null) {
                    try {
                        this.field1870[var4].method714(-1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (arg0 <= 47) {
            this.method626((byte) -92, null, null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/net/URL;I)Lqb;")
    public final class97 method622(URL arg0, int arg1) {
        if (arg1 < 114) {
            this.field1864 = null;
        }
        return this.method624(arg0, 55, 0, 0, 4);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Lgb;")
    public final class39 method623(int arg0) {
        return arg0 == 7467 ? this.field1865 : null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lqb;")
    private final class97 method624(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class97 var6 = new class97();
        var6.field2156 = arg4;
        var6.field2155 = arg2;
        var6.field2158 = arg0;
        synchronized (this) {
            if (this.field1863 == null) {
                this.field1863 = this.field1878 = var6;
            } else {
                this.field1863.field2159 = var6;
                this.field1863 = var6;
            }
            this.notify();
        }
        if (arg1 <= 14) {
            field1879 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)Lqb;")
    public final class97 method625(int arg0) {
        if (arg0 != 0) {
            this.method626((byte) -41, null, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Lqb;")
    public final class97 method626(byte arg0, Class arg1, String arg2) {
        return arg0 == -79 ? this.method624(new Object[] { arg1, arg2 }, 124, 0, 0, 10) : null;
    }

    @OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class97 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1860) {
                        return;
                    }
                    if (this.field1878 != null) {
                        var2 = this.field1878;
                        this.field1878 = this.field1878.field2159;
                        if (this.field1878 == null) {
                            this.field1863 = null;
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
                int var3 = var2.field2156;
                if (var3 == 1) {
                    var2.field2154 = new Socket(this.field1877, var2.field2155);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2158);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2155);
                    var2.field2154 = var4;
                } else if (var3 == 4) {
                    var2.field2154 = new DataInputStream(((URL) var2.field2158).openStream());
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2158;
                    var2.field2154 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 10) {
                    Object[] var5 = (Object[]) var2.field2158;
                    var2.field2154 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field2157 = 1;
            } catch (Exception var9) {
                var2.field2157 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lqb;")
    public final class97 method627(boolean arg0, Class[] arg1, String arg2, Class arg3) {
        return arg0 ? null : this.method624(new Object[] { arg3, arg2, arg1 }, 20, 0, 0, 9);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)Lqb;")
    public final class97 method628(int arg0, byte arg1) {
        if (arg1 >= -2) {
            this.field1866 = null;
        }
        return this.method624(null, 53, arg0, 0, 1);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    private final void method629(byte arg0) {
        try {
            File var2 = new File(this.field1864 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field1864 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field1864 + "uid.dat"));
            if (arg0 == -111) {
                this.field1872 = var4.readInt() + 1;
                var4.close();
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
    public class82(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        field1867 = "Unknown";
        this.field1871 = arg1;
        field1879 = "1.1";
        this.field1877 = arg2;
        try {
            field1867 = System.getProperty("java.vendor");
            field1879 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field1868 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field1868 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method619(arg4, (byte) 22, arg3);
            File var7 = new File(this.field1864 + "main_file_cache.dat");
            if (var7.exists()) {
                this.field1861 = new class100(var7, "rw", 52428800L);
            }
            this.field1870 = new class100[5];
            for (int var8 = 0; var8 < 5; var8++) {
                File var9 = new File(this.field1864 + "main_file_cache.idx" + var8);
                if (var9.exists()) {
                    this.field1870[var8] = new class100(var9, "rw", 1048576L);
                }
            }
            this.field1862 = new class100(new File(this.field1866 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field1869 = new class100[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field1869[var10] = new class100(new File(this.field1866 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.method629((byte) -111);
        }
        this.field1860 = false;
        this.field1880 = new Thread(this);
        this.field1880.setPriority(10);
        this.field1880.setDaemon(true);
        this.field1880.start();
    }
}
