import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class194 extends class307 {

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public int field3124;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field3121 = 0;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field3126 = -1;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field3125 = 0;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "Z")
    public static boolean field3131 = true;

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "[Lqd;")
    public static class40[] field3127 = new class40[100];

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "Lpl;")
    public static class186 field3133 = new class186(64);

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!pg", name = "O", descriptor = "Lqd;")
    public static class40 field3135 = class147.method1106("scrollen:", (byte) -113);

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "Lcm;")
    public static class185 field3132;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
    public static int[] field3122;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "[Lqd;")
    public static class40[] field3123;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lke;Ljava/awt/Frame;B)V", line = 7)
    public static final void method1382(class107 arg0, Frame arg1, byte arg2) {
        field3129++;
        while (true) {
            class70 var3 = arg0.method809((byte) -96, arg1);
            while (var3.field1258 == 0) {
                class160.method1227(10L, false);
            }
            if (var3.field1258 == 1) {
                arg1.setVisible(false);
                int var4 = -23 / ((arg2 - 12) / 44);
                arg1.dispose();
                return;
            }
            class160.method1227(100L, false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBIIIIIIII)V", line = 41)
    public static final void method1383(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg3 - arg8;
        if (class233.field3840 > arg3) {
            var11++;
        }
        field3128++;
        int var12 = arg10 - arg7;
        if (class268.field4462 > arg10) {
            var12++;
        }
        if (arg2 < 126) {
            field3125 = 49;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = (var13 + 1) * arg9 + arg5 >> 16;
            int var15 = arg9 * var13 + arg5 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg8 + var13 >> 6;
                if (var17 >= 0 && var17 <= class86.field1495.length - 1) {
                    int var18 = arg1 + var14;
                    int var19 = arg1 + var15;
                    int[][] var20 = class86.field1495[var17];
                    byte[][] var21 = class235.field3847[var17];
                    byte[][] var22 = class256.field4267[var17];
                    byte[][] var23 = class62.field1169[var17];
                    byte[][] var24 = class225.field3734[var17];
                    byte[][] var25 = class214.field3591[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg4 * var26 + arg0 >> 16;
                        int var28 = arg0 + ((var26 + 1) * arg4) >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg6 + var28;
                            int var31 = arg6 + var27;
                            int var32 = arg7 + var26 >> 6;
                            int var33 = arg8 + var13 & 0x3F;
                            int var34 = var26 + arg7 & 0x3F;
                            int var35 = (var34 << 6) + var33;
                            int var36;
                            if (var32 < 0 || (var20.length - 1) < var32 || var20[var32] == null) {
                                if (class254.field4205.field3322 != -1) {
                                    var36 = class254.field4205.field3322;
                                } else if ((var13 + arg8 & 0x4) == (arg7 + var26 & 0x4)) {
                                    var36 = class119.field2018[class112.field1947 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var20.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class115.method880(var19, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var23[var32] == null ? 0 : class119.field2018[var23[var32][var35] & 0xFF];
                            int var38 = var22[var32] == null ? 0 : class119.field2018[var22[var32][var35] & 0xFF];
                            if (var38 == 0 && var37 == 0) {
                                class115.method880(var19, var31, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var39 = var21[var32] == null ? 0 : var21[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class115.method880(var19, var31, var16, var29, var38);
                                    } else {
                                        class248.method1756(var36, var16, true, var38, var40 >> 2, class115.field1978, var31, var29, var19, var39 & 0x3, -12478);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var25[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class115.method880(var19, var31, var16, var29, var37);
                                    }
                                    class248.method1756(0, var16, var38 == 0, var37, var42 >> 2, class115.field1978, var31, var29, var19, var41 & 0x3, -12478);
                                }
                            }
                            if (var24[var32] != null) {
                                int var43 = var24[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var19;
                                    } else {
                                        var44 = var18 - 1;
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
                                        class115.method882(var19, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class115.method877(var19, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class115.method882(var44, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class115.method877(var19, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class115.method882(var19, var31, var29, 16777215);
                                        class115.method877(var19, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class115.method882(var44, var31, var29, 16777215);
                                        class115.method877(var19, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class115.method882(var44, var31, var29, 16777215);
                                        class115.method877(var19, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class115.method882(var19, var31, var29, 16777215);
                                        class115.method877(var19, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class115.method877(var19, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class115.method877(var44, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class115.method877(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class115.method877(var19, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class115.method877(var19 + var48, -var48 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class115.method877(var19 + var47, var31 + var47, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg1 + var14;
                    int var50 = arg1 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class254.field4205.field3322 != -1) {
                            var52 = class254.field4205.field3322;
                        } else if ((var51 + arg7 & 0x4) == (arg8 + var13 & 0x4)) {
                            var52 = class119.field2018[class112.field1947 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = (arg4 * var51 + arg0 >> 16) + arg6;
                        int var54 = (arg0 + ((var51 + 1) * arg4) >> 16) + arg6;
                        int var55 = var54 - var53;
                        class115.method880(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = (var56 + 1) * arg9 + arg5 >> 16;
            int var58 = arg9 * var56 + arg5 >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                int var60 = arg1 + var58;
                var10000 = arg1 + var57;
                int var62 = arg8 + var56 >> 6;
                if (var62 >= 0 && var62 <= class108.field1892.length - 1) {
                    short[][] var63 = class108.field1892[var62];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg0 + (arg4 * var64) >> 16;
                        int var66 = (var64 + 1) * arg4 + arg0 >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            var10000 = arg6 + var66;
                            int var69 = arg6 + var65;
                            int var70 = arg7 + var64 >> 6;
                            if (var70 >= 0 && var70 <= (var63.length - 1)) {
                                int var71 = (arg7 + var64 & 0x3F << 6) + (arg8 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71] & 0x3FFF;
                                    int var73 = var63[var70][var71] >> 14 & 0x3;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class213.field3563[var72 - 1].field4114 * var59 / 4;
                                            int var75 = class213.field3563[var72 - 1].field4124 * var67 / 4;
                                            if (var74 != 0 && var75 != 0) {
                                                int var76 = class213.field3563[var72 - 1].field4128 * var67 / 4;
                                                class213.field3563[var72 - 1].method850(var60, var69 - var76, var74, var75);
                                            }
                                        } else if (var73 == 1) {
                                            int var83 = client.field4061[var72 - 1].field4114 * var59 / 4;
                                            int var84 = client.field4061[var72 - 1].field4124 * var67 / 4;
                                            if (var83 != 0 && var84 != 0) {
                                                int var85 = client.field4061[var72 - 1].field4128 * var67 / 4;
                                                client.field4061[var72 - 1].method850(var60, var69 - var85, var83, var84);
                                            }
                                        } else if (var73 == 2) {
                                            int var77 = class15.field251[var72 - 1].field4124 * var67 / 4;
                                            int var78 = class15.field251[var72 - 1].field4114 * var59 / 4;
                                            if (var78 != 0 && var77 != 0) {
                                                int var79 = class15.field251[var72 - 1].field4128 * var67 / 4;
                                                class15.field251[var72 - 1].method850(var60, var69 - var79, var78, var77);
                                            }
                                        } else if (var73 == 3) {
                                            int var80 = class98.field1745[var72 - 1].field4114 * var59 / 4;
                                            int var81 = class98.field1745[var72 - 1].field4124 * var67 / 4;
                                            if (var80 != 0 && var81 != 0) {
                                                int var82 = class98.field1745[var72 - 1].field4128 * var67 / 4;
                                                class98.field1745[var72 - 1].method850(var60, var69 - var82, var80, var81);
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

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 475)
    public static void method1384(int arg0) {
        field3122 = null;
        field3123 = null;
        field3132 = null;
        field3135 = null;
        if (arg0 == 4) {
            field3133 = null;
            field3127 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V", line = 492)
    public static final void method1385(int arg0) {
        field3130++;
        if (class248.field4107 != null) {
            class248.field4107.method117(arg0 - 131);
        }
        if (class119.field2011 != null) {
            class119.field2011.method117(-120);
        }
        if (arg0 != 4) {
            method1385(38);
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V", line = 508)
    public class194(int arg0, int arg1) {
        this.field3120 = arg0;
        this.field3124 = arg1;
    }
}
