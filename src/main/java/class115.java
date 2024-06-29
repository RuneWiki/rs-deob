import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class115 extends class65 {

    @OriginalMember(owner = "client!ua", name = "Fc", descriptor = "I")
    public static int field2489 = 0;

    @OriginalMember(owner = "client!ua", name = "Lc", descriptor = "I")
    public static int field2495 = 0;

    @OriginalMember(owner = "client!ua", name = "Tc", descriptor = "Z")
    public static boolean field2503 = false;

    @OriginalMember(owner = "client!ua", name = "Nc", descriptor = "[I")
    public static int[] field2497 = new int[50];

    @OriginalMember(owner = "client!ua", name = "Uc", descriptor = "Lo;")
    public static class84 field2504 = class15.method124("titlebutton", 255);

    @OriginalMember(owner = "client!ua", name = "Hc", descriptor = "Lod;")
    public static class88 field2491 = new class88();

    @OriginalMember(owner = "client!ua", name = "Yc", descriptor = "Lo;")
    public static class84 field2508 = class15.method124("mapfunction", 255);

    @OriginalMember(owner = "client!ua", name = "Xc", descriptor = "Lo;")
    private static class84 field2507 = class15.method124("as it was used to break our rules", 255);

    @OriginalMember(owner = "client!ua", name = "Zc", descriptor = "I")
    public static int field2509 = -1;

    @OriginalMember(owner = "client!ua", name = "bd", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!ua", name = "Gc", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ua", name = "Ic", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ua", name = "Jc", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ua", name = "Kc", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ua", name = "Oc", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ua", name = "Pc", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ua", name = "Qc", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ua", name = "Sc", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ua", name = "Vc", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ua", name = "Wc", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ua", name = "ad", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ua", name = "Mc", descriptor = "Lvb;")
    public static class121 field2496;

    @OriginalMember(owner = "client!ua", name = "Rc", descriptor = "Lgb;")
    public class39 field2501;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)Lne;", line = 8)
    public final class83 method471(byte arg0) {
        ++field2506;
        if (this.field2501 == null) {
            return null;
        } else {
            if (arg0 != 3) {
                field2510 = 92;
            }
            class31 var2 = ~super.field1423 != 0 && super.field1429 == 0 ? class74.method554(super.field1423, 4867) : null;
            class31 var3 = super.field1434 == -1 || ~super.field1434 == ~super.field1399 && var2 != null ? null : class74.method554(super.field1434, 4867);
            class83 var4 = this.field2501.method341(var2, var3, 0, super.field1432, super.field1409);
            if (var4 == null) {
                return null;
            } else {
                var4.method605();
                super.field1426 = var4.field1207;
                if (super.field1417 != -1 && ~super.field1401 != 0) {
                    class83 var5 = class6.method36((byte) 30, super.field1417).method264((byte) -39, super.field1401);
                    if (var5 != null) {
                        var5.method607(0, -super.field1398, 0);
                        class83[] var6 = new class83[] { var4, var5 };
                        var4 = new class83(var6, 2, true);
                    }
                }
                if (this.field2501.field754 == 1) {
                    var4.field1826 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V", line = 52)
    public static final void method883(byte arg0, int arg1) {
        ++field2500;
        if (arg1 >= 0) {
            int var2 = class63.field1306[arg1];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            int var3 = class107.field2286[arg1];
            int var4 = class41.field835[arg1];
            int var5 = class42.field864[arg1];
            if (class120.field2654 != 0 && ~var2 != -1004) {
                class120.field2654 = 0;
                class85.field1927 = true;
            }
            if (~var2 == -1007) {
                class115 var6 = class3.field30[var3];
                if (var6 != null) {
                    class39 var7 = var6.field2501;
                    if (var7.field763 != null) {
                        var7 = var7.method347((byte) 122);
                    }
                    if (var7 != null) {
                        class84 var8;
                        if (var7.field781 != null) {
                            var8 = var7.field781;
                        } else {
                            var8 = class97.method746(0, new class84[] { class49.field1040, var7.field787, class48.field1010 });
                        }
                        class67.method514(0, class73.field1524, var8, true);
                    }
                }
            }
            if (~var2 == -9) {
                class115 var9 = class3.field30[var3];
                if (var9 != null) {
                    class101.method761(var9.field1436[0], (byte) 115, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var9.field1374[0]);
                    class54.field1128 = 2;
                    class122.field2717 = class109.field2367;
                    ++field2499;
                    class74.field1553 = class128.field2820;
                    class120.field2674 = 0;
                    class97.field2070.method979(1, 110);
                    class97.field2070.method234(var3, -3420);
                }
            }
            if (var2 == 1005) {
                int var10 = 32767 & var3 >> 14;
                class49 var11 = class110.method856((byte) -111, var10);
                class84 var12;
                if (var11.field1025 == null) {
                    var12 = class97.method746(0, new class84[] { class49.field1040, var11.field1019, class48.field1010 });
                } else {
                    var12 = var11.field1025;
                }
                class67.method514(0, class73.field1524, var12, true);
            }
            if (~var2 == -12) {
                ++class75.field1592;
                boolean var13 = class101.method761(var5, (byte) 102, 0, class107.field2271.field1374[0], 0, 0, 2, false, 0, class107.field2271.field1436[0], 0, var4);
                if (!var13) {
                    class101.method761(var5, (byte) 98, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var4);
                }
                class120.field2674 = 0;
                class54.field1128 = 2;
                class122.field2717 = class109.field2367;
                class74.field1553 = class128.field2820;
                class97.field2070.method979(1, 211);
                class97.field2070.method234(class36.field712, -3420);
                class97.field2070.method243(class118.field2584, -1);
                class97.field2070.method243(class106.field2242 + var4, -1);
                class97.field2070.method217(class36.field714 + var5, 769666216);
                class97.field2070.method220(12470, class126.field2791);
                class97.field2070.method217(var3, 769666216);
            }
            if (var2 == 56) {
                class115 var15 = class3.field30[var3];
                if (var15 != null) {
                    class101.method761(var15.field1436[0], (byte) 121, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var15.field1374[0]);
                    class74.field1553 = class128.field2820;
                    class120.field2674 = 0;
                    class122.field2717 = class109.field2367;
                    class54.field1128 = 2;
                    ++class60.field1237;
                    class97.field2070.method979(1, 212);
                    class97.field2070.method234(var3, -3420);
                }
            }
            if (var2 == 55) {
                class97.field2070.method979(1, 79);
                class97.field2070.method245(-77, var5);
                class97.field2070.method230(43, var3);
                class97.field2070.method217(var4, 769666216);
                ++class104.field2187;
                class26.field444 = 2;
                class61.field1265 = var5;
                class100.field2127 = var4;
                if (var5 >> 16 == class27.field528) {
                    class26.field444 = 1;
                }
                if (~(var5 >> 16) == ~class104.field2202) {
                    class26.field444 = 3;
                }
                class35.field700 = 0;
            }
            if (var2 == 51 || var2 == 12 || var2 == 2 || var2 == 45) {
                class84 var16 = class21.field385[arg1];
                int var17 = var16.method670(class38.field743, (byte) 95);
                if (~var17 != 0) {
                    long var18 = var16.method655(28418, var17 + 5).method648((byte) 12).method649((byte) -126);
                    if (~var2 == -52) {
                        class75.method565(var18, -121);
                    }
                    if (var2 == 12) {
                        class17.method133((byte) 45, var18);
                    }
                    if (var2 == 2) {
                        class82.method602(-103, var18);
                    }
                    if (var2 == 45) {
                        class100.method757((byte) -42, var18);
                    }
                }
            }
            if (~var2 == -16) {
                class63 var20 = class119.field2643[var3];
                if (var20 != null) {
                    ++class4.field58;
                    class101.method761(var20.field1436[0], (byte) 121, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var20.field1374[0]);
                    class122.field2717 = class109.field2367;
                    class120.field2674 = 0;
                    class54.field1128 = 2;
                    class74.field1553 = class128.field2820;
                    class97.field2070.method979(1, 7);
                    class97.field2070.method230(-81, var3);
                }
            }
            if (var2 == 49) {
                ++class110.field2382;
                class97.field2070.method979(1, 184);
                class97.field2070.method248(var5, -2147393384);
                class75 var21 = class99.method752(var5, 694);
                if (var21.field1578 != null && ~var21.field1578[0][0] == -6) {
                    int var22 = var21.field1578[0][1];
                    if (class79.field1692[var22] != var21.field1620[0]) {
                        class79.field1692[var22] = var21.field1620[0];
                        class27.method223(var22, (byte) -72);
                        class39.field798 = true;
                    }
                }
            }
            if (var2 == 20) {
                class84 var23 = class21.field385[arg1];
                int var24 = var23.method670(class38.field743, (byte) 95);
                if (~var24 != 0) {
                    long var25 = var23.method655(28418, var24 + 5).method648((byte) 12).method649((byte) -126);
                    int var27 = -1;
                    for (int var28 = 0; ~class27.field537 < ~var28; ++var28) {
                        if (class26.field442[var28] == var25) {
                            var27 = var28;
                            break;
                        }
                    }
                    if (~var27 != 0 && ~class74.field1547[var27] < -1) {
                        class112.field2430 = 3;
                        class120.field2654 = 0;
                        class85.field1927 = true;
                        class86.field1961 = true;
                        class73.field1526 = class73.field1524;
                        class65.field1403 = class26.field442[var27];
                        class73.field1541 = class97.method746(0, new class84[] { class1.field15, class60.field1256[var27] });
                    }
                }
            }
            if (var2 == 46) {
                ++class106.field2252;
                class97.field2070.method979(1, 64);
                class97.field2070.method248(var5, -2147393384);
                class97.field2070.method230(82, var4);
                class97.field2070.method230(-90, var3);
                class61.field1265 = var5;
                class26.field444 = 2;
                class35.field700 = 0;
                class100.field2127 = var4;
                if (~(var5 >> 16) == ~class27.field528) {
                    class26.field444 = 1;
                }
                if (~(var5 >> 16) == ~class104.field2202) {
                    class26.field444 = 3;
                }
            }
            if (var2 == 42) {
                class84 var29 = class21.field385[arg1];
                int var30 = var29.method670(class38.field743, (byte) 95);
                if (~var30 != 0) {
                    if (class27.field528 != -1) {
                        class67.method514(0, class73.field1524, class113.field2441, true);
                    } else {
                        class71.method523(48);
                        if (class40.field820 != -1) {
                            class73.field1528 = var29.method655(28418, var30 + 5).method648((byte) 12);
                            class88.field1990 = class27.field528 = class40.field820;
                            class63.field1321 = false;
                        }
                    }
                }
            }
            if (var2 == 31) {
                class115 var31 = class3.field30[var3];
                if (var31 != null) {
                    ++class45.field954;
                    class101.method761(var31.field1436[0], (byte) 97, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var31.field1374[0]);
                    class122.field2717 = class109.field2367;
                    class74.field1553 = class128.field2820;
                    class54.field1128 = 2;
                    class120.field2674 = 0;
                    class97.field2070.method979(1, 133);
                    class97.field2070.method234(var3, -3420);
                }
            }
            if (~var2 == -41) {
                ++class110.field2382;
                class97.field2070.method979(1, 184);
                class97.field2070.method248(var5, -2147393384);
                class75 var32 = class99.method752(var5, 694);
                if (var32.field1578 != null && ~var32.field1578[0][0] == -6) {
                    int var33 = var32.field1578[0][1];
                    class79.field1692[var33] = 1 - class79.field1692[var33];
                    class27.method223(var33, (byte) -61);
                    class39.field798 = true;
                }
            }
            if (~var2 == -5) {
                class97.field2070.method979(1, 220);
                class97.field2070.method243(var3, -1);
                class97.field2070.method217(var4, 769666216);
                class97.field2070.method245(-121, var5);
                ++class40.field812;
                class26.field444 = 2;
                class35.field700 = 0;
                class100.field2127 = var4;
                class61.field1265 = var5;
                if (var5 >> 16 == class27.field528) {
                    class26.field444 = 1;
                }
                if (~(var5 >> 16) == ~class104.field2202) {
                    class26.field444 = 3;
                }
            }
            if (~var2 == -34) {
                class63 var34 = class119.field2643[var3];
                if (var34 != null) {
                    class101.method761(var34.field1436[0], (byte) 107, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var34.field1374[0]);
                    class54.field1128 = 2;
                    class120.field2674 = 0;
                    ++class104.field2192;
                    class122.field2717 = class109.field2367;
                    class74.field1553 = class128.field2820;
                    class97.field2070.method979(1, 58);
                    class97.field2070.method234(var3, -3420);
                }
            }
            if (~var2 == -45) {
                class115 var35 = class3.field30[var3];
                if (var35 != null) {
                    ++class39.field779;
                    class101.method761(var35.field1436[0], (byte) 120, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var35.field1374[0]);
                    class122.field2717 = class109.field2367;
                    class74.field1553 = class128.field2820;
                    class54.field1128 = 2;
                    class120.field2674 = 0;
                    class97.field2070.method979(1, 101);
                    class97.field2070.method248(class104.field2198, -2147393384);
                    class97.field2070.method230(54, var3);
                }
            }
            if (~var2 == -4) {
                boolean var36 = class101.method761(var5, (byte) 106, 0, class107.field2271.field1374[0], 0, 0, 2, false, 0, class107.field2271.field1436[0], 0, var4);
                ++class27.field503;
                if (!var36) {
                    class101.method761(var5, (byte) -56, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var4);
                }
                class122.field2717 = class109.field2367;
                class54.field1128 = 2;
                class74.field1553 = class128.field2820;
                class120.field2674 = 0;
                class97.field2070.method979(1, 131);
                class97.field2070.method217(var5 - -class36.field714, 769666216);
                class97.field2070.method234(var3, -3420);
                class97.field2070.method217(var4 - -class106.field2242, 769666216);
            }
            if (~var2 == -17) {
                ++class15.field279;
                boolean var38 = class101.method761(var5, (byte) -70, 0, class107.field2271.field1374[0], 0, 0, 2, false, 0, class107.field2271.field1436[0], 0, var4);
                if (!var38) {
                    class101.method761(var5, (byte) -64, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var4);
                }
                class54.field1128 = 2;
                class74.field1553 = class128.field2820;
                class122.field2717 = class109.field2367;
                class120.field2674 = 0;
                class97.field2070.method979(1, 200);
                class97.field2070.method217(class36.field714 + var5, 769666216);
                class97.field2070.method217(class106.field2242 + var4, 769666216);
                class97.field2070.method243(var3, -1);
            }
            if (~var2 == -55) {
                class75 var40 = class99.method752(var5, 694);
                boolean var41 = true;
                if (~var40.field1624 < -1) {
                    var41 = class42.method365(var40, 110);
                }
                if (var41) {
                    class97.field2070.method979(1, 184);
                    class97.field2070.method248(var5, -2147393384);
                    ++class110.field2382;
                }
            }
            int var42 = 50 % ((10 - arg0) / 63);
            if (~var2 == -33) {
                class71.method523(63);
            }
            if (~var2 == -42) {
                ++class114.field2466;
                class49.method419(-22936, var5, var3, var4);
                class97.field2070.method979(1, 165);
                class97.field2070.method230(-90, class36.field714 + var5);
                class97.field2070.method234(class106.field2242 + var4, -3420);
                class97.field2070.method243(32767 & var3 >> 14, -1);
            }
            if (~var2 == -18) {
                class115 var43 = class3.field30[var3];
                if (var43 != null) {
                    class101.method761(var43.field1436[0], (byte) 116, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var43.field1374[0]);
                    class122.field2717 = class109.field2367;
                    class74.field1553 = class128.field2820;
                    class54.field1128 = 2;
                    ++class114.field2470;
                    class120.field2674 = 0;
                    class97.field2070.method979(1, 185);
                    class97.field2070.method230(31, var3);
                }
            }
            if (~var2 == -2) {
                class93.field2048 = 1;
                class36.field712 = var4;
                class126.field2791 = var5;
                class118.field2584 = var3;
                class106.field2255 = class126.method970(118, var3).field921;
                if (class106.field2255 == null) {
                    class106.field2255 = class61.field1269;
                }
                class30.field601 = 0;
                class39.field798 = true;
            } else {
                if (var2 == 39) {
                    class97.field2070.method979(1, 135);
                    ++class125.field2773;
                    class97.field2070.method230(82, var3);
                    class97.field2070.method245(-118, var5);
                    class97.field2070.method234(var4, -3420);
                    class26.field444 = 2;
                    class35.field700 = 0;
                    if (var5 >> 16 == class27.field528) {
                        class26.field444 = 1;
                    }
                    class61.field1265 = var5;
                    class100.field2127 = var4;
                    if (var5 >> 16 == class104.field2202) {
                        class26.field444 = 3;
                    }
                }
                if (var2 == 22) {
                    class115 var44 = class3.field30[var3];
                    if (var44 != null) {
                        class101.method761(var44.field1436[0], (byte) 97, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var44.field1374[0]);
                        class74.field1553 = class128.field2820;
                        class120.field2674 = 0;
                        class54.field1128 = 2;
                        class122.field2717 = class109.field2367;
                        ++class88.field1989;
                        class97.field2070.method979(1, 164);
                        class97.field2070.method243(var3, -1);
                    }
                }
                if (var2 == 14) {
                    ++class100.field2115;
                    boolean var45 = class101.method761(var5, (byte) 121, 0, class107.field2271.field1374[0], 0, 0, 2, false, 0, class107.field2271.field1436[0], 0, var4);
                    if (!var45) {
                        class101.method761(var5, (byte) -110, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var4);
                    }
                    class54.field1128 = 2;
                    class122.field2717 = class109.field2367;
                    class74.field1553 = class128.field2820;
                    class120.field2674 = 0;
                    class97.field2070.method979(1, 219);
                    class97.field2070.method243(class106.field2242 + var4, -1);
                    class97.field2070.method243(var3, -1);
                    class97.field2070.method243(class36.field714 + var5, -1);
                }
                if (~var2 == -1002) {
                    class44 var47 = class126.method970(55, var3);
                    class84 var48;
                    if (var47.field903 == null) {
                        var48 = class97.method746(0, new class84[] { class49.field1040, var47.field921, class48.field1010 });
                    } else {
                        var48 = var47.field903;
                    }
                    class67.method514(0, class73.field1524, var48, true);
                }
                if (~var2 == -29) {
                    class97.field2070.method979(1, 66);
                    class97.field2070.method234(var4, -3420);
                    class97.field2070.method245(-62, var5);
                    class97.field2070.method217(var3, 769666216);
                    ++class15.field270;
                    class97.field2070.method248(class104.field2198, -2147393384);
                    class26.field444 = 2;
                    class100.field2127 = var4;
                    if (~(var5 >> 16) == ~class27.field528) {
                        class26.field444 = 1;
                    }
                    class35.field700 = 0;
                    class61.field1265 = var5;
                    if (~(var5 >> 16) == ~class104.field2202) {
                        class26.field444 = 3;
                    }
                }
                if (var2 == 35) {
                    class101.method762(256, class45.field962);
                    class45.field962 = -1;
                    class85.field1927 = true;
                }
                if (~var2 == -53) {
                    class97.field2070.method979(1, 199);
                    class97.field2070.method217(var4, 769666216);
                    class97.field2070.method248(var5, -2147393384);
                    ++class26.field457;
                    class97.field2070.method217(var3, 769666216);
                    class35.field700 = 0;
                    class61.field1265 = var5;
                    class26.field444 = 2;
                    if (~(var5 >> 16) == ~class27.field528) {
                        class26.field444 = 1;
                    }
                    if (~(var5 >> 16) == ~class104.field2202) {
                        class26.field444 = 3;
                    }
                    class100.field2127 = var4;
                }
                if (var2 == 53) {
                    class97.field2070.method979(1, 193);
                    class97.field2070.method209(-1472, var5);
                    ++class125.field2769;
                    class97.field2070.method243(var4, -1);
                    class97.field2070.method234(var3, -3420);
                    class100.field2127 = var4;
                    class26.field444 = 2;
                    if (var5 >> 16 == class27.field528) {
                        class26.field444 = 1;
                    }
                    if (var5 >> 16 == class104.field2202) {
                        class26.field444 = 3;
                    }
                    class61.field1265 = var5;
                    class35.field700 = 0;
                }
                if (var2 == 34) {
                    class49.method419(-22936, var5, var3, var4);
                    class97.field2070.method979(1, 222);
                    ++class120.field2690;
                    class97.field2070.method243(class36.field714 + var5, -1);
                    class97.field2070.method230(-119, (var3 & 536861581) >> 14);
                    class97.field2070.method234(class106.field2242 + var4, -3420);
                }
                if (~var2 == -48) {
                    class97.field2070.method979(1, 192);
                    ++class4.field62;
                    class97.field2070.method220(12470, var5);
                    class97.field2070.method234(var4, -3420);
                    class97.field2070.method230(-128, var3);
                    class61.field1265 = var5;
                    class35.field700 = 0;
                    class26.field444 = 2;
                    class100.field2127 = var4;
                    if (~(var5 >> 16) == ~class27.field528) {
                        class26.field444 = 1;
                    }
                    if (var5 >> 16 == class104.field2202) {
                        class26.field444 = 3;
                    }
                }
                if (var2 == 26) {
                    class97.field2070.method979(1, 194);
                    ++class112.field2428;
                    class97.field2070.method217(var3, 769666216);
                    class97.field2070.method245(-95, var5);
                    class97.field2070.method230(45, var4);
                    class35.field700 = 0;
                    class100.field2127 = var4;
                    class61.field1265 = var5;
                    class26.field444 = 2;
                    if (~(var5 >> 16) == ~class27.field528) {
                        class26.field444 = 1;
                    }
                    if (~(var5 >> 16) == ~class104.field2202) {
                        class26.field444 = 3;
                    }
                }
                if (var2 == 1002) {
                    class44 var49 = class126.method970(-94, var3);
                    class75 var50 = class99.method752(var5, 694);
                    class84 var51;
                    if (var50 != null && var50.field1576[var4] >= 100000) {
                        var51 = class97.method746(0, new class84[] { class62.method489(var50.field1576[var4], (byte) -128), class82.field1763, var49.field921 });
                    } else if (var49.field903 == null) {
                        var51 = class97.method746(0, new class84[] { class49.field1040, var49.field921, class48.field1010 });
                    } else {
                        var51 = var49.field903;
                    }
                    class67.method514(0, class73.field1524, var51, true);
                }
                if (~var2 == -1005) {
                    class49.method419(-22936, var5, var3, var4);
                    ++class14.field246;
                    class97.field2070.method979(1, 33);
                    class97.field2070.method230(-75, class36.field714 + var5);
                    class97.field2070.method234(class106.field2242 + var4, -3420);
                    class97.field2070.method234(32767 & var3 >> 14, -3420);
                }
                if (~var2 == -11) {
                    ++class42.field851;
                    class49.method419(-22936, var5, var3, var4);
                    class97.field2070.method979(1, 3);
                    class97.field2070.method217(class106.field2242 + var4, 769666216);
                    class97.field2070.method230(78, class36.field714 + var5);
                    class97.field2070.method243((536854689 & var3) >> 14, -1);
                }
                if (var2 == 23) {
                    class97.field2070.method979(1, 29);
                    class97.field2070.method243(var4, -1);
                    ++class21.field384;
                    class97.field2070.method217(var3, 769666216);
                    class97.field2070.method220(12470, var5);
                    class26.field444 = 2;
                    class61.field1265 = var5;
                    class100.field2127 = var4;
                    if (~(var5 >> 16) == ~class27.field528) {
                        class26.field444 = 1;
                    }
                    class35.field700 = 0;
                    if (var5 >> 16 == class104.field2202) {
                        class26.field444 = 3;
                    }
                }
                if (~var2 == -19 && !class25.field438) {
                    class97.field2070.method979(1, 11);
                    class25.field438 = true;
                    ++class38.field753;
                }
                if (~var2 == -22) {
                    class75 var52 = class99.method752(var5, 694);
                    class93.field2048 = 0;
                    class84 var53 = var52.field1622;
                    class39.field798 = true;
                    class104.field2198 = var5;
                    class105.field2220 = var52.field1605;
                    class30.field601 = 1;
                    if (var53.method670(class128.field2819, (byte) 95) != -1) {
                        var53 = var53.method650(var53.method670(class128.field2819, (byte) 95), -32, 0);
                    }
                    class84 var54 = var52.field1622;
                    if (var54.method670(class128.field2819, (byte) 95) != -1) {
                        var54 = var54.method655(28418, var54.method670(class128.field2819, (byte) 95) - -1);
                    }
                    class101.field2141 = class97.method746(0, new class84[] { var53, class128.field2819, var52.field1575, class128.field2819, var54 });
                    if (~class105.field2220 == -17) {
                        class39.field798 = true;
                        class74.field1546 = 3;
                        class27.field522 = true;
                    }
                } else {
                    if (~var2 == -25) {
                        if (!class116.field2529) {
                            class112.field2427.method836(class128.field2820 + -4, class109.field2367 + -4);
                        } else {
                            class112.field2427.method836(var4 + -4, var5 + -4);
                        }
                    }
                    if (var2 == 13) {
                        ++class69.field1480;
                        boolean var55 = class101.method761(var5, (byte) -113, 0, class107.field2271.field1374[0], 0, 0, 2, false, 0, class107.field2271.field1436[0], 0, var4);
                        if (!var55) {
                            class101.method761(var5, (byte) -108, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var4);
                        }
                        class54.field1128 = 2;
                        class122.field2717 = class109.field2367;
                        class120.field2674 = 0;
                        class74.field1553 = class128.field2820;
                        class97.field2070.method979(1, 156);
                        class97.field2070.method234(var3, -3420);
                        class97.field2070.method217(class106.field2242 + var4, 769666216);
                        class97.field2070.method234(class36.field714 + var5, -3420);
                    }
                    if (~var2 == -7 && class49.method419(-22936, var5, var3, var4)) {
                        ++client.field337;
                        class97.field2070.method979(1, 116);
                        class97.field2070.method217(class36.field714 + var5, 769666216);
                        class97.field2070.method243(class106.field2242 + var4, -1);
                        class97.field2070.method243(var3 >> 14 & 32767, -1);
                        class97.field2070.method245(-127, class104.field2198);
                    }
                    if (var2 == 29 || ~var2 == -38) {
                        class84 var57 = class21.field385[arg1];
                        int var58 = var57.method670(class38.field743, (byte) 95);
                        if (~var58 != 0) {
                            class84 var59 = var57.method655(28418, var58 + 5).method648((byte) 12);
                            class84 var60 = var59.method645(121).method637(true);
                            boolean var61 = false;
                            for (int var62 = 0; var62 < class107.field2257; ++var62) {
                                class63 var63 = class119.field2643[class85.field1949[var62]];
                                if (var63 != null && var63.field1312 != null && var63.field1312.method669(var60, true)) {
                                    var61 = true;
                                    class101.method761(var63.field1436[0], (byte) -73, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var63.field1374[0]);
                                    if (var2 == 29) {
                                        class97.field2070.method979(1, 235);
                                        class97.field2070.method234(class85.field1949[var62], -3420);
                                        ++class104.field2188;
                                    }
                                    if (var2 == 37) {
                                        class97.field2070.method979(1, 7);
                                        ++class4.field58;
                                        class97.field2070.method230(-68, class85.field1949[var62]);
                                    }
                                    break;
                                }
                            }
                            if (!var61) {
                                class67.method514(0, class73.field1524, class97.method746(0, new class84[] { class40.field807, var60 }), true);
                            }
                        }
                    }
                    if (~var2 == -31) {
                        class63 var64 = class119.field2643[var3];
                        if (var64 != null) {
                            ++class112.field2420;
                            class101.method761(var64.field1436[0], (byte) 99, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var64.field1374[0]);
                            class54.field1128 = 2;
                            class122.field2717 = class109.field2367;
                            class74.field1553 = class128.field2820;
                            class120.field2674 = 0;
                            class97.field2070.method979(1, 36);
                            class97.field2070.method230(48, var3);
                        }
                    }
                    if (var2 == 9 && class49.method419(-22936, var5, var3, var4)) {
                        ++class28.field560;
                        class97.field2070.method979(1, 44);
                        class97.field2070.method230(-108, class118.field2584);
                        class97.field2070.method243(var3 >> 14 & 32767, -1);
                        class97.field2070.method217(class36.field712, 769666216);
                        class97.field2070.method217(var5 - -class36.field714, 769666216);
                        class97.field2070.method209(-1472, class126.field2791);
                        class97.field2070.method230(-104, var4 - -class106.field2242);
                    }
                    if (~var2 == -28) {
                        ++class89.field2012;
                        class97.field2070.method979(1, 228);
                        class97.field2070.method209(-1472, var5);
                        class97.field2070.method230(-71, var4);
                        class97.field2070.method217(var3, 769666216);
                        class61.field1265 = var5;
                        class26.field444 = 2;
                        class35.field700 = 0;
                        if (~(var5 >> 16) == ~class27.field528) {
                            class26.field444 = 1;
                        }
                        class100.field2127 = var4;
                        if (var5 >> 16 == class104.field2202) {
                            class26.field444 = 3;
                        }
                    }
                    if (var2 == 38) {
                        class63 var65 = class119.field2643[var3];
                        if (var65 != null) {
                            ++class104.field2188;
                            class101.method761(var65.field1436[0], (byte) 116, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var65.field1374[0]);
                            class54.field1128 = 2;
                            class120.field2674 = 0;
                            class74.field1553 = class128.field2820;
                            class122.field2717 = class109.field2367;
                            class97.field2070.method979(1, 235);
                            class97.field2070.method234(var3, -3420);
                        }
                    }
                    if (var2 == 19) {
                        class97.field2070.method979(1, 142);
                        ++class84.field1918;
                        class97.field2070.method234(var4, -3420);
                        class97.field2070.method234(class118.field2584, -3420);
                        class97.field2070.method234(var3, -3420);
                        class97.field2070.method230(-86, class36.field712);
                        class97.field2070.method209(-1472, var5);
                        class97.field2070.method209(-1472, class126.field2791);
                        class61.field1265 = var5;
                        class26.field444 = 2;
                        if (var5 >> 16 == class27.field528) {
                            class26.field444 = 1;
                        }
                        class100.field2127 = var4;
                        if (var5 >> 16 == class104.field2202) {
                            class26.field444 = 3;
                        }
                        class35.field700 = 0;
                    }
                    if (~var2 == -37) {
                        class63 var66 = class119.field2643[var3];
                        if (var66 != null) {
                            ++class75.field1621;
                            class101.method761(var66.field1436[0], (byte) 102, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var66.field1374[0]);
                            class120.field2674 = 0;
                            class54.field1128 = 2;
                            class122.field2717 = class109.field2367;
                            class74.field1553 = class128.field2820;
                            class97.field2070.method979(1, 147);
                            class97.field2070.method245(-114, class104.field2198);
                            class97.field2070.method217(var3, 769666216);
                        }
                    }
                    if (~var2 == -49) {
                        ++class11.field214;
                        boolean var67 = class101.method761(var5, (byte) -117, 0, class107.field2271.field1374[0], 0, 0, 2, false, 0, class107.field2271.field1436[0], 0, var4);
                        if (!var67) {
                            class101.method761(var5, (byte) -88, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var4);
                        }
                        class122.field2717 = class109.field2367;
                        class54.field1128 = 2;
                        class74.field1553 = class128.field2820;
                        class120.field2674 = 0;
                        class97.field2070.method979(1, 108);
                        class97.field2070.method230(127, class106.field2242 + var4);
                        class97.field2070.method245(-123, class104.field2198);
                        class97.field2070.method217(var3, 769666216);
                        class97.field2070.method243(class36.field714 + var5, -1);
                    }
                    if (var2 == 50) {
                        boolean var69 = class101.method761(var5, (byte) 106, 0, class107.field2271.field1374[0], 0, 0, 2, false, 0, class107.field2271.field1436[0], 0, var4);
                        ++class69.field1473;
                        if (!var69) {
                            class101.method761(var5, (byte) -44, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var4);
                        }
                        class74.field1553 = class128.field2820;
                        class122.field2717 = class109.field2367;
                        class54.field1128 = 2;
                        class120.field2674 = 0;
                        class97.field2070.method979(1, 202);
                        class97.field2070.method217(var5 - -class36.field714, 769666216);
                        class97.field2070.method234(var3, -3420);
                        class97.field2070.method230(-123, class106.field2242 + var4);
                    }
                    if (~var2 == -8) {
                        class115 var71 = class3.field30[var3];
                        if (var71 != null) {
                            ++class82.field1759;
                            class101.method761(var71.field1436[0], (byte) -52, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var71.field1374[0]);
                            class74.field1553 = class128.field2820;
                            class54.field1128 = 2;
                            class120.field2674 = 0;
                            class122.field2717 = class109.field2367;
                            class97.field2070.method979(1, 4);
                            class97.field2070.method217(var3, 769666216);
                            class97.field2070.method217(class36.field712, 769666216);
                            class97.field2070.method248(class126.field2791, -2147393384);
                            class97.field2070.method243(class118.field2584, -1);
                        }
                    }
                    if (var2 == 43) {
                        class63 var72 = class119.field2643[var3];
                        if (var72 != null) {
                            class101.method761(var72.field1436[0], (byte) -108, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var72.field1374[0]);
                            class54.field1128 = 2;
                            class122.field2717 = class109.field2367;
                            class74.field1553 = class128.field2820;
                            ++class24.field408;
                            class120.field2674 = 0;
                            class97.field2070.method979(1, 190);
                            class97.field2070.method230(-103, var3);
                        }
                    }
                    if (~var2 == -6) {
                        class49.method419(-22936, var5, var3, var4);
                        ++class25.field414;
                        class97.field2070.method979(1, 139);
                        class97.field2070.method243(var5 - -class36.field714, -1);
                        class97.field2070.method230(123, var4 - -class106.field2242);
                        class97.field2070.method234(var3 >> 14 & 32767, -3420);
                    }
                    if (var2 == 25) {
                        class63 var73 = class119.field2643[var3];
                        if (var73 != null) {
                            class101.method761(var73.field1436[0], (byte) 111, 0, class107.field2271.field1374[0], 1, 0, 2, false, 0, class107.field2271.field1436[0], 1, var73.field1374[0]);
                            ++class107.field2270;
                            class54.field1128 = 2;
                            class120.field2674 = 0;
                            class122.field2717 = class109.field2367;
                            class74.field1553 = class128.field2820;
                            class97.field2070.method979(1, 214);
                            class97.field2070.method230(53, class118.field2584);
                            class97.field2070.method209(-1472, class126.field2791);
                            class97.field2070.method217(class36.field712, 769666216);
                            class97.field2070.method243(var3, -1);
                        }
                    }
                    if (~class93.field2048 != -1) {
                        class39.field798 = true;
                        class93.field2048 = 0;
                    }
                    if (~class30.field601 != -1) {
                        class39.field798 = true;
                        class30.field601 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "(I)V", line = 1203)
    public static final void method884(int arg0) {
        if (arg0 != -21933) {
            field2507 = null;
        }
        ++field2493;
        if (class37.field722 != null) {
            class37.field722.method395(-9098);
        }
    }

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "(I)Z", line = 1229)
    public final boolean method496(int arg0) {
        ++field2498;
        if (this.field2501 == null) {
            return false;
        } else {
            if (arg0 != 28738) {
                this.method471((byte) 81);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lud;ILud;Lud;)V", line = 1244)
    public static final void method885(class118 arg0, int arg1, class118 arg2, class118 arg3) {
        if (arg1 != 0) {
            field2511 = 96;
        }
        ++field2502;
        class86.field1953 = arg3;
        class44.field877 = arg2;
        class104.field2203 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(IB)V", line = 1263)
    public static final void method886(int arg0, byte arg1) {
        if (arg0 == -3) {
            class58.method475(class17.field310, class105.field2209, (byte) 85);
        } else if (~arg0 == 1) {
            class58.method475(class73.field1524, class104.field2199, (byte) 61);
        } else if (arg0 == -1) {
            class58.method475(class28.field542, class105.field2209, (byte) 122);
        } else if (arg0 == 3) {
            class58.method475(class73.field1524, class19.field352, (byte) 66);
        } else if (arg0 != 4) {
            if (~arg0 == -6) {
                class58.method475(class37.field727, class67.field1457, (byte) 92);
            } else if (arg0 != 6) {
                if (arg0 == 7) {
                    class58.method475(class26.field463, class103.field2183, (byte) 76);
                } else if (arg0 != 8) {
                    if (arg0 == 9) {
                        class58.method475(class114.field2485, class109.field2353, (byte) 65);
                    } else if (~arg0 != -11) {
                        if (~arg0 != -12) {
                            if (~arg0 == -13) {
                                class58.method475(class65.field1382, class113.field2453, (byte) 92);
                            } else if (arg0 == 13) {
                                class58.method475(class16.field289, class105.field2209, (byte) 84);
                            } else if (~arg0 == -15) {
                                class58.method475(class127.field2814, class85.field1944, (byte) 75);
                            } else if (~arg0 != -17) {
                                if (arg0 != 17) {
                                    if (arg0 != 18) {
                                        if (~arg0 == -21) {
                                            class58.method475(class119.field2630, class105.field2209, (byte) 63);
                                        } else if (arg0 == 22) {
                                            class58.method475(class42.field854, class62.field1279, (byte) 57);
                                        } else if (arg0 == 23) {
                                            class58.method475(class28.field561, class85.field1944, (byte) 98);
                                        } else if (~arg0 != -25) {
                                            if (arg0 != 25) {
                                                if (arg0 == 26) {
                                                    class58.method475(class80.field1712, field2507, (byte) 75);
                                                } else {
                                                    class58.method475(class97.method746(0, new class84[] { class105.field2208, class62.method489(arg0, (byte) -126) }), class105.field2209, (byte) 96);
                                                }
                                            } else {
                                                class58.method475(class65.field1400, class105.field2209, (byte) 98);
                                            }
                                        } else {
                                            class58.method475(class99.field2107, class109.field2371, (byte) 120);
                                        }
                                    } else {
                                        class58.method475(class64.field1349, class107.field2261, (byte) 105);
                                    }
                                } else {
                                    class58.method475(class89.field2023, class54.field1122, (byte) 91);
                                }
                            } else {
                                class58.method475(class104.field2204, class85.field1944, (byte) 59);
                            }
                        } else {
                            class58.method475(class54.field1130, class54.field1119, (byte) 112);
                        }
                    } else {
                        class58.method475(class64.field1365, class122.field2736, (byte) 125);
                    }
                } else {
                    class58.method475(class64.field1365, class88.field1991, (byte) 98);
                }
            } else {
                class58.method475(class105.field2211, class31.field632, (byte) 99);
            }
        } else {
            class58.method475(class3.field45, class79.field1687, (byte) 72);
        }
        if (arg1 != 101) {
            method884(69);
        }
        ++field2490;
        class8.method63(10, false);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLke;)V", line = 1421)
    public static final void method887(byte arg0, class65 arg1) {
        arg1.field1439 = false;
        ++field2492;
        if (arg1.field1434 != -1) {
            class31 var2 = class74.method554(arg1.field1434, 4867);
            ++arg1.field1410;
            if (arg1.field1409 < var2.field612.length && ~arg1.field1410 < ~var2.field628[arg1.field1409]) {
                ++arg1.field1409;
                arg1.field1410 = 1;
            }
            if (arg1.field1409 >= var2.field612.length) {
                arg1.field1410 = 0;
                arg1.field1409 = 0;
            }
        }
        if (~arg1.field1417 != 0 && arg1.field1437 <= class128.field2837) {
            if (arg1.field1401 < 0) {
                arg1.field1401 = 0;
            }
            int var3 = class6.method36((byte) 30, arg1.field1417).field594;
            if (~var3 != 0) {
                class31 var4 = class74.method554(var3, 4867);
                ++arg1.field1372;
                if (~arg1.field1401 > ~var4.field612.length && arg1.field1372 > var4.field628[arg1.field1401]) {
                    arg1.field1372 = 1;
                    ++arg1.field1401;
                }
                if (~var4.field612.length >= ~arg1.field1401 && (~arg1.field1401 > -1 || arg1.field1401 >= var4.field612.length)) {
                    arg1.field1417 = -1;
                }
            } else {
                arg1.field1417 = -1;
            }
        }
        if (~arg1.field1423 != 0 && arg1.field1429 <= 1) {
            class31 var5 = class74.method554(arg1.field1423, 4867);
            if (var5.field611 == 1 && arg1.field1388 > 0 && ~arg1.field1383 >= ~class128.field2837 && ~arg1.field1411 > ~class128.field2837) {
                arg1.field1429 = 1;
                return;
            }
        }
        if (~arg1.field1423 != 0 && arg1.field1429 == 0) {
            class31 var6 = class74.method554(arg1.field1423, 4867);
            ++arg1.field1370;
            if (var6.field612.length > arg1.field1432 && arg1.field1370 > var6.field628[arg1.field1432]) {
                ++arg1.field1432;
                arg1.field1370 = 1;
            }
            if (~arg1.field1432 <= ~var6.field612.length) {
                arg1.field1432 -= var6.field620;
                ++arg1.field1414;
                if (~var6.field608 >= ~arg1.field1414) {
                    arg1.field1423 = -1;
                }
                if (~arg1.field1432 > -1 || arg1.field1432 >= var6.field612.length) {
                    arg1.field1423 = -1;
                }
            }
            arg1.field1439 = var6.field616;
        }
        if (arg0 <= 25) {
            field2510 = 52;
        }
        if (arg1.field1429 > 0) {
            --arg1.field1429;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V", line = 1542)
    public static void method888(boolean arg0) {
        field2504 = null;
        field2508 = null;
        field2507 = null;
        field2497 = null;
        field2491 = null;
        field2496 = null;
        if (!arg0) {
            method886(-89, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "(I)[Lqb;", line = 1567)
    public static final class96[] method889(int arg0) {
        class96[] var1 = new class96[class36.field716];
        ++field2505;
        for (int var2 = arg0; var2 < class36.field716; ++var2) {
            class96 var3 = var1[var2] = new class96();
            var3.field2060 = class125.field2768;
            var3.field2061 = class51.field1098;
            var3.field2059 = class101.field2156[var2];
            var3.field2057 = class116.field2543[var2];
            var3.field2056 = class78.field1668[var2];
            var3.field2062 = class24.field397[var2];
            var3.field2063 = class25.field432;
            var3.field2058 = class110.field2385[var2];
        }
        class112.method864(-122);
        return var1;
    }
}
