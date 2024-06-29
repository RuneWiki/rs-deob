import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class159 {

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    private int field2289 = 0;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "[Lki;")
    public class499[] field2268;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Lfg;")
    public static class83 field2280 = new class83("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field2284 = new String[100];

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "J")
    public static long field2286 = -1L;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "Lqo;")
    public static class19 field2281 = new class19("", 12);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "J")
    private long field2266;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Lvh;")
    public static class240 field2290;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lki;")
    private class499 field2278;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Lki;")
    private class499 field2287;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "[S")
    public static short[] field2288;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILkj;Ljava/awt/Frame;)V", line = 3)
    public static final void method978(int arg0, class397 arg1, Frame arg2) {
        if (arg0 > -88) {
            field2288 = null;
        }
        while (true) {
            class409 var3 = arg1.method2282(arg2, (byte) 12);
            while (var3.field5652 == 0) {
                class496.method2931((byte) 125, 10L);
            }
            if (var3.field5652 == 1) {
                field2272++;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class496.method2931((byte) 122, 100L);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BJ)Lki;", line = 32)
    public final class499 method979(byte arg0, long arg1) {
        this.field2266 = arg1;
        field2265++;
        class499 var4 = this.field2268[(int) (arg1 & (long) (this.field2282 - 1))];
        for (this.field2278 = var4.field7336; this.field2278 != var4; this.field2278 = this.field2278.field7336) {
            if (this.field2278.field7342 == arg1) {
                class499 var5 = this.field2278;
                this.field2278 = this.field2278.field7336;
                return var5;
            }
        }
        this.field2278 = null;
        return arg0 == 28 ? null : null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 65)
    public static void method980(int arg0) {
        field2281 = null;
        field2290 = null;
        field2284 = null;
        field2280 = null;
        if (arg0 == -5768) {
            field2288 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)Lki;", line = 86)
    public final class499 method981(int arg0) {
        field2270++;
        this.field2289 = arg0;
        return this.method989(arg0);
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 96)
    public static final void method982(int arg0) {
        field2267++;
        if (arg0 > ~class471.field6890) {
            class528.method3102(arg0 ^ 0x7F);
        } else {
            class152.field2137 = class117.field1578;
            class117.field1578 = null;
            class26.method186(40, 8);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lqa;III)V", line = 117)
    public static final void method983(class162 arg0, int arg1, int arg2, int arg3) {
        field2276++;
        if (arg1 < 0 || arg2 < 0 || class44.field616 == 0 || class52.field694 == 0) {
            return;
        }
        arg0.method467(class388.field5451, class160.field2294, class44.field616, class52.field694);
        arg0.method462(class239.field3278, class290.field3895, class44.field616, class52.field694);
        class415 var4 = arg0.method491();
        var4.method341(class205.field2905, class267.field3661, class112.field1518, class527.field7742, class105.field1437, class86.field1185);
        arg0.method437(var4);
        if (class19.field195 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method447();
            int var8 = (arg1 - class388.field5451) * var7 / class44.field616;
            int var9 = (arg2 - class160.field2294) * var7 / class52.field694;
            int var10 = arg0.method460();
            int var11 = (arg1 - class388.field5451) * var10 / class44.field616;
            int var12 = (arg2 - class160.field2294) * var10 / class52.field694;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method327(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method327(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class442.field6435 && var22 < class232.field3217) {
                    int var23 = class75.field1089.field464;
                    if (var23 < 3 && (class456.field6661[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class19.field195[var23].method232(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class75.field1089.method167(-1) - 1 << 6) >> 7;
                        var6 = var21 + (class75.field1089.method167(-1) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class297.field4101 && (class450.field6497 & 0x40) != 0) {
                    class295 var24 = class12.method106(class401.field5585, (byte) 49, class455.field6651);
                    if (var24 == null) {
                        class370.method2145(-1);
                    } else {
                        class376.method2167(var5, var6, 0L, 19, class327.field4483, (byte) -90, -1, false, " ->", class344.field4734, true);
                    }
                } else {
                    if (class341.field4700 == class288.field3885) {
                        class376.method2167(var5, var6, 0L, 49, -1, (byte) -90, -1, false, "", class99.field1365.method590(class105.field1434, -22602), true);
                    }
                    class91.field1225++;
                    class376.method2167(var5, var6, 0L, 8, class340.field4697, (byte) -90, -1, false, "", class319.field4406, true);
                }
            }
        }
        class398 var25 = class521.field7677;
        if (arg3 != 14349) {
            field2286 = -24L;
        }
        for (class498 var26 = (class498) var25.method2306(111); var26 != null; var26 = (class498) var25.method2302(arg3 ^ 0xFFFFC782)) {
            if (class75.field1089.field464 == var26.field7333 && var26.method2939(arg2, arg1, (byte) -41, arg0)) {
                if (var26.field7328 instanceof class192) {
                    class192 var27 = (class192) var26.field7328;
                    int var28 = var27.method167(-1);
                    if ((var28 & 0x1) == 0 && (var27.field466 & 0x7F) == 0 && (var27.field461 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field466 & 0x7F) == 64 && (var27.field461 & 0x7F) == 64) {
                        int var29 = var27.field466 - (var27.method167(arg3 - 14350) - 1 << 6);
                        int var30 = var27.field461 - (var27.method167(arg3 ^ 0xFFFFC7F2) - 1 << 6);
                        for (int var31 = 0; var31 < class166.field2352; var31++) {
                            class405 var38 = class179.field2534[class54.field750[var31]];
                            if (var38 != null && class393.field5484 != var38.field359 && var38.field353) {
                                int var39 = var38.field466 - (var38.field5623.field4637 - 1 << 6);
                                int var40 = var38.field461 - (var38.field5623.field4637 - 1 << 6);
                                if (var39 >= var29 && var38.field5623.field4637 <= (var27.method167(-1) - (var39 - var29 >> 7)) && var30 <= var40 && var38.field5623.field4637 <= (var27.method167(arg3 - 14350) - (var40 - var30 >> 7))) {
                                    class2.method10(class75.field1089.field464 != var26.field7333, true, var38);
                                    var38.field359 = class393.field5484;
                                }
                            }
                        }
                        int var32 = class378.field5322;
                        int[] var33 = class95.field1321;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class192 var35 = class309.field4234[var33[var34]];
                            if (var35 != null && class393.field5484 != var35.field359 && var27 != var35 && var35.field353) {
                                int var36 = var35.field466 - (var35.method167(-1) - 1 << 6);
                                int var37 = var35.field461 - (var35.method167(-1) - 1 << 6);
                                if (var36 >= var29 && var35.method167(arg3 - 14350) <= (var27.method167(-1) - (var36 - var29 >> 7)) && var30 <= var37 && var35.method167(-1) <= var27.method167(-1) - (var37 - var30 >> 7)) {
                                    class519.method3055(class75.field1089.field464 != var26.field7333, (byte) 57, var35);
                                    var35.field359 = class393.field5484;
                                }
                            }
                        }
                    }
                    if (class393.field5484 == var27.field359) {
                        continue;
                    }
                    class519.method3055(class75.field1089.field464 != var26.field7333, (byte) -93, var27);
                    var27.field359 = class393.field5484;
                }
                if (var26.field7328 instanceof class405) {
                    class405 var41 = (class405) var26.field7328;
                    if (var41.field5623 != null) {
                        if ((var41.field5623.field4637 & 0x1) == 0 && (var41.field466 & 0x7F) == 0 && (var41.field461 & 0x7F) == 0 || (var41.field5623.field4637 & 0x1) == 1 && (var41.field466 & 0x7F) == 64 && (var41.field461 & 0x7F) == 64) {
                            int var42 = var41.field466 - (var41.field5623.field4637 - 1 << 6);
                            int var43 = var41.field461 - (var41.field5623.field4637 - 1 << 6);
                            for (int var44 = 0; var44 < class166.field2352; var44++) {
                                class405 var51 = class179.field2534[class54.field750[var44]];
                                if (var51 != null && class393.field5484 != var51.field359 && var41 != var51 && var51.field353) {
                                    int var52 = var51.field466 - (var51.field5623.field4637 - 1 << 6);
                                    int var53 = var51.field461 - (var51.field5623.field4637 - 1 << 6);
                                    if (var42 <= var52 && var51.field5623.field4637 <= var41.field5623.field4637 - (var52 - var42 >> 7) && var43 <= var53 && var51.field5623.field4637 <= var41.field5623.field4637 - (var53 - var43 >> 7)) {
                                        class2.method10(class75.field1089.field464 != var26.field7333, true, var51);
                                        var51.field359 = class393.field5484;
                                    }
                                }
                            }
                            int var45 = class378.field5322;
                            int[] var46 = class95.field1321;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class192 var48 = class309.field4234[var46[var47]];
                                if (var48 != null && class393.field5484 != var48.field359 && var48.field353) {
                                    int var49 = var48.field466 - (var48.method167(-1) - 1 << 6);
                                    int var50 = var48.field461 - (var48.method167(-1) - 1 << 6);
                                    if (var42 <= var49 && var48.method167(-1) <= var41.field5623.field4637 - (var49 - var42 >> 7) && var43 <= var50 && var48.method167(-1) <= (var41.field5623.field4637 - (var50 - var43 >> 7))) {
                                        class519.method3055(class75.field1089.field464 != var26.field7333, (byte) -89, var48);
                                        var48.field359 = class393.field5484;
                                    }
                                }
                            }
                        }
                        if (class393.field5484 == var41.field359) {
                            continue;
                        }
                        class2.method10(class75.field1089.field464 != var26.field7333, true, var41);
                        var41.field359 = class393.field5484;
                    }
                }
                if (var26.field7328 instanceof class108) {
                    class152 var54 = (class152) class456.field6672.method979((byte) 28, (long) (var26.field7334 | var26.field7333 << 28 | var26.field7330 << 14));
                    if (var54 != null) {
                        for (class493 var55 = (class493) var54.field2134.method3077((byte) -92); var55 != null; var55 = (class493) var54.field2134.method3075((byte) 79)) {
                            class316 var56 = class75.field1097.method823(false, var55.field7287);
                            if (!class297.field4101) {
                                if (class75.field1089.field464 == var26.field7333) {
                                    String[] var57 = var56.field4334;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            int var60 = class118.field1593;
                                            if (var58 == 0) {
                                                var59 = 3;
                                            }
                                            if (var58 == 1) {
                                                var59 = 45;
                                            }
                                            if (var58 == 2) {
                                                var59 = 48;
                                            }
                                            if (var58 == 3) {
                                                var59 = 13;
                                            }
                                            if (var58 == 4) {
                                                var59 = 59;
                                            }
                                            if (var56.field4357 == var58) {
                                                var60 = var56.field4376;
                                            }
                                            if (var56.field4380 == var58) {
                                                var60 = var56.field4336;
                                            }
                                            class376.method2167(var26.field7334, var26.field7330, (long) var55.field7287, var59, var60, (byte) -90, -1, false, "<col=ff9040>" + var56.field4345, var57[var58], true);
                                            class405.field5611++;
                                        }
                                    }
                                }
                                class305.field4181++;
                                class376.method2167(var26.field7334, var26.field7330, (long) var55.field7287, 1011, class247.field3442, (byte) -90, -1, class75.field1089.field464 != var26.field7333, "<col=ff9040>" + var56.field4345, class441.field6423.method590(class105.field1434, -22602), true);
                            } else if (class75.field1089.field464 == var26.field7333) {
                                class89 var61 = class352.field4810 == -1 ? null : class284.field3819.method1088(class352.field4810, (byte) -124);
                                if ((class450.field6497 & 0x1) != 0 && (var61 == null || var56.method1790(27911, class352.field4810, var61.field1220) != var61.field1220)) {
                                    class482.field7068++;
                                    class376.method2167(var26.field7334, var26.field7330, (long) var55.field7287, 50, class327.field4483, (byte) -90, -1, false, class526.field7728 + " -> <col=ff9040>" + var56.field4345, class344.field4734, true);
                                }
                            }
                        }
                    }
                }
                if (var26.field7328 instanceof class55) {
                    class55 var62 = (class55) var26.field7328;
                    class132 var63 = class82.field1154.method2121(var62.method354((byte) 125), true);
                    if (var63.field1814 != null) {
                        var63 = var63.method870(0, class453.field6623);
                    }
                    if (var63 != null) {
                        if (!class297.field4101) {
                            if (class75.field1089.field464 == var26.field7333) {
                                String[] var64 = var63.field1902;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            if (var65 == 0) {
                                                var66 = 60;
                                            }
                                            int var67 = class118.field1593;
                                            if (var65 == 1) {
                                                var66 = 11;
                                            }
                                            if (var65 == 2) {
                                                var66 = 47;
                                            }
                                            if (var65 == 3) {
                                                var66 = 58;
                                            }
                                            if (var63.field1855 == var65) {
                                                var67 = var63.field1897;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1009;
                                            }
                                            if (var63.field1844 == var65) {
                                                var67 = var63.field1882;
                                            }
                                            class376.method2167(var26.field7334, var26.field7330, class391.method2238(var62, var26.field7334, -10737, var26.field7330), var66, var67, (byte) -90, -1, false, "<col=00ffff>" + var63.field1845, var64[var65], true);
                                            class121.field1672++;
                                        }
                                    }
                                }
                            }
                            class388.field5447++;
                            class376.method2167(var26.field7334, var26.field7330, (long) var63.field1866, 1003, class247.field3442, (byte) -90, -1, class75.field1089.field464 != var26.field7333, "<col=00ffff>" + var63.field1845, class441.field6423.method590(class105.field1434, arg3 ^ 0xFFFF9FBB), true);
                        } else if (class75.field1089.field464 == var26.field7333) {
                            class89 var68 = class352.field4810 == -1 ? null : class284.field3819.method1088(class352.field4810, (byte) -123);
                            if ((class450.field6497 & 0x4) != 0 && (var68 == null || var63.method864(arg3 - 14350, class352.field4810, var68.field1220) != var68.field1220)) {
                                class360.field4941++;
                                class376.method2167(var26.field7334, var26.field7330, class391.method2238(var62, var26.field7334, -10737, var26.field7330), 9, class327.field4483, (byte) -90, -1, false, class526.field7728 + " -> <col=00ffff>" + var63.field1845, class344.field4734, true);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([Lki;I)I", line = 583)
    public final int method984(class499[] arg0, int arg1) {
        field2271++;
        int var3 = 0;
        int var4 = 0;
        if (arg1 != 1) {
            return -110;
        }
        while (this.field2282 > var4) {
            class499 var5 = this.field2268[var4];
            for (class499 var6 = var5.field7336; var6 != var5; var6 = var6.field7336) {
                arg0[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIII)V", line = 614)
    public static final void method985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2264++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class335.field4562 - class438.field6393) * var8 / 100 + class438.field6393;
        int var10 = arg1 * var9 >> 8;
        int var11 = arg7 - arg5 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class377.field5316[var11] * -var10 >> 15;
            var15 = class377.field5315[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class377.field5316[var12] * var15 >> 15;
            var15 = class377.field5315[var12] * var15 >> 15;
        }
        class526.field7729 = arg0 - var14;
        class250.field3483 = 0;
        class208.field2951 = arg6;
        class310.field4240 = arg2 - var15;
        class132.field1901 = arg3 - var13;
        class476.field6958 = arg5;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZIII)V", line = 665)
    public static final void method986(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2283++;
        class163 var5 = class271.method1546(arg2, 8, arg1);
        if (!arg1) {
            method980(-29);
        }
        var5.method1017(0);
        var5.field2328 = arg0;
        var5.field2332 = arg4;
        var5.field2324 = arg3;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)I", line = 684)
    public final int method987(int arg0) {
        field2277++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2282; var3++) {
            class499 var4 = this.field2268[var3];
            for (class499 var5 = var4.field7336; var5 != var4; var5 = var5.field7336) {
                var2++;
            }
        }
        if (arg0 != 18791) {
            method980(-51);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I", line = 715)
    public final int method988(int arg0) {
        field2274++;
        int var2 = 82 / ((arg0 - 12) / 50);
        return this.field2282;
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)Lki;", line = 725)
    public final class499 method989(int arg0) {
        if (arg0 != 0) {
            this.method979((byte) 39, -126L);
        }
        field2279++;
        if (this.field2289 > 0 && this.field2268[this.field2289 - 1] != this.field2287) {
            class499 var2 = this.field2287;
            this.field2287 = var2.field7336;
            return var2;
        }
        while (this.field2282 > this.field2289) {
            class499 var3 = this.field2268[this.field2289++].field7336;
            if (this.field2268[this.field2289 - 1] != var3) {
                this.field2287 = var3.field7336;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JBLki;)V", line = 764)
    public final void method990(long arg0, byte arg1, class499 arg2) {
        if (arg2.field7339 != null) {
            arg2.method2946(-95);
        }
        field2269++;
        class499 var5 = this.field2268[(int) ((long) (this.field2282 - 1) & arg0)];
        arg2.field7336 = var5;
        arg2.field7339 = var5.field7339;
        arg2.field7339.field7336 = arg2;
        if (arg1 > 4) {
            arg2.field7342 = arg0;
            arg2.field7336.field7339 = arg2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I)V", line = 789)
    public class159(int arg0) {
        this.field2282 = arg0;
        this.field2268 = new class499[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class499 var3 = this.field2268[var2] = new class499();
            var3.field7336 = var3;
            var3.field7339 = var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Lki;", line = 814)
    public final class499 method991(byte arg0) {
        field2275++;
        if (this.field2278 == null) {
            return null;
        }
        if (arg0 >= -98) {
            this.method979((byte) -25, -70L);
        }
        class499 var2 = this.field2268[(int) (this.field2266 & (long) (this.field2282 - 1))];
        while (this.field2278 != var2) {
            if (this.field2278.field7342 == this.field2266) {
                class499 var3 = this.field2278;
                this.field2278 = this.field2278.field7336;
                return var3;
            }
            this.field2278 = this.field2278.field7336;
        }
        this.field2278 = null;
        return null;
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V", line = 846)
    public final void method992(int arg0) {
        for (int var2 = 0; var2 < this.field2282; var2++) {
            class499 var3 = this.field2268[var2];
            while (true) {
                class499 var4 = var3.field7336;
                if (var3 == var4) {
                    break;
                }
                var4.method2946(-122);
            }
        }
        if (arg0 != -15728) {
            this.method990(73L, (byte) -111, null);
        }
        field2273++;
        this.field2287 = null;
        this.field2278 = null;
    }
}
