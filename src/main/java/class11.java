import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 extends class326 {

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "I")
    private int field129 = 409;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
    private int field131 = 2048;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    private int field132 = 0;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
    private int field133 = 1024;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "I")
    private int field135 = 1024;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "I")
    private int field128 = 1024;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "I")
    private int field134 = 819;

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    private int field138 = 0;

    @OriginalMember(owner = "client!vl", name = "eb", descriptor = "I")
    private int field143 = 1024;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "J")
    public static long field136 = -1L;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    public static int field130 = 0;

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "Lwc;")
    public static class46 field140 = new class46();

    @OriginalMember(owner = "client!vl", name = "gb", descriptor = "Lgd;")
    public static class206 field145;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client!vl", name = "fb", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!vl", name = "hb", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!vl", name = "ib", descriptor = "Ldd;")
    public static class458 field147;

    static {
        new class206("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field145 = new class206("Examine", "Untersuchen", "Examiner", "Examinar");
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 3)
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 9)
    public final void method65(int arg0) {
        if (arg0 > -100) {
            field145 = null;
        }
        ++field139;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V", line = 20)
    public static void method66(int arg0) {
        field147 = null;
        field140 = null;
        field145 = null;
        if (arg0 != 0) {
            field140 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BI)[I", line = 33)
    public final int[] method30(byte arg0, int arg1) {
        ++field141;
        int[] var3 = super.field4344.method130(arg1, 70);
        if (arg0 > -6) {
            this.method65(124);
        }
        if (super.field4344.field286) {
            int[][] var4 = super.field4344.method132(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class181.field2495 * this.field128 >> 12;
            int var15 = class181.field2495 * this.field131 >> 12;
            int var16 = class27.field359 * this.field129 >> 12;
            int var17 = class27.field359 * this.field134 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field142 = class181.field2495 / 8 * this.field135 >> 12;
                int var18 = class181.field2495 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field132);
                while (true) {
                    while (true) {
                        int var22 = var14 + class257.method1447(20094, var15 - var14, var21);
                        int var23 = var16 + class257.method1447(20094, -var16 + var17, var21);
                        int var24 = var8 + var22;
                        if (class181.field2495 < var24) {
                            var24 = class181.field2495;
                            var22 = -var8 + class181.field2495;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class181.field2495;
                            }
                            if (class181.field2495 < var28) {
                                var28 -= class181.field2495;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var28 <= ~var30[0] && ~var30[1] <= ~var28) {
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class181.field2495;
                                        }
                                        if (~var31 < ~class181.field2495) {
                                            var31 -= class181.field2495;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (~var29 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var28 > var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (var36 == 0) {
                                                    var39 = Math.min(var28, var37);
                                                    var38 = 0;
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class181.field2495;
                                                }
                                                this.method67(var35, -var38 + var39, 6801, var21, var38 - -var7, -var35 + var29, var4);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var27;
                                ++var25;
                                if (~var25 <= ~var12) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (~class27.field359 <= ~(var23 + var29)) {
                            var10 = false;
                        } else {
                            var23 = -var29 + class27.field359;
                        }
                        if (class181.field2495 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var29 - -var23;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method67(var29, var22, 6801, var21, var6 + var8, var23, var4);
                            var8 = var24;
                        } else {
                            this.method67(var29, var22, 6801, var21, var6 + var8, var23, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[0] = var8;
                            var42[2] = var29 - -var23;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class257.method1447(20094, class181.field2495, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class181.field2495 + var5;
                            }
                            if (var44 > class181.field2495) {
                                var44 -= class181.field2495;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var45[0] >= ~var44 && var45[1] >= var44) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V", line = 283)
    private final void method67(int arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int[][] arg6) {
        ++field144;
        int var8 = this.field133 > 0 ? -class257.method1447(arg2 ^ 21743, this.field133, arg3) + 4096 : 4096;
        int var9 = this.field143 * this.field142 >> 12;
        if (arg2 != 6801) {
            this.method33(94, (class32) null, 2);
        }
        int var10 = this.field142 + -(var9 > 0 ? class257.method1447(20094, var9, arg3) : 0);
        if (~class181.field2495 >= ~arg4) {
            arg4 -= class181.field2495;
        }
        if (~var10 >= -1) {
            if (~class181.field2495 <= ~(arg1 + arg4)) {
                for (int var11 = 0; ~var11 > ~arg5; ++var11) {
                    class380.method2337(arg6[arg0 + var11], arg4, arg1, var8);
                }
            } else {
                int var12 = -arg4 + class181.field2495;
                for (int var13 = 0; ~var13 > ~arg5; ++var13) {
                    int[] var14 = arg6[arg0 + var13];
                    class380.method2337(var14, arg4, var12, var8);
                    class380.method2337(var14, 0, -var12 + arg1, var8);
                }
            }
        } else if (~arg5 < -1 && ~arg1 < -1) {
            int var15 = arg1 / 2;
            int var16 = arg5 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = ~var16 > ~var10 ? var16 : var10;
            int var19 = arg4 + var17;
            int var20 = -(var17 * 2) + arg1;
            for (int var21 = 0; var21 < arg5; ++var21) {
                int[] var22 = arg6[arg0 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field138 == -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class99.method612(class459.field6226, arg4 - -var24)] = var22[class99.method612(arg1 - 1 + arg4 + -var24, class459.field6226)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class99.method612(arg4 - -var26, class459.field6226)] = var22[class99.method612(arg4 - 1 + -var26 + arg1, class459.field6226)] = ~var23 >= ~var28 ? var23 : var28;
                        }
                    }
                    if (~(var19 + var20) < ~class181.field2495) {
                        int var27 = -var19 + class181.field2495;
                        class380.method2337(var22, var19, var27, var23);
                        class380.method2337(var22, 0, -var27 + var20, var23);
                    } else {
                        class380.method2337(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg5;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field138 != -1) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class99.method612(arg4 + var31, class459.field6226)] = var22[class99.method612(arg1 + arg4 - (var31 + 1), class459.field6226)] = ~var32 > ~var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class99.method612(arg4 + var33, class459.field6226)] = var22[class99.method612(arg4 - var33 + -1 + arg1, class459.field6226)] = var30 * var35 >> 12;
                            }
                        }
                        if (class181.field2495 < var19 + var20) {
                            int var34 = class181.field2495 - var19;
                            class380.method2337(var22, var19, var34, var30);
                            class380.method2337(var22, 0, -var34 + var20, var30);
                        } else {
                            class380.method2337(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class99.method612(arg4 + var36, class459.field6226)] = var22[class99.method612(class459.field6226, -var36 + -1 + arg4 + arg1)] = var8 * var36 / var17;
                        }
                        if (class181.field2495 < var19 + var20) {
                            int var37 = class181.field2495 - var19;
                            class380.method2337(var22, var19, var37, var8);
                            class380.method2337(var22, 0, -var37 + var20, var8);
                        } else {
                            class380.method2337(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)V", line = 487)
    public static final void method68(int arg0) {
        ++field127;
        class491.field6866.method1752((byte) -37);
        class409.field5607 = null;
        int var1 = -127 % ((arg0 - -3) / 62);
        class148.field2106 = 1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILbt;I)V", line = 523)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field133 = arg1.method215((byte) 111);
                                        }
                                    } else {
                                        this.field143 = arg1.method215((byte) 92);
                                    }
                                } else {
                                    this.field138 = arg1.method201((byte) -123);
                                }
                            } else {
                                this.field135 = arg1.method215((byte) 106);
                            }
                        } else {
                            this.field134 = arg1.method215((byte) 121);
                        }
                    } else {
                        this.field129 = arg1.method215((byte) 103);
                    }
                } else {
                    this.field131 = arg1.method215((byte) 102);
                }
            } else {
                this.field128 = arg1.method215((byte) 108);
            }
        } else {
            this.field132 = arg1.method201((byte) -110);
        }
        if (arg2 > -3) {
            field147 = null;
        }
        ++field137;
    }
}
