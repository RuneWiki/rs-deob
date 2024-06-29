import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class208 {

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lsc;")
    private static class181 field3566 = class149.method967(255, "Take");

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lsc;")
    public static class181 field3568 = null;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lsc;")
    private static class181 field3565 = class149.method967(255, " from your friend list first)3");

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lsc;")
    public static class181 field3575 = field3566;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lsc;")
    public static class181 field3564 = field3565;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lsc;")
    public static class181 field3576 = class149.method967(255, "");

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[[Lo;")
    public static class175[][] field3563;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Laf;")
    public class208 method371(int arg0, int arg1, int arg2) {
        field3570++;
        return this;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
    public static final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class124.field2032 = arg4;
        class125.field2056 = arg2;
        class11.field219 = arg0;
        field3560++;
        if (arg3 != 0) {
            method1384(-100, 7, -51, -74, 101, (byte) -51, 74);
        }
        class23.field408 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB[B)I")
    public static final int method1380(int arg0, int arg1, byte arg2, byte[] arg3) {
        int var4 = -1;
        if (arg2 != 21) {
            field3575 = null;
        }
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = class7.field128[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
        }
        field3567++;
        return ~var4;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIII)V")
    public void method636(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 17855) {
            field3559 = 102;
        }
        field3572++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Laf;IIIZ)V")
    public void method355(class208 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3571++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()I")
    public abstract int method190();

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field3565 = null;
        field3564 = null;
        field3563 = null;
        field3566 = null;
        field3568 = null;
        field3575 = null;
        if (arg0 >= 81) {
            field3576 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILjb;)Ltg;")
    public static final class107 method1382(int arg0, int arg1, int arg2, class11 arg3) {
        field3561++;
        if (arg1 == 127) {
            return class242.method1646(arg0, (byte) -64, arg3, arg2) ? class20.method187((byte) 126) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lvf;I)V")
    public static final void method1383(class230 arg0, int arg1) {
        field3569++;
        int var2 = class23.field399 >> 1;
        int var3 = class259.field4528 >> 2 << 10;
        byte[][] var4 = new byte[class62.field967][class222.field3840];
        while (arg0.field3977.length > arg0.field3933) {
            int var33 = 0;
            boolean var34 = false;
            int var35 = 0;
            if (arg0.method1516((byte) 82) == 1) {
                var33 = arg0.method1516((byte) 82);
                var34 = true;
                var35 = arg0.method1516((byte) 82);
            }
            int var36 = arg0.method1516((byte) 82);
            int var37 = arg0.method1516((byte) 82);
            int var38 = class164.field2786 + class222.field3840 - (var37 * 64) - 1;
            int var39 = var36 * 64 - class265.field4625;
            if (var39 >= 0 && (var38 - 63) >= 0 && (var39 + 63) < class62.field967 && var38 < class222.field3840) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var34 || var33 * 8 <= var40 && var40 < (var33 * 8 + 8) && var35 * 8 <= var42 && var42 < var35 * 8 + 8) {
                            var41[var38 - var42] = arg0.method1563(arg1 - 255688184);
                        }
                    }
                }
            } else if (var34) {
                arg0.field3933 += 64;
            } else {
                arg0.field3933 += 4096;
            }
        }
        int var5 = class62.field967;
        int var6 = class222.field3840;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        int var12 = -5;
        if (arg1 != 0) {
            method1383((class230) null, -37);
        }
        while (var12 < var5) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class52 var29 = class95.method627(8741, var28 - 1);
                        var7[var13] += var29.field833;
                        var8[var13] += var29.field820;
                        var10[var13] += var29.field831;
                        var9[var13] += var29.field829;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class52 var32 = class95.method627(8741, var31 - 1);
                        var7[var13] -= var32.field833;
                        var8[var13] -= var32.field820;
                        var10[var13] -= var32.field831;
                        var9[var13] -= var32.field829;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class262.field4563[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 - 5;
                    int var22 = var20 + 5;
                    if (var22 < var6) {
                        var18 += var9[var22];
                        var16 += var8[var22];
                        var19 += var11[var22];
                        var15 += var7[var22];
                        var17 += var10[var22];
                    }
                    if (var21 >= 0) {
                        var16 -= var8[var21];
                        var17 -= var10[var21];
                        var18 -= var9[var21];
                        var15 -= var7[var21];
                        var19 -= var11[var21];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class256.method1745(4, var17 / var19, var15 * 256 / var18, var16 / var19);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var3 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class5.method43(4032, var20 << 6) + class5.method43(var12, 63)] = class72.field1148[class7.method55((byte) 122, 96, var26)];
                        } else if (var23 != null) {
                            var23[class5.method43(63, var12) + (class5.method43(var20, 63) << 6)] = 0;
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()Z")
    public boolean method365() {
        field3577++;
        return false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class216.field3710 == 0 && !class220.field3781) {
            class128.field2112++;
            int var7 = class46.field729;
            int var8 = class200.field3457;
            int var9 = class215.field3697;
            int var10 = class106.field1724;
            int var11 = (arg2 - arg4) * (var8 - var7) / arg6 + var7;
            int var12 = (var10 - var9) * (arg3 - arg1) / arg0 + var9;
            class199.method1348(class241.field4187, true, var12, (short) 20, var11, 0L, class161.field2744);
        }
        field3573++;
        if (arg5 >= -115) {
            return;
        }
        long var13 = -1L;
        for (int var15 = 0; var15 < class19.field341; var15++) {
            long var16 = class242.field4211[var15];
            int var18 = (int) var16 & 0x7F;
            int var19 = (int) var16 >> 7 & 0x7F;
            int var20 = (int) var16 >> 29 & 0x3;
            int var21 = (int) (var16 >>> 32) & Integer.MAX_VALUE;
            if (var13 != var16) {
                var13 = var16;
                if (var20 == 2 && class11.method105(class38.field581, var18, var19, var16)) {
                    class148 var22 = class62.method442((byte) 79, var21);
                    if (var22.field2446 != null) {
                        var22 = var22.method966((byte) 123);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class216.field3710 == 1) {
                        class18.field323++;
                        class199.method1348(class175.method1164(new class181[] { field3568, class62.field968, var22.field2418 }, (byte) 124), true, var19, (short) 43, var18, var16, class52.field830);
                    } else if (!class220.field3781) {
                        class30.field493++;
                        class181[] var23 = var22.field2430;
                        if (class73.field1170) {
                            var23 = class149.method971((byte) -122, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    short var25 = 0;
                                    class194.field3394++;
                                    if (var24 == 0) {
                                        var25 = 28;
                                    }
                                    if (var24 == 1) {
                                        var25 = 6;
                                    }
                                    if (var24 == 2) {
                                        var25 = 24;
                                    }
                                    if (var24 == 3) {
                                        var25 = 34;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1006;
                                    }
                                    class199.method1348(class175.method1164(new class181[] { class67.field1084, var22.field2418 }, (byte) 123), true, var19, var25, var18, var16, var23[var24]);
                                }
                            }
                        }
                        class199.method1348(class175.method1164(new class181[] { class67.field1084, var22.field2418 }, (byte) 126), true, var19, (short) 1005, var18, (long) var22.field2431, class20.field353);
                    } else if ((class121.field1974 & 0x4) == 4) {
                        class199.method1348(class175.method1164(new class181[] { class166.field2817, class62.field968, var22.field2418 }, (byte) 127), true, var19, (short) 17, var18, var16, class177.field3113);
                        class9.field183++;
                    }
                }
                if (var20 == 1) {
                    class178 var26 = class129.field2140[var21];
                    if (var26.field3117.field995 == 1 && (var26.field2654 & 0x7F) == 64 && (var26.field2681 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class137.field2237; var27++) {
                            class178 var30 = class129.field2140[class263.field4581[var27]];
                            if (var30 != null && var26 != var30 && var30.field3117.field995 == 1 && var26.field2654 == var30.field2654 && var26.field2681 == var30.field2681) {
                                class22.method201(var19, class263.field4581[var27], var30.field3117, var18, 635);
                            }
                        }
                        for (int var28 = 0; var28 < class152.field2538; var28++) {
                            class116 var29 = class39.field602[class218.field3750[var28]];
                            if (var29 != null && var26.field2654 == var29.field2654 && var26.field2681 == var29.field2681) {
                                class37.method272(class218.field3750[var28], var29, var18, 4096, var19);
                            }
                        }
                    }
                    class22.method201(var19, var21, var26.field3117, var18, 635);
                }
                if (var20 == 0) {
                    class116 var31 = class39.field602[var21];
                    if ((var31.field2654 & 0x7F) == 64 && (var31.field2681 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class137.field2237; var32++) {
                            class178 var35 = class129.field2140[class263.field4581[var32]];
                            if (var35 != null && var35.field3117.field995 == 1 && var31.field2654 == var35.field2654 && var31.field2681 == var35.field2681) {
                                class22.method201(var19, class263.field4581[var32], var35.field3117, var18, 635);
                            }
                        }
                        for (int var33 = 0; var33 < class152.field2538; var33++) {
                            class116 var34 = class39.field602[class218.field3750[var33]];
                            if (var34 != null && var31 != var34 && var31.field2654 == var34.field2654 && var31.field2681 == var34.field2681) {
                                class37.method272(class218.field3750[var33], var34, var18, 4096, var19);
                            }
                        }
                    }
                    class37.method272(var21, var31, var18, 4096, var19);
                }
                if (var20 == 3) {
                    class247 var36 = class132.field2183[class38.field581][var18][var19];
                    if (var36 != null) {
                        for (class44 var37 = (class44) var36.method1685(-231); var37 != null; var37 = (class44) var36.method1687(69)) {
                            int var38 = var37.field686.field1303;
                            class99 var39 = class237.method1620(-29539, var38);
                            if (class216.field3710 == 1) {
                                class58.field873++;
                                class199.method1348(class175.method1164(new class181[] { field3568, class159.field2724, var39.field1652 }, (byte) 126), true, var19, (short) 42, var18, (long) var38, class52.field830);
                            } else if (!class220.field3781) {
                                class74.field1179++;
                                class181[] var40 = var39.field1595;
                                if (class73.field1170) {
                                    var40 = class149.method971((byte) -112, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class20.field358++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 14;
                                        }
                                        if (var41 == 1) {
                                            var42 = 19;
                                        }
                                        if (var41 == 2) {
                                            var42 = 35;
                                        }
                                        if (var41 == 3) {
                                            var42 = 58;
                                        }
                                        if (var41 == 4) {
                                            var42 = 12;
                                        }
                                        class199.method1348(class175.method1164(new class181[] { class68.field1091, var39.field1652 }, (byte) 126), true, var19, var42, var18, (long) var38, var40[var41]);
                                    } else if (var41 == 2) {
                                        class41.field609++;
                                        class199.method1348(class175.method1164(new class181[] { class68.field1091, var39.field1652 }, (byte) 125), true, var19, (short) 35, var18, (long) var38, field3575);
                                    }
                                }
                                class199.method1348(class175.method1164(new class181[] { class68.field1091, var39.field1652 }, (byte) 125), true, var19, (short) 1007, var18, (long) var38, class20.field353);
                            } else if ((class121.field1974 & 0x1) == 1) {
                                class199.method1348(class175.method1164(new class181[] { class166.field2817, class159.field2724, var39.field1652 }, (byte) 126), true, var19, (short) 50, var18, (long) var38, class177.field3113);
                                class247.field4310++;
                            }
                        }
                    }
                }
            }
        }
    }
}
