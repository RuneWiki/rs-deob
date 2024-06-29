import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class65 {

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    private int field1258 = 0;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    private int field1263 = -1;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lvf;")
    public static class265 field1261 = class87.method582(-46, "mapfunction");

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field1264 = 1;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public int field1252;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    private final void method465(int arg0, int arg1) {
        field1253++;
        double var3 = (double) ((arg1 & 0xFF5012) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF2F) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = var3;
        if (var3 > var5) {
            var11 = var5;
        }
        if (var7 < var11) {
            var11 = var7;
        }
        double var13 = var3;
        double var15 = 0.0D;
        if (var5 > var3) {
            var13 = var5;
        }
        if (var7 > var13) {
            var13 = var7;
        }
        double var17 = (var11 + var13) / 2.0D;
        this.field1249 = (int) (var17 * 256.0D);
        if (this.field1249 < 0) {
            this.field1249 = 0;
        } else if (this.field1249 > 255) {
            this.field1249 = 255;
        }
        if (var11 != var13) {
            if (var17 < 0.5D) {
                var15 = (var13 - var11) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var11) / (2.0D - var13 - var11);
            }
            if (var3 == var13) {
                var9 = (var5 - var7) / (var13 - var11);
            } else if (var5 == var13) {
                var9 = (var7 - var3) / (var13 - var11) + 2.0D;
            } else if (var7 == var13) {
                var9 = (var3 - var5) / (var13 - var11) + 4.0D;
            }
        }
        double var19 = var9 / 6.0D;
        this.field1252 = (int) ((double) arg0 * var15);
        if ((var17 > 0.5D)) {
            this.field1255 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1255 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1252 < 0) {
            this.field1252 = 0;
        } else if (this.field1252 > 255) {
            this.field1252 = 255;
        }
        if (this.field1255 < 1) {
            this.field1255 = 1;
        }
        this.field1250 = (int) ((double) this.field1255 * var19);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static final void method466(boolean arg0) {
        while (true) {
            if (class207.field3730.method1858(class221.field3966, 97) >= 11) {
                int var1 = class207.field3730.method1867(11, 8);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class209.field3766[var1] == null) {
                        var2 = true;
                        class209.field3766[var1] = new class122();
                        if (class36.field834[var1] != null) {
                            class209.field3766[var1].method814(0, class36.field834[var1]);
                        }
                    }
                    class93.field1652[class19.field520++] = var1;
                    class122 var3 = class209.field3766[var1];
                    var3.field2542 = class93.field1655;
                    int var4 = class207.field3730.method1867(1, 8);
                    if (var4 == 1) {
                        class279.field4928[class131.field2376++] = var1;
                    }
                    int var5 = class207.field3730.method1867(5, 8);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class154.field2854[class207.field3730.method1867(3, 8)];
                    if (var2) {
                        var3.field2580 = var3.field2563 = var6;
                    }
                    int var7 = class207.field3730.method1867(5, 8);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class207.field3730.method1867(1, 8);
                    var3.method823(-126, class214.field3827.field2536[0] + var7, class214.field3827.field2575[0] + var5, var8 == 1);
                    continue;
                }
            }
            if (arg0) {
                method471((class135) null, true);
            }
            class207.field3730.method1862((byte) 50);
            field1251++;
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method467(byte arg0) {
        if (arg0 > 75) {
            field1261 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static final void method468(byte arg0) {
        field1260++;
        if (class243.field4244 == -1 || class71.field1366 == -1) {
            return;
        }
        int var1 = ((class36.field857 - class100.field1786) * class53.field1101 >> 16) + class100.field1786;
        class53.field1101 += var1;
        if (class53.field1101 >= 65535) {
            class53.field1101 = 65535;
            if (class238.field4163) {
                class68.field1289 = false;
            } else {
                class68.field1289 = true;
            }
            class238.field4163 = true;
        } else {
            class68.field1289 = false;
            class238.field4163 = false;
        }
        float[] var2 = new float[3];
        float var3 = (float) class53.field1101 / 65535.0F;
        int var4 = class150.field2774 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class243.field4235[class243.field4244][var4][var5] * 3;
            int var22 = class243.field4235[class243.field4244][var4 + 1][var5] * 3;
            int var23 = (class243.field4235[class243.field4244][var4 + 2][var5] + class243.field4235[class243.field4244][var4 + 2][var5] - class243.field4235[class243.field4244][var4 + 3][var5]) * 3;
            int var24 = class243.field4235[class243.field4244][var4][var5];
            int var25 = var22 - var21;
            int var26 = class243.field4235[class243.field4244][var4 + 2][var5] + (var22 - var23) - var24;
            int var27 = var21 + var23 - var22 * 2;
            var2[var5] = (((float) var26 * var3 + (float) var27) * var3 + (float) var25) * var3 + (float) var24;
        }
        class112.field1976 = (int) var2[0] - class64.field1248 * 128;
        class69.field1309 = (int) var2[2] - (class231.field4073 * 128);
        float[] var6 = new float[3];
        class17.field475 = (int) var2[1] * -1;
        int var7 = class225.field4000 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class243.field4235[class71.field1366][var7][var8] * 3;
            int var15 = (class243.field4235[class71.field1366][var7 + 2][var8] + class243.field4235[class71.field1366][var7 + 2][var8] - class243.field4235[class71.field1366][var7 + 3][var8]) * 3;
            int var16 = class243.field4235[class71.field1366][var7 + 1][var8] * 3;
            int var17 = var16 - var14;
            int var18 = class243.field4235[class71.field1366][var7][var8];
            int var19 = var14 + var15 - (var16 * 2);
            int var20 = class243.field4235[class71.field1366][var7 + 2][var8] + var16 - var15 - var18;
            var6[var8] = (((float) var20 * var3 + (float) var19) * var3 + (float) var17) * var3 + (float) var18;
        }
        float var9 = var6[0] - var2[0];
        float var10 = var6[2] - var2[2];
        if (arg0 >= -87) {
            method468((byte) 23);
        }
        float var11 = (var6[1] - var2[1]) * -1.0F;
        double var12 = Math.sqrt((double) (var9 * var9 + var10 * var10));
        class21.field638 = (float) Math.atan2((double) var11, var12);
        class134.field2419 = -((float) Math.atan2((double) var9, (double) var10));
        class8.field272 = (int) ((double) class134.field2419 * 325.949D) & 0x7FF;
        class202.field3613 = (int) ((double) class21.field638 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBLng;)V")
    public final void method469(int arg0, byte arg1, class135 arg2) {
        field1265++;
        int var4 = -77 % ((arg1 - 44) / 37);
        while (true) {
            int var5 = arg2.method920((byte) 127);
            if (var5 == 0) {
                return;
            }
            this.method472(arg2, false, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1257++;
        class257.field4401++;
        if (!arg5) {
            class186.method1278(0, true);
            class91.method623(58, true);
            class186.method1278(0, false);
        }
        class91.method623(32, false);
        if (!arg5) {
            class276.method1886(62);
        }
        class208.method1430((byte) 43);
        if (class254.field4361 == 1) {
            int var6 = class118.field2087;
            if (var6 < (class57.field1177 / 256)) {
                var6 = class57.field1177 / 256;
            }
            if (class261.field4561[4] && var6 < (class56.field1144[4] + 128)) {
                var6 = class56.field1144[4] + 128;
            }
            int var7 = class93.field1648 + class79.field1500 & 0x7FF;
            class15.method108(class230.field4060, 67, var6, class67.method483(class214.field3827.field2564, -126, class214.field3827.field2600, class216.field3902) - 50, var7, class169.field3067, arg1, (var6 * 3) + 600);
        }
        if (arg4 >= -111) {
            field1264 = -37;
        }
        int var8 = class17.field475;
        int var9 = class69.field1309;
        int var10 = class202.field3613;
        int var11 = class8.field272;
        int var12 = class112.field1976;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class261.field4561[var13]) {
                int var19 = (int) ((double) (-class135.field2445[var13]) + (double) (class135.field2445[var13] * 2 + 1) * Math.random() + Math.sin((double) class32.field810[var13] / 100.0D * (double) class172.field3096[var13]) * (double) class56.field1144[var13]);
                if (var13 == 0) {
                    class112.field1976 += var19;
                }
                if (var13 == 1) {
                    class17.field475 += var19;
                }
                if (var13 == 3) {
                    class8.field272 = class8.field272 + var19 & 0x7FF;
                }
                if (var13 == 4) {
                    class202.field3613 += var19;
                    if (class202.field3613 < 128) {
                        class202.field3613 = 128;
                    }
                    if (class202.field3613 > 383) {
                        class202.field3613 = 383;
                    }
                }
                if (var13 == 2) {
                    class69.field1309 += var19;
                }
            }
        }
        class268.method1834(false);
        class35.method287(arg0, arg2, arg0 + arg3, arg2 - -arg1);
        class247.method1639();
        if (class50.field1049 || arg0 > class77.field1475 || (arg0 + arg3) <= class77.field1475 || class38.field862 < arg2 || class38.field862 >= (arg2 + arg1)) {
            class102.field1806 = 0;
            class111.field1938 = false;
        } else {
            class102.field1806 = 0;
            int var14 = class73.field1399;
            class111.field1938 = true;
            int var15 = class277.field4904;
            class203.field3630 = (class77.field1475 - arg0) * (var14 - var15) / arg3 + var15;
            int var16 = class96.field1690;
            int var17 = class2.field28;
            class32.field814 = (class38.field862 - arg2) * (var16 - var17) / arg1 + var17;
        }
        class44.method369(true);
        byte var18 = class127.method844(2) == 2 ? (byte) class257.field4401 : 1;
        class35.method295(arg0, arg2, arg3, arg1, 0);
        class277.method1894(class112.field1976, class17.field475, class69.field1309, class202.field3613, class8.field272, class261.field4570, class39.field897, class25.field698, client.field3859, class249.field4324, class16.field465, class216.field3902 + 1, var18, class214.field3827.field2600 >> 7, class214.field3827.field2564 >> 7);
        class44.method369(true);
        class49.method396();
        class268.method1835(arg0, arg2, -10, arg3, 256, arg1, 256);
        class1.method5(256, arg2, 256, arg0, arg3, arg1, (byte) -64);
        ((class9) class247.field4292).method72(-18085, class84.field1572);
        class177.method1152((byte) -78, arg3, arg0, arg2, arg1);
        class17.field475 = var8;
        class112.field1976 = var12;
        class8.field272 = var11;
        class202.field3613 = var10;
        class69.field1309 = var9;
        if (class105.field1867 && class130.field2281.method1724(2442) == 0) {
            class105.field1867 = false;
        }
        if (class105.field1867) {
            class35.method295(arg0, arg2, arg3, arg1, 0);
            class166.method1094(24974, false, class119.field2103);
        }
        if (!arg5 && !class105.field1867 && !class50.field1049 && arg0 <= class77.field1475 && class77.field1475 < arg0 + arg3 && class38.field862 >= arg2 && arg1 + arg2 > class38.field862) {
            class198.method1364(arg2, (byte) 106, arg3, arg0, class38.field862, arg1, class77.field1475);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lng;Z)Lbg;")
    public static final class172 method471(class135 arg0, boolean arg1) {
        field1256++;
        return arg1 ? null : new class172(arg0.method894(-117), arg0.method894(-97), arg0.method894(-107), arg0.method894(-97), arg0.method909(-917770352), arg0.method909(-917770352), arg0.method920((byte) 126));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lng;ZII)V")
    private final void method472(class135 arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1258 = arg0.method909(-917770352);
            this.method465(256, this.field1258);
        } else if (arg2 == 2) {
            this.field1263 = arg0.method927(127);
            if (this.field1263 == 65535) {
                this.field1263 = -1;
            }
        } else if (arg2 == 3) {
            arg0.method927(126);
        }
        if (arg1) {
            this.field1263 = -123;
        }
        field1259++;
    }
}
