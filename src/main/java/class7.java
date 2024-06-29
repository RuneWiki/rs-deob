import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class31 {

    @OriginalMember(owner = "client!af", name = "V", descriptor = "[I")
    public static int[] field98 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field99 = -1;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "Lid;")
    public static class60 field106 = class11.method72("Der Server wird gerade aktualisiert)3", (byte) -121);

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field95 = 99;

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "Lid;")
    private static class60 field104 = class11.method72(" has logged out)3", (byte) -124);

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "Lid;")
    public static class60 field101 = class11.method72("auf einer freien Welt zu spielen)3", (byte) -84);

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "Lid;")
    private static class60 field111 = class11.method72("This world is full)3", (byte) 115);

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "Lid;")
    public static class60 field108 = class11.method72("Neuer Benutzer", (byte) 91);

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Lid;")
    public static class60 field105 = field104;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "Lid;")
    public static class60 field112 = field111;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Lqd;")
    public static class115 field102 = new class115(100);

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
    public static final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field96++;
        class120.field2749 = 0;
        for (int var5 = -1; var5 < class44.field1170 + class72.field1748; var5++) {
            class35 var21;
            if (var5 == -1) {
                var21 = class107.field2640;
            } else if (class44.field1170 <= var5) {
                var21 = class5.field83[class1.field1[var5 - class44.field1170]];
            } else {
                var21 = class81.field2016[class121.field2781[var5]];
            }
            if (var21 != null && var21.method2((byte) 37)) {
                if (var21 instanceof class53) {
                    class154 var22 = ((class53) var21).field1337;
                    if (var22.field3499 != null) {
                        var22 = var22.method1169(-14424);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class44.field1170) {
                    class154 var25 = ((class53) var21).field1337;
                    if (var25.field3499 != null) {
                        var25 = var25.method1169(-14424);
                    }
                    if (var25.field3460 >= 0 && class90.field2228.length > var25.field3460) {
                        class148.method1132(0, var21, var21.field881 + 15);
                        if (class146.field3284 > -1) {
                            class90.field2228[var25.field3460].method29(arg0 + class146.field3284 - 12, arg3 - -class109.field2660 - 30);
                        }
                    }
                    if (class106.field2625 == 1 && class1.field1[var5 - class44.field1170] == class75.field1799 && class82.field2065 % 20 < 10) {
                        class148.method1132(0, var21, var21.field881 + 15);
                        if (class146.field3284 > -1) {
                            class25.field612[0].method29(arg0 + class146.field3284 - 12, class109.field2660 + arg3 - 28);
                        }
                    }
                } else {
                    int var23 = 30;
                    class1 var24 = (class1) var21;
                    if (var24.field24 != -1 || var24.field12 != -1) {
                        class148.method1132(0, var21, var21.field881 + 15);
                        if (class146.field3284 > -1) {
                            if (var24.field24 != -1) {
                                class14.field296[var24.field24].method29(class146.field3284 + arg0 - 12, class109.field2660 + arg3 + -var23);
                                var23 += 25;
                            }
                            if (var24.field12 != -1) {
                                class90.field2228[var24.field12].method29(arg0 + class146.field3284 - 12, class109.field2660 + arg3 + -var23);
                                var23 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class106.field2625 == 10 && class121.field2781[var5] == class145.field3263) {
                        class148.method1132(0, var21, var21.field881 + 15);
                        if (class146.field3284 > -1) {
                            class25.field612[1].method29(class146.field3284 + arg0 - 12, arg3 - var23 + class109.field2660);
                        }
                    }
                }
                if (var21.field861 != null && (class44.field1170 <= var5 || class11.field195 == 0 || class11.field195 == 3 || class11.field195 == 1 && class133.method1052(12560, ((class1) var21).field21))) {
                    class148.method1132(0, var21, var21.field881);
                    if (class146.field3284 > -1 && class87.field2187 > class120.field2749) {
                        class87.field2182[class120.field2749] = class103.field2491.method946(var21.field861) / 2;
                        class87.field2189[class120.field2749] = class103.field2491.field2809;
                        class87.field2185[class120.field2749] = class146.field3284;
                        class87.field2192[class120.field2749] = class109.field2660;
                        class87.field2190[class120.field2749] = var21.field833;
                        class87.field2178[class120.field2749] = var21.field829;
                        class87.field2177[class120.field2749] = var21.field831;
                        class87.field2176[class120.field2749] = var21.field861;
                        class120.field2749++;
                    }
                }
                if (class82.field2065 < var21.field815) {
                    class148.method1132(0, var21, var21.field881 + 15);
                    if (class146.field3284 > -1) {
                        int var26 = var21.field837 * 30 / var21.field880;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class130.method1015(class146.field3284 + arg0 - 15, arg3 + -3 + class109.field2660, var26, 5, 65280);
                        class130.method1015(class146.field3284 + arg0 + var26 - 15, arg3 - -class109.field2660 - 3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var21.field821[var27] > class82.field2065) {
                        class148.method1132(0, var21, var21.field881 / 2);
                        if (class146.field3284 > -1) {
                            if (var27 == 1) {
                                class109.field2660 -= 20;
                            }
                            if (var27 == 2) {
                                class146.field3284 -= 15;
                                class109.field2660 -= 10;
                            }
                            if (var27 == 3) {
                                class109.field2660 -= 10;
                                class146.field3284 += 15;
                            }
                            class8.field123[var21.field838[var27]].method29(class146.field3284 + arg0 - 12, arg3 - -class109.field2660 - 12);
                            class18.field447.method956(class98.method774((byte) -121, var21.field824[var27]), class146.field3284 + arg0 - 1, class109.field2660 + 3 + arg3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var6 = 0; var6 < class120.field2749; var6++) {
            int var7 = class87.field2185[var6];
            int var8 = class87.field2192[var6];
            int var9 = class87.field2189[var6];
            int var10 = class87.field2182[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class87.field2192[var20] + -class87.field2189[var20] && class87.field2192[var20] + 2 > -var9 + var8 && var7 - var10 < class87.field2185[var20] + class87.field2182[var20] && var7 + var10 > class87.field2185[var20] - class87.field2182[var20] && class87.field2192[var20] - class87.field2189[var20] < var8) {
                        var11 = true;
                        var8 = class87.field2192[var20] - class87.field2189[var20];
                    }
                }
            }
            class146.field3284 = class87.field2185[var6];
            class109.field2660 = class87.field2192[var6] = var8;
            class60 var12 = class87.field2176[var6];
            if (class55.field1377 == 0) {
                int var13 = 16776960;
                if (class87.field2190[var6] < 6) {
                    var13 = class140.field3189[class87.field2190[var6]];
                }
                if (class87.field2190[var6] == 6) {
                    var13 = class23.field556 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class87.field2190[var6] == 7) {
                    var13 = class23.field556 % 20 < 10 ? 255 : 65535;
                }
                if (class87.field2190[var6] == 8) {
                    var13 = class23.field556 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class87.field2190[var6] == 9) {
                    int var14 = 150 - class87.field2177[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class87.field2190[var6] == 10) {
                    int var15 = 150 - class87.field2177[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 - (var15 - 100) * 5;
                    }
                }
                if (class87.field2190[var6] == 11) {
                    int var16 = 150 - class87.field2177[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class87.field2178[var6] == 0) {
                    class103.field2491.method956(var12, class146.field3284 + arg0, class109.field2660 + arg3, var13, 0);
                }
                if (class87.field2178[var6] == 1) {
                    class103.field2491.method961(var12, class146.field3284 + arg0, class109.field2660 + arg3, var13, 0, class23.field556);
                }
                if (class87.field2178[var6] == 2) {
                    class103.field2491.method970(var12, class146.field3284 + arg0, class109.field2660 + arg3, var13, 0, class23.field556);
                }
                if (class87.field2178[var6] == 3) {
                    class103.field2491.method952(var12, class146.field3284 + arg0, arg3 - -class109.field2660, var13, 0, class23.field556, 150 - class87.field2177[var6]);
                }
                if (class87.field2178[var6] == 4) {
                    int var17 = (150 - class87.field2177[var6]) * (class103.field2491.method946(var12) + 100) / 150;
                    class130.method1030(arg0 + class146.field3284 - 50, arg3, class146.field3284 + arg0 + 50, arg3 - -arg4);
                    class103.field2491.method947(var12, arg0 + class146.field3284 + 50 - var17, class109.field2660 + arg3, var13, 0);
                    class130.method1021(arg0, arg3, arg0 + arg1, arg3 + arg4);
                }
                if (class87.field2178[var6] == 5) {
                    int var18 = 150 - class87.field2177[var6];
                    int var19 = 0;
                    class130.method1030(arg0, arg3 + class109.field2660 - class103.field2491.field2809 - 1, arg0 - -arg1, arg3 + class109.field2660 + 5);
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class103.field2491.method956(var12, class146.field3284 + arg0, arg3 - -class109.field2660 + var19, var13, 0);
                    class130.method1021(arg0, arg3, arg0 + arg1, arg3 + arg4);
                }
            } else {
                class103.field2491.method956(var12, class146.field3284 + arg0, class109.field2660 + arg3, 16776960, 0);
            }
        }
        if (arg2 < 60) {
            field106 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    public static final void method47(int arg0) {
        if (arg0 != 12711) {
            return;
        }
        class89.field2205 = null;
        class100.field2442 = null;
        field114++;
        class104.field2551 = null;
        class90.field2236 = null;
        class35.field879 = null;
        class136.field3098 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lof;I)V")
    public final void method48(class103 arg0, int arg1) {
        int var3 = 96 % ((64 - arg1) / 50);
        field109++;
        while (true) {
            int var4 = arg0.method829((byte) 38);
            if (var4 == 0) {
                return;
            }
            this.method50(var4, arg0, -50);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static void method49(byte arg0) {
        field98 = null;
        if (arg0 != 84) {
            field112 = null;
        }
        field102 = null;
        field106 = null;
        field112 = null;
        field111 = null;
        field101 = null;
        field105 = null;
        field104 = null;
        field108 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILof;I)V")
    private final void method50(int arg0, class103 arg1, int arg2) {
        if (arg2 != -50) {
            this.method48(null, 68);
        }
        field107++;
        if (arg0 == 1) {
            this.field97 = arg1.method808(arg2 - 20004);
            this.field113 = arg1.method829((byte) -99);
            this.field94 = arg1.method829((byte) -91);
        }
    }
}
