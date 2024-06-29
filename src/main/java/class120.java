import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class class120 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lv;")
    public static class122 field2907 = class55.method425(-61, ": ");

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lv;")
    private static class122 field2902 = class55.method425(-58, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lv;")
    public static class122 field2910 = class55.method425(-90, "Hierhin gehen");

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lv;")
    private static class122 field2912 = class55.method425(-69, " has logged in)3");

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "Lv;")
    public static class122 field2908 = field2912;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lv;")
    public static class122 field2921 = class55.method425(-84, "@cya@");

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lv;")
    public static class122 field2904 = field2902;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Lv;")
    public static class122 field2916 = class55.method425(-90, ":  ");

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lmb;")
    public static class74 field2920;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    public static int[] field2905;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "[Lrc;")
    public static class105[] field2911;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[[[B")
    public static byte[][][] field2906;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILbd;)V", line = 3)
    public static final void method915(int arg0, class11 arg1) {
        field2909++;
        arg1.field305 = arg1.field297;
        if (arg1.field285 == 0) {
            arg1.field342 = 0;
            return;
        }
        if (arg1.field324 != -1 && arg1.field292 == 0) {
            class89 var2 = class51.method401(-30325, arg1.field324);
            if (arg1.field306 > 0 && var2.field2286 == 0) {
                arg1.field342++;
                return;
            }
            if (arg1.field306 <= 0 && var2.field2281 == 0) {
                arg1.field342++;
                return;
            }
        }
        int var3 = arg1.field343;
        int var4 = arg1.field349;
        int var5 = arg1.field287[arg1.field285 - 1] * 128 + arg1.field317 * 64;
        int var6 = arg1.field307[arg1.field285 - 1] * 128 + arg1.field317 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field343 = var5;
            arg1.field349 = var6;
            return;
        }
        if (var3 < var5) {
            if (var4 < var6) {
                arg1.field280 = 1280;
            } else if (var4 <= var6) {
                arg1.field280 = 1536;
            } else {
                arg1.field280 = 1792;
            }
        } else if (var3 <= var5) {
            if (var4 >= var6) {
                arg1.field280 = 0;
            } else {
                arg1.field280 = 1024;
            }
        } else if (var4 < var6) {
            arg1.field280 = 768;
        } else if (var6 < var4) {
            arg1.field280 = 256;
        } else {
            arg1.field280 = 512;
        }
        int var7 = arg1.field280 - arg1.field299 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field282;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field279;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field296;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field340;
        }
        if (var8 == -1) {
            var8 = arg1.field279;
        }
        if (arg0 != 1) {
            field2917 = 110;
        }
        int var9 = 4;
        if (arg1.field299 != arg1.field280 && arg1.field323 == -1 && arg1.field294 != 0) {
            var9 = 2;
        }
        arg1.field305 = var8;
        if (arg1.field285 > 2) {
            var9 = 6;
        }
        if (arg1.field285 > 3) {
            var9 = 8;
        }
        if (arg1.field342 > 0 && arg1.field285 > 1) {
            var9 = 8;
            arg1.field342--;
        }
        if (arg1.field284[arg1.field285 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var6) {
            arg1.field349 += var9;
            if (arg1.field349 > var6) {
                arg1.field349 = var6;
            }
        } else if (var6 < var4) {
            arg1.field349 -= var9;
            if (arg1.field349 < var6) {
                arg1.field349 = var6;
            }
        }
        if (var5 > var3) {
            arg1.field343 += var9;
            if (arg1.field343 > var5) {
                arg1.field343 = var5;
            }
        } else if (var3 > var5) {
            arg1.field343 -= var9;
            if (var5 > arg1.field343) {
                arg1.field343 = var5;
            }
        }
        if (arg1.field343 == var5 && arg1.field349 == var6) {
            if (arg1.field306 > 0) {
                arg1.field306--;
            }
            arg1.field285--;
        }
        if (var9 >= 8 && arg1.field305 == arg1.field279 && arg1.field325 != -1) {
            arg1.field305 = arg1.field325;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V", line = 195)
    public static final void method916(int arg0, byte arg1) {
        field2919++;
        if (!class55.method426(1)) {
            return;
        }
        if (class93.field2397) {
            class8.field180 = arg0;
        } else {
            class84.method676(arg0, false);
        }
        if (arg1 > -4) {
            field2917 = 28;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 220)
    public static final void method917(byte arg0) {
        class34.field864 = new byte[4][104][104];
        class100.field2484 = new int[104];
        class112.field2739 = new int[104];
        class14.field362 = new byte[4][104][104];
        class21.field582 = new byte[4][104][104];
        class50.field1257 = new int[105][105];
        class131.field3184 = new int[104];
        class25.field687 = new int[104];
        class92.field2344 = 99;
        class25.field678 = new byte[4][105][105];
        int var1 = -65 % ((67 - arg0) / 57);
        class84.field2193 = new int[4][105][105];
        class70.field1831 = new int[104];
        field2915++;
        field2906 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V", line = 252)
    public static void method918(byte arg0) {
        field2910 = null;
        field2906 = null;
        field2902 = null;
        field2921 = null;
        field2916 = null;
        field2920 = null;
        field2905 = null;
        field2904 = null;
        field2912 = null;
        field2907 = null;
        if (arg0 < 117) {
            method918((byte) 4);
        }
        field2908 = null;
        field2911 = null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IB)I", line = 288)
    public static final int method919(int arg0, byte arg1) {
        field2914++;
        if (arg1 <= 48) {
            method920(-73, 58);
        }
        class90 var2 = class67.method538(-20970, arg0);
        int var3 = var2.field2317;
        int var4 = var2.field2303;
        int var5 = var2.field2313;
        int var6 = class88.field2246[var4 - var5];
        return var6 & class73.field1896[var3] >> var5;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V", line = 348)
    public static final void method920(int arg0, int arg1) {
        field2918++;
        int[] var2 = class119.field2886.field3023;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class54.field1408[arg0][var21][var5] & 0x18) == 0) {
                    class90.field2306.method30(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class54.field1408[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class90.field2306.method30(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class119.field2886.method979();
        int var6 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10;
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var8 = arg1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class54.field1408[arg0][var19][var8] & 0x18) == 0) {
                    class89.method709(arg0, var19, arg1 ^ 0xFFFFEAAA, var8, var6, var7);
                }
                if (arg0 < 3 && (class54.field1408[arg0 + 1][var19][var8] & 0x8) != 0) {
                    class89.method709(arg0 + 1, var19, -5461, var8, var6, var7);
                }
            }
        }
        class46.field1194 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class90.field2306.method3(class34.field848, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class14.method124((byte) 52, var12).field1089;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class41.field1048[class34.field848].field388;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var10 + 3 > var15 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class90.field2315[class46.field1194] = class72.field1880[var13];
                        class109.field2690[class46.field1194] = var14;
                        class59.field1519[class46.field1194] = var15;
                        class46.field1194++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public abstract void method758(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI[BI)V")
    public abstract void method757(boolean arg0, int arg1, byte[] arg2, int arg3);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public abstract void method756(int arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public abstract void method759(byte arg0);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public abstract void method754(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
    public abstract void method755(int arg0, int arg1);
}
