import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class93 implements class164 {

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Z")
    private boolean field1750 = false;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    private int field1744 = 50;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lpi;")
    private class181 field1741;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lpi;")
    private class181 field1756;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lej;")
    private class188 field1728;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Lej;")
    private class188 field1738;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[B")
    private byte[] field1734;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "[Z")
    private boolean[] field1755;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[Z")
    private boolean[] field1745;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "[Z")
    private boolean[] field1762;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[S")
    private short[] field1747;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[B")
    private byte[] field1754;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[Z")
    private boolean[] field1735;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "[Z")
    private boolean[] field1760;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[B")
    private byte[] field1729;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[B")
    private byte[] field1739;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lge;")
    public static class235 field1727 = new class235(8);

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lha;")
    public static class46 field1752 = class271.method1828("null", -46);

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1761 = 1;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "[I")
    public static int[] field1758 = new int[2048];

    @OriginalMember(owner = "client!id", name = "I", descriptor = "[[S")
    public static short[][] field1759 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)I")
    public static final int method721(boolean arg0, int arg1) {
        field1749++;
        int var2 = (arg1 & 0x55555555) + ((arg1 & 0xAAAAAAAA) >>> 1);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (!arg0) {
            field1751 = -93;
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)Z")
    public final boolean method722(int arg0, byte arg1) {
        field1748++;
        class135 var3 = this.method734(-66, arg0);
        int var4 = 115 / ((arg1 + 10) / 58);
        return var3 == null ? false : var3.method1043(this.field1741, this, false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z")
    public final boolean method723(int arg0, int arg1) {
        field1730++;
        if (arg1 != 28501) {
            this.method722(-119, (byte) -102);
        }
        return this.field1735[arg0];
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lha;ZI)V")
    public static final void method724(class46 arg0, boolean arg1, int arg2) {
        class46 var3 = arg0.method305(109);
        field1736++;
        int var4 = 0;
        short[] var5 = new short[arg2];
        for (int var6 = 0; var6 < class99.field1836; var6++) {
            class71 var9 = class80.method633(var6, arg2 ^ 0x10);
            if ((!arg1 || var9.field1218) && var9.field1222 == -1 && var9.field1279 == -1 && var9.field1286 == 0 && var9.field1213.method305(-74).method342(var3, -6645) != -1) {
                if (var4 >= 250) {
                    class5.field84 = null;
                    class214.field3796 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class5.field84 = var5;
        class214.field3796 = var4;
        class108.field2007 = 0;
        class46[] var7 = new class46[class214.field3796];
        for (int var8 = 0; var8 < class214.field3796; var8++) {
            var7[var8] = class80.method633(var5[var8], 0).field1213;
        }
        class43.method288(var7, class5.field84, arg2 ^ 0xFFFFFFEE);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIF)[I")
    public final int[] method725(int arg0, int arg1, float arg2) {
        if (arg1 != 238) {
            this.field1756 = null;
        }
        field1737++;
        class135 var4 = this.method734(-8, arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field2440 = true;
            return var4.method1041(this.field1750 || this.field1760[arg0], this, arg2, this.field1741, -59);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(II)V")
    public final void method726(int arg0, int arg1) {
        if (arg1 <= 90) {
            return;
        }
        field1740++;
        for (class135 var3 = (class135) this.field1728.method1367((byte) -112); var3 != null; var3 = (class135) this.field1728.method1365(-8846)) {
            if (var3.field2440) {
                var3.method1045(arg0, (byte) -121);
                var3.field2440 = false;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public final void method727(int arg0) {
        if (arg0 != 0) {
            field1751 = -125;
        }
        field1764++;
        this.field1728.method1363(102);
        if (this.field1738 != null) {
            this.field1738.method1363(-45);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
    public final int method728(int arg0, byte arg1) {
        if (arg1 > -71) {
            return 103;
        } else {
            field1763++;
            return this.field1747[arg0] & 0xFFFF;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
    public static final void method729(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1742++;
        class262.method1753(arg3, arg1, arg3 + arg2, arg1 - -arg4);
        class262.method1762(arg3, arg1, arg2, arg4, 0);
        if (class46.field764 < 100) {
            return;
        }
        if (class171.field3056 == null || class171.field3056.field4578 != arg2 || class171.field3056.field4581 != arg4) {
            class21 var5 = new class21(arg2, arg4);
            class262.method1755(var5.field277, arg2, arg4);
            class68.method494(class49.field836, arg0 - 1489, 0, 0, 0, arg4, arg2, 0, class137.field2474);
            class171.field3056 = var5;
            class177.field3176.method914(-115);
        }
        class171.field3056.method127(arg3, arg1);
        int var6 = class106.field1955 * arg2 / class137.field2474 + arg3;
        int var7 = class155.field2755 * arg2 / class137.field2474;
        int var8 = class49.field842 * arg4 / class49.field836;
        int var9 = class272.field4744 * arg4 / class49.field836 + arg1;
        if (arg0 != 1457) {
            method731(-70, 119);
        }
        class262.method1766(var6, var9, var7, var8, 16711680, 128);
        class262.method1769(var6, var9, var7, var8, 16711680);
        if (class70.field1203 <= 0 || class70.field1203 % 10 >= 5) {
            return;
        }
        for (class33 var10 = (class33) class252.field4438.method264(-69); var10 != null; var10 = (class33) class252.field4438.method269((byte) 7)) {
            if (class251.field4434 == var10.field613) {
                int var11 = arg3 + (var10.field609 * arg2 / class137.field2474);
                int var12 = arg1 + (var10.field618 * arg4 / class49.field836);
                class262.method1762(var11 - 2, var12 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Z")
    public final boolean method730(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method725(-14, 66, 1.5742971F);
        }
        field1725++;
        return this.field1750 || this.field1760[arg1];
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(II)V")
    public static final void method731(int arg0, int arg1) {
        field1732++;
        class21 var2;
        if (class63.field1075 == null) {
            var2 = new class21(512, 512);
        } else {
            var2 = (class21) class63.field1075;
        }
        int[] var3 = var2.field277;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = ((52736 - var6 * 512) * 4) + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class111.field2081[arg0][var25][var6] & 0x18) == 0) {
                    class74.method541(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (class111.field2081[arg0 + 1][var25][var6] & 0x8) != 0) {
                    class74.method541(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method112();
        int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D) + 238 - 10 << 8) - (10 - ((int) (Math.random() * 20.0D)) - 238));
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class111.field2081[arg0][var23][var9] & 0x18) == 0) {
                    class264.method1781(arg0, 24624, var9, var7, var8, var23);
                }
                if (arg0 < 3 && (class111.field2081[arg0 + 1][var23][var9] & 0x8) != 0) {
                    class264.method1781(arg0 + 1, 24624, var9, var7, var8, var23);
                }
            }
        }
        class250.field4417 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class57.method397(class135.field2450, var10, var11);
                if (var12 != 0L) {
                    class236 var14 = class157.method1158((int) (var12 >>> 32) & Integer.MAX_VALUE, 116);
                    int var15 = var14.field4150;
                    if (var14.field4142 != null) {
                        for (int var16 = 0; var16 < var14.field4142.length; var16++) {
                            if (var14.field4142[var16] != -1) {
                                class236 var17 = class157.method1158(var14.field4142[var16], 117);
                                if (var17.field4150 >= 0) {
                                    var15 = var17.field4150;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class183.field3282[class135.field2450].field2718;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var18 > var10 - 3 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && var10 + 3 > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && (var11 - 3) < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class32.field599[class250.field4417] = var14.field4146;
                        class84.field1609[class250.field4417] = var18;
                        class54.field927[class250.field4417] = var19;
                        class250.field4417++;
                    }
                }
            }
        }
        if (arg1 > -71) {
            field1752 = null;
        }
        class63.field1075 = var2;
        class177.field3176.method914(-94);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZ)V")
    public final void method732(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method727(-116);
        }
        this.field1750 = arg1;
        this.method727(0);
        field1733++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)[I")
    public final int[] method733(byte arg0, int arg1) {
        field1731++;
        class135 var3 = this.method734(87, arg1);
        if (arg0 != -76) {
            method736((byte) 84);
        }
        return var3 == null ? null : var3.method1042((byte) -70, this.field1741, this, this.field1750 || this.field1760[arg1]);
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(II)Lhb;")
    private final class135 method734(int arg0, int arg1) {
        class135 var3 = (class135) this.field1728.method1364((long) arg1, -21987);
        field1726++;
        if (var3 != null) {
            return var3;
        }
        int var4 = -79 / ((arg0 - 47) / 32);
        byte[] var5 = this.field1756.method1293(0, arg1, (byte) -115);
        if (var5 == null) {
            return null;
        } else {
            class75 var6 = new class75(var5);
            class135 var7 = new class135(var6);
            this.field1728.method1366(true, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(II)Z")
    public final boolean method735(int arg0, int arg1) {
        field1746++;
        return arg0 == -1 ? this.field1762[arg1] : true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method736(byte arg0) {
        if (arg0 <= -51) {
            field1752 = null;
            field1759 = null;
            field1758 = null;
            field1727 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILha;I)V")
    public static final void method737(int arg0, class46 arg1, int arg2) {
        class58.field967.method285((byte) -90, 33);
        class140.field2510++;
        if (arg2 != 0) {
            method737(-16, (class46) null, -7);
        }
        class58.field967.method593(arg0, -16777216);
        field1743++;
        class58.field967.method561(arg1.method349((byte) 59), -820803616);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lpi;Lpi;Lpi;IZ)V")
    public class93(class181 arg0, class181 arg1, class181 arg2, int arg3, boolean arg4) {
        this.field1741 = arg2;
        this.field1750 = arg4;
        this.field1744 = arg3;
        this.field1756 = arg0;
        this.field1728 = new class188(this.field1744);
        this.field1738 = null;
        class75 var6 = new class75(arg1.method1293(0, 0, (byte) -84));
        int var7 = var6.method545((byte) -115);
        this.field1734 = new byte[var7];
        this.field1755 = new boolean[var7];
        this.field1745 = new boolean[var7];
        this.field1762 = new boolean[var7];
        this.field1747 = new short[var7];
        this.field1754 = new byte[var7];
        this.field1735 = new boolean[var7];
        this.field1760 = new boolean[var7];
        this.field1729 = new byte[var7];
        this.field1739 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1755[var8] = var6.method558(1) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1755[var9]) {
                this.field1762[var9] = var6.method558(1) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1755[var10]) {
                this.field1735[var10] = var6.method558(1) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1755[var11]) {
                this.field1760[var11] = var6.method558(1) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1755[var12]) {
                this.field1745[var12] = var6.method558(1) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1755[var13]) {
                this.field1734[var13] = var6.method569((byte) -110);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1755[var14]) {
                this.field1729[var14] = var6.method569((byte) -110);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1755[var15]) {
                this.field1739[var15] = var6.method569((byte) -110);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1755[var16]) {
                this.field1754[var16] = var6.method569((byte) -110);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1755[var17]) {
                this.field1747[var17] = (short) var6.method545((byte) 75);
            }
        }
    }
}
