import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class78 extends RuntimeException {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Ljava/lang/String;")
    public String field1498;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1503;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lud;")
    public static class279 field1499 = class130.method1024("::rect_debug", 255);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lok;")
    public static class149 field1497;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[Lg;")
    public static class158[] field1502;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "[[S")
    public static short[][] field1500;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 15)
    public static void method653(int arg0) {
        field1500 = (short[][]) null;
        field1502 = null;
        if (arg0 >= -93) {
            method656(85, 119, 49, 20, 117, 20, (byte) -38, 76, 26, 36, -108);
        }
        field1497 = null;
        field1499 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I", line = 30)
    public static final int method654(int arg0, int arg1) {
        field1501++;
        if (arg0 != -237709785) {
            field1502 = (class158[]) null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIILsf;IZJ)Z", line = 42)
    public static final boolean method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class108 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class165.field2970 == class14.field432;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class207.field3668 || var16 >= class54.field1193) {
                    return false;
                }
                class191 var17 = class24.field619[arg0][var15][var16];
                if (var17 != null && var17.field3451 >= 5) {
                    return false;
                }
            }
        }
        class18 var18 = new class18();
        var18.field546 = arg11;
        var18.field557 = arg0;
        var18.field550 = arg5;
        var18.field544 = arg6;
        var18.field561 = arg7;
        var18.field563 = arg8;
        var18.field559 = arg9;
        var18.field560 = arg1;
        var18.field564 = arg2;
        var18.field562 = arg1 + arg3 - 1;
        var18.field556 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class24.field619[var22][var19][var20] == null) {
                        class24.field619[var22][var19][var20] = new class191(var22, var19, var20);
                    }
                }
                class191 var23 = class24.field619[arg0][var19][var20];
                var23.field3455[var23.field3451] = var18;
                var23.field3459[var23.field3451] = var21;
                var23.field3443 |= var21;
                var23.field3451++;
                if (var13 && class222.field3931[var19][var20] != 0) {
                    var14 = class222.field3931[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class222.field3931[var24][var25] == 0) {
                        class222.field3931[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class180.field3264[class272.field4849++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIBIIII)V", line = 163)
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0 - arg1;
        int var12 = -1;
        field1496++;
        if (class192.field3470 > 0) {
            if (class189.field3414 > 10) {
                var12 = (10 + 10 - class189.field3414) * 5;
            } else {
                var12 = class189.field3414 * 5;
            }
        }
        int var13 = arg10 - arg2;
        int var14 = 72 % ((-arg6 - 38) / 61);
        int var15 = 983040 / arg5;
        int var16 = 983040 / arg9;
        for (int var17 = -var15; var17 < var13 + var15; var17++) {
            int var18 = (var17 + 1) * arg5 + arg3 >> 16;
            int var19 = arg5 * var17 + arg3 >> 16;
            int var20 = var18 - var19;
            if (var20 > 0) {
                int var10000 = arg4 + var18;
                int var22 = arg4 + var19;
                int var23 = arg2 + var17 >> 6;
                if (var23 >= 0 && var23 <= class204.field3630.length - 1) {
                    int[][] var24 = class204.field3630[var23];
                    for (int var25 = -var16; var25 < (var11 + var16); var25++) {
                        int var26 = arg9 * var25 + arg7 >> 16;
                        int var27 = (var25 + 1) * arg9 + arg7 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg8 + var27;
                            int var30 = arg8 + var26;
                            int var31 = arg1 + var25 >> 6;
                            if (var31 >= 0 && var31 <= var24.length - 1 && var24[var31] != null) {
                                int var32 = ((arg1 + var25 & 0x3F) << 6) + (arg2 + var17 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class264 var34 = class252.method1808(var33 - 1, (byte) 4);
                                    if (!class33.field740[var34.field4722]) {
                                        if (var12 != -1 && class69.field1369 == var34.field4722) {
                                            class215 var35 = new class215();
                                            var35.field3785 = var22;
                                            var35.field3788 = var34.field4722;
                                            var35.field3782 = var30;
                                            class163.field2935.method2246(true, var35);
                                        } else {
                                            class279.field4929[var34.field4722].method584(var22 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class215 var36 = (class215) class163.field2935.method2248(119); var36 != null; var36 = (class215) class163.field2935.method2240(1138)) {
            class146.method1128(var36.field3785, var36.field3782, 15, 16776960, var12);
            class146.method1128(var36.field3785, var36.field3782, 13, 16776960, var12);
            class146.method1128(var36.field3785, var36.field3782, 11, 16776960, var12);
            class146.method1128(var36.field3785, var36.field3782, 9, 16776960, var12);
            class279.field4929[var36.field3788].method584(var36.field3785 - 7, var36.field3782 + -7);
        }
        class163.field2935.method2243(77);
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 289)
    public class78(Throwable arg0, String arg1) {
        this.field1498 = arg1;
        this.field1503 = arg0;
    }
}
