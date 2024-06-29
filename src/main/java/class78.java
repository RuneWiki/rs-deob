import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class78 extends class139 {

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "[S")
    private short[] field951 = new short[257];

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    private int field955 = 0;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "Lku;")
    public static class232 field964 = new class232(8);

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field966 = 10;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "Lb;")
    public static class201 field963;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "[I")
    private int[] field953;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "[I")
    private int[] field954;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "[[I")
    private int[][] field961;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field952;
        int[] var3 = super.field1844.method2176(arg0, arg1 + -27782);
        if (arg1 != 27782) {
            return null;
        } else {
            if (super.field1844.field5045) {
                int[] var4 = this.method879((byte) -29, arg0, 0);
                for (int var5 = 0; class356.field5147 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field951[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
    public static final void method448(boolean arg0) {
        ++field960;
        if (class467.field6588 > 1) {
            --class467.field6588;
            class304.field4327 = class27.field367;
        }
        if (~class146.field2155 < -1) {
            --class146.field2155;
        }
        if (class249.field3685) {
            class249.field3685 = false;
            class24.method172(40);
        } else {
            if (!class19.field260) {
                class351.method2190((byte) 26);
            }
            for (int var1 = 0; ~var1 > -101 && class248.method1551(2); ++var1) {
            }
            if (class363.field5227 == 30) {
                class244.method1534(-21381, class164.field2423.method454((byte) -68), class225.field3415);
                if (class40.field533 != null) {
                    if (~class40.field533.field4286 != 0) {
                        class15.method110(class387.field5501, -128);
                        class225.field3415.method1711(!arg0, class40.field533.field4286);
                        class40.field533 = null;
                        class281.field4137 = 30000L + class433.method2562(-2039);
                    }
                } else if (class281.field4137 <= class433.method2562(-2039)) {
                    class40.field533 = class403.field5689.method1505((byte) -119, class262.field3840);
                }
                if (class419.field5854 != null || ~(class433.method2562(-2039) - 2000L) < ~class338.field4917) {
                    boolean var2 = false;
                    int var3 = class225.field3415.field4021;
                    for (class421 var4 = (class421) class104.field1329.method2843(1123227612); var4 != null && ~(class225.field3415.field4021 - var3) > -241; var4 = (class421) class104.field1329.method2842(1673506446)) {
                        var4.method1510((byte) -13);
                        int var5 = var4.method2159(-92);
                        if (~var5 <= -1) {
                            if (~var5 < -65535) {
                                var5 = 65534;
                            }
                        } else {
                            var5 = 0;
                        }
                        int var6 = var4.method2162(true);
                        if (var6 >= 0) {
                            if (var6 > 65534) {
                                var6 = 65534;
                            }
                        } else {
                            var6 = 0;
                        }
                        boolean var7 = false;
                        if (~var4.method2159(-97) == 0 && var4.method2162(true) == -1) {
                            var5 = -1;
                            var7 = true;
                            var6 = -1;
                        }
                        if (~class48.field672 != ~var6 || class330.field4771 != var5) {
                            if (!var2) {
                                ++class235.field3542;
                                class15.method110(class262.field3838, -128);
                                class225.field3415.method1753(true, 0);
                                var3 = class225.field3415.field4021;
                                var2 = true;
                            }
                            int var8 = -class48.field672 + var6;
                            class48.field672 = var6;
                            int var9 = -class330.field4771 + var5;
                            class330.field4771 = var5;
                            int var10 = (int) ((var4.method2164(true) - class338.field4917) / 20L);
                            if (var10 < 8 && ~var8 <= 31 && ~var8 >= -32 && var9 >= -32 && ~var9 >= -32) {
                                var8 += 32;
                                var9 += 32;
                                class225.field3415.method1711(false, (var8 << 6) + (var10 << 12) + var9);
                            } else if (var10 < 32 && var8 >= -128 && ~var8 >= -128 && ~var9 <= 127 && var9 <= 127) {
                                var9 += 128;
                                var8 += 128;
                                class225.field3415.method1753(arg0, var10 + 128);
                                class225.field3415.method1711(false, (var8 << 8) + var9);
                            } else if (var10 < 32) {
                                class225.field3415.method1753(true, 192 - -var10);
                                if (!var7) {
                                    class225.field3415.method1744(var6 | var5 << 16, true);
                                } else {
                                    class225.field3415.method1744(Integer.MIN_VALUE, arg0);
                                }
                            } else {
                                class225.field3415.method1711(!arg0, var10 + 57344);
                                if (var7) {
                                    class225.field3415.method1744(Integer.MIN_VALUE, true);
                                } else {
                                    class225.field3415.method1744(var5 << 16 | var6, arg0);
                                }
                            }
                            class338.field4917 = var4.method2164(true);
                        }
                    }
                    if (var2) {
                        class225.field3415.method1733(-23181, -var3 + class225.field3415.field4021);
                    }
                }
                if (class419.field5854 != null) {
                    long var11 = (class419.field5854.method2164(true) + -class272.field3969) / 50L;
                    class272.field3969 = class419.field5854.method2164(true);
                    if (var11 > 32767L) {
                        var11 = 32767L;
                    }
                    int var13 = class419.field5854.method2159(-101);
                    if (~var13 <= -1) {
                        if (var13 > 65535) {
                            var13 = 65535;
                        }
                    } else {
                        var13 = 0;
                    }
                    int var14 = class419.field5854.method2162(arg0);
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (~var14 < -65536) {
                        var14 = 65535;
                    }
                    byte var15 = 0;
                    if (~class419.field5854.method2157(122) == -3) {
                        var15 = 1;
                    }
                    ++class266.field3892;
                    class15.method110(class157.field2333, -126);
                    int var16 = (int) var11;
                    class225.field3415.method1711(!arg0, var15 << 15 | var16);
                    class225.field3415.method1752(var13 << 16 | var14, 25580);
                }
                if (class370.field5340 > 0) {
                    int var17 = 0;
                    for (int var18 = 0; ~var18 > ~class370.field5340; ++var18) {
                        if (class153.field2265[var18].method365(0)) {
                            ++var17;
                        }
                    }
                    if (var17 > 0) {
                        if (var17 > 75) {
                            var17 = 75;
                        }
                        class15.method110(class479.field6713, -128);
                        ++class325.field4686;
                        class225.field3415.method1753(true, var17 * 3);
                        for (int var19 = 0; ~class370.field5340 < ~var19; ++var19) {
                            class59 var20 = class153.field2265[var19];
                            if (var20.method365(0)) {
                                long var21 = (var20.method371((byte) -40) - class191.field2844) / 50L;
                                if (var21 > 65535L) {
                                    var21 = 65535L;
                                }
                                class191.field2844 = var20.method371((byte) -78);
                                class225.field3415.method1753(true, var20.method368((byte) -123));
                                class225.field3415.method1711(false, (int) var21);
                            }
                        }
                    }
                }
                if (class1.field3 > 0) {
                    --class1.field3;
                }
                if (class132.field1732 && ~class1.field3 >= -1) {
                    ++class353.field5096;
                    class1.field3 = 20;
                    class132.field1732 = false;
                    class15.method110(class392.field5563, -127);
                    class225.field3415.method1689((int) class157.field2346 >> 3, (byte) 125);
                    class225.field3415.method1694((int) class483.field6806 >> 3, 125);
                }
                if (class452.field6301 && !class418.field5833) {
                    class418.field5833 = true;
                    ++class258.field3781;
                    class15.method110(class312.field4417, -128);
                    class225.field3415.method1753(true, 1);
                }
                if (!class452.field6301 && class418.field5833) {
                    ++class258.field3781;
                    class418.field5833 = false;
                    class15.method110(class312.field4417, -125);
                    class225.field3415.method1753(true, 0);
                }
                if (!class160.field2370) {
                    class15.method110(class104.field1322, -125);
                    ++class77.field948;
                    class225.field3415.method1753(true, 0);
                    int var23 = class225.field3415.field4021;
                    class276 var24 = class314.field4438.method1173(1);
                    class225.field3415.method1704((byte) -48, var24.field4064, 0, var24.field4021);
                    class225.field3415.method1733(-23181, class225.field3415.field4021 - var23);
                    class160.field2370 = true;
                }
                if (class330.field4786 != null) {
                    if (class136.field1807 != 2) {
                        if (class136.field1807 == 3) {
                            class434.method2564(3);
                        }
                    } else {
                        class160.method995(1000);
                    }
                }
                if (class258.field3770) {
                    class258.field3770 = false;
                } else {
                    class111.field1413 /= 2.0F;
                }
                if (!class304.field4318) {
                    class342.field4991 /= 2.0F;
                } else {
                    class304.field4318 = false;
                }
                class413.method2441(4);
                if (~class363.field5227 == -31) {
                    class105.method594(0);
                    class265.method1631(-1);
                    class255.method1585(arg0);
                    class260.method1617(12702);
                    ++class7.field65;
                    if (~class7.field65 < -751) {
                        class24.method172(40);
                    } else {
                        class389.method2342(-27511);
                        class370.method2275(73);
                        class271.method1669(0);
                        for (int var25 = class140.field1859.method2695(true, true); ~var25 != 0; var25 = class140.field1859.method2695(false, true)) {
                            class23.method163(-98, var25);
                            class272.field3967[class367.method2256(class368.field5318++, 31)] = var25;
                        }
                        for (class489 var26 = class377.method2294(-30650); var26 != null; var26 = class377.method2294(-30650)) {
                            int var27 = var26.method2864(false);
                            int var28 = var26.method2866(255);
                            if (~var27 != -2) {
                                if (var27 == 2) {
                                    class339.field4954[var28] = var26.field6893;
                                    class289.field4209[class367.method2256(class398.field5647++, 31)] = var28;
                                } else if (~var27 != -4) {
                                    if (var27 != 4) {
                                        if (var27 == 5) {
                                            class145 var29 = class166.method1028(var28, 103);
                                            if (var26.field6895 != var29.field1967 || var26.field6895 == -1) {
                                                var29.field2011 = 0;
                                                var29.field2052 = 1;
                                                var29.field1967 = var26.field6895;
                                                var29.field1990 = 0;
                                                class22.method148((byte) -78, var29);
                                            }
                                        } else if (var27 != 6) {
                                            if (~var27 != -8) {
                                                if (~var27 != -9) {
                                                    if (var27 != 9) {
                                                        if (~var27 == -11) {
                                                            class145 var30 = class166.method1028(var28, 112);
                                                            if (~var26.field6895 != ~var30.field2028 || ~var26.field6892 != ~var30.field1975 || var26.field6890 != var30.field1954) {
                                                                var30.field1975 = var26.field6892;
                                                                var30.field1954 = var26.field6890;
                                                                var30.field2028 = var26.field6895;
                                                                class22.method148((byte) -78, var30);
                                                            }
                                                        } else if (~var27 == -12) {
                                                            class145 var31 = class166.method1028(var28, 81);
                                                            var31.field2007 = 0;
                                                            var31.field1971 = var31.field1978 = var26.field6895;
                                                            var31.field2041 = var31.field1985 = var26.field6892;
                                                            var31.field2067 = 0;
                                                            class22.method148((byte) -78, var31);
                                                        } else if (~var27 == -13) {
                                                            class145 var32 = class166.method1028(var28, 79);
                                                            int var33 = var26.field6895;
                                                            if (var32 != null && var32.field2073 == 0) {
                                                                if (-var32.field2021 + var32.field1993 < var33) {
                                                                    var33 = -var32.field2021 + var32.field1993;
                                                                }
                                                                if (~var33 > -1) {
                                                                    var33 = 0;
                                                                }
                                                                if (~var32.field1938 != ~var33) {
                                                                    var32.field1938 = var33;
                                                                    class22.method148((byte) -78, var32);
                                                                }
                                                            }
                                                        } else if (~var27 != -15) {
                                                            if (var27 != 15) {
                                                                if (var27 == 16) {
                                                                    class145 var34 = class166.method1028(var28, 78);
                                                                    var34.field1956 = var26.field6895;
                                                                }
                                                            } else {
                                                                class118.field1493 = var26.field6895;
                                                                class326.field4710 = true;
                                                                class359.field5161 = var26.field6892;
                                                            }
                                                        } else {
                                                            class145 var35 = class166.method1028(var28, 91);
                                                            var35.field1974 = var26.field6895;
                                                        }
                                                    } else {
                                                        class145 var36 = class166.method1028(var28, 74);
                                                        if (~var26.field6895 != ~var36.field2016 || var26.field6892 != var36.field1948) {
                                                            var36.field2016 = var26.field6895;
                                                            var36.field1948 = var26.field6892;
                                                            class22.method148((byte) -78, var36);
                                                        }
                                                    }
                                                } else {
                                                    class145 var37 = class166.method1028(var28, 95);
                                                    if (var26.field6895 != var37.field2053 || ~var26.field6892 != ~var37.field1994 || var26.field6890 != var37.field2020) {
                                                        var37.field1994 = var26.field6892;
                                                        var37.field2053 = var26.field6895;
                                                        var37.field2020 = var26.field6890;
                                                        if (~var37.field2016 != 0) {
                                                            if (var37.field1984 > 0) {
                                                                var37.field2020 = var37.field2020 * 32 / var37.field1984;
                                                            } else if (~var37.field2000 < -1) {
                                                                var37.field2020 = var37.field2020 * 32 / var37.field2000;
                                                            }
                                                        }
                                                        class22.method148((byte) -78, var37);
                                                    }
                                                }
                                            } else {
                                                class145 var38 = class166.method1028(var28, 81);
                                                boolean var39 = ~var26.field6895 == -2;
                                                if (!var38.field1963 != !var39) {
                                                    var38.field1963 = var39;
                                                    class22.method148((byte) -78, var38);
                                                }
                                            }
                                        } else {
                                            int var40 = var26.field6895;
                                            int var41 = 31 & var40 >> 10;
                                            int var42 = (1011 & var40) >> 5;
                                            int var43 = var40 & 31;
                                            int var44 = (var41 << 19) + (var43 << 3) - -(var42 << 11);
                                            class145 var45 = class166.method1028(var28, 124);
                                            if (var45.field2001 != var44) {
                                                var45.field2001 = var44;
                                                class22.method148((byte) -78, var45);
                                            }
                                        }
                                    } else {
                                        class145 var46 = class166.method1028(var28, 106);
                                        int var47 = var26.field6895;
                                        int var48 = var26.field6892;
                                        int var49 = var26.field6890;
                                        if (~var46.field2061 != ~var47 || var46.field1959 != var48 || ~var46.field2013 != ~var49) {
                                            var46.field1959 = var48;
                                            var46.field2013 = var49;
                                            var46.field2061 = var47;
                                            class22.method148((byte) -78, var46);
                                        }
                                    }
                                } else {
                                    class145 var50 = class166.method1028(var28, 93);
                                    if (!var26.field6893.equals(var50.field2035)) {
                                        var50.field2035 = var26.field6893;
                                        class22.method148((byte) -78, var50);
                                    }
                                }
                            } else {
                                class156.field2320[var28] = var26.field6895;
                                class29.field391 |= class146.field2102[var28];
                                class332.field4821[class367.method2256(31, class204.field3044++)] = var28;
                            }
                        }
                        ++class332.field4840;
                        if (class202.field2967 != 0) {
                            class76.field938 += 20;
                            if (~class76.field938 <= -401) {
                                class202.field2967 = 0;
                            }
                        }
                        if (class291.field4240 != null) {
                            ++class87.field1061;
                            if (~class87.field1061 <= -16) {
                                class22.method148((byte) -78, class291.field4240);
                                class291.field4240 = null;
                            }
                        }
                        class307.field4372 = null;
                        class490.field6899 = false;
                        class68.field860 = false;
                        class53.field721 = null;
                        class132.method831(-1, (class145) null, 1073741824, -1);
                        class304.method1883(90, (class145) null, -1, -1);
                        class69.method413(104);
                        ++class27.field367;
                        if (class466.field6530) {
                            ++class197.field2871;
                            class15.method110(class441.field6116, -126);
                            class225.field3415.method1720(class356.field5150 << 14 | class303.field4315 << 28 | class111.field1399, (byte) -8);
                            class466.field6530 = false;
                        }
                        while (true) {
                            class202 var51;
                            class145 var52;
                            class145 var53;
                            do {
                                var51 = (class202) class408.field5717.method2839(-31216);
                                if (var51 == null) {
                                    while (true) {
                                        class202 var54;
                                        class145 var55;
                                        class145 var56;
                                        do {
                                            var54 = (class202) class23.field298.method2839(-31216);
                                            if (var54 == null) {
                                                while (true) {
                                                    class202 var57;
                                                    class145 var58;
                                                    class145 var59;
                                                    do {
                                                        var57 = (class202) class157.field2349.method2839(-31216);
                                                        if (var57 == null) {
                                                            if (class307.field4372 == null) {
                                                                class81.field990 = 0;
                                                            }
                                                            if (class250.field3695 != null) {
                                                                class55.method345((byte) -128);
                                                            }
                                                            if (class362.field5213 > 0 && class272.field3959.method2712(2, 82) && class272.field3959.method2712(2, 81) && ~class166.field2437 != -1) {
                                                                int var60 = -class166.field2437 + class492.field6935.field4319;
                                                                if (~var60 <= -1) {
                                                                    if (var60 > 3) {
                                                                        var60 = 3;
                                                                    }
                                                                } else {
                                                                    var60 = 0;
                                                                }
                                                                class382.method2308(var60, class240.field3602 - -class492.field6935.field2163[0], class492.field6935.field2159[0] + class360.field5180, -101);
                                                            }
                                                            class469.method2759(-121);
                                                            for (int var61 = 0; var61 < 5; ++var61) {
                                                                int var10002 = class422.field5885[var61]++;
                                                            }
                                                            if (class29.field391 && ~class266.field3893 > ~(-60000L + class433.method2562(-2039))) {
                                                                class48.method317((byte) -126);
                                                            }
                                                            ++class146.field2078;
                                                            if (~class146.field2078 < -501) {
                                                                class146.field2078 = 0;
                                                                int var62 = (int) (Math.random() * 8.0D);
                                                                if ((var62 & 1) == 1) {
                                                                    class141.field1875 += class58.field776;
                                                                }
                                                                if ((2 & var62) == 2) {
                                                                    class396.field5645 += class209.field3181;
                                                                }
                                                                if ((4 & var62) == 4) {
                                                                    class191.field2843 += class385.field5477;
                                                                }
                                                            }
                                                            if (class141.field1875 < -50) {
                                                                class58.field776 = 2;
                                                            }
                                                            if (~class141.field1875 < -51) {
                                                                class58.field776 = -2;
                                                            }
                                                            if (~class396.field5645 > 54) {
                                                                class209.field3181 = 2;
                                                            }
                                                            if (class191.field2843 < -40) {
                                                                class385.field5477 = 1;
                                                            }
                                                            if (class396.field5645 > 55) {
                                                                class209.field3181 = -2;
                                                            }
                                                            ++class387.field5499;
                                                            if (class191.field2843 > 40) {
                                                                class385.field5477 = -1;
                                                            }
                                                            if (class387.field5499 > 500) {
                                                                class387.field5499 = 0;
                                                                int var63 = (int) (8.0D * Math.random());
                                                                if ((2 & var63) == 2) {
                                                                    class216.field3251 += class213.field3214;
                                                                }
                                                                if (~(var63 & 1) == -2) {
                                                                    class84.field1032 += class45.field642;
                                                                }
                                                            }
                                                            if (~class84.field1032 > 59) {
                                                                class45.field642 = 2;
                                                            }
                                                            if (~class216.field3251 > 19) {
                                                                class213.field3214 = 1;
                                                            }
                                                            if (class84.field1032 > 60) {
                                                                class45.field642 = -2;
                                                            }
                                                            if (~class216.field3251 < -11) {
                                                                class213.field3214 = -1;
                                                            }
                                                            ++class95.field1227;
                                                            if (~class95.field1227 < -51) {
                                                                ++class24.field316;
                                                                class15.method110(class116.field1479, -127);
                                                            }
                                                            if (class38.field510) {
                                                                class207.method1356((byte) -36);
                                                                class38.field510 = false;
                                                            }
                                                            try {
                                                                if (class58.field761 != null && ~class225.field3415.field4021 < -1) {
                                                                    class450.field6228 += class225.field3415.field4021;
                                                                    class58.field761.method2125(class225.field3415.field4021, class225.field3415.field4064, (byte) -36, 0);
                                                                    class225.field3415.field4021 = 0;
                                                                    class95.field1227 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var64) {
                                                                class24.method172(40);
                                                                return;
                                                            }
                                                        }
                                                        var58 = var57.field2976;
                                                        if (var58.field1951 < 0) {
                                                            break;
                                                        }
                                                        var59 = class166.method1028(var58.field1947, 77);
                                                    } while (var59 == null || var59.field1943 == null || var59.field1943.length <= var58.field1951 || var59.field1943[var58.field1951] != var58);
                                                    class290.method1818(var57);
                                                }
                                            }
                                            var55 = var54.field2976;
                                            if (var55.field1951 < 0) {
                                                break;
                                            }
                                            var56 = class166.method1028(var55.field1947, 84);
                                        } while (var56 == null || var56.field1943 == null || ~var55.field1951 <= ~var56.field1943.length || var56.field1943[var55.field1951] != var55);
                                        class290.method1818(var54);
                                    }
                                }
                                var52 = var51.field2976;
                                if (var52.field1951 < 0) {
                                    break;
                                }
                                var53 = class166.method1028(var52.field1947, 76);
                            } while (var53 == null || var53.field1943 == null || var52.field1951 >= var53.field1943.length || var53.field1943[var52.field1951] != var52);
                            class290.method1818(var51);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    private final void method449(int arg0) {
        ++field958;
        int var2 = this.field955;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field961.length - 1 > var5 && ~this.field961[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field961[var5 - 1];
                    int[] var7 = this.field961[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class311.field4401[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field951[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field961.length - 1) && this.field961[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field961[var14 + -1];
                    int[] var16 = this.field961[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field951[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var22 = var20 << 4;
                int var23;
                for (var23 = 1; var23 < this.field961.length + -1 && ~this.field961[var23][0] >= ~var22; ++var23) {
                }
                int[] var24 = this.field961[var23 + -1];
                int[] var25 = this.field961[var23];
                int var26 = this.method453(var23 - 2, (byte) 127)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method453(var23 + 1, (byte) 67)[1];
                int var30 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = -var26 + var27 + -var28 + var29;
                int var33 = -var32 + var26 - var27;
                int var34 = var28 - var26;
                int var36 = (var30 * var32 >> 12) * var31 >> 12;
                int var37 = var31 * var33 >> 12;
                int var38 = var30 * var34 >> 12;
                int var39 = var27 + var36 - (-var37 - var38);
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (~var39 <= -32769) {
                    var39 = 32767;
                }
                this.field951[var20] = (short) var39;
            }
        }
        int var21 = 117 / ((arg0 - -51) / 58);
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)V")
    private final void method450(byte arg0) {
        ++field959;
        if (arg0 >= -90) {
            this.method22(92, 47);
        }
        int[] var2 = this.field961[0];
        int[] var3 = this.field961[1];
        int[] var4 = this.field961[this.field961.length + -2];
        int[] var5 = this.field961[this.field961.length + -1];
        this.field954 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[1] + -var3[1] + var2[1] };
        this.field953 = new int[] { -var5[0] - -var4[0] + var4[0], var4[1] - var5[1] - -var4[1] };
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method451(int arg0) {
        field964 = null;
        if (arg0 == 107122191) {
            field963 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            this.field951 = null;
        }
        if (~arg2 == -1) {
            this.field955 = arg0.method1701(-23121);
            this.field961 = new int[arg0.method1701(-23121)][2];
            for (int var4 = 0; ~var4 > ~this.field961.length; ++var4) {
                this.field961[var4][0] = arg0.method1729(65280);
                this.field961[var4][1] = arg0.method1729(65280);
            }
        }
        ++field962;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)Z")
    public static final boolean method452(int arg0, int arg1) {
        ++field956;
        if (class481.field6780[arg0]) {
            return true;
        } else if (!class229.field3449.method1248((byte) 107, arg0)) {
            return false;
        } else {
            int var2 = class229.field3449.method1235(0, arg0);
            if (~var2 == -1) {
                class481.field6780[arg0] = true;
                return true;
            } else {
                if (class112.field1421[arg0] == null) {
                    class112.field1421[arg0] = new class145[var2];
                }
                for (int var3 = 0; var2 > var3; ++var3) {
                    if (class112.field1421[arg0][var3] == null) {
                        byte[] var4 = class229.field3449.method1257(var3, arg0, arg1 + 27750);
                        if (var4 != null) {
                            class145 var5 = class112.field1421[arg0][var3] = new class145();
                            var5.field1933 = (arg0 << 16) - -var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method900(new class276(var4), true);
                        }
                    }
                }
                if (arg1 != -3192) {
                    method448(true);
                }
                class481.field6780[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        ++field957;
        if (this.field961 == null) {
            this.field961 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 == 7) {
            if (this.field961.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field955 == -3) {
                    this.method450((byte) -114);
                }
                class224.method1439(-114);
                this.method449(58);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I")
    private final int[] method453(int arg0, byte arg1) {
        ++field950;
        if (arg1 <= 64) {
            field964 = null;
        }
        if (arg0 < 0) {
            return this.field954;
        } else {
            return ~arg0 <= ~this.field961.length ? this.field953 : this.field961[arg0];
        }
    }
}
