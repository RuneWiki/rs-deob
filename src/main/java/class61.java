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
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class61 implements Runnable {

    @OriginalMember(owner = "client!tga", name = "o", descriptor = "Z")
    private boolean field801 = false;

    @OriginalMember(owner = "client!tga", name = "s", descriptor = "Luga;")
    private class218 field795 = null;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "Llm;")
    public class527 field794 = null;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "Llm;")
    public class527 field799 = null;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "Luga;")
    private class218 field807 = null;

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "Z")
    public boolean field806 = false;

    @OriginalMember(owner = "client!tga", name = "C", descriptor = "Llm;")
    public class527 field789 = null;

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "Z")
    public boolean field808 = false;

    @OriginalMember(owner = "client!tga", name = "p", descriptor = "Ljava/awt/EventQueue;")
    public EventQueue field800;

    @OriginalMember(owner = "client!tga", name = "E", descriptor = "[Llm;")
    public class527[] field809;

    @OriginalMember(owner = "client!tga", name = "q", descriptor = "Ljava/lang/Object;")
    private Object field802;

    @OriginalMember(owner = "client!tga", name = "r", descriptor = "Llg;")
    private class436 field812;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "Ljava/lang/Object;")
    private Object field811;

    @OriginalMember(owner = "client!tga", name = "n", descriptor = "Ljava/lang/Object;")
    private Object field810;

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "Lll;")
    private class385 field816;

    @OriginalMember(owner = "client!tga", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field797;

    @OriginalMember(owner = "client!tga", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field821 = new String[] { method649(method648(">?Q*Wr%Gf")), method649(method648(">9O9\u0019")), method649(method648("N?AgRp9")), method649(method648("rw\r>_\u007f)M>E>")), method649(method648("c:")), method649(method648("rw\r")), method649(method648("{,E,NN")), method649(method648("N=P,Pt?G'Ut>")), method649(method648("rw\r;Er,A!S>")), method649(method648("rw\r>_\u007f#Vf")), method649(method648("?)C=")), method649(method648("N:K9\u0018u,V")), method649(method648("r Fi\u0019rmQ=Wc9\u0002k\\3m\u0000")), method649(method648("[,E,N1\u000bW%Z1\u001eA;St#")), method649(method648("y9V9E+b\r")), method649(method648("{,T(\u0018p:Vgf~$L=")), method649(method648("|\"T,[~8Q,")), method649(method648("b!")), method649(method648("{,T(\u0018p:Vgpc,O,")), method649(method648("f$L")), method649(method648("b%M>Ud?Q&D")), method649(method648("b(V*Cb9M$Ud?Q&D")), method649(method648("J\u0004")), method649(method648("}$Q=[~)G:")), method649(method648("p/A-Sw*J \\z!O'Ya<P:Bd;U1Ok\f`\nrT\u000be\u0001\u007f[\u0006n\u0004x^\u001ds\u001beE\u0018t\u001enH\u0017\u0012x\u0004\"y\u0017\u007f\u0001)t\u001do\u000b=c\u0007b\u001bNn\u0018f\u001c")), method649(method648("y9V9\f>b")), method649(method648("{,T(\u0018p:Vgu~ R&Xt#V")), method649(method648("t5K=")), method649(method648("z'")), method649(method648("t#V,D")), method649(method648("u*")), method649(method648("ob")), method649(method648("|,K'iw$N,ir,A!S?$F1\u0004$x")), method649(method648("b(V\u000fYr8Q\u001dDp;G;Ep!i,Ob\bL(T}(F")), method649(method648("|,K'iw$N,ir,A!S?$F1")), method649(method648("{,T(\u0018g(L-Yc")), method649(method648("{,T(\u0018p:Vgu~#V(_\u007f(P")), method649(method648("D#I'Yf#")), method649(method648("b(V\u000fYr8Q\nOr!G\u001bY~9")), method649(method648("|,K'iw$N,ir,A!S?)C=\u0004")), method649(method648("~>\f'W|(")), method649(method648("P\u001av")), method649(method648("d>G;\u0018y\"O,")), method649(method648("~>\f?Sc>K&X")), method649(method648("c,L-Y|cF(B")), method649(method648(" c\u0013")), method649(method648("|$A;Yb\"D=")), method649(method648("~>\f(Dr%")), method649(method648("{,T(\u0018g(P:_~#")) };

    @OriginalMember(owner = "client!tga", name = "y", descriptor = "J")
    private static volatile long field815 = 0L;

    @OriginalMember(owner = "client!tga", name = "x", descriptor = "I")
    private static int field798;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tga", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field817;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tga", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field818;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tga", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field819;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tga", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field820;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "Ljava/lang/String;")
    public static String field790;

    @OriginalMember(owner = "client!tga", name = "m", descriptor = "Ljava/lang/String;")
    public static String field792;

    @OriginalMember(owner = "client!tga", name = "A", descriptor = "Ljava/lang/String;")
    private static String field793;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "Ljava/lang/String;")
    private static String field796;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "Ljava/lang/String;")
    public static String field803;

    @OriginalMember(owner = "client!tga", name = "t", descriptor = "Ljava/lang/String;")
    private static String field804;

    @OriginalMember(owner = "client!tga", name = "v", descriptor = "Ljava/lang/String;")
    public static String field805;

    @OriginalMember(owner = "client!tga", name = "B", descriptor = "Ljava/lang/String;")
    public static String field814;

    @OriginalMember(owner = "client!tga", name = "w", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field791;

    @OriginalMember(owner = "client!tga", name = "F", descriptor = "Ljava/lang/reflect/Method;")
    public static Method field813;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method647(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLjava/lang/String;)Luga;", line = 9)
    public final class218 method627(boolean arg0, String arg1) {
        if (arg0) {
            this.method644(-45, -41);
        }
        return this.method640(0, arg1, 0, 0, 16);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/lang/String;Z)Luga;", line = 21)
    public final class218 method628(int arg0, String arg1, boolean arg2) {
        if (arg0 >= -74) {
            return null;
        } else if (arg2) {
            return this.method640(0, arg1, 0, 0, 12);
        } else {
            return this.method640(0, arg1, 0, 0, 13);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/io/File;[B)Z", line = 35)
    public final boolean method629(int arg0, File arg1, byte[] arg2) {
        try {
            FileOutputStream var4 = new FileOutputStream(arg1);
            var4.write(arg2, 0, arg2.length);
            var4.close();
            int var5 = -54 / ((48 - arg0) / 37);
            return true;
        } catch (IOException var6) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 56)
    public final Object method630(int arg0) {
        if (arg0 != 8429) {
            this.method644(-46, -125);
        }
        return this.field802;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;I)Llm;", line = 68)
    public static final class527 method631(String arg0, int arg1) {
        if (arg1 != -492929200) {
            field814 = null;
        }
        return method636(field798, 10, arg0, field793);
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V", line = 84)
    public final void method632(int arg0) {
        synchronized (this) {
            this.field801 = true;
            this.notifyAll();
        }
        try {
            this.field797.join();
            if (arg0 <= 111) {
                field796 = null;
            }
        } catch (InterruptedException var8) {
        }
        if (this.field789 != null) {
            try {
                this.field789.method3940(1);
            } catch (IOException var7) {
            }
        }
        if (this.field794 != null) {
            try {
                this.field794.method3940(1);
            } catch (IOException var6) {
            }
        }
        if (this.field809 != null) {
            for (int var3 = 0; var3 < this.field809.length; var3++) {
                if (this.field809[var3] != null) {
                    try {
                        this.field809[var3].method3940(1);
                    } catch (IOException var5) {
                    }
                }
            }
        }
        if (this.field799 != null) {
            try {
                this.field799.method3940(1);
            } catch (IOException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Z", line = 143)
    public final boolean method633(int arg0) {
        if (arg0 != 0) {
            this.method643(null, -100, -23);
        }
        if (!this.field806) {
            return false;
        } else if (this.field808) {
            return this.field812 != null;
        } else {
            return this.field811 != null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;B[Ljava/lang/Class;Ljava/lang/Class;)Luga;", line = 161)
    public final class218 method634(String arg0, byte arg1, Class[] arg2, Class arg3) {
        if (arg1 >= -10) {
            this.method642((byte) -86);
        }
        return this.method640(0, new Object[] { arg3, arg0, arg2 }, 0, 0, 8);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLjava/awt/Frame;)Luga;", line = 175)
    public final class218 method635(byte arg0, Frame arg1) {
        if (arg0 != -81) {
            this.field811 = null;
        }
        return this.method640(0, arg1, 0, 0, 7);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Llm;", line = 185)
    private static final class527 method636(int arg0, int arg1, String arg2, String arg3) {
        String var4;
        if (arg0 == 33) {
            var4 = field821[6] + arg3 + field821[7] + arg2 + field821[2];
        } else if (arg0 == 34) {
            var4 = field821[6] + arg3 + field821[7] + arg2 + field821[11];
        } else {
            var4 = field821[6] + arg3 + field821[7] + arg2 + field821[10];
        }
        if (arg1 != 10) {
            return null;
        }
        String[] var5 = new String[] { field821[8], field821[0], field804, field821[3], field821[9], field821[5], field821[1], "" };
        for (int var6 = 0; var6 < var5.length; var6++) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
                try {
                    return new class527(new File(var7, var4), field821[4], 10000L);
                } catch (Exception var9) {
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tga", name = "run", descriptor = "()V", line = 227)
    public final void run() {
        while (true) {
            class218 var2;
            synchronized (this) {
                while (true) {
                    if (this.field801) {
                        return;
                    }
                    if (this.field807 != null) {
                        var2 = this.field807;
                        this.field807 = this.field807.field3405;
                        if (this.field807 == null) {
                            this.field795 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var30) {
                    }
                }
            }
            try {
                int var3 = var2.field3406;
                if (var3 == 1) {
                    if (class712.method5167(-2334) < field815) {
                        throw new IOException();
                    }
                    var2.field3407 = new Socket(InetAddress.getByName((String) var2.field3403), var2.field3401);
                } else if (var3 == 22) {
                    if (field815 > class712.method5167(-2334)) {
                        throw new IOException();
                    }
                    try {
                        var2.field3407 = class645.method4673(var2.field3401, (String) var2.field3403, -44).method4061(0);
                    } catch (class27 var29) {
                        var2.field3407 = var29.getMessage();
                        throw var29;
                    }
                } else if (var3 == 2) {
                    Thread var4 = new Thread((Runnable) var2.field3403);
                    var4.setDaemon(true);
                    var4.start();
                    var4.setPriority(var2.field3401);
                    var2.field3407 = var4;
                } else if (var3 == 4) {
                    if (class712.method5167(-2334) < field815) {
                        throw new IOException();
                    }
                    var2.field3407 = new DataInputStream(((URL) var2.field3403).openStream());
                } else if (var3 == 8) {
                    Object[] var5 = (Object[]) var2.field3403;
                    if (this.field806 && ((Class) var5[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3407 = ((Class) var5[0]).getDeclaredMethod((String) var5[1], (Class[]) var5[2]);
                } else if (var3 == 9) {
                    Object[] var22 = (Object[]) var2.field3403;
                    if (this.field806 && ((Class) var22[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    var2.field3407 = ((Class) var22[0]).getDeclaredField((String) var22[1]);
                } else if (var3 == 18) {
                    Clipboard var21 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var2.field3407 = var21.getContents(null);
                } else if (var3 == 19) {
                    Transferable var6 = (Transferable) var2.field3403;
                    Clipboard var7 = Toolkit.getDefaultToolkit().getSystemClipboard();
                    var7.setContents(var6, null);
                } else if (!this.field806) {
                    throw new Exception("");
                } else if (var3 == 3) {
                    if (field815 > class712.method5167(-2334)) {
                        throw new IOException();
                    }
                    String var20 = (var2.field3401 >> 24 & 0xFF) + "." + ((var2.field3401 & 0xFFB247) >> 16) + "." + ((var2.field3401 & 0xFF91) >> 8) + "." + (var2.field3401 & 0xFF);
                    var2.field3407 = InetAddress.getByName(var20).getHostName();
                } else if (var3 == 21) {
                    if (field815 > class712.method5167(-2334)) {
                        throw new IOException();
                    }
                    var2.field3407 = InetAddress.getByName((String) var2.field3403).getAddress();
                } else if (var3 == 5) {
                    if (this.field808) {
                        var2.field3407 = this.field812.method3434((byte) 96);
                    } else {
                        var2.field3407 = Class.forName(field821[28]).getMethod(field821[23]).invoke(this.field811);
                    }
                } else if (var3 == 6) {
                    Frame var8 = new Frame(field821[13]);
                    var2.field3407 = var8;
                    var8.setResizable(false);
                    if (this.field808) {
                        this.field812.method3433(11, var2.field3401 & 0xFFFF, var2.field3404 & 0xFFFF, var2.field3401 >>> 16, var8, var2.field3404 >> 16);
                    } else {
                        Class.forName(field821[28]).getMethod(field821[29], field817 == null ? (field817 = method647(field821[18])) : field817, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field811, var8, Integer.valueOf(var2.field3401 >>> 16), new Integer(var2.field3401 & 0xFFFF), Integer.valueOf(var2.field3404 >> 16), new Integer(var2.field3404 & 0xFFFF));
                    }
                } else if (var3 == 7) {
                    if (this.field808) {
                        this.field812.method3432((Frame) var2.field3403, (byte) 116);
                    } else {
                        Class.forName(field821[28]).getMethod(field821[27]).invoke(this.field811);
                    }
                } else if (var3 == 12) {
                    class527 var19 = method636(field798, 10, (String) var2.field3403, field793);
                    var2.field3407 = var19;
                } else if (var3 == 13) {
                    class527 var9 = method636(field798, 10, (String) var2.field3403, "");
                    var2.field3407 = var9;
                } else if (this.field806 && var3 == 14) {
                    int var10 = var2.field3401;
                    int var11 = var2.field3404;
                    if (this.field808) {
                        this.field816.method3145(0, var10, var11);
                    } else {
                        Class.forName(field821[17]).getDeclaredMethod(field821[16], Integer.TYPE, Integer.TYPE).invoke(this.field810, Integer.valueOf(var10), new Integer(var11));
                    }
                } else if (this.field806 && var3 == 15) {
                    boolean var12 = var2.field3401 != 0;
                    Component var13 = (Component) var2.field3403;
                    if (this.field808) {
                        this.field816.method3146(var12, false, var13);
                    } else {
                        Class.forName(field821[17]).getDeclaredMethod(field821[20], field818 == null ? (field818 = method647(field821[26])) : field818, Boolean.TYPE).invoke(this.field810, var13, Boolean.valueOf(var12));
                    }
                } else if (!this.field808 && var3 == 17) {
                    Object[] var18 = (Object[]) var2.field3403;
                    Class.forName(field821[17]).getDeclaredMethod(field821[21], field818 == null ? (field818 = method647(field821[26])) : field818, field819 == null ? (field819 = method647(field821[22])) : field819, Integer.TYPE, Integer.TYPE, field820 == null ? (field820 = method647(field821[15])) : field820).invoke(this.field810, (Component) var18[0], (int[]) var18[1], Integer.valueOf(var2.field3401), new Integer(var2.field3404), (Point) var18[2]);
                } else if (var3 == 16) {
                    try {
                        if (!field790.startsWith(field821[19])) {
                            throw new Exception();
                        }
                        String var14 = (String) var2.field3403;
                        if (!var14.startsWith(field821[25]) && !var14.startsWith(field821[14])) {
                            throw new Exception();
                        }
                        String var15 = field821[24];
                        int var16 = 0;
                        while (true) {
                            if (var16 >= var14.length()) {
                                Runtime.getRuntime().exec(field821[12] + var14 + "\"");
                                var2.field3407 = null;
                                break;
                            }
                            if (var15.indexOf(var14.charAt(var16)) == -1) {
                                throw new Exception();
                            }
                            var16++;
                        }
                    } catch (Exception var31) {
                        var2.field3407 = var31;
                        throw var31;
                    }
                } else {
                    throw new Exception("");
                }
                var2.field3402 = 1;
            } catch (ThreadDeath var32) {
                throw var32;
            } catch (Throwable var33) {
                var2.field3402 = 2;
            }
            synchronized (var2) {
                var2.notify();
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[ILjava/awt/Component;ILjava/awt/Point;)Luga;", line = 524)
    public final class218 method637(int arg0, int arg1, int[] arg2, Component arg3, int arg4, Point arg5) {
        if (arg1 != 7159) {
            this.field797 = null;
        }
        return this.method640(arg0, new Object[] { arg3, arg2, arg5 }, arg4, 0, 17);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/net/URL;)Luga;", line = 537)
    public final class218 method638(int arg0, URL arg1) {
        return arg0 == 30975 ? this.method640(0, arg1, 0, 0, 4) : null;
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(ILjava/lang/String;IZ)V", line = 705)
    public class61(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
        field793 = arg1;
        field814 = field821[37];
        field798 = arg0;
        field803 = field821[45];
        this.field806 = arg3;
        try {
            field814 = System.getProperty(field821[35]);
            field803 = System.getProperty(field821[48]);
        } catch (Exception var20) {
        }
        if (field814.toLowerCase().indexOf(field821[46]) != -1) {
            this.field808 = true;
        }
        try {
            field796 = System.getProperty(field821[40]);
        } catch (Exception var19) {
            field796 = field821[37];
        }
        field790 = field796.toLowerCase();
        try {
            field805 = System.getProperty(field821[47]).toLowerCase();
        } catch (Exception var18) {
            field805 = "";
        }
        try {
            field792 = System.getProperty(field821[43]).toLowerCase();
        } catch (Exception var17) {
            field792 = "";
        }
        try {
            field804 = System.getProperty(field821[42]);
            if (field804 != null) {
                field804 = field804 + "/";
            }
        } catch (Exception var16) {
        }
        if (field804 == null) {
            field804 = field821[31];
        }
        try {
            this.field800 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var15) {
        }
        if (!this.field808) {
            try {
                field813 = Class.forName(field821[26]).getDeclaredMethod(field821[33], Boolean.TYPE);
            } catch (Exception var14) {
            }
            try {
                field791 = Class.forName(field821[36]).getDeclaredMethod(field821[38], Boolean.TYPE);
            } catch (Exception var13) {
            }
        }
        class462.method3577(field793, field798, 6156);
        if (this.field806) {
            this.field799 = new class527(class462.method3578(false, field821[44], field798, null), field821[4], 25L);
            this.field789 = new class527(class462.method3579(field821[39], 120), field821[4], 314572800L);
            this.field794 = new class527(class462.method3579(field821[32], 39), field821[4], 1048576L);
            this.field809 = new class527[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field809[var5] = new class527(class462.method3579(field821[34] + var5, -77), field821[4], 1048576L);
            }
            if (this.field808) {
                try {
                    this.field802 = Class.forName(field821[30]).getDeclaredConstructor().newInstance();
                } catch (Throwable var12) {
                }
            }
            try {
                if (this.field808) {
                    this.field812 = new class436();
                } else {
                    this.field811 = Class.forName(field821[28]).getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var11) {
            }
            try {
                if (this.field808) {
                    this.field816 = new class385();
                } else {
                    this.field810 = Class.forName(field821[17]).getDeclaredConstructor().newInstance();
                }
            } catch (Throwable var10) {
            }
        }
        if (this.field806 && !this.field808) {
            ThreadGroup var6 = Thread.currentThread().getThreadGroup();
            for (ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
                var6 = var7;
            }
            Thread[] var8 = new Thread[1000];
            var6.enumerate(var8);
            for (int var9 = 0; var9 < var8.length; var9++) {
                if (var8[var9] != null && var8[var9].getName().startsWith(field821[41])) {
                    var8[var9].setPriority(1);
                }
            }
        }
        this.field801 = false;
        this.field797 = new Thread(this);
        this.field797.setPriority(10);
        this.field797.setDaemon(true);
        this.field797.start();
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;ZII)Luga;", line = 552)
    public final class218 method639(String arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            this.field806 = false;
        }
        return this.method640(0, arg0, arg2, 0, arg1 ? 22 : 1);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILjava/lang/Object;III)Luga;", line = 562)
    private final class218 method640(int arg0, Object arg1, int arg2, int arg3, int arg4) {
        class218 var6 = new class218();
        var6.field3401 = arg2;
        var6.field3406 = arg4;
        var6.field3403 = arg1;
        var6.field3404 = arg0;
        synchronized (this) {
            if (arg3 != 0) {
                this.method644(33, 59);
            }
            if (this.field795 == null) {
                this.field795 = this.field807 = var6;
            } else {
                this.field795.field3405 = var6;
                this.field795 = var6;
            }
            this.notify();
            return var6;
        }
    }

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "(I)Luga;", line = 597)
    public final class218 method641(int arg0) {
        return arg0 == 1 ? this.method640(0, null, 0, 0, 5) : null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V", line = 619)
    public final void method642(byte arg0) {
        if (arg0 != 1) {
            this.field795 = null;
        }
        field815 = class712.method5167(-2334) + 5000L;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/Runnable;II)Luga;", line = 630)
    public final class218 method643(Runnable arg0, int arg1, int arg2) {
        if (arg2 != 22) {
            this.method635((byte) 26, null);
        }
        return this.method640(0, arg0, arg1, 0, 2);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(II)Luga;", line = 653)
    public final class218 method644(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method629(57, null, null);
        }
        return this.method640(0, null, arg1, 0, 3);
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Luga;", line = 677)
    public final class218 method645(Class arg0, int arg1, String arg2) {
        return arg1 == 0 ? this.method640(0, new Object[] { arg0, arg2 }, 0, 0, 9) : null;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIII)Luga;", line = 690)
    public final class218 method646(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg2 >= -99 ? null : this.method640((arg0 << 16) + arg1, null, (arg3 << 16) + arg4, 0, 6);
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method648(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method649(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
