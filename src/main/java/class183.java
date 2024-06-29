import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class183 extends class354 implements class381 {

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "Lel;")
    public class354 field2519;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2515 = 1;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Lgd;")
    public static class206 field2511 = new class206("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)I")
    public final int method9(int arg0) {
        field2507++;
        if (arg0 != -769) {
            this.field2519 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIILel;)V")
    public class183(int arg0, int arg1, int arg2, class354 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field2519 = arg3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lwm;I)V")
    public final void method16(class364 arg0, int arg1) {
        field2513++;
        if (arg1 != 31591) {
            this.field2519 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        field2505++;
        if (arg1 >= -48) {
            field2515 = 94;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        field2516++;
        if (arg0 >= -105) {
            this.method16((class364) null, -82);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([[II)V")
    public static final void method1071(int[][] arg0, int arg1) {
        if (arg1 != 29429) {
            method1071((int[][]) null, 115);
        }
        class102.field1472 = arg0;
        field2518++;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        field2510++;
        if (arg0 >= -74) {
            this.field2519 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
    public static void method1072(boolean arg0) {
        field2511 = null;
        if (arg0) {
            method1071((int[][]) null, 90);
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        field2503++;
        return arg1 <= 99 ? null : null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)Z")
    public final boolean method7(boolean arg0) {
        field2502++;
        if (arg0) {
            field2511 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)I")
    public final int method4(int arg0) {
        if (arg0 != -10666) {
            field2515 = 24;
        }
        field2520++;
        return 0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILwm;ZLhp;Z)V")
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        if (arg6) {
            field2504++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLwm;)V")
    public final void method12(byte arg0, class364 arg1) {
        field2521++;
        if (arg0 <= 27) {
            method1071((int[][]) null, -50);
        }
    }

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "(I)V")
    public static final void method1073(int arg0) {
        field2506++;
        if (arg0 != -1) {
            field2515 = 119;
        }
        if (class98.field1434 != null) {
            class98.field1434.method845(arg0 ^ 0xFFFFFEFF);
        }
        if (class259.field3433 != null) {
            class259.field3433.method845(arg0 + 257);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        if (arg2 >= -107) {
            return true;
        } else {
            field2514++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        field2509++;
        if (arg0 != 7) {
            field2515 = -47;
        }
        return false;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
    public final int method13(int arg0) {
        if (arg0 < 51) {
            return 121;
        } else {
            field2517++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILwm;I)Lgn;")
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        field2512++;
        if (arg2 != -28045) {
            this.method8(19);
        }
        return null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2508++;
        class404.method2442(arg5, 0);
        int var7 = 0;
        int var8 = arg5 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 != 1) {
            method1073(97);
        }
        int[] var15 = class102.field1472[arg4];
        int var16 = arg2 - var8;
        class330.method1834(var16, var15, arg3, arg2 - arg5, 25084);
        int var17 = arg2 + var8;
        class330.method1834(var17, var15, arg0, var16, arg1 + 25083);
        class330.method1834(arg2 + arg5, var15, arg3, var17, 25084);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class2.field38[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class102.field1472[arg4 + var9];
                    int[] var19 = class102.field1472[arg4 - var9];
                    int var20 = class2.field38[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = arg2 - var20;
                    class330.method1834(var24, var18, arg3, var22, arg1 ^ 0x61FD);
                    class330.method1834(var23, var18, arg0, var24, 25084);
                    class330.method1834(var21, var18, arg3, var23, arg1 + 25083);
                    class330.method1834(var24, var19, arg3, var22, 25084);
                    class330.method1834(var23, var19, arg0, var24, 25084);
                    class330.method1834(var21, var19, arg3, var23, 25084);
                } else {
                    int[] var25 = class102.field1472[arg4 + var9];
                    int[] var26 = class102.field1472[arg4 - var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class330.method1834(var27, var25, arg3, var28, arg1 ^ 0x61FD);
                    class330.method1834(var27, var26, arg3, var28, 25084);
                }
            }
            int[] var29 = class102.field1472[arg4 + var7];
            int[] var30 = class102.field1472[arg4 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var8 > var7) {
                int var33 = var11 >= var7 ? var11 : class2.field38[var7];
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class330.method1834(var35, var29, arg3, var32, 25084);
                class330.method1834(var34, var29, arg0, var35, arg1 + 25083);
                class330.method1834(var31, var29, arg3, var34, 25084);
                class330.method1834(var35, var30, arg3, var32, 25084);
                class330.method1834(var34, var30, arg0, var35, 25084);
                class330.method1834(var31, var30, arg3, var34, 25084);
            } else {
                class330.method1834(var31, var29, arg3, var32, arg1 + 25083);
                class330.method1834(var31, var30, arg3, var32, 25084);
            }
        }
    }
}
