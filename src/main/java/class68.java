import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class68 extends class34 {

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "Lke;")
    public static class256 field1260 = class316.method2202(")1o", 27626);

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "Lke;")
    public static class256 field1266 = class316.method2202("clignotant3:", 27626);

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field1268 = 0;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "[I")
    public static int[] field1261 = new int[200];

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "Lke;")
    public static class256 field1271 = class316.method2202(" ", 27626);

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "[[I")
    public static int[][] field1272 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "Lng;")
    public static class138 field1258;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "Lke;")
    public class256 field1255;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIZIII)V", line = 5)
    public static final void method520(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1264++;
        int var6 = 0;
        if (arg2) {
            method520(56, -79, false, -122, -38, -120);
        }
        class73.method550(-29903, class308.field5329[arg3], arg0 + arg4, -arg4 + arg0, arg1);
        int var7 = arg4 * arg4;
        int var8 = arg5 * arg5;
        int var9 = var8 << 1;
        int var10 = arg5 << 1;
        int var11 = var7 << 1;
        int var12 = (1 - var10) * var7 + var9;
        int var13 = var8 - ((var10 - 1) * var11);
        int var14 = arg5;
        int var15 = ((var6 << 1) + 3) * var9;
        int var16 = var7 << 2;
        int var17 = var8 << 2;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var17;
        int var20 = (arg5 - 1) * var16;
        while (var14 > 0) {
            if (var12 < 0) {
                while (var12 < 0) {
                    var13 += var19;
                    var19 += var17;
                    var6++;
                    var12 += var15;
                    var15 += var17;
                }
            }
            if (var13 < 0) {
                var6++;
                var13 += var19;
                var12 += var15;
                var19 += var17;
                var15 += var17;
            }
            int var21 = arg0 + var6;
            var12 += -var20;
            var13 += -var18;
            int var22 = arg0 - var6;
            var18 -= var16;
            var20 -= var16;
            var14--;
            int var23 = arg3 + var14;
            int var24 = arg3 - var14;
            class73.method550(-29903, class308.field5329[var24], var21, var22, arg1);
            class73.method550(-29903, class308.field5329[var23], var21, var22, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V", line = 87)
    public static final void method521(byte arg0) {
        class25.field325.method2076(117);
        int var1 = -54 % ((arg0 + 4) / 33);
        field1269++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILra;)V", line = 104)
    private final void method522(int arg0, int arg1, class41 arg2) {
        if (arg1 == 1) {
            this.field1257 = arg2.method357(false);
        } else if (arg1 == 2) {
            this.field1265 = arg2.method327(4);
        } else if (arg1 == 5) {
            this.field1255 = arg2.method313((byte) 54);
        }
        field1274++;
        if (arg0 != -13573) {
            method524((byte) -69);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V", line = 138)
    public static void method523(byte arg0) {
        field1260 = null;
        int var1 = -86 % ((-arg0 - 61) / 52);
        field1271 = null;
        field1258 = null;
        field1272 = (int[][]) null;
        field1266 = null;
        field1261 = null;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V", line = 163)
    public static final void method524(byte arg0) {
        int var1 = class137.field2389;
        int var2 = class148.field2609;
        int var3 = -104 % ((arg0 + 26) / 62);
        field1267++;
        int var4 = class85.field1538;
        int var5 = class173.field3074;
        if (class8.field120 == null || class119.field2102 == null) {
            if (class153.field2743.method1011(class129.field2259, -23605) && class153.field2743.method1011(class140.field2467, -23605)) {
                class8.field120 = class307.method2135(class129.field2259, (byte) 69, 0, class153.field2743);
                class119.field2102 = class307.method2135(class140.field2467, (byte) 78, 0, class153.field2743);
                if (class253.field4323) {
                    if ((class8.field120 instanceof class212)) {
                        class8.field120 = new class103((class227) class8.field120);
                    } else {
                        class8.field120 = new class87((class227) class8.field120);
                    }
                    if (class119.field2102 instanceof class212) {
                        class119.field2102 = new class103((class227) class119.field2102);
                    } else {
                        class119.field2102 = new class87((class227) class119.field2102);
                    }
                }
            } else if (class253.field4323) {
                class60.method467(var1, var2, var4, 20, class252.field4294, 256 - class200.field3651);
            } else {
                class178.method1290(var1, var2, var4, 20, class252.field4294, 256 - class200.field3651);
            }
        }
        if (class8.field120 != null && class119.field2102 != null) {
            int var6 = var4 / class8.field120.field2343;
            for (int var7 = 0; var7 < var6; var7++) {
                class8.field120.method637(class8.field120.field2343 * var7 + var1, var2);
            }
            class119.field2102.method637(var1, var2);
            class119.field2102.method647(var1 + var4 - class119.field2102.field2343, var2);
        }
        class17.field215.method2042(class64.field1142, var1 + 3, var2 + 14, class111.field1947, -1);
        if (class253.field4323) {
            class60.method467(var1, var2 + 20, var4, var5 - 20, class252.field4294, 256 - class200.field3651);
        } else {
            class178.method1290(var1, var2 + 20, var4, var5 - 20, class252.field4294, 256 - class200.field3651);
        }
        int var8 = class286.field4963;
        int var9 = class208.field3762;
        for (int var10 = 0; var10 < class17.field244; var10++) {
            int var11 = (class17.field244 - var10 - 1) * 15 + var2 + 35;
            if (var1 < var8 && (var1 + var4) > var8 && var11 - 13 < var9 && var11 + 3 > var9) {
                if (class253.field4323) {
                    class60.method467(var1, var11 - 13, var4, 16, class308.field5325, 256 - class56.field1021);
                } else {
                    class178.method1290(var1, var11 - 13, var4, 16, class308.field5325, 256 - class56.field1021);
                }
            }
        }
        if ((class76.field1444 == null || class182.field3230 == null || class260.field4499 == null) && class153.field2743.method1011(class247.field4213, -23605) && class153.field2743.method1011(class248.field4223, -23605) && class153.field2743.method1011(class159.field2832, -23605)) {
            class76.field1444 = class307.method2135(class247.field4213, (byte) 99, 0, class153.field2743);
            class182.field3230 = class307.method2135(class248.field4223, (byte) 48, 0, class153.field2743);
            class260.field4499 = class307.method2135(class159.field2832, (byte) 106, 0, class153.field2743);
            if (class253.field4323) {
                if (class76.field1444 instanceof class212) {
                    class76.field1444 = new class103((class227) class76.field1444);
                } else {
                    class76.field1444 = new class87((class227) class76.field1444);
                }
                if (class182.field3230 instanceof class212) {
                    class182.field3230 = new class103((class227) class182.field3230);
                } else {
                    class182.field3230 = new class87((class227) class182.field3230);
                }
                if ((class260.field4499 instanceof class212)) {
                    class260.field4499 = new class103((class227) class260.field4499);
                } else {
                    class260.field4499 = new class87((class227) class260.field4499);
                }
            }
        }
        if (class76.field1444 != null && class182.field3230 != null && class260.field4499 != null) {
            int var12 = var4 / class76.field1444.field2343;
            for (int var13 = 0; var13 < var12; var13++) {
                class76.field1444.method637(class76.field1444.field2343 * var13 + var1, var2 - (-var5 + class76.field1444.field2348));
            }
            int var14 = (var5 - 20) / class182.field3230.field2348;
            for (int var15 = 0; var15 < var14; var15++) {
                class182.field3230.method637(var1, class182.field3230.field2348 * var15 + var2 + 20);
                class182.field3230.method647(var1 + var4 - class182.field3230.field2343, class182.field3230.field2348 * var15 + var2 + 20);
            }
            class260.field4499.method637(var1, var2 + var5 - class260.field4499.field2348);
            class260.field4499.method647(var1 + var4 - class260.field4499.field2343, var2 + var5 + -class260.field4499.field2348);
        }
        for (int var16 = 0; var16 < class17.field244; var16++) {
            int var17 = (class17.field244 - var16 - 1) * 15 + var2 + 35;
            int var18 = class111.field1947;
            if (var1 < var8 && var8 < var1 + var4 && (var17 - 13) < var9 && (var17 + 3) > var9) {
                var18 = class213.field3811;
            }
            class17.field215.method2042(class191.method1387(var16, (byte) -104), var1 + 3, var17, var18, 0);
        }
        class96.method692(class173.field3074, class85.field1538, class137.field2389, class148.field2609, -92);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILng;)Lj;", line = 336)
    public static final class227 method525(int arg0, int arg1, int arg2, class138 arg3) {
        field1263++;
        int var4 = -27 % ((-arg1 - 69) / 37);
        return class83.method611(arg2, -53, arg3, arg0) ? class223.method1535(0) : null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILra;)V", line = 351)
    public final void method526(int arg0, class41 arg1) {
        field1270++;
        while (true) {
            int var3 = arg1.method357(false);
            if (var3 == 0) {
                if (arg0 != 9983) {
                    field1268 = -95;
                }
                return;
            }
            this.method522(-13573, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BILrb;II)V", line = 373)
    public static final void method527(byte arg0, int arg1, class144 arg2, int arg3, int arg4) {
        field1273++;
        if (class121.field2124 == arg2 || class17.field244 >= 400) {
            return;
        }
        class256 var5;
        if (arg2.field2541 == 0) {
            boolean var6 = true;
            if (class121.field2124.field2546 != -1 && arg2.field2546 != -1) {
                int var7 = arg2.field2546 > class121.field2124.field2546 ? class121.field2124.field2546 : arg2.field2546;
                int var8 = arg2.field2549 >= class121.field2124.field2549 ? arg2.field2549 : class121.field2124.field2549;
                int var9 = var8 * 10 / 100 + var7 + 5;
                int var10 = class121.field2124.field2549 - arg2.field2549;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            class256 var11 = class206.field3735 == 1 ? class64.field1124 : class181.field3201;
            if (arg2.field2539 <= arg2.field2549) {
                var5 = class30.method214(new class256[] { arg2.method1053((byte) -111), var6 ? class195.method1414(class121.field2124.field2549, arg2.field2549, (byte) -111) : class177.field3128, class28.field382, var11, class305.method2125((byte) 123, arg2.field2549), class310.field5339 }, 29784);
            } else {
                var5 = class30.method214(new class256[] { arg2.method1053((byte) -99), var6 ? class195.method1414(class121.field2124.field2549, arg2.field2549, (byte) -108) : class177.field3128, class28.field382, var11, class305.method2125((byte) 126, arg2.field2549), class92.field1671, class305.method2125((byte) 95, arg2.field2539 - arg2.field2549), class310.field5339 }, 29784);
            }
        } else {
            var5 = class30.method214(new class256[] { arg2.method1053((byte) -118), class28.field382, class271.field4640, class305.method2125((byte) 44, arg2.field2541), class310.field5339 }, 29784);
        }
        if (class21.field273 == 1) {
            class317.field5461++;
            class144.method1057(class30.method214(new class256[] { class99.field1765, class252.field4291, var5 }, 29784), arg1, (short) 12, 109, arg3, class251.field4260, class76.field1450, (long) arg4);
        } else if (!class320.field5489) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class117.field2055[var12] != null) {
                    short var13 = 0;
                    class307.field5294++;
                    boolean var14 = false;
                    if (class206.field3735 == 0 && class117.field2055[var12].method1769(class38.field696, (byte) 83)) {
                        if (class121.field2124.field2549 < arg2.field2549) {
                            var13 = 2000;
                        }
                        if (class121.field2124.field2531 != 0 && arg2.field2531 != 0) {
                            if (class121.field2124.field2531 == arg2.field2531) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class17.field242[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class75.field1438[var12];
                    short var16 = (short) (var13 + var15);
                    class144.method1057(class30.method214(new class256[] { class177.field3128, var5 }, 29784), arg1, var16, 125, arg3, class117.field2055[var12], class230.field3943[var12], (long) arg4);
                }
            }
        } else if ((class173.field3079 & 0x8) == 8) {
            class191.field3497++;
            class144.method1057(class30.method214(new class256[] { class24.field319, class252.field4291, var5 }, 29784), arg1, (short) 11, -64, arg3, class261.field4511, -1, (long) arg4);
        }
        for (int var17 = 0; var17 < class17.field244; var17++) {
            if (class303.field5243[var17] == 17) {
                class130.field2271[var17] = class30.method214(new class256[] { class177.field3128, var5 }, 29784);
                break;
            }
        }
        if (arg0 > -48) {
            field1258 = (class138) null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)Z", line = 513)
    public final boolean method528(boolean arg0) {
        if (!arg0) {
            this.method528(true);
        }
        field1256++;
        return this.field1257 == 115;
    }
}
