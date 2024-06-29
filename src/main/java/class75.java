import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 {

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    private int field2033 = 0;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    private int field2021;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[Lde;")
    private class24[] field2018;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2008 = 500;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lv;")
    public static class122 field2014 = class55.method425(-104, "Sprites geladen)3");

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[Lv;")
    public static class122[] field2020 = new class122[200];

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lv;")
    public static class122 field2022 = class55.method425(-115, ":chalreq:");

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lv;")
    public static class122 field2019 = class55.method425(-62, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "[I")
    public static int[] field2004 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lv;")
    public static class122 field2013 = class55.method425(-125, "");

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lv;")
    public static class122 field2010 = class55.method425(-51, "@gre@");

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lv;")
    public static class122 field2028 = class55.method425(-70, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lv;")
    public static class122 field2034 = class55.method425(-58, "(X100(U(Y");

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "J")
    private long field2015;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lde;")
    private class24 field2029;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "Lde;")
    private class24 field2032;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lab;")
    public static class3 field2005;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lkb;")
    public static class62 field2011;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lmb;")
    public static class74 field2007;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lmb;")
    public static class74 field2016;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lnd;")
    public static class82 field2025;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 3)
    public static void method629(int arg0) {
        field2034 = null;
        field2010 = null;
        field2004 = null;
        field2019 = null;
        field2025 = null;
        field2028 = null;
        if (arg0 != 16711680) {
            method635((byte) 37);
        }
        field2013 = null;
        field2005 = null;
        field2007 = null;
        field2016 = null;
        field2011 = null;
        field2014 = null;
        field2022 = null;
        field2020 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z", line = 29)
    public static final boolean method630(int arg0, int arg1) {
        field2027++;
        if (!class45.method377((byte) 32, arg0)) {
            return false;
        }
        boolean var2 = false;
        class36[] var3 = class76.field2039[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class36 var5 = var3[var4];
            if (var5 != null && var5.field941 == 6) {
                if (var5.field924 != -1 || var5.field927 != -1) {
                    boolean var6 = class5.method71(var5, (byte) 97);
                    int var7;
                    if (var6) {
                        var7 = var5.field927;
                    } else {
                        var7 = var5.field924;
                    }
                    if (var7 != -1) {
                        class89 var8 = class51.method401(-30325, var7);
                        var5.field876 += class64.field1663;
                        label55: while (true) {
                            do {
                                do {
                                    if (var5.field876 <= var8.field2287[var5.field958]) {
                                        break label55;
                                    }
                                    var5.field876 -= var8.field2287[var5.field958];
                                    var2 = true;
                                    var5.field958++;
                                } while (var5.field958 < var8.field2299.length);
                                var5.field958 -= var8.field2283;
                            } while (var5.field958 >= 0 && var5.field958 < var8.field2299.length);
                            var5.field958 = 0;
                        }
                    }
                }
                if (var5.field910 != 0) {
                    int var9 = var5.field910 >> 16;
                    int var10 = var5.field910 << 16 >> 16;
                    int var11 = class64.field1663 * var9;
                    var2 = true;
                    int var12 = class64.field1663 * var10;
                    var5.field893 = var5.field893 + var12 & 0x7FF;
                    var5.field923 = var5.field923 + var11 & 0x7FF;
                }
            }
        }
        if (arg1 < 101) {
            return false;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)Lde;", line = 112)
    public final class24 method631(long arg0, int arg1) {
        this.field2015 = arg0;
        if (arg1 != -26644) {
            return null;
        }
        class24 var4 = this.field2018[(int) ((long) (this.field2021 - 1) & arg0)];
        field2009++;
        for (this.field2029 = var4.field654; this.field2029 != var4; this.field2029 = this.field2029.field654) {
            if (this.field2029.field644 == arg0) {
                class24 var5 = this.field2029;
                this.field2029 = this.field2029.field654;
                return var5;
            }
        }
        this.field2029 = null;
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lde;", line = 148)
    private final class24 method632(int arg0) {
        if (arg0 != 30) {
            this.field2021 = 22;
        }
        field2023++;
        if (this.field2033 > 0 && this.field2018[this.field2033 - 1] != this.field2032) {
            class24 var2 = this.field2032;
            this.field2032 = var2.field654;
            return var2;
        }
        while (this.field2033 < this.field2021) {
            class24 var3 = this.field2018[this.field2033++].field654;
            if (this.field2018[this.field2033 - 1] != var3) {
                this.field2032 = var3.field654;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JILde;)V", line = 181)
    public final void method633(long arg0, int arg1, class24 arg2) {
        if (arg2.field642 != null) {
            arg2.method249(0);
        }
        field2017++;
        class24 var5 = this.field2018[(int) ((long) (this.field2021 - 1) & arg0)];
        arg2.field642 = var5.field642;
        arg2.field644 = arg0;
        arg2.field654 = var5;
        if (arg1 != -100) {
            field2034 = null;
        }
        arg2.field642.field654 = arg2;
        arg2.field654.field642 = arg2;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 201)
    public static final void method634(int arg0) {
        field2026++;
        if (arg0 != 3316) {
            method635((byte) -17);
        }
        class2.field73 = 0;
        for (int var1 = -1; var1 < class49.field1245 + class108.field2671; var1++) {
            class11 var18;
            if (var1 == -1) {
                var18 = class70.field1828;
            } else if (var1 < class108.field2671) {
                var18 = class125.field3043[class7.field175[var1]];
            } else {
                var18 = class94.field2423[class21.field581[var1 - class108.field2671]];
            }
            if (var18 != null && var18.method112((byte) 115)) {
                if (var18 instanceof class80) {
                    class21 var19 = ((class80) var18).field2089;
                    if (var19.field554 != null) {
                        var19 = var19.method227((byte) -78);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class108.field2671 <= var1) {
                    class21 var22 = ((class80) var18).field2089;
                    if (var22.field565 >= 0 && var22.field565 < class49.field1248.length) {
                        class8.method83(var18, var18.field300 + 15, (byte) -60);
                        if (class5.field134 > -1) {
                            class49.field1248[var22.field565].method985(class5.field134 - 12, class115.field2823 + -30);
                        }
                    }
                    if (class40.field1010 == 1 && class21.field581[var1 - class108.field2671] == class119.field2884 && class16.field396 % 20 < 10) {
                        class8.method83(var18, var18.field300 + 15, (byte) -125);
                        if (class5.field134 > -1) {
                            class59.field1528[0].method985(class5.field134 - 12, class115.field2823 + -28);
                        }
                    }
                } else {
                    class55 var20 = (class55) var18;
                    int var21 = 30;
                    if (var20.field1433 != -1 || var20.field1436 != -1) {
                        class8.method83(var18, var18.field300 + 15, (byte) -89);
                        if (class5.field134 > -1) {
                            if (var20.field1433 != -1) {
                                class24.field666[var20.field1433].method985(class5.field134 - 12, -var21 + class115.field2823);
                                var21 += 25;
                            }
                            if (var20.field1436 != -1) {
                                class49.field1248[var20.field1436].method985(class5.field134 - 12, -var21 + class115.field2823);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class40.field1010 == 10 && class7.field175[var1] == class67.field1736) {
                        class8.method83(var18, var18.field300 + 15, (byte) -75);
                        if (class5.field134 > -1) {
                            class59.field1528[1].method985(class5.field134 - 12, class115.field2823 - var21);
                        }
                    }
                }
                if (var18.field303 != null && (var1 >= class108.field2671 || class84.field2176 == 0 || class84.field2176 == 3 || class84.field2176 == 1 && method637(arg0 ^ 0xCF4, ((class55) var18).field1448))) {
                    class8.method83(var18, var18.field300, (byte) -23);
                    if (class5.field134 > -1 && class122.field2986 > class2.field73) {
                        class122.field2974[class2.field73] = class103.field2545.method809(var18.field303) / 2;
                        class122.field2980[class2.field73] = class103.field2545.field2581;
                        class122.field2972[class2.field73] = class5.field134;
                        class122.field2984[class2.field73] = class115.field2823;
                        class122.field2973[class2.field73] = var18.field316;
                        class122.field2987[class2.field73] = var18.field289;
                        class122.field2982[class2.field73] = var18.field281;
                        class122.field2978[class2.field73] = var18.field303;
                        class2.field73++;
                    }
                }
                if (class16.field396 < var18.field320) {
                    class8.method83(var18, var18.field300 + 15, (byte) -45);
                    if (class5.field134 > -1) {
                        int var23 = var18.field290 * 30 / var18.field277;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class117.method895(class5.field134 - 15, class115.field2823 + -3, var23, 5, 65280);
                        class117.method895(class5.field134 + var23 - 15, class115.field2823 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class16.field396 < var18.field351[var24]) {
                        class8.method83(var18, var18.field300 / 2, (byte) -108);
                        if (class5.field134 > -1) {
                            if (var24 == 1) {
                                class115.field2823 -= 20;
                            }
                            if (var24 == 2) {
                                class5.field134 -= 15;
                                class115.field2823 -= 10;
                            }
                            if (var24 == 3) {
                                class5.field134 += 15;
                                class115.field2823 -= 10;
                            }
                            class61.field1572[var18.field311[var24]].method985(class5.field134 - 12, class115.field2823 + -12);
                            class83.field2169.method811(class119.method914(var18.field308[var24], 10), class5.field134, class115.field2823 + 4, 0);
                            class83.field2169.method811(class119.method914(var18.field308[var24], 10), class5.field134 - 1, class115.field2823 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class2.field73; var2++) {
            int var3 = class122.field2972[var2];
            int var4 = class122.field2974[var2];
            int var5 = class122.field2984[var2];
            int var6 = class122.field2980[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class122.field2984[var17] - class122.field2980[var17] < var5 - -2 && class122.field2984[var17] + 2 > -var6 + var5 && class122.field2974[var17] + class122.field2972[var17] > var3 - var4 && var3 + var4 > class122.field2972[var17] - class122.field2974[var17] && var5 > class122.field2984[var17] - class122.field2980[var17]) {
                        var5 = class122.field2984[var17] - class122.field2980[var17];
                        var7 = true;
                    }
                }
            }
            class5.field134 = class122.field2972[var2];
            class115.field2823 = class122.field2984[var2] = var5;
            class122 var8 = class122.field2978[var2];
            if (class61.field1562 == 0) {
                int var9 = 16776960;
                if (class122.field2973[var2] < 6) {
                    var9 = class28.field732[class122.field2973[var2]];
                }
                if (class122.field2973[var2] == 6) {
                    var9 = class83.field2148 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class122.field2973[var2] == 7) {
                    var9 = class83.field2148 % 20 >= 10 ? 65535 : 255;
                }
                if (class122.field2973[var2] == 8) {
                    var9 = class83.field2148 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class122.field2973[var2] == 9) {
                    int var10 = 150 - class122.field2982[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class122.field2973[var2] == 10) {
                    int var11 = 150 - class122.field2982[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 + 16384000 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 - 100) * 5;
                    }
                }
                if (class122.field2973[var2] == 11) {
                    int var12 = 150 - class122.field2982[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class122.field2987[var2] == 0) {
                    class103.field2545.method811(var8, class5.field134, class115.field2823 + 1, 0);
                    class103.field2545.method811(var8, class5.field134, class115.field2823, var9);
                }
                if (class122.field2987[var2] == 1) {
                    class103.field2545.method801(var8, class5.field134, class115.field2823 + 1, 0, class83.field2148);
                    class103.field2545.method801(var8, class5.field134, class115.field2823, var9, class83.field2148);
                }
                if (class122.field2987[var2] == 2) {
                    class103.field2545.method806(var8, class5.field134, class115.field2823 + 1, 0, class83.field2148);
                    class103.field2545.method806(var8, class5.field134, class115.field2823, var9, class83.field2148);
                }
                if (class122.field2987[var2] == 3) {
                    class103.field2545.method797(var8, class5.field134, class115.field2823 + 1, 0, class83.field2148, 150 - class122.field2982[var2]);
                    class103.field2545.method797(var8, class5.field134, class115.field2823, var9, class83.field2148, 150 - class122.field2982[var2]);
                }
                if (class122.field2987[var2] == 4) {
                    int var13 = class103.field2545.method809(var8);
                    int var14 = (150 - class122.field2982[var2]) * (var13 + 100) / 150;
                    class117.method890(class5.field134 - 50, 0, class5.field134 + 50, 334);
                    class103.field2545.method800(var8, class5.field134 + 50 - var14, class115.field2823 + 1, 0);
                    class103.field2545.method800(var8, class5.field134 + 50 - var14, class115.field2823, var9);
                    class117.method891();
                }
                if (class122.field2987[var2] == 5) {
                    int var15 = 150 - class122.field2982[var2];
                    class117.method890(0, class115.field2823 - class103.field2545.field2581 - 1, 512, class115.field2823 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class103.field2545.method811(var8, class5.field134, var16 + class115.field2823 + 1, 0);
                    class103.field2545.method811(var8, class5.field134, class115.field2823 + var16, var9);
                    class117.method891();
                }
            } else {
                class103.field2545.method811(var8, class5.field134, class115.field2823 + 1, 0);
                class103.field2545.method811(var8, class5.field134, class115.field2823, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 581)
    public static final void method635(byte arg0) {
        class131.field3140.method57(0);
        for (int var1 = 0; var1 < 32; var1++) {
            class74.field1983[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class69.field1821[var2] = 0L;
        }
        field2031++;
        class7.field173 = 0;
        int var3 = 17 / ((arg0 - 67) / 49);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)Z", line = 624)
    public static final boolean method636(byte arg0) {
        long var1 = System.currentTimeMillis();
        int var3 = (int) (var1 - class107.field2639);
        class107.field2639 = var1;
        field2012++;
        if (var3 > 200) {
            var3 = 200;
        }
        class36.field887 += var3;
        if (class8.field206 == 0 && class122.field2976 == 0 && class73.field1922 == 0 && class118.field2843 == 0) {
            return true;
        } else if (class113.field2759 == null) {
            return false;
        } else {
            try {
                if (class36.field887 > 30000) {
                    throw new IOException();
                }
                while (class122.field2976 < 20 && class118.field2843 > 0) {
                    class82 var4 = (class82) class56.field1474.method639((byte) -114);
                    class64 var5 = new class64(4);
                    var5.method523(255, 1);
                    var5.method511(-9943, (int) var4.field644);
                    class113.field2759.method594((byte) 113, 0, var5.field1679, 4);
                    class51.field1297.method633(var4.field644, -100, var4);
                    class118.field2843--;
                    class122.field2976++;
                }
                while (class8.field206 < 20 && class73.field1922 > 0) {
                    class82 var6 = (class82) class28.field730.method578((byte) -35);
                    class64 var7 = new class64(4);
                    var7.method523(255, 0);
                    var7.method511(-9943, (int) var6.field644);
                    class113.field2759.method594((byte) 112, 0, var7.field1679, 4);
                    var6.method1012(-1);
                    class22.field600.method633(var6.field644, -100, var6);
                    class8.field206++;
                    class73.field1922--;
                }
                int var8 = 84 % ((50 - arg0) / 62);
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = class113.field2759.method590((byte) 111);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    byte var11 = 0;
                    class36.field887 = 0;
                    if (field2025 == null) {
                        var11 = 8;
                    } else if (class23.field610 == 0) {
                        var11 = 1;
                    }
                    if (var11 > 0) {
                        int var12 = var11 - class131.field3179.field1617;
                        if (var10 < var12) {
                            var12 = var10;
                        }
                        class113.field2759.method593(var12, true, class131.field3179.field1679, class131.field3179.field1617);
                        if (class122.field2989 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class131.field3179.field1679[class131.field3179.field1617 + var13] = (byte) class32.method290(class131.field3179.field1679[class131.field3179.field1617 + var13], class122.field2989);
                            }
                        }
                        class131.field3179.field1617 += var12;
                        if (class131.field3179.field1617 < var11) {
                            break;
                        }
                        if (field2025 == null) {
                            class131.field3179.field1617 = 0;
                            int var14 = class131.field3179.method520(-114);
                            int var15 = class131.field3179.method506((byte) -90);
                            long var16 = (long) ((var14 << 16) + var15);
                            int var18 = class131.field3179.method520(-115);
                            int var19 = class131.field3179.method487(128);
                            class82 var20 = (class82) class51.field1297.method631(var16, -26644);
                            class25.field685 = true;
                            if (var20 == null) {
                                var20 = (class82) class22.field600.method631(var16, -26644);
                                class25.field685 = false;
                            }
                            if (var20 == null) {
                                throw new IOException();
                            }
                            int var21 = var18 == 0 ? 5 : 9;
                            field2025 = var20;
                            class64.field1643 = new class64(var19 + var21 + field2025.field2129);
                            class64.field1643.method523(255, var18);
                            class64.field1643.method509((byte) -90, var19);
                            class131.field3179.field1617 = 0;
                            class23.field610 = 8;
                        } else if (class23.field610 == 0) {
                            if (class131.field3179.field1679[0] == -1) {
                                class131.field3179.field1617 = 0;
                                class23.field610 = 1;
                            } else {
                                field2025 = null;
                            }
                        }
                    } else {
                        int var22 = 512 - class23.field610;
                        int var23 = class64.field1643.field1679.length - field2025.field2129;
                        if (var23 - class64.field1643.field1617 < var22) {
                            var22 = var23 - class64.field1643.field1617;
                        }
                        if (var10 < var22) {
                            var22 = var10;
                        }
                        class113.field2759.method593(var22, true, class64.field1643.field1679, class64.field1643.field1617);
                        if (class122.field2989 != 0) {
                            for (int var24 = 0; var24 < var22; var24++) {
                                class64.field1643.field1679[class64.field1643.field1617 + var24] = (byte) class32.method290(class64.field1643.field1679[class64.field1643.field1617 + var24], class122.field2989);
                            }
                        }
                        class64.field1643.field1617 += var22;
                        class23.field610 += var22;
                        if (class64.field1643.field1617 == var23) {
                            if (field2025.field644 == 16711935L) {
                                class91.field2335 = class64.field1643;
                                for (int var25 = 0; var25 < 256; var25++) {
                                    class106 var26 = class126.field3061[var25];
                                    if (var26 != null) {
                                        class91.field2335.field1617 = var25 * 4 + 5;
                                        int var27 = class91.field2335.method487(128);
                                        var26.method828((byte) 0, var27);
                                    }
                                }
                            } else {
                                class22.field591.reset();
                                class22.field591.update(class64.field1643.field1679, 0, var23);
                                int var28 = (int) class22.field591.getValue();
                                if (field2025.field2127 != var28) {
                                    try {
                                        class113.field2759.method586(121);
                                    } catch (Exception var30) {
                                    }
                                    class103.field2540++;
                                    class122.field2989 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class113.field2759 = null;
                                    return false;
                                }
                                class22.field588 = 0;
                                class103.field2540 = 0;
                                field2025.field2136.method824((int) (field2025.field644 & 0xFFFFL), -84, class25.field685, class64.field1643.field1679, (field2025.field644 & 0xFF0000L) == 16711680L);
                            }
                            field2025.method249(0);
                            class64.field1643 = null;
                            class23.field610 = 0;
                            field2025 = null;
                            if (class25.field685) {
                                class122.field2976--;
                            } else {
                                class8.field206--;
                            }
                        } else {
                            if (class23.field610 != 512) {
                                break;
                            }
                            class23.field610 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class113.field2759.method586(72);
                } catch (Exception var29) {
                }
                class22.field588++;
                class113.field2759 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILv;)Z", line = 927)
    public static final boolean method637(int arg0, class122 arg1) {
        field2030++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class30.field764; var2++) {
            if (arg1.method938(-8186, field2020[var2])) {
                return true;
            }
        }
        return arg1.method938(-8186, class70.field1828.field1448);
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lde;", line = 963)
    public final class24 method638(int arg0) {
        field2024++;
        int var2 = 103 / ((arg0 + 37) / 45);
        if (this.field2029 == null) {
            return null;
        }
        class24 var3 = this.field2018[(int) (this.field2015 & (long) (this.field2021 - 1))];
        while (this.field2029 != var3) {
            if (this.field2029.field644 == this.field2015) {
                class24 var4 = this.field2029;
                this.field2029 = this.field2029.field654;
                return var4;
            }
            this.field2029 = this.field2029.field654;
        }
        this.field2029 = null;
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Lde;", line = 995)
    public final class24 method639(byte arg0) {
        if (arg0 >= -110) {
            return null;
        } else {
            field2006++;
            this.field2033 = 0;
            return this.method632(30);
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V", line = 1012)
    public class75(int arg0) {
        this.field2021 = arg0;
        this.field2018 = new class24[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class24 var3 = this.field2018[var2] = new class24();
            var3.field642 = var3;
            var3.field654 = var3;
        }
    }
}
