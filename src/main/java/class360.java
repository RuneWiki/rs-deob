import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class360 {

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4864;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4867;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "Lxa;")
    public static class468 field4871;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field4864 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field4867 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field4868 = 0;
        field4869 = 1;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)[Los;", line = 5)
    public static final class412[] method2134(byte arg0) {
        field4866++;
        int var1 = 80 / ((-arg0 - 2) / 50);
        return new class412[] { class258.field3560, class137.field2224, class651.field8811, class145.field2329, class373.field5039, class273.field3797, class275.field3855, class464.field6265, class625.field8374, class515.field6882 };
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 15)
    public static void method2135(int arg0) {
        field4864 = null;
        if (arg0 <= 120) {
            method2135(-58);
        }
        field4871 = null;
        field4867 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILed;IIIBIIII)Z", line = 30)
    public static final boolean method2136(int arg0, int arg1, int arg2, class661 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        field4865++;
        int var12 = arg4;
        if (arg7 != 40) {
            field4867 = null;
        }
        int var13 = arg11;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        int var17 = arg11 - var15;
        class77.field1210[var14][var15] = 99;
        class526.field7006[var14][var15] = 0;
        byte var18 = 0;
        class255.field3541[var18] = arg4;
        int var19 = 0;
        int var35 = var18 + 1;
        class445.field6092[var18] = arg11;
        int[][] var20 = arg3.field9391;
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
                                    class160.field2542 = var12;
                                    class689.field9702 = var13;
                                    return false;
                                }
                                var12 = class255.field3541[var19];
                                var13 = class445.field6092[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg3.field9385;
                                var24 = var13 - arg3.field9388;
                                if (arg0 == -4) {
                                    if (arg10 == var12 && arg2 == var13) {
                                        class160.field2542 = var12;
                                        class689.field9702 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class502.method2790(var13, arg6, arg1, arg5, arg10, arg6, arg2, var12, -24945)) {
                                        class160.field2542 = var12;
                                        class689.field9702 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg3.method3716(arg6, arg5, arg6, 2, arg2, var12, arg1, arg8, var13, arg10)) {
                                        class689.field9702 = var13;
                                        class160.field2542 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg3.method3706(var12, arg6, arg2, arg5, var13, (byte) -5, arg10, arg8, arg1)) {
                                        class689.field9702 = var13;
                                        class160.field2542 = var12;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg3.method3705(arg6, arg2, var13, var12, arg7 - 116, arg0, arg9, arg10)) {
                                        class689.field9702 = var13;
                                        class160.field2542 = var12;
                                        return true;
                                    }
                                } else if (arg3.method3707(var13, arg6, arg9, arg10, arg0, (byte) -118, arg2, var12)) {
                                    class160.field2542 = var12;
                                    class689.field9702 = var13;
                                    return true;
                                }
                                var26 = class526.field7006[var22][var21] + 1;
                                if (var22 > 0 && class77.field1210[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg6 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg6 - 1) {
                                            class255.field3541[var35] = var12 - 1;
                                            class445.field6092[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1210[var22 - 1][var21] = 2;
                                            class526.field7006[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg6 > var22 && class77.field1210[var22 + 1][var21] == 0 && (var20[arg6 + var23][var24] & 0x60E40000) == 0 && (var20[arg6 + var23][arg6 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg6 - 1)) {
                                            class255.field3541[var35] = var12 + 1;
                                            class445.field6092[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1210[var22 + 1][var21] = 8;
                                            class526.field7006[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg6][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class77.field1210[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg6 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg6 - 1) {
                                            class255.field3541[var35] = var12;
                                            class445.field6092[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1210[var22][var21 - 1] = 1;
                                            class526.field7006[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg6) && class77.field1210[var22][var21 + 1] == 0 && (var20[var23][var24 + arg6] & 0x4E240000) == 0 && (var20[arg6 + var23 - 1][arg6 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg6 - 1) <= var30) {
                                            class255.field3541[var35] = var12;
                                            class445.field6092[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class77.field1210[var22][var21 + 1] = 4;
                                            class526.field7006[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg6 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class77.field1210[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg6) {
                                            class255.field3541[var35] = var12 - 1;
                                            class445.field6092[var35] = var13 - 1;
                                            class77.field1210[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class526.field7006[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var31 + var24 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg6) > var22 && var21 > 0 && class77.field1210[var22 + 1][var21 - 1] == 0 && (var20[arg6 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg6 <= var32) {
                                            class255.field3541[var35] = var12 + 1;
                                            class445.field6092[var35] = var13 - 1;
                                            class77.field1210[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class526.field7006[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg6) && class77.field1210[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg6 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg6; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg6 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class255.field3541[var35] = var12 - 1;
                                    class445.field6092[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class77.field1210[var22 - 1][var21 + 1] = 6;
                                    class526.field7006[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg6));
                        } while (var21 >= 128 - arg6);
                    } while (class77.field1210[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg6][arg6 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg6; var34++) {
                    if ((var20[var23 + var34][arg6 + var24] & 0x7E240000) != 0 || (var20[arg6 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class255.field3541[var35] = var12 + 1;
                class445.field6092[var35] = var13 + 1;
                class77.field1210[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class526.field7006[var22 + 1][var21 + 1] = var26;
            }
        }
    }
}
