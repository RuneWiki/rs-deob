import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class137 {

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lwa;")
    private class219 field2426 = new class219(256);

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lwa;")
    private class219 field2432 = new class219(256);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Ltg;")
    private class75 field2430;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Ltg;")
    private class75 field2424;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[[I")
    public static int[][] field2425 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[Z")
    public static boolean[] field2429 = new boolean[5];

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[B")
    public static byte[] field2418 = new byte[32896];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "J")
    public static long field2421;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Lac;")
    public static class188 field2419;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lhh;")
    public static class38 field2415;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)I")
    public static final int method1026(byte arg0, int arg1) {
        field2422++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = 0.0D;
        if (var4 < var2) {
            var8 = var4;
        }
        double var12 = 0.0D;
        if (var8 > var6) {
            var8 = var6;
        }
        double var14 = var2;
        if (var2 < var4) {
            var14 = var4;
        }
        if (var14 < var6) {
            var14 = var6;
        }
        double var16 = (var8 + var14) / 2.0D;
        if (var8 != var14) {
            if (var16 < 0.5D) {
                var12 = (var14 - var8) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (var14 - var8) / (2.0D - var14 - var8);
            }
            if (var2 == var14) {
                var10 = (var4 - var6) / (var14 - var8);
            } else if (var4 == var14) {
                var10 = (var6 - var2) / (var14 - var8) + 2.0D;
            } else if (var6 == var14) {
                var10 = (var2 - var4) / (var14 - var8) + 4.0D;
            }
        }
        int var18 = (int) (var12 * 256.0D);
        if (arg0 != 118) {
            return 40;
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var10 / 6.0D;
        int var21 = (int) (var16 * 256.0D);
        int var22 = (int) (var19 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var21 > 243) {
            var18 >>= 0x4;
        } else if (var21 > 217) {
            var18 >>= 0x3;
        } else if (var21 > 192) {
            var18 >>= 0x2;
        } else if (var21 > 179) {
            var18 >>= 0x1;
        }
        return (var18 >> 5 << 7) + ((var22 >> 2 << 10) + (var21 >> 1));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method1027(int arg0) {
        field2415 = null;
        field2419 = null;
        if (arg0 != 1) {
            method1033(-91, -49);
        }
        field2418 = null;
        field2429 = null;
        field2425 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III[I)Lfc;")
    private final class89 method1028(int arg0, int arg1, int arg2, int[] arg3) {
        field2427++;
        int var5 = arg2 ^ (arg1 >>> 12 | (arg1 & 0x10000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class89 var9 = (class89) this.field2432.method1511((byte) -123, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class213 var10 = class213.method1423(this.field2430, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            int var11 = -93 % ((arg0 - 44) / 42);
            class89 var12 = var10.method1426();
            this.field2432.method1513(var7, var12, -1);
            if (arg3 != null) {
                arg3[0] -= var12.field1573.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[II)Lfc;")
    public final class89 method1029(int arg0, int[] arg1, int arg2) {
        field2417++;
        if (this.field2430.method579(arg2 + 29563) == 1) {
            return this.method1028(arg2 ^ 0x739A, 0, arg0, arg1);
        } else if (this.field2430.method550(-1757152080, arg0) == 1) {
            return this.method1028(-42, arg0, 0, arg1);
        } else {
            if (arg2 != -29687) {
                field2419 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lsc;III)V")
    public static final void method1030(class119 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class211.field3610) {
            class71 var4 = class31.field553[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1132 != null && var4.field1132.field851.method881()) {
                arg0.method880(var4.field1132.field851, 128, 0, 0, true);
            }
        }
        if (arg3 < class211.field3610) {
            class71 var5 = class31.field553[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1132 != null && var5.field1132.field851.method881()) {
                arg0.method880(var5.field1132.field851, 0, 0, 128, true);
            }
        }
        if (arg2 < class211.field3610 && arg3 < class72.field1194) {
            class71 var6 = class31.field553[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1132 != null && var6.field1132.field851.method881()) {
                arg0.method880(var6.field1132.field851, 128, 0, 128, true);
            }
        }
        if (arg2 < class211.field3610 && arg3 > 0) {
            class71 var7 = class31.field553[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1132 != null && var7.field1132.field851.method881()) {
                arg0.method880(var7.field1132.field851, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILnd;I)V")
    public static final void method1031(int arg0, int arg1, class192 arg2, int arg3) {
        field2414++;
        if (arg1 != 7) {
            field2415 = null;
        }
        if (arg2.field4503 == arg0 && arg0 != -1) {
            class138 var4 = class16.method144(1, arg0);
            int var5 = var4.field2448;
            if (var5 == 1) {
                arg2.field4502 = 0;
                arg2.field4474 = arg3;
                arg2.field4483 = 0;
                arg2.field4478 = 0;
                class114.method850(class163.field2943 == arg2, arg2.field4492, arg2.field4466, arg2.field4502, var4, 4096);
            }
            if (var5 == 2) {
                arg2.field4478 = 0;
                return;
            }
        } else if (arg0 == -1 || arg2.field4503 == -1 || class16.method144(arg1 - 6, arg0).field2438 >= class16.method144(1, arg2.field4503).field2438) {
            arg2.field4502 = 0;
            arg2.field4483 = 0;
            arg2.field4482 = arg2.field4496;
            arg2.field4503 = arg0;
            arg2.field4474 = arg3;
            arg2.field4478 = 0;
            if (arg2.field4503 == -1) {
                return;
            }
            class114.method850(class163.field2943 == arg2, arg2.field4492, arg2.field4466, arg2.field4502, class16.method144(1, arg2.field4503), arg1 + 4089);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II[I)Lfc;")
    public final class89 method1032(int arg0, int arg1, int[] arg2) {
        field2420++;
        if (this.field2424.method579(-123) == 1) {
            return this.method1035(arg0, arg2, 0, arg1 ^ 0xFFFF8CEA);
        } else if (arg1 != -29463) {
            return null;
        } else if (this.field2424.method550(-1757152080, arg0) == 1) {
            return this.method1035(0, arg2, arg0, arg1 + 29466);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V")
    public static final void method1033(int arg0, int arg1) {
        class247 var2;
        if (class132.field2352 == null) {
            var2 = new class247(512, 512);
        } else {
            var2 = (class247) class132.field2352;
        }
        if (arg1 < 27) {
            method1030((class119) null, 126, 82, -5);
        }
        field2416++;
        int[] var3 = var2.field4338;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = ((52736 - var6 * 512) * 4) + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class138.field2461[arg0][var25][var6] & 0x18) == 0) {
                    class12.method106(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (class138.field2461[arg0 + 1][var25][var6] & 0x8) != 0) {
                    class12.method106(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (((int) (Math.random() * 20.0D)) + 228 << 16) - (10 - (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) - ((int) (Math.random() * 20.0D)) - 238);
        var2.method1713();
        int var8 = ((int) (Math.random() * 20.0D)) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class138.field2461[arg0][var23][var9] & 0x18) == 0) {
                    class106.method812(var7, (byte) -128, var8, var9, var23, arg0);
                }
                if (arg0 < 3 && (class138.field2461[arg0 + 1][var23][var9] & 0x8) != 0) {
                    class106.method812(var7, (byte) -125, var8, var9, var23, arg0 + 1);
                }
            }
        }
        class151.field2781 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class221.method1527(class265.field4640, var10, var11);
                if (var12 != 0L) {
                    class21 var14 = class125.method929((int) (var12 >>> 32) & Integer.MAX_VALUE, (byte) -107);
                    int var15 = var14.field427;
                    if (var14.field393 != null) {
                        for (int var16 = 0; var16 < var14.field393.length; var16++) {
                            if (var14.field393[var16] != -1) {
                                class21 var17 = class125.method929(var14.field393[var16], (byte) -117);
                                if (var17.field427 >= 0) {
                                    var15 = var17.field427;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var11;
                        int var19 = var10;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class110.field1961[class265.field4640].field1175;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var19 > 0 && (var10 - 3) < var19 && (var20[var19 - 1][var18] & 0x12C0108) == 0) {
                                    var19--;
                                }
                                if (var22 == 1 && var19 < 103 && var19 < (var10 + 3) && (var20[var19 + 1][var18] & 0x12C0180) == 0) {
                                    var19++;
                                }
                                if (var22 == 2 && var18 > 0 && (var11 - 3) < var18 && (var20[var19][var18 - 1] & 0x12C0102) == 0) {
                                    var18--;
                                }
                                if (var22 == 3 && var18 < 103 && var18 < var11 + 3 && (var20[var19][var18 + 1] & 0x12C0120) == 0) {
                                    var18++;
                                }
                            }
                        }
                        class76.field1348[class151.field2781] = var14.field404;
                        class82.field1446[class151.field2781] = var19;
                        class11.field228[class151.field2781] = var18;
                        class151.field2781++;
                    }
                }
            }
        }
        class132.field2352 = var2;
        class189.field3278.method1631(0);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ltg;B)I")
    public static final int method1034(class75 arg0, byte arg1) {
        int var2 = 0;
        if (arg0.method575(class100.field1761, 0)) {
            var2++;
        }
        field2423++;
        if (arg0.method575(class117.field2099, 0)) {
            var2++;
        }
        int var3 = -40 / ((arg1 - 20) / 33);
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[III)Lfc;")
    private final class89 method1035(int arg0, int[] arg1, int arg2, int arg3) {
        field2428++;
        int var5 = (arg2 << 4 & 0xFFF1 | arg2 >>> 12) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class89 var9 = (class89) this.field2432.method1511((byte) -123, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class40 var10 = (class40) this.field2426.method1511((byte) -126, var7);
            if (var10 == null) {
                var10 = class40.method320(this.field2424, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field2426.method1513(var7, var10, -1);
            }
            if (arg3 != 3) {
                this.field2432 = null;
            }
            class89 var11 = var10.method329(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1611((byte) -128);
                this.field2432.method1513(var7, var11, -1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Ltg;Ltg;)V")
    public class137(class75 arg0, class75 arg1) {
        this.field2430 = arg0;
        this.field2424 = arg1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2418[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
