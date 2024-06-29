import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class164 {

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2976 = 50;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    public static int[] field2970 = new int[field2976];

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "[I")
    public static int[] field2981 = new int[field2976];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "[Loh;")
    public static class263[] field2972 = new class263[field2976];

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "[I")
    public static int[] field2990 = new int[field2976];

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[I")
    public static int[] field2982 = new int[field2976];

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "[I")
    public static int[] field2994 = new int[field2976];

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "[I")
    public static int[] field2992 = new int[field2976];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[I")
    public static int[] field2969 = new int[field2976];

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Loh;")
    public static class263 field2986 = class253.method1681(-118, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public int field2987;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "J")
    public long field2971;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Lnj;")
    public class139 field2984;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Lnj;")
    public class139 field2991;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "Lnj;")
    public class139 field2996;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "[I")
    public static int[] field2975;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[[Lpc;")
    public static class21[][] field2974;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILpc;)V")
    public static final void method1076(int arg0, int arg1, int arg2, class21 arg3) {
        field2978++;
        if (arg3.field604 == 0) {
            arg3.field547 = arg3.field493;
        } else if (arg3.field604 == 1) {
            arg3.field547 = (arg1 - arg3.field479) / 2 + arg3.field493;
        } else if (arg3.field604 == 2) {
            arg3.field547 = arg1 - arg3.field493 - arg3.field479;
        } else if (arg3.field604 == 3) {
            arg3.field547 = arg3.field493 * arg1 >> 14;
        } else if (arg3.field604 == 4) {
            arg3.field547 = (arg1 - arg3.field479) / 2 + (arg3.field493 * arg1 >> 14);
        } else {
            arg3.field547 = arg1 - arg3.field479 - (arg3.field493 * arg1 >> 14);
        }
        if (arg3.field488 == 0) {
            arg3.field523 = arg3.field551;
        } else if (arg3.field488 == 1) {
            arg3.field523 = (arg2 - arg3.field539) / 2 + arg3.field551;
        } else if (arg3.field488 == 2) {
            arg3.field523 = arg2 - arg3.field551 - arg3.field539;
        } else if (arg3.field488 == 3) {
            arg3.field523 = arg3.field551 * arg2 >> 14;
        } else if (arg3.field488 == 4) {
            arg3.field523 = (arg3.field551 * arg2 >> 14) + (arg2 - arg3.field539) / 2;
        } else {
            arg3.field523 = arg2 - arg3.field539 - (arg3.field551 * arg2 >> 14);
        }
        if (class121.field2246 && (client.method1005(arg3) != 0 || arg3.field519 == 0)) {
            if (arg3.field547 < 0) {
                arg3.field547 = 0;
            } else if (arg3.field547 + arg3.field479 > arg1) {
                arg3.field547 = arg1 - arg3.field479;
            }
            if (arg3.field523 < 0) {
                arg3.field523 = 0;
            } else if (arg2 < (arg3.field539 + arg3.field523)) {
                arg3.field523 = arg2 - arg3.field539;
            }
        }
        if (arg0 != 11426) {
            method1079(-84, -54, 30, -48, 38);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
    public static final void method1077(int arg0, boolean arg1) {
        class16 var2 = class13.field346;
        synchronized (class13.field346) {
            class276.field4837 = arg0;
            if (!arg1) {
                method1084(13);
            }
        }
        field2973++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lpc;IIIIII)V")
    public static final void method1078(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2977++;
        int var7 = arg3 * arg3 + arg5 * arg5;
        if (var7 > 360000) {
            return;
        }
        if (arg6 >= -96) {
            field2970 = null;
        }
        int var8 = Math.min(arg0.field539 / 2, arg0.field479 / 2);
        if ((var8 * var8) >= var7) {
            class272.method1850(class157.field2835[arg2], arg0, arg1, arg5, arg3, arg4, true);
            return;
        }
        var8 -= 10;
        int var9 = class241.field4230 + class201.field3625 & 0x7FF;
        int var10 = class270.field4769[var9];
        int var11 = class270.field4762[var9];
        int var12 = var10 * 256 / (class121.field2255 + 256);
        int var13 = var11 * 256 / (class121.field2255 + 256);
        int var14 = arg3 * var13 - (arg5 * var12) >> 16;
        int var15 = arg3 * var12 + (arg5 * var13) >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class140) class62.field1255[arg2]).method921(arg0.field539 / 2 + var18 + arg1 - 10, arg0.field479 / 2 + -var19 + arg4 - 10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class143.field2623 == 1) {
            class52.field1109[class3.field58 / 100].method929(class184.field3338 - 8, class108.field2032 - 8);
        }
        if (class143.field2623 == 2) {
            class52.field1109[class3.field58 / 100 + 4].method929(class184.field3338 - 8, class108.field2032 + -8);
        }
        class178.method1196(3199);
        field2993++;
        if (arg4 < 56) {
            method1076(20, 11, -114, (class21) null);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method1080(byte arg0) {
        field2980++;
        int var1 = class239.field4166 * 128 + 64;
        int var2 = class130.field2382 * 128 + 64;
        if (arg0 >= -38) {
            field2990 = null;
        }
        int var3 = class120.method781(class12.field321, var2, false, var1) - class41.field913;
        if (class101.field1923 < 100) {
            if (var3 > class87.field1750) {
                class87.field1750 += (var3 - class87.field1750) * class101.field1923 / 1000 + class30.field750;
                if (var3 < class87.field1750) {
                    class87.field1750 = var3;
                }
            }
            if (class87.field1750 > var3) {
                class87.field1750 -= (class87.field1750 - var3) * class101.field1923 / 1000 + class30.field750;
                if (class87.field1750 < var3) {
                    class87.field1750 = var3;
                }
            }
            if (var2 > class127.field2357) {
                class127.field2357 += (var2 - class127.field2357) * class101.field1923 / 1000 + class30.field750;
                if (var2 < class127.field2357) {
                    class127.field2357 = var2;
                }
            }
            if (class152.field2738 < var1) {
                class152.field2738 += (var1 - class152.field2738) * class101.field1923 / 1000 + class30.field750;
                if (var1 < class152.field2738) {
                    class152.field2738 = var1;
                }
            }
            if (var1 < class152.field2738) {
                class152.field2738 -= (class152.field2738 - var1) * class101.field1923 / 1000 + class30.field750;
                if (var1 > class152.field2738) {
                    class152.field2738 = var1;
                }
            }
            if (class127.field2357 > var2) {
                class127.field2357 -= class30.field750 + ((class127.field2357 - var2) * class101.field1923 / 1000);
                if (class127.field2357 < var2) {
                    class127.field2357 = var2;
                }
            }
        } else {
            class152.field2738 = class239.field4166 * 128 + 64;
            class127.field2357 = class130.field2382 * 128 + 64;
            class87.field1750 = class120.method781(class12.field321, class127.field2357, false, class152.field2738) - class41.field913;
        }
        int var4 = class109.field2048 * 128 + 64;
        int var5 = class18.field419 * 128 + 64;
        int var6 = class120.method781(class12.field321, var4, false, var5) - class40.field905;
        int var7 = var6 - class87.field1750;
        int var8 = var4 - class127.field2357;
        int var9 = var5 - class152.field2738;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class215.field3816;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class215.field3816 += class241.field4237 + (class214.field3811 * var13 / 1000);
            class215.field3816 &= 0x7FF;
        }
        if (var13 < 0) {
            class215.field3816 -= -var13 * class214.field3811 / 1000 + class241.field4237;
            class215.field3816 &= 0x7FF;
        }
        int var14 = var12 - class215.field3816;
        if (class73.field1528 < var11) {
            class73.field1528 += class241.field4237 + ((var11 - class73.field1528) * class214.field3811 / 1000);
            if (var11 < class73.field1528) {
                class73.field1528 = var11;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var11 < class73.field1528) {
            class73.field1528 -= (class73.field1528 - var11) * class214.field3811 / 1000 + class241.field4237;
            if (class73.field1528 < var11) {
                class73.field1528 = var11;
            }
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class215.field3816 = var12;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static final void method1081(boolean arg0) {
        class103.field1956.method830(50);
        field2989++;
        if (!arg0) {
            method1081(true);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)I")
    public static final int method1082(byte arg0, int arg1) {
        field2997++;
        if (arg0 >= -17) {
            field2990 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static final void method1083(byte arg0) {
        field2983++;
        if (class166.field3023 != null) {
            class166.field3023.method809((byte) 84);
            class166.field3023 = null;
        }
        class94.method659(104);
        class277.method1886();
        for (int var1 = 0; var1 < 4; var1++) {
            class103.field1954[var1].method490(-76);
        }
        class5.method28(false, (byte) -101);
        System.gc();
        class183.method1215(-29235, 2);
        class143.field2612 = false;
        class186.field3358 = -1;
        class220.method1500(true, 50);
        class93.field1844 = 0;
        class265.field4635 = false;
        class3.field68 = 0;
        class142.field2596 = 0;
        class145.field2654 = 0;
        for (int var2 = 0; var2 < class1.field17.length; var2++) {
            class1.field17[var2] = null;
        }
        class13.field345 = 0;
        class41.field911 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class151.field2725[var3] = null;
            class8.field142[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class31.field774[var4] = null;
        }
        if (arg0 > -122) {
            field2992 = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class107.field2020[var5][var6][var7] = null;
                }
            }
        }
        class173.method1142(-1);
        class44.field969 = 0;
        class269.method1816((byte) 101);
        class46.method293(-47, true);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1084(int arg0) {
        field2994 = null;
        field2972 = null;
        field2969 = null;
        field2970 = null;
        field2974 = null;
        field2990 = null;
        field2986 = null;
        field2975 = null;
        field2992 = null;
        field2982 = null;
        field2981 = null;
        if (arg0 <= 107) {
            method1080((byte) -118);
        }
    }
}
