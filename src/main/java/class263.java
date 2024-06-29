import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class263 extends IOException {

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "F")
    public static float field3725;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "J")
    public static long field3722;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)V", line = 3)
    public static final void method1695(int arg0, int arg1) {
        field3726++;
        if (arg0 != 23108) {
            method1696(-53, 112, -108);
        }
        class150 var2 = class676.method3885(1000, 3, arg1);
        var2.method1115(true);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 19)
    public class263(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method1696(int arg0, int arg1, int arg2) {
        field3727++;
        if (arg1 != -25072) {
            field3724 = -125;
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIIIIILtea;III)Z", line = 34)
    public static final boolean method1697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class240 arg8, int arg9, int arg10, int arg11) {
        field3723++;
        int var12 = arg1;
        int var13 = -106 % ((-arg4 - 8) / 42);
        int var14 = arg0;
        byte var15 = 64;
        byte var16 = 64;
        int var17 = arg1 - var15;
        int var18 = arg0 - var16;
        class460.field6788[var15][var16] = 99;
        class211.field3179[var15][var16] = 0;
        byte var19 = 0;
        int var20 = 0;
        class142.field1864[var19] = arg1;
        int var36 = var19 + 1;
        class611.field8637[var19] = arg0;
        int[][] var21 = arg8.field3488;
        while (true) {
            label282: while (true) {
                int var22;
                int var23;
                int var24;
                int var25;
                int var27;
                do {
                    do {
                        do {
                            label259: do {
                                if (var36 == var20) {
                                    class42.field458 = var14;
                                    class630.field8796 = var12;
                                    return false;
                                }
                                var14 = class611.field8637[var20];
                                var12 = class142.field1864[var20];
                                var20 = var20 + 1 & 0xFFF;
                                var22 = var14 - var18;
                                var23 = var12 - var17;
                                var24 = var12 - arg8.field3500;
                                var25 = var14 - arg8.field3482;
                                if (arg3 == -4) {
                                    if (arg7 == var12 && arg2 == var14) {
                                        class42.field458 = var14;
                                        class630.field8796 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -3) {
                                    if (class387.method2493(arg7, arg9, arg11, arg5, var12, 123, arg2, arg9, var14)) {
                                        class630.field8796 = var12;
                                        class42.field458 = var14;
                                        return true;
                                    }
                                } else if (arg3 == -2) {
                                    if (arg8.method1592(-10783, arg9, var12, arg7, var14, arg2, arg5, arg9, arg6, arg11)) {
                                        class42.field458 = var14;
                                        class630.field8796 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -1) {
                                    if (arg8.method1596(arg7, arg11, arg6, -16001, arg5, arg2, arg9, var12, var14)) {
                                        class630.field8796 = var12;
                                        class42.field458 = var14;
                                        return true;
                                    }
                                } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                                    if (arg8.method1599(var14, arg2, arg3, -16752, arg7, arg9, arg10, var12)) {
                                        class42.field458 = var14;
                                        class630.field8796 = var12;
                                        return true;
                                    }
                                } else if (arg8.method1606(arg9, arg2, var12, arg3, arg7, 671744, var14, arg10)) {
                                    class630.field8796 = var12;
                                    class42.field458 = var14;
                                    return true;
                                }
                                var27 = class211.field3179[var23][var22] + 1;
                                if (var23 > 0 && class460.field6788[var23 - 1][var22] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][arg9 + var25 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var28) {
                                            class142.field1864[var36] = var12 - 1;
                                            class611.field8637[var36] = var14;
                                            var36 = var36 + 1 & 0xFFF;
                                            class460.field6788[var23 - 1][var22] = 2;
                                            class211.field3179[var23 - 1][var22] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var23 < 128 - arg9 && class460.field6788[var23 + 1][var22] == 0 && (var21[var24 + arg9][var25] & 0x60E40000) == 0 && (var21[arg9 + var24][var25 - (1 - arg9)] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg9 - 1) {
                                            class142.field1864[var36] = var12 + 1;
                                            class611.field8637[var36] = var14;
                                            class460.field6788[var23 + 1][var22] = 8;
                                            var36 = var36 + 1 & 0xFFF;
                                            class211.field3179[var23 + 1][var22] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + arg9][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 > 0 && class460.field6788[var23][var22 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[arg9 + var24 - 1][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var30) {
                                            class142.field1864[var36] = var12;
                                            class611.field8637[var36] = var14 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class460.field6788[var23][var22 - 1] = 1;
                                            class211.field3179[var23][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 < 128 - arg9 && class460.field6788[var23][var22 + 1] == 0 && (var21[var24][arg9 + var25] & 0x4E240000) == 0 && (var21[var24 + arg9 - 1][arg9 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var31) {
                                            class142.field1864[var36] = var12;
                                            class611.field8637[var36] = var14 + 1;
                                            class460.field6788[var23][var22 + 1] = 4;
                                            var36 = var36 + 1 & 0xFFF;
                                            class211.field3179[var23][var22 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][arg9 + var25] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var23 > 0 && var22 > 0 && class460.field6788[var23 - 1][var22 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg9) {
                                            class142.field1864[var36] = var12 - 1;
                                            class611.field8637[var36] = var14 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class460.field6788[var23 - 1][var22 - 1] = 3;
                                            class211.field3179[var23 - 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var32 - 1] & 0x4FA40000) != 0 || (var21[var24 + var32 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var23 < 128 - arg9 && var22 > 0 && class460.field6788[var23 + 1][var22 - 1] == 0 && (var21[arg9 + var24][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (var33 >= arg9) {
                                            class142.field1864[var36] = var12 + 1;
                                            class611.field8637[var36] = var14 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class460.field6788[var23 + 1][var22 - 1] = 9;
                                            class211.field3179[var23 + 1][var22 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg9 + var24][var25 + var33 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var23 > 0 && 128 - arg9 > var22 && class460.field6788[var23 - 1][var22 + 1] == 0 && (var21[var24 - 1][arg9 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg9; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var24 + var34 - 1][arg9 + var25] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class142.field1864[var36] = var12 - 1;
                                    class611.field8637[var36] = var14 + 1;
                                    var36 = var36 + 1 & 0xFFF;
                                    class460.field6788[var23 - 1][var22 + 1] = 6;
                                    class211.field3179[var23 - 1][var22 + 1] = var27;
                                }
                            } while (128 - arg9 <= var23);
                        } while (var22 >= (128 - arg9));
                    } while (class460.field6788[var23 + 1][var22 + 1] != 0);
                } while ((var21[arg9 + var24][arg9 + var25] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg9; var35++) {
                    if ((var21[var24 + var35][arg9 + var25] & 0x7E240000) != 0 || (var21[var24 + arg9][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class142.field1864[var36] = var12 + 1;
                class611.field8637[var36] = var14 + 1;
                class460.field6788[var23 + 1][var22 + 1] = 12;
                var36 = var36 + 1 & 0xFFF;
                class211.field3179[var23 + 1][var22 + 1] = var27;
            }
        }
    }
}
