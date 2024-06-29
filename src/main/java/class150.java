import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class150 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
    private int[] field2298;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2300 = 1;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2303 = -1;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lbs;")
    public static class186 field2295;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I", line = 5)
    public final int method1158(int arg0, int arg1) {
        field2302++;
        int var3 = (this.field2298.length >> 1) + arg0;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field2298[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2298[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLnc;Lnc;[[II[[B[[BIZ[[BLja;I[[B)V", line = 31)
    public static final void method1159(byte arg0, class126 arg1, class126 arg2, int[][] arg3, int arg4, byte[][] arg5, byte[][] arg6, int arg7, boolean arg8, byte[][] arg9, class90 arg10, int arg11, byte[][] arg12) {
        field2301++;
        for (int var13 = 0; var13 < arg11; var13++) {
            int var15 = var13 >= arg11 - 1 ? var13 : var13 + 1;
            for (int var16 = 0; var16 < arg4; var16++) {
                int var17 = (arg4 - 1) <= var16 ? var16 : var16 + 1;
                if (class122.method1034(24037) || class202.method1538(var13, var16, class140.field2216, 582, arg7)) {
                    boolean var18 = false;
                    boolean var19 = false;
                    boolean[] var20 = new boolean[4];
                    int var21 = arg6[var13][var16];
                    int var22 = arg5[var13][var16];
                    int var23 = arg9[var13][var16] & 0xFF;
                    int var24 = arg12[var13][var16] & 0xFF;
                    int var25 = arg12[var13][var17] & 0xFF;
                    int var26 = arg12[var15][var17] & 0xFF;
                    int var27 = arg12[var15][var16] & 0xFF;
                    if (var23 != 0 || var24 != 0) {
                        class451 var28 = var23 == 0 ? null : class206.method1555(var23 - 1, 4);
                        if (var21 == 0 && var28 == null) {
                            var21 = 12;
                        }
                        class361 var29 = var24 == 0 ? null : class199.method1514(var24 - 1, (byte) -42);
                        class451 var30 = var28;
                        if (var28 != null) {
                            if (var28.field6548 == -1 && var28.field6540 == -1) {
                                var30 = var28;
                                var28 = null;
                            } else if (var29 != null && var21 != 0) {
                                var19 = var28.field6551;
                            }
                        }
                        if ((var21 == 0 || var21 == 12) && var13 > 0 && var16 > 0 && var13 < arg11 && arg4 > var16) {
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            byte var34 = 0;
                            int var35 = var33 + (arg12[var15][var17] == var24 ? 1 : -1);
                            int var36 = var32 + (arg12[var15][var16 - 1] == var24 ? 1 : -1);
                            int var37 = var31 + (arg12[var13 - 1][var16 - 1] == var24 ? 1 : -1);
                            int var38 = var34 + (arg12[var13 - 1][var17] == var24 ? 1 : -1);
                            if (arg12[var13][var16 - 1] == var24) {
                                var36++;
                                var37++;
                            } else {
                                var37--;
                                var36--;
                            }
                            if (arg12[var15][var16] == var24) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (arg12[var13][var17] == var24) {
                                var38++;
                                var35++;
                            } else {
                                var35--;
                                var38--;
                            }
                            if (arg12[var13 - 1][var16] == var24) {
                                var37++;
                                var38++;
                            } else {
                                var38--;
                                var37--;
                            }
                            int var39 = var37 - var35;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            int var40 = var36 - var38;
                            if (var40 < 0) {
                                var40 = -var40;
                            }
                            if (var39 == var40) {
                                var39 = arg2.method794(var13, var16) - arg2.method794(var15, var17);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                                var40 = arg2.method794(var15, var16) - arg2.method794(var13, var17);
                                if (var40 < 0) {
                                    var40 = -var40;
                                }
                            }
                            var22 = var39 < var40 ? 1 : 0;
                        }
                        for (int var41 = 0; var41 < 13; var41++) {
                            class90.field1433[var41] = -1;
                            class198.field2881[var41] = 1;
                        }
                        boolean[] var42 = var28 != null && var28.field6551 ? class282.field4230[var21] : class73.field1215[var21];
                        class311.method2117(arg5, var22, arg10, arg6, arg4, (byte) 113, var16, arg11, var13, arg9, var21, var20, var28, var29);
                        boolean var43 = var28 != null && var28.field6548 != var28.field6540;
                        if (!var43) {
                            for (int var44 = 0; var44 < 8; var44++) {
                                if (class90.field1433[var44] >= 0 && class439.field6385[var44] != class270.field4065[var44]) {
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var42[var22 + 1 & 0x3]) {
                            var20[1] = class419.method2628(var20[1], class35.method254(class198.field2881[4], class198.field2881[2]) == 0);
                        }
                        if (!var42[var22 + 3 & 0x3]) {
                            var20[3] = class419.method2628(var20[3], class35.method254(class198.field2881[6], class198.field2881[0]) == 0);
                        }
                        if (!var42[var22 & 0x3]) {
                            var20[0] = class419.method2628(var20[0], class35.method254(class198.field2881[2], class198.field2881[0]) == 0);
                        }
                        if (!var42[var22 + 2 & 0x3]) {
                            var20[2] = class419.method2628(var20[2], class35.method254(class198.field2881[6], class198.field2881[4]) == 0);
                        }
                        if (!var19 && (var21 == 0 || var21 == 12)) {
                            if (var20[0] && !var20[1] && !var20[2] && var20[3]) {
                                var21 = var21 == 0 ? 13 : 14;
                                var22 = 0;
                                var20[0] = var20[3] = false;
                            } else if (var20[0] && var20[1] && !var20[2] && !var20[3]) {
                                var20[0] = var20[1] = false;
                                var22 = 3;
                                var21 = var21 == 0 ? 13 : 14;
                            } else if (!var20[0] && var20[1] && var20[2] && !var20[3]) {
                                var22 = 2;
                                var20[1] = var20[2] = false;
                                var21 = var21 == 0 ? 13 : 14;
                            } else if (!var20[0] && !var20[1] && var20[2] && var20[3]) {
                                var20[2] = var20[3] = false;
                                var22 = 1;
                                var21 = var21 == 0 ? 13 : 14;
                            }
                        }
                        boolean var45 = !var19 && !var20[0] && !var20[2] && !var20[1] && !var20[3];
                        int[] var46 = null;
                        int var47;
                        int[] var48;
                        int[] var49;
                        int[] var50;
                        int var51;
                        if (var45) {
                            var48 = class441.field6404[var21];
                            var50 = class45.field665[var21];
                            var49 = class270.field4064[var21];
                            var47 = var29 == null ? 0 : class169.field2521[var21];
                            var51 = var28 == null ? 0 : class90.field1419[var21];
                        } else if (var19) {
                            var49 = class258.field3757[var21];
                            var46 = class234.field3396[var21];
                            var51 = var28 == null ? 0 : class134.field2153[var21];
                            var48 = class13.field215[var21];
                            var50 = class6.field72[var21];
                            var47 = var29 == null ? 0 : class42.field644[var21];
                        } else {
                            var47 = var29 == null ? 0 : class206.field3025[var21];
                            var48 = class147.field2275[var21];
                            var49 = class255.field3696[var21];
                            var50 = class90.field1420[var21];
                            var46 = class35.field501[var21];
                            var51 = var28 == null ? 0 : class122.field1925[var21];
                        }
                        int var52 = var47 + var51;
                        if (var52 <= 0) {
                            class253.method1833(arg7, var13, var16);
                        } else {
                            if (var20[0]) {
                                var52++;
                            }
                            if (var20[2]) {
                                var52++;
                            }
                            if (var20[1]) {
                                var52++;
                            }
                            if (var20[3]) {
                                var52++;
                            }
                            int var53 = 0;
                            int var54 = 0;
                            int var55 = var52 * 3;
                            int[] var56 = arg8 ? new int[var55] : null;
                            int[] var57 = var43 ? new int[var55] : null;
                            int[] var58 = new int[var55];
                            int[] var59 = new int[var55];
                            int[] var60 = new int[var55];
                            int[] var61 = new int[var55];
                            int[] var62 = new int[var55];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var28 != null) {
                                var63 = var28.field6548;
                                var64 = arg10.method707() ? var28.field6561 : var28.field6538;
                                var65 = var28.field6541;
                                int var66 = class105.method938(var28, 11224, arg10);
                                for (int var67 = 0; var67 < var51; var67++) {
                                    boolean var68 = false;
                                    byte var69;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 1;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 1;
                                        class435.field6349[4] = var50[var53];
                                        class435.field6349[5] = var48[var53];
                                        var69 = 6;
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 5;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 5;
                                        class435.field6349[4] = var50[var53];
                                        var69 = 6;
                                        class435.field6349[5] = var48[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 3;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 3;
                                        class435.field6349[4] = var50[var53];
                                        class435.field6349[5] = var48[var53];
                                        var69 = 6;
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 7;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 7;
                                        class435.field6349[4] = var50[var53];
                                        var69 = 6;
                                        class435.field6349[5] = var48[var53];
                                    } else {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = var50[var53];
                                        class435.field6349[2] = var48[var53];
                                        var69 = 3;
                                    }
                                    for (int var70 = 0; var70 < var69; var70++) {
                                        int var71 = class435.field6349[var70];
                                        int var72 = var71 - (var22 * 2) & 0x7;
                                        int var73 = class291.field4329[var71];
                                        int var74 = class350.field4969[var71];
                                        if (var22 == 1) {
                                            var58[var54] = var74;
                                            var59[var54] = 128 - var73;
                                        } else if (var22 == 2) {
                                            var58[var54] = 128 - var73;
                                            var59[var54] = 128 - var74;
                                        } else if (var22 == 3) {
                                            var58[var54] = 128 - var74;
                                            var59[var54] = var73;
                                        } else {
                                            var58[var54] = var73;
                                            var59[var54] = var74;
                                        }
                                        if (arg8 && class58.field915[var21][var71]) {
                                            int var75 = (var13 << 7) + var58[var54];
                                            int var76 = (var16 << 7) + var59[var54];
                                            var56[var54] = arg1.method809(var75, var76) - arg2.method809(var75, var76);
                                        }
                                        if (var71 < 8 && var28.field6542 < class90.field1433[var72]) {
                                            if (var57 != null) {
                                                var57[var54] = class439.field6385[var72];
                                            }
                                            var62[var54] = class205.field3008[var72];
                                            var61[var54] = class35.field502[var72];
                                            var60[var54] = class270.field4065[var72];
                                        } else {
                                            if (var57 != null) {
                                                var57[var54] = var66;
                                            }
                                            var61[var54] = arg10.method707() ? var28.field6561 : var28.field6538;
                                            var62[var54] = var28.field6541;
                                            var60[var54] = var63;
                                        }
                                        var54++;
                                    }
                                    var53++;
                                }
                                if (!arg8 && arg7 == 0) {
                                    class30.method232(var13, var16, var28.field6546, var28.field6554 * 8);
                                }
                                if (var21 != 12 && var28.field6548 != -1 && var28.field6543) {
                                    var18 = true;
                                }
                            } else if (var45) {
                                var53 += class90.field1419[var21];
                            } else if (var19) {
                                var53 += class134.field2153[var21];
                            } else {
                                var53 += class122.field1925[var21];
                            }
                            if (var29 != null) {
                                if (var26 == 0) {
                                    var26 = var24;
                                }
                                if (var25 == 0) {
                                    var25 = var24;
                                }
                                if (var27 == 0) {
                                    var27 = var24;
                                }
                                class361 var77 = class199.method1514(var24 - 1, (byte) -42);
                                class361 var78 = class199.method1514(var25 - 1, (byte) -42);
                                class361 var79 = class199.method1514(var26 - 1, (byte) -42);
                                class361 var80 = class199.method1514(var27 - 1, (byte) -42);
                                for (int var81 = 0; var81 < var47; var81++) {
                                    boolean var82 = false;
                                    byte var83;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 1;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 1;
                                        class435.field6349[4] = var50[var53];
                                        class435.field6349[5] = var48[var53];
                                        var83 = 6;
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 5;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 5;
                                        class435.field6349[4] = var50[var53];
                                        var83 = 6;
                                        class435.field6349[5] = var48[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 3;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 3;
                                        class435.field6349[4] = var50[var53];
                                        class435.field6349[5] = var48[var53];
                                        var83 = 6;
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = 7;
                                        class435.field6349[2] = var48[var53];
                                        class435.field6349[3] = 7;
                                        class435.field6349[4] = var50[var53];
                                        var83 = 6;
                                        class435.field6349[5] = var48[var53];
                                    } else {
                                        class435.field6349[0] = var49[var53];
                                        class435.field6349[1] = var50[var53];
                                        var83 = 3;
                                        class435.field6349[2] = var48[var53];
                                    }
                                    for (int var84 = 0; var84 < var83; var84++) {
                                        int var85 = class435.field6349[var84];
                                        int var86 = var85 - var22 * 2 & 0x7;
                                        int var87 = class291.field4329[var85];
                                        int var88 = class350.field4969[var85];
                                        int var89;
                                        int var90;
                                        if (var22 == 1) {
                                            var89 = var88;
                                            var90 = 128 - var87;
                                        } else if (var22 == 2) {
                                            var89 = 128 - var87;
                                            var90 = 128 - var88;
                                        } else if (var22 == 3) {
                                            var90 = var87;
                                            var89 = 128 - var88;
                                        } else {
                                            var90 = var88;
                                            var89 = var87;
                                        }
                                        var58[var54] = var89;
                                        var59[var54] = var90;
                                        if (arg8 && class58.field915[var21][var85]) {
                                            int var91 = (var13 << 7) + var89;
                                            int var92 = (var16 << 7) + var90;
                                            var56[var54] = arg1.method809(var91, var92) - arg2.method809(var91, var92);
                                        }
                                        if (var85 < 8 && class90.field1433[var86] >= 0) {
                                            if (var57 != null) {
                                                var57[var54] = class439.field6385[var86];
                                            }
                                            var62[var54] = class205.field3008[var86];
                                            var61[var54] = class35.field502[var86];
                                            var60[var54] = class270.field4065[var86];
                                        } else {
                                            if (var19 && class58.field915[var21][var85]) {
                                                var61[var54] = var64;
                                                var62[var54] = var65;
                                                var60[var54] = var63;
                                            } else if (var89 == 0 && var90 == 0) {
                                                var60[var54] = arg3[var13][var16];
                                                var61[var54] = var77.field5145;
                                                var62[var54] = var77.field5156;
                                            } else if (var89 == 0 && var90 == 128) {
                                                var60[var54] = arg3[var13][var17];
                                                var61[var54] = var78.field5145;
                                                var62[var54] = var78.field5156;
                                            } else if (var89 == 128 && var90 == 128) {
                                                var60[var54] = arg3[var15][var17];
                                                var61[var54] = var79.field5145;
                                                var62[var54] = var79.field5156;
                                            } else if (var89 == 128 && var90 == 0) {
                                                var60[var54] = arg3[var15][var16];
                                                var61[var54] = var80.field5145;
                                                var62[var54] = var80.field5156;
                                            } else {
                                                if (var89 < 64) {
                                                    if (var90 < 64) {
                                                        var61[var54] = var77.field5145;
                                                        var62[var54] = var77.field5156;
                                                    } else {
                                                        var61[var54] = var78.field5145;
                                                        var62[var54] = var78.field5156;
                                                    }
                                                } else if (var90 >= 64) {
                                                    var61[var54] = var79.field5145;
                                                    var62[var54] = var79.field5156;
                                                } else {
                                                    var61[var54] = var80.field5145;
                                                    var62[var54] = var80.field5156;
                                                }
                                                int var93 = class284.method2009(64512, arg3[var13][var16], arg3[var15][var16], var89 << 7 >> 7);
                                                int var94 = class284.method2009(64512, arg3[var13][var17], arg3[var15][var17], var89 << 7 >> 7);
                                                var60[var54] = class284.method2009(64512, var93, var94, var90 << 7 >> 7);
                                            }
                                            if (var57 != null) {
                                                var57[var54] = var60[var54];
                                            }
                                        }
                                        var54++;
                                    }
                                    var53++;
                                }
                                if (var21 != 0 && var29.field5143) {
                                    var18 = true;
                                }
                            }
                            int var95 = arg2.method794(var13, var16);
                            int var96 = arg2.method794(var15, var16);
                            int var97 = arg2.method794(var15, var17);
                            int var98 = arg2.method794(var13, var17);
                            if (arg7 > 0) {
                                boolean var99 = true;
                                if (var24 == 0 && var21 != 0) {
                                    var99 = false;
                                }
                                if (var23 > 0 && var30 != null && !var30.field6545) {
                                    var99 = false;
                                }
                                if (var99 && var95 == var96 && var95 == var97 && var95 == var98) {
                                    class390.field5615[arg7][var13][var16] = (byte) class439.method2744(class390.field5615[arg7][var13][var16], 4);
                                }
                            }
                            int var100 = 0;
                            int var101 = 0;
                            if (arg8) {
                                var100 = class373.method2379(var13, var16);
                                var101 = class55.method436(var13, var16);
                            }
                            arg2.method805(var13, var16, var58, var56, var59, var60, var57, var61, var62, var100, var101, var18);
                            class253.method1833(arg7, var13, var16);
                        }
                    }
                }
            }
        }
        int var14 = 20 % ((arg0 - 7) / 50);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([I)V", line = 831)
    public class150(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field2298 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2298[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2298[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2298[var5 + var5] = arg0[var4];
            this.field2298[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(J[III)Ljava/lang/String;", line = 870)
    public static final String method1160(long arg0, int[] arg1, int arg2, int arg3) {
        field2296++;
        if (class447.field6522 != null) {
            String var5 = class447.field6522.method953(true, arg1, arg3, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg2 != 5) {
            method1163(-121);
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lvj;Ljava/awt/Canvas;Lcj;III)Lja;", line = 891)
    public static final class90 method1161(class177 arg0, Canvas arg1, class181 arg2, int arg3, int arg4, int arg5) {
        field2294++;
        int var6 = -1;
        if (arg5 != -29623) {
            method1161((class177) null, (Canvas) null, (class181) null, 27, 108, 67);
        }
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class175.field2610[var7]) {
                var6 = var7;
                class175.field2610[var7] = true;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("No free toolkit instances");
        } else if (arg3 == 0) {
            return class228.method1702(arg1, arg2, var6, 32);
        } else if (arg3 == 1) {
            return class120.method1007(arg0, 21124, arg4, arg2, arg1, var6);
        } else {
            throw new IllegalArgumentException("Unsupported mode");
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 928)
    public static void method1162(boolean arg0) {
        field2295 = null;
        if (arg0) {
            method1160(48L, (int[]) null, -27, 16);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 945)
    public static final void method1163(int arg0) {
        field2299++;
        if (class98.field1547 == -1 || class376.field5330 == -1) {
            return;
        }
        int var1 = ((class230.field3368 - class55.field884) * class413.field5999 >> 16) + class55.field884;
        class413.field5999 += var1;
        if (class413.field5999 >= 65535) {
            if (class450.field6535) {
                class64.field1037 = false;
            } else {
                class64.field1037 = true;
            }
            class413.field5999 = 65535;
            class450.field6535 = true;
        } else {
            class450.field6535 = false;
            class64.field1037 = false;
        }
        float var2 = (float) class413.field5999 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class37.field562 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class253.field3659[class98.field1547][var4][var5] * 3;
            int var22 = class253.field3659[class98.field1547][var4 + 1][var5] * 3;
            int var23 = (class253.field3659[class98.field1547][var4 + 2][var5] + class253.field3659[class98.field1547][var4 + 2][var5] - class253.field3659[class98.field1547][var4 + 3][var5]) * 3;
            int var24 = class253.field3659[class98.field1547][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class253.field3659[class98.field1547][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class437.field6364 = (int) var3[1] * -1;
        class286.field4288 = (int) var3[2] - (class294.field4362 * 128);
        class265.field3985 = (int) var3[0] - (class379.field5384 * 128);
        float[] var6 = new float[3];
        int var7 = class51.field823 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class253.field3659[class376.field5330][var7][var8] * 3;
            int var15 = class253.field3659[class376.field5330][var7 + 1][var8] * 3;
            int var16 = (class253.field3659[class376.field5330][var7 + 2][var8] + class253.field3659[class376.field5330][var7 + 2][var8] - class253.field3659[class376.field5330][var7 + 3][var8]) * 3;
            int var17 = class253.field3659[class376.field5330][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class253.field3659[class376.field5330][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class40.field623 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class291.field4330 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        if (arg0 != -13736) {
            field2295 = null;
        }
        class375.field5318 = ((class253.field3659[class98.field1547][var4 + 2][3] - class253.field3659[class98.field1547][var4][3]) * class413.field5999 >> 16) + class253.field3659[class98.field1547][var4][3];
    }
}
