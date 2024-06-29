import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class class56 extends class152 {

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "[Lib;")
    public static class41[] field932 = new class41[4];

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field928 = 0;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "Lpc;")
    public static class166 field930;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method392(int arg0);

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILqh;III)V")
    public static final void method393(int arg0, class69 arg1, int arg2, int arg3, int arg4) {
        field927++;
        class229.method1593(-125);
        if (arg4 != 104) {
            method397(-126);
        }
        class206.method1466(arg2, arg0, arg1.field1183 + arg2, arg1.field1220 + arg0);
        if (class22.field351 == 2 || class22.field351 == 5 || class254.field4448 == null) {
            class206.method1477(arg2, arg0, 0, arg1.field1262, arg1.field1306);
        } else {
            int var5 = class93.field1750 + class40.field667 & 0x7FF;
            int var6 = 464 - (class235.field4203.field3615 / 32);
            int var7 = class235.field4203.field3633 / 32 + 48;
            ((class105) class254.field4448).method107(arg2, arg0, arg1.field1183, arg1.field1220, var7, var6, var5, class26.field410 + 256, arg1.field1262, arg1.field1306);
            if (class160.field2941 != null) {
                for (int var8 = 0; var8 < class160.field2941.field4096; var8++) {
                    if (class160.field2941.method1586(var8, 3777)) {
                        int var9 = (class160.field2941.field4097[var8] - class257.field4500) * 4 + 2 - (class235.field4203.field3615 / 32);
                        int var10 = (class160.field2941.field4105[var8] - class62.field1035) * 4 + 2 - (class235.field4203.field3633 / 32);
                        int var11 = class98.field1839[var5];
                        int var12 = class98.field1843[var5];
                        int var13 = var11 * 256 / (class26.field410 + 256);
                        int var14 = var12 * 256 / (class26.field410 + 256);
                        int var15 = var9 * var13 + var10 * var14 >> 16;
                        int var16 = var9 * var14 - (var10 * var13) >> 16;
                        class79 var17 = class43.field739;
                        if (class160.field2941.method1584(var8, (byte) -101) == 1) {
                            var17 = class12.field192;
                        }
                        if (class160.field2941.method1584(var8, (byte) -93) == 2) {
                            var17 = class216.field3932;
                        }
                        int var18 = var17.method580(class160.field2941.field4098[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= (-arg1.field1183) && arg1.field1183 >= var19 && -arg1.field1220 <= var16 && arg1.field1220 >= var16) {
                            int var20 = 16777215;
                            if (class160.field2941.field4106[var8] != -1) {
                                var20 = class160.field2941.field4106[var8];
                            }
                            class206.method1478(arg1.field1262, arg1.field1306);
                            var17.method567(class160.field2941.field4098[var8], arg1.field1183 / 2 + (var19 + arg2), arg1.field1220 / 2 + arg0 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class206.method1482();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class237.field4220; var21++) {
                int var54 = class30.field477[var21] * 4 + 2 - (class235.field4203.field3633 / 32);
                int var55 = class19.field293[var21] * 4 + 2 - (class235.field4203.field3615 / 32);
                class35 var56 = class9.method64(false, class178.field3243[var21]);
                if (var56.field577 != null) {
                    var56 = var56.method252(120);
                    if (var56 == null || var56.field580 == -1) {
                        continue;
                    }
                }
                class52.method362(var54, arg0, class183.field3370[var56.field580], arg2, arg1, var55, true);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    class128 var51 = class32.field498[class20.field323][var22][var50];
                    if (var51 != null) {
                        int var52 = var22 * 4 + 2 - (class235.field4203.field3633 / 32);
                        int var53 = var50 * 4 + 2 - class235.field4203.field3615 / 32;
                        class52.method362(var52, arg0, class186.field3410[0], arg2, arg1, var53, true);
                    }
                }
            }
            for (int var23 = 0; var23 < class199.field3573; var23++) {
                class2 var46 = class111.field2098[class155.field2887[var23]];
                if (var46 != null && var46.method24((byte) 117)) {
                    class181 var47 = var46.field41;
                    if (var47 != null && var47.field3329 != null) {
                        var47 = var47.method1330(-1);
                    }
                    if (var47 != null && var47.field3268 && var47.field3308) {
                        int var48 = var46.field3633 / 32 - class235.field4203.field3633 / 32;
                        int var49 = var46.field3615 / 32 - class235.field4203.field3615 / 32;
                        class52.method362(var48, arg0, class186.field3410[1], arg2, arg1, var49, true);
                    }
                }
            }
            for (int var24 = 0; var24 < class95.field1791; var24++) {
                class126 var38 = class106.field2029[class246.field4340[var24]];
                if (var38 != null && var38.method24((byte) 106)) {
                    int var39 = var38.field3633 / 32 - (class235.field4203.field3633 / 32);
                    int var40 = var38.field3615 / 32 - (class235.field4203.field3615 / 32);
                    boolean var41 = false;
                    long var42 = var38.field2424.method1193((byte) 72);
                    for (int var44 = 0; var44 < class155.field2889; var44++) {
                        if (class48.field798[var44] == var42 && class196.field3543[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class235.field4203.field2425 != 0 && var38.field2425 != 0 && class235.field4203.field2425 == var38.field2425) {
                        var45 = true;
                    }
                    if (var41) {
                        class52.method362(var39, arg0, class186.field3410[3], arg2, arg1, var40, true);
                    } else if (var45) {
                        class52.method362(var39, arg0, class186.field3410[4], arg2, arg1, var40, true);
                    } else {
                        class52.method362(var39, arg0, class186.field3410[2], arg2, arg1, var40, true);
                    }
                }
            }
            class135[] var25 = class174.field3174;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class135 var29 = var25[var26];
                if (var29 != null && var29.field2612 != 0 && class227.field4092 % 20 < 10) {
                    if (var29.field2612 == 1 && var29.field2613 >= 0 && var29.field2613 < class111.field2098.length) {
                        class2 var30 = class111.field2098[var29.field2613];
                        if (var30 != null) {
                            int var31 = var30.field3615 / 32 - (class235.field4203.field3615 / 32);
                            int var32 = var30.field3633 / 32 - (class235.field4203.field3633 / 32);
                            class239.method1659(arg2, var32, var31, arg1, arg0, var29.field2602, false);
                        }
                    }
                    if (var29.field2612 == 2) {
                        int var33 = (var29.field2616 - class62.field1035) * 4 + 2 - (class235.field4203.field3633 / 32);
                        int var34 = (var29.field2603 - class257.field4500) * 4 + 2 - (class235.field4203.field3615 / 32);
                        class239.method1659(arg2, var33, var34, arg1, arg0, var29.field2602, false);
                    }
                    if (var29.field2612 == 10 && var29.field2613 >= 0 && class106.field2029.length > var29.field2613) {
                        class126 var35 = class106.field2029[var29.field2613];
                        if (var35 != null) {
                            int var36 = var35.field3633 / 32 - (class235.field4203.field3633 / 32);
                            int var37 = var35.field3615 / 32 - (class235.field4203.field3615 / 32);
                            class239.method1659(arg2, var36, var37, arg1, arg0, var29.field2602, false);
                        }
                    }
                }
            }
            if (class265.field4605 != 0) {
                int var27 = class265.field4605 * 4 + 2 - (class235.field4203.field3633 / 32);
                int var28 = class213.field3886 * 4 + 2 - (class235.field4203.field3615 / 32);
                class52.method362(var27, arg0, client.field2003, arg2, arg1, var28, true);
            }
            class206.method1483(arg2 + (arg1.field1183 / 2) - 1, arg1.field1220 / 2 + arg0 - 1, 3, 3, 16777215);
        }
        class91.field1671[arg3] = true;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V")
    public static final void method394(byte arg0) {
        class237.field4217.method120((byte) -107);
        if (arg0 == 70) {
            class32.field493.method120((byte) -88);
            field933++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field931++;
        if (class127.field2465 <= arg0 && class252.field4407 >= arg0 && class127.field2465 <= arg4 && class252.field4407 >= arg4 && class127.field2465 <= arg2 && class252.field4407 >= arg2 && class127.field2465 <= arg8 && class252.field4407 >= arg8 && arg9 >= class182.field3344 && class201.field3593 >= arg9 && arg3 >= class182.field3344 && class201.field3593 >= arg3 && class182.field3344 <= arg7 && class201.field3593 >= arg7 && class182.field3344 <= arg1 && class201.field3593 >= arg1) {
            class233.method1617(arg0, arg8, arg1, arg9, arg4, 117, arg3, arg7, arg2, arg6);
        } else {
            class39.method275(arg9, arg7, arg8, arg0, arg6, arg1, arg2, -107, arg3, arg4);
        }
        if (!arg5) {
            method396((class163) null, -104, (class163) null, -13);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lhh;ILhh;I)V")
    public static final void method396(class163 arg0, int arg1, class163 arg2, int arg3) {
        class260.method1758(arg0, -1, arg2, false, arg3, (class163) null);
        if (arg1 > 89) {
            field929++;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public static void method397(int arg0) {
        if (arg0 != 0) {
            method395(-47, 98, -127, -121, 80, false, 101, 61, 107, 126);
        }
        field932 = null;
        field930 = null;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)Z")
    public abstract boolean method398(byte arg0);
}
