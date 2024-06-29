import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class131 extends class215 {

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2092;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "[I")
    public static int[] field2091;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field2096;
        if (arg0 != 1521146348) {
            field2091 = null;
        }
        if (arg1 == 0) {
            super.field3453 = arg2.method584(255) == 1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        ++field2095;
        int[] var3 = super.field3445.method1755(arg0, (byte) 97);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field3445.field4163) {
                for (int var4 = 0; ~var4 > ~class244.field4015; ++var4) {
                    this.method890(arg0, var4, false);
                    int[] var5 = this.method1503(-1, 0, class278.field4428);
                    var3[var4] = var5[class20.field259];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIZ)V")
    private final void method890(int arg0, int arg1, boolean arg2) {
        ++field2090;
        int var4 = class166.field2657[arg1];
        int var5 = class76.field956[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class278.field4428 = arg0;
            class20.field259 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class278.field4428 = arg1;
            class20.field259 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class20.field259 = -arg0 + class244.field4015;
            class278.field4428 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class20.field259 = arg1;
            class278.field4428 = class80.field998 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class20.field259 = -arg1 + class244.field4015;
            class278.field4428 = -arg0 + class80.field998;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class278.field4428 = -arg1 + class80.field998;
            class20.field259 = -arg0 + class244.field4015;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class20.field259 = arg0;
            class278.field4428 = -arg1 + class80.field998;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class20.field259 = -arg1 + class244.field4015;
            class278.field4428 = arg0;
        }
        class20.field259 &= class118.field1673;
        class278.field4428 &= class83.field1026;
        if (arg2) {
            method892(54);
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    public static final void method891(byte arg0) {
        ++field2093;
        if (~class285.field4538 < -1) {
            --class285.field4538;
        }
        if (class160.field2557 > 1) {
            --class160.field2557;
            class213.field3417 = class162.field2582;
        }
        if (class289.field4601) {
            class289.field4601 = false;
            class42.method229(true);
        } else {
            for (int var1 = 0; var1 < 100 && class127.method863(-31459); ++var1) {
            }
            if (~class250.field4085 == -31) {
                class60.method351(class4.field57, -24452, 232);
                Object var2 = class124.field1924.field4228;
                synchronized (class124.field1924.field4228) {
                    if (!class91.field1137) {
                        class124.field1924.field4232 = 0;
                    } else if (~class90.field1119 != -1 || ~class124.field1924.field4232 <= -41) {
                        class4.field57.method1932(false, 45);
                        ++class242.field3984;
                        class4.field57.method580((byte) 122, 0);
                        int var3 = class4.field57.field1228;
                        int var4 = 0;
                        for (int var5 = 0; class124.field1924.field4232 > var5 && ~(class4.field57.field1228 - var3) > -241; ++var5) {
                            ++var4;
                            int var6 = class124.field1924.field4233[var5];
                            if (var6 < 0) {
                                var6 = 0;
                            } else if (~var6 < -65535) {
                                var6 = 65534;
                            }
                            int var7 = class124.field1924.field4234[var5];
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (var7 > 65534) {
                                var7 = 65534;
                            }
                            boolean var8 = false;
                            if (~class124.field1924.field4233[var5] == 0 && class124.field1924.field4234[var5] == -1) {
                                var6 = -1;
                                var8 = true;
                                var7 = -1;
                            }
                            if (~class110.field1570 == ~var7 && class11.field116 == var6) {
                                if (class132.field2102 < 2047) {
                                    ++class132.field2102;
                                }
                            } else {
                                int var9 = var7 - class110.field1570;
                                int var10 = -class11.field116 + var6;
                                class110.field1570 = var7;
                                class11.field116 = var6;
                                if (~class132.field2102 > -9 && var9 >= -32 && var9 <= 31 && ~var10 <= 31 && var10 <= 31) {
                                    var9 += 32;
                                    var10 += 32;
                                    class4.field57.method572(true, (class132.field2102 << 12) + (var9 << 6) + var10);
                                    class132.field2102 = 0;
                                } else if (~class132.field2102 > -33 && var9 >= -128 && ~var9 >= -128 && ~var10 <= 127 && ~var10 >= -128) {
                                    var10 += 128;
                                    class4.field57.method580((byte) 84, class132.field2102 + 128);
                                    var9 += 128;
                                    class4.field57.method572(true, (var9 << 8) + var10);
                                    class132.field2102 = 0;
                                } else if (class132.field2102 < 32) {
                                    class4.field57.method580((byte) 115, class132.field2102 + 192);
                                    if (!var8) {
                                        class4.field57.method574(var6 << 16 | var7, -1);
                                    } else {
                                        class4.field57.method574(Integer.MIN_VALUE, -1);
                                    }
                                    class132.field2102 = 0;
                                } else {
                                    class4.field57.method572(true, class132.field2102 + 57344);
                                    if (!var8) {
                                        class4.field57.method574(var6 << 16 | var7, -1);
                                    } else {
                                        class4.field57.method574(Integer.MIN_VALUE, -1);
                                    }
                                    class132.field2102 = 0;
                                }
                            }
                        }
                        class4.field57.method544(-3866, class4.field57.field1228 - var3);
                        if (~var4 <= ~class124.field1924.field4232) {
                            class124.field1924.field4232 = 0;
                        } else {
                            class124.field1924.field4232 -= var4;
                            for (int var11 = 0; class124.field1924.field4232 > var11; ++var11) {
                                class124.field1924.field4234[var11] = class124.field1924.field4234[var11 - -var4];
                                class124.field1924.field4233[var11] = class124.field1924.field4233[var4 + var11];
                            }
                        }
                    }
                }
                if (class90.field1119 != 0) {
                    ++class280.field4438;
                    int var12 = class214.field3435;
                    int var13 = class107.field1449;
                    if (var13 >= 0) {
                        if (~var13 < -65536) {
                            var13 = 65535;
                        }
                    } else {
                        var13 = 0;
                    }
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    long var14 = (-class170.field2698 + class275.field4398) / 50L;
                    if (var14 > 32767L) {
                        var14 = 32767L;
                    }
                    class170.field2698 = class275.field4398;
                    byte var16 = 0;
                    int var17 = (int) var14;
                    if (~class90.field1119 == -3) {
                        var16 = 1;
                    }
                    class4.field57.method1932(false, 114);
                    class4.field57.method594(var13 | var12 << 16, (byte) 121);
                    class4.field57.method572(true, var17 | var16 << 15);
                }
                if (arg0 > 7) {
                    if (class101.field1355 > 0) {
                        --class101.field1355;
                    }
                    if (class253.field4120 && class101.field1355 <= 0) {
                        ++class106.field1425;
                        class253.field4120 = false;
                        class101.field1355 = 20;
                        class4.field57.method1932(false, 216);
                        class4.field57.method553((byte) -107, (int) class226.field3639);
                        class4.field57.method591(594188840, (int) class238.field3933);
                    }
                    if (class207.field3311 && !class89.field1115) {
                        ++class238.field3934;
                        class89.field1115 = true;
                        class4.field57.method1932(false, 64);
                        class4.field57.method580((byte) 122, 1);
                    }
                    if (!class207.field3311 && class89.field1115) {
                        ++class238.field3934;
                        class89.field1115 = false;
                        class4.field57.method1932(false, 64);
                        class4.field57.method580((byte) 119, 0);
                    }
                    if (!class263.field4253) {
                        ++class233.field3859;
                        class4.field57.method1932(false, 220);
                        class4.field57.method573(class273.method1834(158), (byte) -48);
                        class263.field4253 = true;
                    }
                    if (class108.field1503) {
                        class108.field1503 = false;
                    } else {
                        class67.field847 /= 2.0F;
                    }
                    if (class269.field4305) {
                        class269.field4305 = false;
                    } else {
                        class152.field2359 /= 2.0F;
                    }
                    class143.method994(-34);
                    if (~class250.field4085 == -31) {
                        class272.method1823(-57);
                        client.method740(false);
                        class76.method427(126);
                        ++class292.field4641;
                        if (class292.field4641 > 750) {
                            class42.method229(true);
                        } else {
                            class225.method1594(-91);
                            class79.method443(0);
                            class192.method1325(16710);
                            if (class73.field925 != null) {
                                class98.method609((byte) 122);
                            }
                            for (int var18 = class224.method1587(true, (byte) 76); ~var18 != 0; var18 = class224.method1587(false, (byte) 76)) {
                                class25.method145(var18, -75);
                                class105.field1417[class173.method1186(31, class165.field2629++)] = var18;
                            }
                            for (class233 var19 = class271.method1818(-90); var19 != null; var19 = class271.method1818(-128)) {
                                int var20 = var19.method1652((byte) 48);
                                int var21 = var19.method1655((byte) 102);
                                if (~var20 == -2) {
                                    class164.field2606[var21] = var19.field3855;
                                    class288.field4593[class173.method1186(31, class11.field115++)] = var21;
                                } else if (~var20 != -3) {
                                    if (var20 != 3) {
                                        if (var20 != 4) {
                                            if (~var20 == -6) {
                                                class123 var22 = class61.method358(var21, -123);
                                                if (var19.field3855 != var22.field1783 || ~var19.field3855 == 0) {
                                                    var22.field1783 = var19.field3855;
                                                    var22.field1900 = 0;
                                                    var22.field1780 = 1;
                                                    var22.field1894 = 0;
                                                    class129.method875((byte) -21, var22);
                                                }
                                            } else if (~var20 != -7) {
                                                if (var20 != 7) {
                                                    if (~var20 != -9) {
                                                        if (var20 != 9) {
                                                            if (var20 == 10) {
                                                                class123 var23 = class61.method358(var21, -123);
                                                                if (~var19.field3855 != ~var23.field1815 || var19.field3852 != var23.field1810 || ~var19.field3850 != ~var23.field1756) {
                                                                    var23.field1810 = var19.field3852;
                                                                    var23.field1815 = var19.field3855;
                                                                    var23.field1756 = var19.field3850;
                                                                    class129.method875((byte) -21, var23);
                                                                }
                                                            } else if (~var20 != -12) {
                                                                if (~var20 != -13) {
                                                                    if (var20 == 13) {
                                                                        class123 var24 = class61.method358(var21, -123);
                                                                        var24.field1772 = var19.field3855;
                                                                    }
                                                                } else {
                                                                    class123 var25 = class61.method358(var21, -123);
                                                                    int var26 = var19.field3855;
                                                                    if (var25 != null && var25.field1778 == 0) {
                                                                        if (var26 > -var25.field1809 + var25.field1853) {
                                                                            var26 = -var25.field1809 + var25.field1853;
                                                                        }
                                                                        if (var26 < 0) {
                                                                            var26 = 0;
                                                                        }
                                                                        if (var25.field1872 != var26) {
                                                                            var25.field1872 = var26;
                                                                            class129.method875((byte) -21, var25);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                class123 var27 = class61.method358(var21, -123);
                                                                var27.field1852 = 0;
                                                                var27.field1899 = var27.field1820 = var19.field3855;
                                                                var27.field1825 = 0;
                                                                var27.field1896 = var27.field1808 = var19.field3852;
                                                                class129.method875((byte) -21, var27);
                                                            }
                                                        } else {
                                                            class123 var28 = class61.method358(var21, -127);
                                                            if (var19.field3855 != var28.field1806 || var19.field3852 != var28.field1805) {
                                                                var28.field1805 = var19.field3852;
                                                                var28.field1806 = var19.field3855;
                                                                class129.method875((byte) -21, var28);
                                                            }
                                                        }
                                                    } else {
                                                        class123 var29 = class61.method358(var21, -125);
                                                        if (~var19.field3855 != ~var29.field1804 || var19.field3852 != var29.field1907 || var19.field3850 != var29.field1878) {
                                                            var29.field1804 = var19.field3855;
                                                            var29.field1878 = var19.field3850;
                                                            var29.field1907 = var19.field3852;
                                                            if (var29.field1806 != -1) {
                                                                if (var29.field1906 > 0) {
                                                                    var29.field1878 = var29.field1878 * 32 / var29.field1906;
                                                                } else if (var29.field1918 > 0) {
                                                                    var29.field1878 = var29.field1878 * 32 / var29.field1918;
                                                                }
                                                            }
                                                            class129.method875((byte) -21, var29);
                                                        }
                                                    }
                                                } else {
                                                    class123 var30 = class61.method358(var21, -120);
                                                    boolean var31 = ~var19.field3855 == -2;
                                                    if (var30.field1832 != var31) {
                                                        var30.field1832 = var31;
                                                        class129.method875((byte) -21, var30);
                                                    }
                                                }
                                            } else {
                                                int var32 = var19.field3855;
                                                int var33 = (1006 & var32) >> 5;
                                                int var34 = var32 >> 10 & 31;
                                                class123 var35 = class61.method358(var21, -124);
                                                int var36 = 31 & var32;
                                                int var37 = (var33 << 11) + (var34 << 19) - -(var36 << 3);
                                                if (~var35.field1779 != ~var37) {
                                                    var35.field1779 = var37;
                                                    class129.method875((byte) -21, var35);
                                                }
                                            }
                                        } else {
                                            class123 var38 = class61.method358(var21, -124);
                                            int var39 = var19.field3852;
                                            int var40 = var19.field3855;
                                            int var41 = var19.field3850;
                                            if (var38.field1769 != var40 || var38.field1818 != var39 || var38.field1819 != var41) {
                                                var38.field1818 = var39;
                                                var38.field1769 = var40;
                                                var38.field1819 = var41;
                                                class129.method875((byte) -21, var38);
                                            }
                                        }
                                    } else {
                                        class123 var42 = class61.method358(var21, -125);
                                        if (!var19.field3863.equals(var42.field1751)) {
                                            var42.field1751 = var19.field3863;
                                            class129.method875((byte) -21, var42);
                                        }
                                    }
                                } else {
                                    class255.field4140[var21] = var19.field3863;
                                    class245.field4029[class173.method1186(31, class47.field592++)] = var21;
                                }
                            }
                            if (class196.field3129 != 0) {
                                class59.field757 += 20;
                                if (~class59.field757 <= -401) {
                                    class196.field3129 = 0;
                                }
                            }
                            ++class32.field427;
                            if (class130.field2081 != null) {
                                ++class136.field2159;
                                if (class136.field2159 >= 15) {
                                    class129.method875((byte) -21, class130.field2081);
                                    class130.field2081 = null;
                                }
                            }
                            if (class242.field3982 != null) {
                                class129.method875((byte) -21, class242.field3982);
                                ++class105.field1410;
                                if (class173.field2740 + 5 < class113.field1623 || class113.field1623 < class173.field2740 + -5 || class92.field1156 > class93.field1184 + 5 || class92.field1156 < class93.field1184 + -5) {
                                    class160.field2554 = true;
                                }
                                if (~class113.field1626 == -1) {
                                    if (class160.field2554 && class105.field1410 >= 5) {
                                        if (class36.field461 == class242.field3982 && ~class35.field451 != ~class272.field4349) {
                                            ++class5.field85;
                                            class123 var43 = class242.field3982;
                                            byte var44 = 0;
                                            if (class271.field4329 == 1 && var43.field1848 == 206) {
                                                var44 = 1;
                                            }
                                            if (~var43.field1757[class35.field451] >= -1) {
                                                var44 = 0;
                                            }
                                            if (client.method735(var43).method1174((byte) 85)) {
                                                int var45 = class272.field4349;
                                                int var46 = class35.field451;
                                                var43.field1757[var46] = var43.field1757[var45];
                                                var43.field1905[var46] = var43.field1905[var45];
                                                var43.field1757[var45] = -1;
                                                var43.field1905[var45] = 0;
                                            } else if (~var44 == -2) {
                                                int var47 = class272.field4349;
                                                int var48 = class35.field451;
                                                while (~var47 != ~var48) {
                                                    if (~var47 < ~var48) {
                                                        var43.method811(false, var47, var47 + -1);
                                                        --var47;
                                                    } else if (~var48 < ~var47) {
                                                        var43.method811(false, var47, var47 + 1);
                                                        ++var47;
                                                    }
                                                }
                                            } else {
                                                var43.method811(false, class272.field4349, class35.field451);
                                            }
                                            class4.field57.method1932(false, 150);
                                            class4.field57.method574(class242.field3982.field1844, -1);
                                            class4.field57.method543((byte) -83, var44);
                                            class4.field57.method572(true, class35.field451);
                                            class4.field57.method553((byte) -105, class272.field4349);
                                        }
                                    } else if ((~class233.field3851 == -2 || class82.method453(124, class34.field437 + -1)) && ~class34.field437 < -3) {
                                        class237.method1677(-105);
                                    } else if (~class34.field437 < -1) {
                                        class178.method1240(4095);
                                    }
                                    class90.field1119 = 0;
                                    class242.field3982 = null;
                                    class136.field2159 = 10;
                                }
                            }
                            class80.field991 = false;
                            class287.field4582 = false;
                            class108.field1518 = 0;
                            class121.field1714 = null;
                            class123 var49 = class272.field4352;
                            class272.field4352 = null;
                            class123 var50 = class82.field1009;
                            class82.field1009 = null;
                            while (class154.method1052(97) && ~class108.field1518 > -129) {
                                class266.field4282[class108.field1518] = class143.field2258;
                                class179.field2854[class108.field1518] = class206.field3292;
                                ++class108.field1518;
                            }
                            class73.field925 = null;
                            if (class164.field2602 != -1) {
                                class134.method907(class292.field4640, class283.field4517, 0, 0, 0, -1, class164.field2602, 0);
                            }
                            ++class162.field2582;
                            while (true) {
                                class156 var51;
                                class123 var52;
                                class123 var53;
                                do {
                                    var51 = (class156) class185.field2963.method1808(false);
                                    if (var51 == null) {
                                        while (true) {
                                            class156 var54;
                                            class123 var55;
                                            class123 var56;
                                            do {
                                                var54 = (class156) class272.field4351.method1808(false);
                                                if (var54 == null) {
                                                    while (true) {
                                                        class156 var57;
                                                        class123 var58;
                                                        class123 var59;
                                                        do {
                                                            var57 = (class156) class96.field1264.method1808(false);
                                                            if (var57 == null) {
                                                                if (class73.field925 == null) {
                                                                    class21.field284 = 0;
                                                                }
                                                                if (class5.field75 != null) {
                                                                    class17.method87(0);
                                                                }
                                                                if (class184.field2944 > 0 && class36.field467[82] && class36.field467[81] && ~class130.field2088 != -1) {
                                                                    int var60 = -class130.field2088 + class244.field4011;
                                                                    if (var60 < 0) {
                                                                        var60 = 0;
                                                                    } else if (~var60 < -4) {
                                                                        var60 = 3;
                                                                    }
                                                                    class161.method1122(var60, class286.field4571.field3829[0] + class167.field2683, class286.field4571.field3836[0] + class181.field2883, (byte) 35);
                                                                }
                                                                if (~class184.field2944 < -1 && class36.field467[82] && class36.field467[81]) {
                                                                    if (~class155.field2458 != 0) {
                                                                        class161.method1122(class244.field4011, class167.field2683 + class155.field2458, class181.field2883 + class115.field1640, (byte) 35);
                                                                    }
                                                                    class116.field1654 = 0;
                                                                    class203.field3204 = 0;
                                                                } else if (class203.field3204 != 2) {
                                                                    if (~class116.field1654 == -3) {
                                                                        if (class155.field2458 != -1) {
                                                                            ++class111.field1590;
                                                                            class4.field57.method1932(false, 9);
                                                                            class4.field57.method572(true, class167.field2683 + class155.field2458);
                                                                            class4.field57.method553((byte) -72, class181.field2883 + class115.field1640);
                                                                            class59.field757 = 0;
                                                                            class211.field3396 = class107.field1449;
                                                                            class196.field3129 = 1;
                                                                            class141.field2244 = class214.field3435;
                                                                        }
                                                                        class116.field1654 = 0;
                                                                    } else if (class155.field2458 != -1 && class203.field3204 == 0 && ~class116.field1654 == -1) {
                                                                        class184.method1292((class155.field2458 << 1) - class286.field4571.method1638(-6377) - -1 >> 1, (byte) 25, 0, (class115.field1640 << 1) - (-1 + class286.field4571.method1638(-6377)) >> 1);
                                                                        class211.field3396 = class107.field1449;
                                                                        class59.field757 = 0;
                                                                        class196.field3129 = 1;
                                                                        class141.field2244 = class214.field3435;
                                                                    }
                                                                } else {
                                                                    if (~class155.field2458 != 0) {
                                                                        class4.field57.method1932(false, 44);
                                                                        ++class288.field4595;
                                                                        class4.field57.method553((byte) -98, class167.field2683 + class155.field2458);
                                                                        class4.field57.method568(class236.field3913, (byte) 106);
                                                                        class4.field57.method572(true, class181.field2883 + class115.field1640);
                                                                        class4.field57.method594(class236.field3911, (byte) 113);
                                                                        class59.field757 = 0;
                                                                        class196.field3129 = 1;
                                                                        class211.field3396 = class107.field1449;
                                                                        class141.field2244 = class214.field3435;
                                                                    }
                                                                    class203.field3204 = 0;
                                                                }
                                                                class155.field2458 = -1;
                                                                class286.method1930((byte) -91);
                                                                if (class272.field4352 != var49) {
                                                                    if (var49 != null) {
                                                                        class129.method875((byte) -21, var49);
                                                                    }
                                                                    if (class272.field4352 != null) {
                                                                        class129.method875((byte) -21, class272.field4352);
                                                                    }
                                                                }
                                                                if (class82.field1009 != var50 && class247.field4071 == class219.field3512) {
                                                                    if (var50 != null) {
                                                                        class129.method875((byte) -21, var50);
                                                                    }
                                                                    if (class82.field1009 != null) {
                                                                        class129.method875((byte) -21, class82.field1009);
                                                                    }
                                                                }
                                                                if (class82.field1009 == null) {
                                                                    if (class247.field4071 > 0) {
                                                                        --class247.field4071;
                                                                    }
                                                                } else if (~class219.field3512 < ~class247.field4071) {
                                                                    ++class247.field4071;
                                                                    if (~class247.field4071 == ~class219.field3512) {
                                                                        class129.method875((byte) -21, class82.field1009);
                                                                    }
                                                                }
                                                                for (int var61 = 0; ~var61 > -6; ++var61) {
                                                                    int var10002 = class60.field765[var61]++;
                                                                }
                                                                int var62 = class11.method56((byte) 16);
                                                                int var63 = class90.method494(28463);
                                                                if (var62 > 15000 && ~var63 < -15001) {
                                                                    class285.field4538 = 250;
                                                                    class7.method40(14500, (byte) -105);
                                                                    ++class275.field4391;
                                                                    class4.field57.method1932(false, 91);
                                                                }
                                                                if (class23.field302 != null && class23.field302.field3995 == 1) {
                                                                    if (class23.field302.field3992 != null) {
                                                                        class46.method259(class90.field1127, false, class136.field2156);
                                                                    }
                                                                    class90.field1127 = false;
                                                                    class23.field302 = null;
                                                                    class136.field2156 = null;
                                                                }
                                                                ++class204.field3220;
                                                                ++class269.field4306;
                                                                ++class181.field2884;
                                                                if (class269.field4306 > 500) {
                                                                    class269.field4306 = 0;
                                                                    int var64 = (int) (8.0D * Math.random());
                                                                    if (~(var64 & 2) == -3) {
                                                                        class215.field3460 += class188.field3000;
                                                                    }
                                                                    if (~(var64 & 4) == -5) {
                                                                        class91.field1136 += class206.field3287;
                                                                    }
                                                                    if (~(1 & var64) == -2) {
                                                                        class73.field920 += class20.field263;
                                                                    }
                                                                }
                                                                if (class91.field1136 < -40) {
                                                                    class206.field3287 = 1;
                                                                }
                                                                if (~class204.field3220 < -501) {
                                                                    class204.field3220 = 0;
                                                                    int var65 = (int) (8.0D * Math.random());
                                                                    if (~(var65 & 1) == -2) {
                                                                        class84.field1045 += class44.field545;
                                                                    }
                                                                    if ((var65 & 2) == 2) {
                                                                        class14.field185 += class61.field782;
                                                                    }
                                                                }
                                                                if (class91.field1136 > 40) {
                                                                    class206.field3287 = -1;
                                                                }
                                                                if (class14.field185 < -20) {
                                                                    class61.field782 = 1;
                                                                }
                                                                if (class14.field185 > 10) {
                                                                    class61.field782 = -1;
                                                                }
                                                                if (class73.field920 < -50) {
                                                                    class20.field263 = 2;
                                                                }
                                                                if (class215.field3460 < -55) {
                                                                    class188.field3000 = 2;
                                                                }
                                                                if (class73.field920 > 50) {
                                                                    class20.field263 = -2;
                                                                }
                                                                if (class84.field1045 < -60) {
                                                                    class44.field545 = 2;
                                                                }
                                                                if (class84.field1045 > 60) {
                                                                    class44.field545 = -2;
                                                                }
                                                                if (class215.field3460 > 55) {
                                                                    class188.field3000 = -2;
                                                                }
                                                                if (~class181.field2884 < -51) {
                                                                    ++class129.field2078;
                                                                    class4.field57.method1932(false, 81);
                                                                }
                                                                if (class187.field2991) {
                                                                    class76.method428(-79);
                                                                    class187.field2991 = false;
                                                                }
                                                                try {
                                                                    if (class28.field400 != null && ~class4.field57.field1228 < -1) {
                                                                        class28.field400.method1211(class4.field57.field1228, true, 0, class4.field57.field1218);
                                                                        class181.field2884 = 0;
                                                                        class4.field57.field1228 = 0;
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (IOException var66) {
                                                                    class42.method229(true);
                                                                    return;
                                                                }
                                                            }
                                                            var58 = var57.field2516;
                                                            if (var58.field1829 < 0) {
                                                                break;
                                                            }
                                                            var59 = class61.method358(var58.field1911, -122);
                                                        } while (var59 == null || var59.field1748 == null || var59.field1748.length <= var58.field1829 || var59.field1748[var58.field1829] != var58);
                                                        class296.method1985(var57, 200000);
                                                    }
                                                }
                                                var55 = var54.field2516;
                                                if (~var55.field1829 > -1) {
                                                    break;
                                                }
                                                var56 = class61.method358(var55.field1911, -118);
                                            } while (var56 == null || var56.field1748 == null || var56.field1748.length <= var55.field1829 || var56.field1748[var55.field1829] != var55);
                                            class296.method1985(var54, 200000);
                                        }
                                    }
                                    var52 = var51.field2516;
                                    if (~var52.field1829 > -1) {
                                        break;
                                    }
                                    var53 = class61.method358(var52.field1911, -125);
                                } while (var53 == null || var53.field1748 == null || var53.field1748.length <= var52.field1829 || var53.field1748[var52.field1829] != var52);
                                class296.method1985(var51, 200000);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        ++field2094;
        if (arg0 != -1) {
            method891((byte) 87);
        }
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; class244.field4015 > var7; ++var7) {
                this.method890(arg1, var7, false);
                int[][] var8 = this.method1504(-83, 0, class278.field4428);
                var4[var7] = var8[0][class20.field259];
                var5[var7] = var8[1][class20.field259];
                var6[var7] = var8[2][class20.field259];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V")
    public static void method892(int arg0) {
        if (arg0 != -22373) {
            field2091 = null;
        }
        field2092 = null;
        field2091 = null;
    }
}
