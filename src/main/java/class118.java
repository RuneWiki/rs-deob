import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class118 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Z")
    public static boolean field2937 = false;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "La;")
    public static class1 field2943 = class113.method934(-11538, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!td", name = "b", descriptor = "La;")
    public static class1 field2936 = class113.method934(-11538, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!td", name = "l", descriptor = "La;")
    private static class1 field2946 = class113.method934(-11538, "Error loading your profile)3");

    @OriginalMember(owner = "client!td", name = "j", descriptor = "La;")
    public static class1 field2944 = class113.method934(-11538, "Wen m-Ochten Sie von der Liste entfernen?");

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field2942 = 0;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "La;")
    public static class1 field2951 = field2946;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lbc;", line = 4)
    public static final class10 method968(int arg0) {
        field2949++;
        class10 var1 = new class10(class80.field1988, class31.field838, class130.field3197, class8.field293, class113.field2797);
        class42.method450(true);
        return arg0 < 4 ? null : var1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lbd;Lbd;I)I", line = 37)
    public static final int method969(class11 arg0, class11 arg1, int arg2) {
        field2947++;
        int var3 = 0;
        if (arg0.method240(class70.field1754, class123.field3070, -1234)) {
            var3++;
        }
        if (arg1.method240(client.field584, class123.field3070, -1234)) {
            var3++;
        }
        if (arg1.method240(class47.field1247, class123.field3070, -1234)) {
            var3++;
        }
        if (arg1.method240(class39.field1057, class123.field3070, -1234)) {
            var3++;
        }
        if (arg1.method240(class14.field474, class123.field3070, -1234)) {
            var3++;
        }
        int var4 = 84 % ((11 - arg2) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 71)
    public static final void method970(boolean arg0) {
        if (class5.field218 != null) {
            class5.field218.method257();
            class5.field218 = null;
        }
        field2945++;
        if (!arg0) {
            method968(-89);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 92)
    public static final void method971(int arg0) {
        field2940++;
        int var1 = class116.field2905.method209(class100.field2493);
        for (int var2 = 0; var2 < class42.field1105; var2++) {
            int var10 = class116.field2905.method205(class102.field2589[var2]);
            if (var1 < var10) {
                var1 = var10;
            }
        }
        var1 += 8;
        int var3 = class42.field1105 * 15 + 21;
        if (class112.field2765 > 4 && class1.field14 > 4 && class112.field2765 < 516 && class1.field14 < 338) {
            class19.field641 = 0;
            class5.field220 = class42.field1105 * 15 + 22;
            class6.field225 = true;
            int var4 = class112.field2765 - var1 / 2 - 4;
            class93.field2309 = var1;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            class37.field987 = var4;
            int var5 = class1.field14 - 4;
            if (var5 + var3 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            client.field580 = var5;
        }
        if (arg0 != 11451) {
            return;
        }
        if (class112.field2765 > 553 && class1.field14 > 205 && class112.field2765 < 743 && class1.field14 < 466) {
            class5.field220 = class42.field1105 * 15 + 22;
            class19.field641 = 1;
            int var6 = class1.field14 - 205;
            int var7 = class112.field2765 - var1 / 2 - 553;
            if (var7 < 0) {
                var7 = 0;
            } else if (var1 + var7 > 190) {
                var7 = 190 - var1;
            }
            class6.field225 = true;
            class37.field987 = var7;
            if (var6 < 0) {
                var6 = 0;
            } else if (var3 + var6 > 261) {
                var6 = 261 - var3;
            }
            class93.field2309 = var1;
            client.field580 = var6;
        }
        if (class112.field2765 <= 17 || class1.field14 <= 357 || class112.field2765 >= 496 || class1.field14 >= 453) {
            return;
        }
        class93.field2309 = var1;
        class19.field641 = 2;
        class5.field220 = class42.field1105 * 15 + 22;
        int var8 = class1.field14 - 357;
        if (var8 < 0) {
            var8 = 0;
        } else if (var3 + var8 > 96) {
            var8 = 96 - var3;
        }
        int var9 = class112.field2765 - var1 / 2 - 17;
        class6.field225 = true;
        client.field580 = var8;
        if (var9 < 0) {
            var9 = 0;
        } else if (var1 + var9 > 479) {
            var9 = 479 - var1;
        }
        class37.field987 = var9;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IJ)La;", line = 223)
    public static final class1 method972(int arg0, long arg1) {
        field2938++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            if (arg0 >= -3) {
                field2951 = null;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class5.field221[(int) (var8 - arg1 * 37L)];
            }
            class1 var7 = new class1();
            var7.field38 = var6;
            var7.field26 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 266)
    public static final void method973(int arg0) {
        field2953++;
        class70.field1750.method574(-10115);
        for (int var1 = 0; var1 < 32; var1++) {
            class64.field1604[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class133.field3284[var2] = 0L;
        }
        class22.field682 = 0;
        if (arg0 != 75) {
            method975(false);
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 309)
    public static final void method974(int arg0) {
        field2939++;
        class57.method545(1);
        if (class103.field2602 != 10) {
            return;
        }
        int var1 = class112.field2765 - 202;
        int var2 = class122.field3053;
        int var3 = class1.field14 - 171;
        int var4 = -58 % ((-arg0 - 38) / 59);
        if (class53.field1398 == 0) {
            byte var5 = 100;
            byte var6 = 120;
            if (var2 == 1 && var1 >= var5 - 75 && var5 + 75 >= var1 && var3 >= var6 - 20 && var6 + 20 >= var3) {
                class82.field2087 = 0;
                class53.field1398 = 3;
            }
            short var7 = 260;
            if (var2 == 1 && var1 >= var7 - 75 && var1 <= var7 + 75 && var3 >= var6 - 20 && var6 + 20 >= var3) {
                class53.field1398 = 2;
                class82.field2087 = 0;
                class123.field3063 = class82.field2107;
                class123.field3080 = class38.field1031;
                class123.field3065 = class82.field2091;
            }
        } else if (class53.field1398 == 2) {
            byte var8 = 60;
            byte var9 = 100;
            int var16 = var8 + 30;
            if (var2 == 1 && var16 - 15 <= var3 && var3 < var16) {
                class82.field2087 = 0;
            }
            short var10 = 150;
            var16 += 15;
            if (var2 == 1 && var16 - 15 <= var3 && var16 > var3) {
                class82.field2087 = 1;
            }
            var16 += 15;
            if (var2 == 1 && var9 - 75 <= var1 && var1 <= var9 + 75 && var3 >= var10 - 20 && var3 <= var10 + 20) {
                class123.field3074 = class123.field3074.method13(57).method36(-4305);
                class72.method681(class82.field2104, class82.field2098, class19.field667, (byte) 106);
                class34.method400(20, 70);
            } else {
                short var11 = 260;
                if (var2 == 1 && var1 >= var11 - 75 && var11 + 75 >= var1 && var3 >= var10 - 20 && var3 <= var10 + 20) {
                    class123.field3074 = class123.field3070;
                    class123.field3058 = class123.field3070;
                    class53.field1398 = 0;
                }
                while (true) {
                    boolean var12;
                    label139: do {
                        while (class74.method688((byte) -104)) {
                            var12 = false;
                            for (int var13 = 0; var13 < class123.field3077.method10(-3136); var13++) {
                                if (class117.field2923 == class123.field3077.method6(var13, false)) {
                                    var12 = true;
                                    break;
                                }
                            }
                            if (class82.field2087 != 0) {
                                continue label139;
                            }
                            if (class115.field2888 == 85 && class123.field3074.method10(-3136) > 0) {
                                class123.field3074 = class123.field3074.method19(0, 0, class123.field3074.method10(-3136) - 1);
                            }
                            if (class115.field2888 == 84 || class115.field2888 == 80) {
                                class82.field2087 = 1;
                            }
                            if (var12 && class123.field3074.method10(-3136) < 12) {
                                class123.field3074 = class123.field3074.method21(class117.field2923, 0);
                            }
                        }
                        return;
                    } while (class82.field2087 != 1);
                    if (class115.field2888 == 85 && class123.field3058.method10(-3136) > 0) {
                        class123.field3058 = class123.field3058.method19(0, 0, class123.field3058.method10(-3136) - 1);
                    }
                    if (class115.field2888 == 84 || class115.field2888 == 80) {
                        class82.field2087 = 0;
                    }
                    if (var12 && class123.field3058.method10(-3136) < 20) {
                        class123.field3058 = class123.field3058.method21(class117.field2923, 0);
                    }
                }
            }
        } else if (class53.field1398 == 3) {
            short var14 = 150;
            short var15 = 180;
            if (var2 == 1 && var1 >= var15 - 75 && var15 + 75 >= var1 && var14 - 20 <= var3 && var14 + 20 >= var3) {
                class53.field1398 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V", line = 468)
    public static void method975(boolean arg0) {
        field2936 = null;
        field2943 = null;
        field2944 = null;
        if (arg0) {
            field2943 = null;
        }
        field2946 = null;
        field2951 = null;
    }
}
