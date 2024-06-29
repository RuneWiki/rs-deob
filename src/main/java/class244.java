import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class244 extends class82 {

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "[[I")
    public int[][] field3648;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "[I")
    public int[] field3649;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "[Z")
    public boolean[] field3645;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "[I")
    public int[] field3652;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Lik;")
    public static class267 field3653 = new class267(64);

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field3658 = 0;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3659 = "wave:";

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Ljava/awt/Frame;")
    public static Frame field3657;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
    public static final void method1537(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class114.field1743; var3++) {
            for (int var4 = 0; var4 < class197.field2997; var4++) {
                for (int var5 = 0; var5 < class92.field1448; var5++) {
                    class270 var6 = class33.field487[var3][var4][var5];
                    if (var6 != null) {
                        class162 var7 = var6.field4084;
                        if (var7 != null && var7.field2489.method738()) {
                            class239.method1513(var7.field2489, var3, var4, var5, 1, 1);
                            if (var7.field2478 != null && var7.field2478.method738()) {
                                class239.method1513(var7.field2478, var3, var4, var5, 1, 1);
                                var7.field2489.method736(var7.field2478, 0, 0, 0, false);
                                var7.field2478 = var7.field2478.method737(arg0, arg1, arg2);
                            }
                            var7.field2489 = var7.field2489.method737(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4071; var8++) {
                            class2 var10 = var6.field4069[var8];
                            if (var10 != null && var10.field31.method738()) {
                                class239.method1513(var10.field31, var3, var4, var5, var10.field25 + 1 - var10.field26, var10.field34 - var10.field23 + 1);
                                var10.field31 = var10.field31.method737(arg0, arg1, arg2);
                            }
                        }
                        class108 var9 = var6.field4063;
                        if (var9 != null && var9.field1684.method738()) {
                            class200.method1257(var9.field1684, var3, var4, var5);
                            var9.field1684 = var9.field1684.method737(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    public static final void method1538(int arg0) {
        if (class205.field3077 > 1) {
            class16.field189 = class68.field1077;
            class205.field3077--;
        }
        if (class149.field2161 > 0) {
            class149.field2161--;
        }
        field3650++;
        if (class254.field3859) {
            class254.field3859 = false;
            class130.method811(126);
            return;
        }
        for (int var1 = 0; var1 < 100 && class61.method406(arg0 - 118); var1++) {
        }
        if (class184.field2794 != 30) {
            return;
        }
        class195.method1220(127, arg0 - 24026, class196.field2979);
        Object var2 = class106.field1622.field324;
        synchronized (class106.field1622.field324) {
            if (!class66.field1059) {
                class106.field1622.field325 = 0;
            } else if (class246.field3676 != 0 || class106.field1622.field325 >= 40) {
                class196.field2979.method1106(212, false);
                class196.field2979.method1568(0, (byte) 49);
                class228.field3413++;
                int var3 = class196.field2979.field3748;
                int var4 = 0;
                for (int var5 = 0; class106.field1622.field325 > var5 && class196.field2979.field3748 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class106.field1622.field328[var5];
                    int var7 = class106.field1622.field326[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class106.field1622.field326[var5] == -1 && class106.field1622.field328[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class199.field3022 != var6 || class286.field4283 != var7) {
                        int var9 = var6 - class199.field3022;
                        class199.field3022 = var6;
                        int var10 = var7 - class286.field4283;
                        class286.field4283 = var7;
                        if (class114.field1750 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class196.field2979.method1605((class114.field1750 << 12) + (var9 << 6) + var10, (byte) 93);
                            class114.field1750 = 0;
                        } else if (class114.field1750 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class196.field2979.method1568(class114.field1750 + 128, (byte) 49);
                            class196.field2979.method1605((var9 << 8) + var10, (byte) -88);
                            class114.field1750 = 0;
                        } else if (class114.field1750 < 32) {
                            class196.field2979.method1568(class114.field1750 + 192, (byte) 49);
                            if (var8) {
                                class196.field2979.method1577((byte) 73, Integer.MIN_VALUE);
                            } else {
                                class196.field2979.method1577((byte) 74, var7 << 16 | var6);
                            }
                            class114.field1750 = 0;
                        } else {
                            class196.field2979.method1605(class114.field1750 + 57344, (byte) 70);
                            if (var8) {
                                class196.field2979.method1577((byte) 108, Integer.MIN_VALUE);
                            } else {
                                class196.field2979.method1577((byte) 104, var7 << 16 | var6);
                            }
                            class114.field1750 = 0;
                        }
                    } else if (class114.field1750 < 2047) {
                        class114.field1750++;
                    }
                }
                class196.field2979.method1565(class196.field2979.field3748 - var3, (byte) 104);
                if (var4 >= class106.field1622.field325) {
                    class106.field1622.field325 = 0;
                } else {
                    class106.field1622.field325 -= var4;
                    for (int var11 = 0; var11 < class106.field1622.field325; var11++) {
                        class106.field1622.field328[var11] = class106.field1622.field328[var4 + var11];
                        class106.field1622.field326[var11] = class106.field1622.field326[var11 + var4];
                    }
                }
            }
        }
        if (class246.field3676 != 0) {
            class176.field2683++;
            int var12 = class205.field3076;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            long var13 = (class79.field1279 - class39.field526) / 50L;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            byte var15 = 0;
            if (class246.field3676 == 2) {
                var15 = 1;
            }
            int var16 = class188.field2872;
            class39.field526 = class79.field1279;
            class196.field2979.method1106(51, false);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            class196.field2979.method1569(var17 | var15 << 15, -7355);
            class196.field2979.method1580(254789464, var12 | var16 << 16);
        }
        if (class68.field1074 > 0) {
            class68.field1074--;
        }
        if (class177.field2722 && class68.field1074 <= 0) {
            class68.field1074 = 20;
            class177.field2722 = false;
            class196.field2979.method1106(113, false);
            class196.field2979.method1599(arg0 ^ 0x258A, (int) class84.field1336);
            class196.field2979.method1588((int) class83.field1327, (byte) 43);
            class85.field1358++;
        }
        if (class221.field3328 && !class210.field3156) {
            class210.field3156 = true;
            class94.field1484++;
            class196.field2979.method1106(244, false);
            class196.field2979.method1568(1, (byte) 49);
        }
        if (!class221.field3328 && class210.field3156) {
            class94.field1484++;
            class210.field3156 = false;
            class196.field2979.method1106(244, false);
            class196.field2979.method1568(0, (byte) 49);
        }
        if (!class147.field2139) {
            class24.field286++;
            class196.field2979.method1106(205, false);
            class196.field2979.method1561(class63.method423((byte) 64), 255);
            class147.field2139 = true;
        }
        if (class188.field2871) {
            class188.field2871 = false;
        } else {
            class278.field4187 /= 2.0F;
        }
        if (class259.field3951) {
            class259.field3951 = false;
        } else {
            class252.field3828 /= 2.0F;
        }
        class253.method1660(9);
        if (class184.field2794 != 30) {
            return;
        }
        class188.method1173(-2);
        class83.method547(126);
        class18.method126(32360);
        class18.field216++;
        if (class18.field216 > 750) {
            class130.method811(126);
            return;
        }
        class146.method886((byte) -27);
        class82.method544((byte) 54);
        class251.method1646(arg0);
        if (class219.field3303 != null) {
            class255.method1682((byte) -41);
        }
        for (int var18 = class180.method1123(true, -127); var18 != -1; var18 = class180.method1123(false, -126)) {
            class183.method1140(var18, -24559);
            class235.field3550[class94.method598(class26.field323++, 31)] = var18;
        }
        for (class187 var19 = class242.method1532((byte) -128); var19 != null; var19 = class242.method1532((byte) -128)) {
            int var20 = var19.method1165((byte) 120);
            int var21 = var19.method1168(32);
            if (var20 == 1) {
                class210.field3161[var21] = var19.field2844;
                class229.field3452[class94.method598(class256.field3910++, 31)] = var21;
            } else if (var20 == 2) {
                class45.field720[var21] = var19.field2835;
                class17.field198[class94.method598(class42.field614++, 31)] = var21;
            } else if (var20 == 3) {
                class289 var42 = class89.method574((byte) -15, var21);
                if (!var19.field2835.equals(var42.field4438)) {
                    var42.field4438 = var19.field2835;
                    class295.method1980(var42, 0);
                }
            } else if (var20 == 4) {
                class289 var38 = class89.method574((byte) -15, var21);
                int var39 = var19.field2844;
                int var40 = var19.field2837;
                int var41 = var19.field2830;
                if (var38.field4453 != var39 || var38.field4459 != var40 || var38.field4450 != var41) {
                    var38.field4459 = var40;
                    var38.field4450 = var41;
                    var38.field4453 = var39;
                    class295.method1980(var38, arg0 ^ 0x1);
                }
            } else if (var20 == 5) {
                class289 var22 = class89.method574((byte) -15, var21);
                if (var19.field2844 != var22.field4542 || var19.field2844 == -1) {
                    var22.field4542 = var19.field2844;
                    var22.field4397 = 0;
                    var22.field4521 = 1;
                    var22.field4395 = 0;
                    class295.method1980(var22, 0);
                }
            } else if (var20 == 6) {
                int var23 = var19.field2844;
                int var24 = var23 >> 5 & 0x1F;
                int var25 = var23 >> 10 & 0x1F;
                int var26 = var23 & 0x1F;
                class289 var27 = class89.method574((byte) -15, var21);
                int var28 = (var25 << 19) + (var24 << 11) + (var26 << 3);
                if (var27.field4402 != var28) {
                    var27.field4402 = var28;
                    class295.method1980(var27, 0);
                }
            } else if (var20 == 7) {
                class289 var36 = class89.method574((byte) -15, var21);
                boolean var37 = var19.field2844 == 1;
                if (var36.field4537 != var37) {
                    var36.field4537 = var37;
                    class295.method1980(var36, arg0 ^ 0x1);
                }
            } else if (var20 == 8) {
                class289 var29 = class89.method574((byte) -15, var21);
                if (var19.field2844 != var29.field4531 || var19.field2837 != var29.field4434 || var19.field2830 != var29.field4480) {
                    var29.field4434 = var19.field2837;
                    var29.field4531 = var19.field2844;
                    var29.field4480 = var19.field2830;
                    if (var29.field4566 != -1) {
                        if (var29.field4399 > 0) {
                            var29.field4480 = var29.field4480 * 32 / var29.field4399;
                        } else if (var29.field4493 > 0) {
                            var29.field4480 = var29.field4480 * 32 / var29.field4493;
                        }
                    }
                    class295.method1980(var29, 0);
                }
            } else if (var20 == 9) {
                class289 var35 = class89.method574((byte) -15, var21);
                if (var19.field2844 != var35.field4566 || var19.field2837 != var35.field4557) {
                    var35.field4566 = var19.field2844;
                    var35.field4557 = var19.field2837;
                    class295.method1980(var35, 0);
                }
            } else if (var20 == 10) {
                class289 var30 = class89.method574((byte) -15, var21);
                if (var19.field2844 != var30.field4392 || var19.field2837 != var30.field4424 || var19.field2830 != var30.field4473) {
                    var30.field4392 = var19.field2844;
                    var30.field4424 = var19.field2837;
                    var30.field4473 = var19.field2830;
                    class295.method1980(var30, 0);
                }
            } else if (var20 == 11) {
                class289 var31 = class89.method574((byte) -15, var21);
                var31.field4468 = var31.field4410 = var19.field2844;
                var31.field4525 = var31.field4440 = var19.field2837;
                var31.field4443 = 0;
                var31.field4538 = 0;
                class295.method1980(var31, 0);
            } else if (var20 == 12) {
                class289 var33 = class89.method574((byte) -15, var21);
                int var34 = var19.field2844;
                if (var33 != null && var33.field4394 == 0) {
                    if (var33.field4558 - var33.field4444 < var34) {
                        var34 = var33.field4558 - var33.field4444;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field4460 != var34) {
                        var33.field4460 = var34;
                        class295.method1980(var33, 0);
                    }
                }
            } else if (var20 == 13) {
                class289 var32 = class89.method574((byte) -15, var21);
                var32.field4405 = var19.field2844;
            }
        }
        if (class68.field1073 != 0) {
            class50.field801 += 20;
            if (class50.field801 >= 400) {
                class68.field1073 = 0;
            }
        }
        class180.field2741++;
        if (class241.field3622 != null) {
            class43.field691++;
            if (class43.field691 >= 15) {
                class295.method1980(class241.field3622, 0);
                class241.field3622 = null;
            }
        }
        if (class251.field3814 != null) {
            class295.method1980(class251.field3814, 0);
            if (class91.field1438 > (class133.field1947 + 5) || class133.field1947 - 5 > class91.field1438 || class203.field3065 > class147.field2140 + 5 || (class147.field2140 - 5) > class203.field3065) {
                class175.field2662 = true;
            }
            class89.field1400++;
            if (class267.field4025 == 0) {
                if (class175.field2662 && class89.field1400 >= 5) {
                    if (class251.field3814 == class120.field1814 && class53.field869 != class49.field791) {
                        class289 var43 = class251.field3814;
                        class124.field1881++;
                        byte var44 = 0;
                        if (class140.field2045 == 1 && var43.field4496 == 206) {
                            var44 = 1;
                        }
                        if (var43.field4513[class49.field791] <= 0) {
                            var44 = 0;
                        }
                        if (client.method972(var43).method1798(-4800)) {
                            int var47 = class53.field869;
                            int var48 = class49.field791;
                            var43.field4513[var48] = var43.field4513[var47];
                            var43.field4448[var48] = var43.field4448[var47];
                            var43.field4513[var47] = -1;
                            var43.field4448[var47] = 0;
                        } else if (var44 == 1) {
                            int var45 = class53.field869;
                            int var46 = class49.field791;
                            while (var45 != var46) {
                                if (var46 < var45) {
                                    var43.method1920(var45, 0, var45 - 1);
                                    var45--;
                                } else if (var46 > var45) {
                                    var43.method1920(var45, 0, var45 + 1);
                                    var45++;
                                }
                            }
                        } else {
                            var43.method1920(class53.field869, 0, class49.field791);
                        }
                        class196.field2979.method1106(252, false);
                        class196.field2979.method1561(class251.field3814.field4504, 255);
                        class196.field2979.method1599(9611, class49.field791);
                        class196.field2979.method1599(9611, class53.field869);
                        class196.field2979.method1568(var44, (byte) 49);
                    }
                } else if ((class158.field2417 == 1 || class16.method116(arg0 + 29959, class218.field3278 - 1)) && class218.field3278 > 2) {
                    class295.method1977((byte) -113);
                } else if (class218.field3278 > 0) {
                    class61.method408(arg0 + 126);
                }
                class246.field3676 = 0;
                class251.field3814 = null;
                class43.field691 = 10;
            }
        }
        class274.field4122 = 0;
        class289 var49 = class97.field1529;
        class97.field1529 = null;
        class289 var50 = class76.field1233;
        class1.field14 = false;
        class76.field1233 = null;
        class160.field2456 = null;
        class30.field428 = false;
        while (class283.method1866((byte) -103) && class274.field4122 < 128) {
            class174.field2649[class274.field4122] = class183.field2773;
            class248.field3763[class274.field4122] = class178.field2724;
            class274.field4122++;
        }
        class219.field3303 = null;
        if (class136.field1987 != -1) {
            class187.method1166(class77.field1245, 0, class136.field1987, 0, class180.field2748, 0, (byte) -66, 0);
        }
        class68.field1077++;
        while (true) {
            class234 var51;
            class289 var52;
            class289 var53;
            do {
                var51 = (class234) class246.field3668.method989(4);
                if (var51 == null) {
                    while (true) {
                        class234 var54;
                        class289 var55;
                        class289 var56;
                        do {
                            var54 = (class234) class235.field3540.method989(4);
                            if (var54 == null) {
                                while (true) {
                                    class234 var57;
                                    class289 var58;
                                    class289 var59;
                                    do {
                                        var57 = (class234) class292.field4603.method989(arg0 + 3);
                                        if (var57 == null) {
                                            if (class219.field3303 == null) {
                                                class18.field215 = 0;
                                            }
                                            if (class276.field4158 != null) {
                                                class76.method507(-128);
                                            }
                                            if (class256.field3893 > 0 && class140.field2048[82] && class140.field2048[81] && class21.field246 != 0) {
                                                int var60 = class99.field1557 - class21.field246;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class46.method311(var60, class165.field2537.field2275[0] + class147.field2141, class165.field2537.field2297[0] + class81.field1303, 26596);
                                            }
                                            if (class256.field3893 > 0 && class140.field2048[82] && class140.field2048[81]) {
                                                if (class41.field607 != -1) {
                                                    class46.method311(class99.field1557, class54.field878 + class147.field2141, class81.field1303 + class41.field607, 26596);
                                                }
                                                class275.field4150 = 0;
                                                class258.field3940 = 0;
                                            } else if (class258.field3940 == 2) {
                                                if (class41.field607 != -1) {
                                                    class237.field3567++;
                                                    class196.field2979.method1106(229, false);
                                                    class196.field2979.method1569(class81.field1303 + class41.field607, arg0 ^ 0xFFFFE344);
                                                    class196.field2979.method1577((byte) 122, class116.field1763);
                                                    class196.field2979.method1588(class54.field878 + class147.field2141, (byte) 43);
                                                    class196.field2979.method1599(9611, class162.field2482);
                                                    class68.field1073 = 1;
                                                    class50.field801 = 0;
                                                    class184.field2785 = class205.field3076;
                                                    class116.field1771 = class188.field2872;
                                                }
                                                class258.field3940 = 0;
                                            } else if (class275.field4150 == 2) {
                                                if (class41.field607 != -1) {
                                                    class196.field2979.method1106(226, false);
                                                    class236.field3562++;
                                                    class196.field2979.method1588(class54.field878 + class147.field2141, (byte) 43);
                                                    class196.field2979.method1569(class81.field1303 + class41.field607, -7355);
                                                    class184.field2785 = class205.field3076;
                                                    class116.field1771 = class188.field2872;
                                                    class50.field801 = 0;
                                                    class68.field1073 = 1;
                                                }
                                                class275.field4150 = 0;
                                            } else if (class41.field607 != -1 && class258.field3940 == 0 && class275.field4150 == 0) {
                                                class21.method136((class41.field607 << 1) + 1 - class165.field2537.method676(-30217) >> 1, (class54.field878 << 1) + 1 - class165.field2537.method676(-30217) >> 1, 0, (byte) 67);
                                                class68.field1073 = 1;
                                                class184.field2785 = class205.field3076;
                                                class116.field1771 = class188.field2872;
                                                class50.field801 = 0;
                                            }
                                            class41.field607 = -1;
                                            class2.method6(arg0 ^ 0xFFFFFC15);
                                            if (class76.field1233 != var50) {
                                                if (var50 != null) {
                                                    class295.method1980(var50, 0);
                                                }
                                                if (class76.field1233 != null) {
                                                    class295.method1980(class76.field1233, 0);
                                                }
                                            }
                                            if (class97.field1529 != var49 && class171.field2595 == class128.field1920) {
                                                if (var49 != null) {
                                                    class295.method1980(var49, arg0 ^ 0x1);
                                                }
                                                if (class97.field1529 != null) {
                                                    class295.method1980(class97.field1529, 0);
                                                }
                                            }
                                            if (class97.field1529 == null) {
                                                if (class128.field1920 > 0) {
                                                    class128.field1920--;
                                                }
                                            } else if (class128.field1920 < class171.field2595) {
                                                class128.field1920++;
                                                if (class171.field2595 == class128.field1920) {
                                                    class295.method1980(class97.field1529, arg0 ^ 0x1);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class287.field4296[var61]++;
                                            }
                                            int var62 = class63.method427(1);
                                            int var63 = class199.method1248(arg0);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class124.field1880++;
                                                class149.field2161 = 250;
                                                class213.method1358(14500, -9);
                                                class196.field2979.method1106(192, false);
                                            }
                                            if (class273.field4111 != null && class273.field4111.field1249 == 1) {
                                                if (class273.field4111.field1250 != null) {
                                                    class41.method275((byte) 122, class235.field3545, client.field2373);
                                                }
                                                class235.field3545 = false;
                                                class273.field4111 = null;
                                                client.field2373 = null;
                                            }
                                            class2.field19++;
                                            class227.field3397++;
                                            if (class227.field3397 > 500) {
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class110.field1701 += class115.field1758;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class134.field1957 += class265.field3996;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class234.field3534 += class46.field750;
                                                }
                                                class227.field3397 = 0;
                                            }
                                            if (class2.field19 > 500) {
                                                class2.field19 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class82.field1324 += class199.field3025;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class154.field2311 += class76.field1232;
                                                }
                                            }
                                            if (class234.field3534 < -40) {
                                                class46.field750 = 1;
                                            }
                                            if (class134.field1957 < -55) {
                                                class265.field3996 = 2;
                                            }
                                            class26.field317++;
                                            if (class82.field1324 < -20) {
                                                class199.field3025 = 1;
                                            }
                                            if (class154.field2311 < -60) {
                                                class76.field1232 = 2;
                                            }
                                            if (class110.field1701 < -50) {
                                                class115.field1758 = 2;
                                            }
                                            if (class234.field3534 > 40) {
                                                class46.field750 = -1;
                                            }
                                            if (class154.field2311 > 60) {
                                                class76.field1232 = -2;
                                            }
                                            if (class134.field1957 > 55) {
                                                class265.field3996 = -2;
                                            }
                                            if (class82.field1324 > 10) {
                                                class199.field3025 = -1;
                                            }
                                            if (class110.field1701 > 50) {
                                                class115.field1758 = -2;
                                            }
                                            if (class26.field317 > 50) {
                                                class247.field3691++;
                                                class196.field2979.method1106(219, false);
                                            }
                                            if (class70.field1114) {
                                                class11.method53(23067);
                                                class70.field1114 = false;
                                            }
                                            try {
                                                if (class44.field706 != null && class196.field2979.field3748 > 0) {
                                                    class44.field706.method951(class196.field2979.field3748, arg0 + 96, 0, class196.field2979.field3723);
                                                    class26.field317 = 0;
                                                    class196.field2979.field3748 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class130.method811(122);
                                                return;
                                            }
                                        }
                                        var58 = var57.field3528;
                                        if (var58.field4530 < 0) {
                                            break;
                                        }
                                        var59 = class89.method574((byte) -15, var58.field4451);
                                    } while (var59 == null || var59.field4472 == null || var58.field4530 >= var59.field4472.length || var59.field4472[var58.field4530] != var58);
                                    class228.method1456((byte) -65, var57);
                                }
                            }
                            var55 = var54.field3528;
                            if (var55.field4530 < 0) {
                                break;
                            }
                            var56 = class89.method574((byte) -15, var55.field4451);
                        } while (var56 == null || var56.field4472 == null || var56.field4472.length <= var55.field4530 || var56.field4472[var55.field4530] != var55);
                        class228.method1456((byte) -56, var54);
                    }
                }
                var52 = var51.field3528;
                if (var52.field4530 < 0) {
                    break;
                }
                var53 = class89.method574((byte) -15, var52.field4451);
            } while (var53 == null || var53.field4472 == null || var52.field4530 >= var53.field4472.length || var53.field4472[var52.field4530] != var52);
            class228.method1456((byte) 113, var51);
        }
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public static void method1539(int arg0) {
        field3653 = null;
        field3657 = null;
        field3659 = null;
        if (arg0 != 1) {
            field3655 = -76;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I[B)V")
    public class244(int arg0, byte[] arg1) {
        this.field3651 = arg0;
        class248 var3 = new class248(arg1);
        this.field3654 = var3.method1593((byte) 27);
        this.field3648 = new int[this.field3654][];
        this.field3649 = new int[this.field3654];
        this.field3645 = new boolean[this.field3654];
        this.field3652 = new int[this.field3654];
        for (int var4 = 0; var4 < this.field3654; var4++) {
            this.field3652[var4] = var3.method1593((byte) 27);
        }
        for (int var5 = 0; var5 < this.field3654; var5++) {
            this.field3645[var5] = var3.method1593((byte) 27) == 1;
        }
        for (int var6 = 0; var6 < this.field3654; var6++) {
            this.field3649[var6] = var3.method1575(false);
        }
        for (int var7 = 0; var7 < this.field3654; var7++) {
            this.field3648[var7] = new int[var3.method1593((byte) 27)];
        }
        for (int var8 = 0; var8 < this.field3654; var8++) {
            for (int var9 = 0; var9 < this.field3648[var8].length; var9++) {
                this.field3648[var8][var9] = var3.method1593((byte) 27);
            }
        }
    }
}
