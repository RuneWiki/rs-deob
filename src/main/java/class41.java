import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 extends Canvas {

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field1185;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field1169 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lrd;")
    public static class117 field1170 = class95.method812(":: (X", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lrd;")
    public static class117 field1177 = class95.method812("bevor Sie den Vorgang wiederholen)3", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
    public static int[] field1172 = new int[128];

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lrd;")
    public static class117 field1189 = class95.method812("Lade Titelbild )2 ", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "[I")
    public static int[] field1184 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "Lrd;")
    public static class117 field1194 = class95.method812("mapfunction", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "Lrd;")
    private static class117 field1192 = class95.method812("yellow:", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "Lrd;")
    public static class117 field1193 = field1192;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lrd;")
    public static class117 field1186 = field1192;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "Lmb;")
    public static class85 field1195 = new class85(200);

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field1197 = 0;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "Lrd;")
    public static class117 field1198 = class95.method812("Mitteilung", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Lrd;")
    public static class117 field1200 = class95.method812("Mem:", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "Lrd;")
    public static class117 field1199 = class95.method812("(U(Y", (byte) 8);

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lra;")
    public static class114 field1175;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lge;")
    public static class47 field1180;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "[I")
    public static int[] field1183;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "[Ll;")
    public static class76[] field1201;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static final void method468(byte arg0) {
        field1196++;
        class147.field3599 = 0;
        if (arg0 < 42) {
            field1192 = null;
        }
        for (int var1 = -1; var1 < class96.field2419 + class24.field678; var1++) {
            class25 var18;
            if (var1 == -1) {
                var18 = class144.field3516;
            } else if (class96.field2419 > var1) {
                var18 = class93.field2340[class137.field3292[var1]];
            } else {
                var18 = class93.field2334[class95.field2379[var1 - class96.field2419]];
            }
            if (var18 != null && var18.method265(-40)) {
                if (var18 instanceof class36) {
                    class17 var19 = ((class36) var18).field1061;
                    if (var19.field427 != null) {
                        var19 = var19.method188((byte) 94);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class96.field2419 <= var1) {
                    class17 var22 = ((class36) var18).field1061;
                    if (var22.field427 != null) {
                        var22 = var22.method188((byte) 118);
                    }
                    if (var22.field439 >= 0 && var22.field439 < class20.field548.length) {
                        class147.method1189((byte) -118, var18, var18.field753 + 15);
                        if (class118.field2910 > -1) {
                            class20.field548[var22.field439].method712(class118.field2910 - 12, class144.field3415 - 30);
                        }
                    }
                    if (class141.field3358 == 1 && class95.field2379[var1 - class96.field2419] == class44.field1244 && class85.field2236 % 20 < 10) {
                        class147.method1189((byte) -52, var18, var18.field753 + 15);
                        if (class118.field2910 > -1) {
                            class2.field45[0].method712(class118.field2910 - 12, class144.field3415 + -28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class101 var21 = (class101) var18;
                    if (var21.field2511 != -1 || var21.field2527 != -1) {
                        class147.method1189((byte) -104, var18, var18.field753 + 15);
                        if (class118.field2910 > -1) {
                            if (var21.field2511 != -1) {
                                class23.field657[var21.field2511].method712(class118.field2910 - 12, class144.field3415 - var20);
                                var20 += 25;
                            }
                            if (var21.field2527 != -1) {
                                class20.field548[var21.field2527].method712(class118.field2910 - 12, class144.field3415 - var20);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class141.field3358 == 10 && class137.field3292[var1] == class2.field61) {
                        class147.method1189((byte) -85, var18, var18.field753 + 15);
                        if (class118.field2910 > -1) {
                            class2.field45[1].method712(class118.field2910 - 12, -var20 + class144.field3415);
                        }
                    }
                }
                if (var18.field706 != null && (var1 >= class96.field2419 || class18.field462 == 0 || class18.field462 == 3 || class18.field462 == 1 && class59.method609((byte) -104, ((class101) var18).field2528))) {
                    class147.method1189((byte) -95, var18, var18.field753);
                    if (class118.field2910 > -1 && class100.field2490 > class147.field3599) {
                        class100.field2481[class147.field3599] = class137.field3305.method209(var18.field706) / 2;
                        class100.field2483[class147.field3599] = class137.field3305.field484;
                        class100.field2472[class147.field3599] = class118.field2910;
                        class100.field2478[class147.field3599] = class144.field3415;
                        class100.field2487[class147.field3599] = var18.field720;
                        class100.field2484[class147.field3599] = var18.field747;
                        class100.field2475[class147.field3599] = var18.field683;
                        class100.field2474[class147.field3599] = var18.field706;
                        class147.field3599++;
                    }
                }
                if (var18.field702 > class85.field2236) {
                    class147.method1189((byte) -53, var18, var18.field753 + 15);
                    if (class118.field2910 > -1) {
                        int var23 = var18.field713 * 30 / var18.field735;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class145.method1165(class118.field2910 - 15, class144.field3415 + -3, var23, 5, 65280);
                        class145.method1165(class118.field2910 + var23 - 15, class144.field3415 - 3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class85.field2236 < var18.field744[var24]) {
                        class147.method1189((byte) -60, var18, var18.field753 / 2);
                        if (class118.field2910 > -1) {
                            if (var24 == 1) {
                                class144.field3415 -= 20;
                            }
                            if (var24 == 2) {
                                class118.field2910 -= 15;
                                class144.field3415 -= 10;
                            }
                            if (var24 == 3) {
                                class144.field3415 -= 10;
                                class118.field2910 += 15;
                            }
                            class84.field2202[var18.field687[var24]].method712(class118.field2910 - 12, class144.field3415 - 12);
                            class109.field2731.method216(class142.method1131(var18.field691[var24], true), class118.field2910, class144.field3415 + 4, 0);
                            class109.field2731.method216(class142.method1131(var18.field691[var24], true), class118.field2910 - 1, class144.field3415 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class147.field3599; var2++) {
            int var3 = class100.field2472[var2];
            int var4 = class100.field2478[var2];
            int var5 = class100.field2481[var2];
            boolean var6 = true;
            int var7 = class100.field2483[var2];
            while (var6) {
                var6 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class100.field2478[var17] - class100.field2483[var17] < var4 + 2 && var4 - var7 < class100.field2478[var17] - -2 && class100.field2481[var17] + class100.field2472[var17] > -var5 + var3 && var3 + var5 > class100.field2472[var17] + -class100.field2481[var17] && class100.field2478[var17] - class100.field2483[var17] < var4) {
                        var4 = class100.field2478[var17] - class100.field2483[var17];
                        var6 = true;
                    }
                }
            }
            class118.field2910 = class100.field2472[var2];
            class144.field3415 = class100.field2478[var2] = var4;
            class117 var8 = class100.field2474[var2];
            if (class58.field1627 == 0) {
                int var9 = 16776960;
                if (class100.field2487[var2] < 6) {
                    var9 = class133.field3189[class100.field2487[var2]];
                }
                if (class100.field2487[var2] == 6) {
                    var9 = class128.field3112 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class100.field2487[var2] == 7) {
                    var9 = class128.field3112 % 20 < 10 ? 255 : 65535;
                }
                if (class100.field2487[var2] == 8) {
                    var9 = class128.field3112 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class100.field2487[var2] == 9) {
                    int var10 = 150 - class100.field2475[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 + 16384000 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class100.field2487[var2] == 10) {
                    int var11 = 150 - class100.field2475[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 500 + 255 - var11 * 5;
                    }
                }
                if (class100.field2487[var2] == 11) {
                    int var12 = 150 - class100.field2475[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class100.field2484[var2] == 0) {
                    class137.field3305.method216(var8, class118.field2910, class144.field3415 + 1, 0);
                    class137.field3305.method216(var8, class118.field2910, class144.field3415, var9);
                }
                if (class100.field2484[var2] == 1) {
                    class137.field3305.method211(var8, class118.field2910, class144.field3415 + 1, 0, class128.field3112);
                    class137.field3305.method211(var8, class118.field2910, class144.field3415, var9, class128.field3112);
                }
                if (class100.field2484[var2] == 2) {
                    class137.field3305.method213(var8, class118.field2910, class144.field3415 + 1, 0, class128.field3112);
                    class137.field3305.method213(var8, class118.field2910, class144.field3415, var9, class128.field3112);
                }
                if (class100.field2484[var2] == 3) {
                    class137.field3305.method198(var8, class118.field2910, class144.field3415 + 1, 0, class128.field3112, 150 - class100.field2475[var2]);
                    class137.field3305.method198(var8, class118.field2910, class144.field3415, var9, class128.field3112, 150 - class100.field2475[var2]);
                }
                if (class100.field2484[var2] == 4) {
                    int var13 = class137.field3305.method209(var8);
                    int var14 = (150 - class100.field2475[var2]) * (var13 + 100) / 150;
                    class145.method1158(class118.field2910 - 50, 0, class118.field2910 + 50, 334);
                    class137.field3305.method215(var8, class118.field2910 + 50 - var14, class144.field3415 + 1, 0);
                    class137.field3305.method215(var8, class118.field2910 + 50 - var14, class144.field3415, var9);
                    class145.method1167();
                }
                if (class100.field2484[var2] == 5) {
                    int var15 = 150 - class100.field2475[var2];
                    class145.method1158(0, class144.field3415 - class137.field3305.field484 - 1, 512, class144.field3415 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class137.field3305.method216(var8, class118.field2910, class144.field3415 + var16 + 1, 0);
                    class137.field3305.method216(var8, class118.field2910, class144.field3415 + var16, var9);
                    class145.method1167();
                }
            } else {
                class137.field3305.method216(var8, class118.field2910, class144.field3415 + 1, 0);
                class137.field3305.method216(var8, class118.field2910, class144.field3415, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static final void method469(int arg0) {
        class49.method544((byte) 73);
        class59.field1653 = true;
        field1176++;
        class16.method182(18);
        if (arg0 != 9418) {
            field1195 = null;
        }
        if (class36.field1058) {
            class137.field3305.method216(class134.field3212, 239, 40, 0);
            class137.field3305.method216(class18.method193(new class117[] { class134.field3216, class58.field1616 }, arg0 - 9336), 239, 60, 128);
        } else if (class80.field2142 == 1) {
            class137.field3305.method216(class14.field275, 239, 40, 0);
            class137.field3305.method216(class18.method193(new class117[] { class134.field3209, class58.field1616 }, 24), 239, 60, 128);
        } else if (class80.field2142 == 2) {
            class137.field3305.method216(class140.field3337, 239, 40, 0);
            class137.field3305.method216(class18.method193(new class117[] { class134.field3209, class58.field1616 }, 59), 239, 60, 128);
        } else if (class80.field2142 == 3) {
            if (class134.field3209 != class134.field3203) {
                class42.method477(class134.field3209, 0);
                class134.field3203 = class134.field3209;
            }
            class19 var17 = class54.field1533;
            class145.method1158(0, 0, 463, 77);
            for (int var18 = 0; var18 < class111.field2777; var18++) {
                int var19 = var18 * 14 + 18 - class135.field3233;
                if (var19 > 0 && var19 < 110) {
                    var17.method216(class38.field1101[var18], 239, var19, 0);
                }
            }
            class145.method1167();
            if (class111.field2777 > 5) {
                class21.method233(77, class111.field2777 * 14 + 7, 0, class135.field3233, 463, (byte) -66);
            }
            if (class134.field3209.method954(113) == 0) {
                class137.field3305.method216(class127.field3043, 239, 40, 255);
            } else if (class111.field2777 == 0) {
                class137.field3305.method216(client.field628, 239, 40, 0);
            }
            var17.method216(class18.method193(new class117[] { class134.field3209, class58.field1616 }, 105), 239, 90, 0);
            class145.method1164(0, 77, 479, 0);
        } else if (class80.field2142 == 4) {
            class137.field3305.method216(class134.field3221, 239, 40, 0);
            class137.field3305.method216(class18.method193(new class117[] { class134.field3209, class58.field1616 }, arg0 - 9378), 239, 60, 128);
        } else if (class2.field46 != null) {
            class137.field3305.method204(class2.field46, 10, 20, 459, 40, 0, false, 1, 1, 0);
            class137.field3305.method216(class58.field1608, 239, 80, 128);
        } else if (class56.field1553 != -1) {
            boolean var1 = class84.method762(2, (byte) 90, 479, 96, class56.field1553, 0, 0);
            if (!var1) {
                class18.field458 = true;
            }
        } else if (class94.field2352 == -1) {
            class19 var3 = class54.field1533;
            int var4 = 0;
            class145.method1158(0, 0, 463, 77);
            for (int var5 = 0; var5 < 100; var5++) {
                if (class128.field3107[var5] != null) {
                    int var7 = class119.field2919[var5];
                    int var8 = class134.field3217 + 70 - var4 * 14;
                    class117 var9 = class43.field1236[var5];
                    byte var10 = 0;
                    if (var9 != null && var9.method946((byte) 83, class61.field1698)) {
                        var9 = var9.method949(5, arg0 ^ 0x24CA);
                        var10 = 1;
                    }
                    if (var9 != null && var9.method946((byte) 83, class39.field1134)) {
                        var10 = 2;
                        var9 = var9.method949(5, 0);
                    }
                    if (var7 == 0) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method215(class128.field3107[var5], 4, var8, 0);
                        }
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || class18.field462 == 0 || class18.field462 == 1 && class59.method609((byte) -104, var9))) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                class6.field137[0].method929(var11, var8 - 12);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                class6.field137[1].method929(var11, var8 - 12);
                                var11 += 14;
                            }
                            var3.method215(class18.method193(new class117[] { var9, class144.field3537 }, 120), var11, var8, 0);
                            int var12 = var11 + var3.method209(var9) + 8;
                            var3.method215(class128.field3107[var5], var12, var8, 255);
                        }
                    }
                    if ((var7 == 3 || var7 == 7) && class94.field2364 == 0 && (var7 == 7 || class42.field1202 == 0 || class42.field1202 == 1 && class59.method609((byte) -104, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var3.method215(class37.field1086, var13, var8, 0);
                            int var14 = var13 + var3.method209(class37.field1086);
                            int var15 = var14 + var3.method201(32);
                            if (var10 == 1) {
                                class6.field137[0].method929(var15, var8 - 12);
                                var15 += 14;
                            }
                            if (var10 == 2) {
                                class6.field137[1].method929(var15, var8 - 12);
                                var15 += 14;
                            }
                            var3.method215(class18.method193(new class117[] { var9, class144.field3537 }, 36), var15, var8, 0);
                            int var16 = var15 + var3.method209(var9) + 8;
                            var3.method215(class128.field3107[var5], var16, var8, 8388608);
                        }
                        var4++;
                    }
                    if (var7 == 4 && (class77.field2095 == 0 || class77.field2095 == 1 && class59.method609((byte) -104, var9))) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method215(class18.method193(new class117[] { var9, class45.field1261, class128.field3107[var5] }, arg0 - 9323), 4, var8, 8388736);
                        }
                    }
                    if (var7 == 5 && class94.field2364 == 0 && class42.field1202 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method215(class128.field3107[var5], 4, var8, 8388608);
                        }
                        var4++;
                    }
                    if (var7 == 6 && class94.field2364 == 0 && class42.field1202 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method215(class18.method193(new class117[] { class18.field446, class45.field1261, var9, class144.field3537 }, arg0 ^ 0x24AD), 4, var8, 0);
                            var3.method215(class128.field3107[var5], var3.method209(class18.method193(new class117[] { class18.field446, class45.field1261, var9 }, 61)) + 12, var8, 8388608);
                        }
                        var4++;
                    }
                    if (var7 == 8 && (class77.field2095 == 0 || class77.field2095 == 1 && class59.method609((byte) -104, var9))) {
                        var4++;
                        if (var8 > 0 && var8 < 110) {
                            var3.method215(class18.method193(new class117[] { var9, class45.field1261, class128.field3107[var5] }, 101), 4, var8, 8270336);
                        }
                    }
                }
            }
            class145.method1167();
            class22.field642 = var4 * 14 + 7;
            if (class22.field642 < 78) {
                class22.field642 = 78;
            }
            class21.method233(77, class22.field642, 0, class22.field642 - class134.field3217 - 77, 463, (byte) -120);
            class117 var6;
            if (class144.field3516 == null || class144.field3516.field2528 == null) {
                var6 = class56.field1575;
            } else {
                var6 = class144.field3516.field2528;
            }
            var3.method215(class18.method193(new class117[] { var6, class144.field3537 }, 107), 4, 90, 0);
            var3.method215(class18.method193(new class117[] { class134.field3199, class58.field1616 }, 60), var3.method209(class18.method193(new class117[] { var6, class120.field2937 }, 40)) + 6, 90, 255);
            class145.method1164(0, 77, 479, 0);
        } else {
            boolean var2 = class84.method762(3, (byte) 118, 479, 96, class94.field2352, 0, 0);
            if (!var2) {
                class18.field458 = true;
            }
        }
        if (class15.field354 && client.field613 == 2) {
            class56.method593((byte) -89);
        }
        class147.method1185(false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lhc;Lea;B)V")
    public static final void method470(class52[] arg0, class30 arg1, byte arg2) {
        field1187++;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((class124.field3002[var3][var111][var112] & 0x1) == 1) {
                        int var113 = var3;
                        if ((class124.field3002[1][var111][var112] & 0x2) == 2) {
                            var113 = var3 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method574(false, var112, var111);
                        }
                    }
                }
            }
        }
        class116.field2839 += (int) (Math.random() * 5.0D) - 2;
        class58.field1623 += (int) (Math.random() * 5.0D) - 2;
        if (class116.field2839 < -16) {
            class116.field2839 = -16;
        }
        if (class58.field1623 < -8) {
            class58.field1623 = -8;
        }
        if (class116.field2839 > 16) {
            class116.field2839 = 16;
        }
        if (class58.field1623 > 8) {
            class58.field1623 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            byte[][] var48 = class35.field1044[var4];
            int var49 = (int) Math.sqrt(5100.0D);
            int var50 = var49 * 768 >> 8;
            for (int var51 = 1; var51 < 103; var51++) {
                for (int var102 = 1; var102 < 103; var102++) {
                    int var103 = class14.field272[var4][var102 + 1][var51] - class14.field272[var4][var102 - 1][var51];
                    int var104 = class14.field272[var4][var102][var51 + 1] - class14.field272[var4][var102][var51 - 1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = (var48[var102 - 1][var51] >> 2) + (var48[var102][var51] >> 1) + (var48[var102 + 1][var51] >> 3) + (var48[var102][var51 - -1] >> 3) + (var48[var102][var51 + -1] >> 2);
                    int var107 = (var104 << 8) / var105;
                    int var108 = (var103 << 8) / var105;
                    int var109 = 65536 / var105;
                    int var110 = (var108 * -50 + var107 * -50 + var109 * -10) / var50 + 96;
                    class60.field1686[var102][var51] = var110 - var106;
                }
            }
            for (int var52 = 0; var52 < 104; var52++) {
                class127.field3044[var52] = 0;
                class36.field1056[var52] = 0;
                class21.field606[var52] = 0;
                class109.field2736[var52] = 0;
                class61.field1704[var52] = 0;
            }
            for (int var53 = -5; var53 < 109; var53++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    int var96 = var53 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < 104) {
                        int var97 = class49.field1412[var4][var96][var56] & 0xFF;
                        if (var97 > 0) {
                            class26 var98 = class64.method646(var97 - 1, (byte) -95);
                            class127.field3044[var56] += var98.field764;
                            class36.field1056[var56] += var98.field789;
                            class21.field606[var56] += var98.field765;
                            class109.field2736[var56] += var98.field763;
                            var10002 = class61.field1704[var56]++;
                        }
                    }
                    int var99 = var53 - 5;
                    if (var99 >= 0 && var99 < 104) {
                        int var100 = class49.field1412[var4][var99][var56] & 0xFF;
                        if (var100 > 0) {
                            class26 var101 = class64.method646(var100 - 1, (byte) -125);
                            class127.field3044[var56] -= var101.field764;
                            class36.field1056[var56] -= var101.field789;
                            class21.field606[var56] -= var101.field765;
                            class109.field2736[var56] -= var101.field763;
                            var10002 = class61.field1704[var56]--;
                        }
                    }
                }
                if (var53 >= 1 && var53 < 103) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 109; var62++) {
                        int var63 = var62 + 5;
                        if (var63 >= 0 && var63 < 104) {
                            var59 += class21.field606[var63];
                            var57 += class127.field3044[var63];
                            var61 += class61.field1704[var63];
                            var60 += class109.field2736[var63];
                            var58 += class36.field1056[var63];
                        }
                        int var64 = var62 - 5;
                        if (var64 >= 0 && var64 < 104) {
                            var57 -= class127.field3044[var64];
                            var61 -= class61.field1704[var64];
                            var60 -= class109.field2736[var64];
                            var58 -= class36.field1056[var64];
                            var59 -= class21.field606[var64];
                        }
                        if (var62 >= 1 && var62 < 103 && (!class68.field1925 || (class124.field3002[0][var53][var62] & 0x2) != 0 || (class124.field3002[var4][var53][var62] & 0x10) == 0 && class142.method1133(var62, 0, var4, var53) == class53.field1483)) {
                            if (class35.field1032 > var4) {
                                class35.field1032 = var4;
                            }
                            int var65 = class49.field1412[var4][var53][var62] & 0xFF;
                            int var66 = class73.field2049[var4][var53][var62] & 0xFF;
                            if (var65 > 0 || var66 > 0) {
                                int var67 = class14.field272[var4][var53][var62];
                                int var68 = class14.field272[var4][var53][var62 + 1];
                                int var69 = class60.field1686[var53 + 1][var62];
                                int var70 = class14.field272[var4][var53 + 1][var62 + 1];
                                int var71 = class14.field272[var4][var53 + 1][var62];
                                int var72 = class60.field1686[var53][var62 + 1];
                                int var73 = class60.field1686[var53][var62];
                                int var74 = -1;
                                int var75 = class60.field1686[var53 + 1][var62 + 1];
                                int var76 = -1;
                                if (var65 > 0) {
                                    int var77 = var57 * 256 / var60;
                                    int var78 = var58 / var61;
                                    int var79 = var59 / var61;
                                    var74 = class18.method194(var78, var79, 2, var77);
                                    int var80 = class58.field1623 + var77 & 0xFF;
                                    int var81 = class116.field2839 + var79;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 255) {
                                        var81 = 255;
                                    }
                                    var76 = class18.method194(var78, var81, 2, var80);
                                }
                                if (var4 > 0) {
                                    boolean var82 = true;
                                    if (var65 == 0 && class67.field1899[var4][var53][var62] != 0) {
                                        var82 = false;
                                    }
                                    if (var66 > 0 && !class57.method596((byte) -56, var66 - 1).field2590) {
                                        var82 = false;
                                    }
                                    if (var82 && var67 == var71 && var67 == var70 && var67 == var68) {
                                        class105.field2617[var4][var53][var62] = class84.method763(class105.field2617[var4][var53][var62], 2340);
                                    }
                                }
                                int var83 = 0;
                                if (var76 != -1) {
                                    var83 = class129.field3137[class108.method890(0, 96, var76)];
                                }
                                if (var66 == 0) {
                                    arg1.method361(var4, var53, var62, 0, 0, -1, var67, var71, var70, var68, class108.method890(0, var73, var74), class108.method890(0, var69, var74), class108.method890(0, var75, var74), class108.method890(0, var72, var74), 0, 0, 0, 0, var83, 0);
                                } else {
                                    int var84 = class67.field1899[var4][var53][var62] + 1;
                                    byte var85 = class94.field2350[var4][var53][var62];
                                    class104 var86 = class57.method596((byte) -96, var66 - 1);
                                    int var87 = var86.field2602;
                                    int var88;
                                    int var89;
                                    if (var87 >= 0) {
                                        var88 = -1;
                                        var89 = class129.field3125.method537(-92, var87);
                                    } else if (var86.field2600 == 16711935) {
                                        var87 = -1;
                                        var88 = -2;
                                        var89 = -2;
                                    } else {
                                        var88 = class18.method194(var86.field2589, var86.field2605, 2, var86.field2596);
                                        int var90 = class58.field1623 + var86.field2596 & 0xFF;
                                        int var91 = var86.field2605 + class116.field2839;
                                        if (var91 < 0) {
                                            var91 = 0;
                                        } else if (var91 > 255) {
                                            var91 = 255;
                                        }
                                        var89 = class18.method194(var86.field2589, var91, 2, var90);
                                    }
                                    int var92 = 0;
                                    if (var89 != -2) {
                                        var92 = class129.field3137[class13.method105(var89, false, 96)];
                                    }
                                    if (var86.field2597 != -1) {
                                        int var93 = class58.field1623 + var86.field2598 & 0xFF;
                                        int var94 = class116.field2839 + var86.field2593;
                                        if (var94 < 0) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var95 = class18.method194(var86.field2595, var94, 2, var93);
                                        var92 = class129.field3137[class13.method105(var95, false, 96)];
                                    }
                                    arg1.method361(var4, var53, var62, var84, var85, var87, var67, var71, var70, var68, class108.method890(0, var73, var74), class108.method890(0, var69, var74), class108.method890(0, var75, var74), class108.method890(0, var72, var74), class13.method105(var88, false, var73), class13.method105(var88, false, var69), class13.method105(var88, false, var75), class13.method105(var88, false, var72), var83, var92);
                                }
                            }
                        }
                    }
                }
            }
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var55 = 1; var55 < 103; var55++) {
                    arg1.method321(var4, var55, var54, class142.method1133(var54, 0, var4, var55));
                }
            }
            class49.field1412[var4] = null;
            class73.field2049[var4] = null;
            class67.field1899[var4] = null;
            class94.field2350[var4] = null;
            class35.field1044[var4] = null;
        }
        arg1.method335(-50, -10, -50);
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var47 = 0; var47 < 104; var47++) {
                if ((class124.field3002[1][var5][var47] & 0x2) == 2) {
                    arg1.method347(var5, var47);
                }
            }
        }
        int var6 = 1;
        int var7 = -58 % ((-arg2 - 21) / 59);
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var6 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= 104; var12++) {
                    for (int var13 = 0; var13 <= 104; var13++) {
                        if ((class105.field2617[var11][var13][var12] & var6) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            while (var14 > 0 && (class105.field2617[var11][var13][var14 - 1] & var6) != 0) {
                                var14--;
                            }
                            int var17 = var11;
                            while (var15 < 104 && (var6 & class105.field2617[var11][var13][var15 + 1]) != 0) {
                                var15++;
                            }
                            label351: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((var6 & class105.field2617[var16 - 1][var13][var18]) == 0) {
                                        break label351;
                                    }
                                }
                                var16--;
                            }
                            label340: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((class105.field2617[var17 + 1][var13][var19] & var6) == 0) {
                                        break label340;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var15 + 1 - var14) * (var17 + 1 - var16);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = class14.field272[var17][var13][var14] - var21;
                                int var23 = class14.field272[var16][var13][var14];
                                class30.method318(var10, 1, var13 * 128, var13 * 128, var14 * 128, var15 * 128 + 128, var22, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        class105.field2617[var24][var13][var25] = class66.method660(class105.field2617[var24][var13][var25], ~var6);
                                    }
                                }
                            }
                        }
                        if ((class105.field2617[var11][var13][var12] & var8) != 0) {
                            int var26;
                            for (var26 = var13; var26 > 0 && (class105.field2617[var11][var26 - 1][var12] & var8) != 0; var26--) {
                            }
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var27 < 104 && (class105.field2617[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label405: while (var29 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((class105.field2617[var29 - 1][var30][var12] & var8) == 0) {
                                        break label405;
                                    }
                                }
                                var29--;
                            }
                            label394: while (var28 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((class105.field2617[var28 + 1][var31][var12] & var8) == 0) {
                                        break label394;
                                    }
                                }
                                var28++;
                            }
                            int var32 = (var27 + 1 - var26) * (var28 + 1 - var29);
                            if (var32 >= 8) {
                                int var33 = class14.field272[var29][var26][var12];
                                short var34 = 240;
                                int var35 = class14.field272[var28][var26][var12] - var34;
                                class30.method318(var10, 2, var26 * 128, var27 * 128 + 128, var12 * 128, var12 * 128, var35, var33);
                                for (int var36 = var29; var36 <= var28; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        class105.field2617[var36][var37][var12] = class66.method660(class105.field2617[var36][var37][var12], ~var8);
                                    }
                                }
                            }
                        }
                        if ((class105.field2617[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40;
                            for (var40 = var12; var40 > 0 && (class105.field2617[var11][var13][var40 - 1] & var9) != 0; var40--) {
                            }
                            int var41;
                            for (var41 = var12; var41 < 104 && (var9 & class105.field2617[var11][var13][var41 + 1]) != 0; var41++) {
                            }
                            label459: while (var39 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((var9 & class105.field2617[var11][var39 - 1][var42]) == 0) {
                                        break label459;
                                    }
                                }
                                var39--;
                            }
                            label448: while (var38 < 104) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((class105.field2617[var11][var38 + 1][var43] & var9) == 0) {
                                        break label448;
                                    }
                                }
                                var38++;
                            }
                            if ((var38 + 1 - var39) * (-var40 + var41 + 1) >= 4) {
                                int var44 = class14.field272[var11][var39][var40];
                                class30.method318(var10, 4, var39 * 128, var38 * 128 + 128, var40 * 128, var41 * 128 + 128, var44, var44);
                                for (int var45 = var39; var45 <= var38; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        class105.field2617[var11][var45][var46] = class66.method660(class105.field2617[var11][var45][var46], ~var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
    public static final void method471(int arg0, byte arg1) {
        field1188++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class79.field2119[arg0];
        int var3 = class68.field1932[arg0];
        int var4 = class148.field3610[arg0];
        int var5 = class94.field2360[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (class80.field2142 != 0 && var2 != 1001) {
            class18.field458 = true;
            class80.field2142 = 0;
        }
        if (var2 == 7) {
            class101 var6 = class93.field2340[var5];
            if (var6 != null) {
                class136.method1103(0, var6.field739[0], 2, false, var6.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class135.field3228 = 2;
                class38.field1097 = 0;
                class72.field2014++;
                class99.field2458 = class66.field1873;
                class90.field2311 = class68.field1909;
                class25.field754.method739(false, 63);
                class25.field754.method158(class16.field376, true);
                class25.field754.method164(19877, class2.field55);
                class25.field754.method149(class71.field1995, -20912);
                class25.field754.method164(19877, var5);
            }
        }
        if (var2 == 33) {
            class86.field2240++;
            class25.field754.method739(false, 42);
            class25.field754.method154(false, var4);
            class25.field754.method158(var5, true);
            class25.field754.method164(19877, var3);
            class128.field3091 = 0;
            class135.field3231 = 2;
            class107.field2670 = var3;
            class105.field2623 = var4;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 11) {
            class36 var7 = class93.field2334[var5];
            if (var7 != null) {
                class136.method1103(0, var7.field739[0], 2, false, var7.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class90.field2311 = class68.field1909;
                class38.field1097 = 0;
                class135.field3228 = 2;
                class121.field2963++;
                class99.field2458 = class66.field1873;
                class25.field754.method739(false, 121);
                class25.field754.method158(var5, true);
            }
        }
        if (var2 == 39) {
            class117 var8 = class35.field1051[arg0];
            int var9 = var8.method948((byte) 83, class121.field2968);
            if (var9 != -1) {
                if (class121.field2977 == -1) {
                    class20.method229((byte) -14);
                    if (class44.field1255 != -1) {
                        class134.field3202 = var8.method949(var9 + 5, 0).method976(95);
                        class110.field2760 = false;
                        class135.field3224 = class121.field2977 = class44.field1255;
                    }
                } else {
                    class52.method572(class134.field3215, -1, 0, class43.field1230);
                    if (class22.field647 != null) {
                        class52.method572(class134.field3215, -1, 0, class22.field647);
                    }
                }
            }
        }
        if (var2 == 3) {
            boolean var10 = class136.method1103(0, var3, 2, false, var4, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            if (!var10) {
                class136.method1103(0, var3, 2, false, var4, 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
            }
            class99.field2458 = class66.field1873;
            class38.field1097 = 0;
            class26.field785++;
            class90.field2311 = class68.field1909;
            class135.field3228 = 2;
            class25.field754.method739(false, 10);
            class25.field754.method146(var3 + class95.field2371, (byte) 114);
            class25.field754.method164(19877, var5);
            class25.field754.method164(19877, class108.field2678 + var4);
        }
        if (var2 == 54) {
            class96.field2409++;
            class25.field754.method739(false, 192);
            class25.field754.method130(100, var3);
            class25.field754.method158(var5, true);
            class25.field754.method113(var4, 1595636056);
            class107.field2670 = var3;
            class135.field3231 = 2;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            class128.field3091 = 0;
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
            class105.field2623 = var4;
        }
        if (var2 == 15) {
            class58.field1613++;
            class25.field754.method739(false, 81);
            class25.field754.method124(var4, 0);
            class144 var12 = class15.method172(var4, -13778);
            if (var12.field3485 != null && var12.field3485[0][0] == 5) {
                int var13 = var12.field3485[0][1];
                if (class105.field2621[var13] != var12.field3504[0]) {
                    class105.field2621[var13] = var12.field3504[0];
                    class73.method697(var13, (byte) -120);
                    class13.field262 = true;
                }
            }
        }
        if (var2 == 28) {
            class21.field591++;
            class25.field754.method739(false, 104);
            class25.field754.method124(var4, 0);
            class25.field754.method146(var3, (byte) 98);
            class25.field754.method158(var5, true);
            class105.field2623 = var4;
            class128.field3091 = 0;
            class107.field2670 = var3;
            class135.field3231 = 2;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 29) {
            class101 var14 = class93.field2340[var5];
            if (var14 != null) {
                class2.field44++;
                class136.method1103(0, var14.field739[0], 2, false, var14.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class99.field2458 = class66.field1873;
                class135.field3228 = 2;
                class90.field2311 = class68.field1909;
                class38.field1097 = 0;
                class25.field754.method739(false, 91);
                class25.field754.method130(109, var5);
            }
        }
        if (var2 == 16) {
            class36 var15 = class93.field2334[var5];
            if (var15 != null) {
                class143.field3411++;
                class136.method1103(0, var15.field739[0], 2, false, var15.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class135.field3228 = 2;
                class38.field1097 = 0;
                class90.field2311 = class68.field1909;
                class99.field2458 = class66.field1873;
                class25.field754.method739(false, 109);
                class25.field754.method158(var5, true);
            }
        }
        if (var2 == 46) {
            class87.method782((byte) 106, class94.field2352);
            class94.field2352 = -1;
            class18.field458 = true;
        }
        if (var2 == 52) {
            class95.field2378++;
            class109.method898(var4, var5, var3, (byte) -125);
            class25.field754.method739(false, 159);
            class25.field754.method158(class108.field2678 + var4, true);
            class25.field754.method146(class95.field2371 + var3, (byte) 75);
            class25.field754.method158(var5 >> 14 & 0x7FFF, true);
        }
        if (var2 == 47) {
            class38.field1105++;
            boolean var16 = class136.method1103(0, var3, 2, false, var4, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            if (!var16) {
                class136.method1103(0, var3, 2, false, var4, 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
            }
            class135.field3228 = 2;
            class99.field2458 = class66.field1873;
            class90.field2311 = class68.field1909;
            class38.field1097 = 0;
            class25.field754.method739(false, 29);
            class25.field754.method124(class71.field1995, 0);
            class25.field754.method146(class95.field2371 + var3, (byte) 105);
            class25.field754.method130(84, var4 + class108.field2678);
            class25.field754.method164(19877, class2.field55);
            class25.field754.method130(64, class16.field376);
            class25.field754.method164(19877, var5);
        }
        if (var2 == 1004) {
            class99.field2458 = class66.field1873;
            class90.field2311 = class68.field1909;
            class38.field1097 = 0;
            class135.field3228 = 2;
            class36 var18 = class93.field2334[var5];
            if (var18 != null) {
                class17 var19 = var18.field1061;
                if (var19.field427 != null) {
                    var19 = var19.method188((byte) 121);
                }
                if (var19 != null) {
                    class5.field118++;
                    class25.field754.method739(false, 207);
                    class25.field754.method158(var19.field425, true);
                }
            }
        }
        if (var2 == 38) {
            class101 var20 = class93.field2340[var5];
            if (var20 != null) {
                class136.method1103(0, var20.field739[0], 2, false, var20.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class90.field2311 = class68.field1909;
                class99.field2458 = class66.field1873;
                class38.field1097 = 0;
                class68.field1917++;
                class135.field3228 = 2;
                class25.field754.method739(false, 41);
                class25.field754.method124(class105.field2630, 0);
                class25.field754.method146(class46.field1306, (byte) 40);
                class25.field754.method146(var5, (byte) 54);
            }
        }
        if (var2 == 48 && class109.method898(var4, var5, var3, (byte) -125)) {
            class25.field754.method739(false, 39);
            class25.field754.method164(19877, var5 >> 14 & 0x7FFF);
            class25.field754.method154(false, class105.field2630);
            class92.field2318++;
            class25.field754.method146(class108.field2678 + var4, (byte) 69);
            class25.field754.method158(var3 + class95.field2371, true);
            class25.field754.method130(51, class46.field1306);
        }
        if (var2 == 1006) {
            class68.field1904++;
            class90.field2311 = class68.field1909;
            class135.field3228 = 2;
            class38.field1097 = 0;
            class99.field2458 = class66.field1873;
            class25.field754.method739(false, 1);
            class25.field754.method164(19877, var5 >> 14 & 0x7FFF);
        }
        if (var2 == 6) {
            class25.field754.method739(false, 81);
            class25.field754.method124(var4, 0);
            class144 var21 = class15.method172(var4, -13778);
            class58.field1613++;
            if (var21.field3485 != null && var21.field3485[0][0] == 5) {
                int var22 = var21.field3485[0][1];
                class105.field2621[var22] = 1 - class105.field2621[var22];
                class73.method697(var22, (byte) -109);
                class13.field262 = true;
            }
        }
        if (var2 == 50) {
            class101 var23 = class93.field2340[var5];
            if (var23 != null) {
                class136.method1103(0, var23.field739[0], 2, false, var23.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class99.field2458 = class66.field1873;
                class38.field1097 = 0;
                class124.field2991++;
                class90.field2311 = class68.field1909;
                class135.field3228 = 2;
                class25.field754.method739(false, 185);
                class25.field754.method130(-70, var5);
            }
        }
        if (var2 == 26) {
            class109.method898(var4, var5, var3, (byte) -125);
            class20.field504++;
            class25.field754.method739(false, 175);
            class25.field754.method158(class95.field2371 + var3, true);
            class25.field754.method130(-110, class108.field2678 + var4);
            class25.field754.method164(19877, var5 >> 14 & 0x7FFF);
        }
        if (var2 == 41) {
            class25.field754.method739(false, 181);
            class25.field754.method149(class71.field1995, -20912);
            class15.field337++;
            class25.field754.method146(class16.field376, (byte) 77);
            class25.field754.method146(var5, (byte) 49);
            class25.field754.method149(var4, -20912);
            class25.field754.method130(-72, class2.field55);
            class25.field754.method164(19877, var3);
            class135.field3231 = 2;
            class128.field3091 = 0;
            class107.field2670 = var3;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            class105.field2623 = var4;
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 25) {
            class25.field754.method739(false, 77);
            class54.field1535++;
            class25.field754.method146(var5, (byte) 127);
            class25.field754.method154(false, var4);
            class25.field754.method158(var3, true);
            class105.field2623 = var4;
            class135.field3231 = 2;
            class107.field2670 = var3;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
            class128.field3091 = 0;
        }
        if (var2 == 51) {
            if (class15.field354) {
                class90.field2308.method340(class120.field2940, var3 - 4, var4 + -4);
            } else {
                class90.field2308.method340(class120.field2940, class66.field1873 - 4, class68.field1909 + -4);
            }
        }
        if (var2 == 10) {
            class63.field1808++;
            boolean var24 = class136.method1103(0, var3, 2, false, var4, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            if (!var24) {
                class136.method1103(0, var3, 2, false, var4, 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
            }
            class90.field2311 = class68.field1909;
            class99.field2458 = class66.field1873;
            class135.field3228 = 2;
            class38.field1097 = 0;
            class25.field754.method739(false, 69);
            class25.field754.method158(var5, true);
            class25.field754.method146(class108.field2678 + var4, (byte) 17);
            class25.field754.method146(var3 + class95.field2371, (byte) 60);
        }
        if (var2 == 45) {
            class25.field754.method739(false, 216);
            class37.field1083++;
            class25.field754.method124(var4, 0);
            class25.field754.method130(-94, var3);
            class25.field754.method130(-73, var5);
            class107.field2670 = var3;
            class105.field2623 = var4;
            class135.field3231 = 2;
            class128.field3091 = 0;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 58) {
            class100.field2496++;
            class109.method898(var4, var5, var3, (byte) -125);
            class25.field754.method739(false, 224);
            class25.field754.method130(-115, var5 >> 14 & 0x7FFF);
            class25.field754.method146(var4 + class108.field2678, (byte) 116);
            class25.field754.method158(class95.field2371 + var3, true);
        }
        if (var2 == 12) {
            class59.field1680++;
            boolean var26 = class136.method1103(0, var3, 2, false, var4, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            if (!var26) {
                class136.method1103(0, var3, 2, false, var4, 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
            }
            class99.field2458 = class66.field1873;
            class135.field3228 = 2;
            class90.field2311 = class68.field1909;
            class38.field1097 = 0;
            class25.field754.method739(false, 248);
            class25.field754.method164(19877, class95.field2371 + var3);
            class25.field754.method146(class108.field2678 + var4, (byte) 93);
            class25.field754.method164(19877, var5);
        }
        if (var2 == 9) {
            class25.field754.method739(false, 199);
            class6.field146++;
            class25.field754.method113(var4, 1595636056);
            class25.field754.method158(var3, true);
            class25.field754.method164(19877, var5);
            class107.field2670 = var3;
            class128.field3091 = 0;
            class135.field3231 = 2;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
            class105.field2623 = var4;
        }
        if (var2 == 34) {
            class36 var28 = class93.field2334[var5];
            if (var28 != null) {
                class6.field134++;
                class136.method1103(0, var28.field739[0], 2, false, var28.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class135.field3228 = 2;
                class99.field2458 = class66.field1873;
                class38.field1097 = 0;
                class90.field2311 = class68.field1909;
                class25.field754.method739(false, 96);
                class25.field754.method158(class46.field1306, true);
                class25.field754.method149(class105.field2630, -20912);
                class25.field754.method158(var5, true);
            }
        }
        if (var2 == 43) {
            class144 var29 = class15.method172(var4, -13778);
            boolean var30 = true;
            if (var29.field3467 > 0) {
                var30 = class35.method439(var29, true);
            }
            if (var30) {
                class25.field754.method739(false, 81);
                class58.field1613++;
                class25.field754.method124(var4, 0);
            }
        }
        if (var2 == 49 && class85.field2230 == -1) {
            class80.method746(var4, (byte) 114, var3);
            class85.field2230 = var4;
            class60.field1684 = var3;
        }
        if (var2 == 1005) {
            class144 var31 = class15.method172(var4, -13778);
            if (var31 == null || var31.field3464[var3] < 100000) {
                class100.field2494++;
                class25.field754.method739(false, 108);
                class25.field754.method158(var5, true);
            } else {
                class52.method572(class134.field3215, -1, 0, class18.method193(new class117[] { class142.method1131(var31.field3464[var3], true), class87.field2265, class108.method887(-1, var5).field1414 }, 51));
            }
            class128.field3091 = 0;
            class107.field2670 = var3;
            class105.field2623 = var4;
            class135.field3231 = 2;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 1 && class109.method898(var4, var5, var3, (byte) -125)) {
            class25.field754.method739(false, 8);
            class25.field754.method164(19877, class16.field376);
            class107.field2653++;
            class25.field754.method154(false, class71.field1995);
            class25.field754.method146(class95.field2371 + var3, (byte) 108);
            class25.field754.method164(19877, class2.field55);
            class25.field754.method146(class108.field2678 + var4, (byte) 59);
            class25.field754.method146(var5 >> 14 & 0x7FFF, (byte) 69);
        }
        if (var2 == 40) {
            class107.field2647++;
            boolean var32 = class136.method1103(0, var3, 2, false, var4, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            if (!var32) {
                class136.method1103(0, var3, 2, false, var4, 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
            }
            class38.field1097 = 0;
            class90.field2311 = class68.field1909;
            class135.field3228 = 2;
            class99.field2458 = class66.field1873;
            class25.field754.method739(false, 26);
            class25.field754.method158(var5, true);
            class25.field754.method130(-61, var4 + class108.field2678);
            class25.field754.method130(-128, class95.field2371 + var3);
        }
        if (var2 == 1002) {
            class109.method898(var4, var5, var3, (byte) -125);
            class25.field754.method739(false, 112);
            class23.field667++;
            class25.field754.method164(19877, var5 >> 14 & 0x7FFF);
            class25.field754.method146(var4 + class108.field2678, (byte) 109);
            class25.field754.method130(-83, class95.field2371 + var3);
        }
        if (var2 == 4) {
            class62.field1760++;
            class25.field754.method739(false, 125);
            class25.field754.method164(19877, var5);
            class25.field754.method158(var3, true);
            class25.field754.method113(var4, 1595636056);
            class105.field2623 = var4;
            class135.field3231 = 2;
            class128.field3091 = 0;
            class107.field2670 = var3;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 31) {
            class36 var34 = class93.field2334[var5];
            if (var34 != null) {
                class117.field2875++;
                class136.method1103(0, var34.field739[0], 2, false, var34.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class38.field1097 = 0;
                class99.field2458 = class66.field1873;
                class135.field3228 = 2;
                class90.field2311 = class68.field1909;
                class25.field754.method739(false, 241);
                class25.field754.method158(var5, true);
                class25.field754.method130(-91, class2.field55);
                class25.field754.method158(class16.field376, true);
                class25.field754.method124(class71.field1995, 0);
            }
        }
        if (var2 == 37) {
            class43.field1220++;
            class25.field754.method739(false, 38);
            class25.field754.method146(var3, (byte) 117);
            class25.field754.method124(var4, 0);
            class25.field754.method164(19877, var5);
            class128.field3091 = 0;
            class107.field2670 = var3;
            class135.field3231 = 2;
            class105.field2623 = var4;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 44) {
            class101 var35 = class93.field2340[var5];
            if (var35 != null) {
                class79.field2115++;
                class136.method1103(0, var35.field739[0], 2, false, var35.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class90.field2311 = class68.field1909;
                class135.field3228 = 2;
                class99.field2458 = class66.field1873;
                class38.field1097 = 0;
                class25.field754.method739(false, 122);
                class25.field754.method130(-96, var5);
            }
        }
        if (var2 == 21) {
            class36 var36 = class93.field2334[var5];
            if (var36 != null) {
                class7.field160++;
                class136.method1103(0, var36.field739[0], 2, false, var36.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class38.field1097 = 0;
                class99.field2458 = class66.field1873;
                class135.field3228 = 2;
                class90.field2311 = class68.field1909;
                class25.field754.method739(false, 236);
                class25.field754.method164(19877, var5);
            }
        }
        if (var2 == 55) {
            class148.method1194((byte) 49);
            class2.field55 = var5;
            class32.field955 = 1;
            class16.field376 = var3;
            class13.field262 = true;
            class71.field1995 = var4;
            class1.field29 = class18.method193(new class117[] { class40.field1159, class108.method887(-1, var5).field1414, class121.field2968 }, 46);
            if (class1.field29 == null) {
                class1.field29 = class61.field1712;
            }
            return;
        }
        if (var2 == 13) {
            class4.field100++;
            class25.field754.method739(false, 101);
            class25.field754.method154(false, var4);
            class25.field754.method146(var3, (byte) 95);
            class25.field754.method164(19877, var5);
            class135.field3231 = 2;
            class128.field3091 = 0;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            class105.field2623 = var4;
            class107.field2670 = var3;
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 20) {
            class25.field754.method739(false, 79);
            class25.field754.method130(-85, var5);
            class21.field600++;
            class25.field754.method158(var3, true);
            class25.field754.method149(var4, -20912);
            class105.field2623 = var4;
            class128.field3091 = 0;
            class107.field2670 = var3;
            class135.field3231 = 2;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 42) {
            class144 var37 = class84.method761(var3, 0, var4);
            if (var37 != null) {
                class148.method1194((byte) 95);
                class22.method248(var4, 0, var3, class53.method583(20, class97.method827((byte) 69, var37)));
                class32.field955 = 0;
                class13.field262 = true;
                class37.field1085 = class116.method934((byte) -115, var37);
                if (class37.field1085 == null) {
                    class37.field1085 = class137.field3293;
                }
                if (var37.field3499) {
                    class57.field1589 = class18.method193(new class117[] { var37.field3519, class121.field2968 }, 22);
                } else {
                    class57.field1589 = class18.method193(new class117[] { class134.field3211, var37.field3515, class121.field2968 }, 90);
                }
                if (class84.field2201 == 16 && !var37.field3499) {
                    class101.field2518 = 3;
                    class13.field262 = true;
                    class15.field339 = true;
                }
            }
            return;
        }
        if (var2 == 8) {
            class101 var38 = class93.field2340[var5];
            if (var38 != null) {
                class136.method1103(0, var38.field739[0], 2, false, var38.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class135.field3228 = 2;
                class4.field108++;
                class90.field2311 = class68.field1909;
                class38.field1097 = 0;
                class99.field2458 = class66.field1873;
                class25.field754.method739(false, 244);
                class25.field754.method158(var5, true);
            }
        }
        if (var2 == 2 || var2 == 30) {
            class117 var39 = class35.field1051[arg0];
            int var40 = var39.method948((byte) 82, class121.field2968);
            if (var40 != -1) {
                class117 var41 = var39.method949(var40 + 5, 0).method976(68);
                class117 var42 = var41.method945(-113).method957(-8191);
                boolean var43 = false;
                for (int var44 = 0; var44 < class96.field2419; var44++) {
                    class101 var45 = class93.field2340[class137.field3292[var44]];
                    if (var45 != null && var45.field2528 != null && var45.field2528.method965(var42, false)) {
                        var43 = true;
                        class136.method1103(0, var45.field739[0], 2, false, var45.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                        if (var2 == 2) {
                            class25.field754.method739(false, 115);
                            class25.field754.method158(class137.field3292[var44], true);
                            class108.field2694++;
                        }
                        if (var2 == 30) {
                            class25.field754.method739(false, 244);
                            class25.field754.method158(class137.field3292[var44], true);
                            class4.field108++;
                        }
                        break;
                    }
                }
                if (!var43) {
                    class52.method572(class134.field3215, -1, 0, class18.method193(new class117[] { class72.field2016, var42 }, 101));
                }
            }
        }
        if (var2 == 5) {
            class20.method229((byte) -14);
        }
        if (var2 == 32 || var2 == 19 || var2 == 17 || var2 == 22) {
            class117 var46 = class35.field1051[arg0];
            int var47 = var46.method948((byte) 124, class121.field2968);
            if (var47 != -1) {
                long var48 = var46.method949(var47 + 5, 0).method976(38).method966(121);
                if (var2 == 32) {
                    class108.method889(var48, 1);
                }
                if (var2 == 19) {
                    class49.method542(var48, 0);
                }
                if (var2 == 17) {
                    class43.method480(false, var48);
                }
                if (var2 == 22) {
                    class53.method581(112, var48);
                }
            }
        }
        if (var2 == 35) {
            class36 var50 = class93.field2334[var5];
            if (var50 != null) {
                field1171++;
                class136.method1103(0, var50.field739[0], 2, false, var50.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class90.field2311 = class68.field1909;
                class38.field1097 = 0;
                class135.field3228 = 2;
                class99.field2458 = class66.field1873;
                class25.field754.method739(false, 85);
                class25.field754.method164(19877, var5);
            }
        }
        if (var2 == 27) {
            class36 var51 = class93.field2334[var5];
            if (var51 != null) {
                class25.field734++;
                class136.method1103(0, var51.field739[0], 2, false, var51.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class99.field2458 = class66.field1873;
                class38.field1097 = 0;
                class135.field3228 = 2;
                class90.field2311 = class68.field1909;
                class25.field754.method739(false, 174);
                class25.field754.method130(63, var5);
            }
        }
        if (var2 == 24) {
            class117 var52 = class35.field1051[arg0];
            int var53 = var52.method948((byte) 85, class121.field2968);
            if (var53 != -1) {
                int var54 = -1;
                long var55 = var52.method949(var53 + 5, 0).method976(105).method966(80);
                for (int var57 = 0; var57 < class5.field119; var57++) {
                    if (class56.field1551[var57] == var55) {
                        var54 = var57;
                        break;
                    }
                }
                if (var54 != -1 && class35.field1037[var54] > 0) {
                    class18.field458 = true;
                    class80.field2142 = 0;
                    class134.field3216 = class134.field3215;
                    class36.field1058 = true;
                    class57.field1584 = 3;
                    class16.field381 = class56.field1551[var54];
                    class134.field3212 = class18.method193(new class117[] { class71.field1992, class72.field2025[var54] }, 116);
                }
            }
        }
        if (var2 == 56) {
            class107.method884(var3, var4, 0, var5);
        }
        if (var2 == 14) {
            class25.field754.method739(false, 84);
            class25.field754.method164(19877, class46.field1306);
            class25.field754.method130(-85, var3);
            class25.field754.method146(var5, (byte) 46);
            class25.field754.method149(var4, -20912);
            class58.field1611++;
            class25.field754.method154(false, class105.field2630);
            class105.field2623 = var4;
            class135.field3231 = 2;
            class107.field2670 = var3;
            class128.field3091 = 0;
            if (var4 >> 16 == class121.field2977) {
                class135.field3231 = 1;
            }
            if (var4 >> 16 == class56.field1553) {
                class135.field3231 = 3;
            }
        }
        if (var2 == 57) {
            class101 var58 = class93.field2340[var5];
            if (var58 != null) {
                class136.method1103(0, var58.field739[0], 2, false, var58.field708[0], 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
                class135.field3228 = 2;
                class99.field2458 = class66.field1873;
                class90.field2311 = class68.field1909;
                class108.field2694++;
                class38.field1097 = 0;
                class25.field754.method739(false, 115);
                class25.field754.method158(var5, true);
            }
        }
        if (var2 == 23) {
            class124.field2995++;
            class109.method898(var4, var5, var3, (byte) -125);
            class25.field754.method739(false, 78);
            class25.field754.method164(19877, var5 >> 14 & 0x7FFF);
            class25.field754.method158(var4 + class108.field2678, true);
            class25.field754.method130(87, class95.field2371 + var3);
        }
        if (arg1 < 35) {
            method468((byte) -119);
        }
        if (var2 == 36) {
            class135.field3232++;
            class25.field754.method739(false, 161);
            class25.field754.method154(false, class105.field2630);
            class25.field754.method146(class46.field1306, (byte) 81);
            class25.field754.method124(var4, 0);
            class25.field754.method164(19877, var3);
        }
        if (var2 == 1003) {
            class38.field1097 = 0;
            class99.field2458 = class66.field1873;
            class135.field3228 = 2;
            class100.field2494++;
            class90.field2311 = class68.field1909;
            class25.field754.method739(false, 108);
            class25.field754.method158(var5, true);
        }
        if (var2 == 18) {
            boolean var59 = class136.method1103(0, var3, 2, false, var4, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            class49.field1367++;
            if (!var59) {
                class136.method1103(0, var3, 2, false, var4, 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
            }
            class99.field2458 = class66.field1873;
            class38.field1097 = 0;
            class135.field3228 = 2;
            class90.field2311 = class68.field1909;
            class25.field754.method739(false, 212);
            class25.field754.method164(19877, class46.field1306);
            class25.field754.method158(var3 + class95.field2371, true);
            class25.field754.method158(var5, true);
            class25.field754.method158(var4 + class108.field2678, true);
            class25.field754.method149(class105.field2630, -20912);
        }
        if (var2 == 53) {
            class80.field2136++;
            boolean var61 = class136.method1103(0, var3, 2, false, var4, 0, 0, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 0);
            if (!var61) {
                class136.method1103(0, var3, 2, false, var4, 0, 1, class144.field3516.field739[0], 0, class144.field3516.field708[0], -2, 1);
            }
            class38.field1097 = 0;
            class135.field3228 = 2;
            class90.field2311 = class68.field1909;
            class99.field2458 = class66.field1873;
            class25.field754.method739(false, 82);
            class25.field754.method146(class95.field2371 + var3, (byte) 25);
            class25.field754.method130(-60, class108.field2678 + var4);
            class25.field754.method146(var5, (byte) 112);
        }
        if (class32.field955 != 0) {
            class13.field262 = true;
            class32.field955 = 0;
        }
        if (class46.field1292) {
            class148.method1194((byte) 93);
            class13.field262 = true;
        }
    }

    @OriginalMember(owner = "client!fe", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1185.update(arg0);
        field1174++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILea;IILhc;II)V")
    public static final void method472(int arg0, int arg1, int arg2, class30 arg3, int arg4, int arg5, class52 arg6, int arg7, int arg8) {
        field1181++;
        if (class68.field1925 && (class124.field3002[0][arg5][arg8] & 0x2) == 0) {
            if ((class124.field3002[arg1][arg5][arg8] & 0x10) != 0) {
                return;
            }
            if (class142.method1133(arg8, 0, arg1, arg5) != class53.field1483) {
                return;
            }
        }
        if (class35.field1032 > arg1) {
            class35.field1032 = arg1;
        }
        int var9 = class14.field272[arg1][arg5][arg8];
        int var10 = 52 / ((arg0 - 11) / 45);
        int var11 = class14.field272[arg1][arg5 + 1][arg8];
        int var12 = class14.field272[arg1][arg5 + 1][arg8 + 1];
        int var13 = class14.field272[arg1][arg5][arg8 + 1];
        class62 var14 = class147.method1191((byte) 109, arg4);
        int var15 = var9 + var11 + var12 + var13 >> 2;
        int var16 = (arg8 << 7) + (arg4 << 14) + arg5 + 1073741824;
        if (var14.field1749 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        int var17 = (arg2 << 6) + arg7;
        if (var14.field1777 == 1) {
            var17 += 256;
        }
        if (var14.method628((byte) -65)) {
            class74.method701(arg8, 4, arg2, arg5, var14, arg1);
        }
        if (arg7 == 22) {
            if (!class68.field1925 || var14.field1749 != 0 || var14.field1770) {
                class60 var18;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var18 = var14.method629(arg2, var11, var13, 22, var9, var12, 128);
                } else {
                    var18 = new class58(arg4, 22, arg2, var9, var11, var12, var13, var14.field1748, true, null);
                }
                arg3.method324(arg1, arg5, arg8, var15, var18, var16, var17);
                if (var14.field1758 && var14.field1749 == 1 && arg6 != null) {
                    arg6.method574(false, arg8, arg5);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class60 var38;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var38 = var14.method629(arg2, var11, var13, 10, var9, var12, 128);
            } else {
                var38 = new class58(arg4, 10, arg2, var9, var11, var12, var13, var14.field1748, true, null);
            }
            if (var38 != null) {
                int var39 = 0;
                int var40;
                int var41;
                if (arg2 == 1 || arg2 == 3) {
                    var41 = var14.field1750;
                    var40 = var14.field1737;
                } else {
                    var40 = var14.field1750;
                    var41 = var14.field1737;
                }
                if (arg7 == 11) {
                    var39 += 256;
                }
                if (arg3.method368(arg1, arg5, arg8, var15, var41, var40, var38, var39, var16, var17) && var14.field1759) {
                    int var42 = 15;
                    if (var38 instanceof class28) {
                        var42 = ((class28) var38).method308() / 4;
                        if (var42 > 30) {
                            var42 = 30;
                        }
                    }
                    for (int var43 = 0; var43 <= var41; var43++) {
                        for (int var44 = 0; var44 <= var40; var44++) {
                            if (class35.field1044[arg1][arg5 + var43][arg8 + var44] < var42) {
                                class35.field1044[arg1][arg5 + var43][arg8 + var44] = (byte) var42;
                            }
                        }
                    }
                }
            }
            if (var14.field1758 && arg6 != null) {
                arg6.method565(arg5, var14.field1737, arg2, var14.field1750, -73, arg8, var14.field1773);
            }
        } else if (arg7 >= 12) {
            class60 var19;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var19 = var14.method629(arg2, var11, var13, arg7, var9, var12, 128);
            } else {
                var19 = new class58(arg4, arg7, arg2, var9, var11, var12, var13, var14.field1748, true, null);
            }
            arg3.method368(arg1, arg5, arg8, var15, 1, 1, var19, 0, var16, var17);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg1 > 0) {
                class105.field2617[arg1][arg5][arg8] = class84.method763(class105.field2617[arg1][arg5][arg8], 2340);
            }
            if (var14.field1758 && arg6 != null) {
                arg6.method565(arg5, var14.field1737, arg2, var14.field1750, -118, arg8, var14.field1773);
            }
        } else if (arg7 == 0) {
            class60 var20;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var20 = var14.method629(arg2, var11, var13, 0, var9, var12, 128);
            } else {
                var20 = new class58(arg4, 0, arg2, var9, var11, var12, var13, var14.field1748, true, null);
            }
            arg3.method334(arg1, arg5, arg8, var15, var20, null, class132.field3170[arg2], 0, var16, var17);
            if (arg2 == 0) {
                if (var14.field1759) {
                    class35.field1044[arg1][arg5][arg8] = 50;
                    class35.field1044[arg1][arg5][arg8 + 1] = 50;
                }
                if (var14.field1756) {
                    class105.field2617[arg1][arg5][arg8] = class84.method763(class105.field2617[arg1][arg5][arg8], 585);
                }
            } else if (arg2 == 1) {
                if (var14.field1759) {
                    class35.field1044[arg1][arg5][arg8 + 1] = 50;
                    class35.field1044[arg1][arg5 + 1][arg8 + 1] = 50;
                }
                if (var14.field1756) {
                    class105.field2617[arg1][arg5][arg8 + 1] = class84.method763(class105.field2617[arg1][arg5][arg8 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var14.field1759) {
                    class35.field1044[arg1][arg5 + 1][arg8] = 50;
                    class35.field1044[arg1][arg5 + 1][arg8 + 1] = 50;
                }
                if (var14.field1756) {
                    class105.field2617[arg1][arg5 + 1][arg8] = class84.method763(class105.field2617[arg1][arg5 + 1][arg8], 585);
                }
            } else if (arg2 == 3) {
                if (var14.field1759) {
                    class35.field1044[arg1][arg5][arg8] = 50;
                    class35.field1044[arg1][arg5 + 1][arg8] = 50;
                }
                if (var14.field1756) {
                    class105.field2617[arg1][arg5][arg8] = class84.method763(class105.field2617[arg1][arg5][arg8], 1170);
                }
            }
            if (var14.field1758 && arg6 != null) {
                arg6.method569(arg8, arg5, arg7, var14.field1773, (byte) -94, arg2);
            }
            if (var14.field1733 != 16) {
                arg3.method319(arg1, arg5, arg8, var14.field1733);
            }
        } else if (arg7 == 1) {
            class60 var21;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var21 = var14.method629(arg2, var11, var13, 1, var9, var12, 128);
            } else {
                var21 = new class58(arg4, 1, arg2, var9, var11, var12, var13, var14.field1748, true, null);
            }
            arg3.method334(arg1, arg5, arg8, var15, var21, null, client.field630[arg2], 0, var16, var17);
            if (var14.field1759) {
                if (arg2 == 0) {
                    class35.field1044[arg1][arg5][arg8 + 1] = 50;
                } else if (arg2 == 1) {
                    class35.field1044[arg1][arg5 + 1][arg8 + 1] = 50;
                } else if (arg2 == 2) {
                    class35.field1044[arg1][arg5 + 1][arg8] = 50;
                } else if (arg2 == 3) {
                    class35.field1044[arg1][arg5][arg8] = 50;
                }
            }
            if (var14.field1758 && arg6 != null) {
                arg6.method569(arg8, arg5, arg7, var14.field1773, (byte) -75, arg2);
            }
        } else if (arg7 == 2) {
            int var22 = arg2 + 1 & 0x3;
            class60 var23;
            class60 var24;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var23 = var14.method629(arg2 + 4, var11, var13, 2, var9, var12, 128);
                var24 = var14.method629(var22, var11, var13, 2, var9, var12, 128);
            } else {
                var23 = new class58(arg4, 2, arg2 + 4, var9, var11, var12, var13, var14.field1748, true, null);
                var24 = new class58(arg4, 2, var22, var9, var11, var12, var13, var14.field1748, true, null);
            }
            arg3.method334(arg1, arg5, arg8, var15, var23, var24, class132.field3170[arg2], class132.field3170[var22], var16, var17);
            if (var14.field1756) {
                if (arg2 == 0) {
                    class105.field2617[arg1][arg5][arg8] = class84.method763(class105.field2617[arg1][arg5][arg8], 585);
                    class105.field2617[arg1][arg5][arg8 + 1] = class84.method763(class105.field2617[arg1][arg5][arg8 + 1], 1170);
                } else if (arg2 == 1) {
                    class105.field2617[arg1][arg5][arg8 + 1] = class84.method763(class105.field2617[arg1][arg5][arg8 + 1], 1170);
                    class105.field2617[arg1][arg5 + 1][arg8] = class84.method763(class105.field2617[arg1][arg5 + 1][arg8], 585);
                } else if (arg2 == 2) {
                    class105.field2617[arg1][arg5 + 1][arg8] = class84.method763(class105.field2617[arg1][arg5 + 1][arg8], 585);
                    class105.field2617[arg1][arg5][arg8] = class84.method763(class105.field2617[arg1][arg5][arg8], 1170);
                } else if (arg2 == 3) {
                    class105.field2617[arg1][arg5][arg8] = class84.method763(class105.field2617[arg1][arg5][arg8], 1170);
                    class105.field2617[arg1][arg5][arg8] = class84.method763(class105.field2617[arg1][arg5][arg8], 585);
                }
            }
            if (var14.field1758 && arg6 != null) {
                arg6.method569(arg8, arg5, arg7, var14.field1773, (byte) 96, arg2);
            }
            if (var14.field1733 != 16) {
                arg3.method319(arg1, arg5, arg8, var14.field1733);
            }
        } else if (arg7 == 3) {
            class60 var25;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var25 = var14.method629(arg2, var11, var13, 3, var9, var12, 128);
            } else {
                var25 = new class58(arg4, 3, arg2, var9, var11, var12, var13, var14.field1748, true, null);
            }
            arg3.method334(arg1, arg5, arg8, var15, var25, null, client.field630[arg2], 0, var16, var17);
            if (var14.field1759) {
                if (arg2 == 0) {
                    class35.field1044[arg1][arg5][arg8 + 1] = 50;
                } else if (arg2 == 1) {
                    class35.field1044[arg1][arg5 + 1][arg8 + 1] = 50;
                } else if (arg2 == 2) {
                    class35.field1044[arg1][arg5 + 1][arg8] = 50;
                } else if (arg2 == 3) {
                    class35.field1044[arg1][arg5][arg8] = 50;
                }
            }
            if (var14.field1758 && arg6 != null) {
                arg6.method569(arg8, arg5, arg7, var14.field1773, (byte) -62, arg2);
            }
        } else if (arg7 == 9) {
            class60 var26;
            if (var14.field1748 == -1 && var14.field1791 == null) {
                var26 = var14.method629(arg2, var11, var13, arg7, var9, var12, 128);
            } else {
                var26 = new class58(arg4, arg7, arg2, var9, var11, var12, var13, var14.field1748, true, null);
            }
            arg3.method368(arg1, arg5, arg8, var15, 1, 1, var26, 0, var16, var17);
            if (var14.field1758 && arg6 != null) {
                arg6.method565(arg5, var14.field1737, arg2, var14.field1750, -75, arg8, var14.field1773);
            }
        } else {
            if (var14.field1793) {
                if (arg2 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var9;
                    var9 = var27;
                } else if (arg2 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var9;
                    var9 = var29;
                } else if (arg2 == 3) {
                    int var30 = var13;
                    var13 = var9;
                    var9 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg7 == 4) {
                class60 var31;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var31 = var14.method629(0, var11, var13, 4, var9, var12, 128);
                } else {
                    var31 = new class58(arg4, 4, 0, var9, var11, var12, var13, var14.field1748, true, null);
                }
                arg3.method332(arg1, arg5, arg8, var15, var31, class132.field3170[arg2], arg2 * 512, 0, 0, var16, var17);
            } else if (arg7 == 5) {
                int var32 = 16;
                int var33 = arg3.method355(arg1, arg5, arg8);
                if (var33 != 0) {
                    var32 = class147.method1191((byte) 102, var33 >> 14 & 0x7FFF).field1733;
                }
                class60 var34;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var34 = var14.method629(0, var11, var13, 4, var9, var12, 128);
                } else {
                    var34 = new class58(arg4, 4, 0, var9, var11, var12, var13, var14.field1748, true, null);
                }
                arg3.method332(arg1, arg5, arg8, var15, var34, class132.field3170[arg2], arg2 * 512, class84.field2193[arg2] * var32, class116.field2835[arg2] * var32, var16, var17);
            } else if (arg7 == 6) {
                class60 var35;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var35 = var14.method629(0, var11, var13, 4, var9, var12, 128);
                } else {
                    var35 = new class58(arg4, 4, 0, var9, var11, var12, var13, var14.field1748, true, null);
                }
                arg3.method332(arg1, arg5, arg8, var15, var35, 256, arg2, 0, 0, var16, var17);
            } else if (arg7 == 7) {
                class60 var36;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var36 = var14.method629(0, var11, var13, 4, var9, var12, 128);
                } else {
                    var36 = new class58(arg4, 4, 0, var9, var11, var12, var13, var14.field1748, true, null);
                }
                arg3.method332(arg1, arg5, arg8, var15, var36, 512, arg2, 0, 0, var16, var17);
            } else if (arg7 == 8) {
                class60 var37;
                if (var14.field1748 == -1 && var14.field1791 == null) {
                    var37 = var14.method629(0, var11, var13, 4, var9, var12, 128);
                } else {
                    var37 = new class58(arg4, 4, 0, var9, var11, var12, var13, var14.field1748, true, null);
                }
                arg3.method332(arg1, arg5, arg8, var15, var37, 768, arg2, 0, 0, var16, var17);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ[B)Z")
    public static final boolean method473(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field1190++;
        boolean var4 = arg2;
        class14 var5 = new class14(arg3);
        int var6 = -1;
        label67: while (true) {
            int var7 = var5.method169(99);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class62 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method169(97);
                                        if (var17 == 0) {
                                            continue label67;
                                        }
                                        var5.method153(true);
                                    }
                                    int var10 = var5.method169(83);
                                    if (var10 == 0) {
                                        continue label67;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var5.method153(arg2) >> 2;
                                    var14 = arg1 + var11;
                                    var15 = arg0 + var12;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class147.method1191((byte) 77, var6);
                } while (var13 == 22 && class68.field1925 && var16.field1749 == 0 && !var16.field1770);
                if (!var16.method634(10223)) {
                    class59.field1637++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1191++;
        this.field1185.paint(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method474(int arg0) {
        field1186 = null;
        field1192 = null;
        field1193 = null;
        field1194 = null;
        field1170 = null;
        field1183 = null;
        field1200 = null;
        field1177 = null;
        if (arg0 != 0) {
            field1172 = null;
        }
        field1184 = null;
        field1195 = null;
        field1199 = null;
        field1175 = null;
        field1201 = null;
        field1189 = null;
        field1198 = null;
        field1180 = null;
        field1172 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class41(Component arg0) {
        this.field1185 = arg0;
    }
}
