import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class19 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/lang/String;")
    public static String field294 = "Connected to update server";

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lbf;IIIII)V")
    public static final void method166(class205 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class179.field2680 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class113.field1777) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class191.field3032 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class23 var14 = class255.field3907[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class68.field1079[var11][var12 + 1][var13] + class68.field1079[var11][var12][var13] + class68.field1079[var11][var12][var13 + 1] + class68.field1079[var11][var12 + 1][var13 + 1]) / 4 - (class68.field1079[arg1][arg2 + 1][arg3] + class68.field1079[arg1][arg2][arg3] + class68.field1079[arg1][arg2][arg3 + 1] + class68.field1079[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class228 var16 = var14.field344;
                                    if (var16 != null) {
                                        if (var16.field3565.method1228()) {
                                            arg0.method1201(var16.field3565, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3570 != null && var16.field3570.method1228()) {
                                            arg0.method1201(var16.field3570, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field360; var17++) {
                                        class172 var18 = var14.field358[var17];
                                        if (var18 != null && var18.field2566.method1228() && (var18.field2558 == var12 || var7 == var12) && (var18.field2560 == var13 || var9 == var13)) {
                                            int var19 = var18.field2565 + 1 - var18.field2558;
                                            int var20 = var18.field2563 + 1 - var18.field2560;
                                            arg0.method1201(var18.field2566, (var18.field2558 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2560 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method167(byte arg0) {
        field296++;
        class74.field1243.method1782(arg0 - 145);
        if (arg0 != 123) {
            method171((byte) -101);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIIBII)V")
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field293++;
        int var11 = arg6 - arg4;
        if (arg6 < class188.field3010) {
            var11++;
        }
        int var12 = arg0 - arg10;
        if (arg0 < class221.field3453) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var41 = (var13 + 1) * arg5 + arg7 >> 16;
            int var42 = arg7 + (arg5 * var13) >> 16;
            int var43 = var41 - var42;
            if (var43 > 0) {
                int var44 = arg4 + var13 >> 6;
                if (var44 >= 0 && class18.field285.length - 1 >= var44) {
                    int var45 = arg2 + var41;
                    int var46 = arg2 + var42;
                    byte[][] var47 = class50.field799[var44];
                    byte[][] var48 = class288.field4530[var44];
                    int[][] var49 = class18.field285[var44];
                    byte[][] var50 = class222.field3467[var44];
                    byte[][] var51 = class157.field2413[var44];
                    byte[][] var52 = class216.field3334[var44];
                    for (int var53 = 0; var53 < var12; var53++) {
                        int var54 = arg9 * var53 + arg3 >> 16;
                        int var55 = arg3 + ((var53 + 1) * arg9) >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg1 + var54;
                            int var58 = arg1 + var55;
                            int var59 = arg10 + var53 >> 6;
                            int var60 = arg10 + var53 & 0x3F;
                            int var61 = arg4 + var13 & 0x3F;
                            int var62 = (var60 << 6) + var61;
                            int var63;
                            if (var59 < 0 || var59 > var49.length - 1 || var49[var59] == null) {
                                if (class87.field1422.field4684 != -1) {
                                    var63 = class87.field1422.field4684;
                                } else if ((arg4 + var13 & 0x4) == (arg10 + var53 & 0x4)) {
                                    var63 = class237.field3666[class116.field1798 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var59 < 0 || (var49.length - 1) < var59) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class201.method1333(var46, var57, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var49[var59][var62];
                            }
                            int var64 = var47[var59] == null ? 0 : class237.field3666[var47[var59][var62] & 0xFF];
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var65 = var50[var59] == null ? 0 : class237.field3666[var50[var59][var62] & 0xFF];
                            if (var64 == 0 && var65 == 0) {
                                class201.method1333(var46, var57, var43, var56, var63);
                            } else {
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    byte var66 = var48[var59] == null ? 0 : var48[var59][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class201.method1333(var46, var57, var43, var56, var64);
                                    } else {
                                        class100.method774(var43, var57, var63, true, class201.field3150, var67 >> 2, var56, var64, var46, false, var66 & 0x3);
                                    }
                                }
                                if (var65 != 0) {
                                    if (var65 == -1) {
                                        var65 = var63;
                                    }
                                    byte var68 = var51[var59][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class201.method1333(var46, var57, var43, var56, var65);
                                    }
                                    class100.method774(var43, var57, 0, var64 == 0, class201.field3150, var69 >> 2, var56, var65, var46, false, var68 & 0x3);
                                }
                            }
                            if (var52[var59] != null) {
                                int var70 = var52[var59][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var43 == 1) {
                                        var71 = var46;
                                    } else {
                                        var71 = var45 - 1;
                                    }
                                    int var72;
                                    if (var56 == 1) {
                                        var72 = var57;
                                    } else {
                                        var72 = var58 - 1;
                                    }
                                    int var73 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var73 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class201.method1346(var46, var57, var56, var73);
                                    } else if (var70 == 2) {
                                        class201.method1334(var46, var57, var43, var73);
                                    } else if (var70 == 3) {
                                        class201.method1346(var71, var57, var56, var73);
                                    } else if (var70 == 4) {
                                        class201.method1334(var46, var72, var43, var73);
                                    } else if (var70 == 9) {
                                        class201.method1346(var46, var57, var56, 16777215);
                                        class201.method1334(var46, var57, var43, var73);
                                    } else if (var70 == 10) {
                                        class201.method1346(var71, var57, var56, 16777215);
                                        class201.method1334(var46, var57, var43, var73);
                                    } else if (var70 == 11) {
                                        class201.method1346(var71, var57, var56, 16777215);
                                        class201.method1334(var46, var72, var43, var73);
                                    } else if (var70 == 12) {
                                        class201.method1346(var46, var57, var56, 16777215);
                                        class201.method1334(var46, var72, var43, var73);
                                    } else if (var70 == 17) {
                                        class201.method1334(var46, var57, 1, var73);
                                    } else if (var70 == 18) {
                                        class201.method1334(var71, var57, 1, var73);
                                    } else if (var70 == 19) {
                                        class201.method1334(var71, var72, 1, var73);
                                    } else if (var70 == 20) {
                                        class201.method1334(var46, var72, 1, var73);
                                    } else if (var70 == 25) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class201.method1334(var46 + var74, var72 - var74, 1, var73);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class201.method1334(var46 + var75, var57 + var75, 1, var73);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var76 = arg2 + var42;
                    var10000 = arg2 + var41;
                    for (int var78 = 0; var78 < var12; var78++) {
                        int var79;
                        if (class87.field1422.field4684 != -1) {
                            var79 = class87.field1422.field4684;
                        } else if ((arg4 + var13 & 0x4) == (arg10 + var78 & 0x4)) {
                            var79 = class237.field3666[class116.field1798 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var80 = (arg3 + (arg9 * var78) >> 16) + arg1;
                        int var81 = (arg3 + ((var78 + 1) * arg9) >> 16) + arg1;
                        int var82 = var81 - var80;
                        class201.method1333(var76, var80, var43, var82, var79);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg7 + (arg5 * var14) >> 16;
            int var16 = (var14 + 1) * arg5 + arg7 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg2 + var16;
                int var19 = arg2 + var15;
                int var20 = arg4 + var14 >> 6;
                if (var20 >= 0 && var20 <= (class273.field4310.length - 1)) {
                    int[][] var21 = class273.field4310[var20];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = (var22 + 1) * arg9 + arg3 >> 16;
                        int var24 = arg3 + (arg9 * var22) >> 16;
                        int var25 = var23 - var24;
                        if (var25 > 0) {
                            var10000 = arg1 + var23;
                            int var27 = arg1 + var24;
                            int var28 = arg10 + var22 >> 6;
                            if (var28 >= 0 && var21.length - 1 >= var28) {
                                int var29 = (arg10 + var22 & 0x3F << 6) + (var14 + arg4 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        class159 var32 = class94.method734(arg8 + 23550, var31 + -1);
                                        int var33 = (var30 & 0x7533) >> 13;
                                        boolean var34 = (var30 >> 15 & 0x1) == 1;
                                        class168 var35 = var32.method1077(-113, var33, var34);
                                        if (var35 != null) {
                                            int var36 = var35.field2670 * var17 / 4;
                                            int var37 = var35.field2676 * var25 / 4;
                                            if (var32.field2436) {
                                                int var38 = (var30 & 0xF767F) >> 16;
                                                int var39 = var30 >> 20 & 0xF;
                                                if ((var33 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var37 = var25 * var39;
                                                var36 = var17 * var38;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var32.field2441 == 0) {
                                                    var35.method1116(var19, var27 + var25 - var37, var36, var37);
                                                } else {
                                                    var35.method1121(var19, var27 + var25 - var37, var36, var37, var32.field2441);
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
        if (arg8 != 38) {
            field297 = 61;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static final void method169(boolean arg0) {
        if (arg0) {
            class255.field3907 = class88.field1439;
            class68.field1079 = class118.field1825;
        } else {
            class255.field3907 = class71.field1134;
            class68.field1079 = class214.field3307;
        }
        class179.field2680 = class255.field3907.length;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public static void method170(boolean arg0) {
        field294 = null;
        if (!arg0) {
            field294 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public static final void method171(byte arg0) {
        field298++;
        if (arg0 <= 3) {
            return;
        }
        class292.field4607.method1251(59, (byte) -101);
        class33.field530++;
        for (class120 var1 = (class120) class13.field230.method1410(-93); var1 != null; var1 = (class120) class13.field230.method1413(-1)) {
            if (var1.field1853 == 0) {
                class249.method1672(true, (byte) 123, var1);
            }
        }
        if (class174.field2577 != null) {
            class246.method1663(255, class174.field2577);
            class174.field2577 = null;
        }
    }
}
