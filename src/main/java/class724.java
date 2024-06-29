import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class724 extends class66 implements class559 {

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Z")
    private boolean field10145 = false;

    @OriginalMember(owner = "client!oa", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lifa;")
    private class450 field10146 = new class450();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    private int field10149 = 4096;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    private int field10152 = 4096;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "Ldj;")
    private class362 field10150 = new class362(4);

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Z")
    private boolean field10166 = false;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "Lnh;")
    private class778 field10161;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    private static int[] field10144 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "[B")
    private static byte[] field10148 = new byte[8191];

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "[I")
    private static int[] field10151 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    private static int[] field10154 = field10144;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    public static int[] field10156 = field10144;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[F")
    private static float[] field10159 = new float[20];

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[S")
    private static short[] field10160 = new short[8191];

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "[I")
    private static int[] field10158 = new int[8191];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "[I")
    public static int[] field10162 = new int[6];

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "[I")
    private static int[] field10163 = field10144;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[F")
    private static float[] field10157 = field10159;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
    public int field10164;

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Lp;")
    private class232 field10155;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lya;")
    private class59 field10147;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "Lnh;")
    private class778 field10153;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[La;")
    private class646[] field10165;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    private final native void method4091(int arg0);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(IIIIII)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method593(arg0, arg1, arg2, arg4, arg5);
        this.method593(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method597(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method597(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public final void method615(int arg0) {
        this.field10149 = this.field10152 = arg0;
        if (this.field10164 > 1) {
            throw new IllegalStateException("No MT");
        } else {
            this.method609(this.field10164);
            this.method605(0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(Z)V")
    public final native void method635(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "(I[I[F)V")
    private final native void method4092(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!oa", name = "HA", descriptor = "(IIII[I)V")
    public final native void method651(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(III)V")
    public final native void method650(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method586(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method92(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class677 {
        if (this.field10155 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10155.method1423(arg0, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "ra", descriptor = "(IIII)V")
    public final native void method560(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public final void method609(int arg0) {
        this.field10164 = arg0;
        this.field10165 = new class646[this.field10164];
        for (int var2 = 0; var2 < this.field10164; ++var2) {
            this.field10165[var2] = new class646(this, this.field10149, this.field10152);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsea;Lup;)Lnm;")
    public final class499 method70(class726 arg0, class292 arg1) {
        return new class638(this, (class568) arg0, (class528) arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Laa;")
    public final class513 method643(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class51(this, this.field10147, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lza;)V")
    public final void method581(class435 arg0) {
        this.field10147 = (class59) arg0;
        this.method4094(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public final void method584(int arg0) {
        this.field10165[arg0].method3622();
    }

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public final boolean method622() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "Z", descriptor = "(IIIIIILaa;II)V")
    private final native void method4093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)Lza;")
    public final class435 method585(int arg0) {
        class59 var2 = new class59(this, arg0);
        this.field10146.method2732(var2, 21939);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIID)V")
    public final native void method50(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!oa", name = "va", descriptor = "(Lza;)V")
    private final native void method4094(class435 arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)Lup;")
    public final class292 method52(int arg0, int arg1) {
        return new class528(arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()I")
    public final native int method610();

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public final boolean method604() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laf;)V")
    public final void method582(class460 arg0) {
        if (arg0.field6472.method1058(-28700) != 0) {
            this.method4101(arg0, false);
            this.method4103().method3614(this, field10154, field10158, field10151, field10160, arg0.field6472.method1058(-28700));
        }
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Lub;")
    public final class22 method60() {
        return new class22(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Lnh;")
    public final class778 method574() {
        return this.field10153;
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    private final void method4095() {
        System.gc();
        System.runFinalization();
        class405.method2429(-75);
    }

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "(IIII)V")
    public final native void method607(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(J)V")
    private final native void method4096(long arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(II)I")
    public final int method632(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public final boolean method612() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "(JJ)V")
    private final native void method4097(long arg0, long arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class296 method557(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class698(this, this.field10147, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "pa", descriptor = "()V")
    public final native void method564();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Ltf;")
    public final class312 method638(int arg0, int arg1, boolean arg2) {
        return new class568(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "(IIIII)V")
    public final native void method593(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(II)I")
    public final int method620(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method608(Canvas arg0) {
        if (this.field10155.field2766 == arg0) {
            this.method627((Canvas) null);
        }
        class232 var2 = (class232) this.field10150.method2121(104, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2219(13630);
            var2.method1427();
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;II)V")
    public class724(Canvas arg0, class162 arg1, int arg2, int arg3) {
        super(arg1);
        try {
            if (!class37.method326((byte) 120, "sw3d")) {
                throw new RuntimeException("");
            } else {
                class405.method2431(true);
                this.method4099(super.field890, 0, 0);
                class322.method1922(false, (byte) 121, true);
                this.field10166 = true;
                this.field10161 = new class294();
                this.method628(new class294());
                this.method609(1);
                this.method605(0);
                if (arg0 != null) {
                    this.method637(arg0, arg2, arg3);
                    this.method627(arg0);
                }
            }
        } catch (Throwable var5) {
            this.method559((byte) 1);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lsea;")
    public final class726 method44(int arg0, int arg1) {
        return this.method638(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
    public final void method5(int arg0, int arg1) throws class677 {
        if (this.field10155 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field10155.method1426(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laf;I)V")
    public final void method590(class460 arg0, int arg1) {
        this.method4101(arg0, false);
        this.method4103().method3614(this, field10154, field10158, field10151, field10160, arg0.field6472.method1058(-28700));
    }

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(IIIIII)I")
    public final native int method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "(ILaa;II)V")
    public final native void method617(int arg0, class513 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "(III[I)V")
    public final native void method570(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "(IIIIII)V")
    public final native void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "(IIIIIII)I")
    public final native int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public final boolean method71() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "wa", descriptor = "(IIIIII)V")
    private final native void method4098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ZA", descriptor = "(IFFFFF)V")
    public final native void method578(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnm;)V")
    public final void method67(class499 arg0) {
        class638 var2 = (class638) arg0;
        this.method4097(var2.field8745.nativeid, var2.field8743.nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public final void method25() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public final void method40(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8) {
        this.method4093(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!oa", name = "za", descriptor = "(IIIII)V")
    public final native void method563(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "EA", descriptor = "(IIII)V")
    public final native void method555(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()I")
    public final native int method616();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
    public final void method589(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "([I)V")
    public final native void method566(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "xa", descriptor = "(F)V")
    public final native void method626(float arg0);

    @OriginalMember(owner = "client!oa", name = "MA", descriptor = "(Ld;II)V")
    private final native void method4099(class162 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lkp;)V")
    public final void method587(int arg0, class515[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field10163[var3++] = arg1[var4].method3084(0);
            field10163[var3++] = arg1[var4].method3086((byte) -100);
            field10163[var3++] = arg1[var4].method3085(true);
            field10163[var3++] = arg1[var4].method3088(21915);
            field10157[var4] = arg1[var4].method3083(125);
            field10163[var3++] = arg1[var4].method3089(25215);
        }
        this.method4092(arg0, field10163, field10157);
    }

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public final boolean method603() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "(Z)V")
    public final native void method229(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public final void method647() {
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public final void method20() {
        this.method627(this.field10155.field2766);
    }

    @OriginalMember(owner = "client!oa", name = "OA", descriptor = "()Ljava/lang/Object;")
    private final Object method4100() {
        return new class407(this);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Ltf;")
    public final class312 method644(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return new class568(this, arg0, arg1, arg2, arg3, !arg4);
    }

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public final boolean method599() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laf;Z)V")
    private final void method4101(class460 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class488 var8 = (class488) arg0.field6472.method1056(-1); var8 != null; var8 = (class488) arg0.field6472.method1061(true)) {
            field10154[var3++] = var8.field6812;
            field10154[var3++] = var8.field6817;
            field10154[var3++] = var8.field6821;
            field10158[var4++] = var8.field6816;
            field10160[var6++] = (short) var8.field6814;
            field10151[var5++] = var8.field6819;
            if (arg1) {
                field10148[var7++] = var8.field6815;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "()I")
    public final native int method81();

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "(IIIII)V")
    public final native void method597(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljia;)V")
    public final void method558(class645 arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    }

    @OriginalMember(owner = "client!oa", name = "Y", descriptor = "()[I")
    public final native int[] method569();

    @OriginalMember(owner = "client!oa", name = "WA", descriptor = "(S)Z")
    private final boolean method4102(short arg0) {
        class162 var2 = super.field890;
        synchronized (super.field890) {
            if (!super.field890.method1137(12429, arg0)) {
                return false;
            } else {
                class359 var4 = super.field890.method1138(arg0, 50);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (var4.field4457 != 2) {
                        var6 = super.field890.method1135(arg0, 0.7F, true, 128, 128, (byte) -26);
                    } else {
                        var6 = super.field890.method1139(arg0, 11196, true, 128, 128, 0.7F);
                    }
                    this.method4105(arg0, var6, var4.field4448, var4.field4457, var4.field4459, var4.field4445, var4.field4456, var4.field4451, var4.field4462, var4.field4458, var4.field4444, var4.field4449, var4.field4464, var4.field4455, var4.field4461, var4.field4447, var4.field4460, var4.field4453, var4.field4465, var4.field4452, var4.field4450);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "la", descriptor = "()V")
    public final native void method634();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4098(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oa", name = "da", descriptor = "(III[I)V")
    public final native void method642(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "DA", descriptor = "(IIII)V")
    public final native void method565(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method637(Canvas arg0, int arg1, int arg2) {
        class232 var4 = (class232) this.field10150.method2121(96, (long) arg0.hashCode());
        if (var4 == null) {
            try {
                Class var5 = Class.forName("java.awt.Canvas");
                Method var6 = var5.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var6.invoke(arg0, Boolean.TRUE);
            } catch (Exception var8) {
            }
            class232 var7 = new class232(this, arg0, arg1, arg2);
            this.field10150.method2112(var7, (byte) 6, (long) arg0.hashCode());
        } else {
            if (var4.field2765 != arg1 || var4.field2762 != arg2) {
                var4.method1428(arg0, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnh;)V")
    public final void method628(class778 arg0) {
        this.field10153 = arg0;
        this.method4096(((class294) arg0).nativeid);
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()Z")
    public final boolean method601() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "()Z")
    public final boolean method625() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public final void method31(boolean arg0) {
    }

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)V")
    public final native void method556(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()La;")
    public final class646 method4103() {
        for (int var1 = 0; var1 < this.field10164; ++var1) {
            if (this.field10165[var1].field8797 == Thread.currentThread()) {
                return this.field10165[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "GA", descriptor = "(I)V")
    public final native void method13(int arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public final boolean method639() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "XA", descriptor = "()I")
    public final native int method568();

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public final boolean method646() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIIIII[BII)V")
    public final native void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
    }

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(IIII)[I")
    public final native int[] method87(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
    public final void method53() {
        if (!this.field10145) {
            this.field10165 = null;
            this.field10155 = null;
            this.field10147 = null;
            this.field10161 = null;
            this.field10150.method2115(0);
            for (class59 var1 = (class59) this.field10146.method2725(37); var1 != null; var1 = (class59) this.field10146.method2726(-117)) {
                var1.method515();
            }
            this.field10146.method2729(-48);
            this.method4106();
            if (this.field10166) {
                class738.method4150(true, false, 0);
                this.field10166 = false;
            }
            this.method4095();
            class405.method2432(126);
            this.field10145 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(I)V")
    public final native void method571(int arg0);

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "()I")
    public final native int method562();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Lnh;")
    public final class778 method576() {
        return this.field10161;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(S)Z")
    private final boolean method4104(short arg0) {
        synchronized (this) {
            class359 var3 = super.field890.method1138(arg0, 83);
            if (var3 == null) {
                return false;
            } else {
                this.method4108(arg0, var3.field4448, var3.field4457, var3.field4459, var3.field4445, var3.field4456, var3.field4451, var3.field4462, var3.field4458, var3.field4444, var3.field4449, var3.field4464, var3.field4455, var3.field4461, var3.field4447, var3.field4460, var3.field4453, var3.field4465, var3.field4452, var3.field4450);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public final boolean method629() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "CA", descriptor = "(S[ISIBBIZBBBBZZZZZBZZI)V")
    private final native void method4105(short arg0, int[] arg1, short arg2, int arg3, byte arg4, byte arg5, int arg6, boolean arg7, byte arg8, byte arg9, byte arg10, byte arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, boolean arg16, byte arg17, boolean arg18, boolean arg19, int arg20);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "()V")
    private final native void method4106();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "()V")
    public final native void method6();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
    public final void method2() {
    }

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lnh;")
    public final class778 method614() {
        return new class294();
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method559((byte) 1);
        if (this.nativeid != 0L) {
            class405.method2430((byte) -104, this);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lso;IIII)Lka;")
    public final class498 method567(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class44(this, this.field10147, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()Z")
    public final boolean method54() {
        return false;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public final void method605(int arg0) {
        this.field10165[arg0].method3627();
    }

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "(Lp;)V")
    private final native void method4107(class232 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method595(Canvas arg0, int arg1, int arg2) {
        class232 var4 = (class232) this.field10150.method2121(123, (long) arg0.hashCode());
        var4.method1428(arg0, arg1, arg2);
        if (arg0 != null && this.field10155.field2766 == arg0) {
            this.method627(arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "(II)V")
    public final native void method69(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public final boolean method561() {
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(SSIBBIZBBBBZZZZZBZZI)V")
    private final native void method4108(short arg0, short arg1, int arg2, byte arg3, byte arg4, int arg5, boolean arg6, byte arg7, byte arg8, byte arg9, byte arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, boolean arg15, byte arg16, boolean arg17, boolean arg18, int arg19);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)V")
    public final native void method606(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcr;Z)Ltf;")
    public final class312 method640(class600 arg0, boolean arg1) {
        class568 var3 = new class568(this, arg0.field8120, arg0.field8122, arg0.field8119, 0, arg0.field8123, arg0.field8123, arg0.field8116);
        var3.method1632(arg0.field8118, arg0.field8124, arg0.field8121, arg0.field8117);
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
    public final void method36() {
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public final void method56(int arg0) {
        class405.method2429(-90);
        this.method4091(arg0);
        for (class59 var2 = (class59) this.field10146.method2725(37); var2 != null; var2 = (class59) this.field10146.method2726(-115)) {
            var2.method514();
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()I")
    public final int method583() {
        return 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljia;Ljia;FLjia;)Ljia;")
    public final class645 method65(class645 arg0, class645 arg1, float arg2, class645 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()V")
    public final void method32() {
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)Ljia;")
    public final class645 method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method4103().method3631(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V")
    public final void method648(int[] arg0) {
        Dimension var2 = this.field10155.field2766.getSize();
        arg0[0] = var2.width;
        arg0[1] = var2.height;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbq;[Lcr;Z)Lda;")
    public final class67 method579(class307 arg0, class600[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field8123;
            var5[var7] = arg1[var7].field8116;
            if (arg1[var7].field8119 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class694(this, this.field10147, arg0, arg1, (class312[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class19(this, this.field10147, arg0, arg1, (class312[]) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIIIZ)Ltf;")
    public final class312 method652(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return new class568(this, arg0, arg1, arg2, arg3, arg4, false);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method627(Canvas arg0) {
        if (arg0 != null) {
            class232 var2 = (class232) this.field10150.method2121(92, (long) arg0.hashCode());
            this.field10155 = var2;
            this.method4107(var2);
        } else {
            this.field10155 = null;
            this.method4107((class232) null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public final void method61(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lkp;")
    public final class515 method573(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class282(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
