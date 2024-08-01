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

@OriginalClass("ke")
public class class99 implements Runnable {

    @OriginalMember(owner = "ke", name = "c", descriptor = "Lsa;")
    public class167 field1990 = null;

    @OriginalMember(owner = "ke", name = "d", descriptor = "Lsa;")
    public class167 field1991 = null;

    @OriginalMember(owner = "ke", name = "a", descriptor = "Lsa;")
    public class167 field1988 = null;

    @OriginalMember(owner = "ke", name = "i", descriptor = "Z")
    private boolean field1996 = false;

    @OriginalMember(owner = "ke", name = "q", descriptor = "Ljava/io/File;")
    private File field2004 = null;

    @OriginalMember(owner = "ke", name = "g", descriptor = "Lda;")
    private class32 field1994 = null;

    @OriginalMember(owner = "ke", name = "s", descriptor = "Ljava/io/File;")
    public File field2006 = null;

    @OriginalMember(owner = "ke", name = "n", descriptor = "Ljava/applet/Applet;")
    public Applet field2001 = null;

    @OriginalMember(owner = "ke", name = "k", descriptor = "Lda;")
    private class32 field1998 = null;

    @OriginalMember(owner = "ke", name = "j", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field1997;

    @OriginalMember(owner = "ke", name = "b", descriptor = "Ljava/lang/Thread;")
    private Thread field1989;

    @OriginalMember(owner = "ke", name = "o", descriptor = "I")
    public static int field2002 = 3;

    @OriginalMember(owner = "ke", name = "p", descriptor = "Lfg;")
    private class58 field2003;

    @OriginalMember(owner = "ke", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1993;

    @OriginalMember(owner = "ke", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1995;

    @OriginalMember(owner = "ke", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2000;

    @OriginalMember(owner = "ke", name = "e", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field1992;

    @OriginalMember(owner = "ke", name = "r", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field2005;

    @OriginalMember(owner = "ke", name = "l", descriptor = "[Lsa;")
    public class167[] field1999;

    @OriginalMember(owner = "ke", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lda;")
    public final class32 method694(Runnable arg0, int arg1, byte arg2) {
        if (arg2 != 46) {
            this.field2001 = null;
        }
        return this.method696(arg1, arg0, 2, (byte) 121, 0);
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(I)Lfg;")
    public final class58 method695(int arg0) {
        int var2 = -65 % ((arg0 + 73) / 32);
        return this.field2003;
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(ILjava/lang/Object;IBI)Lda;")
    private final class32 method696(int arg0, Object arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 49) {
            return null;
        }
        class32 var6 = new class32();
        var6.field751 = arg0;
        var6.field750 = arg1;
        var6.field747 = arg2;
        synchronized (this) {
            if (this.field1994 == null) {
                this.field1994 = this.field1998 = var6;
            } else {
                this.field1994.field749 = var6;
                this.field1994 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Lda;")
    public final class32 method697(Class arg0, String arg1, boolean arg2) {
        if (!arg2) {
            this.field1991 = null;
        }
        return this.method696(0, new Object[] { arg0, arg1 }, 9, (byte) 76, 0);
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(Ljava/lang/String;IBI)V")
    private final void method698(String arg0, int arg1, byte arg2, int arg3) {
        if (arg3 < 32 || arg3 > 34) {
            arg3 = 32;
        }
        int var5 = 69 / ((arg2 - 26) / 63);
        String[] var6 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1993, "/tmp/", "" };
        String[] var7 = new String[] { ".jagex_cache_" + arg3, ".file_store_" + arg3 };
        for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var7.length; var9++) {
                for (int var10 = 0; var10 < var6.length; var10++) {
                    try {
                        String var11 = var6[var10];
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
                        if (this.field1991 == null) {
                            try {
                                File var14 = new File(var12, "random.dat");
                                if (var8 == 1 || var14.exists()) {
                                    this.field1991 = new class167(var14, "rw", 25L);
                                }
                            } catch (Exception var22) {
                                this.field1991 = null;
                            }
                        }
                        if (this.field2004 == null) {
                            try {
                                File var15 = new File(var12, arg0);
                                if (var8 == 1 && !var15.exists()) {
                                    boolean var16 = var15.mkdir();
                                    if (!var16) {
                                        continue;
                                    }
                                }
                                File var17 = new File(var15, "main_file_cache.dat2");
                                if (var8 == 0 && !var17.exists()) {
                                    continue;
                                }
                                this.field1988 = new class167(var17, "rw", 104857600L);
                                this.field1999 = new class167[arg1];
                                for (int var18 = 0; var18 < arg1; var18++) {
                                    this.field1999[var18] = new class167(new File(var15, "main_file_cache.idx" + var18), "rw", 1048576L);
                                }
                                this.field1990 = new class167(new File(var15, "main_file_cache.idx255"), "rw", 1048576L);
                                this.field2006 = this.field2004 = var15;
                            } catch (Exception var21) {
                                try {
                                    this.field1988.method1120((byte) 91);
                                    for (int var19 = 0; var19 < arg1; var19++) {
                                        this.field1999[var19].method1120((byte) 107);
                                    }
                                    this.field1990.method1120((byte) 39);
                                } catch (Exception var20) {
                                }
                                this.field1999 = null;
                                this.field2006 = this.field2004 = null;
                                this.field1988 = this.field1990 = null;
                            }
                        }
                    } catch (Exception var23) {
                    }
                    if (this.field1991 != null && this.field2004 != null) {
                        return;
                    }
                }
            }
        }
        if (this.field2004 == null) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(Ljava/net/URL;I)Lda;")
    public final class32 method699(URL arg0, int arg1) {
        return arg1 == -896798992 ? this.method696(0, arg0, 4, (byte) 122, 0) : null;
    }

    @OriginalMember(owner = "ke", name = "run", descriptor = "()V")
    public final void run() {
        while (true) {
            class32 var2;
            synchronized (this) {
                while (true) {
                    if (this.field1996) {
                        return;
                    }
                    if (this.field1998 != null) {
                        var2 = this.field1998;
                        this.field1998 = this.field1998.field749;
                        if (this.field1998 == null) {
                            this.field1994 = null;
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
                int var3 = var2.field747;
                if (var3 == 1) {
                    var2.field748 = new Socket(InetAddress.getByName((String) var2.field750), var2.field751);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field750);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field751);
                    var2.field748 = var4;
                } else if (var3 == 4) {
                    var2.field748 = new DataInputStream(((URL) var2.field750).openStream());
                } else if (var3 == 8) {
                    Object[] var6 = (Object[]) var2.field750;
                    var2.field748 = ((Class) var6[0]).getDeclaredMethod((String) var6[1], (Class[]) var6[2]);
                } else if (var3 == 9) {
                    Object[] var5 = (Object[]) var2.field750;
                    var2.field748 = ((Class) var5[0]).getDeclaredField((String) var5[1]);
                } else {
                    throw new Exception();
                }
                var2.field746 = 1;
            } catch (ThreadDeath var10) {
                throw var10;
            } catch (Throwable var11) {
                var2.field746 = 2;
            }
        }
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(Z)V")
    public final void method700(boolean arg0) {
        synchronized (this) {
            this.field1996 = true;
            if (arg0) {
                this.field1988 = null;
            }
            this.notifyAll();
        }
        try {
            this.field1989.join();
        } catch (InterruptedException var8) {
        }
        if (this.field1988 != null) {
            try {
                this.field1988.method1120((byte) -125);
            } catch (IOException var7) {
            }
        }
        if (this.field1990 != null) {
            try {
                this.field1990.method1120((byte) -104);
            } catch (IOException var6) {
            }
        }
        if (this.field1999 != null) {
            for (int var3 = 0; var3 < this.field1999.length; var3++) {
                if (this.field1999[var3] != null) {
                    try {
                        this.field1999[var3].method1120((byte) -118);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field1991 != null) {
            try {
                this.field1991.method1120((byte) -126);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(IZLjava/lang/String;)Lda;")
    public final class32 method701(int arg0, boolean arg1, String arg2) {
        if (arg1) {
            this.method699(null, 31);
        }
        return this.method696(arg0, arg2, 1, (byte) 75, 0);
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;B)Lda;")
    public final class32 method702(String arg0, Class[] arg1, Class arg2, byte arg3) {
        if (arg3 <= 71) {
            this.field1994 = null;
        }
        return this.method696(0, new Object[] { arg2, arg0, arg1 }, 8, (byte) 90, 0);
    }

    @OriginalMember(owner = "ke", name = "a", descriptor = "(II)Lda;")
    public final class32 method703(int arg0, int arg1) {
        return arg0 == 7249 ? this.method696(arg1, null, 3, (byte) 51, 0) : null;
    }

    @OriginalMember(owner = "ke", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
    public class99(boolean arg0, Applet arg1, int arg2, String arg3, int arg4) {
        field2000 = "1.1";
        this.field2001 = arg1;
        field1995 = "Unknown";
        try {
            field1995 = System.getProperty("java.vendor");
            field2000 = System.getProperty("java.version");
        } catch (Exception var10) {
        }
        try {
            field1993 = System.getProperty("user.home");
            if (field1993 != null) {
                field1993 = field1993 + "/";
            }
        } catch (Exception var9) {
        }
        if (field1993 == null) {
            field1993 = "~/";
        }
        try {
            this.field1997 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var8) {
        }
        try {
            if (arg1 == null) {
                field2005 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field2005 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg1 == null) {
                field1992 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field1992 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        if (arg0) {
            this.method698(arg3, arg4, (byte) -90, arg2);
        }
        this.field1996 = false;
        this.field1989 = new Thread(this);
        this.field1989.setPriority(10);
        this.field1989.setDaemon(true);
        this.field1989.start();
    }
}
