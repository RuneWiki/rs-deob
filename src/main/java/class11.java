import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends class143 {

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lvj;")
    public static class115 field153 = new class115();

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field156 = 1;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field159 = -1;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "J")
    public static long field158 = 0L;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lrj;")
    public static final class8 method80(int arg0, int arg1) {
        field154++;
        if (arg0 == 0) {
            return new class51();
        } else if (arg0 == 1) {
            return new class190();
        } else if (arg0 == 2) {
            return new class43();
        } else if (arg0 == 3) {
            return new class14();
        } else if (arg0 == 4) {
            return new class86();
        } else if (arg0 == 5) {
            return new class121();
        } else if (arg0 == 6) {
            return new class50();
        } else if (arg0 == 7) {
            return new class101();
        } else if (arg0 == 8) {
            return new class113();
        } else if (arg0 == 9) {
            return new class223();
        } else if (arg0 == 10) {
            return new class211();
        } else if (arg0 == 11) {
            return new class177();
        } else if (arg0 == 12) {
            return new class199();
        } else if (arg0 == 13) {
            return new class5();
        } else if (arg0 == 14) {
            return new class144();
        } else if (arg0 == 15) {
            return new class212();
        } else if (arg0 == 16) {
            return new class145();
        } else if (arg0 == 17) {
            return new class92();
        } else if (arg0 == 18) {
            return new class122();
        } else if (arg0 == 19) {
            return new class56();
        } else if (arg0 == 20) {
            return new class77();
        } else if (arg0 == 21) {
            return new class90();
        } else if (arg0 == 22) {
            return new class28();
        } else if (arg0 == 23) {
            return new class167();
        } else if (arg0 == 24) {
            return new class219();
        } else if (arg0 == 25) {
            return new class119();
        } else if (arg0 == 26) {
            return new class109();
        } else if (arg0 == 27) {
            return new class94();
        } else if (arg0 == 28) {
            return new class82();
        } else if (arg0 == 29) {
            return new class193();
        } else if (arg0 == 30) {
            return new class25();
        } else if (arg0 == 31) {
            return new class286();
        } else if (arg0 == 32) {
            return new class214();
        } else if (arg0 == 33) {
            return new class23();
        } else if (arg0 == 34) {
            return new class9();
        } else if (arg0 == 35) {
            return new class164();
        } else if (arg0 == 36) {
            return new class206();
        } else if (arg0 == 37) {
            return new class197();
        } else if (arg0 == 38) {
            return new class216();
        } else if (arg0 == 39) {
            return new class17();
        } else {
            if (arg1 != -22172) {
                field157 = -85;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIIIIIIII)V")
    public static final void method81(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg6 - arg3;
        if (arg6 < class1.field17) {
            var11++;
        }
        int var12 = arg0 - arg8;
        if (arg0 < class210.field3428) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var40 = arg5 * var13 + arg10 >> 16;
            int var41 = (var13 + 1) * arg5 + arg10 >> 16;
            int var42 = var41 - var40;
            if (var42 > 0) {
                int var43 = var13 + arg3 >> 6;
                if (var43 >= 0 && class118.field1938.length - 1 >= var43) {
                    int var44 = arg9 + var40;
                    int var45 = arg9 + var41;
                    int[][] var46 = class118.field1938[var43];
                    byte[][] var47 = class273.field4306[var43];
                    byte[][] var48 = class102.field1672[var43];
                    byte[][] var49 = class195.field3115[var43];
                    byte[][] var50 = class196.field3131[var43];
                    byte[][] var51 = class119.field1948[var43];
                    for (int var52 = 0; var52 < var12; var52++) {
                        int var53 = arg1 + ((var52 + 1) * arg4) >> 16;
                        int var54 = arg4 * var52 + arg1 >> 16;
                        int var55 = var53 - var54;
                        if (var55 > 0) {
                            int var56 = arg7 + var53;
                            int var57 = arg8 + var52 & 0x3F;
                            int var58 = arg7 + var54;
                            int var59 = arg8 + var52 >> 6;
                            int var60 = var13 + arg3 & 0x3F;
                            int var61 = (var57 << 6) + var60;
                            int var62;
                            if (var59 < 0 || (var46.length - 1) < var59 || var46[var59] == null) {
                                if (class142.field2296.field932 != -1) {
                                    var62 = class142.field2296.field932;
                                } else if ((arg3 + var13 & 0x4) == (arg8 + var52 & 0x4)) {
                                    var62 = class7.field90[class216.field3529 + 1];
                                } else {
                                    var62 = 4936552;
                                }
                                if (var59 < 0 || var46.length - 1 < var59) {
                                    if (var62 == 0) {
                                        var62 = 1;
                                    }
                                    class2.method25(var44, var58, var42, var55, var62);
                                    continue;
                                }
                            } else {
                                var62 = var46[var59][var61];
                            }
                            int var63 = var47[var59] == null ? 0 : class7.field90[var47[var59][var61] & 0xFF];
                            if (var62 == 0) {
                                var62 = 1;
                            }
                            int var64 = var49[var59] == null ? 0 : class7.field90[var49[var59][var61] & 0xFF];
                            if (var63 == 0 && var64 == 0) {
                                class2.method25(var44, var58, var42, var55, var62);
                            } else {
                                if (var63 != 0) {
                                    byte var65 = var48[var59] == null ? 0 : var48[var59][var61];
                                    if (var63 == -1) {
                                        var63 = 1;
                                    }
                                    int var66 = var65 & 0xFC;
                                    if (var66 == 0 || var42 <= 1 || var55 <= 1) {
                                        class2.method25(var44, var58, var42, var55, var63);
                                    } else {
                                        class115.method856(var58, true, var44, var65 & 0x3, class2.field34, var66 >> 2, var63, var62, 2, var55, var42);
                                    }
                                }
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = var62;
                                    }
                                    byte var67 = var50[var59][var61];
                                    int var68 = var67 & 0xFC;
                                    if (var68 == 0 || var42 <= 1 || var55 <= 1) {
                                        class2.method25(var44, var58, var42, var55, var64);
                                    }
                                    class115.method856(var58, var63 == 0, var44, var67 & 0x3, class2.field34, var68 >> 2, var64, 0, 2, var55, var42);
                                }
                            }
                            if (var51[var59] != null) {
                                int var69 = var51[var59][var61] & 0xFF;
                                if (var69 != 0) {
                                    int var70;
                                    if (var55 == 1) {
                                        var70 = var58;
                                    } else {
                                        var70 = var56 - 1;
                                    }
                                    int var71;
                                    if (var42 == 1) {
                                        var71 = var44;
                                    } else {
                                        var71 = var45 - 1;
                                    }
                                    int var72 = 13421772;
                                    if (var69 >= 5 && var69 <= 8 || var69 >= 13 && var69 <= 16 || var69 >= 21 && var69 <= 24 || var69 == 27 || var69 == 28) {
                                        var72 = 13369344;
                                        var69 -= 4;
                                    }
                                    if (var69 == 1) {
                                        class2.method16(var44, var58, var55, var72);
                                    } else if (var69 == 2) {
                                        class2.method35(var44, var58, var42, var72);
                                    } else if (var69 == 3) {
                                        class2.method16(var71, var58, var55, var72);
                                    } else if (var69 == 4) {
                                        class2.method35(var44, var70, var42, var72);
                                    } else if (var69 == 9) {
                                        class2.method16(var44, var58, var55, 16777215);
                                        class2.method35(var44, var58, var42, var72);
                                    } else if (var69 == 10) {
                                        class2.method16(var71, var58, var55, 16777215);
                                        class2.method35(var44, var58, var42, var72);
                                    } else if (var69 == 11) {
                                        class2.method16(var71, var58, var55, 16777215);
                                        class2.method35(var44, var70, var42, var72);
                                    } else if (var69 == 12) {
                                        class2.method16(var44, var58, var55, 16777215);
                                        class2.method35(var44, var70, var42, var72);
                                    } else if (var69 == 17) {
                                        class2.method35(var44, var58, 1, var72);
                                    } else if (var69 == 18) {
                                        class2.method35(var71, var58, 1, var72);
                                    } else if (var69 == 19) {
                                        class2.method35(var71, var70, 1, var72);
                                    } else if (var69 == 20) {
                                        class2.method35(var44, var70, 1, var72);
                                    } else if (var69 == 25) {
                                        for (int var74 = 0; var74 < var55; var74++) {
                                            class2.method35(var44 + var74, var70 - var74, 1, var72);
                                        }
                                    } else if (var69 == 26) {
                                        for (int var73 = 0; var73 < var55; var73++) {
                                            class2.method35(var44 + var73, var58 - -var73, 1, var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var75 = arg9 + var40;
                    var10000 = arg9 + var41;
                    for (int var77 = 0; var77 < var12; var77++) {
                        int var78;
                        if (class142.field2296.field932 != -1) {
                            var78 = class142.field2296.field932;
                        } else if ((var13 + arg3 & 0x4) == (var77 + arg8 & 0x4)) {
                            var78 = class7.field90[class216.field3529 + 1];
                        } else {
                            var78 = 4936552;
                        }
                        int var79 = (arg1 + ((var77 + 1) * arg4) >> 16) + arg7;
                        int var80 = (arg4 * var77 + arg1 >> 16) + arg7;
                        int var81 = var79 - var80;
                        if (var78 == 0) {
                            var78 = 1;
                        }
                        class2.method25(var75, var80, var42, var81, var78);
                    }
                }
            }
        }
        if (arg2) {
            return;
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg5 * var14 + arg10 >> 16;
            int var16 = arg10 + ((var14 + 1) * arg5) >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg9 + var15;
                int var19 = arg3 + var14 >> 6;
                var10000 = arg9 + var16;
                if (var19 >= 0 && var19 <= class95.field1559.length - 1) {
                    int[][] var21 = class95.field1559[var19];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg1 + (arg4 * var22) >> 16;
                        int var24 = (var22 + 1) * arg4 + arg1 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg7 + var24;
                            int var27 = arg7 + var23;
                            int var28 = var22 + arg8 >> 6;
                            if (var28 >= 0 && (var21.length - 1) >= var28) {
                                int var29 = (arg8 + var22 & 0x3F << 6) + (var14 + arg3 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x3FFF;
                                    if (var31 != 0) {
                                        int var32 = (var30 & 0xCA8C) >> 14;
                                        class227 var33 = class244.method1681(19, var31 - 1);
                                        class243 var34 = var33.method1599(var32, 98);
                                        if (var34 != null) {
                                            int var35 = var34.field3744 * var17 / 4;
                                            int var36 = var34.field3740 * var25 / 4;
                                            if (var33.field3760) {
                                                int var37 = (var30 & 0xFA625) >> 16;
                                                int var38 = (var30 & 0xFDE95C) >> 20;
                                                if ((var32 & 0x1) == 1) {
                                                    int var39 = var37;
                                                    var37 = var38;
                                                    var38 = var39;
                                                }
                                                var36 = var25 * var38;
                                                var35 = var17 * var37;
                                            }
                                            if (var35 != 0 && var36 != 0) {
                                                if (var33.field3752 == 0) {
                                                    var34.method1670(var18, var27 + var25 - var36, var35, var36);
                                                } else {
                                                    var34.method1672(var18, var27 + var25 - var36, var35, var36, var33.field3752);
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
        }
        field152++;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static void method82(int arg0) {
        field153 = null;
        if (arg0 != -2) {
            method80(-113, 71);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILf;Z)V")
    public static final void method83(int arg0, int arg1, int arg2, class36 arg3, boolean arg4) {
        field155++;
        class254.method1730(-55);
        if (arg4) {
            return;
        }
        class2.method28(arg0, arg1, arg3.field642 + arg0, arg3.field676 + arg1);
        if (class260.field4133 == 2 || class260.field4133 == 5 || class152.field2459 == null) {
            class2.method19(arg0, arg1, 0, arg3.field681, arg3.field553);
        } else {
            int var5 = class122.field1985 + class120.field1956 & 0x7FF;
            int var6 = class167.field2655.field3389 / 32 + 48;
            int var7 = 464 - (class167.field2655.field3341 / 32);
            ((class37) class152.field2459).method312(arg0, arg1, arg3.field642, arg3.field676, var6, var7, var5, class87.field1385 + 256, arg3.field681, arg3.field553);
            if (class111.field1834 != null) {
                for (int var8 = 0; var8 < class111.field1834.field275; var8++) {
                    if (class111.field1834.method130(var8, 4)) {
                        int var9 = (class111.field1834.field264[var8] - class214.field3501) * 4 + 2 - (class167.field2655.field3341 / 32);
                        int var10 = (class111.field1834.field276[var8] - class50.field884) * 4 + 2 - (class167.field2655.field3389 / 32);
                        int var11 = class69.field1147[var5];
                        int var12 = var11 * 256 / (class87.field1385 + 256);
                        int var13 = class69.field1137[var5];
                        int var14 = var13 * 256 / (class87.field1385 + 256);
                        int var15 = var9 * var14 - (var10 * var12) >> 16;
                        class269 var16 = class158.field2555;
                        int var17 = var9 * var12 + var10 * var14 >> 16;
                        if (class111.field1834.method124((byte) -71, var8) == 1) {
                            var16 = class184.field2892;
                        }
                        if (class111.field1834.method124((byte) -105, var8) == 2) {
                            var16 = class262.field4165;
                        }
                        int var18 = var16.method1814(class111.field1834.field266[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (-arg3.field642 <= var19 && arg3.field642 >= var19 && -arg3.field676 <= var15 && arg3.field676 >= var15) {
                            int var20 = 16777215;
                            if (class111.field1834.field278[var8] != -1) {
                                var20 = class111.field1834.field278[var8];
                            }
                            class2.method33(arg3.field681, arg3.field553);
                            var16.method1798(class111.field1834.field266[var8], arg3.field642 / 2 + (var19 + arg0), arg3.field676 / 2 + arg1 + -var15, var18, 50, var20, 0, 256, 1, 0, 0);
                            class2.method29();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class75.field1213; var21++) {
                int var56 = class224.field3714[var21] * 4 + 2 - (class167.field2655.field3389 / 32);
                int var57 = class51.field898[var21] * 4 + 2 - class167.field2655.field3341 / 32;
                class135 var58 = class209.method1447(class71.field1166[var21], -6653);
                if (var58.field2209 != null) {
                    var58 = var58.method953(63);
                    if (var58 == null || var58.field2187 == -1) {
                        continue;
                    }
                }
                class101.method745((byte) -2, arg1, var56, class127.field2051[var58.field2187], arg0, var57, arg3);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class115 var53 = class67.field1104[class250.field3980][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 - (class167.field2655.field3389 / 32 - 2);
                        int var55 = var52 * 4 + 2 - (class167.field2655.field3341 / 32);
                        class101.method745((byte) -2, arg1, var54, class221.field3631[0], arg0, var55, arg3);
                    }
                }
            }
            for (int var23 = 0; var23 < class141.field2287; var23++) {
                class15 var48 = class137.field2260[class221.field3648[var23]];
                if (var48 != null && var48.method118((byte) 125)) {
                    class107 var49 = var48.field258;
                    if (var49 != null && var49.field1716 != null) {
                        var49 = var49.method775(arg4);
                    }
                    if (var49 != null && var49.field1753 && var49.field1773) {
                        int var50 = var48.field3341 / 32 - (class167.field2655.field3341 / 32);
                        int var51 = var48.field3389 / 32 - (class167.field2655.field3389 / 32);
                        if (var49.field1763 == -1) {
                            class101.method745((byte) -2, arg1, var51, class221.field3631[1], arg0, var50, arg3);
                        } else {
                            class101.method745((byte) -2, arg1, var51, class127.field2051[var49.field1763], arg0, var50, arg3);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class155.field2514; var24++) {
                class33 var38 = class35.field548[class57.field973[var24]];
                if (var38 != null && var38.method118((byte) 125)) {
                    int var39 = var38.field3389 / 32 - (class167.field2655.field3389 / 32);
                    int var40 = var38.field3341 / 32 - (class167.field2655.field3341 / 32);
                    long var41 = class74.method522((byte) -83, var38.field525);
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class239.field3875; var44++) {
                        if (class60.field992[var44] == var41 && class141.field2288[var44] != 0) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class206.field3301; var46++) {
                        if (class110.field1819[var46].field3247 == var41) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class167.field2655.field505 != 0 && var38.field505 != 0 && class167.field2655.field505 == var38.field505) {
                        var47 = true;
                    }
                    if (var43) {
                        class101.method745((byte) -2, arg1, var39, class221.field3631[3], arg0, var40, arg3);
                    } else if (var45) {
                        class101.method745((byte) -2, arg1, var39, class221.field3631[5], arg0, var40, arg3);
                    } else if (var47) {
                        class101.method745((byte) -2, arg1, var39, class221.field3631[4], arg0, var40, arg3);
                    } else {
                        class101.method745((byte) -2, arg1, var39, class221.field3631[2], arg0, var40, arg3);
                    }
                }
            }
            class60[] var25 = class156.field2539;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class60 var29 = var25[var26];
                if (var29 != null && var29.field981 != 0 && (class222.field3682 % 20) < 10) {
                    if (var29.field981 == 1 && var29.field994 >= 0 && var29.field994 < class137.field2260.length) {
                        class15 var30 = class137.field2260[var29.field994];
                        if (var30 != null) {
                            int var31 = var30.field3389 / 32 - (class167.field2655.field3389 / 32);
                            int var32 = var30.field3341 / 32 - class167.field2655.field3341 / 32;
                            class92.method691(var29.field988, var32, arg1, arg3, arg0, 256, var31);
                        }
                    }
                    if (var29.field981 == 2) {
                        int var33 = (var29.field996 - class50.field884) * 4 + 2 - (class167.field2655.field3389 / 32);
                        int var34 = (var29.field987 - class214.field3501) * 4 + 2 - (class167.field2655.field3341 / 32);
                        class92.method691(var29.field988, var34, arg1, arg3, arg0, 256, var33);
                    }
                    if (var29.field981 == 10 && var29.field994 >= 0 && var29.field994 < class35.field548.length) {
                        class33 var35 = class35.field548[var29.field994];
                        if (var35 != null) {
                            int var36 = var35.field3389 / 32 - (class167.field2655.field3389 / 32);
                            int var37 = var35.field3341 / 32 - (class167.field2655.field3341 / 32);
                            class92.method691(var29.field988, var37, arg1, arg3, arg0, 256, var36);
                        }
                    }
                }
            }
            if (class76.field1228 != 0) {
                int var27 = class76.field1228 * 4 + 2 - (class167.field2655.field3389 / 32);
                int var28 = class235.field3837 * 4 + 2 - class167.field2655.field3341 / 32;
                class101.method745((byte) -2, arg1, var27, class43.field793, arg0, var28, arg3);
            }
            class2.method25(arg3.field642 / 2 + arg0 - 1, arg3.field676 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        class223.field3698[arg2] = true;
    }
}
