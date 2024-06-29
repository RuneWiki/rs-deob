import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class49 extends class406 {

    @OriginalMember(owner = "client!in", name = "t", descriptor = "Ljava/lang/String;")
    public String field584;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "Liq;")
    public static class362 field586 = new class362("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!in", name = "w", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field587 = new CRC32();

    @OriginalMember(owner = "client!in", name = "x", descriptor = "[I")
    public static int[] field588 = new int[1000];

    @OriginalMember(owner = "client!in", name = "y", descriptor = "Z")
    public static boolean field589 = false;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V")
    public static final void method280(byte arg0) {
        class237 var1 = class247.field3528;
        synchronized (class247.field3528) {
            if (arg0 != 81) {
                method282(-114, 81, -63, -46, -50, -21, -123, false, 58, -4, (class119) null, -52);
            }
            class247.field3528.method1618(0);
        }
        field585++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIZI)V")
    public static final void method281(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field581++;
        for (int var6 = arg1; var6 <= arg5; var6++) {
            class296.method1954(arg2, arg3, class291.field4067[var6], arg0, -1);
        }
        if (arg4) {
            method283(true);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIIZIILp;I)Z")
    public static final boolean method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, class119 arg10, int arg11) {
        field582++;
        int var12 = arg4;
        int var13 = arg3;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        int var17 = arg3 - var15;
        class75.field887[var14][var15] = 99;
        if (arg7) {
            method280((byte) 12);
        }
        class352.field4970[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class297.field4155[var18] = arg4;
        int var35 = var18 + 1;
        class327.field4648[var18] = arg3;
        int[][] var20 = arg10.field1468;
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
                                    class452.field6462 = var12;
                                    class260.field3712 = var13;
                                    return false;
                                }
                                var12 = class297.field4155[var19];
                                var13 = class327.field4648[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg10.field1455;
                                var24 = var13 - arg10.field1466;
                                if (arg9 == -4) {
                                    if (arg11 == var12 && arg2 == var13) {
                                        class260.field3712 = var13;
                                        class452.field6462 = var12;
                                        return true;
                                    }
                                } else if (arg9 == -3) {
                                    if (class40.method240(arg0, var13, arg1, arg11, 0, arg6, arg1, var12, arg2)) {
                                        class260.field3712 = var13;
                                        class452.field6462 = var12;
                                        return true;
                                    }
                                } else if (arg9 == -2) {
                                    if (arg10.method738(arg6, arg8, arg0, arg1, 1180666916, arg11, var13, arg1, var12, arg2)) {
                                        class452.field6462 = var12;
                                        class260.field3712 = var13;
                                        return true;
                                    }
                                } else if (arg9 == -1) {
                                    if (arg10.method743(124, arg8, arg11, arg0, arg6, arg1, var12, var13, arg2)) {
                                        class452.field6462 = var12;
                                        class260.field3712 = var13;
                                        return true;
                                    }
                                } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                                    if (arg10.method745(var12, var13, arg2, arg1, arg11, arg9, 421, arg5)) {
                                        class260.field3712 = var13;
                                        class452.field6462 = var12;
                                        return true;
                                    }
                                } else if (arg10.method740(arg2, var13, 8192, arg9, arg11, arg1, var12, arg5)) {
                                    class452.field6462 = var12;
                                    class260.field3712 = var13;
                                    return true;
                                }
                                var26 = class352.field4970[var21][var22] + 1;
                                if (var21 > 0 && class75.field887[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg1)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg1 - 1)) {
                                            class297.field4155[var35] = var12 - 1;
                                            class327.field4648[var35] = var13;
                                            class75.field887[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class352.field4970[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg1 && class75.field887[var21 + 1][var22] == 0 && (var20[var23 + arg1][var24] & 0x60E40000) == 0 && (var20[var23 + arg1][var24 + arg1 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg1 - 1 <= var28) {
                                            class297.field4155[var35] = var12 + 1;
                                            class327.field4648[var35] = var13;
                                            class75.field887[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class352.field4970[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg1 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class75.field887[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg1 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg1 - 1) {
                                            class297.field4155[var35] = var12;
                                            class327.field4648[var35] = var13 - 1;
                                            class75.field887[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class352.field4970[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg1) && class75.field887[var21][var22 + 1] == 0 && (var20[var23][arg1 + var24] & 0x4E240000) == 0 && (var20[arg1 + var23 - 1][arg1 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg1 - 1) <= var30) {
                                            class297.field4155[var35] = var12;
                                            class327.field4648[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class75.field887[var21][var22 + 1] = 4;
                                            class352.field4970[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg1 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class75.field887[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg1 <= var31) {
                                            class297.field4155[var35] = var12 - 1;
                                            class327.field4648[var35] = var13 - 1;
                                            class75.field887[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class352.field4970[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg1 > var21 && var22 > 0 && class75.field887[var21 + 1][var22 - 1] == 0 && (var20[arg1 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg1) {
                                            class297.field4155[var35] = var12 + 1;
                                            class327.field4648[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class75.field887[var21 + 1][var22 - 1] = 9;
                                            class352.field4970[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg1 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && 128 - arg1 > var22 && class75.field887[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg1 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg1; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg1 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class297.field4155[var35] = var12 - 1;
                                    class327.field4648[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class75.field887[var21 - 1][var22 + 1] = 6;
                                    class352.field4970[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg1 <= var21);
                        } while ((128 - arg1) <= var22);
                    } while (class75.field887[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg1 + var23][arg1 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg1; var34++) {
                    if ((var20[var23 + var34][arg1 + var24] & 0x7E240000) != 0 || (var20[var23 + arg1][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class297.field4155[var35] = var12 + 1;
                class327.field4648[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class75.field887[var21 + 1][var22 + 1] = 12;
                class352.field4970[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(Z)V")
    public static final void method283(boolean arg0) {
        class285.field4008 = class131.method811(8, 0.4F, -62, arg0, 4, 35, 2048, 8);
        field583++;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static void method284(int arg0) {
        field588 = null;
        field587 = null;
        int var1 = 108 % ((-arg0 - 1) / 42);
        field586 = null;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
    public class49() {
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class49(String arg0) {
        this.field584 = arg0;
    }
}
