import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class47 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Ldv;")
    public static class566 field902 = new class566(66, 2);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lnj;Z)V")
    public static final void method468(class204 arg0, boolean arg1) {
        field905++;
        arg0.method1240(false);
        int var2 = 0;
        for (int var3 = 0; var3 < class559.field7738; var3++) {
            int var15 = class358.field4825[var3];
            if ((class611.field8783[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class611.field8783[var15] = (byte) class73.method578(class611.field8783[var15], 2);
                } else {
                    int var16 = arg0.method1237(592256579, 1);
                    if (var16 == 0) {
                        var2 = class603.method3555(-127, arg0);
                        class611.field8783[var15] = (byte) class73.method578(class611.field8783[var15], 2);
                    } else {
                        class77.method595(-1986155574, arg0, var15);
                    }
                }
            }
        }
        arg0.method1239(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method1240(arg1);
        for (int var4 = 0; var4 < class559.field7738; var4++) {
            int var13 = class358.field4825[var4];
            if ((class611.field8783[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class611.field8783[var13] = (byte) class73.method578(class611.field8783[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method1237(592256579, 1);
                    if (var14 == 0) {
                        var2 = class603.method3555(-89, arg0);
                        class611.field8783[var13] = (byte) class73.method578(class611.field8783[var13], 2);
                    } else {
                        class77.method595(-1986155574, arg0, var13);
                    }
                }
            }
        }
        arg0.method1239(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method1240(false);
        for (int var5 = 0; var5 < class561.field7777; var5++) {
            int var11 = class285.field3916[var5];
            if ((class611.field8783[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class611.field8783[var11] = (byte) class73.method578(class611.field8783[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method1237(592256579, 1);
                    if (var12 == 0) {
                        var2 = class603.method3555(-123, arg0);
                        class611.field8783[var11] = (byte) class73.method578(class611.field8783[var11], 2);
                    } else if (class242.method1513(82, var11, arg0)) {
                        class611.field8783[var11] = (byte) class73.method578(class611.field8783[var11], 2);
                    }
                }
            }
        }
        arg0.method1239(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method1240(false);
        for (int var6 = 0; var6 < class561.field7777; var6++) {
            int var9 = class285.field3916[var6];
            if ((class611.field8783[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    class611.field8783[var9] = (byte) class73.method578(class611.field8783[var9], 2);
                    var2--;
                } else {
                    int var10 = arg0.method1237(592256579, 1);
                    if (var10 == 0) {
                        var2 = class603.method3555(-89, arg0);
                        class611.field8783[var9] = (byte) class73.method578(class611.field8783[var9], 2);
                    } else if (class242.method1513(82, var9, arg0)) {
                        class611.field8783[var9] = (byte) class73.method578(class611.field8783[var9], 2);
                    }
                }
            }
        }
        arg0.method1239(8);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class559.field7738 = 0;
        class561.field7777 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class611.field8783[var7] = (byte) (class611.field8783[var7] >> 1);
            class188 var8 = class349.field4696[var7];
            if (var8 == null) {
                class285.field3916[class561.field7777++] = var7;
            } else {
                class358.field4825[class559.field7738++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([[[Lbo;IIZII)Z")
    public static final boolean method469(class622[][][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 <= 113) {
            field902 = null;
        }
        field901++;
        byte var6 = arg3 ? 1 : (byte) (class143.field2215 & 0xFF);
        if (class485.field6824[class206.field2901][arg2][arg4] == var6) {
            return false;
        } else if ((class80.field1299[class206.field2901][arg2][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class112.field1723[var7] = arg2;
            int var8 = 0;
            int var35 = var7 + 1;
            class519.field7293[var7] = arg4;
            class485.field6824[class206.field2901][arg2][arg4] = var6;
            while (var35 != var8) {
                int var9 = class112.field1723[var8] & 0xFFFF;
                int var10 = class112.field1723[var8] >> 16 & 0xFF;
                int var11 = class112.field1723[var8] >> 24 & 0xFF;
                int var12 = class519.field7293[var8] & 0xFFFF;
                int var13 = (class519.field7293[var8] & 0xFFE0D4) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class80.field1299[class206.field2901][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class206.field2901 + 1; var16 <= 3; var16++) {
                    if ((class80.field1299[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field8985 != null) {
                                int var20 = class556.method3154(var10, -127);
                                if (arg0[var16][var9][var12].field8985.field4632 == var20 || arg0[var16][var9][var12].field8982 != null && arg0[var16][var9][var12].field8982.field4632 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class556.method3154(var11, -124);
                                    if (arg0[var16][var9][var12].field8985.field4632 == var21 || arg0[var16][var9][var12].field8982 != null && arg0[var16][var9][var12].field8982.field4632 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class556.method3154(var13, -125);
                                    if (arg0[var16][var9][var12].field8985.field4632 == var22 || arg0[var16][var9][var12].field8982 != null && arg0[var16][var9][var12].field8982.field4632 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class622 var23 = arg0[var16][var9][var12];
                            if (var23.field8973 != null) {
                                for (class559 var24 = var23.field8973; var24 != null; var24 = var24.field7736) {
                                    class425 var25 = var24.field7742;
                                    if (var25 instanceof class115) {
                                        class115 var26 = (class115) var25;
                                        int var27 = var26.method752(true);
                                        int var28 = var26.method749(24194);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class622 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field8973 != null) {
                            for (class559 var31 = var30.field8973; var31 != null; var31 = var31.field7736) {
                                class425 var32 = var31.field7742;
                                if (var32.field6036 != var32.field6030 || var32.field6031 != var32.field6028) {
                                    for (int var33 = var32.field6036; var33 <= var32.field6030; var33++) {
                                        for (int var34 = var32.field6028; var34 <= var32.field6031; var34++) {
                                            class485.field6824[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class485.field6824[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class590.field8430[class206.field2901 + 1].method1104(var9, var12);
                    if (var17 > class456.field6425[arg1]) {
                        class456.field6425[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class564.field7811[arg1]) {
                        class564.field7811[arg1] = var18;
                    } else if (class437.field6208[arg1] < var18) {
                        class437.field6208[arg1] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class587.field8409[arg1]) {
                        class587.field8409[arg1] = var19;
                    } else if (var19 > class340.field4584[arg1]) {
                        class340.field4584[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class485.field6824[class206.field2901][var9 - 1][var12] != var6) {
                        class112.field1723[var35] = class73.method578(class73.method578(1179648, var9 - 1), -754974720);
                        class519.field7293[var35] = class73.method578(var12, 1245184);
                        class485.field6824[class206.field2901][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class611.field8786 > var12) {
                        if (var9 - 1 >= 0 && class485.field6824[class206.field2901][var9 - 1][var12] != var6 && (class80.field1299[class206.field2901][var9][var12] & 0x4) == 0 && (class80.field1299[class206.field2901][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class112.field1723[var35] = class73.method578(class73.method578(1179648, var9 - 1), 1375731712);
                            class519.field7293[var35] = class73.method578(1245184, var12);
                            class485.field6824[class206.field2901][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class485.field6824[class206.field2901][var9][var12] != var6) {
                            class112.field1723[var35] = class73.method578(class73.method578(5373952, var9), 318767104);
                            class519.field7293[var35] = class73.method578(5439488, var12);
                            class485.field6824[class206.field2901][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class32.field513 > (var9 + 1) && class485.field6824[class206.field2901][var9 + 1][var12] != var6 && (class80.field1299[class206.field2901][var9][var12] & 0x4) == 0 && (class80.field1299[class206.field2901][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class112.field1723[var35] = class73.method578(-1845493760, class73.method578(var9 + 1, 5373952));
                            class519.field7293[var35] = class73.method578(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class485.field6824[class206.field2901][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class32.field513 && class485.field6824[class206.field2901][var9 + 1][var12] != var6) {
                        class112.field1723[var35] = class73.method578(1392508928, class73.method578(var9 + 1, 9568256));
                        class519.field7293[var35] = class73.method578(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class485.field6824[class206.field2901][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class485.field6824[class206.field2901][var9 - 1][var12] != var6 && (class80.field1299[class206.field2901][var9][var12] & 0x4) == 0 && (class80.field1299[class206.field2901][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class112.field1723[var35] = class73.method578(class73.method578(var9 - 1, 13762560), 301989888);
                            class519.field7293[var35] = class73.method578(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class485.field6824[class206.field2901][var9 - 1][var12] = var6;
                        }
                        if (class485.field6824[class206.field2901][var9][var12] != var6) {
                            class112.field1723[var35] = class73.method578(class73.method578(13762560, var9), -1828716544);
                            class519.field7293[var35] = class73.method578(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class485.field6824[class206.field2901][var9][var12] = var6;
                        }
                        if (class32.field513 > var9 + 1 && class485.field6824[class206.field2901][var9 + 1][var12] != var6 && (class80.field1299[class206.field2901][var9][var12] & 0x4) == 0 && (class80.field1299[class206.field2901][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class112.field1723[var35] = class73.method578(class73.method578(9568256, var9 + 1), -771751936);
                            class519.field7293[var35] = class73.method578(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class485.field6824[class206.field2901][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class456.field6425[arg1] != -1000000) {
                class456.field6425[arg1] += 10;
                class564.field7811[arg1] -= 50;
                class437.field6208[arg1] += 50;
                class340.field4584[arg1] += 50;
                class587.field8409[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method470(byte arg0) {
        if (arg0 != 61) {
            field903 = 79;
        }
        field902 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILas;Las;)V")
    public static final void method471(int arg0, class132 arg1, class132 arg2) {
        if (arg0 != 999999) {
            field902 = null;
        }
        field904++;
        if (arg1.field2108 != null) {
            arg1.method896(arg0 - 999999);
        }
        arg1.field2108 = arg2;
        arg1.field2104 = arg2.field2104;
        arg1.field2108.field2104 = arg1;
        arg1.field2104.field2108 = arg1;
    }
}
