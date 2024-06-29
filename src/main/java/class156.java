import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class156 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2612 = 0;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "S")
    public static short field2615 = 32767;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public static int[] field2613;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[Lfc;")
    public static class148[] field2614;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        field2614 = null;
        field2613 = null;
        if (arg0 > -109) {
            method1069((byte) -34);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public static final void method1070(int arg0, int arg1, int arg2) {
        field2617++;
        int var3 = 26 % ((arg0 + 52) / 49);
        class50.field857[arg1] = arg2;
        class261 var4 = (class261) class143.field2456.method779(53, (long) arg1);
        if (var4 == null) {
            class261 var5 = new class261(4611686018427387905L);
            class143.field2456.method780((byte) -78, (long) arg1, var5);
        } else if (var4.field4261 != 4611686018427387905L) {
            var4.field4261 = class232.method1544((byte) -91) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1071(boolean arg0, char arg1) {
        if (!arg0) {
            return false;
        }
        field2611++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            int var2 = 0;
            char[] var3 = class104.field1828;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg1 == var4) {
                    return true;
                }
                var2++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)Lfa;")
    public static final class223 method1072(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1976;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Lki;")
    public static final class134 method1073(int arg0, byte arg1) {
        class134 var2 = (class134) class168.field2783.method57((long) arg0, -56);
        if (arg1 != 80) {
            return null;
        }
        field2610++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class198.field3202.method746(arg0, (byte) -128, 29);
        class134 var4 = new class134();
        if (var3 != null) {
            var4.method926(arg0, new class101(var3), arg1 ^ 0x2B);
        }
        class168.field2783.method62(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static final void method1074(int arg0) {
        field2608++;
        if (class295.field4691 == 0 || class295.field4691 == 5) {
            return;
        }
        try {
            if (++class53.field926 > 2000) {
                if (class194.field3131 != null) {
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                }
                if (class122.field2160 >= 1) {
                    class6.field73 = -5;
                    class295.field4691 = 0;
                    return;
                }
                class122.field2160++;
                if (class4.field47 == class262.field4277) {
                    class4.field47 = class267.field4323;
                } else {
                    class4.field47 = class262.field4277;
                }
                class295.field4691 = 1;
                class53.field926 = 0;
            }
            if (class295.field4691 == 1) {
                class88.field1572 = class127.field2238.method910((byte) 100, class21.field331, class4.field47);
                class295.field4691 = 2;
            }
            if (class295.field4691 == 2) {
                if (class88.field1572.field2857 == 2) {
                    throw new IOException();
                }
                if (class88.field1572.field2857 != 1) {
                    return;
                }
                class194.field3131 = new class207((Socket) class88.field1572.field2859, class127.field2238);
                class88.field1572 = null;
                long var1 = class171.field2811 = class103.method702(true, class54.field940);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class168.field2778.field1762 = 0;
                class168.field2778.method682(14, 22555);
                class168.field2778.method682(var3, 22555);
                class194.field3131.method1382(class168.field2778.field1730, 2, 0, (byte) -40);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                int var4 = class194.field3131.method1377(-41);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                if (var4 != 0) {
                    class295.field4691 = 0;
                    class6.field73 = var4;
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                    return;
                }
                class295.field4691 = 3;
            }
            if (arg0 > 11) {
                if (class295.field4691 == 3) {
                    if (class194.field3131.method1386(true) < 8) {
                        return;
                    }
                    class194.field3131.method1390(8, 0, class248.field4058.field1730, true);
                    class248.field4058.field1762 = 0;
                    int[] var5 = new int[4];
                    class72.field1186 = class248.field4058.method694(false);
                    var5[2] = (int) (class72.field1186 >> 32);
                    var5[0] = (int) (Math.random() * 9.9999999E7D);
                    var5[1] = (int) (Math.random() * 9.9999999E7D);
                    class168.field2778.field1762 = 0;
                    var5[3] = (int) class72.field1186;
                    class168.field2778.method682(10, 22555);
                    class168.field2778.method698(98, var5[0]);
                    class168.field2778.method698(-56, var5[1]);
                    class168.field2778.method698(112, var5[2]);
                    class168.field2778.method698(-71, var5[3]);
                    class168.field2778.method640(21691, class103.method702(true, class54.field940));
                    class168.field2778.method645(class122.field2142, (byte) 113);
                    class168.field2778.method675(class262.field4267, class136.field2371, -2585);
                    class124.field2187.field1762 = 0;
                    if (class59.field1026 == 40) {
                        class124.field2187.method682(18, 22555);
                    } else {
                        class124.field2187.method682(16, 22555);
                    }
                    class124.field2187.method639(class168.field2778.field1762 + class285.method1904(class204.field3339, (byte) 36) + 163, 15267);
                    class124.field2187.method698(-34, 539);
                    class124.field2187.method682(class102.field1792, 22555);
                    class124.field2187.method682(class210.field3553 ? 1 : 0, 22555);
                    class124.field2187.method682(0, 22555);
                    class124.field2187.method682(class85.method557(false), 22555);
                    class124.field2187.method639(class267.field4324, 15267);
                    class124.field2187.method639(class4.field38, 15267);
                    class124.field2187.method682(class172.field2820, 22555);
                    class272.method1789(-22452, class124.field2187);
                    class124.field2187.method645(class204.field3339, (byte) 124);
                    class124.field2187.method698(-124, class191.field3090);
                    class124.field2187.method698(-116, class175.method1166((byte) 127));
                    class196.field3172 = true;
                    class124.field2187.method639(class198.field3199, 15267);
                    class124.field2187.method698(-102, class73.field1202.method731(false));
                    class124.field2187.method698(118, class76.field1236.method731(false));
                    class124.field2187.method698(94, class7.field87.method731(false));
                    class124.field2187.method698(113, class98.field1693.method731(false));
                    class124.field2187.method698(114, class207.field3449.method731(false));
                    class124.field2187.method698(94, class198.field3197.method731(false));
                    class124.field2187.method698(93, class56.field972.method731(false));
                    class124.field2187.method698(-69, class206.field3438.method731(false));
                    class124.field2187.method698(95, class33.field471.method731(false));
                    class124.field2187.method698(-31, class198.field3196.method731(false));
                    class124.field2187.method698(-121, class142.field2445.method731(false));
                    class124.field2187.method698(-50, class181.field2968.method731(false));
                    class124.field2187.method698(-44, class119.field2106.method731(false));
                    class124.field2187.method698(-82, class103.field1820.method731(false));
                    class124.field2187.method698(-87, class193.field3119.method731(false));
                    class124.field2187.method698(103, class65.field1098.method731(false));
                    class124.field2187.method698(91, class188.field3052.method731(false));
                    class124.field2187.method698(115, class219.field3671.method731(false));
                    class124.field2187.method698(94, class55.field955.method731(false));
                    class124.field2187.method698(-47, class259.field4242.method731(false));
                    class124.field2187.method698(125, class26.field396.method731(false));
                    class124.field2187.method698(127, class45.field632.method731(false));
                    class124.field2187.method698(-49, class194.field3139.method731(false));
                    class124.field2187.method698(115, class101.field1739.method731(false));
                    class124.field2187.method698(-59, class181.field2967.method731(false));
                    class124.field2187.method698(-105, class145.field2481.method731(false));
                    class124.field2187.method698(95, class280.field4449.method731(false));
                    class124.field2187.method698(-118, class19.field301.method731(false));
                    class124.field2187.method698(124, class248.field4060.method731(false));
                    class124.field2187.method678((byte) 0, class168.field2778.field1730, class168.field2778.field1762, 0);
                    class194.field3131.method1382(class124.field2187.field1730, class124.field2187.field1762, 0, (byte) -58);
                    class168.field2778.method202(7, var5);
                    for (int var6 = 0; var6 < 4; var6++) {
                        var5[var6] += 50;
                    }
                    class248.field4058.method202(7, var5);
                    class295.field4691 = 4;
                }
                if (class295.field4691 == 4) {
                    if (class194.field3131.method1386(true) < 1) {
                        return;
                    }
                    int var7 = class194.field3131.method1377(-4);
                    if (var7 == 21) {
                        class295.field4691 = 7;
                    } else if (var7 == 29) {
                        class295.field4691 = 10;
                    } else if (var7 == 1) {
                        class6.field73 = var7;
                        class295.field4691 = 5;
                        return;
                    } else if (var7 == 2) {
                        class295.field4691 = 8;
                    } else if (var7 == 15) {
                        class6.field73 = var7;
                        class295.field4691 = 0;
                        return;
                    } else if (var7 == 23 && class122.field2160 < 1) {
                        class53.field926 = 0;
                        class295.field4691 = 1;
                        class122.field2160++;
                        class194.field3131.method1380(true);
                        class194.field3131 = null;
                        return;
                    } else {
                        class295.field4691 = 0;
                        class6.field73 = var7;
                        class194.field3131.method1380(true);
                        class194.field3131 = null;
                        return;
                    }
                }
                if (class295.field4691 == 6) {
                    class168.field2778.field1762 = 0;
                    class168.field2778.method199(17, 123);
                    class194.field3131.method1382(class168.field2778.field1730, class168.field2778.field1762, 0, (byte) -33);
                    class295.field4691 = 4;
                } else if (class295.field4691 == 7) {
                    if (class194.field3131.method1386(true) >= 1) {
                        class59.field1030 = class194.field3131.method1377(2) * 60 + 180;
                        class6.field73 = 21;
                        class295.field4691 = 0;
                        class194.field3131.method1380(true);
                        class194.field3131 = null;
                    }
                } else if (class295.field4691 != 10) {
                    if (class295.field4691 == 8) {
                        if (class194.field3131.method1386(true) < 14) {
                            return;
                        }
                        class194.field3131.method1390(14, 0, class248.field4058.field1730, true);
                        class248.field4058.field1762 = 0;
                        class204.field3343 = class248.field4058.method669((byte) 36);
                        class269.field4338 = class248.field4058.method669((byte) 36);
                        class66.field1108 = class248.field4058.method669((byte) 36) == 1;
                        class125.field2196 = class248.field4058.method669((byte) 36) == 1;
                        class179.field2954 = class248.field4058.method669((byte) 36) == 1;
                        class124.field2186 = class248.field4058.method669((byte) 36) == 1;
                        class121.field2132 = class248.field4058.method669((byte) 36) == 1;
                        class37.field545 = class248.field4058.method677(false);
                        class193.field3123 = class248.field4058.method669((byte) 36) == 1;
                        class158.field2637 = class248.field4058.method669((byte) 36) == 1;
                        class285.method1901(true, class158.field2637);
                        class98.method621(256, class158.field2637);
                        if (!class210.field3553) {
                            if ((!class66.field1108 || class179.field2954) && !class193.field3123) {
                                try {
                                    class94.method604(class127.field2238.field2294, "unzap", 27972);
                                } catch (Throwable var10) {
                                }
                            } else {
                                try {
                                    class94.method604(class127.field2238.field2294, "zap", 27972);
                                } catch (Throwable var9) {
                                }
                            }
                        }
                        try {
                            class94.method604(class127.field2238.field2294, "loggedin", 27972);
                        } catch (Throwable var8) {
                        }
                        class87.field1558 = class248.field4058.method204(8);
                        class101.field1747 = class248.field4058.method677(false);
                        class295.field4691 = 9;
                    }
                    if (class295.field4691 == 9 && class194.field3131.method1386(true) >= class101.field1747) {
                        class248.field4058.field1762 = 0;
                        class194.field3131.method1390(class101.field1747, 0, class248.field4058.field1730, true);
                        class295.field4691 = 0;
                        class6.field73 = 2;
                        class262.method1735(0);
                        class96.field1654 = -1;
                        class73.method441(false, -83);
                        class87.field1558 = -1;
                    }
                } else if (class194.field3131.method1386(true) >= 1) {
                    class74.field1222 = class194.field3131.method1377(-128);
                    class295.field4691 = 0;
                    class6.field73 = 29;
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                }
            }
        } catch (IOException var11) {
            if (class194.field3131 != null) {
                class194.field3131.method1380(true);
                class194.field3131 = null;
            }
            if (class122.field2160 < 1) {
                class122.field2160++;
                class295.field4691 = 1;
                if (class4.field47 == class262.field4277) {
                    class4.field47 = class267.field4323;
                } else {
                    class4.field47 = class262.field4277;
                }
                class53.field926 = 0;
            } else {
                class295.field4691 = 0;
                class6.field73 = -4;
            }
        }
    }
}
