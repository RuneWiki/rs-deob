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

@OriginalClass("client!ik")
public class class117 implements Runnable {

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lei;")
    private class232 field2180 = null;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Ljava/io/File;")
    public File field2185 = null;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lac;")
    public class137 field2183 = null;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "Ljava/io/File;")
    private File field2194 = null;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Lei;")
    private class232 field2190 = null;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Ljava/applet/Applet;")
    public Applet field2184 = null;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lac;")
    public class137 field2187 = null;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Z")
    private boolean field2197 = false;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "Lac;")
    public class137 field2199 = null;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field2198;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field2179;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field2196 = 3;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "Ldg;")
    private class210 field2192;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2178;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2182;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2188;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2189;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Ljava/lang/String;")
    private static String field2193;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2195;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2200;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2186;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2191;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[Lac;")
    public class137[] field2181;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/Object;III)Lei;")
    private final class232 method768(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class232 var6 = new class232();
        var6.field4070 = arg2;
        var6.field4065 = arg1;
        var6.field4067 = arg0;
        synchronized (this) {
            if (this.field2180 == null) {
                this.field2180 = this.field2190 = var6;
            } else {
                this.field2180.field4068 = var6;
                this.field2180 = var6;
            }
            this.notify();
            int var8 = 20 / ((arg3 + 48) / 48);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/Class;B)Lei;")
    public final class232 method769(Class arg0, byte arg1) {
        if (arg1 > -81) {
            this.field2192 = null;
        }
        return this.method768(13, arg0, 0, -101, 0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BILjava/lang/Runnable;)Lei;")
    public final class232 method770(byte arg0, int arg1, Runnable arg2) {
        if (arg0 >= -28) {
            this.method769((Class) null, (byte) -110);
        }
        return this.method768(2, arg2, arg1, -123, 0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;BI)Lei;")
    public final class232 method771(String arg0, byte arg1, int arg2) {
        if (arg1 < 107) {
            this.method775(-9, 4);
        }
        return this.method768(1, arg0, arg2, -107, 0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/Class;I)Lei;")
    public final class232 method772(Class arg0, int arg1) {
        return arg1 < 12 ? null : this.method768(11, arg0, 0, 88, 0);
    }

    @OriginalMember(owner = "client!ik", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class232 var2;
            synchronized (this) {
                while (true) {
                    if (this.field2197) {
                        return;
                    }
                    if (this.field2190 != null) {
                        var2 = this.field2190;
                        this.field2190 = this.field2190.field4068;
                        if (this.field2190 == null) {
                            this.field2180 = null;
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
                int var3 = var2.field4067;
                if (var3 == 1) {
                    var2.field4069 = new Socket(InetAddress.getByName((String) var2.field4065), var2.field4070);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field4065);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field4070);
                    var2.field4069 = var4;
                } else if (var3 == 4) {
                    var2.field4069 = new DataInputStream(((URL) var2.field4065).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field4065;
                    var2.field4069 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field4065;
                    var2.field4069 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field4066 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field4066 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Lei;")
    public final class232 method773(int arg0, String arg1, Class arg2) {
        return arg0 == 30810 ? this.method768(9, new Object[] { arg2, arg1 }, 0, -104, 0) : null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/net/URL;I)Lei;")
    public final class232 method774(URL arg0, int arg1) {
        if (arg1 != 0) {
            this.run();
        }
        return this.method768(4, arg0, 0, 12, 0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Lei;")
    public final class232 method775(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field2185 = null;
        }
        return this.method768(3, (Object) null, arg0, arg1 + 28, 0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)Lei;")
    public final class232 method776(Class[] arg0, int arg1, String arg2, Class arg3) {
        if (arg1 != 0) {
            this.method777(-119, (String) null, 20, -51);
        }
        return this.method768(8, new Object[] { arg3, arg2, arg0 }, 0, -98, 0);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;II)V")
    private final void method777(int arg0, String arg1, int arg2, int arg3) {
        if (arg0 < 32 || arg0 > 34) {
            arg0 = 32;
        }
        String[] var5 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field2193, "/tmp/", "" };
        if (arg2 != 34) {
            this.field2198 = null;
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
                        if (this.field2183 == null) {
                            try {
                                File var13 = new File(var11, "random.dat");
                                if (var7 == 1 || var13.exists()) {
                                    this.field2183 = new class137(var13, "rw", 25L);
                                }
                            } catch (Exception var21) {
                                this.field2183 = null;
                            }
                        }
                        if (this.field2194 == null) {
                            try {
                                File var14 = new File(var11, arg1);
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
                                this.field2187 = new class137(var16, "rw", 104857600L);
                                this.field2181 = new class137[arg3];
                                for (int var17 = 0; var17 < arg3; var17++) {
                                    this.field2181[var17] = new class137(new File(var14, "main_file_cache.idx" + var17), "rw", 1048576L);
                                }
                                this.field2199 = new class137(new File(var14, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2185 = this.field2194 = var14;
                            } catch (Exception var20) {
                                try {
                                    this.field2187.method943(arg2 ^ 0xFFFFE013);
                                    for (int var18 = 0; var18 < arg3; var18++) {
                                        this.field2181[var18].method943(-8143);
                                    }
                                    this.field2199.method943(-8143);
                                } catch (Exception var19) {
                                }
                                this.field2185 = this.field2194 = null;
                                this.field2181 = null;
                                this.field2187 = this.field2199 = null;
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (this.field2183 != null && this.field2194 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2194 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method778(int arg0) {
        synchronized (this) {
            if (arg0 != 0) {
                this.method772((Class) null, -14);
            }
            this.field2197 = true;
            this.notifyAll();
        }
        try {
            this.field2179.join();
        } catch (InterruptedException var8) {
        }
        if (this.field2187 != null) {
            try {
                this.field2187.method943(arg0 - 8143);
            } catch (IOException var7) {
            }
        }
        if (this.field2199 != null) {
            try {
                this.field2199.method943(-8143);
            } catch (IOException var6) {
            }
        }
        if (this.field2181 != null) {
            for (int var3 = 0; var3 < this.field2181.length; var3++) {
                if (this.field2181[var3] != null) {
                    try {
                        this.field2181[var3].method943(-8143);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field2183 != null) {
            try {
                this.field2183.method943(-8143);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Ldg;")
    public final class210 method779(int arg0) {
        return arg0 == 0 ? this.field2192 : null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLjava/lang/String;)Lei;")
    public final class232 method780(boolean arg0, String arg1) {
        return arg0 ? this.method768(12, arg1, 0, -124, 0) : null;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class117(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2200 = "1.1";
        this.field2184 = arg1;
        field2178 = "Unknown";
        try {
            field2178 = System.getProperty("java.vendor");
            field2200 = System.getProperty("java.version");
        } catch (Exception var13) {
        }
        try {
            field2188 = System.getProperty("os.name");
        } catch (Exception var12) {
            field2188 = "Unknown";
        }
        field2182 = field2188.toLowerCase();
        try {
            field2189 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var11) {
            field2189 = "";
        }
        try {
            field2195 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var10) {
            field2195 = "";
        }
        try {
            field2193 = System.getProperty("user.home");
            if (field2193 != null) {
                field2193 = field2193 + "/";
            }
        } catch (Exception var9) {
        }
        if (field2193 == null) {
            field2193 = "~/";
        }
        try {
            this.field2198 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2191 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2191 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field2186 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field2186 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method777(arg2, arg3, 34, arg4);
        }
        this.field2197 = false;
        this.field2179 = new Thread(this);
        this.field2179.setPriority(10);
        this.field2179.setDaemon(true);
        this.field2179.start();
    }
}
