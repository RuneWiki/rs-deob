import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 {

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public int field3302 = 0;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public int field3310 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
    public static int[] field3285 = new int[500];

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lpe;")
    public static class109 field3283 = class141.method1120("Lade)3)3)3", 0);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lbc;")
    public static class11 field3284 = new class11(64);

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lpe;")
    public static class109 field3296 = class141.method1120("(Udns", 0);

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lpe;")
    private static class109 field3293 = class141.method1120("Close", 0);

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lpe;")
    private static class109 field3301 = class141.method1120("Choose Option", 0);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lpe;")
    public static class109 field3289 = field3293;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lpe;")
    public static class109 field3299 = class141.method1120("oder ung-Ultiges Passwort)3", 0);

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "[[B")
    public static byte[][] field3307 = new byte[250][];

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lpe;")
    public static class109 field3291 = class141.method1120("Art", 0);

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Lpe;")
    public static class109 field3309 = field3301;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lk;")
    public static class69 field3300;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lma;")
    public class84 field3292;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "Lma;")
    public class84 field3297;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Lba;")
    public static class9 field3312;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)Z")
    public static final boolean method1164(byte arg0, int arg1) {
        field3282++;
        if (arg0 != 86) {
            method1168(20, false);
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lna;Lna;Z)V")
    public static final void method1165(class91 arg0, class91 arg1, boolean arg2) {
        if (!arg2) {
            field3308++;
            class14.field376 = arg1;
            class114.field2515 = arg0;
            class120.field2670 = class114.field2515.method754(3, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1166(int arg0) {
        field3307 = null;
        field3289 = null;
        field3301 = null;
        field3293 = null;
        field3283 = null;
        field3291 = null;
        field3284 = null;
        field3309 = null;
        field3300 = null;
        field3296 = null;
        if (arg0 < 121) {
            method1165(null, null, false);
        }
        field3312 = null;
        field3299 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    public static final void method1167(int arg0, byte arg1) {
        field3311++;
        if (!class113.method941(arg0, (byte) -112)) {
            return;
        }
        class154[] var2 = class114.field2525[arg0];
        if (arg1 != -105) {
            field3285 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class154 var4 = var2[var3];
            if (var4 != null) {
                var4.field3392 = 0;
                var4.field3504 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
    public static final void method1168(int arg0, boolean arg1) {
        field3298++;
        class84.field1791 = arg1;
        if (arg0 != 4) {
            field3309 = null;
        }
        if (!class84.field1791) {
            int var2 = (class109.field2286 - class82.field1733.field309) / 16;
            class115.field2548 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class115.field2548[var3][var14] = class82.field1733.method127(class76.method598(arg0, 18622));
                }
            }
            int var4 = class82.field1733.method105(1375221240);
            int var5 = class82.field1733.method136(2);
            boolean var6 = false;
            int var7 = class82.field1733.method111(116);
            int var8 = class82.field1733.method105(1375221240);
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var7 / 8 == 48) {
                var6 = true;
            }
            if (var8 / 8 == 48 && var7 / 8 == 148) {
                var6 = true;
            }
            int var9 = class82.field1733.method142(27467);
            class74.field1492 = new int[var2];
            class17.field430 = new byte[var2][];
            class53.field1103 = new byte[var2][];
            class93.field2010 = new int[var2];
            class95.field2044 = new int[var2];
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var6 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class74.field1492[var10] = var13;
                        class93.field2010[var10] = class114.field2503.method766(-104, class44.method405(new class109[] { class144.field3166, class143.method1132(var11, arg0 + 112), class12.field276, class143.method1132(var12, 118) }, (byte) -74));
                        class95.field2044[var10] = class114.field2503.method766(73, class44.method405(new class109[] { class99.field2086, class143.method1132(var11, class76.method598(arg0, 117)), class12.field276, class143.method1132(var12, 99) }, (byte) -74));
                        var10++;
                    }
                }
            }
            class43.method396(var5, var7, var4, var8, var9, (byte) 73);
            return;
        }
        int var15 = class82.field1733.method111(123);
        int var16 = class82.field1733.method128((byte) 83);
        int var17 = class82.field1733.method142(27467);
        int var18 = class82.field1733.method136(2);
        class82.field1733.method527((byte) -108);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class82.field1733.method526((byte) 127, 1);
                    if (var37 == 1) {
                        class141.field3107[var19][var35][var36] = class82.field1733.method526((byte) 127, 26);
                    } else {
                        class141.field3107[var19][var35][var36] = -1;
                    }
                }
            }
        }
        class82.field1733.method536((byte) -67);
        int var20 = (class109.field2286 - class82.field1733.field309) / 16;
        class115.field2548 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class115.field2548[var21][var34] = class82.field1733.method124(arg0 - 7);
            }
        }
        int var22 = class82.field1733.method128((byte) 83);
        class53.field1103 = new byte[var20][];
        class95.field2044 = new int[var20];
        class74.field1492 = new int[var20];
        class93.field2010 = new int[var20];
        class17.field430 = new byte[var20][];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class141.field3107[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + var29 / 8;
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class74.field1492[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class74.field1492[var23] = var30;
                            class93.field2010[var23] = class114.field2503.method766(37, class44.method405(new class109[] { class144.field3166, class143.method1132(var32, 110), class12.field276, class143.method1132(var33, 119) }, (byte) -74));
                            class95.field2044[var23] = class114.field2503.method766(-104, class44.method405(new class109[] { class99.field2086, class143.method1132(var32, 102), class12.field276, class143.method1132(var33, 94) }, (byte) -74));
                            var23++;
                        }
                    }
                }
            }
        }
        class43.method396(var15, var16, var22, var18, var17, (byte) 73);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public static final void method1169(int arg0) {
        if (arg0 <= 29) {
            return;
        }
        field3294++;
        try {
            if (class125.field2756 == null) {
                class125.field2756 = new class116(class35.field755, class44.method405(new class109[] { class35.field759, class131.field2873, class45.field955 }, (byte) -74).method894((byte) 78));
            } else {
                byte[] var1 = class125.field2756.method955(-3);
                if (var1 != null) {
                    class13 var2 = new class13(var1);
                    class46.field958 = var2.method105(1375221240);
                    class55.field1126 = new class144[class46.field958];
                    for (int var3 = 0; var3 < class46.field958; var3++) {
                        class144 var4 = class55.field1126[var3] = new class144();
                        int var5 = var2.method105(1375221240);
                        var4.field3157 = (var5 & 0x8000) != 0;
                        var4.field3161 = var5 & 0x7FFF;
                        var4.field3168 = var2.method140(0);
                        var4.field3167 = var2.method114(-8859);
                        var4.field3165 = var3;
                        var4.field3163 = class20.method203((byte) 75, var4.field3168);
                    }
                    class104.method838(class71.field1439, class55.field1126.length - 1, -116, class125.field2771, class55.field1126, 0);
                    class79.field1660 = true;
                    class125.field2756 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class125.field2756 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Z")
    public static final boolean method1170(byte arg0) {
        field3305++;
        if (class153.field3363 == null) {
            return false;
        }
        try {
            int var1 = class153.field3363.method81((byte) -27);
            if (var1 == 0) {
                return false;
            }
            if (class17.field423 == -1) {
                var1--;
                class153.field3363.method80((byte) -111, 0, 1, class82.field1733.field279);
                class82.field1733.field309 = 0;
                class17.field423 = class82.field1733.method524(true);
                class109.field2286 = class89.field1876[class17.field423];
            }
            if (class109.field2286 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                class153.field3363.method80((byte) -31, 0, 1, class82.field1733.field279);
                var1--;
                class109.field2286 = class82.field1733.field279[0] & 0xFF;
            }
            if (class109.field2286 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class153.field3363.method80((byte) -39, 0, 2, class82.field1733.field279);
                var1 -= 2;
                class82.field1733.field309 = 0;
                class109.field2286 = class82.field1733.method105(1375221240);
            }
            if (arg0 <= 25) {
                return true;
            }
            if (var1 < class109.field2286) {
                return false;
            }
            class82.field1733.field309 = 0;
            class153.field3363.method80((byte) 108, 0, class109.field2286, class82.field1733.field279);
            class55.field1111 = class157.field3608;
            class92.field1974 = 0;
            class157.field3608 = class138.field3006;
            class138.field3006 = class17.field423;
            if (class17.field423 == 76) {
                class68.method525(1001);
                class17.field423 = -1;
                return false;
            }
            if (class17.field423 == 232) {
                long var2 = class82.field1733.method116(0);
                class82.field1733.method131(false);
                long var4 = class82.field1733.method116(0);
                long var6 = (long) class82.field1733.method105(1375221240);
                long var8 = (long) class82.field1733.method149(true);
                long var10 = (var6 << 32) + var8;
                int var12 = class82.field1733.method142(27467);
                boolean var13 = false;
                for (int var14 = 0; var14 < 100; var14++) {
                    if (class91.field1963[var14] == var10) {
                        var13 = true;
                        break;
                    }
                }
                if (var12 <= 1) {
                    for (int var15 = 0; var15 < class63.field1295; var15++) {
                        if (class38.field838[var15] == var2) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && class118.field2617 == 0) {
                    class91.field1963[class151.field3314] = var10;
                    class151.field3314 = (class151.field3314 + 1) % 100;
                    class109 var16 = class70.method550(class139.method1098(class82.field1733, 50).method883((byte) -103));
                    if (var12 == 2 || var12 == 3) {
                        class100.method806(9, class72.method582(false, var4).method902((byte) 42), (byte) 70, var16, class44.method405(new class109[] { class16.field403, class72.method582(false, var2).method902((byte) 42) }, (byte) -74));
                    } else if (var12 == 1) {
                        class100.method806(9, class72.method582(false, var4).method902((byte) 42), (byte) 100, var16, class44.method405(new class109[] { class82.field1761, class72.method582(false, var2).method902((byte) 42) }, (byte) -74));
                    } else {
                        class100.method806(9, class72.method582(false, var4).method902((byte) 42), (byte) 43, var16, class72.method582(false, var2).method902((byte) 42));
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 192) {
                for (int var17 = 0; var17 < class104.field2208; var17++) {
                    class120 var18 = class137.method1090(var17, (byte) -14);
                    if (var18 != null && var18.field2654 == 0) {
                        class27.field638[var17] = 0;
                        class153.field3376[var17] = 0;
                    }
                }
                class88.method731(0);
                class17.field423 = -1;
                class114.field2510 += 32;
                return true;
            }
            if (class17.field423 == 195) {
                int var19 = class82.field1733.method139(49);
                int var20 = class82.field1733.method132((byte) -28);
                int var21 = class82.field1733.method128((byte) 83);
                class79 var22 = (class79) class134.field2916.method505((byte) -46, (long) var19);
                if (var22 != null) {
                    class15.method178(var22.field1655 != var21, var22, (byte) 5);
                }
                class3.method24(var21, (byte) -125, var19, var20);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 227) {
                field3306 = class82.field1733.method142(27467);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 149 || class17.field423 == 129 || class17.field423 == 68 || class17.field423 == 10 || class17.field423 == 107 || class17.field423 == 66 || class17.field423 == 75 || class17.field423 == 22 || class17.field423 == 67 || class17.field423 == 140 || class17.field423 == 24) {
                class145.method1141((byte) 118);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 101) {
                for (int var23 = 0; var23 < class104.field2194.length; var23++) {
                    if (class104.field2194[var23] != null) {
                        class104.field2194[var23].field3124 = -1;
                    }
                }
                for (int var24 = 0; var24 < class52.field1067.length; var24++) {
                    if (class52.field1067[var24] != null) {
                        class52.field1067[var24].field3124 = -1;
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 228) {
                class110.method910(class109.field2286, (byte) 120, class82.field1733, class35.field755);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 173) {
                int var25 = class82.field1733.method114(-8859);
                int var26 = class82.field1733.method107(109);
                int var27 = class82.field1733.method112(false);
                class154 var28 = class44.method403(var27, true);
                int var29 = var28.field3441 + var25;
                int var30 = var28.field3416 + var26;
                if (var28.field3384 != var30 || var28.field3390 != var29) {
                    var28.field3384 = var30;
                    var28.field3390 = var29;
                    class138.method1092(0, var28);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 15) {
                int var31 = class82.field1733.method143(false);
                int var32 = class82.field1733.method139(-65);
                class154 var33 = class44.method403(var32, true);
                if (var33.field3479 != var31 || var31 == -1) {
                    var33.field3392 = 0;
                    var33.field3504 = 0;
                    var33.field3479 = var31;
                    class138.method1092(0, var33);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 170) {
                int var34 = class82.field1733.method112(false);
                int var35 = class82.field1733.method136(2);
                int var36 = var35 >> 10 & 0x1F;
                int var37 = var35 >> 5 & 0x1F;
                int var38 = var35 & 0x1F;
                int var39 = (var36 << 19) + (var37 << 11) + (var38 << 3);
                class154 var40 = class44.method403(var34, true);
                if (var40.field3439 != var39) {
                    var40.field3439 = var39;
                    class138.method1092(0, var40);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 145) {
                int var41 = class82.field1733.method132((byte) -52);
                int var42 = class82.field1733.method120(18235);
                int var43 = class82.field1733.method108(0);
                class75.field1513 = var43 >> 1;
                class136.field2975.method1125((var43 & 0x1) == 1, var41, 4683, var42);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 25) {
                class44.method404(class82.field1733, (byte) 125);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 16) {
                method1168(4, true);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 162) {
                if (class19.field472 != -1) {
                    class38.method365(0, class19.field472, 2945);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 157) {
                int var44 = class109.field2286 + class82.field1733.field309;
                int var45 = class82.field1733.method105(1375221240);
                int var46 = class82.field1733.method105(1375221240);
                if (class19.field472 != var45) {
                    class19.field472 = var45;
                    method1167(class19.field472, (byte) -105);
                    class14.method165(class19.field472, false);
                    for (int var47 = 0; var47 < 100; var47++) {
                        class120.field2663[var47] = true;
                    }
                }
                while (var46-- > 0) {
                    int var48 = class82.field1733.method112(false);
                    int var49 = class82.field1733.method105(1375221240);
                    int var50 = class82.field1733.method142(27467);
                    class79 var51 = (class79) class134.field2916.method505((byte) -46, (long) var48);
                    if (var51 != null && var51.field1655 != var49) {
                        class15.method178(true, var51, (byte) 5);
                        var51 = null;
                    }
                    if (var51 == null) {
                        var51 = class3.method24(var49, (byte) -106, var48, var50);
                    }
                    var51.field1656 = true;
                }
                for (class79 var52 = (class79) class134.field2916.method508(-44); var52 != null; var52 = (class79) class134.field2916.method506((byte) 127)) {
                    if (var52.field1656) {
                        var52.field1656 = false;
                    } else {
                        class15.method178(true, var52, (byte) 5);
                    }
                }
                class100.field2095 = new class64(512);
                while (class82.field1733.field309 < var44) {
                    int var53 = class82.field1733.method112(false);
                    int var54 = class82.field1733.method105(1375221240);
                    int var55 = class82.field1733.method105(1375221240);
                    int var56 = class82.field1733.method112(false);
                    for (int var57 = var54; var57 <= var55; var57++) {
                        long var58 = ((long) var53 << 32) + (long) var57;
                        class100.field2095.method503(-1, new class158(var56), var58);
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 237) {
                int var60 = class82.field1733.method124(-3);
                class154 var61 = class44.method403(var60, true);
                for (int var62 = 0; var62 < var61.field3496.length; var62++) {
                    var61.field3496[var62] = -1;
                    var61.field3496[var62] = 0;
                }
                class138.method1092(0, var61);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 188) {
                class47.field984 = false;
                for (int var63 = 0; var63 < 5; var63++) {
                    class18.field446[var63] = false;
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 84) {
                int var64 = class82.field1733.method127(18618);
                int var65 = class82.field1733.method128((byte) 83);
                class154 var66 = class44.method403(var64, true);
                if (var66 != null && var66.field3476 == 0) {
                    if (var65 > var66.field3425 - var66.field3382) {
                        var65 = var66.field3425 - var66.field3382;
                    }
                    if (var65 < 0) {
                        var65 = 0;
                    }
                    if (var66.field3417 != var65) {
                        var66.field3417 = var65;
                        class138.method1092(0, var66);
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 21) {
                int var67 = class82.field1733.method105(1375221240);
                int var68 = class82.field1733.method142(27467);
                int var69 = class82.field1733.method105(1375221240);
                class63.method501(var69, -98, var68, var67);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 193) {
                long var70 = class82.field1733.method116(0);
                int var72 = class82.field1733.method105(1375221240);
                byte var73 = class82.field1733.method131(false);
                boolean var74 = false;
                if ((Long.MIN_VALUE & var70) != 0L) {
                    var74 = true;
                }
                if (var74) {
                    if (class72.field1461 == 0) {
                        class17.field423 = -1;
                        return true;
                    }
                    long var75 = var70 & Long.MAX_VALUE;
                    boolean var77 = false;
                    int var78;
                    for (var78 = 0; class72.field1461 > var78 && (class89.field1889[var78].field267 != var75 || class89.field1889[var78].field2836 != var72); var78++) {
                    }
                    if (class72.field1461 > var78) {
                        while (var78 < class72.field1461 - 1) {
                            class89.field1889[var78] = class89.field1889[var78 + 1];
                            var78++;
                        }
                        class89.field1889[class72.field1461] = null;
                        class72.field1461--;
                    }
                } else {
                    class128 var79 = new class128();
                    var79.field267 = var70;
                    var79.field2843 = class72.method582(false, var79.field267);
                    var79.field2836 = var72;
                    var79.field2834 = var73;
                    int var80;
                    for (var80 = class72.field1461 - 1; var80 >= 0; var80--) {
                        int var81 = class89.field1889[var80].field2843.method876(-10156, var79.field2843);
                        if (var81 == 0) {
                            class89.field1889[var80].field2836 = var72;
                            class89.field1889[var80].field2834 = var73;
                            class17.field423 = -1;
                            class158.field3655 = class9.field219;
                            if (class131.field2877 == var70) {
                                class3.field52 = var73;
                            }
                            return true;
                        }
                        if (var81 < 0) {
                            break;
                        }
                    }
                    if (class72.field1461 >= class89.field1889.length) {
                        class17.field423 = -1;
                        return true;
                    }
                    for (int var82 = class72.field1461 - 1; var82 > var80; var82--) {
                        class89.field1889[var82 + 1] = class89.field1889[var82];
                    }
                    if (class72.field1461 == 0) {
                        class89.field1889 = new class128[100];
                    }
                    class89.field1889[var80 + 1] = var79;
                    if (class131.field2877 == var70) {
                        class3.field52 = var73;
                    }
                    class72.field1461++;
                }
                class158.field3655 = class9.field219;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 205) {
                class47.field984 = true;
                class52.field1076 = class82.field1733.method142(27467);
                class113.field2450 = class82.field1733.method142(27467);
                class94.field2029 = class82.field1733.method105(1375221240);
                class52.field1074 = class82.field1733.method142(27467);
                class2.field42 = class82.field1733.method142(27467);
                if (class2.field42 >= 100) {
                    int var83 = class52.field1076 * 128 + 64;
                    int var84 = class113.field2450 * 128 + 64;
                    int var85 = class126.method1019(var84, var83, 1, class75.field1513) - class94.field2029;
                    int var86 = var85 - class102.field2149;
                    int var87 = var83 - class85.field1795;
                    int var88 = var84 - class154.field3518;
                    int var89 = (int) Math.sqrt((double) (var87 * var87 + var88 * var88));
                    class116.field2591 = (int) (Math.atan2((double) var86, (double) var89) * 325.949D) & 0x7FF;
                    class57.field1158 = (int) (-325.949D * Math.atan2((double) var87, (double) var88)) & 0x7FF;
                    if (class116.field2591 < 128) {
                        class116.field2591 = 128;
                    }
                    if (class116.field2591 > 383) {
                        class116.field2591 = 383;
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 14) {
                class32.field696 = class82.field1733.method142(27467);
                if (class32.field696 == 1) {
                    class125.field2769 = class82.field1733.method105(1375221240);
                }
                if (class32.field696 >= 2 && class32.field696 <= 6) {
                    if (class32.field696 == 2) {
                        class107.field2247 = 64;
                        class91.field1959 = 64;
                    }
                    if (class32.field696 == 3) {
                        class91.field1959 = 64;
                        class107.field2247 = 0;
                    }
                    if (class32.field696 == 4) {
                        class91.field1959 = 64;
                        class107.field2247 = 128;
                    }
                    if (class32.field696 == 5) {
                        class91.field1959 = 0;
                        class107.field2247 = 64;
                    }
                    if (class32.field696 == 6) {
                        class91.field1959 = 128;
                        class107.field2247 = 64;
                    }
                    class32.field696 = 2;
                    class92.field1990 = class82.field1733.method105(1375221240);
                    class32.field694 = class82.field1733.method105(1375221240);
                    class7.field172 = class82.field1733.method142(27467);
                }
                if (class32.field696 == 10) {
                    class18.field458 = class82.field1733.method105(1375221240);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 181) {
                class47.field984 = true;
                class113.field2484 = class82.field1733.method142(27467);
                class38.field835 = class82.field1733.method142(27467);
                class3.field75 = class82.field1733.method105(1375221240);
                class1.field15 = class82.field1733.method142(27467);
                class84.field1792 = class82.field1733.method142(27467);
                if (class84.field1792 >= 100) {
                    class85.field1795 = class113.field2484 * 128 + 64;
                    class154.field3518 = class38.field835 * 128 + 64;
                    class102.field2149 = class126.method1019(class154.field3518, class85.field1795, 1, class75.field1513) - class3.field75;
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 208) {
                int var90 = class82.field1733.method112(false);
                boolean var91 = class82.field1733.method132((byte) -89) == 1;
                class154 var92 = class44.method403(var90, true);
                if (var92.field3508 != var91) {
                    var92.field3508 = var91;
                    class138.method1092(0, var92);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 63) {
                class158.field3655 = class9.field219;
                long var93 = class82.field1733.method116(0);
                if (var93 == 0L) {
                    class89.field1889 = null;
                    class72.field1461 = 0;
                    class17.field423 = -1;
                    class133.field2896 = null;
                    class148.field3255 = null;
                    return true;
                }
                long var95 = class82.field1733.method116(0);
                class133.field2896 = class72.method582(false, var95);
                class148.field3255 = class72.method582(false, var93);
                class152.field3355 = class82.field1733.method131(false);
                int var97 = class82.field1733.method142(27467);
                if (var97 == 255) {
                    class17.field423 = -1;
                    return true;
                }
                class72.field1461 = var97;
                class128[] var98 = new class128[100];
                for (int var99 = 0; var99 < class72.field1461; var99++) {
                    var98[var99] = new class128();
                    var98[var99].field267 = class82.field1733.method116(0);
                    var98[var99].field2843 = class72.method582(false, var98[var99].field267);
                    var98[var99].field2836 = class82.field1733.method105(1375221240);
                    var98[var99].field2834 = class82.field1733.method131(false);
                    if (class131.field2877 == var98[var99].field267) {
                        class3.field52 = var98[var99].field2834;
                    }
                }
                boolean var100 = false;
                int var101 = class72.field1461;
                while (var101 > 0) {
                    boolean var102 = true;
                    var101--;
                    for (int var103 = 0; var103 < var101; var103++) {
                        if (var98[var103].field2843.method876(-10156, var98[var103 + 1].field2843) > 0) {
                            var102 = false;
                            class128 var104 = var98[var103];
                            var98[var103] = var98[var103 + 1];
                            var98[var103 + 1] = var104;
                        }
                    }
                    if (var102) {
                        break;
                    }
                }
                class89.field1889 = var98;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 26) {
                int var105 = class82.field1733.method124(-3);
                class154 var106 = class44.method403(var105, true);
                var106.field3433 = 3;
                var106.field3505 = class136.field2975.field1025.method171((byte) 83);
                class138.method1092(0, var106);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 233) {
                class88.field1865 = 0;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 175) {
                long var107 = class82.field1733.method116(0);
                int var109 = class82.field1733.method105(1375221240);
                int var110 = class82.field1733.method142(27467);
                class109 var111 = class72.method582(false, var107).method902((byte) 42);
                for (int var112 = 0; var112 < class110.field2330; var112++) {
                    if (class112.field2415[var112] == var107) {
                        if (class77.field1623[var112] != var109) {
                            class77.field1623[var112] = var109;
                            if (var109 > 0) {
                                class75.method593(5, class131.field2866, -8870, class44.method405(new class109[] { var111, class57.field1148 }, (byte) -74));
                            }
                            if (var109 == 0) {
                                class75.method593(5, class131.field2866, -8870, class44.method405(new class109[] { var111, class126.field2795 }, (byte) -74));
                            }
                        }
                        var111 = null;
                        class13.field312[var112] = var110;
                        break;
                    }
                }
                if (var111 != null && class110.field2330 < 200) {
                    class112.field2415[class110.field2330] = var107;
                    class107.field2255[class110.field2330] = var111;
                    class77.field1623[class110.field2330] = var109;
                    class13.field312[class110.field2330] = var110;
                    class110.field2330++;
                }
                boolean var113 = false;
                int var114 = class110.field2330;
                class75.field1498 = class9.field219;
                while (var114 > 0) {
                    boolean var115 = true;
                    var114--;
                    for (int var116 = 0; var116 < var114; var116++) {
                        if (class77.field1623[var116] != class19.field474 && class77.field1623[var116 + 1] == class19.field474 || class77.field1623[var116] == 0 && class77.field1623[var116 + 1] != 0) {
                            int var117 = class77.field1623[var116];
                            class77.field1623[var116] = class77.field1623[var116 + 1];
                            var115 = false;
                            class77.field1623[var116 + 1] = var117;
                            class109 var118 = class107.field2255[var116];
                            class107.field2255[var116] = class107.field2255[var116 + 1];
                            class107.field2255[var116 + 1] = var118;
                            long var119 = class112.field2415[var116];
                            class112.field2415[var116] = class112.field2415[var116 + 1];
                            class112.field2415[var116 + 1] = var119;
                            int var121 = class13.field312[var116];
                            class13.field312[var116] = class13.field312[var116 + 1];
                            class13.field312[var116 + 1] = var121;
                        }
                    }
                    if (var115) {
                        break;
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 8) {
                int var122 = class82.field1733.method112(false);
                int var123 = class82.field1733.method105(1375221240);
                class154 var124;
                if (var122 >= 0) {
                    var124 = class44.method403(var122, true);
                } else {
                    var124 = null;
                }
                if (var124 != null) {
                    for (int var125 = 0; var125 < var124.field3496.length; var125++) {
                        var124.field3496[var125] = 0;
                        var124.field3450[var125] = 0;
                    }
                }
                if (var122 < -70000) {
                    var123 += 32768;
                }
                class44.method406((byte) 53, var123);
                int var126 = class82.field1733.method105(1375221240);
                for (int var127 = 0; var127 < var126; var127++) {
                    int var128 = class82.field1733.method128((byte) 83);
                    int var129 = class82.field1733.method120(18235);
                    if (var129 == 255) {
                        var129 = class82.field1733.method124(-3);
                    }
                    if (var124 != null && var127 < var124.field3496.length) {
                        var124.field3496[var127] = var128;
                        var124.field3450[var127] = var129;
                    }
                    class109.method907(var127, var123, 1, var129, var128 - 1);
                }
                if (var124 != null) {
                    class138.method1092(0, var124);
                }
                class88.method731(0);
                class60.field1167[class4.method34(class100.field2102++, 31)] = class4.method34(var123, 32767);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 178) {
                byte var130 = class82.field1733.method158(-32768);
                int var131 = class82.field1733.method111(108);
                class27.field638[var131] = var130;
                if (class153.field3376[var131] != var130) {
                    class153.field3376[var131] = var130;
                    class13.method125(var131, true);
                }
                class152.field3356[class4.method34(31, class114.field2510++)] = var131;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 95) {
                int var132 = class82.field1733.method139(100);
                class127.field2812 = class35.field755.method245((byte) 121, var132);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 229) {
                class112.field2407 = class82.field1733.method128((byte) 83) * 30;
                class68.field1381 = class9.field219;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 222) {
                class88.method731(0);
                class120.field2669 = class82.field1733.method114(-8859);
                class68.field1381 = class9.field219;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 116) {
                int var133 = class82.field1733.method128((byte) 83);
                int var134 = class82.field1733.method136(2);
                int var135 = class82.field1733.method139(87);
                int var136 = class82.field1733.method128((byte) 83);
                class154 var137 = class44.method403(var135, true);
                if (var137.field3503 != var136 || var137.field3475 != var133 || var137.field3494 != var134) {
                    var137.field3475 = var133;
                    var137.field3503 = var136;
                    var137.field3494 = var134;
                    class138.method1092(0, var137);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 179) {
                int var138 = class82.field1733.method136(2);
                if (var138 == 65535) {
                    var138 = -1;
                }
                class53.method435(var138, -98);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 20) {
                int var139 = class82.field1733.method153(23758);
                int var140 = class82.field1733.method128((byte) 83);
                if (var140 == 65535) {
                    var140 = -1;
                }
                class113.method934((byte) 76, var140, var139);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 45) {
                int var141 = class82.field1733.method105(1375221240);
                class19.field472 = var141;
                method1167(var141, (byte) -105);
                class14.method165(class19.field472, false);
                for (int var142 = 0; var142 < 100; var142++) {
                    class120.field2663[var142] = true;
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 213) {
                class52.field1075 = class82.field1733.method142(27467);
                class7.field175 = class82.field1733.method142(27467);
                class74.field1493 = class82.field1733.method142(27467);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 165) {
                class17.field432 = class82.field1733.method142(27467);
                class13.field333 = class82.field1733.method120(18235);
                for (int var143 = class13.field333; var143 < class13.field333 + 8; var143++) {
                    for (int var144 = class17.field432; var144 < class17.field432 + 8; var144++) {
                        if (class92.field1987[class75.field1513][var143][var144] != null) {
                            class92.field1987[class75.field1513][var143][var144] = null;
                            class68.method534(var143, var144, -1610612736);
                        }
                    }
                }
                for (class133 var145 = (class133) class27.field630.method195((byte) 118); var145 != null; var145 = (class133) class27.field630.method198((byte) -111)) {
                    if (class13.field333 <= var145.field2908 && class13.field333 + 8 > var145.field2908 && class17.field432 <= var145.field2910 && var145.field2910 < class17.field432 + 8 && class75.field1513 == var145.field2905) {
                        var145.field2891 = 0;
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 105) {
                int var146 = class82.field1733.method124(-3);
                class109 var147 = class82.field1733.method140(0);
                class154 var148 = class44.method403(var146, true);
                if (!var147.method908(var148.field3451, (byte) 114)) {
                    var148.field3451 = var147;
                    class138.method1092(0, var148);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 234) {
                int var149 = class82.field1733.method136(2);
                class48.method418(120, var149);
                class60.field1167[class4.method34(class100.field2102++, 31)] = class4.method34(32767, var149);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 18) {
                int var150 = class82.field1733.method112(false);
                int var151 = class82.field1733.method105(1375221240);
                class154 var152;
                if (var150 < 0) {
                    var152 = null;
                } else {
                    var152 = class44.method403(var150, true);
                }
                if (var150 < -70000) {
                    var151 += 32768;
                }
                while (class109.field2286 > class82.field1733.field309) {
                    int var153 = class82.field1733.method147(false);
                    int var154 = 0;
                    int var155 = class82.field1733.method105(1375221240);
                    if (var155 != 0) {
                        var154 = class82.field1733.method142(27467);
                        if (var154 == 255) {
                            var154 = class82.field1733.method112(false);
                        }
                    }
                    if (var152 != null && var153 >= 0 && var153 < var152.field3496.length) {
                        var152.field3496[var153] = var155;
                        var152.field3450[var153] = var154;
                    }
                    class109.method907(var153, var151, 1, var154, var155 - 1);
                }
                if (var152 != null) {
                    class138.method1092(0, var152);
                }
                class88.method731(0);
                class60.field1167[class4.method34(31, class100.field2102++)] = class4.method34(var151, 32767);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 219) {
                int var156 = class82.field1733.method128((byte) 83);
                int var157 = class82.field1733.method127(18618);
                class27.field638[var156] = var157;
                if (class153.field3376[var156] != var157) {
                    class153.field3376[var156] = var157;
                    class13.method125(var156, true);
                }
                class152.field3356[class4.method34(class114.field2510++, 31)] = var156;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 134) {
                class17.field432 = class82.field1733.method108(0);
                class13.field333 = class82.field1733.method120(18235);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 74) {
                int var158 = class82.field1733.method128((byte) 83);
                if (var158 == 65535) {
                    var158 = -1;
                }
                int var159 = class82.field1733.method127(18618);
                int var160 = class82.field1733.method127(18618);
                class154 var161 = class44.method403(var159, true);
                if (var161.field3473) {
                    var161.field3386 = var158;
                    var161.field3474 = var160;
                    class112 var163 = class4.method43((byte) 94, var158);
                    var161.field3475 = var163.field2410;
                    var161.field3487 = var163.field2379;
                    var161.field3494 = var163.field2406;
                    var161.field3464 = var163.field2394;
                    var161.field3469 = var163.field2378;
                    if (var161.field3427 > 0) {
                        var161.field3494 = var161.field3494 * 32 / var161.field3427;
                    }
                    var161.field3503 = var163.field2395;
                    class138.method1092(0, var161);
                } else if (var158 == -1) {
                    class17.field423 = -1;
                    var161.field3433 = 0;
                    return true;
                } else {
                    class112 var162 = class4.method43((byte) 94, var158);
                    var161.field3505 = var158;
                    var161.field3475 = var162.field2410;
                    var161.field3503 = var162.field2395;
                    var161.field3494 = var162.field2406 * 100 / var160;
                    var161.field3433 = 4;
                    class138.method1092(0, var161);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 241) {
                class88.method731(0);
                class102.field2147 = class82.field1733.method142(27467);
                class17.field423 = -1;
                class68.field1381 = class9.field219;
                return true;
            }
            if (class17.field423 == 198) {
                method1168(4, false);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 32) {
                class95.field2050 = class82.field1733.method142(27467);
                class17.field423 = -1;
                class75.field1498 = class9.field219;
                return true;
            }
            if (class17.field423 == 104) {
                int var164 = class82.field1733.method112(false);
                int var165 = class82.field1733.method105(1375221240);
                class154 var166 = class44.method403(var164, true);
                if (var166.field3433 != 2 || var166.field3505 != var165) {
                    var166.field3433 = 2;
                    var166.field3505 = var165;
                    class138.method1092(0, var166);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 196) {
                int var167 = class82.field1733.method111(127);
                if (var167 == 65535) {
                    var167 = -1;
                }
                int var168 = class82.field1733.method124(-3);
                int var169 = class82.field1733.method124(-3);
                int var170 = class82.field1733.method111(107);
                if (var170 == 65535) {
                    var170 = -1;
                }
                for (int var171 = var167; var171 <= var170; var171++) {
                    long var172 = ((long) var169 << 32) + (long) var171;
                    class12 var174 = class100.field2095.method505((byte) -46, var172);
                    if (var174 != null) {
                        var174.method101((byte) 86);
                    }
                    class100.field2095.method503(-1, new class158(var168), var172);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 82) {
                int var175 = class82.field1733.method108(0);
                int var176 = class82.field1733.method120(18235);
                class109 var177 = class82.field1733.method140(0);
                if (var175 >= 1 && var175 <= 8) {
                    if (var177.method884(class147.field3216, 117)) {
                        var177 = null;
                    }
                    class50.field1040[var175 - 1] = var177;
                    class68.field1378[var175 - 1] = var176 == 0;
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 252) {
                int var178 = class82.field1733.method112(false);
                class79 var179 = (class79) class134.field2916.method505((byte) -46, (long) var178);
                if (var179 != null) {
                    class15.method178(true, var179, (byte) 5);
                }
                if (class121.field2679 != null) {
                    class138.method1092(0, class121.field2679);
                    class121.field2679 = null;
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 1) {
                int var180 = class82.field1733.method111(112);
                int var181 = class82.field1733.method136(2);
                int var182 = class82.field1733.method127(18618);
                class154 var183 = class44.method403(var182, true);
                class17.field423 = -1;
                var183.field3461 = (var180 << 16) + var181;
                return true;
            }
            if (class17.field423 == 71) {
                class63.field1295 = class109.field2286 / 8;
                for (int var184 = 0; var184 < class63.field1295; var184++) {
                    class38.field838[var184] = class82.field1733.method116(0);
                    class143.field3155[var184] = class72.method582(false, class38.field838[var184]);
                }
                class17.field423 = -1;
                class75.field1498 = class9.field219;
                return true;
            }
            if (class17.field423 == 118) {
                class109 var185 = class82.field1733.method140(0);
                Object[] var186 = new Object[var185.method898((byte) 122) + 1];
                for (int var187 = var185.method898((byte) 126) - 1; var187 >= 0; var187--) {
                    if (var185.method906(var187, false) == 115) {
                        var186[var187 + 1] = class82.field1733.method140(0);
                    } else {
                        var186[var187 + 1] = Integer.valueOf(class82.field1733.method112(false));
                    }
                }
                var186[0] = Integer.valueOf(class82.field1733.method112(false));
                class93 var188 = new class93();
                var188.field2001 = var186;
                class123.method1003(var188, (byte) 45);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 136) {
                int var189 = class82.field1733.method139(121);
                int var190 = class82.field1733.method136(2);
                class154 var191 = class44.method403(var189, true);
                if (var191.field3433 != 1 || var191.field3505 != var190) {
                    var191.field3505 = var190;
                    var191.field3433 = 1;
                    class138.method1092(0, var191);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 246) {
                int var192 = class82.field1733.method142(27467);
                int var193 = class82.field1733.method142(27467);
                int var194 = class82.field1733.method142(27467);
                int var195 = class82.field1733.method142(27467);
                class18.field446[var192] = true;
                class87.field1850[var192] = var193;
                class116.field2576[var192] = var194;
                class89.field1891[var192] = var195;
                class35.field789[var192] = 0;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 206) {
                class88.method731(0);
                int var196 = class82.field1733.method139(-55);
                int var197 = class82.field1733.method108(0);
                int var198 = class82.field1733.method120(18235);
                class92.field1968[var197] = var196;
                class76.field1530[var197] = var198;
                class14.field375[var197] = 1;
                for (int var199 = 0; var199 < 98; var199++) {
                    if (var196 >= class118.field2624[var199]) {
                        class14.field375[var197] = var199 + 2;
                    }
                }
                class66.field1328[class4.method34(31, class128.field2835++)] = var197;
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 164) {
                class99.method800(0);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 168) {
                for (int var200 = 0; var200 < class153.field3376.length; var200++) {
                    if (class27.field638[var200] != class153.field3376[var200]) {
                        class153.field3376[var200] = class27.field638[var200];
                        class13.method125(var200, true);
                        class152.field3356[class4.method34(31, class114.field2510++)] = var200;
                    }
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 211) {
                class109 var201 = class82.field1733.method140(0);
                if (var201.method903((byte) -82, class9.field221)) {
                    class109 var202 = var201.method872(var201.method896(class45.field950, -1), -34, 0);
                    long var203 = var202.method889(true);
                    boolean var205 = false;
                    for (int var206 = 0; var206 < class63.field1295; var206++) {
                        if (class38.field838[var206] == var203) {
                            var205 = true;
                            break;
                        }
                    }
                    if (!var205 && class118.field2617 == 0) {
                        class75.method593(4, var202, -8870, class52.field1081);
                    }
                } else if (var201.method903((byte) -115, class133.field2913)) {
                    class109 var207 = var201.method872(var201.method896(class45.field950, -1), -125, 0);
                    long var208 = var207.method889(true);
                    boolean var210 = false;
                    for (int var211 = 0; var211 < class63.field1295; var211++) {
                        if (class38.field838[var211] == var208) {
                            var210 = true;
                            break;
                        }
                    }
                    if (!var210 && class118.field2617 == 0) {
                        class75.method593(8, var207, -8870, class18.field444);
                    }
                } else if (var201.method903((byte) -85, class15.field391)) {
                    class109 var220 = var201.method872(var201.method896(class45.field950, -1), -125, 0);
                    long var221 = var220.method889(true);
                    boolean var223 = false;
                    for (int var224 = 0; var224 < class63.field1295; var224++) {
                        if (class38.field838[var224] == var221) {
                            var223 = true;
                            break;
                        }
                    }
                    if (!var223 && class118.field2617 == 0) {
                        class109 var225 = var201.method872(var201.method898((byte) 127) - 9, -122, var201.method896(class45.field950, -1) + 1);
                        class75.method593(8, var220, -8870, var225);
                    }
                } else if (var201.method903((byte) -102, class157.field3634)) {
                    boolean var212 = false;
                    class109 var213 = var201.method872(var201.method896(class45.field950, -1), -127, 0);
                    long var214 = var213.method889(true);
                    for (int var216 = 0; var216 < class63.field1295; var216++) {
                        if (class38.field838[var216] == var214) {
                            var212 = true;
                            break;
                        }
                    }
                    if (!var212 && class118.field2617 == 0) {
                        class75.method593(10, var213, -8870, class131.field2866);
                    }
                } else if (var201.method903((byte) -96, class112.field2443)) {
                    class109 var219 = var201.method872(var201.method896(class112.field2443, -1), -125, 0);
                    class75.method593(11, class131.field2866, -8870, var219);
                } else if (var201.method903((byte) -88, class7.field174)) {
                    class109 var217 = var201.method872(var201.method896(class7.field174, -1), -23, 0);
                    if (class118.field2617 == 0) {
                        class75.method593(12, class131.field2866, -8870, var217);
                    }
                } else if (var201.method903((byte) -105, class23.field554)) {
                    class109 var218 = var201.method872(var201.method896(class23.field554, -1), -19, 0);
                    if (class118.field2617 == 0) {
                        class75.method593(13, class131.field2866, -8870, var218);
                    }
                } else {
                    class75.method593(0, class131.field2866, -8870, var201);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 29) {
                class17.field432 = class82.field1733.method132((byte) -107);
                class13.field333 = class82.field1733.method132((byte) -89);
                while (class109.field2286 > class82.field1733.field309) {
                    class17.field423 = class82.field1733.method142(27467);
                    class145.method1141((byte) 0);
                }
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 130) {
                long var226 = class82.field1733.method116(0);
                class109 var228 = class70.method550(class139.method1098(class82.field1733, 50).method883((byte) -99));
                class75.method593(6, class72.method582(false, var226).method902((byte) 42), -8870, var228);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 56) {
                class78.method627(0);
                class17.field423 = -1;
                return true;
            }
            if (class17.field423 == 42) {
                long var229 = class82.field1733.method116(0);
                long var231 = (long) class82.field1733.method105(1375221240);
                long var233 = (long) class82.field1733.method149(true);
                long var235 = (var231 << 32) + var233;
                int var237 = class82.field1733.method142(27467);
                boolean var238 = false;
                for (int var239 = 0; var239 < 100; var239++) {
                    if (class91.field1963[var239] == var235) {
                        var238 = true;
                        break;
                    }
                }
                if (var237 <= 1) {
                    for (int var240 = 0; var240 < class63.field1295; var240++) {
                        if (class38.field838[var240] == var229) {
                            var238 = true;
                            break;
                        }
                    }
                }
                if (!var238 && class118.field2617 == 0) {
                    class91.field1963[class151.field3314] = var235;
                    class151.field3314 = (class151.field3314 + 1) % 100;
                    class109 var241 = class70.method550(class139.method1098(class82.field1733, 50).method883((byte) -122));
                    if (var237 == 2 || var237 == 3) {
                        class75.method593(7, class44.method405(new class109[] { class16.field403, class72.method582(false, var229).method902((byte) 42) }, (byte) -74), -8870, var241);
                    } else if (var237 == 1) {
                        class75.method593(7, class44.method405(new class109[] { class82.field1761, class72.method582(false, var229).method902((byte) 42) }, (byte) -74), -8870, var241);
                    } else {
                        class75.method593(3, class72.method582(false, var229).method902((byte) 42), -8870, var241);
                    }
                }
                class17.field423 = -1;
                return true;
            }
            class112.method921("T1 - " + class17.field423 + "," + class157.field3608 + "," + class55.field1111 + " - " + class109.field2286, false, null);
            class68.method525(1001);
        } catch (IOException var245) {
            class15.method177((byte) -38);
        } catch (Exception var246) {
            String var243 = "T2 - " + class17.field423 + "," + class157.field3608 + "," + class55.field1111 + " - " + class109.field2286 + "," + (class43.field917 + class136.field2975.field3120[0]) + "," + (class136.field2975.field3121[0] + class82.field1736) + " - ";
            for (int var244 = 0; class109.field2286 > var244 && var244 < 50; var244++) {
                var243 = var243 + class82.field1733.field279[var244] + ",";
            }
            class112.method921(var243, false, var246);
            class68.method525(1001);
        }
        return true;
    }
}
