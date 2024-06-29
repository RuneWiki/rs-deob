import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class305 extends class179 {

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    private int field5256 = 1024;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    private int field5257 = 1024;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "I")
    private int field5266 = 1024;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    private int field5260 = 819;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    private int field5258 = 1024;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    private int field5251 = 0;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    private int field5259 = 2048;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "I")
    private int field5271 = 0;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    private int field5262 = 409;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lvm;")
    public static class297 field5252 = new class297(200);

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "Lke;")
    public static class256 field5272 = class316.method2202("<col=00ff80>", 27626);

    @OriginalMember(owner = "client!dd", name = "pb", descriptor = "Lke;")
    public static class256 field5276 = class316.method2202("p12_full", 27626);

    @OriginalMember(owner = "client!dd", name = "sb", descriptor = "Lke;")
    public static class256 field5279 = class316.method2202("mapflag", 27626);

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!dd", name = "rb", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "Z")
    public static boolean field5263;

    @OriginalMember(owner = "client!dd", name = "qb", descriptor = "Z")
    public static boolean field5277;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "[I")
    public static int[] field5268;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "[I")
    public static int[] field5270;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "[[[I")
    public static int[][][] field5269;

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "[[[I")
    public static int[][][] field5275;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Lke;", line = 5)
    public static final class256 method2125(byte arg0, int arg1) {
        if (arg0 <= 26) {
            field5272 = (class256) null;
        }
        field5261++;
        return class7.method52((byte) 68, 10, false, arg1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 27)
    public final void method418(byte arg0) {
        if (arg0 != -110) {
            this.field5257 = -20;
        }
        field5273++;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 36)
    public class305() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZILra;IIIIII)V", line = 58)
    public static final void method2126(boolean arg0, int arg1, class41 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 >= 0 && arg1 < 104 && arg7 >= 0 && arg7 < 104) {
            if (!arg0) {
                class308.field5296[arg4][arg1][arg7] = 0;
            }
            while (true) {
                int var9 = arg2.method357(false);
                if (var9 == 0) {
                    if (arg0) {
                        class118.field2090[0][arg1][arg7] = class72.field1329[0][arg1][arg7];
                    } else if (arg4 == 0) {
                        class118.field2090[0][arg1][arg7] = -class316.method2201(4, arg7 + arg3 + 556238, arg1 + 932731 - -arg8) * 8;
                    } else {
                        class118.field2090[arg4][arg1][arg7] = class118.field2090[arg4 - 1][arg1][arg7] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg2.method357(false);
                    if (arg0) {
                        class118.field2090[0][arg1][arg7] = var10 * 8 + class72.field1329[0][arg1][arg7];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg4 == 0) {
                            class118.field2090[0][arg1][arg7] = -var10 * 8;
                        } else {
                            class118.field2090[arg4][arg1][arg7] = class118.field2090[arg4 - 1][arg1][arg7] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class13.field175[arg4][arg1][arg7] = arg2.method323(9092);
                    class257.field4452[arg4][arg1][arg7] = (byte) ((var9 - 2) / 4);
                    class48.field858[arg4][arg1][arg7] = (byte) class150.method1123(arg5 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class301.field5179[arg4][arg1][arg7] = (byte) (var9 - 81);
                } else if (!arg0) {
                    class308.field5296[arg4][arg1][arg7] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method357(false);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method357(false);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method357(false);
                }
            }
        }
        field5254++;
        if (arg6 != 556238) {
            field5278 = 46;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([I[JIII)V", line = 160)
    public static final void method2127(int[] arg0, long[] arg1, int arg2, int arg3, int arg4) {
        field5274++;
        if (arg2 != 1 || arg4 >= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var7;
        int var9 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var9;
        for (int var10 = arg4; var10 < arg3; var10++) {
            if ((long) (var10 & 0x1) + var7 > arg1[var10]) {
                long var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                int var13 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var13;
            }
        }
        arg1[arg3] = arg1[var6];
        arg1[var6] = var7;
        arg0[arg3] = arg0[var6];
        arg0[var6] = var9;
        method2127(arg0, arg1, 1, var6 - 1, arg4);
        method2127(arg0, arg1, 1, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/util/Random;III[[III)V", line = 219)
    private final void method2128(Random arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        int var8 = this.field5257 <= 0 ? 4096 : 4096 - class64.method494(this.field5257, 0, arg0);
        int var9 = this.field5266 * this.field5255 >> 12;
        field5253++;
        int var10 = 18 % ((arg3 + 25) / 60);
        int var11 = this.field5255 - (var9 > 0 ? class64.method494(var9, 0, arg0) : 0);
        if (class161.field2858 <= arg2) {
            arg2 -= class161.field2858;
        }
        if (var11 > 0) {
            if (arg5 <= 0 || arg1 <= 0) {
                return;
            }
            int var16 = arg1 / 2;
            int var17 = arg5 / 2;
            int var18 = var16 < var11 ? var16 : var11;
            int var19 = var11 <= var17 ? var11 : var17;
            int var20 = arg2 + var18;
            int var21 = arg1 - (var18 * 2);
            for (int var22 = 0; var22 < arg5; var22++) {
                int[] var23 = arg4[arg6 + var22];
                if (var22 >= var19) {
                    int var24 = arg5 - var22 - 1;
                    if (var19 > var24) {
                        int var25 = var8 * var24 / var19;
                        if (this.field5251 == 0) {
                            for (int var26 = 0; var26 < var18; var26++) {
                                int var27 = var8 * var26 / var18;
                                var23[class150.method1123(arg2 + var26, class285.field4945)] = var23[class150.method1123(arg2 + arg1 - var26 - 1, class285.field4945)] = var25 * var27 >> 12;
                            }
                        } else {
                            for (int var28 = 0; var28 < var18; var28++) {
                                int var29 = var8 * var28 / var18;
                                var23[class150.method1123(arg2 + var28, class285.field4945)] = var23[class150.method1123(arg2 + arg1 - var28 - 1, class285.field4945)] = var25 > var29 ? var29 : var25;
                            }
                        }
                        if (class161.field2858 < (var20 + var21)) {
                            int var30 = class161.field2858 - var20;
                            class299.method2088(var23, var20, var30, var25);
                            class299.method2088(var23, 0, var21 - var30, var25);
                        } else {
                            class299.method2088(var23, var20, var21, var25);
                        }
                    } else {
                        for (int var31 = 0; var31 < var18; var31++) {
                            var23[class150.method1123(arg2 + var31, class285.field4945)] = var23[class150.method1123(arg1 + arg2 - var31 - 1, class285.field4945)] = var8 * var31 / var18;
                        }
                        if (class161.field2858 >= var20 + var21) {
                            class299.method2088(var23, var20, var21, var8);
                        } else {
                            int var32 = class161.field2858 - var20;
                            class299.method2088(var23, var20, var32, var8);
                            class299.method2088(var23, 0, var21 - var32, var8);
                        }
                    }
                } else {
                    int var33 = var8 * var22 / var19;
                    if (this.field5251 == 0) {
                        for (int var34 = 0; var34 < var18; var34++) {
                            int var35 = var8 * var34 / var18;
                            var23[class150.method1123(class285.field4945, arg2 + var34)] = var23[class150.method1123(arg1 + arg2 - var34 - 1, class285.field4945)] = var33 * var35 >> 12;
                        }
                    } else {
                        for (int var36 = 0; var36 < var18; var36++) {
                            int var37 = var8 * var36 / var18;
                            var23[class150.method1123(arg2 + var36, class285.field4945)] = var23[class150.method1123(class285.field4945, arg2 + arg1 - var36 - 1)] = var33 <= var37 ? var33 : var37;
                        }
                    }
                    if (var20 + var21 <= class161.field2858) {
                        class299.method2088(var23, var20, var21, var33);
                    } else {
                        int var38 = class161.field2858 - var20;
                        class299.method2088(var23, var20, var38, var33);
                        class299.method2088(var23, 0, var21 - var38, var33);
                    }
                }
            }
        } else if (class161.field2858 >= (arg1 + arg2)) {
            for (int var12 = 0; var12 < arg5; var12++) {
                class299.method2088(arg4[arg6 + var12], arg2, arg1, var8);
            }
        } else {
            int var13 = class161.field2858 - arg2;
            for (int var14 = 0; var14 < arg5; var14++) {
                int[] var15 = arg4[arg6 + var14];
                class299.method2088(var15, arg2, var13, var8);
                class299.method2088(var15, 0, arg1 - var13, var8);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILra;I)V", line = 418)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field5264++;
        if (arg2 == 0) {
            this.field5271 = arg1.method357(false);
        } else if (arg2 == 1) {
            this.field5258 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field5259 = arg1.method346(-16);
        } else if (arg2 == 3) {
            this.field5262 = arg1.method346(-16);
        } else if (arg2 == 4) {
            this.field5260 = arg1.method346(-16);
        } else if (arg2 == 5) {
            this.field5256 = arg1.method346(-16);
        } else if (arg2 == 6) {
            this.field5251 = arg1.method357(false);
        } else if (arg2 == 7) {
            this.field5266 = arg1.method346(-16);
        } else if (arg2 == 8) {
            this.field5257 = arg1.method346(-16);
        }
        if (arg0 <= 108) {
            field5272 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "(I)V", line = 522)
    public static void method2129(int arg0) {
        field5270 = null;
        field5272 = null;
        field5279 = null;
        field5252 = null;
        field5275 = (int[][][]) null;
        field5268 = null;
        int var1 = 91 % ((arg0 + 81) / 33);
        field5269 = (int[][][]) null;
        field5276 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I", line = 555)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            field5272 = (class256) null;
        }
        field5265++;
        int[] var3 = this.field3157.method1258(arg1 + 31510, arg0);
        if (!this.field3157.field3081) {
            return var3;
        }
        int[][] var4 = this.field3157.method1257(true);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        int var11 = 0;
        boolean var12 = true;
        int var13 = 0;
        int var14 = class161.field2858 * this.field5258 >> 12;
        int var15 = class161.field2858 * this.field5259 >> 12;
        int var16 = class38.field697 * this.field5262 >> 12;
        int var17 = class38.field697 * this.field5260 >> 12;
        if (var17 <= 1) {
            return var4[arg0];
        }
        int var18 = class161.field2858 / var14 + 1;
        this.field5255 = class161.field2858 / 8 * this.field5256 >> 12;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field5271);
        while (true) {
            while (true) {
                int var22 = class64.method494(var15 - var14, arg1 ^ 0xFFFF8492, var21) + var14;
                int var23 = var9 + var22;
                int var24 = var16 + class64.method494(var17 - var16, 0, var21);
                if (class161.field2858 < var23) {
                    var22 = class161.field2858 - var9;
                    var23 = class161.field2858;
                }
                int var28;
                if (var12) {
                    var28 = 0;
                } else {
                    int var25 = var7;
                    int[] var26 = var20[var7];
                    int var27 = 0;
                    var28 = var26[2];
                    int var29 = var23 + var5;
                    if (var29 < 0) {
                        var29 += class161.field2858;
                    }
                    if (var29 > class161.field2858) {
                        var29 -= class161.field2858;
                    }
                    while (true) {
                        int[] var30 = var20[var25];
                        if (var30[0] <= var29 && var29 <= var30[1]) {
                            if (var7 != var25) {
                                int var31 = var5 + var9;
                                if (var31 < 0) {
                                    var31 += class161.field2858;
                                }
                                if (class161.field2858 < var31) {
                                    var31 -= class161.field2858;
                                }
                                for (int var32 = 1; var32 <= var27; var32++) {
                                    int[] var33 = var20[(var7 + var32) % var11];
                                    var28 = Math.max(var28, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var27; var34++) {
                                    int[] var35 = var20[(var7 + var34) % var11];
                                    int var36 = var35[2];
                                    if (var28 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var29, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class161.field2858;
                                        }
                                        this.method2128(var21, var40 - var39, var8 + var39, -89, var4, var28 - var36, var36);
                                    }
                                }
                            }
                            var7 = var25;
                            break;
                        }
                        int var10000 = ~var11;
                        var25++;
                        if (var10000 >= ~var25) {
                            var25 = 0;
                        }
                        var27++;
                    }
                }
                if (class38.field697 >= var24 + var28) {
                    var10 = false;
                } else {
                    var24 = class38.field697 - var28;
                }
                if (class161.field2858 == var23) {
                    this.method2128(var21, var22, var6 + var9, 42, var4, var24, var28);
                    if (var10) {
                        return var3;
                    }
                    var8 = var6;
                    int[][] var42 = var20;
                    var12 = false;
                    var20 = var19;
                    var7 = 0;
                    var10 = true;
                    int[] var43 = var19[var13++];
                    var43[1] = var23;
                    var43[0] = var9;
                    var19 = var42;
                    var43[2] = var28 + var24;
                    var6 = class64.method494(class161.field2858, 0, var21);
                    var9 = 0;
                    var11 = var13;
                    var13 = 0;
                    var5 = var6 - var8;
                    int var44 = var5;
                    if (var5 < 0) {
                        var44 = class161.field2858 + var5;
                    }
                    if (class161.field2858 < var44) {
                        var44 -= class161.field2858;
                    }
                    while (true) {
                        int[] var45 = var20[var7];
                        if (var44 >= var45[0] && var45[1] >= var44) {
                            break;
                        }
                        var7++;
                        if (var11 <= var7) {
                            var7 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var13++];
                    var41[1] = var23;
                    var41[0] = var9;
                    var41[2] = var24 + var28;
                    this.method2128(var21, var22, var6 + var9, -98, var4, var24, var28);
                    var9 = var23;
                }
            }
        }
    }
}
