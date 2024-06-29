import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class84 extends class51 {

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    private int field1976 = 4;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    private int field1983 = 4;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1979 = 0;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
    public static int field1987 = 0;

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field1984 = 0;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lpg;")
    public static class141 field1975 = new class141();

    @OriginalMember(owner = "client!jd", name = "mb", descriptor = "[I")
    public static int[] field1988 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public static final void method711(int arg0, byte arg1) {
        int[] var2 = class100.field2237.field2045;
        ++field1982;
        int var3 = var2.length;
        int var4 = 0;
        if (arg1 < 116) {
            field1987 = 126;
        }
        while (~var4 > ~var3) {
            var2[var4] = 0;
            ++var4;
        }
        for (int var5 = 1; ~var5 > -104; ++var5) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; ++var21) {
                if ((24 & class3.field104[arg0][var21][var5]) == 0) {
                    class101.field2268.method1113(var2, var20, 512, arg0, var21, var5);
                }
                if (~arg0 > -4 && (8 & class3.field104[arg0 + 1][var21][var5]) != 0) {
                    class101.field2268.method1113(var2, var20, 512, arg0 - -1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = (228 - -((int) (Math.random() * 20.0D)) << 8) + (((int) (Math.random() * 20.0D) + 238 + -10 << 16) - -((int) (Math.random() * 20.0D)) - -238 - 10);
        class100.field2237.method743();
        int var7 = -10 + (int) (20.0D * Math.random()) + 238 << 16;
        for (int var8 = 1; ~var8 > -104; ++var8) {
            for (int var19 = 1; ~var19 > -104; ++var19) {
                if (~(class3.field104[arg0][var19][var8] & 24) == -1) {
                    class185.method1251(var6, var7, var8, var19, arg0, 8950);
                }
                if (arg0 < 3 && ~(class3.field104[arg0 + 1][var19][var8] & 8) != -1) {
                    class185.method1251(var6, var7, var8, var19, arg0 + 1, 8950);
                }
            }
        }
        class66.field1597 = 0;
        for (int var9 = 0; ~var9 > -105; ++var9) {
            for (int var10 = 0; var10 < 104; ++var10) {
                int var11 = class101.field2268.method1096(class10.field224, var9, var10);
                if (var11 != 0) {
                    int var12 = (var11 & 536859580) >> 14;
                    int var13 = class70.method553(var12, 28067).field2361;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (var13 != 22 && ~var13 != -30 && ~var13 != -35 && ~var13 != -37 && var13 != 46 && ~var13 != -48 && ~var13 != -49) {
                            int[][] var16 = class160.field3337[class10.field224].field1389;
                            for (int var17 = 0; ~var17 > -11; ++var17) {
                                int var18 = (int) (4.0D * Math.random());
                                if (~var18 == -1 && var15 > 0 && var15 > var9 - 3 && ~(19661064 & var16[var15 + -1][var14]) == -1) {
                                    --var15;
                                }
                                if (var18 == 1 && var15 < 103 && var9 + 3 > var15 && (var16[var15 + 1][var14] & 19661184) == 0) {
                                    ++var15;
                                }
                                if (~var18 == -3 && ~var14 < -1 && ~(var10 + -3) > ~var14 && (19661058 & var16[var15][var14 + -1]) == 0) {
                                    --var14;
                                }
                                if (~var18 == -4 && ~var14 > -104 && var10 - -3 > var14 && ~(var16[var15][var14 - -1] & 19661088) == -1) {
                                    ++var14;
                                }
                            }
                        }
                        class59.field1481[class66.field1597] = class139.field2894[var13];
                        class179.field3613[class66.field1597] = var15;
                        class187.field3717[class66.field1597] = var14;
                        ++class66.field1597;
                    }
                }
            }
        }
        class57.field1443.method719((byte) -10);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1980;
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int var4 = class114.field2528 / this.field1976;
            int var5 = arg1 % var4;
            int[] var6 = this.method376(class114.field2528 * var5 / var4, 0, -110);
            for (int var7 = 0; ~class86.field2008 < ~var7; ++var7) {
                int var8 = class86.field2008 / this.field1983;
                int var9 = var7 % var8;
                var3[var7] = var6[class86.field2008 * var9 / var8];
            }
        }
        return arg0 >= -125 ? null : var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field1981;
        if (arg0 < 111) {
            this.field1976 = 16;
        }
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int var4 = class114.field2528 / this.field1976;
            int var5 = arg1 % var4;
            int[][] var6 = this.method377(0, class114.field2528 * var5 / var4, (byte) -122);
            int[] var7 = var6[1];
            int[] var8 = var3[0];
            int[] var9 = var6[0];
            int[] var10 = var6[2];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class86.field2008 < ~var13; ++var13) {
                int var14 = class86.field2008 / this.field1983;
                int var15 = var13 % var14;
                int var16 = class86.field2008 * var15 / var14;
                var8[var13] = var9[var16];
                var11[var13] = var7[var16];
                var12[var13] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field1976 = arg0.method509(117);
            }
        } else {
            this.field1983 = arg0.method509(120);
        }
        ++field1986;
        if (!arg2) {
            field1975 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)V")
    public static final void method712(int arg0) {
        ++field1978;
        class94.field2121 = 0;
        class163.field3398 = -1;
        class109.field2456 = -1;
        class120.field2594 = -1;
        if (arg0 == 5030) {
            class116.field2551 = -1;
            class100.field2236 = 0;
            class14.field285 = 0;
            class171.field3512 = 0;
            class111.field2483.field1620 = 0;
            class192.field3794.field1620 = 0;
            class194.field3827 = 0;
            class169.field3482 = false;
            class185.field3674 = 0;
            for (int var1 = 0; var1 < class175.field3550.length; ++var1) {
                if (class175.field3550[var1] != null) {
                    class175.field3550[var1].field393 = -1;
                }
            }
            for (int var2 = 0; ~class105.field2343.length < ~var2; ++var2) {
                if (class105.field2343[var2] != null) {
                    class105.field2343[var2].field393 = -1;
                }
            }
            class200.method1312(true);
            class7.method31(30, arg0 ^ 32445);
            for (int var3 = 0; var3 < 100; ++var3) {
                class102.field2291[var3] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "(I)V")
    public static final void method713(int arg0) {
        ++field1977;
        try {
            if (class51.field1300 != null) {
                byte[] var1 = class51.field1300.method426(arg0 + -4593);
                if (var1 != null) {
                    class66 var2 = new class66(var1);
                    class114.field2536 = var2.method511(arg0 + -4535);
                    class48.field1161 = new class137[class114.field2536];
                    for (int var3 = 0; ~var3 > ~class114.field2536; ++var3) {
                        class137 var4 = class48.field1161[var3] = new class137();
                        int var5 = var2.method511(-120);
                        var4.field2867 = (var5 & 32768) != 0;
                        var4.field2874 = 32767 & var5;
                        var4.field2866 = var2.method475((byte) -58);
                        var4.field2878 = var2.method462((byte) 122);
                        var4.field2871 = var3;
                        var4.field2875 = class96.method799(arg0 ^ 4597, var4.field2866);
                    }
                    class169.method1196(class74.field1813, 0, class200.field3939, 0, class48.field1161.length + -1, class48.field1161);
                    class51.field1300 = null;
                    class143.field2986 = true;
                }
            } else {
                class51.field1300 = new class59(class186.field3708, class163.method1168(-57, new class38[] { class108.field2438, class70.field1742, class42.field924 }).method282((byte) -107));
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class51.field1300 = null;
        }
        if (arg0 != 4594) {
            field1984 = 46;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static void method714(byte arg0) {
        field1975 = null;
        if (arg0 <= 56) {
            field1979 = -87;
        }
        field1988 = null;
    }

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "(I)Z")
    public static final boolean method715(int arg0) {
        if (arg0 != 25075) {
            field1984 = 120;
        }
        ++field1985;
        long var1 = class166.method1184((byte) -80);
        int var3 = (int) (-class146.field3042 + var1);
        class146.field3042 = var1;
        if (~var3 < -201) {
            var3 = 200;
        }
        class145.field3027 += var3;
        if (~class116.field2548 == -1 && class92.field2087 == 0 && ~class162.field3376 == -1 && class102.field2296 == 0) {
            return true;
        } else if (class113.field2515 == null) {
            return false;
        } else {
            try {
                if (class145.field3027 > 30000) {
                    throw new IOException();
                } else {
                    while (class92.field2087 < 20 && ~class102.field2296 < -1) {
                        class143 var4 = (class143) class18.field366.method177(127);
                        class66 var5 = new class66(4);
                        var5.method495(arg0 ^ 24991, 1);
                        var5.method461((int) var4.field2172, -114);
                        class113.field2515.method361(0, (byte) 115, var5.field1627, 4);
                        class41.field915.method184(var4, false, var4.field2172);
                        --class102.field2296;
                        ++class92.field2087;
                    }
                    while (~class116.field2548 > -21 && class162.field3376 > 0) {
                        class143 var6 = (class143) class11.field234.method1231((byte) 108);
                        class66 var7 = new class66(4);
                        var7.method495(100, 0);
                        var7.method461((int) var6.field2172, -121);
                        class113.field2515.method361(0, (byte) 110, var7.field1627, 4);
                        var6.method85(false);
                        class132.field2807.method184(var6, false, var6.field2172);
                        --class162.field3376;
                        ++class116.field2548;
                    }
                    for (int var8 = 0; ~var8 > -101; ++var8) {
                        int var9 = class113.field2515.method363(-116);
                        if (~var9 > -1) {
                            throw new IOException();
                        }
                        if (var9 == 0) {
                            break;
                        }
                        byte var10 = 0;
                        class145.field3027 = 0;
                        if (class146.field3050 != null) {
                            if (~class51.field1302 == -1) {
                                var10 = 1;
                            }
                        } else {
                            var10 = 8;
                        }
                        if (var10 <= 0) {
                            int var11 = -class51.field1302 + 512;
                            int var12 = class126.field2705.field1627.length + -class146.field3050.field2975;
                            if (var11 > var12 - class126.field2705.field1620) {
                                var11 = -class126.field2705.field1620 + var12;
                            }
                            if (var9 < var11) {
                                var11 = var9;
                            }
                            class113.field2515.method365(var11, class126.field2705.field1620, 122, class126.field2705.field1627);
                            if (class175.field3545 != 0) {
                                for (int var13 = 0; ~var11 < ~var13; ++var13) {
                                    class126.field2705.field1627[class126.field2705.field1620 + var13] = (byte) class102.method836(class126.field2705.field1627[class126.field2705.field1620 + var13], class175.field3545);
                                }
                            }
                            class126.field2705.field1620 += var11;
                            class51.field1302 += var11;
                            if (~class126.field2705.field1620 == ~var12) {
                                if (~class146.field3050.field2172 == -16711936L) {
                                    class163.field3379 = class126.field2705;
                                    for (int var14 = 0; var14 < 256; ++var14) {
                                        class127 var15 = class23.field491[var14];
                                        if (var15 != null) {
                                            class163.field3379.field1620 = var14 * 8 + 5;
                                            int var16 = class163.field3379.method464(arg0 + -25190);
                                            int var17 = class163.field3379.method464(-23);
                                            var15.method944((byte) -122, var16, var17);
                                        }
                                    }
                                } else {
                                    class23.field493.reset();
                                    class23.field493.update(class126.field2705.field1627, 0, var12);
                                    int var18 = (int) class23.field493.getValue();
                                    if (class146.field3050.field2977 != var18) {
                                        try {
                                            class113.field2515.method366((byte) -128);
                                        } catch (Exception var30) {
                                        }
                                        class175.field3545 = (byte) ((int) (1.0D + Math.random() * 255.0D));
                                        ++class203.field4012;
                                        class113.field2515 = null;
                                        return false;
                                    }
                                    class203.field4012 = 0;
                                    class140.field2943 = 0;
                                    class146.field3050.field2988.method942((int) (65535L & class146.field3050.field2172), (byte) 97, class126.field2705.field1627, (16711680L & class146.field3050.field2172) == 16711680L, class50.field1234);
                                }
                                class146.field3050.method805(false);
                                if (class50.field1234) {
                                    --class92.field2087;
                                } else {
                                    --class116.field2548;
                                }
                                class146.field3050 = null;
                                class126.field2705 = null;
                                class51.field1302 = 0;
                            } else {
                                if (class51.field1302 != 512) {
                                    break;
                                }
                                class51.field1302 = 0;
                            }
                        } else {
                            int var19 = -class109.field2455.field1620 + var10;
                            if (var19 > var9) {
                                var19 = var9;
                            }
                            class113.field2515.method365(var19, class109.field2455.field1620, 122, class109.field2455.field1627);
                            if (~class175.field3545 != -1) {
                                for (int var20 = 0; ~var19 < ~var20; ++var20) {
                                    class109.field2455.field1627[class109.field2455.field1620 + var20] = (byte) class102.method836(class109.field2455.field1627[class109.field2455.field1620 + var20], class175.field3545);
                                }
                            }
                            class109.field2455.field1620 += var19;
                            if (~var10 < ~class109.field2455.field1620) {
                                break;
                            }
                            if (class146.field3050 == null) {
                                class109.field2455.field1620 = 0;
                                int var21 = class109.field2455.method509(122);
                                int var22 = class109.field2455.method511(111);
                                int var23 = class109.field2455.method509(arg0 ^ 24967);
                                long var24 = (long) ((var21 << 16) + var22);
                                int var26 = class109.field2455.method464(-57);
                                class143 var27 = (class143) class41.field915.method183((byte) 52, var24);
                                class50.field1234 = true;
                                if (var27 == null) {
                                    var27 = (class143) class132.field2807.method183((byte) 108, var24);
                                    class50.field1234 = false;
                                }
                                if (var27 == null) {
                                    throw new IOException();
                                }
                                class146.field3050 = var27;
                                int var28 = ~var23 != -1 ? 9 : 5;
                                class126.field2705 = new class66(var26 - -var28 + class146.field3050.field2975);
                                class126.field2705.method495(arg0 ^ 24979, var23);
                                class126.field2705.method478((byte) -103, var26);
                                class51.field1302 = 8;
                                class109.field2455.field1620 = 0;
                            } else if (class51.field1302 == 0) {
                                if (class109.field2455.field1627[0] == -1) {
                                    class109.field2455.field1620 = 0;
                                    class51.field1302 = 1;
                                } else {
                                    class146.field3050 = null;
                                }
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException var31) {
                try {
                    class113.field2515.method366((byte) -128);
                } catch (Exception var29) {
                }
                class113.field2515 = null;
                ++class140.field2943;
                return false;
            }
        }
    }
}
