import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class160 extends class291 {

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "[B")
    public byte[] field2665;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "[Leg;")
    public static class37[] field2663 = new class37[500];

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "Leg;")
    public static class37 field2662 = class174.method1167("gr-Un:", 100);

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "Lbf;")
    public static class202 field2669 = new class202(5);

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "[I")
    public static int[] field2670 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "Z")
    public static boolean field2672 = false;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "Z")
    public static boolean field2673 = false;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field2674 = 0;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "Lbf;")
    public static class202 field2671 = new class202(30);

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
    public static void method1085(byte arg0) {
        field2670 = null;
        field2669 = null;
        field2662 = null;
        field2671 = null;
        if (arg0 != 121) {
            field2671 = null;
        }
        field2663 = null;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public static final void method1086(int arg0) {
        field2667++;
        if (class198.field3376 != null || class276.field4891 != null) {
            return;
        }
        if (arg0 != 18734) {
            field2663 = null;
        }
        int var1 = class32.field465;
        if (class152.field2556) {
            if (var1 != 1) {
                int var6 = class26.field363;
                int var7 = class268.field4689;
                if (var6 < field2676 - 10 || var6 > (field2676 + class137.field2348 + 10) || var7 < (class62.field1011 - 10) || var7 > class62.field1011 + class146.field2482 + 10) {
                    class152.field2556 = false;
                    class171.method1151(class62.field1011, class137.field2348, field2676, -30822, class146.field2482);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = field2676;
            int var9 = class62.field1011;
            int var10 = class137.field2348;
            int var11 = class163.field2685;
            int var12 = -1;
            int var13 = class110.field1837;
            for (int var14 = 0; var14 < class159.field2661; var14++) {
                int var15 = (class159.field2661 - var14 - 1) * 15 + var9 + 31;
                if (var11 > var8 && var8 + var10 > var11 && var13 > (var15 - 13) && (var15 + 3) > var13) {
                    var12 = var14;
                }
            }
            if (var12 != -1) {
                class271.method1821(2, var12);
            }
            class152.field2556 = false;
            class171.method1151(class62.field1011, class137.field2348, field2676, -30822, class146.field2482);
            return;
        }
        if (var1 == 1 && class159.field2661 > 0) {
            short var2 = class264.field4642[class159.field2661 - 1];
            if (var2 == 10 || var2 == 15 || var2 == 9 || var2 == 59 || var2 == 37 || var2 == 31 || var2 == 6 || var2 == 51 || var2 == 32 || var2 == 57 || var2 == 45 || var2 == 1004) {
                int var3 = class26.field368[class159.field2661 - 1];
                int var4 = class217.field3726[class159.field2661 - 1];
                class237 var5 = class156.method1066(-107, var4);
                if (class62.method443(client.method787(var5), -9170) || class50.method325(client.method787(var5), 1)) {
                    class188.field3234 = false;
                    class200.field3402 = 0;
                    if (class198.field3376 != null) {
                        class121.method856(24665, class198.field3376);
                    }
                    class198.field3376 = class156.method1066(-78, var4);
                    class290.field5111 = var3;
                    class262.field4616 = class110.field1837;
                    class139.field2393 = class163.field2685;
                    class121.method856(arg0 ^ 0x2977, class198.field3376);
                    return;
                }
            }
        }
        if (var1 == 1 && (class234.field4040 == 1 && class159.field2661 > 2 || class102.method688(arg0 - 20735, class159.field2661 + -1))) {
            var1 = 2;
        }
        if (var1 == 2 && class159.field2661 > 0 || class265.field4655 == 1) {
            class10.method59(-68);
        }
        if (var1 == 1 && class159.field2661 > 0 || class265.field4655 == 2) {
            class96.method624((byte) -64);
            return;
        }
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)I")
    public static final int method1087(int arg0) {
        field2666++;
        if (arg0 != -125) {
            method1086(104);
        }
        return class36.field532;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1088(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            field2676 = 58;
        }
        class41.field650 = 0;
        for (int var7 = -1; var7 < class138.field2360 + class46.field729; var7++) {
            class109 var23;
            if (var7 == -1) {
                var23 = class82.field1285;
            } else if (class138.field2360 > var7) {
                var23 = class98.field1526[class285.field5020[var7]];
            } else {
                var23 = class55.field833[class98.field1525[var7 - class138.field2360]];
            }
            if (var23 != null && var23.method767(arg5)) {
                if (var23 instanceof class163) {
                    class275 var24 = ((class163) var23).field2691;
                    if (var24.field4888 != null) {
                        var24 = var24.method1854((byte) 68);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class138.field2360 <= var7) {
                    class275 var25 = ((class163) var23).field2691;
                    if (var25.field4888 != null) {
                        var25 = var25.method1854((byte) 68);
                    }
                    if (var25.field4867 >= 0 && var25.field4867 < class197.field3353.length) {
                        int var26;
                        if (var25.field4872 == -1) {
                            var26 = var23.method760(-26093) + 15;
                        } else {
                            var26 = var25.field4872 + 15;
                        }
                        class171.method1147(125, var23, arg2, arg4, arg6 >> 1, arg3 >> 1, var26);
                        if (class203.field3460 > -1) {
                            class197.field3353[var25.field4867].method702(class203.field3460 + arg1 - 12, arg0 + -30 + class189.field3257);
                        }
                    }
                    class134[] var27 = class61.field1001;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class134 var29 = var27[var28];
                        if (var29 != null && var29.field2331 == 1 && class98.field1525[var7 - class138.field2360] == var29.field2335 && (class72.field1146 % 20) < 10) {
                            int var30;
                            if (var25.field4872 == -1) {
                                var30 = var23.method760(-26093) + 15;
                            } else {
                                var30 = var25.field4872 + 15;
                            }
                            class171.method1147(127, var23, arg2, arg4, arg6 >> 1, arg3 >> 1, var30);
                            if (class203.field3460 > -1) {
                                class89.field1425[var29.field2319].method702(class203.field3460 + arg1 - 12, arg0 - 28 + class189.field3257);
                            }
                        }
                    }
                } else {
                    int var31 = 30;
                    class188 var32 = (class188) var23;
                    if (var32.field3232 != -1 || var32.field3222 != -1) {
                        class171.method1147(118, var23, arg2, arg4, arg6 >> 1, arg3 >> 1, var23.method760(-26093) + 15);
                        if (class203.field3460 > -1) {
                            if (var32.field3232 != -1) {
                                class178.field2965[var32.field3232].method702(class203.field3460 + arg1 - 12, class189.field3257 - var31 + arg0);
                                var31 += 25;
                            }
                            if (var32.field3222 != -1) {
                                class197.field3353[var32.field3222].method702(arg1 - (12 - class203.field3460), class189.field3257 + arg0 + -var31);
                                var31 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var33 = 0;
                        class134[] var34 = class61.field1001;
                        while (var34.length > var33) {
                            class134 var35 = var34[var33];
                            if (var35 != null && var35.field2331 == 10 && class285.field5020[var7] == var35.field2335) {
                                class171.method1147(123, var23, arg2, arg4, arg6 >> 1, arg3 >> 1, var23.method760(-26093) + 15);
                                if (class203.field3460 > -1) {
                                    class89.field1425[var35.field2319].method702(arg1 + class203.field3460 - 12, arg0 - -class189.field3257 + -var31);
                                }
                            }
                            var33++;
                        }
                    }
                }
                if (var23.field1832 != null && (var7 >= class138.field2360 || class5.field90 == 0 || class5.field90 == 3 || class5.field90 == 1 && class79.method531(((class188) var23).field3235, false))) {
                    class171.method1147(118, var23, arg2, arg4, arg6 >> 1, arg3 >> 1, var23.method760(-26093));
                    if (class203.field3460 > -1 && class41.field650 < class176.field2949) {
                        class176.field2945[class41.field650] = class180.field3002.method1211(var23.field1832) / 2;
                        class176.field2946[class41.field650] = class180.field3002.field3048;
                        class176.field2941[class41.field650] = class203.field3460;
                        class176.field2951[class41.field650] = class189.field3257;
                        class176.field2939[class41.field650] = var23.field1830;
                        class176.field2952[class41.field650] = var23.field1802;
                        class176.field2940[class41.field650] = var23.field1776;
                        class176.field2948[class41.field650] = var23.field1832;
                        class41.field650++;
                    }
                }
                if (var23.field1808 > class72.field1146) {
                    class105 var36 = class153.field2563[0];
                    class105 var37 = class153.field2563[1];
                    int var41;
                    if (var23 instanceof class163) {
                        class163 var38 = (class163) var23;
                        class105[] var39 = (class105[]) class88.field1388.method1411(-27, (long) var38.field2691.field4842);
                        if (var39 == null) {
                            var39 = class69.method474(var38.field2691.field4842, class124.field2086, -4, 0);
                            if (var39 != null) {
                                class88.field1388.method1404((long) var38.field2691.field4842, arg5, var39);
                            }
                        }
                        if (var39 != null && var39.length == 2) {
                            var36 = var39[0];
                            var37 = var39[1];
                        }
                        class275 var40 = var38.field2691;
                        if (var40.field4872 == -1) {
                            var41 = var23.method760(-26093);
                        } else {
                            var41 = var40.field4872;
                        }
                    } else {
                        var41 = var23.method760(-26093);
                    }
                    class171.method1147(126, var23, arg2, arg4, arg6 >> 1, arg3 >> 1, var41 + var36.field1637 + 10);
                    if (class203.field3460 > -1) {
                        int var42 = class189.field3257 + arg0 - 3;
                        int var43 = class203.field3460 + arg1 - (var36.field1627 >> 1);
                        var36.method702(var43, var42);
                        int var44 = var23.field1807 * var36.field1627 / 255;
                        int var45 = var36.field1637;
                        class122.method879(var43, var42, var43 + var44, var42 + var45);
                        var37.method702(var43, var42);
                        class122.method869(arg1, arg0, arg1 + arg3, arg0 + arg6);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (var23.field1829[var46] > class72.field1146) {
                        int var49;
                        if (var23 instanceof class163) {
                            class163 var47 = (class163) var23;
                            class275 var48 = var47.field2691;
                            if (var48.field4872 == -1) {
                                var49 = var23.method760(-26093) / 2;
                            } else {
                                var49 = var48.field4872 / 2;
                            }
                        } else {
                            var49 = var23.method760(-26093) / 2;
                        }
                        class171.method1147(121, var23, arg2, arg4, arg6 >> 1, arg3 >> 1, var49);
                        if (class203.field3460 > -1) {
                            if (var46 == 1) {
                                class189.field3257 -= 20;
                            }
                            if (var46 == 2) {
                                class203.field3460 -= 15;
                                class189.field3257 -= 10;
                            }
                            if (var46 == 3) {
                                class203.field3460 += 15;
                                class189.field3257 -= 10;
                            }
                            class200.field3395[var23.field1818[var46]].method702(class203.field3460 + arg1 - 12, class189.field3257 + arg0 + -12);
                            class92.field1431.method1203(class163.method1096(var23.field1796[var46], (byte) -35), arg1 - (1 - class203.field3460), class189.field3257 + 3 + arg0, 16777215, 0);
                        }
                    }
                }
            }
        }
        field2664++;
        for (int var8 = 0; var8 < class41.field650; var8++) {
            int var9 = class176.field2951[var8];
            int var10 = class176.field2941[var8];
            int var11 = class176.field2945[var8];
            int var12 = class176.field2946[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((class176.field2951[var22] - class176.field2946[var22]) < (var9 + 2) && var9 - var12 < class176.field2951[var22] + 2 && class176.field2945[var22] + class176.field2941[var22] > -var11 + var10 && (class176.field2941[var22] - class176.field2945[var22]) < (var10 + var11) && class176.field2951[var22] - class176.field2946[var22] < var9) {
                        var13 = true;
                        var9 = class176.field2951[var22] - class176.field2946[var22];
                    }
                }
            }
            class203.field3460 = class176.field2941[var8];
            class189.field3257 = class176.field2951[var8] = var9;
            class37 var14 = class176.field2948[var8];
            if (class49.field769 == 0) {
                int var15 = 16776960;
                if (class176.field2939[var8] < 6) {
                    var15 = class254.field4518[class176.field2939[var8]];
                }
                if (class176.field2939[var8] == 6) {
                    var15 = class8.field137 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class176.field2939[var8] == 7) {
                    var15 = (class8.field137 % 20) < 10 ? 255 : 65535;
                }
                if (class176.field2939[var8] == 8) {
                    var15 = class8.field137 % 20 < 10 ? 45056 : 8454016;
                }
                if (class176.field2939[var8] == 9) {
                    int var16 = 150 - class176.field2940[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = (var16 - 100) * 5 + 65280;
                    }
                }
                if (class176.field2939[var8] == 10) {
                    int var17 = 150 - class176.field2940[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - (var17 * 327680 - 16384000);
                    } else if (var17 < 150) {
                        var15 = -(-(var17 * 327680) - 255) - (var17 - 100) * 5 - 32768000;
                    }
                }
                if (class176.field2939[var8] == 11) {
                    int var18 = 150 - class176.field2940[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 - 16318970;
                    } else if (var18 < 150) {
                        var15 = 49545215 - var18 * 327680;
                    }
                }
                if (class176.field2952[var8] == 0) {
                    class180.field3002.method1203(var14, class203.field3460 + arg1, arg0 - -class189.field3257, var15, 0);
                }
                if (class176.field2952[var8] == 1) {
                    class180.field3002.method1228(var14, class203.field3460 + arg1, class189.field3257 + arg0, var15, 0, class8.field137);
                }
                if (class176.field2952[var8] == 2) {
                    class180.field3002.method1206(var14, arg1 + class203.field3460, arg0 - -class189.field3257, var15, 0, class8.field137);
                }
                if (class176.field2952[var8] == 3) {
                    class180.field3002.method1221(var14, arg1 + class203.field3460, class189.field3257 + arg0, var15, 0, class8.field137, 150 - class176.field2940[var8]);
                }
                if (class176.field2952[var8] == 4) {
                    int var19 = (150 - class176.field2940[var8]) * (class180.field3002.method1211(var14) + 100) / 150;
                    class122.method879(class203.field3460 + arg1 - 50, arg0, class203.field3460 + arg1 + 50, arg0 - -arg6);
                    class180.field3002.method1226(var14, class203.field3460 + arg1 + 50 - var19, class189.field3257 + arg0, var15, 0);
                    class122.method869(arg1, arg0, arg1 + arg3, arg0 - -arg6);
                }
                if (class176.field2952[var8] == 5) {
                    int var20 = 0;
                    int var21 = 150 - class176.field2940[var8];
                    if (var21 < 25) {
                        var20 = var21 - 25;
                    } else if (var21 > 125) {
                        var20 = var21 - 125;
                    }
                    class122.method879(arg1, arg0 + class189.field3257 - class180.field3002.field3048 - 1, arg1 + arg3, class189.field3257 + arg0 + 5);
                    class180.field3002.method1203(var14, class203.field3460 + arg1, class189.field3257 + var20 + arg0, var15, 0);
                    class122.method869(arg1, arg0, arg1 + arg3, arg0 - -arg6);
                }
            } else {
                class180.field3002.method1203(var14, class203.field3460 + arg1, class189.field3257 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "([B)V")
    public class160(byte[] arg0) {
        this.field2665 = arg0;
    }
}
