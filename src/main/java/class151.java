import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class151 extends class73 {

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[I")
    public static int[] field2133 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "[I")
    public static int[] field2143 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[Ljm;")
    public static class411[] field2137 = new class411[14];

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "C")
    public char field2136;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "J")
    public long field2151;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "Lfc;")
    public static class141 field2147;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "Lcl;")
    public static class145 field2156;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "Lgf;")
    public class151 field2155;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "Z")
    public boolean field2152;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static final void method1020(int arg0) {
        field2141++;
        if (class18.field320 && class203.field2790.method1872(81, arg0 + 4466) && class90.field1260 > 2) {
            class19.method267((class87) class121.field1699.field1267.field5601.field5601, 0);
        } else {
            class19.method267((class87) class121.field1699.field1267.field5601, 0);
        }
        if (arg0 != -3) {
            method1030(4, 123, 85, 60, -128, 61, 30, 77, 42, 85);
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
    public static final void method1021(int arg0) {
        field2142++;
        if (arg0 != 14) {
            field2147 = null;
        }
        for (class380 var1 = (class380) class24.field414.method646(48); var1 != null; var1 = (class380) class24.field414.method641(false)) {
            if (var1.field5416 == -1) {
                var1.field5418 = 0;
                class94.method668(var1, -72);
            } else {
                var1.method2467((byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2146++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg3 * arg3;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = 49 / ((22 - arg1) / 43);
        int var20 = (var6 + 1) * var16;
        if (arg0 >= class290.field4058 && arg0 <= class442.field6212) {
            int var21 = class302.method1951(class154.field2161, 0, arg3 + arg5, class233.field3350);
            int var22 = class302.method1951(class154.field2161, 0, arg5 - arg3, class233.field3350);
            class295.method1924(3289650, class296.field4138[arg0], var21, arg4, var22);
        }
        int var23 = (arg2 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var20;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var20 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var20;
                var13 += var17;
                var17 += var16;
                var20 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var23;
            var18 -= var15;
            var23 -= var15;
            var7--;
            int var24 = arg0 - var7;
            int var25 = arg0 + var7;
            if (class290.field4058 <= var25 && var24 <= class442.field6212) {
                int var26 = class302.method1951(class154.field2161, 0, arg5 + var6, class233.field3350);
                int var27 = class302.method1951(class154.field2161, 0, arg5 - var6, class233.field3350);
                if (class290.field4058 <= var24) {
                    class295.method1924(3289650, class296.field4138[var24], var26, arg4, var27);
                }
                if (var25 <= class442.field6212) {
                    class295.method1924(3289650, class296.field4138[var25], var26, arg4, var27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static final void method1023(byte arg0) {
        class74.field1049 = null;
        if (arg0 > -52) {
            method1020(59);
        }
        class175.field2393 = null;
        class304.field4201 = null;
        field2144++;
        class20.field370 = null;
        class243.field3447 = null;
        class437.field6148 = false;
        class386.method2450((byte) -38);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIII)V")
    public static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            return;
        }
        field2138++;
        class239 var5 = class436.method2740(10, arg2, -323285792);
        var5.method1622(-105);
        var5.field3397 = arg4;
        var5.field3399 = arg1;
        var5.field3408 = arg3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)J")
    public final long method545(int arg0) {
        if (arg0 != 200) {
            this.field2151 = 96L;
        }
        field2134++;
        return this.field2151;
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public static void method1025(int arg0) {
        field2133 = null;
        field2147 = null;
        field2137 = null;
        if (arg0 != -18091) {
            method1022(-18, -19, -70, 119, 68, -24);
        }
        field2143 = null;
        field2156 = null;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
    public static final void method1026(byte arg0) {
        int var1 = 116 % ((18 - arg0) / 38);
        field2148++;
        if (class175.field2395.length() == 0) {
            return;
        }
        class418.method2626(5998, "--> " + class175.field2395);
        class233.method1596(114, false, class175.field2395);
        class175.field2395 = "";
        class91.field1278 = 0;
        class387.field5552 = 0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
    public static final void method1027() {
        class146.field2081 = 0;
        label191: for (int var0 = 0; var0 < class269.field3749; var0++) {
            class59 var1 = class362.field5029[var0];
            if (class382.field5463 != null) {
                for (int var2 = 0; var2 < class382.field5463.length; var2++) {
                    if (class382.field5463[var2] != -1000000 && (var1.field795 <= class382.field5463[var2] || var1.field805 <= class382.field5463[var2]) && (var1.field804 <= class384.field5523[var2] || var1.field798 <= class384.field5523[var2]) && (var1.field804 >= class108.field1563[var2] || var1.field798 >= class108.field1563[var2]) && (var1.field806 <= class348.field4772[var2] || var1.field807 <= class348.field4772[var2]) && (var1.field806 >= class139.field1996[var2] || var1.field807 >= class139.field1996[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field794 == 1) {
                int var3 = var1.field787 + class305.field4213 - class357.field4890;
                if (var3 >= 0 && var3 <= class305.field4213 + class305.field4213) {
                    int var4 = var1.field788 + class305.field4213 - class405.field5768;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field797 + class305.field4213 - class405.field5768;
                    if (var5 > class305.field4213 + class305.field4213) {
                        var5 = class305.field4213 + class305.field4213;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class194.field2654[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class17.field313 - var1.field804;
                        if (var7 > 32) {
                            var1.field792 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field792 = 2;
                            var7 = -var7;
                        }
                        var1.field785 = (var1.field806 - class247.field3494 << 8) / var7;
                        var1.field791 = (var1.field807 - class247.field3494 << 8) / var7;
                        var1.field799 = (var1.field795 - class9.field168 << 8) / var7;
                        var1.field811 = (var1.field805 - class9.field168 << 8) / var7;
                        class131.field1865[class146.field2081++] = var1;
                    }
                }
            } else if (var1.field794 == 2) {
                int var8 = var1.field788 + class305.field4213 - class405.field5768;
                if (var8 >= 0 && var8 <= class305.field4213 + class305.field4213) {
                    int var9 = var1.field787 + class305.field4213 - class357.field4890;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field796 + class305.field4213 - class357.field4890;
                    if (var10 > class305.field4213 + class305.field4213) {
                        var10 = class305.field4213 + class305.field4213;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class194.field2654[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class247.field3494 - var1.field806;
                        if (var12 > 32) {
                            var1.field792 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field792 = 4;
                            var12 = -var12;
                        }
                        var1.field803 = (var1.field804 - class17.field313 << 8) / var12;
                        var1.field793 = (var1.field798 - class17.field313 << 8) / var12;
                        var1.field799 = (var1.field795 - class9.field168 << 8) / var12;
                        var1.field811 = (var1.field805 - class9.field168 << 8) / var12;
                        class131.field1865[class146.field2081++] = var1;
                    }
                }
            } else if (var1.field794 == 4) {
                int var13 = var1.field795 - class9.field168;
                if (var13 > 128) {
                    int var14 = var1.field788 + class305.field4213 - class405.field5768;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field797 + class305.field4213 - class405.field5768;
                    if (var15 > class305.field4213 + class305.field4213) {
                        var15 = class305.field4213 + class305.field4213;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field787 + class305.field4213 - class357.field4890;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field796 + class305.field4213 - class357.field4890;
                        if (var17 > class305.field4213 + class305.field4213) {
                            var17 = class305.field4213 + class305.field4213;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class194.field2654[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field792 = 5;
                            var1.field803 = (var1.field804 - class17.field313 << 8) / var13;
                            var1.field793 = (var1.field798 - class17.field313 << 8) / var13;
                            var1.field785 = (var1.field806 - class247.field3494 << 8) / var13;
                            var1.field791 = (var1.field807 - class247.field3494 << 8) / var13;
                            class131.field1865[class146.field2081++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)C")
    public final char method547(int arg0) {
        field2153++;
        if (arg0 != 0) {
            this.method545(-81);
        }
        return this.field2136;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZZI)I")
    public static final int method1028(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field2154++;
        int var5 = -46 / ((arg4 + 65) / 53);
        class304 var6 = class356.method2281(arg0, arg2, 0);
        if (var6 == null) {
            return 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var6.field4198.length; var8++) {
            if (var6.field4198[var8] >= 0 && var6.field4198[var8] < class346.field4728) {
                class360 var9 = class51.method433((byte) 87, var6.field4198[var8]);
                int var10 = var9.method2312(8806, arg1, class44.method396((byte) 114, arg1).field1668);
                if (arg3) {
                    var7 += var6.field4194[var8] * var10;
                } else {
                    var7 += var10;
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
    public final int method548(byte arg0) {
        if (arg0 == 105) {
            field2145++;
            return this.field2150;
        } else {
            return 11;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(Z)Z")
    public static final boolean method1029(boolean arg0) {
        if (!arg0) {
            method1025(-82);
        }
        field2139++;
        return class203.field2787 != 0 || class105.field1435 >= 2;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)Z")
    public final boolean method542(boolean arg0) {
        field2132++;
        return arg0 ? true : this.field2152;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2157++;
        if (arg7 == arg9 && arg0 == arg6 && arg3 == arg8 && arg4 == arg5) {
            class314.method2029(arg5, -117, arg2, arg0, arg7, arg3);
        } else {
            int var10 = arg7;
            int var11 = arg0;
            int var12 = arg7 * 3;
            int var13 = arg0 * 3;
            int var14 = arg9 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg4 * 3;
            int var18 = var14 + arg3 - var16 - arg7;
            int var19 = arg5 + var15 - arg0 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var26 = var24 * var24 >> 12;
                int var27 = var24 * var26 >> 12;
                int var28 = var18 * var27;
                int var29 = var19 * var27;
                int var30 = var20 * var26;
                int var31 = var21 * var26;
                int var32 = var22 * var24;
                int var33 = var23 * var24;
                int var34 = arg7 + (var28 + var30 + var32 >> 12);
                int var35 = arg0 + (var29 + var31 + var33 >> 12);
                class314.method2029(var35, -86, arg2, var11, var10, var34);
                var11 = var35;
                var10 = var34;
            }
        }
        int var25 = 61 % ((13 - arg1) / 48);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
    public final int method546(int arg0) {
        field2140++;
        if (arg0 != -20986) {
            this.field2151 = -4L;
        }
        return this.field2149;
    }
}
