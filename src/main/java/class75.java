import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 {

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field1854 = 0;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public int field1859 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "J")
    public static volatile long field1836 = 0L;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lmb;")
    public static class84 field1838 = class79.method672(true, "@red@");

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lmb;")
    private static class84 field1844 = class79.method672(true, "Loading title screen )2 ");

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lmb;")
    private static class84 field1852 = class79.method672(true, "slide:");

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Lmb;")
    public static class84 field1857 = class79.method672(true, "@cr1@");

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lmb;")
    public static class84 field1839 = field1852;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lmb;")
    public static class84 field1843 = field1844;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "[J")
    public static long[] field1863 = new long[100];

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lmb;")
    public static class84 field1861 = class79.method672(true, "Nehmen");

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public int field1860;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lsc;")
    public static class121 field1848;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lwe;")
    public static class147 field1856;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "Ljf;")
    public class68 field1866;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLia;)Z")
    public static final boolean method647(byte arg0, class57 arg1) {
        field1841++;
        if (arg0 != 97) {
            return true;
        }
        if (class133.field3164) {
            if (class91.method780(-150310624, arg1) != 0) {
                return false;
            }
            if (arg1.field1385 == 0) {
                return false;
            }
        }
        return arg1.field1415;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILwc;)V")
    public static final void method648(int arg0, class145 arg1) {
        field1858++;
        if (arg1.field3533 == 0) {
            return;
        }
        if (arg1.field3529 != -1 && arg1.field3529 < 32768) {
            class103 var2 = class69.field1673[arg1.field3529];
            if (var2 != null) {
                int var3 = arg1.field3549 - var2.field3549;
                int var4 = arg1.field3535 - var2.field3535;
                if (var3 != 0 || var4 != 0) {
                    arg1.field3505 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3529 >= 32768) {
            int var5 = arg1.field3529 - 32768;
            if (class90.field2264 == var5) {
                var5 = 2047;
            }
            class62 var6 = class44.field978[var5];
            if (var6 != null) {
                int var7 = arg1.field3549 - var6.field3549;
                int var8 = arg1.field3535 - var6.field3535;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3505 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3494 != 0 || arg1.field3551 != 0) && (arg1.field3555 == 0 || arg1.field3565 > 0)) {
            int var9 = arg1.field3549 - (arg1.field3494 - class95.field2359 - class95.field2359) * 64;
            int var10 = arg1.field3535 - (arg1.field3551 - class10.field159 - class10.field159) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field3505 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3494 = 0;
            arg1.field3551 = 0;
        }
        if (arg0 != -18386) {
            field1843 = null;
        }
        int var11 = arg1.field3505 - arg1.field3521 & 0x7FF;
        if (var11 == 0) {
            arg1.field3487 = 0;
            return;
        }
        arg1.field3487++;
        if (var11 > 1024) {
            arg1.field3521 -= arg1.field3533;
            boolean var12 = true;
            if (var11 < arg1.field3533 || 2048 - arg1.field3533 < var11) {
                var12 = false;
                arg1.field3521 = arg1.field3505;
            }
            if (arg1.field3546 == arg1.field3537 && (arg1.field3487 > 25 || var12)) {
                if (arg1.field3530 == -1) {
                    arg1.field3537 = arg1.field3557;
                } else {
                    arg1.field3537 = arg1.field3530;
                }
            }
        } else {
            arg1.field3521 += arg1.field3533;
            boolean var13 = true;
            if (var11 < arg1.field3533 || 2048 - arg1.field3533 < var11) {
                var13 = false;
                arg1.field3521 = arg1.field3505;
            }
            if (arg1.field3546 == arg1.field3537 && (arg1.field3487 > 25 || var13)) {
                if (arg1.field3531 == -1) {
                    arg1.field3537 = arg1.field3557;
                } else {
                    arg1.field3537 = arg1.field3531;
                }
            }
        }
        arg1.field3521 &= 0x7FF;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method649(int arg0) {
        field1838 = null;
        field1863 = null;
        field1839 = null;
        field1856 = null;
        field1843 = null;
        if (arg0 != 2047) {
            method647((byte) 81, null);
        }
        field1857 = null;
        field1852 = null;
        field1848 = null;
        field1861 = null;
        field1844 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static final void method650(boolean arg0) {
        if (!arg0) {
            method647((byte) -53, null);
        }
        field1837++;
        if (class65.field1609 != 0 && class65.field1609 != 3 || class37.field831 != 1) {
            return;
        }
        int var1 = class83.field2034 - 25 - 550;
        int var2 = class47.field1035 - 9;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var1 -= 73;
        int var3 = class136.field3300 + class120.field2892 & 0x7FF;
        int var4 = class104.field2520[var3];
        int var5 = (class6.field106 + 256) * var4 >> 8;
        var2 -= 75;
        int var6 = class104.field2527[var3];
        int var7 = (class6.field106 + 256) * var6 >> 8;
        int var8 = var1 * var7 + var2 * var5 >> 11;
        int var9 = var2 * var7 - var1 * var5 >> 11;
        int var10 = class40.field925.field3549 + var8 >> 7;
        int var11 = class40.field925.field3535 - var9 >> 7;
        boolean var12 = class16.method112(class40.field925.field3490[0], 0, class40.field925.field3489[0], 0, 0, var10, 32689, 1, 0, 0, var11, true);
        if (!var12) {
            return;
        }
        class80.field1978.method393(var1, -17343);
        class80.field1978.method393(var2, -17343);
        class80.field1978.method420(class136.field3300, -868202776);
        class80.field1978.method393(57, -17343);
        class80.field1978.method393(class120.field2892, -17343);
        class80.field1978.method393(class6.field106, -17343);
        class80.field1978.method393(89, -17343);
        class80.field1978.method420(class40.field925.field3549, -868202776);
        class80.field1978.method420(class40.field925.field3535, -868202776);
        class80.field1978.method393(class88.field2198, -17343);
        class80.field1978.method393(63, -17343);
        return;
    }
}
