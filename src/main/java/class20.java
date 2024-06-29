import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class20 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ldd;")
    public static class23 field525 = new class23();

    @OriginalMember(owner = "client!da", name = "k", descriptor = "Lad;")
    public static class5 field534 = class88.method674("headicons_prayer", 120);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lad;")
    private static class5 field530 = class88.method674(" from your ignore list first", -119);

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lad;")
    public static class5 field539 = field530;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field540 = 1;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lad;")
    public static class5 field538 = class88.method674("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>", -64);

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Lad;")
    private static class5 field541 = class88.method674("Trade)4compete", -71);

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lad;")
    public static class5 field537 = field541;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lad;")
    public static class5 field542 = class88.method674("0(U", -95);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Ltb;")
    public static class116 field527;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lbb;")
    public static class9 field535;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 3)
    public static final void method160(int arg0) {
        if (class112.field2814 == 0 && class118.field2920 == 0) {
            class110.field2780++;
            class72.method580(class135.field3269, 47, class50.field1286, -117, 0, class22.field564, class91.field2131);
        }
        field531++;
        int var1 = -1;
        for (int var2 = 0; var2 < class45.field1170; var2++) {
            int var3 = class45.field1163[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 29 & 0x3;
            int var6 = var3 >> 7 & 0x7F;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var5 == 2 && class42.field1065.method756(class54.field1344, var4, var6, var3) >= 0) {
                    class70 var8 = class42.method357(var7, (byte) -42);
                    if (var8.field1655 != null) {
                        var8 = var8.method551(-126);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class112.field2814 == 1) {
                        class5.field169++;
                        class72.method580(class69.method546(true, new class5[] { class53.field1337, class35.field886, var8.field1644 }), 54, class9.field318, -126, var3, var4, var6);
                    } else if (class118.field2920 != 1) {
                        class105.field2608++;
                        class5[] var9 = var8.field1682;
                        if (class16.field438) {
                            var9 = class95.method729(true, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class112.field2798++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 36;
                                    }
                                    if (var10 == 1) {
                                        var11 = 23;
                                    }
                                    if (var10 == 2) {
                                        var11 = 19;
                                    }
                                    if (var10 == 3) {
                                        var11 = 45;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1005;
                                    }
                                    class72.method580(class69.method546(true, new class5[] { class60.field1486, var8.field1644 }), var11, var9[var10], -116, var3, var4, var6);
                                }
                            }
                        }
                        class72.method580(class69.method546(true, new class5[] { class60.field1486, var8.field1644 }), 1006, class52.field1307, -121, var8.field1647 << 14, var4, var6);
                    } else if ((class73.field1752 & 0x4) == 4) {
                        class72.method580(class69.method546(true, new class5[] { class38.field940, class35.field886, var8.field1644 }), 53, class105.field2631, -113, var3, var4, var6);
                        class110.field2768++;
                    }
                }
                if (var5 == 1) {
                    class61 var12 = class103.field2504[var7];
                    if (var12.field1498.field2925 == 1 && (var12.field112 & 0x7F) == 64 && (var12.field120 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class33.field790; var13++) {
                            class61 var16 = class103.field2504[class25.field611[var13]];
                            if (var16 != null && var12 != var16 && var16.field1498.field2925 == 1 && var12.field112 == var16.field112 && var12.field120 == var16.field120) {
                                class96.method733(var6, class25.field611[var13], var16.field1498, var4, -2);
                            }
                        }
                        for (int var14 = 0; var14 < class12.field348; var14++) {
                            class112 var15 = class7.field251[class105.field2577[var14]];
                            if (var15 != null && var12.field112 == var15.field112 && var12.field120 == var15.field120) {
                                class30.method251(class105.field2577[var14], var4, var6, (byte) 60, var15);
                            }
                        }
                    }
                    class96.method733(var6, var7, var12.field1498, var4, -2);
                }
                if (var5 == 0) {
                    class112 var17 = class7.field251[var7];
                    if ((var17.field112 & 0x7F) == 64 && (var17.field120 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class33.field790; var18++) {
                            class61 var21 = class103.field2504[class25.field611[var18]];
                            if (var21 != null && var21.field1498.field2925 == 1 && var17.field112 == var21.field112 && var17.field120 == var21.field120) {
                                class96.method733(var6, class25.field611[var18], var21.field1498, var4, -2);
                            }
                        }
                        for (int var19 = 0; var19 < class12.field348; var19++) {
                            class112 var20 = class7.field251[class105.field2577[var19]];
                            if (var20 != null && var17 != var20 && var17.field112 == var20.field112 && var17.field120 == var20.field120) {
                                class30.method251(class105.field2577[var19], var4, var6, (byte) 95, var20);
                            }
                        }
                    }
                    class30.method251(var7, var4, var6, (byte) 112, var17);
                }
                if (var5 == 3) {
                    class23 var22 = class22.field559[class54.field1344][var4][var6];
                    if (var22 != null) {
                        for (class4 var23 = (class4) var22.method175(24160); var23 != null; var23 = (class4) var22.method184(0)) {
                            class27 var24 = class3.method21((byte) 67, var23.field132);
                            if (class112.field2814 == 1) {
                                class48.field1245++;
                                class72.method580(class69.method546(true, new class5[] { class53.field1337, class58.field1435, var24.field650 }), 62, class9.field318, -124, var23.field132, var4, var6);
                            } else if (class118.field2920 != 1) {
                                class3.field59++;
                                class5[] var25 = var24.field675;
                                if (class16.field438) {
                                    var25 = class95.method729(true, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class6.field236++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 6;
                                        }
                                        if (var26 == 1) {
                                            var27 = 8;
                                        }
                                        if (var26 == 2) {
                                            var27 = 13;
                                        }
                                        if (var26 == 3) {
                                            var27 = 35;
                                        }
                                        if (var26 == 4) {
                                            var27 = 2;
                                        }
                                        class72.method580(class69.method546(true, new class5[] { class118.field2943, var24.field650 }), var27, var25[var26], -127, var23.field132, var4, var6);
                                    } else if (var26 == 2) {
                                        class72.method580(class69.method546(true, new class5[] { class118.field2943, var24.field650 }), 13, class58.field1438, -115, var23.field132, var4, var6);
                                        class65.field1573++;
                                    }
                                }
                                class72.method580(class69.method546(true, new class5[] { class118.field2943, var24.field650 }), 1004, class52.field1307, -111, var23.field132, var4, var6);
                            } else if ((class73.field1752 & 0x1) == 1) {
                                class72.method580(class69.method546(true, new class5[] { class38.field940, class58.field1435, var24.field650 }), 44, class105.field2631, -115, var23.field132, var4, var6);
                                class17.field462++;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 108) {
            field538 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 301)
    public static final void method161(byte arg0) {
        field526++;
        if (arg0 != 124) {
            field537 = null;
        }
        for (int var1 = 0; var1 < class32.field768; var1++) {
            int var10002 = class13.field386[var1]--;
            if (class13.field386[var1] >= -10) {
                class11 var3 = class118.field2921[var1];
                if (var3 == null) {
                    var3 = class11.method108(class110.field2778, class18.field482[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class13.field386[var1] += var3.method109();
                    class118.field2921[var1] = var3;
                }
                if (class13.field386[var1] < 0) {
                    int var10;
                    if (class108.field2725[var1] == 0) {
                        var10 = class54.field1352;
                    } else {
                        int var4 = (class108.field2725[var1] & 0xFF) * 128;
                        int var5 = class108.field2725[var1] >> 8 & 0xFF;
                        int var6 = class108.field2725[var1] >> 16 & 0xFF;
                        int var7 = var5 * 128 + 64 - class82.field1932.field120;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 + 64 - class82.field1932.field112;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var7 - 128;
                        if (var9 > var4) {
                            class13.field386[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class106.field2681 / var4;
                    }
                    class115 var11 = var3.method107().method919(class79.field1863);
                    class24 var12 = class24.method198(var11, 100, var10);
                    var12.method196(class5.field211[var1] - 1);
                    class58.field1417.method566(var12);
                    class13.field386[var1] = -100;
                }
            } else {
                class32.field768--;
                for (int var2 = var1; var2 < class32.field768; var2++) {
                    class18.field482[var2] = class18.field482[var2 + 1];
                    class118.field2921[var2] = class118.field2921[var2 + 1];
                    class5.field211[var2] = class5.field211[var2 + 1];
                    class13.field386[var2] = class13.field386[var2 + 1];
                    class108.field2725[var2] = class108.field2725[var2 + 1];
                }
                var1--;
            }
        }
        if (class98.field2376 <= 0) {
            return;
        }
        class98.field2376 -= 20;
        if (class98.field2376 < 0) {
            class98.field2376 = 0;
        }
        if (class98.field2376 == 0 && class103.field2517 != 0 && class120.field2987 != -1) {
            class78.method606(class120.field2987, class103.field2517, false, 0, class108.field2713, false, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBII)V", line = 418)
    public static final void method162(int arg0, byte arg1, int arg2, int arg3) {
        field529++;
        if (arg1 >= -115) {
            method162(-59, (byte) 108, -96, -39);
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class42.field1062[arg3][arg2 + var4][arg0 + var7] = 0;
            }
        }
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class42.field1062[arg3][arg2][arg0 + var5] = class42.field1062[arg3][arg2 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class42.field1062[arg3][arg2 + var6][arg0] = class42.field1062[arg3][arg2 + var6][arg0 - 1];
            }
        }
        if (arg2 > 0 && class42.field1062[arg3][arg2 - 1][arg0] != 0) {
            class42.field1062[arg3][arg2][arg0] = class42.field1062[arg3][arg2 - 1][arg0];
        } else if (arg0 > 0 && class42.field1062[arg3][arg2][arg0 - 1] != 0) {
            class42.field1062[arg3][arg2][arg0] = class42.field1062[arg3][arg2][arg0 - 1];
        } else if (arg2 > 0 && arg0 > 0 && class42.field1062[arg3][arg2 - 1][arg0 - 1] != 0) {
            class42.field1062[arg3][arg2][arg0] = class42.field1062[arg3][arg2 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lnd;", line = 479)
    public static final class82 method163(int arg0, int arg1) {
        field533++;
        if (arg0 >= -20) {
            field539 = null;
        }
        class82 var2 = (class82) class70.field1653.method98(-8, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class80.field1891.method857(30580, 14, arg1);
        class82 var4 = new class82();
        if (var3 != null) {
            var4.method636(new class39(var3), 99);
        }
        class70.field1653.method102((long) arg1, var4, 113);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 519)
    public static void method164(int arg0) {
        field530 = null;
        field539 = null;
        field534 = null;
        field537 = null;
        field538 = null;
        field527 = null;
        if (arg0 != 27606) {
            field542 = null;
        }
        field542 = null;
        field541 = null;
        field535 = null;
        field525 = null;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 538)
    public static final void method165(int arg0) {
        if (arg0 != 11863) {
            field527 = null;
        }
        field528++;
        for (class128 var1 = (class128) class39.field1015.method180(0); var1 != null; var1 = (class128) class39.field1015.method181(arg0 ^ 0x2E57)) {
            if (class54.field1344 != var1.field3068 || class69.field1636 > var1.field3087) {
                var1.method114(-3789);
            } else if (var1.field3091 <= class69.field1636) {
                if (var1.field3053 > 0) {
                    class61 var2 = class103.field2504[var1.field3053 - 1];
                    if (var2 != null && var2.field112 >= 0 && var2.field112 < 13312 && var2.field120 >= 0 && var2.field120 < 13312) {
                        var1.method988(var2.field112, class69.field1636, class95.method730(60, var2.field112, var1.field3068, var2.field120) - var1.field3070, -43, var2.field120);
                    }
                }
                if (var1.field3053 < 0) {
                    int var3 = -var1.field3053 - 1;
                    class112 var4;
                    if (class132.field3199 == var3) {
                        var4 = class82.field1932;
                    } else {
                        var4 = class7.field251[var3];
                    }
                    if (var4 != null && var4.field112 >= 0 && var4.field112 < 13312 && var4.field120 >= 0 && var4.field120 < 13312) {
                        var1.method988(var4.field112, class69.field1636, class95.method730(60, var4.field112, var1.field3068, var4.field120) - var1.field3070, 104, var4.field120);
                    }
                }
                var1.method991((byte) 72, class98.field2382);
                class42.field1065.method755(class54.field1344, (int) var1.field3065, (int) var1.field3055, (int) var1.field3050, 60, var1, var1.field3088, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BILrd;)Luc;", line = 617)
    public static final class123 method166(byte arg0, int arg1, class106 arg2) {
        field536++;
        if (class86.method653(-4, arg1, arg2)) {
            return arg0 == -49 ? class60.method492((byte) -78) : null;
        } else {
            return null;
        }
    }
}
