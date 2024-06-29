import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class260 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lp;")
    public static class280 field4600 = class18.method140((byte) -126, "k");

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field4603 = 3353893;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lp;")
    public static class280 field4606 = class18.method140((byte) -118, "Poser");

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[I")
    public static int[] field4604 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lqc;IIIIIIZ)V")
    public static final void method1756(class63 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1025.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field1025[var9] - class51.field841;
            int var23 = arg0.field1035[var9] - class277.field4814;
            int var24 = arg0.field1044[var9] - class108.field1786;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field1028 != null) {
                class63.field1029[var9] = var25;
                class63.field1033[var9] = var28;
                class63.field1037[var9] = var29;
            }
            class63.field1027[var9] = (var25 << 9) / var29 + class146.field2549;
            class63.field1036[var9] = (var28 << 9) / var29 + class146.field2556;
        }
        class146.field2542 = 0;
        int var10 = arg0.field1041.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field1041[var11];
            int var13 = arg0.field1042[var11];
            int var14 = arg0.field1030[var11];
            int var15 = class63.field1027[var12];
            int var16 = class63.field1027[var13];
            int var17 = class63.field1027[var14];
            int var18 = class63.field1036[var12];
            int var19 = class63.field1036[var13];
            int var20 = class63.field1036[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class193.field3397 && class237.method1588(class258.field4574 + class146.field2549, class282.field4959 + class146.field2556, var18, var19, var20, var15, var16, var17)) {
                    class115.field2091 = arg5;
                    class147.field2560 = arg6;
                }
                if (!arg7) {
                    class146.field2551 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class146.field2548 || var16 > class146.field2548 || var17 > class146.field2548) {
                        class146.field2551 = true;
                    }
                    if (arg0.field1028 == null || arg0.field1028[var11] == -1) {
                        if (arg0.field1046[var11] != 12345678) {
                            class146.method1020(var18, var19, var20, var15, var16, var17, arg0.field1046[var11], arg0.field1032[var11], arg0.field1040[var11]);
                        }
                    } else if (!class81.field1332) {
                        int var21 = class146.field2539.method1439(arg0.field1028[var11], -11728);
                        class146.method1020(var18, var19, var20, var15, var16, var17, class9.method86(var21, arg0.field1046[var11]), class9.method86(var21, arg0.field1032[var11]), class9.method86(var21, arg0.field1040[var11]));
                    } else if (arg0.field1045) {
                        class146.method1012(var18, var19, var20, var15, var16, var17, arg0.field1046[var11], arg0.field1032[var11], arg0.field1040[var11], class63.field1029[0], class63.field1029[1], class63.field1029[3], class63.field1033[0], class63.field1033[1], class63.field1033[3], class63.field1037[0], class63.field1037[1], class63.field1037[3], arg0.field1028[var11]);
                    } else {
                        class146.method1012(var18, var19, var20, var15, var16, var17, arg0.field1046[var11], arg0.field1032[var11], arg0.field1040[var11], class63.field1029[var12], class63.field1029[var13], class63.field1029[var14], class63.field1033[var12], class63.field1033[var13], class63.field1033[var14], class63.field1037[var12], class63.field1037[var13], class63.field1037[var14], arg0.field1028[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBII)I")
    public static final int method1757(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 == -33) {
            field4599++;
            int var5 = 65536 - class146.field2541[arg4 * 1024 / arg1] >> 1;
            return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
    public static final boolean method1758(int arg0) throws IOException {
        field4602++;
        if (class44.field727 == null) {
            return false;
        }
        int var1 = class44.field727.method1525(5000);
        if (var1 == 0) {
            return false;
        }
        if (class85.field1394 == -1) {
            class44.field727.method1528(0, 1, (byte) 120, class20.field367.field475);
            var1--;
            class20.field367.field481 = 0;
            class85.field1394 = class20.field367.method553(75);
            class23.field422 = class238.field4127[class85.field1394];
        }
        if (~class23.field422 == arg0) {
            if (var1 <= 0) {
                return false;
            }
            class44.field727.method1528(0, 1, (byte) 87, class20.field367.field475);
            var1--;
            class23.field422 = class20.field367.field475[0] & 0xFF;
        }
        if (class23.field422 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class44.field727.method1528(0, 2, (byte) 82, class20.field367.field475);
            class20.field367.field481 = 0;
            class23.field422 = class20.field367.method193((byte) 77);
        }
        if (class23.field422 > var1) {
            return false;
        }
        class20.field367.field481 = 0;
        class44.field727.method1528(0, class23.field422, (byte) 121, class20.field367.field475);
        class4.field117 = class125.field2193;
        class125.field2193 = class258.field4578;
        class276.field4785 = 0;
        class258.field4578 = class85.field1394;
        if (class85.field1394 == 200) {
            int var2 = class20.field367.method212((byte) -50);
            if (var2 == 65535) {
                var2 = -1;
            }
            class267.method1797(var2, (byte) 116);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 174) {
            int var3 = class20.field367.method216(false);
            int var4 = class20.field367.method222(-126);
            if (var3 == 65535) {
                var3 = -1;
            }
            class65.method447(var3, var4, -19392);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 203) {
            int var5 = class20.field367.method217(true);
            int var6 = class20.field367.method216(false);
            class46.method348(-20703, var5, var6);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 112) {
            int var7 = class20.field367.method211(false);
            class280 var8 = class20.field367.method198(false);
            int var9 = class20.field367.method216(false);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = class20.field367.method220(true);
            if (var7 >= 1 && var7 <= 8) {
                if (var8.method1887((byte) 32, class20.field374)) {
                    var8 = null;
                }
                class176.field3068[var7 - 1] = var8;
                class98.field1589[var7 - 1] = var9;
                class81.field1336[var7 - 1] = var10 == 0;
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 114) {
            int var11 = class20.field367.method216(false);
            int var12 = class20.field367.method206(arg0 - 90);
            if (class97.method677(var11, 127)) {
                int var13 = 0;
                if (class262.field4631.field2481 != null) {
                    var13 = class262.field4631.field2481.method1217((byte) -126);
                }
                class28.method252((byte) -105, var13, var12, 3);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 204) {
            class86.field1406 = class20.field367.method189((byte) -103);
            class259.field4597 = class237.field4118;
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 179) {
            int var14 = class20.field367.method199((byte) -85);
            int var15 = class20.field367.method193((byte) 77);
            if (var14 < -70000) {
                var15 += 32768;
            }
            class113 var16;
            if (var14 >= 0) {
                var16 = class233.method1569(65535, var14);
            } else {
                var16 = null;
            }
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field1889.length; var17++) {
                    var16.field1889[var17] = 0;
                    var16.field1951[var17] = 0;
                }
            }
            class196.method1343(var15, arg0 ^ 0x7F);
            int var18 = class20.field367.method193((byte) 77);
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = class20.field367.method212((byte) -50);
                int var21 = class20.field367.method220(true);
                if (var21 == 255) {
                    var21 = class20.field367.method206(-85);
                }
                if (var16 != null && var19 < var16.field1889.length) {
                    var16.field1889[var19] = var20;
                    var16.field1951[var19] = var21;
                }
                class253.method1697(var15, var21, var19, 55, var20 - 1);
            }
            if (var16 != null) {
                class242.method1642((byte) 63, var16);
            }
            class271.method1815(0);
            class264.field4658[class214.method1432(class65.field1086++, 31)] = class214.method1432(32767, var15);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 42) {
            class182.method1271(class20.field367, class118.field2117, -27090, class23.field422);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 131) {
            int var22 = class20.field367.method193((byte) 77);
            class91.method653(arg0 + 22, var22);
            class264.field4658[class214.method1432(31, class65.field1086++)] = class214.method1432(var22, 32767);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 239) {
            class50.method367(0, class20.field367);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 129) {
            int var23 = class20.field367.method213((byte) 113);
            byte var24 = class20.field367.method202(0);
            class154.method1089(-10, var24, var23);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 30) {
            byte[] var25 = new byte[class23.field422];
            class20.field367.method554(var25, arg0 + 57, class23.field422, 0);
            class280 var26 = class153.method1084(0, var25, 0, class23.field422);
            if (class153.field2656 == null && class198.field3469 == 3 || !class198.field3457.startsWith("win") || class47.field783) {
                class199.method1370(var26, true, -1);
            } else {
                class57.field918 = true;
                class101.field1643 = var26;
                class255.field4509 = class118.field2117.method1360(arg0 + 15815, new String(var26.method1898((byte) -104), "ISO-8859-1"));
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 98) {
            class205.field3563 = class20.field367.method189((byte) -103);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 38) {
            long var27 = class20.field367.method218(true);
            long var29 = (long) class20.field367.method193((byte) 77);
            long var31 = (long) class20.field367.method230(15046);
            long var33 = (var29 << 32) + var31;
            boolean var35 = false;
            int var36 = class20.field367.method189((byte) -103);
            int var37 = class20.field367.method193((byte) 77);
            int var38 = 0;
            label1121: while (true) {
                if (var38 >= 100) {
                    if (var36 <= 1) {
                        for (int var39 = 0; var39 < class273.field4753; var39++) {
                            if (class76.field1248[var39] == var27) {
                                var35 = true;
                                break label1121;
                            }
                        }
                    }
                    break;
                }
                if (class234.field4066[var38] == var33) {
                    var35 = true;
                    break;
                }
                var38++;
            }
            if (!var35 && class101.field1650 == 0) {
                class234.field4066[class222.field3847] = var33;
                class222.field3847 = (class222.field3847 + 1) % 100;
                class280 var40 = class180.method1238((byte) -111, var37).method1045(-51, class20.field367);
                if (var36 == 2) {
                    class92.method655(var37, var40, (class280) null, (byte) 101, class30.method266(new class280[] { class209.field3608, class152.method1071(arg0 + 87, var27).method1881((byte) 124) }, (byte) -87), 18);
                } else if (var36 == 1) {
                    class92.method655(var37, var40, (class280) null, (byte) 85, class30.method266(new class280[] { class162.field2859, class152.method1071(arg0 ^ 0xFFFFFF8E, var27).method1881((byte) 126) }, (byte) -87), 18);
                } else {
                    class92.method655(var37, var40, (class280) null, (byte) 95, class152.method1071(-118, var27).method1881((byte) 127), 18);
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 47) {
            int var41 = class20.field367.method187(2);
            class280 var42 = class20.field367.method198(false);
            int var43 = class20.field367.method193((byte) 77);
            if (class97.method677(var43, arg0 + 127)) {
                class127.method880(-108, var42, var41);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 248) {
            int var44 = class20.field367.method212((byte) -50);
            int var45 = class20.field367.method212((byte) -50);
            int var46 = class20.field367.method216(false);
            int var47 = class20.field367.method208(false);
            if (class97.method677(var44, 127)) {
                class103.method729(var47, (byte) -100, (var46 << 16) + var45);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 220) {
            class22.field404 = class20.field367.method211(false);
            class190.field3331 = class20.field367.method189((byte) -103);
            for (int var48 = class190.field3331; var48 < class190.field3331 + 8; var48++) {
                for (int var50 = class22.field404; var50 < class22.field404 + 8; var50++) {
                    if (class165.field2896[class231.field4013][var48][var50] != null) {
                        class165.field2896[class231.field4013][var48][var50] = null;
                        class147.method1025(var48, var50, true);
                    }
                }
            }
            for (class155 var49 = (class155) class224.field3880.method651(12916); var49 != null; var49 = (class155) class224.field3880.method643(arg0 + 11066)) {
                if (var49.field2702 >= class190.field3331 && var49.field2702 < class190.field3331 + 8 && class22.field404 <= var49.field2706 && var49.field2706 < (class22.field404 + 8) && class231.field4013 == var49.field2716) {
                    var49.field2709 = 0;
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 93) {
            long var51 = class20.field367.method218(true);
            int var53 = class20.field367.method193((byte) 77);
            class280 var54 = class180.method1238((byte) -111, var53).method1045(69, class20.field367);
            class92.method655(var53, var54, (class280) null, (byte) 115, class152.method1071(-128, var51).method1881((byte) 127), 19);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 40) {
            class8.method80(true);
            class271.method1815(0);
            class85.field1394 = -1;
            class41.field706 += 32;
            return true;
        } else if (class85.field1394 == 110) {
            long var55 = class20.field367.method218(true);
            int var57 = class20.field367.method193((byte) 77);
            boolean var58 = true;
            int var59 = class20.field367.method189((byte) -103);
            if (var55 < 0L) {
                var55 &= Long.MAX_VALUE;
                var58 = false;
            }
            class280 var60 = class229.field3959;
            if (var57 > 0) {
                var60 = class20.field367.method198(false);
            }
            class280 var61 = class152.method1071(arg0 ^ 0xFFFFFFAB, var55).method1881((byte) 125);
            for (int var62 = 0; var62 < class208.field3590; var62++) {
                if (class49.field794[var62] == var55) {
                    if (class50.field826[var62] != var57) {
                        class50.field826[var62] = var57;
                        if (var57 > 0) {
                            class188.method1312(-1117075764, 5, class229.field3959, class30.method266(new class280[] { var61, class92.field1494 }, (byte) -87));
                        }
                        if (var57 == 0) {
                            class188.method1312(arg0 ^ 0xBD6AC6CC, 5, class229.field3959, class30.method266(new class280[] { var61, class192.field3393 }, (byte) -87));
                        }
                    }
                    class30.field571[var62] = var60;
                    var61 = null;
                    class200.field3497[var62] = var59;
                    class158.field2757[var62] = var58;
                    break;
                }
            }
            if (var61 != null && class208.field3590 < 200) {
                class49.field794[class208.field3590] = var55;
                class129.field2236[class208.field3590] = var61;
                class50.field826[class208.field3590] = var57;
                class30.field571[class208.field3590] = var60;
                class200.field3497[class208.field3590] = var59;
                class158.field2757[class208.field3590] = var58;
                class208.field3590++;
            }
            class259.field4597 = class237.field4118;
            boolean var63 = false;
            int var64 = class208.field3590;
            while (var64 > 0) {
                var64--;
                boolean var65 = true;
                for (int var66 = 0; var66 < var64; var66++) {
                    if (class50.field826[var66] != class105.field1741 && class50.field826[var66 + 1] == class105.field1741 || class50.field826[var66] == 0 && class50.field826[var66 + 1] != 0) {
                        var65 = false;
                        int var67 = class50.field826[var66];
                        class50.field826[var66] = class50.field826[var66 + 1];
                        class50.field826[var66 + 1] = var67;
                        class280 var68 = class30.field571[var66];
                        class30.field571[var66] = class30.field571[var66 + 1];
                        class30.field571[var66 + 1] = var68;
                        class280 var69 = class129.field2236[var66];
                        class129.field2236[var66] = class129.field2236[var66 + 1];
                        class129.field2236[var66 + 1] = var69;
                        long var70 = class49.field794[var66];
                        class49.field794[var66] = class49.field794[var66 + 1];
                        class49.field794[var66 + 1] = var70;
                        int var72 = class200.field3497[var66];
                        class200.field3497[var66] = class200.field3497[var66 + 1];
                        class200.field3497[var66 + 1] = var72;
                        boolean var73 = class158.field2757[var66];
                        class158.field2757[var66] = class158.field2757[var66 + 1];
                        class158.field2757[var66 + 1] = var73;
                    }
                }
                if (var65) {
                    break;
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 118) {
            int var74 = class20.field367.method187(arg0 + 2);
            int var75 = class20.field367.method213((byte) 113);
            int var76 = class20.field367.method216(false);
            if (class97.method677(var75, arg0 + 127)) {
                class66.method460(var74, -6303, var76);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 193) {
            int var77 = class20.field367.method217(true);
            int var78 = class20.field367.method212((byte) -50);
            int var79 = class20.field367.method212((byte) -50);
            class61 var80 = class46.field756[var79];
            if (var80 != null) {
                class57.method413(var77, var78, false, var80);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 119) {
            for (int var81 = 0; var81 < class17.field314.length; var81++) {
                if (class183.field3225[var81] != class17.field314[var81]) {
                    class17.field314[var81] = class183.field3225[var81];
                    class2.method44(false, var81);
                    class183.field3217[class214.method1432(31, class41.field706++)] = var81;
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 244) {
            long var82 = class20.field367.method218(true);
            class20.field367.method200(32768);
            long var84 = class20.field367.method218(true);
            long var86 = (long) class20.field367.method193((byte) 77);
            long var88 = (long) class20.field367.method230(15046);
            long var90 = (var86 << 32) + var88;
            boolean var92 = false;
            int var93 = class20.field367.method189((byte) -103);
            int var94 = class20.field367.method193((byte) 77);
            int var95 = 0;
            label1185: while (true) {
                if (var95 >= 100) {
                    if (var93 <= 1) {
                        for (int var96 = 0; var96 < class273.field4753; var96++) {
                            if (class76.field1248[var96] == var82) {
                                var92 = true;
                                break label1185;
                            }
                        }
                    }
                    break;
                }
                if (class234.field4066[var95] == var90) {
                    var92 = true;
                    break;
                }
                var95++;
            }
            if (!var92 && class101.field1650 == 0) {
                class234.field4066[class222.field3847] = var90;
                class222.field3847 = (class222.field3847 + 1) % 100;
                class280 var97 = class180.method1238((byte) -111, var94).method1045(-76, class20.field367);
                if (var93 == 2 || var93 == 3) {
                    class92.method655(var94, var97, class152.method1071(99, var84).method1881((byte) 120), (byte) 102, class30.method266(new class280[] { class209.field3608, class152.method1071(arg0 + 99, var82).method1881((byte) 119) }, (byte) -87), 20);
                } else if (var93 == 1) {
                    class92.method655(var94, var97, class152.method1071(-76, var84).method1881((byte) 121), (byte) 102, class30.method266(new class280[] { class162.field2859, class152.method1071(-85, var82).method1881((byte) 122) }, (byte) -87), 20);
                } else {
                    class92.method655(var94, var97, class152.method1071(arg0 ^ 0x44, var84).method1881((byte) 125), (byte) 117, class152.method1071(84, var82).method1881((byte) 127), 20);
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 10) {
            int var98 = class20.field367.method216(false);
            int var99 = class20.field367.method193((byte) 77);
            int var100 = class20.field367.method206(-120);
            if (var99 == 65535) {
                var99 = -1;
            }
            if (class97.method677(var98, arg0 + 127)) {
                class28.method252((byte) -120, var99, var100, 2);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 11) {
            class271.method1811(arg0 - 16235);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 202) {
            int var101 = class20.field367.method208(false);
            class113 var102 = class233.method1569(65535, var101);
            for (int var103 = 0; var103 < var102.field1889.length; var103++) {
                var102.field1889[var103] = -1;
                var102.field1889[var103] = 0;
            }
            class242.method1642((byte) 120, var102);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 170) {
            class190.field3331 = class20.field367.method211(false);
            class22.field404 = class20.field367.method217(true);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 83) {
            class271.method1815(0);
            int var104 = class20.field367.method189((byte) -103);
            int var105 = class20.field367.method208(false);
            int var106 = class20.field367.method189((byte) -103);
            class46.field758[var104] = var105;
            class157.field2733[var104] = var106;
            class259.field4589[var104] = 1;
            for (int var107 = 0; var107 < 98; var107++) {
                if (var105 >= class125.field2185[var107]) {
                    class259.field4589[var104] = var107 + 2;
                }
            }
            class282.field4955[class214.method1432(31, class89.field1437++)] = var104;
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 51) {
            int var108 = class20.field367.method189((byte) -103);
            int var109 = var108 >> 6;
            class249 var110 = new class249();
            var110.field4366 = var108 & 0x3F;
            var110.field4368 = class20.field367.method189((byte) -103);
            if (var110.field4368 >= 0 && class64.field1080.length > var110.field4368) {
                if (var110.field4366 == 1 || var110.field4366 == 10) {
                    var110.field4359 = class20.field367.method193((byte) 77);
                    class20.field367.field481 += 3;
                } else if (var110.field4366 >= 2 && var110.field4366 <= 6) {
                    if (var110.field4366 == 2) {
                        var110.field4369 = 64;
                        var110.field4375 = 64;
                    }
                    if (var110.field4366 == 3) {
                        var110.field4375 = 0;
                        var110.field4369 = 64;
                    }
                    if (var110.field4366 == 4) {
                        var110.field4375 = 128;
                        var110.field4369 = 64;
                    }
                    if (var110.field4366 == 5) {
                        var110.field4375 = 64;
                        var110.field4369 = 0;
                    }
                    if (var110.field4366 == 6) {
                        var110.field4375 = 64;
                        var110.field4369 = 128;
                    }
                    var110.field4366 = 2;
                    var110.field4374 = class20.field367.method193((byte) 77);
                    var110.field4361 = class20.field367.method193((byte) 77);
                    var110.field4354 = class20.field367.method189((byte) -103);
                }
                var110.field4365 = class20.field367.method193((byte) 77);
                if (var110.field4365 == 65535) {
                    var110.field4365 = -1;
                }
                class81.field1335[var109] = var110;
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 31) {
            int var111 = class20.field367.method220(true);
            int var112 = class20.field367.method193((byte) 77);
            int var113 = class20.field367.method216(false);
            if (class97.method677(var112, 127)) {
                class208.method1402(var113, var111, arg0 + 1);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 26) {
            int var114 = class20.field367.method208(false);
            int var115 = class20.field367.method193((byte) 77);
            int var116 = class20.field367.method213((byte) 113);
            int var117 = class20.field367.method213((byte) 113);
            int var118 = class20.field367.method213((byte) 113);
            if (class97.method677(var117, arg0 + 127)) {
                class157.method1118(var114, var116, false, var118, var115);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 48) {
            int var119 = class20.field367.method189((byte) -103);
            if (class20.field367.method189((byte) -103) == 0) {
                class244.field4296[var119] = new class262();
            } else {
                class20.field367.field481--;
                class244.field4296[var119] = new class262(class20.field367);
            }
            class85.field1394 = -1;
            class181.field3159 = class237.field4118;
            return true;
        } else if (class85.field1394 == 187) {
            class190.field3331 = class20.field367.method189((byte) -103);
            class22.field404 = class20.field367.method189((byte) -103);
            while (class20.field367.field481 < class23.field422) {
                class85.field1394 = class20.field367.method189((byte) -103);
                class58.method418(-101);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 235) {
            int var120 = class20.field367.method193((byte) 77);
            int var121 = class20.field367.method212((byte) -50);
            int var122 = class20.field367.method193((byte) 77);
            int var123 = class20.field367.method199((byte) -85);
            if ((var123 >> 30) != 0) {
                int var124 = var123 >> 28 & 0x3;
                int var125 = (var123 & 0x3FFF) - class91.field1480;
                int var126 = ((var123 & 0xFFFF328) >> 14) - class49.field806;
                if (var126 >= 0 && var125 >= 0 && var126 < 104 && var125 < 104) {
                    int var127 = var126 * 128 + 64;
                    int var128 = var125 * 128 + 64;
                    class224 var129 = new class224(var121, var124, var127, var128, class158.method1123(var124, var127, -6230, var128) - var122, var120, class117.field2104);
                    class211.field3636.method649(new class204(var129), (byte) 84);
                }
            } else if ((var123 >> 29) != 0) {
                int var130 = var123 & 0xFFFF;
                class61 var131 = class46.field756[var130];
                if (var131 != null) {
                    if (var121 == 65535) {
                        var121 = -1;
                    }
                    boolean var132 = true;
                    if (var121 != -1 && var131.field4827 != -1 && class207.method1401((byte) -22, class199.method1368(-940, var121).field4210).field1288 < class207.method1401((byte) -22, class199.method1368(-940, var131.field4827).field4210).field1288) {
                        var132 = false;
                    }
                    if (var132) {
                        var131.field4800 = class117.field2104 + var120;
                        var131.field4790 = 0;
                        var131.field4857 = 0;
                        if (class117.field2104 < var131.field4800) {
                            var131.field4857 = -1;
                        }
                        var131.field4827 = var121;
                        var131.field4823 = var122;
                        if (var131.field4827 != -1 && class117.field2104 == var131.field4800) {
                            int var133 = class199.method1368(arg0 ^ 0xFFFFFC54, var131.field4827).field4210;
                            if (var133 != -1) {
                                class78 var134 = class207.method1401((byte) -22, var133);
                                if (var134 != null && var134.field1275 != null) {
                                    class150.method1034(var131.field4793, false, var134, 0, var131.field4791, false);
                                }
                            }
                        }
                    }
                }
            } else if ((var123 >> 28) != 0) {
                int var135 = var123 & 0xFFFF;
                class142 var136;
                if (class11.field240 == var135) {
                    var136 = class262.field4631;
                } else {
                    var136 = class280.field4940[var135];
                }
                if (var136 != null) {
                    if (var121 == 65535) {
                        var121 = -1;
                    }
                    boolean var137 = true;
                    if (var121 != -1 && var136.field4827 != -1 && class207.method1401((byte) -22, class199.method1368(arg0 - 940, var121).field4210).field1288 < class207.method1401((byte) -22, class199.method1368(-940, var136.field4827).field4210).field1288) {
                        var137 = false;
                    }
                    if (var137) {
                        var136.field4800 = class117.field2104 + var120;
                        var136.field4790 = 0;
                        var136.field4823 = var122;
                        var136.field4827 = var121;
                        if (var136.field4827 == 65535) {
                            var136.field4827 = -1;
                        }
                        var136.field4857 = 0;
                        if (var136.field4800 > class117.field2104) {
                            var136.field4857 = -1;
                        }
                        if (var136.field4827 != -1 && class117.field2104 == var136.field4800) {
                            int var138 = class199.method1368(-940, var136.field4827).field4210;
                            if (var138 != -1) {
                                class78 var139 = class207.method1401((byte) -22, var138);
                                if (var139 != null && var139.field1275 != null) {
                                    class150.method1034(var136.field4793, false, var139, 0, var136.field4791, class262.field4631 == var136);
                                }
                            }
                        }
                    }
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 180) {
            int var140 = class20.field367.method213((byte) 113);
            int var141 = class20.field367.method199((byte) -85);
            int var142 = class20.field367.method213((byte) 113);
            if (var142 == 65535) {
                var142 = -1;
            }
            if (class97.method677(var140, 127)) {
                class28.method252((byte) -88, var142, var141, 1);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 124) {
            class14.method116(true, (byte) 60);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 104) {
            int var143 = class20.field367.method216(false);
            int var144 = class20.field367.method216(false);
            class220.field3759 = var143;
            class25.field487 = var144;
            if (class4.field113 == 2) {
                class8.field170 = class220.field3759;
                class220.field3827 = class25.field487;
            }
            class57.method410(303);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 88) {
            class271.method1815(0);
            class20.field373 = class20.field367.method191(arg0 ^ 0xFFFFFF86);
            class85.field1394 = -1;
            class83.field1380 = class237.field4118;
            return true;
        } else if (class85.field1394 == 148) {
            int var145 = class20.field367.method189((byte) -103);
            int var146 = class20.field367.method189((byte) -103);
            int var147 = class20.field367.method189((byte) -103);
            int var148 = class20.field367.method189((byte) -103);
            int var149 = class20.field367.method193((byte) 77);
            class237.field4121[var145] = true;
            class6.field131[var145] = var146;
            class11.field230[var145] = var147;
            class83.field1379[var145] = var148;
            class245.field4307[var145] = var149;
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 86) {
            int var150 = class20.field367.method211(false);
            int var151 = class20.field367.method187(arg0 ^ 0x2);
            int var152 = class20.field367.method213((byte) 113);
            int var153 = class20.field367.method193((byte) 77);
            if (class97.method677(var152, 127)) {
                class144 var154 = (class144) class261.field4614.method150((long) var151, -72);
                if (var154 != null) {
                    class16.method127((byte) -111, var154, var154.field2517 != var153);
                }
                class30.method262(var153, var150, var151, -2);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 149) {
            class271.method1815(0);
            class211.field3620 = class20.field367.method189((byte) -103);
            class83.field1380 = class237.field4118;
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 20) {
            int var155 = class20.field367.method193((byte) 77);
            if (var155 == 65535) {
                var155 = -1;
            }
            int var156 = class20.field367.method189((byte) -103);
            int var157 = class20.field367.method193((byte) 77);
            class2.method45(var157, true, var155, var156);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 76) {
            long var158 = class20.field367.method218(true);
            class20.field367.method200(arg0 + 32768);
            boolean var160 = false;
            long var161 = class20.field367.method218(true);
            long var163 = (long) class20.field367.method193((byte) 77);
            long var165 = (long) class20.field367.method230(15046);
            int var167 = class20.field367.method189((byte) -103);
            long var168 = (var163 << 32) + var165;
            int var170 = 0;
            label1239: while (true) {
                if (var170 >= 100) {
                    if (var167 <= 1) {
                        if ((!class280.field4950 || class44.field739) && !class159.field2773) {
                            for (int var171 = 0; var171 < class273.field4753; var171++) {
                                if (class76.field1248[var171] == var158) {
                                    var160 = true;
                                    break label1239;
                                }
                            }
                        } else {
                            var160 = true;
                        }
                    }
                    break;
                }
                if (class234.field4066[var170] == var168) {
                    var160 = true;
                    break;
                }
                var170++;
            }
            if (!var160 && class101.field1650 == 0) {
                class234.field4066[class222.field3847] = var168;
                class222.field3847 = (class222.field3847 + 1) % 100;
                class280 var172 = class72.method538(class163.method1153(class20.field367, false).method1861((byte) 92));
                if (var167 == 2 || var167 == 3) {
                    class249.method1681(9, arg0 + 33, class152.method1071(arg0 ^ 0xFFFFFF97, var161).method1881((byte) 124), var172, class30.method266(new class280[] { class209.field3608, class152.method1071(arg0 ^ 0xFFFFFFBD, var158).method1881((byte) 126) }, (byte) -87));
                } else if (var167 == 1) {
                    class249.method1681(9, 33, class152.method1071(arg0 ^ 0xFFFFFFA3, var161).method1881((byte) 124), var172, class30.method266(new class280[] { class162.field2859, class152.method1071(104, var158).method1881((byte) 124) }, (byte) -87));
                } else {
                    class249.method1681(9, 33, class152.method1071(-126, var161).method1881((byte) 121), var172, class152.method1071(64, var158).method1881((byte) 120));
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 230) {
            int var173 = class20.field367.method192((byte) -31);
            int var174 = class20.field367.method213((byte) 113);
            int var175 = class20.field367.method197(arg0 - 114);
            int var176 = class20.field367.method187(arg0 ^ 0x2);
            if (class97.method677(var174, 127)) {
                class134.method925(var176, arg0 - 51, var175, var173);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 78) {
            int var177 = class20.field367.method193((byte) 77);
            class280 var178 = class20.field367.method198(false);
            Object[] var179 = new Object[var178.method1889(arg0 - 1) + 1];
            for (int var180 = var178.method1889(~arg0) - 1; var180 >= 0; var180--) {
                if (var178.method1899(var180, (byte) -28) == 115) {
                    var179[var180 + 1] = class20.field367.method198(false);
                } else {
                    var179[var180 + 1] = Integer.valueOf(class20.field367.method199((byte) -85));
                }
            }
            var179[0] = Integer.valueOf(class20.field367.method199((byte) -85));
            if (class97.method677(var177, 127)) {
                class178 var181 = new class178();
                var181.field3107 = var179;
                class199.method1371(200000, var181);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 176) {
            int var182 = class20.field367.method189((byte) -103);
            int var183 = class20.field367.method189((byte) -103);
            int var184 = class20.field367.method193((byte) 77);
            int var185 = class20.field367.method189((byte) -103);
            int var186 = class20.field367.method189((byte) -103);
            class108.method752((byte) 86, var184, true, var183, var186, var185, var182);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 157) {
            long var187 = class20.field367.method218(true);
            long var189 = (long) class20.field367.method193((byte) 77);
            long var191 = (long) class20.field367.method230(15046);
            int var193 = class20.field367.method189((byte) -103);
            long var194 = (var189 << 32) + var191;
            boolean var196 = false;
            int var197 = 0;
            label1269: while (true) {
                if (var197 >= 100) {
                    if (var193 <= 1) {
                        if ((!class280.field4950 || class44.field739) && !class159.field2773) {
                            for (int var198 = 0; var198 < class273.field4753; var198++) {
                                if (class76.field1248[var198] == var187) {
                                    var196 = true;
                                    break label1269;
                                }
                            }
                        } else {
                            var196 = true;
                        }
                    }
                    break;
                }
                if (class234.field4066[var197] == var194) {
                    var196 = true;
                    break;
                }
                var197++;
            }
            if (!var196 && class101.field1650 == 0) {
                class234.field4066[class222.field3847] = var194;
                class222.field3847 = (class222.field3847 + 1) % 100;
                class280 var199 = class72.method538(class163.method1153(class20.field367, false).method1861((byte) -116));
                if (var193 == 2 || var193 == 3) {
                    class188.method1312(-1117075764, 7, class30.method266(new class280[] { class209.field3608, class152.method1071(89, var187).method1881((byte) 119) }, (byte) -87), var199);
                } else if (var193 == 1) {
                    class188.method1312(-1117075764, 7, class30.method266(new class280[] { class162.field2859, class152.method1071(arg0 ^ 0xFFFFFF8C, var187).method1881((byte) 123) }, (byte) -87), var199);
                } else {
                    class188.method1312(-1117075764, 3, class152.method1071(arg0 ^ 0x4C, var187).method1881((byte) 126), var199);
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 245) {
            if (class23.field422 == 0) {
                class18.field337 = class167.field2933;
            } else {
                class18.field337 = class20.field367.method198(false);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 128) {
            int var200 = class20.field367.method193((byte) 77);
            int var201 = class20.field367.method199((byte) -85);
            int var202 = class20.field367.method213((byte) 113);
            int var203 = class20.field367.method212((byte) -50);
            if (class97.method677(var200, 127)) {
                class28.method252((byte) -125, var203 | var202 << 16, var201, 7);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 195) {
            class175.method1203(arg0 + 2, class20.field367.method198(false));
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 27) {
            int var204 = class20.field367.method216(false);
            int var205 = class20.field367.method206(arg0 ^ 0xFFFFFF8B);
            class154.method1089(-10, var205, var204);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 7) {
            class235.method1581((byte) 112);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 94) {
            class14.method116(false, (byte) 42);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 77) {
            long var206 = class20.field367.method218(true);
            class280 var208 = class72.method538(class163.method1153(class20.field367, false).method1861((byte) -123));
            class188.method1312(-1117075764, 6, class152.method1071(arg0 + 125, var206).method1881((byte) 123), var208);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 52) {
            class209.field3599 = 0;
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 90) {
            int var209 = class20.field367.method213((byte) 113);
            class280 var210 = class20.field367.method198(false);
            int var211 = class20.field367.method213((byte) 113);
            if (class97.method677(var211, 127)) {
                class157.method1120(true, var210, var209);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 243 || class85.field1394 == 183 || class85.field1394 == 75 || class85.field1394 == 55 || class85.field1394 == 33 || class85.field1394 == 159 || class85.field1394 == 151 || class85.field1394 == 74 || class85.field1394 == 196 || class85.field1394 == 15 || class85.field1394 == 246 || class85.field1394 == 140) {
            class58.method418(arg0 - 99);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 216) {
            class40.method313((byte) 71);
            class85.field1394 = -1;
            return false;
        } else if (class85.field1394 == 142) {
            int var212 = class20.field367.method187(2);
            int var213 = class20.field367.method216(false);
            int var214 = class20.field367.method199((byte) -85);
            if (class97.method677(var213, 127)) {
                class144 var215 = (class144) class261.field4614.method150((long) var214, -78);
                class144 var216 = (class144) class261.field4614.method150((long) var212, arg0 + 106);
                if (var216 != null) {
                    class16.method127((byte) -118, var216, var215 == null || var215.field2517 != var216.field2517);
                }
                if (var215 != null) {
                    var215.method1146(26159);
                    class261.field4614.method148(arg0 - 1, var215, (long) var212);
                }
                class113 var217 = class233.method1569(arg0 + 65535, var214);
                if (var217 != null) {
                    class242.method1642((byte) 104, var217);
                }
                class113 var218 = class233.method1569(65535, var212);
                if (var218 != null) {
                    class242.method1642((byte) 102, var218);
                    class231.method1559(true, var218, true);
                }
                if (class246.field4315 != -1) {
                    class18.method138(class246.field4315, (byte) -125, 1);
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 8) {
            int var219 = class20.field367.method216(false);
            int var220 = class20.field367.method206(arg0 ^ 0xFFFFFFB2);
            class46.method348(-20703, var220, var219);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 242) {
            class2.field82 = class237.field4118;
            long var221 = class20.field367.method218(true);
            if (var221 == 0L) {
                class215.field3716 = 0;
                class85.field1394 = -1;
                class169.field2956 = null;
                class59.field950 = null;
                class231.field4030 = null;
                return true;
            }
            long var223 = class20.field367.method218(true);
            class231.field4030 = class152.method1071(123, var223);
            class169.field2956 = class152.method1071(-69, var221);
            class204.field3541 = class20.field367.method200(arg0 ^ 0x8000);
            int var225 = class20.field367.method189((byte) -103);
            if (var225 == 255) {
                class85.field1394 = -1;
                return true;
            }
            class215.field3716 = var225;
            class51[] var226 = new class51[100];
            for (int var227 = 0; var227 < class215.field3716; var227++) {
                var226[var227] = new class51();
                var226[var227].field2827 = class20.field367.method218(true);
                var226[var227].field846 = class152.method1071(-107, var226[var227].field2827);
                var226[var227].field838 = class20.field367.method193((byte) 77);
                var226[var227].field847 = class20.field367.method200(32768);
                var226[var227].field842 = class20.field367.method198(false);
                if (class130.field2300 == var226[var227].field2827) {
                    class112.field1838 = var226[var227].field847;
                }
            }
            boolean var228 = false;
            int var229 = class215.field3716;
            while (var229 > 0) {
                var229--;
                boolean var230 = true;
                for (int var231 = 0; var231 < var229; var231++) {
                    if (var226[var231].field846.method1886(var226[var231 + 1].field846, 75) > 0) {
                        class51 var232 = var226[var231];
                        var226[var231] = var226[var231 + 1];
                        var230 = false;
                        var226[var231 + 1] = var232;
                    }
                }
                if (var230) {
                    break;
                }
            }
            class59.field950 = var226;
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 21) {
            int var233 = class20.field367.method213((byte) 113);
            int var234 = class20.field367.method206(-90);
            int var235 = class20.field367.method216(false);
            if (class97.method677(var235, 127)) {
                class181.method1263((byte) 73, var234, var233);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 255) {
            class230.field3974 = class20.field367.method216(false) * 30;
            class85.field1394 = -1;
            class83.field1380 = class237.field4118;
            return true;
        } else if (class85.field1394 == 109) {
            class273.field4753 = class23.field422 / 8;
            for (int var236 = 0; var236 < class273.field4753; var236++) {
                class76.field1248[var236] = class20.field367.method218(true);
                class11.field237[var236] = class152.method1071(-106, class76.field1248[var236]);
            }
            class85.field1394 = -1;
            class259.field4597 = class237.field4118;
            return true;
        } else if (class85.field1394 == 4) {
            class161.field2823 = class20.field367.method189((byte) -103);
            class31.field574 = class20.field367.method189((byte) -103);
            class164.field2886 = class20.field367.method189((byte) -103);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 146) {
            int var237 = class20.field367.method189((byte) -103);
            int var238 = class20.field367.method213((byte) 113);
            int var239 = class20.field367.method193((byte) 77);
            if (class97.method677(var239, 127)) {
                if (var237 == 2) {
                    class168.method1171((byte) 90);
                }
                class246.field4315 = var238;
                class53.method388((byte) -127, var238);
                class44.method338(false, (byte) 102);
                class204.method1392((byte) -7, class246.field4315);
                for (int var240 = 0; var240 < 100; var240++) {
                    class207.field3583[var240] = true;
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 231) {
            class280 var241 = class20.field367.method198(false);
            if (var241.method1900((byte) -78, class89.field1444)) {
                boolean var242 = false;
                class280 var243 = var241.method1864(var241.method1866(class118.field2113, (byte) -126), 0, (byte) -15);
                long var244 = var243.method1896(arg0 ^ 0x61);
                for (int var246 = 0; var246 < class273.field4753; var246++) {
                    if (class76.field1248[var246] == var244) {
                        var242 = true;
                        break;
                    }
                }
                if (!var242 && class101.field1650 == 0) {
                    class188.method1312(-1117075764, 4, var243, class253.field4437);
                }
            } else if (var241.method1900((byte) -78, class53.field867)) {
                class280 var247 = var241.method1864(var241.method1866(class118.field2113, (byte) -99), 0, (byte) -74);
                long var248 = var247.method1896(115);
                boolean var250 = false;
                for (int var251 = 0; var251 < class273.field4753; var251++) {
                    if (class76.field1248[var251] == var248) {
                        var250 = true;
                        break;
                    }
                }
                if (!var250 && class101.field1650 == 0) {
                    class280 var252 = var241.method1864(var241.method1889(arg0 - 1) - 9, var241.method1866(class118.field2113, (byte) -73) + 1, (byte) -118);
                    class188.method1312(-1117075764, 8, var247, var252);
                }
            } else if (var241.method1900((byte) -78, class47.field784)) {
                class280 var277 = var241.method1864(var241.method1866(class118.field2113, (byte) -81), 0, (byte) -114);
                boolean var278 = false;
                long var279 = var277.method1896(82);
                for (int var281 = 0; var281 < class273.field4753; var281++) {
                    if (class76.field1248[var281] == var279) {
                        var278 = true;
                        break;
                    }
                }
                if (!var278 && class101.field1650 == 0) {
                    class188.method1312(-1117075764, 10, var277, class229.field3959);
                }
            } else if (var241.method1900((byte) -78, class158.field2768)) {
                class280 var253 = var241.method1864(var241.method1866(class158.field2768, (byte) -115), 0, (byte) -126);
                class188.method1312(-1117075764, 11, class229.field3959, var253);
            } else if (var241.method1900((byte) -78, class12.field255)) {
                class280 var254 = var241.method1864(var241.method1866(class12.field255, (byte) -91), 0, (byte) -36);
                if (class101.field1650 == 0) {
                    class188.method1312(arg0 - 1117075764, 12, class229.field3959, var254);
                }
            } else if (var241.method1900((byte) -78, class81.field1334)) {
                class280 var276 = var241.method1864(var241.method1866(class81.field1334, (byte) -125), 0, (byte) -16);
                if (class101.field1650 == 0) {
                    class188.method1312(-1117075764, 13, class229.field3959, var276);
                }
            } else if (var241.method1900((byte) -78, class236.field4112)) {
                class280 var271 = var241.method1864(var241.method1866(class118.field2113, (byte) -94), 0, (byte) -64);
                long var272 = var271.method1896(117);
                boolean var274 = false;
                for (int var275 = 0; var275 < class273.field4753; var275++) {
                    if (class76.field1248[var275] == var272) {
                        var274 = true;
                        break;
                    }
                }
                if (!var274 && class101.field1650 == 0) {
                    class188.method1312(-1117075764, 14, var271, class229.field3959);
                }
            } else if (var241.method1900((byte) -78, class136.field2393)) {
                class280 var266 = var241.method1864(var241.method1866(class118.field2113, (byte) -74), 0, (byte) -64);
                long var267 = var266.method1896(101);
                boolean var269 = false;
                for (int var270 = 0; var270 < class273.field4753; var270++) {
                    if (class76.field1248[var270] == var267) {
                        var269 = true;
                        break;
                    }
                }
                if (!var269 && class101.field1650 == 0) {
                    class188.method1312(-1117075764, 15, var266, class229.field3959);
                }
            } else if (var241.method1900((byte) -78, class246.field4329)) {
                class280 var255 = var241.method1864(var241.method1866(class118.field2113, (byte) -94), 0, (byte) -74);
                long var256 = var255.method1896(87);
                boolean var258 = false;
                for (int var259 = 0; var259 < class273.field4753; var259++) {
                    if (class76.field1248[var259] == var256) {
                        var258 = true;
                        break;
                    }
                }
                if (!var258 && class101.field1650 == 0) {
                    class188.method1312(arg0 - 1117075764, 16, var255, class229.field3959);
                }
            } else if (var241.method1900((byte) -78, class107.field1773)) {
                class280 var260 = var241.method1864(var241.method1866(class118.field2113, (byte) -84), 0, (byte) -35);
                long var261 = var260.method1896(83);
                boolean var263 = false;
                for (int var264 = 0; var264 < class273.field4753; var264++) {
                    if (class76.field1248[var264] == var261) {
                        var263 = true;
                        break;
                    }
                }
                if (!var263 && class101.field1650 == 0) {
                    class280 var265 = var241.method1864(var241.method1889(-1) - 9, var241.method1866(class118.field2113, (byte) -103) - -1, (byte) -127);
                    class188.method1312(-1117075764, 21, var260, var265);
                }
            } else {
                class188.method1312(-1117075764, 0, class229.field3959, var241);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 63) {
            int var282 = class20.field367.method216(false);
            int var283 = class20.field367.method187(arg0 ^ 0x2);
            int var284 = class20.field367.method211(false);
            if (class97.method677(var282, 127)) {
                class64.method443(var283, var284, arg0 + 7);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 168) {
            int var285 = class20.field367.method193((byte) 77);
            int var286 = class20.field367.method193((byte) 77);
            int var287 = class20.field367.method199((byte) -85);
            int var288 = class20.field367.method206(-122);
            if (var285 == 65535) {
                var285 = -1;
            }
            if (class97.method677(var286, 127)) {
                class113 var289 = class233.method1569(65535, var287);
                if (var289.field2008) {
                    class203.method1386(-21585, var287, var285, var288);
                    class220 var291 = class23.method177((byte) -73, var285);
                    class157.method1118(var287, var291.field3816, false, var291.field3807, var291.field3762);
                    class51.method377(var291.field3777, var291.field3810, var287, arg0 ^ 0xFFFFFF83, var291.field3785);
                } else if (var285 == -1) {
                    class85.field1394 = -1;
                    var289.field1923 = 0;
                    return true;
                } else {
                    class220 var290 = class23.method177((byte) -123, var285);
                    var289.field1923 = 4;
                    var289.field1918 = var290.field3762;
                    var289.field1970 = var285;
                    var289.field1947 = var290.field3807 * 100 / var288;
                    var289.field1885 = var290.field3816;
                    class242.method1642((byte) 123, var289);
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 232) {
            int var292 = class20.field367.method193((byte) 77);
            int var293 = class20.field367.method199((byte) -85);
            int var294 = class20.field367.method191(-119);
            if (class97.method677(var292, 127)) {
                class255.method1719(var294, var293, 90);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 219) {
            long var295 = class20.field367.method218(true);
            int var297 = class20.field367.method193((byte) 77);
            byte var298 = class20.field367.method200(arg0 + 32768);
            boolean var299 = false;
            if ((Long.MIN_VALUE & var295) != 0L) {
                var299 = true;
            }
            if (var299) {
                if (class215.field3716 == 0) {
                    class85.field1394 = -1;
                    return true;
                }
                boolean var305 = false;
                long var306 = var295 & Long.MAX_VALUE;
                int var308;
                for (var308 = 0; var308 < class215.field3716 && (class59.field950[var308].field2827 != var306 || class59.field950[var308].field838 != var297); var308++) {
                }
                if (var308 < class215.field3716) {
                    while (class215.field3716 - 1 > var308) {
                        class59.field950[var308] = class59.field950[var308 + 1];
                        var308++;
                    }
                    class215.field3716--;
                    class59.field950[class215.field3716] = null;
                }
            } else {
                class280 var300 = class20.field367.method198(false);
                class51 var301 = new class51();
                var301.field2827 = var295;
                var301.field846 = class152.method1071(arg0 ^ 0xFFFFFFAA, var301.field2827);
                var301.field847 = var298;
                var301.field842 = var300;
                var301.field838 = var297;
                int var302;
                for (var302 = class215.field3716 - 1; var302 >= 0; var302--) {
                    int var303 = class59.field950[var302].field846.method1886(var301.field846, 87);
                    if (var303 == 0) {
                        class59.field950[var302].field838 = var297;
                        class59.field950[var302].field847 = var298;
                        class59.field950[var302].field842 = var300;
                        if (class130.field2300 == var295) {
                            class112.field1838 = var298;
                        }
                        class85.field1394 = -1;
                        class2.field82 = class237.field4118;
                        return true;
                    }
                    if (var303 < 0) {
                        break;
                    }
                }
                if (class59.field950.length <= class215.field3716) {
                    class85.field1394 = -1;
                    return true;
                }
                for (int var304 = class215.field3716 - 1; var304 > var302; var304--) {
                    class59.field950[var304 + 1] = class59.field950[var304];
                }
                if (class215.field3716 == 0) {
                    class59.field950 = new class51[100];
                }
                class59.field950[var302 + 1] = var301;
                if (class130.field2300 == var295) {
                    class112.field1838 = var298;
                }
                class215.field3716++;
            }
            class2.field82 = class237.field4118;
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 92) {
            int var309 = class20.field367.method199((byte) -85);
            int var310 = class20.field367.method193((byte) 77);
            class113 var311;
            if (var309 >= 0) {
                var311 = class233.method1569(65535, var309);
            } else {
                var311 = null;
            }
            if (var309 < -70000) {
                var310 += 32768;
            }
            while (class23.field422 > class20.field367.field481) {
                int var312 = class20.field367.method210(65536);
                int var313 = 0;
                int var314 = class20.field367.method193((byte) 77);
                if (var314 != 0) {
                    var313 = class20.field367.method189((byte) -103);
                    if (var313 == 255) {
                        var313 = class20.field367.method199((byte) -85);
                    }
                }
                if (var311 != null && var312 >= 0 && var311.field1889.length > var312) {
                    var311.field1889[var312] = var314;
                    var311.field1951[var312] = var313;
                }
                class253.method1697(var310, var313, var312, 100, var314 - 1);
            }
            if (var311 != null) {
                class242.method1642((byte) 32, var311);
            }
            class271.method1815(0);
            class264.field4658[class214.method1432(class65.field1086++, 31)] = class214.method1432(var310, 32767);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 137) {
            int var315 = class20.field367.method193((byte) 77);
            int var316 = class20.field367.method199((byte) -85);
            if (class97.method677(var315, 127)) {
                class144 var317 = (class144) class261.field4614.method150((long) var316, 101);
                if (var317 != null) {
                    class16.method127((byte) -119, var317, true);
                }
                if (class180.field3157 != null) {
                    class242.method1642((byte) 100, class180.field3157);
                    class180.field3157 = null;
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 214) {
            int var318 = class20.field367.method193((byte) 77);
            int var319 = class20.field367.method187(2);
            if (var318 == 65535) {
                var318 = -1;
            }
            int var320 = class20.field367.method216(false);
            int var321 = class20.field367.method208(false);
            int var322 = class20.field367.method216(false);
            if (var322 == 65535) {
                var322 = -1;
            }
            if (class97.method677(var320, 127)) {
                for (int var323 = var322; var323 <= var318; var323++) {
                    long var324 = ((long) var321 << 32) + (long) var323;
                    class161 var326 = class167.field2924.method150(var324, -80);
                    if (var326 != null) {
                        var326.method1146(26159);
                    }
                    class167.field2924.method148(-1, new class190(var319), var324);
                }
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 222) {
            if (class246.field4315 != -1) {
                class18.method138(class246.field4315, (byte) -125, 0);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 69) {
            class33.method281(20555);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 184) {
            int var327 = class20.field367.method189((byte) -103);
            int var328 = class20.field367.method189((byte) -103);
            int var329 = class20.field367.method193((byte) 77);
            int var330 = class20.field367.method189((byte) -103);
            int var331 = class20.field367.method189((byte) -103);
            class203.method1388(var327, var331, (byte) -47, var328, var329, var330);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 199) {
            int var332 = class20.field367.method199((byte) -85);
            class101.field1648 = class118.field2117.method1350(var332, -89);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 194) {
            int var333 = class20.field367.method213((byte) 113);
            int var334 = class20.field367.method213((byte) 113);
            class280 var335 = class20.field367.method198(false);
            if (class97.method677(var334, arg0 + 127)) {
                class157.method1120(true, var335, var333);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 134) {
            int var336 = class20.field367.method220(true);
            int var337 = class20.field367.method211(false);
            int var338 = class20.field367.method217(true);
            class231.field4013 = var338 >> 1;
            class262.field4631.method983(var336, -121, (var338 & 0x1) == 1, var337);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 116) {
            int var339 = class20.field367.method193((byte) 77);
            int var340 = class20.field367.method212((byte) -50);
            int var341 = class20.field367.method199((byte) -85);
            if (class97.method677(var340, arg0 + 127)) {
                class208.method1402(var339, var341, 1);
            }
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 247) {
            int var342 = class20.field367.method212((byte) -50);
            int var343 = class20.field367.method208(false);
            int var344 = var343 >> 28 & 0x3;
            int var345 = (var343 & 0xFFFDC28) >> 14;
            int var346 = var343 & 0x3FFF;
            if (var342 == 65535) {
                var342 = -1;
            }
            int var347 = class20.field367.method217(true);
            int var348 = var345 - class49.field806;
            int var349 = var347 & 0x3;
            int var350 = var346 - class91.field1480;
            int var351 = var347 >> 2;
            int var352 = class161.field2817[var351];
            class21.method166(var348, var351, var352, var350, var344, (byte) -74, var349, var342);
            class85.field1394 = -1;
            return true;
        } else if (class85.field1394 == 153) {
            for (int var353 = 0; var353 < class280.field4940.length; var353++) {
                if (class280.field4940[var353] != null) {
                    class280.field4940[var353].field4853 = -1;
                }
            }
            for (int var354 = 0; var354 < class46.field756.length; var354++) {
                if (class46.field756[var354] != null) {
                    class46.field756[var354].field4853 = -1;
                }
            }
            class85.field1394 = -1;
            return true;
        } else {
            class207.method1398("T1 - " + class85.field1394 + "," + class125.field2193 + "," + class4.field117 + " - " + class23.field422, -43, (Throwable) null);
            class40.method313((byte) 71);
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 > -117) {
            method1760(true);
        }
        field4607++;
        if (arg2 == arg7 && arg0 == arg1 && arg6 == arg9 && arg3 == arg8) {
            class83.method605(arg7, (byte) -115, arg5, arg9, arg3, arg1);
            return;
        }
        int var10 = arg1;
        int var11 = arg7;
        int var12 = arg7 * 3;
        int var13 = arg1 * 3;
        int var14 = arg6 * 3;
        int var15 = arg0 * 3;
        int var16 = arg8 * 3;
        int var17 = arg3 + var15 - arg1 - var16;
        int var18 = arg2 * 3;
        int var19 = var14 + var12 - var18 - var18;
        int var20 = arg9 + var18 - arg7 - var14;
        int var21 = var18 - var12;
        int var22 = var13 + var16 - var15 - var15;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var19 * var25;
            int var27 = var24 * var25 >> 12;
            int var28 = var22 * var25;
            int var29 = var21 * var24;
            int var30 = var17 * var27;
            int var31 = var23 * var24;
            int var32 = var20 * var27;
            int var33 = (var29 + var32 + var26 >> 12) + arg7;
            int var34 = (var28 + var30 + var31 >> 12) + arg1;
            class83.method605(var11, (byte) -113, arg5, var33, var34, var10);
            var11 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public static void method1760(boolean arg0) {
        field4600 = null;
        field4604 = null;
        field4606 = null;
        if (arg0) {
            field4604 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ltg;ZLtg;)V")
    public static final void method1761(class180 arg0, boolean arg1, class180 arg2) {
        class252.field4415 = arg2;
        if (arg1) {
            field4605++;
            class100.field1625 = arg0;
            class17.field323 = class100.field1625.method1259(3, 98);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1762(boolean arg0, int arg1) {
        if (arg0) {
            field4601++;
            return (arg1 & -arg1) == arg1;
        } else {
            return true;
        }
    }
}
