import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class168 extends class33 {

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    private int field3240 = 585;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Lrd;")
    public static class173 field3238 = class133.method843("<img=1>", -91);

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "Lrd;")
    private static class173 field3247 = class133.method843("Players", 125);

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "Lrd;")
    public static class173 field3236 = field3247;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 4096) {
            method1085(42, (class14) null, 67, (byte) -49, (class14) null);
        }
        ++field3242;
        if (arg1 == arg7 && arg2 == arg9 && ~arg5 == ~arg8 && arg0 == arg6) {
            class145.method921(arg6, arg9, arg5, 0, arg1, arg4);
        } else {
            int var10 = arg1;
            int var11 = arg1 * 3;
            int var12 = arg9;
            int var13 = arg2 * 3;
            int var14 = arg7 * 3;
            int var15 = arg8 * 3;
            int var16 = arg0 * 3;
            int var17 = arg9 * 3;
            int var18 = arg5 - arg1 + -var15 + var14;
            int var19 = -var16 - -var13 + -arg9 + arg6;
            int var20 = -var13 + var16 + -var13 - -var17;
            int var21 = -var11 + var14;
            int var22 = var15 - (var14 - -var14) + var11;
            int var23 = -var17 + var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var22 * var25;
                int var29 = var20 * var25;
                int var30 = var21 * var24;
                int var31 = var18 * var26;
                int var32 = var23 * var24;
                int var33 = arg1 - -(var30 + var31 + var28 >> 12);
                int var34 = (var27 + var32 - -var29 >> 12) + arg9;
                class145.method921(var34, var12, var33, arg3 ^ 4096, var10, arg4);
                var10 = var33;
                var12 = var34;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
    public static void method1083(int arg0) {
        if (arg0 <= -3) {
            field3247 = null;
            field3238 = null;
            field3236 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 <= -99) {
            ++field3245;
            if (arg0 == 0) {
                this.field3240 = arg2.method755((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBII)V")
    public static final void method1084(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 104 % ((44 - arg2) / 33);
        ++field3239;
        if (arg0 < arg4) {
            class51.method350(arg0, arg3, (byte) -117, class107.field1998[arg1], arg4);
        } else {
            class51.method350(arg4, arg3, (byte) -126, class107.field1998[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILbc;IBLbc;)Lqc;")
    public static final class162 method1085(int arg0, class14 arg1, int arg2, byte arg3, class14 arg4) {
        ++field3237;
        if (arg3 != -111) {
            return null;
        } else {
            return !class18.method155(arg0, arg2, arg1, (byte) 104) ? null : class87.method563(3611, arg4.method142(arg0, arg2, (byte) 2));
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLoh;)V")
    public static final void method1086(byte arg0, class147 arg1) {
        arg1.field2775 = 0;
        int var2 = -class217.field4203 + arg1.field2812;
        ++field3244;
        if (~arg1.field2751 == -1) {
            arg1.field2794 = 1024;
        }
        if (arg1.field2751 == 1) {
            arg1.field2794 = 1536;
        }
        if (~arg1.field2751 == -3) {
            arg1.field2794 = 0;
        }
        int var3 = arg1.field2805 * 128 + arg1.field2754 * 64;
        if (~arg1.field2751 == -4) {
            arg1.field2794 = 512;
        }
        int var4 = arg1.field2802 * 128 + arg1.field2754 * 64;
        if (arg0 <= 94) {
            field3246 = -113;
        }
        arg1.field2820 += (var3 - arg1.field2820) / var2;
        arg1.field2801 += (-arg1.field2801 + var4) / var2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field3248;
        int var3 = -43 % ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, 123);
        if (super.field718.field1615) {
            int var5 = class105.field1937[arg0];
            for (int var6 = 0; var6 < class117.field2173; ++var6) {
                int var7 = class138.field2585[var6];
                if (~var7 < ~this.field3240 && var7 < 4096 - this.field3240 && var5 > -this.field3240 + 2048 && ~var5 > ~(this.field3240 + 2048)) {
                    int var8 = -var7 + 2048;
                    int var9 = var8 < 0 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field3240 + 2048);
                    var4[var6] = -var11 + 4096;
                } else if (~var7 < ~(2048 - this.field3240) && var7 < this.field3240 + 2048) {
                    int var12 = var5 - 2048;
                    int var13 = var12 >= 0 ? var12 : -var12;
                    int var14 = var13 - this.field3240;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (-this.field3240 + 2048);
                } else if (var5 >= this.field3240 && ~var5 >= ~(-this.field3240 + 4096)) {
                    if (this.field3240 <= var7 && ~var7 >= ~(-this.field3240 + 4096)) {
                        var4[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = var16 < 0 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (-this.field3240 + 2048);
                        var4[var6] = -var19 + 4096;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = ~var20 <= -1 ? var20 : -var20;
                    int var22 = var21 - this.field3240;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field3240 + 2048);
                }
            }
        }
        return var4;
    }
}
