import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class145 {

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lcf;")
    public static class28 field2781 = new class28();

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "[[S")
    public static short[][] field2784 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Le;III)V")
    public static final void method914(class44 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class126.field2409) {
            class121 var4 = class204.field3800[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2300 != null && var4.field2300.field90.method331()) {
                arg0.method333(var4.field2300.field90, 128, 0, 0, true);
            }
        }
        if (arg3 < class126.field2409) {
            class121 var5 = class204.field3800[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2300 != null && var5.field2300.field90.method331()) {
                arg0.method333(var5.field2300.field90, 0, 0, 128, true);
            }
        }
        if (arg2 < class126.field2409 && arg3 < class181.field3357) {
            class121 var6 = class204.field3800[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2300 != null && var6.field2300.field90.method331()) {
                arg0.method333(var6.field2300.field90, 128, 0, 128, true);
            }
        }
        if (arg2 < class126.field2409 && arg3 > 0) {
            class121 var7 = class204.field3800[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2300 != null && var7.field2300.field90.method331()) {
                arg0.method333(var7.field2300.field90, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)V")
    public static final void method915(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class126.field2409 * 128) {
            arg0 = class126.field2409 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class181.field3357 * 128) {
            arg2 = class181.field3357 * 128 - 1;
        }
        class78.field1510++;
        class60.field1118 = class199.field3640[arg3];
        class69.field1302 = class199.field3624[arg3];
        class186.field3431 = class199.field3640[arg4];
        class120.field2275 = class199.field3624[arg4];
        class213.field3961 = class139.field2681[(arg3 - 128) / 32][arg4 / 64];
        class66.field1239 = arg0;
        class23.field537 = arg1;
        class231.field4336 = arg2;
        class8.field139 = arg0 / 128;
        class92.field1722 = arg2 / 128;
        class237.field4407 = arg5;
        class18.field438 = class8.field139 - class69.field1293;
        if (class18.field438 < 0) {
            class18.field438 = 0;
        }
        class187.field3475 = class92.field1722 - class69.field1293;
        if (class187.field3475 < 0) {
            class187.field3475 = 0;
        }
        class190.field3507 = class8.field139 + class69.field1293;
        if (class190.field3507 > class126.field2409) {
            class190.field3507 = class126.field2409;
        }
        class222.field4124 = class92.field1722 + class69.field1293;
        if (class222.field4124 > class181.field3357) {
            class222.field4124 = class181.field3357;
        }
        class13.method110();
        class192.field3540 = 0;
        for (int var6 = class57.field1076; var6 < class184.field3411; var6++) {
            class121[][] var31 = class204.field3800[var6];
            for (int var32 = class18.field438; var32 < class190.field3507; var32++) {
                for (int var33 = class187.field3475; var33 < class222.field4124; var33++) {
                    class121 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field2292 <= arg5 && (class213.field3961[var32 + class69.field1293 - class8.field139][var33 + class69.field1293 - class92.field1722] || class80.field1544[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field2295 = true;
                            var34.field2308 = true;
                            if (var34.field2299 > 0) {
                                var34.field2290 = true;
                            } else {
                                var34.field2290 = false;
                            }
                            class192.field3540++;
                        } else {
                            var34.field2295 = false;
                            var34.field2308 = false;
                            var34.field2286 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class57.field1076; var7 < class184.field3411; var7++) {
            class121[][] var20 = class204.field3800[var7];
            for (int var21 = -class69.field1293; var21 <= 0; var21++) {
                int var22 = class8.field139 + var21;
                int var23 = class8.field139 - var21;
                if (var22 >= class18.field438 || var23 < class190.field3507) {
                    for (int var24 = -class69.field1293; var24 <= 0; var24++) {
                        int var25 = class92.field1722 + var24;
                        int var26 = class92.field1722 - var24;
                        if (var22 >= class18.field438) {
                            if (var25 >= class187.field3475) {
                                class121 var27 = var20[var22][var25];
                                if (var27 != null && var27.field2295) {
                                    class203.method1294(var27, true);
                                }
                            }
                            if (var26 < class222.field4124) {
                                class121 var28 = var20[var22][var26];
                                if (var28 != null && var28.field2295) {
                                    class203.method1294(var28, true);
                                }
                            }
                        }
                        if (var23 < class190.field3507) {
                            if (var25 >= class187.field3475) {
                                class121 var29 = var20[var23][var25];
                                if (var29 != null && var29.field2295) {
                                    class203.method1294(var29, true);
                                }
                            }
                            if (var26 < class222.field4124) {
                                class121 var30 = var20[var23][var26];
                                if (var30 != null && var30.field2295) {
                                    class203.method1294(var30, true);
                                }
                            }
                        }
                        if (class192.field3540 == 0) {
                            class130.field2529 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class57.field1076; var8 < class184.field3411; var8++) {
            class121[][] var9 = class204.field3800[var8];
            for (int var10 = -class69.field1293; var10 <= 0; var10++) {
                int var11 = class8.field139 + var10;
                int var12 = class8.field139 - var10;
                if (var11 >= class18.field438 || var12 < class190.field3507) {
                    for (int var13 = -class69.field1293; var13 <= 0; var13++) {
                        int var14 = class92.field1722 + var13;
                        int var15 = class92.field1722 - var13;
                        if (var11 >= class18.field438) {
                            if (var14 >= class187.field3475) {
                                class121 var16 = var9[var11][var14];
                                if (var16 != null && var16.field2295) {
                                    class203.method1294(var16, false);
                                }
                            }
                            if (var15 < class222.field4124) {
                                class121 var17 = var9[var11][var15];
                                if (var17 != null && var17.field2295) {
                                    class203.method1294(var17, false);
                                }
                            }
                        }
                        if (var12 < class190.field3507) {
                            if (var14 >= class187.field3475) {
                                class121 var18 = var9[var12][var14];
                                if (var18 != null && var18.field2295) {
                                    class203.method1294(var18, false);
                                }
                            }
                            if (var15 < class222.field4124) {
                                class121 var19 = var9[var12][var15];
                                if (var19 != null && var19.field2295) {
                                    class203.method1294(var19, false);
                                }
                            }
                        }
                        if (class192.field3540 == 0) {
                            class130.field2529 = false;
                            return;
                        }
                    }
                }
            }
        }
        class130.field2529 = false;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method916(byte arg0, int arg1) {
        if (arg0 != -3) {
            method918(-15, null, null, null);
        }
        field2780++;
        if (arg1 == 100 && class214.field3970 > 0) {
            byte[] var2 = class166.field3176[--class214.field3970];
            class166.field3176[class214.field3970] = null;
            return var2;
        } else if (arg1 == 5000 && class200.field3646 > 0) {
            byte[] var3 = class137.field2660[--class200.field3646];
            class137.field2660[class200.field3646] = null;
            return var3;
        } else if (arg1 == 30000 && class98.field1852 > 0) {
            byte[] var4 = class209.field3877[--class98.field1852];
            class209.field3877[class98.field1852] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)I")
    public static final int method917(int arg0, int arg1) {
        field2782++;
        if (arg1 >= 65 && arg1 <= 90 || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg0 == 0) {
            return arg1 == 140 ? 156 : arg1;
        } else {
            return 50;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILab;Lab;Lab;)V")
    public static final void method918(int arg0, class3 arg1, class3 arg2, class3 arg3) {
        field2785++;
        class51.field983 = arg2;
        class78.field1496 = arg1;
        if (arg0 == -28468) {
            class222.field4131 = arg3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static void method919(boolean arg0) {
        field2784 = null;
        field2781 = null;
        if (!arg0) {
            field2784 = null;
        }
    }
}
