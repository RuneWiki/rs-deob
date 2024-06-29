import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class53 extends class383 {

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lub;")
    public static class18 field706 = new class18();

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[I")
    public static int[] field707 = new int[4096];

    @OriginalMember(owner = "client!u", name = "r", descriptor = "J")
    public static long field710;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lkc;")
    public static class87 field708;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "[I")
    public static int[] field709;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method522(int arg0) {
        if (arg0 == -3) {
            field707 = null;
            field706 = null;
            field708 = null;
            field709 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public static final void method523(int arg0) {
        field705++;
        if (arg0 != -7340) {
            field709 = null;
        }
        if (class33.field416.method368()) {
            class33.field416.method277(class8.field71);
            class22.method190(arg0 ^ 0xFFFFE354);
            class33.field416.method271(class8.field71);
            class33.field416.method342(class8.field71);
        } else {
            method525(67, class377.field4959);
        }
        class68.method604(-9192);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method524(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field704++;
        if (arg2 == arg7) {
            class501.method3017(arg0, arg3, (byte) -22, arg5, arg6, arg4, arg7);
        } else if (!arg1) {
            if (class147.field1870 <= arg6 - arg7 && class237.field3019 >= (arg6 + arg7) && class533.field7845 <= (arg5 - arg2) && class289.field3694 >= (arg5 + arg2)) {
                class26.method212(arg5, arg6, arg0, arg7, arg3, arg4, -128, arg2);
            } else {
                class522.method3103(arg0, arg7, arg2, arg3, true, arg6, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
    public static final void method525(int arg0, int arg1) {
        field702++;
        class211.method1308((byte) -108);
        class22.method190(0);
        if (arg0 <= 65) {
            method525(14, -128);
        }
        class73.method634(true, arg1, 0);
        class197.method1220(class511.field7421, -18577, class33.field416, class448.field6413);
        class386.method2181(class448.field6413, class33.field416, (byte) 124);
        class451.method2690(false);
        class433.method2538(class6.field61, 10);
        class68.method604(-9192);
        if (class483.field7059 == 2) {
            class284.method1677(-20429, 3);
        } else if (class483.field7059 == 6) {
            class284.method1677(-20429, 7);
            return;
        } else if (class483.field7059 == 9) {
            class284.method1677(-20429, 10);
            return;
        } else if (class483.field7059 == 1) {
            class78.method670(false, class33.field416, class448.field6413);
            return;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZIIIII)V")
    public static final void method526(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field703++;
        int var6 = arg2 - arg1;
        int var7 = arg4 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class269.method1597(arg2, arg1, (byte) 75, arg5, arg3);
            }
        } else if (var6 == 0) {
            class168.method1081(arg5, true, arg3, arg1, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (!arg0) {
                if (var8) {
                    int var9 = arg3;
                    int var10 = arg4;
                    arg3 = arg1;
                    arg1 = var9;
                    arg4 = arg2;
                    arg2 = var10;
                }
                if (arg4 < arg3) {
                    int var11 = arg3;
                    int var12 = arg1;
                    arg3 = arg4;
                    arg1 = arg2;
                    arg4 = var11;
                    arg2 = var12;
                }
                int var13 = arg1;
                int var14 = arg4 - arg3;
                int var15 = arg2 - arg1;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg2 > arg1 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg3; var18 <= arg4; var18++) {
                        class387.field5088[var18][var13] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg3; var19 <= arg4; var19++) {
                        class387.field5088[var13][var19] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                }
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field707[var0] = class97.method731(var0, (byte) 81);
        }
        field710 = -1L;
    }
}
