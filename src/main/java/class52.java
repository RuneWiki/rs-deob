import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class52 {

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[I")
    private int[] field934;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[I")
    private int[] field936;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lhe;")
    private class82 field928;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lhe;")
    private class82 field927;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[Lhe;")
    private class82[] field939;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Lri;")
    public static class189 field930 = new class189(100);

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Ldj;")
    public static class44 field935 = class89.method650(255, "Welt");

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "Ldj;")
    public static class44 field942 = class89.method650(255, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lwc;")
    public static class233 field937;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static final void method373(int arg0) {
        for (int var1 = 0; var1 < class27.field490; var1++) {
            int var2 = class143.field2533[var1];
            class121 var3 = class170.field2960[var2];
            int var4 = class218.field3957.method506(255);
            if ((var4 & 0x8) != 0) {
                var3.field2156 = class154.method996(class218.field3957.method529((byte) 123), (byte) -128);
                var3.field2256 = var3.field2156.field3594;
                var3.field2196 = var3.field2156.field3576;
                var3.field2197 = var3.field2156.field3590;
                var3.field2258 = var3.field2156.field3619;
                var3.field2201 = var3.field2156.field3623;
                var3.field2253 = var3.field2156.field3592;
                var3.field2242 = var3.field2156.field3609;
                var3.field2231 = var3.field2156.field3620;
                var3.field2251 = var3.field2156.field3577;
            }
            if ((var4 & 0x80) != 0) {
                int var5 = class218.field3957.method504((byte) -124);
                int var6 = class218.field3957.method512((byte) 109);
                var3.method853((byte) -124, var6, class46.field868, var5);
                var3.field2225 = class46.field868 + 300;
                var3.field2204 = class218.field3957.method512((byte) 60);
            }
            if ((var4 & 0x2) != 0) {
                int var7 = class218.field3957.method529((byte) 123);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class218.field3957.method534(-5738);
                if (var3.field2243 == var7 && var7 != -1) {
                    class204 var9 = class94.method672(var7, -89);
                    int var10 = var9.field3646;
                    if (var10 == 1) {
                        var3.field2222 = var8;
                        var3.field2255 = 0;
                        var3.field2215 = 0;
                        var3.field2252 = 0;
                        class139.method937(var9, var3.field2260, -78, var3.field2195, var3.field2252, false);
                    }
                    if (var10 == 2) {
                        var3.field2215 = 0;
                    }
                } else if (var7 == -1 || var3.field2243 == -1 || class94.method672(var7, -82).field3643 >= class94.method672(var3.field2243, 114).field3643) {
                    var3.field2243 = var7;
                    var3.field2222 = var8;
                    var3.field2203 = var3.field2194;
                    var3.field2255 = 0;
                    var3.field2215 = 0;
                    var3.field2252 = 0;
                    if (var3.field2243 != -1) {
                        class139.method937(class94.method672(var3.field2243, -96), var3.field2260, -109, var3.field2195, var3.field2252, false);
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field2210 = class218.field3957.method500(83);
                var3.field2246 = class218.field3957.method500(78);
            }
            if ((var4 & 0x4) != 0) {
                int var11 = class218.field3957.method506(255);
                int var12 = class218.field3957.method504((byte) -124);
                var3.method853((byte) -124, var12, class46.field868, var11);
            }
            if ((var4 & 0x10) != 0) {
                var3.field2259 = class218.field3957.method529((byte) 123);
                if (var3.field2259 == 65535) {
                    var3.field2259 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field2262 = class218.field3957.method496(true);
                var3.field2238 = 100;
            }
            if ((var4 & 0x40) != 0) {
                var3.field2205 = class218.field3957.method487(-32674);
                int var13 = class218.field3957.method528(true);
                var3.field2209 = var13 >> 16;
                var3.field2223 = (var13 & 0xFFFF) + class46.field868;
                if (var3.field2205 == 65535) {
                    var3.field2205 = -1;
                }
                var3.field2247 = 0;
                var3.field2221 = 0;
                if (class46.field868 < var3.field2223) {
                    var3.field2221 = -1;
                }
            }
        }
        field938++;
        if (arg0 >= -62) {
            method378(15);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLef;ZLve;IBID)[I")
    public final int[] method374(boolean arg0, class51 arg1, boolean arg2, class225 arg3, int arg4, byte arg5, int arg6, double arg7) {
        class32.method219(arg5 ^ 0x10, arg7);
        class122.field2162 = arg3;
        field941++;
        int[] var10 = new int[arg4 * arg6];
        class32.field552 = arg1;
        class231.method1512(arg4, -1, arg6);
        if (arg5 != 97) {
            method376(-40, -12);
        }
        for (int var11 = 0; var11 < this.field939.length; var11++) {
            this.field939[var11].method618(arg6, -256, arg4);
        }
        byte var12;
        int var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var13 = -1;
            var14 = arg4 - 1;
        } else {
            var12 = 1;
            var14 = 0;
            var13 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field928.field1599) {
                int[] var18 = this.field928.method3(25238, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field928.method6(-65, var16);
                var20 = var22[2];
                var21 = var22[0];
                var19 = var22[1];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var20[var23] >> 4;
                int var27 = class116.field2073[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class116.field2073[var25];
                int var29 = class116.field2073[var26];
                var10[var15++] = (var27 << 16) + (var28 << 8) + var29;
                if (arg2) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field939.length; var17++) {
            this.field939[var17].method210(arg5 ^ 0x60);
        }
        return var10;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
    public static void method375(boolean arg0) {
        field930 = null;
        if (!arg0) {
            method378(16);
        }
        field937 = null;
        field935 = null;
        field942 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method376(int arg0, int arg1) {
        field933++;
        class93 var2 = (class93) class54.field990.method828((long) arg1, (byte) -40);
        if (var2 != null) {
            if (arg0 >= -36) {
                method375(true);
            }
            var2.method1148(-13215);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lef;BLve;)Z")
    public final boolean method377(class51 arg0, byte arg1, class225 arg2) {
        field932++;
        for (int var4 = 0; var4 < this.field936.length; var4++) {
            if (!arg2.method1467(true, this.field936[var4])) {
                return false;
            }
        }
        if (arg1 < 9) {
            return false;
        }
        for (int var5 = 0; var5 < this.field934.length; var5++) {
            if (!arg0.method372(this.field934[var5], (byte) 30)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static final void method378(int arg0) {
        class97.method682(-101, false);
        class116.field2079 = 0;
        field931++;
        boolean var1 = true;
        for (int var2 = 0; var2 < class130.field2332.length; var2++) {
            if (class193.field3377[var2] != -1 && class130.field2332[var2] == null) {
                class130.field2332[var2] = class208.field3736.method1466(class193.field3377[var2], 0, (byte) -126);
                if (class130.field2332[var2] == null) {
                    var1 = false;
                    class116.field2079++;
                }
            }
            if (class80.field1554[var2] != -1 && class37.field665[var2] == null) {
                class37.field665[var2] = class208.field3736.method1476(class80.field1554[var2], -70, 0, class62.field1161[var2]);
                if (class37.field665[var2] == null) {
                    var1 = false;
                    class116.field2079++;
                }
            }
        }
        if (!var1) {
            class63.field1172 = 1;
            return;
        }
        boolean var3 = true;
        class145.field2560 = 0;
        for (int var4 = 0; var4 < class130.field2332.length; var4++) {
            byte[] var55 = class37.field665[var4];
            if (var55 != null) {
                int var56 = (class174.field3028[var4] & 0xFF) * 64 - class143.field2550;
                int var57 = (class174.field3028[var4] >> 8) * 64 - class222.field4020;
                if (class147.field2599) {
                    var57 = 10;
                    var56 = 10;
                }
                var3 &= class117.method822(var55, 0, var57, var56);
            }
        }
        if (!var3) {
            class63.field1172 = 2;
            return;
        }
        if (class63.field1172 != 0) {
            class151.method976(true, (byte) 122, class70.method555(new class44[] { class172.field2997, class147.field2600 }, -3));
        }
        class74.method581((byte) -102);
        class162.method1050((byte) -15);
        class74.method581((byte) -102);
        class196.method1274();
        class74.method581((byte) -91);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class73.field1390[var5].method1405(-5);
        }
        int var6 = 0;
        int var7 = 53 / ((arg0 + 45) / 33);
        while (var6 < 4) {
            for (int var53 = 0; var53 < 104; var53++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    class47.field875[var6][var53][var54] = 0;
                }
            }
            var6++;
        }
        class74.method581((byte) -116);
        class200.method1289((byte) -56);
        int var8 = class130.field2332.length;
        class89.method653(true);
        class97.method682(-96, true);
        if (!class147.field2599) {
            for (int var9 = 0; var9 < var8; var9++) {
                int var19 = (class174.field3028[var9] >> 8) * 64 - class222.field4020;
                int var20 = (class174.field3028[var9] & 0xFF) * 64 - class143.field2550;
                byte[] var21 = class130.field2332[var9];
                if (var21 != null) {
                    class74.method581((byte) -92);
                    class239.method1547(var21, var19, (class129.field2298 - 6) * 8, var20, (byte) -58, class73.field1390, (class134.field2403 - 6) * 8);
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                int var15 = (class174.field3028[var10] >> 8) * 64 - class222.field4020;
                byte[] var16 = class130.field2332[var10];
                int var17 = (class174.field3028[var10] & 0xFF) * 64 - class143.field2550;
                if (var16 == null && class129.field2298 < 800) {
                    class74.method581((byte) -115);
                    for (int var18 = 0; var18 < 4; var18++) {
                        class49.method358(64, var17, var18, 64, var15, 104);
                    }
                }
            }
            class97.method682(40, true);
            for (int var11 = 0; var11 < var8; var11++) {
                byte[] var12 = class37.field665[var11];
                if (var12 != null) {
                    int var13 = (class174.field3028[var11] >> 8) * 64 - class222.field4020;
                    int var14 = (class174.field3028[var11] & 0xFF) * 64 - class143.field2550;
                    class74.method581((byte) -105);
                    class39.method268(var12, var14, class73.field1390, var13, 22838);
                }
            }
        }
        if (class147.field2599) {
            for (int var22 = 0; var22 < 4; var22++) {
                class74.method581((byte) -88);
                for (int var33 = 0; var33 < 13; var33++) {
                    for (int var34 = 0; var34 < 13; var34++) {
                        boolean var35 = false;
                        int var36 = class128.field2279[var22][var33][var34];
                        if (var36 != -1) {
                            int var37 = var36 >> 1 & 0x3;
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 3 & 0x7FF;
                            int var41 = (var39 / 8 << 8) + var40 / 8;
                            for (int var42 = 0; var42 < class174.field3028.length; var42++) {
                                if (class174.field3028[var42] == var41 && class130.field2332[var42] != null) {
                                    class70.method550(var34 * 8, class73.field1390, (var40 & 0x7) * 8, 27837, var38, var22, (var39 & 0x7) * 8, var37, var33 * 8, class130.field2332[var42]);
                                    var35 = true;
                                    break;
                                }
                            }
                        }
                        if (!var35) {
                            class49.method358(8, var34 * 8, var22, 8, var33 * 8, 104);
                        }
                    }
                }
            }
            class97.method682(-90, true);
            for (int var23 = 0; var23 < 4; var23++) {
                class74.method581((byte) -115);
                for (int var24 = 0; var24 < 13; var24++) {
                    for (int var25 = 0; var25 < 13; var25++) {
                        int var26 = class128.field2279[var23][var24][var25];
                        if (var26 != -1) {
                            int var27 = var26 >> 1 & 0x3;
                            int var28 = var26 >> 24 & 0x3;
                            int var29 = var26 >> 3 & 0x7FF;
                            int var30 = var26 >> 14 & 0x3FF;
                            int var31 = (var30 / 8 << 8) + var29 / 8;
                            for (int var32 = 0; var32 < class174.field3028.length; var32++) {
                                if (class174.field3028[var32] == var31 && class37.field665[var32] != null) {
                                    class13.method120(var25 * 8, class37.field665[var32], class73.field1390, var28, var24 * 8, (var29 & 0x7) * 8, var27, (var30 & 0x7) * 8, (byte) 105, var23);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class97.method682(-120, true);
        class162.method1050((byte) -82);
        class74.method581((byte) -96);
        class173.method1100(class73.field1390, (byte) -117);
        class97.method682(50, true);
        int var43 = class88.field1683;
        if (var43 > class194.field3403) {
            var43 = class194.field3403;
        }
        if (var43 < class194.field3403 - 1) {
            int var44 = class194.field3403 - 1;
        }
        if (class33.field583) {
            class74.method574(class88.field1683);
        } else {
            class74.method574(0);
        }
        for (int var45 = 0; var45 < 104; var45++) {
            for (int var52 = 0; var52 < 104; var52++) {
                class40.method279((byte) -98, var45, var52);
            }
        }
        class74.method581((byte) -87);
        class169.method1078(true);
        class162.method1050((byte) -23);
        if (class35.field620 != null) {
            class200.field3542.method1170(163, (byte) -110);
            class200.field3542.method489(1057001181, -89);
            class184.field3197++;
        }
        if (!class147.field2599) {
            int var46 = (class134.field2403 + 6) / 8;
            int var47 = (class129.field2298 - 6) / 8;
            int var48 = (class134.field2403 - 6) / 8;
            int var49 = (class129.field2298 + 6) / 8;
            for (int var50 = var48 - 1; var50 <= var46 + 1; var50++) {
                for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                    if (var50 < var48 || var46 < var50 || var47 > var51 || var49 < var51) {
                        class208.field3736.method1458((byte) -127, class70.method555(new class44[] { class239.field4425, class199.method1287(var50, -1), class79.field1522, class199.method1287(var51, -1) }, -3));
                        class208.field3736.method1458((byte) -127, class70.method555(new class44[] { class143.field2540, class199.method1287(var50, -1), class79.field1522, class199.method1287(var51, -1) }, -3));
                    }
                }
            }
        }
        class62.method467(30, (byte) 57);
        class74.method581((byte) -110);
        class64.method475((byte) 122);
        class200.field3542.method1170(77, (byte) -71);
        class54.method386(-114);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class52() {
        this.field934 = new int[0];
        this.field936 = new int[0];
        this.field928 = new class193();
        this.field928.field1588 = 1;
        this.field927 = new class193();
        this.field927.field1588 = 1;
        this.field939 = new class82[] { this.field928, this.field927 };
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lfj;)V")
    public class52(class66 arg0) {
        int var2 = arg0.method506(255);
        this.field939 = new class82[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class82 var16 = class44.method298((byte) 98, arg0);
            if (var16.method616(-1) >= 0) {
                var4++;
            }
            if (var16.method211(20636) >= 0) {
                var3++;
            }
            int var17 = var16.field1587.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method506(255);
            }
            this.field939[var6] = var16;
        }
        this.field934 = new int[var3];
        this.field936 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class82 var11 = this.field939[var9];
            int var12 = var11.field1587.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1587[var13] = this.field939[var5[var9][var13]];
            }
            int var14 = var11.method616(-1);
            int var15 = var11.method211(20636);
            if (var14 > 0) {
                this.field936[var7++] = var14;
            }
            if (var15 > 0) {
                this.field934[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field928 = this.field939[arg0.method506(255)];
        this.field927 = this.field939[arg0.method506(255)];
    }
}
