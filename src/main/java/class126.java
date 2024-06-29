import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class126 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lnh;")
    public static class54 field2228 = new class54(5);

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lcf;")
    private static class93 field2232 = class147.method1066("Prepared sound engine", -48);

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[[[I")
    public static int[][][] field2234 = new int[2][][];

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lcf;")
    public static class93 field2235 = field2232;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[[[I")
    public static int[][][] field2231 = new int[4][13][13];

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lcf;")
    private static class93 field2238 = class147.method1066("Loaded textures", -48);

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lcf;")
    public static class93 field2239 = field2238;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2237 = -1;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lhg;")
    public static class177 field2233;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Lhg;")
    public static class177 field2241;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field2236;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2230++;
        if (arg5 >= -60) {
            return;
        }
        int var11 = arg6 - arg2;
        int var12 = arg9 - arg4;
        if (class183.field3373 > arg6) {
            var11++;
        }
        if (class148.field2599 > arg9) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var40 = arg7 + ((var13 + 1) * arg8) >> 16;
            int var41 = arg8 * var13 + arg7 >> 16;
            int var42 = var40 - var41;
            if (var42 > 0) {
                int var43 = arg4 + var13 >> 6;
                if (var43 >= 0 && var43 <= class180.field3174.length - 1) {
                    int var44 = arg0 + var40;
                    byte[][] var45 = class37.field558[var43];
                    int[][] var46 = class180.field3174[var43];
                    int var47 = arg0 + var41;
                    byte[][] var48 = class212.field3896[var43];
                    byte[][] var49 = class232.field4143[var43];
                    byte[][] var50 = class74.field1351[var43];
                    byte[][] var51 = class257.field4632[var43];
                    for (int var52 = 0; var52 < var11; var52++) {
                        int var53 = arg10 * var52 + arg1 >> 16;
                        int var54 = (var52 + 1) * arg10 + arg1 >> 16;
                        int var55 = var54 - var53;
                        if (var55 > 0) {
                            int var56 = arg3 + var53;
                            int var57 = arg3 + var54;
                            int var58 = arg2 + var52 >> 6;
                            int var59 = arg4 + var13 & 0x3F;
                            int var60 = arg2 + var52 & 0x3F;
                            int var61 = (var60 << 6) + var59;
                            int var62;
                            if (var58 < 0 || (var46.length - 1) < var58 || var46[var58] == null) {
                                if (class164.field2886.field2781 != -1) {
                                    var62 = class164.field2886.field2781;
                                } else if ((arg2 + var52 & 0x4) == (arg4 + var13 & 0x4)) {
                                    var62 = class159.field2810[class82.field1515 + 1];
                                } else {
                                    var62 = 4936552;
                                }
                                if (var58 < 0 || var58 > var46.length - 1) {
                                    if (var62 == 0) {
                                        var62 = 1;
                                    }
                                    class75.method517(var47, var56, var42, var55, var62);
                                    continue;
                                }
                            } else {
                                var62 = var46[var58][var61];
                            }
                            int var63 = var45[var58] == null ? 0 : class159.field2810[var45[var58][var61] & 0xFF];
                            int var64 = var48[var58] == null ? 0 : class159.field2810[var48[var58][var61] & 0xFF];
                            if (var62 == 0) {
                                var62 = 1;
                            }
                            if (var63 == 0 && var64 == 0) {
                                class75.method517(var47, var56, var42, var55, var62);
                            } else {
                                if (var63 != 0) {
                                    if (var63 == -1) {
                                        var63 = 1;
                                    }
                                    byte var65 = var49[var58] == null ? 0 : var49[var58][var61];
                                    int var66 = var65 & 0xFC;
                                    if (var66 == 0 || var42 <= 1 || var55 <= 1) {
                                        class75.method517(var47, var56, var42, var55, var63);
                                    } else {
                                        class32.method189(var63, true, var47, class75.field1397, var56, 0, var62, var55, var65 & 0x3, var42, var66 >> 2);
                                    }
                                }
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = var62;
                                    }
                                    byte var67 = var50[var58][var61];
                                    int var68 = var67 & 0xFC;
                                    if (var68 == 0 || var42 <= 1 || var55 <= 1) {
                                        class75.method517(var47, var56, var42, var55, var64);
                                    }
                                    class32.method189(var64, var63 == 0, var47, class75.field1397, var56, 0, 0, var55, var67 & 0x3, var42, var68 >> 2);
                                }
                            }
                            if (var51[var58] != null) {
                                int var69 = var51[var58][var61] & 0xFF;
                                if (var69 != 0) {
                                    int var70;
                                    if (var42 == 1) {
                                        var70 = var47;
                                    } else {
                                        var70 = var44 - 1;
                                    }
                                    int var71 = 13421772;
                                    int var72;
                                    if (var55 == 1) {
                                        var72 = var56;
                                    } else {
                                        var72 = var57 - 1;
                                    }
                                    if (var69 >= 5 && var69 <= 8 || var69 >= 13 && var69 <= 16 || var69 >= 21 && var69 <= 24 || var69 == 27 || var69 == 28) {
                                        var71 = 13369344;
                                        var69 -= 4;
                                    }
                                    if (var69 == 1) {
                                        class75.method508(var47, var56, var55, var71);
                                    } else if (var69 == 2) {
                                        class75.method505(var47, var56, var42, var71);
                                    } else if (var69 == 3) {
                                        class75.method508(var70, var56, var55, var71);
                                    } else if (var69 == 4) {
                                        class75.method505(var47, var72, var42, var71);
                                    } else if (var69 == 9) {
                                        class75.method508(var47, var56, var55, 16777215);
                                        class75.method505(var47, var56, var42, var71);
                                    } else if (var69 == 10) {
                                        class75.method508(var70, var56, var55, 16777215);
                                        class75.method505(var47, var56, var42, var71);
                                    } else if (var69 == 11) {
                                        class75.method508(var70, var56, var55, 16777215);
                                        class75.method505(var47, var72, var42, var71);
                                    } else if (var69 == 12) {
                                        class75.method508(var47, var56, var55, 16777215);
                                        class75.method505(var47, var72, var42, var71);
                                    } else if (var69 == 17) {
                                        class75.method505(var47, var56, 1, var71);
                                    } else if (var69 == 18) {
                                        class75.method505(var70, var56, 1, var71);
                                    } else if (var69 == 19) {
                                        class75.method505(var70, var72, 1, var71);
                                    } else if (var69 == 20) {
                                        class75.method505(var47, var72, 1, var71);
                                    } else if (var69 == 25) {
                                        for (int var73 = 0; var73 < var55; var73++) {
                                            class75.method505(var47 + var73, -var73 + var72, 1, var71);
                                        }
                                    } else if (var69 == 26) {
                                        for (int var74 = 0; var74 < var55; var74++) {
                                            class75.method505(var47 + var74, var56 - -var74, 1, var71);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg0 + var40;
                    int var76 = arg0 + var41;
                    for (int var77 = 0; var77 < var11; var77++) {
                        int var78;
                        if (class164.field2886.field2781 != -1) {
                            var78 = class164.field2886.field2781;
                        } else if ((arg2 + var77 & 0x4) == (arg4 + var13 & 0x4)) {
                            var78 = class159.field2810[class82.field1515 + 1];
                        } else {
                            var78 = 4936552;
                        }
                        if (var78 == 0) {
                            var78 = 1;
                        }
                        int var79 = ((var77 + 1) * arg10 + arg1 >> 16) + arg3;
                        int var80 = (arg10 * var77 + arg1 >> 16) + arg3;
                        int var81 = var79 - var80;
                        class75.method517(var76, var80, var42, var81, var78);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < (var12 + 2); var14++) {
            int var15 = arg8 * var14 + arg7 >> 16;
            int var16 = (var14 + 1) * arg8 + arg7 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg0 + var15;
                int var19 = var14 + arg4 >> 6;
                var10000 = arg0 + var16;
                if (var19 >= 0 && class69.field1263.length - 1 >= var19) {
                    int[][] var21 = class69.field1263[var19];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = arg1 + (arg10 * var22) >> 16;
                        int var24 = (var22 + 1) * arg10 + arg1 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg3 + var24;
                            int var27 = arg2 + var22 >> 6;
                            int var28 = arg3 + var23;
                            if (var27 >= 0 && var27 <= var21.length - 1) {
                                int var29 = ((var22 + arg2 & 0x3F) << 6) + (arg4 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29];
                                    int var31 = var30 & 0x3FFF;
                                    if (var31 != 0) {
                                        class259 var32 = class124.method910((byte) 72, var31 - 1);
                                        int var33 = (var30 & 0xCED8) >> 14;
                                        class173 var34 = var32.method1747(119, var33);
                                        if (var34 != null) {
                                            int var35 = var34.field3541 * var17 / 4;
                                            int var36 = var34.field3538 * var25 / 4;
                                            if (var32.field4656) {
                                                int var37 = (var30 & 0xF00E1B) >> 20;
                                                int var38 = var30 >> 16 & 0xF;
                                                if ((var33 & 0x1) == 1) {
                                                    int var39 = var38;
                                                    var38 = var37;
                                                    var37 = var39;
                                                }
                                                var36 = var25 * var37;
                                                var35 = var17 * var38;
                                            }
                                            if (var35 != 0 && var36 != 0) {
                                                if (var32.field4661 == 0) {
                                                    var34.method1239(var18, var25 + var28 - var36, var35, var36);
                                                } else {
                                                    var34.method1240(var18, var28 + var25 - var36, var35, var36, var32.field4661);
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
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method923(int arg0) {
        if (arg0 < 40) {
            field2239 = null;
        }
        field2229++;
        class63.field1128.method300(0);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method924(int arg0) {
        field2233 = null;
        if (arg0 <= 107) {
            field2233 = null;
        }
        field2241 = null;
        field2236 = null;
        field2234 = null;
        field2231 = null;
        field2232 = null;
        field2238 = null;
        field2239 = null;
        field2235 = null;
        field2228 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBLcf;)V")
    public static final void method925(int arg0, byte arg1, class93 arg2) {
        if (arg1 != -41) {
            method925(-46, (byte) -118, (class93) null);
        }
        class212 var3 = class123.method905(-1205364448, 2, arg0);
        field2227++;
        var3.method1493(arg1 + 54);
        var3.field3895 = arg2;
    }
}
