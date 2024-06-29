import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class166 extends class115 {

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Luc;")
    public class220 field2777;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[S")
    public static short[] field2776 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field2780 = -1;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field2781 = 0;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "J")
    public static long field2783;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "[S")
    public static short[] field2775;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class176.field2939 = arg0;
        class173.field2900 = arg2;
        if (arg5 > -95) {
            return;
        }
        class250.field4339 = arg4;
        class134.field2342 = arg3;
        field2779++;
        class252.field4370 = arg1;
        if (class252.field4370 >= 100) {
            int var6 = class134.field2342 * 128 + 64;
            int var7 = class176.field2939 * 128 + 64;
            int var8 = class193.method1227(var6, true, class64.field1171, var7) - class173.field2900;
            int var9 = var6 - class184.field3135;
            int var10 = var7 - class88.field1527;
            int var11 = var8 - class25.field422;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var10 * var10)));
            class103.field1812 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class161.field2724 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class103.field1812 < 128) {
                class103.field1812 = 128;
            }
            if (class103.field1812 > 383) {
                class103.field1812 = 383;
            }
        }
        client.field1447 = 2;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static void method1023(int arg0) {
        field2775 = null;
        if (arg0 == -6101) {
            field2776 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lva;II)V")
    public static final void method1024(class34 arg0, int arg1, int arg2) {
        field2782++;
        Object[] var3 = arg0.field568;
        int var4 = (Integer) var3[0];
        class200 var5 = class193.method1228(var4, arg2 - 2147483523);
        if (var5 == null) {
            return;
        }
        class156.field2680 = 0;
        int var6 = 0;
        int var7 = -1;
        int var8 = 0;
        if (arg2 != 2147483642) {
            field2780 = -11;
        }
        int[] var9 = var5.field3421;
        int[] var10 = var5.field3435;
        byte var11 = -1;
        try {
            class20.field348 = new int[var5.field3427];
            class153.field2657 = new class227[var5.field3428];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field570;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field555;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field583 == null ? -1 : arg0.field583.field1861;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field580;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field583 == null ? -1 : arg0.field583.field1884;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field582 == null ? -1 : arg0.field582.field1861;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field582 == null ? -1 : arg0.field582.field1884;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field569;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field578;
                    }
                    class20.field348[var12++] = var16;
                } else if (var3[var14] instanceof class227) {
                    class227 var15 = (class227) var3[var14];
                    if (var15.method1487(126, class218.field3676)) {
                        var15 = arg0.field562;
                    }
                    class153.field2657[var13++] = var15;
                }
            }
            int var17 = 0;
            label3362: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var440 = var10[var7];
                int var10000;
                if (var440 < 100) {
                    if (var440 == 0) {
                        class191.field3251[var8++] = var9[var7];
                        continue;
                    }
                    if (var440 == 1) {
                        int var18 = var9[var7];
                        class191.field3251[var8++] = class139.field2416[var18];
                        continue;
                    }
                    if (var440 == 2) {
                        int var19 = var9[var7];
                        var8--;
                        class204.method1308(var19, (byte) 45, class191.field3251[var8]);
                        continue;
                    }
                    if (var440 == 3) {
                        class230.field4014[var6++] = var5.field3431[var7];
                        continue;
                    }
                    if (var440 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var440 == 7) {
                        var8 -= 2;
                        if (class191.field3251[var8 + 1] != class191.field3251[var8]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 8) {
                        var8 -= 2;
                        if (class191.field3251[var8 + 1] == class191.field3251[var8]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 9) {
                        var8 -= 2;
                        if (class191.field3251[var8 + 1] > class191.field3251[var8]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 10) {
                        var8 -= 2;
                        if (class191.field3251[var8 + 1] < class191.field3251[var8]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 21) {
                        if (class156.field2680 == 0) {
                            return;
                        }
                        class29 var20 = class11.field221[--class156.field2680];
                        class153.field2657 = var20.field475;
                        class20.field348 = var20.field479;
                        var7 = var20.field463;
                        var5 = var20.field474;
                        var9 = var5.field3421;
                        var10 = var5.field3435;
                        continue;
                    }
                    if (var440 == 25) {
                        int var21 = var9[var7];
                        class191.field3251[var8++] = client.method493(var21, true);
                        continue;
                    }
                    if (var440 == 27) {
                        int var22 = var9[var7];
                        var10000 = arg2 + 2147483559;
                        var8--;
                        class237.method1581(var10000, class191.field3251[var8], var22);
                        continue;
                    }
                    if (var440 == 31) {
                        var8 -= 2;
                        if (class191.field3251[var8] <= class191.field3251[var8 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 32) {
                        var8 -= 2;
                        if (class191.field3251[var8 + 1] <= class191.field3251[var8]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 33) {
                        class191.field3251[var8++] = class20.field348[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var440 == 34) {
                        var10001 = var9[var7];
                        var8--;
                        class20.field348[var10001] = class191.field3251[var8];
                        continue;
                    }
                    if (var440 == 35) {
                        class230.field4014[var6++] = class153.field2657[var9[var7]];
                        continue;
                    }
                    if (var440 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        class153.field2657[var10001] = class230.field4014[var6];
                        continue;
                    }
                    if (var440 == 37) {
                        int var23 = var9[var7];
                        var6 -= var23;
                        class227 var24 = class122.method758(class230.field4014, 0, var23, var6);
                        class230.field4014[var6++] = var24;
                        continue;
                    }
                    if (var440 == 38) {
                        var8--;
                        continue;
                    }
                    if (var440 == 39) {
                        var6--;
                        continue;
                    }
                    if (var440 == 40) {
                        int var25 = var9[var7];
                        class200 var26 = class193.method1228(var25, 113);
                        class227[] var27 = new class227[var26.field3428];
                        int[] var28 = new int[var26.field3427];
                        for (int var29 = 0; var29 < var26.field3440; var29++) {
                            var28[var29] = class191.field3251[var8 + var29 - var26.field3440];
                        }
                        for (int var30 = 0; var30 < var26.field3426; var30++) {
                            var27[var30] = class230.field4014[var6 + var30 - var26.field3426];
                        }
                        var8 -= var26.field3440;
                        var6 -= var26.field3426;
                        class29 var31 = new class29();
                        var31.field475 = class153.field2657;
                        var31.field474 = var5;
                        var31.field463 = var7;
                        var31.field479 = class20.field348;
                        if (class11.field221.length <= class156.field2680) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class11.field221[class156.field2680++] = var31;
                        var7 = -1;
                        class20.field348 = var28;
                        class153.field2657 = var27;
                        var9 = var26.field3421;
                        var10 = var26.field3435;
                        continue;
                    }
                    if (var440 == 42) {
                        class191.field3251[var8++] = class42.field692[var9[var7]];
                        continue;
                    }
                    if (var440 == 43) {
                        int var32 = var9[var7];
                        var8--;
                        class42.field692[var32] = class191.field3251[var8];
                        class229.method1548(1, var32);
                        continue;
                    }
                    if (var440 == 44) {
                        int var33 = var9[var7] >> 16;
                        int var34 = var9[var7] & 0xFFFF;
                        var8--;
                        int var35 = class191.field3251[var8];
                        if (var35 >= 0 && var35 <= 5000) {
                            class56.field1018[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3362;
                                }
                                class143.field2470[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 45) {
                        int var38 = var9[var7];
                        var8--;
                        int var39 = class191.field3251[var8];
                        if (var39 >= 0 && var39 < class56.field1018[var38]) {
                            class191.field3251[var8++] = class143.field2470[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 46) {
                        int var40 = var9[var7];
                        var8 -= 2;
                        int var41 = class191.field3251[var8];
                        if (var41 >= 0 && var41 < class56.field1018[var40]) {
                            class143.field2470[var40][var41] = class191.field3251[var8 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 47) {
                        class227 var42 = class149.field2604[var9[var7]];
                        if (var42 == null) {
                            var42 = class57.field1032;
                        }
                        class230.field4014[var6++] = var42;
                        continue;
                    }
                    if (var440 == 48) {
                        int var43 = var9[var7];
                        var6--;
                        class149.field2604[var43] = class230.field4014[var6];
                        class133.method814(var43, (byte) -26);
                        continue;
                    }
                    if (var440 == 51) {
                        class201 var44 = var5.field3424[var9[var7]];
                        var8--;
                        class216 var45 = (class216) var44.method1298(-105, (long) class191.field3251[var8]);
                        if (var45 != null) {
                            var7 += var45.field3637;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var440 < 300) {
                    if (var440 == 100) {
                        var8 -= 3;
                        int var418 = class191.field3251[var8];
                        int var419 = class191.field3251[var8 + 1];
                        int var420 = class191.field3251[var8 + 2];
                        if (var419 == 0) {
                            throw new RuntimeException();
                        }
                        class105 var421 = class27.method137(var418, arg2 ^ 0xB8E45CCA);
                        if (var421.field1956 == null) {
                            var421.field1956 = new class105[var420 + 1];
                        }
                        if (var421.field1956.length <= var420) {
                            class105[] var422 = new class105[var420 + 1];
                            for (int var423 = 0; var423 < var421.field1956.length; var423++) {
                                var422[var423] = var421.field1956[var423];
                            }
                            var421.field1956 = var422;
                        }
                        if (var420 > 0 && var421.field1956[var420 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var420 - 1));
                        }
                        class105 var424 = new class105();
                        var424.field1829 = var419;
                        var424.field1968 = var424.field1861 = var421.field1861;
                        var424.field1853 = true;
                        var424.field1884 = var420;
                        var421.field1956[var420] = var424;
                        if (var46) {
                            class99.field1738 = var424;
                        } else {
                            class178.field2988 = var424;
                        }
                        class198.method1268(113, var421);
                        continue;
                    }
                    if (var440 == 101) {
                        class105 var425 = var46 ? class99.field1738 : class178.field2988;
                        if (var425.field1884 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class105 var426 = class27.method137(var425.field1861, -954490064);
                        var426.field1956[var425.field1884] = null;
                        class198.method1268(arg2 ^ 0x7FFFFF95, var426);
                        continue;
                    }
                    if (var440 == 102) {
                        var8--;
                        class105 var427 = class27.method137(class191.field3251[var8], -954490064);
                        var427.field1956 = null;
                        class198.method1268(arg2 ^ 0x7FFFFFA2, var427);
                        continue;
                    }
                    if (var440 == 200) {
                        var8 -= 2;
                        int var428 = class191.field3251[var8];
                        int var429 = class191.field3251[var8 + 1];
                        class105 var430 = class255.method1738(var428, (byte) -63, var429);
                        if (var430 != null && var429 != -1) {
                            class191.field3251[var8++] = 1;
                            if (var46) {
                                class99.field1738 = var430;
                            } else {
                                class178.field2988 = var430;
                            }
                            continue;
                        }
                        class191.field3251[var8++] = 0;
                        continue;
                    }
                    if (var440 == 201) {
                        var8--;
                        int var431 = class191.field3251[var8];
                        class105 var432 = class27.method137(var431, -954490064);
                        if (var432 == null) {
                            class191.field3251[var8++] = 0;
                        } else {
                            class191.field3251[var8++] = 1;
                            if (var46) {
                                class99.field1738 = var432;
                            } else {
                                class178.field2988 = var432;
                            }
                        }
                        continue;
                    }
                } else if (var440 < 500) {
                    if (var440 == 403) {
                        var8 -= 2;
                        int var413 = class191.field3251[var8 + 1];
                        int var414 = class191.field3251[var8];
                        if (var414 >= 7) {
                            var414 -= 7;
                        }
                        class216.field3639.field3820.method332(var414, 99, var413);
                        continue;
                    }
                    if (var440 == 404) {
                        var8 -= 2;
                        int var415 = class191.field3251[var8];
                        int var416 = class191.field3251[var8 + 1];
                        class216.field3639.field3820.method333(var415, var416, 28545);
                        continue;
                    }
                    if (var440 == 410) {
                        var8--;
                        boolean var417 = class191.field3251[var8] != 0;
                        class216.field3639.field3820.method339(var417, -127);
                        continue;
                    }
                } else if (!(var440 < 1000 || var440 >= 1100) || !(var440 < 2000 || var440 >= 2100)) {
                    class105 var407;
                    if (var440 < 2000) {
                        var407 = var46 ? class99.field1738 : class178.field2988;
                    } else {
                        var8--;
                        var407 = class27.method137(class191.field3251[var8], arg2 + 1192993590);
                        var440 -= 1000;
                    }
                    if (var440 == 1000) {
                        var8 -= 4;
                        var407.field1828 = class191.field3251[var8];
                        var407.field1966 = class191.field3251[var8 + 1];
                        int var408 = class191.field3251[var8 + 3];
                        int var409 = class191.field3251[var8 + 2];
                        if (var409 < 0) {
                            var409 = 0;
                        } else if (var409 > 5) {
                            var409 = 5;
                        }
                        if (var408 < 0) {
                            var408 = 0;
                        } else if (var408 > 5) {
                            var408 = 5;
                        }
                        var407.field1876 = (byte) var408;
                        var407.field1900 = (byte) var409;
                        class198.method1268(88, var407);
                        class252.method1680((byte) 75, var407);
                        continue;
                    }
                    if (var440 == 1001) {
                        var8 -= 4;
                        var407.field1943 = class191.field3251[var8];
                        var407.field1945 = class191.field3251[var8 + 1];
                        var407.field1881 = 0;
                        var407.field1947 = 0;
                        int var410 = class191.field3251[var8 + 3];
                        int var411 = class191.field3251[var8 + 2];
                        if (var410 < 0) {
                            var410 = 0;
                        } else if (var410 > 4) {
                            var410 = 4;
                        }
                        if (var411 < 0) {
                            var411 = 0;
                        } else if (var411 > 4) {
                            var411 = 4;
                        }
                        var407.field1938 = (byte) var411;
                        var407.field1852 = (byte) var410;
                        class198.method1268(103, var407);
                        if (var407.field1829 == 0) {
                            class118.method745(var407, false, (byte) 34);
                        }
                        class252.method1680((byte) 102, var407);
                        continue;
                    }
                    if (var440 == 1003) {
                        var8--;
                        boolean var412 = class191.field3251[var8] == 1;
                        if (var407.field1860 != var412) {
                            var407.field1860 = var412;
                            class198.method1268(117, var407);
                        }
                        continue;
                    }
                    if (var440 == 1004) {
                        var8 -= 2;
                        var407.field1918 = class191.field3251[var8];
                        var407.field1869 = class191.field3251[var8 + 1];
                        class198.method1268(81, var407);
                        if (var407.field1829 == 0) {
                            class118.method745(var407, false, (byte) 34);
                        }
                        class252.method1680((byte) 35, var407);
                        continue;
                    }
                } else if (!(var440 < 1100 || var440 >= 1200) || !(var440 < 2100 || var440 >= 2200)) {
                    class105 var404;
                    if (var440 < 2000) {
                        var404 = var46 ? class99.field1738 : class178.field2988;
                    } else {
                        var8--;
                        var404 = class27.method137(class191.field3251[var8], -954490064);
                        var440 -= 1000;
                    }
                    if (var440 == 1100) {
                        var8 -= 2;
                        var404.field1925 = class191.field3251[var8];
                        if ((var404.field1842 - var404.field1977) < var404.field1925) {
                            var404.field1925 = var404.field1842 - var404.field1977;
                        }
                        if (var404.field1925 < 0) {
                            var404.field1925 = 0;
                        }
                        var404.field1986 = class191.field3251[var8 + 1];
                        if (var404.field1935 - var404.field1952 < var404.field1986) {
                            var404.field1986 = var404.field1935 - var404.field1952;
                        }
                        if (var404.field1986 < 0) {
                            var404.field1986 = 0;
                        }
                        class198.method1268(arg2 - 2147483561, var404);
                        continue;
                    }
                    if (var440 == 1101) {
                        var8--;
                        var404.field1894 = class191.field3251[var8];
                        class198.method1268(93, var404);
                        continue;
                    }
                    if (var440 == 1102) {
                        var8--;
                        var404.field1868 = class191.field3251[var8] == 1;
                        class198.method1268(75, var404);
                        continue;
                    }
                    if (var440 == 1103) {
                        var8--;
                        var404.field1933 = class191.field3251[var8];
                        class198.method1268(arg2 - 2147483554, var404);
                        continue;
                    }
                    if (var440 == 1104) {
                        var8--;
                        var404.field1866 = class191.field3251[var8];
                        class198.method1268(116, var404);
                        continue;
                    }
                    if (var440 == 1105) {
                        var8--;
                        var404.field1931 = class191.field3251[var8];
                        class198.method1268(123, var404);
                        continue;
                    }
                    if (var440 == 1106) {
                        var8--;
                        var404.field1976 = class191.field3251[var8];
                        class198.method1268(arg2 - 2147483541, var404);
                        continue;
                    }
                    if (var440 == 1107) {
                        var8--;
                        var404.field1824 = class191.field3251[var8] == 1;
                        class198.method1268(117, var404);
                        continue;
                    }
                    if (var440 == 1108) {
                        var404.field1850 = 1;
                        var8--;
                        var404.field1910 = class191.field3251[var8];
                        class198.method1268(92, var404);
                        continue;
                    }
                    if (var440 == 1109) {
                        var8 -= 6;
                        var404.field1893 = class191.field3251[var8];
                        var404.field1962 = class191.field3251[var8 + 1];
                        var404.field1983 = class191.field3251[var8 + 2];
                        var404.field1844 = class191.field3251[var8 + 3];
                        var404.field1937 = class191.field3251[var8 + 4];
                        var404.field1905 = class191.field3251[var8 + 5];
                        class198.method1268(83, var404);
                        continue;
                    }
                    if (var440 == 1110) {
                        var8--;
                        int var405 = class191.field3251[var8];
                        if (var404.field1914 != var405) {
                            var404.field1944 = 0;
                            var404.field1908 = 0;
                            var404.field1914 = var405;
                            class198.method1268(94, var404);
                        }
                        continue;
                    }
                    if (var440 == 1111) {
                        var8--;
                        var404.field1845 = class191.field3251[var8] == 1;
                        class198.method1268(106, var404);
                        continue;
                    }
                    if (var440 == 1112) {
                        var6--;
                        class227 var406 = class230.field4014[var6];
                        if (!var406.method1487(127, var404.field1982)) {
                            var404.field1982 = var406;
                            class198.method1268(arg2 ^ 0x7FFFFF97, var404);
                        }
                        continue;
                    }
                    if (var440 == 1113) {
                        var8--;
                        var404.field1972 = class191.field3251[var8];
                        class198.method1268(112, var404);
                        continue;
                    }
                    if (var440 == 1114) {
                        var8 -= 3;
                        var404.field1883 = class191.field3251[var8];
                        var404.field1862 = class191.field3251[var8 + 1];
                        var404.field1838 = class191.field3251[var8 + 2];
                        class198.method1268(123, var404);
                        continue;
                    }
                    if (var440 == 1115) {
                        var8--;
                        var404.field1961 = class191.field3251[var8] == 1;
                        class198.method1268(76, var404);
                        continue;
                    }
                    if (var440 == 1116) {
                        var8--;
                        var404.field1901 = class191.field3251[var8];
                        class198.method1268(arg2 - 2147483537, var404);
                        continue;
                    }
                    if (var440 == 1117) {
                        var8--;
                        var404.field1959 = class191.field3251[var8];
                        class198.method1268(arg2 ^ 0x7FFFFF81, var404);
                        continue;
                    }
                    if (var440 == 1118) {
                        var8--;
                        var404.field1932 = class191.field3251[var8] == 1;
                        class198.method1268(100, var404);
                        continue;
                    }
                    if (var440 == 1119) {
                        var8--;
                        var404.field1967 = class191.field3251[var8] == 1;
                        class198.method1268(104, var404);
                        continue;
                    }
                    if (var440 == 1120) {
                        var8 -= 2;
                        var404.field1842 = class191.field3251[var8];
                        var404.field1935 = class191.field3251[var8 + 1];
                        class198.method1268(118, var404);
                        if (var404.field1829 == 0) {
                            class118.method745(var404, false, (byte) 34);
                        }
                        continue;
                    }
                    if (var440 == 1121) {
                        var8 -= 2;
                        class198.method1268(127, var404);
                        continue;
                    }
                    if (var440 == 1122) {
                        var8--;
                        var404.field1858 = class191.field3251[var8] == 1;
                        class198.method1268(90, var404);
                        continue;
                    }
                } else if (!(var440 < 1200 || var440 >= 1300) || !(var440 < 2200 || var440 >= 2300)) {
                    class105 var47;
                    if (var440 < 2000) {
                        var47 = var46 ? class99.field1738 : class178.field2988;
                    } else {
                        var8--;
                        var47 = class27.method137(class191.field3251[var8], -954490064);
                        var440 -= 1000;
                    }
                    class198.method1268(arg2 - 2147483534, var47);
                    if (var440 == 1200 || var440 == 1205) {
                        var8 -= 2;
                        int var48 = class191.field3251[var8];
                        int var49 = class191.field3251[var8 + 1];
                        if (var48 == -1) {
                            var47.field1850 = 1;
                            var47.field1910 = -1;
                            var47.field1879 = -1;
                        } else {
                            var47.field1987 = var49;
                            var47.field1879 = var48;
                            class178 var50 = class133.method815(var48, (byte) -70);
                            var47.field1937 = var50.field3061;
                            var47.field1893 = var50.field3007;
                            var47.field1962 = var50.field2990;
                            var47.field1905 = var50.field2987;
                            if (var440 == 1205) {
                                var47.field1849 = false;
                            } else {
                                var47.field1849 = true;
                            }
                            if (var47.field1947 > 0) {
                                var47.field1905 = var47.field1905 * 32 / var47.field1947;
                            } else if (var47.field1943 > 0) {
                                var47.field1905 = var47.field1905 * 32 / var47.field1943;
                            }
                            var47.field1844 = var50.field3002;
                            var47.field1983 = var50.field2999;
                        }
                        continue;
                    }
                    if (var440 == 1201) {
                        var47.field1850 = 2;
                        var8--;
                        var47.field1910 = class191.field3251[var8];
                        continue;
                    }
                    if (var440 == 1202) {
                        var47.field1850 = 3;
                        var47.field1910 = class216.field3639.field3820.method337(-100);
                        continue;
                    }
                    if (var440 == 1203) {
                        var47.field1850 = 6;
                        var8--;
                        var47.field1910 = class191.field3251[var8];
                        continue;
                    }
                    if (var440 == 1204) {
                        var47.field1850 = 5;
                        var8--;
                        var47.field1910 = class191.field3251[var8];
                        continue;
                    }
                } else if (var440 >= 1300 && var440 < 1400 || var440 >= 2300 && var440 < 2400) {
                    class105 var51;
                    if (var440 < 2000) {
                        var51 = var46 ? class99.field1738 : class178.field2988;
                    } else {
                        var440 -= 1000;
                        var8--;
                        var51 = class27.method137(class191.field3251[var8], arg2 ^ 0xB8E45CCA);
                    }
                    if (var440 == 1300) {
                        var8--;
                        int var52 = class191.field3251[var8] - 1;
                        if (var52 >= 0 && var52 <= 9) {
                            var6--;
                            var51.method654(class230.field4014[var6], (byte) 55, var52);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var440 == 1301) {
                        var8 -= 2;
                        int var53 = class191.field3251[var8];
                        int var54 = class191.field3251[var8 + 1];
                        var51.field1924 = class255.method1738(var53, (byte) -63, var54);
                        continue;
                    }
                    if (var440 == 1302) {
                        var8--;
                        var51.field1958 = class191.field3251[var8] == 1;
                        continue;
                    }
                    if (var440 == 1303) {
                        var8--;
                        var51.field1830 = class191.field3251[var8];
                        continue;
                    }
                    if (var440 == 1304) {
                        var8--;
                        var51.field1965 = class191.field3251[var8];
                        continue;
                    }
                    if (var440 == 1305) {
                        var6--;
                        var51.field1870 = class230.field4014[var6];
                        continue;
                    }
                    if (var440 == 1306) {
                        var6--;
                        var51.field1836 = class230.field4014[var6];
                        continue;
                    }
                    if (var440 == 1307) {
                        var51.field1903 = null;
                        continue;
                    }
                } else {
                    if (var440 >= 1400 && var440 < 1500 || var440 >= 2400 && var440 < 2500) {
                        class105 var55;
                        if (var440 < 2000) {
                            var55 = var46 ? class99.field1738 : class178.field2988;
                        } else {
                            var8--;
                            var55 = class27.method137(class191.field3251[var8], -954490064);
                            var440 -= 1000;
                        }
                        var6--;
                        class227 var56 = class230.field4014[var6];
                        int[] var57 = null;
                        if (var56.method1521((byte) 57) > 0 && var56.method1533((byte) 39, var56.method1521((byte) 80) - 1) == 89) {
                            var8--;
                            int var58 = class191.field3251[var8];
                            if (var58 > 0) {
                                var57 = new int[var58];
                                while (var58-- > 0) {
                                    var8--;
                                    var57[var58] = class191.field3251[var8];
                                }
                            }
                            var56 = var56.method1532((byte) 109, 0, var56.method1521((byte) 103) - 1);
                        }
                        Object[] var59 = new Object[var56.method1521((byte) 8) + 1];
                        for (int var60 = var59.length - 1; var60 >= 1; var60--) {
                            if (var56.method1533((byte) 39, var60 - 1) == 115) {
                                var6--;
                                var59[var60] = class230.field4014[var6];
                            } else {
                                var8--;
                                var59[var60] = Integer.valueOf(class191.field3251[var8]);
                            }
                        }
                        var8--;
                        int var61 = class191.field3251[var8];
                        if (var61 == -1) {
                            var59 = null;
                        } else {
                            var59[0] = Integer.valueOf(var61);
                        }
                        if (var440 == 1400) {
                            var55.field1873 = var59;
                        } else if (var440 == 1401) {
                            var55.field1973 = var59;
                        } else if (var440 == 1402) {
                            var55.field1839 = var59;
                        } else if (var440 == 1403) {
                            var55.field1951 = var59;
                        } else if (var440 == 1404) {
                            var55.field1898 = var59;
                        } else if (var440 == 1405) {
                            var55.field1953 = var59;
                        } else if (var440 == 1406) {
                            var55.field1934 = var59;
                        } else if (var440 == 1407) {
                            var55.field1940 = var59;
                            var55.field1874 = var57;
                        } else if (var440 == 1408) {
                            var55.field1826 = var59;
                        } else if (var440 == 1409) {
                            var55.field1832 = var59;
                        } else if (var440 == 1410) {
                            var55.field1877 = var59;
                        } else if (var440 == 1411) {
                            var55.field1927 = var59;
                        } else if (var440 == 1412) {
                            var55.field1920 = var59;
                        } else if (var440 == 1414) {
                            var55.field1946 = var59;
                            var55.field1942 = var57;
                        } else if (var440 == 1415) {
                            var55.field1978 = var59;
                            var55.field1929 = var57;
                        } else if (var440 == 1416) {
                            var55.field1939 = var59;
                        } else if (var440 == 1417) {
                            var55.field1916 = var59;
                        } else if (var440 == 1418) {
                            var55.field1949 = var59;
                        } else if (var440 == 1419) {
                            var55.field1902 = var59;
                        } else if (var440 == 1420) {
                            var55.field1880 = var59;
                        } else if (var440 == 1421) {
                            var55.field1825 = var59;
                        } else if (var440 == 1422) {
                            var55.field1985 = var59;
                        } else if (var440 == 1423) {
                            var55.field1882 = var59;
                        } else if (var440 == 1424) {
                            var55.field1930 = var59;
                        } else if (var440 == 1425) {
                            var55.field1919 = var59;
                        } else if (var440 == 1426) {
                            var55.field1928 = var59;
                        } else if (var440 == 1427) {
                            var55.field1885 = var59;
                        } else if (var440 == 1428) {
                            var55.field1891 = var59;
                            var55.field1915 = var57;
                        } else if (var440 == 1429) {
                            var55.field1923 = var59;
                            var55.field1886 = var57;
                        }
                        var55.field1964 = true;
                        continue;
                    }
                    if (var440 < 1600) {
                        class105 var62 = var46 ? class99.field1738 : class178.field2988;
                        if (var440 == 1500) {
                            class191.field3251[var8++] = var62.field1941;
                            continue;
                        }
                        if (var440 == 1501) {
                            class191.field3251[var8++] = var62.field1950;
                            continue;
                        }
                        if (var440 == 1502) {
                            class191.field3251[var8++] = var62.field1977;
                            continue;
                        }
                        if (var440 == 1503) {
                            class191.field3251[var8++] = var62.field1952;
                            continue;
                        }
                        if (var440 == 1504) {
                            class191.field3251[var8++] = var62.field1860 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 1505) {
                            class191.field3251[var8++] = var62.field1968;
                            continue;
                        }
                    } else if (var440 < 1700) {
                        class105 var403 = var46 ? class99.field1738 : class178.field2988;
                        if (var440 == 1600) {
                            class191.field3251[var8++] = var403.field1925;
                            continue;
                        }
                        if (var440 == 1601) {
                            class191.field3251[var8++] = var403.field1986;
                            continue;
                        }
                        if (var440 == 1602) {
                            class230.field4014[var6++] = var403.field1982;
                            continue;
                        }
                        if (var440 == 1603) {
                            class191.field3251[var8++] = var403.field1842;
                            continue;
                        }
                        if (var440 == 1604) {
                            class191.field3251[var8++] = var403.field1935;
                            continue;
                        }
                        if (var440 == 1605) {
                            class191.field3251[var8++] = var403.field1905;
                            continue;
                        }
                        if (var440 == 1606) {
                            class191.field3251[var8++] = var403.field1983;
                            continue;
                        }
                        if (var440 == 1607) {
                            class191.field3251[var8++] = var403.field1937;
                            continue;
                        }
                        if (var440 == 1608) {
                            class191.field3251[var8++] = var403.field1844;
                            continue;
                        }
                        if (var440 == 1609) {
                            class191.field3251[var8++] = var403.field1933;
                            continue;
                        }
                    } else if (var440 < 1800) {
                        class105 var63 = var46 ? class99.field1738 : class178.field2988;
                        if (var440 == 1700) {
                            class191.field3251[var8++] = var63.field1879;
                            continue;
                        }
                        if (var440 == 1701) {
                            if (var63.field1879 == -1) {
                                class191.field3251[var8++] = 0;
                            } else {
                                class191.field3251[var8++] = var63.field1987;
                            }
                            continue;
                        }
                        if (var440 == 1702) {
                            class191.field3251[var8++] = var63.field1884;
                            continue;
                        }
                    } else if (var440 < 1900) {
                        class105 var64 = var46 ? class99.field1738 : class178.field2988;
                        if (var440 == 1800) {
                            class191.field3251[var8++] = class208.method1320(false, client.method494(var64));
                            continue;
                        }
                        if (var440 == 1801) {
                            var8--;
                            int var65 = class191.field3251[var8];
                            int var441 = var65 - 1;
                            if (var64.field1903 != null && var441 < var64.field1903.length && var64.field1903[var441] != null) {
                                class230.field4014[var6++] = var64.field1903[var441];
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 1802) {
                            if (var64.field1870 == null) {
                                class230.field4014[var6++] = class184.field3127;
                            } else {
                                class230.field4014[var6++] = var64.field1870;
                            }
                            continue;
                        }
                    } else if (var440 < 2600) {
                        var8--;
                        class105 var402 = class27.method137(class191.field3251[var8], arg2 + 1192993590);
                        if (var440 == 2500) {
                            class191.field3251[var8++] = var402.field1941;
                            continue;
                        }
                        if (var440 == 2501) {
                            class191.field3251[var8++] = var402.field1950;
                            continue;
                        }
                        if (var440 == 2502) {
                            class191.field3251[var8++] = var402.field1977;
                            continue;
                        }
                        if (var440 == 2503) {
                            class191.field3251[var8++] = var402.field1952;
                            continue;
                        }
                        if (var440 == 2504) {
                            class191.field3251[var8++] = var402.field1860 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 2505) {
                            class191.field3251[var8++] = var402.field1968;
                            continue;
                        }
                    } else if (var440 < 2700) {
                        var8--;
                        class105 var401 = class27.method137(class191.field3251[var8], -954490064);
                        if (var440 == 2600) {
                            class191.field3251[var8++] = var401.field1925;
                            continue;
                        }
                        if (var440 == 2601) {
                            class191.field3251[var8++] = var401.field1986;
                            continue;
                        }
                        if (var440 == 2602) {
                            class230.field4014[var6++] = var401.field1982;
                            continue;
                        }
                        if (var440 == 2603) {
                            class191.field3251[var8++] = var401.field1842;
                            continue;
                        }
                        if (var440 == 2604) {
                            class191.field3251[var8++] = var401.field1935;
                            continue;
                        }
                        if (var440 == 2605) {
                            class191.field3251[var8++] = var401.field1905;
                            continue;
                        }
                        if (var440 == 2606) {
                            class191.field3251[var8++] = var401.field1983;
                            continue;
                        }
                        if (var440 == 2607) {
                            class191.field3251[var8++] = var401.field1937;
                            continue;
                        }
                        if (var440 == 2608) {
                            class191.field3251[var8++] = var401.field1844;
                            continue;
                        }
                        if (var440 == 2609) {
                            class191.field3251[var8++] = var401.field1933;
                            continue;
                        }
                    } else if (var440 < 2800) {
                        if (var440 == 2700) {
                            var8--;
                            class105 var391 = class27.method137(class191.field3251[var8], -954490064);
                            class191.field3251[var8++] = var391.field1879;
                            continue;
                        }
                        if (var440 == 2701) {
                            var8--;
                            class105 var392 = class27.method137(class191.field3251[var8], -954490064);
                            if (var392.field1879 == -1) {
                                class191.field3251[var8++] = 0;
                            } else {
                                class191.field3251[var8++] = var392.field1987;
                            }
                            continue;
                        }
                        if (var440 == 2702) {
                            var8--;
                            int var393 = class191.field3251[var8];
                            class182 var394 = (class182) class58.field1070.method1298(-122, (long) var393);
                            if (var394 == null) {
                                class191.field3251[var8++] = 0;
                            } else {
                                class191.field3251[var8++] = 1;
                            }
                            continue;
                        }
                        if (var440 == 2703) {
                            var8--;
                            class105 var395 = class27.method137(class191.field3251[var8], -954490064);
                            if (var395.field1956 == null) {
                                class191.field3251[var8++] = 0;
                                continue;
                            }
                            int var396 = var395.field1956.length;
                            for (int var397 = 0; var397 < var395.field1956.length; var397++) {
                                if (var395.field1956[var397] == null) {
                                    var396 = var397;
                                    break;
                                }
                            }
                            class191.field3251[var8++] = var396;
                            continue;
                        }
                        if (var440 == 2704 || var440 == 2705) {
                            var8 -= 2;
                            int var398 = class191.field3251[var8];
                            int var399 = class191.field3251[var8 + 1];
                            class182 var400 = (class182) class58.field1070.method1298(-124, (long) var398);
                            if (var400 != null && var400.field3106 == var399) {
                                class191.field3251[var8++] = 1;
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                    } else if (var440 < 2900) {
                        var8--;
                        class105 var389 = class27.method137(class191.field3251[var8], -954490064);
                        if (var440 == 2800) {
                            class191.field3251[var8++] = class208.method1320(false, client.method494(var389));
                            continue;
                        }
                        if (var440 == 2801) {
                            var8--;
                            int var390 = class191.field3251[var8];
                            int var442 = var390 - 1;
                            if (var389.field1903 != null && var442 < var389.field1903.length && var389.field1903[var442] != null) {
                                class230.field4014[var6++] = var389.field1903[var442];
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 2802) {
                            if (var389.field1870 == null) {
                                class230.field4014[var6++] = class184.field3127;
                            } else {
                                class230.field4014[var6++] = var389.field1870;
                            }
                            continue;
                        }
                    } else if (var440 < 3200) {
                        if (var440 == 3100) {
                            var6--;
                            class227 var374 = class230.field4014[var6];
                            class130.method799(1403, 0, class184.field3127, var374);
                            continue;
                        }
                        if (var440 == 3101) {
                            var8 -= 2;
                            class151.method954(arg2 ^ 0x7FFFFFF9, class216.field3639, class191.field3251[var8 + 1], class191.field3251[var8]);
                            continue;
                        }
                        if (var440 == 3103) {
                            class65.method411(22525);
                            continue;
                        }
                        if (var440 == 3104) {
                            class46.field823++;
                            int var375 = 0;
                            var6--;
                            class227 var376 = class230.field4014[var6];
                            if (var376.method1510((byte) 124)) {
                                var375 = var376.method1497(false);
                            }
                            class176.field2935.method664((byte) 57, 186);
                            class176.field2935.method1427(var375, (byte) 24);
                            continue;
                        }
                        if (var440 == 3105) {
                            class105.field1834++;
                            var6--;
                            class227 var377 = class230.field4014[var6];
                            class176.field2935.method664((byte) -104, 34);
                            class176.field2935.method1457(var377.method1485(122), 50);
                            continue;
                        }
                        if (var440 == 3106) {
                            class236.field4092++;
                            var6--;
                            class227 var378 = class230.field4014[var6];
                            class176.field2935.method664((byte) 55, 106);
                            class176.field2935.method1443(var378.method1521((byte) 54) + 1, 0);
                            class176.field2935.method1452(var378, (byte) -63);
                            continue;
                        }
                        if (var440 == 3107) {
                            var8--;
                            int var379 = class191.field3251[var8];
                            var6--;
                            class227 var380 = class230.field4014[var6];
                            class114.method720(var379, var380, true);
                            continue;
                        }
                        if (var440 == 3108) {
                            var8 -= 3;
                            int var381 = class191.field3251[var8 + 1];
                            int var382 = class191.field3251[var8 + 2];
                            int var383 = class191.field3251[var8];
                            class105 var384 = class27.method137(var382, -954490064);
                            class228.method1539(var381, var384, var383, (byte) -126);
                            continue;
                        }
                        if (var440 == 3109) {
                            var8 -= 2;
                            int var385 = class191.field3251[var8];
                            class105 var386 = var46 ? class99.field1738 : class178.field2988;
                            int var387 = class191.field3251[var8 + 1];
                            class228.method1539(var387, var386, var385, (byte) -126);
                            continue;
                        }
                        if (var440 == 3110) {
                            var8--;
                            int var388 = class191.field3251[var8];
                            class176.field2935.method664((byte) -111, 218);
                            class26.field435++;
                            class176.field2935.method1451(var388, (byte) -122);
                            continue;
                        }
                    } else if (var440 < 3300) {
                        if (var440 == 3200) {
                            var8 -= 3;
                            class72.method435(class191.field3251[var8], (byte) -35, class191.field3251[var8 + 2], class191.field3251[var8 + 1]);
                            continue;
                        }
                        if (var440 == 3201) {
                            var8--;
                            class195.method1235((byte) -127, class191.field3251[var8]);
                            continue;
                        }
                        if (var440 == 3202) {
                            var8 -= 2;
                            class44.method237(class191.field3251[var8], class191.field3251[var8 + 1], -31668);
                            continue;
                        }
                    } else if (var440 < 3400) {
                        if (var440 == 3300) {
                            class191.field3251[var8++] = class253.field4393;
                            continue;
                        }
                        if (var440 == 3301) {
                            var8 -= 2;
                            int var66 = class191.field3251[var8];
                            int var67 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class16.method75(var66, -1, var67);
                            continue;
                        }
                        if (var440 == 3302) {
                            var8 -= 2;
                            int var68 = class191.field3251[var8];
                            int var69 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class8.method34((byte) -42, var69, var68);
                            continue;
                        }
                        if (var440 == 3303) {
                            var8 -= 2;
                            int var70 = class191.field3251[var8];
                            int var71 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class146.method919(var71, var70, arg2 - 2147483642);
                            continue;
                        }
                        if (var440 == 3304) {
                            var8--;
                            int var72 = class191.field3251[var8];
                            class191.field3251[var8++] = class223.method1412(var72, false).field118;
                            continue;
                        }
                        if (var440 == 3305) {
                            var8--;
                            int var73 = class191.field3251[var8];
                            class191.field3251[var8++] = class105.field1913[var73];
                            continue;
                        }
                        if (var440 == 3306) {
                            var8--;
                            int var74 = class191.field3251[var8];
                            class191.field3251[var8++] = class240.field4170[var74];
                            continue;
                        }
                        if (var440 == 3307) {
                            var8--;
                            int var75 = class191.field3251[var8];
                            class191.field3251[var8++] = class260.field4522[var75];
                            continue;
                        }
                        if (var440 == 3308) {
                            int var76 = class64.field1171;
                            int var77 = (class216.field3639.field50 >> 7) + class192.field3267;
                            int var78 = (class216.field3639.field99 >> 7) + class78.field1367;
                            class191.field3251[var8++] = (var76 << 28) + (var77 << 14) + var78;
                            continue;
                        }
                        if (var440 == 3309) {
                            var8--;
                            int var79 = class191.field3251[var8];
                            class191.field3251[var8++] = class76.method446(16383, var79 >> 14);
                            continue;
                        }
                        if (var440 == 3310) {
                            var8--;
                            int var80 = class191.field3251[var8];
                            class191.field3251[var8++] = var80 >> 28;
                            continue;
                        }
                        if (var440 == 3311) {
                            var8--;
                            int var81 = class191.field3251[var8];
                            class191.field3251[var8++] = class76.method446(var81, 16383);
                            continue;
                        }
                        if (var440 == 3312) {
                            class191.field3251[var8++] = class58.field1072 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3313) {
                            var8 -= 2;
                            int var82 = class191.field3251[var8] + 32768;
                            int var83 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class16.method75(var82, -1, var83);
                            continue;
                        }
                        if (var440 == 3314) {
                            var8 -= 2;
                            int var84 = class191.field3251[var8] + 32768;
                            int var85 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class8.method34((byte) -42, var85, var84);
                            continue;
                        }
                        if (var440 == 3315) {
                            var8 -= 2;
                            int var86 = class191.field3251[var8] + 32768;
                            int var87 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class146.method919(var87, var86, arg2 - 2147483642);
                            continue;
                        }
                        if (var440 == 3316) {
                            if (class78.field1365 >= 2) {
                                class191.field3251[var8++] = class78.field1365;
                            } else {
                                class191.field3251[var8++] = 0;
                            }
                            continue;
                        }
                        if (var440 == 3317) {
                            class191.field3251[var8++] = class92.field1568;
                            continue;
                        }
                        if (var440 == 3318) {
                            class191.field3251[var8++] = class131.field2286;
                            continue;
                        }
                        if (var440 == 3321) {
                            class191.field3251[var8++] = client.field1439;
                            continue;
                        }
                        if (var440 == 3322) {
                            class191.field3251[var8++] = class153.field2656;
                            continue;
                        }
                        if (var440 == 3323) {
                            if (class192.field3272 >= 5 && class192.field3272 <= 9) {
                                class191.field3251[var8++] = 1;
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3324) {
                            if (class192.field3272 >= 5 && class192.field3272 <= 9) {
                                class191.field3251[var8++] = class192.field3272;
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3325) {
                            if (class100.field1759 > 0) {
                                class191.field3251[var8++] = 1;
                            } else {
                                class191.field3251[var8++] = 0;
                            }
                            continue;
                        }
                        if (var440 == 3326) {
                            class191.field3251[var8++] = class216.field3639.field3802;
                            continue;
                        }
                        if (var440 == 3327) {
                            class191.field3251[var8++] = class216.field3639.field3820.field1023 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3328) {
                            class191.field3251[var8++] = class252.field4363;
                            continue;
                        }
                        if (var440 == 3329) {
                            class191.field3251[var8++] = class49.field858;
                            continue;
                        }
                    } else if (var440 < 3500) {
                        if (var440 == 3400) {
                            var8 -= 2;
                            int var366 = class191.field3251[var8];
                            int var367 = class191.field3251[var8 + 1];
                            class14 var368 = class142.method898(arg2 - 2147483521, var366);
                            class230.field4014[var6++] = var368.method70(var367, class249.method1666(arg2, -2147483641));
                            continue;
                        }
                        if (var440 == 3408) {
                            var8 -= 4;
                            int var369 = class191.field3251[var8 + 1];
                            int var370 = class191.field3251[var8 + 2];
                            int var371 = class191.field3251[var8];
                            int var372 = class191.field3251[var8 + 3];
                            class14 var373 = class142.method898(125, var370);
                            if (var373.field259 == var371 && var373.field276 == var369) {
                                if (var369 == 115) {
                                    class230.field4014[var6++] = var373.method70(var372, -3);
                                } else {
                                    class191.field3251[var8++] = var373.method65((byte) -18, var372);
                                }
                                continue;
                            }
                            if (var369 == 115) {
                                class230.field4014[var6++] = class57.field1032;
                            } else {
                                class191.field3251[var8++] = 0;
                            }
                            continue;
                        }
                    } else if (var440 < 3700) {
                        if (var440 == 3600) {
                            if (class133.field2305 == 0) {
                                class191.field3251[var8++] = -2;
                            } else if (class133.field2305 == 1) {
                                class191.field3251[var8++] = -1;
                            } else {
                                class191.field3251[var8++] = field2781;
                            }
                            continue;
                        }
                        if (var440 == 3601) {
                            var8--;
                            int var344 = class191.field3251[var8];
                            if (class133.field2305 == 2 && field2781 > var344) {
                                class230.field4014[var6++] = class201.field3442[var344];
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 3602) {
                            var8--;
                            int var345 = class191.field3251[var8];
                            if (class133.field2305 == 2 && var345 < field2781) {
                                class191.field3251[var8++] = class151.field2637[var345];
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3603) {
                            var8--;
                            int var346 = class191.field3251[var8];
                            if (class133.field2305 == 2 && field2781 > var346) {
                                class191.field3251[var8++] = class175.field2915[var346];
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3604) {
                            var6--;
                            class227 var347 = class230.field4014[var6];
                            var8--;
                            int var348 = class191.field3251[var8];
                            class243.method1615(var347, var348, true);
                            continue;
                        }
                        if (var440 == 3605) {
                            var6--;
                            class227 var349 = class230.field4014[var6];
                            class13.method64(var349.method1485(122), 0);
                            continue;
                        }
                        if (var440 == 3606) {
                            var6--;
                            class227 var350 = class230.field4014[var6];
                            class108.method671(var350.method1485(arg2 - 2147483520), (byte) 106);
                            continue;
                        }
                        if (var440 == 3607) {
                            var6--;
                            class227 var351 = class230.field4014[var6];
                            class182.method1164((byte) -89, var351.method1485(122));
                            continue;
                        }
                        if (var440 == 3608) {
                            var6--;
                            class227 var352 = class230.field4014[var6];
                            class246.method1641(var352.method1485(arg2 ^ 0x7FFFFF80), (byte) -128);
                            continue;
                        }
                        if (var440 == 3609) {
                            var6--;
                            class227 var353 = class230.field4014[var6];
                            if (var353.method1529(-8517, class20.field343) || var353.method1529(-8517, class44.field735)) {
                                var353 = var353.method1517((byte) 100, 7);
                            }
                            class191.field3251[var8++] = class238.method1586((byte) 121, var353) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3610) {
                            var8--;
                            int var354 = class191.field3251[var8];
                            if (class133.field2305 == 2 && var354 < field2781) {
                                class230.field4014[var6++] = class21.field363[var354];
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 3611) {
                            if (class143.field2469 == null) {
                                class230.field4014[var6++] = class184.field3127;
                            } else {
                                class230.field4014[var6++] = class143.field2469.method1527(-96);
                            }
                            continue;
                        }
                        if (var440 == 3612) {
                            if (class143.field2469 == null) {
                                class191.field3251[var8++] = 0;
                            } else {
                                class191.field3251[var8++] = class44.field737;
                            }
                            continue;
                        }
                        if (var440 == 3613) {
                            var8--;
                            int var355 = class191.field3251[var8];
                            if (class143.field2469 != null && var355 < class44.field737) {
                                class230.field4014[var6++] = class79.field1382[var355].field1189.method1527(-96);
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 3614) {
                            var8--;
                            int var356 = class191.field3251[var8];
                            if (class143.field2469 != null && class44.field737 > var356) {
                                class191.field3251[var8++] = class79.field1382[var356].field1193;
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3615) {
                            var8--;
                            int var357 = class191.field3251[var8];
                            if (class143.field2469 != null && var357 < class44.field737) {
                                class191.field3251[var8++] = class79.field1382[var357].field1192;
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3616) {
                            class191.field3251[var8++] = class215.field3636;
                            continue;
                        }
                        if (var440 == 3617) {
                            var6--;
                            class227 var358 = class230.field4014[var6];
                            class30.method154(36, var358);
                            continue;
                        }
                        if (var440 == 3618) {
                            class191.field3251[var8++] = class228.field3983;
                            continue;
                        }
                        if (var440 == 3619) {
                            var6--;
                            class227 var359 = class230.field4014[var6];
                            class143.method902(var359.method1485(122), arg2 - 2147483642);
                            continue;
                        }
                        if (var440 == 3620) {
                            class92.method539(177);
                            continue;
                        }
                        if (var440 == 3621) {
                            if (class133.field2305 == 0) {
                                class191.field3251[var8++] = -1;
                            } else {
                                class191.field3251[var8++] = class86.field1485;
                            }
                            continue;
                        }
                        if (var440 == 3622) {
                            var8--;
                            int var360 = class191.field3251[var8];
                            if (class133.field2305 != 0 && var360 < class86.field1485) {
                                class230.field4014[var6++] = class118.method744(class230.field4031[var360], -125).method1527(class249.method1666(arg2, -2147483558));
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 3623) {
                            var6--;
                            class227 var361 = class230.field4014[var6];
                            if (var361.method1529(-8517, class20.field343) || var361.method1529(-8517, class44.field735)) {
                                var361 = var361.method1517((byte) 119, 7);
                            }
                            class191.field3251[var8++] = class125.method769(101, var361) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3624) {
                            var8--;
                            int var362 = class191.field3251[var8];
                            if (class79.field1382 != null && class44.field737 > var362 && class79.field1382[var362].field1189.method1522(class216.field3639.field3819, (byte) -56)) {
                                class191.field3251[var8++] = 1;
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3625) {
                            if (class230.field4019 == null) {
                                class230.field4014[var6++] = class184.field3127;
                            } else {
                                class230.field4014[var6++] = class230.field4019.method1527(-96);
                            }
                            continue;
                        }
                        if (var440 == 3626) {
                            var8--;
                            int var363 = class191.field3251[var8];
                            if (class143.field2469 != null && class44.field737 > var363) {
                                class230.field4014[var6++] = class79.field1382[var363].field1190;
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 3627) {
                            var8--;
                            int var364 = class191.field3251[var8];
                            if (class133.field2305 == 2 && var364 >= 0 && var364 < field2781) {
                                class191.field3251[var8++] = class71.field1248[var364] ? 1 : 0;
                                continue;
                            }
                            class191.field3251[var8++] = 0;
                            continue;
                        }
                        if (var440 == 3628) {
                            var6--;
                            class227 var365 = class230.field4014[var6];
                            if (var365.method1529(-8517, class20.field343) || var365.method1529(-8517, class44.field735)) {
                                var365 = var365.method1517((byte) -42, 7);
                            }
                            class191.field3251[var8++] = class156.method979(-108, var365);
                            continue;
                        }
                    } else if (var440 < 4000) {
                        if (var440 == 3903) {
                            var8--;
                            int var88 = class191.field3251[var8];
                            class191.field3251[var8++] = class58.field1075[var88].method199((byte) 6);
                            continue;
                        }
                        if (var440 == 3904) {
                            var8--;
                            int var89 = class191.field3251[var8];
                            class191.field3251[var8++] = class58.field1075[var89].field631;
                            continue;
                        }
                        if (var440 == 3905) {
                            var8--;
                            int var90 = class191.field3251[var8];
                            class191.field3251[var8++] = class58.field1075[var90].field640;
                            continue;
                        }
                        if (var440 == 3906) {
                            var8--;
                            int var91 = class191.field3251[var8];
                            class191.field3251[var8++] = class58.field1075[var91].field632;
                            continue;
                        }
                        if (var440 == 3907) {
                            var8--;
                            int var92 = class191.field3251[var8];
                            class191.field3251[var8++] = class58.field1075[var92].field630;
                            continue;
                        }
                        if (var440 == 3908) {
                            var8--;
                            int var93 = class191.field3251[var8];
                            class191.field3251[var8++] = class58.field1075[var93].field641;
                            continue;
                        }
                        if (var440 == 3910) {
                            var8--;
                            int var94 = class191.field3251[var8];
                            int var95 = class58.field1075[var94].method200(true);
                            class191.field3251[var8++] = var95 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3911) {
                            var8--;
                            int var96 = class191.field3251[var8];
                            int var97 = class58.field1075[var96].method200(true);
                            class191.field3251[var8++] = var97 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3912) {
                            var8--;
                            int var98 = class191.field3251[var8];
                            int var99 = class58.field1075[var98].method200(true);
                            class191.field3251[var8++] = var99 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3913) {
                            var8--;
                            int var100 = class191.field3251[var8];
                            int var101 = class58.field1075[var100].method200(true);
                            class191.field3251[var8++] = var101 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var440 < 4100) {
                        if (var440 == 4000) {
                            var8 -= 2;
                            int var102 = class191.field3251[var8 + 1];
                            int var103 = class191.field3251[var8];
                            class191.field3251[var8++] = var103 + var102;
                            continue;
                        }
                        if (var440 == 4001) {
                            var8 -= 2;
                            int var104 = class191.field3251[var8];
                            int var105 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = var104 - var105;
                            continue;
                        }
                        if (var440 == 4002) {
                            var8 -= 2;
                            int var106 = class191.field3251[var8];
                            int var107 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = var106 * var107;
                            continue;
                        }
                        if (var440 == 4003) {
                            var8 -= 2;
                            int var108 = class191.field3251[var8];
                            int var109 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = var108 / var109;
                            continue;
                        }
                        if (var440 == 4004) {
                            var8--;
                            int var110 = class191.field3251[var8];
                            class191.field3251[var8++] = (int) (Math.random() * (double) var110);
                            continue;
                        }
                        if (var440 == 4005) {
                            var8--;
                            int var111 = class191.field3251[var8];
                            class191.field3251[var8++] = (int) (Math.random() * (double) (var111 + 1));
                            continue;
                        }
                        if (var440 == 4006) {
                            var8 -= 5;
                            int var112 = class191.field3251[var8 + 1];
                            int var113 = class191.field3251[var8 + 2];
                            int var114 = class191.field3251[var8];
                            int var115 = class191.field3251[var8 + 3];
                            int var116 = class191.field3251[var8 + 4];
                            class191.field3251[var8++] = (var112 - var114) * (var116 - var113) / (var115 - var113) + var114;
                            continue;
                        }
                        if (var440 == 4007) {
                            var8 -= 2;
                            long var117 = (long) class191.field3251[var8];
                            long var119 = (long) class191.field3251[var8 + 1];
                            class191.field3251[var8++] = (int) (var117 * var119 / 100L + var117);
                            continue;
                        }
                        if (var440 == 4008) {
                            var8 -= 2;
                            int var121 = class191.field3251[var8];
                            int var122 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class246.method1640(var121, 0x1 << var122);
                            continue;
                        }
                        if (var440 == 4009) {
                            var8 -= 2;
                            int var123 = class191.field3251[var8 + 1];
                            int var124 = class191.field3251[var8];
                            class191.field3251[var8++] = class76.method446(var124, -(0x1 << var123) - 1);
                            continue;
                        }
                        if (var440 == 4010) {
                            var8 -= 2;
                            int var125 = class191.field3251[var8];
                            int var126 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class76.method446(0x1 << var126, var125) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var440 == 4011) {
                            var8 -= 2;
                            int var127 = class191.field3251[var8];
                            int var128 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = var127 % var128;
                            continue;
                        }
                        if (var440 == 4012) {
                            var8 -= 2;
                            int var129 = class191.field3251[var8];
                            int var130 = class191.field3251[var8 + 1];
                            if (var129 == 0) {
                                class191.field3251[var8++] = 0;
                            } else {
                                class191.field3251[var8++] = (int) Math.pow((double) var129, (double) var130);
                            }
                            continue;
                        }
                        if (var440 == 4013) {
                            var8 -= 2;
                            int var131 = class191.field3251[var8];
                            int var132 = class191.field3251[var8 + 1];
                            if (var131 == 0) {
                                class191.field3251[var8++] = 0;
                            } else if (var132 == 0) {
                                class191.field3251[var8++] = Integer.MAX_VALUE;
                            } else {
                                class191.field3251[var8++] = (int) Math.pow((double) var131, 1.0D / (double) var132);
                            }
                            continue;
                        }
                        if (var440 == 4014) {
                            var8 -= 2;
                            int var133 = class191.field3251[var8 + 1];
                            int var134 = class191.field3251[var8];
                            class191.field3251[var8++] = class76.method446(var133, var134);
                            continue;
                        }
                        if (var440 == 4015) {
                            var8 -= 2;
                            int var135 = class191.field3251[var8];
                            int var136 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = class246.method1640(var135, var136);
                            continue;
                        }
                        if (var440 == 4016) {
                            var8 -= 2;
                            int var137 = class191.field3251[var8];
                            int var138 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = var137 >= var138 ? var138 : var137;
                            continue;
                        }
                        if (var440 == 4017) {
                            var8 -= 2;
                            int var139 = class191.field3251[var8];
                            int var140 = class191.field3251[var8 + 1];
                            class191.field3251[var8++] = var140 < var139 ? var139 : var140;
                            continue;
                        }
                        if (var440 == 4018) {
                            var8 -= 3;
                            long var141 = (long) class191.field3251[var8];
                            long var143 = (long) class191.field3251[var8 + 2];
                            long var145 = (long) class191.field3251[var8 + 1];
                            class191.field3251[var8++] = (int) (var141 * var143 / var145);
                            continue;
                        }
                    } else if (var440 < 4200) {
                        if (var440 == 4100) {
                            var6--;
                            class227 var292 = class230.field4014[var6];
                            var8--;
                            int var293 = class191.field3251[var8];
                            class230.field4014[var6++] = class76.method445((byte) -92, new class227[] { var292, class204.method1303(var293, 1) });
                            continue;
                        }
                        if (var440 == 4101) {
                            var6 -= 2;
                            class227 var294 = class230.field4014[var6];
                            class227 var295 = class230.field4014[var6 + 1];
                            class230.field4014[var6++] = class76.method445((byte) -78, new class227[] { var294, var295 });
                            continue;
                        }
                        if (var440 == 4102) {
                            var6--;
                            class227 var296 = class230.field4014[var6];
                            var8--;
                            int var297 = class191.field3251[var8];
                            class230.field4014[var6++] = class76.method445((byte) 124, new class227[] { var296, class43.method230(class249.method1666(arg2, -2147474996), var297, true) });
                            continue;
                        }
                        if (var440 == 4103) {
                            var6--;
                            class227 var298 = class230.field4014[var6];
                            class230.field4014[var6++] = var298.method1525((byte) -82);
                            continue;
                        }
                        if (var440 == 4104) {
                            var8--;
                            int var299 = class191.field3251[var8];
                            long var300 = ((long) var299 + 11745L) * 86400000L;
                            class122.field2200.setTime(new Date(var300));
                            int var302 = class122.field2200.get(5);
                            int var303 = class122.field2200.get(2);
                            int var304 = class122.field2200.get(1);
                            class230.field4014[var6++] = class76.method445((byte) 120, new class227[] { class204.method1303(var302, arg2 - 2147483641), class117.field2147, class73.field1271[var303], class117.field2147, class204.method1303(var304, arg2 - 2147483641) });
                            continue;
                        }
                        if (var440 == 4105) {
                            var6 -= 2;
                            class227 var305 = class230.field4014[var6 + 1];
                            class227 var306 = class230.field4014[var6];
                            if (class216.field3639.field3820 != null && class216.field3639.field3820.field1023) {
                                class230.field4014[var6++] = var305;
                                continue;
                            }
                            class230.field4014[var6++] = var306;
                            continue;
                        }
                        if (var440 == 4106) {
                            var8--;
                            int var307 = class191.field3251[var8];
                            class230.field4014[var6++] = class204.method1303(var307, class249.method1666(arg2, 2147483643));
                            continue;
                        }
                        if (var440 == 4107) {
                            var6 -= 2;
                            class191.field3251[var8++] = class230.field4014[var6].method1494(class230.field4014[var6 + 1], -100);
                            continue;
                        }
                        if (var440 == 4108) {
                            var6--;
                            class227 var308 = class230.field4014[var6];
                            var8 -= 2;
                            int var309 = class191.field3251[var8 + 1];
                            int var310 = class191.field3251[var8];
                            byte[] var311 = class13.field247.method884(0, 115, var309);
                            class202 var312 = new class202(var311);
                            var312.method1250(class100.field1751, (int[]) null);
                            class191.field3251[var8++] = var312.method1255(var308, var310);
                            continue;
                        }
                        if (var440 == 4109) {
                            var8 -= 2;
                            var6--;
                            class227 var313 = class230.field4014[var6];
                            int var314 = class191.field3251[var8];
                            int var315 = class191.field3251[var8 + 1];
                            byte[] var316 = class13.field247.method884(0, arg2 - 2147483538, var315);
                            class202 var317 = new class202(var316);
                            var317.method1250(class100.field1751, (int[]) null);
                            class191.field3251[var8++] = var317.method1258(var313, var314);
                            continue;
                        }
                        if (var440 == 4110) {
                            var6 -= 2;
                            class227 var318 = class230.field4014[var6];
                            class227 var319 = class230.field4014[var6 + 1];
                            var8--;
                            if (class191.field3251[var8] == 1) {
                                class230.field4014[var6++] = var318;
                            } else {
                                class230.field4014[var6++] = var319;
                            }
                            continue;
                        }
                        if (var440 == 4111) {
                            var6--;
                            class227 var320 = class230.field4014[var6];
                            class230.field4014[var6++] = class196.method1249(var320);
                            continue;
                        }
                        if (var440 == 4112) {
                            var6--;
                            class227 var321 = class230.field4014[var6];
                            var8--;
                            int var322 = class191.field3251[var8];
                            if (var322 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class230.field4014[var6++] = var321.method1493(-3848, var322);
                            continue;
                        }
                        if (var440 == 4113) {
                            var8--;
                            int var323 = class191.field3251[var8];
                            class191.field3251[var8++] = class213.method1356(var323, 127) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4114) {
                            var8--;
                            int var324 = class191.field3251[var8];
                            class191.field3251[var8++] = class200.method1289(var324, class249.method1666(arg2, -2147483563)) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4115) {
                            var8--;
                            int var325 = class191.field3251[var8];
                            class191.field3251[var8++] = class81.method472(3, var325) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4116) {
                            var8--;
                            int var326 = class191.field3251[var8];
                            class191.field3251[var8++] = class8.method33((byte) 113, var326) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4117) {
                            var6--;
                            class227 var327 = class230.field4014[var6];
                            if (var327 == null) {
                                class191.field3251[var8++] = 0;
                            } else {
                                class191.field3251[var8++] = var327.method1521((byte) 14);
                            }
                            continue;
                        }
                        if (var440 == 4118) {
                            var8 -= 2;
                            int var328 = class191.field3251[var8];
                            var6--;
                            class227 var329 = class230.field4014[var6];
                            int var330 = class191.field3251[var8 + 1];
                            class230.field4014[var6++] = var329.method1532((byte) 108, var328, var330);
                            continue;
                        }
                        if (var440 == 4119) {
                            var6--;
                            class227 var331 = class230.field4014[var6];
                            class227 var332 = class223.method1407(var331.method1521((byte) 62), arg2 ^ 0x7FFFFFFA);
                            boolean var333 = false;
                            for (int var334 = 0; var334 < var331.method1521((byte) 51); var334++) {
                                int var335 = var331.method1533((byte) 39, var334);
                                if (var335 == 60) {
                                    var333 = true;
                                } else if (var335 == 62) {
                                    var333 = false;
                                } else if (!var333) {
                                    var332.method1508(arg2 - 2147483642, var335);
                                }
                            }
                            var332.method1488(81);
                            class230.field4014[var6++] = var332;
                            continue;
                        }
                        if (var440 == 4120) {
                            var8 -= 2;
                            var6--;
                            class227 var336 = class230.field4014[var6];
                            int var337 = class191.field3251[var8 + 1];
                            int var338 = class191.field3251[var8];
                            class191.field3251[var8++] = var336.method1531(var338, var337, 83);
                            continue;
                        }
                        if (var440 == 4121) {
                            var6 -= 2;
                            class227 var339 = class230.field4014[var6];
                            class227 var340 = class230.field4014[var6 + 1];
                            var8--;
                            int var341 = class191.field3251[var8];
                            class191.field3251[var8++] = var339.method1483(var341, var340, 1);
                            continue;
                        }
                        if (var440 == 4122) {
                            var8--;
                            int var342 = class191.field3251[var8];
                            class191.field3251[var8++] = class100.method614(true, var342);
                            continue;
                        }
                        if (var440 == 4123) {
                            var8--;
                            int var343 = class191.field3251[var8];
                            class191.field3251[var8++] = class187.method1190(var343, (byte) -110);
                            continue;
                        }
                    } else if (var440 < 4300) {
                        if (var440 == 4200) {
                            var8--;
                            int var147 = class191.field3251[var8];
                            class230.field4014[var6++] = class133.method815(var147, (byte) -70).field3048;
                            continue;
                        }
                        if (var440 == 4201) {
                            var8 -= 2;
                            int var148 = class191.field3251[var8];
                            int var149 = class191.field3251[var8 + 1];
                            class178 var150 = class133.method815(var148, (byte) -70);
                            if (var149 >= 1 && var149 <= 5 && var150.field3057[var149 - 1] != null) {
                                class230.field4014[var6++] = var150.field3057[var149 - 1];
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 4202) {
                            var8 -= 2;
                            int var151 = class191.field3251[var8];
                            int var152 = class191.field3251[var8 + 1];
                            class178 var153 = class133.method815(var151, (byte) -70);
                            if (var152 >= 1 && var152 <= 5 && var153.field3040[var152 - 1] != null) {
                                class230.field4014[var6++] = var153.field3040[var152 - 1];
                                continue;
                            }
                            class230.field4014[var6++] = class184.field3127;
                            continue;
                        }
                        if (var440 == 4203) {
                            var8--;
                            int var154 = class191.field3251[var8];
                            class191.field3251[var8++] = class133.method815(var154, (byte) -70).field3025;
                            continue;
                        }
                        if (var440 == 4204) {
                            var8--;
                            int var155 = class191.field3251[var8];
                            class191.field3251[var8++] = class133.method815(var155, (byte) -70).field3049 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4205) {
                            var8--;
                            int var156 = class191.field3251[var8];
                            class178 var157 = class133.method815(var156, (byte) -70);
                            if (var157.field3042 == -1 && var157.field3055 >= 0) {
                                class191.field3251[var8++] = var157.field3055;
                                continue;
                            }
                            class191.field3251[var8++] = var156;
                            continue;
                        }
                        if (var440 == 4206) {
                            var8--;
                            int var158 = class191.field3251[var8];
                            class178 var159 = class133.method815(var158, (byte) -70);
                            if (var159.field3042 >= 0 && var159.field3055 >= 0) {
                                class191.field3251[var8++] = var159.field3055;
                                continue;
                            }
                            class191.field3251[var8++] = var158;
                            continue;
                        }
                        if (var440 == 4207) {
                            var8--;
                            int var160 = class191.field3251[var8];
                            class191.field3251[var8++] = class133.method815(var160, (byte) -70).field3035 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4208) {
                            var8 -= 2;
                            int var161 = class191.field3251[var8 + 1];
                            int var162 = class191.field3251[var8];
                            class123 var163 = class184.method1171(var161, 11);
                            if (var163.method763((byte) 5)) {
                                class230.field4014[var6++] = class133.method815(var162, (byte) -70).method1135(var161, var163.field2219, 100);
                            } else {
                                class191.field3251[var8++] = class133.method815(var162, (byte) -70).method1147(var163.field2220, 124, var161);
                            }
                            continue;
                        }
                        if (var440 == 4210) {
                            var8--;
                            int var164 = class191.field3251[var8];
                            var6--;
                            class227 var165 = class230.field4014[var6];
                            class149.method945(arg2 - 2147483642, var165, var164 == 1);
                            class191.field3251[var8++] = class38.field636;
                            continue;
                        }
                        if (var440 == 4211) {
                            if (class94.field1637 != null && class87.field1516 < class38.field636) {
                                class191.field3251[var8++] = class76.method446(65535, class94.field1637[class87.field1516++]);
                                continue;
                            }
                            class191.field3251[var8++] = -1;
                            continue;
                        }
                        if (var440 == 4212) {
                            class87.field1516 = 0;
                            continue;
                        }
                    } else if (var440 < 4400) {
                        if (var440 == 4300) {
                            var8 -= 2;
                            int var166 = class191.field3251[var8];
                            int var167 = class191.field3251[var8 + 1];
                            class123 var168 = class184.method1171(var167, 11);
                            if (var168.method763((byte) 5)) {
                                class230.field4014[var6++] = class59.method362(-32544, var166).method925(var168.field2219, false, var167);
                            } else {
                                class191.field3251[var8++] = class59.method362(-32544, var166).method932(class249.method1666(arg2, 2147483558), var167, var168.field2220);
                            }
                            continue;
                        }
                    } else if (var440 >= 4500) {
                        if (var440 >= 4600) {
                            if (var440 < 5100) {
                                if (var440 == 5000) {
                                    class191.field3251[var8++] = class76.field1331;
                                    continue;
                                }
                                if (var440 == 5001) {
                                    class73.field1294++;
                                    var8 -= 3;
                                    class76.field1331 = class191.field3251[var8];
                                    class185.field3155 = class191.field3251[var8 + 1];
                                    class245.field4291 = class191.field3251[var8 + 2];
                                    class176.field2935.method664((byte) -102, 60);
                                    class176.field2935.method1443(class76.field1331, 0);
                                    class176.field2935.method1443(class185.field3155, 0);
                                    class176.field2935.method1443(class245.field4291, 0);
                                    continue;
                                }
                                if (var440 == 5002) {
                                    class151.field2622++;
                                    var8 -= 2;
                                    var6--;
                                    class227 var223 = class230.field4014[var6];
                                    int var224 = class191.field3251[var8];
                                    int var225 = class191.field3251[var8 + 1];
                                    class176.field2935.method664((byte) -113, 232);
                                    class176.field2935.method1457(var223.method1485(122), 106);
                                    class176.field2935.method1443(var224 - 1, 0);
                                    class176.field2935.method1443(var225, 0);
                                    continue;
                                }
                                if (var440 == 5003) {
                                    var8--;
                                    int var226 = class191.field3251[var8];
                                    class227 var227 = null;
                                    if (var226 < 100) {
                                        var227 = class167.field2805[var226];
                                    }
                                    if (var227 == null) {
                                        var227 = class184.field3127;
                                    }
                                    class230.field4014[var6++] = var227;
                                    continue;
                                }
                                if (var440 == 5004) {
                                    var8--;
                                    int var228 = class191.field3251[var8];
                                    int var229 = -1;
                                    if (var228 < 100 && class167.field2805[var228] != null) {
                                        var229 = class204.field3477[var228];
                                    }
                                    class191.field3251[var8++] = var229;
                                    continue;
                                }
                                if (var440 == 5005) {
                                    class191.field3251[var8++] = class185.field3155;
                                    continue;
                                }
                                if (var440 == 5008) {
                                    var6--;
                                    class227 var230 = class230.field4014[var6];
                                    if (var230.method1529(-8517, class238.field4134)) {
                                        class70.method427((byte) -113, var230);
                                        continue;
                                    }
                                    if (class78.field1365 == 0 && (class252.field4363 == 1 || class49.field858 == 1)) {
                                        continue;
                                    }
                                    class227 var231 = var230.method1525((byte) -62);
                                    class119.field2172++;
                                    byte var232 = 0;
                                    if (var231.method1529(-8517, class42.field701)) {
                                        var232 = 0;
                                        var230 = var230.method1517((byte) 114, class42.field701.method1521((byte) 12));
                                    } else if (var231.method1529(arg2 ^ 0x80002141, class160.field2706)) {
                                        var230 = var230.method1517((byte) -18, class160.field2706.method1521((byte) 112));
                                        var232 = 1;
                                    } else if (var231.method1529(-8517, client.field1448)) {
                                        var230 = var230.method1517((byte) -24, client.field1448.method1521((byte) 47));
                                        var232 = 2;
                                    } else if (var231.method1529(-8517, class260.field4530)) {
                                        var230 = var230.method1517((byte) 96, class260.field4530.method1521((byte) 7));
                                        var232 = 3;
                                    } else if (var231.method1529(-8517, class191.field3246)) {
                                        var230 = var230.method1517((byte) -30, class191.field3246.method1521((byte) 88));
                                        var232 = 4;
                                    } else if (var231.method1529(-8517, class101.field1785)) {
                                        var232 = 5;
                                        var230 = var230.method1517((byte) -51, class101.field1785.method1521((byte) 52));
                                    } else if (var231.method1529(-8517, class200.field3433)) {
                                        var232 = 6;
                                        var230 = var230.method1517((byte) -64, class200.field3433.method1521((byte) 32));
                                    } else if (var231.method1529(-8517, class71.field1245)) {
                                        var230 = var230.method1517((byte) -115, class71.field1245.method1521((byte) 68));
                                        var232 = 7;
                                    } else if (var231.method1529(-8517, class73.field1281)) {
                                        var232 = 8;
                                        var230 = var230.method1517((byte) 95, class73.field1281.method1521((byte) 41));
                                    } else if (var231.method1529(arg2 ^ 0x80002141, class76.field1323)) {
                                        var230 = var230.method1517((byte) -43, class76.field1323.method1521((byte) 124));
                                        var232 = 9;
                                    } else if (var231.method1529(-8517, class142.field2451)) {
                                        var232 = 10;
                                        var230 = var230.method1517((byte) -30, class142.field2451.method1521((byte) 104));
                                    } else if (var231.method1529(arg2 ^ 0x80002141, class256.field4481)) {
                                        var230 = var230.method1517((byte) 108, class256.field4481.method1521((byte) 65));
                                        var232 = 11;
                                    } else if (class214.field3612 != 0) {
                                        if (var231.method1529(-8517, class42.field694)) {
                                            var232 = 0;
                                            var230 = var230.method1517((byte) 117, class42.field694.method1521((byte) 67));
                                        } else if (var231.method1529(-8517, class160.field2700)) {
                                            var232 = 1;
                                            var230 = var230.method1517((byte) 111, class160.field2700.method1521((byte) 110));
                                        } else if (var231.method1529(-8517, client.field1445)) {
                                            var230 = var230.method1517((byte) 119, client.field1445.method1521((byte) 63));
                                            var232 = 2;
                                        } else if (var231.method1529(arg2 ^ 0x80002141, class260.field4537)) {
                                            var232 = 3;
                                            var230 = var230.method1517((byte) -5, class260.field4537.method1521((byte) 52));
                                        } else if (var231.method1529(arg2 ^ 0x80002141, class191.field3242)) {
                                            var232 = 4;
                                            var230 = var230.method1517((byte) 120, class191.field3242.method1521((byte) 79));
                                        } else if (var231.method1529(-8517, class101.field1782)) {
                                            var232 = 5;
                                            var230 = var230.method1517((byte) 123, class101.field1782.method1521((byte) 85));
                                        } else if (var231.method1529(-8517, class200.field3434)) {
                                            var232 = 6;
                                            var230 = var230.method1517((byte) 108, class200.field3434.method1521((byte) 106));
                                        } else if (var231.method1529(-8517, class71.field1253)) {
                                            var230 = var230.method1517((byte) -18, class71.field1253.method1521((byte) 10));
                                            var232 = 7;
                                        } else if (var231.method1529(-8517, class73.field1283)) {
                                            var232 = 8;
                                            var230 = var230.method1517((byte) 19, class73.field1283.method1521((byte) 81));
                                        } else if (var231.method1529(-8517, class76.field1320)) {
                                            var232 = 9;
                                            var230 = var230.method1517((byte) -22, class76.field1320.method1521((byte) 43));
                                        } else if (var231.method1529(arg2 ^ 0x80002141, class142.field2444)) {
                                            var232 = 10;
                                            var230 = var230.method1517((byte) -67, class142.field2444.method1521((byte) 102));
                                        } else if (var231.method1529(-8517, class256.field4483)) {
                                            var232 = 11;
                                            var230 = var230.method1517((byte) 14, class256.field4483.method1521((byte) 56));
                                        }
                                    }
                                    class227 var233 = var230.method1525((byte) -68);
                                    byte var234 = 0;
                                    if (var233.method1529(-8517, class58.field1076)) {
                                        var230 = var230.method1517((byte) 17, class58.field1076.method1521((byte) 82));
                                        var234 = 1;
                                    } else if (var233.method1529(arg2 + 2147475137, class161.field2732)) {
                                        var234 = 2;
                                        var230 = var230.method1517((byte) 123, class161.field2732.method1521((byte) 77));
                                    } else if (var233.method1529(-8517, class112.field2080)) {
                                        var230 = var230.method1517((byte) -55, class112.field2080.method1521((byte) 119));
                                        var234 = 3;
                                    } else if (var233.method1529(-8517, class220.field3716)) {
                                        var234 = 4;
                                        var230 = var230.method1517((byte) -9, class220.field3716.method1521((byte) 75));
                                    } else if (var233.method1529(-8517, class8.field161)) {
                                        var230 = var230.method1517((byte) 100, class8.field161.method1521((byte) 117));
                                        var234 = 5;
                                    } else if (class214.field3612 != 0) {
                                        if (var233.method1529(arg2 ^ 0x80002141, class58.field1077)) {
                                            var230 = var230.method1517((byte) 125, class58.field1077.method1521((byte) 5));
                                            var234 = 1;
                                        } else if (var233.method1529(-8517, class161.field2721)) {
                                            var234 = 2;
                                            var230 = var230.method1517((byte) 10, class161.field2721.method1521((byte) 67));
                                        } else if (var233.method1529(-8517, class112.field2079)) {
                                            var234 = 3;
                                            var230 = var230.method1517((byte) -100, class112.field2079.method1521((byte) 50));
                                        } else if (var233.method1529(arg2 + 2147475137, class220.field3724)) {
                                            var234 = 4;
                                            var230 = var230.method1517((byte) 118, class220.field3724.method1521((byte) 123));
                                        } else if (var233.method1529(-8517, class8.field159)) {
                                            var234 = 5;
                                            var230 = var230.method1517((byte) -65, class8.field159.method1521((byte) 111));
                                        }
                                    }
                                    class176.field2935.method664((byte) -126, 154);
                                    class176.field2935.method1443(0, 0);
                                    int var235 = class176.field2935.field3879;
                                    class176.field2935.method1443(var232, 0);
                                    class176.field2935.method1443(var234, 0);
                                    class79.method463((byte) -128, var230, class176.field2935);
                                    class176.field2935.method1464(class176.field2935.field3879 - var235, 0);
                                    continue;
                                }
                                if (var440 == 5009) {
                                    var6 -= 2;
                                    class227 var236 = class230.field4014[var6];
                                    class227 var237 = class230.field4014[var6 + 1];
                                    if (class78.field1365 != 0 || class252.field4363 != 1 && class49.field858 != 1) {
                                        class256.field4487++;
                                        class176.field2935.method664((byte) -108, 95);
                                        class176.field2935.method1443(0, 0);
                                        int var238 = class176.field2935.field3879;
                                        class176.field2935.method1457(var236.method1485(122), -80);
                                        class79.method463((byte) -128, var237, class176.field2935);
                                        class176.field2935.method1464(class176.field2935.field3879 - var238, 0);
                                    }
                                    continue;
                                }
                                if (var440 == 5010) {
                                    var8--;
                                    int var239 = class191.field3251[var8];
                                    class227 var240 = null;
                                    if (var239 < 100) {
                                        var240 = class167.field2801[var239];
                                    }
                                    if (var240 == null) {
                                        var240 = class184.field3127;
                                    }
                                    class230.field4014[var6++] = var240;
                                    continue;
                                }
                                if (var440 == 5011) {
                                    var8--;
                                    int var241 = class191.field3251[var8];
                                    class227 var242 = null;
                                    if (var241 < 100) {
                                        var242 = class195.field3324[var241];
                                    }
                                    if (var242 == null) {
                                        var242 = class184.field3127;
                                    }
                                    class230.field4014[var6++] = var242;
                                    continue;
                                }
                                if (var440 == 5012) {
                                    int var243 = -1;
                                    var8--;
                                    int var244 = class191.field3251[var8];
                                    if (var244 < 100) {
                                        var243 = class148.field2593[var244];
                                    }
                                    class191.field3251[var8++] = var243;
                                    continue;
                                }
                                if (var440 == 5015) {
                                    class227 var245;
                                    if (class216.field3639 == null || class216.field3639.field3819 == null) {
                                        var245 = class91.field1546;
                                    } else {
                                        var245 = class216.field3639.field3819;
                                    }
                                    class230.field4014[var6++] = var245;
                                    continue;
                                }
                                if (var440 == 5016) {
                                    class191.field3251[var8++] = class245.field4291;
                                    continue;
                                }
                                if (var440 == 5017) {
                                    class191.field3251[var8++] = class91.field1562;
                                    continue;
                                }
                                if (var440 == 5050) {
                                    var8--;
                                    int var246 = class191.field3251[var8];
                                    class230.field4014[var6++] = class77.method455(arg2 + 2147450885, var246).field400;
                                    continue;
                                }
                                if (var440 == 5051) {
                                    var8--;
                                    int var247 = class191.field3251[var8];
                                    class24 var248 = class77.method455(arg2 + 2147450885, var247);
                                    if (var248.field407 == null) {
                                        class191.field3251[var8++] = 0;
                                    } else {
                                        class191.field3251[var8++] = var248.field407.length;
                                    }
                                    continue;
                                }
                                if (var440 == 5052) {
                                    var8 -= 2;
                                    int var249 = class191.field3251[var8 + 1];
                                    int var250 = class191.field3251[var8];
                                    class24 var251 = class77.method455(arg2 + 2147450885, var250);
                                    int var252 = var251.field407[var249];
                                    class191.field3251[var8++] = var252;
                                    continue;
                                }
                                if (var440 == 5053) {
                                    var8--;
                                    int var253 = class191.field3251[var8];
                                    class24 var254 = class77.method455(-32769, var253);
                                    if (var254.field397 == null) {
                                        class191.field3251[var8++] = 0;
                                    } else {
                                        class191.field3251[var8++] = var254.field397.length;
                                    }
                                    continue;
                                }
                                if (var440 == 5054) {
                                    var8 -= 2;
                                    int var255 = class191.field3251[var8];
                                    int var256 = class191.field3251[var8 + 1];
                                    class191.field3251[var8++] = class77.method455(-32769, var255).field397[var256];
                                    continue;
                                }
                                if (var440 == 5055) {
                                    var8--;
                                    int var257 = class191.field3251[var8];
                                    class230.field4014[var6++] = class38.method201(var257, class249.method1666(arg2, -2147466890)).method803(false);
                                    continue;
                                }
                                if (var440 == 5056) {
                                    var8--;
                                    int var258 = class191.field3251[var8];
                                    class130 var259 = class38.method201(var258, arg2 + 2147466898);
                                    if (var259.field2264 == null) {
                                        class191.field3251[var8++] = 0;
                                    } else {
                                        class191.field3251[var8++] = var259.field2264.length;
                                    }
                                    continue;
                                }
                                if (var440 == 5057) {
                                    var8 -= 2;
                                    int var260 = class191.field3251[var8 + 1];
                                    int var261 = class191.field3251[var8];
                                    class191.field3251[var8++] = class38.method201(var261, -16756).field2264[var260];
                                    continue;
                                }
                                if (var440 == 5058) {
                                    class178.field3038 = new class58();
                                    var8--;
                                    class178.field3038.field1062 = class191.field3251[var8];
                                    class178.field3038.field1078 = class38.method201(class178.field3038.field1062, arg2 ^ 0x80004176);
                                    class178.field3038.field1065 = new int[class178.field3038.field1078.method805(1)];
                                    continue;
                                }
                                if (var440 == 5059) {
                                    class176.field2935.method664((byte) 68, 130);
                                    class195.field3327++;
                                    class176.field2935.method1443(0, 0);
                                    int var262 = class176.field2935.field3879;
                                    class176.field2935.method1443(0, 0);
                                    class176.field2935.method1451(class178.field3038.field1062, (byte) -125);
                                    class178.field3038.field1078.method796(class178.field3038.field1065, class176.field2935, (byte) -82);
                                    class176.field2935.method1464(class176.field2935.field3879 - var262, 0);
                                    continue;
                                }
                                if (var440 == 5060) {
                                    var6--;
                                    class227 var263 = class230.field4014[var6];
                                    class176.field2935.method664((byte) 65, 88);
                                    class176.field2935.method1443(0, 0);
                                    int var264 = class176.field2935.field3879;
                                    class176.field2935.method1457(var263.method1485(arg2 ^ 0x7FFFFF80), 61);
                                    class176.field2935.method1451(class178.field3038.field1062, (byte) -111);
                                    class95.field1653++;
                                    class178.field3038.field1078.method796(class178.field3038.field1065, class176.field2935, (byte) -56);
                                    class176.field2935.method1464(class176.field2935.field3879 - var264, 0);
                                    continue;
                                }
                                if (var440 == 5061) {
                                    class176.field2935.method664((byte) 32, 130);
                                    class176.field2935.method1443(0, 0);
                                    class195.field3327++;
                                    int var265 = class176.field2935.field3879;
                                    class176.field2935.method1443(1, 0);
                                    class176.field2935.method1451(class178.field3038.field1062, (byte) -113);
                                    class178.field3038.field1078.method796(class178.field3038.field1065, class176.field2935, (byte) -79);
                                    class176.field2935.method1464(class176.field2935.field3879 - var265, 0);
                                    continue;
                                }
                                if (var440 == 5062) {
                                    var8 -= 2;
                                    int var266 = class191.field3251[var8 + 1];
                                    int var267 = class191.field3251[var8];
                                    class191.field3251[var8++] = class77.method455(-32769, var267).field401[var266];
                                    continue;
                                }
                                if (var440 == 5063) {
                                    var8 -= 2;
                                    int var268 = class191.field3251[var8 + 1];
                                    int var269 = class191.field3251[var8];
                                    class191.field3251[var8++] = class77.method455(-32769, var269).field406[var268];
                                    continue;
                                }
                                if (var440 == 5064) {
                                    var8 -= 2;
                                    int var270 = class191.field3251[var8];
                                    int var271 = class191.field3251[var8 + 1];
                                    if (var271 == -1) {
                                        class191.field3251[var8++] = -1;
                                    } else {
                                        class191.field3251[var8++] = class77.method455(class249.method1666(arg2, -2147450875), var270).method118(-1, var271);
                                    }
                                    continue;
                                }
                                if (var440 == 5065) {
                                    var8 -= 2;
                                    int var272 = class191.field3251[var8];
                                    int var273 = class191.field3251[var8 + 1];
                                    if (var273 == -1) {
                                        class191.field3251[var8++] = -1;
                                    } else {
                                        class191.field3251[var8++] = class77.method455(arg2 + 2147450885, var272).method117(-120, var273);
                                    }
                                    continue;
                                }
                                if (var440 == 5066) {
                                    var8--;
                                    int var274 = class191.field3251[var8];
                                    class191.field3251[var8++] = class38.method201(var274, -16756).method805(1);
                                    continue;
                                }
                                if (var440 == 5067) {
                                    var8 -= 2;
                                    int var275 = class191.field3251[var8 + 1];
                                    int var276 = class191.field3251[var8];
                                    int var277 = class38.method201(var276, -16756).method800(124, var275);
                                    class191.field3251[var8++] = var277;
                                    continue;
                                }
                                if (var440 == 5068) {
                                    var8 -= 2;
                                    int var278 = class191.field3251[var8];
                                    int var279 = class191.field3251[var8 + 1];
                                    class178.field3038.field1065[var278] = var279;
                                    continue;
                                }
                                if (var440 == 5069) {
                                    var8 -= 2;
                                    int var280 = class191.field3251[var8];
                                    int var281 = class191.field3251[var8 + 1];
                                    class178.field3038.field1065[var280] = var281;
                                    continue;
                                }
                                if (var440 == 5070) {
                                    var8 -= 3;
                                    int var282 = class191.field3251[var8];
                                    int var283 = class191.field3251[var8 + 1];
                                    int var284 = class191.field3251[var8 + 2];
                                    class130 var285 = class38.method201(var282, arg2 ^ 0x80004176);
                                    if (var285.method800(124, var283) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class191.field3251[var8++] = var285.method801(-128, var283, var284);
                                    continue;
                                }
                            } else if (var440 < 5200) {
                                if (var440 == 5100) {
                                    if (class213.field3595[86]) {
                                        class191.field3251[var8++] = 1;
                                    } else {
                                        class191.field3251[var8++] = 0;
                                    }
                                    continue;
                                }
                                if (var440 == 5101) {
                                    if (class213.field3595[82]) {
                                        class191.field3251[var8++] = 1;
                                    } else {
                                        class191.field3251[var8++] = 0;
                                    }
                                    continue;
                                }
                                if (var440 == 5102) {
                                    if (class213.field3595[81]) {
                                        class191.field3251[var8++] = 1;
                                    } else {
                                        class191.field3251[var8++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var440 < 5300) {
                                if (var440 == 5200) {
                                    var8--;
                                    class36.method192(class191.field3251[var8], (byte) 85);
                                    continue;
                                }
                                if (var440 == 5201) {
                                    class191.field3251[var8++] = class178.method1128((byte) -72);
                                    continue;
                                }
                                if (var440 == 5202) {
                                    var8--;
                                    class60.method370(class191.field3251[var8], (byte) -126);
                                    continue;
                                }
                                if (var440 == 5203) {
                                    var6--;
                                    class58.method357(class230.field4014[var6], arg2 + 2147460492);
                                    continue;
                                }
                                if (var440 == 5204) {
                                    class230.field4014[var6 - 1] = class47.method262(class230.field4014[var6 - 1], class249.method1666(arg2, -2147460375));
                                    continue;
                                }
                                if (var440 == 5205) {
                                    var10000 = arg2 + 2147466488;
                                    var6--;
                                    class177.method1125(var10000, class230.field4014[var6]);
                                    continue;
                                }
                            } else if (var440 >= 5400) {
                                if (var440 < 5500) {
                                    if (var440 == 5400) {
                                        class21.field366++;
                                        var6 -= 2;
                                        class227 var206 = class230.field4014[var6];
                                        class227 var207 = class230.field4014[var6 + 1];
                                        var8--;
                                        int var208 = class191.field3251[var8];
                                        class176.field2935.method664((byte) -127, 118);
                                        class176.field2935.method1443(class167.method1028(var206, -16) - (-class167.method1028(var207, -117) - 1), 0);
                                        class176.field2935.method1452(var206, (byte) -63);
                                        class176.field2935.method1452(var207, (byte) -63);
                                        class176.field2935.method1443(var208, 0);
                                        continue;
                                    }
                                    if (var440 == 5401) {
                                        var8 -= 2;
                                        field2775[class191.field3251[var8]] = (short) class218.method1378(class191.field3251[var8 + 1], 113);
                                        class243.method1619(0);
                                        class257.method1748(false);
                                        class207.method1319((byte) 39);
                                        class19.method91(128);
                                        class9.method35((byte) -106);
                                        continue;
                                    }
                                    if (var440 == 5405) {
                                        var8 -= 2;
                                        int var209 = class191.field3251[var8];
                                        int var210 = class191.field3251[var8 + 1];
                                        if (var209 >= 0 && var209 < 2) {
                                            class195.field3321[var209] = new int[var210 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var440 == 5406) {
                                        var8 -= 7;
                                        int var211 = class191.field3251[var8];
                                        int var212 = class191.field3251[var8 + 1] << 1;
                                        int var213 = class191.field3251[var8 + 3];
                                        int var214 = class191.field3251[var8 + 4];
                                        int var215 = class191.field3251[var8 + 2];
                                        int var216 = class191.field3251[var8 + 6];
                                        int var217 = class191.field3251[var8 + 5];
                                        if (var211 >= 0 && var211 < 2 && class195.field3321[var211] != null && var212 >= 0 && class195.field3321[var211].length > var212) {
                                            class195.field3321[var211][var212] = new int[] { class76.method446(16383, var215 >> 14) * 128, var213, class76.method446(16383, var215) * 128, var216 };
                                            class195.field3321[var211][var212 + 1] = new int[] { class76.method446(16383, var214 >> 14) * 128, var217, class76.method446(16383, var214) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var440 == 5407) {
                                        var8--;
                                        int var218 = class195.field3321[class191.field3251[var8]].length >> 1;
                                        class191.field3251[var8++] = var218;
                                        continue;
                                    }
                                    if (var440 == 5408) {
                                        class191.field3251[var8++] = 0;
                                        continue;
                                    }
                                    if (var440 == 5409) {
                                        class58.method355(arg2 ^ 0x80000006);
                                        continue;
                                    }
                                    if (var440 == 5411) {
                                        if (class130.field2272 == null) {
                                            class105.method652(class41.method223(arg2 ^ 0x7FFFBB9D), false, -1);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var440 == 5419) {
                                        class227 var219 = class184.field3127;
                                        if (class192.field3258 != null) {
                                            var219 = class77.method458(class192.field3258.field1300, -53);
                                            try {
                                                if (class192.field3258.field1299 != null) {
                                                    byte[] var220 = ((String) class192.field3258.field1299).getBytes("ISO-8859-1");
                                                    var219 = class102.method623(0, -1, var220, var220.length);
                                                }
                                            } catch (UnsupportedEncodingException var437) {
                                            }
                                        }
                                        class230.field4014[var6++] = var219;
                                        continue;
                                    }
                                    if (var440 == 5420) {
                                        class191.field3251[var8++] = class192.field3274 == 2 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 5421) {
                                        var6--;
                                        class227 var221 = class230.field4014[var6];
                                        var8--;
                                        boolean var222 = class191.field3251[var8] == 1;
                                        class105.method652(class76.method445((byte) 76, new class227[] { class41.method223(17511), var221 }), var222, arg2 ^ 0x80000005);
                                        continue;
                                    }
                                } else if (var440 < 5600) {
                                    if (var440 == 5500) {
                                        var8 -= 4;
                                        int var194 = class191.field3251[var8];
                                        int var195 = class191.field3251[var8 + 1];
                                        int var196 = class191.field3251[var8 + 3];
                                        int var197 = class191.field3251[var8 + 2];
                                        class117.method739(false, var195, var197, (var194 >> 14 & 0x3FFF) - class192.field3267, (var194 & 0x3FFF) - class78.field1367, 128, var196);
                                        continue;
                                    }
                                    if (var440 == 5501) {
                                        var8 -= 4;
                                        int var198 = class191.field3251[var8];
                                        int var199 = class191.field3251[var8 + 1];
                                        int var200 = class191.field3251[var8 + 2];
                                        int var201 = class191.field3251[var8 + 3];
                                        method1022((var198 & 0x3FFF) - class78.field1367, var201, var199, (var198 >> 14 & 0x3FFF) - class192.field3267, var200, arg2 ^ 0x8000006A);
                                        continue;
                                    }
                                    if (var440 == 5502) {
                                        var8 -= 6;
                                        int var202 = class191.field3251[var8];
                                        if (var202 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class77.field1340 = var202;
                                        int var203 = class191.field3251[var8 + 1];
                                        if ((class195.field3321[class77.field1340].length >> 1) <= (var203 + 1)) {
                                            throw new RuntimeException();
                                        }
                                        class56.field1008 = var203;
                                        class23.field393 = 0;
                                        class180.field3085 = class191.field3251[var8 + 2];
                                        class190.field3224 = class191.field3251[var8 + 3];
                                        int var204 = class191.field3251[var8 + 4];
                                        if (var204 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        field2780 = var204;
                                        int var205 = class191.field3251[var8 + 5];
                                        if (class195.field3321[field2780].length >> 1 <= var205 + 1) {
                                            throw new RuntimeException();
                                        }
                                        client.field1447 = 3;
                                        class152.field2638 = var205;
                                        continue;
                                    }
                                    if (var440 == 5503) {
                                        class60.method366((byte) 121);
                                        continue;
                                    }
                                } else if (var440 < 5700) {
                                    if (var440 == 5600) {
                                        var6 -= 2;
                                        if (class184.field3139 == 10 && class128.field2259 == 0 && class145.field2508 == 0) {
                                            class227 var191 = class230.field4014[var6 + 1];
                                            class227 var192 = class230.field4014[var6];
                                            class169.method1041(false, var192, var191);
                                        }
                                        continue;
                                    }
                                    if (var440 == 5601) {
                                        class186.method1186(arg2 ^ 0x7FFFFFDA);
                                        continue;
                                    }
                                    if (var440 == 5602) {
                                        if (class128.field2259 == 0) {
                                            class37.field623 = -2;
                                        }
                                        continue;
                                    }
                                    if (var440 == 5603) {
                                        var8 -= 4;
                                        if (class184.field3139 == 10 && class128.field2259 == 0 && class145.field2508 == 0) {
                                            class28.method140(class191.field3251[var8 + 1], class191.field3251[var8 + 3], (byte) -14, class191.field3251[var8 + 2], class191.field3251[var8]);
                                        }
                                        continue;
                                    }
                                    if (var440 == 5604) {
                                        var6--;
                                        if (class184.field3139 == 10 && class128.field2259 == 0 && class145.field2508 == 0) {
                                            class255.method1737(class230.field4014[var6].method1485(122), 0);
                                        }
                                        continue;
                                    }
                                    if (var440 == 5605) {
                                        var8 -= 4;
                                        var6 -= 2;
                                        if (class184.field3139 == 10 && class128.field2259 == 0 && class145.field2508 == 0) {
                                            class131.method808(class191.field3251[var8], class230.field4014[var6].method1485(122), class191.field3251[var8 + 3], class230.field4014[var6 + 1], class191.field3251[var8 + 1], class191.field3251[var8 + 2], 99999);
                                        }
                                        continue;
                                    }
                                    if (var440 == 5606) {
                                        if (class145.field2508 == 0) {
                                            class257.field4505 = -2;
                                        }
                                        continue;
                                    }
                                    if (var440 == 5607) {
                                        class191.field3251[var8++] = class37.field623;
                                        continue;
                                    }
                                    if (var440 == 5608) {
                                        class191.field3251[var8++] = class88.field1519;
                                        continue;
                                    }
                                    if (var440 == 5609) {
                                        class191.field3251[var8++] = class257.field4505;
                                        continue;
                                    }
                                    if (var440 == 5610) {
                                        for (int var193 = 0; var193 < 5; var193++) {
                                            class230.field4014[var6++] = var193 >= class240.field4178.length ? class184.field3127 : class240.field4178[var193];
                                            class240.field4178[var193].method1526(30);
                                        }
                                        class240.field4178 = null;
                                        continue;
                                    }
                                } else if (var440 < 6100) {
                                    if (var440 == 6001) {
                                        var8--;
                                        int var169 = class191.field3251[var8];
                                        if (var169 < 1) {
                                            var169 = 1;
                                        }
                                        if (var169 > 4) {
                                            var169 = 4;
                                        }
                                        class125.field2242 = var169;
                                        if (class125.field2242 == 1) {
                                            class62.method385(0.9F);
                                        }
                                        if (class125.field2242 == 2) {
                                            class62.method385(0.8F);
                                        }
                                        if (class125.field2242 == 3) {
                                            class62.method385(0.7F);
                                        }
                                        if (class125.field2242 == 4) {
                                            class62.method385(0.6F);
                                        }
                                        class257.method1748(false);
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6002) {
                                        var10000 = arg2 - 2147483130;
                                        var8--;
                                        class26.method133(var10000, class191.field3251[var8] == 1);
                                        class72.method436(arg2 ^ 0x7FFFFFFA);
                                        class75.method439(arg2 - 2147483528);
                                        if (class34.method178(true) && class95.field1645) {
                                            if (class130.field2280 == null) {
                                                class130.field2280 = new byte[4][104][104];
                                            }
                                            byte var170 = (byte) (class87.field1508 - 4 & 0xFF);
                                            for (int var171 = 0; var171 < 4; var171++) {
                                                for (int var172 = 0; var172 < 104; var172++) {
                                                    for (int var173 = 0; var173 < 104; var173++) {
                                                        class130.field2280[var171][var172][var173] = var170;
                                                    }
                                                }
                                            }
                                        }
                                        class190.method1206(class61.field1123, arg2 ^ 0x5116D4F8);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6003) {
                                        var8--;
                                        class95.field1645 = class191.field3251[var8] == 1;
                                        if (class34.method178(true) && class95.field1645) {
                                            if (class130.field2280 == null) {
                                                class130.field2280 = new byte[4][104][104];
                                            }
                                            byte var174 = (byte) (class87.field1508 - 4 & 0xFF);
                                            for (int var175 = 0; var175 < 4; var175++) {
                                                for (int var176 = 0; var176 < 104; var176++) {
                                                    for (int var177 = 0; var177 < 104; var177++) {
                                                        class130.field2280[var175][var176][var177] = var174;
                                                    }
                                                }
                                            }
                                        }
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6005) {
                                        var8--;
                                        class254.field4463 = class191.field3251[var8] == 1;
                                        class75.method439(124);
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6006) {
                                        var8--;
                                        class186.field3168 = class191.field3251[var8] == 1;
                                        ((class10) class62.field1129).method45((byte) 112, !class186.field3168);
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6007) {
                                        var8--;
                                        class77.field1358 = class191.field3251[var8] == 1;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6008) {
                                        var8--;
                                        class70.field1234 = class191.field3251[var8] == 1;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6009) {
                                        var8--;
                                        class128.field2262 = class191.field3251[var8] == 1;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6010) {
                                        var8--;
                                        class220.field3721 = class191.field3251[var8] == 1;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6011) {
                                        var8--;
                                        int var178 = class191.field3251[var8];
                                        if (var178 < 0 || var178 > 2) {
                                            var178 = 0;
                                        }
                                        class221.field3753 = var178;
                                        class190.method1206(class61.field1123, arg2 ^ 0x5116D4F8);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6012) {
                                        var8--;
                                        class31.field492 = class191.field3251[var8] == 1;
                                        if (class125.field2242 == 1) {
                                            class62.method385(0.9F);
                                        }
                                        if (class125.field2242 == 2) {
                                            class62.method385(0.8F);
                                        }
                                        if (class125.field2242 == 3) {
                                            class62.method385(0.7F);
                                        }
                                        if (class125.field2242 == 4) {
                                            class62.method385(0.6F);
                                        }
                                        class75.method439(104);
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6014) {
                                        var8--;
                                        class13.field251 = class191.field3251[var8] == 1;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6015) {
                                        var8--;
                                        client.field1450 = class191.field3251[var8] == 1;
                                        class190.method1206(class61.field1123, arg2 ^ 0x5116D4F8);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6016) {
                                        var8--;
                                        int var179 = class191.field3251[var8];
                                        if (var179 < 0 || var179 > 2) {
                                            var179 = 0;
                                        }
                                        class14.field274 = var179;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6017) {
                                        var8--;
                                        class71.field1256 = class191.field3251[var8] == 1;
                                        class146.method922(906);
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6018) {
                                        var8--;
                                        int var180 = class191.field3251[var8];
                                        if (var180 < 0) {
                                            var180 = 0;
                                        }
                                        if (var180 > 127) {
                                            var180 = 127;
                                        }
                                        class193.field3294 = var180;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6019) {
                                        var8--;
                                        int var181 = class191.field3251[var8];
                                        if (var181 < 0) {
                                            var181 = 0;
                                        }
                                        if (var181 > 255) {
                                            var181 = 255;
                                        }
                                        if (class179.field3072 != var181) {
                                            if (class179.field3072 == 0 && class13.field248 != -1) {
                                                class205.method1312(class13.field248, class14.field270, (byte) 98, 0, var181, false);
                                                class171.field2869 = false;
                                            } else if (var181 == 0) {
                                                class221.method1397(arg2 ^ 0x8000007F);
                                                class171.field2869 = false;
                                            } else {
                                                class85.method513((byte) -128, var181);
                                            }
                                            class179.field3072 = var181;
                                        }
                                        class190.method1206(class61.field1123, arg2 ^ 0x5116D4F8);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6020) {
                                        var8--;
                                        int var182 = class191.field3251[var8];
                                        if (var182 < 0) {
                                            var182 = 0;
                                        }
                                        if (var182 > 127) {
                                            var182 = 127;
                                        }
                                        class248.field4311 = var182;
                                        class190.method1206(class61.field1123, 787032834);
                                        class7.field152 = false;
                                        continue;
                                    }
                                    if (var440 == 6021) {
                                        var8--;
                                        class151.field2635 = class191.field3251[var8] == 1;
                                        continue;
                                    }
                                } else if (var440 < 6200) {
                                    if (var440 == 6101) {
                                        class191.field3251[var8++] = class125.field2242;
                                        continue;
                                    }
                                    if (var440 == 6102) {
                                        class191.field3251[var8++] = class34.method178(true) ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6103) {
                                        class191.field3251[var8++] = class95.field1645 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6105) {
                                        class191.field3251[var8++] = class254.field4463 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6106) {
                                        class191.field3251[var8++] = class186.field3168 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6107) {
                                        class191.field3251[var8++] = class77.field1358 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6108) {
                                        class191.field3251[var8++] = class70.field1234 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6109) {
                                        class191.field3251[var8++] = class128.field2262 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6110) {
                                        class191.field3251[var8++] = class220.field3721 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6111) {
                                        class191.field3251[var8++] = class221.field3753;
                                        continue;
                                    }
                                    if (var440 == 6112) {
                                        class191.field3251[var8++] = class31.field492 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6114) {
                                        class191.field3251[var8++] = class13.field251 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6115) {
                                        class191.field3251[var8++] = client.field1450 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6116) {
                                        class191.field3251[var8++] = class14.field274;
                                        continue;
                                    }
                                    if (var440 == 6117) {
                                        class191.field3251[var8++] = class71.field1256 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6118) {
                                        class191.field3251[var8++] = class193.field3294;
                                        continue;
                                    }
                                    if (var440 == 6119) {
                                        class191.field3251[var8++] = class179.field3072;
                                        continue;
                                    }
                                    if (var440 == 6120) {
                                        class191.field3251[var8++] = class248.field4311;
                                        continue;
                                    }
                                    if (var440 == 6121) {
                                        class191.field3251[var8++] = 0;
                                        continue;
                                    }
                                } else if (var440 < 6300) {
                                    if (var440 == 6200) {
                                        var8 -= 2;
                                        class223.field3793 = (short) class191.field3251[var8];
                                        if (class223.field3793 <= 0) {
                                            class223.field3793 = 256;
                                        }
                                        class114.field2099 = (short) class191.field3251[var8 + 1];
                                        if (class114.field2099 <= 0) {
                                            class114.field2099 = 205;
                                        }
                                        continue;
                                    }
                                    if (var440 == 6201) {
                                        var8 -= 2;
                                        class188.field3194 = (short) class191.field3251[var8];
                                        if (class188.field3194 <= 0) {
                                            class188.field3194 = 256;
                                        }
                                        class218.field3679 = (short) class191.field3251[var8 + 1];
                                        if (class218.field3679 <= 0) {
                                            class218.field3679 = 320;
                                        }
                                        continue;
                                    }
                                    if (var440 == 6202) {
                                        var8 -= 4;
                                        class243.field4223 = (short) class191.field3251[var8];
                                        if (class243.field4223 <= 0) {
                                            class243.field4223 = 1;
                                        }
                                        class227.field3938 = (short) class191.field3251[var8 + 1];
                                        if (class227.field3938 <= 0) {
                                            class227.field3938 = 32767;
                                        } else if (class227.field3938 < class243.field4223) {
                                            class227.field3938 = class243.field4223;
                                        }
                                        class86.field1494 = (short) class191.field3251[var8 + 2];
                                        if (class86.field1494 <= 0) {
                                            class86.field1494 = 1;
                                        }
                                        class180.field3087 = (short) class191.field3251[var8 + 3];
                                        if (class180.field3087 <= 0) {
                                            class180.field3087 = 32767;
                                        } else if (class86.field1494 > class180.field3087) {
                                            class180.field3087 = class86.field1494;
                                        }
                                        continue;
                                    }
                                    if (var440 == 6203) {
                                        client.method496(false, class79.field1384.field1977, 0, class79.field1384.field1952, 0, -102);
                                        class191.field3251[var8++] = class138.field2399;
                                        class191.field3251[var8++] = class260.field4527;
                                        continue;
                                    }
                                    if (var440 == 6204) {
                                        class191.field3251[var8++] = class188.field3194;
                                        class191.field3251[var8++] = class218.field3679;
                                        continue;
                                    }
                                    if (var440 == 6205) {
                                        class191.field3251[var8++] = class223.field3793;
                                        class191.field3251[var8++] = class114.field2099;
                                        continue;
                                    }
                                } else if (var440 < 6400) {
                                    if (var440 == 6300) {
                                        class191.field3251[var8++] = (int) (class12.method57(-87) / 60000L);
                                        continue;
                                    }
                                    if (var440 == 6301) {
                                        class191.field3251[var8++] = (int) (class12.method57(-102) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var440 == 6302) {
                                        var8 -= 3;
                                        int var186 = class191.field3251[var8];
                                        int var187 = class191.field3251[var8 + 1];
                                        int var188 = class191.field3251[var8 + 2];
                                        class122.field2200.clear();
                                        class122.field2200.set(11, 12);
                                        class122.field2200.set(var188, var187, var186);
                                        class191.field3251[var8++] = (int) (class122.field2200.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var440 == 6303) {
                                        class122.field2200.clear();
                                        class122.field2200.setTime(new Date(class12.method57(-125)));
                                        class191.field3251[var8++] = class122.field2200.get(1);
                                        continue;
                                    }
                                    if (var440 == 6304) {
                                        var8--;
                                        int var189 = class191.field3251[var8];
                                        boolean var190 = true;
                                        if (var189 < 0) {
                                            var190 = ((var189 + 1) % 4) == 0;
                                        } else if (var189 < 1582) {
                                            var190 = var189 % 4 == 0;
                                        } else if ((var189 % 4) != 0) {
                                            var190 = false;
                                        } else if (var189 % 100 != 0) {
                                            var190 = true;
                                        } else if ((var189 % 400) != 0) {
                                            var190 = false;
                                        }
                                        class191.field3251[var8++] = var190 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var440 < 6500) {
                                    if (var440 == 6400) {
                                        class191.field3251[var8++] = class134.field2345 ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6401) {
                                        var6--;
                                        class227 var183 = class230.field4014[var6];
                                        var8--;
                                        int var184 = class191.field3251[var8];
                                        String var185;
                                        try {
                                            var185 = new String(var183.method1502((byte) 44), "ISO-8859-1");
                                        } catch (UnsupportedEncodingException var438) {
                                            var185 = new String(var183.method1502((byte) 44));
                                        }
                                        if (class134.field2345) {
                                            if (class97.field1706 == null) {
                                                class97.field1706 = new browsercontrol("about:blank");
                                            }
                                            class36.field592 = var184;
                                            class97.field1706.navigate(var185);
                                            class5.field114 = true;
                                        }
                                        continue;
                                    }
                                    if (var440 == 6402) {
                                        if (class97.field1706 != null) {
                                            class97.field1706.navigate("about:blank");
                                            class5.field114 = true;
                                            class36.field592 = 0;
                                        }
                                        continue;
                                    }
                                    if (var440 == 6403) {
                                        class230.field4014[var6++] = class213.field3603;
                                        continue;
                                    }
                                    if (var440 == 6404) {
                                        class230.field4014[var6++] = class182.field3113;
                                        continue;
                                    }
                                    if (var440 == 6405) {
                                        class191.field3251[var8++] = class249.method1665(true) ? 1 : 0;
                                        continue;
                                    }
                                    if (var440 == 6406) {
                                        class191.field3251[var8++] = class175.method1118(4205) ? 1 : 0;
                                        continue;
                                    }
                                }
                            } else if (var440 == 5304) {
                                class191.field3251[var8++] = 0;
                                continue;
                            }
                        } else if (var440 == 4500) {
                            var8 -= 2;
                            int var286 = class191.field3251[var8];
                            int var287 = class191.field3251[var8 + 1];
                            class123 var288 = class184.method1171(var287, 11);
                            if (var288.method763((byte) 5)) {
                                class230.field4014[var6++] = class27.method136(12, var286).method1536(var288.field2219, var287, 127);
                            } else {
                                class191.field3251[var8++] = class27.method136(12, var286).method1535(var288.field2220, var287, 125);
                            }
                            continue;
                        }
                    } else if (var440 == 4400) {
                        var8 -= 2;
                        int var289 = class191.field3251[var8];
                        int var290 = class191.field3251[var8 + 1];
                        class123 var291 = class184.method1171(var290, 11);
                        if (var291.method763((byte) 5)) {
                            class230.field4014[var6++] = class220.method1389(var289, (byte) 125).method240(-2, var291.field2219, var290);
                        } else {
                            class191.field3251[var8++] = class220.method1389(var289, (byte) -103).method251(var290, class249.method1666(arg2, -269656782), var291.field2220);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var439) {
            if (var5.field3429 == null) {
                if (class169.field2832 != 0) {
                    class130.method799(1403, 0, class184.field3127, class89.field1541);
                }
                class149.method949("CS2 - scr:" + var5.field1113 + " op:" + var11, var439, arg2 ^ 0x80000077);
            } else {
                class227 var434 = class223.method1407(30, 0);
                var434.method1486(false, class131.field2290).method1486(false, var5.field3429);
                for (int var435 = class156.field2680 - 1; var435 >= 0; var435--) {
                    var434.method1486(false, class162.field2755).method1486(false, class11.field221[var435].field474.field3429);
                }
                if (var11 == 40) {
                    int var436 = var9[var7];
                    var434.method1486(false, class3.field35).method1486(false, class204.method1303(var436, 1));
                }
                if (class169.field2832 != 0) {
                    class130.method799(arg2 - 2147482239, 0, class184.field3127, class76.method445((byte) 112, new class227[] { class42.field696, var5.field3429 }));
                }
                class149.method949("CS2 - scr:" + var5.field1113 + " op:" + var11 + new String(var434.method1502((byte) 44)), var439, -115);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
    public static final int method1025(int arg0) {
        field2778++;
        if (arg0 > -23) {
            field2775 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Luc;)V")
    public class166(class220 arg0) {
        this.field2777 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public static final void method1026(int arg0) {
        field2774++;
        if (arg0 != 12777) {
            return;
        }
        int var1 = class69.field1219;
        int var2 = class96.field1667;
        int var3 = class186.field3165;
        int var4 = class25.field415;
        int var5 = 6116423;
        class111.method694(var1, var2, var3, var4, var5);
        class111.method694(var1 + 1, var2 - -1, var3 - 2, 16, 0);
        class111.method705(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class260.field4532.method1262(class216.field3648, var1 + 3, var2 + 14, var5, -1);
        int var6 = client.field1451;
        int var7 = class100.field1752;
        for (int var8 = 0; var8 < class94.field1631; var8++) {
            int var9 = (class94.field1631 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && (var1 + var3) > var7 && var6 > (var9 - 13) && var6 < (var9 + 3)) {
                var10 = 16776960;
            }
            class260.field4532.method1262(class125.method770(var8, (byte) -128), var1 + 3, var9, var10, 0);
        }
        class115.method731(class69.field1219, class186.field3165, class96.field1667, 60, class25.field415);
    }
}
