import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class334 extends class666 {

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    private int field4318 = 1;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    private int field4320 = 1;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "Llt;")
    public static class617 field4314 = new class617(5000);

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)V")
    public static void method1878(int arg0) {
        field4314 = null;
        if (arg0 != -20781) {
            method1878(-124);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IC)Z")
    public static final boolean method1879(int arg0, char arg1) {
        int var2 = -101 / ((arg0 - 47) / 41);
        ++field4319;
        return ~arg1 <= -49 && arg1 <= '9';
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field4315;
        if (arg0 > -21) {
            this.field4320 = 35;
        }
        int[] var3 = super.field9466.method1811(arg1, 103);
        if (super.field9466.field4172) {
            int var4 = this.field4318 + this.field4318 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4320 + 1 + this.field4320;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field4318 + arg1; this.field4318 + arg1 >= var9; ++var9) {
                int[] var13 = this.method3739(0, -126, class515.field7357 & var9);
                int[] var14 = new int[class501.field7222];
                int var15 = 0;
                for (int var16 = -this.field4320; ~var16 >= ~this.field4320; ++var16) {
                    var15 += var13[var16 & class507.field7299];
                }
                int var17 = 0;
                while (var17 < class501.field7222) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class507.field7299 & -this.field4320 + var17];
                    ++var17;
                    var15 = var13[this.field4320 + var17 & class507.field7299] + var18;
                }
                var8[this.field4318 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; ~class501.field7222 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1251(int arg0, byte arg1) {
        ++field4317;
        int[][] var3 = super.field9471.method3639(36, arg0);
        if (arg1 != 98) {
            return null;
        } else {
            if (super.field9471.field9180) {
                int var4 = this.field4318 + 1 + this.field4318;
                int var5 = 65536 / var4;
                int var6 = this.field4320 - -this.field4320 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field4318 + arg0; this.field4318 + arg0 >= var9; ++var9) {
                    int[][] var19 = this.method3737(class515.field7357 & var9, 0, 3);
                    int[][] var20 = new int[3][class501.field7222];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field4320; ~this.field4320 <= ~var27; ++var27) {
                        int var37 = class507.field7299 & var27;
                        var23 += var26[var37];
                        var22 += var25[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (var31 < class501.field7222) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field4320 + var31 & class507.field7299;
                        ++var31;
                        int var33 = var22 - var25[var32];
                        int var34 = var21 - var24[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = this.field4320 + var31 & class507.field7299;
                        var21 = var24[var36] + var34;
                        var22 = var25[var36] + var33;
                        var23 = var26[var36] + var35;
                    }
                    var8[var9 - arg0 + this.field4318] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; var13 < class501.field7222; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                        var14 += var18[0][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field4316;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field9465 = arg1.method2541(42) == 1;
                }
            } else {
                this.field4318 = arg1.method2541(68);
            }
        } else {
            this.field4320 = arg1.method2541(122);
        }
        if (!arg2) {
            this.field4318 = -82;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILpi;)V")
    public static final void method1880(int arg0, class455 arg1) {
        if (arg0 != 14251) {
            method1880(11, (class455) null);
        }
        ++field4311;
        class282 var2 = (class282) class279.field3524.method3234((byte) -37, (long) arg1.field3784);
        if (var2 == null) {
            class67.method441(0, arg1.field3841[0], (class335) null, -73, arg1.field3839[0], arg1.field4638, arg1, (class625) null);
        } else {
            var2.method1613(true);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class334() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "(I)V")
    public static final void method1881(int arg0) {
        ++field4312;
        if (class496.field7165) {
            int var1 = 85 / ((-62 - arg0) / 49);
            while (true) {
                while (class350.field4584 < class520.field7448.length) {
                    class620 var2 = class520.field7448[class350.field4584];
                    if (var2 != null && ~var2.field8719 == 0) {
                        if (class536.field7661 == null) {
                            class536.field7661 = class472.field6592.method1068(var2.field8717, (byte) -35);
                        }
                        int var3 = class536.field7661.field5225;
                        if (var3 == -1) {
                            return;
                        }
                        ++class350.field4584;
                        var2.field8719 = var3;
                        class536.field7661 = null;
                    } else {
                        ++class350.field4584;
                    }
                }
                return;
            }
        }
    }
}
