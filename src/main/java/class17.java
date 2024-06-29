import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 extends class300 {

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    private int field238 = 0;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    private int field240 = 4096;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "S")
    public static short field230 = 32767;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "Z")
    public static boolean field234 = true;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "Ljava/lang/String;")
    public static String field232 = " from your ignore list first.";

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Lvl;")
    public static class73 field235;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "[I")
    public static int[] field231;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field4784 = arg0.method1218(-91) == 1;
                }
            } else {
                this.field240 = arg0.method1186((byte) -88);
            }
        } else {
            this.field238 = arg0.method1186((byte) -109);
        }
        if (arg1 > -43) {
            method100(false);
        }
        ++field239;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)I")
    public static final int method98(int arg0, int arg1) {
        if (arg0 != 255) {
            method100(true);
        }
        ++field236;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                int[] var4 = this.method2018(0, arg1 ^ 957953299, arg0);
                for (int var5 = 0; ~class180.field2826 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (~this.field238 >= ~var6) {
                        if (~var6 >= ~this.field240) {
                            var3[var5] = var6;
                        } else {
                            var3[var5] = this.field240;
                        }
                    } else {
                        var3[var5] = this.field238;
                    }
                }
            }
            ++field233;
            return var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class17() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static void method100(boolean arg0) {
        field231 = null;
        if (!arg0) {
            method100(false);
        }
        field232 = null;
        field235 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
    public static final int method101(int arg0, int arg1, int arg2, int arg3) {
        ++field237;
        int var4 = arg0 / arg2;
        int var5 = arg0 & arg2 + -1;
        int var6 = arg3 / arg2;
        int var7 = arg3 & arg2 + -1;
        int var8 = class112.method748(var6, -107, var4);
        int var9 = class112.method748(var6, arg1 + -44, var4 + 1);
        int var10 = class112.method748(var6 + 1, -45, var4);
        int var11 = class112.method748(arg1 + var6, -69, var4 - -1);
        int var12 = class96.method658(var8, var5, (byte) -124, var9, arg2);
        int var13 = class96.method658(var10, var5, (byte) 115, var11, arg2);
        return class96.method658(var12, var7, (byte) -36, var13, arg2);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field229;
        int var3 = -64 % (arg0 / 47);
        int[][] var4 = super.field4786.method538(arg1, (byte) -87);
        if (super.field4786.field1200) {
            int[][] var5 = this.method2021(arg1, false, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; ~var12 > ~class180.field2826; ++var12) {
                int var13 = var7[var12];
                int var14 = var6[var12];
                int var15 = var8[var12];
                if (~this.field238 >= ~var14) {
                    if (~var14 < ~this.field240) {
                        var9[var12] = this.field240;
                    } else {
                        var9[var12] = var14;
                    }
                } else {
                    var9[var12] = this.field238;
                }
                if (this.field238 > var13) {
                    var11[var12] = this.field238;
                } else if (~var13 >= ~this.field240) {
                    var11[var12] = var13;
                } else {
                    var11[var12] = this.field240;
                }
                if (var15 < this.field238) {
                    var10[var12] = this.field238;
                } else if (~var15 >= ~this.field240) {
                    var10[var12] = var15;
                } else {
                    var10[var12] = this.field240;
                }
            }
        }
        return var4;
    }
}
