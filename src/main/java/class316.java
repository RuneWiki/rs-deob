import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class316 extends class310 {

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    private int field5032 = 1024;

    @OriginalMember(owner = "client!uo", name = "V", descriptor = "I")
    private int field5042 = 1024;

    @OriginalMember(owner = "client!uo", name = "Z", descriptor = "I")
    private int field5046 = 0;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    private int field5036 = 409;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    private int field5041 = 2048;

    @OriginalMember(owner = "client!uo", name = "Y", descriptor = "I")
    private int field5045 = 819;

    @OriginalMember(owner = "client!uo", name = "ab", descriptor = "I")
    private int field5047 = 1024;

    @OriginalMember(owner = "client!uo", name = "bb", descriptor = "I")
    private int field5048 = 0;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "I")
    private int field5040 = 1024;

    @OriginalMember(owner = "client!uo", name = "W", descriptor = "Lil;")
    public static class295 field5043 = new class295(0, 0);

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "I")
    private int field5039;

    @OriginalMember(owner = "client!uo", name = "X", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!uo", name = "cb", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!uo", name = "db", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "Lth;")
    public static class57 field5034;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V", line = 10)
    public static final void method2238(byte arg0) {
        class326.field5176.method2327(1);
        class232.field3843.method2327(arg0 - 49);
        field5038++;
        if (arg0 != 50) {
            method2238((byte) 3);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lqm;II)V", line = 22)
    public final void method75(class227 arg0, int arg1, int arg2) {
        field5044++;
        if (arg1 != -2470) {
            return;
        }
        if (arg2 == 0) {
            this.field5048 = arg0.method1720((byte) -22);
        } else if (arg2 == 1) {
            this.field5042 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field5041 = arg0.method1765(true);
        } else if (arg2 == 3) {
            this.field5036 = arg0.method1765(true);
        } else if (arg2 == 4) {
            this.field5045 = arg0.method1765(true);
        } else if (arg2 == 5) {
            this.field5040 = arg0.method1765(true);
        } else if (arg2 == 6) {
            this.field5046 = arg0.method1720((byte) -73);
        } else if (arg2 == 7) {
            this.field5032 = arg0.method1765(true);
        } else if (arg2 == 8) {
            this.field5047 = arg0.method1765(true);
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V", line = 972)
    public class316() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V", line = 127)
    public static final void method2239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg5 && arg6 == arg9 && arg2 == arg8 && arg3 == arg4) {
            class198.method1526(arg5, arg9, arg2, arg3, arg7, (byte) -70);
        } else {
            int var10 = arg9;
            int var11 = arg5;
            int var12 = arg5 * 3;
            int var13 = arg9 * 3;
            int var14 = arg1 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg4 * 3;
            int var18 = arg2 + var14 - arg5 - var16;
            int var19 = var15 + arg3 - arg9 - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = (var29 + var31 + var27 >> 12) + arg5;
                int var33 = var23 * var24;
                int var34 = (var28 + var30 + var33 >> 12) + arg9;
                class198.method1526(var11, var10, var32, var34, arg7, (byte) -70);
                var11 = var32;
                var10 = var34;
            }
        }
        field5049++;
        if (arg0 < 86) {
            method2238((byte) 73);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([[F[[B[[I[[B[[F[[FB[[BI[[B[Lfn;I)V", line = 204)
    public static final void method2240(float[][] arg0, byte[][] arg1, int[][] arg2, byte[][] arg3, float[][] arg4, float[][] arg5, byte arg6, byte[][] arg7, int arg8, byte[][] arg9, class314[] arg10, int arg11) {
        int var12 = 0;
        if (arg6 != -64) {
            method2239(57, 72, 71, 0, -83, 63, 22, -84, 120, 18);
        }
        while (var12 < arg11) {
            class314 var13 = arg10[var12];
            if (var13.field5007 == arg8) {
                class266 var14 = new class266();
                int var15 = (var13.field5008 >> 7) - var13.field4993;
                int var16 = 0;
                int var17 = (var13.field4999 >> 7) + var13.field4993;
                int var18 = (var13.field4999 >> 7) - var13.field4993;
                if (var18 < 0) {
                    var16 -= var18;
                    var18 = 0;
                }
                if (var17 > 103) {
                    var17 = 103;
                }
                int var19 = var18;
                while (true) {
                    if (var17 < var19) {
                        var14.method2023();
                        int var56 = 0;
                        if ((var13.field4999 >> 7) - var13.field4993 < 0) {
                            var56 -= (var13.field4999 >> 7) - var13.field4993;
                        }
                        for (int var57 = var18; var57 <= var17; var57++) {
                            short var58 = var13.field4992[var56];
                            int var59 = (var58 >> 8) + var15;
                            int var60 = (var58 & 0xFF) + var59 - 1;
                            if (var60 > 103) {
                                var60 = 103;
                            }
                            if (var59 < 0) {
                                var59 = 0;
                            }
                            for (int var61 = var59; var61 <= var60; var61++) {
                                int var62 = arg3[var61][var57] & 0xFF;
                                int var63 = arg1[var61][var57] & 0xFF;
                                byte var64 = arg7[var61][var57];
                                boolean var65 = false;
                                if (var62 == 0) {
                                    if (var63 == 0) {
                                        continue;
                                    }
                                    class31 var68 = class124.method974(-117, var63 - 1);
                                    if (var68.field440 == -1) {
                                        continue;
                                    }
                                    if (arg9[var61][var57] != 0) {
                                        class267.method2027(arg4, arg7[var61][var57], var13, arg2, var57, arg0, class21.field242[arg9[var61][var57]], var61, 110, arg5, var14);
                                        continue;
                                    }
                                } else if (var63 != 0) {
                                    class31 var66 = class124.method974(-82, var63 - 1);
                                    if (var66.field440 == -1) {
                                        class267.method2027(arg4, arg7[var61][var57], var13, arg2, var57, arg0, class111.field1812[arg9[var61][var57]], var61, 110, arg5, var14);
                                        continue;
                                    }
                                    byte var67 = arg9[var61][var57];
                                    if (var67 != 0) {
                                        var65 = true;
                                    }
                                }
                                class209 var69 = class353.method2496(arg8, var61, var57);
                                if (var69 != null) {
                                    int var70 = (int) (var69.field3279 >> 14) & 0x3F;
                                    if (var70 == 9) {
                                        int var71 = (int) (var69.field3279 >> 20) & 0x3;
                                        int[] var72 = null;
                                        if ((var71 & 0x1) == 0) {
                                            boolean var81 = var59 <= var61 - 1;
                                            if (!var81 && var17 >= (var57 + 1)) {
                                                short var82 = var13.field4992[var56 + 1];
                                                int var83 = (var82 >> 8) + var15;
                                                int var84 = var83 + (var82 & 0xFF);
                                                var81 = var83 < var61 && var61 < var84;
                                            }
                                            boolean var85 = var60 >= var61 + 1;
                                            if (!var85 && (var57 - 1) >= var18) {
                                                short var86 = var13.field4992[var56 - 1];
                                                int var87 = (var86 >> 8) + var15;
                                                int var88 = var87 + (var86 & 0xFF);
                                                var85 = var61 > var87 && var88 > var61;
                                            }
                                            if (var81 && var85) {
                                                var72 = class21.field242[0];
                                            } else if (var81) {
                                                var72 = class21.field242[1];
                                                var64 = 1;
                                            } else if (var85) {
                                                var64 = 3;
                                                var72 = class21.field242[1];
                                            }
                                        } else {
                                            boolean var73 = var61 - 1 >= var59;
                                            if (!var73 && var18 <= (var57 - 1)) {
                                                short var74 = var13.field4992[var56 - 1];
                                                int var75 = (var74 >> 8) + var15;
                                                int var76 = (var74 & 0xFF) + var75;
                                                var73 = var75 < var61 && var61 < var76;
                                            }
                                            boolean var77 = var60 >= (var61 + 1);
                                            if (!var77 && var57 + 1 <= var17) {
                                                short var78 = var13.field4992[var56 + 1];
                                                int var79 = (var78 >> 8) + var15;
                                                int var80 = (var78 & 0xFF) + var79;
                                                var77 = var61 > var79 && var61 < var80;
                                            }
                                            if (var73 && var77) {
                                                var72 = class21.field242[0];
                                            } else if (var73) {
                                                var72 = class21.field242[1];
                                                var64 = 0;
                                            } else if (var77) {
                                                var64 = 2;
                                                var72 = class21.field242[1];
                                            }
                                        }
                                        if (var72 != null) {
                                            class267.method2027(arg4, var64, var13, arg2, var57, arg0, var72, var61, 110, arg5, var14);
                                        }
                                        continue;
                                    }
                                }
                                if (var65) {
                                    class267.method2027(arg4, arg7[var61][var57], var13, arg2, var57, arg0, class111.field1812[arg9[var61][var57]], var61, 110, arg5, var14);
                                    class267.method2027(arg4, arg7[var61][var57], var13, arg2, var57, arg0, class21.field242[arg9[var61][var57]], var61, 110, arg5, var14);
                                } else {
                                    class267.method2027(arg4, var64, var13, arg2, var57, arg0, class21.field242[0], var61, 110, arg5, var14);
                                }
                            }
                            var56++;
                        }
                        if (var14.field4446 > 0 && var14.field4450 > 0) {
                            var14.method2021();
                            var13.field4990 = var14;
                        }
                        break;
                    }
                    short var20 = var13.field4992[var16];
                    int var21 = var15 + (var20 >> 8);
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg3[var23][var19] & 0xFF;
                        int var25 = arg1[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class31 var27 = class124.method974(-123, var25 - 1);
                            if (var27.field440 == -1) {
                                continue;
                            }
                            if (arg9[var23][var19] != 0) {
                                int[] var28 = class21.field242[arg9[var23][var19]];
                                var14.field4454 += ((var28.length >> 1) - 2) * 3;
                                var14.field4452 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class31 var29 = class124.method974(-62, var25 - 1);
                            if (var29.field440 == -1) {
                                byte var30 = arg9[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class111.field1812[var30];
                                    var14.field4454 += (var31.length >> 1) * 3 - 6;
                                    var14.field4452 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg9[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class209 var33 = class353.method2496(arg8, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field3279 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int var35 = (int) (var33.field3279 >> 20) & 0x3;
                                int[] var36 = null;
                                if ((var35 & 0x1) == 0) {
                                    boolean var37 = (var23 + 1) <= var22;
                                    boolean var38 = var21 <= var23 - 1;
                                    if (!var38 && var17 >= var19 + 1) {
                                        short var39 = var13.field4992[var16 + 1];
                                        int var40 = var15 + (var39 >> 8);
                                        int var41 = (var39 & 0xFF) + var40;
                                        var38 = var40 < var23 && var23 < var41;
                                    }
                                    if (!var37 && (var19 - 1) >= var18) {
                                        short var42 = var13.field4992[var16 - 1];
                                        int var43 = (var42 >> 8) + var15;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var37 = var43 < var23 && var23 < var44;
                                    }
                                    if (var38 && var37) {
                                        var36 = class21.field242[0];
                                    } else if (var38) {
                                        var36 = class21.field242[1];
                                    } else if (var37) {
                                        var36 = class21.field242[1];
                                    }
                                } else {
                                    boolean var45 = (var23 - 1) >= var21;
                                    if (!var45 && var18 <= var19 - 1) {
                                        short var46 = var13.field4992[var16 - 1];
                                        int var47 = var15 + (var46 >> 8);
                                        int var48 = (var46 & 0xFF) + var47;
                                        var45 = var47 < var23 && var48 > var23;
                                    }
                                    boolean var49 = var22 >= (var23 + 1);
                                    if (!var49 && var19 + 1 <= var17) {
                                        short var50 = var13.field4992[var16 + 1];
                                        int var51 = (var50 >> 8) + var15;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var49 = var51 < var23 && var23 < var52;
                                    }
                                    if (var45 && var49) {
                                        var36 = class21.field242[0];
                                    } else if (var45) {
                                        var36 = class21.field242[1];
                                    } else if (var49) {
                                        var36 = class21.field242[1];
                                    }
                                }
                                if (var36 != null) {
                                    var14.field4454 += (var36.length >> 1) * 3 - 6;
                                    var14.field4452 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var53 = class21.field242[arg9[var23][var19]];
                            int[] var54 = class111.field1812[arg9[var23][var19]];
                            var14.field4454 += (var53.length >> 1) * 3 - 6;
                            var14.field4454 += ((var54.length >> 1) - 2) * 3;
                            var14.field4452 += var53.length >> 1;
                            var14.field4452 += var54.length >> 1;
                        } else {
                            int[] var55 = class21.field242[0];
                            var14.field4454 += ((var55.length >> 1) - 2) * 3;
                            var14.field4452 += var55.length >> 1;
                        }
                    }
                    var16++;
                    var19++;
                }
            }
            var12++;
        }
        field5033++;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V", line = 733)
    public final void method553(byte arg0) {
        field5031++;
        if (arg0 >= -82) {
            method2239(81, -72, -108, -127, 107, 83, -80, 66, 96, -29);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIB[[ILjava/util/Random;II)V", line = 773)
    private final void method2241(int arg0, int arg1, byte arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        field5035++;
        int var8 = this.field5047 <= 0 ? 4096 : 4096 - class2.method4(this.field5047, arg4, -113);
        int var9 = this.field5039 * this.field5032 >> 12;
        int var10 = this.field5039 - (var9 > 0 ? class2.method4(var9, arg4, arg2 ^ 0xFFFFFF97) : 0);
        if (arg2 != 21) {
            this.method2241(46, 9, (byte) -96, (int[][]) ((int[][]) null), (Random) null, 43, -15);
        }
        if (class261.field4405 <= arg1) {
            arg1 -= class261.field4405;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg0 <= 0) {
                return;
            }
            int var15 = arg5 / 2;
            int var16 = arg0 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg0 - (var18 * 2);
            int var20 = arg1 + var18;
            for (int var21 = 0; var21 < arg5; var21++) {
                int[] var22 = arg3[arg6 + var21];
                if (var17 <= var21) {
                    int var23 = arg5 - var21 - 1;
                    if (var17 > var23) {
                        int var24 = var8 * var23 / var17;
                        if (this.field5046 == 0) {
                            for (int var25 = 0; var25 < var18; var25++) {
                                int var26 = var8 * var25 / var18;
                                var22[class343.method2418(arg1 + var25, class98.field1628)] = var22[class343.method2418(class98.field1628, arg0 + arg1 - var25 - 1)] = var24 * var26 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var18; var27++) {
                                int var28 = var8 * var27 / var18;
                                var22[class343.method2418(class98.field1628, arg1 + var27)] = var22[class343.method2418(class98.field1628, arg0 + arg1 - var27 - 1)] = var28 < var24 ? var28 : var24;
                            }
                        }
                        if (class261.field4405 < var19 + var20) {
                            int var29 = class261.field4405 - var20;
                            class242.method1839(var22, var20, var29, var24);
                            class242.method1839(var22, 0, var19 - var29, var24);
                        } else {
                            class242.method1839(var22, var20, var19, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var18; var30++) {
                            var22[class343.method2418(arg1 + var30, class98.field1628)] = var22[class343.method2418(arg0 + arg1 - var30 - 1, class98.field1628)] = var8 * var30 / var18;
                        }
                        if (var19 + var20 <= class261.field4405) {
                            class242.method1839(var22, var20, var19, var8);
                        } else {
                            int var31 = class261.field4405 - var20;
                            class242.method1839(var22, var20, var31, var8);
                            class242.method1839(var22, 0, var19 - var31, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var17;
                    if (this.field5046 == 0) {
                        for (int var33 = 0; var33 < var18; var33++) {
                            int var34 = var8 * var33 / var18;
                            var22[class343.method2418(class98.field1628, arg1 + var33)] = var22[class343.method2418(arg1 + arg0 - var33 - 1, class98.field1628)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var18; var35++) {
                            int var36 = var8 * var35 / var18;
                            var22[class343.method2418(arg1 + var35, class98.field1628)] = var22[class343.method2418(class98.field1628, arg1 + arg0 - var35 - 1)] = var32 > var36 ? var36 : var32;
                        }
                    }
                    if ((var19 + var20) > class261.field4405) {
                        int var37 = class261.field4405 - var20;
                        class242.method1839(var22, var20, var37, var32);
                        class242.method1839(var22, 0, var19 - var37, var32);
                    } else {
                        class242.method1839(var22, var20, var19, var32);
                    }
                }
            }
        } else if (class261.field4405 >= (arg1 + arg0)) {
            for (int var11 = 0; var11 < arg5; var11++) {
                class242.method1839(arg3[arg6 + var11], arg1, arg0, var8);
            }
        } else {
            int var12 = class261.field4405 - arg1;
            for (int var13 = 0; var13 < arg5; var13++) {
                int[] var14 = arg3[arg6 + var13];
                class242.method1839(var14, arg1, var12, var8);
                class242.method1839(var14, 0, arg0 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V", line = 976)
    public static void method2242(boolean arg0) {
        field5043 = null;
        if (!arg0) {
            method2239(119, 118, 45, 111, -92, -34, -46, 38, -27, -27);
        }
        field5034 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I", line = 994)
    public final int[] method77(int arg0, int arg1) {
        field5037++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int[][] var4 = this.field4950.method932((byte) 32);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class261.field4405 * this.field5042 >> 12;
            int var15 = class254.field4279 * this.field5036 >> 12;
            int var16 = class254.field4279 * this.field5045 >> 12;
            int var17 = class261.field4405 * this.field5041 >> 12;
            if (var16 <= 1) {
                return var4[arg0];
            }
            this.field5039 = class261.field4405 / 8 * this.field5040 >> 12;
            int var18 = class261.field4405 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field5048);
            label130: while (true) {
                while (true) {
                    int var22 = var14 + class2.method4(var17 - var14, var21, 107);
                    int var23 = class2.method4(var16 - var15, var21, arg1 + 13191) + var15;
                    int var24 = var10 + var22;
                    if (class261.field4405 < var24) {
                        var24 = class261.field4405;
                        var22 = class261.field4405 - var10;
                    }
                    int var25;
                    if (var9) {
                        var25 = 0;
                    } else {
                        int var26 = var8;
                        int[] var27 = var19[var8];
                        var25 = var27[2];
                        int var28 = var5 + var24;
                        if (var28 < 0) {
                            var28 += class261.field4405;
                        }
                        if (class261.field4405 < var28) {
                            var28 -= class261.field4405;
                        }
                        int var29 = 0;
                        while (true) {
                            int[] var30 = var19[var26];
                            if (var30[0] <= var28 && var28 <= var30[1]) {
                                if (var8 != var26) {
                                    int var31 = var5 + var10;
                                    if (var31 < 0) {
                                        var31 += class261.field4405;
                                    }
                                    if (class261.field4405 < var31) {
                                        var31 -= class261.field4405;
                                    }
                                    for (int var32 = 1; var32 <= var29; var32++) {
                                        int[] var33 = var19[(var8 + var32) % var11];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var29; var34++) {
                                        int[] var35 = var19[(var8 + var34) % var11];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var31 < var28) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var28, var38);
                                            } else if (var37 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var28, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class261.field4405;
                                            }
                                            this.method2241(var40 - var39, var7 + var39, (byte) 21, var4, var21, var25 - var36, var36);
                                        }
                                    }
                                }
                                var8 = var26;
                                break;
                            }
                            var29++;
                            int var10000 = ~var11;
                            var26++;
                            if (var10000 >= ~var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if (class254.field4279 < (var25 + var23)) {
                        var23 = class254.field4279 - var25;
                    } else {
                        var12 = false;
                    }
                    if (class261.field4405 == var24) {
                        this.method2241(var22, var6 + var10, (byte) 21, var4, var21, var23, var25);
                        if (var12) {
                            break label130;
                        }
                        var9 = false;
                        var8 = 0;
                        var12 = true;
                        int[][] var42 = var19;
                        int[] var43 = var20[var13++];
                        var43[0] = var10;
                        var19 = var20;
                        var11 = var13;
                        var43[2] = var23 + var25;
                        var7 = var6;
                        var43[1] = var24;
                        var20 = var42;
                        var6 = class2.method4(class261.field4405, var21, -39);
                        var10 = 0;
                        var5 = var6 - var7;
                        var13 = 0;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class261.field4405 + var5;
                        }
                        if (class261.field4405 < var44) {
                            var44 -= class261.field4405;
                        }
                        while (true) {
                            int[] var45 = var19[var8];
                            if (var45[0] <= var44 && var45[1] >= var44) {
                                break;
                            }
                            var8++;
                            if (var8 >= var11) {
                                var8 = 0;
                            }
                        }
                    } else {
                        int[] var41 = var20[var13++];
                        var41[1] = var24;
                        var41[0] = var10;
                        var41[2] = var25 + var23;
                        this.method2241(var22, var10 + var6, (byte) 21, var4, var21, var23, var25);
                        var10 = var24;
                    }
                }
            }
        }
        if (arg1 != -13093) {
            method2240((float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (byte) 110, (byte[][]) ((byte[][]) null), -118, (byte[][]) ((byte[][]) null), (class314[]) null, 77);
        }
        return var3;
    }
}
