import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class390 extends class408 {

    @OriginalMember(owner = "client!os", name = "k", descriptor = "Lvq;")
    public static class24 field5685 = new class24(13, 0);

    @OriginalMember(owner = "client!os", name = "y", descriptor = "Lbn;")
    public static class160 field5699 = new class160(24, 3);

    @OriginalMember(owner = "client!os", name = "u", descriptor = "C")
    public char field5695;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public int field5693;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "J")
    public long field5688;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Los;")
    public class390 field5692;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "Z")
    public boolean field5689;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)C", line = 3)
    public final char method2456(byte arg0) {
        field5690++;
        int var2 = -23 % ((4 - arg0) / 41);
        return this.field5695;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method2457(int arg0) {
        field5697++;
        if (arg0 > -60) {
            method2464(20, (byte) -28);
        }
        return this.field5689;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ltd;Leg;Lfp;IBI)Z", line = 25)
    public static final boolean method2458(class110 arg0, class376 arg1, class9 arg2, int arg3, byte arg4, int arg5) {
        field5696++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field1500 != null) {
            var6 = (class66.field874 - class66.field878) * (arg0.field1495 + arg1.field5484 - class66.field864) / (class66.field868 - class66.field864) + class66.field878;
            var8 = class66.field869 - ((arg0.field1517 + arg1.field5497 - class66.field873) * (class66.field869 - class66.field866) / (class66.field863 - class66.field873));
            var7 = class66.field878 + ((arg0.field1520 + arg1.field5484 - class66.field864) * (class66.field874 - class66.field878) / (class66.field868 - class66.field864));
            var9 = class66.field869 - (arg0.field1490 + arg1.field5497 - class66.field873) * (class66.field869 - class66.field866) / (class66.field863 - class66.field873);
        }
        class285 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field1502 != -1) {
            if (arg1.field5486 && arg0.field1511 != -1) {
                var10 = arg0.method781(true, (byte) 99, arg2);
            } else {
                var10 = arg0.method781(false, (byte) -115, arg2);
            }
            if (var10 != null) {
                var11 = arg1.field5488 - (var10.method1861() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg1.field5488 + (var10.method1861() + 1 >> 1);
                var13 = arg1.field5487 - (var10.method1860() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg1.field5487 + (var10.method1860() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class297 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        if (arg4 < 51) {
            method2463(-99);
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field1487 != null) {
            var15 = class225.method1549(arg0.field1514, (byte) -49);
            if (var15 != null) {
                var16 = class119.field1603.method2330((class285[]) null, 0, (int[]) null, class419.field6078, arg0.field1487);
                int var23 = arg1.field5487;
                if (var10 == null) {
                    var17 = var23 - var15.method1979() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method1860() >> 1) + var16 * var15.method1975());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class419.field6078[var24];
                    if (var24 < var16 - 1) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1978(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg1.field5488 + arg5 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg1.field5488 + arg5;
                var21 = arg3 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = var15.method1975() * var16 + arg3 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class66.field878 || var6 > class66.field874 || var9 < class66.field866 || class66.field869 < var8) {
            return true;
        }
        if (arg0.field1500 != null) {
            int[] var27 = new int[arg0.field1500.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg0.field1500[var28 * 2] + arg1.field5484;
                int var31 = arg0.field1500[var28 * 2 + 1] + arg1.field5497;
                var27[var28 * 2] = (class66.field874 - class66.field878) * (var30 - class66.field864) / (class66.field868 - class66.field864) + class66.field878;
                var27[var28 * 2 + 1] = class66.field869 - ((var31 - class66.field873) * (class66.field869 - class66.field866) / (class66.field863 - class66.field873));
            }
            class300.method1995(arg2, var27, arg0.field1492);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg2.method130(arg0.field1523, var27[var29 * 2], var27[var29 * 2 + 1 + 2], var27[var29 * 2 + 1], (byte) 100, var27[(var29 + 1) * 2]);
            }
            arg2.method130(arg0.field1523, var27[var27.length - 2], var27[1], var27[var27.length - 1], (byte) 120, var27[0]);
        }
        if (var10 != null) {
            if (class151.field2052 > 0 && (class166.field2196 != -1 && class166.field2196 == arg1.field5483 || class178.field2538 != -1 && class178.field2538 == arg0.field1530)) {
                int var32;
                if (class267.field3966 <= 50) {
                    var32 = class267.field3966 * 2;
                } else {
                    var32 = 200 - (class267.field3966 * 2);
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method128(var10.method1868() / 2 + 7, arg1.field5487, arg1.field5488, (byte) 102, var33);
                arg2.method128(var10.method1868() / 2 + 5, arg1.field5487, arg1.field5488, (byte) -105, var33);
                arg2.method128(var10.method1868() / 2 + 3, arg1.field5487, arg1.field5488, (byte) 47, var33);
                arg2.method128(var10.method1868() / 2 + 1, arg1.field5487, arg1.field5488, (byte) 84, var33);
                arg2.method128(var10.method1868() / 2, arg1.field5487, arg1.field5488, (byte) -97, var33);
            }
            var10.method1915(arg1.field5488 - (var10.method1861() >> 1), arg1.field5487 - (var10.method1860() >> 1));
        }
        if (arg0.field1487 != null && var15 != null) {
            class369.method2344(arg1, var18, var15, arg2, var17, arg0, var16, -10);
        }
        if (arg0.field1502 != -1 || arg0.field1487 != null) {
            class132 var34 = new class132(arg1);
            var34.field1799 = var21;
            var34.field1810 = var22;
            var34.field1802 = var14;
            var34.field1797 = var13;
            var34.field1808 = var11;
            var34.field1811 = var12;
            var34.field1796 = var19;
            var34.field1803 = var20;
            class223.field3243.method2484(0, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I", line = 239)
    public final int method2459(int arg0) {
        if (arg0 == -1) {
            field5694++;
            return this.field5687;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)J", line = 250)
    public final long method2460(int arg0) {
        field5698++;
        if (arg0 != 0) {
            method2462(-43);
        }
        return this.field5688;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(I)I", line = 262)
    public final int method2461(int arg0) {
        if (arg0 != 13998) {
            this.method2461(103);
        }
        field5700++;
        return this.field5693;
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V", line = 273)
    public static final void method2462(int arg0) {
        field5691++;
        if (class125.field1668 == 0 || class125.field1668 == 5) {
            return;
        }
        try {
            if ((++class38.field539) > 2000) {
                if (class72.field933 != null) {
                    class72.field933.method2695(0);
                    class72.field933 = null;
                }
                if (class450.field6640 >= 1) {
                    class125.field1668 = 0;
                    class92.field1150 = -5;
                    return;
                }
                if (class465.field6851 == class160.field2147) {
                    class465.field6851 = class383.field5612;
                } else {
                    class465.field6851 = class160.field2147;
                }
                class125.field1668 = 1;
                class38.field539 = 0;
                class450.field6640++;
            }
            if (class125.field1668 == 1) {
                class199.field2818 = class267.field3963.method2206(class304.field4445, class465.field6851, true);
                class125.field1668 = 2;
            }
            if (class125.field1668 == 2) {
                if (class199.field2818.field5134 == 2) {
                    throw new IOException();
                }
                if (class199.field2818.field5134 != 1) {
                    return;
                }
                class72.field933 = new class440((Socket) class199.field2818.field5129, class267.field3963);
                class199.field2818 = null;
                long var1 = class135.field1853 = class91.method619(105, class216.field3087);
                class159.field2132.field3762 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class159.field2132.method1727(-128, class33.field456.field892);
                class159.field2132.method1727(-128, var3);
                class72.field933.method2694(2, arg0 ^ 0xFFFFFFF6, class159.field2132.field3764, 0);
                if (class423.field6115 != null) {
                    class423.field6115.method752(-71);
                }
                if (class182.field2565 != null) {
                    class182.field2565.method752(-72);
                }
                int var4 = class72.field933.method2697(-101);
                if (class423.field6115 != null) {
                    class423.field6115.method752(-25);
                }
                if (class182.field2565 != null) {
                    class182.field2565.method752(arg0 ^ 0x1B);
                }
                if (var4 != 0) {
                    class92.field1150 = var4;
                    class125.field1668 = 0;
                    class72.field933.method2695(0);
                    class72.field933 = null;
                    return;
                }
                class125.field1668 = 3;
            }
            if (arg0 == -9) {
                if (class125.field1668 == 3) {
                    if (class72.field933.method2705(-61) < 8) {
                        return;
                    }
                    class72.field933.method2702(0, 8, class22.field306.field3764, (byte) 100);
                    class22.field306.field3762 = 0;
                    class418.field6062 = class22.field306.method1754(true);
                    int[] var5 = new int[4];
                    var5[0] = (int) (Math.random() * 9.9999999E7D);
                    class159.field2132.field3762 = 0;
                    var5[1] = (int) (Math.random() * 9.9999999E7D);
                    var5[2] = (int) (class418.field6062 >> 32);
                    var5[3] = (int) class418.field6062;
                    class159.field2132.method1727(arg0 - 119, 10);
                    class159.field2132.method1721(25153, var5[0]);
                    class159.field2132.method1721(arg0 + 25162, var5[1]);
                    class159.field2132.method1721(arg0 ^ 0xFFFF9DB6, var5[2]);
                    class159.field2132.method1721(25153, var5[3]);
                    class159.field2132.method1730(class91.method619(-69, class216.field3087), false);
                    class159.field2132.method1712(class189.field2636, arg0 + 130);
                    class159.field2132.method1713(arg0 - 107, class402.field5802, class62.field824);
                    class331.field4907.field3762 = 0;
                    if (class120.field1610 == 40) {
                        class331.field4907.method1727(-128, class33.field464.field892);
                    } else {
                        class331.field4907.method1727(arg0 ^ 0x77, class33.field462.field892);
                    }
                    class331.field4907.method1750((byte) 0, class159.field2132.field3762 + class248.method1646(class180.field2554, (byte) -76) + 161);
                    class331.field4907.method1721(25153, 571);
                    class331.field4907.method1727(arg0 - 119, class338.field4981);
                    class331.field4907.method1727(arg0 ^ 0x77, class329.method2151(0));
                    class331.field4907.method1750((byte) 0, class214.field3016);
                    class331.field4907.method1750((byte) 0, class375.field5473);
                    class331.field4907.method1727(-128, class275.field4077);
                    class239.method1612(class331.field4907, -9565);
                    class331.field4907.method1712(class180.field2554, 102);
                    class331.field4907.method1721(25153, class22.field320);
                    class331.field4907.method1721(25153, class347.method2243((byte) 112));
                    class175.field2399 = true;
                    class331.field4907.method1750((byte) 0, class458.field6776);
                    class331.field4907.method1721(arg0 ^ 0xFFFF9DB6, class416.field6016.method723(-64));
                    class331.field4907.method1721(25153, class216.field3088.method723(-117));
                    class331.field4907.method1721(25153, class373.field5445.method723(-95));
                    class331.field4907.method1721(arg0 + 25162, class354.field5167.method723(-104));
                    class331.field4907.method1721(25153, class288.field4221.method723(-89));
                    class331.field4907.method1721(arg0 + 25162, class243.field3602.method723(-125));
                    class331.field4907.method1721(arg0 + 25162, class454.field6706.method723(-71));
                    class331.field4907.method1721(25153, class52.field659.method723(-59));
                    class331.field4907.method1721(arg0 + 25162, class257.field3813.method723(-118));
                    class331.field4907.method1721(25153, class141.field1922.method723(arg0 - 72));
                    class331.field4907.method1721(25153, class289.field4233.method723(-69));
                    class331.field4907.method1721(25153, class70.field923.method723(arg0 - 87));
                    class331.field4907.method1721(25153, class151.field2051.method723(arg0 - 116));
                    class331.field4907.method1721(25153, class385.field5628.method723(-68));
                    class331.field4907.method1721(25153, class336.field4967.method723(-106));
                    class331.field4907.method1721(25153, class308.field4552.method723(-64));
                    class331.field4907.method1721(25153, class411.field5900.method723(arg0 ^ 0x75));
                    class331.field4907.method1721(arg0 ^ 0xFFFF9DB6, class226.field3381.method723(-98));
                    class331.field4907.method1721(25153, class377.field5520.method723(-93));
                    class331.field4907.method1721(25153, class383.field5618.method723(-73));
                    class331.field4907.method1721(25153, class271.field4018.method723(-69));
                    class331.field4907.method1721(25153, class213.field3008.method723(arg0 ^ 0x52));
                    class331.field4907.method1721(25153, class165.field2176.method723(-91));
                    class331.field4907.method1721(25153, class82.field1013.method723(arg0 - 86));
                    class331.field4907.method1721(25153, class129.field1721.method723(-126));
                    class331.field4907.method1721(25153, class199.field2810.method723(arg0 ^ 0x53));
                    class331.field4907.method1721(arg0 + 25162, class441.field6422.method723(-116));
                    class331.field4907.method1721(25153, class195.field2753.method723(-63));
                    class331.field4907.method1721(25153, class430.field6263.method723(arg0 ^ 0x40));
                    class331.field4907.method1739(class159.field2132.field3762, 0, class159.field2132.field3764, (byte) 94);
                    class72.field933.method2694(class331.field4907.field3762, 1, class331.field4907.field3764, 0);
                    class159.field2132.method772(var5, arg0 ^ 0x88);
                    for (int var6 = 0; var6 < 4; var6++) {
                        var5[var6] += 50;
                    }
                    class22.field306.method772(var5, -129);
                    class125.field1668 = 4;
                }
                if (class125.field1668 == 4) {
                    if (class72.field933.method2705(-124) < 1) {
                        return;
                    }
                    int var7 = class72.field933.method2697(arg0 ^ 0x69);
                    if (var7 == 21) {
                        class125.field1668 = 7;
                    } else if (var7 == 29) {
                        class125.field1668 = 11;
                    } else if (var7 == 1) {
                        class92.field1150 = var7;
                        class125.field1668 = 5;
                        return;
                    } else if (var7 == 2) {
                        class125.field1668 = 8;
                    } else if (var7 == 15) {
                        class125.field1668 = 12;
                        class35.field496 = -2;
                    } else if (var7 == 23 && class450.field6640 < 1) {
                        class450.field6640++;
                        class38.field539 = 0;
                        class125.field1668 = 1;
                        class72.field933.method2695(0);
                        class72.field933 = null;
                        return;
                    } else {
                        class125.field1668 = 0;
                        class92.field1150 = var7;
                        class72.field933.method2695(arg0 ^ 0xFFFFFFF7);
                        class72.field933 = null;
                        return;
                    }
                }
                if (class125.field1668 == 6) {
                    class159.field2132.field3762 = 0;
                    class159.field2132.method767(~arg0, class33.field463.field892);
                    class72.field933.method2694(class159.field2132.field3762, 1, class159.field2132.field3764, 0);
                    class125.field1668 = 4;
                } else if (class125.field1668 == 7) {
                    if (class72.field933.method2705(-121) >= 1) {
                        class51.field641 = class72.field933.method2697(-128) * 60 + 180;
                        class125.field1668 = 0;
                        class92.field1150 = 21;
                        class72.field933.method2695(0);
                        class72.field933 = null;
                    }
                } else if (class125.field1668 != 11) {
                    if (class125.field1668 == 8) {
                        if (class72.field933.method2705(-92) < 13) {
                            return;
                        }
                        class72.field933.method2702(0, 13, class22.field306.field3764, (byte) 90);
                        class22.field306.field3762 = 0;
                        class42.field564 = class22.field306.method1738((byte) -128);
                        class416.field6018 = class22.field306.method1738((byte) -36);
                        class236.field3523 = class22.field306.method1738((byte) 98) == 1;
                        class395.field5747 = class22.field306.method1738((byte) -23) == 1;
                        class167.field2202 = class22.field306.method1738((byte) -31) == 1;
                        class74.field943 = class22.field306.method1738((byte) -25) == 1;
                        class420.field6085 = class22.field306.method1767(1930493576);
                        class408.field5877 = class22.field306.method1738((byte) -40) == 1;
                        class33.field472 = class22.field306.method1738((byte) 87) == 1;
                        class459.method2855(class33.field472, (byte) -79);
                        class157.field2119.method179(class33.field472, (byte) -44);
                        class139.method922(class33.field472, -109);
                        if ((!class236.field3523 || class167.field2202) && !class408.field5877) {
                            try {
                                class73.method521(true, class267.field3963.field5023, "unzap");
                            } catch (Throwable var11) {
                            }
                        } else {
                            try {
                                class73.method521(true, class267.field3963.field5023, "zap");
                            } catch (Throwable var13) {
                                if (class170.field2221) {
                                    try {
                                        class267.field3963.field5023.getAppletContext().showDocument(new URL(class267.field3963.field5023.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var12) {
                                    }
                                }
                            }
                        }
                        if (class373.field5452 == 0) {
                            try {
                                class73.method521(true, class267.field3963.field5023, "loggedin");
                            } catch (Throwable var10) {
                            }
                        }
                        class125.field1668 = 10;
                    }
                    if (class125.field1668 == 10) {
                        if (class22.field306.method775(-5846)) {
                            if (class72.field933.method2705(-87) < 1) {
                                return;
                            }
                            class72.field933.method2702(class22.field306.field3762 + 2, 1, class22.field306.field3764, (byte) 93);
                        }
                        class30.field421 = class372.method2362(true)[class22.field306.method769(-98)];
                        class35.field496 = class22.field306.method1767(1930493576);
                        class125.field1668 = 9;
                    }
                    if (class125.field1668 == 9) {
                        if (class72.field933.method2705(-125) >= class35.field496) {
                            class72.field933.method2702(0, class35.field496, class22.field306.field3764, (byte) 94);
                            class22.field306.field3762 = 0;
                            class92.field1150 = 2;
                            class125.field1668 = 0;
                            int var8 = class35.field496;
                            class86.method588((byte) -90);
                            class177.method1227(false, class22.field306);
                            class92.field1147 = -1;
                            class103.method698(-2, false);
                            if (class22.field306.field3762 != var8) {
                                throw new RuntimeException("lswp pos:" + class22.field306.field3762 + " psize:" + var8);
                            }
                            class30.field421 = null;
                        }
                    } else if (class125.field1668 == 12) {
                        if (class35.field496 == -2) {
                            if (class72.field933.method2705(arg0 - 101) < 2) {
                                return;
                            }
                            class72.field933.method2702(0, 2, class22.field306.field3764, (byte) 124);
                            class22.field306.field3762 = 0;
                            class35.field496 = class22.field306.method1767(1930493576);
                        }
                        if (class72.field933.method2705(-109) >= class35.field496) {
                            class72.field933.method2702(0, class35.field496, class22.field306.field3764, (byte) 120);
                            class22.field306.field3762 = 0;
                            class125.field1668 = 0;
                            class92.field1150 = 15;
                            int var9 = class35.field496;
                            class135.method902(120);
                            class177.method1227(false, class22.field306);
                            if (class22.field306.field3762 != var9) {
                                throw new RuntimeException("lswpr pos:" + class22.field306.field3762 + " psize:" + var9);
                            }
                            class30.field421 = null;
                        }
                    }
                } else if (class72.field933.method2705(-119) >= 1) {
                    class307.field4525 = class72.field933.method2697(-121);
                    class92.field1150 = 29;
                    class125.field1668 = 0;
                    class72.field933.method2695(0);
                    class72.field933 = null;
                }
            }
        } catch (IOException var14) {
            if (class72.field933 != null) {
                class72.field933.method2695(0);
                class72.field933 = null;
            }
            if (class450.field6640 >= 1) {
                class92.field1150 = -4;
                class125.field1668 = 0;
            } else {
                class450.field6640++;
                class125.field1668 = 1;
                if (class465.field6851 == class160.field2147) {
                    class465.field6851 = class383.field5612;
                } else {
                    class465.field6851 = class160.field2147;
                }
                class38.field539 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V", line = 715)
    public static void method2463(int arg0) {
        field5685 = null;
        field5699 = null;
        if (arg0 != 1) {
            field5701 = -76;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V", line = 733)
    public static final void method2464(int arg0, byte arg1) {
        if (class444.field6472 == null) {
            class444.field6472 = new byte[4][class195.field2745][class78.field984];
        }
        field5686++;
        int var2 = 0;
        if (arg0 != -1964824607) {
            field5685 = null;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class195.field2745; var3++) {
                for (int var4 = 0; var4 < class78.field984; var4++) {
                    class444.field6472[var2][var3][var4] = arg1;
                }
            }
            var2++;
        }
    }
}
