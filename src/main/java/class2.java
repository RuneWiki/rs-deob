import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class14 {

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    private final int field13;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "I")
    private final int field2;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    private final int field15;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    private final int field20;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    private final int field17;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    private final int field23;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    private final int field4;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    private final int field22;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[I")
    public static int[] field10 = new int[4096];

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[[Z")
    public static boolean[][] field11 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Lvd;")
    public static class126 field18 = new class126(16);

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Z")
    public static boolean field19;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 0) {
            return;
        }
        if (arg1 >= class153.field2635 && arg5 <= class288.field4956 && arg4 >= class90.field1495 && class294.field5041 >= arg3) {
            class8.method44(arg0, arg1, (byte) 19, arg4, arg3, arg5);
        } else {
            class252.method1813(false, arg5, arg3, arg4, arg0, arg1);
        }
        field1++;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 26)
    public class2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field13 = arg4;
        this.field2 = arg5;
        this.field15 = arg6;
        this.field20 = arg2;
        this.field17 = arg7;
        this.field23 = arg1;
        this.field4 = arg0;
        this.field22 = arg3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI)V", line = 43)
    public final void method4(int arg0, boolean arg1, int arg2) {
        field14++;
        int var4 = this.field4 * arg2 >> 12;
        int var5 = this.field23 * arg0 >> 12;
        int var6 = this.field22 * arg0 >> 12;
        if (arg1) {
            field24 = 88;
        }
        int var7 = this.field20 * arg2 >> 12;
        int var8 = this.field13 * arg2 >> 12;
        int var9 = this.field2 * arg0 >> 12;
        int var10 = this.field15 * arg2 >> 12;
        int var11 = this.field17 * arg0 >> 12;
        class140.method1089(var5, var7, var6, var11, this.field183, var9, var4, var8, var10, 24106);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 94)
    public static void method5(int arg0) {
        field18 = null;
        field11 = (boolean[][]) null;
        field10 = null;
        if (arg0 != 1502962924) {
            field19 = false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BILre;)Lwa;", line = 113)
    public static final class75 method6(byte arg0, int arg1, class262 arg2) {
        field16++;
        if (!class85.method691(arg1, -1, client.method1734(arg2)) && arg2.field4518 == null) {
            return null;
        }
        if (arg0 < 7) {
            method9(1, -29, -6);
        }
        if (arg2.field4398 == null || arg2.field4398.length <= arg1 || arg2.field4398[arg1] == null || arg2.field4398[arg1].method649(255).method640(1) == 0) {
            return class214.field3662 ? class66.method562((byte) -71, new class75[] { class270.field4676, class67.method565(108, arg1) }) : null;
        } else {
            return arg2.field4398[arg1];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lcb;II)Lrj;", line = 135)
    public static final class17 method7(class267 arg0, int arg1, int arg2) {
        field8++;
        byte[] var3 = arg0.method1919(1, arg1);
        if (arg2 == 8) {
            return var3 == null ? null : new class17(var3);
        } else {
            return (class17) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V", line = 156)
    public final void method8(int arg0, int arg1, int arg2) {
        field3++;
        if (arg0 != 100) {
            field18 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)Z", line = 174)
    public static final boolean method9(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class96.field1585; var3++) {
            class202 var4 = class274.field4732[var3];
            if (var4.field3420 == 1) {
                int var5 = var4.field3400 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3422 * var5 >> 8) + var4.field3413;
                    int var7 = (var4.field3411 * var5 >> 8) + var4.field3424;
                    int var8 = (var4.field3414 * var5 >> 8) + var4.field3416;
                    int var9 = (var4.field3408 * var5 >> 8) + var4.field3419;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3420 == 2) {
                int var10 = arg0 - var4.field3400;
                if (var10 > 0) {
                    int var11 = (var4.field3422 * var10 >> 8) + var4.field3413;
                    int var12 = (var4.field3411 * var10 >> 8) + var4.field3424;
                    int var13 = (var4.field3414 * var10 >> 8) + var4.field3416;
                    int var14 = (var4.field3408 * var10 >> 8) + var4.field3419;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3420 == 3) {
                int var15 = var4.field3413 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3423 * var15 >> 8) + var4.field3400;
                    int var17 = (var4.field3406 * var15 >> 8) + var4.field3428;
                    int var18 = (var4.field3414 * var15 >> 8) + var4.field3416;
                    int var19 = (var4.field3408 * var15 >> 8) + var4.field3419;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3420 == 4) {
                int var20 = arg2 - var4.field3413;
                if (var20 > 0) {
                    int var21 = (var4.field3423 * var20 >> 8) + var4.field3400;
                    int var22 = (var4.field3406 * var20 >> 8) + var4.field3428;
                    int var23 = (var4.field3414 * var20 >> 8) + var4.field3416;
                    int var24 = (var4.field3408 * var20 >> 8) + var4.field3419;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3420 == 5) {
                int var25 = arg1 - var4.field3416;
                if (var25 > 0) {
                    int var26 = (var4.field3423 * var25 >> 8) + var4.field3400;
                    int var27 = (var4.field3406 * var25 >> 8) + var4.field3428;
                    int var28 = (var4.field3422 * var25 >> 8) + var4.field3413;
                    int var29 = (var4.field3411 * var25 >> 8) + var4.field3424;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 297)
    public static final void method10(int arg0) {
        class255.field4279++;
        field6++;
        if (arg0 <= -107) {
            class89.field1470.method87(65280, 103);
            class89.field1470.method514(30009, 0L);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lcb;I)V", line = 313)
    public static final void method11(class267 arg0, int arg1) {
        field12++;
        if (arg1 >= -126) {
            method11((class267) null, 110);
        }
        arg0.method1915(-15621, class219.field3738);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V", line = 326)
    public static final void method12(int arg0) {
        class26.field347.method1201(-20111);
        field7++;
        class25.field323.method1201(-20111);
        class294.field5062.method1201(-20111);
        class168.field2827.method1201(-20111);
        int var1 = 72 / ((arg0 + 42) / 62);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V", line = 347)
    public final void method13(int arg0, int arg1, int arg2) {
        field9++;
        if (arg2 <= 58) {
            field24 = 83;
        }
    }
}
