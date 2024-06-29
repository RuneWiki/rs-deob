import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class401 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public int field5671 = 0;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Lus;")
    public static class1 field5674 = new class1(76, -2);

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5679 = new String[100];

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field5680 = 0;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field5682 = 0;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
    public static final int method2391(int arg0, int arg1) {
        return class114.field1465 == null ? 0 : class114.field1465[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILoa;ILkm;BILdq;)V")
    public static final void method2392(int arg0, int arg1, class452 arg2, int arg3, class216 arg4, byte arg5, int arg6, class453 arg7) {
        if (arg5 != 8) {
            field5674 = null;
        }
        field5673++;
        class342 var8 = new class342();
        var8.field4977 = arg0 * 128;
        var8.field4971 = arg3;
        var8.field4988 = arg6 * 128;
        if (arg7 != null) {
            var8.field4979 = arg7;
            int var10 = arg7.field6325;
            int var11 = arg7.field6385;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg7.field6385;
                var11 = arg7.field6325;
            }
            var8.field4983 = arg7.field6361;
            var8.field4972 = arg7.field6339 * 128;
            var8.field4987 = (arg6 + var10) * 128;
            var8.field4965 = arg7.field6317;
            var8.field4968 = arg7.field6389;
            var8.field4985 = arg7.field6310;
            var8.field4980 = arg7.field6369;
            var8.field4973 = (arg0 + var11) * 128;
            if (arg7.field6306 != null) {
                var8.field4969 = true;
                var8.method2155(0);
            }
            if (var8.field4980 != null) {
                var8.field4978 = var8.field4983 + ((int) ((double) (var8.field4968 - var8.field4983) * Math.random()));
            }
            class99.field1270.method2845(var8, (byte) 37);
        } else if (arg4 != null) {
            var8.field4966 = arg4;
            class466 var9 = arg4.field3232;
            if (var9.field6526 != null) {
                var8.field4969 = true;
                var9 = var9.method2742(arg5 - 29, class140.field1859);
            }
            if (var9 != null) {
                var8.field4987 = (var9.field6573 + arg6) * 128;
                var8.field4973 = (var9.field6573 + arg0) * 128;
                var8.field4965 = class491.method2877(-1, arg4);
                var8.field4972 = var9.field6562 * 128;
                var8.field4985 = var9.field6514;
            }
            class114.field1459.method2845(var8, (byte) 37);
        } else if (arg2 != null) {
            var8.field4970 = arg2;
            var8.field4987 = (arg6 + arg2.method918(false)) * 128;
            var8.field4973 = (arg0 + arg2.method918(false)) * 128;
            var8.field4965 = class437.method2574(arg2, (byte) -110);
            var8.field4972 = arg2.field6283 * 128;
            var8.field4985 = arg2.field6261;
            class389.field5521.method2767(arg5 ^ 0xFFFFFFF7, (long) arg2.field2154, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILrp;)V")
    private final void method2393(int arg0, int arg1, class276 arg2) {
        if (arg1 == 5) {
            this.field5671 = arg2.method1729(65280);
        }
        if (arg0 != 1) {
            method2396(-36, (class145) null);
        }
        field5677++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method2394(int arg0) {
        field5676++;
        class489 var1 = class116.method731(-625541408, 15, arg0);
        var1.method2861(arg0 - 229012000);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lrp;I)V")
    public final void method2395(class276 arg0, int arg1) {
        field5675++;
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                int var4 = 108 % ((-arg1 - 69) / 32);
                return;
            }
            this.method2393(1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILdt;)V")
    public static final void method2396(int arg0, class145 arg1) {
        field5678++;
        if (!class36.field473) {
            return;
        }
        class362.field5202++;
        class15.method110(class140.field1855, -128);
        if (arg0 > -81) {
            field5679 = null;
        }
        class225.field3415.method1744(arg1.field1933, true);
        class225.field3415.method1694(arg1.field1951, -75);
        class225.field3415.method1711(false, class40.field523);
        class225.field3415.method1724((byte) 81, class359.field5170);
        class225.field3415.method1752(class255.field3739, 25580);
        class225.field3415.method1689(arg1.field2016, (byte) 121);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILee;IBIIIIIIII)Z")
    public static final boolean method2397(int arg0, class441 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5681++;
        int var12 = arg4;
        int var13 = arg2;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg4 - var14;
        int var17 = arg2 - var15;
        class168.field2448[var14][var15] = 99;
        class258.field3784[var14][var15] = 0;
        byte var18 = 0;
        class368.field5326[var18] = arg4;
        int var19 = 0;
        if (arg3 != 94) {
            return false;
        }
        int var35 = var18 + 1;
        class89.field1098[var18] = arg2;
        int[][] var20 = arg1.field6121;
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
                                    class245.field3646 = var12;
                                    class411.field5763 = var13;
                                    return false;
                                }
                                var13 = class89.field1098[var19];
                                var12 = class368.field5326[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg1.field6099;
                                var24 = var13 - arg1.field6101;
                                if (arg8 == -4) {
                                    if (arg9 == var12 && arg5 == var13) {
                                        class411.field5763 = var13;
                                        class245.field3646 = var12;
                                        return true;
                                    }
                                } else if (arg8 == -3) {
                                    if (class172.method1061(arg6, arg0, arg10, arg9, var12, arg5, var13, arg10, -76)) {
                                        class411.field5763 = var13;
                                        class245.field3646 = var12;
                                        return true;
                                    }
                                } else if (arg8 == -2) {
                                    if (arg1.method2583(arg5, arg9, arg0, arg10, var12, arg6, 2883968, var13, arg10, arg7)) {
                                        class245.field3646 = var12;
                                        class411.field5763 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -1) {
                                    if (arg1.method2599(var12, arg5, arg10, true, var13, arg6, arg0, arg9, arg7)) {
                                        class411.field5763 = var13;
                                        class245.field3646 = var12;
                                        return true;
                                    }
                                } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                                    if (arg1.method2591(arg11, var13, arg5, var12, 3981, arg9, arg10, arg8)) {
                                        class411.field5763 = var13;
                                        class245.field3646 = var12;
                                        return true;
                                    }
                                } else if (arg1.method2586(arg8, var12, var13, arg11, arg10, -19527, arg9, arg5)) {
                                    class245.field3646 = var12;
                                    class411.field5763 = var13;
                                    return true;
                                }
                                var26 = class258.field3784[var22][var21] + 1;
                                if (var22 > 0 && class168.field2448[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg10 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg10 - 1)) {
                                            class368.field5326[var35] = var12 - 1;
                                            class89.field1098[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class168.field2448[var22 - 1][var21] = 2;
                                            class258.field3784[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg10) > var22 && class168.field2448[var22 + 1][var21] == 0 && (var20[arg10 + var23][var24] & 0x60E40000) == 0 && (var20[arg10 + var23][var24 + arg10 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg10 - 1) <= var28) {
                                            class368.field5326[var35] = var12 + 1;
                                            class89.field1098[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class168.field2448[var22 + 1][var21] = 8;
                                            class258.field3784[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg10 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class168.field2448[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg10 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg10 - 1) {
                                            class368.field5326[var35] = var12;
                                            class89.field1098[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class168.field2448[var22][var21 - 1] = 1;
                                            class258.field3784[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < 128 - arg10 && class168.field2448[var22][var21 + 1] == 0 && (var20[var23][arg10 + var24] & 0x4E240000) == 0 && (var20[arg10 + var23 - 1][arg10 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg10 - 1) <= var30) {
                                            class368.field5326[var35] = var12;
                                            class89.field1098[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class168.field2448[var22][var21 + 1] = 4;
                                            class258.field3784[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg10 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class168.field2448[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg10 <= var31) {
                                            class368.field5326[var35] = var12 - 1;
                                            class89.field1098[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class168.field2448[var22 - 1][var21 - 1] = 3;
                                            class258.field3784[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 - (1 - var31)][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg10 && var21 > 0 && class168.field2448[var22 + 1][var21 - 1] == 0 && (var20[arg10 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg10 <= var32) {
                                            class368.field5326[var35] = var12 + 1;
                                            class89.field1098[var35] = var13 - 1;
                                            class168.field2448[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class258.field3784[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg10 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && (128 - arg10) > var21 && class168.field2448[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg10 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg10; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg10 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class368.field5326[var35] = var12 - 1;
                                    class89.field1098[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class168.field2448[var22 - 1][var21 + 1] = 6;
                                    class258.field3784[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg10));
                        } while ((128 - arg10) <= var21);
                    } while (class168.field2448[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg10 + var23][arg10 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg10; var34++) {
                    if ((var20[var23 + var34][arg10 + var24] & 0x7E240000) != 0 || (var20[arg10 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class368.field5326[var35] = var12 + 1;
                class89.field1098[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class168.field2448[var22 + 1][var21 + 1] = 12;
                class258.field3784[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method2398(int arg0) {
        field5674 = null;
        field5679 = null;
        if (arg0 != 6) {
            field5674 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)B")
    public static final byte method2399(int arg0, byte arg1, int arg2) {
        if (arg1 <= 118) {
            method2398(8);
        }
        field5672++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
