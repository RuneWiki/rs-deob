import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class52 extends class117 {

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    private int field875 = 4096;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    private int field878 = 4096;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    private int field872 = 4096;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "Loj;")
    public static class17 field863 = new class17(64);

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "Lhh;")
    public static class163 field873 = class137.method1065("<img=1>", 17);

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Lhh;")
    public static class163 field871 = class137.method1065("Ladevorgang )2 bitte warten Sie)3", 17);

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    public static int field877 = 0;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "Lhh;")
    public static class163 field876 = class137.method1065(")1", 17);

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field874 = new CRC32();

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public static final void method360(byte arg0) {
        ++field870;
        if (arg0 > 19) {
            for (int var1 = 0; ~var1 > -6; ++var1) {
                class131.field2535[var1] = false;
            }
            class192.field3513 = -1;
            class5.field99 = 1;
            class125.field2414 = -1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lme;ILpa;Lpa;)V")
    public static final void method361(class156 arg0, int arg1, class123 arg2, class123 arg3) {
        class125.field2406 = arg3;
        class199.field3569 = arg2;
        if (arg1 != 32767) {
            method366(107, -57, 64);
        }
        class14.field214 = arg0;
        ++field867;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILvf;ILqh;IZ)V")
    public static final void method362(int arg0, int arg1, class71 arg2, int arg3, class69 arg4, int arg5, boolean arg6) {
        ++field865;
        if (arg2 != null) {
            int var7 = 2047 & class93.field1750 + class40.field667;
            int var8 = Math.max(arg4.field1183 / 2, arg4.field1220 / 2) - -10;
            int var9 = arg0 * arg0 + arg5 * arg5;
            if (var9 <= var8 * var8) {
                if (!arg6) {
                    method363((byte) -11);
                }
                int var10 = class98.field1839[var7];
                int var11 = var10 * 256 / (class26.field410 + 256);
                int var12 = class98.field1843[var7];
                int var13 = var12 * 256 / (class26.field410 + 256);
                int var14 = arg5 * var13 + -(arg0 * var11) >> 16;
                int var15 = arg0 * var13 + arg5 * var11 >> 16;
                ((class105) arg2).method852(arg4.field1183 / 2 + arg3 - -var15 + -(arg2.field1339 / 2), -var14 + arg1 + -(arg2.field1345 / 2) - -(arg4.field1220 / 2), arg4.field1262, arg4.field1306);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(B)V")
    public static void method363(byte arg0) {
        field871 = null;
        field873 = null;
        field876 = null;
        int var1 = 92 % ((arg0 - 32) / 35);
        field874 = null;
        field863 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BII)I")
    public static final int method364(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return 56;
        } else {
            ++field866;
            return class122.method956(0, arg0, arg1, 15953);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            this.method60(-113, 31, (class81) null);
        }
        ++field869;
        int[][] var3 = super.field2228.method1304(arg0, (byte) -63);
        if (super.field2228.field3221) {
            int[][] var4 = this.method931(arg0, 111, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class143.field2702; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var9[var11];
                if (~var12 == ~var14 && var13 == var14) {
                    var7[var11] = this.field878 * var12 >> 12;
                    var8[var11] = this.field875 * var14 >> 12;
                    var10[var11] = this.field872 * var13 >> 12;
                } else {
                    var7[var11] = this.field878;
                    var8[var11] = this.field875;
                    var10[var11] = this.field872;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!method366(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class234.method1620(var6 + 1, class228.field4107[arg0][arg1][arg3] + arg5, var7 + 1) && class234.method1620(var6 + 128 - 1, class228.field4107[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class234.method1620(var6 + 128 - 1, class228.field4107[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class234.method1620(var6 + 1, class228.field4107[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class45.field763[arg0][var8][var14] == -class114.field2147) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class228.field4107[arg0][arg1][arg3] + arg5;
            if (!class234.method1620(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class234.method1620(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class234.method1620(var9, var11, var13)) {
                        return false;
                    } else if (!class234.method1620(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)Z")
    public static final boolean method366(int arg0, int arg1, int arg2) {
        int var3 = class45.field763[arg0][arg1][arg2];
        if (-class114.field2147 == var3) {
            return false;
        } else if (class114.field2147 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class234.method1620(var4 + 1, class228.field4107[arg0][arg1][arg2], var5 + 1) && class234.method1620(var4 + 128 - 1, class228.field4107[arg0][arg1 + 1][arg2], var5 + 1) && class234.method1620(var4 + 128 - 1, class228.field4107[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class234.method1620(var4 + 1, class228.field4107[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class45.field763[arg0][arg1][arg2] = class114.field2147;
                return true;
            } else {
                class45.field763[arg0][arg1][arg2] = -class114.field2147;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static final void method367(int arg0) {
        if (class226.field4088 > 0) {
            --class226.field4088;
        }
        if (class71.field1349 > 1) {
            --class71.field1349;
            class204.field3693 = class24.field384;
        }
        ++field862;
        if (class248.field4379) {
            class248.field4379 = false;
            class62.method426((byte) 96);
        } else {
            for (int var1 = 0; var1 < 100 && class14.method95((byte) 3); ++var1) {
            }
            if (class262.field4583 == 30) {
                class57.method399(class191.field3499, (byte) -73, 162);
                Object var2 = class146.field2783.field2518;
                synchronized (class146.field2783.field2518) {
                    if (!class40.field670) {
                        class146.field2783.field2529 = 0;
                    } else if (~class31.field489 != -1 || ~class146.field2783.field2529 <= -41) {
                        class191.field3499.method75(207, arg0 ^ 248);
                        class191.field3499.method655(arg0 + -128, 0);
                        ++class196.field3532;
                        int var3 = 0;
                        int var4 = class191.field3499.field1541;
                        for (int var5 = 0; class146.field2783.field2529 > var5 && -var4 + class191.field3499.field1541 < 240; ++var5) {
                            ++var3;
                            int var6 = class146.field2783.field2526[var5];
                            if (var6 >= 0) {
                                if (var6 > 65534) {
                                    var6 = 65534;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class146.field2783.field2527[var5];
                            if (~var7 <= -1) {
                                if (var7 > 65534) {
                                    var7 = 65534;
                                }
                            } else {
                                var7 = 0;
                            }
                            boolean var8 = false;
                            if (class146.field2783.field2526[var5] == -1 && ~class146.field2783.field2527[var5] == 0) {
                                var6 = -1;
                                var8 = true;
                                var7 = -1;
                            }
                            if (~class55.field902 == ~var7 && ~class245.field4325 == ~var6) {
                                if (~class165.field3046 > -2048) {
                                    ++class165.field3046;
                                }
                            } else {
                                int var9 = var7 - class55.field902;
                                class55.field902 = var7;
                                int var10 = -class245.field4325 + var6;
                                class245.field4325 = var6;
                                if (class165.field3046 < 8 && var9 >= -32 && ~var9 >= -32 && var10 >= -32 && ~var10 >= -32) {
                                    var9 += 32;
                                    var10 += 32;
                                    class191.field3499.method631((class165.field3046 << 12) + ((var9 << 6) - -var10), -1);
                                    class165.field3046 = 0;
                                } else if (class165.field3046 < 32 && var9 >= -128 && ~var9 >= -128 && var10 >= -128 && ~var10 >= -128) {
                                    var9 += 128;
                                    var10 += 128;
                                    class191.field3499.method655(0, class165.field3046 + 128);
                                    class191.field3499.method631((var9 << 8) - -var10, -1);
                                    class165.field3046 = 0;
                                } else if (~class165.field3046 > -33) {
                                    class191.field3499.method655(0, class165.field3046 + 192);
                                    if (!var8) {
                                        class191.field3499.method604(var6 << 16 | var7, arg0 ^ 1543219696);
                                    } else {
                                        class191.field3499.method604(Integer.MIN_VALUE, 1543219568);
                                    }
                                    class165.field3046 = 0;
                                } else {
                                    class191.field3499.method631(class165.field3046 + 57344, -1);
                                    if (!var8) {
                                        class191.field3499.method604(var6 << 16 | var7, 1543219568);
                                    } else {
                                        class191.field3499.method604(Integer.MIN_VALUE, 1543219568);
                                    }
                                    class165.field3046 = 0;
                                }
                            }
                        }
                        class191.field3499.method659(-var4 + class191.field3499.field1541, 108);
                        if (class146.field2783.field2529 > var3) {
                            class146.field2783.field2529 -= var3;
                            for (int var11 = 0; var11 < class146.field2783.field2529; ++var11) {
                                class146.field2783.field2527[var11] = class146.field2783.field2527[var3 + var11];
                                class146.field2783.field2526[var11] = class146.field2783.field2526[var3 + var11];
                            }
                        } else {
                            class146.field2783.field2529 = 0;
                        }
                    }
                }
                if (~class31.field489 != -1) {
                    ++class77.field1458;
                    int var12 = class265.field4604;
                    long var13 = (-class20.field324 + class4.field75) / 50L;
                    class20.field324 = class4.field75;
                    int var15 = class84.field1598;
                    if (~var12 <= -1) {
                        if (~var12 < -65536) {
                            var12 = 65535;
                        }
                    } else {
                        var12 = 0;
                    }
                    if (~var13 < -32768L) {
                        var13 = 32767L;
                    }
                    byte var16 = 0;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (~var15 < -65536) {
                        var15 = 65535;
                    }
                    int var17 = (int) var13;
                    if (class31.field489 == 2) {
                        var16 = 1;
                    }
                    class191.field3499.method75(195, 107);
                    class191.field3499.method604(var12 << 16 | var15, 1543219568);
                    class191.field3499.method616(-8618, var17 | var16 << 15);
                }
                if (~class81.field1530 < -1) {
                    --class81.field1530;
                }
                if (class217.field3942[96] || class217.field3942[97] || class217.field3942[98] || class217.field3942[99]) {
                    class240.field4291 = true;
                }
                if (class240.field4291 && class81.field1530 <= 0) {
                    ++class84.field1596;
                    class240.field4291 = false;
                    class81.field1530 = 20;
                    class191.field3499.method75(166, arg0 + -8);
                    class191.field3499.method631(class132.field2560, -1);
                    class191.field3499.method631(class93.field1750, arg0 + -129);
                }
                if (class211.field3816 && !class110.field2085) {
                    class110.field2085 = true;
                    class191.field3499.method75(21, arg0 ^ 205);
                    class191.field3499.method655(arg0 ^ 128, 1);
                    ++class176.field3217;
                }
                if (!class211.field3816 && class110.field2085) {
                    ++class176.field3217;
                    class110.field2085 = false;
                    class191.field3499.method75(21, 110);
                    class191.field3499.method655(arg0 ^ 128, 0);
                }
                if (!class62.field1053) {
                    ++class39.field648;
                    class191.field3499.method75(84, 43);
                    class191.field3499.method640((byte) -7, class196.method1417(false));
                    class62.field1053 = true;
                }
                class92.method724(-122);
                if (class262.field4583 == 30) {
                    class62.method431(arg0 ^ arg0);
                    class194.method1413(-120);
                    ++class203.field3687;
                    if (class203.field3687 > 750) {
                        class62.method426((byte) 121);
                    } else {
                        class144.method1093(-15060);
                        class73.method538(1);
                        class81.method617(0);
                        if (class87.field1630 != null) {
                            class72.method531(33);
                        }
                        for (int var18 = class265.method1788((byte) -113, true); var18 != -1; var18 = class265.method1788((byte) -101, false)) {
                            class115.method920((byte) -108, var18);
                            class107.field2047[class7.method50(31, class132.field2547++)] = var18;
                        }
                        for (class113 var19 = class69.method482((byte) 127); var19 != null; var19 = class69.method482((byte) 127)) {
                            int var20 = var19.method895((byte) -94);
                            int var21 = var19.method896(arg0 + -126);
                            if (var20 != 1) {
                                if (~var20 == -3) {
                                    class49.field825[var21] = var19.field2122;
                                    class77.field1452[class7.method50(class106.field2031++, 31)] = var21;
                                }
                            } else {
                                class49.field834[var21] = var19.field2127;
                                class178.field3245[class7.method50(31, class55.field915++)] = var21;
                            }
                        }
                        if (class65.field1104 != 0) {
                            class21.field333 += 20;
                            if (class21.field333 >= 400) {
                                class65.field1104 = 0;
                            }
                        }
                        ++field877;
                        if (class213.field3885 != null) {
                            ++class244.field4319;
                            if (class244.field4319 >= 15) {
                                class213.method1517((byte) 11, class213.field3885);
                                class213.field3885 = null;
                            }
                        }
                        if (class23.field380 != null) {
                            class213.method1517((byte) 11, class23.field380);
                            ++class49.field823;
                            if (~(class141.field2689 + 5) > ~class36.field608 || class141.field2689 - 5 > class36.field608 || ~(class66.field1115 + 5) > ~class240.field4281 || class240.field4281 < class66.field1115 + -5) {
                                class201.field3601 = true;
                            }
                            if (~class219.field3981 == -1) {
                                if (class201.field3601 && ~class49.field823 <= -6) {
                                    if (class23.field380 == class165.field3043 && class59.field971 != class131.field2533) {
                                        class69 var22 = class23.field380;
                                        ++class14.field219;
                                        byte var23 = 0;
                                        if (~class231.field4153 == -2 && ~var22.field1217 == -207) {
                                            var23 = 1;
                                        }
                                        if (~var22.field1219[class131.field2533] >= -1) {
                                            var23 = 0;
                                        }
                                        if (!class123.method979(client.method826(var22), 1)) {
                                            if (var23 == 1) {
                                                int var24 = class59.field971;
                                                int var25 = class131.field2533;
                                                while (var24 != var25) {
                                                    if (~var25 <= ~var24) {
                                                        if (~var24 > ~var25) {
                                                            var22.method493(var24, var24 + 1, -12373);
                                                            ++var24;
                                                        }
                                                    } else {
                                                        var22.method493(var24, var24 + -1, arg0 + -12501);
                                                        --var24;
                                                    }
                                                }
                                            } else {
                                                var22.method493(class59.field971, class131.field2533, -12373);
                                            }
                                        } else {
                                            int var26 = class59.field971;
                                            int var27 = class131.field2533;
                                            var22.field1219[var27] = var22.field1219[var26];
                                            var22.field1332[var27] = var22.field1332[var26];
                                            var22.field1219[var26] = -1;
                                            var22.field1332[var26] = 0;
                                        }
                                        class191.field3499.method75(109, arg0 + -84);
                                        class191.field3499.method627(120, var23);
                                        class191.field3499.method631(class131.field2533, -1);
                                        class191.field3499.method634(class59.field971, -38);
                                        class191.field3499.method624((byte) 109, class23.field380.field1188);
                                    }
                                } else if ((~class221.field4017 == -2 || class170.method1264(class202.field3647 + -1, 82)) && ~class202.field3647 < -3) {
                                    class33.method195((byte) 106);
                                } else if (~class202.field3647 < -1) {
                                    class161.method1177(class202.field3647 + -1, arg0 ^ 128);
                                }
                                class23.field380 = null;
                                class31.field489 = 0;
                                class244.field4319 = 10;
                            }
                        }
                        class130.field2531 = 0;
                        class193.field3523 = false;
                        class69 var28 = class186.field3408;
                        class247.field4345 = null;
                        class69 var29 = class2.field38;
                        class186.field3408 = null;
                        class2.field38 = null;
                        class170.field3118 = false;
                        while (class201.method1440((byte) 67) && class130.field2531 < 128) {
                            class99.field1900[class130.field2531] = class45.field759;
                            class137.field2642[class130.field2531] = class76.field1445;
                            ++class130.field2531;
                        }
                        class87.field1630 = null;
                        if (class193.field3521 != -1) {
                            class30.method183(class205.field3706, 0, 0, class233.field4160, 0, arg0 ^ -206, class193.field3521, 0);
                        }
                        ++class24.field384;
                        while (true) {
                            class225 var30;
                            class69 var31;
                            class69 var32;
                            do {
                                var30 = (class225) class214.field3897.method1019((byte) -5);
                                if (var30 == null) {
                                    while (true) {
                                        class225 var33;
                                        class69 var34;
                                        class69 var35;
                                        do {
                                            var33 = (class225) class223.field4058.method1019((byte) -5);
                                            if (var33 == null) {
                                                while (true) {
                                                    class225 var36;
                                                    class69 var37;
                                                    class69 var38;
                                                    do {
                                                        var36 = (class225) class11.field170.method1019((byte) -5);
                                                        if (var36 == null) {
                                                            if (class54.field901 && class87.field1630 == null) {
                                                                class54.field901 = false;
                                                            }
                                                            if (class109.field2063 != null) {
                                                                class75.method545(-99);
                                                            }
                                                            if (class99.field1920 > 0 && class217.field3942[82] && class217.field3942[81] && ~class264.field4591 != -1) {
                                                                int var39 = -class264.field4591 + class20.field323;
                                                                if (~var39 > -1) {
                                                                    var39 = 0;
                                                                } else if (var39 > 3) {
                                                                    var39 = 3;
                                                                }
                                                                class120.method943(class257.field4500 - -class235.field4203.field3629[0], var39, 29862, class62.field1035 - -class235.field4203.field3614[0]);
                                                            }
                                                            if (class13.field211 != -1) {
                                                                int var40 = class13.field211;
                                                                int var41 = class49.field818;
                                                                if (class99.field1920 > 0 && class217.field3942[82] && class217.field3942[81]) {
                                                                    class120.method943(class257.field4500 + var41, class20.field323, arg0 ^ 29734, class62.field1035 - -var40);
                                                                } else {
                                                                    boolean var42 = class239.method1652(var40, 0, 0, 0, 0, 111, var41, true, class235.field4203.field3614[0], class235.field4203.field3629[0], 0, 0);
                                                                    if (var42) {
                                                                        class192.field3516 = class84.field1598;
                                                                        class65.field1104 = 1;
                                                                        class246.field4337 = class265.field4604;
                                                                        class21.field333 = 0;
                                                                    }
                                                                }
                                                                class13.field211 = -1;
                                                            }
                                                            class137.method1066((byte) 110);
                                                            if (class186.field3408 != var28) {
                                                                if (var28 != null) {
                                                                    class213.method1517((byte) 11, var28);
                                                                }
                                                                if (class186.field3408 != null) {
                                                                    class213.method1517((byte) 11, class186.field3408);
                                                                }
                                                            }
                                                            if (class2.field38 != var29 && ~class90.field1658 == ~class109.field2068) {
                                                                if (var29 != null) {
                                                                    class213.method1517((byte) 11, var29);
                                                                }
                                                                if (class2.field38 != null) {
                                                                    class213.method1517((byte) 11, class2.field38);
                                                                }
                                                            }
                                                            if (class2.field38 != null) {
                                                                if (~class90.field1658 < ~class109.field2068) {
                                                                    ++class109.field2068;
                                                                    if (class90.field1658 == class109.field2068) {
                                                                        class213.method1517((byte) 11, class2.field38);
                                                                    }
                                                                }
                                                            } else if (~class109.field2068 < -1) {
                                                                --class109.field2068;
                                                            }
                                                            if (class5.field99 != 1) {
                                                                if (~class5.field99 != -3) {
                                                                    class19.method135(65535);
                                                                } else {
                                                                    class197.method1418((byte) -43);
                                                                }
                                                            } else {
                                                                class76.method562((byte) 102);
                                                            }
                                                            for (int var43 = 0; var43 < 5; ++var43) {
                                                                int var10002 = class114.field2148[var43]++;
                                                            }
                                                            int var44 = class254.method1723((byte) 107);
                                                            int var45 = class33.method194(true);
                                                            if (~var44 < -4501 && var45 > 4500) {
                                                                class226.field4088 = 250;
                                                                ++class125.field2412;
                                                                class217.method1538(4000, -107);
                                                                class191.field3499.method75(34, arg0 + -84);
                                                            }
                                                            ++class157.field2918;
                                                            ++class197.field3553;
                                                            ++class73.field1380;
                                                            if (class73.field1380 > 500) {
                                                                class73.field1380 = 0;
                                                                int var46 = (int) (8.0D * Math.random());
                                                                if ((1 & var46) == 1) {
                                                                    class183.field3363 += class84.field1599;
                                                                }
                                                                if (~(2 & var46) == -3) {
                                                                    class10.field167 += class257.field4496;
                                                                }
                                                                if (~(4 & var46) == -5) {
                                                                    class126.field2432 += class227.field4094;
                                                                }
                                                            }
                                                            if (class157.field2918 > 500) {
                                                                class157.field2918 = 0;
                                                                int var47 = (int) (Math.random() * 8.0D);
                                                                if ((var47 & 2) == 2) {
                                                                    class26.field410 += class233.field4163;
                                                                }
                                                                if ((1 & var47) == 1) {
                                                                    class40.field667 += class23.field374;
                                                                }
                                                            }
                                                            if (class26.field410 < -20) {
                                                                class233.field4163 = 1;
                                                            }
                                                            if (class40.field667 < -60) {
                                                                class23.field374 = 2;
                                                            }
                                                            if (~class126.field2432 > 39) {
                                                                class227.field4094 = 1;
                                                            }
                                                            if (class40.field667 > 60) {
                                                                class23.field374 = -2;
                                                            }
                                                            if (class126.field2432 > 40) {
                                                                class227.field4094 = -1;
                                                            }
                                                            if (~class183.field3363 > 49) {
                                                                class84.field1599 = 2;
                                                            }
                                                            if (~class10.field167 > 54) {
                                                                class257.field4496 = 2;
                                                            }
                                                            if (class10.field167 > 55) {
                                                                class257.field4496 = -2;
                                                            }
                                                            if (class183.field3363 > 50) {
                                                                class84.field1599 = -2;
                                                            }
                                                            if (~class26.field410 < -11) {
                                                                class233.field4163 = -1;
                                                            }
                                                            if (class197.field3553 > 50) {
                                                                class191.field3499.method75(171, 97);
                                                                ++class91.field1663;
                                                            }
                                                            class262.method1779((byte) -71);
                                                            try {
                                                                if (class188.field3443 != null && ~class191.field3499.field1541 < -1) {
                                                                    class188.field3443.method1729(class191.field3499.field1562, class191.field3499.field1541, 0, arg0 ^ 4872);
                                                                    class197.field3553 = 0;
                                                                    class191.field3499.field1541 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var48) {
                                                                class62.method426((byte) -14);
                                                                return;
                                                            }
                                                        }
                                                        var37 = var36.field4076;
                                                        if (var37.field1205 < 0) {
                                                            break;
                                                        }
                                                        var38 = class124.method989((byte) 127, var37.field1302);
                                                    } while (var38 == null || var38.field1291 == null || ~var38.field1291.length >= ~var37.field1205 || var38.field1291[var37.field1205] != var37);
                                                    class192.method1406(var36, (byte) 56);
                                                }
                                            }
                                            var34 = var33.field4076;
                                            if (var34.field1205 < 0) {
                                                break;
                                            }
                                            var35 = class124.method989((byte) 118, var34.field1302);
                                        } while (var35 == null || var35.field1291 == null || var34.field1205 >= var35.field1291.length || var35.field1291[var34.field1205] != var34);
                                        class192.method1406(var33, (byte) 81);
                                    }
                                }
                                var31 = var30.field4076;
                                if (~var31.field1205 > -1) {
                                    break;
                                }
                                var32 = class124.method989((byte) 109, var31.field1302);
                            } while (var32 == null || var32.field1291 == null || var32.field1291.length <= var31.field1205 || var32.field1291[var31.field1205] != var31);
                            class192.method1406(var30, (byte) -121);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            method360((byte) 44);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field872 = arg2.method658(arg0 ^ 91);
                }
            } else {
                this.field875 = arg2.method658(-58);
            }
        } else {
            this.field878 = arg2.method658(arg0 + -128);
        }
        ++field864;
    }
}
