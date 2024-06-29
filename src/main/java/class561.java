import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class561 {

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "Ldi;")
    public static class112 field7574 = class31.method138(0);

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "[[I")
    public static int[][] field7570;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
    public static void method3107(boolean arg0) {
        field7574 = null;
        field7570 = null;
        if (arg0) {
            method3111(-55);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIIIILiaa;I)Z")
    public static final boolean method3108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class455 arg10, int arg11) {
        field7569++;
        int var12 = arg2;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg2 - var14;
        class134.field1900[var14][var15] = 99;
        int var17 = arg7 - var15;
        class247.field3509[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        if (arg8 != 1) {
            return true;
        }
        class450.field6289[var18] = arg2;
        int var35 = var18 + 1;
        class29.field360[var18] = arg7;
        int[][] var20 = arg10.field6346;
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
                                    class588.field8206 = var12;
                                    class63.field838 = var13;
                                    return false;
                                }
                                var12 = class450.field6289[var19];
                                var13 = class29.field360[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg10.field6355;
                                var24 = var13 - arg10.field6344;
                                if (arg1 == -4) {
                                    if (arg0 == var12 && arg9 == var13) {
                                        class588.field8206 = var12;
                                        class63.field838 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -3) {
                                    if (class460.method2652(arg11, arg4, arg9, arg6, arg6, var12, arg0, arg8 + 124, var13)) {
                                        class588.field8206 = var12;
                                        class63.field838 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -2) {
                                    if (arg10.method2613(var12, arg11, arg0, arg6, 8, var13, arg4, arg6, arg5, arg9)) {
                                        class588.field8206 = var12;
                                        class63.field838 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -1) {
                                    if (arg10.method2611(arg4, var13, arg11, arg5, arg9, (byte) 91, var12, arg0, arg6)) {
                                        class63.field838 = var13;
                                        class588.field8206 = var12;
                                        return true;
                                    }
                                } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                                    if (arg10.method2615(-26725, arg3, arg1, var13, var12, arg9, arg6, arg0)) {
                                        class588.field8206 = var12;
                                        class63.field838 = var13;
                                        return true;
                                    }
                                } else if (arg10.method2625(arg0, arg1, var13, arg6, arg8 ^ 0x79, arg9, var12, arg3)) {
                                    class588.field8206 = var12;
                                    class63.field838 = var13;
                                    return true;
                                }
                                var26 = class247.field3509[var22][var21] + 1;
                                if (var22 > 0 && class134.field1900[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg6 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg6 - 1)) {
                                            class450.field6289[var35] = var12 - 1;
                                            class29.field360[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class134.field1900[var22 - 1][var21] = 2;
                                            class247.field3509[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg6 > var22 && class134.field1900[var22 + 1][var21] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][var24 + arg6 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg6 - 1)) {
                                            class450.field6289[var35] = var12 + 1;
                                            class29.field360[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class134.field1900[var22 + 1][var21] = 8;
                                            class247.field3509[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class134.field1900[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg6 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var29) {
                                            class450.field6289[var35] = var12;
                                            class29.field360[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class134.field1900[var22][var21 - 1] = 1;
                                            class247.field3509[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (128 - arg6 > var21 && class134.field1900[var22][var21 + 1] == 0 && (var20[var23][arg6 + var24] & 0x4E240000) == 0 && (var20[var23 + arg6 - 1][var24 + arg6] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg6 - 1)) {
                                            class450.field6289[var35] = var12;
                                            class29.field360[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class134.field1900[var22][var21 + 1] = 4;
                                            class247.field3509[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg6 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class134.field1900[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class450.field6289[var35] = var12 - 1;
                                            class29.field360[var35] = var13 - 1;
                                            class134.field1900[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class247.field3509[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg6 && var21 > 0 && class134.field1900[var22 + 1][var21 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg6 <= var32) {
                                            class450.field6289[var35] = var12 + 1;
                                            class29.field360[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class134.field1900[var22 + 1][var21 - 1] = 9;
                                            class247.field3509[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && 128 - arg6 > var21 && class134.field1900[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg6] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class450.field6289[var35] = var12 - 1;
                                    class29.field360[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class134.field1900[var22 - 1][var21 + 1] = 6;
                                    class247.field3509[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg6 <= var22);
                        } while (var21 >= 128 - arg6);
                    } while (class134.field1900[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg6 + var23][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class450.field6289[var35] = var12 + 1;
                class29.field360[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class134.field1900[var22 + 1][var21 + 1] = 12;
                class247.field3509[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
    public static final void method3109(byte arg0) {
        class676.field9545 = new class140[class138.field1939.method917((byte) -74)][];
        field7568++;
        if (arg0 >= -81) {
            method3107(true);
        }
        class24.field321 = new class140[class138.field1939.method917((byte) -74)][];
        class552.field7488 = new boolean[class138.field1939.method917((byte) -74)];
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILoa;IIILlt;)V")
    public static final void method3110(int arg0, class638 arg1, int arg2, int arg3, int arg4, class620 arg5) {
        field7572++;
        class633 var6 = class367.field5250.method600(arg5.field8573, true);
        if (var6.field8859 == -1) {
            return;
        }
        int var8;
        if (arg5.field8614) {
            int var7 = arg5.field8639 + arg4;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class461 var9 = var6.method3515(false, arg1, arg5.field8565, var8);
        if (arg0 != 3 || var9 == null) {
            return;
        }
        int var10 = arg5.field8582;
        int var11 = arg5.field8566;
        if ((var8 & 0x1) == 1) {
            var11 = arg5.field8582;
            var10 = arg5.field8566;
        }
        int var12 = var9.method33();
        int var13 = var9.method29();
        if (var6.field8861) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field8862 == 0) {
            var9.method2659(arg2, arg3 - (var11 * 4 - 4), var12, var13);
        } else {
            var9.method35(arg2, arg3 + 4 - var11 * 4, var12, var13, 0, var6.field8862 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Lrv;")
    public static final class95 method3111(int arg0) {
        field7571++;
        if (arg0 != 24169) {
            method3111(15);
        }
        return class153.method1069(1, true);
    }
}
