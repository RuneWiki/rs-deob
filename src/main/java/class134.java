import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class134 extends class139 {

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "[I")
    public static int[] field2779 = new int[32];

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "[I")
    public static int[] field2780 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Lne;")
    public static class126 field2772;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "Lne;")
    public static class126 field2774;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lue;")
    public static class189 field2777;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "[Lig;")
    public static class84[] field2775;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class134() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public static final void method888(int arg0) {
        if (~class202.field3984 < -1) {
            --class202.field3984;
        }
        ++field2778;
        if (class188.field3732 > 1) {
            --class188.field3732;
        }
        if (class117.field2474) {
            class117.field2474 = false;
            class117.method807(-1);
        } else {
            for (int var1 = 0; ~var1 > -101 && class100.method682(arg0 ^ 156); ++var1) {
            }
            if (~class16.field277 == -31) {
                class162.method1016(class141.field2896, (byte) -115, 127);
                Object var2 = class72.field1517.field1623;
                synchronized (class72.field1517.field1623) {
                    if (!class107.field2227) {
                        class72.field1517.field1628 = 0;
                    } else if (class68.field1424 != 0 || ~class72.field1517.field1628 <= -41) {
                        ++class158.field3224;
                        class141.field2896.method326(104, 189);
                        class141.field2896.method370(0, (byte) 123);
                        int var3 = class141.field2896.field1033;
                        int var4 = 0;
                        for (int var5 = 0; ~var5 > ~class72.field1517.field1628 && ~(-var3 + class141.field2896.field1033) > -241; ++var5) {
                            ++var4;
                            int var6 = class72.field1517.field1625[var5];
                            if (~var6 <= -1) {
                                if (var6 > 502) {
                                    var6 = 502;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class72.field1517.field1626[var5];
                            if (~var7 <= -1) {
                                if (var7 > 764) {
                                    var7 = 764;
                                }
                            } else {
                                var7 = 0;
                            }
                            int var8 = var6 * 765 - -var7;
                            if (class72.field1517.field1625[var5] == -1 && ~class72.field1517.field1626[var5] == 0) {
                                var8 = 524287;
                                var6 = -1;
                                var7 = -1;
                            }
                            if (~class106.field2206 == ~var7 && ~class115.field2432 == ~var6) {
                                if (~class107.field2209 > -2048) {
                                    ++class107.field2209;
                                }
                            } else {
                                int var9 = -class106.field2206 + var7;
                                class106.field2206 = var7;
                                int var10 = -class115.field2432 + var6;
                                class115.field2432 = var6;
                                if (~class107.field2209 > -9 && ~var9 <= 31 && var9 <= 31 && ~var10 <= 31 && ~var10 >= -32) {
                                    var10 += 32;
                                    var9 += 32;
                                    class141.field2896.method346(0, (class107.field2209 << 12) - -(var9 << 6) + var10);
                                    class107.field2209 = 0;
                                } else if (class107.field2209 < 8) {
                                    class141.field2896.method336(false, 8388608 - (-(class107.field2209 << 19) - var8));
                                    class107.field2209 = 0;
                                } else {
                                    class141.field2896.method369(-1073741824 - (-(class107.field2209 << 19) - var8), (byte) -110);
                                    class107.field2209 = 0;
                                }
                            }
                        }
                        class141.field2896.method359(-var3 + class141.field2896.field1033, 65280);
                        if (var4 >= class72.field1517.field1628) {
                            class72.field1517.field1628 = 0;
                        } else {
                            class72.field1517.field1628 -= var4;
                            for (int var11 = 0; class72.field1517.field1628 > var11; ++var11) {
                                class72.field1517.field1626[var11] = class72.field1517.field1626[var4 + var11];
                                class72.field1517.field1625[var11] = class72.field1517.field1625[var4 + var11];
                            }
                        }
                    }
                }
                if (~class68.field1424 != -1) {
                    ++class159.field3239;
                    long var12 = (class128.field2625 - class101.field2115) / 50L;
                    class101.field2115 = class128.field2625;
                    if (var12 > 4095L) {
                        var12 = 4095L;
                    }
                    int var14 = class16.field283;
                    int var15 = class193.field3796;
                    if (~var14 <= -1) {
                        if (~var14 < -503) {
                            var14 = 502;
                        }
                    } else {
                        var14 = 0;
                    }
                    byte var16 = 0;
                    if (~var15 <= -1) {
                        if (~var15 < -765) {
                            var15 = 764;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (~class68.field1424 == -3) {
                        var16 = 1;
                    }
                    class141.field2896.method326(104, 246);
                    int var17 = (int) var12;
                    int var18 = var14 * 765 + var15;
                    class141.field2896.method374(false, (var17 << 20) - -(var16 << 19) + var18);
                }
                if (class119.field2518[96] || class119.field2518[97] || class119.field2518[98] || class119.field2518[99]) {
                    class80.field1624 = true;
                }
                if (class185.field3690 > 0) {
                    --class185.field3690;
                }
                if (class80.field1624 && ~class185.field3690 >= -1) {
                    class185.field3690 = 20;
                    class80.field1624 = false;
                    ++class193.field3807;
                    class141.field2896.method326(104, 44);
                    class141.field2896.method355(class41.field839, (byte) 123);
                    class141.field2896.method361(-1810503640, class77.field1593);
                }
                if (class189.field3755 && !class197.field3919) {
                    class197.field3919 = true;
                    ++class103.field2151;
                    class141.field2896.method326(arg0 ^ 104, 48);
                    class141.field2896.method370(1, (byte) 123);
                }
                if (!class189.field3755 && class197.field3919) {
                    ++class103.field2151;
                    class197.field3919 = false;
                    class141.field2896.method326(104, 48);
                    class141.field2896.method370(0, (byte) 123);
                }
                class96.method666(115);
                if (class16.field277 == 30) {
                    class189.method1278(-110);
                    class85.method602(128);
                    ++class7.field161;
                    if (~class7.field161 < -751) {
                        class117.method807(-1);
                    } else {
                        class57.method411(0);
                        class210.method1369(-22073);
                        class82.method549(arg0 + 37);
                        if (class124.field2591 != arg0) {
                            class107.field2218 += 20;
                            if (class107.field2218 >= 400) {
                                class124.field2591 = 0;
                            }
                        }
                        ++class79.field1607;
                        if (class128.field2631 != null) {
                            ++class5.field98;
                            if (class5.field98 >= 15) {
                                class194.method1295((byte) -28, class128.field2631);
                                class128.field2631 = null;
                            }
                        }
                        if (class21.field378 != null) {
                            class194.method1295((byte) -117, class21.field378);
                            ++class74.field1548;
                            if (class151.field3112 + 5 < class22.field394 || ~class22.field394 > ~(class151.field3112 + -5) || ~class75.field1555 < ~(class84.field1847 - -5) || ~class75.field1555 > ~(class84.field1847 + -5)) {
                                class188.field3733 = true;
                            }
                            if (~class117.field2476 == -1) {
                                if (class188.field3733 && class74.field1548 >= 5) {
                                    if (class57.field1162 == class21.field378 && ~class161.field3259 != ~class117.field2472) {
                                        class84 var19 = class21.field378;
                                        ++class116.field2456;
                                        byte var20 = 0;
                                        if (class150.field3104 == 1 && ~var19.field1830 == -207) {
                                            var20 = 1;
                                        }
                                        if (~var19.field1750[class117.field2472] >= -1) {
                                            var20 = 0;
                                        }
                                        if (!class102.method698(arg0 ^ -5542, class21.method130(var19, (byte) 77))) {
                                            if (var20 != 1) {
                                                var19.method588((byte) 127, class161.field3259, class117.field2472);
                                            } else {
                                                int var21 = class161.field3259;
                                                int var22 = class117.field2472;
                                                while (~var21 != ~var22) {
                                                    if (var22 >= var21) {
                                                        if (var21 < var22) {
                                                            var19.method588((byte) 25, var21, var21 - -1);
                                                            ++var21;
                                                        }
                                                    } else {
                                                        var19.method588((byte) 112, var21, var21 + -1);
                                                        --var21;
                                                    }
                                                }
                                            }
                                        } else {
                                            int var23 = class161.field3259;
                                            int var24 = class117.field2472;
                                            var19.field1750[var24] = var19.field1750[var23];
                                            var19.field1766[var24] = var19.field1766[var23];
                                            var19.field1750[var23] = -1;
                                            var19.field1766[var23] = 0;
                                        }
                                        class141.field2896.method326(104, 140);
                                        class141.field2896.method391(false, var20);
                                        class141.field2896.method341(class21.field378.field1782, -17);
                                        class141.field2896.method346(0, class161.field3259);
                                        class141.field2896.method364(class117.field2472, (byte) -35);
                                    }
                                } else if ((~class172.field3487 == -2 || class116.method800(class184.field3678 + -1, (byte) -36)) && class184.field3678 > 2) {
                                    class27.method161(0);
                                } else if (~class184.field3678 < -1) {
                                    class77.method536(99, class184.field3678 + -1);
                                }
                                class5.field98 = 10;
                                class21.field378 = null;
                                class68.field1424 = 0;
                            }
                        }
                        class52.field1087 = false;
                        class87.field1896 = false;
                        class131.field2732 = null;
                        class84 var25 = class158.field3225;
                        class158.field3225 = null;
                        class84 var26 = class115.field2433;
                        class68.field1425 = 0;
                        class115.field2433 = null;
                        while (class172.method1155(121) && ~class68.field1425 > -129) {
                            class105.field2196[class68.field1425] = class39.field810;
                            class119.field2515[class68.field1425] = class57.field1160;
                            ++class68.field1425;
                        }
                        if (class62.field1314 != -1) {
                            class188.method1268(765, 0, class62.field1314, 0, 0, 0, 503, (byte) 106);
                        }
                        ++class62.field1325;
                        while (true) {
                            class118 var27;
                            class84 var28;
                            class84 var29;
                            do {
                                var27 = (class118) class121.field2547.method45(0);
                                if (var27 == null) {
                                    while (true) {
                                        class118 var30;
                                        class84 var31;
                                        class84 var32;
                                        do {
                                            var30 = (class118) class29.field534.method45(0);
                                            if (var30 == null) {
                                                while (true) {
                                                    class118 var33;
                                                    class84 var34;
                                                    class84 var35;
                                                    do {
                                                        var33 = (class118) class51.field1021.method45(0);
                                                        if (var33 == null) {
                                                            if (class118.field2492 != null) {
                                                                class118.method811((byte) -120);
                                                            }
                                                            if (~class97.field2056 != 0) {
                                                                int var36 = class97.field2056;
                                                                int var37 = class92.field2009;
                                                                boolean var38 = class15.method103(class56.field1136.field692[0], var36, 0, 0, -57, 0, 0, class56.field1136.field718[0], var37, 0, 0, true);
                                                                if (var38) {
                                                                    class115.field2442 = class193.field3796;
                                                                    class107.field2218 = 0;
                                                                    class124.field2591 = 1;
                                                                    class136.field2805 = class16.field283;
                                                                }
                                                                class97.field2056 = -1;
                                                            }
                                                            class61.method434(30828);
                                                            if (class158.field3225 != var25) {
                                                                if (var25 != null) {
                                                                    class194.method1295((byte) -127, var25);
                                                                }
                                                                if (class158.field3225 != null) {
                                                                    class194.method1295((byte) 48, class158.field3225);
                                                                }
                                                            }
                                                            if (class115.field2433 != var26 && ~class143.field2953 == ~class136.field2806) {
                                                                if (var26 != null) {
                                                                    class194.method1295((byte) 90, var26);
                                                                }
                                                                if (class115.field2433 != null) {
                                                                    class194.method1295((byte) 73, class115.field2433);
                                                                }
                                                            }
                                                            if (class115.field2433 == null) {
                                                                if (~class136.field2806 < -1) {
                                                                    --class136.field2806;
                                                                }
                                                            } else if (~class143.field2953 < ~class136.field2806) {
                                                                ++class136.field2806;
                                                                if (~class143.field2953 == ~class136.field2806) {
                                                                    class194.method1295((byte) -124, class115.field2433);
                                                                }
                                                            }
                                                            class144.method938(100);
                                                            if (class199.field3941) {
                                                                class127.method838(true);
                                                            }
                                                            for (int var39 = 0; var39 < 5; ++var39) {
                                                                int var10002 = class113.field2383[var39]++;
                                                            }
                                                            int var40 = class172.method1157(arg0 + 7);
                                                            int var41 = class90.method628((byte) 4);
                                                            if (~var40 < -4501 && var41 > 4500) {
                                                                ++class121.field2545;
                                                                class202.field3984 = 250;
                                                                class13.method94(106, 4000);
                                                                class141.field2896.method326(104, 160);
                                                            }
                                                            ++class80.field1615;
                                                            ++class39.field800;
                                                            if (~class39.field800 < -501) {
                                                                int var42 = (int) (8.0D * Math.random());
                                                                class39.field800 = 0;
                                                                if ((2 & var42) == 2) {
                                                                    class17.field293 += class210.field4095;
                                                                }
                                                                if (~(var42 & 4) == -5) {
                                                                    class40.field825 += class62.field1320;
                                                                }
                                                                if ((1 & var42) == 1) {
                                                                    class79.field1611 += class139.field2862;
                                                                }
                                                            }
                                                            if (~class79.field1611 > 49) {
                                                                class139.field2862 = 2;
                                                            }
                                                            if (~class40.field825 > 39) {
                                                                class62.field1320 = 1;
                                                            }
                                                            if (class40.field825 > 40) {
                                                                class62.field1320 = -1;
                                                            }
                                                            ++class28.field518;
                                                            if (class28.field518 > 500) {
                                                                int var43 = (int) (Math.random() * 8.0D);
                                                                if ((1 & var43) == 1) {
                                                                    class54.field1114 += class106.field2202;
                                                                }
                                                                if (~(var43 & 2) == -3) {
                                                                    class26.field468 += class122.field2560;
                                                                }
                                                                class28.field518 = 0;
                                                            }
                                                            if (~class26.field468 > 19) {
                                                                class122.field2560 = 1;
                                                            }
                                                            if (class17.field293 < -55) {
                                                                class210.field4095 = 2;
                                                            }
                                                            if (~class79.field1611 < -51) {
                                                                class139.field2862 = -2;
                                                            }
                                                            if (~class26.field468 < -11) {
                                                                class122.field2560 = -1;
                                                            }
                                                            if (class54.field1114 < -60) {
                                                                class106.field2202 = 2;
                                                            }
                                                            if (~class17.field293 < -56) {
                                                                class210.field4095 = -2;
                                                            }
                                                            if (class54.field1114 > 60) {
                                                                class106.field2202 = -2;
                                                            }
                                                            if (class80.field1615 > 50) {
                                                                ++class17.field294;
                                                                class141.field2896.method326(104, 52);
                                                            }
                                                            try {
                                                                if (class92.field2004 != null && class141.field2896.field1033 > 0) {
                                                                    class92.field2004.method697(class141.field2896.field1054, class141.field2896.field1033, (byte) -112, 0);
                                                                    class141.field2896.field1033 = 0;
                                                                    class80.field1615 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var44) {
                                                                class117.method807(~arg0);
                                                                return;
                                                            }
                                                        }
                                                        var34 = var33.field2500;
                                                        if (var34.field1758 < 0) {
                                                            break;
                                                        }
                                                        var35 = class138.method907(var34.field1724, false);
                                                    } while (var35 == null || var35.field1804 == null || ~var35.field1804.length >= ~var34.field1758 || var35.field1804[var34.field1758] != var34);
                                                    class64.method458((byte) -88, var33);
                                                }
                                            }
                                            var31 = var30.field2500;
                                            if (~var31.field1758 > -1) {
                                                break;
                                            }
                                            var32 = class138.method907(var31.field1724, false);
                                        } while (var32 == null || var32.field1804 == null || var32.field1804.length <= var31.field1758 || var32.field1804[var31.field1758] != var31);
                                        class64.method458((byte) -105, var30);
                                    }
                                }
                                var28 = var27.field2500;
                                if (~var28.field1758 > -1) {
                                    break;
                                }
                                var29 = class138.method907(var28.field1724, false);
                            } while (var29 == null || var29.field1804 == null || var29.field1804.length <= var28.field1758 || var29.field1804[var28.field1758] != var28);
                            class64.method458((byte) -108, var27);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V")
    public static void method889(boolean arg0) {
        field2777 = null;
        field2779 = null;
        field2780 = null;
        field2774 = null;
        field2772 = null;
        if (arg0) {
            field2775 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg1 != 7451) {
            method890(94, 12);
        }
        ++field2773;
        int[] var3 = super.field2859.method1319(-116, arg0);
        if (super.field2859.field3966) {
            class123.method827(var3, 0, class23.field402, class180.field3607[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(II)Lhb;")
    public static final class71 method890(int arg0, int arg1) {
        if (arg1 != -22504) {
            field2777 = null;
        }
        class71 var2 = (class71) class81.field1641.method401((long) arg0, (byte) 99);
        ++field2776;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class32.field636.method1235(arg0, (byte) -64, 1);
            class71 var4 = new class71();
            if (var3 != null) {
                var4.method506(new class52(var3), arg0, arg1 + 22557);
            }
            class81.field1641.method398(var4, (long) arg0, (byte) 117);
            return var4;
        }
    }
}
