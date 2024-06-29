import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class236 extends class202 {

    @OriginalMember(owner = "client!er", name = "A", descriptor = "Low;")
    public class665 field3417 = new class665();

    @OriginalMember(owner = "client!er", name = "E", descriptor = "Lpj;")
    public class764 field3421 = new class764();

    @OriginalMember(owner = "client!er", name = "D", descriptor = "Lof;")
    private class477 field3420;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    public static int field3415 = -1;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "I")
    public static int field3418 = -1;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIB[ILmn;I)V")
    private final void method1594(int arg0, int arg1, byte arg2, int[] arg3, class239 arg4, int arg5) {
        if (arg2 > -86) {
            method1595(83, null, 118, null);
        }
        if ((this.field3420.field6545[arg4.field3457] & 0x4) != 0 && arg4.field3447 < 0) {
            int var7 = this.field3420.field6558[arg4.field3457] / class702.field9843;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field3454) / var7;
                if (arg1 < var8) {
                    arg4.field3454 += arg1 * var7;
                    break;
                }
                arg4.field3455.method1422(arg3, arg5, var8);
                arg4.field3454 += var7 * var8 - 1048576;
                arg1 -= var8;
                arg5 += var8;
                int var9 = class702.field9843 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class557 var11 = arg4.field3455;
                if (this.field3420.field6497[arg4.field3457] == 0) {
                    arg4.field3455 = class557.method3247(arg4.field3452, var11.method3217(), var11.method3242(), var11.method3231());
                } else {
                    arg4.field3455 = class557.method3247(arg4.field3452, var11.method3217(), 0, var11.method3231());
                    this.field3420.method2804(arg4, arg4.field3445.field1335[arg4.field3461] < 0, (byte) -95);
                    arg4.field3455.method3237(var9, var11.method3242());
                }
                if (arg4.field3445.field1335[arg4.field3461] < 0) {
                    arg4.field3455.method3213(-1);
                }
                var11.method3215(var9);
                var11.method1422(arg3, arg5, arg0 - arg5);
                if (var11.method3236()) {
                    this.field3421.method4221(var11);
                }
            }
        }
        field3419++;
        arg4.field3455.method1422(arg3, arg5, arg1);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method1421(int arg0) {
        field3411++;
        this.field3421.method1421(arg0);
        for (class239 var2 = (class239) this.field3417.method3731((byte) -107); var2 != null; var2 = (class239) this.field3417.method3729((byte) -123)) {
            if (!this.field3420.method2822(var2, (byte) -105)) {
                int var3 = arg0;
                do {
                    if (var2.field3449 >= var3) {
                        this.method1596((byte) -125, var2, var3);
                        var2.field3449 -= var3;
                        break;
                    }
                    this.method1596((byte) -109, var2, var2.field3449);
                    var3 -= var2.field3449;
                } while (!this.field3420.method2831(-100, var2, var3, null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "()Lfja;")
    public final class202 method1423() {
        field3413++;
        class239 var1 = (class239) this.field3417.method3731((byte) -83);
        if (var1 == null) {
            return null;
        } else if (var1.field3455 == null) {
            return this.method1420();
        } else {
            return var1.field3455;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[BILfc;)Loga;")
    public static final class180 method1595(int arg0, byte[] arg1, int arg2, class642 arg3) {
        if (arg2 != 32635) {
            method1595(122, null, -1, null);
        }
        field3410++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class604.field8583, 0);
        if (class604.field8583[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class180(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
    public final int method1418() {
        field3422++;
        return 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLmn;I)V")
    private final void method1596(byte arg0, class239 arg1, int arg2) {
        if (arg0 >= -65) {
            return;
        }
        field3412++;
        if ((this.field3420.field6545[arg1.field3457] & 0x4) != 0 && arg1.field3447 < 0) {
            int var4 = this.field3420.field6558[arg1.field3457] / class702.field9843;
            int var5 = (var4 + 1048575 - arg1.field3454) / var4;
            arg1.field3454 = arg2 * var4 + arg1.field3454 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field3420.field6497[arg1.field3457] == 0) {
                    arg1.field3455 = class557.method3247(arg1.field3452, arg1.field3455.method3217(), arg1.field3455.method3242(), arg1.field3455.method3231());
                } else {
                    arg1.field3455 = class557.method3247(arg1.field3452, arg1.field3455.method3217(), 0, arg1.field3455.method3231());
                    this.field3420.method2804(arg1, arg1.field3445.field1335[arg1.field3461] < 0, (byte) -42);
                }
                if (arg1.field3445.field1335[arg1.field3461] < 0) {
                    arg1.field3455.method3213(-1);
                }
                arg2 = arg1.field3454 / var4;
            }
        }
        arg1.field3455.method1421(arg2);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "()Lfja;")
    public final class202 method1420() {
        field3414++;
        class239 var1;
        do {
            var1 = (class239) this.field3417.method3729((byte) 121);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3455 == null);
        return var1.field3455;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[FIIZI)V")
    public static final void method1597(int arg0, int arg1, float[] arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3408++;
        if (arg3 > 0 && !class362.method2181(arg3, -1)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class362.method2181(arg6, -1)) {
            int var7 = class752.method4155(arg4, (byte) -116);
            int var8 = 0;
            int var9 = arg6 <= arg3 ? arg6 : arg3;
            if (arg5) {
                int var10 = arg3 >> 1;
                int var11 = arg6 >> 1;
                float[] var12 = arg2;
                float[] var13 = new float[var10 * var11 * var7];
                while (true) {
                    OpenGL.glTexImage2Df(arg0, var8, arg1, arg3, arg6, 0, arg4, 5126, var12, 0);
                    if (var9 <= 1) {
                        return;
                    }
                    int var14 = arg3 * var7;
                    float[] var15 = var13;
                    for (int var16 = 0; var16 < var7; var16++) {
                        int var17 = var16;
                        int var18 = var16;
                        int var19 = var14 + var16;
                        for (int var20 = 0; var20 < var11; var20++) {
                            for (int var21 = 0; var21 < var10; var21++) {
                                float var22 = var12[var18];
                                int var23 = var7 + var18;
                                float var24 = var12[var23] + var22;
                                var18 = var7 + var23;
                                float var25 = var12[var19] + var24;
                                int var26 = var7 + var19;
                                float var27 = var12[var26] + var25;
                                var13[var17] = var27 * 0.25F;
                                var19 = var7 + var26;
                                var17 += var7;
                            }
                            var19 += var14;
                            var18 += var14;
                        }
                    }
                    var13 = var12;
                    arg6 = var11;
                    var12 = var15;
                    arg3 = var10;
                    var11 >>= 0x1;
                    var8++;
                    var9 >>= 0x1;
                    var10 >>= 0x1;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "([III)V")
    public final void method1422(int[] arg0, int arg1, int arg2) {
        field3416++;
        this.field3421.method1422(arg0, arg1, arg2);
        for (class239 var4 = (class239) this.field3417.method3731((byte) -66); var4 != null; var4 = (class239) this.field3417.method3729((byte) 46)) {
            if (!this.field3420.method2822(var4, (byte) 119)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3449 >= var6) {
                        this.method1594(var5 + var6, var6, (byte) -104, arg0, var4, var5);
                        var4.field3449 -= var6;
                        break;
                    }
                    this.method1594(var5 + var6, var4.field3449, (byte) -87, arg0, var4, var5);
                    var5 += var4.field3449;
                    var6 -= var4.field3449;
                } while (!this.field3420.method2831(-83, var4, var6, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
    public static final boolean method1598(int arg0, int arg1, int arg2) {
        field3409++;
        int var3 = 124 / ((arg1 + 15) / 51);
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lof;)V")
    public class236(class477 arg0) {
        this.field3420 = arg0;
    }
}
