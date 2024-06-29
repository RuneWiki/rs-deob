import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 {

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lic;")
    public static class59 field3183 = class59.method433(0, "<col=ffff00>*V");

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static volatile int field3195 = 0;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lic;")
    public static class59 field3192 = class59.method433(0, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Llf;")
    public static class82 field3203 = new class82(128);

    @OriginalMember(owner = "client!va", name = "y", descriptor = "J")
    public static long field3207 = 0L;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "J")
    public static volatile long field3206 = 0L;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lic;")
    public static class59 field3208 = class59.method433(0, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lic;")
    public static class59 field3204 = class59.method433(0, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Lic;")
    public static class59 field3205 = class59.method433(0, "Schlie-8en");

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lt;")
    public static class132 field3200;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lwf;")
    public static class159 field3191;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Lwf;")
    public static class159 field3199;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lka;")
    public class70 field3190;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lka;")
    public class70 field3193;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lka;")
    public class70 field3197;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[Lt;")
    public static class132[] field3188;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static final void method1090(byte arg0) {
        if (arg0 <= 26) {
            method1093(118L, 28);
        }
        if (class149.field3262 != null) {
            class63 var1 = class149.field3262;
            synchronized (class149.field3262) {
                class149.field3262 = null;
            }
        }
        field3198++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILwd;I)Lic;")
    public static final class59 method1091(int arg0, class157 arg1, int arg2) {
        field3194++;
        try {
            if (arg2 != -27783) {
                return null;
            }
            class59 var3 = new class59();
            var3.field1418 = arg1.method1171(-32768);
            if (var3.field1418 > arg0) {
                var3.field1418 = arg0;
            }
            var3.field1448 = new byte[var3.field1418];
            arg1.field3457 += class151.field3284.method272(arg1.field3457, (byte) -80, arg1.field3473, 0, var3.field1418, var3.field1448);
            return var3;
        } catch (Exception var4) {
            return class154.field3354;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    public static final void method1092(int arg0, int arg1) {
        int var2 = -13 / ((-arg1 - 61) / 47);
        field3185++;
        int[] var3 = class43.field1090.field2953;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var21 = (103 - var6) * 512 * 4 + 24628;
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class121.field2785[arg0][var22][var6] & 0x18) == 0) {
                    class3.field58.method872(var3, var21, 512, arg0, var22, var6);
                }
                if (arg0 < 3 && (class121.field2785[arg0 + 1][var22][var6] & 0x8) != 0) {
                    class3.field58.method872(var3, var21, 512, arg0 + 1, var22, var6);
                }
                var21 += 4;
            }
        }
        class43.field1090.method1012();
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var8 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var20 = 1; var20 < 103; var20++) {
                if ((class121.field2785[arg0][var20][var9] & 0x18) == 0) {
                    class127.method973(var7, var8, var9, (byte) 98, arg0, var20);
                }
                if (arg0 < 3 && (class121.field2785[arg0 + 1][var20][var9] & 0x8) != 0) {
                    class127.method973(var7, var8, var9, (byte) 98, arg0 + 1, var20);
                }
            }
        }
        class128.field2905 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                int var12 = class3.field58.method906(class44.field1127, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 0x7FFF;
                    int var14 = class53.method397(var13, 13415).field386;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            int[][] var17 = class108.field2616[class44.field1127].field1829;
                            for (int var18 = 0; var18 < 10; var18++) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (var19 == 0 && var15 > 0 && var15 > var10 - 3 && (var17[var15 - 1][var16] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var19 == 1 && var15 < 103 && var10 + 3 > var15 && (var17[var15 + 1][var16] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var19 == 2 && var16 > 0 && var16 > var11 - 3 && (var17[var15][var16 - 1] & 0x12C0102) == 0) {
                                    var16--;
                                }
                                if (var19 == 3 && var16 < 103 && var16 < var11 + 3 && (var17[var15][var16 + 1] & 0x12C0120) == 0) {
                                    var16++;
                                }
                            }
                        }
                        class30.field773[class128.field2905] = class159.field3658[var14];
                        class68.field1742[class128.field2905] = var15;
                        class77.field1886[class128.field2905] = var16;
                        class128.field2905++;
                    }
                }
            }
        }
        class33.field891.method999(-16);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(JI)V")
    public static final void method1093(long arg0, int arg1) {
        field3202++;
        if (arg0 == 0L) {
            return;
        }
        if (class76.field1863 >= 100) {
            class127.method972(class76.field1871, class38.field1000, 0, arg1 ^ 0x65A2);
            return;
        }
        class59 var3 = class90.method744(37, arg0).method459(arg1 ^ 0x6F24);
        for (int var4 = 0; var4 < class76.field1863; var4++) {
            if (class5.field110[var4] == arg0) {
                class127.method972(class46.method358(new class59[] { var3, class22.field531 }, (byte) -75), class38.field1000, 0, 26018);
                return;
            }
        }
        for (int var5 = arg1; var5 < class65.field1649; var5++) {
            if (class84.field2114[var5] == arg0) {
                class127.method972(class46.method358(new class59[] { class96.field2433, var3, class158.field3506 }, (byte) -75), class38.field1000, 0, 26018);
                return;
            }
        }
        if (var3.method421(class159.field3650.field1225, false)) {
            class127.method972(class158.field3483, class38.field1000, 0, 26018);
            return;
        }
        class153.field3310++;
        class5.field110[class76.field1863] = arg0;
        class87.field2201[class76.field1863++] = class90.method744(class125.method958(arg1, 37), arg0);
        class127.field2884 = class94.field2400;
        class125.field2842.method1072(252, -1);
        class125.field2842.method1201(arg0, (byte) 38);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V")
    public static void method1094(byte arg0) {
        field3183 = null;
        field3191 = null;
        field3208 = null;
        field3204 = null;
        field3205 = null;
        field3200 = null;
        field3188 = null;
        field3199 = null;
        field3203 = null;
        field3192 = null;
        int var1 = 86 % ((arg0 + 24) / 55);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BIII)I")
    public static final int method1095(byte arg0, int arg1, int arg2, int arg3) {
        field3187++;
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        } else if (arg0 == 30) {
            int var6 = arg2;
            if (arg2 < 3 && (class121.field2785[1][var4][var5] & 0x2) == 2) {
                var6 = arg2 + 1;
            }
            int var7 = arg3 & 0x7F;
            int var8 = (128 - var7) * class26.field695[var6][var4][var5] + class26.field695[var6][var4 + 1][var5] * var7 >> 7;
            int var9 = (128 - var7) * class26.field695[var6][var4][var5 + 1] + class26.field695[var6][var4 + 1][var5 + 1] * var7 >> 7;
            int var10 = arg1 & 0x7F;
            return (128 - var10) * var8 + var9 * var10 >> 7;
        } else {
            return -75;
        }
    }
}
