import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class308 extends class441 {

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field4896;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Z", line = 6)
    public static final boolean method1958(boolean arg0) {
        for (int var1 = class497.field7298; var1 < class76.field1315; var1++) {
            class465[][] var2 = class66.field977[var1];
            for (int var3 = -class31.field502; var3 <= 0; var3++) {
                int var4 = class205.field3248 + var3;
                int var5 = class205.field3248 - var3;
                if (var4 >= class469.field6967 || var5 < class73.field1260) {
                    for (int var6 = -class31.field502; var6 <= 0; var6++) {
                        int var7 = class77.field1351 + var6;
                        int var8 = class77.field1351 - var6;
                        if (var4 >= class469.field6967) {
                            if (var7 >= class475.field7033) {
                                class465 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6920) {
                                    class430.field6452 = arg0;
                                    class424.field6390.method2200(0, var9);
                                    class424.field6390.method2207((byte) 118);
                                }
                            }
                            if (var8 < class465.field6895) {
                                class465 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6920) {
                                    class430.field6452 = arg0;
                                    class424.field6390.method2200(0, var10);
                                    class424.field6390.method2207((byte) 121);
                                }
                            }
                        }
                        if (var5 < class73.field1260) {
                            if (var7 >= class475.field7033) {
                                class465 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6920) {
                                    class430.field6452 = arg0;
                                    class424.field6390.method2200(0, var11);
                                    class424.field6390.method2207((byte) 125);
                                }
                            }
                            if (var8 < class465.field6895) {
                                class465 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6920) {
                                    class430.field6452 = arg0;
                                    class424.field6390.method2200(0, var12);
                                    class424.field6390.method2207((byte) 117);
                                }
                            }
                        }
                        if (class426.field6410 == 0) {
                            if (class99.field1642) {
                                class424.field6390.method2205(5000, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Z", line = 114)
    public final boolean method1959(int arg0) {
        if (arg0 != 6) {
            method1958(false);
        }
        field4895++;
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 126)
    public final Object method1960(int arg0) {
        field4894++;
        return arg0 == 50 ? this.field4896 : null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 139)
    public class308(Object arg0, int arg1) {
        super(arg1);
        this.field4896 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZII)Lij;", line = 147)
    public static final class266 method1961(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1962(50, 6, -57, -96, 121, 79, 51, 42, -43, null, (byte) 59, -88);
        }
        field4893++;
        class266 var3 = (class266) class280.field4594.method2516((long) arg1 | (long) arg2 << 32, -1);
        if (var3 == null) {
            var3 = new class266(arg2, arg1);
            class280.field4594.method2517(var3, var3.field4542, (byte) 108);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIILir;BI)Z", line = 170)
    public static final boolean method1962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class251 arg9, byte arg10, int arg11) {
        field4892++;
        int var12 = arg2;
        int var13 = arg7;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg2 - var14;
        class330.field5195[var14][var15] = 99;
        int var17 = arg7 - var15;
        class71.field1218[var14][var15] = 0;
        byte var18 = 0;
        class194.field3041[var18] = arg2;
        int var19 = 0;
        if (arg10 <= 62) {
            method1962(-50, 95, 48, 82, 56, 61, 93, -21, 116, null, (byte) 20, 41);
        }
        int var35 = var18 + 1;
        class82.field1443[var18] = arg7;
        int[][] var20 = arg9.field4288;
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
                                    class452.field6743 = var13;
                                    class347.field5458 = var12;
                                    return false;
                                }
                                var13 = class82.field1443[var19];
                                var12 = class194.field3041[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg9.field4274;
                                var24 = var13 - arg9.field4271;
                                if (arg6 == -4) {
                                    if (arg1 == var12 && arg11 == var13) {
                                        class452.field6743 = var13;
                                        class347.field5458 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -3) {
                                    if (class239.method1640(arg3, arg11, var12, var13, arg0, arg1, false, arg5, arg3)) {
                                        class347.field5458 = var12;
                                        class452.field6743 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -2) {
                                    if (arg9.method1715(arg3, arg5, arg11, var12, var13, arg3, -127, arg1, arg0, arg8)) {
                                        class347.field5458 = var12;
                                        class452.field6743 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -1) {
                                    if (arg9.method1701(var13, arg5, arg11, var12, arg3, arg8, arg1, arg0, false)) {
                                        class452.field6743 = var13;
                                        class347.field5458 = var12;
                                        return true;
                                    }
                                } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                                    if (arg9.method1703(arg1, arg4, arg6, arg11, -91, var12, var13, arg3)) {
                                        class452.field6743 = var13;
                                        class347.field5458 = var12;
                                        return true;
                                    }
                                } else if (arg9.method1698(var13, 102, arg11, arg4, arg3, var12, arg1, arg6)) {
                                    class452.field6743 = var13;
                                    class347.field5458 = var12;
                                    return true;
                                }
                                var26 = class71.field1218[var21][var22] + 1;
                                if (var21 > 0 && class330.field5195[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg3 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg3 - 1) <= var27) {
                                            class194.field3041[var35] = var12 - 1;
                                            class82.field1443[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class330.field5195[var21 - 1][var22] = 2;
                                            class71.field1218[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg3) > var21 && class330.field5195[var21 + 1][var22] == 0 && (var20[var23 + arg3][var24] & 0x60E40000) == 0 && (var20[arg3 + var23][arg3 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg3 - 1 <= var28) {
                                            class194.field3041[var35] = var12 + 1;
                                            class82.field1443[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class330.field5195[var21 + 1][var22] = 8;
                                            class71.field1218[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg3 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class330.field5195[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg3 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg3 - 1) {
                                            class194.field3041[var35] = var12;
                                            class82.field1443[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class330.field5195[var21][var22 - 1] = 1;
                                            class71.field1218[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg3) > var22 && class330.field5195[var21][var22 + 1] == 0 && (var20[var23][arg3 + var24] & 0x4E240000) == 0 && (var20[var23 - (1 - arg3)][arg3 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg3 - 1) {
                                            class194.field3041[var35] = var12;
                                            class82.field1443[var35] = var13 + 1;
                                            class330.field5195[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class71.field1218[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg3 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class330.field5195[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg3 <= var31) {
                                            class194.field3041[var35] = var12 - 1;
                                            class82.field1443[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class330.field5195[var21 - 1][var22 - 1] = 3;
                                            class71.field1218[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg3 > var21 && var22 > 0 && class330.field5195[var21 + 1][var22 - 1] == 0 && (var20[arg3 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg3 <= var32) {
                                            class194.field3041[var35] = var12 + 1;
                                            class82.field1443[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class330.field5195[var21 + 1][var22 - 1] = 9;
                                            class71.field1218[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg3][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg3) && class330.field5195[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg3] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg3; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg3 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class194.field3041[var35] = var12 - 1;
                                    class82.field1443[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class330.field5195[var21 - 1][var22 + 1] = 6;
                                    class71.field1218[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg3 <= var21);
                        } while (var22 >= (128 - arg3));
                    } while (class330.field5195[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg3 + var23][var24 + arg3] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg3; var34++) {
                    if ((var20[var23 + var34][arg3 + var24] & 0x7E240000) != 0 || (var20[arg3 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class194.field3041[var35] = var12 + 1;
                class82.field1443[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class330.field5195[var21 + 1][var22 + 1] = 12;
                class71.field1218[var21 + 1][var22 + 1] = var26;
            }
        }
    }
}
