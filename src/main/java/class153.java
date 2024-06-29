import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class153 extends class35 {

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2489 = new CRC32();

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    public static int field2505 = 1;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "[I")
    public static int[] field2502 = new int[500];

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "Lrb;")
    public class118 field2492;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Lll;")
    public class239 field2499;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Ljl;")
    public class315 field2491;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Llj;")
    public class5 field2496;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "[[[B")
    public static byte[][][] field2507;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 6)
    public static void method993(int arg0) {
        field2489 = null;
        field2507 = (byte[][][]) null;
        if (arg0 != -786063385) {
            field2502 = (int[]) null;
        }
        field2502 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBIII[Lu;IIIZ[B)[I", line = 21)
    public static final int[] method994(int arg0, byte arg1, int arg2, int arg3, int arg4, class25[] arg5, int arg6, int arg7, int arg8, boolean arg9, byte[] arg10) {
        field2485++;
        int var11 = (arg6 & 0x7) * 8;
        int var12 = (arg2 & 0x7) * 8;
        byte var13;
        if (arg9) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        if (arg1 < 90) {
            method996((class109) null, 121);
        }
        if (!arg9) {
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class179.method1130(var15 & 0x7, arg0, var14 & 0x7, false) + arg3;
                    int var17 = class35.method285((byte) 122, var15 & 0x7, var14 & 0x7, arg0) + arg7;
                    if (var16 > 0 && var16 < 103 && var17 > 0 && var17 < 103) {
                        arg5[arg8].field501[var16][var17] = class61.method475(arg5[arg8].field501[var16][var17], -2097153);
                    }
                }
            }
        }
        class202 var18 = new class202(arg10);
        int var19 = arg2 & 0x1FFFFFF8 << 3;
        int var20 = (arg6 & 0xFFFFFFF8) << 3;
        for (int var21 = 0; var21 < var13; var21++) {
            for (int var22 = 0; var22 < 64; var22++) {
                for (int var23 = 0; var23 < 64; var23++) {
                    if (arg4 != var21 || var12 > var22 || var22 > var12 + 8 || var11 > var23 || var23 > var11 + 8) {
                        class267.method1773(0, 0, 0, -1, 0, -1, false, (byte) 100, arg9, var18);
                    } else if ((var12 + 8) == var22 || (var11 + 8) == var23) {
                        int var30;
                        int var31;
                        if (arg0 == 0) {
                            var30 = var22 + arg3 - var12;
                            var31 = var23 + arg7 - var11;
                        } else if (arg0 == 1) {
                            var31 = var12 + arg7 + 8 - var22;
                            var30 = var23 + arg3 - var11;
                        } else if (arg0 == 2) {
                            var30 = arg3 - (-(var12 - var22) - 8);
                            var31 = arg7 + 8 - (-var11 + var23);
                        } else {
                            var30 = arg3 + var11 + 8 - var23;
                            var31 = arg7 + var22 - var12;
                        }
                        class267.method1773(arg8, var19 + var22, var20 + var23, var30, 0, var31, true, (byte) 127, arg9, var18);
                    } else {
                        int var24 = class179.method1130(var23 & 0x7, arg0, var22 & 0x7, false) + arg3;
                        int var25 = class35.method285((byte) 124, var23 & 0x7, var22 & 0x7, arg0) + arg7;
                        class267.method1773(arg8, var19 + var22, var20 - -var23, var24, arg0, var25, false, (byte) 105, arg9, var18);
                        if (var22 == 63 || var23 == 63) {
                            int var26 = var22 == 63 ? 64 : var22;
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28;
                            int var29;
                            if (arg0 == 0) {
                                var28 = arg7 + var27 - var11;
                                var29 = arg3 + var26 - var12;
                            } else if (arg0 == 1) {
                                var29 = var27 + arg3 - var11;
                                var28 = var12 + arg7 + 8 - var26;
                            } else if (arg0 == 2) {
                                var28 = var11 + arg7 + 8 - var27;
                                var29 = -var26 - (-var12 - (arg3 + 8));
                            } else {
                                var29 = var11 + arg3 + 8 - var27;
                                var28 = arg7 + var26 - var12;
                            }
                            if (var29 >= 0 && var29 < 104 && var28 >= 0 && var28 < 104) {
                                class45.field923[var21][var29][var28] = class45.field923[var21][var24][var25];
                            }
                        }
                    }
                }
            }
        }
        boolean var32 = false;
        boolean var33 = false;
        while (var18.field3273.length > var18.field3249) {
            int var34 = var18.method1317((byte) -114);
            if (var34 == 128) {
                class134.field2253[0] = var18.method1315(14289);
                class134.field2253[1] = var18.method1356(false);
                class134.field2253[2] = var18.method1356(false);
                class134.field2253[3] = var18.method1356(false);
                class134.field2253[4] = var18.method1315(14289);
                var33 = true;
            } else {
                if (var34 != 129) {
                    var18.field3249--;
                    break;
                }
                for (int var35 = 0; var35 < 4; var35++) {
                    byte var36 = var18.method1333(-125);
                    if (var36 == 0) {
                        if (arg4 >= var35) {
                            int var44 = arg3 + 7;
                            int var45 = arg3;
                            int var46 = arg7;
                            if (arg3 < 0) {
                                var45 = 0;
                            } else if (arg3 >= 104) {
                                var45 = 104;
                            }
                            if (arg7 < 0) {
                                var46 = 0;
                            } else if (arg7 >= 104) {
                                var46 = 104;
                            }
                            if (var44 < 0) {
                                var44 = 0;
                            } else if (var44 >= 104) {
                                var44 = 104;
                            }
                            int var47 = arg7 + 7;
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 >= 104) {
                                var47 = 104;
                            }
                            while (var45 < var44) {
                                while (var46 < var47) {
                                    class44.field855[arg8][var45][var46] = 0;
                                    var46++;
                                }
                                var45++;
                            }
                        }
                    } else if (var36 == 1) {
                        for (int var37 = 0; var37 < 64; var37 += 4) {
                            for (int var38 = 0; var38 < 64; var38 += 4) {
                                byte var39 = var18.method1333(-126);
                                if (arg4 >= var35) {
                                    for (int var40 = var37; var40 < var37 + 4; var40++) {
                                        for (int var41 = var38; var41 < var38 + 4; var41++) {
                                            if (var12 <= var40 && (var12 + 8) > var40 && var11 <= var41 && (var11 + 8) > var11) {
                                                int var42 = class179.method1130(var41 & 0x7, arg0, var40 & 0x7, false) + arg3;
                                                int var43 = class35.method285((byte) 120, var41 & 0x7, var40 & 0x7, arg0) + arg7;
                                                if (var42 >= 0 && var42 < 104 && var43 >= 0 && var43 < 104) {
                                                    class44.field855[arg8][var42][var43] = var39;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var36 != 2) {
                    }
                }
            }
        }
        if (class249.field3893 && !arg9) {
            class336 var48 = null;
            label281: while (true) {
                while (true) {
                    while (var18.field3273.length > var18.field3249) {
                        int var49 = var18.method1317((byte) -124);
                        if (var49 == 0) {
                            var48 = new class336(var18);
                        } else if (var49 == 1) {
                            int var50 = var18.method1317((byte) -93);
                            if (var50 > 0) {
                                for (int var51 = 0; var51 < var50; var51++) {
                                    class1 var52 = new class1(var18);
                                    if (var52.field21 == 31) {
                                        class220 var53 = class234.method1552(18, var18.method1315(14289));
                                        var52.method5(var53.field3500, var53.field3489, var53.field3498, (byte) -107, var53.field3493);
                                    }
                                    int var54 = var52.field11 >> 7;
                                    int var55 = var52.field5 >> 7;
                                    if (var52.field28 == arg4 && var12 <= var55 && (var12 + 8) > var55 && var11 <= var54 && (var11 + 8) > var54) {
                                        int var56 = class156.method1010(arg0, var52.field5 & 0x3FF, (byte) 29, var52.field11 & 0x3FF) + (arg3 << 7);
                                        int var57 = (arg7 << 7) + class179.method1129(-100, var52.field11 & 0x3FF, arg0, var52.field5 & 0x3FF);
                                        var52.field5 = var56;
                                        var52.field11 = var57;
                                        int var58 = var52.field5 >> 7;
                                        int var59 = var52.field11 >> 7;
                                        if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                                            var52.field15 = (class99.field1749[1][var58][var59] & 0x2) != 0;
                                            var52.field29 = class45.field923[var52.field28][var58][var59] - var52.field29;
                                            class310.method2084(var52);
                                        }
                                    }
                                }
                            }
                        } else if (var49 == 2) {
                            if (var48 == null) {
                                var48 = new class336();
                            }
                            var48.method2320(0, var18);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var48 == null) {
                        var48 = new class336();
                    }
                    class210.field3387[arg3 >> 3][arg7 >> 3] = var48;
                    break label281;
                }
            }
        }
        if (!var32) {
            int var60 = arg3 + 7;
            int var61 = arg7 + 7;
            for (int var62 = arg3; var62 < var60; var62++) {
                for (int var63 = arg7; var63 < var61; var63++) {
                    class44.field855[arg8][var62][var63] = 0;
                }
            }
        }
        return var33 ? class134.field2253 : null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Lvf;", line = 467)
    public static final class41 method995(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        return var3 == null ? null : var3.field965;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lhm;I)V", line = 478)
    public static final void method996(class109 arg0, int arg1) {
        field2494++;
        if (class25.field494 == arg0.field1909 || arg0.field1897 == -1 || arg0.field1921 != 0 || (arg0.field1901 + 1) > class279.method1882(25397, arg0.field1897).field4041[arg0.field1908]) {
            int var2 = arg0.field1909 - arg0.field1924;
            int var3 = class25.field494 - arg0.field1924;
            int var4 = arg0.field1915 * 128 + (arg0.method710(-1) * 64);
            int var5 = arg0.field1896 * 128 + arg0.method710(arg1 ^ 0xFFFFFFF8) * 64;
            int var6 = arg0.field1888 * 128 + arg0.method710(-1) * 64;
            int var7 = arg0.field1957 * 128 + arg0.method710(-1) * 64;
            arg0.field1872 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field1869 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (arg0.field1922 == 0) {
            arg0.field1886 = 1024;
        }
        if (arg0.field1922 == 1) {
            arg0.field1886 = 1536;
        }
        if (arg0.field1922 == 2) {
            arg0.field1886 = 0;
        }
        if (arg0.field1922 == 3) {
            arg0.field1886 = 512;
        }
        arg0.field1927 = arg0.field1886;
        arg0.field1930 = 0;
        if (arg1 != 7) {
            method994(36, (byte) 96, 35, 84, 50, (class25[]) null, 43, -90, -24, false, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V", line = 537)
    public final void method997(boolean arg0) {
        this.field2491 = null;
        this.field2492 = null;
        this.field2499 = null;
        field2482++;
        this.field2496 = null;
        if (!arg0) {
            method994(-29, (byte) 126, -91, 88, -75, (class25[]) null, -15, -81, -128, true, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(Z)V", line = 552)
    public static final void method998(boolean arg0) {
        class134.field2255.method1877(-29702);
        field2506++;
        if (!arg0) {
            field2507 = (byte[][][]) ((byte[][][]) null);
        }
    }
}
