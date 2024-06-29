import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class class116 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "[[I")
    public static int[][] field1567 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "Lgk;")
    public static class255 field1570 = null;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "[Z")
    public static boolean[] field1571 = new boolean[8];

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "[I")
    public static int[] field1576 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Lmb;")
    public static class259 field1568;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 12)
    public static final Object method804(byte[] arg0, boolean arg1, byte arg2) {
        field1569++;
        if (arg2 < 113) {
            method811(31, 85, 105, 38, -12, 85, -22, 6, 16, -14, 100, (class138) null);
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class280.field4125) {
            try {
                class133 var3 = (class133) Class.forName("pg").getDeclaredConstructor().newInstance();
                var3.method777(arg0, 102);
                return var3;
            } catch (Throwable var4) {
                class280.field4125 = true;
            }
        }
        return arg1 ? class368.method2430(arg0, (byte) -125) : arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z", line = 59)
    public static final boolean method810(byte arg0) {
        field1578++;
        int var1 = 25 / ((76 - arg0) / 41);
        return class265.field3854 == 0 ? class17.field203 : true;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIIIILbi;)Z", line = 73)
    public static final boolean method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class138 arg11) {
        field1575++;
        if (arg10 != -1) {
            method813(-32, 33, 27);
        }
        int var12 = arg9;
        int var13 = arg6;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        int var17 = arg6 - var15;
        client.field3689[var14][var15] = 99;
        class293.field4243[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class449.field6563[var18] = arg9;
        int var35 = var18 + 1;
        class180.field2371[var18] = arg6;
        int[][] var20 = arg11.field1844;
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
                                    class88.field1225 = var13;
                                    class93.field1280 = var12;
                                    return false;
                                }
                                var13 = class180.field2371[var19];
                                var12 = class449.field6563[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var23 = var12 - arg11.field1828;
                                var24 = var13 - arg11.field1840;
                                if (arg5 == -4) {
                                    if (arg8 == var12 && arg3 == var13) {
                                        class93.field1280 = var12;
                                        class88.field1225 = var13;
                                        return true;
                                    }
                                } else if (arg5 == -3) {
                                    if (class120.method836(var13, arg8, var12, arg10 - 11092, arg0, arg1, arg1, arg2, arg3)) {
                                        class88.field1225 = var13;
                                        class93.field1280 = var12;
                                        return true;
                                    }
                                } else if (arg5 == -2) {
                                    if (arg11.method921(arg8, arg1, arg10 - 87, arg7, var13, var12, arg2, arg3, arg0, arg1)) {
                                        class93.field1280 = var12;
                                        class88.field1225 = var13;
                                        return true;
                                    }
                                } else if (arg5 == -1) {
                                    if (arg11.method917(var12, arg0, arg3, false, arg7, var13, arg1, arg2, arg8)) {
                                        class88.field1225 = var13;
                                        class93.field1280 = var12;
                                        return true;
                                    }
                                } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                                    if (arg11.method929(arg3, arg1, arg4, arg8, arg5, (byte) 101, var12, var13)) {
                                        class88.field1225 = var13;
                                        class93.field1280 = var12;
                                        return true;
                                    }
                                } else if (arg11.method927(var13, arg4, arg1, arg5, arg3, arg10 ^ 0xFFFFFFB8, arg8, var12)) {
                                    class93.field1280 = var12;
                                    class88.field1225 = var13;
                                    return true;
                                }
                                var26 = class293.field4243[var21][var22] + 1;
                                if (var21 > 0 && client.field3689[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg1 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg1 - 1) <= var27) {
                                            class449.field6563[var35] = var12 - 1;
                                            class180.field2371[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            client.field3689[var21 - 1][var22] = 2;
                                            class293.field4243[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg1 > var21 && client.field3689[var21 + 1][var22] == 0 && (var20[arg1 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg1][var24 + arg1 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg1 - 1)) {
                                            class449.field6563[var35] = var12 + 1;
                                            class180.field2371[var35] = var13;
                                            client.field3689[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field4243[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg1 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && client.field3689[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg1 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg1 - 1) {
                                            class449.field6563[var35] = var12;
                                            class180.field2371[var35] = var13 - 1;
                                            client.field3689[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field4243[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg1) > var22 && client.field3689[var21][var22 + 1] == 0 && (var20[var23][arg1 + var24] & 0x4E240000) == 0 && (var20[var23 + arg1 - 1][arg1 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg1 - 1)) {
                                            class449.field6563[var35] = var12;
                                            class180.field2371[var35] = var13 + 1;
                                            client.field3689[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field4243[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg1] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && client.field3689[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg1 <= var31) {
                                            class449.field6563[var35] = var12 - 1;
                                            class180.field2371[var35] = var13 - 1;
                                            client.field3689[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field4243[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var21 < 128 - arg1 && var22 > 0 && client.field3689[var21 + 1][var22 - 1] == 0 && (var20[arg1 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg1) {
                                            class449.field6563[var35] = var12 + 1;
                                            class180.field2371[var35] = var13 - 1;
                                            client.field3689[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class293.field4243[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg1][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg1) > var22 && client.field3689[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg1 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg1; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg1 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class449.field6563[var35] = var12 - 1;
                                    class180.field2371[var35] = var13 + 1;
                                    client.field3689[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class293.field4243[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg1 <= var21);
                        } while (var22 >= (128 - arg1));
                    } while (client.field3689[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg1 + var23][arg1 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg1; var34++) {
                    if ((var20[var23 + var34][arg1 + var24] & 0x7E240000) != 0 || (var20[arg1 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class449.field6563[var35] = var12 + 1;
                class180.field2371[var35] = var13 + 1;
                client.field3689[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class293.field4243[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V", line = 516)
    public static void method812(byte arg0) {
        field1576 = null;
        field1568 = null;
        field1571 = null;
        if (arg0 == 41) {
            field1567 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)V", line = 530)
    public static final void method813(int arg0, int arg1, int arg2) {
        if (arg1 != 4095) {
            method811(-60, 77, -112, 61, -8, 7, 66, -37, -73, 36, -49, (class138) null);
        }
        field1572++;
        if (class126.method864((byte) -92, arg0)) {
            class179.method1098(class119.field1607[arg0], true, arg2);
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V", line = 546)
    public static final void method815(int arg0) {
        field1573++;
        class268 var1 = (class268) class119.field1599.method2649(0);
        if (arg0 != -1) {
            method804((byte[]) null, true, (byte) 125);
        }
        while (var1 != null) {
            class392 var2 = var1.field3927;
            if (class193.field2688 != var2.field5291 || var2.field5888) {
                var1.method2574((byte) 116);
                var2.method2561((byte) -66);
            } else if (class50.field698 >= var2.field5890) {
                var2.method2567(class175.field2280, (byte) 64);
                if (var2.field5888) {
                    var1.method2574((byte) 115);
                } else {
                    class84.method524(var2, true);
                }
            }
            var1 = (class268) class119.field1599.method2656(0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIII)V", line = 593)
    public static final void method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 == 12) {
            for (int var6 = arg5; var6 <= arg0; var6++) {
                class370.method2440(arg2, class227.field3201[var6], arg3, arg1, 58);
            }
            field1577++;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V", line = 614)
    public static final void method821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1574++;
        int var7 = arg2 + arg5;
        int var8 = arg3 - arg2;
        for (int var9 = arg5; var9 < var7; var9++) {
            class370.method2440(arg6, class227.field3201[var9], arg1, arg4, 59);
        }
        int var10 = arg6 - arg2;
        for (int var11 = arg3; var11 > var8; var11--) {
            class370.method2440(arg6, class227.field3201[var11], arg1, arg4, 87);
        }
        if (arg0 != -1) {
            return;
        }
        int var12 = arg4 + arg2;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class227.field3201[var13];
            class370.method2440(var12, var14, arg1, arg4, arg0 + 119);
            class370.method2440(arg6, var14, arg1, var10, 79);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
    public abstract void method802(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public abstract void method803(int arg0);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public abstract void method805(int arg0);

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public abstract void method806(int arg0);

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V")
    public abstract void method807(int arg0);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lao;)V")
    public abstract void method808(class116 arg0);

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V")
    public abstract void method809(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[I)V")
    public abstract void method814(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
    public abstract void method816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
    public abstract void method817();

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([I)V")
    public abstract void method818(int[] arg0);

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V")
    public abstract void method820(int arg0);
}
