import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class493 implements Runnable {

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "Lje;")
    public class62 field7202 = null;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "Ljava/applet/Applet;")
    public Applet field7203 = null;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lje;")
    public class62 field7205 = null;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "Z")
    private boolean field7206 = false;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "Lje;")
    public class62 field7201 = null;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "Lln;")
    private class169 field7194 = null;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Lln;")
    private class169 field7186 = null;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    private int field7189;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "Ljava/lang/String;")
    private String field7200;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field7197;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "Ljava/lang/Thread;")
    private Thread field7207;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field7198 = 3;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "Ljava/util/Hashtable;")
    private static Hashtable field7196 = new Hashtable(16);

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "J")
    public static volatile long field7209 = 0L;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "Lur;")
    private class254 field7204;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Ljava/lang/String;")
    public static String field7187;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7188;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "Ljava/lang/String;")
    public static String field7190;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "Ljava/lang/String;")
    public static String field7192;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7193;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "Ljava/lang/String;")
    private static String field7195;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "Ljava/lang/String;")
    public static String field7199;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7208;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field7210;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "[Lje;")
    public class62[] field7191;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method2871(int arg0) {
        if (arg0 > -25) {
            this.method2879(51, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/Class;)Lln;", line = 19)
    public final class169 method2872(int arg0, Class arg1) {
        if (arg0 != 16) {
            this.method2892(null, 60);
        }
        return this.method2889(0, 20, 0, arg1, arg0 ^ 0xFFFFFF8E);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/lang/String;)Lln;", line = 30)
    public final class169 method2873(byte arg0, String arg1) {
        if (arg0 != -28) {
            field7198 = -36;
        }
        return this.method2889(0, 16, 0, arg1, -124);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lln;", line = 42)
    public final class169 method2874(int arg0, Runnable arg1, int arg2) {
        int var4 = -67 / ((arg0 - 57) / 39);
        return this.method2889(0, 2, arg2, arg1, -118);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 51)
    public final void method2875(byte arg0) {
        synchronized (this) {
            this.field7206 = true;
            this.notifyAll();
        }
        if (arg0 < 64) {
            this.field7186 = null;
        }
        try {
            this.field7207.join();
        } catch (InterruptedException var8) {
        }
        if (this.field7201 != null) {
            try {
                this.field7201.method410((byte) 20);
            } catch (IOException var7) {
            }
        }
        if (this.field7205 != null) {
            try {
                this.field7205.method410((byte) 66);
            } catch (IOException var6) {
            }
        }
        if (this.field7191 != null) {
            for (int var3 = 0; var3 < this.field7191.length; var3++) {
                if (this.field7191[var3] != null) {
                    try {
                        this.field7191[var3].method410((byte) 55);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field7202 != null) {
            try {
                this.field7202.method410((byte) 125);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Class;)Lln;", line = 107)
    public final class169 method2876(Class[] arg0, byte arg1, String arg2, Class arg3) {
        if (arg1 != 27) {
            this.field7206 = true;
        }
        return this.method2889(0, 8, 0, new Object[] { arg3, arg2, arg0 }, -105);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/net/URL;)Lln;", line = 120)
    public final class169 method2877(int arg0, URL arg1) {
        return arg0 == 0 ? this.method2889(0, 4, 0, arg1, -122) : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)Lln;", line = 132)
    public final class169 method2878(boolean arg0) {
        return arg0 ? this.method2889(0, 5, 0, null, -116) : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/io/File;", line = 147)
    public final File method2879(int arg0, String arg1) {
        return arg0 == 0 ? method2897(false, arg1, this.field7189, this.field7200) : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Lln;", line = 159)
    public final class169 method2880(Class arg0, String arg1, int arg2) {
        return arg2 == 0 ? this.method2889(0, 9, 0, new Object[] { arg0, arg1 }, arg2 - 124) : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIII)Lln;", line = 169)
    public final class169 method2881(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 13056) {
            this.field7200 = null;
        }
        return this.method2889((arg0 << 16) + arg3, 6, (arg4 << 16) + arg1, null, -115);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/awt/datatransfer/Transferable;)Lln;", line = 188)
    public final class169 method2882(int arg0, Transferable arg1) {
        if (arg0 != 0) {
            this.field7205 = null;
        }
        return this.method2889(0, 19, 0, arg1, -100);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBIILjava/lang/Object;)Lln;", line = 198)
    private final class169 method2883(int arg0, byte arg1, int arg2, int arg3, Object arg4) {
        class169 var6 = new class169();
        synchronized (var6) {
            var6.field2693 = arg4;
            var6.field2694 = arg2;
            var6.field2696 = arg3;
            synchronized (this) {
                if (this.field7194 == null) {
                    this.field7194 = this.field7186 = var6;
                } else {
                    this.field7194.field2697 = var6;
                    this.field7194 = var6;
                }
                this.notify();
            }
            if (arg1 != 26) {
                this.field7200 = null;
            }
            try {
                var6.wait();
            } catch (InterruptedException var9) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 234)
    public final byte[] method2884(String arg0, int arg1) {
        class169 var3 = this.method2883(0, (byte) 26, 21, 0, arg0);
        return arg1 == -12226 ? (byte[]) var3.field2695 : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Component;I[IILjava/awt/Point;I)Lln;", line = 252)
    public final class169 method2885(Component arg0, int arg1, int[] arg2, int arg3, Point arg4, int arg5) {
        if (arg5 != 17) {
            this.method2888((byte) 34);
        }
        return this.method2889(arg1, 17, arg3, new Object[] { arg0, arg2, arg4 }, -96);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)Lln;", line = 265)
    public final class169 method2886(boolean arg0, int arg1) {
        if (!arg0) {
            field7210 = null;
        }
        return this.method2889(0, 3, arg1, null, -120);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBLjava/lang/String;)Lln;", line = 277)
    public final class169 method2887(int arg0, byte arg1, String arg2) {
        if (arg1 != 112) {
            field7188 = null;
        }
        return this.method2889(0, 1, arg0, arg2, -123);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)Lur;", line = 289)
    public final class254 method2888(byte arg0) {
        if (arg0 > -21) {
            this.method2874(83, null, -117);
        }
        return this.field7204;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIILjava/lang/Object;I)Lln;", line = 302)
    private final class169 method2889(int arg0, int arg1, int arg2, Object arg3, int arg4) {
        if (arg4 >= -94) {
            this.method2896(6, null);
        }
        class169 var6 = new class169();
        var6.field2693 = arg3;
        var6.field2694 = arg1;
        var6.field2696 = arg2;
        synchronized (this) {
            if (this.field7194 == null) {
                this.field7194 = this.field7186 = var6;
            } else {
                this.field7194.field2697 = var6;
                this.field7194 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;Z)Lln;", line = 334)
    public final class169 method2890(boolean arg0, String arg1, boolean arg2) {
        if (arg0) {
            this.method2873((byte) -78, null);
        }
        return arg2 ? this.method2889(0, 12, 0, arg1, -111) : this.method2889(0, 13, 0, arg1, -111);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;B)Lln;", line = 353)
    public final class169 method2891(String arg0, byte arg1) {
        if (arg1 <= 91) {
            field7198 = 34;
        }
        return this.method2889(0, 21, 0, arg0, -108);
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V", line = 554)
    public class493(Applet arg0, int arg1, String arg2, int arg3) throws Exception {
        this.field7203 = arg0;
        this.field7189 = arg1;
        field7193 = "Unknown";
        this.field7200 = arg2;
        field7199 = "1.1";
        try {
            field7193 = System.getProperty("java.vendor");
            field7199 = System.getProperty("java.version");
        } catch (Exception var12) {
        }
        try {
            field7192 = System.getProperty("os.name");
        } catch (Exception var11) {
            field7192 = "Unknown";
        }
        field7187 = field7192.toLowerCase();
        try {
            field7190 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var10) {
            field7190 = "";
        }
        try {
            field7188 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var9) {
            field7188 = "";
        }
        try {
            field7195 = System.getProperty("user.home");
            if (field7195 != null) {
                field7195 = field7195 + "/";
            }
        } catch (Exception var8) {
        }
        if (field7195 == null) {
            field7195 = "~/";
        }
        try {
            this.field7197 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var7) {
        }
        try {
            if (arg0 == null) {
                field7210 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } else {
                field7210 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            }
        } catch (Exception var6) {
        }
        try {
            if (arg0 == null) {
                field7208 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } else {
                field7208 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
            }
        } catch (Exception var5) {
        }
        this.field7206 = false;
        this.field7207 = new Thread(this);
        this.field7207.setPriority(10);
        this.field7207.setDaemon(true);
        this.field7207.start();
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Frame;I)Lln;", line = 369)
    public final class169 method2892(Frame arg0, int arg1) {
        return arg1 == 7445 ? this.method2889(0, 7, 0, arg0, -100) : null;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V", line = 383)
    public final void method2893(int arg0) {
        field7209 = class19.method91((byte) 116) + 5000L;
        if (arg0 != 10000) {
            field7195 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)Lln;", line = 407)
    public final class169 method2894(int arg0) {
        return arg0 >= -65 ? null : this.method2889(0, 18, 0, null, -116);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lln;", line = 419)
    public final class169 method2895(Component arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            this.method2889(-108, -85, 76, null, -44);
        }
        return this.method2889(0, 15, arg1 ? 1 : 0, arg0, -114);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILjava/lang/Class;)Lln;", line = 436)
    public final class169 method2896(int arg0, Class arg1) {
        if (arg0 != 0) {
            this.field7204 = null;
        }
        return this.method2889(0, 11, 0, arg1, arg0 ^ 0xFFFFFF9D);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)Ljava/io/File;", line = 453)
    public static final File method2897(boolean arg0, String arg1, int arg2, String arg3) {
        if (arg0) {
            method2897(false, null, 99, null);
        }
        File var4 = (File) field7196.get(arg1);
        if (var4 != null) {
            return var4;
        }
        String[] var5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field7195, "/tmp/", "" };
        String[] var6 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
        for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var8 < var6.length; var8++) {
                for (int var9 = 0; var9 < var5.length; var9++) {
                    String var10 = var5[var9] + var6[var8] + "/" + (arg3 == null ? "" : arg3 + "/") + arg1;
                    RandomAccessFile var11 = null;
                    try {
                        File var12 = new File(var10);
                        if (var7 != 0 || var12.exists()) {
                            String var13 = var5[var9];
                            if (var7 != 1 || var13.length() <= 0 || (new File(var13)).exists()) {
                                (new File(var5[var9] + var6[var8])).mkdir();
                                if (arg3 != null) {
                                    (new File(var5[var9] + var6[var8] + "/" + arg3)).mkdir();
                                }
                                var11 = new RandomAccessFile(var12, "rw");
                                int var14 = var11.read();
                                var11.seek(0L);
                                var11.write(var14);
                                var11.seek(0L);
                                var11.close();
                                field7196.put(arg1, var12);
                                return var12;
                            }
                        }
                    } catch (Exception var17) {
                        try {
                            if (var11 != null) {
                                var11.close();
                                Object var15 = null;
                            }
                        } catch (Exception var16) {
                        }
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIBLjava/awt/Component;)Lln;", line = 542)
    public final class169 method2898(int arg0, int arg1, byte arg2, Component arg3) {
        Point var5 = arg3.getLocationOnScreen();
        if (arg2 >= -118) {
            this.field7203 = null;
        }
        return this.method2889(var5.y + arg1, 14, var5.x + arg0, null, -113);
    }

    @OriginalMember(owner = "client!nv", name = "run", descriptor = "()V", line = 631)
    public final void run() {
        while (true) {
            class169 var2;
            synchronized (this) {
                while (true) {
                    if (this.field7206) {
                        return;
                    }
                    if (this.field7186 != null) {
                        var2 = this.field7186;
                        this.field7186 = this.field7186.field2697;
                        if (this.field7186 == null) {
                            this.field7194 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var17) {
                    }
                }
            }
            try {
                int var3 = var2.field2694;
                if (var3 == 1) {
                    if (field7209 > class19.method91((byte) 95)) {
                        throw new IOException();
                    }
                    var2.field2695 = new Socket(InetAddress.getByName((String) var2.field2693), var2.field2696);
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field2693);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field2696);
                    var2.field2695 = var4;
                } else if (var3 == 4) {
                    if (class19.method91((byte) 105) < field7209) {
                        throw new IOException();
                    }
                    var2.field2695 = new DataInputStream(((URL) var2.field2693).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field2693;
                    var2.field2695 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var6 = (Object[]) var2.field2693;
                    var2.field2695 = ((Class) var6[0]).getDeclaredField((String) var6[1]);
                } else if (var3 == 18) {
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field2695 = var7.getContents(null);
                } else if (var3 == 19) {
                    Transferable var8 = (Transferable) var2.field2693;
                    Clipboard var9 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var9.setContents(var8, null);
                } else {
                    throw new Exception("");
                }
                var2.field2692 = 1;
            } catch (ThreadDeath var15) {
                throw var15;
            } catch (Throwable var16) {
                var2.field2692 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(ILjava/lang/Class;)V", line = 752)
    public final void method2899(int arg0, Class arg1) throws Exception {
        if (arg0 != -19779) {
            field7198 = -102;
        }
        Class[] var3 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
        Runtime var4 = Runtime.getRuntime();
        Method var5 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
        if (!field7187.startsWith("mac")) {
            Method var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", var3);
            var5.invoke(var6, Boolean.TRUE);
            var6.invoke(var4, arg1, "jawt");
            var5.invoke(var6, Boolean.FALSE);
        }
        Method var7 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", var3);
        var5.invoke(var7, Boolean.TRUE);
        if (!field7187.startsWith("win")) {
            throw new Exception();
        }
        var7.invoke(var4, arg1, this.method2879(0, "sw3d.dll").toString());
        var5.invoke(var7, Boolean.FALSE);
    }
}
