import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 {

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    private int field445 = 0;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "[Lw;")
    private class127[] field444;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lhb;")
    public static class44 field435 = class102.method810(" hat sich ausgeloggt)3", -28606);

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lhb;")
    public static class44 field436 = class102.method810("Lade Sprites )2 ", -28606);

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Lhb;")
    public static class44 field439 = class102.method810("b12_full", -28606);

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field441 = 0;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[I")
    public static int[] field443 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field425 = 0;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[I")
    public static int[] field440 = new int[2000];

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lhb;")
    private static class44 field447 = class102.method810("Your profile will be transferred in:", -28606);

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lhb;")
    public static class44 field433 = field447;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "J")
    private long field430;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lva;")
    public static class123 field423;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Lw;")
    private class127 field437;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lw;")
    private class127 field448;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 14)
    public static final void method151(boolean arg0) {
        field428++;
        try {
            Graphics var1 = class22.field483.getGraphics();
            class121.field2954.method143(553, var1, -10166, 205);
            if (!arg0) {
                method157(74);
            }
        } catch (Exception var2) {
            class22.field483.repaint();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lw;", line = 37)
    public final class127 method152(int arg0) {
        if (arg0 != -2368) {
            this.method152(-58);
        }
        field424++;
        if (this.field437 == null) {
            return null;
        }
        class127 var2 = this.field444[(int) (this.field430 & (long) (this.field431 - 1))];
        while (this.field437 != var2) {
            if (this.field437.field3057 == this.field430) {
                class127 var3 = this.field437;
                this.field437 = this.field437.field3059;
                return var3;
            }
            this.field437 = this.field437.field3059;
        }
        this.field437 = null;
        return null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)Lw;", line = 67)
    public final class127 method153(boolean arg0) {
        this.field445 = 0;
        if (arg0) {
            this.method158(-116L, null, -112);
        }
        field438++;
        return this.method155(0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)Lw;", line = 108)
    public final class127 method154(int arg0, long arg1) {
        field434++;
        this.field430 = arg1;
        class127 var4 = this.field444[(int) ((long) (this.field431 + arg0) & arg1)];
        for (this.field437 = var4.field3059; this.field437 != var4; this.field437 = this.field437.field3059) {
            if (this.field437.field3057 == arg1) {
                class127 var5 = this.field437;
                this.field437 = this.field437.field3059;
                return var5;
            }
        }
        this.field437 = null;
        return null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lw;", line = 138)
    private final class127 method155(int arg0) {
        field426++;
        if (this.field445 > arg0 && this.field444[this.field445 - 1] != this.field448) {
            class127 var2 = this.field448;
            this.field448 = var2.field3059;
            return var2;
        }
        while (this.field431 > this.field445) {
            class127 var3 = this.field444[this.field445++].field3059;
            if (this.field444[this.field445 - 1] != var3) {
                this.field448 = var3.field3059;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 168)
    public static void method156(int arg0) {
        field443 = null;
        field435 = null;
        field423 = null;
        field439 = null;
        int var1 = -8 / ((-arg0 - 62) / 50);
        field436 = null;
        field433 = null;
        field447 = null;
        field440 = null;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V", line = 185)
    public static final void method157(int arg0) {
        class27.field619 = true;
        field442++;
        class2.method17(-13824);
        if (class116.field2843) {
            class34.field820.method294(class51.field1232, 239, 40, 0);
            class34.field820.method294(class117.method903(new class44[] { class51.field1238, class5.field129 }, false), 239, 60, 128);
        } else if (class79.field1990 == 1) {
            class34.field820.method294(class107.field2704, 239, 40, 0);
            class34.field820.method294(class117.method903(new class44[] { class51.field1257, class5.field129 }, false), 239, 60, 128);
        } else if (class79.field1990 == 2) {
            class34.field820.method294(class100.field2549, 239, 40, 0);
            class34.field820.method294(class117.method903(new class44[] { class51.field1257, class5.field129 }, false), 239, 60, 128);
        } else if (class79.field1990 == 3) {
            if (class51.field1257 != class51.field1234) {
                class127.method952((byte) -124, class51.field1257);
                class51.field1234 = class51.field1257;
            }
            class30 var17 = class103.field2631;
            class112.method859(0, 0, 463, 77);
            for (int var18 = 0; var18 < class102.field2602; var18++) {
                int var19 = var18 * 14 + 18 - class100.field2518;
                if (var19 > 0 && var19 < 110) {
                    var17.method294(class120.field2924[var18], 239, var19, 0);
                }
            }
            class112.method861();
            if (class102.field2602 > 5) {
                class129.method964(0, 77, -104, 463, class100.field2518, class102.field2602 * 14 + 7);
            }
            if (class51.field1257.method414((byte) 27) == 0) {
                class34.field820.method294(class89.field2280, 239, 40, 255);
            } else if (class102.field2602 == 0) {
                class34.field820.method294(class61.field1559, 239, 40, 0);
            }
            var17.method294(class117.method903(new class44[] { class51.field1257, class5.field129 }, false), 239, 90, 0);
            class112.method860(0, 77, 479, 0);
        } else if (class131.field3146 != null) {
            class34.field820.method294(class131.field3146, 239, 40, 0);
            class34.field820.method294(class33.field787, 239, 60, 128);
        } else if (class98.field2496 != -1) {
            boolean var1 = class31.method307(0, 0, -7291, -1, 479, 96, 2, 0, class98.field2496);
            if (!var1) {
                class16.field306 = true;
            }
        } else if (class74.field1886 == -1) {
            class30 var2 = class103.field2631;
            class112.method859(0, 0, 463, 77);
            int var3 = 0;
            for (int var4 = 0; var4 < 100; var4++) {
                if (class95.field2409[var4] != null) {
                    int var6 = class86.field2190 + 70 - var3 * 14;
                    int var7 = class95.field2407[var4];
                    byte var8 = 0;
                    class44 var9 = class64.field1624[var4];
                    if (var9 != null && var9.method400((byte) -41, class5.field122)) {
                        var9 = var9.method380(5, (byte) 122);
                        var8 = 1;
                    }
                    if (var9 != null && var9.method400((byte) -98, class48.field1190)) {
                        var8 = 2;
                        var9 = var9.method380(5, (byte) 120);
                    }
                    if (var7 == 0) {
                        var3++;
                        if (var6 > 0 && var6 < 110) {
                            var2.method301(class95.field2409[var4], 4, var6, 0);
                        }
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || class89.field2263 == 0 || class89.field2263 == 1 && class57.method530(var9, false))) {
                        if (var6 > 0 && var6 < 110) {
                            int var10 = 4;
                            if (var8 == 1) {
                                class89.field2272[0].method680(var10, var6 - 12);
                                var10 += 14;
                            }
                            if (var8 == 2) {
                                class89.field2272[1].method680(var10, var6 - 12);
                                var10 += 14;
                            }
                            var2.method301(class117.method903(new class44[] { var9, class92.field2337 }, false), var10, var6, 0);
                            int var11 = var10 + var2.method297(var9) + 8;
                            var2.method301(class95.field2409[var4], var11, var6, 255);
                        }
                        var3++;
                    }
                    if ((var7 == 3 || var7 == 7) && class102.field2590 == 0 && (var7 == 7 || class39.field881 == 0 || class39.field881 == 1 && class57.method530(var9, false))) {
                        if (var6 > 0 && var6 < 110) {
                            byte var12 = 4;
                            var2.method301(class46.field1138, var12, var6, 0);
                            int var13 = var12 + var2.method297(class46.field1138);
                            int var14 = var13 + var2.method293(32);
                            if (var8 == 1) {
                                class89.field2272[0].method680(var14, var6 - 12);
                                var14 += 14;
                            }
                            if (var8 == 2) {
                                class89.field2272[1].method680(var14, var6 - 12);
                                var14 += 14;
                            }
                            var2.method301(class117.method903(new class44[] { var9, class92.field2337 }, false), var14, var6, 0);
                            int var15 = var14 + var2.method297(var9) + 8;
                            var2.method301(class95.field2409[var4], var15, var6, 8388608);
                        }
                        var3++;
                    }
                    if (var7 == 4 && (class71.field1745 == 0 || class71.field1745 == 1 && class57.method530(var9, false))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method301(class117.method903(new class44[] { var9, class120.field2943, class95.field2409[var4] }, false), 4, var6, 8388736);
                        }
                        var3++;
                    }
                    if (var7 == 5 && class102.field2590 == 0 && class39.field881 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method301(class95.field2409[var4], 4, var6, 8388608);
                        }
                        var3++;
                    }
                    if (var7 == 6 && class102.field2590 == 0 && class39.field881 < 2) {
                        var3++;
                        if (var6 > 0 && var6 < 110) {
                            var2.method301(class117.method903(new class44[] { class88.field2241, class120.field2943, var9, class92.field2337 }, false), 4, var6, 0);
                            var2.method301(class95.field2409[var4], var2.method297(class117.method903(new class44[] { class88.field2241, class120.field2943, var9 }, false)) + 12, var6, 8388608);
                        }
                    }
                    if (var7 == 8 && (class71.field1745 == 0 || class71.field1745 == 1 && class57.method530(var9, false))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method301(class117.method903(new class44[] { var9, class120.field2943, class95.field2409[var4] }, false), 4, var6, 8270336);
                        }
                        var3++;
                    }
                }
            }
            class112.method861();
            class127.field3046 = var3 * 14 + 7;
            if (class127.field3046 < 78) {
                class127.field3046 = 78;
            }
            class129.method964(0, 77, arg0 ^ 0x4F, 463, class127.field3046 - class86.field2190 - 77, class127.field3046);
            class44 var5;
            if (class72.field1820 == null || class72.field1820.field2651 == null) {
                var5 = class89.field2282;
            } else {
                var5 = class72.field1820.field2651;
            }
            var2.method301(class117.method903(new class44[] { var5, class92.field2337 }, false), 4, 90, 0);
            var2.method301(class117.method903(new class44[] { class51.field1261, class5.field129 }, false), var2.method297(class117.method903(new class44[] { var5, class96.field2433 }, false)) + 6, 90, 255);
            class112.method860(0, 77, 479, 0);
        } else {
            boolean var16 = class31.method307(0, 0, arg0 ^ 0xFFFFE385, -1, 479, 96, 3, 0, class74.field1886);
            if (!var16) {
                class16.field306 = true;
            }
        }
        if (arg0 != 0) {
            field443 = null;
        }
        if (class15.field289 && class25.field584 == 2) {
            class55.method504(arg0 ^ 0xFFFFAA29);
        }
        class57.method544(1267);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(JLw;I)V", line = 512)
    public final void method158(long arg0, class127 arg1, int arg2) {
        if (arg1.field3060 != null) {
            arg1.method948(arg2 + 22816);
        }
        field427++;
        class127 var5 = this.field444[(int) (arg0 & (long) (this.field431 - 1))];
        arg1.field3057 = arg0;
        arg1.field3060 = var5.field3060;
        arg1.field3059 = var5;
        arg1.field3060.field3059 = arg1;
        if (arg2 != -22711) {
            this.field444 = null;
        }
        arg1.field3059.field3060 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(I)V", line = 556)
    public class21(int arg0) {
        this.field444 = new class127[arg0];
        this.field431 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class127 var3 = this.field444[var2] = new class127();
            var3.field3059 = var3;
            var3.field3060 = var3;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)[Lhc;", line = 578)
    public static final class45[] method159(int arg0) {
        field446++;
        if (arg0 != 25033) {
            return null;
        }
        class45[] var1 = new class45[class101.field2570];
        for (int var2 = 0; var2 < class101.field2570; var2++) {
            class45 var3 = var1[var2] = new class45();
            var3.field1132 = class31.field768;
            var3.field1133 = class77.field1935;
            var3.field1130 = class63.field1602[var2];
            var3.field1129 = class84.field2133[var2];
            var3.field1128 = class41.field941[var2];
            var3.field1127 = class63.field1607[var2];
            byte[] var4 = class84.field2147[var2];
            int var5 = var3.field1128 * var3.field1127;
            var3.field1131 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field1131[var6] = class117.field2861[class118.method914(255, var4[var6])];
            }
        }
        class113.method865(false);
        return var1;
    }
}
