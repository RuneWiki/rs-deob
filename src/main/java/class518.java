import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class518 extends class17 {

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    private int field7617 = 204;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
    private int field7629 = 0;

    @OriginalMember(owner = "client!wn", name = "U", descriptor = "I")
    private int field7632 = 81;

    @OriginalMember(owner = "client!wn", name = "X", descriptor = "I")
    private int field7635 = 1024;

    @OriginalMember(owner = "client!wn", name = "T", descriptor = "I")
    private int field7631 = 4;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    private int field7625 = 8;

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
    private int field7626 = 1024;

    @OriginalMember(owner = "client!wn", name = "bb", descriptor = "I")
    private int field7639 = 409;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field7624 = 100;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
    private int field7621;

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
    private int field7627;

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!wn", name = "V", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!wn", name = "W", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!wn", name = "Z", descriptor = "I")
    private int field7637;

    @OriginalMember(owner = "client!wn", name = "Y", descriptor = "Lnt;")
    public static class151 field7636;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "Lvn;")
    public static class208 field7619;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "[I")
    private int[] field7622;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "[[B")
    public static byte[][] field7630;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "[[I")
    private int[][] field7623;

    @OriginalMember(owner = "client!wn", name = "ab", descriptor = "[[I")
    private int[][] field7638;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lmk;IIIIIIIZII)Z", line = 5)
    public static final boolean method3069(class40 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        ++field7633;
        int var11 = arg10;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = -var13 + arg10;
        if (arg8) {
            field7619 = null;
        }
        int var16 = -var14 + arg9;
        class316.field4592[var13][var14] = 99;
        class458.field6420[var13][var14] = 0;
        byte var17 = 0;
        class153.field2208[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class160.field2373[var10001] = arg9;
        int[][] var19 = arg0.field443;
        while (~var26 != ~var18) {
            var11 = class153.field2208[var18];
            var12 = class160.field2373[var18];
            var18 = 4095 & var18 + 1;
            int var20 = -var15 + var11;
            int var21 = -var16 + var12;
            int var22 = -arg0.field436 + var11;
            int var23 = -arg0.field447 + var12;
            if (~arg3 != 3) {
                if (~arg3 != 2) {
                    if (~arg3 != 1) {
                        if (~arg3 != 0) {
                            if (~arg3 != -1 && arg3 != 1 && ~arg3 != -3 && ~arg3 != -4 && ~arg3 != -10) {
                                if (arg0.method222(arg2, -87, arg1, arg7, arg3, 2, var11, var12)) {
                                    class144.field1905 = var11;
                                    class204.field2946 = var12;
                                    return true;
                                }
                            } else if (arg0.method220(var12, 2, arg3, arg2, arg1, 92, arg7, var11)) {
                                class204.field2946 = var12;
                                class144.field1905 = var11;
                                return true;
                            }
                        } else if (arg0.method225(arg4, 2, arg7, (byte) 67, arg1, var12, arg5, var11, arg6)) {
                            class204.field2946 = var12;
                            class144.field1905 = var11;
                            return true;
                        }
                    } else if (arg0.method232(var11, 2, arg7, -79, arg1, arg4, var12, 2, arg6, arg5)) {
                        class144.field1905 = var11;
                        class204.field2946 = var12;
                        return true;
                    }
                } else if (class510.method3047(arg6, 2, arg1, var11, arg7, arg4, 2, 34, var12)) {
                    class144.field1905 = var11;
                    class204.field2946 = var12;
                    return true;
                }
            } else if (arg7 == var11 && arg1 == var12) {
                class144.field1905 = var11;
                class204.field2946 = var12;
                return true;
            }
            int var25 = class458.field6420[var20][var21] - -1;
            if (~var20 < -1 && ~class316.field4592[var20 + -1][var21] == -1 && (1134821376 & var19[var22 + -1][var23]) == 0 && ~(1310982144 & var19[var22 + -1][var23 - -1]) == -1) {
                class153.field2208[var26] = var11 + -1;
                class160.field2373[var26] = var12;
                var26 = var26 + 1 & 4095;
                class316.field4592[var20 + -1][var21] = 2;
                class458.field6420[var20 + -1][var21] = var25;
            }
            if (~var20 > -127 && class316.field4592[var20 + 1][var21] == 0 && ~(1625554944 & var19[var22 - -2][var23]) == -1 && ~(var19[var22 + 2][var23 + 1] & 2015625216) == -1) {
                class153.field2208[var26] = var11 + 1;
                class160.field2373[var26] = var12;
                var26 = var26 + 1 & 4095;
                class316.field4592[var20 + 1][var21] = 8;
                class458.field6420[var20 - -1][var21] = var25;
            }
            if (~var21 < -1 && ~class316.field4592[var20][var21 + -1] == -1 && ~(1134821376 & var19[var22][var23 + -1]) == -1 && ~(1625554944 & var19[var22 + 1][var23 + -1]) == -1) {
                class153.field2208[var26] = var11;
                class160.field2373[var26] = var12 + -1;
                class316.field4592[var20][var21 + -1] = 1;
                var26 = var26 - -1 & 4095;
                class458.field6420[var20][var21 - 1] = var25;
            }
            if (~var21 > -127 && class316.field4592[var20][var21 + 1] == 0 && (1310982144 & var19[var22][var23 + 2]) == 0 && (2015625216 & var19[var22 + 1][var23 - -2]) == 0) {
                class153.field2208[var26] = var11;
                class160.field2373[var26] = var12 + 1;
                var26 = 4095 & var26 - -1;
                class316.field4592[var20][var21 - -1] = 4;
                class458.field6420[var20][var21 + 1] = var25;
            }
            if (~var20 < -1 && var21 > 0 && class316.field4592[var20 + -1][var21 + -1] == 0 && ~(var19[var22 + -1][var23] & 1336147968) == -1 && (1134821376 & var19[var22 + -1][var23 + -1]) == 0 && (1675886592 & var19[var22][var23 + -1]) == 0) {
                class153.field2208[var26] = var11 + -1;
                class160.field2373[var26] = var12 + -1;
                class316.field4592[var20 + -1][var21 - 1] = 3;
                var26 = 4095 & var26 + 1;
                class458.field6420[var20 + -1][var21 + -1] = var25;
            }
            if (var20 < 126 && var21 > 0 && ~class316.field4592[var20 + 1][var21 + -1] == -1 && (var19[var22 + 1][var23 + -1] & 1675886592) == 0 && (1625554944 & var19[var22 + 2][var23 + -1]) == 0 && (2028208128 & var19[var22 + 2][var23]) == 0) {
                class153.field2208[var26] = var11 + 1;
                class160.field2373[var26] = var12 - 1;
                var26 = var26 - -1 & 4095;
                class316.field4592[var20 - -1][var21 + -1] = 9;
                class458.field6420[var20 - -1][var21 + -1] = var25;
            }
            if (var20 > 0 && ~var21 > -127 && ~class316.field4592[var20 + -1][var21 - -1] == -1 && ~(1336147968 & var19[var22 + -1][var23 - -1]) == -1 && ~(var19[var22 + -1][var23 + 2] & 1310982144) == -1 && ~(var19[var22][var23 - -2] & 2116288512) == -1) {
                class153.field2208[var26] = var11 - 1;
                class160.field2373[var26] = var12 + 1;
                class316.field4592[var20 + -1][var21 - -1] = 6;
                var26 = 4095 & var26 - -1;
                class458.field6420[var20 - 1][var21 - -1] = var25;
            }
            if (~var20 > -127 && ~var21 > -127 && ~class316.field4592[var20 + 1][var21 + 1] == -1 && (var19[var22 + 1][var23 - -2] & 2116288512) == 0 && ~(2015625216 & var19[var22 + 2][var23 - -2]) == -1 && (2028208128 & var19[var22 + 2][var23 - -1]) == 0) {
                class153.field2208[var26] = var11 + 1;
                class160.field2373[var26] = var12 - -1;
                class316.field4592[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 4095;
                class458.field6420[var20 - -1][var21 + 1] = var25;
            }
        }
        class144.field1905 = var11;
        class204.field2946 = var12;
        return false;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)[I", line = 363)
    public final int[] method27(int arg0, int arg1) {
        ++field7620;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (arg1 <= 53) {
            field7619 = null;
        }
        if (super.field210.field6442) {
            int var4 = 0;
            int var5;
            for (var5 = class40.field427[arg0] + this.field7629; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field7625 && ~this.field7622[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field7622[var4];
            int var9 = this.field7622[var4 + -1];
            if (~var5 < ~(this.field7637 + var9) && var5 < -this.field7637 + var8) {
                for (int var10 = 0; class530.field7763 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field7626 : -this.field7626;
                    int var13;
                    for (var13 = (this.field7621 * var12 >> 12) + class492.field6966[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field7631 && var13 >= this.field7638[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field7638[var6][var11];
                    int var16 = this.field7638[var6][var14];
                    if (var13 > var16 - -this.field7637 && var15 - this.field7637 > var13) {
                        var3[var10] = this.field7623[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class182.method1137(var3, 0, class530.field7763, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lwm;II)V", line = 462)
    public final void method34(class403 arg0, int arg1, int arg2) {
        ++field7634;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 == 7) {
                                        this.field7635 = arg0.method2338(0);
                                    }
                                } else {
                                    this.field7632 = arg0.method2338(arg2 ^ 5159);
                                }
                            } else {
                                this.field7629 = arg0.method2338(0);
                            }
                        } else {
                            this.field7626 = arg0.method2338(arg2 ^ 5159);
                        }
                    } else {
                        this.field7617 = arg0.method2338(0);
                    }
                } else {
                    this.field7639 = arg0.method2338(0);
                }
            } else {
                this.field7625 = arg0.method2357((byte) 125);
            }
        } else {
            this.field7631 = arg0.method2357((byte) 112);
        }
        if (arg2 != 5159) {
            this.method3071((byte) 0);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V", line = 549)
    public static void method3070(boolean arg0) {
        field7630 = null;
        field7619 = null;
        field7636 = null;
        if (!arg0) {
            method3070(false);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 564)
    private final void method3071(byte arg0) {
        ++field7628;
        Random var2 = new Random((long) this.field7625);
        this.field7627 = 4096 / this.field7625;
        this.field7637 = this.field7632 / 2;
        this.field7621 = 4096 / this.field7631;
        int var3 = this.field7621 / 2;
        this.field7638 = new int[this.field7625][this.field7631 - -1];
        this.field7623 = new int[this.field7625][this.field7631];
        int var4 = this.field7627 / 2;
        this.field7622 = new int[this.field7625 + 1];
        this.field7622[0] = 0;
        if (arg0 > -98) {
            field7636 = null;
        }
        for (int var5 = 0; ~this.field7625 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field7627;
                int var7 = (-2048 + class119.method802(0, 4096, var2)) * this.field7617 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7622[var5] = this.field7622[var5 + -1] + var8;
            }
            this.field7638[var5][0] = 0;
            for (int var9 = 0; this.field7631 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field7621;
                    int var11 = (-2048 + class119.method802(0, 4096, var2)) * this.field7639 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7638[var5][var9] = this.field7638[var5][var9 + -1] + var12;
                }
                this.field7623[var5][var9] = this.field7635 > 0 ? 4096 + -class119.method802(0, this.field7635, var2) : 4096;
            }
            this.field7638[var5][this.field7631] = 4096;
        }
        this.field7622[this.field7625] = 4096;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V", line = 635)
    public class518() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V", line = 669)
    public final void method31(int arg0) {
        if (arg0 != -9) {
            this.method27(114, -68);
        }
        ++field7618;
        this.method3071((byte) -116);
    }
}
