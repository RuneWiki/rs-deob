import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class259 extends class264 {

    @OriginalMember(owner = "client!hn", name = "Q", descriptor = "Z")
    public static boolean field3692 = false;

    @OriginalMember(owner = "client!hn", name = "P", descriptor = "I")
    public static int field3691 = 0;

    @OriginalMember(owner = "client!hn", name = "T", descriptor = "[I")
    public static int[] field3695 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hn", name = "N", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!hn", name = "U", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)I")
    public static final int method1742(int arg0, int arg1) {
        if (arg1 != 4096) {
            return -58;
        } else {
            ++field3696;
            return 127 & arg0;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
    public class259() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 >= class295.field4153 && arg5 <= class103.field1457 && ~arg6 <= ~class444.field6338 && ~arg3 >= ~class151.field2091) {
            if (arg0 != 1) {
                class89.method756(arg5, arg4, arg3, -108, arg6, arg0, arg2);
            } else {
                class67.method633(arg2, arg5, arg3, arg4, (byte) -104, arg6);
            }
        } else if (arg0 != 1) {
            class157.method1125(119, arg3, arg0, arg5, arg6, arg2, arg4);
        } else {
            class2.method12(arg2, arg5, arg1 + -27, arg3, arg4, arg6);
        }
        ++field3693;
        if (arg1 != 1) {
            method1745(-13, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V")
    public static void method1744(int arg0) {
        if (arg0 <= -38) {
            field3695 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)V")
    public static final void method1745(int arg0, byte arg1) {
        ++field3697;
        if (~class342.field4721 != ~arg0) {
            class36.field388 = class68.field998 = class473.field6662[arg0];
            class374.field5152.method350(50, (int) ((double) class36.field388 * 34.46D));
            class154.field2133 = new int[class36.field388][class68.field998];
            class314.field4435 = new int[class36.field388][class68.field998];
            class4.field32 = new int[4][class36.field388 >> 3][class68.field998 >> 3];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class300.field4249[var2] = class311.method1984(class36.field388, -1, class68.field998);
            }
            if (arg1 != -68) {
                method1745(-35, (byte) 103);
            }
            class486.field6878 = new byte[4][class36.field388][class68.field998];
            class365.method2241(class68.field998, class36.field388, 4, 20);
            class389.method2358(class68.field998 >> 3, arg1 + 69, class36.field388 >> 3, class374.field5152);
            class342.field4721 = arg0;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(BI)[[I")
    public final int[][] method5(byte arg0, int arg1) {
        ++field3694;
        if (arg0 != 116) {
            field3692 = false;
        }
        int[][] var3 = super.field3816.method1928((byte) 82, arg1);
        if (super.field3816.field4208) {
            int[] var4 = this.method1788(arg1, (byte) -20, 2);
            int[][] var5 = this.method1782(arg1, (byte) 114, 0);
            int[][] var6 = this.method1782(arg1, (byte) 119, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class478.field6792 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 != 0) {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3690;
        if (arg1 != 21034) {
            this.method90(-118, -75);
        }
        int[] var3 = super.field3808.method958((byte) 86, arg0);
        if (super.field3808.field1732) {
            int[] var4 = this.method1788(arg0, (byte) -32, 0);
            int[] var5 = this.method1788(arg0, (byte) -14, 1);
            int[] var6 = this.method1788(arg0, (byte) -116, 2);
            for (int var7 = 0; ~class478.field6792 < ~var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field3794 = ~arg1.method1172((byte) 122) == -2;
        }
        ++field3689;
        if (arg0 < 31) {
            field3695 = null;
        }
    }
}
