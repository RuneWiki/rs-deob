import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class43 extends class247 {

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Llc;")
    public class160 field741 = new class160();

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Lig;")
    public class172 field753 = new class172();

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "Lcl;")
    private class128 field751;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "Lok;")
    public static class146 field742 = class235.method1724(-12908, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "Lok;")
    public static class146 field747 = class235.method1724(-12908, "");

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "Z")
    public static boolean field745 = false;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Lok;")
    public static class146 field748 = class235.method1724(-12908, "; Max)2Age=");

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field734 = 0;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "Lr;")
    public static class264 field738;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[[B")
    public static byte[][] field735;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILad;)V", line = 4)
    public static final void method297(int arg0, class124 arg1) {
        class74.method546(200000, -1413, arg1);
        if (arg0 != 3335) {
            method300(-37);
        }
        field752++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()Lt;", line = 21)
    public final class247 method298() {
        field749++;
        class51 var1;
        do {
            var1 = (class51) this.field741.method1253(28);
            if (var1 == null) {
                return null;
            }
        } while (var1.field923 == null);
        return var1.field923;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III[ILbj;I)V", line = 44)
    private final void method299(int arg0, int arg1, int arg2, int[] arg3, class51 arg4, int arg5) {
        field744++;
        int var7 = -52 / ((25 - arg5) / 59);
        if ((this.field751.field2091[arg4.field934] & 0x4) != 0 && arg4.field911 < 0) {
            int var8 = this.field751.field2075[arg4.field934] / class218.field3594;
            while (true) {
                int var9 = (var8 + 1048575 - arg4.field931) / var8;
                if (var9 > arg0) {
                    arg4.field931 += arg0 * var8;
                    break;
                }
                arg4.field923.method307(arg3, arg2, var9);
                int var10 = class218.field3594 / 100;
                arg0 -= var9;
                arg2 += var9;
                class149 var11 = arg4.field923;
                arg4.field931 += var8 * var9 - 1048576;
                int var12 = 262144 / var8;
                if (var12 < var10) {
                    var10 = var12;
                }
                if (this.field751.field2117[arg4.field934] == 0) {
                    arg4.field923 = class149.method1170(arg4.field912, var11.method1176(), var11.method1160(), var11.method1145());
                } else {
                    arg4.field923 = class149.method1170(arg4.field912, var11.method1176(), 0, var11.method1145());
                    this.field751.method904(arg4.field926.field1475[arg4.field922] < 0, -86, arg4);
                    arg4.field923.method1161(var10, var11.method1160());
                }
                if (arg4.field926.field1475[arg4.field922] < 0) {
                    arg4.field923.method1153(-1);
                }
                var11.method1150(var10);
                var11.method307(arg3, arg2, arg1 - arg2);
                if (var11.method1175()) {
                    this.field753.method1329(var11);
                }
            }
        }
        arg4.field923.method307(arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V", line = 108)
    public static void method300(int arg0) {
        field738 = null;
        field748 = null;
        if (arg0 != -317337008) {
            method300(73);
        }
        field747 = null;
        field735 = (byte[][]) null;
        field742 = null;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()Lt;", line = 127)
    public final class247 method301() {
        class51 var1 = (class51) this.field741.method1251(92);
        field743++;
        if (var1 == null) {
            return null;
        } else if (var1.field923 == null) {
            return this.method298();
        } else {
            return var1.field923;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([Lan;[Lan;I[Ltg;[Lan;Loh;[Lan;)V", line = 147)
    public static final void method302(class315[] arg0, class315[] arg1, int arg2, class307[] arg3, class315[] arg4, class15 arg5, class315[] arg6) {
        class104.field1696 = arg4;
        class126.field2055 = arg5;
        class27.field468 = arg0;
        class13.field255 = arg6;
        class71.field1162 = arg1;
        field739++;
        class230.field3843 = arg3;
        class276.field4745 = new boolean[class230.field3843.length];
        class32.field601.method1257(2);
        int var7 = class126.field2055.method103(arg2 ^ 0x39, class232.field3879);
        int[] var8 = class126.field2055.method99(arg2 - 4576, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class32.field601.method1258(0, class25.method168(new class47(class126.field2055.method92(var7, 0, var8[var9])), (byte) 83));
        }
        if (arg2 != -1) {
            field738 = (class264) null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 178)
    public final void method303(int arg0) {
        this.field753.method303(arg0);
        field737++;
        for (class51 var2 = (class51) this.field741.method1251(-61); var2 != null; var2 = (class51) this.field741.method1253(124)) {
            if (!this.field751.method886((byte) -67, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field937) {
                        this.method305((byte) -105, var2, var3);
                        var2.field937 -= var3;
                        break;
                    }
                    this.method305((byte) -105, var2, var2.field937);
                    var3 -= var2.field937;
                } while (!this.field751.method900(var3, (int[]) null, var2, 0, 25688));
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()I", line = 218)
    public final int method304() {
        field746++;
        return 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLbj;I)V", line = 228)
    private final void method305(byte arg0, class51 arg1, int arg2) {
        if ((this.field751.field2091[arg1.field934] & 0x4) != 0 && arg1.field911 < 0) {
            int var4 = this.field751.field2075[arg1.field934] / class218.field3594;
            int var5 = (var4 + 1048575 - arg1.field931) / var4;
            arg1.field931 = arg2 * var4 + arg1.field931 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field751.field2117[arg1.field934] == 0) {
                    arg1.field923 = class149.method1170(arg1.field912, arg1.field923.method1176(), arg1.field923.method1160(), arg1.field923.method1145());
                } else {
                    arg1.field923 = class149.method1170(arg1.field912, arg1.field923.method1176(), 0, arg1.field923.method1145());
                    this.field751.method904(arg1.field926.field1475[arg1.field922] < 0, -113, arg1);
                }
                if (arg1.field926.field1475[arg1.field922] < 0) {
                    arg1.field923.method1153(-1);
                }
                arg2 = arg1.field931 / var4;
            }
        }
        arg1.field923.method303(arg2);
        field750++;
        if (arg0 != -105) {
            field747 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIBIIII)V", line = 280)
    public static final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field736++;
        int var11 = arg9 - arg5;
        if (arg9 < class118.field1916) {
            var11++;
        }
        int var12 = arg7 - arg10;
        if (arg7 < class33.field639) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = (var13 + 1) * arg1 + arg0 >> 16;
            int var15 = arg0 + (arg1 * var13) >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg5 + var13 >> 6;
                if (var17 >= 0 && var17 <= class206.field3446.length - 1) {
                    int var18 = arg8 + var15;
                    int[][] var19 = class206.field3446[var17];
                    byte[][] var20 = class277.field4762[var17];
                    int var21 = arg8 + var14;
                    byte[][] var22 = class137.field2288[var17];
                    byte[][] var23 = class33.field632[var17];
                    byte[][] var24 = class298.field5067[var17];
                    byte[][] var25 = class18.field363[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg4 * var26 + arg2 >> 16;
                        int var28 = (var26 + 1) * arg4 + arg2 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg3 + var27;
                            int var31 = arg10 + var26 >> 6;
                            int var32 = arg3 + var28;
                            int var33 = arg5 + var13 & 0x3F;
                            int var34 = arg10 + var26 & 0x3F;
                            int var35 = (var34 << 6) + var33;
                            int var36;
                            if (var31 < 0 || (var19.length - 1) < var31 || var19[var31] == null) {
                                if (class75.field1219.field3232 != -1) {
                                    var36 = class75.field1219.field3232;
                                } else if ((var13 + arg5 & 0x4) == (arg10 + var26 & 0x4)) {
                                    var36 = class190.field3150[class276.field4743 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || (var19.length - 1) < var31) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class181.method1416(var18, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var31][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var22[var31] == null ? 0 : class190.field3150[var22[var31][var35] & 0xFF];
                            int var38 = var23[var31] == null ? 0 : class190.field3150[var23[var31][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class181.method1416(var18, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var20[var31] == null ? 0 : var20[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class181.method1416(var18, var30, var16, var29, var37);
                                    } else {
                                        class9.method65((byte) -9, var18, var36, true, var30, var29, var39 & 0x3, var37, var16, class181.field3040, var40 >> 2);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var25[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class181.method1416(var18, var30, var16, var29, var38);
                                    }
                                    class9.method65((byte) -9, var18, 0, var37 == 0, var30, var29, var41 & 0x3, var38, var16, class181.field3040, var42 >> 2);
                                }
                            }
                            if (var24[var31] != null) {
                                int var43 = var24[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var21 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var30;
                                    } else {
                                        var45 = var32 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var46 = 13369344;
                                        var43 -= 4;
                                    }
                                    if (var43 == 1) {
                                        class181.method1433(var18, var30, var29, var46);
                                    } else if (var43 == 2) {
                                        class181.method1432(var18, var30, var16, var46);
                                    } else if (var43 == 3) {
                                        class181.method1433(var44, var30, var29, var46);
                                    } else if (var43 == 4) {
                                        class181.method1432(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class181.method1433(var18, var30, var29, 16777215);
                                        class181.method1432(var18, var30, var16, var46);
                                    } else if (var43 == 10) {
                                        class181.method1433(var44, var30, var29, 16777215);
                                        class181.method1432(var18, var30, var16, var46);
                                    } else if (var43 == 11) {
                                        class181.method1433(var44, var30, var29, 16777215);
                                        class181.method1432(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class181.method1433(var18, var30, var29, 16777215);
                                        class181.method1432(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class181.method1432(var18, var30, 1, var46);
                                    } else if (var43 == 18) {
                                        class181.method1432(var44, var30, 1, var46);
                                    } else if (var43 == 19) {
                                        class181.method1432(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class181.method1432(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class181.method1432(var18 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class181.method1432(var18 + var48, var30 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg8 + var14;
                    int var50 = arg8 + var15;
                    for (int var51 = 0; var51 < var12; var51++) {
                        int var52;
                        if (class75.field1219.field3232 != -1) {
                            var52 = class75.field1219.field3232;
                        } else if ((arg5 + var13 & 0x4) == (arg10 + var51 & 0x4)) {
                            var52 = class190.field3150[class276.field4743 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = (arg4 * var51 + arg2 >> 16) + arg3;
                        int var54 = ((var51 + 1) * arg4 + arg2 >> 16) + arg3;
                        int var55 = var54 - var53;
                        class181.method1416(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var11 + 2); var56++) {
            int var57 = (var56 + 1) * arg1 + arg0 >> 16;
            int var58 = arg1 * var56 + arg0 >> 16;
            int var59 = var57 - var58;
            if (var59 > 0) {
                int var60 = arg8 + var58;
                var10000 = arg8 + var57;
                int var62 = arg5 + var56 >> 6;
                if (var62 >= 0 && (class39.field693.length - 1) >= var62) {
                    short[][] var63 = class39.field693[var62];
                    for (int var64 = -2; var64 < var12 + 2; var64++) {
                        int var65 = arg4 * var64 + arg2 >> 16;
                        int var66 = arg2 + ((var64 + 1) * arg4) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg10 + var64 >> 6;
                            int var69 = arg3 + var65;
                            var10000 = arg3 + var66;
                            if (var68 >= 0 && var68 <= (var63.length - 1)) {
                                int var71 = (var64 + arg10 & 0x3F << 6) + (arg5 + var56 & 0x3F);
                                if (var63[var68] != null) {
                                    int var72 = var63[var68][var71] & 0x3FFF;
                                    int var73 = var63[var68][var71] >> 14 & 0x3;
                                    if (var72 != 0) {
                                        if (var73 == 0) {
                                            int var74 = class71.field1162[var72 - 1].field488 * var67 / 4;
                                            int var75 = class71.field1162[var72 - 1].field482 * var59 / 4;
                                            if (var75 != 0 && var74 != 0) {
                                                int var76 = class71.field1162[var72 - 1].field485 * var67 / 4;
                                                class71.field1162[var72 - 1].method2203(var60, var69 - var76, var75, var74);
                                            }
                                        } else if (var73 == 1) {
                                            int var83 = class13.field255[var72 - 1].field482 * var59 / 4;
                                            int var84 = class13.field255[var72 - 1].field488 * var67 / 4;
                                            if (var83 != 0 && var84 != 0) {
                                                int var85 = class13.field255[var72 - 1].field485 * var67 / 4;
                                                class13.field255[var72 - 1].method2203(var60, var69 - var85, var83, var84);
                                            }
                                        } else if (var73 == 2) {
                                            int var80 = class104.field1696[var72 - 1].field482 * var59 / 4;
                                            int var81 = class104.field1696[var72 - 1].field488 * var67 / 4;
                                            if (var80 != 0 && var81 != 0) {
                                                int var82 = class104.field1696[var72 - 1].field485 * var67 / 4;
                                                class104.field1696[var72 - 1].method2203(var60, var69 - var82, var80, var81);
                                            }
                                        } else if (var73 == 3) {
                                            int var77 = class27.field468[var72 - 1].field482 * var59 / 4;
                                            int var78 = class27.field468[var72 - 1].field488 * var67 / 4;
                                            if (var77 != 0 && var78 != 0) {
                                                int var79 = class27.field468[var72 - 1].field485 * var67 / 4;
                                                class27.field468[var72 - 1].method2203(var60, var69 - var79, var77, var78);
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
        if (arg6 != 9) {
            method302((class315[]) null, (class315[]) null, -16, (class307[]) null, (class315[]) null, (class15) null, (class315[]) null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "([III)V", line = 725)
    public final void method307(int[] arg0, int arg1, int arg2) {
        this.field753.method307(arg0, arg1, arg2);
        for (class51 var4 = (class51) this.field741.method1251(81); var4 != null; var4 = (class51) this.field741.method1253(106)) {
            if (!this.field751.method886((byte) -50, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field937 >= var6) {
                        this.method299(var6, var5 + var6, var5, arg0, var4, 100);
                        var4.field937 -= var6;
                        break;
                    }
                    this.method299(var4.field937, var5 + var6, var5, arg0, var4, 117);
                    var6 -= var4.field937;
                    var5 += var4.field937;
                } while (!this.field751.method900(var6, arg0, var4, var5, 25688));
            }
        }
        field754++;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lcl;)V", line = 780)
    public class43(class128 arg0) {
        this.field751 = arg0;
    }
}
