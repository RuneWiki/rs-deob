import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class272 {

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lmb;")
    public static class96 field4726 = class243.method1708("weiss:", (byte) 99);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field4722 = 0;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lmb;")
    public static class96 field4731 = class243.method1708("tbrefresh", (byte) 106);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field4721 = 0;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field4734 = 0;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Lmb;")
    private static class96 field4725 = class243.method1708("M", (byte) 122);

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field4741 = 50;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "[I")
    public static int[] field4729 = new int[field4741];

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
    public static int[] field4730 = new int[field4741];

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "Lmb;")
    public static class96 field4732 = class243.method1708("Verbindung zum Update)2Server hergestellt)3", (byte) 116);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public static int[] field4720 = new int[field4741];

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[Lmb;")
    public static class96[] field4723 = new class96[field4741];

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Lmb;")
    public static class96 field4735 = field4725;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "[I")
    public static int[] field4738 = new int[field4741];

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "[I")
    public static int[] field4727 = new int[field4741];

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "[I")
    public static int[] field4724 = new int[field4741];

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Lmb;")
    public static class96 field4737 = field4725;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "[I")
    public static int[] field4742 = new int[field4741];

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "[I")
    public static int[] field4739 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Lff;")
    public static class3 field4728;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "[[[B")
    public static byte[][][] field4733;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)Z")
    public static final boolean method1851(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class115.field2140; var3++) {
            class180 var4 = class214.field3681[var3];
            if (var4.field3123 == 1) {
                int var5 = var4.field3122 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3121 * var5 >> 8) + var4.field3119;
                    int var7 = (var4.field3107 * var5 >> 8) + var4.field3117;
                    int var8 = (var4.field3112 * var5 >> 8) + var4.field3120;
                    int var9 = (var4.field3102 * var5 >> 8) + var4.field3116;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3123 == 2) {
                int var10 = arg0 - var4.field3122;
                if (var10 > 0) {
                    int var11 = (var4.field3121 * var10 >> 8) + var4.field3119;
                    int var12 = (var4.field3107 * var10 >> 8) + var4.field3117;
                    int var13 = (var4.field3112 * var10 >> 8) + var4.field3120;
                    int var14 = (var4.field3102 * var10 >> 8) + var4.field3116;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3123 == 3) {
                int var15 = var4.field3119 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3111 * var15 >> 8) + var4.field3122;
                    int var17 = (var4.field3098 * var15 >> 8) + var4.field3103;
                    int var18 = (var4.field3112 * var15 >> 8) + var4.field3120;
                    int var19 = (var4.field3102 * var15 >> 8) + var4.field3116;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3123 == 4) {
                int var20 = arg2 - var4.field3119;
                if (var20 > 0) {
                    int var21 = (var4.field3111 * var20 >> 8) + var4.field3122;
                    int var22 = (var4.field3098 * var20 >> 8) + var4.field3103;
                    int var23 = (var4.field3112 * var20 >> 8) + var4.field3120;
                    int var24 = (var4.field3102 * var20 >> 8) + var4.field3116;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3123 == 5) {
                int var25 = arg1 - var4.field3120;
                if (var25 > 0) {
                    int var26 = (var4.field3111 * var25 >> 8) + var4.field3122;
                    int var27 = (var4.field3098 * var25 >> 8) + var4.field3103;
                    int var28 = (var4.field3121 * var25 >> 8) + var4.field3119;
                    int var29 = (var4.field3107 * var25 >> 8) + var4.field3117;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lpb;")
    public static final class247 method1852(int arg0, int arg1) {
        field4736++;
        if (arg1 != -1) {
            method1852(-101, 18);
        }
        class247 var2 = (class247) class91.field1504.method84(71, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class247 var3 = class122.method935(false, class244.field4222, class47.field840, 1779, arg0);
        if (var3 != null) {
            class91.field1504.method88(var3, 16518, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lw;III)V")
    public static final void method1853(class107 arg0, int arg1, int arg2, int arg3) {
        field4719++;
        if (arg0.field1962 == 0) {
            arg0.field1942 = arg0.field1852;
        } else if (arg0.field1962 == 1) {
            arg0.field1942 = (arg2 - arg0.field1856) / 2 + arg0.field1852;
        } else if (arg0.field1962 == 2) {
            arg0.field1942 = arg2 - arg0.field1852 - arg0.field1856;
        } else if (arg0.field1962 == 3) {
            arg0.field1942 = arg0.field1852 * arg2 >> 14;
        } else if (arg0.field1962 == 4) {
            arg0.field1942 = (arg0.field1852 * arg2 >> 14) + (arg2 - arg0.field1856) / 2;
        } else {
            arg0.field1942 = arg2 - (arg0.field1852 * arg2 >> 14) - arg0.field1856;
        }
        if (arg3 != 2) {
            method1852(45, -44);
        }
        if (arg0.field1810 == 0) {
            arg0.field1945 = arg0.field1903;
        } else if (arg0.field1810 == 1) {
            arg0.field1945 = (arg1 - arg0.field1919) / 2 + arg0.field1903;
        } else if (arg0.field1810 == 2) {
            arg0.field1945 = arg1 - arg0.field1903 - arg0.field1919;
        } else if (arg0.field1810 == 3) {
            arg0.field1945 = arg0.field1903 * arg1 >> 14;
        } else if (arg0.field1810 == 4) {
            arg0.field1945 = (arg0.field1903 * arg1 >> 14) + (arg1 - arg0.field1919) / 2;
        } else {
            arg0.field1945 = arg1 - arg0.field1919 - (arg0.field1903 * arg1 >> 14);
        }
        if (!class45.field784 || client.method817(arg0) == 0 && arg0.field1833 != 0) {
            return;
        }
        if (arg0.field1945 < 0) {
            arg0.field1945 = 0;
        } else if (arg0.field1945 + arg0.field1919 > arg1) {
            arg0.field1945 = arg1 - arg0.field1919;
        }
        if (arg0.field1942 < 0) {
            arg0.field1942 = 0;
        } else if ((arg0.field1942 + arg0.field1856) > arg2) {
            arg0.field1942 = arg2 - arg0.field1856;
            return;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1854(int arg0) {
        field4733 = null;
        field4730 = null;
        if (arg0 != 25300) {
            method1852(-4, 100);
        }
        field4729 = null;
        field4726 = null;
        field4742 = null;
        field4727 = null;
        field4737 = null;
        field4732 = null;
        field4738 = null;
        field4725 = null;
        field4728 = null;
        field4723 = null;
        field4720 = null;
        field4739 = null;
        field4724 = null;
        field4731 = null;
        field4735 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II[BB)I")
    public static final int method1855(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 != 41) {
            return 63;
        }
        field4740++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg1; var5++) {
            var4 = var4 >>> 8 ^ class274.field4774[(arg2[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }
}
