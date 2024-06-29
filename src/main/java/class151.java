import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class151 extends class270 {

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field2315 = 127;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Ldp;")
    public static class174 field2309;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "Ldp;")
    public static class174 field2312;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "[[I")
    public static int[][] field2314;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIC)C", line = 3)
    public static final char method1164(int arg0, int arg1, char arg2) {
        ++field2311;
        if (arg0 != 221) {
            method1164(-119, -31, (char) 65531);
        }
        if (~arg2 <= -193 && arg2 <= 255) {
            if (arg2 >= 192 && ~arg2 >= -199) {
                return 'A';
            }
            if (~arg2 == -200) {
                return 'C';
            }
            if (arg2 >= 200 && ~arg2 >= -204) {
                return 'E';
            }
            if (arg2 >= 204 && arg2 <= 207) {
                return 'I';
            }
            if (arg2 == 209 && ~arg1 != -1) {
                return 'N';
            }
            if (~arg2 <= -211 && arg2 <= 214) {
                return 'O';
            }
            if (arg2 >= 217 && arg2 <= 220) {
                return 'U';
            }
            if (arg2 == 221) {
                return 'Y';
            }
            if (~arg2 == -224) {
                return 's';
            }
            if (~arg2 <= -225 && arg2 <= 230) {
                return 'a';
            }
            if (arg2 == 231) {
                return 'c';
            }
            if (~arg2 <= -233 && arg2 <= 235) {
                return 'e';
            }
            if (~arg2 <= -237 && arg2 <= 239) {
                return 'i';
            }
            if (arg2 == 241 && arg1 != 0) {
                return 'n';
            }
            if (~arg2 <= -243 && ~arg2 >= -247) {
                return 'o';
            }
            if (arg2 >= 249 && ~arg2 >= -253) {
                return 'u';
            }
            if (arg2 == 253 || ~arg2 == -256) {
                return 'y';
            }
        }
        if (arg2 == 338) {
            return 'O';
        } else if (~arg2 == -340) {
            return 'o';
        } else if (~arg2 == -377) {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 89)
    public static void method1165(int arg0) {
        field2309 = null;
        if (arg0 != -253) {
            method1167(79, 68, 106, -85);
        }
        field2312 = null;
        field2314 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[I", line = 104)
    public final int[] method81(byte arg0, int arg1) {
        ++field2305;
        int[] var3 = super.field4053.method396(arg1, 75);
        if (arg0 <= 26) {
            field2309 = null;
        }
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 0, arg1);
            int[] var5 = this.method1927(0, 1, arg1);
            int[] var6 = this.method1927(0, 2, arg1);
            for (int var7 = 0; class161.field2445 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)[[I", line = 159)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field2308;
        int[][] var3 = super.field4046.method244(arg1, 126);
        if (super.field4046.field488) {
            int[] var4 = this.method1927(0, 2, arg1);
            int[][] var5 = this.method1930(arg1, 0, (byte) -75);
            int[][] var6 = this.method1930(arg1, 1, (byte) -75);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class161.field2445 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 == -1) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                }
            }
        }
        if (!arg0) {
            this.method81((byte) 105, 93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIII)V", line = 240)
    public static final void method1166(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 101) {
            if (arg2 == 0) {
                ++class21.field311;
                class13.field216.method2781(false, 133);
            }
            ++field2313;
            if (arg2 == 1) {
                class13.field216.method2781(false, 55);
                ++class12.field210;
            }
            class13.field216.method319(class294.field4362 + arg1, (byte) -78);
            class13.field216.method319(class379.field5384 + arg3, (byte) -107);
            class13.field216.method318(class33.field482[82] ? 1 : 0, (byte) -98);
            class420.field6129 = false;
            class161.field2434 = arg3;
            class11.field136 = arg1;
            class200.method1520(-277309434);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 271)
    public class151() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLec;I)V", line = 279)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field4055 = arg1.method271((byte) 112) == 1;
        }
        if (arg0 != 108) {
            field2312 = null;
        }
        ++field2304;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V", line = 295)
    public static final void method1167(int arg0, int arg1, int arg2, int arg3) {
        ++field2307;
        class283 var4 = class221.field3296[arg2][arg0];
        class285.method2013(false, arg1, var4 == null ? class211.field3146 : var4);
        if (arg3 != -4097) {
            method1166((byte) -8, 110, -109, -48);
        }
    }
}
