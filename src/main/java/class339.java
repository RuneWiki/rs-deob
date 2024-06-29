import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class339 extends class118 {

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    private int field5056 = 0;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "[S")
    private short[] field5059 = new short[257];

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Z")
    public static boolean field5052 = false;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field5063 = 0;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "[B")
    public static byte[] field5060 = new byte[2048];

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Liq;")
    public static class134 field5051;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "[I")
    private int[] field5053;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "[I")
    private int[] field5064;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "[[I")
    private int[][] field5054;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public final void method306(int arg0) {
        if (this.field5054 == null) {
            this.field5054 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field5058;
        if (arg0 < 103) {
            this.field5059 = null;
        }
        if (~this.field5054.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field5056 == -3) {
                this.method2074(false);
            }
            class316.method1927((byte) 125);
            this.method2072((byte) -93);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Liq;Liq;Z)V")
    public static final void method2069(class134 arg0, class134 arg1, boolean arg2) {
        ++field5061;
        class99.field1368 = arg0;
        if (arg2) {
            field5063 = 66;
        }
        class118.field1553 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    public static void method2070(byte arg0) {
        int var1 = -70 / ((arg0 - 18) / 47);
        field5051 = null;
        field5060 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)[I")
    private final int[] method2071(int arg0, int arg1) {
        ++field5067;
        if (~arg0 > -1) {
            return this.field5053;
        } else if (arg0 >= this.field5054.length) {
            return this.field5064;
        } else {
            if (arg1 != 255) {
                this.field5053 = null;
            }
            return this.field5054[arg0];
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V")
    private final void method2072(byte arg0) {
        ++field5050;
        int var2 = this.field5056;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~(this.field5054.length - 1) < ~var5 && var4 >= this.field5054[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5054[var5 + -1];
                    int[] var7 = this.field5054[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class47.field582[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5059[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field5054.length + -1 && ~this.field5054[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field5054[var14 + -1];
                    int[] var16 = this.field5054[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5059[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field5054.length + -1) < ~var22 && ~var21 <= ~this.field5054[var22][0]; ++var22) {
                }
                int[] var23 = this.field5054[var22 - 1];
                int[] var24 = this.field5054[var22];
                int var25 = this.method2071(var22 + -2, 255)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2071(var22 + 1, 255)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + var26 + -var25;
                int var32 = -var31 + var25 - var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var26 + var35;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5059[var20] = (short) var38;
            }
        }
        if (arg0 >= -20) {
            method2075(-77);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)I")
    public static int method2073(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field5057;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            int[] var4 = this.method703(0, arg1, -2);
            for (int var5 = 0; var5 < class440.field6474; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field5059[var6];
            }
        }
        if (arg0 != 1) {
            field5051 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class339() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
    private final void method2074(boolean arg0) {
        ++field5065;
        int[] var2 = this.field5054[0];
        int[] var3 = this.field5054[1];
        int[] var4 = this.field5054[this.field5054.length - 2];
        if (arg0) {
            this.method24(83, 29, (class385) null);
        }
        int[] var5 = this.field5054[this.field5054.length + -1];
        this.field5064 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] + -var5[1] + var4[1] };
        this.field5053 = new int[] { var2[0] - var3[0] + var2[0], -var3[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field5066;
        if (arg1 != 1) {
            method2075(12);
        }
        if (~arg0 == -1) {
            this.field5056 = arg2.method2343(255);
            this.field5054 = new int[arg2.method2343(255)][2];
            for (int var4 = 0; var4 < this.field5054.length; ++var4) {
                this.field5054[var4][0] = arg2.method2323(-19);
                this.field5054[var4][1] = arg2.method2323(-98);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public static final void method2075(int arg0) {
        class14.method82(arg0 ^ -32819, false);
        ++field5055;
        class302.field4548 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class432.field6343.length; ++var2) {
            if (~class244.field3663[var2] != 0 && class432.field6343[var2] == null) {
                class432.field6343[var2] = class265.field4048.method823(class244.field3663[var2], -20334, 0);
                if (class432.field6343[var2] == null) {
                    ++class302.field4548;
                    var1 = false;
                }
            }
            if (~class77.field1025[var2] != 0 && class446.field6568[var2] == null) {
                class446.field6568[var2] = class265.field4048.method808(class77.field1025[var2], class333.field4969[var2], 0, -118);
                if (class446.field6568[var2] == null) {
                    ++class302.field4548;
                    var1 = false;
                }
            }
            if (~class37.field450[var2] != 0 && class435.field6412[var2] == null) {
                class435.field6412[var2] = class265.field4048.method823(class37.field450[var2], arg0 + 12435, 0);
                if (class435.field6412[var2] == null) {
                    ++class302.field4548;
                    var1 = false;
                }
            }
            if (class62.field789[var2] != -1 && class154.field2122[var2] == null) {
                class154.field2122[var2] = class265.field4048.method823(class62.field789[var2], method2073(arg0, 53101), 0);
                if (class154.field2122[var2] == null) {
                    ++class302.field4548;
                    var1 = false;
                }
            }
            if (class351.field5207 != null && class236.field3544[var2] == null && class351.field5207[var2] != -1) {
                class236.field3544[var2] = class265.field4048.method808(class351.field5207[var2], class333.field4969[var2], 0, -99);
                if (class236.field3544[var2] == null) {
                    ++class302.field4548;
                    var1 = false;
                }
            }
        }
        if (class430.field6325 == null) {
            if (class410.field6113 != null && class135.field1786.method815((byte) -90, class410.field6113.field5106 + "_staticelements")) {
                if (!class135.field1786.method820(0, class410.field6113.field5106 + "_staticelements")) {
                    ++class302.field4548;
                    var1 = false;
                } else {
                    class430.field6325 = class112.method683((byte) 122, class66.field859, class410.field6113.field5106 + "_staticelements", class135.field1786);
                }
            } else {
                class430.field6325 = new class378(0);
            }
        }
        if (!var1) {
            class168.field2415 = 1;
        } else {
            class360.field5319 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~var4 > ~class432.field6343.length; ++var4) {
                byte[] var20 = class446.field6568[var4];
                if (var20 != null) {
                    int var21 = (class161.field2243[var4] >> 8) * 64 - class17.field250;
                    int var22 = (255 & class161.field2243[var4]) * 64 + -class112.field1487;
                    if (class151.field2088) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class180.method1091(var21, var20, (byte) -8, var22);
                }
                byte[] var23 = class154.field2122[var4];
                if (var23 != null) {
                    int var24 = (class161.field2243[var4] >> 8) * 64 + -class17.field250;
                    int var25 = (class161.field2243[var4] & 255) * 64 + -class112.field1487;
                    if (class151.field2088) {
                        var25 = 10;
                        var24 = 10;
                    }
                    var3 &= class180.method1091(var24, var23, (byte) -70, var25);
                }
            }
            if (!var3) {
                class168.field2415 = 2;
            } else {
                if (~class168.field2415 != -1) {
                    class217.method1322(class380.field5552, class28.field365.method937((byte) -106, class27.field356) + "<br>(100%)", arg0 ^ -32879, true);
                }
                class374.method2244((byte) -78);
                class196.method1170(52);
                boolean var5 = false;
                if (class196.field2965.method425() && class244.field3651) {
                    for (int var6 = 0; ~var6 > ~class432.field6343.length; ++var6) {
                        if (class154.field2122[var6] != null || class435.field6412[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class431.field6332) {
                    var7 = class88.field1252[class398.field5948];
                } else {
                    var7 = class43.field544[class398.field5948];
                }
                if (class196.field2965.method359()) {
                    ++var7;
                }
                class269.method1675(7, 4, class115.field1522, class198.field3004, var7, var5, ~class196.field2965.method342() < -1);
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class449.field6599[var8].method2257(arg0 + 41885);
                }
                class359.method2166((byte) 61);
                class465.method2865(arg0 + 32896, false);
                class310.method1892(false);
                class374.method2244((byte) -78);
                System.gc();
                class14.method82(50, true);
                class363.method2180(4, false, (byte) 69);
                int[][] var9 = null;
                if (!class151.field2088) {
                    class333.method2037((byte) -99, false);
                    class168.method1018(class115.field1522 >> 4, 0, class198.field3004 >> 4);
                    class443.method2709((byte) -107);
                    class302.method1859((int[][]) null, -15355, 4, class196.field2965, false);
                    var9 = class355.field5243[0];
                    class14.method82(50, true);
                    class230.method1398(-103, false);
                    if (class236.field3544 != null) {
                        class456.method2837(0);
                    }
                }
                if (class151.field2088) {
                    class441.method2700(3, false);
                    class168.method1018(class115.field1522 >> 4, 0, class198.field3004 >> 4);
                    class443.method2709((byte) -107);
                    class302.method1859((int[][]) null, -15355, 4, class196.field2965, false);
                    var9 = class355.field5243[0];
                    class14.method82(50, true);
                    class229.method1389(false, 0);
                }
                class196.method1170(50);
                class14.method82(50, true);
                class320.method1955(4, false, (class143) null, arg0 ^ arg0, class196.field2965, class449.field6599);
                class364.method2187(4, 2, class196.field2965);
                class14.method82(50, true);
                int var10 = class396.field5922;
                if (class143.field1911 < var10) {
                    var10 = class143.field1911;
                }
                if (class143.field1911 - 1 > var10) {
                    var10 = class143.field1911 - 1;
                }
                if (!class360.method2172(73)) {
                    class382.method2303(var10);
                } else {
                    class382.method2303(0);
                }
                class121.method726((byte) 110);
                if (var5) {
                    class94.method617(true);
                    class363.method2180(1, true, (byte) 69);
                    if (!class151.field2088) {
                        class333.method2037((byte) -120, true);
                        class302.method1859(var9, arg0 + 17414, 1, class196.field2965, true);
                        class14.method82(50, true);
                        class230.method1398(112, true);
                        class364.method2187(1, 2, class196.field2965);
                    }
                    if (class151.field2088) {
                        class441.method2700(3, true);
                        class302.method1859(var9, arg0 + 17414, 1, class196.field2965, true);
                        class14.method82(arg0 ^ -32819, true);
                        class229.method1389(true, 0);
                    }
                    class196.method1170(71);
                    class14.method82(50, true);
                    class320.method1955(1, true, class85.field1201[0], 0, class196.field2965, class449.field6599);
                    class364.method2187(1, 2, class196.field2965);
                    class14.method82(arg0 + 32819, true);
                    class121.method726((byte) 113);
                    class94.method617(false);
                }
                for (int var11 = 0; ~var11 > -5; ++var11) {
                    for (int var18 = 0; class115.field1522 > var18; ++var18) {
                        for (int var19 = 0; class198.field3004 > var19; ++var19) {
                            class292.method1808(-112, var18, var19, var11);
                        }
                    }
                }
                class184.method1124((byte) 35);
                class374.method2244((byte) -78);
                class13.method81(0);
                class196.method1170(102);
                class28.field363 = false;
                class161.method977(true);
                if (class143.field1914 != null && class301.field4543 != null && class19.field263 == 25) {
                    ++class267.field4071;
                    class177.method1082(class433.field6356, arg0 ^ -32769);
                    class189.field2840.method2381(1057001181, 0);
                }
                if (!class151.field2088) {
                    int var12 = (-(class115.field1522 >> 4) + class53.field718) / 8;
                    int var13 = ((class115.field1522 >> 4) + class53.field718) / 8;
                    int var14 = (-(class198.field3004 >> 4) + class137.field1860) / 8;
                    int var15 = ((class198.field3004 >> 4) + class137.field1860) / 8;
                    for (int var16 = var12 + -1; var13 - -1 >= var16; ++var16) {
                        for (int var17 = var14 - 1; ~(var15 + 1) <= ~var17; ++var17) {
                            if (~var16 > ~var12 || var16 > var13 || ~var14 < ~var17 || var15 < var17) {
                                class265.field4048.method832(0, "m" + var16 + "_" + var17);
                                class265.field4048.method832(0, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (~class19.field263 == -29) {
                    class316.method1929(false, 10);
                } else {
                    class316.method1929(false, 30);
                    if (class301.field4543 != null) {
                        class177.method1082(class55.field740, 0);
                    }
                }
                class278.method1717(3);
                class374.method2244((byte) -78);
                class341.method2078(arg0 + 32769);
            }
        }
    }
}
