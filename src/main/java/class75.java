import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class75 extends class189 {

    @OriginalMember(owner = "client!ia", name = "pb", descriptor = "I")
    private int field1850 = 0;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "I")
    private int field1843 = 0;

    @OriginalMember(owner = "client!ia", name = "zb", descriptor = "I")
    private int field1860 = 0;

    @OriginalMember(owner = "client!ia", name = "nb", descriptor = "Lgg;")
    public static class63 field1848 = class116.method911(43, "scrollen:");

    @OriginalMember(owner = "client!ia", name = "mb", descriptor = "Lgg;")
    public static class63 field1847 = class116.method911(43, "<col=ff0000>");

    @OriginalMember(owner = "client!ia", name = "ub", descriptor = "Lgg;")
    public static class63 field1855 = class116.method911(43, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!ia", name = "vb", descriptor = "Lgg;")
    public static class63 field1856 = class116.method911(43, "Hidden)2");

    @OriginalMember(owner = "client!ia", name = "yb", descriptor = "Lgg;")
    public static class63 field1859 = class116.method911(43, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!ia", name = "rb", descriptor = "I")
    public static volatile int field1852 = 0;

    @OriginalMember(owner = "client!ia", name = "sb", descriptor = "Lgg;")
    private static class63 field1853 = class116.method911(43, "Continue");

    @OriginalMember(owner = "client!ia", name = "kb", descriptor = "Lgg;")
    public static class63 field1845 = class116.method911(43, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!ia", name = "Bb", descriptor = "Lgg;")
    public static class63 field1862 = field1853;

    @OriginalMember(owner = "client!ia", name = "Hb", descriptor = "I")
    private static int field1868 = 0;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    private int field1841;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ia", name = "lb", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ia", name = "ob", descriptor = "I")
    private int field1849;

    @OriginalMember(owner = "client!ia", name = "qb", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ia", name = "tb", descriptor = "I")
    private int field1854;

    @OriginalMember(owner = "client!ia", name = "wb", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!ia", name = "xb", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ia", name = "Cb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ia", name = "Db", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!ia", name = "Eb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
    private int field1866;

    @OriginalMember(owner = "client!ia", name = "Gb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ia", name = "Ab", descriptor = "Lpa;")
    public static class136 field1861;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Ljc;")
    public static class85 field1842;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
    private final void method685(int arg0, int arg1, int arg2, int arg3) {
        ++field1865;
        int var5 = ~arg2 <= ~arg3 ? arg2 : arg3;
        int var6 = ~arg1 < ~var5 ? arg1 : var5;
        int var7 = ~arg2 < ~arg3 ? arg3 : arg2;
        int var8 = arg1 < var7 ? arg1 : var7;
        int var9 = var6 - var8;
        this.field1841 = (var8 - -var6) / 2;
        if (arg0 == 1414) {
            if (var9 > 0) {
                int var10 = (-arg2 + var6 << 12) / var9;
                int var11 = (-arg3 + var6 << 12) / var9;
                if (this.field1841 > 0 && this.field1841 < 4096) {
                    this.field1854 = (var9 << 12) / (this.field1841 <= 2048 ? this.field1841 * 2 : -(this.field1841 * 2) + 8192);
                }
                int var12 = (-arg1 + var6 << 12) / var9;
                if (~arg3 == ~var6) {
                    this.field1864 = arg2 != var8 ? 4096 - var10 : var12 + 20480;
                } else if (~arg2 == ~var6) {
                    this.field1864 = arg1 != var8 ? -var12 + 12288 : var11 + 4096;
                } else {
                    this.field1864 = arg3 == var8 ? var10 + 12288 : -var11 + 20480;
                }
                this.field1864 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZII)V")
    private final void method686(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.field1864 = 113;
        }
        int var5 = ~arg2 < -2049 ? arg2 + arg3 + -(arg2 * arg3 >> 12) : (arg3 + 4096) * arg2 >> 12;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg2 - (-arg2 + var5);
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = -var13 + var5;
            int var15 = var7 + var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field1866 = var7;
                                    this.field1857 = var5;
                                    this.field1849 = var14;
                                }
                            } else {
                                this.field1857 = var15;
                                this.field1849 = var5;
                                this.field1866 = var7;
                            }
                        } else {
                            this.field1849 = var5;
                            this.field1857 = var7;
                            this.field1866 = var14;
                        }
                    } else {
                        this.field1857 = var7;
                        this.field1849 = var15;
                        this.field1866 = var5;
                    }
                } else {
                    this.field1866 = var5;
                    this.field1857 = var14;
                    this.field1849 = var7;
                }
            } else {
                this.field1857 = var5;
                this.field1866 = var15;
                this.field1849 = var7;
            }
        } else {
            this.field1857 = this.field1866 = this.field1849 = arg2;
        }
        ++field1844;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)Z")
    public static final boolean method687(int arg0, int arg1) {
        if (arg1 != 0) {
            return false;
        } else {
            ++field1863;
            return (arg0 & 1) != 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILoe;I)V")
    public static final void method688(int arg0, class131 arg1, int arg2) {
        ++field1851;
        Object[] var3 = arg1.field2853;
        int var4 = (Integer) var3[0];
        class117 var5 = class150.method1053(-9897, var4);
        if (var5 != null) {
            int var6 = 0;
            field1868 = 0;
            int var7 = 0;
            int var8 = -1;
            int[] var9 = var5.field2611;
            if (arg0 <= -103) {
                int[] var10 = var5.field2619;
                byte var11 = -1;
                try {
                    class110.field2482 = new int[var5.field2610];
                    int var12 = 0;
                    class17.field418 = new class63[var5.field2614];
                    int var13 = 0;
                    for (int var14 = 1; var14 < var3.length; ++var14) {
                        if (!(var3[var14] instanceof Integer)) {
                            if (var3[var14] instanceof class63) {
                                class63 var15 = (class63) var3[var14];
                                if (var15.method568(class112.field2524, (byte) -127)) {
                                    var15 = arg1.field2861;
                                }
                                class17.field418[var13++] = var15;
                            }
                        } else {
                            int var16 = (Integer) var3[var14];
                            if (~var16 == 2147483646) {
                                var16 = arg1.field2854;
                            }
                            if (~var16 == 2147483645) {
                                var16 = arg1.field2856;
                            }
                            if (var16 == -2147483645) {
                                var16 = arg1.field2862 != null ? arg1.field2862.field1323 : -1;
                            }
                            if (~var16 == 2147483643) {
                                var16 = arg1.field2857;
                            }
                            if (var16 == -2147483643) {
                                var16 = arg1.field2862 != null ? arg1.field2862.field1408 : -1;
                            }
                            if (var16 == -2147483642) {
                                var16 = arg1.field2848 == null ? -1 : arg1.field2848.field1323;
                            }
                            if (~var16 == 2147483640) {
                                var16 = arg1.field2848 == null ? -1 : arg1.field2848.field1408;
                            }
                            if (var16 == -2147483640) {
                                var16 = arg1.field2863;
                            }
                            if (var16 == -2147483639) {
                                var16 = arg1.field2850;
                            }
                            class110.field2482[var12++] = var16;
                        }
                    }
                    int var17 = 0;
                    label2216: while (true) {
                        ++var17;
                        if (var17 > arg2) {
                            throw new RuntimeException("slow");
                        }
                        ++var8;
                        int var316 = var9[var8];
                        if (~var316 > -101) {
                            if (var316 == 0) {
                                class190.field3862[var7++] = var10[var8];
                                continue;
                            }
                            if (~var316 == -2) {
                                int var18 = var10[var8];
                                class190.field3862[var7++] = class24.field545[var18];
                                continue;
                            }
                            if (var316 == 2) {
                                int var19 = var10[var8];
                                --var7;
                                class24.field545[var19] = class190.field3862[var7];
                                continue;
                            }
                            if (var316 == 3) {
                                class11.field255[var6++] = var5.field2613[var8];
                                continue;
                            }
                            if (~var316 == -7) {
                                var8 += var10[var8];
                                continue;
                            }
                            if (var316 == 7) {
                                var7 -= 2;
                                if (class190.field3862[var7 + 1] != class190.field3862[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var316 == 8) {
                                var7 -= 2;
                                if (class190.field3862[var7 - -1] == class190.field3862[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var316 == 9) {
                                var7 -= 2;
                                if (class190.field3862[var7] < class190.field3862[var7 - -1]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var316 == 10) {
                                var7 -= 2;
                                if (~class190.field3862[var7 - -1] > ~class190.field3862[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (~var316 == -22) {
                                if (field1868 == 0) {
                                    return;
                                }
                                class129 var20 = class51.field1249[--field1868];
                                var8 = var20.field2829;
                                class110.field2482 = var20.field2815;
                                class17.field418 = var20.field2828;
                                var5 = var20.field2824;
                                var10 = var5.field2619;
                                var9 = var5.field2611;
                                continue;
                            }
                            if (~var316 == -26) {
                                int var21 = var10[var8];
                                class190.field3862[var7++] = class27.method264((byte) 20, var21);
                                continue;
                            }
                            if (~var316 == -28) {
                                int var22 = var10[var8];
                                --var7;
                                class28.method279(class190.field3862[var7], 94, var22);
                                continue;
                            }
                            if (~var316 == -32) {
                                var7 -= 2;
                                if (~class190.field3862[var7 + 1] <= ~class190.field3862[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (~var316 == -33) {
                                var7 -= 2;
                                if (class190.field3862[var7 + 1] <= class190.field3862[var7]) {
                                    var8 += var10[var8];
                                }
                                continue;
                            }
                            if (var316 == 33) {
                                class190.field3862[var7++] = class110.field2482[var10[var8]];
                                continue;
                            }
                            int var10001;
                            if (~var316 == -35) {
                                var10001 = var10[var8];
                                --var7;
                                class110.field2482[var10001] = class190.field3862[var7];
                                continue;
                            }
                            if (var316 == 35) {
                                class11.field255[var6++] = class17.field418[var10[var8]];
                                continue;
                            }
                            if (~var316 == -37) {
                                var10001 = var10[var8];
                                --var6;
                                class17.field418[var10001] = class11.field255[var6];
                                continue;
                            }
                            if (~var316 == -38) {
                                int var23 = var10[var8];
                                var6 -= var23;
                                class63 var24 = class16.method176(var6, var23, (byte) -117, class11.field255);
                                class11.field255[var6++] = var24;
                                continue;
                            }
                            if (~var316 == -39) {
                                --var7;
                                continue;
                            }
                            if (var316 == 39) {
                                --var6;
                                continue;
                            }
                            if (var316 == 40) {
                                int var25 = var10[var8];
                                class117 var26 = class150.method1053(-9897, var25);
                                class63[] var27 = new class63[var26.field2614];
                                int[] var28 = new int[var26.field2610];
                                for (int var29 = 0; var26.field2621 > var29; ++var29) {
                                    var28[var29] = class190.field3862[-var26.field2621 + var7 - -var29];
                                }
                                for (int var30 = 0; var26.field2616 > var30; ++var30) {
                                    var27[var30] = class11.field255[var6 - (-var30 + var26.field2616)];
                                }
                                var6 -= var26.field2616;
                                var7 -= var26.field2621;
                                class129 var31 = new class129();
                                var31.field2815 = class110.field2482;
                                var31.field2824 = var5;
                                var31.field2828 = class17.field418;
                                var31.field2829 = var8;
                                if (class51.field1249.length <= field1868) {
                                    throw new RuntimeException();
                                }
                                var5 = var26;
                                var8 = -1;
                                class51.field1249[field1868++] = var31;
                                var9 = var26.field2611;
                                class17.field418 = var27;
                                var10 = var26.field2619;
                                class110.field2482 = var28;
                                continue;
                            }
                            if (var316 == 42) {
                                class190.field3862[var7++] = class64.field1640[var10[var8]];
                                continue;
                            }
                            if (var316 == 43) {
                                var10001 = var10[var8];
                                --var7;
                                class64.field1640[var10001] = class190.field3862[var7];
                                continue;
                            }
                            if (~var316 == -45) {
                                int var32 = var10[var8] & 65535;
                                int var33 = var10[var8] >> 16;
                                --var7;
                                int var34 = class190.field3862[var7];
                                if (var34 >= 0 && var34 <= 5000) {
                                    class114.field2556[var33] = var34;
                                    byte var35 = -1;
                                    if (~var32 == -106) {
                                        var35 = 0;
                                    }
                                    int var36 = 0;
                                    while (true) {
                                        if (var34 <= var36) {
                                            continue label2216;
                                        }
                                        class106.field2423[var33][var36] = var35;
                                        ++var36;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            if (~var316 == -46) {
                                int var37 = var10[var8];
                                --var7;
                                int var38 = class190.field3862[var7];
                                if (var38 >= 0 && var38 < class114.field2556[var37]) {
                                    class190.field3862[var7++] = class106.field2423[var37][var38];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (~var316 == -47) {
                                var7 -= 2;
                                int var39 = var10[var8];
                                int var40 = class190.field3862[var7];
                                if (var40 >= 0 && ~var40 > ~class114.field2556[var39]) {
                                    class106.field2423[var39][var40] = class190.field3862[var7 + 1];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (~var316 == -48) {
                                class63 var41 = class51.field1258[var10[var8]];
                                if (var41 == null) {
                                    var41 = class73.field1816;
                                }
                                class11.field255[var6++] = var41;
                                continue;
                            }
                            if (var316 == 48) {
                                var10001 = var10[var8];
                                --var6;
                                class51.field1258[var10001] = class11.field255[var6];
                                continue;
                            }
                        }
                        boolean var42;
                        if (var10[var8] != 1) {
                            var42 = false;
                        } else {
                            var42 = true;
                        }
                        if (var316 >= 300) {
                            if (~var316 <= -501) {
                                if (var316 >= 1000 && ~var316 > -1101 || ~var316 <= -2001 && ~var316 > -2101) {
                                    class54 var43;
                                    if (~var316 > -2001) {
                                        var43 = !var42 ? class187.field3776 : class117.field2623;
                                    } else {
                                        var316 -= 1000;
                                        --var7;
                                        var43 = class59.method555(class190.field3862[var7], 32173);
                                    }
                                    if (~var316 == -1001) {
                                        var7 -= 2;
                                        var43.field1333 = class190.field3862[var7];
                                        var43.field1304 = class190.field3862[var7 + 1];
                                        class113.method901(0, var43);
                                        continue;
                                    }
                                    if (var316 == 1001) {
                                        var7 -= 2;
                                        var43.field1302 = class190.field3862[var7];
                                        var43.field1435 = class190.field3862[var7 - -1];
                                        class113.method901(0, var43);
                                        continue;
                                    }
                                    if (~var316 == -1004) {
                                        --var7;
                                        boolean var44 = ~class190.field3862[var7] == -2;
                                        if (!var43.field1433 == var44) {
                                            var43.field1433 = var44;
                                            class113.method901(0, var43);
                                        }
                                        continue;
                                    }
                                } else if ((~var316 > -1101 || ~var316 <= -1201) && (var316 < 2100 || var316 >= 2200)) {
                                    if (var316 >= 1200 && ~var316 > -1301 || ~var316 <= -2201 && ~var316 > -2301) {
                                        class54 var45;
                                        if (var316 < 2000) {
                                            var45 = !var42 ? class187.field3776 : class117.field2623;
                                        } else {
                                            --var7;
                                            var45 = class59.method555(class190.field3862[var7], 32173);
                                            var316 -= 1000;
                                        }
                                        class113.method901(0, var45);
                                        if (~var316 == -1201) {
                                            var7 -= 2;
                                            int var46 = class190.field3862[var7 + 1];
                                            int var47 = class190.field3862[var7];
                                            var45.field1407 = var47;
                                            var45.field1317 = var46;
                                            class93 var48 = class59.method554(var47, 13319);
                                            var45.field1431 = var48.field2237;
                                            var45.field1415 = var48.field2200;
                                            var45.field1418 = var48.field2235;
                                            var45.field1320 = var48.field2205;
                                            var45.field1421 = var48.field2211;
                                            var45.field1321 = var48.field2206;
                                            if (~var45.field1302 < -1) {
                                                var45.field1320 = var45.field1320 * 32 / var45.field1302;
                                            }
                                            continue;
                                        }
                                        if (~var316 == -1202) {
                                            var45.field1404 = 2;
                                            --var7;
                                            var45.field1443 = class190.field3862[var7];
                                            continue;
                                        }
                                        if (var316 == 1202) {
                                            var45.field1404 = 3;
                                            var45.field1443 = class3.field72.field1559.method182((byte) -128);
                                            continue;
                                        }
                                        if (var316 == 1203) {
                                            var45.field1404 = 6;
                                            --var7;
                                            var45.field1443 = class190.field3862[var7];
                                            continue;
                                        }
                                        if (var316 == 1204) {
                                            var45.field1404 = 5;
                                            --var7;
                                            var45.field1443 = class190.field3862[var7];
                                            continue;
                                        }
                                    } else if (var316 >= 1300 && var316 < 1400 || ~var316 <= -2301 && var316 < 2400) {
                                        class54 var284;
                                        if (~var316 <= -2001) {
                                            --var7;
                                            var284 = class59.method555(class190.field3862[var7], 32173);
                                            var316 -= 1000;
                                        } else {
                                            var284 = var42 ? class117.field2623 : class187.field3776;
                                        }
                                        if (var316 == 1300) {
                                            --var7;
                                            int var285 = -1 + class190.field3862[var7];
                                            if (~var285 <= -1 && var285 <= 9) {
                                                --var6;
                                                var284.method528(class11.field255[var6], var285, -93);
                                                continue;
                                            }
                                            --var6;
                                            continue;
                                        }
                                        if (~var316 == -1302) {
                                            var7 -= 2;
                                            int var286 = class190.field3862[var7];
                                            int var287 = class190.field3862[var7 + 1];
                                            var284.field1410 = class12.method149(var287, var286, 12226);
                                            continue;
                                        }
                                        if (~var316 == -1303) {
                                            --var7;
                                            var284.field1380 = ~class190.field3862[var7] == -2;
                                            continue;
                                        }
                                        if (~var316 == -1304) {
                                            --var7;
                                            var284.field1434 = class190.field3862[var7];
                                            continue;
                                        }
                                        if (var316 == 1304) {
                                            --var7;
                                            var284.field1309 = class190.field3862[var7];
                                            continue;
                                        }
                                        if (~var316 == -1306) {
                                            --var6;
                                            var284.field1381 = class11.field255[var6];
                                            continue;
                                        }
                                        if (~var316 == -1307) {
                                            --var6;
                                            var284.field1362 = class11.field255[var6];
                                            continue;
                                        }
                                        if (var316 == 1307) {
                                            var284.field1373 = null;
                                            continue;
                                        }
                                    } else {
                                        if (var316 >= 1400 && var316 < 1500 || var316 >= 2400 && var316 < 2500) {
                                            class54 var277;
                                            if (~var316 > -2001) {
                                                var277 = !var42 ? class187.field3776 : class117.field2623;
                                            } else {
                                                var316 -= 1000;
                                                --var7;
                                                var277 = class59.method555(class190.field3862[var7], 32173);
                                            }
                                            --var6;
                                            class63 var278 = class11.field255[var6];
                                            int[] var279 = null;
                                            if (~var278.method582(-91) < -1 && ~var278.method573(255, var278.method582(-123) - 1) == -90) {
                                                --var7;
                                                int var280 = class190.field3862[var7];
                                                if (var280 > 0) {
                                                    var279 = new int[var280];
                                                    while (var280-- > 0) {
                                                        --var7;
                                                        var279[var280] = class190.field3862[var7];
                                                    }
                                                }
                                                var278 = var278.method596(0, var278.method582(-91) - 1, -114);
                                            }
                                            Object[] var281 = new Object[var278.method582(-94) - -1];
                                            for (int var282 = var281.length - 1; ~var282 <= -2; --var282) {
                                                if (var278.method573(255, var282 + -1) != 115) {
                                                    --var7;
                                                    var281[var282] = new Integer(class190.field3862[var7]);
                                                } else {
                                                    --var6;
                                                    var281[var282] = class11.field255[var6];
                                                }
                                            }
                                            --var7;
                                            int var283 = class190.field3862[var7];
                                            if (var283 != -1) {
                                                var281[0] = new Integer(var283);
                                            } else {
                                                var281 = null;
                                            }
                                            if (var316 == 1410) {
                                                var277.field1345 = var281;
                                            }
                                            if (var316 == 1418) {
                                                var277.field1312 = var281;
                                            }
                                            var277.field1378 = true;
                                            if (~var316 == -1424) {
                                                var277.field1402 = var281;
                                            }
                                            if (~var316 == -1418) {
                                                var277.field1387 = var281;
                                            }
                                            if (var316 == 1414) {
                                                var277.field1399 = var281;
                                                var277.field1396 = var279;
                                            }
                                            if (~var316 == -1426) {
                                                var277.field1316 = var281;
                                            }
                                            if (~var316 == -1420) {
                                                var277.field1388 = var281;
                                            }
                                            if (~var316 == -1425) {
                                                var277.field1427 = var281;
                                            }
                                            if (var316 == 1412) {
                                                var277.field1377 = var281;
                                            }
                                            if (var316 == 1415) {
                                                var277.field1438 = var279;
                                                var277.field1395 = var281;
                                            }
                                            if (var316 == 1400) {
                                                var277.field1375 = var281;
                                            }
                                            if (~var316 == -1421) {
                                                var277.field1366 = var281;
                                            }
                                            if (var316 == 1407) {
                                                var277.field1441 = var281;
                                                var277.field1347 = var279;
                                            }
                                            if (~var316 == -1409) {
                                                var277.field1305 = var281;
                                            }
                                            if (~var316 == -1422) {
                                                var277.field1318 = var281;
                                            }
                                            if (var316 == 1411) {
                                                var277.field1354 = var281;
                                            }
                                            if (var316 == 1409) {
                                                var277.field1311 = var281;
                                            }
                                            if (~var316 == -1402) {
                                                var277.field1330 = var281;
                                            }
                                            if (~var316 == -1405) {
                                                var277.field1371 = var281;
                                            }
                                            if (var316 == 1403) {
                                                var277.field1394 = var281;
                                            }
                                            if (~var316 == -1403) {
                                                var277.field1303 = var281;
                                            }
                                            if (~var316 == -1423) {
                                                var277.field1326 = var281;
                                            }
                                            if (~var316 == -1407) {
                                                var277.field1338 = var281;
                                            }
                                            if (~var316 == -1417) {
                                                var277.field1339 = var281;
                                            }
                                            if (~var316 == -1406) {
                                                var277.field1306 = var281;
                                            }
                                            continue;
                                        }
                                        if (~var316 > -1601) {
                                            class54 var49 = !var42 ? class187.field3776 : class117.field2623;
                                            if (~var316 == -1501) {
                                                class190.field3862[var7++] = var49.field1333;
                                                continue;
                                            }
                                            if (~var316 == -1502) {
                                                class190.field3862[var7++] = var49.field1304;
                                                continue;
                                            }
                                            if (var316 == 1502) {
                                                class190.field3862[var7++] = var49.field1302;
                                                continue;
                                            }
                                            if (~var316 == -1504) {
                                                class190.field3862[var7++] = var49.field1435;
                                                continue;
                                            }
                                            if (var316 == 1504) {
                                                class190.field3862[var7++] = !var49.field1433 ? 0 : 1;
                                                continue;
                                            }
                                            if (var316 == 1505) {
                                                class190.field3862[var7++] = var49.field1353;
                                                continue;
                                            }
                                        } else if (~var316 <= -1701) {
                                            if (~var316 > -1801) {
                                                class54 var50 = var42 ? class117.field2623 : class187.field3776;
                                                if (~var316 == -1701) {
                                                    class190.field3862[var7++] = var50.field1407;
                                                    continue;
                                                }
                                                if (var316 == 1701) {
                                                    if (var50.field1407 == -1) {
                                                        class190.field3862[var7++] = 0;
                                                    } else {
                                                        class190.field3862[var7++] = var50.field1317;
                                                    }
                                                    continue;
                                                }
                                                if (~var316 == -1703) {
                                                    class190.field3862[var7++] = var50.field1408;
                                                    continue;
                                                }
                                            } else if (~var316 <= -1901) {
                                                if (var316 >= 2600) {
                                                    if (var316 >= 2700) {
                                                        if (var316 < 2800) {
                                                            if (var316 == 2700) {
                                                                --var7;
                                                                class54 var51 = class59.method555(class190.field3862[var7], 32173);
                                                                class190.field3862[var7++] = var51.field1407;
                                                                continue;
                                                            }
                                                            if (var316 == 2701) {
                                                                --var7;
                                                                class54 var52 = class59.method555(class190.field3862[var7], 32173);
                                                                if (~var52.field1407 == 0) {
                                                                    class190.field3862[var7++] = 0;
                                                                } else {
                                                                    class190.field3862[var7++] = var52.field1317;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var316 == -2703) {
                                                                --var7;
                                                                int var53 = class190.field3862[var7];
                                                                class132 var54 = (class132) class133.field2885.method694(-23979, (long) var53);
                                                                if (var54 == null) {
                                                                    class190.field3862[var7++] = 0;
                                                                } else {
                                                                    class190.field3862[var7++] = 1;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var316 == -2704) {
                                                                --var7;
                                                                class54 var55 = class59.method555(class190.field3862[var7], 32173);
                                                                if (var55.field1368 == null) {
                                                                    class190.field3862[var7++] = 0;
                                                                    continue;
                                                                }
                                                                int var56 = var55.field1368.length;
                                                                for (int var57 = 0; var57 < var55.field1368.length; ++var57) {
                                                                    if (var55.field1368[var57] == null) {
                                                                        var56 = var57;
                                                                        break;
                                                                    }
                                                                }
                                                                class190.field3862[var7++] = var56;
                                                                continue;
                                                            }
                                                            if (~var316 == -2705 || var316 == 2705) {
                                                                var7 -= 2;
                                                                int var58 = class190.field3862[var7];
                                                                int var59 = class190.field3862[var7 + 1];
                                                                class132 var60 = (class132) class133.field2885.method694(-23979, (long) var58);
                                                                if (var60 != null && ~var60.field2865 == ~var59) {
                                                                    class190.field3862[var7++] = 1;
                                                                } else {
                                                                    class190.field3862[var7++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                        } else if (~var316 > -2901) {
                                                            --var7;
                                                            class54 var61 = class59.method555(class190.field3862[var7], 32173);
                                                            if (var316 == 2800) {
                                                                class190.field3862[var7++] = class186.method1221((byte) -100, class10.method136((byte) -107, var61));
                                                                continue;
                                                            }
                                                            if (~var316 == -2802) {
                                                                --var7;
                                                                int var62 = class190.field3862[var7];
                                                                int var317 = var62 - 1;
                                                                if (var61.field1373 != null && var61.field1373.length > var317 && var61.field1373[var317] != null) {
                                                                    class11.field255[var6++] = var61.field1373[var317];
                                                                    continue;
                                                                }
                                                                class11.field255[var6++] = class118.field2645;
                                                                continue;
                                                            }
                                                            if (~var316 == -2803) {
                                                                if (var61.field1381 == null) {
                                                                    class11.field255[var6++] = class118.field2645;
                                                                } else {
                                                                    class11.field255[var6++] = var61.field1381;
                                                                }
                                                                continue;
                                                            }
                                                        } else if (~var316 > -3201) {
                                                            if (var316 == 3100) {
                                                                --var6;
                                                                class63 var63 = class11.field255[var6];
                                                                class100.method843((byte) -111, 0, class118.field2645, var63);
                                                                continue;
                                                            }
                                                            if (~var316 == -3102) {
                                                                var7 -= 2;
                                                                class134.method976(15278, class190.field3862[var7], class3.field72, class190.field3862[var7 + 1]);
                                                                continue;
                                                            }
                                                            if (~var316 == -3104) {
                                                                class154.method1073(0);
                                                                continue;
                                                            }
                                                            if (~var316 == -3105) {
                                                                ++class167.field3426;
                                                                int var64 = 0;
                                                                --var6;
                                                                class63 var65 = class11.field255[var6];
                                                                if (var65.method597(124)) {
                                                                    var64 = var65.method600(false);
                                                                }
                                                                class141.field3031.method854(30, true);
                                                                class141.field3031.method76(var64, (byte) 114);
                                                                continue;
                                                            }
                                                            if (~var316 == -3106) {
                                                                ++class4.field117;
                                                                --var6;
                                                                class63 var66 = class11.field255[var6];
                                                                class141.field3031.method854(205, true);
                                                                class141.field3031.method32((byte) 72, var66.method590(-98));
                                                                continue;
                                                            }
                                                            if (var316 == 3106) {
                                                                ++class35.field829;
                                                                --var6;
                                                                class63 var67 = class11.field255[var6];
                                                                class141.field3031.method854(45, true);
                                                                class141.field3031.method66(2, 1 + var67.method582(-112));
                                                                class141.field3031.method65(var67, 76);
                                                                continue;
                                                            }
                                                            if (~var316 == -3108) {
                                                                --var7;
                                                                int var68 = class190.field3862[var7];
                                                                --var6;
                                                                class63 var69 = class11.field255[var6];
                                                                class65.method613(71, var68, var69);
                                                                continue;
                                                            }
                                                            if (var316 == 3108) {
                                                                var7 -= 3;
                                                                int var70 = class190.field3862[var7];
                                                                int var71 = class190.field3862[var7 + 2];
                                                                int var72 = class190.field3862[var7 + 1];
                                                                class54 var73 = class59.method555(var71, 32173);
                                                                class189.method1241(var70, var72, var73, false);
                                                                continue;
                                                            }
                                                            if (var316 == 3109) {
                                                                var7 -= 2;
                                                                int var74 = class190.field3862[var7];
                                                                int var75 = class190.field3862[var7 + 1];
                                                                class54 var76 = var42 ? class117.field2623 : class187.field3776;
                                                                class189.method1241(var74, var75, var76, false);
                                                                continue;
                                                            }
                                                            if (var316 == 3110) {
                                                                ++class12.field289;
                                                                --var7;
                                                                int var77 = class190.field3862[var7];
                                                                class141.field3031.method854(143, true);
                                                                class141.field3031.method62(var77, (byte) 55);
                                                                continue;
                                                            }
                                                        } else if (~var316 > -3301) {
                                                            if (var316 == 3200) {
                                                                var7 -= 3;
                                                                class101.method845(class190.field3862[var7 + 1], 0, class190.field3862[var7 + 2], class190.field3862[var7]);
                                                                continue;
                                                            }
                                                            if (var316 == 3201) {
                                                                --var7;
                                                                class127.method954(class190.field3862[var7], false);
                                                                continue;
                                                            }
                                                            if (var316 == 3202) {
                                                                var7 -= 2;
                                                                class154.method1075((byte) -45, class190.field3862[var7 + 1], class190.field3862[var7]);
                                                                continue;
                                                            }
                                                        } else if (var316 >= 3400) {
                                                            if (~var316 > -3501) {
                                                                if (var316 == 3400) {
                                                                    var7 -= 2;
                                                                    int var78 = class190.field3862[var7 + 1];
                                                                    int var79 = class190.field3862[var7];
                                                                    class48 var80 = class79.method711(var79, true);
                                                                    for (int var81 = 0; var80.field1172 > var81; ++var81) {
                                                                        if (~var80.field1173[var81] == ~var78) {
                                                                            class11.field255[var6++] = var80.field1169[var81];
                                                                            var80 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var80 != null) {
                                                                        class11.field255[var6++] = var80.field1176;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var316 == 3408) {
                                                                    var7 -= 4;
                                                                    int var82 = class190.field3862[var7];
                                                                    int var83 = class190.field3862[var7 + 1];
                                                                    int var84 = class190.field3862[var7 + 2];
                                                                    int var85 = class190.field3862[var7 + 3];
                                                                    class48 var86 = class79.method711(var84, true);
                                                                    if (var86.field1181 == var82 && var86.field1177 == var83) {
                                                                        for (int var87 = 0; ~var86.field1172 < ~var87; ++var87) {
                                                                            if (~var86.field1173[var87] == ~var85) {
                                                                                if (~var83 != -116) {
                                                                                    class190.field3862[var7++] = var86.field1170[var87];
                                                                                } else {
                                                                                    class11.field255[var6++] = var86.field1169[var87];
                                                                                }
                                                                                var86 = null;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (var86 != null) {
                                                                            if (var83 == 115) {
                                                                                class11.field255[var6++] = var86.field1176;
                                                                            } else {
                                                                                class190.field3862[var7++] = var86.field1175;
                                                                            }
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var83 != 115) {
                                                                        class190.field3862[var7++] = 0;
                                                                    } else {
                                                                        class11.field255[var6++] = class73.field1816;
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (~var316 > -3701) {
                                                                if (var316 == 3600) {
                                                                    if (~class124.field2764 != -1) {
                                                                        if (class124.field2764 == 1) {
                                                                            class190.field3862[var7++] = -1;
                                                                        } else {
                                                                            class190.field3862[var7++] = class37.field868;
                                                                        }
                                                                    } else {
                                                                        class190.field3862[var7++] = -2;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var316 == -3602) {
                                                                    --var7;
                                                                    int var88 = class190.field3862[var7];
                                                                    if (class124.field2764 == 2 && var88 < class37.field868) {
                                                                        class11.field255[var6++] = class140.field3022[var88];
                                                                        continue;
                                                                    }
                                                                    class11.field255[var6++] = class118.field2645;
                                                                    continue;
                                                                }
                                                                if (var316 == 3602) {
                                                                    --var7;
                                                                    int var89 = class190.field3862[var7];
                                                                    if (class124.field2764 == 2 && ~class37.field868 < ~var89) {
                                                                        class190.field3862[var7++] = class123.field2713[var89];
                                                                        continue;
                                                                    }
                                                                    class190.field3862[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (var316 == 3603) {
                                                                    --var7;
                                                                    int var90 = class190.field3862[var7];
                                                                    if (class124.field2764 == 2 && class37.field868 > var90) {
                                                                        class190.field3862[var7++] = class198.field3959[var90];
                                                                        continue;
                                                                    }
                                                                    class190.field3862[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3605) {
                                                                    --var6;
                                                                    class63 var91 = class11.field255[var6];
                                                                    --var7;
                                                                    int var92 = class190.field3862[var7];
                                                                    class85.method749(false, var92, var91);
                                                                    continue;
                                                                }
                                                                if (var316 == 3605) {
                                                                    --var6;
                                                                    class63 var93 = class11.field255[var6];
                                                                    class148.method1037(var93.method590(-98), 1);
                                                                    continue;
                                                                }
                                                                if (var316 == 3606) {
                                                                    --var6;
                                                                    class63 var94 = class11.field255[var6];
                                                                    class83.method732(6851, var94.method590(-98));
                                                                    continue;
                                                                }
                                                                if (var316 == 3607) {
                                                                    --var6;
                                                                    class63 var95 = class11.field255[var6];
                                                                    class168.method1137(0, var95.method590(-98));
                                                                    continue;
                                                                }
                                                                if (var316 == 3608) {
                                                                    --var6;
                                                                    class63 var96 = class11.field255[var6];
                                                                    class161.method1101(true, var96.method590(-98));
                                                                    continue;
                                                                }
                                                                if (var316 == 3609) {
                                                                    --var6;
                                                                    class63 var97 = class11.field255[var6];
                                                                    if (var97.method593(class186.field3749, -22331) || var97.method593(class112.field2522, -22331)) {
                                                                        var97 = var97.method592(false, 7);
                                                                    }
                                                                    class190.field3862[var7++] = !class21.method223(-1, var97) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3612) {
                                                                    if (class62.field1548 == null) {
                                                                        class11.field255[var6++] = class118.field2645;
                                                                    } else {
                                                                        class11.field255[var6++] = class62.field1548.method576((byte) 32);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var316 == -3613) {
                                                                    if (class62.field1548 != null) {
                                                                        class190.field3862[var7++] = class151.field3167;
                                                                    } else {
                                                                        class190.field3862[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var316 == -3614) {
                                                                    --var7;
                                                                    int var98 = class190.field3862[var7];
                                                                    if (class62.field1548 != null && var98 < class151.field3167) {
                                                                        class11.field255[var6++] = class59.field1512[var98].field1811.method576((byte) 32);
                                                                        continue;
                                                                    }
                                                                    class11.field255[var6++] = class118.field2645;
                                                                    continue;
                                                                }
                                                                if (var316 == 3614) {
                                                                    --var7;
                                                                    int var99 = class190.field3862[var7];
                                                                    if (class62.field1548 != null && class151.field3167 > var99) {
                                                                        class190.field3862[var7++] = class59.field1512[var99].field1814;
                                                                        continue;
                                                                    }
                                                                    class190.field3862[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (var316 == 3615) {
                                                                    --var7;
                                                                    int var100 = class190.field3862[var7];
                                                                    if (class62.field1548 != null && var100 < class151.field3167) {
                                                                        class190.field3862[var7++] = class59.field1512[var100].field1812;
                                                                        continue;
                                                                    }
                                                                    class190.field3862[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (var316 == 3616) {
                                                                    class190.field3862[var7++] = class113.field2538;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3618) {
                                                                    --var6;
                                                                    class63 var101 = class11.field255[var6];
                                                                    class52.method508((byte) -39, var101);
                                                                    continue;
                                                                }
                                                                if (var316 == 3618) {
                                                                    class190.field3862[var7++] = class195.field3923;
                                                                    continue;
                                                                }
                                                                if (var316 == 3619) {
                                                                    --var6;
                                                                    class63 var102 = class11.field255[var6];
                                                                    class183.method1209(var102.method590(-98), 108);
                                                                    continue;
                                                                }
                                                                if (~var316 == -3621) {
                                                                    class181.method1203(32767);
                                                                    continue;
                                                                }
                                                                if (~var316 == -3622) {
                                                                    if (~class124.field2764 == -1) {
                                                                        class190.field3862[var7++] = -1;
                                                                    } else {
                                                                        class190.field3862[var7++] = class99.field2338;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var316 == 3622) {
                                                                    --var7;
                                                                    int var103 = class190.field3862[var7];
                                                                    if (class124.field2764 != 0 && class99.field2338 > var103) {
                                                                        class11.field255[var6++] = class89.method770(class11.field264[var103], false).method576((byte) 32);
                                                                        continue;
                                                                    }
                                                                    class11.field255[var6++] = class118.field2645;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3624) {
                                                                    --var6;
                                                                    class63 var104 = class11.field255[var6];
                                                                    if (var104.method593(class186.field3749, -22331) || var104.method593(class112.field2522, -22331)) {
                                                                        var104 = var104.method592(false, 7);
                                                                    }
                                                                    class190.field3862[var7++] = !class169.method1141((byte) 117, var104) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3625) {
                                                                    --var7;
                                                                    int var105 = class190.field3862[var7];
                                                                    if (class59.field1512 != null && class151.field3167 > var105 && class59.field1512[var105].field1811.method601(13117, class3.field72.field1552)) {
                                                                        class190.field3862[var7++] = 1;
                                                                        continue;
                                                                    }
                                                                    class190.field3862[var7++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3626) {
                                                                    if (class71.field1779 == null) {
                                                                        class11.field255[var6++] = class118.field2645;
                                                                    } else {
                                                                        class11.field255[var6++] = class71.field1779.method576((byte) 32);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (~var316 > -4001) {
                                                                if (~var316 == -3904) {
                                                                    --var7;
                                                                    int var106 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class173.field3572[var106].method1023(4);
                                                                    continue;
                                                                }
                                                                if (var316 == 3904) {
                                                                    --var7;
                                                                    int var107 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class173.field3572[var107].field3056;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3906) {
                                                                    --var7;
                                                                    int var108 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class173.field3572[var108].field3054;
                                                                    continue;
                                                                }
                                                                if (var316 == 3906) {
                                                                    --var7;
                                                                    int var109 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class173.field3572[var109].field3057;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3908) {
                                                                    --var7;
                                                                    int var110 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class173.field3572[var110].field3062;
                                                                    continue;
                                                                }
                                                                if (var316 == 3908) {
                                                                    --var7;
                                                                    int var111 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class173.field3572[var111].field3055;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3911) {
                                                                    --var7;
                                                                    int var112 = class190.field3862[var7];
                                                                    int var113 = class173.field3572[var112].method1024((byte) -97);
                                                                    class190.field3862[var7++] = ~var113 == -1 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3912) {
                                                                    --var7;
                                                                    int var114 = class190.field3862[var7];
                                                                    int var115 = class173.field3572[var114].method1024((byte) -106);
                                                                    class190.field3862[var7++] = var115 == 2 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3913) {
                                                                    --var7;
                                                                    int var116 = class190.field3862[var7];
                                                                    int var117 = class173.field3572[var116].method1024((byte) -106);
                                                                    class190.field3862[var7++] = ~var117 == -6 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var316 == -3914) {
                                                                    --var7;
                                                                    int var118 = class190.field3862[var7];
                                                                    int var119 = class173.field3572[var118].method1024((byte) -124);
                                                                    class190.field3862[var7++] = var119 != 1 ? 0 : 1;
                                                                    continue;
                                                                }
                                                            } else if (~var316 > -4101) {
                                                                if (~var316 == -4001) {
                                                                    var7 -= 2;
                                                                    int var120 = class190.field3862[var7 - -1];
                                                                    int var121 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = var121 - -var120;
                                                                    continue;
                                                                }
                                                                if (~var316 == -4002) {
                                                                    var7 -= 2;
                                                                    int var122 = class190.field3862[var7];
                                                                    int var123 = class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = -var123 + var122;
                                                                    continue;
                                                                }
                                                                if (var316 == 4002) {
                                                                    var7 -= 2;
                                                                    int var124 = class190.field3862[var7 + 1];
                                                                    int var125 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = var124 * var125;
                                                                    continue;
                                                                }
                                                                if (var316 == 4003) {
                                                                    var7 -= 2;
                                                                    int var126 = class190.field3862[var7];
                                                                    int var127 = class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = var126 / var127;
                                                                    continue;
                                                                }
                                                                if (var316 == 4004) {
                                                                    --var7;
                                                                    int var128 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = (int) (Math.random() * (double) var128);
                                                                    continue;
                                                                }
                                                                if (var316 == 4005) {
                                                                    --var7;
                                                                    int var129 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = (int) ((double) (var129 + 1) * Math.random());
                                                                    continue;
                                                                }
                                                                if (~var316 == -4007) {
                                                                    var7 -= 5;
                                                                    int var130 = class190.field3862[var7];
                                                                    int var131 = class190.field3862[var7 + 1];
                                                                    int var132 = class190.field3862[var7 + 2];
                                                                    int var133 = class190.field3862[var7 - -3];
                                                                    int var134 = class190.field3862[var7 + 4];
                                                                    class190.field3862[var7++] = (-var130 + var131) * (-var132 + var134) / (-var132 + var133) + var130;
                                                                    continue;
                                                                }
                                                                if (~var316 == -4008) {
                                                                    var7 -= 2;
                                                                    int var135 = class190.field3862[var7 + 1];
                                                                    int var136 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = var135 * var136 / 100 + var136;
                                                                    continue;
                                                                }
                                                                if (var316 == 4008) {
                                                                    var7 -= 2;
                                                                    int var137 = class190.field3862[var7];
                                                                    int var138 = class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = class202.method1332(1 << var138, var137);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4010) {
                                                                    var7 -= 2;
                                                                    int var139 = class190.field3862[var7];
                                                                    int var140 = class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = class110.method881(-(1 << var140) + -1, var139);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4011) {
                                                                    var7 -= 2;
                                                                    int var141 = class190.field3862[var7];
                                                                    int var142 = class190.field3862[var7 - -1];
                                                                    class190.field3862[var7++] = ~class110.method881(var141, 1 << var142) != -1 ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var316 == -4012) {
                                                                    var7 -= 2;
                                                                    int var143 = class190.field3862[var7];
                                                                    int var144 = class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = var143 % var144;
                                                                    continue;
                                                                }
                                                                if (var316 == 4012) {
                                                                    var7 -= 2;
                                                                    int var145 = class190.field3862[var7];
                                                                    int var146 = class190.field3862[var7 + 1];
                                                                    if (var145 == 0) {
                                                                        class190.field3862[var7++] = 0;
                                                                    } else {
                                                                        class190.field3862[var7++] = (int) Math.pow((double) var145, (double) var146);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var316 == 4013) {
                                                                    var7 -= 2;
                                                                    int var147 = class190.field3862[var7];
                                                                    int var148 = class190.field3862[var7 - -1];
                                                                    if (~var147 != -1) {
                                                                        if (~var148 != -1) {
                                                                            class190.field3862[var7++] = (int) Math.pow((double) var147, 1.0D / (double) var148);
                                                                        } else {
                                                                            class190.field3862[var7++] = Integer.MAX_VALUE;
                                                                        }
                                                                    } else {
                                                                        class190.field3862[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var316 == 4014) {
                                                                    var7 -= 2;
                                                                    int var149 = class190.field3862[var7 + 1];
                                                                    int var150 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class110.method881(var150, var149);
                                                                    continue;
                                                                }
                                                                if (var316 == 4015) {
                                                                    var7 -= 2;
                                                                    int var151 = class190.field3862[var7];
                                                                    int var152 = class190.field3862[var7 - -1];
                                                                    class190.field3862[var7++] = class202.method1332(var152, var151);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4017) {
                                                                    var7 -= 2;
                                                                    int var153 = class190.field3862[var7];
                                                                    int var154 = class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = var154 > var153 ? var153 : var154;
                                                                    continue;
                                                                }
                                                                if (var316 == 4017) {
                                                                    var7 -= 2;
                                                                    int var155 = class190.field3862[var7 + 1];
                                                                    int var156 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = var155 >= var156 ? var155 : var156;
                                                                    continue;
                                                                }
                                                                if (~var316 == -4019) {
                                                                    var7 -= 3;
                                                                    long var157 = (long) class190.field3862[var7 + 2];
                                                                    long var159 = (long) class190.field3862[var7];
                                                                    long var161 = (long) class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = (int) (var157 * var159 / var161);
                                                                    continue;
                                                                }
                                                            } else if (~var316 <= -4201) {
                                                                if (var316 < 4300) {
                                                                    if (var316 == 4200) {
                                                                        --var7;
                                                                        int var163 = class190.field3862[var7];
                                                                        class11.field255[var6++] = class59.method554(var163, 13319).field2202;
                                                                        continue;
                                                                    }
                                                                    if (var316 == 4201) {
                                                                        var7 -= 2;
                                                                        int var164 = class190.field3862[var7];
                                                                        int var165 = class190.field3862[var7 + 1];
                                                                        class93 var166 = class59.method554(var164, 13319);
                                                                        if (~var165 <= -2 && var165 <= 5 && var166.field2222[var165 + -1] != null) {
                                                                            class11.field255[var6++] = var166.field2222[var165 + -1];
                                                                            continue;
                                                                        }
                                                                        class11.field255[var6++] = class118.field2645;
                                                                        continue;
                                                                    }
                                                                    if (var316 == 4202) {
                                                                        var7 -= 2;
                                                                        int var167 = class190.field3862[var7];
                                                                        int var168 = class190.field3862[var7 + 1];
                                                                        class93 var169 = class59.method554(var167, 13319);
                                                                        if (~var168 <= -2 && ~var168 >= -6 && var169.field2213[var168 + -1] != null) {
                                                                            class11.field255[var6++] = var169.field2213[var168 - 1];
                                                                            continue;
                                                                        }
                                                                        class11.field255[var6++] = class118.field2645;
                                                                        continue;
                                                                    }
                                                                    if (var316 == 4203) {
                                                                        --var7;
                                                                        int var170 = class190.field3862[var7];
                                                                        class190.field3862[var7++] = class59.method554(var170, 13319).field2231;
                                                                        continue;
                                                                    }
                                                                    if (var316 == 4204) {
                                                                        --var7;
                                                                        int var171 = class190.field3862[var7];
                                                                        class190.field3862[var7++] = class59.method554(var171, 13319).field2242 != 1 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -4206) {
                                                                        --var7;
                                                                        int var172 = class190.field3862[var7];
                                                                        class93 var173 = class59.method554(var172, 13319);
                                                                        if (~var173.field2196 == 0 && var173.field2197 >= 0) {
                                                                            class190.field3862[var7++] = var173.field2197;
                                                                            continue;
                                                                        }
                                                                        class190.field3862[var7++] = var172;
                                                                        continue;
                                                                    }
                                                                    if (var316 == 4206) {
                                                                        --var7;
                                                                        int var174 = class190.field3862[var7];
                                                                        class93 var175 = class59.method554(var174, 13319);
                                                                        if (~var175.field2196 <= -1 && var175.field2197 >= 0) {
                                                                            class190.field3862[var7++] = var175.field2197;
                                                                            continue;
                                                                        }
                                                                        class190.field3862[var7++] = var174;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -4208) {
                                                                        --var7;
                                                                        int var176 = class190.field3862[var7];
                                                                        class190.field3862[var7++] = !class59.method554(var176, 13319).field2234 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -4211) {
                                                                        --var7;
                                                                        int var177 = class190.field3862[var7];
                                                                        --var6;
                                                                        class63 var178 = class11.field255[var6];
                                                                        class112.method896((byte) -36, var177 == 1, var178);
                                                                        class190.field3862[var7++] = class118.field2643;
                                                                        continue;
                                                                    }
                                                                    if (var316 == 4211) {
                                                                        if (class152.field3192 != null && ~class118.field2643 < ~class143.field3072) {
                                                                            class190.field3862[var7++] = class110.method881(65535, class152.field3192[class143.field3072++]);
                                                                            continue;
                                                                        }
                                                                        class190.field3862[var7++] = -1;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -4213) {
                                                                        class143.field3072 = 0;
                                                                        continue;
                                                                    }
                                                                } else if (~var316 > -5101) {
                                                                    if (var316 == 5000) {
                                                                        class190.field3862[var7++] = class196.field3936;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5002) {
                                                                        var7 -= 3;
                                                                        class196.field3936 = class190.field3862[var7];
                                                                        ++class62.field1550;
                                                                        class151.field3176 = class190.field3862[var7 + 1];
                                                                        class62.field1553 = class190.field3862[var7 + 2];
                                                                        class141.field3031.method854(50, true);
                                                                        class141.field3031.method66(2, class196.field3936);
                                                                        class141.field3031.method66(2, class151.field3176);
                                                                        class141.field3031.method66(2, class62.field1553);
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5003) {
                                                                        var7 -= 2;
                                                                        ++class8.field173;
                                                                        int var179 = class190.field3862[var7];
                                                                        --var6;
                                                                        class63 var180 = class11.field255[var6];
                                                                        int var181 = class190.field3862[var7 - -1];
                                                                        class141.field3031.method854(133, true);
                                                                        class141.field3031.method32((byte) 72, var180.method590(-98));
                                                                        class141.field3031.method66(2, var179 - 1);
                                                                        class141.field3031.method66(2, var181);
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5004) {
                                                                        --var7;
                                                                        int var182 = class190.field3862[var7];
                                                                        class63 var183 = null;
                                                                        if (~var182 > -101) {
                                                                            var183 = class166.field3411[var182];
                                                                        }
                                                                        if (var183 == null) {
                                                                            var183 = class118.field2645;
                                                                        }
                                                                        class11.field255[var6++] = var183;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5005) {
                                                                        int var184 = -1;
                                                                        --var7;
                                                                        int var185 = class190.field3862[var7];
                                                                        if (~var185 > -101 && class166.field3411[var185] != null) {
                                                                            var184 = class206.field4062[var185];
                                                                        }
                                                                        class190.field3862[var7++] = var184;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5006) {
                                                                        class190.field3862[var7++] = class151.field3176;
                                                                        continue;
                                                                    }
                                                                    if (var316 == 5008) {
                                                                        --var6;
                                                                        class63 var186 = class11.field255[var6];
                                                                        if (var186.method593(class176.field3620, -22331)) {
                                                                            class121.method928(-3, var186);
                                                                        } else {
                                                                            byte var187 = 0;
                                                                            class63 var188 = var186.method584((byte) -123);
                                                                            ++class193.field3910;
                                                                            byte var189 = 0;
                                                                            if (!var188.method593(class93.field2201, -22331)) {
                                                                                if (!var188.method593(class84.field2005, -22331)) {
                                                                                    if (!var188.method593(class49.field1197, -22331)) {
                                                                                        if (var188.method593(class79.field1925, -22331)) {
                                                                                            var186 = var186.method592(false, class79.field1925.method582(-111));
                                                                                            var187 = 3;
                                                                                        } else if (!var188.method593(class164.field3378, -22331)) {
                                                                                            if (!var188.method593(class42.field978, -22331)) {
                                                                                                if (var188.method593(class78.field1890, -22331)) {
                                                                                                    var187 = 6;
                                                                                                    var186 = var186.method592(false, class78.field1890.method582(-109));
                                                                                                } else if (!var188.method593(class57.field1496, -22331)) {
                                                                                                    if (var188.method593(class174.field3580, -22331)) {
                                                                                                        var187 = 8;
                                                                                                        var186 = var186.method592(false, class174.field3580.method582(-120));
                                                                                                    } else if (var188.method593(class10.field247, -22331)) {
                                                                                                        var186 = var186.method592(false, class10.field247.method582(-118));
                                                                                                        var187 = 9;
                                                                                                    } else if (var188.method593(class68.field1713, -22331)) {
                                                                                                        var186 = var186.method592(false, class68.field1713.method582(-113));
                                                                                                        var187 = 10;
                                                                                                    } else if (!var188.method593(class190.field3869, -22331)) {
                                                                                                        if (class22.field512 != 0) {
                                                                                                            if (!var188.method593(class93.field2229, -22331)) {
                                                                                                                if (!var188.method593(class84.field1994, -22331)) {
                                                                                                                    if (!var188.method593(class49.field1199, -22331)) {
                                                                                                                        if (var188.method593(class79.field1932, -22331)) {
                                                                                                                            var186 = var186.method592(false, class79.field1932.method582(-70));
                                                                                                                            var187 = 3;
                                                                                                                        } else if (var188.method593(class164.field3376, -22331)) {
                                                                                                                            var187 = 4;
                                                                                                                            var186 = var186.method592(false, class164.field3376.method582(-125));
                                                                                                                        } else if (var188.method593(class42.field1009, -22331)) {
                                                                                                                            var187 = 5;
                                                                                                                            var186 = var186.method592(false, class42.field1009.method582(-64));
                                                                                                                        } else if (!var188.method593(class78.field1901, -22331)) {
                                                                                                                            if (!var188.method593(class57.field1499, -22331)) {
                                                                                                                                if (var188.method593(class174.field3582, -22331)) {
                                                                                                                                    var187 = 8;
                                                                                                                                    var186 = var186.method592(false, class174.field3582.method582(-112));
                                                                                                                                } else if (!var188.method593(class10.field246, -22331)) {
                                                                                                                                    if (!var188.method593(class68.field1711, -22331)) {
                                                                                                                                        if (var188.method593(class190.field3867, -22331)) {
                                                                                                                                            var187 = 11;
                                                                                                                                            var186 = var186.method592(false, class190.field3867.method582(-99));
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var187 = 10;
                                                                                                                                        var186 = var186.method592(false, class68.field1711.method582(-100));
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var187 = 9;
                                                                                                                                    var186 = var186.method592(false, class10.field246.method582(-107));
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var187 = 7;
                                                                                                                                var186 = var186.method592(false, class57.field1499.method582(-97));
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var187 = 6;
                                                                                                                            var186 = var186.method592(false, class78.field1901.method582(-48));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var186 = var186.method592(false, class49.field1199.method582(-63));
                                                                                                                        var187 = 2;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var186 = var186.method592(false, class84.field1994.method582(-96));
                                                                                                                    var187 = 1;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var187 = 0;
                                                                                                                var186 = var186.method592(false, class93.field2229.method582(-58));
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        var187 = 11;
                                                                                                        var186 = var186.method592(false, class190.field3869.method582(-128));
                                                                                                    }
                                                                                                } else {
                                                                                                    var187 = 7;
                                                                                                    var186 = var186.method592(false, class57.field1496.method582(-95));
                                                                                                }
                                                                                            } else {
                                                                                                var187 = 5;
                                                                                                var186 = var186.method592(false, class42.field978.method582(-117));
                                                                                            }
                                                                                        } else {
                                                                                            var187 = 4;
                                                                                            var186 = var186.method592(false, class164.field3378.method582(-91));
                                                                                        }
                                                                                    } else {
                                                                                        var186 = var186.method592(false, class49.field1197.method582(-76));
                                                                                        var187 = 2;
                                                                                    }
                                                                                } else {
                                                                                    var187 = 1;
                                                                                    var186 = var186.method592(false, class84.field2005.method582(-81));
                                                                                }
                                                                            } else {
                                                                                var186 = var186.method592(false, class93.field2201.method582(-117));
                                                                                var187 = 0;
                                                                            }
                                                                            class63 var190 = var186.method584((byte) -123);
                                                                            if (var190.method593(class35.field822, -22331)) {
                                                                                var189 = 1;
                                                                                var186 = var186.method592(false, class35.field822.method582(-119));
                                                                            } else if (!var190.method593(class83.field1980, -22331)) {
                                                                                if (var190.method593(class69.field1732, -22331)) {
                                                                                    var189 = 3;
                                                                                    var186 = var186.method592(false, class69.field1732.method582(-68));
                                                                                } else if (var190.method593(class84.field1997, -22331)) {
                                                                                    var186 = var186.method592(false, class84.field1997.method582(-100));
                                                                                    var189 = 4;
                                                                                } else if (var190.method593(class171.field3549, -22331)) {
                                                                                    var189 = 5;
                                                                                    var186 = var186.method592(false, class171.field3549.method582(-128));
                                                                                } else if (class22.field512 != 0) {
                                                                                    if (!var190.method593(class35.field817, -22331)) {
                                                                                        if (var190.method593(class83.field1975, -22331)) {
                                                                                            var186 = var186.method592(false, class83.field1975.method582(-60));
                                                                                            var189 = 2;
                                                                                        } else if (var190.method593(class69.field1731, -22331)) {
                                                                                            var186 = var186.method592(false, class69.field1731.method582(-97));
                                                                                            var189 = 3;
                                                                                        } else if (var190.method593(class84.field2001, -22331)) {
                                                                                            var189 = 4;
                                                                                            var186 = var186.method592(false, class84.field2001.method582(-67));
                                                                                        } else if (var190.method593(class171.field3548, -22331)) {
                                                                                            var186 = var186.method592(false, class171.field3548.method582(-115));
                                                                                            var189 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        var186 = var186.method592(false, class35.field817.method582(-89));
                                                                                        var189 = 1;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var186 = var186.method592(false, class83.field1980.method582(-95));
                                                                                var189 = 2;
                                                                            }
                                                                            class141.field3031.method854(193, true);
                                                                            class141.field3031.method66(2, 0);
                                                                            int var191 = class141.field3031.field54;
                                                                            class141.field3031.method66(2, var187);
                                                                            class141.field3031.method66(2, var189);
                                                                            class71.method667(var186, class141.field3031, (byte) -100);
                                                                            class141.field3031.method48((byte) 50, -var191 + class141.field3031.field54);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5010) {
                                                                        ++class151.field3173;
                                                                        var6 -= 2;
                                                                        class63 var192 = class11.field255[var6 - -1];
                                                                        class63 var193 = class11.field255[var6];
                                                                        class141.field3031.method854(61, true);
                                                                        class141.field3031.method66(2, 0);
                                                                        int var194 = class141.field3031.field54;
                                                                        class141.field3031.method32((byte) 72, var193.method590(-98));
                                                                        class71.method667(var192, class141.field3031, (byte) -117);
                                                                        class141.field3031.method48((byte) 50, -var194 + class141.field3031.field54);
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5011) {
                                                                        --var7;
                                                                        int var195 = class190.field3862[var7];
                                                                        class63 var196 = null;
                                                                        if (var195 < 100) {
                                                                            var196 = class83.field1965[var195];
                                                                        }
                                                                        if (var196 == null) {
                                                                            var196 = class118.field2645;
                                                                        }
                                                                        class11.field255[var6++] = var196;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5012) {
                                                                        --var7;
                                                                        int var197 = class190.field3862[var7];
                                                                        class63 var198 = null;
                                                                        if (var197 < 100) {
                                                                            var198 = class57.field1500[var197];
                                                                        }
                                                                        if (var198 == null) {
                                                                            var198 = class118.field2645;
                                                                        }
                                                                        class11.field255[var6++] = var198;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5016) {
                                                                        class63 var199;
                                                                        if (class3.field72 != null && class3.field72.field1552 != null) {
                                                                            var199 = class3.field72.field1552;
                                                                        } else {
                                                                            var199 = class153.field3201;
                                                                        }
                                                                        class11.field255[var6++] = var199;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5017) {
                                                                        class190.field3862[var7++] = class62.field1553;
                                                                        continue;
                                                                    }
                                                                    if (~var316 == -5018) {
                                                                        class190.field3862[var7++] = class189.field3831;
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (~var316 == -4101) {
                                                                    --var7;
                                                                    int var200 = class190.field3862[var7];
                                                                    --var6;
                                                                    class63 var201 = class11.field255[var6];
                                                                    class11.field255[var6++] = class89.method772((byte) 94, new class63[] { var201, class175.method1162((byte) -126, var200) });
                                                                    continue;
                                                                }
                                                                if (~var316 == -4102) {
                                                                    var6 -= 2;
                                                                    class63 var202 = class11.field255[var6 + 1];
                                                                    class63 var203 = class11.field255[var6];
                                                                    class11.field255[var6++] = class89.method772((byte) 60, new class63[] { var203, var202 });
                                                                    continue;
                                                                }
                                                                if (var316 == 4102) {
                                                                    --var7;
                                                                    int var204 = class190.field3862[var7];
                                                                    --var6;
                                                                    class63 var205 = class11.field255[var6];
                                                                    class11.field255[var6++] = class89.method772((byte) 48, new class63[] { var205, class123.method941(24387, true, var204) });
                                                                    continue;
                                                                }
                                                                if (~var316 == -4104) {
                                                                    --var6;
                                                                    class63 var206 = class11.field255[var6];
                                                                    class11.field255[var6++] = var206.method584((byte) -123);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4105) {
                                                                    --var7;
                                                                    int var207 = class190.field3862[var7];
                                                                    long var208 = (long) var207 * 86400000L + 1014768000000L;
                                                                    class161.field3323.setTime(new Date(var208));
                                                                    int var210 = class161.field3323.get(5);
                                                                    int var211 = class161.field3323.get(2);
                                                                    int var212 = class161.field3323.get(1);
                                                                    class11.field255[var6++] = class89.method772((byte) 40, new class63[] { class175.method1162((byte) -126, var210), class110.field2490, class189.field3830[var211], class110.field2490, class175.method1162((byte) -126, var212) });
                                                                    continue;
                                                                }
                                                                if (~var316 == -4106) {
                                                                    var6 -= 2;
                                                                    class63 var213 = class11.field255[var6 + 1];
                                                                    class63 var214 = class11.field255[var6];
                                                                    if (class3.field72.field1559 != null && class3.field72.field1559.field380) {
                                                                        class11.field255[var6++] = var213;
                                                                        continue;
                                                                    }
                                                                    class11.field255[var6++] = var214;
                                                                    continue;
                                                                }
                                                                if (~var316 == -4107) {
                                                                    --var7;
                                                                    int var215 = class190.field3862[var7];
                                                                    class11.field255[var6++] = class175.method1162((byte) -126, var215);
                                                                    continue;
                                                                }
                                                                if (var316 == 4107) {
                                                                    var6 -= 2;
                                                                    class190.field3862[var7++] = class11.field255[var6].method589(class11.field255[var6 + 1], -1669);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4109) {
                                                                    --var6;
                                                                    class63 var216 = class11.field255[var6];
                                                                    var7 -= 2;
                                                                    int var217 = class190.field3862[var7];
                                                                    int var218 = class190.field3862[var7 + 1];
                                                                    byte[] var219 = class167.field3450.method745(var218, 0, 0);
                                                                    class179 var220 = new class179(var219);
                                                                    class190.field3862[var7++] = var220.method645(var216, var217);
                                                                    continue;
                                                                }
                                                                if (var316 == 4109) {
                                                                    var7 -= 2;
                                                                    int var221 = class190.field3862[var7];
                                                                    int var222 = class190.field3862[var7 + 1];
                                                                    --var6;
                                                                    class63 var223 = class11.field255[var6];
                                                                    byte[] var224 = class167.field3450.method745(var222, 0, 0);
                                                                    class179 var225 = new class179(var224);
                                                                    class190.field3862[var7++] = var225.method649(var223, var221);
                                                                    continue;
                                                                }
                                                                if (var316 == 4110) {
                                                                    var6 -= 2;
                                                                    class63 var226 = class11.field255[var6];
                                                                    class63 var227 = class11.field255[var6 + 1];
                                                                    --var7;
                                                                    if (~class190.field3862[var7] != -2) {
                                                                        class11.field255[var6++] = var227;
                                                                    } else {
                                                                        class11.field255[var6++] = var226;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var316 == 4111) {
                                                                    --var6;
                                                                    class63 var228 = class11.field255[var6];
                                                                    class11.field255[var6++] = class70.method660(var228);
                                                                    continue;
                                                                }
                                                                if (var316 == 4112) {
                                                                    --var7;
                                                                    int var229 = class190.field3862[var7];
                                                                    --var6;
                                                                    class63 var230 = class11.field255[var6];
                                                                    class11.field255[var6++] = var230.method598(125, var229);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4114) {
                                                                    --var7;
                                                                    int var231 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class175.method1165((byte) -48, var231) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var316 == 4114) {
                                                                    --var7;
                                                                    int var232 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = !class136.method990(-86, var232) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var316 == -4116) {
                                                                    --var7;
                                                                    int var233 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = class45.method454(var233, (byte) 122) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (~var316 == -4117) {
                                                                    --var7;
                                                                    int var234 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = !class4.method80(-759, var234) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (var316 == 4117) {
                                                                    --var6;
                                                                    class63 var235 = class11.field255[var6];
                                                                    if (var235 != null) {
                                                                        class190.field3862[var7++] = var235.method582(-65);
                                                                    } else {
                                                                        class190.field3862[var7++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var316 == -4119) {
                                                                    var7 -= 2;
                                                                    --var6;
                                                                    class63 var236 = class11.field255[var6];
                                                                    int var237 = class190.field3862[var7 - -1];
                                                                    int var238 = class190.field3862[var7];
                                                                    class11.field255[var6++] = var236.method596(var238, var237, -62);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4120) {
                                                                    --var6;
                                                                    class63 var239 = class11.field255[var6];
                                                                    boolean var240 = false;
                                                                    class63 var241 = class93.method810((byte) -17, var239.method582(-98));
                                                                    for (int var242 = 0; ~var242 > ~var239.method582(-108); ++var242) {
                                                                        int var243 = var239.method573(255, var242);
                                                                        if (var243 != 60) {
                                                                            if (~var243 == -63) {
                                                                                var240 = false;
                                                                            } else if (!var240) {
                                                                                var241.method580(var243, 25153);
                                                                            }
                                                                        } else {
                                                                            var240 = true;
                                                                        }
                                                                    }
                                                                    var241.method574((byte) 96);
                                                                    class11.field255[var6++] = var241;
                                                                    continue;
                                                                }
                                                                if (var316 == 4120) {
                                                                    --var6;
                                                                    class63 var244 = class11.field255[var6];
                                                                    var7 -= 2;
                                                                    int var245 = class190.field3862[var7];
                                                                    int var246 = class190.field3862[var7 + 1];
                                                                    class190.field3862[var7++] = var244.method569(-1, var246, var245);
                                                                    continue;
                                                                }
                                                                if (~var316 == -4122) {
                                                                    var6 -= 2;
                                                                    class63 var247 = class11.field255[var6];
                                                                    class63 var248 = class11.field255[var6 - -1];
                                                                    --var7;
                                                                    int var249 = class190.field3862[var7];
                                                                    class190.field3862[var7++] = var247.method579(var248, var249, true);
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (~var316 == -3301) {
                                                                class190.field3862[var7++] = class173.field3571;
                                                                continue;
                                                            }
                                                            if (~var316 == -3302) {
                                                                var7 -= 2;
                                                                int var250 = class190.field3862[var7];
                                                                int var251 = class190.field3862[var7 - -1];
                                                                class190.field3862[var7++] = class35.method325(var251, false, var250);
                                                                continue;
                                                            }
                                                            if (~var316 == -3303) {
                                                                var7 -= 2;
                                                                int var252 = class190.field3862[var7 + 1];
                                                                int var253 = class190.field3862[var7];
                                                                class190.field3862[var7++] = class152.method1064((byte) -122, var252, var253);
                                                                continue;
                                                            }
                                                            if (~var316 == -3304) {
                                                                var7 -= 2;
                                                                int var254 = class190.field3862[var7];
                                                                int var255 = class190.field3862[var7 + 1];
                                                                class190.field3862[var7++] = class175.method1167(var255, -25170, var254);
                                                                continue;
                                                            }
                                                            if (~var316 == -3305) {
                                                                --var7;
                                                                int var256 = class190.field3862[var7];
                                                                class190.field3862[var7++] = class177.method1173(var256, -101).field3369;
                                                                continue;
                                                            }
                                                            if (~var316 == -3306) {
                                                                --var7;
                                                                int var257 = class190.field3862[var7];
                                                                class190.field3862[var7++] = class196.field3934[var257];
                                                                continue;
                                                            }
                                                            if (~var316 == -3307) {
                                                                --var7;
                                                                int var258 = class190.field3862[var7];
                                                                class190.field3862[var7++] = class114.field2551[var258];
                                                                continue;
                                                            }
                                                            if (var316 == 3307) {
                                                                --var7;
                                                                int var259 = class190.field3862[var7];
                                                                class190.field3862[var7++] = class62.field1565[var259];
                                                                continue;
                                                            }
                                                            if (var316 == 3308) {
                                                                int var260 = (class3.field72.field1141 >> 7) + class3.field110;
                                                                int var261 = class112.field2528;
                                                                int var262 = (class3.field72.field1144 >> 7) + class38.field921;
                                                                class190.field3862[var7++] = (var260 << 14) + (var261 << 28) + var262;
                                                                continue;
                                                            }
                                                            if (~var316 == -3310) {
                                                                --var7;
                                                                int var263 = class190.field3862[var7];
                                                                class190.field3862[var7++] = class110.method881(16383, var263 >> 14);
                                                                continue;
                                                            }
                                                            if (~var316 == -3311) {
                                                                --var7;
                                                                int var264 = class190.field3862[var7];
                                                                class190.field3862[var7++] = var264 >> 28;
                                                                continue;
                                                            }
                                                            if (var316 == 3311) {
                                                                --var7;
                                                                int var265 = class190.field3862[var7];
                                                                class190.field3862[var7++] = class110.method881(var265, 16383);
                                                                continue;
                                                            }
                                                            if (var316 == 3312) {
                                                                class190.field3862[var7++] = class51.field1259 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var316 == 3313) {
                                                                var7 -= 2;
                                                                int var266 = class190.field3862[var7 + 1];
                                                                int var267 = class190.field3862[var7] + 32768;
                                                                class190.field3862[var7++] = class35.method325(var266, false, var267);
                                                                continue;
                                                            }
                                                            if (var316 == 3314) {
                                                                var7 -= 2;
                                                                int var268 = class190.field3862[var7] - -32768;
                                                                int var269 = class190.field3862[var7 + 1];
                                                                class190.field3862[var7++] = class152.method1064((byte) -122, var269, var268);
                                                                continue;
                                                            }
                                                            if (~var316 == -3316) {
                                                                var7 -= 2;
                                                                int var270 = class190.field3862[var7 - -1];
                                                                int var271 = class190.field3862[var7] + 32768;
                                                                class190.field3862[var7++] = class175.method1167(var270, -25170, var271);
                                                                continue;
                                                            }
                                                            if (~var316 == -3317) {
                                                                if (class191.field3882 >= 2) {
                                                                    class190.field3862[var7++] = class191.field3882;
                                                                } else {
                                                                    class190.field3862[var7++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var316 == -3318) {
                                                                class190.field3862[var7++] = class88.field2073;
                                                                continue;
                                                            }
                                                            if (var316 == 3318) {
                                                                class190.field3862[var7++] = class105.field2408;
                                                                continue;
                                                            }
                                                            if (var316 == 3321) {
                                                                class190.field3862[var7++] = class132.field2871;
                                                                continue;
                                                            }
                                                            if (~var316 == -3323) {
                                                                class190.field3862[var7++] = class45.field1073;
                                                                continue;
                                                            }
                                                            if (var316 == 3323) {
                                                                if (~class191.field3882 != -2) {
                                                                    class190.field3862[var7++] = 0;
                                                                } else {
                                                                    class190.field3862[var7++] = 1;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var316 == -3325) {
                                                                if (~client.field715 <= -6 && client.field715 <= 9) {
                                                                    class190.field3862[var7++] = client.field715;
                                                                    continue;
                                                                }
                                                                class190.field3862[var7++] = 0;
                                                                continue;
                                                            }
                                                            if (var316 == 3325) {
                                                                if (~class13.field299 >= -1) {
                                                                    class190.field3862[var7++] = 0;
                                                                } else {
                                                                    class190.field3862[var7++] = 1;
                                                                }
                                                                continue;
                                                            }
                                                            if (var316 == 3326) {
                                                                class190.field3862[var7++] = class3.field72.field1569;
                                                                continue;
                                                            }
                                                            if (~var316 == -3328) {
                                                                class190.field3862[var7++] = !class3.field72.field1559.field380 ? 0 : 1;
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        --var7;
                                                        class54 var272 = class59.method555(class190.field3862[var7], 32173);
                                                        if (~var316 == -2601) {
                                                            class190.field3862[var7++] = var272.field1390;
                                                            continue;
                                                        }
                                                        if (~var316 == -2602) {
                                                            class190.field3862[var7++] = var272.field1405;
                                                            continue;
                                                        }
                                                        if (~var316 == -2603) {
                                                            class11.field255[var6++] = var272.field1342;
                                                            continue;
                                                        }
                                                        if (var316 == 2603) {
                                                            class190.field3862[var7++] = var272.field1356;
                                                            continue;
                                                        }
                                                        if (var316 == 2604) {
                                                            class190.field3862[var7++] = var272.field1369;
                                                            continue;
                                                        }
                                                        if (~var316 == -2606) {
                                                            class190.field3862[var7++] = var272.field1320;
                                                            continue;
                                                        }
                                                        if (var316 == 2606) {
                                                            class190.field3862[var7++] = var272.field1418;
                                                            continue;
                                                        }
                                                        if (var316 == 2607) {
                                                            class190.field3862[var7++] = var272.field1321;
                                                            continue;
                                                        }
                                                        if (var316 == 2608) {
                                                            class190.field3862[var7++] = var272.field1421;
                                                            continue;
                                                        }
                                                        if (~var316 == -2610) {
                                                            class190.field3862[var7++] = var272.field1328;
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    --var7;
                                                    class54 var273 = class59.method555(class190.field3862[var7], 32173);
                                                    if (~var316 == -2501) {
                                                        class190.field3862[var7++] = var273.field1333;
                                                        continue;
                                                    }
                                                    if (~var316 == -2502) {
                                                        class190.field3862[var7++] = var273.field1304;
                                                        continue;
                                                    }
                                                    if (~var316 == -2503) {
                                                        class190.field3862[var7++] = var273.field1302;
                                                        continue;
                                                    }
                                                    if (~var316 == -2504) {
                                                        class190.field3862[var7++] = var273.field1435;
                                                        continue;
                                                    }
                                                    if (var316 == 2504) {
                                                        class190.field3862[var7++] = !var273.field1433 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var316 == 2505) {
                                                        class190.field3862[var7++] = var273.field1353;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                class54 var274 = var42 ? class117.field2623 : class187.field3776;
                                                if (var316 == 1800) {
                                                    class190.field3862[var7++] = class186.method1221((byte) -109, class10.method136((byte) -98, var274));
                                                    continue;
                                                }
                                                if (var316 == 1801) {
                                                    --var7;
                                                    int var275 = class190.field3862[var7];
                                                    int var318 = var275 - 1;
                                                    if (var274.field1373 != null && var318 < var274.field1373.length && var274.field1373[var318] != null) {
                                                        class11.field255[var6++] = var274.field1373[var318];
                                                        continue;
                                                    }
                                                    class11.field255[var6++] = class118.field2645;
                                                    continue;
                                                }
                                                if (var316 == 1802) {
                                                    if (var274.field1381 == null) {
                                                        class11.field255[var6++] = class118.field2645;
                                                    } else {
                                                        class11.field255[var6++] = var274.field1381;
                                                    }
                                                    continue;
                                                }
                                            }
                                        } else {
                                            class54 var276 = var42 ? class117.field2623 : class187.field3776;
                                            if (var316 == 1600) {
                                                class190.field3862[var7++] = var276.field1390;
                                                continue;
                                            }
                                            if (~var316 == -1602) {
                                                class190.field3862[var7++] = var276.field1405;
                                                continue;
                                            }
                                            if (var316 == 1602) {
                                                class11.field255[var6++] = var276.field1342;
                                                continue;
                                            }
                                            if (~var316 == -1604) {
                                                class190.field3862[var7++] = var276.field1356;
                                                continue;
                                            }
                                            if (var316 == 1604) {
                                                class190.field3862[var7++] = var276.field1369;
                                                continue;
                                            }
                                            if (var316 == 1605) {
                                                class190.field3862[var7++] = var276.field1320;
                                                continue;
                                            }
                                            if (~var316 == -1607) {
                                                class190.field3862[var7++] = var276.field1418;
                                                continue;
                                            }
                                            if (var316 == 1607) {
                                                class190.field3862[var7++] = var276.field1321;
                                                continue;
                                            }
                                            if (var316 == 1608) {
                                                class190.field3862[var7++] = var276.field1421;
                                                continue;
                                            }
                                            if (~var316 == -1610) {
                                                class190.field3862[var7++] = var276.field1328;
                                                continue;
                                            }
                                        }
                                    }
                                } else {
                                    class54 var288;
                                    if (var316 < 2000) {
                                        var288 = var42 ? class117.field2623 : class187.field3776;
                                    } else {
                                        --var7;
                                        var288 = class59.method555(class190.field3862[var7], 32173);
                                        var316 -= 1000;
                                    }
                                    if (~var316 == -1101) {
                                        var7 -= 2;
                                        var288.field1390 = class190.field3862[var7];
                                        if (~(-var288.field1302 + var288.field1356) > ~var288.field1390) {
                                            var288.field1390 = -var288.field1302 + var288.field1356;
                                        }
                                        if (~var288.field1390 > -1) {
                                            var288.field1390 = 0;
                                        }
                                        var288.field1405 = class190.field3862[var7 - -1];
                                        if (-var288.field1435 + var288.field1369 < var288.field1405) {
                                            var288.field1405 = -var288.field1435 + var288.field1369;
                                        }
                                        if (~var288.field1405 > -1) {
                                            var288.field1405 = 0;
                                        }
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1101) {
                                        --var7;
                                        var288.field1358 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1103) {
                                        --var7;
                                        var288.field1314 = class190.field3862[var7] == 1;
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1103) {
                                        --var7;
                                        var288.field1328 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1105) {
                                        --var7;
                                        var288.field1301 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1106) {
                                        --var7;
                                        var288.field1313 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1107) {
                                        --var7;
                                        var288.field1370 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1107) {
                                        --var7;
                                        var288.field1419 = class190.field3862[var7] == 1;
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1108) {
                                        var288.field1404 = 1;
                                        --var7;
                                        var288.field1443 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1109) {
                                        var7 -= 6;
                                        var288.field1431 = class190.field3862[var7];
                                        var288.field1415 = class190.field3862[var7 + 1];
                                        var288.field1418 = class190.field3862[var7 + 2];
                                        var288.field1421 = class190.field3862[var7 + 3];
                                        var288.field1321 = class190.field3862[var7 + 4];
                                        var288.field1320 = class190.field3862[var7 + 5];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1111) {
                                        --var7;
                                        int var289 = class190.field3862[var7];
                                        if (~var288.field1361 != ~var289) {
                                            var288.field1429 = 0;
                                            var288.field1361 = var289;
                                            var288.field1307 = 0;
                                            class113.method901(0, var288);
                                        }
                                        continue;
                                    }
                                    if (~var316 == -1112) {
                                        --var7;
                                        var288.field1363 = class190.field3862[var7] == 1;
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1112) {
                                        --var6;
                                        class63 var290 = class11.field255[var6];
                                        if (!var290.method568(var288.field1342, (byte) -127)) {
                                            var288.field1342 = var290;
                                            class113.method901(0, var288);
                                        }
                                        continue;
                                    }
                                    if (~var316 == -1114) {
                                        --var7;
                                        var288.field1341 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1114) {
                                        var7 -= 3;
                                        var288.field1420 = class190.field3862[var7];
                                        var288.field1422 = class190.field3862[var7 + 1];
                                        var288.field1442 = class190.field3862[var7 + 2];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1115) {
                                        --var7;
                                        var288.field1319 = class190.field3862[var7] == 1;
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1116) {
                                        --var7;
                                        var288.field1406 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1118) {
                                        --var7;
                                        var288.field1382 = class190.field3862[var7];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (var316 == 1118) {
                                        --var7;
                                        var288.field1372 = class190.field3862[var7] == 1;
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1120) {
                                        --var7;
                                        var288.field1383 = ~class190.field3862[var7] == -2;
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                    if (~var316 == -1121) {
                                        var7 -= 2;
                                        var288.field1356 = class190.field3862[var7];
                                        var288.field1369 = class190.field3862[var7 + 1];
                                        class113.method901(0, var288);
                                        continue;
                                    }
                                }
                            } else {
                                if (~var316 == -404) {
                                    var7 -= 2;
                                    int var291 = class190.field3862[var7];
                                    if (var291 >= 7) {
                                        var291 -= 7;
                                    }
                                    int var292 = class190.field3862[var7 - -1];
                                    class3.field72.field1559.method171(var292, 63, var291);
                                    continue;
                                }
                                if (var316 == 404) {
                                    var7 -= 2;
                                    int var293 = class190.field3862[var7];
                                    int var294 = class190.field3862[var7 - -1];
                                    class3.field72.field1559.method175((byte) -57, var293, var294);
                                    continue;
                                }
                                if (~var316 == -411) {
                                    --var7;
                                    boolean var295 = ~class190.field3862[var7] != -1;
                                    class3.field72.field1559.method181(var295, 12);
                                    continue;
                                }
                            }
                        } else {
                            if (var316 == 100) {
                                var7 -= 3;
                                int var296 = class190.field3862[var7 - -1];
                                int var297 = class190.field3862[var7];
                                int var298 = class190.field3862[var7 + 2];
                                if (var296 == 0) {
                                    throw new RuntimeException();
                                }
                                class54 var299 = class59.method555(var297, 32173);
                                if (var299.field1368 == null) {
                                    var299.field1368 = new class54[var298 + 1];
                                }
                                if (var299.field1368.length <= var298) {
                                    class54[] var300 = new class54[var298 + 1];
                                    for (int var301 = 0; var301 < var299.field1368.length; ++var301) {
                                        var300[var301] = var299.field1368[var301];
                                    }
                                    var299.field1368 = var300;
                                }
                                if (~var298 < -1 && var299.field1368[var298 + -1] == null) {
                                    throw new RuntimeException("Gap at:" + (var298 + -1));
                                }
                                class54 var302 = new class54();
                                var302.field1408 = var298;
                                var302.field1432 = var296;
                                var302.field1353 = var302.field1323 = var299.field1323;
                                var302.field1336 = true;
                                var299.field1368[var298] = var302;
                                if (var42) {
                                    class117.field2623 = var302;
                                } else {
                                    class187.field3776 = var302;
                                }
                                class113.method901(0, var299);
                                continue;
                            }
                            if (var316 == 101) {
                                class54 var303 = var42 ? class117.field2623 : class187.field3776;
                                if (~var303.field1408 == 0) {
                                    if (!var42) {
                                        throw new RuntimeException("Tried to cc_delete static active-component!");
                                    }
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                class54 var304 = class59.method555(var303.field1323, 32173);
                                var304.field1368[var303.field1408] = null;
                                class113.method901(0, var304);
                                continue;
                            }
                            if (~var316 == -103) {
                                --var7;
                                class54 var305 = class59.method555(class190.field3862[var7], 32173);
                                var305.field1368 = null;
                                class113.method901(0, var305);
                                continue;
                            }
                            if (~var316 == -201) {
                                var7 -= 2;
                                int var306 = class190.field3862[var7 - -1];
                                int var307 = class190.field3862[var7];
                                class54 var308 = class12.method149(var306, var307, 12226);
                                if (var308 != null && ~var306 != 0) {
                                    class190.field3862[var7++] = 1;
                                    if (!var42) {
                                        class187.field3776 = var308;
                                    } else {
                                        class117.field2623 = var308;
                                    }
                                    continue;
                                }
                                class190.field3862[var7++] = 0;
                                continue;
                            }
                            if (~var316 == -202) {
                                --var7;
                                int var309 = class190.field3862[var7];
                                class54 var310 = class59.method555(var309, 32173);
                                if (var310 == null) {
                                    class190.field3862[var7++] = 0;
                                } else {
                                    class190.field3862[var7++] = 1;
                                    if (!var42) {
                                        class187.field3776 = var310;
                                    } else {
                                        class117.field2623 = var310;
                                    }
                                }
                                continue;
                            }
                        }
                        throw new IllegalStateException();
                    }
                } catch (Exception var315) {
                    if (var5.field2608 == null) {
                        if (~class175.field3589 != -1) {
                            class100.method843((byte) -105, 0, class118.field2645, class129.field2831);
                        }
                        class199.method1302("CS2 - scr:" + var5.field3612 + " op:" + var11, var315, true);
                    } else {
                        class63 var312 = class93.method810((byte) -17, 30);
                        var312.method570((byte) 122, class175.field3585).method570((byte) 119, var5.field2608);
                        for (int var313 = field1868 + -1; ~var313 <= -1; --var313) {
                            var312.method570((byte) 118, class10.field235).method570((byte) 114, class51.field1249[var313].field2824.field2608);
                        }
                        if (var11 == 40) {
                            int var314 = var10[var8];
                            var312.method570((byte) 113, class144.field3084).method570((byte) 114, class175.method1162((byte) -126, var314));
                        }
                        if (class175.field3589 != 0) {
                            class100.method843((byte) -113, 0, class118.field2645, class89.method772((byte) 34, new class63[] { class12.field296, var5.field2608 }));
                        }
                        class199.method1302("CS2 - scr:" + var5.field3612 + " op:" + var11 + new String(var312.method604((byte) 101)), var315, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static void method689(int arg0) {
        field1847 = null;
        field1842 = null;
        if (arg0 == 3) {
            field1855 = null;
            field1856 = null;
            field1845 = null;
            field1848 = null;
            field1853 = null;
            field1859 = null;
            field1862 = null;
            field1861 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 < 32) {
            this.method685(123, 108, 118, 58);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1843 = (arg2.method73((byte) 29) << 12) / 100;
                }
            } else {
                this.field1850 = (arg2.method73((byte) 29) << 12) / 100;
            }
        } else {
            this.field1860 = arg2.method25(0);
        }
        ++field1846;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        if (arg1 <= 34) {
            this.method686(94, true, 19, -100);
        }
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[][] var4 = this.method1244((byte) 20, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class54.field1430; ++var11) {
                this.method685(1414, var10[var11], var6[var11], var5[var11]);
                this.field1841 += this.field1843;
                if (~this.field1841 > -1) {
                    this.field1841 = 0;
                }
                this.field1854 += this.field1850;
                this.field1864 += this.field1860;
                if (~this.field1854 > -1) {
                    this.field1854 = 0;
                }
                while (this.field1864 < 0) {
                    this.field1864 += 4096;
                }
                while (this.field1864 > 4096) {
                    this.field1864 -= 4096;
                }
                if (~this.field1841 < -4097) {
                    this.field1841 = 4096;
                }
                if (this.field1854 > 4096) {
                    this.field1854 = 4096;
                }
                this.method686(this.field1864, true, this.field1841, this.field1854);
                var7[var11] = this.field1857;
                var8[var11] = this.field1866;
                var9[var11] = this.field1849;
            }
        }
        ++field1858;
        return var3;
    }
}
