import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class349 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
    private int[] field4641;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field4647 = 0;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "[I")
    public static int[] field4643 = new int[13];

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V", line = 3)
    public static final void method2052(int arg0, int arg1, int arg2) {
        field4646++;
        int var3 = class121.field1570.method1066(-98, class246.field3233.method1823(class374.field5072, (byte) -88));
        class36 var4 = (class36) class69.field806.method970(arg2 ^ 0x5D8E);
        if (arg2 != 23938) {
            return;
        }
        while (var4 != null) {
            int var8 = class183.method1065(var4, -108);
            if (var3 < var8) {
                var3 = var8;
            }
            var4 = (class36) class69.field806.method976((byte) -122);
        }
        var3 += 8;
        int var5 = class391.field5656 * 16 + 21;
        int var6 = arg1 - (var3 / 2);
        if (var6 + var3 > class372.field5051) {
            var6 = class372.field5051 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if ((var5 + arg0) > class430.field6244) {
            var7 = class430.field6244 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class451.field6723 = var6;
        class425.field6180 = class391.field5656 * 16 + (class144.field1922 ? 26 : 22);
        class155.field2026 = var7;
        class483.field7125 = true;
        class366.field4993 = var3;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)I", line = 60)
    public final int method2053(int arg0, byte arg1) {
        field4639++;
        if (arg1 != 21) {
            field4645 = 115;
        }
        int var3 = (this.field4641.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field4641[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4641[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 90)
    public static void method2054(byte arg0) {
        field4643 = null;
        int var1 = -41 / ((-arg0 - 84) / 41);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "([I)V", line = 98)
    public class349(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4641 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4641[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4641[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4641[var5 + var5] = arg0[var4];
            this.field4641[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIBIIILas;IIII)Z", line = 144)
    public static final boolean method2055(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class106 arg7, int arg8, int arg9, int arg10, int arg11) {
        field4644++;
        int var12 = arg10;
        int var13 = arg8;
        byte var14 = 64;
        if (arg3 != -63) {
            method2054((byte) 106);
        }
        byte var15 = 64;
        int var16 = arg10 - var14;
        int var17 = arg8 - var15;
        class360.field4889[var14][var15] = 99;
        class71.field913[var14][var15] = 0;
        byte var18 = 0;
        class476.field7051[var18] = arg10;
        int var19 = 0;
        int var35 = var18 + 1;
        class490.field7182[var18] = arg8;
        int[][] var20 = arg7.field1421;
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
                                    class407.field5849 = var13;
                                    class79.field966 = var12;
                                    return false;
                                }
                                var13 = class490.field7182[var19];
                                var12 = class476.field7051[var19];
                                var21 = var12 - var16;
                                var22 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg7.field1444;
                                var24 = var13 - arg7.field1440;
                                if (arg6 == -4) {
                                    if (arg1 == var12 && arg5 == var13) {
                                        class407.field5849 = var13;
                                        class79.field966 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -3) {
                                    if (class415.method2541(var13, var12, arg2, arg0, arg9, arg2, arg1, true, arg5)) {
                                        class407.field5849 = var13;
                                        class79.field966 = var12;
                                        return true;
                                    }
                                } else if (arg6 == -2) {
                                    if (arg7.method645(var13, var12, arg5, arg2, arg9, (byte) -125, arg2, arg4, arg1, arg0)) {
                                        class79.field966 = var12;
                                        class407.field5849 = var13;
                                        return true;
                                    }
                                } else if (arg6 == -1) {
                                    if (arg7.method644(arg0, arg5, arg1, arg2, var13, arg4, arg9, var12, 0)) {
                                        class407.field5849 = var13;
                                        class79.field966 = var12;
                                        return true;
                                    }
                                } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                                    if (arg7.method650(arg2, arg11, arg3 - 10793, arg1, arg6, var13, arg5, var12)) {
                                        class79.field966 = var12;
                                        class407.field5849 = var13;
                                        return true;
                                    }
                                } else if (arg7.method651(arg6, var13, arg2, arg1, arg5, arg11, arg3 + 25570, var12)) {
                                    class407.field5849 = var13;
                                    class79.field966 = var12;
                                    return true;
                                }
                                var26 = class71.field913[var21][var22] + 1;
                                if (var21 > 0 && class360.field4889[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg2 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var27) {
                                            class476.field7051[var35] = var12 - 1;
                                            class490.field7182[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class360.field4889[var21 - 1][var22] = 2;
                                            class71.field913[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg2) > var21 && class360.field4889[var21 + 1][var22] == 0 && (var20[arg2 + var23][var24] & 0x60E40000) == 0 && (var20[arg2 + var23][var24 - (1 - arg2)] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg2 - 1 <= var28) {
                                            class476.field7051[var35] = var12 + 1;
                                            class490.field7182[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class360.field4889[var21 + 1][var22] = 8;
                                            class71.field913[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg2][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class360.field4889[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg2 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg2 - 1)) {
                                            class476.field7051[var35] = var12;
                                            class490.field7182[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class360.field4889[var21][var22 - 1] = 1;
                                            class71.field913[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < (128 - arg2) && class360.field4889[var21][var22 + 1] == 0 && (var20[var23][arg2 + var24] & 0x4E240000) == 0 && (var20[var23 + arg2 - 1][arg2 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg2 - 1)) {
                                            class476.field7051[var35] = var12;
                                            class490.field7182[var35] = var13 + 1;
                                            class360.field4889[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class71.field913[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg2 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class360.field4889[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg2 <= var31) {
                                            class476.field7051[var35] = var12 - 1;
                                            class490.field7182[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class360.field4889[var21 - 1][var22 - 1] = 3;
                                            class71.field913[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg2) > var21 && var22 > 0 && class360.field4889[var21 + 1][var22 - 1] == 0 && (var20[arg2 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg2 <= var32) {
                                            class476.field7051[var35] = var12 + 1;
                                            class490.field7182[var35] = var13 - 1;
                                            class360.field4889[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class71.field913[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg2 + var23][var32 + var24 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < 128 - arg2 && class360.field4889[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg2 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg2; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][var24 + arg2] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class476.field7051[var35] = var12 - 1;
                                    class490.field7182[var35] = var13 + 1;
                                    class360.field4889[var21 - 1][var22 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class71.field913[var21 - 1][var22 + 1] = var26;
                                }
                            } while (var21 >= 128 - arg2);
                        } while (var22 >= 128 - arg2);
                    } while (class360.field4889[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg2 + var23][var24 + arg2] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg2; var34++) {
                    if ((var20[var23 + var34][arg2 + var24] & 0x7E240000) != 0 || (var20[arg2 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class476.field7051[var35] = var12 + 1;
                class490.field7182[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class360.field4889[var21 + 1][var22 + 1] = 12;
                class71.field913[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILya;)V", line = 574)
    public static final void method2056(int arg0, class38 arg1) {
        class152.field1993[arg0] = arg1;
    }
}
