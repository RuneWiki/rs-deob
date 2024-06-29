import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class462 extends class431 {

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "[B")
    public byte[] field6713;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIBIIILpd;II)Z", line = 5)
    public static final boolean method2804(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, class172 arg9, int arg10, int arg11) {
        field6712++;
        int var12 = arg4;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        int var17 = arg7 - var15;
        class237.field3810[var14][var15] = 99;
        int var18 = -70 % ((79 - arg5) / 43);
        class129.field1947[var14][var15] = 0;
        byte var19 = 0;
        class53.field661[var19] = arg4;
        int var20 = 0;
        int var36 = var19 + 1;
        class349.field5164[var19] = arg7;
        int[][] var21 = arg9.field2573;
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
                                    class162.field2406 = var13;
                                    class428.field6371 = var12;
                                    return false;
                                }
                                var13 = class349.field5164[var20];
                                var12 = class53.field661[var20];
                                var22 = var12 - var16;
                                var20 = var20 + 1 & 0xFFF;
                                var23 = var13 - var17;
                                var24 = var12 - arg9.field2559;
                                var25 = var13 - arg9.field2565;
                                if (arg8 == -4) {
                                    if (arg2 == var12 && arg6 == var13) {
                                        class428.field6371 = var12;
                                        class162.field2406 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -3) {
                                    if (class56.method515(var13, arg11, arg10, var12, arg11, arg0, arg2, 4268, arg6)) {
                                        class162.field2406 = var13;
                                        class428.field6371 = var12;
                                        return true;
                                    }
                                } else if (arg8 == -2) {
                                    if (arg9.method1162(var13, arg0, arg11, arg2, arg6, arg10, var12, arg3, arg11, (byte) 10)) {
                                        class428.field6371 = var12;
                                        class162.field2406 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -1) {
                                    if (arg9.method1154(var12, arg3, arg0, arg11, arg2, (byte) 123, arg6, var13, arg10)) {
                                        class162.field2406 = var13;
                                        class428.field6371 = var12;
                                        return true;
                                    }
                                } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                                    if (arg9.method1156(arg1, var12, arg2, arg11, arg8, arg6, -1, var13)) {
                                        class162.field2406 = var13;
                                        class428.field6371 = var12;
                                        return true;
                                    }
                                } else if (arg9.method1160(false, arg11, var12, var13, arg1, arg2, arg6, arg8)) {
                                    class428.field6371 = var12;
                                    class162.field2406 = var13;
                                    return true;
                                }
                                var27 = class129.field1947[var22][var23] + 1;
                                if (var22 > 0 && class237.field3810[var22 - 1][var23] == 0 && (var21[var24 - 1][var25] & 0x43A40000) == 0 && (var21[var24 - 1][var25 + arg11 - 1] & 0x4E240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var28) {
                                            class53.field661[var36] = var12 - 1;
                                            class349.field5164[var36] = var13;
                                            class237.field3810[var22 - 1][var23] = 2;
                                            var36 = var36 + 1 & 0xFFF;
                                            class129.field1947[var22 - 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var28] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 < (128 - arg11) && class237.field3810[var22 + 1][var23] == 0 && (var21[arg11 + var24][var25] & 0x60E40000) == 0 && (var21[arg11 + var24][arg11 + var25 - 1] & 0x78240000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg11 - 1) {
                                            class53.field661[var36] = var12 + 1;
                                            class349.field5164[var36] = var13;
                                            var36 = var36 + 1 & 0xFFF;
                                            class237.field3810[var22 + 1][var23] = 8;
                                            class129.field1947[var22 + 1][var23] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + arg11][var25 + var29] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var23 > 0 && class237.field3810[var22][var23 - 1] == 0 && (var21[var24][var25 - 1] & 0x43A40000) == 0 && (var21[var24 - (1 - arg11)][var25 - 1] & 0x60E40000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg11 - 1 <= var30) {
                                            class53.field661[var36] = var12;
                                            class349.field5164[var36] = var13 - 1;
                                            class237.field3810[var22][var23 - 1] = 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class129.field1947[var22][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var30][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if ((128 - arg11) > var23 && class237.field3810[var22][var23 + 1] == 0 && (var21[var24][arg11 + var25] & 0x4E240000) == 0 && (var21[var24 - (1 - arg11)][arg11 + var25] & 0x78240000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var31) {
                                            class53.field661[var36] = var12;
                                            class349.field5164[var36] = var13 + 1;
                                            class237.field3810[var22][var23 + 1] = 4;
                                            var36 = var36 + 1 & 0xFFF;
                                            class129.field1947[var22][var23 + 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 + var31][var25 + arg11] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 > 0 && var23 > 0 && class237.field3810[var22 - 1][var23 - 1] == 0 && (var21[var24 - 1][var25 - 1] & 0x43A40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg11 <= var32) {
                                            class53.field661[var36] = var12 - 1;
                                            class349.field5164[var36] = var13 - 1;
                                            var36 = var36 + 1 & 0xFFF;
                                            class237.field3810[var22 - 1][var23 - 1] = 3;
                                            class129.field1947[var22 - 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[var24 - 1][var25 + var32 - 1] & 0x4FA40000) != 0 || (var21[var32 + var24 - 1][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if ((128 - arg11) > var22 && var23 > 0 && class237.field3810[var22 + 1][var23 - 1] == 0 && (var21[var24 + arg11][var25 - 1] & 0x60E40000) == 0) {
                                    int var33 = 1;
                                    while (true) {
                                        if (arg11 <= var33) {
                                            class53.field661[var36] = var12 + 1;
                                            class349.field5164[var36] = var13 - 1;
                                            class237.field3810[var22 + 1][var23 - 1] = 9;
                                            var36 = var36 + 1 & 0xFFF;
                                            class129.field1947[var22 + 1][var23 - 1] = var27;
                                            break;
                                        }
                                        if ((var21[arg11 + var24][var25 + var33 - 1] & 0x78E40000) != 0 || (var21[var24 + var33][var25 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var33++;
                                    }
                                }
                                if (var22 > 0 && 128 - arg11 > var23 && class237.field3810[var22 - 1][var23 + 1] == 0 && (var21[var24 - 1][arg11 + var25] & 0x4E240000) == 0) {
                                    for (int var34 = 1; var34 < arg11; var34++) {
                                        if ((var21[var24 - 1][var25 + var34] & 0x4FA40000) != 0 || (var21[var34 + var24 - 1][arg11 + var25] & 0x7E240000) != 0) {
                                            continue label259;
                                        }
                                    }
                                    class53.field661[var36] = var12 - 1;
                                    class349.field5164[var36] = var13 + 1;
                                    var36 = var36 + 1 & 0xFFF;
                                    class237.field3810[var22 - 1][var23 + 1] = 6;
                                    class129.field1947[var22 - 1][var23 + 1] = var27;
                                }
                            } while (var22 >= (128 - arg11));
                        } while (var23 >= (128 - arg11));
                    } while (class237.field3810[var22 + 1][var23 + 1] != 0);
                } while ((var21[arg11 + var24][arg11 + var25] & 0x78240000) != 0);
                for (int var35 = 1; var35 < arg11; var35++) {
                    if ((var21[var24 + var35][arg11 + var25] & 0x7E240000) != 0 || (var21[arg11 + var24][var25 + var35] & 0x78E40000) != 0) {
                        continue label282;
                    }
                }
                class53.field661[var36] = var12 + 1;
                class349.field5164[var36] = var13 + 1;
                var36 = var36 + 1 & 0xFFF;
                class237.field3810[var22 + 1][var23 + 1] = 12;
                class129.field1947[var22 + 1][var23 + 1] = var27;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "([B)V", line = 433)
    public class462(byte[] arg0) {
        this.field6713 = arg0;
    }
}
