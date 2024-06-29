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

@OriginalClass("client!qd")
public class class99 implements Runnable {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Ljava/lang/String;")
    private String field2173 = null;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public int field2167 = 0;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Lua;")
    private class116 field2176 = null;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lqb;")
    public class97 field2171 = null;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lqb;")
    public class97 field2182 = null;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Ljava/lang/String;")
    public String field2183 = null;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lua;")
    private class116 field2168 = null;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Ljava/lang/String;")
    private String field2184 = null;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field2178 = null;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Z")
    private boolean field2185 = false;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Ljava/lang/String;")
    public String field2181 = null;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Ljava/net/InetAddress;")
    private InetAddress field2170;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[Lqb;")
    public class97[] field2179;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "[Lqb;")
    public class97[] field2165;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Ljava/lang/Thread;")
    private Thread field2174;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field2175 = 3;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lr;")
    private class100 field2172;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lfa;")
    private class32 field2166;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2169;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2180;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2177;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)Lfa;")
    public final class32 method747(int arg0) {
        if (arg0 != 9854) {
            this.field2170 = null;
        }
        return this.field2166;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/net/URL;)Lua;")
    public final class116 method748(int arg0, URL arg1) {
        if (arg0 != 0) {
            this.method758(-112);
        }
        return this.method750(arg1, 0, -35, 0, 4);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    private final void method749(byte arg0) {
        try {
            File var2 = new File(this.field2173 + "uid.dat");
            if (!var2.exists() || var2.length() < 4L) {
                DataOutputStream var3 = new DataOutputStream(new FileOutputStream(this.field2173 + "uid.dat"));
                var3.writeInt((int) (Math.random() * 9.9999999E7D));
                var3.close();
            }
        } catch (Exception var6) {
        }
        try {
            DataInputStream var4 = new DataInputStream(new FileInputStream(this.field2173 + "uid.dat"));
            if (arg0 > 8) {
                this.field2167 = var4.readInt() + 1;
                var4.close();
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lua;")
    private final class116 method750(Object arg0, int arg1, int arg2, int arg3, int arg4) {
        class116 var6 = new class116();
        var6.field2506 = arg0;
        var6.field2503 = arg4;
        var6.field2508 = arg1;
        if (arg2 >= -3) {
            this.field2165 = null;
        }
        synchronized (this) {
            if (this.field2176 == null) {
                this.field2176 = this.field2168 = var6;
            } else {
                this.field2176.field2507 = var6;
                this.field2176 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lua;")
    public final class116 method751(int arg0, Runnable arg1, int arg2) {
        if (arg2 <= 54) {
            this.field2176 = null;
        }
        return this.method750(arg1, arg0, -32, 0, 2);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lua;")
    public final class116 method752(int arg0, String arg1, Class arg2) {
        if (arg0 != -3) {
            this.method757(22, true, null);
        }
        return this.method750(new Object[] { arg2, arg1 }, 0, -73, 0, 10);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)Lua;")
    public final class116 method753(int arg0) {
        int var2 = -9 / ((arg0 - 58) / 55);
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class116 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2185) {
                        return;
                    }
                    if (this.field2168 != null) {
                        var2 = this.field2168;
                        this.field2168 = this.field2168.field2507;
                        if (this.field2168 == null) {
                            this.field2176 = null;
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
                int var3 = var2.field2503;
                if (var3 == 1) {
                    var2.field2505 = new Socket(this.field2170, var2.field2508);
                } else if (var3 == 2) {
                    Thread var6 = new Thread((Runnable) var2.field2506);
                    var6.setDaemon(true);
                    var6.start();
                    var6.setPriority(var2.field2508);
                    var2.field2505 = var6;
                } else if (var3 == 4) {
                    var2.field2505 = new DataInputStream(((URL) var2.field2506).openStream());
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field2506;
                    var2.field2505 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 10) {
                    Object[] var4 = (Object[]) var2.field2506;
                    var2.field2505 = ((Class) var4[0]).getDeclaredField((String) var4[1]);
                } else {
                    throw new Exception();
                }
                var2.field2504 = 1;
            } catch (Exception var9) {
                var2.field2504 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BI)Lua;")
    public final class116 method754(byte arg0, int arg1) {
        if (arg0 != -17) {
            field2169 = null;
        }
        return this.method750(null, arg1, -50, 0, 3);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Lua;")
    public final class116 method755(int arg0, byte arg1) {
        int var3 = 74 / ((53 - arg1) / 44);
        return this.method750(null, arg0, -107, 0, 1);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public final void method756(int arg0) {
        synchronized (this) {
            this.field2185 = true;
            this.notifyAll();
        }
        try {
            this.field2174.join();
        } catch (InterruptedException var9) {
        }
        if (this.field2166 != null) {
            this.field2166.method203(false);
        }
        if (this.field2182 != null) {
            try {
                this.field2182.method735(0);
            } catch (IOException var8) {
            }
        }
        if (arg0 > -97) {
            return;
        }
        if (this.field2165 != null) {
            for (int var3 = 0; var3 < this.field2165.length; var3++) {
                if (this.field2165[var3] != null) {
                    try {
                        this.field2165[var3].method735(0);
                    } catch (IOException var7) {
                    }
                }
            }
        }
        if (this.field2171 != null) {
            try {
                this.field2171.method735(0);
            } catch (IOException var6) {
            }
        }
        if (this.field2179 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2179.length; var4++) {
            if (this.field2179[var4] != null) {
                try {
                    this.field2179[var4].method735(0);
                } catch (IOException var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZLjava/lang/String;)V")
    private final void method757(int arg0, boolean arg1, String arg2) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        if (!arg1) {
            this.run();
        }
        String[] var4 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "" };
        String var5 = ".file_store_" + arg0;
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
                    if (arg2.length() > 0) {
                        var9 = new File(var9, arg2);
                        if (!var9.exists() && !var9.mkdir()) {
                            continue;
                        }
                    }
                    this.field2183 = this.field2173 = var9.getParent() + "/";
                    this.field2181 = this.field2184 = var9.getPath() + "/";
                    return;
                }
            } catch (Exception var10) {
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lr;")
    public final class100 method758(int arg0) {
        if (arg0 != 0) {
            this.method759(null, (byte) 64, null, null);
        }
        return this.field2172;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Class;Ljava/lang/Class;)Lua;")
    public final class116 method759(String arg0, byte arg1, Class[] arg2, Class arg3) {
        if (arg1 >= -86) {
            this.field2170 = null;
        }
        return this.method750(new Object[] { arg3, arg0, arg2 }, 0, -10, 0, 9);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
    public class99(boolean arg0, Applet arg1, InetAddress arg2, int arg3, String arg4, int arg5) throws IOException {
        this.field2170 = arg2;
        field2169 = "1.1";
        field2180 = "Unknown";
        this.field2178 = arg1;
        try {
            field2180 = System.getProperty("java.vendor");
            field2169 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            if (arg1 == null) {
                field2177 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2177 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var11) {
        }
        if (arg0) {
            this.method757(arg3, true, arg4);
            File var7 = new File(this.field2173 + "main_file_cache.dat");
            if (var7.exists()) {
                this.field2171 = new class97(var7, "rw", 52428800L);
            }
            this.field2179 = new class97[5];
            for (int var8 = 0; var8 < 5; var8++) {
                File var9 = new File(this.field2173 + "main_file_cache.idx" + var8);
                if (var9.exists()) {
                    this.field2179[var8] = new class97(var9, "rw", 1048576L);
                }
            }
            this.field2182 = new class97(new File(this.field2184 + "main_file_cache.dat2"), "rw", 52428800L);
            this.field2165 = new class97[arg5];
            for (int var10 = 0; var10 < arg5; var10++) {
                this.field2165[var10] = new class97(new File(this.field2184 + "main_file_cache.idx" + var10), "rw", 1048576L);
            }
            this.method749((byte) 126);
        }
        this.field2185 = false;
        this.field2174 = new Thread(this);
        this.field2174.setPriority(10);
        this.field2174.setDaemon(true);
        this.field2174.start();
    }
}
