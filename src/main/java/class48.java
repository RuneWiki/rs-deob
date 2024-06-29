import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class48 extends class97 {

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Lea;")
    public static class38 field1148 = class9.method46((byte) 106, "::rect_debug");

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Lea;")
    public static class38 field1149 = class9.method46((byte) 127, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "Lea;")
    private static class38 field1154 = class9.method46((byte) 125, "Malformed login packet)3");

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "[I")
    public static int[] field1167 = new int[2000];

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "Lea;")
    public static class38 field1169 = class9.method46((byte) 107, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lea;")
    public static class38 field1159 = field1154;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public int field1156;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Lea;")
    public class38 field1165;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lef;")
    public class43 field1150;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lef;")
    public class43 field1153;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1168;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "[Lpc;")
    public static class137[] field1161;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "[Ljava/lang/Object;")
    public Object[] field1166;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
    public static final void method337(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class59.field1472 = 0;
        for (int var5 = -1; var5 < class50.field1247 + class177.field3593; var5++) {
            class19 var21;
            if (var5 == -1) {
                var21 = class195.field3842;
            } else if (var5 >= class50.field1247) {
                var21 = class105.field2343[class170.field3488[var5 - class50.field1247]];
            } else {
                var21 = class175.field3550[class65.field1556[var5]];
            }
            if (var21 != null && var21.method108(20542)) {
                if (var21 instanceof class102) {
                    class152 var22 = ((class102) var21).field2298;
                    if (var22.field3139 != null) {
                        var22 = var22.method1068((byte) -54);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class50.field1247) {
                    class152 var25 = ((class102) var21).field2298;
                    if (var25.field3139 != null) {
                        var25 = var25.method1068((byte) -58);
                    }
                    if (var25.field3144 >= 0 && class132.field2812.length > var25.field3144) {
                        class165.method1178(var21, var21.field431 + 15, (byte) 100);
                        if (class195.field3840 > -1) {
                            class132.field2812[var25.field3144].method755(arg1 + class195.field3840 - 12, arg0 + -30 + class66.field1579);
                        }
                    }
                    if (class136.field2865 == 1 && class170.field3488[var5 - class50.field1247] == class128.field2743 && class45.field1098 % 20 < 10) {
                        class165.method1178(var21, var21.field431 + 15, (byte) 89);
                        if (class195.field3840 > -1) {
                            class203.field4013[0].method755(class195.field3840 + arg1 - 12, class66.field1579 + arg0 + -28);
                        }
                    }
                } else {
                    int var23 = 30;
                    class144 var24 = (class144) var21;
                    if (var24.field3002 != -1 || var24.field3009 != -1) {
                        class165.method1178(var21, var21.field431 + 15, (byte) 111);
                        if (class195.field3840 > -1) {
                            if (var24.field3002 != -1) {
                                class34.field712[var24.field3002].method755(arg1 + class195.field3840 - 12, -var23 + class66.field1579 + arg0);
                                var23 += 25;
                            }
                            if (var24.field3009 != -1) {
                                class132.field2812[var24.field3009].method755(class195.field3840 + arg1 - 12, arg0 - (-class66.field1579 - -var23));
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class136.field2865 == 10 && class65.field1556[var5] == class6.field161) {
                        class165.method1178(var21, var21.field431 + 15, (byte) 112);
                        if (class195.field3840 > -1) {
                            class203.field4013[1].method755(arg1 + class195.field3840 - 12, class66.field1579 + arg0 + -var23);
                        }
                    }
                }
                if (var21.field434 != null && (var5 >= class50.field1247 || class151.field3109 == 0 || class151.field3109 == 3 || class151.field3109 == 1 && class200.method1311(((class144) var21).field3022, arg3 - 40))) {
                    class165.method1178(var21, var21.field431, (byte) 107);
                    if (class195.field3840 > -1 && class139.field2895 > class59.field1472) {
                        class139.field2907[class59.field1472] = class33.field686.method656(var21.field434) / 2;
                        class139.field2905[class59.field1472] = class33.field686.field1870;
                        class139.field2901[class59.field1472] = class195.field3840;
                        class139.field2902[class59.field1472] = class66.field1579;
                        class139.field2909[class59.field1472] = var21.field398;
                        class139.field2890[class59.field1472] = var21.field413;
                        class139.field2899[class59.field1472] = var21.field402;
                        class139.field2910[class59.field1472] = var21.field434;
                        class59.field1472++;
                    }
                }
                if (var21.field437 > class45.field1098) {
                    class165.method1178(var21, var21.field431 + 15, (byte) 89);
                    if (class195.field3840 > -1) {
                        int var26 = var21.field432 * 30 / var21.field430;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class71.method558(arg1 + class195.field3840 - 15, class66.field1579 + arg0 + -3, var26, 5, 65280);
                        class71.method558(var26 + class195.field3840 + arg1 - 15, class66.field1579 + -3 + arg0, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class45.field1098 < var21.field386[var27]) {
                        class165.method1178(var21, var21.field431 / 2, (byte) 113);
                        if (class195.field3840 > -1) {
                            if (var27 == 1) {
                                class66.field1579 -= 20;
                            }
                            if (var27 == 2) {
                                class66.field1579 -= 10;
                                class195.field3840 -= 15;
                            }
                            if (var27 == 3) {
                                class66.field1579 -= 10;
                                class195.field3840 += 15;
                            }
                            class145.field3031[var21.field414[var27]].method755(arg1 + class195.field3840 - 12, class66.field1579 + -12 + arg0);
                            class14.field289.method645(class151.method1059(var21.field415[var27], (byte) -114), class195.field3840 + arg1 - 1, class66.field1579 + arg0 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field1152++;
        if (arg3 != -4) {
            return;
        }
        for (int var6 = 0; var6 < class59.field1472; var6++) {
            int var7 = class139.field2901[var6];
            int var8 = class139.field2907[var6];
            int var9 = class139.field2902[var6];
            int var10 = class139.field2905[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var9 + 2 > class139.field2902[var20] + -class139.field2905[var20] && class139.field2902[var20] + 2 > -var10 + var9 && var7 - var8 < class139.field2907[var20] + class139.field2901[var20] && var7 + var8 > class139.field2901[var20] + -class139.field2907[var20] && class139.field2902[var20] - class139.field2905[var20] < var9) {
                        var11 = true;
                        var9 = class139.field2902[var20] - class139.field2905[var20];
                    }
                }
            }
            class195.field3840 = class139.field2901[var6];
            class66.field1579 = class139.field2902[var6] = var9;
            class38 var12 = class139.field2910[var6];
            if (class145.field3028 == 0) {
                int var13 = 16776960;
                if (class139.field2909[var6] < 6) {
                    var13 = class7.field183[class139.field2909[var6]];
                }
                if (class139.field2909[var6] == 6) {
                    var13 = class172.field3523 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class139.field2909[var6] == 7) {
                    var13 = class172.field3523 % 20 >= 10 ? 65535 : 255;
                }
                if (class139.field2909[var6] == 8) {
                    var13 = class172.field3523 % 20 < 10 ? 45056 : 8454016;
                }
                if (class139.field2909[var6] == 9) {
                    int var14 = 150 - class139.field2899[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class139.field2909[var6] == 10) {
                    int var15 = 150 - class139.field2899[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = var15 * 327680 + 255 - (var15 - 100) * 5 - 32768000;
                    }
                }
                if (class139.field2909[var6] == 11) {
                    int var16 = 150 - class139.field2899[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class139.field2890[var6] == 0) {
                    class33.field686.method645(var12, arg1 + class195.field3840, class66.field1579 + arg0, var13, 0);
                }
                if (class139.field2890[var6] == 1) {
                    class33.field686.method643(var12, class195.field3840 + arg1, class66.field1579 + arg0, var13, 0, class172.field3523);
                }
                if (class139.field2890[var6] == 2) {
                    class33.field686.method648(var12, class195.field3840 + arg1, class66.field1579 + arg0, var13, 0, class172.field3523);
                }
                if (class139.field2890[var6] == 3) {
                    class33.field686.method640(var12, class195.field3840 + arg1, arg0 - -class66.field1579, var13, 0, class172.field3523, 150 - class139.field2899[var6]);
                }
                if (class139.field2890[var6] == 4) {
                    int var17 = (150 - class139.field2899[var6]) * (class33.field686.method656(var12) - -100) / 150;
                    class71.method572(class195.field3840 + arg1 - 50, arg0, arg1 + class195.field3840 + 50, arg0 + arg2);
                    class33.field686.method646(var12, arg1 + class195.field3840 + 50 - var17, class66.field1579 + arg0, var13, 0);
                    class71.method569(arg1, arg0, arg1 + arg4, arg0 + arg2);
                }
                if (class139.field2890[var6] == 5) {
                    int var18 = 150 - class139.field2899[var6];
                    class71.method572(arg1, class66.field1579 + arg0 - class33.field686.field1870 - 1, arg1 + arg4, arg0 + class66.field1579 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class33.field686.method645(var12, arg1 + class195.field3840, arg0 - -class66.field1579 + var19, var13, 0);
                    class71.method569(arg1, arg0, arg1 + arg4, arg0 + arg2);
                }
            } else {
                class33.field686.method645(var12, class195.field3840 + arg1, class66.field1579 + arg0, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static final void method338(byte arg0) {
        class31.field610 = true;
        class157.field3274 = true;
        field1163++;
        int var1 = -59 % ((arg0 - 59) / 56);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static final void method339(int arg0) {
        if (arg0 >= 3) {
            class154.field3202.method1083(3056);
            field1158++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static void method340(int arg0) {
        field1148 = null;
        field1161 = null;
        field1149 = null;
        if (arg0 != -1) {
            method339(-92);
        }
        field1159 = null;
        field1169 = null;
        field1168 = null;
        field1167 = null;
        field1154 = null;
    }
}
