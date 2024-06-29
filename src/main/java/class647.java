import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class647 extends class252 {

    @OriginalMember(owner = "client!sea", name = "x", descriptor = "[Ld;")
    public static class135[] field9096 = new class135[300];

    @OriginalMember(owner = "client!sea", name = "p", descriptor = "F")
    public static float field9088;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "F")
    public static float field9093;

    @OriginalMember(owner = "client!sea", name = "o", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!sea", name = "r", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!sea", name = "w", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!sea", name = "y", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!sea", name = "A", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!sea", name = "B", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "(I)V")
    public static void method3588(int arg0) {
        if (arg0 != -10) {
            field9088 = 0.83986455F;
        }
        field9096 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lbd;[[BB)V")
    public static final void method3589(class56 arg0, byte[][] arg1, byte arg2) {
        ++field9094;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var4 > var5; ++var5) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class695 var11 = new class695(var10);
                int var12 = class273.field4105[var5] >> 8;
                int var13 = 255 & class273.field4105[var5];
                int var14 = var12 * 64 + -class109.field1672;
                int var15 = var13 * 64 + -class203.field2874;
                class263.method1730(-1);
                arg0.method2022(class109.field1672, class423.field6155, var14, class203.field2874, var11, (byte) 76, var15);
                arg0.method609(var15, var3, var14, 23, var11, class282.field4228);
                if (!arg0.field4760 && ~(class312.field4619 / 8) == ~var12 && ~(class360.field5169 / 8) == ~var13 && ~var3[0] != 0) {
                    class380.field5380 = class226.field3182.method3129(var3[1], class177.field2526, 0, var3[0], var3[3], var3[2]);
                    class134.field1975 = var3[4];
                }
            }
        }
        if (arg2 > -105) {
            method3589((class56) null, (byte[][]) null, (byte) 21);
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            int var7 = (class273.field4105[var6] >> 8) * 64 + -class109.field1672;
            int var8 = (255 & class273.field4105[var6]) * 64 + -class203.field2874;
            byte[] var9 = arg1[var6];
            if (var9 == null && class360.field5169 < 800) {
                class263.method1730(-1);
                arg0.method2029(var7, var8, (byte) -102, 64, 64);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILvg;BI)V")
    public static final void method3590(int arg0, class49 arg1, byte arg2, int arg3) {
        ++field9098;
        if (class648.field9107 == null && !class623.field8731) {
            if (arg1 != null && class1.method6((byte) 93, arg1) != null) {
                class648.field9107 = arg1;
                class461.field6646 = class1.method6((byte) 119, arg1);
                class60.field1143 = arg3;
                class285.field4264 = 0;
                class197.field2804 = arg0;
                if (arg2 >= -101) {
                    method3593((class695) null, -74);
                }
                class315.field4670 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
    public final void method788(boolean arg0) {
        super.field3884.method2366(false, 16);
        if (!arg0) {
            method3590(-48, (class49) null, (byte) 58, 127);
        }
        ++field9095;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(ZI)V")
    public final void method791(boolean arg0, int arg1) {
        ++field9091;
        if (arg1 != 1) {
            method3590(-65, (class49) null, (byte) 11, -14);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V")
    public final void method794(boolean arg0, int arg1) {
        ++field9097;
        if (arg1 == -1) {
            super.field3884.method2366(true, 16);
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lhea;)V")
    public class647(class387 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)I")
    public static final int method3591(int arg0, int arg1) {
        ++field9087;
        double var2 = (double) ((16768759 & arg0) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var6 = (double) (arg0 & 255) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (-var8 + var10) / (var8 + var10);
            }
            if (var2 != var10) {
                if (var4 != var10) {
                    if (var6 == var10) {
                        var12 = (-var4 + var2) / (-var8 + var10) + 4.0D;
                    }
                } else {
                    var12 = (-var2 + var6) / (var10 - var8) + 2.0D;
                }
            } else {
                var12 = (-var6 + var4) / (var10 - var8);
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (-var10 + 2.0D + -var8);
            }
        }
        if (arg1 != -30824) {
            field9096 = null;
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (~var21 > -1) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (~var22 <= -1) {
            if (var22 > 255) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (var22 <= 243) {
            if (var22 <= 217) {
                if (var22 <= 192) {
                    if (var22 > 179) {
                        var21 >>= 1;
                    }
                } else {
                    var21 >>= 2;
                }
            } else {
                var21 >>= 3;
            }
        } else {
            var21 >>= 4;
        }
        return (var22 >> 1) + (var21 >> 5 << 7) + ((var20 >> 2 & 63) << 10);
    }

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "(I)Z")
    public final boolean method792(int arg0) {
        ++field9092;
        if (arg0 != 6439) {
            field9093 = -2.3794594F;
        }
        return true;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lbb;II)V")
    public final void method790(class301 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field9088 = -1.2320627F;
        }
        super.field3884.method2337(false, arg0);
        ++field9100;
        super.field3884.method2308(arg2, arg1);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
    public final void method796(int arg0, int arg1, int arg2) {
        if (arg2 > -105) {
            method3590(87, (class49) null, (byte) -15, 49);
        }
        ++field9090;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Llt;Lr;ILsp;)V")
    public static final void method3592(class627 arg0, class166 arg1, int arg2, class588 arg3) {
        ++field9089;
        class702 var4 = arg3.method3325(arg1, 55);
        if (var4 != null) {
            int var5 = var4.method927();
            if (var5 < var4.method939()) {
                var5 = var4.method939();
            }
            byte var6 = 10;
            int var7 = arg0.field8773;
            int var8 = arg0.field8779;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg3.field8265 != null) {
                var9 = class597.field8436.method1042(false, (int[]) null, (class702[]) null, arg3.field8265, class32.field508);
                for (int var12 = 0; ~var9 < ~var12; ++var12) {
                    String var13 = class32.field508[var12];
                    if (~var12 > ~(var9 + -1)) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class371.field5299.method2036(var13);
                    if (~var10 > ~var14) {
                        var10 = var14;
                    }
                }
                var11 = class371.field5299.method2038() * var9 + class371.field5299.method2040() / 2;
            }
            int var15 = var5 / 2 + arg0.field8773;
            if (var7 < class25.field357 - -var5) {
                var15 = var5 / 2 - -(var10 / 2) + class25.field357 + var6 - -5;
                var7 = class25.field357;
            } else if (var7 > class25.field353 - var5) {
                var15 = -(var10 / 2) + class25.field353 + -5 + -(var5 / 2) + -var6;
                var7 = -var5 + class25.field353;
            }
            int var16 = arg0.field8779;
            if (class25.field370 + var5 > var8) {
                var16 = class25.field370 - -(var5 / 2) + var6;
                var8 = class25.field370;
            } else if (-var5 + class25.field368 < var8) {
                var16 = -(var5 / 2) + -var11 + -var6 + class25.field368;
                var8 = class25.field368 - var5;
            }
            int var17 = (int) (Math.atan2((double) (var7 - arg0.field8773), (double) (-arg0.field8779 + var8)) / 3.141592653589793D * 32767.0D) & 65535;
            var4.method3912((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg3.field8265 != null) {
                var18 = -(var10 / 2) + var15 + -5;
                var19 = var16;
                var21 = 3 + var9 * class371.field5299.method2038() + var16;
                var20 = var18 - (-var10 + -10);
                if (arg3.field8228 != 0) {
                    arg1.method1150(-var18 + var20, var16, var18, -1, arg3.field8228, -var16 + var21);
                }
                if (arg3.field8232 != 0) {
                    arg1.method1149(-var18 + var20, -4, arg3.field8232, var16, -var16 + var21, var18);
                }
                for (int var22 = 0; ~var22 > ~var9; ++var22) {
                    String var23 = class32.field508[var22];
                    if (~(var9 + -1) < ~var22) {
                        var23 = var23.substring(0, var23.length() - 4);
                    }
                    class371.field5299.method2035(arg1, var23, var15, var16, arg3.field8239, true);
                    var16 += class371.field5299.method2038();
                }
            }
            if (arg3.field8237 != -1 || arg3.field8265 != null) {
                int var24 = var5 >> 1;
                class430 var25 = new class430(arg0);
                var25.field6307 = var7 + var24;
                var25.field6300 = -var24 + var7;
                var25.field6304 = var21;
                var25.field6299 = var20;
                var25.field6305 = -var24 + var8;
                var25.field6301 = var8 + var24;
                var25.field6297 = var19;
                var25.field6308 = var18;
                class569.field8030.method474(var25, 6);
            }
            if (arg2 <= 63) {
                method3593((class695) null, 56);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lmo;I)Lqb;")
    public static final class202 method3593(class695 arg0, int arg1) {
        ++field9099;
        if (arg1 != 2) {
            method3589((class56) null, (byte[][]) null, (byte) -126);
        }
        return new class202(arg0.method3814(false), arg0.method3814(false), arg0.method3814(false), arg0.method3814(false), arg0.method3873(arg1 + 253), arg0.method3873(arg1 ^ 253), arg0.method3826(false));
    }
}
