import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class427 {

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field5723 = -1;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIBIII)V", line = 4)
    public static final void method2448(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var7 = -79 % ((arg3 + 46) / 51);
        field5720++;
        if (class667.field9373 <= arg5 && arg0 <= class225.field2994 && arg2 >= class546.field7619 && arg6 <= class760.field10606) {
            if (arg4 == 1) {
                class173.method1191(arg6, arg5, arg0, arg1, arg2, -79);
            } else {
                class714.method3998(arg4, arg0, (byte) 68, arg6, arg2, arg1, arg5);
            }
        } else if (arg4 == 1) {
            class238.method1488(arg0, arg1, -17655, arg6, arg5, arg2);
        } else {
            class542.method3108(arg5, arg2, false, arg6, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/awt/Canvas;Ld;I)Lha;", line = 34)
    public static final class60 method2449(int arg0, Canvas arg1, class153 arg2, int arg3) {
        field5721++;
        if (arg3 != -31318) {
            method2450(-49);
        }
        return new class483(arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2450(int arg0) {
        class440.method2498(65280);
        field5719++;
        int var1 = class748.field10451.field10413.method1188((byte) -95);
        if (var1 == 2) {
            class759.method4221(class356.field4586, 100, 114, class386.field4930, 100, class466.field6263);
        } else if (var1 == 3) {
            class244.method1523(2, 2, class282.field3560, -110, class386.field4930, class329.field4201, class466.field6263, class356.field4586);
        }
        if (arg0 != 0) {
            field5723 = -38;
        }
        if (class748.field10451.field10413.method1186((byte) -9)) {
            class649.method3642(class262.field3311, (byte) -31);
        }
        if (class386.field4930 != null) {
            class443.method2511(arg0 ^ 0xFFFF8E69);
        }
        class232.field3053 = class748.field10451.field10413.method1188((byte) 64) != 0;
        class676.field9448 = class748.field10451.field10413.method1186((byte) -9);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIILje;IIBII)Z", line = 94)
    public static final boolean method2451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class405 arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        field5722++;
        int var12 = arg11;
        int var13 = arg1;
        byte var14 = 64;
        byte var15 = 64;
        if (arg9 != 97) {
            return false;
        }
        int var16 = arg11 - var14;
        class161.field2220[var14][var15] = 99;
        int var17 = arg1 - var15;
        class545.field7602[var14][var15] = 0;
        byte var18 = 0;
        class310.field4086[var18] = arg11;
        int var19 = 0;
        int var35 = var18 + 1;
        class142.field2013[var18] = arg1;
        int[][] var20 = arg6.field5137;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class736.field10234 = var12;
                                    class632.field8726 = var13;
                                    return false;
                                }
                                var12 = class310.field4086[var19];
                                var13 = class142.field2013[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg6.field5131;
                                var24 = var13 - arg6.field5122;
                                if (arg5 == -4) {
                                    if (arg8 == var12 && arg4 == var13) {
                                        class736.field10234 = var12;
                                        class632.field8726 = var13;
                                        return true;
                                    }
                                } else if (arg5 == -3) {
                                    if (class217.method1414(arg7, var13, arg8, arg7, arg0, arg4, (byte) 97, var12, arg2)) {
                                        class632.field8726 = var13;
                                        class736.field10234 = var12;
                                        return true;
                                    }
                                } else if (arg5 == -2) {
                                    if (arg6.method2256(arg8, (byte) -93, arg4, arg2, var12, arg7, arg3, arg7, var13, arg0)) {
                                        class632.field8726 = var13;
                                        class736.field10234 = var12;
                                        return true;
                                    }
                                } else if (arg5 == -1) {
                                    if (arg6.method2259(arg7, arg3, var13, (byte) 33, arg8, var12, arg0, arg2, arg4)) {
                                        class736.field10234 = var12;
                                        class632.field8726 = var13;
                                        return true;
                                    }
                                } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                                    if (arg6.method2258(arg4, arg5, arg7, arg8, arg10, var12, -1, var13)) {
                                        class736.field10234 = var12;
                                        class632.field8726 = var13;
                                        return true;
                                    }
                                } else if (arg6.method2254(112, arg5, var13, var12, arg8, arg7, arg4, arg10)) {
                                    class632.field8726 = var13;
                                    class736.field10234 = var12;
                                    return true;
                                }
                                var26 = class545.field7602[var21][var22] + 1;
                                if (var21 > 0 && class161.field2220[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg7 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg7 - 1 <= var27) {
                                            class310.field4086[var35] = var12 - 1;
                                            class142.field2013[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2220[var21 - 1][var22] = 2;
                                            class545.field7602[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg7) > var21 && class161.field2220[var21 + 1][var22] == 0 && (var20[arg7 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg7][arg7 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg7 - 1) {
                                            class310.field4086[var35] = var12 + 1;
                                            class142.field2013[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2220[var21 + 1][var22] = 8;
                                            class545.field7602[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class161.field2220[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg7 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg7 - 1) {
                                            class310.field4086[var35] = var12;
                                            class142.field2013[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2220[var21][var22 - 1] = 1;
                                            class545.field7602[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg7) > var22 && class161.field2220[var21][var22 + 1] == 0 && (var20[var23][var24 + arg7] & 0x4E240000) == 0 && (var20[arg7 + var23 - 1][arg7 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg7 - 1) {
                                            class310.field4086[var35] = var12;
                                            class142.field2013[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2220[var21][var22 + 1] = 4;
                                            class545.field7602[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg7 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class161.field2220[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg7) {
                                            class310.field4086[var35] = var12 - 1;
                                            class142.field2013[var35] = var13 - 1;
                                            class161.field2220[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class545.field7602[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg7) > var21 && var22 > 0 && class161.field2220[var21 + 1][var22 - 1] == 0 && (var20[var23 + arg7][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg7) {
                                            class310.field4086[var35] = var12 + 1;
                                            class142.field2013[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2220[var21 + 1][var22 - 1] = 9;
                                            class545.field7602[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg7) && class161.field2220[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg7 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg7; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg7 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class310.field4086[var35] = var12 - 1;
                                    class142.field2013[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class161.field2220[var21 - 1][var22 + 1] = 6;
                                    class545.field7602[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg7));
                        } while (var22 >= (128 - arg7));
                    } while (class161.field2220[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg7 + var23][arg7 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg7; var34++) {
                    if ((var20[var23 + var34][arg7 + var24] & 0x7E240000) != 0 || (var20[var23 + arg7][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class310.field4086[var35] = var12 + 1;
                class142.field2013[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class161.field2220[var21 + 1][var22 + 1] = 12;
                class545.field7602[var21 + 1][var22 + 1] = var26;
            }
        }
    }
}
