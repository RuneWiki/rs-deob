import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class20 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lpe;")
    public static class100 field416 = new class100(100);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lij;")
    public static class50 field419 = class78.method578(127, "Texturen geladen)3");

    @OriginalMember(owner = "client!a", name = "k", descriptor = "[[S")
    public static short[][] field423 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[Lij;")
    public static class50[] field426 = new class50[100];

    @OriginalMember(owner = "client!a", name = "q", descriptor = "[I")
    public static int[] field429 = new int[4096];

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "J")
    public static long field418;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lwi;")
    public static class21 field417;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lda;")
    public static class22 field420;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lhk;")
    public static class83 field425;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[I")
    public static int[] field421;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static final void method148(byte arg0) {
        field415++;
        if (arg0 <= 54) {
            field425 = null;
        }
        class84.field1605 = null;
        class178.field2977 = null;
        class236.field3947 = null;
        class146.field2526 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Z")
    public static final boolean method149(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class179.field2983; var3++) {
            class255 var4 = class260.field4530[var3];
            if (var4.field4400 == 1) {
                int var5 = var4.field4430 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4419 * var5 >> 8) + var4.field4416;
                    int var7 = (var4.field4412 * var5 >> 8) + var4.field4401;
                    int var8 = (var4.field4406 * var5 >> 8) + var4.field4409;
                    int var9 = (var4.field4402 * var5 >> 8) + var4.field4405;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4400 == 2) {
                int var10 = arg0 - var4.field4430;
                if (var10 > 0) {
                    int var11 = (var4.field4419 * var10 >> 8) + var4.field4416;
                    int var12 = (var4.field4412 * var10 >> 8) + var4.field4401;
                    int var13 = (var4.field4406 * var10 >> 8) + var4.field4409;
                    int var14 = (var4.field4402 * var10 >> 8) + var4.field4405;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4400 == 3) {
                int var15 = var4.field4416 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4414 * var15 >> 8) + var4.field4430;
                    int var17 = (var4.field4417 * var15 >> 8) + var4.field4407;
                    int var18 = (var4.field4406 * var15 >> 8) + var4.field4409;
                    int var19 = (var4.field4402 * var15 >> 8) + var4.field4405;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4400 == 4) {
                int var20 = arg2 - var4.field4416;
                if (var20 > 0) {
                    int var21 = (var4.field4414 * var20 >> 8) + var4.field4430;
                    int var22 = (var4.field4417 * var20 >> 8) + var4.field4407;
                    int var23 = (var4.field4406 * var20 >> 8) + var4.field4409;
                    int var24 = (var4.field4402 * var20 >> 8) + var4.field4405;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4400 == 5) {
                int var25 = arg1 - var4.field4409;
                if (var25 > 0) {
                    int var26 = (var4.field4414 * var25 >> 8) + var4.field4430;
                    int var27 = (var4.field4417 * var25 >> 8) + var4.field4407;
                    int var28 = (var4.field4419 * var25 >> 8) + var4.field4416;
                    int var29 = (var4.field4412 * var25 >> 8) + var4.field4401;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIILce;II)V")
    public static final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, class10 arg5, int arg6, int arg7) {
        if (class96.field1788) {
            class219.field3663 = 32;
        } else {
            class219.field3663 = 0;
        }
        class96.field1788 = false;
        if (class238.field4039 != 0) {
            if (arg4 <= arg0 && arg4 + 16 > arg0 && arg2 >= arg3 && arg2 < arg3 + 16) {
                arg5.field239 -= 4;
                class140.method979((byte) 56, arg5);
            } else if (arg4 <= arg0 && (arg4 + 16) > arg0 && arg2 >= (arg3 + arg6 - 16) && arg2 < arg3 + arg6) {
                arg5.field239 += 4;
                class140.method979((byte) 66, arg5);
            } else if ((arg4 - class219.field3663) <= arg0 && arg4 + class219.field3663 + 16 > arg0 && arg2 >= (arg3 + 16) && arg2 < (arg3 + arg6 - 16)) {
                int var8 = (arg6 - 32) * arg6 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - arg3 - (var8 / 2) - 16;
                int var10 = arg6 - var8 - 32;
                arg5.field239 = (arg1 - arg6) * var9 / var10;
                class140.method979((byte) 101, arg5);
                class96.field1788 = true;
            }
        }
        if (arg7 < 80) {
            return;
        }
        field413++;
        if (class31.field632 == 0) {
            return;
        }
        int var11 = arg5.field243;
        if (arg0 >= (arg4 - var11) && arg3 <= arg2 && arg4 + 16 > arg0 && (arg3 + arg6) >= arg2) {
            arg5.field239 += class31.field632 * 45;
            class140.method979((byte) 17, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field414++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg4 - arg3;
        int var12 = arg7 - arg3;
        int var13 = arg4 * arg4;
        int var14 = arg7 * arg7;
        if (arg6 != -29824) {
            field416 = null;
        }
        int var15 = var12 * var12;
        int var16 = var13 << 1;
        int var17 = var14 << 1;
        int var18 = var11 * var11;
        int var19 = var18 << 1;
        int var20 = arg4 << 1;
        int var21 = var13 - (var20 - 1) * var17;
        int var22 = var15 << 1;
        int var23 = var11 << 1;
        int var24 = (1 - var23) * var15 + var19;
        int var25 = (1 - var20) * var14 + var16;
        int var26 = var14 << 2;
        int var27 = var18 - ((var23 - 1) * var22);
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var18 << 2;
        int var31 = var16 * 3;
        int var32 = (var20 - 3) * var17;
        int var33 = var28;
        int var34 = (var23 - 3) * var22;
        int var35 = var30;
        int var36 = (var11 - 1) * var29;
        int var37 = var19 * 3;
        int var38 = (arg4 - 1) * var26;
        if (arg5 >= class100.field1855 && class97.field1816 >= arg5) {
            int[] var39 = class177.field2963[arg5];
            int var40 = class2.method10(class177.field2953, (byte) 97, arg2 - arg7, class224.field3773);
            int var41 = class2.method10(class177.field2953, (byte) 97, arg2 + arg7, class224.field3773);
            int var42 = class2.method10(class177.field2953, (byte) 97, arg2 - var12, class224.field3773);
            int var43 = class2.method10(class177.field2953, (byte) 97, arg2 + var12, class224.field3773);
            class155.method1090(var39, var40, arg1, 160, var42);
            class155.method1090(var39, var42, arg0, 160, var43);
            class155.method1090(var39, var43, arg1, arg6 + 29984, var41);
        }
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var8++;
                    var25 += var31;
                    var31 += var28;
                    var21 += var33;
                    var33 += var28;
                }
            }
            if (var21 < 0) {
                var25 += var31;
                var31 += var28;
                var8++;
                var21 += var33;
                var33 += var28;
            }
            var21 += -var32;
            var25 += -var38;
            boolean var44 = var11 >= var9;
            var9--;
            int var45 = arg5 - var9;
            var32 -= var26;
            var38 -= var26;
            int var46 = arg5 + var9;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var37;
                        var27 += var35;
                        var10++;
                        var35 += var30;
                        var37 += var30;
                    }
                }
                if (var27 < 0) {
                    var24 += var37;
                    var37 += var30;
                    var10++;
                    var27 += var35;
                    var35 += var30;
                }
                var24 += -var36;
                var36 -= var29;
                var27 += -var34;
                var34 -= var29;
            }
            if (var46 >= class100.field1855 && class97.field1816 >= var45) {
                int var47 = class2.method10(class177.field2953, (byte) 97, arg2 + var8, class224.field3773);
                int var48 = class2.method10(class177.field2953, (byte) 97, arg2 - var8, class224.field3773);
                if (var44) {
                    int var49 = class2.method10(class177.field2953, (byte) 97, arg2 + var10, class224.field3773);
                    int var50 = class2.method10(class177.field2953, (byte) 97, arg2 - var10, class224.field3773);
                    if (var45 >= class100.field1855) {
                        int[] var51 = class177.field2963[var45];
                        class155.method1090(var51, var48, arg1, 160, var50);
                        class155.method1090(var51, var50, arg0, 160, var49);
                        class155.method1090(var51, var49, arg1, arg6 ^ 0xFFFF8B20, var47);
                    }
                    if (class97.field1816 >= var46) {
                        int[] var52 = class177.field2963[var46];
                        class155.method1090(var52, var48, arg1, 160, var50);
                        class155.method1090(var52, var50, arg0, 160, var49);
                        class155.method1090(var52, var49, arg1, arg6 ^ 0xFFFF8B20, var47);
                    }
                } else {
                    if (var45 >= class100.field1855) {
                        class155.method1090(class177.field2963[var45], var48, arg1, 160, var47);
                    }
                    if (class97.field1816 >= var46) {
                        class155.method1090(class177.field2963[var46], var48, arg1, 160, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method152(int arg0) {
        field420 = null;
        field416 = null;
        field423 = null;
        if (arg0 < 120) {
            method149(-15, 105, 111);
        }
        field421 = null;
        field426 = null;
        field425 = null;
        field417 = null;
        field429 = null;
        field419 = null;
    }
}
