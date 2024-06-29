import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class63 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public int field971 = -1;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public int field976 = -1;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public int field972 = 0;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public int field974 = -1;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field969 = 0;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field980 = -1;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field986 = 0;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public int field991 = 0;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public int field973 = -1;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public int field987 = -1;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public int field984 = 0;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public int field970 = -1;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public int field997 = -1;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public int field982 = 0;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public int field996 = 0;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public int field981 = 0;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public int field995 = -1;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field990 = -1;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public int field978 = -1;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public int field993 = 0;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public int field1003 = -1;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field989 = -1;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field968 = -1;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public int field1001 = -1;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public int field1005 = 0;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public int field1004 = -1;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field977 = new String[100];

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "[I")
    public static int[] field1000 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "Lob;")
    public static class292 field994 = null;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[Lfk;")
    public static class45[] field979;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "[[I")
    public int[][] field1002;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIBIIII)V", line = 8)
    public static final void method450(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field967++;
        if (arg4 <= 65) {
            field979 = (class45[]) null;
        }
        int var9 = arg1 - arg7;
        int var10 = arg6 - arg8;
        int var11 = (arg2 - arg5 << 16) / var10;
        int var12 = (arg3 - arg0 << 16) / var9;
        class274.method1972(arg7, 0, var12, arg6, arg5, arg1, 0, var11, arg0, arg8, (byte) 60);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIIIII)V", line = 38)
    public static final void method451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1007++;
        int var11 = arg6 - arg0;
        if (class79.field1208 > arg6) {
            var11++;
        }
        int var12 = arg7 - arg9;
        if (arg7 < class279.field4316) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = arg8 + ((var13 + 1) * arg3) >> 16;
            int var15 = arg3 * var13 + arg8 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = arg0 + var13 >> 6;
                if (var17 >= 0 && var17 <= (class222.field3562.length - 1)) {
                    int var18 = arg4 + var15;
                    byte[][] var19 = class276.field4279[var17];
                    int var20 = arg4 + var14;
                    int[][] var21 = class222.field3562[var17];
                    byte[][] var22 = class168.field2607[var17];
                    byte[][] var23 = class195.field3110[var17];
                    byte[][] var24 = class139.field2218[var17];
                    byte[][] var25 = class151.field2432[var17];
                    for (int var26 = 0; var26 < var12; var26++) {
                        int var27 = arg10 * var26 + arg1 >> 16;
                        int var28 = (var26 + 1) * arg10 + arg1 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg5 + var27;
                            int var31 = arg5 + var28;
                            int var32 = arg9 + var26 >> 6;
                            int var33 = arg9 + var26 & 0x3F;
                            int var34 = arg0 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var32 < 0 || var21.length - 1 < var32 || var21[var32] == null) {
                                if (class81.field1222.field2640 != -1) {
                                    var36 = class81.field1222.field2640;
                                } else if ((var26 + arg9 & 0x4) == (arg0 + var13 & 0x4)) {
                                    var36 = class23.field403[class137.field2178 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var32 < 0 || (var21.length - 1) < var32) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class182.method1360(var18, var30, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var21[var32][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var19[var32] == null ? 0 : class23.field403[var19[var32][var35] & 0xFF];
                            int var38 = var22[var32] == null ? 0 : class23.field403[var22[var32][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class182.method1360(var18, var30, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var23[var32] == null ? 0 : var23[var32][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class182.method1360(var18, var30, var16, var29, var37);
                                    } else {
                                        class259.method1829(var40 >> 2, var18, var37, var39 & 0x3, class182.field2913, var16, var29, var30, var36, (byte) 24, true);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var32][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class182.method1360(var18, var30, var16, var29, var38);
                                    }
                                    class259.method1829(var42 >> 2, var18, var38, var41 & 0x3, class182.field2913, var16, var29, var30, 0, (byte) 24, var37 == 0);
                                }
                            }
                            if (var25[var32] != null) {
                                int var43 = var25[var32][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var20 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var30;
                                    } else {
                                        var45 = var31 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var46 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class182.method1366(var18, var30, var29, var46);
                                    } else if (var43 == 2) {
                                        class182.method1350(var18, var30, var16, var46);
                                    } else if (var43 == 3) {
                                        class182.method1366(var44, var30, var29, var46);
                                    } else if (var43 == 4) {
                                        class182.method1350(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class182.method1366(var18, var30, var29, 16777215);
                                        class182.method1350(var18, var30, var16, var46);
                                    } else if (var43 == 10) {
                                        class182.method1366(var44, var30, var29, 16777215);
                                        class182.method1350(var18, var30, var16, var46);
                                    } else if (var43 == 11) {
                                        class182.method1366(var44, var30, var29, 16777215);
                                        class182.method1350(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class182.method1366(var18, var30, var29, 16777215);
                                        class182.method1350(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class182.method1350(var18, var30, 1, var46);
                                    } else if (var43 == 18) {
                                        class182.method1350(var44, var30, 1, var46);
                                    } else if (var43 == 19) {
                                        class182.method1350(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class182.method1350(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class182.method1350(var18 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class182.method1350(var18 + var48, var30 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg4 + var15;
                    for (int var50 = 0; var50 < var12; var50++) {
                        int var51;
                        if (class81.field1222.field2640 != -1) {
                            var51 = class81.field1222.field2640;
                        } else if ((arg0 + var13 & 0x4) == (arg9 + var50 & 0x4)) {
                            var51 = class23.field403[class137.field2178 + 1];
                        } else {
                            var51 = 4936552;
                        }
                        if (var51 == 0) {
                            var51 = 1;
                        }
                        int var52 = ((var50 + 1) * arg10 + arg1 >> 16) + arg5;
                        int var53 = (arg10 * var50 + arg1 >> 16) + arg5;
                        int var54 = var52 - var53;
                        class182.method1360(var49, var53, var16, var54, var51);
                    }
                    var10000 = arg4 + var14;
                }
            }
        }
        for (int var56 = arg2; var56 < var11 + 2; var56++) {
            int var57 = arg3 * var56 + arg8 >> 16;
            int var58 = (var56 + 1) * arg3 + arg8 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg4 + var57;
                var10000 = arg4 + var58;
                int var62 = arg0 + var56 >> 6;
                if (var62 >= 0 && class210.field3362.length - 1 >= var62) {
                    int[][] var63 = class210.field3362[var62];
                    for (int var64 = -2; var64 < (var12 + 2); var64++) {
                        int var65 = (var64 + 1) * arg10 + arg1 >> 16;
                        int var66 = arg10 * var64 + arg1 >> 16;
                        int var67 = var65 - var66;
                        if (var67 > 0) {
                            var10000 = arg5 + var65;
                            int var69 = arg5 + var66;
                            int var70 = arg9 + var64 >> 6;
                            if (var70 >= 0 && var63.length - 1 >= var70) {
                                int var71 = ((arg9 + var64 & 0x3F) << 6) + (var56 + arg0 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x3FFF;
                                    if (var73 != 0) {
                                        int var74 = (var72 & 0xC2B3) >> 14;
                                        class29 var75 = class210.method1531(var73 - 1, (byte) -79);
                                        class315 var76 = var75.method194(-8490, var74);
                                        if (var76 != null) {
                                            int var77 = var76.field4264 * var59 / 4;
                                            int var78 = var76.field4256 * var67 / 4;
                                            if (var75.field472) {
                                                int var79 = var72 >> 16 & 0xF;
                                                int var80 = var72 >> 20 & 0xF;
                                                if ((var74 & 0x1) == 1) {
                                                    int var81 = var79;
                                                    var79 = var80;
                                                    var80 = var81;
                                                }
                                                var77 = var59 * var79;
                                                var78 = var67 * var80;
                                            }
                                            if (var77 != 0 && var78 != 0) {
                                                if (var75.field471 == 0) {
                                                    var76.method2170(var60, var69 + var67 - var78, var77, var78);
                                                } else {
                                                    var76.method2165(var60, var69 + var67 - var78, var77, var78, var75.field471);
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

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILpe;)V", line = 457)
    private final void method452(int arg0, int arg1, class101 arg2) {
        field992++;
        if (arg1 == 1) {
            this.field970 = arg2.method731(false);
            this.field1001 = arg2.method731(false);
            if (this.field970 == 65535) {
                this.field970 = -1;
            }
            if (this.field1001 == 65535) {
                this.field1001 = -1;
            }
        } else if (arg1 == 2) {
            this.field971 = arg2.method731(false);
        } else if (arg1 == 3) {
            this.field973 = arg2.method731(false);
        } else if (arg1 == 4) {
            this.field995 = arg2.method731(false);
        } else if (arg1 == 5) {
            this.field980 = arg2.method731(false);
        } else if (arg1 == 6) {
            this.field989 = arg2.method731(false);
        } else if (arg1 == 7) {
            this.field987 = arg2.method731(false);
        } else if (arg1 == 8) {
            this.field974 = arg2.method731(false);
        } else if (arg1 == 9) {
            this.field1004 = arg2.method731(false);
        } else if (arg1 == 26) {
            this.field996 = (short) (arg2.method741(123) * 4);
            this.field982 = (short) (arg2.method741(24) * 4);
        } else if (arg1 == 27) {
            if (this.field1002 == null) {
                this.field1002 = new int[12][];
            }
            int var4 = arg2.method741(63);
            this.field1002[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field1002[var4][var5] = arg2.method780(-17432);
            }
        } else if (arg1 == 29) {
            this.field993 = arg2.method741(89);
        } else if (arg1 == 30) {
            this.field969 = arg2.method731(false);
        } else if (arg1 == 31) {
            this.field986 = arg2.method741(14);
        } else if (arg1 == 32) {
            this.field1005 = arg2.method731(false);
        } else if (arg1 == 33) {
            this.field972 = arg2.method780(-17432);
        } else if (arg1 == 34) {
            this.field984 = arg2.method741(72);
        } else if (arg1 == 35) {
            this.field981 = arg2.method731(false);
        } else if (arg1 == 36) {
            this.field991 = arg2.method780(-17432);
        } else if (arg1 == 37) {
            this.field1003 = arg2.method741(45);
        } else if (arg1 == 38) {
            this.field978 = arg2.method731(false);
        } else if (arg1 == 39) {
            this.field990 = arg2.method731(false);
        } else if (arg1 == 40) {
            this.field976 = arg2.method731(false);
        } else if (arg1 == 41) {
            this.field968 = arg2.method731(false);
        } else if (arg1 == 42) {
            this.field997 = arg2.method731(false);
        } else if (arg1 == 43) {
            arg2.method731(false);
        } else if (arg1 == 44) {
            arg2.method731(false);
        } else if (arg1 == 45) {
            arg2.method731(false);
        }
        if (arg0 > -54) {
            method450(93, 27, -112, 38, (byte) -83, 61, 28, 31, 11);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BII)V", line = 620)
    public static final void method453(byte arg0, int arg1, int arg2) {
        if (arg0 > 97) {
            field983++;
            class4 var3 = class67.method510(1, 12, arg2);
            var3.method14(24710);
            var3.field20 = arg1;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 643)
    public static final void method454(int arg0) {
        field975++;
        class82.field1225.method1837(39);
        int var1 = 126 % ((arg0 - 58) / 51);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([Ljava/lang/String;IIZ)Ljava/lang/String;", line = 667)
    public static final String method455(String[] arg0, int arg1, int arg2, boolean arg3) {
        field999++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            if (arg3) {
                field979 = (class45[]) null;
            }
            int var5 = arg2 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var8 = arg0[var7];
                if (var8 == null) {
                    var6 += 4;
                } else {
                    var6 += var8.length();
                }
            }
            StringBuffer var9 = new StringBuffer(var6);
            for (int var10 = arg1; var10 < var5; var10++) {
                String var11 = arg0[var10];
                if (var11 == null) {
                    var9.append("null");
                } else {
                    var9.append(var11);
                }
            }
            return var9.toString();
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 733)
    public static void method456(int arg0) {
        field994 = null;
        field977 = null;
        field1000 = null;
        field979 = null;
        if (arg0 != 128) {
            field979 = (class45[]) null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 813)
    public final void method457(int arg0) {
        if (arg0 == -13258) {
            field1006++;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lpe;B)V", line = 824)
    public final void method458(class101 arg0, byte arg1) {
        field988++;
        if (arg1 < 30) {
            method456(-6);
        }
        while (true) {
            int var3 = arg0.method741(127);
            if (var3 == 0) {
                return;
            }
            this.method452(-59, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([[BB[[I[[[B[[F[[II[[B[[F[[I[[B[[I[[F[[B[[I)[Ldb;", line = 856)
    public static final class186[] method459(byte[][] arg0, byte arg1, int[][] arg2, byte[][][] arg3, float[][] arg4, int[][] arg5, int arg6, byte[][] arg7, float[][] arg8, int[][] arg9, byte[][] arg10, int[][] arg11, float[][] arg12, byte[][] arg13, int[][] arg14) {
        field998++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg0[var16][var17];
                if (var18 == 0) {
                    var18 = arg0[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg0[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg0[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class261 var19 = class263.method1869((var18 & 0xFF) - 1, -832959923);
                    var15[var16][var17] = (var19.field4055 + 1 << 16) + var19.field4053;
                }
            }
        }
        class110 var20 = new class110(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg0[var21][var22] != 0) {
                    int[] var23;
                    if (arg13[var21][var22] == 0) {
                        var23 = class307.field4823[0];
                    } else {
                        var23 = class94.field1529[arg7[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    if (arg9 != null) {
                        var24 = arg9[var21][var22] & 0xFFFFFF;
                    }
                    int var25 = var15[var21 + 1][var22];
                    int var26 = var15[var21][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    long var29 = (long) var26 << 32 | (long) var24;
                    long var31 = (long) var24 | (long) var25 << 32;
                    long var33 = (long) var24 | (long) var27 << 32;
                    long var35 = (long) var28 << 32 | (long) var24;
                    int var37 = var23.length / 2;
                    class186 var38 = (class186) var20.method833(false, var29);
                    if (var38 == null) {
                        var38 = new class186((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg14 != null, var24);
                        var20.method845(var38, (byte) 80, var29);
                    }
                    var38.field2960++;
                    var38.field2963 += var37;
                    if (var29 != var31) {
                        class186 var39 = (class186) var20.method833(false, var31);
                        if (var39 == null) {
                            var39 = new class186((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg14 != null, var24);
                            var20.method845(var39, (byte) -111, var31);
                        }
                        var39.field2960++;
                        var39.field2963 += var37;
                    }
                    if (var29 != var33 && var31 != var33) {
                        class186 var40 = (class186) var20.method833(false, var33);
                        if (var40 == null) {
                            var40 = new class186((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg14 != null, var24);
                            var20.method845(var40, (byte) -55, var33);
                        }
                        var40.field2960++;
                        var40.field2963 += var37;
                    }
                    if (var29 != var35 && var31 != var35 && var33 != var35) {
                        class186 var41 = (class186) var20.method833(false, var35);
                        if (var41 == null) {
                            var41 = new class186((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg14 != null, var24);
                            var20.method845(var41, (byte) 100, var35);
                        }
                        var41.field2963 += var37;
                        var41.field2960++;
                    }
                }
            }
        }
        for (class186 var42 = (class186) var20.method841(0); var42 != null; var42 = (class186) var20.method842((byte) -40)) {
            var42.method1398();
        }
        int var43 = 1;
        if (arg1 <= 63) {
            return (class186[]) null;
        }
        while (var43 <= 102) {
            for (int var44 = 1; var44 <= 102; var44++) {
                byte var45 = arg0[var43][var44];
                if (var45 != 0) {
                    int var46;
                    if ((arg3[arg6][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg3[1][var43][var44] & 0x2) == 2 && arg6 > 0) {
                        var46 = arg6 - 1;
                    } else {
                        var46 = arg6;
                    }
                    int var47 = 0;
                    int var48 = 128;
                    if (arg9 != null) {
                        var47 = arg9[var43][var44] & 0xFFFFFF;
                        var48 = arg9[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var49 = null;
                    byte var50;
                    int[] var51;
                    if (arg13[var43][var44] == 0) {
                        var51 = class307.field4823[0];
                        byte var52 = 0;
                        int var53 = var52 + (arg0[var43 - 1][var44 - 1] == var45 ? 1 : -1);
                        byte var54 = 0;
                        byte var55 = 0;
                        int var56 = var55 + (arg0[var43 + 1][var44 + 1] == var45 ? 1 : -1);
                        byte var57 = 0;
                        int var58 = var57 + (arg0[var43 - 1][var44 + 1] == var45 ? 1 : -1);
                        int var59 = var54 + (arg0[var43 + 1][var44 - 1] == var45 ? 1 : -1);
                        if (arg0[var43][var44 - 1] == var45) {
                            var53++;
                            var59++;
                        } else {
                            var53--;
                            var59--;
                        }
                        if (arg0[var43 + 1][var44] == var45) {
                            var59++;
                            var56++;
                        } else {
                            var59--;
                            var56--;
                        }
                        if (arg0[var43][var44 + 1] == var45) {
                            var56++;
                            var58++;
                        } else {
                            var58--;
                            var56--;
                        }
                        if (arg0[var43 - 1][var44] == var45) {
                            var58++;
                            var53++;
                        } else {
                            var58--;
                            var53--;
                        }
                        int var60 = var53 - var56;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        int var61 = var59 - var58;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        var50 = (byte) (var61 <= var60 ? 0 : 1);
                        arg10[var43][var44] = var50;
                    } else {
                        var50 = arg10[var43][var44];
                        var51 = class94.field1529[arg7[var43][var44]];
                        var49 = class107.field1785[arg7[var43][var44]];
                        if (var51.length == 0) {
                            continue;
                        }
                    }
                    int var62 = var15[var43][var44];
                    int var63 = var15[var43 + 1][var44];
                    int var64 = var15[var43][var44 + 1];
                    long var65 = (long) var47 | (long) var62 << 32;
                    long var67 = (long) var63 << 32 | (long) var47;
                    int var69 = var15[var43 + 1][var44 + 1];
                    long var70 = (long) var69 << 32 | (long) var47;
                    int var72 = arg5[var43][var44];
                    long var73 = (long) var64 << 32 | (long) var47;
                    int var75 = arg5[var43 + 1][var44];
                    int var76 = arg5[var43][var44 + 1];
                    int var77 = arg5[var43 + 1][var44 + 1];
                    int var78 = arg2[var43][var44];
                    int var79 = arg2[var43 + 1][var44 + 1];
                    int var80 = arg2[var43][var44 + 1];
                    int var81 = arg2[var43 + 1][var44];
                    int var82 = (var62 >> 16) - 1;
                    int var83 = (var69 >> 16) - 1;
                    int var84 = (var64 >> 16) - 1;
                    int var85 = (var63 >> 16) - 1;
                    class186 var86 = (class186) var20.method833(false, var65);
                    class104.method801(var63 >= var62, arg14, var86, var48, class86.method616(var79, -120, var82, var77), (byte) -111, arg8, arg12, arg4, class86.method616(var81, 126, var82, var75), var44, var62 <= var64, var62 <= var62, var46, var49, class86.method616(var80, -115, var82, var76), var51, var43, var69 >= var62, var50, arg11, class86.method616(var78, -115, var82, var72));
                    if (var65 != var67) {
                        class186 var87 = (class186) var20.method833(false, var67);
                        class104.method801(var63 <= var63, arg14, var87, var48, class86.method616(var79, 96, var85, var77), (byte) -111, arg8, arg12, arg4, class86.method616(var81, 43, var85, var75), var44, var63 <= var64, var62 >= var63, var46, var49, class86.method616(var80, -108, var85, var76), var51, var43, var69 >= var63, var50, arg11, class86.method616(var78, -111, var85, var72));
                    }
                    if (var65 != var70 && var67 != var70) {
                        class186 var88 = (class186) var20.method833(false, var70);
                        class104.method801(var63 >= var69, arg14, var88, var48, class86.method616(var79, -123, var83, var77), (byte) -111, arg8, arg12, arg4, class86.method616(var81, 23, var83, var75), var44, var64 >= var69, var69 <= var62, var46, var49, class86.method616(var80, -119, var83, var76), var51, var43, var69 >= var69, var50, arg11, class86.method616(var78, 81, var83, var72));
                    }
                    if (var65 != var73 && var67 != var73 && var70 != var73) {
                        class186 var89 = (class186) var20.method833(false, var73);
                        class104.method801(var63 >= var64, arg14, var89, var48, class86.method616(var79, 101, var84, var77), (byte) -111, arg8, arg12, arg4, class86.method616(var81, -128, var84, var75), var44, var64 <= var64, var64 <= var62, var46, var49, class86.method616(var80, 108, var84, var76), var51, var43, var64 <= var69, var50, arg11, class86.method616(var78, -118, var84, var72));
                    }
                }
            }
            var43++;
        }
        for (class186 var90 = (class186) var20.method841(0); var90 != null; var90 = (class186) var20.method842((byte) -40)) {
            if (var90.field2958 == 0) {
                var90.method1701(-77);
            } else {
                var90.method1396();
            }
        }
        int var91 = var20.method844(5);
        class186[] var92 = new class186[var91];
        long[] var93 = new long[var91];
        var20.method832(var92, 127);
        for (int var94 = 0; var94 < var91; var94++) {
            var93[var94] = var92[var94].field3734;
        }
        class323.method2207(var93, var92, (byte) -96);
        return var92;
    }
}
