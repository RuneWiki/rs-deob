import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class315 extends class396 {

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field4991 = new String[] { method2655(method2654("H/@\u0013")), method2655(method2654("H/B\u0013")), method2655(method2654("H/A\u0013")), method2655(method2654("H/L\u0013")), method2655(method2654("H/G\u0013")), method2655(method2654("H/C\u0013")), method2655(method2654("H/M\u0013")), method2655(method2654("D/+\u0015v")), method2655(method2654("H/D\u0013")), method2655(method2654("QtiW")), method2655(method2654("H/F\u0013")) };

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Lla;")
    public static class476 field4987;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lfs;")
    private class581 field4974;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "Lfs;")
    private class581 field4980;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Lfs;")
    private class581 field4981;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lfs;")
    private class581 field4986;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lfs;")
    public class581 field4988;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lfs;")
    private class581 field4989;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZI)Z", line = 6)
    public static final boolean method2649(int arg0, boolean arg1, int arg2) {
        try {
            if (arg1) {
                method2651(-50);
            }
            ++field4983;
            if (~arg2 <= -1001 && ~arg0 > -1001) {
                return true;
            } else if (~arg2 > -1001 && arg0 < 1000) {
                if (class274.method2267(arg0, (byte) -20)) {
                    return true;
                } else {
                    return !class274.method2267(arg2, (byte) -20);
                }
            } else {
                return ~arg2 <= -1001 && ~arg0 <= -1001;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4991[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lla;Lla;Lcs;)V", line = 38)
    public class315(class476 arg0, class476 arg1, class358 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIFIIIFIBI[F[F)V", line = 41)
    public static final void method2650(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, int arg7, byte arg8, int arg9, float[] arg10, float[] arg11) {
        try {
            int var23 = arg7 - arg3;
            int var22 = arg5 - arg9;
            int var21 = arg0 - arg4;
            ++field4990;
            float var12 = arg10[2] * (float) var23 + arg10[1] * (float) var21 + arg10[0] * (float) var22;
            float var13 = arg10[5] * (float) var23 + arg10[4] * (float) var21 + arg10[3] * (float) var22;
            float var14 = arg10[8] * (float) var23 + arg10[6] * (float) var22 + arg10[7] * (float) var21;
            if (arg8 < 121) {
                field4985 = -91;
            }
            float var15 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
            if (arg6 != 1.0F) {
                var15 = arg6 * var15;
            }
            float var16 = var13 + 0.5F + arg2;
            if (arg1 != 1) {
                if (arg1 == 2) {
                    var16 = -var16;
                    var15 = -var15;
                } else if (arg1 == 3) {
                    float var17 = var15;
                    var15 = var16;
                    var16 = -var17;
                }
            } else {
                float var18 = var15;
                var15 = -var16;
                var16 = var18;
            }
            arg11[0] = var15;
            arg11[1] = var16;
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field4991[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field4991[7] : field4991[9]) + ',' + (arg11 != null ? field4991[7] : field4991[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIBI)V", line = 98)
    public final void method188(boolean arg0, int arg1, byte arg2, int arg3) {
        try {
            ++field4982;
            if (arg0) {
                int[] var5 = new int[4];
                class610.field8913.method543(var5);
                class610.field8913.method489(arg1, arg3, arg1 - -super.field5922.field5809, super.field5922.field5810 + arg3);
                int var6 = this.field4980.method988();
                int var7 = this.field4980.method997();
                int var8 = this.field4974.method988();
                int var9 = this.field4974.method997();
                this.field4980.method4347(arg1, (super.field5922.field5810 - var7) / 2 + arg3);
                this.field4974.method4347(super.field5922.field5809 + arg1 + -var8, (-var9 + super.field5922.field5810) / 2 + arg3);
                class610.field8913.method489(arg1, arg3, super.field5922.field5809 + arg1, arg3 - -this.field4981.method997());
                this.field4981.method4350(arg1 - -var6, arg3, -var6 + -var8 + super.field5922.field5809, super.field5922.field5810);
                int var10 = this.field4989.method997();
                class610.field8913.method489(arg1, -var10 + arg3 + super.field5922.field5810, arg1 - -super.field5922.field5809, super.field5922.field5810 + arg3);
                this.field4989.method4350(arg1 + var6, arg3 - (-super.field5922.field5810 - -var10), -var6 - var8 + super.field5922.field5809, super.field5922.field5810);
                class610.field8913.method489(var5[0], var5[1], var5[2], var5[3]);
            }
            int var11 = 27 % ((-64 - arg2) / 40);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4991[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 132)
    public static void method2651(int arg0) {
        try {
            field4987 = null;
            if (arg0 != 0) {
                method2649(-31, true, -9);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4991[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIZI)V", line = 148)
    public final void method187(boolean arg0, int arg1, boolean arg2, int arg3) {
        try {
            ++field4977;
            int var5 = arg1 + this.field4980.method988();
            int var6 = arg1 + super.field5922.field5809 + -this.field4974.method988();
            int var7 = arg3 - -this.field4981.method997();
            int var8 = super.field5922.field5810 + arg3 - this.field4989.method997();
            if (!arg0) {
                field4987 = null;
            }
            int var9 = -var5 + var6;
            int var10 = -var7 + var8;
            int var11 = this.method3130(-1) * var9 / 10000;
            int[] var12 = new int[4];
            class610.field8913.method543(var12);
            class610.field8913.method489(var5, var7, var5 - -var11, var8);
            this.method2653(var5, var9, var10, var7, (byte) 39);
            class610.field8913.method489(var5 + var11, var7, var6, var8);
            this.field4986.method4350(var5, var7, var9, var10);
            class610.field8913.method489(var12[0], var12[1], var12[2], var12[3]);
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field4991[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Z", line = 180)
    public final boolean method369(int arg0) {
        try {
            ++field4979;
            if (!super.method369(arg0)) {
                return false;
            } else {
                if (arg0 != -17976) {
                    field4975 = -64;
                }
                class358 var2 = (class358) super.field5922;
                if (!super.field5925.method3618(var2.field5489, 43)) {
                    return false;
                } else if (!super.field5925.method3618(var2.field5486, 55)) {
                    return false;
                } else if (!super.field5925.method3618(var2.field5482, 106)) {
                    return false;
                } else if (!super.field5925.method3618(var2.field5480, 58)) {
                    return false;
                } else if (!super.field5925.method3618(var2.field5479, 88)) {
                    return false;
                } else {
                    return super.field5925.method3618(var2.field5490, 54);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4991[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 219)
    public final void method370(byte arg0) {
        try {
            ++field4978;
            super.method370((byte) -105);
            class358 var2 = (class358) super.field5922;
            this.field4988 = class670.method4933(-35, super.field5925, var2.field5489);
            if (arg0 < -98) {
                this.field4986 = class670.method4933(-122, super.field5925, var2.field5486);
                this.field4980 = class670.method4933(-89, super.field5925, var2.field5482);
                this.field4974 = class670.method4933(-127, super.field5925, var2.field5480);
                this.field4981 = class670.method4933(-9, super.field5925, var2.field5479);
                this.field4989 = class670.method4933(-79, super.field5925, var2.field5490);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4991[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 239)
    public static final void method2652(int arg0) {
        try {
            ++field4984;
            class497.field7202 = null;
            class1.field5 = null;
            class80.field901 = null;
            class202.field3150 = -1;
            class730.field10602 = null;
            class647.field9367 = -1;
            class290.field4310 = null;
            class792.field11524 = null;
            class301.field4720 = null;
            class166.field2283 = arg0;
            class204.field3165 = -1;
            class84.field936.method1874(27105);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4991[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIB)V", line = 262)
    public void method2653(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            this.field4988.method4350(arg0, arg3, arg1, arg2);
            ++field4976;
            if (arg4 != 39) {
                this.field4989 = null;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4991[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2654(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2655(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
