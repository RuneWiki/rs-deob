import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class30 {

    @OriginalMember(owner = "client!m", name = "zc", descriptor = "[I")
    public static int[] field1987 = new int[500];

    @OriginalMember(owner = "client!m", name = "Cc", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!m", name = "Gc", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!m", name = "Ac", descriptor = "I")
    public static int field1988 = 0;

    @OriginalMember(owner = "client!m", name = "Jc", descriptor = "Z")
    public static volatile boolean field1997 = true;

    @OriginalMember(owner = "client!m", name = "Fc", descriptor = "[I")
    public static int[] field1993 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!m", name = "Mc", descriptor = "Lr;")
    private static class118 field2000 = class153.method1136(76, "Cancel");

    @OriginalMember(owner = "client!m", name = "Kc", descriptor = "[I")
    public static int[] field1998 = new int[5];

    @OriginalMember(owner = "client!m", name = "Lc", descriptor = "Lr;")
    public static class118 field1999 = class153.method1136(93, "rect_debug=");

    @OriginalMember(owner = "client!m", name = "xc", descriptor = "Lr;")
    public static class118 field1985 = field2000;

    @OriginalMember(owner = "client!m", name = "yc", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!m", name = "Dc", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!m", name = "Ec", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!m", name = "Hc", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!m", name = "Ic", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!m", name = "wc", descriptor = "J")
    public static long field1984;

    @OriginalMember(owner = "client!m", name = "Bc", descriptor = "Lpf;")
    public class110 field1989;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    public static void method680(byte arg0) {
        if (arg0 != -33) {
            field1988 = -4;
        }
        field1999 = null;
        field1993 = null;
        field1985 = null;
        field1987 = null;
        field1998 = null;
        field2000 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ltd;B)V")
    public static final void method681(class136 arg0, byte arg1) {
        ++field1995;
        Object[] var2 = arg0.field3067;
        int var3 = (Integer) var2[0];
        class144 var4 = class69.method589(var3, 557);
        if (var4 != null) {
            class103.field2387 = 0;
            int var5 = 0;
            int var6 = -1;
            int var7 = 0;
            int[] var8 = var4.field3239;
            int[] var9 = var4.field3242;
            byte var10 = -1;
            try {
                class120.field2782 = new class118[var4.field3244];
                int var11 = 0;
                class35.field887 = new int[var4.field3247];
                int var12 = 0;
                for (int var13 = 1; var2.length > var13; ++var13) {
                    if (!(var2[var13] instanceof Integer)) {
                        if (var2[var13] instanceof class118) {
                            class118 var14 = (class118) var2[var13];
                            if (var14.method938((byte) 59, class59.field1360)) {
                                var14 = arg0.field3081;
                            }
                            class120.field2782[var12++] = var14;
                        }
                    } else {
                        int var15 = (Integer) var2[var13];
                        if (var15 == -2147483647) {
                            var15 = arg0.field3072;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg0.field3066;
                        }
                        if (~var15 == 2147483644) {
                            var15 = arg0.field3077 != null ? arg0.field3077.field1703 : -1;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg0.field3074;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg0.field3077 != null ? arg0.field3077.field1764 : -1;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg0.field3071 != null ? arg0.field3071.field1703 : -1;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg0.field3071 != null ? arg0.field3071.field1764 : -1;
                        }
                        if (~var15 == 2147483639) {
                            var15 = arg0.field3065;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg0.field3083;
                        }
                        class35.field887[var11++] = var15;
                    }
                }
                if (arg1 > -88) {
                    method682(-37, 110, -12, -95, 67, -48, 5, -101, 105);
                }
                int var16 = 0;
                label1987: while (true) {
                    ++var16;
                    if (var16 > 200000) {
                        throw new RuntimeException("slow");
                    }
                    ++var6;
                    int var275 = var8[var6];
                    if (~var275 > -101) {
                        if (var275 == 0) {
                            class158.field3650[var5++] = var9[var6];
                            continue;
                        }
                        if (~var275 == -2) {
                            int var17 = var9[var6];
                            class158.field3650[var5++] = class92.field2193[var17];
                            continue;
                        }
                        if (~var275 == -3) {
                            int var18 = var9[var6];
                            --var5;
                            class92.field2193[var18] = class158.field3650[var5];
                            continue;
                        }
                        if (~var275 == -4) {
                            class2.field43[var7++] = var4.field3249[var6];
                            continue;
                        }
                        if (var275 == 6) {
                            var6 += var9[var6];
                            continue;
                        }
                        if (var275 == 7) {
                            var5 -= 2;
                            if (~class158.field3650[var5 - -1] != ~class158.field3650[var5]) {
                                var6 += var9[var6];
                            }
                            continue;
                        }
                        if (var275 == 8) {
                            var5 -= 2;
                            if (class158.field3650[var5 + 1] == class158.field3650[var5]) {
                                var6 += var9[var6];
                            }
                            continue;
                        }
                        if (var275 == 9) {
                            var5 -= 2;
                            if (class158.field3650[var5 + 1] > class158.field3650[var5]) {
                                var6 += var9[var6];
                            }
                            continue;
                        }
                        if (~var275 == -11) {
                            var5 -= 2;
                            if (~class158.field3650[var5] < ~class158.field3650[var5 - -1]) {
                                var6 += var9[var6];
                            }
                            continue;
                        }
                        if (~var275 == -22) {
                            if (~class103.field2387 == -1) {
                                return;
                            }
                            class39 var19 = class134.field3059[--class103.field2387];
                            class120.field2782 = var19.field949;
                            class35.field887 = var19.field948;
                            var4 = var19.field942;
                            var6 = var19.field952;
                            var9 = var4.field3242;
                            var8 = var4.field3239;
                            continue;
                        }
                        if (~var275 == -26) {
                            int var20 = var9[var6];
                            class158.field3650[var5++] = class131.method1012(3233, var20);
                            continue;
                        }
                        if (~var275 == -28) {
                            int var21 = var9[var6];
                            --var5;
                            class101.method776(class158.field3650[var5], true, var21);
                            continue;
                        }
                        if (~var275 == -32) {
                            var5 -= 2;
                            if (class158.field3650[var5] <= class158.field3650[var5 + 1]) {
                                var6 += var9[var6];
                            }
                            continue;
                        }
                        if (~var275 == -33) {
                            var5 -= 2;
                            if (~class158.field3650[var5 + 1] >= ~class158.field3650[var5]) {
                                var6 += var9[var6];
                            }
                            continue;
                        }
                        if (~var275 == -34) {
                            class158.field3650[var5++] = class35.field887[var9[var6]];
                            continue;
                        }
                        int var10001;
                        if (var275 == 34) {
                            var10001 = var9[var6];
                            --var5;
                            class35.field887[var10001] = class158.field3650[var5];
                            continue;
                        }
                        if (var275 == 35) {
                            class2.field43[var7++] = class120.field2782[var9[var6]];
                            continue;
                        }
                        if (var275 == 36) {
                            var10001 = var9[var6];
                            --var7;
                            class120.field2782[var10001] = class2.field43[var7];
                            continue;
                        }
                        if (var275 == 37) {
                            int var22 = var9[var6];
                            var7 -= var22;
                            class118 var23 = class95.method748(-59, var7, var22, class2.field43);
                            class2.field43[var7++] = var23;
                            continue;
                        }
                        if (var275 == 38) {
                            --var5;
                            continue;
                        }
                        if (var275 == 39) {
                            --var7;
                            continue;
                        }
                        if (~var275 == -41) {
                            int var24 = var9[var6];
                            class144 var25 = class69.method589(var24, 557);
                            int[] var26 = new int[var25.field3247];
                            class118[] var27 = new class118[var25.field3244];
                            for (int var28 = 0; ~var28 > ~var25.field3251; ++var28) {
                                var26[var28] = class158.field3650[-var25.field3251 + var28 + var5];
                            }
                            for (int var29 = 0; var25.field3234 > var29; ++var29) {
                                var27[var29] = class2.field43[-var25.field3234 + var29 + var7];
                            }
                            var7 -= var25.field3234;
                            var5 -= var25.field3251;
                            class39 var30 = new class39();
                            var30.field948 = class35.field887;
                            var30.field949 = class120.field2782;
                            var30.field942 = var4;
                            var4 = var25;
                            var30.field952 = var6;
                            class134.field3059[class103.field2387++] = var30;
                            var8 = var25.field3239;
                            var6 = -1;
                            class35.field887 = var26;
                            var9 = var25.field3242;
                            class120.field2782 = var27;
                            continue;
                        }
                        if (var275 == 42) {
                            class158.field3650[var5++] = class29.field695[var9[var6]];
                            continue;
                        }
                        if (~var275 == -44) {
                            var10001 = var9[var6];
                            --var5;
                            class29.field695[var10001] = class158.field3650[var5];
                            continue;
                        }
                        if (var275 == 44) {
                            int var31 = var9[var6] >> 16;
                            int var32 = 65535 & var9[var6];
                            --var5;
                            int var33 = class158.field3650[var5];
                            if (~var33 <= -1 && var33 <= 5000) {
                                class14.field348[var31] = var33;
                                byte var34 = -1;
                                if (~var32 == -106) {
                                    var34 = 0;
                                }
                                int var35 = 0;
                                while (true) {
                                    if (var33 <= var35) {
                                        continue label1987;
                                    }
                                    class78.field1915[var31][var35] = var34;
                                    ++var35;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (~var275 == -46) {
                            --var5;
                            int var36 = class158.field3650[var5];
                            int var37 = var9[var6];
                            if (var36 >= 0 && class14.field348[var37] > var36) {
                                class158.field3650[var5++] = class78.field1915[var37][var36];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var275 == -47) {
                            int var38 = var9[var6];
                            var5 -= 2;
                            int var39 = class158.field3650[var5];
                            if (var39 >= 0 && ~var39 > ~class14.field348[var38]) {
                                class78.field1915[var38][var39] = class158.field3650[var5 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var275 == -48) {
                            class118 var40 = class61.field1415[var9[var6]];
                            if (var40 == null) {
                                var40 = class56.field1314;
                            }
                            class2.field43[var7++] = var40;
                            continue;
                        }
                        if (~var275 == -49) {
                            var10001 = var9[var6];
                            --var7;
                            class61.field1415[var10001] = class2.field43[var7];
                            continue;
                        }
                    }
                    boolean var41;
                    if (var9[var6] == 1) {
                        var41 = true;
                    } else {
                        var41 = false;
                    }
                    if (var275 < 1000) {
                        if (~var275 == -101) {
                            var5 -= 3;
                            int var42 = class158.field3650[var5];
                            int var43 = class158.field3650[var5 + 1];
                            int var44 = class158.field3650[var5 + 2];
                            if (var43 == 0) {
                                throw new RuntimeException();
                            }
                            class74 var45 = class99.method770(-4894, var42);
                            if (var45.field1729 == null) {
                                var45.field1729 = new class74[var44 + 1];
                            }
                            if (~var45.field1729.length >= ~var44) {
                                class74[] var46 = new class74[var44 + 1];
                                for (int var47 = 0; var47 < var45.field1729.length; ++var47) {
                                    var46[var47] = var45.field1729[var47];
                                }
                                var45.field1729 = var46;
                            }
                            if (~var44 < -1 && var45.field1729[var44 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var44 - 1));
                            }
                            class74 var48 = new class74();
                            var48.field1805 = true;
                            var48.field1807 = var43;
                            var48.field1764 = var44;
                            var48.field1828 = var48.field1703 = var45.field1703;
                            var45.field1729[var44] = var48;
                            if (!var41) {
                                class37.field929 = var48;
                            } else {
                                class87.field2115 = var48;
                            }
                            class26.method232((byte) 78, var45);
                            continue;
                        }
                        if (var275 == 101) {
                            class74 var49 = !var41 ? class37.field929 : class87.field2115;
                            class74 var50 = class99.method770(-4894, var49.field1703);
                            var50.field1729[var49.field1764] = null;
                            class26.method232((byte) 94, var50);
                            continue;
                        }
                        if (~var275 == -103) {
                            --var5;
                            class74 var51 = class99.method770(-4894, class158.field3650[var5]);
                            var51.field1729 = null;
                            class26.method232((byte) 84, var51);
                            continue;
                        }
                        if (var275 == 200) {
                            var5 -= 2;
                            int var52 = class158.field3650[var5];
                            int var53 = class158.field3650[var5 + 1];
                            class74 var54 = class113.method887(var52, (byte) 1, var53);
                            if (var54 != null && ~var53 != 0) {
                                class158.field3650[var5++] = 1;
                                if (var41) {
                                    class87.field2115 = var54;
                                } else {
                                    class37.field929 = var54;
                                }
                                continue;
                            }
                            class158.field3650[var5++] = 0;
                            continue;
                        }
                    } else if (~var275 <= -1001 && var275 < 1100 || var275 >= 2000 && var275 < 2100) {
                        class74 var55;
                        if (var275 >= 2000) {
                            var275 -= 1000;
                            --var5;
                            var55 = class99.method770(-4894, class158.field3650[var5]);
                        } else {
                            var55 = var41 ? class87.field2115 : class37.field929;
                        }
                        if (~var275 == -1001) {
                            var5 -= 2;
                            var55.field1798 = class158.field3650[var5];
                            var55.field1791 = class158.field3650[var5 + 1];
                            class26.method232((byte) 107, var55);
                            continue;
                        }
                        if (~var275 == -1002) {
                            var5 -= 2;
                            var55.field1779 = class158.field3650[var5];
                            var55.field1748 = class158.field3650[var5 + 1];
                            class26.method232((byte) 116, var55);
                            continue;
                        }
                        if (var275 == 1003) {
                            --var5;
                            boolean var56 = ~class158.field3650[var5] == -2;
                            if (!var55.field1840 != !var56) {
                                var55.field1840 = var56;
                                class26.method232((byte) 66, var55);
                            }
                            continue;
                        }
                    } else if (var275 >= 1100 && ~var275 > -1201 || var275 >= 2100 && ~var275 > -2201) {
                        class74 var57;
                        if (var275 >= 2000) {
                            --var5;
                            var57 = class99.method770(-4894, class158.field3650[var5]);
                            var275 -= 1000;
                        } else {
                            var57 = !var41 ? class37.field929 : class87.field2115;
                        }
                        if (~var275 == -1101) {
                            var5 -= 2;
                            var57.field1757 = class158.field3650[var5];
                            if (~var57.field1757 < ~(-var57.field1779 + var57.field1746)) {
                                var57.field1757 = -var57.field1779 + var57.field1746;
                            }
                            if (~var57.field1757 > -1) {
                                var57.field1757 = 0;
                            }
                            var57.field1789 = class158.field3650[var5 + 1];
                            if (~var57.field1789 < ~(-var57.field1748 + var57.field1792)) {
                                var57.field1789 = -var57.field1748 + var57.field1792;
                            }
                            if (~var57.field1789 > -1) {
                                var57.field1789 = 0;
                            }
                            class26.method232((byte) 83, var57);
                            continue;
                        }
                        if (var275 == 1101) {
                            --var5;
                            var57.field1700 = class158.field3650[var5];
                            class26.method232((byte) 119, var57);
                            continue;
                        }
                        if (~var275 == -1103) {
                            --var5;
                            var57.field1812 = class158.field3650[var5] == 1;
                            class26.method232((byte) 112, var57);
                            continue;
                        }
                        if (var275 == 1103) {
                            --var5;
                            var57.field1824 = class158.field3650[var5];
                            class26.method232((byte) 63, var57);
                            continue;
                        }
                        if (~var275 == -1105) {
                            --var5;
                            var57.field1827 = class158.field3650[var5];
                            class26.method232((byte) 77, var57);
                            continue;
                        }
                        if (~var275 == -1106) {
                            --var5;
                            var57.field1774 = class158.field3650[var5];
                            class26.method232((byte) 80, var57);
                            continue;
                        }
                        if (var275 == 1106) {
                            --var5;
                            var57.field1800 = class158.field3650[var5];
                            class26.method232((byte) 126, var57);
                            continue;
                        }
                        if (var275 == 1107) {
                            --var5;
                            var57.field1806 = class158.field3650[var5] == 1;
                            class26.method232((byte) 76, var57);
                            continue;
                        }
                        if (var275 == 1108) {
                            var57.field1772 = 1;
                            --var5;
                            var57.field1826 = class158.field3650[var5];
                            class26.method232((byte) 109, var57);
                            continue;
                        }
                        if (var275 == 1109) {
                            var5 -= 6;
                            var57.field1814 = class158.field3650[var5];
                            var57.field1796 = class158.field3650[var5 - -1];
                            var57.field1770 = class158.field3650[var5 + 2];
                            var57.field1809 = class158.field3650[var5 - -3];
                            var57.field1808 = class158.field3650[var5 + 4];
                            var57.field1803 = class158.field3650[var5 + 5];
                            class26.method232((byte) 111, var57);
                            continue;
                        }
                        if (~var275 == -1111) {
                            --var5;
                            int var58 = class158.field3650[var5];
                            if (var57.field1726 != var58) {
                                var57.field1707 = 0;
                                var57.field1726 = var58;
                                var57.field1810 = 0;
                                class26.method232((byte) 65, var57);
                            }
                            continue;
                        }
                        if (var275 == 1111) {
                            --var5;
                            var57.field1716 = ~class158.field3650[var5] == -2;
                            class26.method232((byte) 115, var57);
                            continue;
                        }
                        if (~var275 == -1113) {
                            --var7;
                            class118 var59 = class2.field43[var7];
                            if (!var59.method938((byte) 62, var57.field1713)) {
                                var57.field1713 = var59;
                                class26.method232((byte) 99, var57);
                            }
                            continue;
                        }
                        if (var275 == 1113) {
                            --var5;
                            var57.field1780 = class158.field3650[var5];
                            class26.method232((byte) 69, var57);
                            continue;
                        }
                        if (var275 == 1114) {
                            var5 -= 3;
                            var57.field1761 = class158.field3650[var5];
                            var57.field1699 = class158.field3650[var5 - -1];
                            var57.field1744 = class158.field3650[var5 - -2];
                            class26.method232((byte) 86, var57);
                            continue;
                        }
                        if (~var275 == -1116) {
                            --var5;
                            var57.field1755 = ~class158.field3650[var5] == -2;
                            class26.method232((byte) 58, var57);
                            continue;
                        }
                        if (~var275 == -1117) {
                            --var5;
                            var57.field1771 = class158.field3650[var5];
                            class26.method232((byte) 53, var57);
                            continue;
                        }
                        if (~var275 == -1118) {
                            --var5;
                            var57.field1776 = class158.field3650[var5];
                            class26.method232((byte) 113, var57);
                            continue;
                        }
                        if (~var275 == -1119) {
                            --var5;
                            var57.field1785 = class158.field3650[var5] == 1;
                            class26.method232((byte) 123, var57);
                            continue;
                        }
                        if (var275 == 1119) {
                            --var5;
                            var57.field1829 = class158.field3650[var5] == 1;
                            class26.method232((byte) 119, var57);
                            continue;
                        }
                        if (var275 == 1120) {
                            var5 -= 2;
                            var57.field1746 = class158.field3650[var5];
                            var57.field1792 = class158.field3650[var5 + 1];
                            class26.method232((byte) 103, var57);
                            continue;
                        }
                    } else if ((var275 < 1200 || ~var275 <= -1301) && (~var275 > -2201 || ~var275 <= -2301)) {
                        if (var275 >= 1300 && var275 < 1400 || ~var275 <= -2301 && var275 < 2400) {
                            class74 var60;
                            if (var275 < 2000) {
                                var60 = var41 ? class87.field2115 : class37.field929;
                            } else {
                                var275 -= 1000;
                                --var5;
                                var60 = class99.method770(-4894, class158.field3650[var5]);
                            }
                            if (var275 == 1300) {
                                --var5;
                                int var61 = class158.field3650[var5] + -1;
                                if (var61 >= 0 && ~var61 >= -10) {
                                    --var7;
                                    var60.method625(class2.field43[var7], var61, (byte) -89);
                                    continue;
                                }
                                --var7;
                                continue;
                            }
                            if (var275 == 1301) {
                                var5 -= 2;
                                int var62 = class158.field3650[var5];
                                int var63 = class158.field3650[var5 + 1];
                                var60.field1793 = class113.method887(var62, (byte) 1, var63);
                                continue;
                            }
                            if (var275 == 1302) {
                                --var5;
                                var60.field1819 = class158.field3650[var5] == 1;
                                continue;
                            }
                            if (var275 == 1303) {
                                --var5;
                                var60.field1762 = class158.field3650[var5];
                                continue;
                            }
                            if (var275 == 1304) {
                                --var5;
                                var60.field1715 = class158.field3650[var5];
                                continue;
                            }
                            if (var275 == 1305) {
                                --var7;
                                var60.field1797 = class2.field43[var7];
                                continue;
                            }
                            if (var275 == 1306) {
                                --var7;
                                var60.field1782 = class2.field43[var7];
                                continue;
                            }
                            if (~var275 == -1308) {
                                var60.field1778 = null;
                                continue;
                            }
                        } else {
                            if (var275 >= 1400 && ~var275 > -1501 || var275 >= 2400 && var275 < 2500) {
                                class74 var64;
                                if (~var275 > -2001) {
                                    var64 = var41 ? class87.field2115 : class37.field929;
                                } else {
                                    --var5;
                                    var64 = class99.method770(-4894, class158.field3650[var5]);
                                    var275 -= 1000;
                                }
                                int[] var65 = null;
                                --var7;
                                class118 var66 = class2.field43[var7];
                                if (~var66.method935(-78) < -1 && var66.method916(-24853, var66.method935(-110) - 1) == 89) {
                                    --var5;
                                    int var67 = class158.field3650[var5];
                                    if (~var67 < -1) {
                                        var65 = new int[var67];
                                        while (var67-- > 0) {
                                            --var5;
                                            var65[var67] = class158.field3650[var5];
                                        }
                                    }
                                    var66 = var66.method932(var66.method935(-68) + -1, (byte) 125, 0);
                                }
                                Object[] var68 = new Object[1 + var66.method935(-76)];
                                for (int var69 = var68.length - 1; ~var69 <= -2; --var69) {
                                    if (~var66.method916(-24853, var69 + -1) != -116) {
                                        --var5;
                                        var68[var69] = new Integer(class158.field3650[var5]);
                                    } else {
                                        --var7;
                                        var68[var69] = class2.field43[var7];
                                    }
                                }
                                --var5;
                                int var70 = class158.field3650[var5];
                                if (~var70 == 0) {
                                    var68 = null;
                                } else {
                                    var68[0] = new Integer(var70);
                                }
                                if (var275 == 1422) {
                                    var64.field1767 = var68;
                                }
                                if (~var275 == -1425) {
                                    var64.field1704 = var68;
                                }
                                if (~var275 == -1410) {
                                    var64.field1750 = var68;
                                }
                                if (var275 == 1415) {
                                    var64.field1790 = var65;
                                    var64.field1735 = var68;
                                }
                                if (~var275 == -1409) {
                                    var64.field1775 = var68;
                                }
                                if (var275 == 1416) {
                                    var64.field1823 = var68;
                                }
                                if (~var275 == -1406) {
                                    var64.field1718 = var68;
                                }
                                if (var275 == 1423) {
                                    var64.field1728 = var68;
                                }
                                if (var275 == 1401) {
                                    var64.field1758 = var68;
                                }
                                if (var275 == 1410) {
                                    var64.field1708 = var68;
                                }
                                if (var275 == 1412) {
                                    var64.field1753 = var68;
                                }
                                if (var275 == 1420) {
                                    var64.field1756 = var68;
                                }
                                if (var275 == 1414) {
                                    var64.field1732 = var68;
                                    var64.field1822 = var65;
                                }
                                if (~var275 == -1412) {
                                    var64.field1730 = var68;
                                }
                                if (var275 == 1419) {
                                    var64.field1745 = var68;
                                }
                                if (var275 == 1407) {
                                    var64.field1787 = var65;
                                    var64.field1719 = var68;
                                }
                                if (var275 == 1406) {
                                    var64.field1777 = var68;
                                }
                                var64.field1760 = true;
                                if (var275 == 1418) {
                                    var64.field1795 = var68;
                                }
                                if (var275 == 1402) {
                                    var64.field1811 = var68;
                                }
                                if (~var275 == -1401) {
                                    var64.field1733 = var68;
                                }
                                if (~var275 == -1404) {
                                    var64.field1831 = var68;
                                }
                                if (var275 == 1404) {
                                    var64.field1741 = var68;
                                }
                                if (var275 == 1421) {
                                    var64.field1818 = var68;
                                }
                                if (var275 == 1417) {
                                    var64.field1721 = var68;
                                }
                                continue;
                            }
                            if (~var275 > -1601) {
                                class74 var71 = !var41 ? class37.field929 : class87.field2115;
                                if (var275 == 1500) {
                                    class158.field3650[var5++] = var71.field1798;
                                    continue;
                                }
                                if (~var275 == -1502) {
                                    class158.field3650[var5++] = var71.field1791;
                                    continue;
                                }
                                if (var275 == 1502) {
                                    class158.field3650[var5++] = var71.field1779;
                                    continue;
                                }
                                if (var275 == 1503) {
                                    class158.field3650[var5++] = var71.field1748;
                                    continue;
                                }
                                if (~var275 == -1505) {
                                    class158.field3650[var5++] = !var71.field1840 ? 0 : 1;
                                    continue;
                                }
                                if (var275 == 1505) {
                                    class158.field3650[var5++] = var71.field1828;
                                    continue;
                                }
                            } else if (~var275 <= -1701) {
                                if (~var275 <= -1801) {
                                    if (~var275 > -1901) {
                                        class74 var72 = var41 ? class87.field2115 : class37.field929;
                                        if (~var275 == -1801) {
                                            class158.field3650[var5++] = class30.method258(113, class46.method384(var72, 0));
                                            continue;
                                        }
                                        if (var275 == 1801) {
                                            --var5;
                                            int var73 = class158.field3650[var5];
                                            int var276 = var73 - 1;
                                            if (var72.field1778 != null && ~var72.field1778.length < ~var276 && var72.field1778[var276] != null) {
                                                class2.field43[var7++] = var72.field1778[var276];
                                                continue;
                                            }
                                            class2.field43[var7++] = class31.field795;
                                            continue;
                                        }
                                        if (~var275 == -1803) {
                                            if (var72.field1797 != null) {
                                                class2.field43[var7++] = var72.field1797;
                                            } else {
                                                class2.field43[var7++] = class31.field795;
                                            }
                                            continue;
                                        }
                                    } else if (~var275 > -2601) {
                                        --var5;
                                        class74 var74 = class99.method770(-4894, class158.field3650[var5]);
                                        if (~var275 == -2501) {
                                            class158.field3650[var5++] = var74.field1798;
                                            continue;
                                        }
                                        if (var275 == 2501) {
                                            class158.field3650[var5++] = var74.field1791;
                                            continue;
                                        }
                                        if (~var275 == -2503) {
                                            class158.field3650[var5++] = var74.field1779;
                                            continue;
                                        }
                                        if (~var275 == -2504) {
                                            class158.field3650[var5++] = var74.field1748;
                                            continue;
                                        }
                                        if (~var275 == -2505) {
                                            class158.field3650[var5++] = var74.field1840 ? 1 : 0;
                                            continue;
                                        }
                                        if (~var275 == -2506) {
                                            class158.field3650[var5++] = var74.field1828;
                                            continue;
                                        }
                                    } else if (var275 >= 2700) {
                                        if (var275 < 2800) {
                                            if (~var275 == -2701) {
                                                --var5;
                                                class74 var75 = class99.method770(-4894, class158.field3650[var5]);
                                                class158.field3650[var5++] = var75.field1710;
                                                continue;
                                            }
                                            if (~var275 == -2702) {
                                                --var5;
                                                class74 var76 = class99.method770(-4894, class158.field3650[var5]);
                                                if (var76.field1710 == -1) {
                                                    class158.field3650[var5++] = 0;
                                                } else {
                                                    class158.field3650[var5++] = var76.field1737;
                                                }
                                                continue;
                                            }
                                            if (~var275 == -2703) {
                                                --var5;
                                                int var77 = class158.field3650[var5];
                                                class87 var78 = (class87) class31.field797.method297((long) var77, -1);
                                                if (var78 != null) {
                                                    class158.field3650[var5++] = 1;
                                                } else {
                                                    class158.field3650[var5++] = 0;
                                                }
                                                continue;
                                            }
                                        } else if (var275 < 2900) {
                                            --var5;
                                            class74 var79 = class99.method770(-4894, class158.field3650[var5]);
                                            if (var275 == 2800) {
                                                class158.field3650[var5++] = class30.method258(92, class46.method384(var79, 0));
                                                continue;
                                            }
                                            if (var275 == 2801) {
                                                --var5;
                                                int var80 = class158.field3650[var5];
                                                int var277 = var80 - 1;
                                                if (var79.field1778 != null && var277 < var79.field1778.length && var79.field1778[var277] != null) {
                                                    class2.field43[var7++] = var79.field1778[var277];
                                                    continue;
                                                }
                                                class2.field43[var7++] = class31.field795;
                                                continue;
                                            }
                                            if (var275 == 2802) {
                                                if (var79.field1797 == null) {
                                                    class2.field43[var7++] = class31.field795;
                                                } else {
                                                    class2.field43[var7++] = var79.field1797;
                                                }
                                                continue;
                                            }
                                        } else if (var275 < 3200) {
                                            if (var275 == 3100) {
                                                --var7;
                                                class118 var81 = class2.field43[var7];
                                                class103.method786(class31.field795, var81, 0, (byte) -127);
                                                continue;
                                            }
                                            if (~var275 == -3102) {
                                                var5 -= 2;
                                                class32.method270(class158.field3650[var5], -5063, class89.field2150, class158.field3650[var5 - -1]);
                                                continue;
                                            }
                                            if (~var275 == -3104) {
                                                class68.method586((byte) 107);
                                                continue;
                                            }
                                            if (var275 == 3104) {
                                                ++class77.field1875;
                                                int var82 = 0;
                                                --var7;
                                                class118 var83 = class2.field43[var7];
                                                if (var83.method917(true)) {
                                                    var82 = var83.method906(34);
                                                }
                                                class1.field22.method722(202, (byte) -124);
                                                class1.field22.method811(var82, 2073135696);
                                                continue;
                                            }
                                            if (var275 == 3105) {
                                                ++class29.field688;
                                                --var7;
                                                class118 var84 = class2.field43[var7];
                                                class1.field22.method722(129, (byte) -126);
                                                class1.field22.method824(var84.method925(0), true);
                                                continue;
                                            }
                                            if (var275 == 3106) {
                                                ++class30.field777;
                                                --var7;
                                                class118 var85 = class2.field43[var7];
                                                class1.field22.method722(242, (byte) -128);
                                                class1.field22.method800(126, var85.method935(-101) + 1);
                                                class1.field22.method843(var85, (byte) 110);
                                                continue;
                                            }
                                            if (var275 == 3107) {
                                                --var5;
                                                int var86 = class158.field3650[var5];
                                                --var7;
                                                class118 var87 = class2.field43[var7];
                                                class31.method262(var86, var87, (byte) 56);
                                                continue;
                                            }
                                            if (var275 == 3108) {
                                                var5 -= 3;
                                                int var88 = class158.field3650[var5];
                                                int var89 = class158.field3650[var5 - -2];
                                                int var90 = class158.field3650[var5 - -1];
                                                class74 var91 = class99.method770(-4894, var89);
                                                class30.method251(var91, var88, var90, 127);
                                                continue;
                                            }
                                            if (var275 == 3109) {
                                                var5 -= 2;
                                                int var92 = class158.field3650[var5];
                                                int var93 = class158.field3650[var5 + 1];
                                                class74 var94 = !var41 ? class37.field929 : class87.field2115;
                                                class30.method251(var94, var92, var93, 127);
                                                continue;
                                            }
                                        } else if (var275 < 3300) {
                                            if (var275 == 3200) {
                                                var5 -= 3;
                                                class124.method964(true, class158.field3650[var5 + 2], class158.field3650[var5], class158.field3650[var5 + 1]);
                                                continue;
                                            }
                                            if (~var275 == -3202) {
                                                --var5;
                                                class85.method691(class158.field3650[var5], -1);
                                                continue;
                                            }
                                            if (~var275 == -3203) {
                                                var5 -= 2;
                                                class51.method458(class158.field3650[var5], class158.field3650[var5 + 1], (byte) -123);
                                                continue;
                                            }
                                        } else if (~var275 <= -3401) {
                                            if (var275 < 3500) {
                                                if (var275 == 3400) {
                                                    var5 -= 2;
                                                    int var95 = class158.field3650[var5 - -1];
                                                    int var96 = class158.field3650[var5];
                                                    class69 var97 = class41.method334(var96, -128);
                                                    for (int var98 = 0; var97.field1594 > var98; ++var98) {
                                                        if (var97.field1610[var98] == var95) {
                                                            class2.field43[var7++] = var97.field1603[var98];
                                                            var97 = null;
                                                            break;
                                                        }
                                                    }
                                                    if (var97 != null) {
                                                        class2.field43[var7++] = var97.field1613;
                                                    }
                                                    continue;
                                                }
                                                if (~var275 == -3409) {
                                                    var5 -= 4;
                                                    int var99 = class158.field3650[var5];
                                                    int var100 = class158.field3650[var5 + 1];
                                                    int var101 = class158.field3650[var5 + 2];
                                                    int var102 = class158.field3650[var5 + 3];
                                                    class69 var103 = class41.method334(var101, -128);
                                                    if (var103.field1612 == var99 && var103.field1605 == var100) {
                                                        for (int var104 = 0; ~var104 > ~var103.field1594; ++var104) {
                                                            if (var103.field1610[var104] == var102) {
                                                                if (var100 == 115) {
                                                                    class2.field43[var7++] = var103.field1603[var104];
                                                                } else {
                                                                    class158.field3650[var5++] = var103.field1616[var104];
                                                                }
                                                                var103 = null;
                                                                break;
                                                            }
                                                        }
                                                        if (var103 != null) {
                                                            if (var100 != 115) {
                                                                class158.field3650[var5++] = var103.field1592;
                                                            } else {
                                                                class2.field43[var7++] = var103.field1613;
                                                            }
                                                        }
                                                        continue;
                                                    }
                                                    if (~var100 != -116) {
                                                        class158.field3650[var5++] = 0;
                                                    } else {
                                                        class2.field43[var7++] = class56.field1314;
                                                    }
                                                    continue;
                                                }
                                            } else if (~var275 > -3701) {
                                                if (var275 == 3600) {
                                                    if (class149.field3353 != 0) {
                                                        if (~class149.field3353 != -2) {
                                                            class158.field3650[var5++] = class51.field1214;
                                                        } else {
                                                            class158.field3650[var5++] = -1;
                                                        }
                                                    } else {
                                                        class158.field3650[var5++] = -2;
                                                    }
                                                    continue;
                                                }
                                                if (var275 == 3601) {
                                                    --var5;
                                                    int var105 = class158.field3650[var5];
                                                    if (~class149.field3353 == -3 && class51.field1214 > var105) {
                                                        class2.field43[var7++] = class1.field24[var105];
                                                        continue;
                                                    }
                                                    class2.field43[var7++] = class31.field795;
                                                    continue;
                                                }
                                                if (var275 == 3602) {
                                                    --var5;
                                                    int var106 = class158.field3650[var5];
                                                    if (~class149.field3353 == -3 && ~var106 > ~class51.field1214) {
                                                        class158.field3650[var5++] = class128.field2923[var106];
                                                        continue;
                                                    }
                                                    class158.field3650[var5++] = 0;
                                                    continue;
                                                }
                                                if (~var275 == -3604) {
                                                    --var5;
                                                    int var107 = class158.field3650[var5];
                                                    if (~class149.field3353 == -3 && class51.field1214 > var107) {
                                                        class158.field3650[var5++] = class114.field2664[var107];
                                                        continue;
                                                    }
                                                    class158.field3650[var5++] = 0;
                                                    continue;
                                                }
                                                if (~var275 == -3605) {
                                                    --var7;
                                                    class118 var108 = class2.field43[var7];
                                                    --var5;
                                                    int var109 = class158.field3650[var5];
                                                    class79.method666(88, var108, var109);
                                                    continue;
                                                }
                                                if (~var275 == -3606) {
                                                    --var7;
                                                    class118 var110 = class2.field43[var7];
                                                    class14.method123(var110.method925(0), false);
                                                    continue;
                                                }
                                                if (~var275 == -3607) {
                                                    --var7;
                                                    class118 var111 = class2.field43[var7];
                                                    class78.method661(var111.method925(0), -104);
                                                    continue;
                                                }
                                                if (var275 == 3607) {
                                                    --var7;
                                                    class118 var112 = class2.field43[var7];
                                                    class137.method1034(var112.method925(0), 0);
                                                    continue;
                                                }
                                                if (~var275 == -3609) {
                                                    --var7;
                                                    class118 var113 = class2.field43[var7];
                                                    class108.method857(var113.method925(0), -552);
                                                    continue;
                                                }
                                                if (~var275 == -3610) {
                                                    --var7;
                                                    class118 var114 = class2.field43[var7];
                                                    if (var114.method915(class13.field286, (byte) 52) || var114.method915(class127.field2916, (byte) 72)) {
                                                        var114 = var114.method926(7, (byte) 117);
                                                    }
                                                    class158.field3650[var5++] = class74.method618(0, var114) ? 1 : 0;
                                                    continue;
                                                }
                                                if (var275 == 3611) {
                                                    if (class94.field2231 != null) {
                                                        class2.field43[var7++] = class94.field2231.method903(38);
                                                    } else {
                                                        class2.field43[var7++] = class31.field795;
                                                    }
                                                    continue;
                                                }
                                                if (~var275 == -3613) {
                                                    if (class94.field2231 == null) {
                                                        class158.field3650[var5++] = 0;
                                                    } else {
                                                        class158.field3650[var5++] = class105.field2419;
                                                    }
                                                    continue;
                                                }
                                                if (~var275 == -3614) {
                                                    --var5;
                                                    int var115 = class158.field3650[var5];
                                                    if (class94.field2231 != null && class105.field2419 > var115) {
                                                        class2.field43[var7++] = class99.field2294[var115].field1965.method903(38);
                                                        continue;
                                                    }
                                                    class2.field43[var7++] = class31.field795;
                                                    continue;
                                                }
                                                if (var275 == 3614) {
                                                    --var5;
                                                    int var116 = class158.field3650[var5];
                                                    if (class94.field2231 != null && ~class105.field2419 < ~var116) {
                                                        class158.field3650[var5++] = class99.field2294[var116].field1967;
                                                        continue;
                                                    }
                                                    class158.field3650[var5++] = 0;
                                                    continue;
                                                }
                                                if (var275 == 3615) {
                                                    --var5;
                                                    int var117 = class158.field3650[var5];
                                                    if (class94.field2231 != null && ~var117 > ~class105.field2419) {
                                                        class158.field3650[var5++] = class99.field2294[var117].field1959;
                                                        continue;
                                                    }
                                                    class158.field3650[var5++] = 0;
                                                    continue;
                                                }
                                                if (~var275 == -3617) {
                                                    class158.field3650[var5++] = class159.field3668;
                                                    continue;
                                                }
                                                if (var275 == 3617) {
                                                    --var7;
                                                    class118 var118 = class2.field43[var7];
                                                    class95.method750(var118, 50);
                                                    continue;
                                                }
                                                if (var275 == 3618) {
                                                    class158.field3650[var5++] = class51.field1239;
                                                    continue;
                                                }
                                                if (~var275 == -3620) {
                                                    --var7;
                                                    class118 var119 = class2.field43[var7];
                                                    class36.method303(false, var119.method925(0));
                                                    continue;
                                                }
                                                if (~var275 == -3621) {
                                                    class72.method608(14);
                                                    continue;
                                                }
                                                if (~var275 == -3622) {
                                                    if (~class149.field3353 != -1) {
                                                        class158.field3650[var5++] = class134.field3055;
                                                    } else {
                                                        class158.field3650[var5++] = -1;
                                                    }
                                                    continue;
                                                }
                                                if (~var275 == -3623) {
                                                    --var5;
                                                    int var120 = class158.field3650[var5];
                                                    if (~class149.field3353 != -1 && var120 < class134.field3055) {
                                                        class2.field43[var7++] = class131.method1014(class75.field1848[var120], -103).method903(38);
                                                        continue;
                                                    }
                                                    class2.field43[var7++] = class31.field795;
                                                    continue;
                                                }
                                                if (var275 == 3623) {
                                                    --var7;
                                                    class118 var121 = class2.field43[var7];
                                                    if (var121.method915(class13.field286, (byte) 70) || var121.method915(class127.field2916, (byte) 68)) {
                                                        var121 = var121.method926(7, (byte) 117);
                                                    }
                                                    class158.field3650[var5++] = client.method204(var121, 124) ? 1 : 0;
                                                    continue;
                                                }
                                                if (var275 == 3624) {
                                                    --var5;
                                                    int var122 = class158.field3650[var5];
                                                    if (class99.field2294 != null && class105.field2419 > var122 && class99.field2294[var122].field1965.method911(class89.field2150.field2996, 14934)) {
                                                        class158.field3650[var5++] = 1;
                                                        continue;
                                                    }
                                                    class158.field3650[var5++] = 0;
                                                    continue;
                                                }
                                                if (~var275 == -3626) {
                                                    if (class72.field1674 == null) {
                                                        class2.field43[var7++] = class31.field795;
                                                    } else {
                                                        class2.field43[var7++] = class72.field1674.method903(38);
                                                    }
                                                    continue;
                                                }
                                            } else if (var275 >= 4100) {
                                                if (var275 < 4200) {
                                                    if (~var275 == -4101) {
                                                        --var7;
                                                        class118 var123 = class2.field43[var7];
                                                        --var5;
                                                        int var124 = class158.field3650[var5];
                                                        class2.field43[var7++] = class144.method1066(true, new class118[] { var123, class43.method359(var124, (byte) -122) });
                                                        continue;
                                                    }
                                                    if (~var275 == -4102) {
                                                        var7 -= 2;
                                                        class118 var125 = class2.field43[var7 + 1];
                                                        class118 var126 = class2.field43[var7];
                                                        class2.field43[var7++] = class144.method1066(true, new class118[] { var126, var125 });
                                                        continue;
                                                    }
                                                    if (~var275 == -4103) {
                                                        --var7;
                                                        class118 var127 = class2.field43[var7];
                                                        --var5;
                                                        int var128 = class158.field3650[var5];
                                                        class2.field43[var7++] = class144.method1066(true, new class118[] { var127, class43.method364((byte) -112, true, var128) });
                                                        continue;
                                                    }
                                                    if (var275 == 4103) {
                                                        --var7;
                                                        class118 var129 = class2.field43[var7];
                                                        class2.field43[var7++] = var129.method913((byte) 48);
                                                        continue;
                                                    }
                                                    if (var275 == 4104) {
                                                        --var5;
                                                        int var130 = class158.field3650[var5];
                                                        long var131 = ((long) var130 - -11745L) * 86400000L;
                                                        class87.field2108.setTime(new Date(var131));
                                                        int var133 = class87.field2108.get(5);
                                                        int var134 = class87.field2108.get(2);
                                                        int var135 = class87.field2108.get(1);
                                                        class2.field43[var7++] = class144.method1066(true, new class118[] { class43.method359(var133, (byte) -122), class101.field2350, class137.field3115[var134], class101.field2350, class43.method359(var135, (byte) -122) });
                                                        continue;
                                                    }
                                                    if (var275 == 4105) {
                                                        var7 -= 2;
                                                        class118 var136 = class2.field43[var7];
                                                        class118 var137 = class2.field43[var7 + 1];
                                                        if (class89.field2150.field2993 != null && class89.field2150.field2993.field1409) {
                                                            class2.field43[var7++] = var137;
                                                            continue;
                                                        }
                                                        class2.field43[var7++] = var136;
                                                        continue;
                                                    }
                                                    if (var275 == 4106) {
                                                        --var5;
                                                        int var138 = class158.field3650[var5];
                                                        class2.field43[var7++] = class43.method359(var138, (byte) -122);
                                                        continue;
                                                    }
                                                    if (var275 == 4107) {
                                                        var7 -= 2;
                                                        class158.field3650[var5++] = class2.field43[var7].method919(-52, class2.field43[var7 + 1]);
                                                        continue;
                                                    }
                                                    if (var275 == 4108) {
                                                        --var7;
                                                        class118 var139 = class2.field43[var7];
                                                        var5 -= 2;
                                                        int var140 = class158.field3650[var5];
                                                        int var141 = class158.field3650[var5 + 1];
                                                        byte[] var142 = class159.field3664.method350(var141, -26, 0);
                                                        class28 var143 = new class28(var142);
                                                        class158.field3650[var5++] = var143.method56(var139, var140);
                                                        continue;
                                                    }
                                                    if (var275 == 4109) {
                                                        var5 -= 2;
                                                        int var144 = class158.field3650[var5];
                                                        --var7;
                                                        class118 var145 = class2.field43[var7];
                                                        int var146 = class158.field3650[var5 + 1];
                                                        byte[] var147 = class159.field3664.method350(var146, -49, 0);
                                                        class28 var148 = new class28(var147);
                                                        class158.field3650[var5++] = var148.method41(var145, var144);
                                                        continue;
                                                    }
                                                    if (var275 == 4110) {
                                                        var7 -= 2;
                                                        class118 var149 = class2.field43[var7];
                                                        class118 var150 = class2.field43[var7 + 1];
                                                        --var5;
                                                        if (~class158.field3650[var5] == -2) {
                                                            class2.field43[var7++] = var149;
                                                        } else {
                                                            class2.field43[var7++] = var150;
                                                        }
                                                        continue;
                                                    }
                                                    if (var275 == 4111) {
                                                        --var7;
                                                        class118 var151 = class2.field43[var7];
                                                        class2.field43[var7++] = class8.method59(var151);
                                                        continue;
                                                    }
                                                    if (~var275 == -4113) {
                                                        --var7;
                                                        class118 var152 = class2.field43[var7];
                                                        --var5;
                                                        int var153 = class158.field3650[var5];
                                                        class2.field43[var7++] = var152.method922(var153, (byte) -6);
                                                        continue;
                                                    }
                                                    if (~var275 == -4114) {
                                                        --var5;
                                                        int var154 = class158.field3650[var5];
                                                        class158.field3650[var5++] = !class31.method261(var154, (byte) -101) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var275 == -4115) {
                                                        --var5;
                                                        int var155 = class158.field3650[var5];
                                                        class158.field3650[var5++] = !class87.method708((byte) -116, var155) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var275 == -4116) {
                                                        --var5;
                                                        int var156 = class158.field3650[var5];
                                                        class158.field3650[var5++] = !class148.method1083(var156, -127) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var275 == 4116) {
                                                        --var5;
                                                        int var157 = class158.field3650[var5];
                                                        class158.field3650[var5++] = class11.method84(18014, var157) ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (~var275 == -4118) {
                                                        --var7;
                                                        class118 var158 = class2.field43[var7];
                                                        if (var158 != null) {
                                                            class158.field3650[var5++] = var158.method935(-127);
                                                        } else {
                                                            class158.field3650[var5++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var275 == -4119) {
                                                        var5 -= 2;
                                                        --var7;
                                                        class118 var159 = class2.field43[var7];
                                                        int var160 = class158.field3650[var5];
                                                        int var161 = class158.field3650[var5 + 1];
                                                        class2.field43[var7++] = var159.method932(var161, (byte) -13, var160);
                                                        continue;
                                                    }
                                                    if (var275 == 4119) {
                                                        --var7;
                                                        class118 var162 = class2.field43[var7];
                                                        boolean var163 = false;
                                                        class118 var164 = class30.method256(var162.method935(-101), 0);
                                                        for (int var165 = 0; ~var162.method935(-87) < ~var165; ++var165) {
                                                            int var166 = var162.method916(-24853, var165);
                                                            if (var166 == 60) {
                                                                var163 = true;
                                                            } else if (~var166 == -63) {
                                                                var163 = false;
                                                            } else if (!var163) {
                                                                var164.method905(var166, (byte) -113);
                                                            }
                                                        }
                                                        var164.method920((byte) -25);
                                                        class2.field43[var7++] = var164;
                                                        continue;
                                                    }
                                                    if (~var275 == -4121) {
                                                        --var7;
                                                        class118 var167 = class2.field43[var7];
                                                        var5 -= 2;
                                                        int var168 = class158.field3650[var5 + 1];
                                                        int var169 = class158.field3650[var5];
                                                        class158.field3650[var5++] = var167.method929(var169, var168, (byte) 115);
                                                        continue;
                                                    }
                                                    if (~var275 == -4122) {
                                                        var7 -= 2;
                                                        class118 var170 = class2.field43[var7];
                                                        class118 var171 = class2.field43[var7 + 1];
                                                        --var5;
                                                        int var172 = class158.field3650[var5];
                                                        class158.field3650[var5++] = var170.method907(var172, var171, (byte) -81);
                                                        continue;
                                                    }
                                                } else if (var275 < 4300) {
                                                    if (~var275 == -4201) {
                                                        --var5;
                                                        int var173 = class158.field3650[var5];
                                                        class2.field43[var7++] = class131.method1013(-12582, var173).field2048;
                                                        continue;
                                                    }
                                                    if (~var275 == -4202) {
                                                        var5 -= 2;
                                                        int var174 = class158.field3650[var5];
                                                        int var175 = class158.field3650[var5 + 1];
                                                        class85 var176 = class131.method1013(-12582, var174);
                                                        if (~var175 <= -2 && ~var175 >= -6 && var176.field2071[var175 + -1] != null) {
                                                            class2.field43[var7++] = var176.field2071[var175 + -1];
                                                            continue;
                                                        }
                                                        class2.field43[var7++] = class31.field795;
                                                        continue;
                                                    }
                                                    if (~var275 == -4203) {
                                                        var5 -= 2;
                                                        int var177 = class158.field3650[var5];
                                                        int var178 = class158.field3650[var5 + 1];
                                                        class85 var179 = class131.method1013(-12582, var177);
                                                        if (var178 >= 1 && ~var178 >= -6 && var179.field2081[var178 + -1] != null) {
                                                            class2.field43[var7++] = var179.field2081[var178 + -1];
                                                            continue;
                                                        }
                                                        class2.field43[var7++] = class31.field795;
                                                        continue;
                                                    }
                                                    if (~var275 == -4204) {
                                                        --var5;
                                                        int var180 = class158.field3650[var5];
                                                        class158.field3650[var5++] = class131.method1013(-12582, var180).field2047;
                                                        continue;
                                                    }
                                                    if (~var275 == -4205) {
                                                        --var5;
                                                        int var181 = class158.field3650[var5];
                                                        class158.field3650[var5++] = class131.method1013(-12582, var181).field2033 == 1 ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (var275 == 4205) {
                                                        --var5;
                                                        int var182 = class158.field3650[var5];
                                                        class85 var183 = class131.method1013(-12582, var182);
                                                        if (var183.field2036 == -1 && var183.field2067 >= 0) {
                                                            class158.field3650[var5++] = var183.field2067;
                                                            continue;
                                                        }
                                                        class158.field3650[var5++] = var182;
                                                        continue;
                                                    }
                                                    if (var275 == 4206) {
                                                        --var5;
                                                        int var184 = class158.field3650[var5];
                                                        class85 var185 = class131.method1013(-12582, var184);
                                                        if (~var185.field2036 <= -1 && ~var185.field2067 <= -1) {
                                                            class158.field3650[var5++] = var185.field2067;
                                                            continue;
                                                        }
                                                        class158.field3650[var5++] = var184;
                                                        continue;
                                                    }
                                                    if (var275 == 4207) {
                                                        --var5;
                                                        int var186 = class158.field3650[var5];
                                                        class158.field3650[var5++] = !class131.method1013(-12582, var186).field2027 ? 0 : 1;
                                                        continue;
                                                    }
                                                } else if (~var275 > -5101) {
                                                    if (~var275 == -5001) {
                                                        class158.field3650[var5++] = class146.field3256;
                                                        continue;
                                                    }
                                                    if (~var275 == -5002) {
                                                        var5 -= 3;
                                                        ++class25.field623;
                                                        class146.field3256 = class158.field3650[var5];
                                                        class80.field1936 = class158.field3650[var5 + 1];
                                                        class20.field492 = class158.field3650[var5 - -2];
                                                        class1.field22.method722(175, (byte) -124);
                                                        class1.field22.method800(31, class146.field3256);
                                                        class1.field22.method800(44, class80.field1936);
                                                        class1.field22.method800(-115, class20.field492);
                                                        continue;
                                                    }
                                                    if (var275 == 5002) {
                                                        ++class146.field3254;
                                                        --var7;
                                                        class118 var187 = class2.field43[var7];
                                                        var5 -= 2;
                                                        int var188 = class158.field3650[var5 + 1];
                                                        int var189 = class158.field3650[var5];
                                                        class1.field22.method722(1, (byte) 55);
                                                        class1.field22.method824(var187.method925(0), true);
                                                        class1.field22.method800(-98, var189 + -1);
                                                        class1.field22.method800(23, var188);
                                                        continue;
                                                    }
                                                    if (~var275 == -5004) {
                                                        --var5;
                                                        int var190 = class158.field3650[var5];
                                                        class118 var191 = null;
                                                        if (~var190 > -101) {
                                                            var191 = class77.field1867[var190];
                                                        }
                                                        if (var191 == null) {
                                                            var191 = class31.field795;
                                                        }
                                                        class2.field43[var7++] = var191;
                                                        continue;
                                                    }
                                                    if (var275 == 5004) {
                                                        --var5;
                                                        int var192 = class158.field3650[var5];
                                                        int var193 = -1;
                                                        if (~var192 > -101 && class77.field1867[var192] != null) {
                                                            var193 = class142.field3218[var192];
                                                        }
                                                        class158.field3650[var5++] = var193;
                                                        continue;
                                                    }
                                                    if (var275 == 5005) {
                                                        class158.field3650[var5++] = class80.field1936;
                                                        continue;
                                                    }
                                                    if (var275 == 5008) {
                                                        --var7;
                                                        class118 var194 = class2.field43[var7];
                                                        if (var194.method915(class101.field2349, (byte) 44)) {
                                                            class68.method584(-121, var194);
                                                        } else {
                                                            ++class72.field1670;
                                                            class118 var195 = var194.method913((byte) 115);
                                                            byte var196 = 0;
                                                            byte var197 = 0;
                                                            if (var195.method915(class100.field2306, (byte) 86)) {
                                                                var196 = 0;
                                                                var194 = var194.method926(class100.field2306.method935(-83), (byte) 117);
                                                            } else if (var195.method915(class84.field2025, (byte) 70)) {
                                                                var196 = 1;
                                                                var194 = var194.method926(class84.field2025.method935(-124), (byte) 117);
                                                            } else if (!var195.method915(class137.field3099, (byte) 127)) {
                                                                if (!var195.method915(class30.field763, (byte) 87)) {
                                                                    if (var195.method915(class1.field26, (byte) 29)) {
                                                                        var194 = var194.method926(class1.field26.method935(-75), (byte) 117);
                                                                        var196 = 4;
                                                                    } else if (var195.method915(class94.field2227, (byte) 96)) {
                                                                        var196 = 5;
                                                                        var194 = var194.method926(class94.field2227.method935(-102), (byte) 117);
                                                                    } else if (!var195.method915(class10.field226, (byte) 101)) {
                                                                        if (!var195.method915(class112.field2624, (byte) 107)) {
                                                                            if (var195.method915(class26.field632, (byte) 107)) {
                                                                                var194 = var194.method926(class26.field632.method935(-104), (byte) 117);
                                                                                var196 = 8;
                                                                            } else if (!var195.method915(class34.field854, (byte) 65)) {
                                                                                if (!var195.method915(class91.field2188, (byte) 44)) {
                                                                                    if (var195.method915(class148.field3285, (byte) 98)) {
                                                                                        var196 = 11;
                                                                                        var194 = var194.method926(class148.field3285.method935(-120), (byte) 117);
                                                                                    } else if (class15.field390 != 0) {
                                                                                        if (!var195.method915(class100.field2311, (byte) 126)) {
                                                                                            if (var195.method915(class84.field2008, (byte) 75)) {
                                                                                                var194 = var194.method926(class84.field2008.method935(-100), (byte) 117);
                                                                                                var196 = 1;
                                                                                            } else if (!var195.method915(class137.field3107, (byte) 49)) {
                                                                                                if (!var195.method915(class30.field734, (byte) 120)) {
                                                                                                    if (var195.method915(class1.field27, (byte) 71)) {
                                                                                                        var194 = var194.method926(class1.field27.method935(-104), (byte) 117);
                                                                                                        var196 = 4;
                                                                                                    } else if (!var195.method915(class94.field2224, (byte) 94)) {
                                                                                                        if (!var195.method915(class10.field233, (byte) 117)) {
                                                                                                            if (!var195.method915(class112.field2623, (byte) 81)) {
                                                                                                                if (!var195.method915(class26.field636, (byte) 108)) {
                                                                                                                    if (!var195.method915(class34.field858, (byte) 46)) {
                                                                                                                        if (!var195.method915(class91.field2186, (byte) 45)) {
                                                                                                                            if (var195.method915(class148.field3328, (byte) 103)) {
                                                                                                                                var196 = 11;
                                                                                                                                var194 = var194.method926(class148.field3328.method935(-92), (byte) 117);
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var196 = 10;
                                                                                                                            var194 = var194.method926(class91.field2186.method935(-66), (byte) 117);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var196 = 9;
                                                                                                                        var194 = var194.method926(class34.field858.method935(-68), (byte) 117);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var196 = 8;
                                                                                                                    var194 = var194.method926(class26.field636.method935(-85), (byte) 117);
                                                                                                                }
                                                                                                            } else {
                                                                                                                var194 = var194.method926(class112.field2623.method935(-105), (byte) 117);
                                                                                                                var196 = 7;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var196 = 6;
                                                                                                            var194 = var194.method926(class10.field233.method935(-91), (byte) 117);
                                                                                                        }
                                                                                                    } else {
                                                                                                        var194 = var194.method926(class94.field2224.method935(-78), (byte) 117);
                                                                                                        var196 = 5;
                                                                                                    }
                                                                                                } else {
                                                                                                    var194 = var194.method926(class30.field734.method935(-102), (byte) 117);
                                                                                                    var196 = 3;
                                                                                                }
                                                                                            } else {
                                                                                                var194 = var194.method926(class137.field3107.method935(-68), (byte) 117);
                                                                                                var196 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            var196 = 0;
                                                                                            var194 = var194.method926(class100.field2311.method935(-75), (byte) 117);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    var196 = 10;
                                                                                    var194 = var194.method926(class91.field2188.method935(-89), (byte) 117);
                                                                                }
                                                                            } else {
                                                                                var196 = 9;
                                                                                var194 = var194.method926(class34.field854.method935(-66), (byte) 117);
                                                                            }
                                                                        } else {
                                                                            var194 = var194.method926(class112.field2624.method935(-125), (byte) 117);
                                                                            var196 = 7;
                                                                        }
                                                                    } else {
                                                                        var194 = var194.method926(class10.field226.method935(-65), (byte) 117);
                                                                        var196 = 6;
                                                                    }
                                                                } else {
                                                                    var196 = 3;
                                                                    var194 = var194.method926(class30.field763.method935(-108), (byte) 117);
                                                                }
                                                            } else {
                                                                var196 = 2;
                                                                var194 = var194.method926(class137.field3099.method935(-81), (byte) 117);
                                                            }
                                                            class118 var198 = var194.method913((byte) 108);
                                                            if (!var198.method915(class51.field1216, (byte) 82)) {
                                                                if (var198.method915(class148.field3329, (byte) 70)) {
                                                                    var194 = var194.method926(class148.field3329.method935(-81), (byte) 117);
                                                                    var197 = 2;
                                                                } else if (!var198.method915(class110.field2579, (byte) 67)) {
                                                                    if (!var198.method915(class95.field2254, (byte) 57)) {
                                                                        if (!var198.method915(class149.field3356, (byte) 106)) {
                                                                            if (class15.field390 != 0) {
                                                                                if (!var198.method915(class51.field1238, (byte) 63)) {
                                                                                    if (!var198.method915(class148.field3300, (byte) 119)) {
                                                                                        if (var198.method915(class110.field2582, (byte) 49)) {
                                                                                            var197 = 3;
                                                                                            var194 = var194.method926(class110.field2582.method935(-70), (byte) 117);
                                                                                        } else if (var198.method915(class95.field2250, (byte) 83)) {
                                                                                            var197 = 4;
                                                                                            var194 = var194.method926(class95.field2250.method935(-73), (byte) 117);
                                                                                        } else if (var198.method915(class149.field3347, (byte) 52)) {
                                                                                            var194 = var194.method926(class149.field3347.method935(-84), (byte) 117);
                                                                                            var197 = 5;
                                                                                        }
                                                                                    } else {
                                                                                        var197 = 2;
                                                                                        var194 = var194.method926(class148.field3300.method935(-94), (byte) 117);
                                                                                    }
                                                                                } else {
                                                                                    var197 = 1;
                                                                                    var194 = var194.method926(class51.field1238.method935(-69), (byte) 117);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            var194 = var194.method926(class149.field3356.method935(-72), (byte) 117);
                                                                            var197 = 5;
                                                                        }
                                                                    } else {
                                                                        var194 = var194.method926(class95.field2254.method935(-68), (byte) 117);
                                                                        var197 = 4;
                                                                    }
                                                                } else {
                                                                    var197 = 3;
                                                                    var194 = var194.method926(class110.field2579.method935(-108), (byte) 117);
                                                                }
                                                            } else {
                                                                var197 = 1;
                                                                var194 = var194.method926(class51.field1216.method935(-127), (byte) 117);
                                                            }
                                                            class1.field22.method722(222, (byte) 62);
                                                            class1.field22.method800(54, 0);
                                                            int var199 = class1.field22.field2404;
                                                            class1.field22.method800(-103, var196);
                                                            class1.field22.method800(-127, var197);
                                                            class106.method849(class1.field22, var194, (byte) -86);
                                                            class1.field22.method845(false, -var199 + class1.field22.field2404);
                                                        }
                                                        continue;
                                                    }
                                                    if (~var275 == -5010) {
                                                        ++class94.field2233;
                                                        var7 -= 2;
                                                        class118 var200 = class2.field43[var7];
                                                        class118 var201 = class2.field43[var7 + 1];
                                                        class1.field22.method722(64, (byte) 103);
                                                        class1.field22.method800(-117, 0);
                                                        int var202 = class1.field22.field2404;
                                                        class1.field22.method824(var200.method925(0), true);
                                                        class106.method849(class1.field22, var201, (byte) -86);
                                                        class1.field22.method845(false, -var202 + class1.field22.field2404);
                                                        continue;
                                                    }
                                                    if (var275 == 5010) {
                                                        --var5;
                                                        int var203 = class158.field3650[var5];
                                                        class118 var204 = null;
                                                        if (~var203 > -101) {
                                                            var204 = class23.field564[var203];
                                                        }
                                                        if (var204 == null) {
                                                            var204 = class31.field795;
                                                        }
                                                        class2.field43[var7++] = var204;
                                                        continue;
                                                    }
                                                    if (~var275 == -5012) {
                                                        --var5;
                                                        int var205 = class158.field3650[var5];
                                                        class118 var206 = null;
                                                        if (var205 < 100) {
                                                            var206 = class75.field1847[var205];
                                                        }
                                                        if (var206 == null) {
                                                            var206 = class31.field795;
                                                        }
                                                        class2.field43[var7++] = var206;
                                                        continue;
                                                    }
                                                    if (var275 == 5015) {
                                                        class118 var207;
                                                        if (class89.field2150 != null && class89.field2150.field2996 != null) {
                                                            var207 = class89.field2150.field2996;
                                                        } else {
                                                            var207 = class132.field3022;
                                                        }
                                                        class2.field43[var7++] = var207;
                                                        continue;
                                                    }
                                                    if (var275 == 5016) {
                                                        class158.field3650[var5++] = class20.field492;
                                                        continue;
                                                    }
                                                    if (var275 == 5017) {
                                                        class158.field3650[var5++] = class4.field73;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var275 == 4000) {
                                                    var5 -= 2;
                                                    int var208 = class158.field3650[var5];
                                                    int var209 = class158.field3650[var5 + 1];
                                                    class158.field3650[var5++] = var208 + var209;
                                                    continue;
                                                }
                                                if (var275 == 4001) {
                                                    var5 -= 2;
                                                    int var210 = class158.field3650[var5];
                                                    int var211 = class158.field3650[var5 + 1];
                                                    class158.field3650[var5++] = -var211 + var210;
                                                    continue;
                                                }
                                                if (var275 == 4002) {
                                                    var5 -= 2;
                                                    int var212 = class158.field3650[var5];
                                                    int var213 = class158.field3650[var5 + 1];
                                                    class158.field3650[var5++] = var212 * var213;
                                                    continue;
                                                }
                                                if (~var275 == -4004) {
                                                    var5 -= 2;
                                                    int var214 = class158.field3650[var5];
                                                    int var215 = class158.field3650[var5 - -1];
                                                    class158.field3650[var5++] = var214 / var215;
                                                    continue;
                                                }
                                                if (~var275 == -4005) {
                                                    --var5;
                                                    int var216 = class158.field3650[var5];
                                                    class158.field3650[var5++] = (int) (Math.random() * (double) var216);
                                                    continue;
                                                }
                                                if (var275 == 4005) {
                                                    --var5;
                                                    int var217 = class158.field3650[var5];
                                                    class158.field3650[var5++] = (int) (Math.random() * (double) (var217 + 1));
                                                    continue;
                                                }
                                                if (var275 == 4006) {
                                                    var5 -= 5;
                                                    int var218 = class158.field3650[var5 - -3];
                                                    int var219 = class158.field3650[var5 + 4];
                                                    int var220 = class158.field3650[var5 + 2];
                                                    int var221 = class158.field3650[var5 + 1];
                                                    int var222 = class158.field3650[var5];
                                                    class158.field3650[var5++] = (-var220 + var219) * (-var222 + var221) / (-var220 + var218) + var222;
                                                    continue;
                                                }
                                                if (var275 == 4007) {
                                                    var5 -= 2;
                                                    int var223 = class158.field3650[var5];
                                                    int var224 = class158.field3650[var5 + 1];
                                                    class158.field3650[var5++] = var223 * var224 / 100 + var223;
                                                    continue;
                                                }
                                                if (var275 == 4008) {
                                                    var5 -= 2;
                                                    int var225 = class158.field3650[var5 + 1];
                                                    int var226 = class158.field3650[var5];
                                                    class158.field3650[var5++] = class19.method178(var226, 1 << var225);
                                                    continue;
                                                }
                                                if (~var275 == -4010) {
                                                    var5 -= 2;
                                                    int var227 = class158.field3650[var5 + 1];
                                                    int var228 = class158.field3650[var5];
                                                    class158.field3650[var5++] = class79.method669(-(1 << var227) + -1, var228);
                                                    continue;
                                                }
                                                if (var275 == 4010) {
                                                    var5 -= 2;
                                                    int var229 = class158.field3650[var5];
                                                    int var230 = class158.field3650[var5 + 1];
                                                    class158.field3650[var5++] = ~class79.method669(1 << var230, var229) == -1 ? 0 : 1;
                                                    continue;
                                                }
                                                if (var275 == 4011) {
                                                    var5 -= 2;
                                                    int var231 = class158.field3650[var5 + 1];
                                                    int var232 = class158.field3650[var5];
                                                    class158.field3650[var5++] = var232 % var231;
                                                    continue;
                                                }
                                                if (~var275 == -4013) {
                                                    var5 -= 2;
                                                    int var233 = class158.field3650[var5 + 1];
                                                    int var234 = class158.field3650[var5];
                                                    if (var234 != 0) {
                                                        class158.field3650[var5++] = (int) Math.pow((double) var234, (double) var233);
                                                    } else {
                                                        class158.field3650[var5++] = 0;
                                                    }
                                                    continue;
                                                }
                                                if (var275 == 4013) {
                                                    var5 -= 2;
                                                    int var235 = class158.field3650[var5 - -1];
                                                    int var236 = class158.field3650[var5];
                                                    if (var236 != 0) {
                                                        if (var235 == 0) {
                                                            class158.field3650[var5++] = Integer.MAX_VALUE;
                                                        } else {
                                                            class158.field3650[var5++] = (int) Math.pow((double) var236, 1.0D / (double) var235);
                                                        }
                                                    } else {
                                                        class158.field3650[var5++] = 0;
                                                    }
                                                    continue;
                                                }
                                                if (~var275 == -4015) {
                                                    var5 -= 2;
                                                    int var237 = class158.field3650[var5];
                                                    int var238 = class158.field3650[var5 + 1];
                                                    class158.field3650[var5++] = class79.method669(var237, var238);
                                                    continue;
                                                }
                                                if (var275 == 4015) {
                                                    var5 -= 2;
                                                    int var239 = class158.field3650[var5];
                                                    int var240 = class158.field3650[var5 - -1];
                                                    class158.field3650[var5++] = class19.method178(var239, var240);
                                                    continue;
                                                }
                                            }
                                        } else {
                                            if (~var275 == -3301) {
                                                class158.field3650[var5++] = class65.field1479;
                                                continue;
                                            }
                                            if (var275 == 3301) {
                                                var5 -= 2;
                                                int var241 = class158.field3650[var5];
                                                int var242 = class158.field3650[var5 - -1];
                                                class158.field3650[var5++] = class44.method369(var242, (byte) -59, var241);
                                                continue;
                                            }
                                            if (~var275 == -3303) {
                                                var5 -= 2;
                                                int var243 = class158.field3650[var5];
                                                int var244 = class158.field3650[var5 + 1];
                                                class158.field3650[var5++] = class118.method909(var244, 0, var243);
                                                continue;
                                            }
                                            if (~var275 == -3304) {
                                                var5 -= 2;
                                                int var245 = class158.field3650[var5];
                                                int var246 = class158.field3650[var5 + 1];
                                                class158.field3650[var5++] = class157.method1223(var246, -13083, var245);
                                                continue;
                                            }
                                            if (var275 == 3304) {
                                                --var5;
                                                int var247 = class158.field3650[var5];
                                                class158.field3650[var5++] = class105.method829(var247, -38).field495;
                                                continue;
                                            }
                                            if (~var275 == -3306) {
                                                --var5;
                                                int var248 = class158.field3650[var5];
                                                class158.field3650[var5++] = class139.field3173[var248];
                                                continue;
                                            }
                                            if (~var275 == -3307) {
                                                --var5;
                                                int var249 = class158.field3650[var5];
                                                class158.field3650[var5++] = class25.field617[var249];
                                                continue;
                                            }
                                            if (~var275 == -3308) {
                                                --var5;
                                                int var250 = class158.field3650[var5];
                                                class158.field3650[var5++] = class115.field2704[var250];
                                                continue;
                                            }
                                            if (~var275 == -3309) {
                                                int var251 = class106.field2468;
                                                int var252 = (class89.field2150.field760 >> 7) + client.field524;
                                                int var253 = (class89.field2150.field712 >> 7) + class27.field646;
                                                class158.field3650[var5++] = (var251 << 28) + (var252 << 14) - -var253;
                                                continue;
                                            }
                                            if (~var275 == -3310) {
                                                --var5;
                                                int var254 = class158.field3650[var5];
                                                class158.field3650[var5++] = class79.method669(16383, var254 >> 14);
                                                continue;
                                            }
                                            if (~var275 == -3311) {
                                                --var5;
                                                int var255 = class158.field3650[var5];
                                                class158.field3650[var5++] = var255 >> 28;
                                                continue;
                                            }
                                            if (var275 == 3311) {
                                                --var5;
                                                int var256 = class158.field3650[var5];
                                                class158.field3650[var5++] = class79.method669(var256, 16383);
                                                continue;
                                            }
                                            if (~var275 == -3313) {
                                                class158.field3650[var5++] = !class61.field1410 ? 0 : 1;
                                                continue;
                                            }
                                            if (~var275 == -3314) {
                                                var5 -= 2;
                                                int var257 = class158.field3650[var5] + 32768;
                                                int var258 = class158.field3650[var5 + 1];
                                                class158.field3650[var5++] = class44.method369(var258, (byte) -59, var257);
                                                continue;
                                            }
                                            if (~var275 == -3315) {
                                                var5 -= 2;
                                                int var259 = class158.field3650[var5] + 32768;
                                                int var260 = class158.field3650[var5 + 1];
                                                class158.field3650[var5++] = class118.method909(var260, 0, var259);
                                                continue;
                                            }
                                            if (var275 == 3315) {
                                                var5 -= 2;
                                                int var261 = class158.field3650[var5] - -32768;
                                                int var262 = class158.field3650[var5 + 1];
                                                class158.field3650[var5++] = class157.method1223(var262, -13083, var261);
                                                continue;
                                            }
                                            if (var275 == 3316) {
                                                if (class48.field1170 >= 2) {
                                                    class158.field3650[var5++] = class48.field1170;
                                                } else {
                                                    class158.field3650[var5++] = 0;
                                                }
                                                continue;
                                            }
                                            if (var275 == 3317) {
                                                class158.field3650[var5++] = class99.field2296;
                                                continue;
                                            }
                                            if (~var275 == -3319) {
                                                class158.field3650[var5++] = class74.field1836;
                                                continue;
                                            }
                                            if (var275 == 3321) {
                                                class158.field3650[var5++] = class31.field796;
                                                continue;
                                            }
                                            if (var275 == 3322) {
                                                class158.field3650[var5++] = class120.field2777;
                                                continue;
                                            }
                                            if (var275 == 3323) {
                                                if (class48.field1170 != 1) {
                                                    class158.field3650[var5++] = 0;
                                                } else {
                                                    class158.field3650[var5++] = 1;
                                                }
                                                continue;
                                            }
                                        }
                                    } else {
                                        --var5;
                                        class74 var263 = class99.method770(-4894, class158.field3650[var5]);
                                        if (var275 == 2600) {
                                            class158.field3650[var5++] = var263.field1757;
                                            continue;
                                        }
                                        if (var275 == 2601) {
                                            class158.field3650[var5++] = var263.field1789;
                                            continue;
                                        }
                                        if (~var275 == -2603) {
                                            class2.field43[var7++] = var263.field1713;
                                            continue;
                                        }
                                        if (~var275 == -2604) {
                                            class158.field3650[var5++] = var263.field1746;
                                            continue;
                                        }
                                        if (var275 == 2604) {
                                            class158.field3650[var5++] = var263.field1792;
                                            continue;
                                        }
                                        if (var275 == 2605) {
                                            class158.field3650[var5++] = var263.field1803;
                                            continue;
                                        }
                                        if (~var275 == -2607) {
                                            class158.field3650[var5++] = var263.field1770;
                                            continue;
                                        }
                                        if (var275 == 2607) {
                                            class158.field3650[var5++] = var263.field1808;
                                            continue;
                                        }
                                        if (var275 == 2608) {
                                            class158.field3650[var5++] = var263.field1809;
                                            continue;
                                        }
                                    }
                                } else {
                                    class74 var264 = !var41 ? class37.field929 : class87.field2115;
                                    if (~var275 == -1701) {
                                        class158.field3650[var5++] = var264.field1710;
                                        continue;
                                    }
                                    if (var275 == 1701) {
                                        if (var264.field1710 == -1) {
                                            class158.field3650[var5++] = 0;
                                        } else {
                                            class158.field3650[var5++] = var264.field1737;
                                        }
                                        continue;
                                    }
                                    if (~var275 == -1703) {
                                        class158.field3650[var5++] = var264.field1764;
                                        continue;
                                    }
                                }
                            } else {
                                class74 var265 = var41 ? class87.field2115 : class37.field929;
                                if (var275 == 1600) {
                                    class158.field3650[var5++] = var265.field1757;
                                    continue;
                                }
                                if (~var275 == -1602) {
                                    class158.field3650[var5++] = var265.field1789;
                                    continue;
                                }
                                if (~var275 == -1603) {
                                    class2.field43[var7++] = var265.field1713;
                                    continue;
                                }
                                if (var275 == 1603) {
                                    class158.field3650[var5++] = var265.field1746;
                                    continue;
                                }
                                if (var275 == 1604) {
                                    class158.field3650[var5++] = var265.field1792;
                                    continue;
                                }
                                if (~var275 == -1606) {
                                    class158.field3650[var5++] = var265.field1803;
                                    continue;
                                }
                                if (var275 == 1606) {
                                    class158.field3650[var5++] = var265.field1770;
                                    continue;
                                }
                                if (var275 == 1607) {
                                    class158.field3650[var5++] = var265.field1808;
                                    continue;
                                }
                                if (var275 == 1608) {
                                    class158.field3650[var5++] = var265.field1809;
                                    continue;
                                }
                            }
                        }
                    } else {
                        class74 var266;
                        if (~var275 > -2001) {
                            var266 = !var41 ? class37.field929 : class87.field2115;
                        } else {
                            --var5;
                            var266 = class99.method770(-4894, class158.field3650[var5]);
                            var275 -= 1000;
                        }
                        class26.method232((byte) 120, var266);
                        if (var275 == 1200) {
                            var5 -= 2;
                            int var267 = class158.field3650[var5 + 1];
                            int var268 = class158.field3650[var5];
                            var266.field1737 = var267;
                            var266.field1710 = var268;
                            class85 var269 = class131.method1013(-12582, var268);
                            var266.field1803 = var269.field2056;
                            if (~var266.field1779 < -1) {
                                var266.field1803 = var266.field1803 * 32 / var266.field1779;
                            }
                            var266.field1809 = var269.field2066;
                            var266.field1808 = var269.field2049;
                            var266.field1770 = var269.field2044;
                            var266.field1814 = var269.field2055;
                            var266.field1796 = var269.field2052;
                            continue;
                        }
                        if (var275 == 1201) {
                            var266.field1772 = 2;
                            --var5;
                            var266.field1826 = class158.field3650[var5];
                            continue;
                        }
                        if (var275 == 1202) {
                            var266.field1772 = 3;
                            var266.field1826 = class89.field2150.field2993.method553((byte) 106);
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var274) {
                if (var4.field3248 == null) {
                    if (~class33.field842 != -1) {
                        class103.method786(class31.field795, class72.field1677, 0, (byte) -128);
                    }
                    class23.method212("CS2 - scr:" + var4.field2295 + " op:" + var10, (byte) 71, var274);
                } else {
                    class118 var271 = class30.method256(30, 0);
                    var271.method923(-41, class131.field2978).method923(119, var4.field3248);
                    for (int var272 = class103.field2387 - 1; var272 >= 0; --var272) {
                        var271.method923(110, class27.field663).method923(-53, class134.field3059[var272].field942.field3248);
                    }
                    if (var10 == 40) {
                        int var273 = var9[var6];
                        var271.method923(-65, class128.field2945).method923(-86, class43.method359(var273, (byte) -122));
                    }
                    if (class33.field842 != 0) {
                        class103.method786(class31.field795, class144.method1066(true, new class118[] { class42.field1017, var4.field3248 }), 0, (byte) -126);
                    }
                    class23.method212("CS2 - scr:" + var4.field2295 + " op:" + var10 + new String(var271.method921(20377)), (byte) 113, var274);
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)Z")
    public final boolean method253(int arg0) {
        ++field1986;
        if (this.field1989 == null) {
            return false;
        } else {
            return arg0 == -3;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)Lwb;")
    public final class155 method215(int arg0) {
        ++field1991;
        if (this.field1989 == null) {
            return null;
        } else {
            class153 var2 = super.field746 != -1 && ~super.field747 == -1 ? class125.method970((byte) -68, super.field746) : null;
            class153 var3 = super.field765 == -1 || super.field766 == super.field765 && var2 != null ? null : class125.method970((byte) -68, super.field765);
            if (arg0 != 15246) {
                return null;
            } else {
                class155 var4 = this.field1989.method868(super.field721, var2, var3, 126, super.field719);
                if (var4 == null) {
                    return null;
                } else {
                    var4.method1199();
                    super.field757 = var4.field2145;
                    if (~super.field735 != 0 && super.field782 != -1) {
                        class155 var5 = class1.method2(-15697, super.field735).method455((byte) 73, super.field782);
                        if (var5 != null) {
                            var5.method1217(0, -super.field770, 0);
                            class155[] var6 = new class155[] { var4, var5 };
                            var4 = new class155(var6, 2);
                        }
                    }
                    if (~this.field1989.field2575 == -2) {
                        var4.field3546 = true;
                    }
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIIIII)V")
    public static final void method682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1992;
        if (class23.method211(arg1, arg5 ^ arg5)) {
            class157.field3612 = null;
            class91.method729(arg3, arg6, class63.field1446[arg1], arg8, arg2, arg0, arg7, -1, arg4, -1);
            if (class157.field3612 != null) {
                class91.method729(arg3, class35.field881, class157.field3612, arg8, arg2, arg0, arg7, -1412584499, class133.field3044, -1);
                class157.field3612 = null;
            }
        } else if (~arg8 != 0) {
            class54.field1274[arg8] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class54.field1274[var9] = true;
            }
        }
    }
}
