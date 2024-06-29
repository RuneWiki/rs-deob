import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class572 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "[I")
    public static int[] field8304 = new int[13];

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field8306 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field8307;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field8313;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lcw;")
    public static class127 field8305;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method3282(int arg0, int arg1) {
        field8312++;
        if (arg0 == 1) {
            return arg1 != 1 && arg1 != 7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)V", line = 14)
    public static final void method3283(byte arg0, int arg1, int arg2) {
        field8308++;
        if (class233.method1442(false, arg2)) {
            class56.method350(arg1, class220.field2917[arg2], (byte) -124);
            if (arg0 > -99) {
                field8304 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;ZLmv;B)Llp;", line = 29)
    public static final class69 method3284(String arg0, boolean arg1, class295 arg2, byte arg3) {
        field8311++;
        int var4 = arg2.method1819(arg0, (byte) 28);
        if (var4 == -1) {
            return new class69(0);
        }
        if (arg3 <= 7) {
            field8305 = null;
        }
        int[] var5 = arg2.method1846(var4, -15120);
        class69 var6 = new class69(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var6.field1081 > var7) {
                class540 var9 = new class540(arg2.method1844(var4, 31330, var5[var8++]));
                int var10 = var9.method3160(false);
                int var11 = var9.method3169(26488);
                int var12 = var9.method3115(29871);
                if (!arg1 && var12 == 1) {
                    var6.field1081--;
                } else {
                    var6.field1080[var7] = var10;
                    var6.field1079[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(CB)Z", line = 75)
    public static final boolean method3285(char arg0, byte arg1) {
        field8307++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg1 != 84) {
            field8309 = 115;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class330.field4795;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Loda;", line = 108)
    public static final class654 method3286(int arg0) {
        field8310++;
        int var1 = 31 / ((53 - arg0) / 49);
        return class14.field319 == 0 ? new class654() : class57.field930[--class14.field319];
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lwj;", line = 121)
    public static final class562 method3287(byte arg0) {
        field8313++;
        if (arg0 != 45) {
            return null;
        }
        class562 var1 = (class562) class94.field1454.method2371(arg0 + 22);
        if (var1 == null) {
            return new class562();
        } else {
            class701.field9956--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIIIILwg;)Z", line = 152)
    public static final boolean method3288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class516 arg11) {
        field8302++;
        int var12 = arg8;
        int var13 = arg10;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        class369.field5475[var14][var15] = 99;
        int var17 = arg10 - var15;
        class263.field3413[var14][var15] = 0;
        byte var18 = 0;
        class618.field8964[var18] = arg8;
        int var19 = 0;
        int var35 = var18 + 1;
        class390.field5889[var18] = arg10;
        int[][] var20 = arg11.field7243;
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
                                    if (arg3 != 28265) {
                                        field8309 = -40;
                                    }
                                    class264.field3452 = var13;
                                    class597.field8645 = var12;
                                    return false;
                                }
                                var13 = class390.field5889[var19];
                                var12 = class618.field8964[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg11.field7242;
                                var24 = var13 - arg11.field7247;
                                if (arg1 == -4) {
                                    if (arg0 == var12 && arg5 == var13) {
                                        class264.field3452 = var13;
                                        class597.field8645 = var12;
                                        return true;
                                    }
                                } else if (arg1 == -3) {
                                    if (class408.method2506(var12, arg2, arg2, arg5, arg4, 4005, arg0, var13, arg7)) {
                                        class597.field8645 = var12;
                                        class264.field3452 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -2) {
                                    if (arg11.method2914(arg2, var12, arg0, var13, arg7, arg4, arg5, arg2, (byte) 30, arg6)) {
                                        class264.field3452 = var13;
                                        class597.field8645 = var12;
                                        return true;
                                    }
                                } else if (arg1 == -1) {
                                    if (arg11.method2915(arg6, var12, arg0, arg7, (byte) 43, arg5, arg2, arg4, var13)) {
                                        class264.field3452 = var13;
                                        class597.field8645 = var12;
                                        return true;
                                    }
                                } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                                    if (arg11.method2909(arg2, arg9, arg0, var13, -1, arg1, arg5, var12)) {
                                        class597.field8645 = var12;
                                        class264.field3452 = var13;
                                        return true;
                                    }
                                } else if (arg11.method2913(var13, var12, arg9, arg5, arg3 ^ 0xFFFF9195, arg0, arg1, arg2)) {
                                    class264.field3452 = var13;
                                    class597.field8645 = var12;
                                    return true;
                                }
                                var26 = class263.field3413[var21][var22] + 1;
                                if (var21 > 0 && class369.field5475[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg2 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg2 - 1) <= var27) {
                                            class618.field8964[var35] = var12 - 1;
                                            class390.field5889[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class369.field5475[var21 - 1][var22] = 2;
                                            class263.field3413[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < 128 - arg2 && class369.field5475[var21 + 1][var22] == 0 && (var20[arg2 + var23][var24] & 0x60E40000) == 0 && (var20[arg2 + var23][var24 + arg2 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg2 - 1)) {
                                            class618.field8964[var35] = var12 + 1;
                                            class390.field5889[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class369.field5475[var21 + 1][var22] = 8;
                                            class263.field3413[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg2][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class369.field5475[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg2 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg2 - 1) {
                                            class618.field8964[var35] = var12;
                                            class390.field5889[var35] = var13 - 1;
                                            class369.field5475[var21][var22 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class263.field3413[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg2) > var22 && class369.field5475[var21][var22 + 1] == 0 && (var20[var23][arg2 + var24] & 0x4E240000) == 0 && (var20[var23 + arg2 - 1][arg2 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var30) {
                                            class618.field8964[var35] = var12;
                                            class390.field5889[var35] = var13 + 1;
                                            class369.field5475[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class263.field3413[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg2 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class369.field5475[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg2) {
                                            class618.field8964[var35] = var12 - 1;
                                            class390.field5889[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class369.field5475[var21 - 1][var22 - 1] = 3;
                                            class263.field3413[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var31 + var23 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg2) > var21 && var22 > 0 && class369.field5475[var21 + 1][var22 - 1] == 0 && (var20[arg2 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg2 <= var32) {
                                            class618.field8964[var35] = var12 + 1;
                                            class390.field5889[var35] = var13 - 1;
                                            class369.field5475[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class263.field3413[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg2) && class369.field5475[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][var24 + arg2] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg2 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class618.field8964[var35] = var12 - 1;
                                    class390.field5889[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class369.field5475[var21 - 1][var22 + 1] = 6;
                                    class263.field3413[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= (128 - arg2));
                        } while (var22 >= (128 - arg2));
                    } while (class369.field5475[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg2 + var23][arg2 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][arg2 + var24] & 0x7E240000) != 0 || (var20[arg2 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class618.field8964[var35] = var12 + 1;
                class390.field5889[var35] = var13 + 1;
                class369.field5475[var21 + 1][var22 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class263.field3413[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 575)
    public static void method3289(int arg0) {
        field8304 = null;
        if (arg0 != -1) {
            field8304 = null;
        }
        field8305 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lr;I)V", line = 594)
    public static final void method3290(class98 arg0, int arg1) {
        if (class70.field1083) {
            class492.method2813(arg0, false);
        } else {
            class328.method2022(arg0, (byte) 109);
        }
        if (arg1 != 3435) {
            method3283((byte) 95, 57, 118);
        }
        field8303++;
    }
}
