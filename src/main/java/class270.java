import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class270 implements class134 {

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lnh;")
    private class680 field3414;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "[Lica;")
    private class217[] field3424;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "F")
    public static float field3411 = 1.0F;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3422 = 4;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Ltda;")
    public static class16 field3417 = new class16(1);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Lr;")
    private class566 field3421;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Z")
    private boolean field3420;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "[[[Lvf;")
    public static class75[][][] field3423;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public final void method777(byte arg0) {
        field3416++;
        if (arg0 != -22) {
            field3423 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)I")
    public final int method780(byte arg0) {
        field3409++;
        if (arg0 > -88) {
            this.field3421 = null;
        }
        return this.field3414.field9553;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static void method1555(int arg0) {
        field3423 = null;
        field3417 = null;
        if (arg0 != 8) {
            method1556(-1.1095078F, 108, 118, -19, -71, 1, -0.10066131F, -113, null, 73, -77);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(FIIIIIFI[FII)V")
    public static final void method1556(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, float[] arg8, int arg9, int arg10) {
        int var11 = arg9 - arg4;
        field3415++;
        int var12 = arg3 - arg5;
        int var13 = arg10 - arg1;
        float var14 = arg8[2] * (float) var12 + arg8[0] * (float) var11 + arg8[1] * (float) var13;
        float var15 = arg8[5] * (float) var12 + arg8[3] * (float) var11 + arg8[4] * (float) var13;
        float var16 = arg8[arg7] * (float) var12 + arg8[6] * (float) var11 + arg8[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        float var18 = var15 + arg0 + 0.5F;
        if (arg2 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg2 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg2 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class488.field6469 = var18;
        class5.field132 = var17;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(JI)Z")
    public final boolean method779(long arg0, int arg1) {
        if (arg1 != 21336) {
            field3411 = -0.9429004F;
        }
        field3413++;
        return (long) this.field3414.field9555 + arg0 <= class571.method3150(121);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZ)V")
    public final void method775(boolean arg0, boolean arg1) {
        boolean var3 = arg0;
        field3412++;
        class217[] var4 = this.field3424;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class217 var6 = var4[var5];
            if (var6 != null) {
                var6.method395(var3 || this.field3420, 6621);
            }
        }
        this.field3420 = false;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/awt/Canvas;)Lnc;")
    public static final class589 method1557(int arg0, Canvas arg1) {
        field3419++;
        try {
            Class var2 = Class.forName("jd");
            class589 var3 = (class589) var2.getDeclaredConstructor().newInstance();
            var3.method857(arg0 ^ 0xFFFFFE0C, arg1);
            return arg0 == 256 ? var3 : null;
        } catch (Throwable var5) {
            class148 var4 = new class148();
            var4.method857(-244, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method776(int arg0) {
        if (class32.field452 != this.field3421) {
            this.field3421 = class32.field452;
            this.field3420 = true;
        }
        field3408++;
        if (arg0 < 74) {
            method1557(124, null);
        }
        this.field3421.method1028(0);
        class217[] var2 = this.field3424;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class217 var4 = var2[var3];
            if (var4 != null) {
                var4.method394(-48);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLni;)V")
    public static final void method1558(byte arg0, class687 arg1) {
        field3418++;
        boolean var2 = false;
        if (class133.field1735 == arg1.field9665 || arg1.field9689 == -1 || arg1.field9731 != 0) {
            var2 = true;
        } else {
            class395 var3 = class583.field8149.method1844(64, arg1.field9689);
            if (var3.field4989 || var3.field4991[arg1.field9741] < (arg1.field9725 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field9665 - arg1.field9740;
            int var5 = class133.field1735 - arg1.field9740;
            int var6 = arg1.field9651 * 512 + (arg1.method2785(-1) * 256);
            int var7 = arg1.field9722 * 512 + arg1.method2785(-1) * 256;
            int var8 = arg1.field9715 * 512 + (arg1.method2785(-1) * 256);
            int var9 = arg1.field9694 * 512 + arg1.method2785(-1) * 256;
            arg1.field6461 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field6464 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field9748 = 0;
        if (arg1.field9685 == 0) {
            arg1.method3873(8192, 1003, false);
        }
        if (arg1.field9685 == 1) {
            arg1.method3873(12288, 1003, false);
        }
        if (arg1.field9685 == 2) {
            arg1.method3873(0, 1003, false);
        }
        if (arg0 < 68) {
            field3411 = 1.1650994F;
        }
        if (arg1.field9685 == 3) {
            arg1.method3873(4096, 1003, false);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lnh;Lhm;)V")
    public class270(class680 arg0, class504 arg1) {
        this.field3414 = arg0;
        this.field3424 = new class217[this.field3414.field9556.length];
        for (int var3 = 0; var3 < this.field3424.length; var3++) {
            this.field3424[var3] = arg1.method2710((byte) 94, this.field3414.field9556[var3]);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
    public final int method778(byte arg0) {
        if (arg0 <= 74) {
            return -42;
        }
        field3410++;
        int var2 = 0;
        class217[] var3 = this.field3424;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class217 var5 = var3[var4];
            if (var5 == null || var5.method392((byte) 82)) {
                var2++;
            }
        }
        return var2 * 100 / this.field3424.length;
    }
}
