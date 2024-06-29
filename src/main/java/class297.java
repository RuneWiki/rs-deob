import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class297 extends class185 {

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    private int field4696 = 2000;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    private int field4702 = 16;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    private int field4694 = 4096;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    private int field4691 = 0;

    @OriginalMember(owner = "client!li", name = "X", descriptor = "I")
    private int field4705 = 0;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "Z")
    public static boolean field4692 = true;

    @OriginalMember(owner = "client!li", name = "S", descriptor = "[Lda;")
    public static class189[] field4700 = new class189[29];

    @OriginalMember(owner = "client!li", name = "P", descriptor = "[J")
    public static long[] field4697 = new long[32];

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!li", name = "V", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!li", name = "W", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!li", name = "Y", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!li", name = "Z", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "[[[I")
    public static int[][][] field4695;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
    public static final void method1988(int arg0, boolean arg1) {
        if (arg0 != 37) {
            if (~arg0 != -51) {
                if (arg0 != 75) {
                    if (~arg0 == -101) {
                        class61.field972 = 8.0F;
                    } else if (~arg0 == -201) {
                        class61.field972 = 16.0F;
                    }
                } else {
                    class61.field972 = 6.0F;
                }
            } else {
                class61.field972 = 4.0F;
            }
        } else {
            class61.field972 = 3.0F;
        }
        ++field4699;
        class146.field2137 = -1;
        if (!arg1) {
            method1991((byte) 52);
        }
        class146.field2137 = -1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Lei;")
    public static final class175 method1989(int arg0, int arg1, int arg2) {
        ++field4704;
        class175 var3 = (class175) class145.field2120.method1665(16);
        if (arg0 > -36) {
            field4693 = 113;
        }
        while (var3 != null) {
            if (var3.field2670 && var3.method1087(-128, arg2, arg1)) {
                return var3;
            }
            var3 = (class175) class145.field2120.method1659((byte) -118);
        }
        return null;
    }

    @OriginalMember(owner = "client!li", name = "i", descriptor = "(I)V")
    public static final void method1990(int arg0) {
        if (arg0 == -10393) {
            class274.field4121.method1775(arg0 ^ -17044);
            class66.field1063.method1775(27147);
            class153.field2236.method1775(27147);
            ++field4708;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field4703;
        if (arg2 != -6357) {
            this.method27(-43, (class248) null, -107);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field4694 = arg1.method1575(false);
                        }
                    } else {
                        this.field4691 = arg1.method1575(false);
                    }
                } else {
                    this.field4702 = arg1.method1593((byte) 27);
                }
            } else {
                this.field4696 = arg1.method1575(false);
            }
        } else {
            this.field4705 = arg1.method1593((byte) 27);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)V")
    public static void method1991(byte arg0) {
        field4695 = null;
        field4700 = null;
        if (arg0 < -69) {
            field4697 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class297() {
        super(0, true);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        if (arg1 < 70) {
            method1992(45, 78, -19, 66, -8, 71, 95, -88, true);
        }
        ++field4707;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int var4 = this.field4694 >> 1;
            int[][] var5 = super.field2804.method563((byte) -27);
            Random var6 = new Random((long) this.field4705);
            for (int var7 = 0; this.field4696 > var7; ++var7) {
                int var8 = this.field4694 > 0 ? this.field4691 - -class112.method726(this.field4694, (byte) 45, var6) + -var4 : this.field4691;
                int var9 = class112.method726(class174.field2648, (byte) 89, var6);
                int var10 = class112.method726(class130.field1933, (byte) 126, var6);
                int var11 = (var8 & 4085) >> 4;
                int var12 = var10 - -(class97.field1523[var11] * this.field4702 >> 12);
                int var13 = (class175.field2661[var11] * this.field4702 >> 12) + var9;
                int var14 = -var10 + var12;
                int var15 = -var9 + var13;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var9;
                        var9 = var10;
                        int var18 = var13;
                        var10 = var17;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (var9 > var13) {
                        int var19 = var9;
                        var9 = var13;
                        var13 = var19;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var10;
                    int var22 = var12 - var10;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var23 = -var9 + var13;
                    int var24 = -var23 / 2;
                    int var25 = 1024 + -(class112.method726(4096, (byte) 90, var6) >> 2);
                    int var26 = 2048 / var23;
                    int var27 = ~var10 <= ~var12 ? -1 : 1;
                    for (int var28 = var9; ~var13 < ~var28; ++var28) {
                        var24 += var22;
                        int var29 = class53.field873 & var28;
                        int var30 = var25 + 1024 - -((-var9 + var28) * var26);
                        int var31 = class10.field133 & var21;
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 -= var23;
                        }
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (arg0 == -9) {
            ++field4701;
            class82.method546(-13376);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIIZ)V")
    public static final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (!arg8) {
            for (int var9 = 0; ~class293.field4610.field2734 < ~var9; ++var9) {
                if (class293.field4610.method1125(var9, !arg8)) {
                    int[] var10 = class39.field524.method1082(120, class293.field4610.field2739[var9] & 16383, (268427470 & class293.field4610.field2739[var9]) >> 14, class293.field4610.field2739[var9] >> 28 & 3);
                    if (var10 != null) {
                        int var11 = var10[1] - class119.field1798;
                        int var12 = arg7 - -((arg4 - arg7) * (-arg5 + var11) / (-arg5 + arg6));
                        int var13 = 16777215;
                        int var14 = class79.field1274 + -1 + -var10[2] + class99.field1564;
                        int var15 = (-arg0 + var14) * (-arg3 + arg1) / (-arg0 + arg2) + arg3;
                        class60 var16 = null;
                        int var17 = class293.field4610.method1128(3, var9);
                        if (var17 == 0) {
                            if ((double) class293.field4617 == 3.0D) {
                                var16 = class230.field3471;
                            }
                            if ((double) class293.field4617 == 4.0D) {
                                var16 = class166.field2556;
                            }
                            if ((double) class293.field4617 == 6.0D) {
                                var16 = class150.field2165;
                            }
                            if ((double) class293.field4617 >= 8.0D) {
                                var16 = class10.field138;
                            }
                        }
                        if (var17 == 1) {
                            if ((double) class293.field4617 == 3.0D) {
                                var16 = class150.field2165;
                            }
                            if ((double) class293.field4617 == 4.0D) {
                                var16 = class10.field138;
                            }
                            if ((double) class293.field4617 == 6.0D) {
                                var16 = class180.field2743;
                            }
                            if ((double) class293.field4617 >= 8.0D) {
                                var16 = class30.field437;
                            }
                        }
                        if (~var17 == -3) {
                            if ((double) class293.field4617 == 3.0D) {
                                var16 = class180.field2743;
                            }
                            if ((double) class293.field4617 == 4.0D) {
                                var16 = class30.field437;
                            }
                            if ((double) class293.field4617 == 6.0D) {
                                var16 = class93.field1478;
                            }
                            var13 = 16755200;
                            if ((double) class293.field4617 >= 8.0D) {
                                var16 = class173.field2638;
                            }
                        }
                        if (class293.field4610.field2747[var9] != -1) {
                            var13 = class293.field4610.field2747[var9];
                        }
                        if (var16 != null) {
                            int var18 = class91.field1435.method1030(class293.field4610.field2750[var9], (int[]) null, class81.field1308);
                            int var19 = var15 - var16.method396() * (var18 + -1) / 2;
                            int var20 = var19 + var16.method404() / 2;
                            for (int var21 = 0; var21 < var18; ++var21) {
                                String var22 = class81.field1308[var21];
                                if (~(var18 + -1) < ~var21) {
                                    var22 = var22.substring(0, -4 + var22.length());
                                }
                                var16.method397(var22, var12, var20, var13, true);
                                var20 += var16.method396();
                            }
                        }
                    }
                }
            }
            ++field4706;
        }
    }
}
