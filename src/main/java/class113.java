import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class113 extends class227 {

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    private int field1867;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    private int field1873;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    private int field1872;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1871 = "green:";

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public static int field1883 = 0;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lmh;")
    public static class263 field1875;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lih;")
    public static class295 field1879;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
    public static final void method848(int arg0, byte arg1) {
        ++field1877;
        int var2 = class103.field1791;
        if (~arg0 == -1) {
            var2 = 1;
        }
        if (arg1 != -46) {
            field1871 = null;
        }
        int var10002;
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            class207 var20;
            if (~arg0 == -1) {
                var20 = class213.field3139;
            } else {
                var20 = class92.field1475[class162.field2518[var3]];
            }
            if (var20 != null && var20.method91(90)) {
                int var21 = var20.method1467(0);
                if (arg0 == 0 || arg0 == var21) {
                    if (~var21 == -2) {
                        if ((var20.field3660 & 127) == 64 && (var20.field3753 & 127) == 64) {
                            int var22 = var20.field3660 >> 7;
                            int var23 = var20.field3753 >> 7;
                            if (var22 >= 0 && ~var22 > -105 && ~var23 <= -1 && ~var23 > -105) {
                                var10002 = class158.field2454[var22][var23]++;
                            }
                        }
                    } else if ((~(1 & var21) != -1 || (var20.field3660 & 127) == 0 && ~(var20.field3753 & 127) == -1) && ((var21 & 1) != 1 || ~(var20.field3660 & 127) == -65 && ~(var20.field3753 & 127) == -65)) {
                        int var24 = var20.field3660 - var21 * 64 >> 7;
                        int var25 = var20.field3753 - var21 * 64 >> 7;
                        int var26 = var24 + var20.method1467(0);
                        if (~var24 > -1) {
                            var24 = 0;
                        }
                        if (~var26 < -105) {
                            var26 = 104;
                        }
                        int var27 = var20.method1467(0) + var25;
                        if (~var27 < -105) {
                            var27 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        for (int var28 = var24; ~var26 < ~var28; ++var28) {
                            for (int var29 = var25; ~var29 > ~var27; ++var29) {
                                var10002 = class158.field2454[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        label217: for (int var4 = 0; ~var4 > ~var2; ++var4) {
            class207 var5;
            long var6;
            if (~arg0 == -1) {
                var5 = class213.field3139;
                var6 = 8791798054912L;
            } else {
                var5 = class92.field1475[class162.field2518[var4]];
                var6 = (long) class162.field2518[var4] << 32;
            }
            if (var5 != null && var5.method91(121)) {
                int var8 = var5.method1467(0);
                if (~arg0 == -1 || ~arg0 == ~var8) {
                    var5.field3736 = true;
                    var5.field3039 = false;
                    if ((class207.field3054 && class103.field1791 > 200 || ~class103.field1791 < -51) && ~arg0 != -1 && var5.field3752 == var5.method1708(arg1 + 46).field4703) {
                        var5.field3039 = true;
                    }
                    if (var8 == 1) {
                        if (~(127 & var5.field3660) == -65 && ~(var5.field3753 & 127) == -65) {
                            int var9 = var5.field3660 >> 7;
                            int var10 = var5.field3753 >> 7;
                            if (~var9 > -1 || ~var9 <= -105 || var10 < 0 || ~var10 <= -105) {
                                continue;
                            }
                            if (class158.field2454[var9][var10] > 1) {
                                var10002 = class158.field2454[var9][var10]--;
                                continue;
                            }
                        }
                    } else if (~(1 & var8) == -1 && (127 & var5.field3660) == 0 && ~(var5.field3753 & 127) == -1 || ~(var8 & 1) == -2 && ~(var5.field3660 & 127) == -65 && ~(127 & var5.field3753) == -1) {
                        int var11 = -(var8 * 64) + var5.field3753 >> 7;
                        int var12 = -(var8 * 64) + var5.field3660 >> 7;
                        int var13 = var8 + var12;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (~var12 > -1) {
                            var12 = 0;
                        }
                        int var14 = var8 + var11;
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        boolean var15 = true;
                        for (int var16 = var12; var13 > var16; ++var16) {
                            for (int var19 = var11; var14 > var19; ++var19) {
                                if (class158.field2454[var16][var19] <= 1) {
                                    var15 = false;
                                    break;
                                }
                            }
                        }
                        if (var15) {
                            int var17 = var12;
                            while (true) {
                                if (var13 <= var17) {
                                    continue label217;
                                }
                                for (int var18 = var11; ~var18 > ~var14; ++var18) {
                                    var10002 = class158.field2454[var17][var18]--;
                                }
                                ++var17;
                            }
                        }
                    }
                    if (var5.field3742 != null && class199.field2930 >= var5.field3728 && ~class199.field2930 > ~var5.field3674) {
                        var5.field3039 = false;
                        var5.field3736 = false;
                        var5.field3759 = method851(class37.field474, 98, var5.field3753, var5.field3660);
                        class245.method1689(class37.field474, var5.field3660, var5.field3753, var5.field3759, var5, var5.field3668, var6, var5.field3666, var5.field3701, var5.field3673, var5.field3735);
                    } else {
                        var5.field3736 = false;
                        var5.field3759 = method851(class37.field474, 93, var5.field3753, var5.field3660);
                        class71.method540(class37.field474, var5.field3660, var5.field3753, var5.field3759, var8 * 64 + 60 - 64, var5, var5.field3668, var6, var5.field3739);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public static void method849(int arg0) {
        field1871 = null;
        field1875 = null;
        if (arg0 < -119) {
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIII)V")
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1867 = arg2;
        this.field1880 = arg3;
        this.field1873 = arg1;
        this.field1872 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)Lbc;")
    public static final class148 method850(byte arg0) {
        int var1 = class283.field4559[0] * class165.field2534[0];
        ++field1881;
        if (arg0 != 84) {
            method848(-9, (byte) 48);
        }
        byte[] var2 = class280.field4506[0];
        class148 var5;
        if (!class121.field1994[0]) {
            int[] var3 = new int[var1];
            for (int var4 = 0; ~var4 > ~var1; ++var4) {
                var3[var4] = class53.field748[class301.method2056(var2[var4], 255)];
            }
            var5 = new class148(class250.field3792, class19.field202, class32.field399[0], class297.field4765[0], class165.field2534[0], class283.field4559[0], var3);
        } else {
            byte[] var6 = class124.field2074[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; ~var1 < ~var8; ++var8) {
                var7[var8] = class200.method1408(class301.method2056(255, var6[var8]) << 24, class53.field748[class301.method2056(var2[var8], 255)]);
            }
            var5 = new class116(class250.field3792, class19.field202, class32.field399[0], class297.field4765[0], class165.field2534[0], class283.field4559[0], var7);
        }
        class137.method1032(arg0 + -179);
        return var5;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I")
    public static final int method851(int arg0, int arg1, int arg2, int arg3) {
        ++field1870;
        if (class103.field1792 == null) {
            return 0;
        } else {
            int var4 = arg2 >> 7;
            int var5 = arg3 >> 7;
            if (var5 >= 0 && ~var4 <= -1 && ~var5 >= -104 && ~var4 >= -104) {
                int var6 = arg0;
                if (~arg0 > -4 && ~(2 & class253.field3806[1][var5][var4]) == -3) {
                    var6 = arg0 + 1;
                }
                int var7 = arg3 & 127;
                int var8 = -126 % ((arg1 - 46) / 33);
                int var9 = 127 & arg2;
                int var10 = (-var7 + 128) * class103.field1792[var6][var5][var4] + class103.field1792[var6][var5 + 1][var4] * var7 >> 7;
                int var11 = (-var7 + 128) * class103.field1792[var6][var5][var4 - -1] + class103.field1792[var6][var5 + 1][var4 + 1] * var7 >> 7;
                return (-var9 + 128) * var10 - -(var9 * var11) >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method487(int arg0, int arg1, int arg2) {
        ++field1882;
        if (arg1 != 8199) {
            method851(-76, 75, -40, 5);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method486(int arg0, int arg1, int arg2) {
        ++field1874;
        if (arg2 == 769) {
            int var4 = this.field1867 * arg1 >> 12;
            int var5 = this.field1873 * arg0 >> 12;
            int var6 = this.field1880 * arg0 >> 12;
            int var7 = this.field1872 * arg1 >> 12;
            class303.method2061(super.field3330, var7, 15006, var5, var6, var4);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIB)V")
    public final void method485(int arg0, int arg1, byte arg2) {
        ++field1869;
        int var4 = this.field1872 * arg1 >> 12;
        int var5 = this.field1867 * arg1 >> 12;
        int var6 = this.field1880 * arg0 >> 12;
        int var7 = this.field1873 * arg0 >> 12;
        if (arg2 != 124) {
            this.field1872 = 57;
        }
        class293.method1991(super.field3330, var4, var5, var6, var7, super.field3329, 121, super.field3331);
    }
}
