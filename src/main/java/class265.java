import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class265 extends class235 {

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[Z")
    public static boolean[] field4635 = new boolean[200];

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Lsb;")
    private static class98 field4629 = class47.method368("FULL", 0);

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lsb;")
    public static class98 field4631 = field4629;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Ljava/lang/Object;")
    public static Object field4634 = new Object();

    @OriginalMember(owner = "client!f", name = "I", descriptor = "Lsb;")
    public static class98 field4643 = class47.method368("W-=hlen Sie eine Option", 0);

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field4644 = 0;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "[Lnj;")
    public static class82[] field4642;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZIII)V")
    public static final void method1799(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4633++;
        if (class141.method1056(arg0, (byte) 99)) {
            if (arg2 <= 33) {
                method1800(-31, 67, 107, 100, -38, -108, -39, -18, 81, true, -50, -75, -54);
            }
            class55.method408(class33.field585[arg0], arg4, -1, 120, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIIZIII)Z")
    public static final boolean method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class230.field3970[var13][var40] = 0;
                class115.field2068[var13][var40] = 99999999;
            }
        }
        class230.field3970[arg12][arg8] = 99;
        int var14 = arg12;
        int var15 = arg8;
        field4632++;
        byte var16 = 0;
        boolean var17 = false;
        int var18 = 0;
        class115.field2068[arg12][arg8] = 0;
        class205.field3508[var16] = arg12;
        int var41 = var16 + 1;
        class138.field2462[var16] = arg8;
        int[][] var19 = class110.field1961[field4640].field1175;
        if (arg6 > 0) {
            method1800(-84, -10, -34, -19, 105, 105, 49, 40, -11, true, -113, -108, -107);
        }
        label370: while (var41 != var18) {
            var15 = class138.field2462[var18];
            var14 = class205.field3508[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg1 == var14 && arg4 == var15) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class110.field1961[field4640].method510((byte) 114, var14, arg4, arg11, arg1, var15, arg3, arg10 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && class110.field1961[field4640].method516(arg10 - 1, var14, var15, arg11, false, arg1, arg4, arg3)) {
                    var17 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg7 != 0 && class110.field1961[field4640].method500(arg4, var14, arg5, arg1, 8, arg3, arg2, var15, arg7)) {
                var17 = true;
                break;
            }
            int var31 = class115.field2068[var14][var15] + 1;
            if (var14 > 0 && class230.field3970[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg3 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if ((arg3 - 1) <= var32) {
                        class205.field3508[var41] = var14 - 1;
                        class138.field2462[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class230.field3970[var14 - 1][var15] = 2;
                        class115.field2068[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class230.field3970[var14 + 1][var15] == 0 && (var19[arg3 + var14][var15] & 0x12C0183) == 0 && (var19[arg3 + var14][var15 + arg3 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if ((arg3 - 1) <= var33) {
                        class205.field3508[var41] = var14 + 1;
                        class138.field2462[var41] = var15;
                        class230.field3970[var14 + 1][var15] = 8;
                        class115.field2068[var14 + 1][var15] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg3 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class230.field3970[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[arg3 + var14 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg3 - 1 <= var34) {
                        class205.field3508[var41] = var14;
                        class138.field2462[var41] = var15 - 1;
                        class230.field3970[var14][var15 - 1] = 1;
                        class115.field2068[var14][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class230.field3970[var14][var15 + 1] == 0 && (var19[var14][arg3 + var15] & 0x12C0138) == 0 && (var19[var14 + arg3 - 1][arg3 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if ((arg3 - 1) <= var35) {
                        class205.field3508[var41] = var14;
                        class138.field2462[var41] = var15 + 1;
                        class230.field3970[var14][var15 + 1] = 4;
                        var41 = var41 + 1 & 0xFFF;
                        class115.field2068[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg3 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class230.field3970[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg3 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg3 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if ((arg3 - 1) <= var36) {
                        class205.field3508[var41] = var14 - 1;
                        class138.field2462[var41] = var15 - 1;
                        class230.field3970[var14 - 1][var15 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class115.field2068[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class230.field3970[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg3][var15 - 1] & 0x12C0183) == 0 && (var19[arg3 + var14][var15 + arg3 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (arg3 - 1 <= var37) {
                        class205.field3508[var41] = var14 + 1;
                        class138.field2462[var41] = var15 - 1;
                        class230.field3970[var14 + 1][var15 - 1] = 9;
                        class115.field2068[var14 + 1][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[arg3 + var14][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class230.field3970[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg3 + var15] & 0x12C0138) == 0 && (var19[var14][var15 + arg3] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if ((arg3 - 1) <= var38) {
                        class205.field3508[var41] = var14 - 1;
                        class138.field2462[var41] = var15 + 1;
                        class230.field3970[var14 - 1][var15 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class115.field2068[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][var15 + arg3] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class230.field3970[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg3 + var15] & 0x12C0138) == 0 && (var19[var14 + arg3][arg3 + var15] & 0x12C01E0) == 0 && (var19[arg3 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg3 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][arg3 + var15] & 0x12C01F8) != 0 || (var19[arg3 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label370;
                    }
                }
                class205.field3508[var41] = var14 + 1;
                class138.field2462[var41] = var15 + 1;
                var41 = var41 + 1 & 0xFFF;
                class230.field3970[var14 + 1][var15 + 1] = 12;
                class115.field2068[var14 + 1][var15 + 1] = var31;
            }
        }
        class76.field1334 = 0;
        if (!var17) {
            if (!arg9) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg1 - var22; var23 <= (arg1 + var22); var23++) {
                for (int var24 = arg4 - var22; var24 <= arg4 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class115.field2068[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg1 > var23) {
                            var25 = arg1 - var23;
                        } else if (var23 > arg1 + arg5 - 1) {
                            var25 = var23 + 1 - arg1 - arg5;
                        }
                        int var26 = 0;
                        if (var24 < arg4) {
                            var26 = arg4 - var24;
                        } else if ((arg4 + arg7 - 1) < var24) {
                            var26 = var24 - (arg4 + arg7 - 1);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && class115.field2068[var23][var24] < var20) {
                            var15 = var24;
                            var21 = var27;
                            var14 = var23;
                            var20 = class115.field2068[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg12 == var14 && arg8 == var15) {
                return false;
            }
            class76.field1334 = 1;
        }
        byte var28 = 0;
        class205.field3508[var28] = var14;
        int var42 = var28 + 1;
        class138.field2462[var28] = var15;
        int var29;
        int var30 = var29 = class230.field3970[var14][var15];
        while (arg12 != var14 || arg8 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class205.field3508[var42] = var14;
                class138.field2462[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class230.field3970[var14][var15];
        }
        if (var42 > 0) {
            class194.method1337(var42, arg0, 10615);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
    public static void method1801(byte arg0) {
        field4642 = null;
        field4635 = null;
        field4629 = null;
        if (arg0 == -16) {
            field4634 = null;
            field4631 = null;
            field4643 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLtg;)Z")
    public static final boolean method1802(boolean arg0, class75 arg1) {
        field4637++;
        if (arg0) {
            method1799(54, true, 75, 24, -77);
        }
        return arg1.method575(class129.field2297, 0);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V")
    public class265(int arg0, int arg1) {
        this.field4636 = arg1;
        this.field4630 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4641++;
        for (int var6 = arg4; var6 <= arg1; var6++) {
            class37.method305(-7, class43.field721[var6], arg2, arg3, arg0);
        }
        if (!arg5) {
            method1801((byte) -19);
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
    public static final void method1804(byte arg0) {
        field4639++;
        class255.method1764((byte) 127);
        class251.method1741(arg0 ^ 0xA);
        class61.method450(true);
        class189.method1301((byte) 9);
        class56.method412(arg0 ^ 0xB);
        class218.method1503((byte) -70);
        class255.method1760((byte) -119);
        class72.method508((byte) -114);
        class26.method266((byte) -109);
        class76.method584(20);
        class87.method642((byte) -110);
        class181.method1251(-21337);
        class110.method832(-3);
        if (arg0 != 10) {
            field4629 = null;
        }
        class112.method841(0);
        class138.field2457.method1565(-1);
    }
}
