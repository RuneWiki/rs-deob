import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class538 extends OutputStream {

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7898 = new String[] { method4016(method4015("GgQx\u0015Jx\u001a'")), method4016(method4015("My\u0013c")), method4016(method4015("X\"Q!\u001a")), method4016(method4015("GgQMO")), method4016(method4015("GgQNO")) };

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "J")
    public static long field7897 = 0L;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field7895;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7896;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lii;IIIIIIIIIII)Z")
    public static final boolean method4013(class580 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            field7894++;
            int var12 = arg10;
            int var13 = arg2;
            byte var14 = 64;
            byte var15 = 64;
            if (arg11 != 28049) {
                return false;
            }
            int var16 = arg10 - var14;
            class246.field3801[var14][var15] = 99;
            int var17 = arg2 - var15;
            class384.field6161[var14][var15] = 0;
            byte var18 = 0;
            class116.field1698[var18] = arg10;
            int var19 = 0;
            int var37 = var18 + 1;
            class62.field849[var18] = arg2;
            int[][] var20 = arg0.field8355;
            while (true) {
                label345: while (true) {
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var26;
                    do {
                        do {
                            do {
                                label322: do {
                                    if (var37 == var19) {
                                        class100.field1462 = var12;
                                        class360.field5812 = var13;
                                        return false;
                                    }
                                    var12 = class116.field1698[var19];
                                    var13 = class62.field849[var19];
                                    var19 = var19 + 1 & 0xFFF;
                                    var21 = var12 - var16;
                                    var22 = var13 - var17;
                                    var23 = var12 - arg0.field8345;
                                    var24 = var13 - arg0.field8356;
                                    if (arg1 == -4) {
                                        if (arg8 == var12 && arg5 == var13) {
                                            class360.field5812 = var13;
                                            class100.field1462 = var12;
                                            return true;
                                        }
                                    } else if (arg1 == -3) {
                                        if (class480.method3662(var12, arg6, arg4, arg4, var13, arg5, arg8, arg7, 73)) {
                                            class100.field1462 = var12;
                                            class360.field5812 = var13;
                                            return true;
                                        }
                                    } else if (arg1 == -2) {
                                        if (arg0.method4248(arg7, arg3, var12, arg11 + 2855919, arg4, var13, arg8, arg6, arg4, arg5)) {
                                            class360.field5812 = var13;
                                            class100.field1462 = var12;
                                            return true;
                                        }
                                    } else if (arg1 == -1) {
                                        if (arg0.method4250(arg7, (byte) 69, arg6, var12, var13, arg5, arg3, arg8, arg4)) {
                                            class100.field1462 = var12;
                                            class360.field5812 = var13;
                                            return true;
                                        }
                                    } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                                        if (arg0.method4255((byte) 42, arg8, arg5, arg1, arg9, var12, arg4, var13)) {
                                            class100.field1462 = var12;
                                            class360.field5812 = var13;
                                            return true;
                                        }
                                    } else if (arg0.method4245(arg8, var12, arg9, arg5, arg1, -1, arg4, var13)) {
                                        class100.field1462 = var12;
                                        class360.field5812 = var13;
                                        return true;
                                    }
                                    var26 = class384.field6161[var21][var22] + 1;
                                    if (var21 > 0 && class246.field3801[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg4 + var24 - 1] & 0x4E240000) == 0) {
                                        int var27 = 1;
                                        while (true) {
                                            if (var27 >= (arg4 - 1)) {
                                                class116.field1698[var37] = var12 - 1;
                                                class62.field849[var37] = var13;
                                                var37 = var37 + 1 & 0xFFF;
                                                class246.field3801[var21 - 1][var22] = 2;
                                                class384.field6161[var21 - 1][var22] = var26;
                                                break;
                                            }
                                            if ((var20[var23 - 1][var27 + var24] & 0x4FA40000) != 0) {
                                                break;
                                            }
                                            var27++;
                                        }
                                    }
                                    if (var21 < 128 - arg4 && class246.field3801[var21 + 1][var22] == 0 && (var20[arg4 + var23][var24] & 0x60E40000) == 0 && (var20[arg4 + var23][arg4 + var24 - 1] & 0x78240000) == 0) {
                                        int var28 = 1;
                                        while (true) {
                                            if (arg4 - 1 <= var28) {
                                                class116.field1698[var37] = var12 + 1;
                                                class62.field849[var37] = var13;
                                                class246.field3801[var21 + 1][var22] = 8;
                                                var37 = var37 + 1 & 0xFFF;
                                                class384.field6161[var21 + 1][var22] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + arg4][var24 + var28] & 0x78E40000) != 0) {
                                                break;
                                            }
                                            var28++;
                                        }
                                    }
                                    if (var22 > 0 && class246.field3801[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg4 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                        int var29 = 1;
                                        while (true) {
                                            if ((arg4 - 1) <= var29) {
                                                class116.field1698[var37] = var12;
                                                class62.field849[var37] = var13 - 1;
                                                class246.field3801[var21][var22 - 1] = 1;
                                                var37 = var37 + 1 & 0xFFF;
                                                class384.field6161[var21][var22 - 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                                break;
                                            }
                                            var29++;
                                        }
                                    }
                                    if (var22 < 128 - arg4 && class246.field3801[var21][var22 + 1] == 0 && (var20[var23][arg4 + var24] & 0x4E240000) == 0 && (var20[var23 + arg4 - 1][var24 + arg4] & 0x78240000) == 0) {
                                        int var30 = 1;
                                        while (true) {
                                            if (arg4 - 1 <= var30) {
                                                class116.field1698[var37] = var12;
                                                class62.field849[var37] = var13 + 1;
                                                class246.field3801[var21][var22 + 1] = 4;
                                                var37 = var37 + 1 & 0xFFF;
                                                class384.field6161[var21][var22 + 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + var30][arg4 + var24] & 0x7E240000) != 0) {
                                                break;
                                            }
                                            var30++;
                                        }
                                    }
                                    if (var21 > 0 && var22 > 0 && class246.field3801[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= arg4) {
                                                class116.field1698[var37] = var12 - 1;
                                                class62.field849[var37] = var13 - 1;
                                                class246.field3801[var21 - 1][var22 - 1] = 3;
                                                var37 = var37 + 1 & 0xFFF;
                                                class384.field6161[var21 - 1][var22 - 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 - 1][var24 - (1 - var31)] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if ((128 - arg4) > var21 && var22 > 0 && class246.field3801[var21 + 1][var22 - 1] == 0 && (var20[arg4 + var23][var24 - 1] & 0x60E40000) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (arg4 <= var32) {
                                                class116.field1698[var37] = var12 + 1;
                                                class62.field849[var37] = var13 - 1;
                                                class246.field3801[var21 + 1][var22 - 1] = 9;
                                                var37 = var37 + 1 & 0xFFF;
                                                class384.field6161[var21 + 1][var22 - 1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + arg4][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                                break;
                                            }
                                            var32++;
                                        }
                                    }
                                    if (var21 > 0 && 128 - arg4 > var22 && class246.field3801[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg4 + var24] & 0x4E240000) == 0) {
                                        for (int var33 = 1; var33 < arg4; var33++) {
                                            if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg4] & 0x7E240000) != 0) {
                                                continue label322;
                                            }
                                        }
                                        class116.field1698[var37] = var12 - 1;
                                        class62.field849[var37] = var13 + 1;
                                        var37 = var37 + 1 & 0xFFF;
                                        class246.field3801[var21 - 1][var22 + 1] = 6;
                                        class384.field6161[var21 - 1][var22 + 1] = var26;
                                    }
                                } while ((128 - arg4) <= var21);
                            } while (128 - arg4 <= var22);
                        } while (class246.field3801[var21 + 1][var22 + 1] != 0);
                    } while ((var20[arg4 + var23][arg4 + var24] & 0x78240000) != 0);
                    for (int var34 = 1; var34 < arg4; var34++) {
                        if ((var20[var23 + var34][arg4 + var24] & 0x7E240000) != 0 || (var20[var23 + arg4][var24 + var34] & 0x78E40000) != 0) {
                            continue label345;
                        }
                    }
                    class116.field1698[var37] = var12 + 1;
                    class62.field849[var37] = var13 + 1;
                    class246.field3801[var21 + 1][var22 + 1] = 12;
                    var37 = var37 + 1 & 0xFFF;
                    class384.field6161[var21 + 1][var22 + 1] = var26;
                }
            }
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field7898[3] + (arg0 == null ? field7898[1] : field7898[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        try {
            field7896++;
            throw new IOException();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7898[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lmj;Z)V")
    public static final void method4014(class683 arg0, boolean arg1) {
        try {
            if (!arg1) {
                field7897 = 76L;
            }
            field7895++;
            if (arg0.field9782 == 5 && arg0.field9807 != -1) {
                class759.method5482(arg0, class662.field9437, -16777216);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7898[4] + (arg0 == null ? field7898[1] : field7898[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4015(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4016(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
