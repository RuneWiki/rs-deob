import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class236 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lsb;")
    private static class98 field4073 = class47.method368("Created gameworld", 0);

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lsb;")
    public static class98 field4080 = class47.method368("Spieler", 0);

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lsb;")
    public static class98 field4077 = field4073;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4081;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    public static int[] field4072;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4079++;
        int var11 = arg4 - arg10;
        if (arg4 < class140.field2488) {
            var11++;
        }
        int var12 = arg6 - arg2;
        if (arg6 < class148.field2743) {
            var12++;
        }
        if (arg1 != 29913) {
            field4080 = null;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var32 = arg5 * var13 + arg8 >> 16;
            int var33 = arg8 + ((var13 + 1) * arg5) >> 16;
            int var34 = var33 - var32;
            if (var34 > 0) {
                int var35 = arg10 + var13 >> 6;
                if (var35 >= 0 && var35 <= class233.field4018.length - 1) {
                    int var36 = arg0 + var33;
                    int var37 = arg0 + var32;
                    byte[][] var38 = class102.field1805[var35];
                    int[][] var39 = class233.field4018[var35];
                    byte[][] var40 = class91.field1608[var35];
                    byte[][] var41 = class166.field2975[var35];
                    byte[][] var42 = class15.field293[var35];
                    byte[][] var43 = class75.field1330[var35];
                    for (int var44 = 0; var44 < var12; var44++) {
                        int var45 = arg9 + (arg3 * var44) >> 16;
                        int var46 = (var44 + 1) * arg3 + arg9 >> 16;
                        int var47 = var46 - var45;
                        if (var47 > 0) {
                            int var48 = arg2 + var44 & 0x3F;
                            int var49 = arg2 + var44 >> 6;
                            int var50 = arg7 + var45;
                            int var51 = var13 + arg10 & 0x3F;
                            int var52 = arg7 + var46;
                            int var53 = (var48 << 6) + var51;
                            int var54;
                            if (var49 < 0 || var49 > (var39.length - 1) || var39[var49] == null) {
                                if (class64.field1052.field2765 != -1) {
                                    var54 = class64.field1052.field2765;
                                } else if ((arg2 + var44 & 0x4) == (arg10 + var13 & 0x4)) {
                                    var54 = class108.field1939[class2.field39 + 1];
                                } else {
                                    var54 = 4936552;
                                }
                                if (var49 < 0 || var49 > var39.length - 1) {
                                    if (var54 == 0) {
                                        var54 = 1;
                                    }
                                    class128.method967(var37, var50, var34, var47, var54);
                                    continue;
                                }
                            } else {
                                var54 = var39[var49][var53];
                            }
                            int var55 = var38[var49] == null ? 0 : class108.field1939[var38[var49][var53] & 0xFF];
                            if (var54 == 0) {
                                var54 = 1;
                            }
                            int var56 = var40[var49] == null ? 0 : class108.field1939[var40[var49][var53] & 0xFF];
                            if (var55 == 0 && var56 == 0) {
                                class128.method967(var37, var50, var34, var47, var54);
                            } else {
                                if (var55 != 0) {
                                    if (var55 == -1) {
                                        var55 = 1;
                                    }
                                    byte var57 = var41[var49] == null ? 0 : var41[var49][var53];
                                    int var58 = var57 & 0xFC;
                                    if (var58 == 0 || var34 <= 1 || var47 <= 1) {
                                        class128.method967(var37, var50, var34, var47, var55);
                                    } else {
                                        class10.method98(var34, (byte) -86, var50, var55, var47, var37, class128.field2286, var57 & 0x3, true, var58 >> 2, var54);
                                    }
                                }
                                if (var56 != 0) {
                                    if (var56 == -1) {
                                        var56 = var54;
                                    }
                                    byte var59 = var42[var49][var53];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var34 <= 1 || var47 <= 1) {
                                        class128.method967(var37, var50, var34, var47, var56);
                                    }
                                    class10.method98(var34, (byte) -86, var50, var56, var47, var37, class128.field2286, var59 & 0x3, var55 == 0, var60 >> 2, 0);
                                }
                            }
                            if (var43[var49] != null) {
                                int var61 = var43[var49][var53] & 0xFF;
                                if (var61 != 0) {
                                    int var62;
                                    if (var34 == 1) {
                                        var62 = var37;
                                    } else {
                                        var62 = var36 - 1;
                                    }
                                    int var63;
                                    if (var47 == 1) {
                                        var63 = var50;
                                    } else {
                                        var63 = var52 - 1;
                                    }
                                    int var64 = 13421772;
                                    if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                        var61 -= 4;
                                        var64 = 13369344;
                                    }
                                    if (var61 == 1) {
                                        class128.method958(var37, var50, var47, var64);
                                    } else if (var61 == 2) {
                                        class128.method966(var37, var50, var34, var64);
                                    } else if (var61 == 3) {
                                        class128.method958(var62, var50, var47, var64);
                                    } else if (var61 == 4) {
                                        class128.method966(var37, var63, var34, var64);
                                    } else if (var61 == 9) {
                                        class128.method958(var37, var50, var47, 16777215);
                                        class128.method966(var37, var50, var34, var64);
                                    } else if (var61 == 10) {
                                        class128.method958(var62, var50, var47, 16777215);
                                        class128.method966(var37, var50, var34, var64);
                                    } else if (var61 == 11) {
                                        class128.method958(var62, var50, var47, 16777215);
                                        class128.method966(var37, var63, var34, var64);
                                    } else if (var61 == 12) {
                                        class128.method958(var37, var50, var47, 16777215);
                                        class128.method966(var37, var63, var34, var64);
                                    } else if (var61 == 17) {
                                        class128.method966(var37, var50, 1, var64);
                                    } else if (var61 == 18) {
                                        class128.method966(var62, var50, 1, var64);
                                    } else if (var61 == 19) {
                                        class128.method966(var62, var63, 1, var64);
                                    } else if (var61 == 20) {
                                        class128.method966(var37, var63, 1, var64);
                                    } else if (var61 == 25) {
                                        for (int var66 = 0; var66 < var47; var66++) {
                                            class128.method966(var37 + var66, var63 - var66, 1, var64);
                                        }
                                    } else if (var61 == 26) {
                                        for (int var65 = 0; var65 < var47; var65++) {
                                            class128.method966(var37 + var65, var50 + var65, 1, var64);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var67 = arg0 + var32;
                    var10000 = arg0 + var33;
                    for (int var69 = 0; var69 < var12; var69++) {
                        int var70;
                        if (class64.field1052.field2765 != -1) {
                            var70 = class64.field1052.field2765;
                        } else if ((var69 + arg2 & 0x4) == (var13 + arg10 & 0x4)) {
                            var70 = class108.field1939[class2.field39 + 1];
                        } else {
                            var70 = 4936552;
                        }
                        if (var70 == 0) {
                            var70 = 1;
                        }
                        int var71 = (arg9 + (arg3 * var69) >> 16) + arg7;
                        int var72 = (arg9 + ((var69 + 1) * arg3) >> 16) + arg7;
                        int var73 = var72 - var71;
                        class128.method967(var67, var71, var34, var73, var70);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < (var11 + 2); var14++) {
            int var15 = arg8 + (arg5 * var14) >> 16;
            int var16 = (var14 + 1) * arg5 + arg8 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg0 + var15;
                var10000 = arg0 + var16;
                int var20 = arg10 + var14 >> 6;
                if (var20 >= 0 && (class206.field3516.length - 1) >= var20) {
                    short[][] var21 = class206.field3516[var20];
                    for (int var22 = -2; var22 < var12 + 2; var22++) {
                        int var23 = arg3 * var22 + arg9 >> 16;
                        int var24 = (var22 + 1) * arg3 + arg9 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg7 + var23;
                            var10000 = arg7 + var24;
                            int var28 = var22 + arg2 >> 6;
                            if (var28 >= 0 && (var21.length - 1) >= var28) {
                                int var29 = ((arg2 + var22 & 0x3F) << 6) + (var14 + arg10 & 0x3F);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29] & 0x3FFF;
                                    int var31 = (var21[var28][var29] & 0xF59A) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            class134.field2375[var30 - 1].method260(var18, var26, var17 * 2, var25 * 2);
                                        } else if (var31 == 1) {
                                            class84.field1476[var30 - 1].method260(var18, var26, var17 * 2, var25 * 2);
                                        } else if (var31 == 2) {
                                            class110.field1960[var30 - 1].method260(var18, var26, var17 * 2, var25 * 2);
                                        } else if (var31 == 3) {
                                            class115.field2069[var30 - 1].method260(var18, var26, var17 * 2, var25 * 2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class236() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILlj;)Lsb;")
    public static final class98 method1613(int arg0, class216 arg1) {
        field4075++;
        if (arg0 >= -69) {
            method1617((byte) 20);
        }
        return class232.method1593((byte) 64, 32767, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZIII[Lqb;[BIIII)V")
    public static final void method1614(int arg0, boolean arg1, int arg2, int arg3, int arg4, class72[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 != 22721) {
            method1617((byte) 42);
        }
        int var11 = -1;
        class216 var12 = new class216(arg6);
        while (true) {
            int var13 = var12.method1485(false);
            if (var13 == 0) {
                field4078++;
                return;
            }
            int var14 = 0;
            var11 += var13;
            while (true) {
                int var15 = var12.method1482(26084);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method1446(5350);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg8 == var18 && arg7 <= var16 && var16 < (arg7 + 8) && var17 >= arg10 && var17 < (arg10 + 8)) {
                    class21 var22 = class125.method929(var11, (byte) -112);
                    int var23 = class135.method1017(var22.field398, var22.field397, (byte) -118, arg3, var20, var17 & 0x7, var16 & 0x7) + arg9;
                    int var24 = class105.method809(var16 & 0x7, var22.field398, var20, (byte) -13, var17 & 0x7, var22.field397, arg3) + arg4;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class72 var25 = null;
                        if (!arg1) {
                            int var26 = arg2;
                            if ((class138.field2461[1][var23][var24] & 0x2) == 2) {
                                var26 = arg2 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class148.method1094(arg2, -30945, var24, arg2, arg3 + var20 & 0x3, var21, var11, arg1, var25, !arg1, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Llj;B[B)V")
    public final void method1615(class216 arg0, byte arg1, byte[] arg2) {
        field4074++;
        if (arg0.field3706[arg0.field3728] != 31 || arg0.field3706[arg0.field3728 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg1 != -87) {
            field4071 = -60;
        }
        if (this.field4081 == null) {
            this.field4081 = new Inflater(true);
        }
        try {
            this.field4081.setInput(arg0.field3706, arg0.field3728 + 10, -arg0.field3728 + -10 - 8 + arg0.field3706.length);
            this.field4081.inflate(arg2);
        } catch (Exception var4) {
            this.field4081.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4081.reset();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZZ)V")
    public static final void method1616(boolean arg0, boolean arg1) {
        field4082++;
        if (class75.field1328 == null) {
            return;
        }
        if (!arg1) {
            method1614(76, false, -77, 83, 84, (class72[]) null, (byte[]) null, 78, 94, 47, -79);
        }
        try {
            class216 var2 = new class216(4);
            var2.method1477(arg0 ? 2 : 3, -26755);
            var2.method1462((byte) -74, 0);
            class75.field1328.method788(arg1, 0, 4, var2.field3706);
        } catch (IOException var4) {
            try {
                class75.field1328.method790(false);
            } catch (Exception var3) {
            }
            class75.field1328 = null;
            class112.field1995++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method1617(byte arg0) {
        if (arg0 <= 38) {
            method1612(49, 53, -90, 48, 61, -13, -101, 1, -73, -112, 6);
        }
        field4073 = null;
        field4072 = null;
        field4077 = null;
        field4080 = null;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(III)V")
    private class236(int arg0, int arg1, int arg2) {
    }
}
