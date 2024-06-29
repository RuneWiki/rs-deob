import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class193 extends class144 {

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "[I")
    public static int[] field2770 = new int[14];

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2769 = "wishes to trade with you.";

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "Z")
    public static boolean field2772 = true;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "[Z")
    public static boolean[] field2773 = new boolean[8];

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "Lbc;")
    public static class282 field2776;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "[I")
    public static int[] field2767;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method1252(boolean arg0, byte[] arg1, boolean arg2) {
        ++field2771;
        if (arg1 == null) {
            return null;
        } else {
            if (~arg1.length < -137 && !class117.field1642) {
                try {
                    class170 var3 = (class170) Class.forName("sj").newInstance();
                    var3.method1116(arg1, -36);
                    return var3;
                } catch (Throwable var4) {
                    class117.field1642 = true;
                }
            }
            if (!arg0) {
                method1252(true, (byte[]) null, true);
            }
            return arg2 ? class45.method286(-65, arg1) : arg1;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (~arg0 == -1) {
            super.field2059 = ~arg1.method1407(118) == -2;
        }
        ++field2768;
        if (arg2 != 20630) {
            method1254(false, 18);
        }
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)V")
    public static void method1253(int arg0) {
        field2769 = null;
        field2773 = null;
        field2776 = null;
        field2770 = null;
        if (arg0 != 8847) {
            field2776 = null;
        }
        field2767 = null;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field2765;
        if (arg1 != 255) {
            return null;
        } else {
            int[] var3 = super.field2069.method425(true, arg0);
            if (super.field2069.field820) {
                for (int var4 = 0; class104.field1411 > var4; ++var4) {
                    this.method1255(arg0, var4, (byte) -50);
                    int[] var5 = this.method934(-18877, 0, class215.field3000);
                    var3[var4] = var5[class273.field4013];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)V")
    public static final void method1254(boolean arg0, int arg1) {
        ++field2766;
        byte[][] var2 = class282.field4278;
        byte var3 = 4;
        int[] var4 = null;
        if (arg1 != 3) {
            method1253(-16);
        }
        for (int var5 = 0; ~var5 > ~var3; ++var5) {
            class6.method32(83);
            for (int var6 = 0; var6 < 13; ++var6) {
                for (int var7 = 0; ~var7 > -14; ++var7) {
                    boolean var8 = false;
                    int var9 = class124.field1791[var5][var6][var7];
                    if (~var9 != 0) {
                        int var10 = 3 & var9 >> 24;
                        if (!arg0 || ~var10 == -1) {
                            int var11 = (var9 & 7) >> 1;
                            int var12 = var9 >> 14 & 1023;
                            int var13 = (16376 & var9) >> 3;
                            int var14 = (var12 / 8 << 8) - -(var13 / 8);
                            for (int var15 = 0; var15 < class190.field2739.length; ++var15) {
                                if (class190.field2739[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class296.method1972(var13, var10, var11, var6 * 8, (byte) 73, class127.field1825, var2[var15], arg0, var5, var7 * 8, var12);
                                    var8 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class240.method1562(var7 * 8, var5, var6 * 8, 8, false, 8);
                    }
                }
            }
        }
        if (var4 != null) {
            class94.field1257 = var4[1];
            class167.field2397 = var4[0];
            class261.field3795 = var4[4];
            class28.field333 = var4[2];
            class214.field2985 = var4[3];
        } else {
            class167.field2397 = -1;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field2777;
        int[][] var3 = super.field2053.method1542(120, arg1);
        if (arg0 != 5) {
            return null;
        } else {
            if (super.field2053.field3408) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class104.field1411 < ~var7; ++var7) {
                    this.method1255(arg1, var7, (byte) -50);
                    int[][] var8 = this.method927(class215.field3000, true, 0);
                    var4[var7] = var8[0][class273.field4013];
                    var5[var7] = var8[1][class273.field4013];
                    var6[var7] = var8[2][class273.field4013];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)V")
    private final void method1255(int arg0, int arg1, byte arg2) {
        ++field2774;
        if (arg2 != -50) {
            field2773 = null;
        }
        int var4 = class87.field1178[arg1];
        int var5 = class143.field2045[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class215.field3000 = arg0;
            class273.field4013 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class215.field3000 = arg1;
            class273.field4013 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class215.field3000 = arg1;
            class273.field4013 = -arg0 + class104.field1411;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class273.field4013 = arg1;
            class215.field3000 = -arg0 + class257.field3727;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class215.field3000 = -arg0 + class257.field3727;
            class273.field4013 = -arg1 + class104.field1411;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class273.field4013 = -arg0 + class104.field1411;
            class215.field3000 = -arg1 + class257.field3727;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class215.field3000 = -arg1 + class257.field3727;
            class273.field4013 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class215.field3000 = arg0;
            class273.field4013 = class104.field1411 - arg1;
        }
        class273.field4013 &= class112.field1487;
        class215.field3000 &= class166.field2391;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lab;Z)V")
    public static final void method1256(class133 arg0, boolean arg1) {
        class205.field2914.method1522(arg0, 113);
        while (true) {
            class133 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class133[][] var7;
            class133 var66;
            do {
                class133 var65;
                do {
                    class133 var64;
                    do {
                        class133 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class133) class205.field2914.method1526(16383);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1923);
                                            var3 = var2.field1937;
                                            var4 = var2.field1924;
                                            var5 = var2.field1938;
                                            var6 = var2.field1915;
                                            var7 = class6.field94[var5];
                                            if (!var2.field1926) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class133 var8 = class6.field94[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1923) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class139.field2025 && var3 > class255.field3674) {
                                                    class133 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1923 && (var9.field1926 || (var2.field1919 & 1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class139.field2025 && var3 < class290.field4543 - 1) {
                                                    class133 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1923 && (var10.field1926 || (var2.field1919 & 4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class178.field2538 && var4 > class68.field797) {
                                                    class133 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1923 && (var11.field1926 || (var2.field1919 & 8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class178.field2538 && var4 < class203.field2882 - 1) {
                                                    class133 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1923 && (var12.field1926 || (var2.field1919 & 2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1926 = false;
                                            if (var2.field1936 != null) {
                                                class133 var13 = var2.field1936;
                                                if (var13.field1918 != null) {
                                                    if (!class152.method996(0, var3, var4)) {
                                                        class247.method1594(var13.field1918, 0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, false);
                                                    } else {
                                                        class247.method1594(var13.field1918, 0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, true);
                                                    }
                                                } else if (var13.field1914 != null) {
                                                    if (!class152.method996(0, var3, var4)) {
                                                        class176.method1138(var13.field1914, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, false);
                                                    } else {
                                                        class176.method1138(var13.field1914, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, true);
                                                    }
                                                }
                                                class118 var14 = var13.field1927;
                                                if (var14 != null) {
                                                    var14.field1672.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var14.field1670 - class77.field927, var14.field1673 - class130.field1878, var14.field1661 - class296.field4671, var14.field1662, var5, (class162) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1934; ++var15) {
                                                    class243 var16 = var13.field1930[var15];
                                                    if (var16 != null) {
                                                        var16.field3526.method235(var16.field3543, class238.field3433, class152.field2206, class99.field1327, class64.field746, var16.field3538 - class77.field927, var16.field3530 - class130.field1878, var16.field3542 - class296.field4671, var16.field3539, var5, (class162) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1918 != null) {
                                                if (!class152.method996(var6, var3, var4)) {
                                                    var17 = true;
                                                    if (var2.field1918.field3567 != 12345678 || class272.field3987 && var5 <= class107.field1447) {
                                                        class247.method1594(var2.field1918, var6, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, false);
                                                    }
                                                } else {
                                                    class247.method1594(var2.field1918, var6, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, true);
                                                }
                                            } else if (var2.field1914 != null) {
                                                if (!class152.method996(var6, var3, var4)) {
                                                    var17 = true;
                                                    class176.method1138(var2.field1914, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, false);
                                                } else {
                                                    class176.method1138(var2.field1914, class238.field3433, class152.field2206, class99.field1327, class64.field746, var3, var4, true);
                                                }
                                            }
                                            if (var17) {
                                                class50 var18 = var2.field1917;
                                                if (var18 != null && (var18.field575 & 2147483648L) != 0L) {
                                                    var18.field568.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var18.field570 - class77.field927, var18.field576 - class130.field1878, var18.field574 - class296.field4671, var18.field575, var5, (class162) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class118 var21 = var2.field1927;
                                            class163 var22 = var2.field1920;
                                            if (var21 != null || var22 != null) {
                                                if (class139.field2025 == var3) {
                                                    ++var19;
                                                } else if (class139.field2025 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class178.field2538 == var4) {
                                                    var19 += 3;
                                                } else if (class178.field2538 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class68.field802[var19];
                                                var2.field1922 = class127.field1828[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field1664 & class6.field87[var19]) != 0) {
                                                    if (var21.field1664 == 16) {
                                                        var2.field1913 = 3;
                                                        var2.field1932 = class170.field2444[var19];
                                                        var2.field1916 = 3 - var2.field1932;
                                                    } else if (var21.field1664 == 32) {
                                                        var2.field1913 = 6;
                                                        var2.field1932 = class67.field791[var19];
                                                        var2.field1916 = 6 - var2.field1932;
                                                    } else if (var21.field1664 == 64) {
                                                        var2.field1913 = 12;
                                                        var2.field1932 = class80.field949[var19];
                                                        var2.field1916 = 12 - var2.field1932;
                                                    } else {
                                                        var2.field1913 = 9;
                                                        var2.field1932 = class180.field2559[var19];
                                                        var2.field1916 = 9 - var2.field1932;
                                                    }
                                                } else {
                                                    var2.field1913 = 0;
                                                }
                                                if ((var21.field1664 & var20) != 0 && !class139.method905(var6, var3, var4, var21.field1664)) {
                                                    var21.field1672.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var21.field1670 - class77.field927, var21.field1673 - class130.field1878, var21.field1661 - class296.field4671, var21.field1662, var5, (class162) null);
                                                }
                                                if ((var21.field1677 & var20) != 0 && !class139.method905(var6, var3, var4, var21.field1677)) {
                                                    var21.field1659.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var21.field1670 - class77.field927, var21.field1673 - class130.field1878, var21.field1661 - class296.field4671, var21.field1662, var5, (class162) null);
                                                }
                                            }
                                            if (var22 != null && !class279.method1829(var6, var3, var4, var22.field2335.method227())) {
                                                if ((var22.field2328 & var20) != 0) {
                                                    var22.field2335.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var22.field2337 - class77.field927 + var22.field2333, var22.field2336 - class130.field1878, var22.field2331 - class296.field4671 + var22.field2339, var22.field2347, var5, (class162) null);
                                                } else if (var22.field2328 == 256) {
                                                    int var23 = var22.field2337 - class77.field927;
                                                    int var24 = var22.field2336 - class130.field1878;
                                                    int var25 = var22.field2331 - class296.field4671;
                                                    int var26 = var22.field2329;
                                                    int var27;
                                                    if (var26 != 1 && var26 != 2) {
                                                        var27 = var23;
                                                    } else {
                                                        var27 = -var23;
                                                    }
                                                    int var28;
                                                    if (var26 != 2 && var26 != 3) {
                                                        var28 = var25;
                                                    } else {
                                                        var28 = -var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2335.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var22.field2333 + var23, var24, var22.field2339 + var25, var22.field2347, var5, (class162) null);
                                                    } else if (var22.field2334 != null) {
                                                        var22.field2334.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var23, var24, var25, var22.field2347, var5, (class162) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class50 var29 = var2.field1917;
                                                if (var29 != null && (var29.field575 & 2147483648L) == 0L) {
                                                    var29.field568.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var29.field570 - class77.field927, var29.field576 - class130.field1878, var29.field574 - class296.field4671, var29.field575, var5, (class162) null);
                                                }
                                                class157 var30 = var2.field1935;
                                                if (var30 != null && var30.field2269 == 0) {
                                                    if (var30.field2264 != null) {
                                                        var30.field2264.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var30.field2270 - class77.field927, var30.field2268 - class130.field1878, var30.field2266 - class296.field4671, var30.field2263, var5, (class162) null);
                                                    }
                                                    if (var30.field2271 != null) {
                                                        var30.field2271.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var30.field2270 - class77.field927, var30.field2268 - class130.field1878, var30.field2266 - class296.field4671, var30.field2263, var5, (class162) null);
                                                    }
                                                    if (var30.field2262 != null) {
                                                        var30.field2262.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var30.field2270 - class77.field927, var30.field2268 - class130.field1878, var30.field2266 - class296.field4671, var30.field2263, var5, (class162) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1919;
                                            if (var31 != 0) {
                                                if (var3 < class139.field2025 && (var31 & 4) != 0) {
                                                    class133 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1923) {
                                                        class205.field2914.method1522(var32, 114);
                                                    }
                                                }
                                                if (var4 < class178.field2538 && (var31 & 2) != 0) {
                                                    class133 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1923) {
                                                        class205.field2914.method1522(var33, -124);
                                                    }
                                                }
                                                if (var3 > class139.field2025 && (var31 & 1) != 0) {
                                                    class133 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1923) {
                                                        class205.field2914.method1522(var34, -81);
                                                    }
                                                }
                                                if (var4 > class178.field2538 && (var31 & 8) != 0) {
                                                    class133 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1923) {
                                                        class205.field2914.method1522(var35, -47);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1913 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1934; ++var37) {
                                                if (class158.field2285 != var2.field1930[var37].field3537 && (var2.field1941[var37] & var2.field1913) == var2.field1932) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class118 var38 = var2.field1927;
                                                if (!class139.method905(var6, var3, var4, var38.field1664)) {
                                                    var38.field1672.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var38.field1670 - class77.field927, var38.field1673 - class130.field1878, var38.field1661 - class296.field4671, var38.field1662, var5, (class162) null);
                                                }
                                                var2.field1913 = 0;
                                            }
                                        }
                                        if (!var2.field1931) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1934;
                                            var2.field1931 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; ++var41) {
                                                class243 var42 = var2.field1930[var41];
                                                if (class158.field2285 != var42.field3537) {
                                                    for (int var43 = var42.field3540; var43 <= var42.field3533; ++var43) {
                                                        for (int var44 = var42.field3527; var44 <= var42.field3532; ++var44) {
                                                            class133 var45 = var7[var43][var44];
                                                            if (var45.field1926) {
                                                                var2.field1931 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field1913 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field3540) {
                                                                    ++var46;
                                                                }
                                                                if (var43 < var42.field3533) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field3527) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field3532) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1913) == var2.field1916) {
                                                                    var2.field1931 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class222.field3140[var40++] = var42;
                                                    int var47 = class139.field2025 - var42.field3540;
                                                    int var48 = var42.field3533 - class139.field2025;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class178.field2538 - var42.field3527;
                                                    int var50 = var42.field3532 - class178.field2538;
                                                    if (var50 > var49) {
                                                        var42.field3525 = var47 + var50;
                                                    } else {
                                                        var42.field3525 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; ++var53) {
                                                    class243 var54 = class222.field3140[var53];
                                                    if (class158.field2285 != var54.field3537) {
                                                        if (var54.field3525 > var51) {
                                                            var51 = var54.field3525;
                                                            var52 = var53;
                                                        } else if (var54.field3525 == var51) {
                                                            int var55 = var54.field3538 - class77.field927;
                                                            int var56 = var54.field3542 - class296.field4671;
                                                            int var57 = class222.field3140[var52].field3538 - class77.field927;
                                                            int var58 = class222.field3140[var52].field3542 - class296.field4671;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class243 var59 = class222.field3140[var52];
                                                var59.field3537 = class158.field2285;
                                                if (!class133.method866(var6, var59.field3540, var59.field3533, var59.field3527, var59.field3532, var59.field3526.method227())) {
                                                    var59.field3526.method235(var59.field3543, class238.field3433, class152.field2206, class99.field1327, class64.field746, var59.field3538 - class77.field927, var59.field3530 - class130.field1878, var59.field3542 - class296.field4671, var59.field3539, var5, (class162) null);
                                                }
                                                for (int var60 = var59.field3540; var60 <= var59.field3533; ++var60) {
                                                    for (int var61 = var59.field3527; var61 <= var59.field3532; ++var61) {
                                                        class133 var62 = var7[var60][var61];
                                                        if (var62.field1913 != 0) {
                                                            class205.field2914.method1522(var62, 125);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1923) {
                                                            class205.field2914.method1522(var62, -125);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1931) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field1931 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1923);
                            } while (var2.field1913 != 0);
                            if (var3 > class139.field2025 || var3 <= class255.field3674) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field1923);
                        if (var3 < class139.field2025 || var3 >= class290.field4543 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field1923);
                    if (var4 > class178.field2538 || var4 <= class68.field797) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field1923);
                if (var4 < class178.field2538 || var4 >= class203.field2882 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field1923);
            var2.field1923 = false;
            --class152.field2209;
            class157 var67 = var2.field1935;
            if (var67 != null && var67.field2269 != 0) {
                if (var67.field2264 != null) {
                    var67.field2264.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var67.field2270 - class77.field927, var67.field2268 - class130.field1878 - var67.field2269, var67.field2266 - class296.field4671, var67.field2263, var5, (class162) null);
                }
                if (var67.field2271 != null) {
                    var67.field2271.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var67.field2270 - class77.field927, var67.field2268 - class130.field1878 - var67.field2269, var67.field2266 - class296.field4671, var67.field2263, var5, (class162) null);
                }
                if (var67.field2262 != null) {
                    var67.field2262.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var67.field2270 - class77.field927, var67.field2268 - class130.field1878 - var67.field2269, var67.field2266 - class296.field4671, var67.field2263, var5, (class162) null);
                }
            }
            if (var2.field1922 != 0) {
                class163 var68 = var2.field1920;
                if (var68 != null && !class279.method1829(var6, var3, var4, var68.field2335.method227())) {
                    if ((var68.field2328 & var2.field1922) != 0) {
                        var68.field2335.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var68.field2337 - class77.field927 + var68.field2333, var68.field2336 - class130.field1878, var68.field2331 - class296.field4671 + var68.field2339, var68.field2347, var5, (class162) null);
                    } else if (var68.field2328 == 256) {
                        int var69 = var68.field2337 - class77.field927;
                        int var70 = var68.field2336 - class130.field1878;
                        int var71 = var68.field2331 - class296.field4671;
                        int var72 = var68.field2329;
                        int var73;
                        if (var72 != 1 && var72 != 2) {
                            var73 = var69;
                        } else {
                            var73 = -var69;
                        }
                        int var74;
                        if (var72 != 2 && var72 != 3) {
                            var74 = var71;
                        } else {
                            var74 = -var71;
                        }
                        if (var74 >= var73) {
                            var68.field2335.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var68.field2333 + var69, var70, var68.field2339 + var71, var68.field2347, var5, (class162) null);
                        } else if (var68.field2334 != null) {
                            var68.field2334.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var69, var70, var71, var68.field2347, var5, (class162) null);
                        }
                    }
                }
                class118 var75 = var2.field1927;
                if (var75 != null) {
                    if ((var75.field1677 & var2.field1922) != 0 && !class139.method905(var6, var3, var4, var75.field1677)) {
                        var75.field1659.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var75.field1670 - class77.field927, var75.field1673 - class130.field1878, var75.field1661 - class296.field4671, var75.field1662, var5, (class162) null);
                    }
                    if ((var75.field1664 & var2.field1922) != 0 && !class139.method905(var6, var3, var4, var75.field1664)) {
                        var75.field1672.method235(0, class238.field3433, class152.field2206, class99.field1327, class64.field746, var75.field1670 - class77.field927, var75.field1673 - class130.field1878, var75.field1661 - class296.field4671, var75.field1662, var5, (class162) null);
                    }
                }
            }
            if (var5 < class202.field2868 - 1) {
                class133 var76 = class6.field94[var5 + 1][var3][var4];
                if (var76 != null && var76.field1923) {
                    class205.field2914.method1522(var76, -128);
                }
            }
            if (var3 < class139.field2025) {
                class133 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field1923) {
                    class205.field2914.method1522(var77, -18);
                }
            }
            if (var4 < class178.field2538) {
                class133 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field1923) {
                    class205.field2914.method1522(var78, -117);
                }
            }
            if (var3 > class139.field2025) {
                class133 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field1923) {
                    class205.field2914.method1522(var79, -41);
                }
            }
            if (var4 > class178.field2538) {
                class133 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field1923) {
                    class205.field2914.method1522(var80, -76);
                }
            }
        }
    }
}
