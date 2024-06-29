import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class82 extends class437 {

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1160;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "Ljw;")
    public static class581 field1158 = new class581(16, -2);

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(B)V", line = 6)
    public final void method686(byte arg0) {
        if (arg0 >= -19) {
            method690(98, 101, -17, 68, 27, null, -84, 43, -80, -47, -18, 49);
        }
        field1159++;
        this.field1160.method3915();
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIII)V", line = 18)
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1157++;
        class16 var5 = class94.method753(arg1, 13175, (long) arg0);
        var5.method119(-78);
        var5.field237 = arg2;
        var5.field244 = arg4;
        var5.field245 = arg3;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIZII)V", line = 31)
    public static final void method688(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1161++;
        if (arg4 && class712.field9959.field1275.method3352(70) != 0 && arg0 != 0 && class393.field5800 < 50 && arg6 != -1) {
            class729.field10120[class393.field5800++] = new class720((byte) 1, arg6, arg0, arg3, arg1, arg5, arg2, null);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 52)
    public static void method689(int arg0) {
        field1158 = null;
        if (arg0 != 10103) {
            method687(-73, 78, 41, 13, -123);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIILoga;IIIIII)Z", line = 62)
    public static final boolean method690(int arg0, int arg1, int arg2, int arg3, int arg4, class502 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1162++;
        int var12 = arg9;
        int var13 = arg0;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        class393.field5803[var14][var15] = 99;
        int var17 = arg0 - var15;
        class5.field48[var14][var15] = 0;
        byte var18 = 0;
        int var19 = arg7;
        class85.field1191[var18] = arg9;
        int var35 = var18 + 1;
        class23.field363[var18] = arg0;
        int[][] var20 = arg5.field6957;
        while (true) {
            label282: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label259: do {
                                if (var35 == var19) {
                                    class275.field4086 = var12;
                                    class688.field9676 = var13;
                                    return false;
                                }
                                var12 = class85.field1191[var19];
                                var13 = class23.field363[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg5.field6941;
                                var24 = var13 - arg5.field6935;
                                if (arg4 == -4) {
                                    if (arg3 == var12 && arg2 == var13) {
                                        class688.field9676 = var13;
                                        class275.field4086 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -3) {
                                    if (class374.method2322(arg10, arg2, arg3, -1, arg11, var12, arg8, arg8, var13)) {
                                        class688.field9676 = var13;
                                        class275.field4086 = var12;
                                        return true;
                                    }
                                } else if (arg4 == -2) {
                                    if (arg5.method2906(arg3, var12, arg8, arg10, -1, arg2, var13, arg8, arg6, arg11)) {
                                        class275.field4086 = var12;
                                        class688.field9676 = var13;
                                        return true;
                                    }
                                } else if (arg4 == -1) {
                                    if (arg5.method2912(var13, arg10, arg11, arg6, arg3, var12, arg7 - 118, arg2, arg8)) {
                                        class688.field9676 = var13;
                                        class275.field4086 = var12;
                                        return true;
                                    }
                                } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                                    if (arg5.method2907(arg4, arg2, (byte) 122, var13, arg3, arg8, arg1, var12)) {
                                        class275.field4086 = var12;
                                        class688.field9676 = var13;
                                        return true;
                                    }
                                } else if (arg5.method2915(arg1, arg3, var12, arg4, var13, arg2, arg8, (byte) -127)) {
                                    class688.field9676 = var13;
                                    class275.field4086 = var12;
                                    return true;
                                }
                                var26 = class5.field48[var21][var22] + 1;
                                if (var21 > 0 && class393.field5803[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg8 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg8 - 1)) {
                                            class85.field1191[var35] = var12 - 1;
                                            class23.field363[var35] = var13;
                                            class393.field5803[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class5.field48[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg8 > var21 && class393.field5803[var21 + 1][var22] == 0 && (var20[arg8 + var23][var24] & 0x60E40000) == 0 && (var20[arg8 + var23][var24 + arg8 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg8 - 1) <= var28) {
                                            class85.field1191[var35] = var12 + 1;
                                            class23.field363[var35] = var13;
                                            class393.field5803[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class5.field48[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg8][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class393.field5803[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg8 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var29) {
                                            class85.field1191[var35] = var12;
                                            class23.field363[var35] = var13 - 1;
                                            class393.field5803[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class5.field48[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg8) && class393.field5803[var21][var22 + 1] == 0 && (var20[var23][var24 + arg8] & 0x4E240000) == 0 && (var20[arg8 + var23 - 1][arg8 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var30) {
                                            class85.field1191[var35] = var12;
                                            class23.field363[var35] = var13 + 1;
                                            class393.field5803[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class5.field48[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg8 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class393.field5803[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg8) {
                                            class85.field1191[var35] = var12 - 1;
                                            class23.field363[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class393.field5803[var21 - 1][var22 - 1] = 3;
                                            class5.field48[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 - (1 - var31)][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < 128 - arg8 && var22 > 0 && class393.field5803[var21 + 1][var22 - 1] == 0 && (var20[arg8 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg8 <= var32) {
                                            class85.field1191[var35] = var12 + 1;
                                            class23.field363[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class393.field5803[var21 + 1][var22 - 1] = 9;
                                            class5.field48[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg8) && class393.field5803[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg8] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg8; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg8] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class85.field1191[var35] = var12 - 1;
                                    class23.field363[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class393.field5803[var21 - 1][var22 + 1] = 6;
                                    class5.field48[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg8 <= var21);
                        } while (128 - arg8 <= var22);
                    } while (class393.field5803[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg8 + var23][var24 + arg8] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg8; var34++) {
                    if ((var20[var23 + var34][arg8 + var24] & 0x7E240000) != 0 || (var20[arg8 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class85.field1191[var35] = var12 + 1;
                class23.field363[var35] = var13 + 1;
                class393.field5803[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class5.field48[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(I)V", line = 490)
    public class82(int arg0) {
        this.field1160 = new NativeHeap(arg0);
    }
}
