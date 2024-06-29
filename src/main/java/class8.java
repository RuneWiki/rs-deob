import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class class8 extends class28 {

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Ljj;")
    public static class398 field68 = new class398(21, 3);

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static final void method48(byte arg0) {
        field70++;
        if (class476.field6436 == 9) {
            class676.method3739(-22149, 5);
        } else if (class476.field6436 == 5 || class476.field6436 == 6) {
            class676.method3739(-22149, 3);
        } else if (class476.field6436 == 12) {
            class676.method3739(-22149, 3);
        }
        if (arg0 != 60) {
            method56(36, -82, 15, 83, 28, 46, null, true, -51, -4, -51, 103);
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)I")
    public abstract int method49(byte arg0);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)J")
    public abstract long method50(int arg0);

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)I")
    public abstract int method51(int arg0);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method52(boolean arg0) {
        field69++;
        if (class483.field6542 || class468.field6362 == null) {
            return "";
        } else if (arg0) {
            return class468.field6362.field907;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIBII)V")
    public static final void method53(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 32) {
            field68 = null;
        }
        for (int var5 = 0; var5 < class264.field3629; var5++) {
            Rectangle var6 = class121.field1564[var5];
            if ((var6.x + var6.width) > arg4 && var6.x < (arg3 + arg4) && var6.y + var6.height > arg0 && var6.y < (arg0 + arg1)) {
                class224.field2912[var5] = true;
            }
        }
        field71++;
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
    public static void method54(int arg0) {
        if (arg0 == -15685) {
            field68 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)I")
    public abstract int method55(byte arg0);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIILsl;ZIIII)Z")
    public static final boolean method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class245 arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field67++;
        int var12 = arg0;
        int var13 = arg2;
        byte var14 = 64;
        if (arg7) {
            field68 = null;
        }
        byte var15 = 64;
        int var16 = arg0 - var14;
        class98.field1203[var14][var15] = 99;
        int var17 = arg2 - var15;
        class235.field3070[var14][var15] = 0;
        byte var18 = 0;
        class63.field859[var18] = arg0;
        int var19 = 0;
        int var35 = var18 + 1;
        class303.field4035[var18] = arg2;
        int[][] var20 = arg6.field3300;
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
                                    class5.field46 = var12;
                                    class125.field1609 = var13;
                                    return false;
                                }
                                var13 = class303.field4035[var19];
                                var12 = class63.field859[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg6.field3312;
                                var24 = var13 - arg6.field3308;
                                if (arg3 == -4) {
                                    if (arg9 == var12 && arg5 == var13) {
                                        class5.field46 = var12;
                                        class125.field1609 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -3) {
                                    if (class609.method3356(arg11, arg9, arg10, var13, arg5, var12, 110, arg8, arg11)) {
                                        class5.field46 = var12;
                                        class125.field1609 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -2) {
                                    if (arg6.method1513(arg11, var12, arg5, arg10, arg8, arg9, arg11, arg1, (byte) -111, var13)) {
                                        class125.field1609 = var13;
                                        class5.field46 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -1) {
                                    if (arg6.method1499(arg5, arg11, (byte) -42, arg8, var12, arg9, var13, arg10, arg1)) {
                                        class5.field46 = var12;
                                        class125.field1609 = var13;
                                        return true;
                                    }
                                } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                                    if (arg6.method1497(arg5, arg11, arg4, arg9, (byte) 12, arg3, var13, var12)) {
                                        class5.field46 = var12;
                                        class125.field1609 = var13;
                                        return true;
                                    }
                                } else if (arg6.method1511(arg4, 107, arg5, arg11, arg9, arg3, var12, var13)) {
                                    class5.field46 = var12;
                                    class125.field1609 = var13;
                                    return true;
                                }
                                var26 = class235.field3070[var21][var22] + 1;
                                if (var21 > 0 && class98.field1203[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg11 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var27) {
                                            class63.field859[var35] = var12 - 1;
                                            class303.field4035[var35] = var13;
                                            class98.field1203[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class235.field3070[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg11 && class98.field1203[var21 + 1][var22] == 0 && (var20[var23 + arg11][var24] & 0x60E40000) == 0 && (var20[arg11 + var23][arg11 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg11 - 1 <= var28) {
                                            class63.field859[var35] = var12 + 1;
                                            class303.field4035[var35] = var13;
                                            class98.field1203[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class235.field3070[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class98.field1203[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg11 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var29) {
                                            class63.field859[var35] = var12;
                                            class303.field4035[var35] = var13 - 1;
                                            class98.field1203[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class235.field3070[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg11) && class98.field1203[var21][var22 + 1] == 0 && (var20[var23][arg11 + var24] & 0x4E240000) == 0 && (var20[var23 + arg11 - 1][var24 + arg11] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg11 - 1 <= var30) {
                                            class63.field859[var35] = var12;
                                            class303.field4035[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class98.field1203[var21][var22 + 1] = 4;
                                            class235.field3070[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg11] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class98.field1203[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg11 <= var31) {
                                            class63.field859[var35] = var12 - 1;
                                            class303.field4035[var35] = var13 - 1;
                                            class98.field1203[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class235.field3070[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < 128 - arg11 && var22 > 0 && class98.field1203[var21 + 1][var22 - 1] == 0 && (var20[arg11 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg11) {
                                            class63.field859[var35] = var12 + 1;
                                            class303.field4035[var35] = var13 - 1;
                                            class98.field1203[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class235.field3070[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg11) && class98.field1203[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg11 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg11; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg11 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class63.field859[var35] = var12 - 1;
                                    class303.field4035[var35] = var13 + 1;
                                    class98.field1203[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class235.field3070[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= 128 - arg11);
                        } while ((128 - arg11) <= var22);
                    } while (class98.field1203[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg11 + var23][arg11 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg11; var34++) {
                    if ((var20[var23 + var34][arg11 + var24] & 0x7E240000) != 0 || (var20[arg11 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class63.field859[var35] = var12 + 1;
                class303.field4035[var35] = var13 + 1;
                class98.field1203[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class235.field3070[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(B)I")
    public abstract int method57(byte arg0);
}
