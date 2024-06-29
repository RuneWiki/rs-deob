import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Laf;")
    public static class7 field658 = class48.method406(40, "mod_icons");

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Laf;")
    private static class7 field665 = class48.method406(40, "Drop");

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field666 = 0;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field664 = 3353893;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Laf;")
    public static class7 field669 = field665;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[[[B")
    public static byte[][][] field670 = new byte[4][104][104];

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lad;")
    public static class5 field660;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
    public static int[] field668;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[I")
    public static int[] field671;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZIILnc;I)V")
    public static final void method231(boolean arg0, int arg1, int arg2, class93 arg3, int arg4) {
        field659++;
        if (class42.field1009 >= 50 || class27.field720 == 0) {
            return;
        }
        if (!arg0) {
            field667 = -88;
        }
        if (arg3.field2164 == null || arg3.field2164.length <= arg4) {
            return;
        }
        int var5 = arg3.field2164[arg4];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        int var7 = var5 >> 4 & 0x7;
        class135.field3193[class42.field1009] = var6;
        class86.field2012[class42.field1009] = var7;
        class24.field654[class42.field1009] = 0;
        int var8 = (arg2 - 64) / 128;
        class95.field2241[class42.field1009] = null;
        int var9 = var5 & 0xF;
        int var10 = (arg1 - 64) / 128;
        class38.field949[class42.field1009] = (var8 << 16) + var9 + (var10 << 8);
        class42.field1009++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
    public static final void method232(int arg0, int arg1) {
        short var2 = 256;
        class106.field2601 += arg1 * 128;
        field661++;
        if (class18.field423.length < class106.field2601) {
            class106.field2601 -= class18.field423.length;
            int var3 = (int) (Math.random() * 12.0D);
            class120.method927((byte) 75, class106.field2619[var3]);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        if (arg0 != -27876) {
            method233(26, 56, 14, null);
        }
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class123.field2939[var4 + var5] - class18.field423[class106.field2601 + var4 & class18.field423.length - 1] * arg1 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class123.field2939[var4++] = var27;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class123.field2939[var24 + var25] = 255;
                } else {
                    class123.field2939[var24 + var25] = 0;
                }
            }
        }
        if (class68.field1494 > 0) {
            class68.field1494 -= arg1 * 4;
        }
        if (class98.field2327 > 0) {
            class98.field2327 -= arg1 * 4;
        }
        if (class98.field2327 == 0 && class68.field1494 == 0) {
            int var9 = (int) ((double) (2000 / arg1) * Math.random());
            if (var9 == 1) {
                class68.field1494 = 1024;
            }
            if (var9 == 0) {
                class98.field2327 = 1024;
            }
        }
        for (int var10 = 0; var10 < var2 - arg1; var10++) {
            class94.field2207[var10] = class94.field2207[arg1 + var10];
        }
        for (int var11 = var2 - arg1; var11 < var2; var11++) {
            class94.field2207[var11] = (int) (Math.sin((double) class12.field322 / 14.0D) * 16.0D + Math.sin((double) class12.field322 / 15.0D) * 14.0D + Math.sin((double) class12.field322 / 16.0D) * 12.0D);
            class12.field322++;
        }
        class47.field1145 += arg1;
        int var12 = ((class155.field3611 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class47.field1145 * 100; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class123.field2939[(var23 << 7) + var22] = 192;
        }
        class47.field1145 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var19 += class123.field2939[var20 + var21 + var12];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class123.field2939[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class12.field321[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var12 + var17 < var2) {
                    var16 += class12.field321[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class12.field321[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class123.field2939[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILof;)V")
    public static final void method233(int arg0, int arg1, int arg2, class103 arg3) {
        field663++;
        if (arg3.field2553 == 1) {
            class19.method176(0, arg3.field2442, class52.field1243, arg3.field2526, 3, 1, 0);
            class75.field1743++;
        }
        if (arg3.field2553 == 2 && !class50.field1206) {
            class7 var4 = class97.method792(-1, arg3);
            if (var4 != null) {
                class14.field359++;
                class19.method176(-1, arg3.field2442, class116.method905(new class7[] { class81.field1862, arg3.field2475 }, 1), var4, 3, 13, 0);
            }
        }
        if (arg3.field2553 == 3) {
            class21.field542++;
            class19.method176(0, arg3.field2442, class52.field1243, class95.field2266, 3, 25, 0);
        }
        if (arg0 <= 36) {
            method235((byte) -86);
        }
        if (arg3.field2553 == 4) {
            class19.method176(0, arg3.field2442, class52.field1243, arg3.field2526, 3, 34, 0);
            class42.field1004++;
        }
        if (arg3.field2553 == 5) {
            class49.field1182++;
            class19.method176(0, arg3.field2442, class52.field1243, arg3.field2526, 3, 40, 0);
        }
        if (arg3.field2553 == 6 && class12.field317 == null) {
            class19.method176(-1, arg3.field2442, class52.field1243, arg3.field2526, 3, 48, 0);
            class8.field208++;
        }
        if (arg3.field2483 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field2517; var6++) {
                for (int var7 = 0; var7 < arg3.field2550; var7++) {
                    int var8 = (arg3.field2504 + 32) * var6;
                    int var9 = (arg3.field2450 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg3.field2503[var5];
                        var9 += arg3.field2562[var5];
                    }
                    if (arg1 >= var9 && arg2 >= var8 && var9 + 32 > arg1 && arg2 < var8 + 32) {
                        class9.field253 = arg3;
                        class119.field2812 = var5;
                        if (arg3.field2438[var5] > 0) {
                            class135 var10 = class64.method526(false, arg3.field2438[var5] - 1);
                            if (class142.field3348 == 1 && class50.method419(-1, class7.method98(26454, arg3))) {
                                if (class10.field275 != arg3.field2442 || class53.field1296 != var5) {
                                    class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class83.field1956, class18.field412, var10.field3199 }, 1), class75.field1732, 3, 29, var10.field3190);
                                    class57.field1355++;
                                }
                            } else if (!class50.field1206 || !class50.method419(-1, class7.method98(26454, arg3))) {
                                class7[] var11 = var10.field3188;
                                class142.field3346++;
                                if (class51.field1223) {
                                    var11 = class42.method369(var11, 8);
                                }
                                if (class50.method419(-1, class7.method98(26454, arg3))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class130.field3067++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 28;
                                            } else {
                                                var13 = 11;
                                            }
                                            class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class17.field406, var10.field3199 }, 1), var11[var12], 3, var13, var10.field3190);
                                        } else if (var12 == 4) {
                                            class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class17.field406, var10.field3199 }, 1), field669, 3, 11, var10.field3190);
                                            class147.field3464++;
                                        }
                                    }
                                }
                                if (class95.method771(class7.method98(26454, arg3), -13667)) {
                                    class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class17.field406, var10.field3199 }, 1), class75.field1732, 3, 43, var10.field3190);
                                    class74.field1726++;
                                }
                                if (class50.method419(-1, class7.method98(26454, arg3)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class113.field2721++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 18;
                                            }
                                            if (var14 == 1) {
                                                var15 = 58;
                                            }
                                            if (var14 == 2) {
                                                var15 = 15;
                                            }
                                            class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class17.field406, var10.field3199 }, 1), var11[var14], 3, var15, var10.field3190);
                                        }
                                    }
                                }
                                class7[] var16 = arg3.field2527;
                                if (class51.field1223) {
                                    var16 = class42.method369(var16, 8);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            class122.field2871++;
                                            if (var17 == 0) {
                                                var18 = 22;
                                            }
                                            if (var17 == 1) {
                                                var18 = 20;
                                            }
                                            if (var17 == 2) {
                                                var18 = 5;
                                            }
                                            if (var17 == 3) {
                                                var18 = 14;
                                            }
                                            if (var17 == 4) {
                                                var18 = 33;
                                            }
                                            class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class17.field406, var10.field3199 }, 1), var16[var17], 3, var18, var10.field3190);
                                        }
                                    }
                                }
                                class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class17.field406, var10.field3199 }, 1), class28.field736, 3, 1007, var10.field3190);
                            } else if ((class9.field246 & 0x10) == 16) {
                                class19.method176(var5, arg3.field2442, class116.method905(new class7[] { class126.field3013, class18.field412, var10.field3199 }, 1), class92.field2132, 3, 37, var10.field3190);
                                class136.field3256++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field2565) {
            return;
        }
        if (!class50.field1206) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class7 var23 = class30.method255(-124, var19, arg3);
                if (var23 != null) {
                    class19.method176(arg3.field2445, arg3.field2442, arg3.field2541, var23, 3, 1004, var19 + 1);
                    class111.field2671++;
                }
            }
            class7 var20 = class97.method792(-1, arg3);
            if (var20 != null) {
                class19.method176(arg3.field2445, arg3.field2442, arg3.field2541, var20, 3, 13, 0);
                class14.field359++;
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class7 var22 = class30.method255(-98, var21, arg3);
                if (var22 != null) {
                    class19.method176(arg3.field2445, arg3.field2442, arg3.field2541, var22, 3, 7, var21 + 1);
                    class111.field2671++;
                }
            }
            if (!class47.method397(class7.method98(26454, arg3), 3)) {
                return;
            }
            class19.method176(arg3.field2445, arg3.field2442, class52.field1243, class42.field1017, 3, 48, 0);
            class8.field208++;
        } else if (class75.method641(class7.method98(26454, arg3), (byte) 100) && (class9.field246 & 0x20) == 32) {
            class19.method176(arg3.field2445, arg3.field2442, class116.method905(new class7[] { class126.field3013, class68.field1483, arg3.field2541 }, 1), class92.field2132, 3, 4, 0);
            class118.field2800++;
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Lia;")
    public static final class57 method234(int arg0, int arg1) {
        field662++;
        class57 var2 = (class57) class139.field3283.method395(127, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1734.method572(5, false, arg0);
        class57 var4 = new class57();
        if (var3 != null) {
            var4.method463(-1025, new class122(var3));
        }
        class139.field3283.method388(var4, (long) arg0, 2047);
        return arg1 == 15992 ? var4 : null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method235(byte arg0) {
        field671 = null;
        field660 = null;
        field658 = null;
        field668 = null;
        field665 = null;
        field670 = null;
        field669 = null;
        int var1 = 94 / ((arg0 + 61) / 54);
    }
}
