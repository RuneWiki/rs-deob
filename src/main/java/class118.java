import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class118 extends class107 {

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "Lpj;")
    private static class237 field2070 = class33.method353(" is already on your friend list)3", 49);

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "Lpj;")
    public static class237 field2066 = field2070;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "[Ltf;")
    private class105[] field2067;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field2067 = new class105[arg0.method316((byte) 105)];
            for (int var4 = 0; var4 < this.field2067.length; ++var4) {
                int var5 = arg0.method316((byte) -49);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field2067[var4] = class214.method1439((byte) 96, arg0);
                            }
                        } else {
                            this.field2067[var4] = class197.method1353(arg0, class38.method384(arg2, 3187));
                        }
                    } else {
                        this.field2067[var4] = class124.method888(arg0, (byte) -124);
                    }
                } else {
                    this.field2067[var4] = class174.method1206(arg0, -1395);
                }
            }
        } else if (~arg1 == -2) {
            super.field1897 = arg0.method316((byte) -100) == 1;
        }
        if (arg2 == -32513) {
            ++field2065;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class118() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILpj;I)V")
    public static final void method855(int arg0, class237 arg1, int arg2) {
        ++field2068;
        class237 var3 = arg1.method1606((byte) -119).method1581((byte) -126);
        boolean var4 = false;
        for (int var5 = arg0; ~class258.field4439 < ~var5; ++var5) {
            class271 var6 = class232.field4025[class126.field2202[var5]];
            if (var6 != null && var6.field4655 != null && var6.field4655.method1580(var3, (byte) 27)) {
                class210.method1406(0, 1, var6.field3743[0], var6.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                if (arg2 == 1) {
                    class223.field3830.method368(arg0 + -100, 222);
                    ++class202.field3472;
                    class223.field3830.method350((byte) 19, class126.field2202[var5]);
                } else if (~arg2 == -5) {
                    ++class68.field1328;
                    class223.field3830.method368(-101, 90);
                    class223.field3830.method344(class126.field2202[var5], -904679672);
                } else if (arg2 == 5) {
                    class223.field3830.method368(-122, 10);
                    ++class244.field4274;
                    class223.field3830.method348(class126.field2202[var5], arg0 + 4);
                } else if (~arg2 == -7) {
                    class223.field3830.method368(-103, 132);
                    ++class138.field2385;
                    class223.field3830.method341(arg0 + 26994, class126.field2202[var5]);
                } else if (~arg2 == -8) {
                    ++class193.field3339;
                    class223.field3830.method368(-122, 115);
                    class223.field3830.method348(class126.field2202[var5], 4);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class175.method1212(class238.method1626(new class237[] { class63.field1266, var3 }, arg0 + -30), class239.field4202, (byte) 101, 0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lpj;ZI)V")
    public static final void method856(class237 arg0, boolean arg1, int arg2) {
        ++field2064;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class227.field3884.method1324(arg0, 250);
        int var6 = 6 - -var3;
        int var7 = 13 * class227.field3884.method1327(arg0, 250);
        if (arg2 == -12010) {
            class192.method1301(-var3 + var4, -var3 + var6, var5 - (-var3 + -var3), var7 - -var3 - -var3, 0);
            class192.method1316(-var3 + var4, -var3 + var6, var3 - -var3 + var5, var7 - -var3 + var3, 16777215);
            class227.field3884.method1322(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
            class232.method1542(var5 - (-var3 + -var3), arg2 ^ 18426, var3 + var7 + var3, -var3 + var4, var6 - var3);
            if (!arg1) {
                class138.method956(var5, var7, arg2 + 12010, var6, var4);
            } else {
                try {
                    Graphics var8 = class20.field379.getGraphics();
                    class38.field845.method152(var8, -4547, 0, 0);
                } catch (Exception var9) {
                    class20.field379.repaint();
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII[Lw;IIIII)V")
    public static final void method857(int arg0, int arg1, int arg2, int arg3, class141[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -24008) {
            field2070 = null;
        }
        class192.method1309(arg0, arg9, arg3, arg1);
        class150.method1012();
        for (int var10 = 0; arg4.length > var10; ++var10) {
            class141 var11 = arg4[var10];
            if (var11 != null && (~var11.field2535 == ~arg8 || ~arg8 == 1412584498 && class45.field972 == var11)) {
                int var12;
                if (~arg5 == 0) {
                    class260.field4458[class68.field1348] = var11.field2416 + arg2;
                    class183.field3215[class68.field1348] = var11.field2438 + arg6;
                    class115.field2023[class68.field1348] = var11.field2575;
                    class249.field4324[class68.field1348] = var11.field2490;
                    var12 = class68.field1348++;
                } else {
                    var12 = arg5;
                }
                var11.field2503 = class241.field4246;
                var11.field2493 = var12;
                if (!var11.field2536 || !client.method1047(var11)) {
                    if (var11.field2492 > 0) {
                        class196.method1348(var11, false);
                    }
                    int var13 = var11.field2416 + arg2;
                    int var14 = var11.field2420;
                    int var15 = var11.field2438 + arg6;
                    if (class215.field3731 && (client.method1042(var11) != 0 || ~var11.field2529 == -1) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class45.field972 == var11) {
                        if (~arg8 != 1412584498 && !var11.field2574) {
                            class244.field4276 = arg2;
                            class208.field3556 = arg6;
                            class179.field3157 = arg4;
                            continue;
                        }
                        if (!var11.field2574) {
                            var14 = 128;
                        }
                        if (class102.field1806 && class124.field2177) {
                            int var16 = class28.field515;
                            int var17 = var16 - class158.field2854;
                            if (class76.field1444 > var17) {
                                var17 = class76.field1444;
                            }
                            if (~(class76.field1444 + class185.field3237.field2575) > ~(var11.field2575 + var17)) {
                                var17 = class76.field1444 + class185.field3237.field2575 + -var11.field2575;
                            }
                            var13 = var17;
                            int var18 = class174.field3059;
                            int var19 = var18 - class262.field4485;
                            if (~var19 > ~class239.field4211) {
                                var19 = class239.field4211;
                            }
                            if (var11.field2490 + var19 > class239.field4211 + class185.field3237.field2490) {
                                var19 = -var11.field2490 + class185.field3237.field2490 + class239.field4211;
                            }
                            var15 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2529 == 2) {
                        var20 = arg1;
                        var21 = arg9;
                        var22 = arg3;
                        var23 = arg0;
                    } else {
                        var23 = ~var13 >= ~arg0 ? arg0 : var13;
                        var21 = ~arg9 <= ~var15 ? arg9 : var15;
                        int var24 = var13 - -var11.field2575;
                        int var25 = var15 - -var11.field2490;
                        if (var11.field2529 == 9) {
                            ++var24;
                            ++var25;
                        }
                        var20 = ~var25 <= ~arg1 ? arg1 : var25;
                        var22 = ~var24 <= ~arg3 ? arg3 : var24;
                    }
                    if (!var11.field2536 || var23 < var22 && ~var21 > ~var20) {
                        if (~var11.field2492 != -1) {
                            if (~var11.field2492 == -1338) {
                                class243.field4263 = var15;
                                class262.field4484 = var11;
                                class131.field2307 = var13;
                                class119.method863(var11.field2490, var11.field2575, true, ~var11.field2492 == -1404, var13, var15);
                                class192.method1309(arg0, arg9, arg3, arg1);
                                continue;
                            }
                            if (var11.field2492 == 1338) {
                                if (var11.method980(1)) {
                                    class167.method1168(var13, var15, (byte) -123, var11, var12);
                                    class192.method1309(arg0, arg9, arg3, arg1);
                                }
                                continue;
                            }
                            if (var11.field2492 == 1339) {
                                if (var11.method980(1)) {
                                    class234.method1556(var15, var12, (byte) 127, var13, var11);
                                    class192.method1309(arg0, arg9, arg3, arg1);
                                }
                                continue;
                            }
                            if (~var11.field2492 == -1401) {
                                class14.method132(var11.field2575, var13, var11.field2490, var15, -8);
                                class166.field2941[var12] = true;
                                class114.field2008[var12] = true;
                                class192.method1309(arg0, arg9, arg3, arg1);
                                continue;
                            }
                            if (~var11.field2492 == -1402) {
                                class200.method1364((byte) 57, var11.field2490, var13, var11.field2575, var15);
                                class166.field2941[var12] = true;
                                class114.field2008[var12] = true;
                                class192.method1309(arg0, arg9, arg3, arg1);
                                continue;
                            }
                            if (~var11.field2492 == -1403) {
                                class55.method482(var13, var15, arg7 + 23887);
                                class166.field2941[var12] = true;
                                class114.field2008[var12] = true;
                                continue;
                            }
                            if (~var11.field2492 == -1406) {
                                if (!class129.field2259) {
                                    continue;
                                }
                                int var26 = var15 - -15;
                                int var27 = 16776960;
                                int var28 = var11.field2575 + var13;
                                int var29 = 0;
                                class227.field3884.method1338(class238.method1626(new class237[] { class221.field3802, class14.method130(class222.field3819, (byte) 117) }, -79), var28, var26, 16776960, -1);
                                int var30 = 0;
                                Runtime var31 = Runtime.getRuntime();
                                int var32 = 0;
                                int var115 = var26 + 15;
                                int var33 = (int) ((var31.totalMemory() + -var31.freeMemory()) / 1024L);
                                if (var33 > 65536) {
                                    var27 = 16711680;
                                }
                                class227.field3884.method1338(class238.method1626(new class237[] { class255.field4381, class14.method130(var33, (byte) 117), class205.field3504 }, -105), var28, var115, var27, -1);
                                var26 = var115 + 15;
                                int var34 = 16776960;
                                for (int var35 = 0; var35 < 27; ++var35) {
                                    var30 += class206.field3514[var35].method139(0);
                                    var29 += class206.field3514[var35].method149((byte) 110);
                                    var32 += class206.field3514[var35].method138(124);
                                }
                                int var36 = var32 * 100 / var30;
                                int var37 = var29 * 10000 / var30;
                                class237 var38 = class238.method1626(new class237[] { class82.field1543, class140.method966(0, 2, 0, (long) var37, true), class237.field4134, class14.method130(var36, (byte) 117), class199.field3453 }, -83);
                                class96.field1708.method1338(var38, var28, var26, var34, -1);
                                class166.field2941[var12] = true;
                                class114.field2008[var12] = true;
                                var26 += 12;
                                continue;
                            }
                        }
                        if (!class247.field4306) {
                            if (var11.field2529 == 0 && var11.field2564 && ~class169.field2968 <= ~var23 && ~var21 >= ~class126.field2201 && var22 > class169.field2968 && class126.field2201 < var20 && !class215.field3731) {
                                class271.field4664 = 1;
                                class180.field3168[0] = class62.field1242;
                                class235.field4090[0] = 1007;
                                class215.field3747[0] = class239.field4202;
                            }
                            if (class169.field2968 >= var23 && class126.field2201 >= var21 && ~class169.field2968 > ~var22 && class126.field2201 < var20) {
                                class186.method1274(class169.field2968 - var13, -var15 + class126.field2201, (byte) -65, var11);
                            }
                        }
                        if (~var11.field2529 == -1) {
                            if (!var11.field2536 && client.method1047(var11) && class210.field3582 != var11) {
                                continue;
                            }
                            if (!var11.field2536) {
                                if (~var11.field2413 < ~(-var11.field2490 + var11.field2500)) {
                                    var11.field2413 = -var11.field2490 + var11.field2500;
                                }
                                if (var11.field2413 < 0) {
                                    var11.field2413 = 0;
                                }
                            }
                            method857(var23, var20, var13 - var11.field2555, var22, arg4, var12, -var11.field2413 + var15, -24008, var11.field2530, var21);
                            if (var11.field2457 != null) {
                                method857(var23, var20, -var11.field2555 + var13, var22, var11.field2457, var12, -var11.field2413 + var15, -24008, var11.field2530, var21);
                            }
                            class58 var39 = (class58) class164.field2915.method568((long) var11.field2530, arg7 ^ 24007);
                            if (var39 != null) {
                                if (~var39.field1189 == -1 && !class247.field4306 && class169.field2968 >= var23 && var21 <= class126.field2201 && var22 > class169.field2968 && var20 > class126.field2201 && !class215.field3731) {
                                    class235.field4090[0] = 1007;
                                    class271.field4664 = 1;
                                    class180.field3168[0] = class62.field1242;
                                    class215.field3747[0] = class239.field4202;
                                }
                                class166.method1159(var39.field1191, var21, var20, var15, -58, var23, var13, var22, var12);
                            }
                            class192.method1309(arg0, arg9, arg3, arg1);
                            class150.method1012();
                        }
                        if (class70.field1381[var12] || ~class95.field1691 < -2) {
                            if (var11.field2529 == 0 && !var11.field2536 && ~var11.field2490 > ~var11.field2500) {
                                class209.method1400(var13 - -var11.field2575, var11.field2500, var11.field2490, (byte) -10, var11.field2413, var15);
                            }
                            if (~var11.field2529 != -2) {
                                if (~var11.field2529 == -3) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field2484; ++var41) {
                                        for (int var42 = 0; ~var42 > ~var11.field2440; ++var42) {
                                            int var43 = (32 - -var11.field2482) * var42 + var13;
                                            int var44 = (var11.field2421 + 32) * var41 + var15;
                                            if (var40 < 20) {
                                                var44 += var11.field2478[var40];
                                                var43 += var11.field2479[var40];
                                            }
                                            if (var11.field2548[var40] <= 0) {
                                                if (var11.field2542 != null && var40 < 20) {
                                                    class115 var45 = var11.method978(12989, var40);
                                                    if (var45 == null) {
                                                        if (class156.field2783) {
                                                            class128.method911(var11, arg7 + 6859);
                                                        }
                                                    } else {
                                                        var45.method806(var43, var44);
                                                    }
                                                }
                                            } else {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field2548[var40] + -1;
                                                if (arg0 < var43 + 32 && ~var43 > ~arg3 && var44 + 32 > arg9 && ~var44 > ~arg1 || class101.field1803 == var11 && ~class69.field1362 == ~var40) {
                                                    class115 var49;
                                                    if (class70.field1376 == 1 && ~class112.field1960 == ~var40 && class113.field1977 == var11.field2530) {
                                                        var49 = class104.method779(0, var48, 637806961, var11.field2540[var40], var11.field2541, 2);
                                                    } else {
                                                        var49 = class104.method779(3153952, var48, arg7 ^ -637826231, var11.field2540[var40], var11.field2541, 1);
                                                    }
                                                    if (class150.field2671) {
                                                        class166.field2941[var12] = true;
                                                    }
                                                    if (var49 != null) {
                                                        if (class101.field1803 == var11 && class69.field1362 == var40) {
                                                            int var50 = -class49.field1064 + class28.field515;
                                                            if (~var50 > -6 && var50 > -5) {
                                                                var50 = 0;
                                                            }
                                                            int var51 = -class110.field1935 + class174.field3059;
                                                            if (var51 < 5 && ~var51 < 4) {
                                                                var51 = 0;
                                                            }
                                                            if (class163.field2906 < 5) {
                                                                var51 = 0;
                                                                var50 = 0;
                                                            }
                                                            var49.method807(var43 + var50, var44 + var51, 128);
                                                            if (~arg8 != 0) {
                                                                class141 var52 = arg4[65535 & arg8];
                                                                int var53 = class192.field3331;
                                                                int var54 = class192.field3336;
                                                                if (~(var44 + var51) > ~var54 && ~var52.field2413 < -1) {
                                                                    int var55 = (-var51 + var54 + -var44) * class59.field1204 / 3;
                                                                    if (~var55 < ~(class59.field1204 * 10)) {
                                                                        var55 = class59.field1204 * 10;
                                                                    }
                                                                    if (var55 > var52.field2413) {
                                                                        var55 = var52.field2413;
                                                                    }
                                                                    var52.field2413 -= var55;
                                                                    class110.field1935 += var55;
                                                                    class128.method911(var52, arg7 + 6859);
                                                                }
                                                                if (~(var44 - (-var51 + -32)) < ~var53 && ~var52.field2413 > ~(-var52.field2490 + var52.field2500)) {
                                                                    int var56 = (var44 + var51 + 32 + -var53) * class59.field1204 / 3;
                                                                    if (~var56 < ~(class59.field1204 * 10)) {
                                                                        var56 = class59.field1204 * 10;
                                                                    }
                                                                    if (~var56 < ~(-var52.field2490 + -var52.field2413 + var52.field2500)) {
                                                                        var56 = -var52.field2490 + var52.field2500 - var52.field2413;
                                                                    }
                                                                    var52.field2413 += var56;
                                                                    class110.field1935 -= var56;
                                                                    class128.method911(var52, -17149);
                                                                }
                                                            }
                                                        } else if (class263.field4492 == var11 && ~class104.field1840 == ~var40) {
                                                            var49.method807(var43, var44, 128);
                                                        } else {
                                                            var49.method806(var43, var44);
                                                        }
                                                    } else {
                                                        class128.method911(var11, -17149);
                                                    }
                                                }
                                            }
                                            ++var40;
                                        }
                                    }
                                } else if (var11.field2529 == 3) {
                                    int var57;
                                    if (class6.method69(false, var11)) {
                                        var57 = var11.field2519;
                                        if (class210.field3582 == var11 && var11.field2419 != 0) {
                                            var57 = var11.field2419;
                                        }
                                    } else {
                                        var57 = var11.field2458;
                                        if (class210.field3582 == var11 && var11.field2577 != 0) {
                                            var57 = var11.field2577;
                                        }
                                    }
                                    if (~var14 == -1) {
                                        if (!var11.field2556) {
                                            class192.method1316(var13, var15, var11.field2575, var11.field2490, var57);
                                        } else {
                                            class192.method1301(var13, var15, var11.field2575, var11.field2490, var57);
                                        }
                                    } else if (var11.field2556) {
                                        class192.method1313(var13, var15, var11.field2575, var11.field2490, var57, -(255 & var14) + 256);
                                    } else {
                                        class192.method1303(var13, var15, var11.field2575, var11.field2490, var57, -(255 & var14) + 256);
                                    }
                                } else if (~var11.field2529 == -5) {
                                    class194 var58 = var11.method971(0, class85.field1581);
                                    if (var58 == null) {
                                        if (class156.field2783) {
                                            class128.method911(var11, -17149);
                                        }
                                    } else {
                                        class237 var59 = var11.field2477;
                                        int var60;
                                        if (class6.method69(false, var11)) {
                                            var60 = var11.field2519;
                                            if (class210.field3582 == var11 && var11.field2419 != 0) {
                                                var60 = var11.field2419;
                                            }
                                            if (var11.field2417.method1588(false) > 0) {
                                                var59 = var11.field2417;
                                            }
                                        } else {
                                            var60 = var11.field2458;
                                            if (class210.field3582 == var11 && ~var11.field2577 != -1) {
                                                var60 = var11.field2577;
                                            }
                                        }
                                        if (var11.field2536 && ~var11.field2486 != 0) {
                                            class8 var61 = class112.method829((byte) -82, var11.field2486);
                                            var59 = var61.field131;
                                            if (var59 == null) {
                                                var59 = class32.field673;
                                            }
                                            if ((var61.field168 == 1 || ~var11.field2522 != -2) && ~var11.field2522 != 0) {
                                                var59 = class238.method1626(new class237[] { class152.field2700, var59, class52.field1105, class203.method1377(arg7 + 24508, var11.field2522) }, -84);
                                            }
                                        }
                                        if (class83.field1552 == var11) {
                                            var59 = class242.field4252;
                                            var60 = var11.field2458;
                                        }
                                        if (!var11.field2536) {
                                            var59 = class175.method1209(var59, var11, -20078);
                                        }
                                        var58.method1322(var59, var13, var15, var11.field2575, var11.field2490, var60, var11.field2467 ? 0 : -1, var11.field2464, var11.field2505, var11.field2444);
                                    }
                                } else if (var11.field2529 == 5) {
                                    if (!var11.field2536) {
                                        class115 var70 = var11.method973(class6.method69(false, var11), (byte) 94);
                                        if (var70 == null) {
                                            if (class156.field2783) {
                                                class128.method911(var11, arg7 + 6859);
                                            }
                                        } else {
                                            var70.method806(var13, var15);
                                        }
                                    } else {
                                        class115 var62;
                                        if (~var11.field2486 != 0) {
                                            var62 = class104.method779(var11.field2561, var11.field2486, 637806961, var11.field2522, var11.field2541, var11.field2453);
                                        } else {
                                            var62 = var11.method973(false, (byte) 113);
                                        }
                                        if (var62 == null) {
                                            if (class156.field2783) {
                                                class128.method911(var11, -17149);
                                            }
                                        } else {
                                            int var63 = var62.field2019;
                                            int var64 = var62.field2030;
                                            if (!var11.field2497) {
                                                int var69 = var11.field2575 * 4096 / var64;
                                                if (var11.field2462 != 0) {
                                                    var62.method846(var69, var11.field2462, var11.field2490 / 2 + var15, 9995, var13 - -(var11.field2575 / 2));
                                                } else if (var14 != 0) {
                                                    var62.method815(var13, var15, var11.field2575, var11.field2490, -(var14 & 255) + 256);
                                                } else if (~var11.field2575 == ~var64 && var11.field2490 == var63) {
                                                    var62.method806(var13, var15);
                                                } else {
                                                    var62.method844(var13, var15, var11.field2575, var11.field2490);
                                                }
                                            } else {
                                                int var65 = (var64 + -1 + var11.field2575) / var64;
                                                int var66 = (var11.field2490 + -1 + var63) / var63;
                                                class192.method1315(var13, var15, var13 - -var11.field2575, var11.field2490 + var15);
                                                for (int var67 = 0; ~var65 < ~var67; ++var67) {
                                                    for (int var68 = 0; var66 > var68; ++var68) {
                                                        if (~var11.field2462 != -1) {
                                                            var62.method846(4096, var11.field2462, var63 / 2 + var63 * var68 + var15, 9995, var64 * var67 + var64 / 2 + var13);
                                                        } else if (var14 != 0) {
                                                            var62.method807(var13 - -(var64 * var67), var63 * var68 + var15, -(255 & var14) + 256);
                                                        } else {
                                                            var62.method806(var13 - -(var64 * var67), var63 * var68 + var15);
                                                        }
                                                    }
                                                }
                                                class192.method1309(arg0, arg9, arg3, arg1);
                                            }
                                        }
                                    }
                                } else if (~var11.field2529 == -7) {
                                    boolean var71 = class6.method69(false, var11);
                                    int var72;
                                    if (!var71) {
                                        var72 = var11.field2571;
                                    } else {
                                        var72 = var11.field2434;
                                    }
                                    int var73 = 0;
                                    class201 var74 = null;
                                    if (~var11.field2486 == 0) {
                                        if (~var11.field2544 != -6) {
                                            if (var72 == -1) {
                                                var74 = var11.method969(true, class229.field3911.field4645, (class256) null, var71, -1);
                                                if (var74 == null && class156.field2783) {
                                                    class128.method911(var11, arg7 + 6859);
                                                }
                                            } else {
                                                class256 var75 = class256.method1732(var72, true);
                                                var74 = var11.method969(true, class229.field3911.field4645, var75, var71, var11.field2570);
                                                if (var74 == null && class156.field2783) {
                                                    class128.method911(var11, arg7 + 6859);
                                                }
                                            }
                                        } else if (~var11.field2456 != 0) {
                                            int var76 = 2047 & var11.field2456;
                                            if (~class272.field4679 == ~var76) {
                                                var76 = 2047;
                                            }
                                            class271 var77 = class232.field4025[var76];
                                            class256 var78 = var72 == -1 ? null : class256.method1732(var72, true);
                                            if (var77 != null && (int) var77.field4655.method1616(0) << 11 == (var11.field2456 & -2048)) {
                                                var74 = var77.field4645.method268(var78, -9799, (class256) null, var11.field2570, 0);
                                            }
                                        } else {
                                            var74 = class76.field1432.method268((class256) null, arg7 + 14209, (class256) null, -1, -1);
                                        }
                                    } else {
                                        class8 var79 = class112.method829((byte) -82, var11.field2486);
                                        if (var79 != null) {
                                            class8 var80 = var79.method104(var11.field2522, true);
                                            class256 var81 = ~var72 == 0 ? null : class256.method1732(var72, true);
                                            var74 = var80.method95(1, -2, var81, var11.field2570);
                                            if (var74 != null) {
                                                var73 = -var74.method176() / 2;
                                            } else {
                                                class128.method911(var11, -17149);
                                            }
                                        }
                                    }
                                    if (var74 != null) {
                                        int var82;
                                        if (var11.field2523 > 0) {
                                            var82 = (var11.field2575 << 8) / var11.field2523;
                                        } else {
                                            var82 = 256;
                                        }
                                        int var83 = (var11.field2559 * var82 >> 8) + var11.field2575 / 2 + var13;
                                        int var84;
                                        if (var11.field2481 <= 0) {
                                            var84 = 256;
                                        } else {
                                            var84 = (var11.field2490 << 8) / var11.field2481;
                                        }
                                        int var85 = var11.field2490 / 2 + (var15 - -(var11.field2534 * var84 >> 8));
                                        class150.method1025(var83, var85);
                                        int var86 = class150.field2670[var11.field2447] * var11.field2521 >> 16;
                                        int var87 = class150.field2676[var11.field2447] * var11.field2521 >> 16;
                                        if (var11.field2536) {
                                            if (!var11.field2533) {
                                                var74.method161(0, var11.field2531, var11.field2566, var11.field2447, var11.field2520, var73 + var86 - -var11.field2446, var87 - -var11.field2446);
                                            } else {
                                                ((class18) var74).method174(0, var11.field2531, var11.field2566, var11.field2447, var11.field2520, var11.field2446 + var73 + var86, var11.field2446 + var87, var11.field2521);
                                            }
                                        } else {
                                            var74.method161(0, var11.field2531, 0, var11.field2447, 0, var86, var87);
                                        }
                                        class150.method1030();
                                    }
                                } else {
                                    if (var11.field2529 == 7) {
                                        class194 var88 = var11.method971(0, class85.field1581);
                                        if (var88 == null) {
                                            if (class156.field2783) {
                                                class128.method911(var11, -17149);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var11.field2484 > var90; ++var90) {
                                            for (int var91 = 0; var91 < var11.field2440; ++var91) {
                                                if (var11.field2548[var89] > 0) {
                                                    class8 var92 = class112.method829((byte) -82, var11.field2548[var89] - 1);
                                                    class237 var93;
                                                    if (var92.field168 != 1 && var11.field2540[var89] == 1) {
                                                        var93 = class238.method1626(new class237[] { class152.field2700, var92.field131, class32.field695 }, -65);
                                                    } else {
                                                        var93 = class238.method1626(new class237[] { class152.field2700, var92.field131, class52.field1105, class203.method1377(500, var11.field2540[var89]) }, arg7 + 23894);
                                                    }
                                                    int var94 = (var11.field2421 + 12) * var90 + var15;
                                                    int var95 = (115 - -var11.field2482) * var91 + var13;
                                                    if (~var11.field2464 == -1) {
                                                        var88.method1337(var93, var95, var94, var11.field2458, !var11.field2467 ? -1 : 0);
                                                    } else if (~var11.field2464 == -2) {
                                                        var88.method1341(var93, var95 + 57, var94, var11.field2458, !var11.field2467 ? -1 : 0);
                                                    } else {
                                                        var88.method1338(var93, var95 + 115 - 1, var94, var11.field2458, !var11.field2467 ? -1 : 0);
                                                    }
                                                }
                                                ++var89;
                                            }
                                        }
                                    }
                                    if (var11.field2529 == 8 && class221.field3807 == var11 && class156.field2792 == class101.field1802) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class194 var98 = class227.field3884;
                                        class237 var99 = var11.field2477;
                                        class237 var100 = class175.method1209(var99, var11, -20078);
                                        while (var100.method1588(false) > 0) {
                                            int var108 = var100.method1604((byte) 80, class270.field4629);
                                            class237 var109;
                                            if (~var108 == 0) {
                                                var109 = var100;
                                                var100 = class239.field4202;
                                            } else {
                                                var109 = var100.method1620(arg7 + 24102, var108, 0);
                                                var100 = var100.method1610(var108 + 4, arg7 ^ -23994);
                                            }
                                            int var110 = var98.method1342(var109);
                                            var97 += var98.field3351 + 1;
                                            if (~var110 < ~var96) {
                                                var96 = var110;
                                            }
                                        }
                                        var96 += 6;
                                        var97 += 7;
                                        int var101 = var11.field2575 + var13 + -5 + -var96;
                                        if (var101 < var13 + 5) {
                                            var101 = var13 + 5;
                                        }
                                        if (~(var96 + var101) < ~arg3) {
                                            var101 = arg3 - var96;
                                        }
                                        int var102 = var15 - (-var11.field2490 - 5);
                                        if (~arg1 > ~(var97 + var102)) {
                                            var102 = arg1 - var97;
                                        }
                                        class192.method1301(var101, var102, var96, var97, 16777120);
                                        class192.method1316(var101, var102, var96, var97, 0);
                                        int var103 = var102 + 2 + var98.field3351;
                                        class237 var104 = var11.field2477;
                                        class237 var105 = class175.method1209(var104, var11, -20078);
                                        while (var105.method1588(false) > 0) {
                                            int var106 = var105.method1604((byte) 51, class270.field4629);
                                            class237 var107;
                                            if (var106 != -1) {
                                                var107 = var105.method1620(85, var106, 0);
                                                var105 = var105.method1610(var106 - -4, 118);
                                            } else {
                                                var107 = var105;
                                                var105 = class239.field4202;
                                            }
                                            var98.method1337(var107, var101 + 3, var103, 0, -1);
                                            var103 += var98.field3351 - -1;
                                        }
                                    }
                                    if (var11.field2529 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (!var11.field2546) {
                                            var111 = var13;
                                            var112 = var11.field2490 + var15;
                                            var113 = var11.field2575 + var13;
                                            var114 = var15;
                                        } else {
                                            var111 = var13;
                                            var114 = var11.field2490 + var15;
                                            var113 = var11.field2575 + var13;
                                            var112 = var15;
                                        }
                                        if (var11.field2432 == 1) {
                                            class192.method1304(var111, var114, var113, var112, var11.field2458);
                                        } else {
                                            class192.method1311(var111, var114, var113, var112, var11.field2458, var11.field2432);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field2063;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([[IB)V")
    private final void method858(int[][] arg0, byte arg1) {
        int var3 = class193.field3342;
        int var4 = class106.field1862;
        class45.method424(arg0, 40);
        if (arg1 > -85) {
            this.field2067 = null;
        }
        class212.method1416(0, class110.field1937, (byte) 36, 0, class254.field4363);
        ++field2073;
        if (this.field2067 != null) {
            for (int var5 = 0; ~this.field2067.length < ~var5; ++var5) {
                class105 var6 = this.field2067[var5];
                int var7 = var6.field1852;
                int var8 = var6.field1851;
                if (var7 >= 0) {
                    if (~var8 <= -1) {
                        var6.method497(var4, (byte) 51, var3);
                    } else {
                        var6.method501(var4, 115, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method499(var3, -125, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "(I)V")
    public static void method859(int arg0) {
        if (arg0 == 2) {
            field2066 = null;
            field2070 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field2071;
        if (arg0 != -17) {
            field2070 = null;
        }
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            this.method858(super.field1921.method1389(21082), (byte) -112);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method860(int arg0, Component arg1) {
        ++field2074;
        arg1.removeMouseListener(class210.field3585);
        arg1.removeMouseMotionListener(class210.field3585);
        arg1.removeFocusListener(class210.field3585);
        class135.field2356 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int var3 = 24 % ((arg0 - 26) / 45);
        ++field2072;
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551) {
            int var5 = class193.field3342;
            int var6 = class106.field1862;
            int[][][] var7 = super.field1903.method637(111);
            int[][] var8 = new int[var5][var6];
            this.method858(var8, (byte) -108);
            for (int var9 = 0; ~var9 > ~class193.field3342; ++var9) {
                int[][] var10 = var7[var9];
                int[] var11 = var8[var9];
                int[] var12 = var10[1];
                int[] var13 = var10[0];
                int[] var14 = var10[2];
                for (int var15 = 0; ~var15 > ~class106.field1862; ++var15) {
                    int var16 = var11[var15];
                    var14[var15] = class272.method1817(var16 << 4, 4080);
                    var12[var15] = class272.method1817(4080, var16 >> 4);
                    var13[var15] = class272.method1817(var16, 16711680) >> 12;
                }
            }
        }
        return var4;
    }
}
