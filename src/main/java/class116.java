import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class116 extends class19 {

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "[I")
    public static int[] field2851 = new int[128];

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Lwb;")
    public static class130 field2860 = null;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field2850 = 0;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "[Lac;")
    public static class4[] field2869 = new class4[12];

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "Lwb;")
    public static class130 field2865 = class26.method212("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -32376);

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field2861 = 0;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Lwb;")
    public static class130 field2859 = class26.method212("Duell akzeptieren", -32376);

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Lwb;")
    private static class130 field2862 = class26.method212("Create a free account", -32376);

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field2874 = -1;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "Lwb;")
    public static class130 field2866 = field2862;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Lwb;")
    public static class130 field2867 = class26.method212("Fehler bei der Verbindung zum Server)3", -32376);

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "Lwb;")
    public static class130 field2872 = class26.method212("Entfernen", -32376);

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Lwb;")
    public static class130 field2864 = class26.method212("::clientdrop", -32376);

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Lcd;")
    public static class17 field2873;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lgb;")
    public static class39 field2878;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Lk;")
    public static class60 field2855;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Lmc;")
    public static class75 field2856;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIJ)V", line = 4)
    public final void method890(byte arg0, int arg1, long arg2) {
        field2858++;
        class3.field78 = arg1;
        for (int var5 = 0; var5 < 16; var5++) {
            class68.field1748[var5] = 12800;
        }
        if (arg0 != -34) {
            this.method891(-33L, (byte) -120, 69, -51);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            int var7 = method895(var6);
            this.method542(var6 + 176, 7, var7 >> 7, arg2);
            this.method542(var6 + 176, 39, var7 & 0x7F, arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(JBII)V", line = 35)
    public final void method891(long arg0, byte arg1, int arg2, int arg3) {
        field2870++;
        int var6 = (int) ((double) arg3 * Math.pow(0.1D, (double) arg2 * 5.0E-4D) + 0.5D);
        if (arg1 != -123) {
            method899(-117);
        }
        if (class3.field78 == var6) {
            return;
        }
        class3.field78 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method895(var7);
            this.method542(var7 + 176, 7, var8 >> 7, arg0);
            this.method542(var7 + 176, 39, var8 & 0x7F, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(JZ)V", line = 63)
    public final void method892(long arg0, boolean arg1) {
        for (int var4 = 0; var4 < 128; var4++) {
            int var11 = class113.field2786[var4];
            class113.field2786[var4] = 0;
            for (int var12 = 0; var12 < 16; var12++) {
                if ((0x1 << var12 & var11) != 0) {
                    this.method542(var12 + 144, var4, 0, arg0);
                }
            }
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method542(var5 + 176, 123, 0, arg0);
        }
        field2857++;
        if (!arg1) {
            return;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method542(var6 + 176, 120, 0, arg0);
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method542(var7 + 176, 121, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method542(var8 + 176, 0, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method542(var9 + 176, 32, 0, arg0);
        }
        for (int var10 = 0; var10 < 16; var10++) {
            this.method542(var10 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(BI)V", line = 140)
    public static final void method893(byte arg0, int arg1) {
        field2854++;
        int[] var2 = class106.field2566.field796;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var21 = (52736 - var5 * 512) * 4 + 24628;
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class56.field1435[arg1][var22][var5] & 0x18) == 0) {
                    class79.field1926.method306(var2, var21, 512, arg1, var22, var5);
                }
                if (arg1 < 3 && (class56.field1435[arg1 + 1][var22][var5] & 0x8) != 0) {
                    class79.field1926.method306(var2, var21, 512, arg1 + 1, var22, var5);
                }
                var21 += 4;
            }
        }
        class106.field2566.method227();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var20 = 1; var20 < 103; var20++) {
                if ((class56.field1435[arg1][var20][var8] & 0x18) == 0) {
                    class59.method486(var6, var20, var8, var7, 1536, arg1);
                }
                if (arg1 < 3 && (class56.field1435[arg1 + 1][var20][var8] & 0x8) != 0) {
                    class59.method486(var6, var20, var8, var7, 1536, arg1 + 1);
                }
            }
        }
        class10.field331 = 0;
        int var9 = 0;
        int var10 = 33 / ((arg0 - 13) / 60);
        while (var9 < 104) {
            for (int var11 = 0; var11 < 104; var11++) {
                int var12 = class79.field1926.method299(class71.field1818, var9, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 0x7FFF;
                    int var14 = class32.method256(6, var13).field2684;
                    if (var14 >= 0) {
                        int var15 = var9;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            int[][] var17 = class99.field2404[class71.field1818].field2964;
                            for (int var18 = 0; var18 < 10; var18++) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (var19 == 0 && var15 > 0 && var15 > var9 - 3 && (var17[var15 - 1][var16] & 0x1280108) == 0) {
                                    var15--;
                                }
                                if (var19 == 1 && var15 < 103 && var9 + 3 > var15 && (var17[var15 + 1][var16] & 0x1280180) == 0) {
                                    var15++;
                                }
                                if (var19 == 2 && var16 > 0 && var16 > var11 - 3 && (var17[var15][var16 - 1] & 0x1280102) == 0) {
                                    var16--;
                                }
                                if (var19 == 3 && var16 < 103 && var16 < var11 + 3 && (var17[var15][var16 + 1] & 0x1280120) == 0) {
                                    var16++;
                                }
                            }
                        }
                        class18.field513[class10.field331] = class51.field1348[var14];
                        class90.field2177[class10.field331] = var15;
                        class120.field2945[class10.field331] = var16;
                        class10.field331++;
                    }
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIJ)Z", line = 289)
    public final boolean method894(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xE0) == 128) {
            int var6 = 0x1 << (arg0 & 0xF);
            int var7 = class113.field2786[arg1];
            if (arg0 < 144 || arg2 == 0) {
                class113.field2786[arg1] = var7 & ~var6;
            } else if ((var7 & var6) == 0) {
                class113.field2786[arg1] = var7 | var6;
            } else {
                this.method542(arg0, arg1, 0, arg3);
            }
            return false;
        }
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method542(arg0, arg1, arg2, arg3);
                int var8 = arg0 & 0xF;
                class68.field1748[var8] = 12800;
                int var9 = method895(var8);
                this.method542(arg0, 7, var9 >> 7, arg3);
                this.method542(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var10 = arg0 & 0xF;
                if (arg1 == 7) {
                    class68.field1748[var10] = (arg2 << 7) + (class68.field1748[var10] & 0x7F);
                } else {
                    class68.field1748[var10] = (class68.field1748[var10] & 0x3F80) + arg2;
                }
                int var11 = method895(var10);
                this.method542(arg0, 7, var11 >> 7, arg3);
                this.method542(arg0, 39, var11 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)I", line = 378)
    private static final int method895(int arg0) {
        int var1 = class68.field1748[arg0];
        int var2 = (class3.field78 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V", line = 391)
    public static final void method896(int arg0, byte arg1) {
        field2876++;
        if (!class54.method464(113)) {
            return;
        }
        if (arg1 != 119) {
            field2872 = null;
        }
        if (class46.field1240) {
            class48.field1289 = arg0;
        } else {
            class4.method33(arg1 + 31037, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 417)
    public static final void method897(int arg0) {
        field2871++;
        if (arg0 != 8708) {
            method897(-116);
        }
        class67.field1682.method723((byte) -103);
        int var1 = class67.field1682.method721(1, (byte) -111);
        if (var1 == 0) {
            return;
        }
        int var2 = class67.field1682.method721(2, (byte) -115);
        if (var2 == 0) {
            class69.field1775[class45.field1220++] = 2047;
        } else if (var2 == 1) {
            int var3 = class67.field1682.method721(3, (byte) -95);
            class42.field1179.method652(false, 1, var3);
            int var4 = class67.field1682.method721(1, (byte) -104);
            if (var4 == 1) {
                class69.field1775[class45.field1220++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class67.field1682.method721(3, (byte) -126);
            class42.field1179.method652(true, 1, var5);
            int var6 = class67.field1682.method721(3, (byte) -110);
            class42.field1179.method652(true, 1, var6);
            int var7 = class67.field1682.method721(1, (byte) -98);
            if (var7 == 1) {
                class69.field1775[class45.field1220++] = 2047;
            }
        } else if (var2 == 3) {
            class71.field1818 = class67.field1682.method721(2, (byte) -95);
            int var8 = class67.field1682.method721(7, (byte) -117);
            int var9 = class67.field1682.method721(7, (byte) -121);
            int var10 = class67.field1682.method721(1, (byte) -127);
            int var11 = class67.field1682.method721(1, (byte) -106);
            if (var11 == 1) {
                class69.field1775[class45.field1220++] = 2047;
            }
            class42.field1179.method653((byte) 35, var8, var10 == 1, var9);
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(BI)Lwb;", line = 491)
    public static final class130 method898(byte arg0, int arg1) {
        field2852++;
        if (arg1 < 999999999) {
            return class109.method831(arg1, 10);
        } else {
            if (arg0 != 84) {
                field2867 = null;
            }
            return class14.field397;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V", line = 511)
    public static void method899(int arg0) {
        field2864 = null;
        field2878 = null;
        field2855 = null;
        field2867 = null;
        field2856 = null;
        field2859 = null;
        field2872 = null;
        field2869 = null;
        field2866 = null;
        field2851 = null;
        field2860 = null;
        field2873 = null;
        if (arg0 != 7) {
            field2873 = null;
        }
        field2865 = null;
        field2862 = null;
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V", line = 548)
    public static final void method900(int arg0) {
        field2853++;
        class123.field2985.method401(26116);
        if (arg0 >= -30) {
            field2851 = null;
        }
        class36.field1029.method401(26116);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIJ)V")
    public abstract void method542(int arg0, int arg1, int arg2, long arg3);
}
