import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class246 {

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field3828 = 20;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field3826 = 0;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field3836 = 0;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3837 = " ";

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lwi;")
    public static class192 field3835;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method1683(int arg0, int arg1) {
        field3825++;
        class105 var2 = class9.method72(arg0, -1, arg1);
        var2.method764((byte) 11);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    public static final void method1684(boolean arg0) {
        class165.field2426 = 0;
        field3824++;
        class213.field3277 = 0;
        class269.method1812(28532);
        class7.method65((byte) -115);
        class87.method661((byte) 25);
        if (arg0) {
            return;
        }
        class4.method46(-84);
        for (int var1 = 0; var1 < class213.field3277; var1++) {
            int var3 = class83.field1279[var1];
            if (class120.field1794 != class166.field2438[var3].field486) {
                if (class166.field2438[var3].field3498 > 0) {
                    class142.method958(-86, class166.field2438[var3]);
                }
                class166.field2438[var3] = null;
            }
        }
        if (class45.field784 != class173.field2543.field887) {
            throw new RuntimeException("gpp1 pos:" + class173.field2543.field887 + " psize:" + class45.field784);
        }
        for (int var2 = 0; var2 < class266.field4155; var2++) {
            if (class166.field2438[class205.field3068[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class266.field4155);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;IJLjava/lang/String;ISIZ)V")
    public static final void method1685(String arg0, int arg1, long arg2, String arg3, int arg4, short arg5, int arg6, boolean arg7) {
        if (!arg7) {
            method1691(-103, (class54) null);
        }
        field3829++;
        if (class66.field1093 || class51.field826 >= 500) {
            return;
        }
        class179.field2614[class51.field826] = arg3;
        class280.field4297[class51.field826] = arg0;
        class186.field2708[class51.field826] = arg6 == -1 ? class181.field2642 : arg6;
        class265.field4147[class51.field826] = arg5;
        class84.field1294[class51.field826] = arg2;
        class260.field4000[class51.field826] = arg1;
        class8.field96[class51.field826] = arg4;
        class51.field826++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method1686(int arg0) {
        field3837 = null;
        int var1 = -28 / ((-arg0 - 12) / 39);
        field3835 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method1687(int arg0) {
        field3834++;
        for (int var1 = arg0; var1 < class266.field4155; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class205.field3068[var1];
            }
            class224 var6 = class166.field2438[var5];
            if (var6 != null && var6.field451 > 0) {
                var6.field451--;
                if (var6.field451 == 0) {
                    var6.field429 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class207.field3093; var2++) {
            int var3 = class285.field4379[var2];
            class87 var4 = class243.field3762[var3];
            if (var4 != null && var4.field451 > 0) {
                var4.field451--;
                if (var4.field451 == 0) {
                    var4.field429 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method1688(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 127) {
            field3826 = -128;
        }
        field3831++;
        if (arg0 == arg4 && arg1 == arg5 && arg8 == arg9 && arg6 == arg7) {
            class233.method1585(false, arg2, arg8, arg5, arg6, arg0);
            return;
        }
        int var10 = arg0;
        int var11 = arg5 * 3;
        int var12 = arg0 * 3;
        int var13 = arg5;
        int var14 = arg4 * 3;
        int var15 = arg1 * 3;
        int var16 = arg9 * 3;
        int var17 = arg7 * 3;
        int var18 = arg6 + var15 - arg5 - var17;
        int var19 = arg8 - var16 - (-var14 + arg0);
        int var20 = var17 - (var15 - var11) - var15;
        int var21 = var16 + var12 - var14 - var14;
        int var22 = var14 - var12;
        int var23 = var15 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var20 * var25;
            int var29 = var21 * var25;
            int var30 = var22 * var24;
            int var31 = var18 * var26;
            int var32 = (var27 + var29 + var30 >> 12) + arg0;
            int var33 = var23 * var24;
            int var34 = (var28 + var31 + var33 >> 12) + arg5;
            class233.method1585(false, arg2, var32, var13, var34, var10);
            var13 = var34;
            var10 = var32;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[Ljk;)V")
    public static final void method1689(int arg0, int arg1, class297[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class297 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4553 == 0) {
                    if (var4.field4646 != null) {
                        method1689(-1, arg1, var4.field4646);
                    }
                    class123 var5 = (class123) class124.field1833.method306((long) var4.field4683, 16216);
                    if (var5 != null) {
                        class188.method1241((byte) 61, arg1, var5.field1823);
                    }
                }
                if (arg1 == 0 && var4.field4674 != null) {
                    class43 var6 = new class43();
                    var6.field767 = var4.field4674;
                    var6.field750 = var4;
                    class137.method934(200000, var6);
                }
                if (arg1 == 1 && var4.field4648 != null) {
                    if (var4.field4528 >= 0) {
                        class297 var7 = class151.method1023(-30464, var4.field4683);
                        if (var7 == null || var7.field4646 == null || var7.field4646.length <= var4.field4528 || var7.field4646[var4.field4528] != var4) {
                            continue;
                        }
                    }
                    class43 var8 = new class43();
                    var8.field767 = var4.field4648;
                    var8.field750 = var4;
                    class137.method934(200000, var8);
                }
            }
        }
        if (arg0 != -1) {
            method1689(29, 47, (class297[]) null);
        }
        field3822++;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public static final void method1690(boolean arg0) {
        field3830++;
        if (arg0) {
            field3835 = null;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class66.method529(var3, true, var2, class3.field40, var1, false)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILca;)V")
    public static final void method1691(int arg0, class54 arg1) {
        field3827++;
        int var2 = class200.field3007 >> 1;
        int var3 = class211.field3157 >> 2 << 10;
        byte[][] var4 = new byte[class133.field1956][class235.field3619];
        while (arg1.field887 < arg1.field848.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method407(255) == 1) {
                var33 = true;
                var34 = arg1.method407(255);
                var35 = arg1.method407(255);
            }
            int var36 = arg1.method407(255);
            int var37 = arg1.method407(255);
            int var38 = class67.field1114 + class235.field3619 - (var37 * 64) - 1;
            int var39 = var36 * 64 - class141.field2029;
            if (var39 >= 0 && (var38 - 63) >= 0 && (var39 + 63) < class133.field1956 && var38 < class235.field3619) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var34 * 8 <= var40 && (var34 * 8 + 8) > var40 && (var35 * 8) <= var42 && var42 < (var35 * 8 + 8)) {
                            var41[var38 - var42] = arg1.method459(false);
                        }
                    }
                }
            } else if (var33) {
                arg1.field887 += 64;
            } else {
                arg1.field887 += 4096;
            }
        }
        int var5 = class133.field1956;
        int var6 = class235.field3619;
        int[] var7 = new int[var6];
        if (arg0 != 0) {
            field3826 = -91;
        }
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class131 var29 = class122.method864(var28 - 1, 3);
                        var7[var13] += var29.field1929;
                        var9[var13] += var29.field1938;
                        var8[var13] += var29.field1940;
                        var10[var13] += var29.field1925;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class131 var32 = class122.method864(var31 - 1, 3);
                        var7[var13] -= var32.field1929;
                        var9[var13] -= var32.field1938;
                        var8[var13] -= var32.field1940;
                        var10[var13] -= var32.field1925;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class77.field1218[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var17 += var10[var21];
                        var18 += var11[var21];
                        var16 += var9[var21];
                        var15 += var7[var21];
                        var19 += var8[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var17 -= var10[var22];
                        var18 -= var11[var22];
                        var19 -= var8[var22];
                        var16 -= var9[var22];
                        var15 -= var7[var22];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class285.method1896(var15 * 256 / var17, var16 / var18, var19 / var18, arg0 ^ 0xFFFFE9B6);
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
                            var23[(class131.method904(63, var20) << 6) + class131.method904(var12, 63)] = class119.field1786[class107.method776(-70, var26, 96)];
                        } else if (var23 != null) {
                            var23[class131.method904(var20 << 6, 4032) + class131.method904(var12, 63)] = 0;
                        }
                    }
                }
            }
        }
    }
}
