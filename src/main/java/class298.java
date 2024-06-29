import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class298 extends class270 {

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    private int field5086 = 4;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    private int field5090 = 4;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "Lmh;")
    public static class62 field5080 = class201.method1405(true, "(U3");

    @OriginalMember(owner = "client!c", name = "U", descriptor = "Lmh;")
    private static class62 field5079 = class201.method1405(true, "scroll:");

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "[I")
    public static int[] field5087 = new int[5];

    @OriginalMember(owner = "client!c", name = "W", descriptor = "Lmh;")
    public static class62 field5081 = field5079;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "Lmh;")
    public static class62 field5093 = field5079;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "Lhi;")
    public static class26 field5084;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "[I")
    public static int[] field5091;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "[Lwj;")
    public static class135[] field5088;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2013(boolean arg0) {
        field5082++;
        if (class44.field665 == -1 || class134.field2188 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = class286.field4897 * 2;
        int var3 = ((class24.field260 - class46.field684) * class251.field4259 >> 16) + class46.field684;
        class251.field4259 += var3;
        if (class251.field4259 < 65535) {
            class66.field993 = false;
            class277.field4754 = false;
        } else {
            class251.field4259 = 65535;
            if (class277.field4754) {
                class66.field993 = false;
            } else {
                class66.field993 = true;
            }
            class277.field4754 = true;
        }
        float var4 = (float) class251.field4259 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class206.field3491[class44.field665][var2][var5] * 3;
            int var7 = class206.field3491[class44.field665][var2 + 1][var5] * 3;
            int var8 = class206.field3491[class44.field665][var2][var5];
            int var9 = (class206.field3491[class44.field665][var2 + 2][var5] + class206.field3491[class44.field665][var2 - -2][var5] - class206.field3491[class44.field665][var2 + 3][var5]) * 3;
            int var10 = var6 - (var7 * 2 - var9);
            int var11 = var7 - var6;
            int var12 = class206.field3491[class44.field665][var2 + 2][var5] + var7 - var9 - var8;
            var1[var5] = (((float) var12 * var4 + (float) var10) * var4 + (float) var11) * var4 + (float) var8;
        }
        float[] var13 = new float[3];
        int var14 = class155.field2494 * 2;
        if (class120.field2006 == 0 && class290.field4936 == 0) {
            class120.field2006 = ((int) var1[0] >> 10) * 8 - 48;
            class290.field4936 = ((int) var1[2] >> 10) * 8 - 48;
        }
        class258.field4351 = (int) var1[0] - (class120.field2006 * 128);
        class215.field3647 = (int) var1[2] - class290.field4936 * 128;
        class15.field134 = (int) var1[1] * -1;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class206.field3491[class134.field2188][var14][var15] * 3;
            int var17 = class206.field3491[class134.field2188][var14 + 1][var15] * 3;
            int var18 = (class206.field3491[class134.field2188][var14 + 2][var15] - (class206.field3491[class134.field2188][var14 + 3][var15] - class206.field3491[class134.field2188][var14 + 2][var15])) * 3;
            int var19 = var17 - var16;
            int var20 = class206.field3491[class134.field2188][var14][var15];
            int var21 = var16 + var18 - (var17 * 2);
            int var22 = class206.field3491[class134.field2188][var14 + 2][var15] + var17 - var18 - var20;
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var19) * var4 + (float) var20;
        }
        if (!arg0) {
            field5084 = (class26) null;
        }
        float var23 = var13[2] - var1[2];
        float var24 = (var13[1] - var1[1]) * -1.0F;
        float var25 = var13[0] - var1[0];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class15.field125 = (float) Math.atan2((double) var24, var26);
        class115.field1928 = -((float) Math.atan2((double) var25, (double) var23));
        class46.field683 = (int) ((double) class15.field125 * 325.949D) & 0x7FF;
        class30.field414 = (int) ((double) class115.field1928 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[I", line = 125)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            method2015((byte) -19, 32, (class191) null, 29);
        }
        field5078++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int var4 = class109.field1770 / this.field5086;
            int var5 = class266.field4496 / this.field5090;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1850(0, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1850(0, 0, class266.field4496 * var7 / var5);
            }
            for (int var8 = 0; var8 < class109.field1770; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class109.field1770 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 189)
    public class298() {
        super(1, false);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lmh;I)V", line = 200)
    public static final void method2014(class62 arg0, int arg1) {
        class181.field2879 = arg0;
        field5077++;
        if (class193.field3246.field4878 == null) {
            return;
        }
        try {
            class62 var2 = class297.field5071.method435((byte) 36, class193.field3246.field4878);
            class62 var3 = class206.field3503.method435((byte) 36, class193.field3246.field4878);
            class62 var4 = class254.method1772(new class62[] { var2, class234.field4035, arg0, class12.field98, var3 }, arg1 ^ arg1);
            class62 var5;
            if (arg0.method439(102) == 0) {
                var5 = class254.method1772(new class62[] { var4, class288.field4916 }, 0);
            } else {
                var5 = class254.method1772(new class62[] { var4, class158.field2545, class236.method1666(class293.method1985((byte) -71) + 94608000000L, 73), class69.field1057, class246.method1718(arg1 ^ 0x8, 94608000L) }, 0);
            }
            class254.method1772(new class62[] { class140.field2255, var5, class111.field1826 }, 0).method444(class193.field3246.field4878, (byte) -94);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BILsg;I)V", line = 236)
    public static final void method2015(byte arg0, int arg1, class191 arg2, int arg3) {
        field5083++;
        if (arg2.field3123 == 1) {
            class264.field4447++;
            class39.method268(true, 0, arg2.field3142, arg2.field3119, (short) 49, 0L, class275.field4694);
        }
        if (arg2.field3123 == 2 && !class106.field1728) {
            class62 var4 = class108.method836(arg2, 0);
            if (var4 != null) {
                class39.method268(true, -1, arg2.field3142, var4, (short) 19, 0L, class254.method1772(new class62[] { class36.field478, arg2.field3194 }, 0));
                class94.field1543++;
            }
        }
        if (arg2.field3123 == 3) {
            class39.method268(true, 0, arg2.field3142, class50.field723, (short) 42, 0L, class275.field4694);
            class289.field4924++;
        }
        if (arg2.field3123 == 4) {
            class39.method268(true, 0, arg2.field3142, arg2.field3119, (short) 14, 0L, class275.field4694);
            class304.field5227++;
        }
        if (arg0 >= -41) {
            method2016(4, (class26) null, 60, -80);
        }
        if (arg2.field3123 == 5) {
            class39.method268(true, 0, arg2.field3142, arg2.field3119, (short) 26, 0L, class275.field4694);
            class103.field1701++;
        }
        if (arg2.field3123 == 6 && class81.field1354 == null) {
            class39.method268(true, -1, arg2.field3142, arg2.field3119, (short) 2, 0L, class275.field4694);
            class119.field1992++;
        }
        if (arg2.field3068 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field3128; var6++) {
                for (int var7 = 0; var7 < arg2.field3163; var7++) {
                    int var8 = (arg2.field3201 + 32) * var7;
                    int var9 = (arg2.field3122 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg2.field3109[var5];
                        var8 += arg2.field3169[var5];
                    }
                    if (var8 <= arg3 && var9 <= arg1 && (var8 + 32) > arg3 && var9 + 32 > arg1) {
                        class42.field640 = arg2;
                        class30.field408 = var5;
                        if (arg2.field3085[var5] > 0) {
                            class37 var10 = class189.method1320(0, arg2.field3085[var5] - 1);
                            if (class263.field4429 == 1 && class286.method1960(client.method2058(arg2), (byte) 102)) {
                                if (class151.field2376 != arg2.field3142 || class290.field4929 != var5) {
                                    class246.field4188++;
                                    class39.method268(true, var5, arg2.field3142, class73.field1113, (short) 44, (long) var10.field557, class254.method1772(new class62[] { class216.field3671, class236.field4061, var10.field541 }, 0));
                                }
                            } else if (!class106.field1728 || !class286.method1960(client.method2058(arg2), (byte) 109)) {
                                class218.field3764++;
                                class62[] var11 = var10.field520;
                                if (class29.field383) {
                                    var11 = class113.method886(var11, (byte) -95);
                                }
                                if (class286.method1960(client.method2058(arg2), (byte) 107)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class182.field2886++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 46;
                                            } else {
                                                var13 = 35;
                                            }
                                            class39.method268(true, var5, arg2.field3142, var11[var12], var13, (long) var10.field557, class254.method1772(new class62[] { class113.field1876, var10.field541 }, 0));
                                        } else if (var12 == 4) {
                                            class39.method268(true, var5, arg2.field3142, class241.field4112, (short) 35, (long) var10.field557, class254.method1772(new class62[] { class113.field1876, var10.field541 }, 0));
                                            class240.field4101++;
                                        }
                                    }
                                }
                                if (class146.method1069(false, client.method2058(arg2))) {
                                    class39.method268(true, var5, arg2.field3142, class73.field1113, (short) 23, (long) var10.field557, class254.method1772(new class62[] { class113.field1876, var10.field541 }, 0));
                                    class153.field2418++;
                                }
                                if (class286.method1960(client.method2058(arg2), (byte) 103) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class278.field4770++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 37;
                                            }
                                            if (var14 == 1) {
                                                var15 = 45;
                                            }
                                            if (var14 == 2) {
                                                var15 = 20;
                                            }
                                            class39.method268(true, var5, arg2.field3142, var11[var14], var15, (long) var10.field557, class254.method1772(new class62[] { class113.field1876, var10.field541 }, 0));
                                        }
                                    }
                                }
                                class62[] var16 = arg2.field3176;
                                if (class29.field383) {
                                    var16 = class113.method886(var16, (byte) -95);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class294.field5023++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 36;
                                            }
                                            if (var17 == 1) {
                                                var18 = 29;
                                            }
                                            if (var17 == 2) {
                                                var18 = 22;
                                            }
                                            if (var17 == 3) {
                                                var18 = 48;
                                            }
                                            if (var17 == 4) {
                                                var18 = 6;
                                            }
                                            class39.method268(true, var5, arg2.field3142, var16[var17], var18, (long) var10.field557, class254.method1772(new class62[] { class113.field1876, var10.field541 }, 0));
                                        }
                                    }
                                }
                                class39.method268(true, var5, arg2.field3142, class17.field164, (short) 1004, (long) var10.field557, class254.method1772(new class62[] { class113.field1876, var10.field541 }, 0));
                            } else if ((class141.field2271 & 0x10) == 16) {
                                class39.method268(true, var5, arg2.field3142, class121.field2015, (short) 7, (long) var10.field557, class254.method1772(new class62[] { class281.field4805, class236.field4061, var10.field541 }, 0));
                                class309.field5294++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field3209) {
            return;
        }
        if (!class106.field1728) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class62 var20 = class123.method940(0, arg2, var19);
                if (var20 != null) {
                    class39.method268(true, arg2.field3104, arg2.field3142, var20, (short) 1001, (long) (var19 + 1), arg2.field3080);
                    class98.field1616++;
                }
            }
            class62 var21 = class108.method836(arg2, 0);
            if (var21 != null) {
                class94.field1543++;
                class39.method268(true, arg2.field3104, arg2.field3142, var21, (short) 19, 0L, arg2.field3080);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class62 var23 = class123.method940(0, arg2, var22);
                if (var23 != null) {
                    class98.field1616++;
                    class39.method268(true, arg2.field3104, arg2.field3142, var23, (short) 15, (long) (var22 + 1), arg2.field3080);
                }
            }
            if (class169.method1217((byte) -111, client.method2058(arg2))) {
                class39.method268(true, arg2.field3104, arg2.field3142, class284.field4857, (short) 2, 0L, class275.field4694);
                class119.field1992++;
            }
        } else if (class73.method521(client.method2058(arg2), 0) && (class141.field2271 & 0x20) == 32) {
            class39.method268(true, arg2.field3104, arg2.field3142, class121.field2015, (short) 3, 0L, class254.method1772(new class62[] { class281.field4805, class206.field3496, arg2.field3080 }, 0));
            class263.field4434++;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILhi;II)Lkb;", line = 547)
    public static final class82 method2016(int arg0, class26 arg1, int arg2, int arg3) {
        field5092++;
        if (class127.method951(arg1, arg2, arg0 - 141, arg3)) {
            if (arg0 != 23) {
                field5093 = (class62) null;
            }
            return class90.method674(30000);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)[[I", line = 567)
    public final int[][] method11(boolean arg0, int arg1) {
        int[][] var3 = this.field4589.method605(arg1, 19195);
        field5094++;
        if (this.field4589.field1320) {
            int var4 = class109.field1770 / this.field5086;
            int var5 = class266.field4496 / this.field5090;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1855(false, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method1855(false, class266.field4496 * var7 / var5, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[0];
            int[] var11 = var6[2];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class109.field1770; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class109.field1770 * var16 / var4;
                }
                var10[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var11[var15];
            }
        }
        if (arg0) {
            method2015((byte) -122, -128, (class191) null, -80);
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V", line = 635)
    public static void method2017(boolean arg0) {
        field5080 = null;
        field5088 = null;
        field5091 = null;
        field5087 = null;
        field5079 = null;
        field5081 = null;
        if (!arg0) {
            field5091 = (int[]) null;
        }
        field5093 = null;
        field5084 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lmi;II)V", line = 662)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field5089++;
        if (arg1 == 0) {
            this.field5086 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field5090 = arg0.method702(-1);
        }
        int var5 = -31 % ((-arg2 - 8) / 53);
    }
}
