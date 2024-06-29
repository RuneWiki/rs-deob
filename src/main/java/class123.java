import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class123 extends class184 {

    @OriginalMember(owner = "client!nf", name = "Fc", descriptor = "I")
    public int field2401 = -1;

    @OriginalMember(owner = "client!nf", name = "Nc", descriptor = "I")
    public int field2409 = 0;

    @OriginalMember(owner = "client!nf", name = "Uc", descriptor = "Z")
    public boolean field2416 = false;

    @OriginalMember(owner = "client!nf", name = "Vc", descriptor = "I")
    public int field2417 = 0;

    @OriginalMember(owner = "client!nf", name = "Hc", descriptor = "I")
    public int field2403 = -1;

    @OriginalMember(owner = "client!nf", name = "bd", descriptor = "I")
    public int field2423 = 0;

    @OriginalMember(owner = "client!nf", name = "Zc", descriptor = "I")
    public int field2421 = 0;

    @OriginalMember(owner = "client!nf", name = "Ic", descriptor = "I")
    public int field2404 = 0;

    @OriginalMember(owner = "client!nf", name = "Kc", descriptor = "Lsd;")
    public static class166 field2406 = class135.method935("<img=1>", 0);

    @OriginalMember(owner = "client!nf", name = "Mc", descriptor = "[I")
    public static int[] field2408 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!nf", name = "Wc", descriptor = "I")
    public static int field2418 = -1;

    @OriginalMember(owner = "client!nf", name = "Cc", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!nf", name = "Dc", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!nf", name = "Ec", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!nf", name = "Gc", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!nf", name = "Lc", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!nf", name = "Oc", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!nf", name = "Pc", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!nf", name = "Rc", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!nf", name = "Sc", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!nf", name = "Tc", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!nf", name = "Xc", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!nf", name = "Yc", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!nf", name = "ad", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!nf", name = "dd", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!nf", name = "cd", descriptor = "Lmc;")
    public class111 field2424;

    @OriginalMember(owner = "client!nf", name = "Jc", descriptor = "Lo;")
    public class126 field2405;

    @OriginalMember(owner = "client!nf", name = "Qc", descriptor = "Lsd;")
    public class166 field2412;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
    public static final void method880(byte arg0, int arg1) {
        if (~arg1 == 0 && !class49.field913) {
            class28.method203(1);
        } else if (~arg1 != 0 && (class185.field3567 != arg1 || !class143.method977((byte) 90)) && class79.field1622 != 0 && !class49.field913) {
            class63.method527(arg1, class79.field1622, class11.field213, 2, -99, false, 0);
        }
        class185.field3567 = arg1;
        if (arg0 != 78) {
            method884(42);
        }
        ++field2420;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method881(boolean arg0) {
        if (!arg0) {
            field2408 = null;
            field2406 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "(I)V")
    public static final void method882(int arg0) {
        class196.field3898 = new int[33];
        class32.field594 = new int[151];
        ++field2413;
        class100.field1908 = new int[151];
        class172.field3297 = new int[33];
        for (int var1 = 0; ~var1 > -34; ++var1) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; ~var8 > -35; ++var8) {
                if (class95.field1832.field1855[class95.field1832.field1852 * var1 + var8] != 0) {
                    if (var6 != 999) {
                        var7 = var8;
                        break;
                    }
                } else if (~var6 == -1000) {
                    var6 = var8;
                }
            }
            class196.field3898[var1] = var6;
            class172.field3297[var1] = var7 - var6;
        }
        if (arg0 == 5464) {
            for (int var2 = 5; var2 < 156; ++var2) {
                int var3 = 999;
                int var4 = 0;
                for (int var5 = 25; ~var5 > -173; ++var5) {
                    if (~class95.field1832.field1855[var5 - -(class95.field1832.field1852 * var2)] != -1 || var5 <= 34 && ~var2 >= -35) {
                        if (var3 != 999) {
                            var4 = var5;
                            break;
                        }
                    } else if (~var3 == -1000) {
                        var3 = var5;
                    }
                }
                class100.field1908[var2 - 5] = var3 + -25;
                class32.field594[var2 + -5] = -var3 + var4;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lff;I)V")
    public final void method883(class53 arg0, int arg1) {
        arg0.field1000 = 0;
        ++field2414;
        int var3 = arg0.method400(255);
        this.field2403 = arg0.method388(-29381);
        int[] var4 = new int[12];
        this.field2401 = arg0.method388(-29381);
        int var5 = -1;
        this.field2417 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method400(255);
            if (~var7 == -1) {
                var4[var6] = 0;
            } else {
                int var8 = arg0.method400(255);
                var4[var6] = (var7 << 8) + var8;
                if (~var6 == -1 && ~var4[0] == -65536) {
                    var5 = arg0.method405(2);
                    break;
                }
                if (var4[var6] >= 512) {
                    int var12 = class3.method19(var4[var6] + -512, true).field1145;
                    if (~var12 != -1) {
                        this.field2417 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg0.method400(arg1 ^ -255);
            if (var11 < 0 || var11 >= class5.field113[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field3507 = arg0.method405(2);
        if (~super.field3507 == -65536) {
            super.field3507 = -1;
        }
        super.field3525 = arg0.method405(2);
        if (super.field3525 == 65535) {
            super.field3525 = -1;
        }
        super.field3492 = super.field3525;
        super.field3508 = arg0.method405(2);
        if (~super.field3508 == -65536) {
            super.field3508 = -1;
        }
        super.field3516 = arg0.method405(2);
        if (super.field3516 == 65535) {
            super.field3516 = -1;
        }
        super.field3496 = arg0.method405(arg1 + 4);
        if (~super.field3496 == -65536) {
            super.field3496 = -1;
        }
        super.field3539 = arg0.method405(2);
        if (~super.field3539 == -65536) {
            super.field3539 = -1;
        }
        super.field3542 = arg0.method405(arg1 ^ -4);
        if (super.field3542 == 65535) {
            super.field3542 = -1;
        }
        this.field2412 = class191.method1278(37, arg0.method385((byte) -62)).method1159(arg1 ^ 70);
        this.field2421 = arg0.method400(255);
        this.field2409 = arg0.method405(2);
        if (this.field2424 == null) {
            this.field2424 = new class111();
        }
        this.field2424.method799(var4, ~var3 == arg1, var9, arg1 ^ 58, var5);
    }

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "(I)V")
    public static final void method884(int arg0) {
        if (~class106.field2074 < -2) {
            --class106.field2074;
        }
        ++field2422;
        if (~class48.field887 < -1) {
            --class48.field887;
        }
        if (class16.field278) {
            class16.field278 = false;
            class10.method58(true);
        } else {
            for (int var1 = 0; var1 < 100 && class174.method1195(true); ++var1) {
            }
            if (~client.field520 == -31) {
                class189.method1271(163, class156.field2989, true);
                Object var2 = class99.field1888.field2223;
                synchronized (class99.field1888.field2223) {
                    if (!class121.field2379) {
                        class99.field1888.field2226 = 0;
                    } else if (class2.field18 != 0 || class99.field1888.field2226 >= 40) {
                        class156.field2989.method705(119, (byte) 9);
                        ++class93.field1821;
                        class156.field2989.method429(0, (byte) 81);
                        int var3 = 0;
                        int var4 = class156.field2989.field1000;
                        for (int var5 = 0; var5 < class99.field1888.field2226 && -var4 + class156.field2989.field1000 < 240; ++var5) {
                            ++var3;
                            int var6 = class99.field1888.field2225[var5];
                            int var7 = class99.field1888.field2224[var5];
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (~var7 < -765) {
                                var7 = 764;
                            }
                            if (var6 >= 0) {
                                if (~var6 < -503) {
                                    var6 = 502;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var8 = var6 * 765 + var7;
                            if (~class99.field1888.field2225[var5] == 0 && class99.field1888.field2224[var5] == -1) {
                                var7 = -1;
                                var6 = -1;
                                var8 = 524287;
                            }
                            if (~class196.field3878 == ~var7 && class51.field924 == var6) {
                                if (class193.field3772 < 2047) {
                                    ++class193.field3772;
                                }
                            } else {
                                int var9 = var7 - class196.field3878;
                                class196.field3878 = var7;
                                int var10 = -class51.field924 + var6;
                                class51.field924 = var6;
                                if (class193.field3772 < 8 && ~var9 <= 31 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                                    var9 += 32;
                                    var10 += 32;
                                    class156.field2989.method407((byte) -123, (var9 << 6) + (class193.field3772 << 12) + var10);
                                    class193.field3772 = 0;
                                } else if (class193.field3772 < 8) {
                                    class156.field2989.method392(arg0 ^ 17121, (class193.field3772 << 19) + 8388608 + var8);
                                    class193.field3772 = 0;
                                } else {
                                    class156.field2989.method438(423055928, -1073741824 - -(class193.field3772 << 19) - -var8);
                                    class193.field3772 = 0;
                                }
                            }
                        }
                        class156.field2989.method408(-var4 + class156.field2989.field1000, -1);
                        if (~class99.field1888.field2226 < ~var3) {
                            class99.field1888.field2226 -= var3;
                            for (int var11 = 0; var11 < class99.field1888.field2226; ++var11) {
                                class99.field1888.field2224[var11] = class99.field1888.field2224[var3 + var11];
                                class99.field1888.field2225[var11] = class99.field1888.field2225[var11 - -var3];
                            }
                        } else {
                            class99.field1888.field2226 = 0;
                        }
                    }
                }
                if (~class2.field18 != -1) {
                    ++class176.field3336;
                    long var12 = (class139.field2727 - class145.field2830) / 50L;
                    class145.field2830 = class139.field2727;
                    if (~var12 < -4096L) {
                        var12 = 4095L;
                    }
                    int var14 = class69.field1409;
                    if (var14 >= 0) {
                        if (~var14 < -765) {
                            var14 = 764;
                        }
                    } else {
                        var14 = 0;
                    }
                    int var15 = class57.field1174;
                    byte var16 = 0;
                    if (~class2.field18 == -3) {
                        var16 = 1;
                    }
                    class156.field2989.method705(221, (byte) 9);
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -503) {
                        var15 = 502;
                    }
                    int var17 = var15 * 765 - -var14;
                    int var18 = (int) var12;
                    class156.field2989.method390((byte) -26, (var18 << 20) + var17 - -(var16 << 19));
                }
                if (class147.field2900 > 0) {
                    --class147.field2900;
                }
                if (class195.field3859[96] || class195.field3859[97] || class195.field3859[98] || class195.field3859[99]) {
                    class48.field891 = true;
                }
                if (class48.field891 && ~class147.field2900 >= -1) {
                    ++class147.field2891;
                    class147.field2900 = 20;
                    class48.field891 = false;
                    class156.field2989.method705(98, (byte) 9);
                    class156.field2989.method399(113, client.field515);
                    class156.field2989.method409((byte) -26, class95.field1833);
                }
                if (class172.field3288 && !class111.field2149) {
                    ++class72.field1422;
                    class111.field2149 = true;
                    class156.field2989.method705(210, (byte) 9);
                    class156.field2989.method429(1, (byte) 100);
                }
                if (!class172.field3288 && class111.field2149) {
                    class111.field2149 = false;
                    ++class72.field1422;
                    class156.field2989.method705(210, (byte) 9);
                    class156.field2989.method429(0, (byte) 97);
                }
                class29.method226(-95);
                if (~client.field520 == -31) {
                    class177.method1203(-103);
                    class190.method1272(arg0 + 6313);
                    ++class112.field2195;
                    if (class112.field2195 > 750) {
                        class10.method58(true);
                    } else {
                        class111.method810(arg0 + 17250);
                        class56.method461(19718);
                        class42.method291(arg0 + 17131);
                        if (class194.field3842 != 0) {
                            class86.field1716 += 20;
                            if (~class86.field1716 <= -401) {
                                class194.field3842 = 0;
                            }
                        }
                        ++class187.field3570;
                        if (class23.field399 != null) {
                            ++class112.field2175;
                            if (~class112.field2175 <= -16) {
                                class68.method550(class23.field399, 15);
                                class23.field399 = null;
                            }
                        }
                        if (class156.field2979 != null) {
                            class68.method550(class156.field2979, 15);
                            if (class41.field734 > class34.field650 + 5 || ~class41.field734 > ~(class34.field650 + -5) || ~(class37.field673 + 5) > ~class5.field110 || ~(class37.field673 - 5) < ~class5.field110) {
                                class125.field2457 = true;
                            }
                            ++class134.field2597;
                            if (~class51.field929 == -1) {
                                if (class125.field2457 && ~class134.field2597 <= -6) {
                                    if (class9.field184 == class156.field2979 && client.field514 != class89.field1752) {
                                        ++class189.field3605;
                                        class193 var19 = class156.field2979;
                                        byte var20 = 0;
                                        if (class200.field3963 == 1 && ~var19.field3823 == -207) {
                                            var20 = 1;
                                        }
                                        if (var19.field3755[client.field514] <= 0) {
                                            var20 = 0;
                                        }
                                        if (class19.method121(-122, class140.method955(-30, var19))) {
                                            int var21 = client.field514;
                                            int var22 = class89.field1752;
                                            var19.field3755[var21] = var19.field3755[var22];
                                            var19.field3760[var21] = var19.field3760[var22];
                                            var19.field3755[var22] = -1;
                                            var19.field3760[var22] = 0;
                                        } else if (~var20 == -2) {
                                            int var23 = client.field514;
                                            int var24 = class89.field1752;
                                            while (var23 != var24) {
                                                if (var24 <= var23) {
                                                    if (~var24 > ~var23) {
                                                        var19.method1288(var24, (byte) 101, var24 + 1);
                                                        ++var24;
                                                    }
                                                } else {
                                                    var19.method1288(var24, (byte) 102, var24 + -1);
                                                    --var24;
                                                }
                                            }
                                        } else {
                                            var19.method1288(class89.field1752, (byte) 83, client.field514);
                                        }
                                        class156.field2989.method705(251, (byte) 9);
                                        class156.field2989.method403(class156.field2979.field3715, true);
                                        class156.field2989.method407((byte) -125, client.field514);
                                        class156.field2989.method407((byte) -123, class89.field1752);
                                        class156.field2989.method404(var20, true);
                                    }
                                } else if ((class140.field2733 == 1 || class176.method1200((byte) -36, class160.field3064 + -1)) && class160.field3064 > 2) {
                                    class199.method1309((byte) 73);
                                } else if (class160.field3064 > 0) {
                                    class84.method677(class160.field3064 + -1, arg0 + 17133);
                                }
                                class156.field2979 = null;
                                class2.field18 = 0;
                                class112.field2175 = 10;
                            }
                        }
                        class46.field829 = 0;
                        class97.field1863 = false;
                        class116.field2249 = false;
                        class193 var25 = class160.field3065;
                        class16.field271 = null;
                        class193 var26 = class3.field34;
                        class3.field34 = null;
                        class160.field3065 = null;
                        while (class10.method60(-1) && class46.field829 < 128) {
                            class41.field736[class46.field829] = class77.field1586;
                            class175.field3319[class46.field829] = class34.field644;
                            ++class46.field829;
                        }
                        class90.method709(class146.field2884, 503, arg0 ^ 17130, 0, 0, 0, 0, 765);
                        ++class95.field1844;
                        while (true) {
                            class137 var27;
                            class193 var28;
                            class193 var29;
                            do {
                                var27 = (class137) class51.field921.method1114(true);
                                if (var27 == null) {
                                    while (true) {
                                        class137 var30;
                                        class193 var31;
                                        class193 var32;
                                        do {
                                            var30 = (class137) class19.field329.method1114(true);
                                            if (var30 == null) {
                                                while (true) {
                                                    class137 var33;
                                                    class193 var34;
                                                    class193 var35;
                                                    do {
                                                        var33 = (class137) class5.field107.method1114(true);
                                                        if (var33 == null) {
                                                            if (class18.field298 != null) {
                                                                class18.method114(-21713);
                                                            }
                                                            if (~class73.field1446 != 0) {
                                                                int var36 = class73.field1446;
                                                                int var37 = class73.field1472;
                                                                boolean var38 = class6.method39(class41.field728.field3521[0], 0, 0, 0, (byte) -124, var37, true, var36, 0, 0, class41.field728.field3554[0], 0);
                                                                class73.field1446 = -1;
                                                                if (var38) {
                                                                    class194.field3849 = class69.field1409;
                                                                    class86.field1716 = 0;
                                                                    class184.field3544 = class57.field1174;
                                                                    class194.field3842 = 1;
                                                                }
                                                            }
                                                            class64.method533(true);
                                                            if (class160.field3065 != var25) {
                                                                if (var25 != null) {
                                                                    class68.method550(var25, 15);
                                                                }
                                                                if (class160.field3065 != null) {
                                                                    class68.method550(class160.field3065, 15);
                                                                }
                                                            }
                                                            if (class3.field34 != var26 && ~class162.field3092 == ~class127.field2505) {
                                                                if (var26 != null) {
                                                                    class68.method550(var26, 15);
                                                                }
                                                                if (class3.field34 != null) {
                                                                    class68.method550(class3.field34, 15);
                                                                }
                                                            }
                                                            if (class3.field34 == null) {
                                                                if (~class162.field3092 < -1) {
                                                                    --class162.field3092;
                                                                }
                                                            } else if (class127.field2505 > class162.field3092) {
                                                                ++class162.field3092;
                                                                if (class162.field3092 == class127.field2505) {
                                                                    class68.method550(class3.field34, 15);
                                                                }
                                                            }
                                                            class136.method944(-116);
                                                            if (class25.field446) {
                                                                class63.method532(arg0 + 17139);
                                                            }
                                                            for (int var39 = 0; ~var39 > -6; ++var39) {
                                                                int var10002 = class48.field894[var39]++;
                                                            }
                                                            int var40 = class191.method1276((byte) -110);
                                                            int var41 = class179.method1212((byte) 92);
                                                            if (~var40 < -4501 && var41 > 4500) {
                                                                class48.field887 = 250;
                                                                class52.method384(4000, arg0 + 17251);
                                                                ++class169.field3248;
                                                                class156.field2989.method705(38, (byte) 9);
                                                            }
                                                            ++class111.field2145;
                                                            ++class127.field2498;
                                                            ++class109.field2117;
                                                            if (~class127.field2498 < -501) {
                                                                int var42 = (int) (8.0D * Math.random());
                                                                if ((1 & var42) == 1) {
                                                                    class169.field3245 += class184.field3498;
                                                                }
                                                                if ((var42 & 4) == 4) {
                                                                    class89.field1756 += class27.field470;
                                                                }
                                                                class127.field2498 = 0;
                                                                if (~(var42 & 2) == -3) {
                                                                    class136.field2660 += class193.field3839;
                                                                }
                                                            }
                                                            if (~class109.field2117 < -501) {
                                                                class109.field2117 = 0;
                                                                int var43 = (int) (8.0D * Math.random());
                                                                if ((1 & var43) == 1) {
                                                                    class132.field2590 += class164.field3118;
                                                                }
                                                                if ((2 & var43) == 2) {
                                                                    class193.field3731 += class191.field3630;
                                                                }
                                                            }
                                                            if (~class136.field2660 > 54) {
                                                                class193.field3839 = 2;
                                                            }
                                                            if (~class193.field3731 > 19) {
                                                                class191.field3630 = 1;
                                                            }
                                                            if (class136.field2660 > 55) {
                                                                class193.field3839 = -2;
                                                            }
                                                            if (class169.field3245 < -50) {
                                                                class184.field3498 = 2;
                                                            }
                                                            if (class89.field1756 < -40) {
                                                                class27.field470 = 1;
                                                            }
                                                            if (class169.field3245 > 50) {
                                                                class184.field3498 = -2;
                                                            }
                                                            if (~class132.field2590 > 59) {
                                                                class164.field3118 = 2;
                                                            }
                                                            if (class132.field2590 > 60) {
                                                                class164.field3118 = -2;
                                                            }
                                                            if (~class193.field3731 < -11) {
                                                                class191.field3630 = -1;
                                                            }
                                                            if (~class89.field1756 < -41) {
                                                                class27.field470 = -1;
                                                            }
                                                            if (~class111.field2145 < -51) {
                                                                ++class157.field3000;
                                                                class156.field2989.method705(118, (byte) 9);
                                                            }
                                                            if (arg0 != -17131) {
                                                                field2408 = null;
                                                            }
                                                            try {
                                                                if (class47.field861 != null && ~class156.field2989.field1000 < -1) {
                                                                    class47.field861.method15(class156.field2989.field1000, 0, (byte) -68, class156.field2989.field988);
                                                                    class111.field2145 = 0;
                                                                    class156.field2989.field1000 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var44) {
                                                                class10.method58(true);
                                                                return;
                                                            }
                                                        }
                                                        var34 = var33.field2673;
                                                        if (~var34.field3716 > -1) {
                                                            break;
                                                        }
                                                        var35 = class90.method701(-31355, var34.field3762);
                                                    } while (var35 == null || var35.field3829 == null || ~var34.field3716 <= ~var35.field3829.length || var35.field3829[var34.field3716] != var34);
                                                    class166.method1126((byte) -113, var33);
                                                }
                                            }
                                            var31 = var30.field2673;
                                            if (var31.field3716 < 0) {
                                                break;
                                            }
                                            var32 = class90.method701(-31355, var31.field3762);
                                        } while (var32 == null || var32.field3829 == null || var31.field3716 >= var32.field3829.length || var32.field3829[var31.field3716] != var31);
                                        class166.method1126((byte) -113, var30);
                                    }
                                }
                                var28 = var27.field2673;
                                if (var28.field3716 < 0) {
                                    break;
                                }
                                var29 = class90.method701(-31355, var28.field3762);
                            } while (var29 == null || var29.field3829 == null || var29.field3829.length <= var28.field3716 || var29.field3829[var28.field3716] != var28);
                            class166.method1126((byte) -113, var27);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2410;
        if (this.field2424 != null) {
            class62 var10 = ~super.field3543 != 0 && ~super.field3530 == -1 ? class110.method798(super.field3543, 12) : null;
            class62 var11 = super.field3491 == -1 || this.field2416 || super.field3507 == super.field3491 && var10 != null ? null : class110.method798(super.field3491, 12);
            class126 var12 = this.field2424.method800(-513, super.field3529, var10, var11, super.field3531);
            if (var12 != null) {
                class126 var13 = null;
                if (!this.field2416 && ~super.field3501 != 0 && ~super.field3550 != 0) {
                    var13 = class12.method77(super.field3501, 13).method843((byte) 117, super.field3550);
                    if (var13 != null) {
                        var13.method895(0, -super.field3511, 0);
                    }
                }
                class126 var14 = null;
                if (!this.field2416 && this.field2405 != null) {
                    if (~class49.field910 <= ~this.field2423) {
                        this.field2405 = null;
                    }
                    if (~class49.field910 <= ~this.field2404 && ~class49.field910 > ~this.field2423) {
                        var14 = this.field2405;
                        var14.method895(this.field2399 - super.field3526, -this.field2411 + this.field2419, -super.field3513 + this.field2425);
                        if (super.field3489 != 512) {
                            if (~super.field3489 != -1025) {
                                if (~super.field3489 == -1537) {
                                    var14.method902();
                                }
                            } else {
                                var14.method902();
                                var14.method902();
                            }
                        } else {
                            var14.method902();
                            var14.method902();
                            var14.method902();
                        }
                    }
                }
                if (var13 != null) {
                    var12 = ((class118) var12).method844(var13);
                }
                if (var14 != null) {
                    var12 = ((class118) var12).method844(var14);
                }
                var12.field2484 = true;
                var12.method290(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                super.field756 = var12.field756;
                if (var14 != null) {
                    if (super.field3489 == 512) {
                        var14.method902();
                    } else if (~super.field3489 != -1025) {
                        if (~super.field3489 == -1537) {
                            var14.method902();
                            var14.method902();
                            var14.method902();
                        }
                    } else {
                        var14.method902();
                        var14.method902();
                    }
                    var14.method895(super.field3526 - this.field2399, -this.field2419 + this.field2411, -this.field2425 + super.field3513);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "(I)Z")
    public final boolean method885(int arg0) {
        ++field2402;
        if (this.field2424 == null) {
            return false;
        } else {
            return arg0 != 5 ? true : true;
        }
    }
}
