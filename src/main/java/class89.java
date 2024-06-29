import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class89 {

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "J")
    public long field1335 = 0L;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "Lma;")
    public static class5 field1333 = class12.method119("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", (byte) 114);

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lma;")
    public static class5 field1338 = class12.method119("<img=0>", (byte) 83);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field1339;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lkb;")
    public class280 field1326;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lkb;")
    public class280 field1337;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[Lma;")
    public static class5[] field1328;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method583(int arg0, byte arg1) {
        if (arg1 == 100) {
            field1329++;
            class249.field4123.method517(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIIBI)V", line = 20)
    public static final void method584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        field1334++;
        int var11 = arg2 - arg7;
        if (class139.field2066 > arg2) {
            var11++;
        }
        int var12 = arg0 - arg3;
        if (class97.field1460 > arg0) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg10 * var13 + arg4 >> 16;
            int var15 = (var13 + 1) * arg10 + arg4 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg7 + var13 >> 6;
                if (var17 >= 0 && (class248.field4102.length - 1) >= var17) {
                    int var18 = arg5 + var14;
                    int var19 = arg5 + var15;
                    int[][] var20 = class248.field4102[var17];
                    byte[][] var21 = class170.field2614[var17];
                    byte[][] var22 = class289.field4912[var17];
                    byte[][] var23 = class267.field4594[var17];
                    byte[][] var24 = class230.field3825[var17];
                    byte[][] var25 = class276.field4707[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg6 * var26 + arg8 >> 16;
                        int var28 = (var26 + 1) * arg6 + arg8 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg1 + var28;
                            int var31 = arg1 + var27;
                            int var32 = var26 + arg3 >> 6;
                            int var33 = var13 + arg7 & 0x3F;
                            int var34 = arg3 + var26 & 0x3F;
                            int var35 = (var34 << 6) + var33;
                            int var36;
                            if (var32 < 0 || (var20.length - 1) < var32 || var20[var32] == null) {
                                if (class283.field4799.field1485 != -1) {
                                    var36 = class283.field4799.field1485;
                                } else if ((arg3 + var26 & 0x4) == (arg7 + var13 & 0x4)) {
                                    var36 = class43.field650[class210.field3337 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || var32 > (var20.length - 1)) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class191.method1251(var18, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var32][var35];
                            }
                            int var37 = var23[var32] == null ? 0 : class43.field650[var23[var32][var35] & 0xFF];
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var38 = var21[var32] == null ? 0 : class43.field650[var21[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class191.method1251(var18, var31, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var32] == null ? 0 : var22[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class191.method1251(var18, var31, var16, var29, var37);
                                    } else {
                                        class255.method1782(var40 >> 2, var36, var16, class191.field2981, var18, var29, var31, var39 & 0x3, var37, true, (byte) 47);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var25[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class191.method1251(var18, var31, var16, var29, var38);
                                    }
                                    class255.method1782(var42 >> 2, 0, var16, class191.field2981, var18, var29, var31, var41 & 0x3, var38, var37 == 0, (byte) 47);
                                }
                            }
                            if (var24[var32] != null) {
                                int var43 = var24[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var31;
                                    } else {
                                        var45 = var30 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var46 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class191.method1257(var18, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class191.method1248(var18, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class191.method1257(var44, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class191.method1248(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class191.method1257(var18, var31, var29, 16777215);
                                        class191.method1248(var18, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class191.method1257(var44, var31, var29, 16777215);
                                        class191.method1248(var18, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class191.method1257(var44, var31, var29, 16777215);
                                        class191.method1248(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class191.method1257(var18, var31, var29, 16777215);
                                        class191.method1248(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class191.method1248(var18, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class191.method1248(var44, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class191.method1248(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class191.method1248(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class191.method1248(var18 + var48, -var48 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class191.method1248(var18 + var47, var31 + var47, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg5 + var15;
                    int var50 = arg5 + var14;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class283.field4799.field1485 != -1) {
                            var52 = class283.field4799.field1485;
                        } else if ((arg3 + var51 & 0x4) == (arg7 + var13 & 0x4)) {
                            var52 = class43.field650[class210.field3337 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        int var53 = (arg6 * var51 + arg8 >> 16) + arg1;
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var54 = ((var51 + 1) * arg6 + arg8 >> 16) + arg1;
                        int var55 = var54 - var53;
                        class191.method1251(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        int var56 = -87 % ((arg9 - 19) / 52);
        for (int var57 = -2; var57 < var11 + 2; var57++) {
            int var58 = arg4 + (arg10 * var57) >> 16;
            int var59 = arg4 + ((var57 + 1) * arg10) >> 16;
            int var60 = var59 - var58;
            if (var60 > 0) {
                int var61 = arg5 + var58;
                int var62 = var57 + arg7 >> 6;
                var10000 = arg5 + var59;
                if (var62 >= 0 && (class141.field2076.length - 1) >= var62) {
                    short[][] var64 = class141.field2076[var62];
                    for (int var65 = -2; var65 < var12 + 2; var65++) {
                        int var66 = (var65 + 1) * arg6 + arg8 >> 16;
                        int var67 = arg8 + (arg6 * var65) >> 16;
                        int var68 = var66 - var67;
                        if (var68 > 0) {
                            int var69 = arg1 + var67;
                            int var70 = arg3 + var65 >> 6;
                            var10000 = arg1 + var66;
                            if (var70 >= 0 && var70 <= (var64.length - 1)) {
                                int var72 = ((var65 + arg3 & 0x3F) << 6) + (arg7 + var57 & 0x3F);
                                if (var64[var70] != null) {
                                    int var73 = var64[var70][var72] & 0x3FFF;
                                    int var74 = (var64[var70][var72] & 0xCECF) >> 14;
                                    if (var73 != 0) {
                                        if (var74 == 0) {
                                            class190.field2965[var73 - 1].method1158(var61, var69, var60 * 2, var68 * 2);
                                        } else if (var74 == 1) {
                                            class76.field1184[var73 - 1].method1158(var61, var69, var60 * 2, var68 * 2);
                                        } else if (var74 == 2) {
                                            class93.field1418[var73 - 1].method1158(var61, var69, var60 * 2, var68 * 2);
                                        } else if (var74 == 3) {
                                            class204.field3271[var73 - 1].method1158(var61, var69, var60 * 2, var68 * 2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I", line = 421)
    public static final int method585(int arg0, int arg1) {
        field1327++;
        if (arg0 != 26918) {
            method583(-102, (byte) -34);
        }
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILii;Lma;)I", line = 474)
    public static final int method586(int arg0, class221 arg1, class5 arg2) {
        int var3 = 12 % ((-arg0 - 12) / 54);
        int var4 = arg1.field3610;
        arg1.method1536(arg2.field72, (byte) -47);
        arg1.field3610 += class284.field4806.method1112(true, arg2.field72, arg1.field3610, arg1.field3617, 0, arg2.field57);
        field1336++;
        return arg1.field3610 - var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V", line = 496)
    public static final void method587() {
        for (int var0 = 0; var0 < class194.field3029; var0++) {
            class107 var1 = class111.field1650[var0];
            method588(var1);
            class111.field1650[var0] = null;
        }
        class194.field3029 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lkg;)V", line = 511)
    public static final void method588(class107 arg0) {
        for (int var1 = arg0.field1597; var1 <= arg0.field1587; var1++) {
            for (int var2 = arg0.field1595; var2 <= arg0.field1598; var2++) {
                class198 var3 = class43.field646[arg0.field1596][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3162; var4++) {
                        if (var3.field3166[var4] == arg0) {
                            var3.field3162--;
                            for (int var5 = var4; var5 < var3.field3162; var5++) {
                                var3.field3166[var5] = var3.field3166[var5 + 1];
                                var3.field3146[var5] = var3.field3146[var5 + 1];
                            }
                            var3.field3166[var3.field3162] = null;
                            break;
                        }
                    }
                    var3.field3168 = 0;
                    for (int var6 = 0; var6 < var3.field3162; var6++) {
                        var3.field3168 |= var3.field3146[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V", line = 572)
    public static void method589(byte arg0) {
        field1333 = null;
        int var1 = -57 / ((arg0 + 36) / 60);
        field1328 = null;
        field1338 = null;
    }
}
