import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class270 extends class199 {

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "[I")
    public static int[] field4199 = new int[2];

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field4209 = 0;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field4194 = -1;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Lba;")
    public static class53 field4204 = new class53(64);

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public int field4202;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public int field4212;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "[Z")
    public static boolean[] field4200;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "[[B")
    public static byte[][] field4197;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "[[[I")
    public static int[][][] field4210;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V", line = 8)
    public final void method1856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field4201 << 3;
        field4208++;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field4211 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method628(var8, var6, var9, var7, arg1, arg3);
        if (arg0 > -117) {
            field4210 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)Lne;", line = 35)
    public static final class88 method1857(byte arg0) {
        field4196++;
        if (arg0 != -62) {
            return (class88) null;
        }
        try {
            return (class88) Class.forName("hd").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class269();
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILtb;II)V", line = 53)
    public static final void method1858(int arg0, int arg1, class220 arg2, int arg3, int arg4) {
        class170.method1225((byte) -97);
        if (class94.field1516) {
            class167.method1187(arg0, arg4, arg0 + arg2.field3526, arg2.field3458 + arg4);
        } else {
            class109.method806(arg0, arg4, arg2.field3526 + arg0, arg4 - -arg2.field3458);
        }
        field4203++;
        if (class202.field3035 != 2 && class202.field3035 != 5 && class268.field4181 != null) {
            int var5 = 464 - class98.field1566.field1868 / 32;
            int var6 = (int) class259.field4063 + class345.field5354 & 0x7FF;
            int var7 = class98.field1566.field1905 / 32 + 48;
            if (class94.field1516) {
                ((class86) class268.field4181).method618(arg0, arg4, arg2.field3526, arg2.field3458, var7, var5, var6, class254.field3995 + 256, (class86) arg2.method1551(arg1 + 22564, false));
            } else {
                ((class249) class268.field4181).method1723(arg0, arg4, arg2.field3526, arg2.field3458, var7, var5, var6, class254.field3995 + 256, arg2.field3486, arg2.field3420);
            }
            if (class80.field1266 != null) {
                for (int var8 = 0; var8 < class80.field1266.field4696; var8++) {
                    if (class80.field1266.method2045(var8, arg1 ^ 0xFFFFDB55)) {
                        int var9 = (((class80.field1266.field4698[var8] & 0xFFFE7EC) >> 14) - class213.field3249) * 4 + 2 - (class98.field1566.field1905 / 32);
                        int var10 = class15.field204[var6];
                        int var11 = var10 * 256 / (class254.field3995 + 256);
                        int var12 = ((class80.field1266.field4698[var8] & 0x3FFF) - class342.field5328) * 4 + 2 - (class98.field1566.field1868 / 32);
                        int var13 = class15.field216[var6];
                        int var14 = var13 * 256 / (class254.field3995 + 256);
                        int var15 = var9 * var14 + var11 * var12 >> 16;
                        int var16 = var12 * var14 - var9 * var11 >> 16;
                        class329 var17 = class112.field1736;
                        if (class80.field1266.method2047(var8, (byte) -121) == 1) {
                            var17 = class233.field3723;
                        }
                        if (class80.field1266.method2047(var8, (byte) -121) == 2) {
                            var17 = class344.field5343;
                        }
                        int var18 = var17.method2238(class80.field1266.field4693[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg2.field3526 <= var19 && var19 <= arg2.field3526 && -arg2.field3458 <= var16 && var16 <= arg2.field3458) {
                            int var20 = 16777215;
                            if (class80.field1266.field4690[var8] != -1) {
                                var20 = class80.field1266.field4690[var8];
                            }
                            if (class94.field1516) {
                                class167.method1202((class86) arg2.method1551(arg1 + 22564, false));
                            } else {
                                class109.method814(arg2.field3486, arg2.field3420);
                            }
                            var17.method2239(class80.field1266.field4693[var8], arg2.field3526 / 2 + arg0 + var19, arg4 - -(arg2.field3458 / 2) - var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class94.field1516) {
                                class167.method1195();
                            } else {
                                class109.method820();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class306.field4763; var21++) {
                int var22 = class115.field1771[var21] * 4 + 2 - class98.field1566.field1905 / 32;
                int var23 = class272.field4225[var21] * 4 + 2 - (class98.field1566.field1868 / 32);
                class85 var24 = class201.method1431(arg1 ^ 0x587E, class259.field4060[var21]);
                if (var24.field1375 != null) {
                    var24 = var24.method598((byte) -80);
                    if (var24 == null || var24.field1326 == -1) {
                        continue;
                    }
                }
                class295.method2010(var22, var23, class17.field242[var24.field1326], (byte) 22, arg4, arg2, arg0);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class87 var27 = class280.field4315[class205.field3101][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class98.field1566.field1905 / 32);
                        int var29 = var26 * 4 + 2 - class98.field1566.field1868 / 32;
                        class295.method2010(var28, var29, class288.field4493[0], (byte) 22, arg4, arg2, arg0);
                    }
                }
            }
            for (int var30 = 0; var30 < class312.field4839; var30++) {
                class313 var31 = class254.field3989[class325.field5049[var30]];
                if (var31 != null && var31.method278(-5324)) {
                    class206 var32 = var31.field4859;
                    if (var32 != null && var32.field3120 != null) {
                        var32 = var32.method1465(118);
                    }
                    if (var32 != null && var32.field3159 && var32.field3126) {
                        int var33 = var31.field1905 / 32 - (class98.field1566.field1905 / 32);
                        int var34 = var31.field1868 / 32 - (class98.field1566.field1868 / 32);
                        if (var32.field3114 == -1) {
                            class295.method2010(var33, var34, class288.field4493[1], (byte) 22, arg4, arg2, arg0);
                        } else {
                            class295.method2010(var33, var34, class17.field242[var32.field3114], (byte) 22, arg4, arg2, arg0);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class310.field4816; var35++) {
                class33 var36 = class254.field3992[class103.field1606[var35]];
                if (var36 != null && var36.method278(-5324)) {
                    int var37 = var36.field1905 / 32 - (class98.field1566.field1905 / 32);
                    boolean var38 = false;
                    int var39 = var36.field1868 / 32 - class98.field1566.field1868 / 32;
                    long var40 = class128.method926(var36.field477, (byte) -100);
                    for (int var42 = 0; var42 < class225.field3579; var42++) {
                        if (class35.field549[var42] == var40 && class148.field2252[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class304.field4756; var44++) {
                        if (class234.field3739[var44].field758 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class98.field1566.field484 != 0 && var36.field484 != 0 && class98.field1566.field484 == var36.field484) {
                        var45 = true;
                    }
                    if (var38) {
                        class295.method2010(var37, var39, class288.field4493[3], (byte) 22, arg4, arg2, arg0);
                    } else if (var43) {
                        class295.method2010(var37, var39, class288.field4493[5], (byte) 22, arg4, arg2, arg0);
                    } else if (var45) {
                        class295.method2010(var37, var39, class288.field4493[4], (byte) 22, arg4, arg2, arg0);
                    } else {
                        class295.method2010(var37, var39, class288.field4493[2], (byte) 22, arg4, arg2, arg0);
                    }
                }
            }
            class235[] var46 = class75.field1216;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class235 var48 = var46[var47];
                if (var48 != null && var48.field3761 != 0 && class227.field3618 % 20 < 10) {
                    if (var48.field3761 == 1 && var48.field3757 >= 0 && class254.field3989.length > var48.field3757) {
                        class313 var49 = class254.field3989[var48.field3757];
                        if (var49 != null) {
                            int var50 = var49.field1868 / 32 - (class98.field1566.field1868 / 32);
                            int var51 = var49.field1905 / 32 - (class98.field1566.field1905 / 32);
                            class294.method2005(arg2, var51, var48.field3752, 360000, arg0, (byte) -6, var50, arg4);
                        }
                    }
                    if (var48.field3761 == 2) {
                        int var52 = (var48.field3748 - class342.field5328) * 4 + 2 - (class98.field1566.field1868 / 32);
                        int var53 = (var48.field3746 - class213.field3249) * 4 + 2 - (class98.field1566.field1905 / 32);
                        int var54 = var48.field3754 * 4;
                        int var55 = var54 * var54;
                        class294.method2005(arg2, var53, var48.field3752, var55, arg0, (byte) -6, var52, arg4);
                    }
                    if (var48.field3761 == 10 && var48.field3757 >= 0 && var48.field3757 < class254.field3992.length) {
                        class33 var56 = class254.field3992[var48.field3757];
                        if (var56 != null) {
                            int var57 = var56.field1905 / 32 - (class98.field1566.field1905 / 32);
                            int var58 = var56.field1868 / 32 - class98.field1566.field1868 / 32;
                            class294.method2005(arg2, var57, var48.field3752, 360000, arg0, (byte) -6, var58, arg4);
                        }
                    }
                }
            }
            if (class130.field2042 != 0) {
                int var59 = class130.field2042 * 4 + (class98.field1566.method280(false) + -1) * 2 + 2 - (class98.field1566.field1905 / 32);
                int var60 = class91.field1450 * 4 + (-(class98.field1566.field1868 / 32) - -((class98.field1566.method280(false) - 1) * 2)) + 2;
                class295.method2010(var59, var60, class226.field3593, (byte) 22, arg4, arg2, arg0);
            }
            if (class94.field1516) {
                class167.method1186(arg2.field3526 / 2 + arg0 - 1, arg2.field3458 / 2 + arg4 + -1, 3, 3, 16777215);
            } else {
                class109.method812(arg2.field3526 / 2 + arg0 - 1, arg2.field3458 / 2 + arg4 + -1, 3, 3, 16777215);
            }
        } else if (class94.field1516) {
            class270 var61 = arg2.method1551(2, false);
            if (var61 != null) {
                var61.method617(arg0, arg4);
            }
        } else {
            class109.method807(arg0, arg4, 0, arg2.field3486, arg2.field3420);
        }
        if (arg1 != -22562) {
            field4200 = (boolean[]) null;
        }
        class240.field3831[arg3] = true;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIIII)V", line = 401)
    public static final void method1859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4198++;
        class272.method1876(class34.field525[arg4], arg0 + arg2, -arg2 + arg0, arg3, (byte) -75);
        int var5 = 0;
        int var6 = -61 % ((arg1 + 37) / 42);
        int var7 = arg2;
        int var8 = -1;
        int var9 = -arg2;
        while (var5 < var7) {
            var5++;
            var8 += 2;
            var9 += var8;
            if (var9 >= 0) {
                var7--;
                var9 -= var7 << 1;
                int[] var10 = class34.field525[arg4 + var7];
                int[] var11 = class34.field525[arg4 - var7];
                int var12 = arg0 - var5;
                int var13 = arg0 + var5;
                class272.method1876(var10, var13, var12, arg3, (byte) -69);
                class272.method1876(var11, var13, var12, arg3, (byte) -55);
            }
            int var14 = arg0 - var7;
            int[] var15 = class34.field525[arg4 + var5];
            int var16 = arg0 + var7;
            int[] var17 = class34.field525[arg4 - var5];
            class272.method1876(var15, var16, var14, arg3, (byte) -57);
            class272.method1876(var17, var16, var14, arg3, (byte) -9);
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(II)I", line = 472)
    public static int method1860(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 485)
    public static final void method1861(byte arg0) {
        if (arg0 > -3) {
            return;
        }
        field4205++;
        if (class131.field2052 == 10 && class94.field1516) {
            class88.method640(28, (byte) 49);
        }
        if (class131.field2052 == 30) {
            class88.method640(25, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V", line = 504)
    public static void method1862(byte arg0) {
        if (arg0 != -45) {
            method1861((byte) 5);
        }
        field4200 = null;
        field4199 = null;
        field4204 = null;
        field4197 = (byte[][]) null;
        field4210 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)Lrd;", line = 530)
    public static final class225 method1863(int arg0, int arg1, int arg2) {
        class225 var3 = new class225();
        for (class2 var4 = (class2) class71.field1172.method1228(true); var4 != null; var4 = (class2) class71.field1172.method1223((byte) 13)) {
            if (var4.field41 && var4.method15(arg1, arg2, (byte) -125)) {
                var3.method1595(true, var4);
            }
        }
        field4195++;
        if (arg0 == 32) {
            return var3;
        } else {
            return (class225) null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V")
    public abstract void method617(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
    public abstract void method620(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)V")
    public abstract void method616(int arg0, int arg1);

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(IIIII)V")
    public abstract void method629(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
    public abstract void method624(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(II)V")
    public abstract void method625(int arg0, int arg1);
}
