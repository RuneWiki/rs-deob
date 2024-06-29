import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class167 {

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lvh;")
    public class187 field2697 = new class187();

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "[I")
    public static int[] field2699 = new int[1000];

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2701 = "glow2:";

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Laj;III)Z")
    public static final boolean method1242(class151 arg0, int arg1, int arg2, int arg3) {
        field2705++;
        byte[] var4 = arg0.method1149(arg2, (byte) 109, arg1);
        if (var4 == null) {
            return false;
        }
        class136.method1008(-123, var4);
        if (arg3 != 64) {
            method1248(10, -65);
        }
        return true;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
    public static final void method1243(boolean arg0) {
        while (true) {
            class9 var1 = (class9) class73.field1267.method316(-29);
            if (var1 == null) {
                if (!arg0) {
                    method1248(-104, 101);
                }
                field2702++;
                return;
            }
            class46 var3;
            if (var1.field178 < 0) {
                int var2 = -var1.field178 - 1;
                if (class297.field4860 == var2) {
                    var3 = class16.field314;
                } else {
                    var3 = class15.field300[var2];
                }
            } else {
                int var4 = var1.field178 - 1;
                var3 = class57.field1002[var4];
            }
            if (var3 != null) {
                class1 var5 = class110.method827(var1.field175, (byte) -95);
                int var6;
                int var7;
                if (var1.field174 == 1 || var1.field174 == 3) {
                    var7 = var5.field57;
                    var6 = var5.field10;
                } else {
                    var6 = var5.field57;
                    var7 = var5.field10;
                }
                int var8 = var1.field179 + (var6 >> 1);
                int var9 = (var7 >> 1) + var1.field176;
                int var10 = (var6 + 1 >> 1) + var1.field179;
                int[][] var11 = class245.field4123[class182.field2898];
                int var12 = var1.field176 + (var7 + 1 >> 1);
                int var13 = var11[var8][var9] + var11[var10][var9] + var11[var10][var12] + var11[var8][var12] >> 2;
                class312 var14 = null;
                int var15 = class199.field3211[var1.field169];
                if (var15 == 0) {
                    class184 var19 = class108.method812(class182.field2898, var1.field179, var1.field176);
                    if (var19 != null) {
                        var14 = var19.field2935;
                    }
                } else if (var15 == 1) {
                    class251 var18 = class274.method1929(class182.field2898, var1.field179, var1.field176);
                    if (var18 != null) {
                        var14 = var18.field4255;
                    }
                } else if (var15 == 2) {
                    class73 var16 = class162.method1197(class182.field2898, var1.field179, var1.field176);
                    if (var16 != null) {
                        var14 = var16.field1262;
                    }
                } else if (var15 == 3) {
                    class23 var17 = class119.method898(class182.field2898, var1.field179, var1.field176);
                    if (var17 != null) {
                        var14 = var17.field425;
                    }
                }
                if (var14 != null) {
                    class64.method444(class182.field2898, (byte) 116, var1.field172 + 1, -1, var15, 0, var1.field180 + 1, 0, var1.field179, var1.field176);
                    int var20 = var1.field170;
                    var3.field810 = var14;
                    var3.field788 = var1.field176 * 128 + var7 * 64;
                    var3.field744 = class275.field4598 + var1.field180;
                    var3.field709 = class275.field4598 + var1.field172;
                    var3.field712 = var1.field179 * 128 + var6 * 64;
                    int var21 = var1.field183;
                    int var22 = var1.field181;
                    var3.field713 = var13;
                    if (var21 < var20) {
                        int var23 = var20;
                        var20 = var21;
                        var21 = var23;
                    }
                    var3.field809 = var1.field179 + var20;
                    int var24 = var1.field173;
                    var3.field718 = var1.field179 + var21;
                    if (var22 > var24) {
                        int var25 = var22;
                        var22 = var24;
                        var24 = var25;
                    }
                    var3.field779 = var1.field176 + var22;
                    var3.field802 = var1.field176 + var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1244(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class265.field4430++;
        class270.field4490 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class51.field865; var12 < class107.field1759; var12++) {
            class174[][] var38 = class90.field1498[var12];
            for (int var39 = class146.field2413; var39 < class16.field316; var39++) {
                for (int var40 = class64.field1081; var40 < class26.field456; var40++) {
                    class174 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class36.field584[var39 + class6.field139 - class286.field4742][var40 + class6.field139 - class303.field4929] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2804 = true;
                            var41.field2798 = true;
                            if (var41.field2814 > 0) {
                                var41.field2799 = true;
                            } else {
                                var41.field2799 = false;
                            }
                            class270.field4490++;
                        } else {
                            var41.field2804 = false;
                            var41.field2798 = false;
                            var41.field2815 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2800 != null) {
                                    class184 var42 = var41.field2800;
                                    var42.field2935.method930(0, var12, var42.field2942, var42.field2934, var42.field2941);
                                    if (var42.field2937 != null) {
                                        var42.field2937.method930(0, var12, var42.field2942, var42.field2934, var42.field2941);
                                    }
                                }
                                if (var41.field2817 != null) {
                                    class251 var43 = var41.field2817;
                                    var43.field4255.method930(var43.field4240, var12, var43.field4246, var43.field4248, var43.field4247);
                                    if (var43.field4244 != null) {
                                        var43.field4244.method930(var43.field4240, var12, var43.field4246, var43.field4248, var43.field4247);
                                    }
                                }
                                if (var41.field2805 != null) {
                                    class23 var44 = var41.field2805;
                                    var44.field425.method930(0, var12, var44.field417, var44.field421, var44.field429);
                                }
                                if (var41.field2812 != null) {
                                    for (int var45 = 0; var45 < var41.field2814; var45++) {
                                        class73 var46 = var41.field2812[var45];
                                        var46.field1262.method930(var46.field1273, var12, var46.field1272, var46.field1284, var46.field1268);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class245.field4123 == class183.field2929;
        for (int var14 = class51.field865; var14 < class107.field1759; var14++) {
            class174[][] var27 = class90.field1498[var14];
            for (int var28 = -class6.field139; var28 <= 0; var28++) {
                int var29 = class286.field4742 + var28;
                int var30 = class286.field4742 - var28;
                if (var29 >= class146.field2413 || var30 < class16.field316) {
                    for (int var31 = -class6.field139; var31 <= 0; var31++) {
                        int var32 = class303.field4929 + var31;
                        int var33 = class303.field4929 - var31;
                        if (var29 >= class146.field2413) {
                            if (var32 >= class64.field1081) {
                                class174 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2804) {
                                    class313.method2122(var34, true);
                                }
                            }
                            if (var33 < class26.field456) {
                                class174 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2804) {
                                    class313.method2122(var35, true);
                                }
                            }
                        }
                        if (var30 < class16.field316) {
                            if (var32 >= class64.field1081) {
                                class174 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2804) {
                                    class313.method2122(var36, true);
                                }
                            }
                            if (var33 < class26.field456) {
                                class174 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2804) {
                                    class313.method2122(var37, true);
                                }
                            }
                        }
                        if (class270.field4490 == 0) {
                            if (!var13) {
                                class80.field1345 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class51.field865; var15 < class107.field1759; var15++) {
            class174[][] var16 = class90.field1498[var15];
            for (int var17 = -class6.field139; var17 <= 0; var17++) {
                int var18 = class286.field4742 + var17;
                int var19 = class286.field4742 - var17;
                if (var18 >= class146.field2413 || var19 < class16.field316) {
                    for (int var20 = -class6.field139; var20 <= 0; var20++) {
                        int var21 = class303.field4929 + var20;
                        int var22 = class303.field4929 - var20;
                        if (var18 >= class146.field2413) {
                            if (var21 >= class64.field1081) {
                                class174 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2804) {
                                    class313.method2122(var23, false);
                                }
                            }
                            if (var22 < class26.field456) {
                                class174 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2804) {
                                    class313.method2122(var24, false);
                                }
                            }
                        }
                        if (var19 < class16.field316) {
                            if (var21 >= class64.field1081) {
                                class174 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2804) {
                                    class313.method2122(var25, false);
                                }
                            }
                            if (var22 < class26.field456) {
                                class174 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2804) {
                                    class313.method2122(var26, false);
                                }
                            }
                        }
                        if (class270.field4490 == 0) {
                            if (!var13) {
                                class80.field1345 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class80.field1345 = false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static final void method1245(byte arg0) {
        class149.field2467.method97(79);
        field2707++;
        int var1 = 96 % ((arg0 - 70) / 35);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZI)I")
    public static final int method1246(int arg0, boolean arg1, int arg2) {
        field2698++;
        int var3 = arg2 >>> 31;
        if (!arg1) {
            method1251((byte) -30);
        }
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILaj;)V")
    public static final void method1247(int arg0, class151 arg1) {
        field2700++;
        class96.field1556 = class197.method1403(arg1, true, class31.field519);
        class123.field2084 = new int[256];
        for (int var2 = arg0; var2 < 3; var2++) {
            int var4 = class140.field2308[var2 + 1] >> 16 & 0xFF;
            float var5 = (float) ((class140.field2308[var2] & 0xFF0000) >> 16);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) ((class140.field2308[var2] & 0xFF00) >> 8);
            int var8 = class140.field2308[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class140.field2308[var2] & 0xFF);
            int var11 = class140.field2308[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class123.field2084[var2 * 64 + var13] = class312.method2107(class312.method2107((int) var5 << 16, (int) var7 << 8), (int) var10);
                var5 += var6;
                var7 += var9;
                var10 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class123.field2084[var3] = class140.field2308[3];
        }
        class110.field1824 = new int[32768];
        class160.field2616 = new int[32768];
        class109.method819(-21, (class230) null);
        class28.field484 = new int[32768];
        class110.field1825 = new int[32768];
        class130.field2154 = new class92(128, 254);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
    public static final int method1248(int arg0, int arg1) {
        field2704++;
        int var2 = 126 % ((arg0 + 2) / 45);
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lvh;B)V")
    public final void method1249(class187 arg0, byte arg1) {
        if (arg0.field2990 != null) {
            arg0.method1352((byte) -55);
        }
        arg0.field2990 = this.field2697.field2990;
        field2696++;
        if (arg1 < -92) {
            arg0.field2985 = this.field2697;
            arg0.field2990.field2985 = arg0;
            arg0.field2985.field2990 = arg0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method1250(int arg0) {
        while (true) {
            class187 var2 = this.field2697.field2985;
            if (this.field2697 == var2) {
                field2706++;
                if (arg0 >= -12) {
                    this.method1249((class187) null, (byte) -70);
                    return;
                }
                return;
            }
            var2.method1352((byte) -55);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class167() {
        this.field2697.field2990 = this.field2697;
        this.field2697.field2985 = this.field2697;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static void method1251(byte arg0) {
        field2699 = null;
        field2701 = null;
        if (arg0 != -118) {
            field2701 = null;
        }
    }
}
