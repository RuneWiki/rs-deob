import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class34 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lvf;")
    private class196 field516 = new class196();

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lob;")
    private class129 field535 = new class129();

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Ldb;")
    private class32 field536;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lai;")
    private static class10 field518 = class44.method278("Use", 98);

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field529 = 0;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lai;")
    private static class10 field515 = class44.method278("glow1:", -52);

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lai;")
    public static class10 field524 = field515;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lai;")
    public static class10 field514 = field515;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field532 = 0;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Lai;")
    public static class10 field534 = class44.method278("mod_icons", 107);

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lai;")
    public static class10 field528 = field518;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)I")
    public static final int method221(int arg0, boolean arg1) {
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        if (!arg1) {
            field515 = null;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field531++;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJ)Lvf;")
    public final class196 method222(int arg0, long arg1) {
        field517++;
        class196 var4 = (class196) this.field536.method213(127, arg1);
        int var5 = 46 % ((55 - arg0) / 51);
        if (var4 != null) {
            this.field535.method902((byte) 125, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method223(int arg0) {
        field514 = null;
        field515 = null;
        field528 = null;
        field524 = null;
        field518 = null;
        int var1 = 100 / ((48 - arg0) / 46);
        field534 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)Ln;")
    public static final class118 method224(int arg0, int arg1, int arg2, int arg3) {
        field533++;
        class118 var4 = new class118();
        var4.field2281 = arg0;
        var4.field2272 = arg2;
        class165.field3162.method214(var4, (byte) 120, (long) arg1);
        class182.method1181(-109, arg2);
        class14.method90(-104, arg2);
        class200 var5 = class66.method432(arg1, false);
        if (var5 != null) {
            class168.method1116(var5, -83);
        }
        if (class137.field2569 != null) {
            class168.method1116(class137.field2569, -95);
            class137.field2569 = null;
        }
        class180.field3415 = false;
        class53.field946 = 0;
        class147.method1015(false, class160.field3086, class193.field3670, class118.field2279, class108.field2008);
        if (class27.field402 != arg3) {
            class73.method460(1, class27.field402, (byte) -110);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJLvf;)V")
    public final void method225(int arg0, long arg1, class196 arg2) {
        if (arg0 != -21284) {
            method224(-65, -86, 80, 97);
        }
        field530++;
        if (this.field538 == 0) {
            class196 var5 = this.field535.method896(117);
            var5.method848(false);
            var5.method1247(arg0 + 21284);
            if (this.field516 == var5) {
                class196 var6 = this.field535.method896(116);
                var6.method848(false);
                var6.method1247(0);
            }
        } else {
            this.field538--;
        }
        this.field536.method214(arg2, (byte) 107, arg1);
        this.field535.method902((byte) 114, arg2);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public final void method226(byte arg0) {
        field519++;
        while (true) {
            class196 var2 = this.field535.method896(102);
            if (var2 == null) {
                this.field538 = this.field537;
                if (arg0 == -90) {
                    return;
                } else {
                    field532 = -106;
                    return;
                }
            }
            var2.method848(false);
            var2.method1247(arg0 + 90);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
    public static int method227(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lna;")
    public final class119 method228(byte arg0) {
        field522++;
        int var2 = 40 / ((arg0 + 32) / 61);
        return this.field536.method212((byte) 106);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
    public final void method229(long arg0, int arg1) {
        field523++;
        if (arg1 != 0) {
            return;
        }
        class196 var4 = (class196) this.field536.method213(-55, arg0);
        if (var4 != null) {
            var4.method848(false);
            var4.method1247(arg1);
            this.field538++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static final void method230(byte arg0) {
        class29.field435.method226((byte) -90);
        field521++;
        if (arg0 <= 12) {
            method224(-89, -104, 82, -63);
        }
        class35.field546.method226((byte) -90);
        class169.field3258.method226((byte) -90);
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    public static final void method231(byte arg0) {
        field527++;
        if (arg0 >= -85) {
            method224(-67, -109, 76, 76);
        }
        class130.field2469.method226((byte) -90);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Lna;")
    public final class119 method232(int arg0) {
        field513++;
        int var2 = 127 / ((-arg0 - 62) / 57);
        return this.field536.method215((byte) 34);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZIII)V")
    public static final void method233(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class205.field3989 = 0;
        field526++;
        if (arg1) {
            method231((byte) -62);
        }
        for (int var5 = -1; var5 < class93.field1690 + class189.field3616; var5++) {
            class65 var21;
            if (var5 == -1) {
                var21 = class145.field2767;
            } else if (class189.field3616 <= var5) {
                var21 = class168.field3249[class166.field3187[var5 - class189.field3616]];
            } else {
                var21 = class2.field10[class174.field3355[var5]];
            }
            if (var21 != null && var21.method250((byte) 50)) {
                if (var21 instanceof class125) {
                    class188 var22 = ((class125) var21).field2386;
                    if (var22.field3596 != null) {
                        var22 = var22.method1208((byte) -127);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class189.field3616 <= var5) {
                    class188 var25 = ((class125) var21).field2386;
                    if (var25.field3596 != null) {
                        var25 = var25.method1208((byte) -126);
                    }
                    if (var25.field3571 >= 0 && var25.field3571 < class64.field1065.length) {
                        class19.method129(var21, -73, var21.method425(arg1) + 15);
                        if (class190.field3619 > -1) {
                            class64.field1065[var25.field3571].method105(arg2 + class190.field3619 - 12, arg0 - -class33.field495 - 30);
                        }
                    }
                    if (class74.field1274 == 1 && class166.field3187[var5 - class189.field3616] == class175.field3361 && class120.field2304 % 20 < 10) {
                        class19.method129(var21, -82, var21.method425(false) + 15);
                        if (class190.field3619 > -1) {
                            class97.field1787[0].method105(class190.field3619 + arg2 - 12, class33.field495 + arg0 - 28);
                        }
                    }
                } else {
                    class38 var23 = (class38) var21;
                    int var24 = 30;
                    if (var23.field597 != -1 || var23.field618 != -1) {
                        class19.method129(var21, 124, var21.method425(false) + 15);
                        if (class190.field3619 > -1) {
                            if (var23.field597 != -1) {
                                class102.field1914[var23.field597].method105(arg2 + class190.field3619 - 12, class33.field495 + arg0 + -var24);
                                var24 += 25;
                            }
                            if (var23.field618 != -1) {
                                class64.field1065[var23.field618].method105(arg2 + class190.field3619 - 12, class33.field495 + arg0 - var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class74.field1274 == 10 && class174.field3355[var5] == class5.field66) {
                        class19.method129(var21, 106, var21.method425(false) + 15);
                        if (class190.field3619 > -1) {
                            class97.field1787[1].method105(class190.field3619 + arg2 - 12, -var24 + class33.field495 + arg0);
                        }
                    }
                }
                if (var21.field1087 != null && (class189.field3616 <= var5 || field525 == 0 || field525 == 3 || field525 == 1 && class107.method689(((class38) var21).field602, -1))) {
                    class19.method129(var21, 61, var21.method425(arg1));
                    if (class190.field3619 > -1 && class109.field2027 > class205.field3989) {
                        class109.field2038[class205.field3989] = class97.field1795.method1270(var21.field1087) / 2;
                        class109.field2035[class205.field3989] = class97.field1795.field3754;
                        class109.field2028[class205.field3989] = class190.field3619;
                        class109.field2023[class205.field3989] = class33.field495;
                        class109.field2029[class205.field3989] = var21.field1138;
                        class109.field2036[class205.field3989] = var21.field1101;
                        class109.field2025[class205.field3989] = var21.field1132;
                        class109.field2032[class205.field3989] = var21.field1087;
                        class205.field3989++;
                    }
                }
                if (var21.field1115 > class120.field2304) {
                    class19.method129(var21, 64, var21.method425(false) + 15);
                    if (class190.field3619 > -1) {
                        int var26 = var21.field1137 * 30 / var21.field1095;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class62.method412(class190.field3619 + arg2 - 15, arg0 + -3 - -class33.field495, var26, 5, 65280);
                        class62.method412(class190.field3619 + arg2 + var26 - 15, class33.field495 + arg0 + -3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class120.field2304 < var21.field1142[var27]) {
                        class19.method129(var21, 72, var21.method425(false) / 2);
                        if (class190.field3619 > -1) {
                            if (var27 == 1) {
                                class33.field495 -= 20;
                            }
                            if (var27 == 2) {
                                class33.field495 -= 10;
                                class190.field3619 -= 15;
                            }
                            if (var27 == 3) {
                                class190.field3619 += 15;
                                class33.field495 -= 10;
                            }
                            class116.field2231[var21.field1146[var27]].method105(class190.field3619 + arg2 - 12, class33.field495 + arg0 + -12);
                            class67.field1162.method1262(class119.method846(0, var21.field1118[var27]), arg2 + class190.field3619 - 1, class33.field495 + arg0 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class205.field3989; var6++) {
            int var7 = class109.field2028[var6];
            int var8 = class109.field2023[var6];
            boolean var9 = true;
            int var10 = class109.field2038[var6];
            int var11 = class109.field2035[var6];
            while (var9) {
                var9 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class109.field2023[var20] + -class109.field2035[var20] && var8 - var11 < class109.field2023[var20] - -2 && var7 - var10 < class109.field2038[var20] + class109.field2028[var20] && var7 + var10 > class109.field2028[var20] + -class109.field2038[var20] && class109.field2023[var20] - class109.field2035[var20] < var8) {
                        var8 = class109.field2023[var20] - class109.field2035[var20];
                        var9 = true;
                    }
                }
            }
            class190.field3619 = class109.field2028[var6];
            class33.field495 = class109.field2023[var6] = var8;
            class10 var12 = class109.field2032[var6];
            if (class172.field3324 == 0) {
                int var13 = 16776960;
                if (class109.field2029[var6] < 6) {
                    var13 = class57.field1006[class109.field2029[var6]];
                }
                if (class109.field2029[var6] == 6) {
                    var13 = class119.field2292 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class109.field2029[var6] == 7) {
                    var13 = class119.field2292 % 20 >= 10 ? 65535 : 255;
                }
                if (class109.field2029[var6] == 8) {
                    var13 = class119.field2292 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class109.field2029[var6] == 9) {
                    int var14 = 150 - class109.field2025[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class109.field2029[var6] == 10) {
                    int var15 = 150 - class109.field2025[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 755 - var15 * 5 - 32768000;
                    }
                }
                if (class109.field2029[var6] == 11) {
                    int var16 = 150 - class109.field2025[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 32768000 + 16777215 - var16 * 327680;
                    }
                }
                if (class109.field2036[var6] == 0) {
                    class97.field1795.method1262(var12, arg2 + class190.field3619, class33.field495 + arg0, var13, 0);
                }
                if (class109.field2036[var6] == 1) {
                    class97.field1795.method1283(var12, class190.field3619 + arg2, class33.field495 + arg0, var13, 0, class119.field2292);
                }
                if (class109.field2036[var6] == 2) {
                    class97.field1795.method1281(var12, class190.field3619 + arg2, class33.field495 + arg0, var13, 0, class119.field2292);
                }
                if (class109.field2036[var6] == 3) {
                    class97.field1795.method1278(var12, class190.field3619 + arg2, class33.field495 + arg0, var13, 0, class119.field2292, 150 - class109.field2025[var6]);
                }
                if (class109.field2036[var6] == 4) {
                    int var17 = (150 - class109.field2025[var6]) * (class97.field1795.method1270(var12) + 100) / 150;
                    class62.method414(class190.field3619 + arg2 - 50, arg0, class190.field3619 + arg2 + 50, arg0 + arg4);
                    class97.field1795.method1266(var12, class190.field3619 + arg2 + 50 - var17, class33.field495 + arg0, var13, 0);
                    class62.method409(arg2, arg0, arg2 + arg3, arg0 - -arg4);
                }
                if (class109.field2036[var6] == 5) {
                    int var18 = 150 - class109.field2025[var6];
                    class62.method414(arg2, arg0 + class33.field495 - class97.field1795.field3754 - 1, arg2 + arg3, arg0 + class33.field495 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class97.field1795.method1262(var12, class190.field3619 + arg2, class33.field495 + arg0 + var19, var13, 0);
                    class62.method409(arg2, arg0, arg2 + arg3, arg0 + arg4);
                }
            } else {
                class97.field1795.method1262(var12, class190.field3619 + arg2, class33.field495 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
    public class34(int arg0) {
        int var2 = 1;
        this.field538 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field537 = arg0;
        this.field536 = new class32(var2);
    }
}
