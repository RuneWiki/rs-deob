import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class119 extends class84 {

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    private int field1718 = 4096;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field1725 = 0;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Lcc;")
    public static class216 field1719 = new class216(50);

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field1724 = 0;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field1726 = 0;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "[I")
    public static int[] field1727 = new int[1000];

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "Lai;")
    public static class88 field1723;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIB)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field1720;
        int var6 = arg1 * arg1;
        int var7 = arg3 * arg3;
        int var8 = arg3;
        int var9 = 0;
        int var10 = var7 << 1;
        if (arg5 == 127) {
            int var11 = var6 << 1;
            int var12 = arg3 << 1;
            int var13 = (-var12 + 1) * var6 + var10;
            int var14 = -((var12 + -1) * var11) + var7;
            int var15 = var6 << 2;
            int var16 = var7 << 2;
            int var17 = (arg3 + -1) * var15;
            if (arg2 >= class207.field3328 && ~arg2 >= ~class228.field3657) {
                int var18 = class281.method1924(false, class211.field3386, class272.field4374, arg0 + arg1);
                int var19 = class281.method1924(false, class211.field3386, class272.field4374, -arg1 + arg0);
                class177.method1330(class240.field3831[arg2], var19, arg4, 32232, var18);
            }
            int var20 = ((var9 << 1) + 3) * var10;
            int var21 = (var9 - -1) * var16;
            int var22 = ((arg3 << 1) + -3) * var11;
            while (~var8 < -1) {
                --var8;
                int var23 = -var8 + arg2;
                if (var13 < 0) {
                    while (~var13 > -1) {
                        var13 += var20;
                        var20 += var16;
                        var14 += var21;
                        var21 += var16;
                        ++var9;
                    }
                }
                int var24 = arg2 + var8;
                if (var14 < 0) {
                    var13 += var20;
                    ++var9;
                    var20 += var16;
                    var14 += var21;
                    var21 += var16;
                }
                var14 += -var22;
                var13 += -var17;
                var22 -= var15;
                var17 -= var15;
                if (~var24 <= ~class207.field3328 && var23 <= class228.field3657) {
                    int var25 = class281.method1924(false, class211.field3386, class272.field4374, arg0 - -var9);
                    int var26 = class281.method1924(false, class211.field3386, class272.field4374, -var9 + arg0);
                    if (~var23 <= ~class207.field3328) {
                        class177.method1330(class240.field3831[var23], var26, arg4, 32232, var25);
                    }
                    if (~class228.field3657 <= ~var24) {
                        class177.method1330(class240.field3831[var24], var26, arg4, arg5 ^ 32151, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field1717;
        if (arg1 != -18) {
            this.field1718 = -26;
        }
        int[][] var3 = super.field1211.method193((byte) -127, arg0);
        if (super.field1211.field321) {
            int[][] var4 = this.method611(0, (byte) -84, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class20.field221; ++var11) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (this.field1725 > var12) {
                    var8[var11] = this.field1725;
                } else if (~var12 < ~this.field1718) {
                    var8[var11] = this.field1718;
                } else {
                    var8[var11] = var12;
                }
                if (~this.field1725 < ~var13) {
                    var9[var11] = this.field1725;
                } else if (this.field1718 >= var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field1718;
                }
                if (var14 >= this.field1725) {
                    if (~var14 >= ~this.field1718) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field1718;
                    }
                } else {
                    var10[var11] = this.field1725;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static void method872(byte arg0) {
        field1719 = null;
        field1723 = null;
        if (arg0 >= 85) {
            field1727 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1217 = ~arg0.method1111(255) == -2;
                }
            } else {
                this.field1718 = arg0.method1126(false);
            }
        } else {
            this.field1725 = arg0.method1126(false);
        }
        if (arg1 <= 87) {
            method872((byte) 47);
        }
        ++field1722;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        ++field1721;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, arg1, false);
            for (int var5 = 0; ~class20.field221 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field1725) {
                    if (~var6 < ~this.field1718) {
                        var3[var5] = this.field1718;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field1725;
                }
            }
        }
        if (arg0 >= -125) {
            field1724 = 54;
        }
        return var3;
    }
}
