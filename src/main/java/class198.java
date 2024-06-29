import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class198 extends class202 {

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "[B")
    public byte[] field3585;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field3587 = 100;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Loh;")
    public static class263 field3578 = class253.method1681(-128, ")2");

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "Lue;")
    public static class86 field3581;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "[I")
    public static int[] field3583;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "[I")
    public static int[] field3584;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
    public static final void method1344(int arg0, int arg1) {
        field3579++;
        if (arg1 == 0) {
            class150.field2704.method829(arg0, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public static void method1345(byte arg0) {
        field3584 = null;
        field3583 = null;
        field3578 = null;
        field3581 = null;
        if (arg0 >= -114) {
            method1347(43, 112);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1346(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class178.method1199(arg0, -122);
        int var7 = 0;
        field3577++;
        if (!arg2) {
            method1346(-87, 99, false, -27, 48, 67, -103);
        }
        int var8 = -arg0;
        int var9 = arg0;
        int var10 = arg0 - arg4;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = -var10;
        int var12 = var10;
        if (class11.field249 <= arg3 && class276.field4831 >= arg3) {
            int[] var13 = class38.field870[arg3];
            int var14 = class98.method672(-257, field3587, arg5 - arg0, class51.field1099);
            int var15 = class98.method672(-257, field3587, arg5 + arg0, class51.field1099);
            int var16 = class98.method672(-257, field3587, arg5 - var10, class51.field1099);
            int var17 = class98.method672(-257, field3587, arg5 + var10, class51.field1099);
            class191.method1255(var14, arg1, var16, 79, var13);
            class191.method1255(var16, arg6, var17, 117, var13);
            class191.method1255(var17, arg1, var15, 117, var13);
        }
        int var18 = -1;
        int var19 = -1;
        while (var9 > var7) {
            var19 += 2;
            var18 += 2;
            var11 += var18;
            var8 += var19;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                class94.field1857[var12] = var7;
                var11 -= var12 << 1;
            }
            var7++;
            if (var8 >= 0) {
                var9--;
                int var20 = arg3 - var9;
                var8 -= var9 << 1;
                int var21 = arg3 + var9;
                if (var21 >= class11.field249 && class276.field4831 >= var20) {
                    if (var10 > var9) {
                        int var22 = class94.field1857[var9];
                        int var23 = class98.method672(-257, field3587, arg5 + var7, class51.field1099);
                        int var24 = class98.method672(-257, field3587, arg5 - var7, class51.field1099);
                        int var25 = class98.method672(-257, field3587, arg5 + var22, class51.field1099);
                        int var26 = class98.method672(-257, field3587, arg5 - var22, class51.field1099);
                        if (class276.field4831 >= var21) {
                            int[] var27 = class38.field870[var21];
                            class191.method1255(var24, arg1, var26, 65, var27);
                            class191.method1255(var26, arg6, var25, 100, var27);
                            class191.method1255(var25, arg1, var23, 109, var27);
                        }
                        if (var20 >= class11.field249) {
                            int[] var28 = class38.field870[var20];
                            class191.method1255(var24, arg1, var26, 126, var28);
                            class191.method1255(var26, arg6, var25, 60, var28);
                            class191.method1255(var25, arg1, var23, 92, var28);
                        }
                    } else {
                        int var29 = class98.method672(-257, field3587, arg5 + var7, class51.field1099);
                        int var30 = class98.method672(-257, field3587, arg5 - var7, class51.field1099);
                        if (var21 <= class276.field4831) {
                            class191.method1255(var30, arg1, var29, 115, class38.field870[var21]);
                        }
                        if (var20 >= class11.field249) {
                            class191.method1255(var30, arg1, var29, 62, class38.field870[var20]);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class11.field249 && class276.field4831 >= var31) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (class51.field1099 <= var33 && field3587 >= var34) {
                    int var35 = class98.method672(-257, field3587, var33, class51.field1099);
                    int var36 = class98.method672(-257, field3587, var34, class51.field1099);
                    if (var10 > var7) {
                        int var37 = var12 >= var7 ? var12 : class94.field1857[var7];
                        int var38 = class98.method672(-257, field3587, arg5 + var37, class51.field1099);
                        int var39 = class98.method672(-257, field3587, arg5 - var37, class51.field1099);
                        if (var32 <= class276.field4831) {
                            int[] var40 = class38.field870[var32];
                            class191.method1255(var36, arg1, var39, 65, var40);
                            class191.method1255(var39, arg6, var38, 98, var40);
                            class191.method1255(var38, arg1, var35, 103, var40);
                        }
                        if (class11.field249 <= var31) {
                            int[] var41 = class38.field870[var31];
                            class191.method1255(var36, arg1, var39, 109, var41);
                            class191.method1255(var39, arg6, var38, 109, var41);
                            class191.method1255(var38, arg1, var35, 120, var41);
                        }
                    } else {
                        if (var32 <= class276.field4831) {
                            class191.method1255(var36, arg1, var35, 122, class38.field870[var32]);
                        }
                        if (var31 >= class11.field249) {
                            class191.method1255(var36, arg1, var35, 74, class38.field870[var31]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "([B)V")
    public class198(byte[] arg0) {
        this.field3585 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
    public static final void method1347(int arg0, int arg1) {
        if (~arg1 == arg0 && !class143.field2612) {
            class93.method655(false);
        } else if (arg1 != -1 && (class186.field3358 != arg1 || !class94.method660(10683)) && class95.field1866 != 0 && !class143.field2612) {
            class200.method1392(class142.field2609, 85, 0, arg1, 2, false, class95.field1866);
        }
        field3586++;
        class186.field3358 = arg1;
    }
}
