import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class126 extends Canvas {

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field2929;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field2936 = 0;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lkc;")
    public static class67 field2935 = class19.method144("(U2", 107);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2931 = new CRC32();

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lkc;")
    private static class67 field2944 = class19.method144("Loading interfaces )2 ", 124);

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "Lkc;")
    public static class67 field2948 = class19.method144(" x ", 103);

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lkc;")
    private static class67 field2943 = class19.method144("flash2:", 127);

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lkc;")
    public static class67 field2942 = field2943;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
    public static int[] field2941 = new int[100];

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "[[I")
    public static int[][] field2950 = new int[5][5000];

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "Lkc;")
    public static class67 field2947 = class19.method144("Wen m-Ochten Sie entfernen?", 68);

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Z")
    public static volatile boolean field2951 = true;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lkc;")
    public static class67 field2952 = class19.method144(" x", 85);

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lkc;")
    public static class67 field2945 = field2944;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field2949 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lab;")
    public static class3 field2928;

    @OriginalMember(owner = "client!ub", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 4)
    public final void paint(Graphics arg0) {
        this.field2929.paint(arg0);
        field2937++;
    }

    @OriginalMember(owner = "client!ub", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 14)
    public final void update(Graphics arg0) {
        field2946++;
        this.field2929.update(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 23)
    public static void method979(byte arg0) {
        field2942 = null;
        field2931 = null;
        field2947 = null;
        field2945 = null;
        field2950 = null;
        int var1 = -42 / ((24 - arg0) / 54);
        field2941 = null;
        field2952 = null;
        field2944 = null;
        field2935 = null;
        field2948 = null;
        field2928 = null;
        field2943 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z", line = 43)
    public static final boolean method980(int arg0) {
        field2934++;
        if (arg0 == 11881) {
            return class52.field1280 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V", line = 54)
    public static final void method981(int arg0, byte arg1) {
        if (arg1 != -120) {
            field2944 = null;
        }
        field2932++;
        if (class30.field638 == arg0) {
            return;
        }
        if (class30.field638 == 0) {
            class119.method940((byte) 80);
        }
        if (arg0 == 20 || arg0 == 40) {
            class61.field1456 = 0;
            class116.field2734 = 0;
            class22.field486 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class18.field353 != null) {
            class18.field353.method751(-2);
            class18.field353 = null;
        }
        if (class30.field638 == 25 || class30.field638 == 40) {
            class10.method89(-126);
            class68.method565();
        }
        if (class30.field638 == 25) {
            class61.field1448 = 0;
            class122.field2877 = 0;
            class127.field2981 = 1;
            class52.field1278 = 1;
            class133.field3189 = 0;
        }
        if (arg0 == 0 || arg0 == 35) {
            class12.method102(arg1 + 34);
            class55.method443((byte) 43);
            if (class81.field1940 == null) {
                class81.field1940 = class49.method401((byte) -16, 765, 503, class129.field3020);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class81.field1940 = null;
            class12.method102(arg1 + 3);
            class78.method622(class121.field2837, class129.field3020, 1701, class38.field877);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class81.field1940 = null;
            class55.method443((byte) 43);
            class59.method460(class38.field877, class129.field3020, (byte) 103);
        }
        class30.field638 = arg0;
        class130.field3045 = true;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V", line = 150)
    public static final void method982(boolean arg0, int arg1) {
        if (arg0) {
            class130.method1000(null, arg1, 70, 0, false);
            field2939++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 163)
    public class126(Component arg0) {
        this.field2929 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 173)
    public static final void method983(int arg0) {
        class78.method625(-122);
        field2930++;
        if (class30.field638 != 10) {
            return;
        }
        if (arg0 != -2) {
            method979((byte) 37);
        }
        int var1 = class115.field2705;
        int var2 = class74.field1758 - 202;
        int var3 = class109.field2504 - 171;
        if (class103.field2311 == 0) {
            byte var12 = 120;
            byte var13 = 100;
            if (var1 == 1 && var2 >= var13 - 75 && var13 + 75 >= var2 && var3 >= var12 - 20 && var12 + 20 >= var3) {
                class103.field2311 = 3;
                class80.field1890 = 0;
            }
            short var14 = 260;
            if (var1 == 1 && var14 - 75 <= var2 && var14 + 75 >= var2 && var3 >= var12 - 20 && var12 + 20 >= var3) {
                class20.field417 = class109.field2508;
                class20.field418 = class109.field2482;
                class103.field2311 = 2;
                class20.field397 = class25.field546;
                class80.field1890 = 0;
            }
        } else if (class103.field2311 == 2) {
            byte var6 = 100;
            short var7 = 150;
            byte var8 = 60;
            int var15 = var8 + 30;
            if (var1 == 1 && var3 >= var15 - 15 && var15 > var3) {
                class80.field1890 = 0;
            }
            var15 += 15;
            if (var1 == 1 && var15 - 15 <= var3 && var15 > var3) {
                class80.field1890 = 1;
            }
            var15 += 15;
            if (var1 == 1 && var2 >= var6 - 75 && var6 + 75 >= var2 && var7 - 20 <= var3 && var3 <= var7 + 20) {
                class20.field415 = class20.field415.method537(122).method528((byte) -26);
                class18.method141(false, class52.field1264, class109.field2511, class109.field2517);
                method981(20, (byte) -120);
                return;
            }
            short var9 = 260;
            if (var1 == 1 && var9 - 75 <= var2 && var2 <= var9 + 75 && var7 - 20 <= var3 && var7 + 20 >= var3) {
                class103.field2311 = 0;
                class20.field415 = class20.field395;
                class20.field419 = class20.field395;
            }
            while (true) {
                while (class114.method916((byte) 95)) {
                    boolean var10 = false;
                    for (int var11 = 0; class5.field103.method539(2618) > var11; var11++) {
                        if (class77.field1831 == class5.field103.method515(var11, arg0 + 257)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (class80.field1890 == 0) {
                        if (class64.field1502 == 85 && class20.field415.method539(arg0 ^ 0xFFFFF5C4) > 0) {
                            class20.field415 = class20.field415.method529(0, class20.field415.method539(2618) - 1, 17804);
                        }
                        if (class64.field1502 == 84 || class64.field1502 == 80) {
                            class80.field1890 = 1;
                        }
                        if (var10 && class20.field415.method539(2618) < 12) {
                            class20.field415 = class20.field415.method513(class77.field1831, (byte) -122);
                        }
                    } else if (class80.field1890 == 1) {
                        if (class64.field1502 == 85 && class20.field419.method539(2618) > 0) {
                            class20.field419 = class20.field419.method529(0, class20.field419.method539(2618) - 1, 17804);
                        }
                        if (class64.field1502 == 84 || class64.field1502 == 80) {
                            class80.field1890 = 0;
                        }
                        if (var10 && class20.field419.method539(2618) < 20) {
                            class20.field419 = class20.field419.method513(class77.field1831, (byte) -100);
                        }
                    }
                }
                return;
            }
        } else if (class103.field2311 == 3) {
            short var4 = 180;
            short var5 = 150;
            if (var1 == 1 && var2 >= var4 - 75 && var2 <= var4 + 75 && var3 >= var5 - 20 && var3 <= var5 + 20) {
                class103.field2311 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)Z", line = 322)
    public static final boolean method984(boolean arg0, int arg1) {
        field2938++;
        if (!arg0) {
            method982(false, -89);
        }
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 337)
    public static final void method985(byte arg0) {
        short var1 = 256;
        field2927++;
        if (class109.field2503 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class109.field2503 > 768) {
                    class73.field1742[var4] = class41.method355(107, class111.field2543[var4], class1.field2[var4], 1024 - class109.field2503);
                } else if (class109.field2503 <= 256) {
                    class73.field1742[var4] = class41.method355(126, class1.field2[var4], class111.field2543[var4], 256 - class109.field2503);
                } else {
                    class73.field1742[var4] = class111.field2543[var4];
                }
            }
        } else if (class99.field2226 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class73.field1742[var2] = class1.field2[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class99.field2226 > 768) {
                    class73.field1742[var3] = class41.method355(60, class48.field1157[var3], class1.field2[var3], 1024 - class99.field2226);
                } else if (class99.field2226 <= 256) {
                    class73.field1742[var3] = class41.method355(77, class1.field2[var3], class48.field1157[var3], 256 - class99.field2226);
                } else {
                    class73.field1742[var3] = class48.field1157[var3];
                }
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class76.field1817.field2807[var5] = class31.field649.field2015[var5];
        }
        int var6 = 1152;
        int var7 = 0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class112.field2589[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var7 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class19.field380[var7++];
                if (var25 == 0) {
                    var6++;
                } else {
                    int var27 = class76.field1817.field2807[var6];
                    int var28 = 256 - var25;
                    int var29 = class73.field1742[var25];
                    class76.field1817.field2807[var6++] = class90.method693(class90.method693(var27, 16711935) * var28 + var25 * class90.method693(var29, 16711935), -16711936) + class90.method693(var28 * class90.method693(65280, var27) + class90.method693(var29, 65280) * var25, 16711680) >> 8;
                }
            }
            var6 += var23;
        }
        int var9 = 0;
        int var10 = 0;
        if (arg0 != 115) {
            field2936 = -58;
        }
        while (var10 < 33920) {
            class122.field2878.field2807[var10] = class75.field1785.field2015[var10];
            var10++;
        }
        int var11 = 1176;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class112.field2589[var12] / var1;
            int var14 = 103 - var13;
            int var15 = var11 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class19.field380[var9++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var19 = 256 - var17;
                    int var20 = class73.field1742[var17];
                    int var21 = class122.field2878.field2807[var15];
                    class122.field2878.field2807[var15++] = class90.method693(16711680, var19 * class90.method693(65280, var21) + class90.method693(65280, var20) * var17) + class90.method693(class90.method693(var20, 16711935) * var17 + class90.method693(var21, 16711935) * var19, -16711936) >> 8;
                }
            }
            var11 = var15 + 128 - var14 - var13;
            var9 += 128 - var14;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lv;", line = 506)
    public static final class130 method986(int arg0, int arg1) {
        class130 var2 = (class130) class94.field2150.method373((byte) 103, (long) arg0);
        field2940++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class135.field3236.method27(0, true, arg0);
        if (var3 == null) {
            return null;
        }
        if (arg1 != 16711935) {
            field2928 = null;
        }
        class130 var4 = new class130();
        class140 var5 = new class140(var3);
        var5.field3347 = var5.field3325.length - 12;
        int var6 = var5.method1118(arg1 - 16711931);
        var4.field3037 = var5.method1072(75);
        var4.field3043 = var5.method1072(51);
        int var7 = 0;
        var4.field3047 = var5.method1072(arg1 ^ 0xFF00A5);
        var4.field3051 = var5.method1072(29);
        var4.field3041 = new class67[var6];
        var5.field3347 = 0;
        var4.field3048 = new int[var6];
        var4.field3052 = new int[var6];
        while (var5.field3347 < var5.field3325.length - 12) {
            int var8 = var5.method1072(126);
            if (var8 == 3) {
                var4.field3041[var7] = var5.method1110(false);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field3052[var7] = var5.method1105(class63.method487(arg1, 16711680));
            } else {
                var4.field3052[var7] = var5.method1118(4);
            }
            var4.field3048[var7++] = var8;
        }
        class94.field2150.method374(0, var4, (long) arg0);
        return var4;
    }
}
