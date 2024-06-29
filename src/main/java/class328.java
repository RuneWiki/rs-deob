import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class328 extends class167 implements class439 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid = 0L;

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
    private boolean field4508 = false;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lbv;")
    private class568 field4507 = new class568();

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    private int field4522 = 4096;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    private int field4523 = 4096;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "Lba;")
    private class607 field4521 = new class607(4);

    @OriginalMember(owner = "client!a", name = "N", descriptor = "Z")
    private boolean field4527 = false;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "Lm;")
    private class105 field4524;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "[I")
    private static int[] field4506 = new int[Math.max(Math.max(104, 20), 24573)];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "[I")
    public static int[] field4511 = new int[6];

    @OriginalMember(owner = "client!a", name = "y", descriptor = "[I")
    private static int[] field4512 = new int[8191];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "[I")
    private static int[] field4510 = field4506;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "[I")
    public static int[] field4509 = field4506;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "[B")
    private static byte[] field4514 = new byte[8191];

    @OriginalMember(owner = "client!a", name = "z", descriptor = "[I")
    private static int[] field4513 = field4506;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "[S")
    private static short[] field4516 = new short[8191];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "[I")
    private static int[] field4519 = new int[8191];

    @OriginalMember(owner = "client!a", name = "E", descriptor = "[F")
    private static float[] field4518 = new float[20];

    @OriginalMember(owner = "client!a", name = "B", descriptor = "[F")
    private static float[] field4515 = field4518;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field4525;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lm;")
    private class105 field4517;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Lb;")
    private class573 field4520;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lc;")
    private class619 field4505;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[Lv;")
    private class557[] field4526;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "(IIIIII)V")
    private final native void method2025(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "za", descriptor = "(IIIIII[BII)V")
    public final native void method910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "()Z")
    public final boolean method941() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IIIIII)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2025(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lig;Z)Lha;")
    public final class116 method916(class295 arg0, boolean arg1) {
        int[] var3 = arg0.field3828;
        byte[] var4 = arg0.field3831;
        int var5 = arg0.field3835;
        int var6 = arg0.field3834;
        class116 var7;
        if (arg1 && arg0.field3833 == null) {
            var7 = new class290(this, this.field4505, var3, var4, 0, arg0.field3835, arg0.field3835, arg0.field3834);
        } else {
            int var8 = var5 * var6;
            int[] var9 = new int[var8];
            byte[] var10 = arg0.field3833;
            if (var10 != null) {
                for (int var11 = 0; var11 < var6; ++var11) {
                    int var12 = var5 * var11;
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var9[var12 + var13] = var3[var4[var12 + var13] & 255] | var10[var12 + var13] << 24;
                    }
                }
                var7 = new class589(this, this.field4505, var9, 0, var5, var5, var6);
            } else {
                boolean var14 = false;
                for (int var15 = 0; var15 < var8; ++var15) {
                    int var16 = arg0.field3828[var4[var15] & 255];
                    if (var16 >>> 24 != 255) {
                        var14 = true;
                    }
                    var9[var15] = var16;
                }
                if (var14) {
                    var7 = new class589(this, this.field4505, var9, 0, arg0.field3835, arg0.field3835, arg0.field3834);
                } else {
                    var7 = new class479(this, this.field4505, var9, 0, arg0.field3835, arg0.field3835, arg0.field3834);
                }
            }
        }
        var7.method623(arg0.field3830, arg0.field3832, arg0.field3829, arg0.field3827);
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "XA", descriptor = "()V")
    private final void method2026() {
        System.gc();
        System.runFinalization();
        class243.method1507(-118);
    }

    @OriginalMember(owner = "client!a", name = "C", descriptor = "()V")
    public final void method994() {
    }

    @OriginalMember(owner = "client!a", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!a", name = "l", descriptor = "()Z")
    public final boolean method944() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "ca", descriptor = "(IIIIIILpa;II)V")
    private final native void method2027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!a", name = "RA", descriptor = "(SBBZZZBBBIIZZ)V")
    private final native void method2028(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIII)V")
    public final native void method979(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "YA", descriptor = "()I")
    public final native int method946();

    @OriginalMember(owner = "client!a", name = "r", descriptor = "()Z")
    public final boolean method963() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class544 method200(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class204(this, this.field4505, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[Lww;)V")
    public final void method972(int arg0, class592[] arg1) {
        int var3 = 0;
        for (int var4 = 0; var4 < arg0; ++var4) {
            field4510[var3++] = arg1[var4].method3414(232);
            field4510[var3++] = arg1[var4].method3416(-2);
            field4510[var3++] = arg1[var4].method3415((byte) 117);
            field4510[var3++] = arg1[var4].method3420(true);
            field4515[var4] = arg1[var4].method3422(125);
            field4510[var3++] = arg1[var4].method3419(85);
        }
        this.method2039(arg0, field4510, field4515);
    }

    @OriginalMember(owner = "client!a", name = "z", descriptor = "()Lm;")
    public final class105 method987() {
        return new class448();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
    public final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2031().method3133(this, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class116 method969(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        return arg4 ? new class589(this, this.field4505, arg0, arg1, arg2, arg3) : new class479(this, this.field4505, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfp;IIII)Lr;")
    public final class521 method197(class528 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class314(this, this.field4505, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "GA", descriptor = "(S)Z")
    private final boolean method2029(short arg0) {
        class473 var2 = super.field2114;
        synchronized (super.field2114) {
            if (!super.field2114.method2144(-11, arg0)) {
                return false;
            } else {
                class41 var4 = super.field2114.method2151(true, arg0);
                if (var4 == null) {
                    return false;
                } else {
                    int[] var6;
                    if (!var4.field603) {
                        var6 = super.field2114.method2143(arg0, (byte) 15, true, 128, 0.7F, 128);
                    } else {
                        var6 = super.field2114.method2146(-20243, 128, arg0, 128, true, 0.7F);
                    }
                    this.method2040(arg0, var4.field600, var4.field614, var4.field610, var4.field604, var4.field608, var4.field601, var4.field617, var4.field620, var4.field612, var4.field605, var4.field616, var4.field607, var6);
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    public final void method932(int arg0) {
        class243.method1507(-73);
        this.method2030(arg0);
        for (class619 var2 = (class619) this.field4507.method3188((byte) -100); var2 != null; var2 = (class619) this.field4507.method3182((byte) -69)) {
            var2.method3552();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IIIII)Lha;")
    public final class116 method976(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class589(this, this.field4505, arg0, arg1, arg2, arg3, arg4) : new class479(this, this.field4505, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class589(this, this.field4505, arg0, arg1, arg2, arg3, arg4) : new class479(this, this.field4505, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!a", name = "la", descriptor = "(FF)V")
    public final native void method926(float arg0, float arg1);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public final void method203(int arg0) {
        this.field4526[arg0].method3127();
    }

    @OriginalMember(owner = "client!a", name = "q", descriptor = "()Z")
    public final boolean method960() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "HA", descriptor = "(I)V")
    private final native void method2030(int arg0);

    @OriginalMember(owner = "client!a", name = "U", descriptor = "()I")
    public final native int method965();

    @OriginalMember(owner = "client!a", name = "m", descriptor = "(IFFFFF)V")
    public final native void method981(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!a", name = "IA", descriptor = "(III[I)V")
    public final native void method991(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public final native int method958();

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
    public final int method938(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!a", name = "o", descriptor = "()V")
    public final void method948() {
    }

    @OriginalMember(owner = "client!a", name = "xa", descriptor = "()V")
    public final native void method933();

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;)V")
    public class328(Canvas arg0, class473 arg1) {
        super(arg1);
        try {
            if (!class558.method3140("sw3d", (byte) -46)) {
                throw new RuntimeException("");
            } else {
                class243.method1508(false);
                this.method2032(super.field2114, 0, 0);
                class367.method2250((byte) 94, true, false);
                this.field4527 = true;
                this.field4524 = new class448();
                this.method956(new class448());
                this.method194(1);
                this.method198(0);
                if (arg0 != null) {
                    this.method918(arg0);
                    this.method201(arg0);
                }
            }
        } catch (Throwable var3) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()Z")
    public final boolean method915() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public final void method907(int arg0) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "y", descriptor = "()V")
    public final void method978() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method918(Canvas arg0) {
        class573 var2 = (class573) this.field4521.method3476((long) arg0.hashCode(), (byte) 28);
        if (var2 == null) {
            try {
                Class var3 = Class.forName("java.awt.Canvas");
                Method var4 = var3.getMethod("setIgnoreRepaint", Boolean.TYPE);
                var4.invoke(arg0, Boolean.TRUE);
            } catch (Exception var6) {
            }
            class573 var5 = new class573(this, arg0);
            this.field4521.method3475(-104, var5, (long) arg0.hashCode());
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lkw;Lm;[Leca;I)V")
    public final void method193(class521[] arg0, class174 arg1, class105 arg2, class378[] arg3, int arg4) {
        this.method2034(arg1, true);
        if (arg3 == null) {
            this.method2031().method3130(this, arg0, arg2, (int[]) null, arg4, field4513, field4512, field4519, field4516, field4514, arg1.field2253.method1250(true), field4509);
        } else {
            class378 var6 = arg3[0];
            field4511[5] = 0;
            this.method2031().method3130(this, arg0, arg2, field4511, arg4, field4513, field4512, field4519, field4516, field4514, arg1.field2253.method1250(true), field4509);
            var6.field5290 = field4511[0];
            var6.field5291 = field4511[1];
            var6.field5292 = field4511[2];
            var6.field5293 = field4511[3];
            var6.field5289 = field4511[4];
            var6.field5294 = field4511[5] != 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg0.length; ++var8) {
            if (arg0[var8] != null) {
                class314 var9 = (class314) arg0[var8];
                var9.method1972(var7, arg2);
                if (var9.field4352 != null) {
                    var7 += var9.field4352.length * 9;
                }
                if (var9.field4351 != null) {
                    var7 += var9.field4351.length * 3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lpe;[Lig;Z)Lra;")
    public final class262 method982(class157 arg0, class295[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field3835;
            var5[var7] = arg1[var7].field3834;
            if (arg1[var7].field3833 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            if (var6) {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
            } else {
                return new class91(this, this.field4505, arg0, arg1, (class116[]) null);
            }
        } else if (var6) {
            throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        } else {
            return new class283(this, this.field4505, arg0, arg1, (class116[]) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkw;)V")
    public final void method957(class174 arg0) {
        this.method2034(arg0, false);
        this.method2031().method3125(this, field4513, field4512, field4519, field4516, arg0.field2253.method1250(true));
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lu;)V")
    public final void method925(class425 arg0) {
        this.field4505 = (class619) arg0;
        this.method2038(arg0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lr;Lm;[Leca;I)V")
    public final void method202(class521[] arg0, class105 arg1, class378[] arg2, int arg3) {
        if (arg2 == null) {
            this.method2031().method3122(this, arg0, arg1, (int[]) null, -1, arg3);
        } else {
            class378 var5 = arg2[0];
            field4511[5] = 0;
            this.method2031().method3122(this, arg0, arg1, field4511, -1, arg3);
            var5.field5290 = field4511[0];
            var5.field5291 = field4511[1];
            var5.field5292 = field4511[2];
            var5.field5293 = field4511[3];
            var5.field5289 = field4511[4];
            var5.field5294 = field4511[5] != 0;
        }
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "()Lv;")
    public final class557 method2031() {
        for (int var1 = 0; var1 < this.field4525; ++var1) {
            if (this.field4526[var1].field7784 == Thread.currentThread()) {
                return this.field4526[var1];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!a", name = "t", descriptor = "()Z")
    public final boolean method966() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "E", descriptor = "(III)V")
    public final native void method923(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "(Ln;II)V")
    private final native void method2032(class473 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "()Z")
    public final boolean method924() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "()Lqf;")
    public final class183 method988() {
        return new class183(0, "SSE", 1, "CPU", 0L);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "([I)V")
    public final native void method980(int[] arg0);

    @OriginalMember(owner = "client!a", name = "v", descriptor = "()Z")
    public final boolean method975() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "v", descriptor = "(IIII)[I")
    public final native int[] method950(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final synchronized void finalize() {
        this.method920(-11);
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!a", name = "m", descriptor = "()V")
    public final void method945() {
        if (!this.field4508) {
            this.field4526 = null;
            this.field4520 = null;
            this.field4505 = null;
            this.field4524 = null;
            this.field4521.method3472((byte) -128);
            for (class619 var1 = (class619) this.field4507.method3188((byte) -100); var1 != null; var1 = (class619) this.field4507.method3182((byte) -55)) {
                var1.method3551();
            }
            this.field4507.method3178(-8299);
            this.method2036();
            if (this.field4527) {
                class111.method597(false, false, true);
                this.field4527 = false;
            }
            this.method2026();
            class243.method1505(-21353);
            this.field4508 = true;
        }
    }

    @OriginalMember(owner = "client!a", name = "B", descriptor = "()Z")
    public final boolean method990() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "N", descriptor = "(IIII)V")
    public final native void method977(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public final void method983(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public final int method921(int arg0, int arg1) {
        int var3 = arg0 & 1048575;
        int var4 = arg1 & 1048575;
        return var3 & var4 ^ var4;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIIIII)Lrn;")
    public final class307 method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method187(Canvas arg0) {
        class573 var2 = (class573) this.field4521.method3476((long) arg0.hashCode(), (byte) 28);
        Dimension var3 = arg0.getSize();
        var2.method3238(arg0, var3.width, var3.height);
        if (arg0 != null && this.field4520.field8008 == arg0) {
            this.method201(arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(IIIIII)V")
    public final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method943(arg0, arg1, arg2, arg4, arg5);
        this.method943(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method979(arg0, arg1 + 1, arg3 - 1, arg4, arg5);
        this.method979(arg0 + arg2 - 1, arg1 + 1, arg3 - 1, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "JA", descriptor = "(IIII)V")
    public final native void method953(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "s", descriptor = "()Lm;")
    public final class105 method964() {
        return this.field4524;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "j", descriptor = "()Z")
    public final boolean method937() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "F", descriptor = "(IIII)V")
    public final native void method939(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class594 method985(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class416(this, this.field4505, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!a", name = "u", descriptor = "()Z")
    public final boolean method970() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method911() {
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(IIIIII)V")
    public final native void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "()Z")
    public final boolean method917() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "x", descriptor = "()Z")
    public final boolean method195() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lr;Lkw;Lm;Leca;I)V")
    public final void method947(class521 arg0, class174 arg1, class105 arg2, class378 arg3, int arg4) {
        this.method2034(arg1, true);
        if (arg3 == null) {
            this.method2031().method3123(this, arg0, arg2, (int[]) null, arg4, field4513, field4512, field4519, field4516, field4514, arg1.field2253.method1250(true), field4509);
        } else {
            field4511[5] = 0;
            this.method2031().method3123(this, arg0, arg2, field4511, arg4, field4513, field4512, field4519, field4516, field4514, arg1.field2253.method1250(true), field4509);
            arg3.field5290 = field4511[0];
            arg3.field5291 = field4511[1];
            arg3.field5292 = field4511[2];
            arg3.field5293 = field4511[3];
            arg3.field5289 = field4511[4];
            arg3.field5294 = field4511[5] != 0;
        }
        class314 var6 = (class314) arg0;
        var6.method1972(0, arg2);
    }

    @OriginalMember(owner = "client!a", name = "q", descriptor = "(IIII)V")
    public final native void method905(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method201(Canvas arg0) {
        if (arg0 != null) {
            class573 var2 = (class573) this.field4521.method3476((long) arg0.hashCode(), (byte) 28);
            this.field4520 = var2;
            this.method2041(var2);
        } else {
            this.field4520 = null;
            this.method2041((class573) null);
        }
    }

    @OriginalMember(owner = "client!a", name = "WA", descriptor = "(S)Z")
    private final boolean method2033(short arg0) {
        synchronized (this) {
            class41 var3 = super.field2114.method2151(true, arg0);
            if (var3 == null) {
                return false;
            } else {
                this.method2028(arg0, var3.field600, var3.field614, var3.field610, var3.field604, var3.field608, var3.field601, var3.field617, var3.field620, var3.field612, var3.field605, var3.field616, var3.field607);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lm;)V")
    public final void method956(class105 arg0) {
        this.field4517 = arg0;
        this.method2035(arg0);
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()I")
    public final int method914() {
        return 4;
    }

    @OriginalMember(owner = "client!a", name = "CA", descriptor = "()I")
    public final native int method954();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(FFF)V")
    public final void method989(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!a", name = "n", descriptor = "()V")
    public final native void method962();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkw;Z)V")
    private final void method2034(class174 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        for (class2 var8 = (class2) arg0.field2253.method1254(false); var8 != null; var8 = (class2) arg0.field2253.method1252(0)) {
            field4513[var3++] = var8.field16;
            field4513[var3++] = var8.field17;
            field4513[var3++] = var8.field14;
            field4512[var4++] = var8.field7;
            field4516[var6++] = (short) var8.field15;
            field4519[var5++] = var8.field9;
            if (arg1) {
                field4514[var7++] = var8.field6;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public final void method198(int arg0) {
        this.field4526[arg0].method3131();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
    public final void method959(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!a", name = "TA", descriptor = "(Lm;)V")
    private final native void method2035(class105 arg0);

    @OriginalMember(owner = "client!a", name = "p", descriptor = "()Z")
    public final boolean method951() {
        return true;
    }

    @OriginalMember(owner = "client!a", name = "w", descriptor = "()V")
    private final native void method2036();

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()Z")
    public final boolean method912() {
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method913(Rectangle[] arg0, int arg1) throws class487 {
        if (this.field4520 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field4520.method3234(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public final void method194(int arg0) {
        this.field4525 = arg0;
        this.field4526 = new class557[this.field4525];
        for (int var2 = 0; var2 < this.field4525; ++var2) {
            this.field4526[var2] = new class557(this, this.field4522, this.field4523);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrn;Lrn;FLrn;)Lrn;")
    public final class307 method931(class307 arg0, class307 arg1, float arg2, class307 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!a", name = "M", descriptor = "(F)V")
    public final native void method993(float arg0);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Lu;")
    public final class425 method971(int arg0) {
        class619 var2 = new class619(this, arg0);
        this.field4507.method3181(var2, true);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "ba", descriptor = "()I")
    public final native int method929();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8) {
        this.method2027(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!a", name = "G", descriptor = "(ILpa;II)V")
    public final native void method930(int arg0, class594 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "()Ljava/lang/Object;")
    private final Object method2037() {
        return new class352(this);
    }

    @OriginalMember(owner = "client!a", name = "B", descriptor = "(IIIIII)Z")
    public final native boolean method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lrn;)V")
    public final void method927(class307 arg0) {
    }

    @OriginalMember(owner = "client!a", name = "D", descriptor = "()V")
    public final void method996() {
    }

    @OriginalMember(owner = "client!a", name = "ta", descriptor = "(II)V")
    public final native void method940(int arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
    public final native void method961(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!a", name = "ea", descriptor = "(Lu;)V")
    private final native void method2038(class425 arg0);

    @OriginalMember(owner = "client!a", name = "L", descriptor = "(I)V")
    public final native void method973(int arg0);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "()V")
    public final void method934() throws class487 {
        if (this.field4520 == null) {
            throw new IllegalStateException("off");
        } else {
            this.field4520.method3239();
        }
    }

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "(I)V")
    public final native void method949(int arg0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method986(Canvas arg0) {
        if (this.field4520.field8008 == arg0) {
            this.method201((Canvas) null);
        }
        class573 var2 = (class573) this.field4521.method3476((long) arg0.hashCode(), (byte) 28);
        if (var2 != null) {
            var2.method589(-8880);
            var2.method3232();
        }
    }

    @OriginalMember(owner = "client!a", name = "A", descriptor = "(IIIII)V")
    public final native void method952(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "oa", descriptor = "(I[I[F)V")
    private final native void method2039(int arg0, int[] arg1, float[] arg2);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIF)Lww;")
    public final class592 method955(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        return new class253(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!a", name = "UA", descriptor = "(IIIII)V")
    public final native void method943(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public final void method968(boolean arg0) {
    }

    @OriginalMember(owner = "client!a", name = "i", descriptor = "()V")
    public final void method936() {
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(SBBZZZBBBIIZZ[I)V")
    private final native void method2040(short arg0, byte arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, byte arg6, byte arg7, byte arg8, int arg9, int arg10, boolean arg11, boolean arg12, int[] arg13);

    @OriginalMember(owner = "client!a", name = "MA", descriptor = "(Lb;)V")
    private final native void method2041(class573 arg0);
}
