import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class142 {

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    private int field2040 = 0;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "J")
    private long field2063 = -1L;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "J")
    private long field2051 = -1L;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "Lde;")
    private class161 field2060;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "J")
    private long field2047;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "J")
    private long field2061;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[B")
    private byte[] field2041;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "J")
    private long field2052;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "[B")
    private byte[] field2056;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field2039 = 0;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2057 = "glow3:";

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "J")
    private long field2049;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lbj;")
    public static class173 field2042;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lam;")
    public static final class129 method954(int arg0, int arg1) {
        field2054++;
        class129 var2 = (class129) class286.field4383.method945((long) arg0, true);
        if (arg1 != 12192) {
            field2039 = 121;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field377.method1605(-127, arg0, 33);
        class129 var4 = new class129();
        if (var3 != null) {
            var4.method888(arg0, new class54(var3), 0);
        }
        class286.field4383.method941(var4, (long) arg0, -8447);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI)V")
    public final void method955(long arg0, int arg1) throws IOException {
        field2037++;
        if (arg1 != 23010) {
            this.method968((byte) -19);
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method961(true));
        }
        this.field2052 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B[B)V")
    public final void method956(byte arg0, byte[] arg1) throws IOException {
        if (arg0 != 18) {
            this.field2041 = null;
        }
        field2044++;
        this.method960(arg1, 0, arg0 ^ 0xFFFF8C6F, arg1.length);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljc;Z)V")
    public static final void method957(class201 arg0, boolean arg1) {
        class29.field531.method1881(arg0, (byte) -56);
        while (true) {
            class201 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class201[][] var7;
            class201 var66;
            do {
                class201 var65;
                do {
                    class201 var64;
                    do {
                        class201 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class201) class29.field531.method1888(true);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3016);
                                            var3 = var2.field3028;
                                            var4 = var2.field3022;
                                            var5 = var2.field3018;
                                            var6 = var2.field3032;
                                            var7 = class3.field40[var5];
                                            if (!var2.field3034) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class201 var8 = class3.field40[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3016) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class197.field2977 && var3 > class223.field3473) {
                                                    class201 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3016 && (var9.field3034 || (var2.field3036 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class197.field2977 && var3 < class106.field1562 - 1) {
                                                    class201 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3016 && (var10.field3034 || (var2.field3036 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class3.field47 && var4 > class223.field3466) {
                                                    class201 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3016 && (var11.field3034 || (var2.field3036 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class3.field47 && var4 < class113.field1732 - 1) {
                                                    class201 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3016 && (var12.field3034 || (var2.field3036 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3034 = false;
                                            if (var2.field3017 != null) {
                                                class201 var13 = var2.field3017;
                                                if (var13.field3023 == null) {
                                                    if (var13.field3015 != null) {
                                                        if (class179.method1179(0, var3, var4)) {
                                                            class18.method131(var13.field3015, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, true);
                                                        } else {
                                                            class18.method131(var13.field3015, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class179.method1179(0, var3, var4)) {
                                                    class178.method1174(var13.field3023, 0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, true);
                                                } else {
                                                    class178.method1174(var13.field3023, 0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, false);
                                                }
                                                class176 var14 = var13.field3024;
                                                if (var14 != null) {
                                                    var14.field2575.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var14.field2573 - class251.field3892, var14.field2590 - class127.field1863, var14.field2588 - class135.field1979, var14.field2583, var5, (class31) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field3026; var15++) {
                                                    class128 var16 = var13.field3037[var15];
                                                    if (var16 != null) {
                                                        var16.field1874.method22(var16.field1881, class153.field2241, class69.field1140, class185.field2692, class44.field772, var16.field1883 - class251.field3892, var16.field1884 - class127.field1863, var16.field1873 - class135.field1979, var16.field1880, var5, (class31) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3023 == null) {
                                                if (var2.field3015 != null) {
                                                    if (class179.method1179(var6, var3, var4)) {
                                                        class18.method131(var2.field3015, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class18.method131(var2.field3015, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, false);
                                                    }
                                                }
                                            } else if (class179.method1179(var6, var3, var4)) {
                                                class178.method1174(var2.field3023, var6, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field3023.field3070 != 12345678 || class248.field3852 && var5 <= class23.field373) {
                                                    class178.method1174(var2.field3023, var6, class153.field2241, class69.field1140, class185.field2692, class44.field772, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class29 var18 = var2.field3033;
                                                if (var18 != null && (var18.field534 & 0x80000000L) != 0L) {
                                                    var18.field533.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var18.field538 - class251.field3892, var18.field530 - class127.field1863, var18.field532 - class135.field1979, var18.field534, var5, (class31) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class176 var21 = var2.field3024;
                                            class67 var22 = var2.field3025;
                                            if (var21 != null || var22 != null) {
                                                if (class197.field2977 == var3) {
                                                    var19++;
                                                } else if (class197.field2977 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class3.field47 == var4) {
                                                    var19 += 3;
                                                } else if (class3.field47 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class130.field1909[var19];
                                                var2.field3029 = class261.field4021[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2589 & class284.field4358[var19]) == 0) {
                                                    var2.field3019 = 0;
                                                } else if (var21.field2589 == 16) {
                                                    var2.field3019 = 3;
                                                    var2.field3030 = class296.field4517[var19];
                                                    var2.field3021 = 3 - var2.field3030;
                                                } else if (var21.field2589 == 32) {
                                                    var2.field3019 = 6;
                                                    var2.field3030 = class8.field102[var19];
                                                    var2.field3021 = 6 - var2.field3030;
                                                } else if (var21.field2589 == 64) {
                                                    var2.field3019 = 12;
                                                    var2.field3030 = class286.field4387[var19];
                                                    var2.field3021 = 12 - var2.field3030;
                                                } else {
                                                    var2.field3019 = 9;
                                                    var2.field3030 = class243.field3766[var19];
                                                    var2.field3021 = 9 - var2.field3030;
                                                }
                                                if ((var21.field2589 & var20) != 0 && !class281.method1867(var6, var3, var4, var21.field2589)) {
                                                    var21.field2575.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var21.field2573 - class251.field3892, var21.field2590 - class127.field1863, var21.field2588 - class135.field1979, var21.field2583, var5, (class31) null);
                                                }
                                                if ((var21.field2582 & var20) != 0 && !class281.method1867(var6, var3, var4, var21.field2582)) {
                                                    var21.field2580.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var21.field2573 - class251.field3892, var21.field2590 - class127.field1863, var21.field2588 - class135.field1979, var21.field2583, var5, (class31) null);
                                                }
                                            }
                                            if (var22 != null && !class253.method1716(var6, var3, var4, var22.field1112.method19())) {
                                                if ((var22.field1098 & var20) != 0) {
                                                    var22.field1112.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var22.field1107 + var22.field1111 - class251.field3892, var22.field1117 - class127.field1863, var22.field1113 + var22.field1101 - class135.field1979, var22.field1110, var5, (class31) null);
                                                } else if (var22.field1098 == 256) {
                                                    int var23 = var22.field1107 - class251.field3892;
                                                    int var24 = var22.field1117 - class127.field1863;
                                                    int var25 = var22.field1113 - class135.field1979;
                                                    int var26 = var22.field1106;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field1112.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var22.field1111 + var23, var24, var22.field1101 + var25, var22.field1110, var5, (class31) null);
                                                    } else if (var22.field1102 != null) {
                                                        var22.field1102.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var23, var24, var25, var22.field1110, var5, (class31) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class29 var29 = var2.field3033;
                                                if (var29 != null && (var29.field534 & 0x80000000L) == 0L) {
                                                    var29.field533.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var29.field538 - class251.field3892, var29.field530 - class127.field1863, var29.field532 - class135.field1979, var29.field534, var5, (class31) null);
                                                }
                                                class101 var30 = var2.field3035;
                                                if (var30 != null && var30.field1472 == 0) {
                                                    if (var30.field1476 != null) {
                                                        var30.field1476.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var30.field1469 - class251.field3892, var30.field1473 - class127.field1863, var30.field1475 - class135.field1979, var30.field1478, var5, (class31) null);
                                                    }
                                                    if (var30.field1480 != null) {
                                                        var30.field1480.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var30.field1469 - class251.field3892, var30.field1473 - class127.field1863, var30.field1475 - class135.field1979, var30.field1478, var5, (class31) null);
                                                    }
                                                    if (var30.field1467 != null) {
                                                        var30.field1467.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var30.field1469 - class251.field3892, var30.field1473 - class127.field1863, var30.field1475 - class135.field1979, var30.field1478, var5, (class31) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field3036;
                                            if (var31 != 0) {
                                                if (var3 < class197.field2977 && (var31 & 0x4) != 0) {
                                                    class201 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field3016) {
                                                        class29.field531.method1881(var32, (byte) -56);
                                                    }
                                                }
                                                if (var4 < class3.field47 && (var31 & 0x2) != 0) {
                                                    class201 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field3016) {
                                                        class29.field531.method1881(var33, (byte) -56);
                                                    }
                                                }
                                                if (var3 > class197.field2977 && (var31 & 0x1) != 0) {
                                                    class201 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field3016) {
                                                        class29.field531.method1881(var34, (byte) -56);
                                                    }
                                                }
                                                if (var4 > class3.field47 && (var31 & 0x8) != 0) {
                                                    class201 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field3016) {
                                                        class29.field531.method1881(var35, (byte) -56);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3019 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field3026; var37++) {
                                                if (class104.field1534 != var2.field3037[var37].field1871 && (var2.field3020[var37] & var2.field3019) == var2.field3030) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class176 var38 = var2.field3024;
                                                if (!class281.method1867(var6, var3, var4, var38.field2589)) {
                                                    var38.field2575.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var38.field2573 - class251.field3892, var38.field2590 - class127.field1863, var38.field2588 - class135.field1979, var38.field2583, var5, (class31) null);
                                                }
                                                var2.field3019 = 0;
                                            }
                                        }
                                        if (!var2.field3031) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field3026;
                                            var2.field3031 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class128 var42 = var2.field3037[var41];
                                                if (class104.field1534 != var42.field1871) {
                                                    for (int var43 = var42.field1882; var43 <= var42.field1879; var43++) {
                                                        for (int var44 = var42.field1870; var44 <= var42.field1876; var44++) {
                                                            class201 var45 = var7[var43][var44];
                                                            if (var45.field3034) {
                                                                var2.field3031 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field3019 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1882) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1879) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1870) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1876) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field3019) == var2.field3021) {
                                                                    var2.field3031 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class45.field779[var40++] = var42;
                                                    int var47 = class197.field2977 - var42.field1882;
                                                    int var48 = var42.field1879 - class197.field2977;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class3.field47 - var42.field1870;
                                                    int var50 = var42.field1876 - class3.field47;
                                                    if (var50 > var49) {
                                                        var42.field1886 = var47 + var50;
                                                    } else {
                                                        var42.field1886 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class128 var54 = class45.field779[var53];
                                                    if (class104.field1534 != var54.field1871) {
                                                        if (var54.field1886 > var51) {
                                                            var51 = var54.field1886;
                                                            var52 = var53;
                                                        } else if (var54.field1886 == var51) {
                                                            int var55 = var54.field1883 - class251.field3892;
                                                            int var56 = var54.field1873 - class135.field1979;
                                                            int var57 = class45.field779[var52].field1883 - class251.field3892;
                                                            int var58 = class45.field779[var52].field1873 - class135.field1979;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class128 var59 = class45.field779[var52];
                                                var59.field1871 = class104.field1534;
                                                if (!class273.method1825(var6, var59.field1882, var59.field1879, var59.field1870, var59.field1876, var59.field1874.method19())) {
                                                    var59.field1874.method22(var59.field1881, class153.field2241, class69.field1140, class185.field2692, class44.field772, var59.field1883 - class251.field3892, var59.field1884 - class127.field1863, var59.field1873 - class135.field1979, var59.field1880, var5, (class31) null);
                                                }
                                                for (int var60 = var59.field1882; var60 <= var59.field1879; var60++) {
                                                    for (int var61 = var59.field1870; var61 <= var59.field1876; var61++) {
                                                        class201 var62 = var7[var60][var61];
                                                        if (var62.field3019 != 0) {
                                                            class29.field531.method1881(var62, (byte) -56);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field3016) {
                                                            class29.field531.method1881(var62, (byte) -56);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3031) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field3031 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3016);
                            } while (var2.field3019 != 0);
                            if (var3 > class197.field2977 || var3 <= class223.field3473) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field3016);
                        if (var3 < class197.field2977 || var3 >= class106.field1562 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field3016);
                    if (var4 > class3.field47 || var4 <= class223.field3466) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field3016);
                if (var4 < class3.field47 || var4 >= class113.field1732 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field3016);
            var2.field3016 = false;
            class176.field2574--;
            class101 var67 = var2.field3035;
            if (var67 != null && var67.field1472 != 0) {
                if (var67.field1476 != null) {
                    var67.field1476.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var67.field1469 - class251.field3892, var67.field1473 - class127.field1863 - var67.field1472, var67.field1475 - class135.field1979, var67.field1478, var5, (class31) null);
                }
                if (var67.field1480 != null) {
                    var67.field1480.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var67.field1469 - class251.field3892, var67.field1473 - class127.field1863 - var67.field1472, var67.field1475 - class135.field1979, var67.field1478, var5, (class31) null);
                }
                if (var67.field1467 != null) {
                    var67.field1467.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var67.field1469 - class251.field3892, var67.field1473 - class127.field1863 - var67.field1472, var67.field1475 - class135.field1979, var67.field1478, var5, (class31) null);
                }
            }
            if (var2.field3029 != 0) {
                class67 var68 = var2.field3025;
                if (var68 != null && !class253.method1716(var6, var3, var4, var68.field1112.method19())) {
                    if ((var68.field1098 & var2.field3029) != 0) {
                        var68.field1112.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var68.field1107 + var68.field1111 - class251.field3892, var68.field1117 - class127.field1863, var68.field1113 + var68.field1101 - class135.field1979, var68.field1110, var5, (class31) null);
                    } else if (var68.field1098 == 256) {
                        int var69 = var68.field1107 - class251.field3892;
                        int var70 = var68.field1117 - class127.field1863;
                        int var71 = var68.field1113 - class135.field1979;
                        int var72 = var68.field1106;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field1112.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var68.field1111 + var69, var70, var68.field1101 + var71, var68.field1110, var5, (class31) null);
                        } else if (var68.field1102 != null) {
                            var68.field1102.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var69, var70, var71, var68.field1110, var5, (class31) null);
                        }
                    }
                }
                class176 var75 = var2.field3024;
                if (var75 != null) {
                    if ((var75.field2582 & var2.field3029) != 0 && !class281.method1867(var6, var3, var4, var75.field2582)) {
                        var75.field2580.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var75.field2573 - class251.field3892, var75.field2590 - class127.field1863, var75.field2588 - class135.field1979, var75.field2583, var5, (class31) null);
                    }
                    if ((var75.field2589 & var2.field3029) != 0 && !class281.method1867(var6, var3, var4, var75.field2589)) {
                        var75.field2575.method22(0, class153.field2241, class69.field1140, class185.field2692, class44.field772, var75.field2573 - class251.field3892, var75.field2590 - class127.field1863, var75.field2588 - class135.field1979, var75.field2583, var5, (class31) null);
                    }
                }
            }
            if (var5 < class43.field771 - 1) {
                class201 var76 = class3.field40[var5 + 1][var3][var4];
                if (var76 != null && var76.field3016) {
                    class29.field531.method1881(var76, (byte) -56);
                }
            }
            if (var3 < class197.field2977) {
                class201 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field3016) {
                    class29.field531.method1881(var77, (byte) -56);
                }
            }
            if (var4 < class3.field47) {
                class201 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field3016) {
                    class29.field531.method1881(var78, (byte) -56);
                }
            }
            if (var3 > class197.field2977) {
                class201 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field3016) {
                    class29.field531.method1881(var79, (byte) -56);
                }
            }
            if (var4 > class3.field47) {
                class201 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field3016) {
                    class29.field531.method1881(var80, (byte) -56);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILgk;)V")
    public static final void method958(int arg0, class224 arg1) {
        if (arg0 >= -79) {
            return;
        }
        field2045++;
        class269 var2 = (class269) class251.field3887.method306(class37.method286(25077, arg1.field3488), 16216);
        if (var2 == null) {
            return;
        }
        if (var2.field4198 != null) {
            class108.field1581.method908(var2.field4198);
            var2.field4198 = null;
        }
        var2.method1193(124);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIZI)V")
    public final void method959(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        field2062++;
        try {
            if (!arg2) {
                this.field2036 = -107;
            }
            if ((long) arg3 + this.field2052 > this.field2061) {
                this.field2061 = (long) arg3 + this.field2052;
            }
            if (this.field2063 != -1L && (this.field2052 < this.field2063 || ((long) this.field2040 + this.field2063) < this.field2052)) {
                this.method964(-10922);
            }
            if (this.field2063 != -1L && (long) arg3 + this.field2052 > this.field2063 - -((long) this.field2056.length)) {
                int var5 = (int) ((long) this.field2056.length + this.field2063 - this.field2052);
                arg3 -= var5;
                class41.method335(arg0, arg1, this.field2056, (int) (this.field2052 - this.field2063), var5);
                arg1 += var5;
                this.field2052 += (long) var5;
                this.field2040 = this.field2056.length;
                this.method964(-10922);
            }
            if (arg3 > this.field2056.length) {
                long var6 = -1L;
                if (this.field2052 != this.field2049) {
                    this.field2060.method1085(this.field2052, 127);
                    this.field2049 = this.field2052;
                }
                this.field2060.method1088(-1, arg0, arg3, arg1);
                if (this.field2051 <= this.field2052 && this.field2052 < ((long) this.field2036 + this.field2051)) {
                    var6 = this.field2052;
                } else if (this.field2051 >= this.field2052 && this.field2051 < this.field2052 + ((long) arg3)) {
                    var6 = this.field2051;
                }
                this.field2049 += (long) arg3;
                if (this.field2049 > this.field2047) {
                    this.field2047 = this.field2049;
                }
                long var8 = -1L;
                if (this.field2051 < ((long) arg3 + this.field2052) && ((long) arg3 + this.field2052) <= ((long) this.field2036 + this.field2051)) {
                    var8 = (long) arg3 + this.field2052;
                } else if (this.field2052 < (long) this.field2036 + this.field2051 && this.field2052 + ((long) arg3) >= this.field2051 - -((long) this.field2036)) {
                    var8 = (long) this.field2036 + this.field2051;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class41.method335(arg0, (int) ((long) arg1 + var6 - this.field2052), this.field2041, (int) (var6 - this.field2051), var10);
                }
                this.field2052 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field2063 == -1L) {
                    this.field2063 = this.field2052;
                }
                class41.method335(arg0, arg1, this.field2056, (int) (this.field2052 - this.field2063), arg3);
                this.field2052 += (long) arg3;
                if ((this.field2052 - this.field2063) > ((long) this.field2040)) {
                    this.field2040 = (int) (this.field2052 - this.field2063);
                }
            }
        } catch (IOException var12) {
            this.field2049 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([BIII)V")
    public final void method960(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 != -29571) {
            method963(-102, 91, 12);
        }
        field2050++;
        try {
            if (arg0.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field2063 != -1L && this.field2052 >= this.field2063 && ((long) this.field2040 + this.field2063) >= ((long) arg3 + this.field2052)) {
                class41.method335(this.field2056, (int) (this.field2052 - this.field2063), arg0, arg1, arg3);
                this.field2052 += (long) arg3;
                return;
            }
            int var5 = arg1;
            int var6 = arg3;
            long var7 = this.field2052;
            if (this.field2052 >= this.field2051 && this.field2052 < (long) this.field2036 + this.field2051) {
                int var9 = (int) ((long) this.field2036 + this.field2051 - this.field2052);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class41.method335(this.field2041, (int) (this.field2052 - this.field2051), arg0, arg1, var9);
                arg3 -= var9;
                arg1 += var9;
                this.field2052 += (long) var9;
            }
            if (this.field2041.length < arg3) {
                this.field2060.method1085(this.field2052, arg2 + 29698);
                this.field2049 = this.field2052;
                while (arg3 > 0) {
                    int var11 = this.field2060.method1086(-1, arg1, arg0, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2049 += (long) var11;
                    arg3 -= var11;
                    this.field2052 += (long) var11;
                    arg1 += var11;
                }
            } else if (arg3 > 0) {
                int var10 = arg3;
                this.method967((byte) -61);
                if (arg3 > this.field2036) {
                    var10 = this.field2036;
                }
                class41.method335(this.field2041, 0, arg0, arg1, var10);
                arg3 -= var10;
                this.field2052 += (long) var10;
                arg1 += var10;
            }
            if (this.field2063 != -1L) {
                if (this.field2052 < this.field2063 && arg3 > 0) {
                    int var12 = (int) (this.field2063 - this.field2052) + arg1;
                    if ((arg1 + arg3) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg0[arg1++] = 0;
                        this.field2052++;
                    }
                }
                long var13 = -1L;
                if (var7 <= this.field2063 && ((long) var6 + var7) > this.field2063) {
                    var13 = this.field2063;
                } else if (this.field2063 <= var7 && var7 < ((long) this.field2040 + this.field2063)) {
                    var13 = var7;
                }
                long var15 = -1L;
                if (((long) this.field2040 + this.field2063) > var7 && (this.field2063 + ((long) this.field2040)) <= (var7 + ((long) var6))) {
                    var15 = (long) this.field2040 + this.field2063;
                } else if ((long) var6 + var7 > this.field2063 && (this.field2063 + ((long) this.field2040)) >= ((long) var6 + var7)) {
                    var15 = (long) var6 + var7;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class41.method335(this.field2056, (int) (var13 - this.field2063), arg0, (int) (var13 - var7) + var5, var17);
                    if (var15 > this.field2052) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2052));
                        this.field2052 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2049 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method961(boolean arg0) {
        field2058++;
        return arg0 ? this.field2060.method1084(0) : null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method962(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0 && arg6 >= 0 && arg0 < 103 && arg6 < 103) {
            if (arg7 == 0) {
                class176 var8 = class208.method1375(arg1, arg0, arg6);
                if (var8 != null) {
                    int var9 = (int) (var8.field2583 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 2) {
                        var8.field2575 = new class109(var9, 2, arg4 + 4, arg1, arg0, arg6, arg3, false, var8.field2575);
                        var8.field2580 = new class109(var9, 2, arg4 + 1 & 0x3, arg1, arg0, arg6, arg3, false, var8.field2580);
                    } else {
                        var8.field2575 = new class109(var9, arg5, arg4, arg1, arg0, arg6, arg3, false, var8.field2575);
                    }
                }
            }
            if (arg7 == 1) {
                class67 var10 = class7.method64(arg1, arg0, arg6);
                if (var10 != null) {
                    int var11 = (int) (var10.field1110 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field1112 = new class109(var11, 4, arg4, arg1, arg0, arg6, arg3, false, var10.field1112);
                    } else if (arg5 == 6) {
                        var10.field1112 = new class109(var11, 4, arg4 + 4, arg1, arg0, arg6, arg3, false, var10.field1112);
                    } else if (arg5 == 7) {
                        var10.field1112 = new class109(var11, 4, (arg4 + 2 & 0x3) + 4, arg1, arg0, arg6, arg3, false, var10.field1112);
                    } else if (arg5 == 8) {
                        var10.field1112 = new class109(var11, 4, arg4 + 4, arg1, arg0, arg6, arg3, false, var10.field1112);
                        var10.field1102 = new class109(var11, 4, (arg4 + 2 & 0x3) + 4, arg1, arg0, arg6, arg3, false, var10.field1102);
                    }
                }
            }
            if (arg7 == 2) {
                if (arg5 == 11) {
                    arg5 = 10;
                }
                class128 var12 = class190.method1272(arg1, arg0, arg6);
                if (var12 != null) {
                    var12.field1874 = new class109(Integer.MAX_VALUE & (int) (var12.field1880 >>> 32), arg5, arg4, arg1, arg0, arg6, arg3, false, var12.field1874);
                }
            }
            if (arg7 == 3) {
                class29 var13 = class16.method117(arg1, arg0, arg6);
                if (var13 != null) {
                    var13.field533 = new class109(Integer.MAX_VALUE & (int) (var13.field534 >>> 32), 22, arg4, arg1, arg0, arg6, arg3, false, var13.field533);
                }
            }
        }
        field2038++;
        if (arg2 != -82) {
            method965(42, (class237) null, (class237) null);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Z")
    public static final boolean method963(int arg0, int arg1, int arg2) {
        field2053++;
        if (arg1 <= 75) {
            return false;
        }
        class188 var3 = class3.method42(79, arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method1239((byte) 69, arg2);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    private final void method964(int arg0) throws IOException {
        if (this.field2063 != -1L) {
            long var2 = -1L;
            if (this.field2063 != this.field2049) {
                this.field2060.method1085(this.field2063, 120);
                this.field2049 = this.field2063;
            }
            this.field2060.method1088(-1, this.field2056, this.field2040, 0);
            if (this.field2051 <= this.field2063 && ((long) this.field2036 + this.field2051) > this.field2063) {
                var2 = this.field2063;
            } else if (this.field2051 >= this.field2063 && (long) this.field2040 + this.field2063 > this.field2051) {
                var2 = this.field2051;
            }
            this.field2049 += (long) this.field2040;
            long var4 = -1L;
            if (this.field2047 < this.field2049) {
                this.field2047 = this.field2049;
            }
            if (((long) this.field2040 + this.field2063) > this.field2051 && (long) this.field2040 + this.field2063 <= (long) this.field2036 + this.field2051) {
                var4 = this.field2063 + ((long) this.field2040);
            } else if (this.field2063 < (this.field2051 + ((long) this.field2036)) && (long) this.field2036 + this.field2051 <= (long) this.field2040 + this.field2063) {
                var4 = this.field2051 + ((long) this.field2036);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class41.method335(this.field2056, (int) (var2 - this.field2063), this.field2041, (int) (var2 - this.field2051), var6);
            }
            this.field2063 = -1L;
            this.field2040 = 0;
        }
        if (arg0 != -10922) {
            this.field2041 = null;
        }
        field2055++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILpk;Lpk;)V")
    public static final void method965(int arg0, class237 arg1, class237 arg2) {
        class24.field390 = arg1;
        class216.field3316 = arg2;
        field2059++;
        class216.field3316.method1614(0, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class69.field1148 = var3 + var6;
        if (arg0 != -14189) {
            method954(72, 28);
        }
        class177.field2595 = var5 + var6;
        class51.field839 = var4 + var6;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method966(int arg0) {
        if (arg0 == 12) {
            field2057 = null;
            field2042 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    private final void method967(byte arg0) throws IOException {
        if (arg0 != -61) {
            this.field2040 = -86;
        }
        field2043++;
        this.field2036 = 0;
        if (this.field2052 != this.field2049) {
            this.field2060.method1085(this.field2052, arg0 ^ 0xFFFFFFBC);
            this.field2049 = this.field2052;
        }
        this.field2051 = this.field2052;
        while (this.field2036 < this.field2041.length) {
            int var2 = this.field2041.length - this.field2036;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2060.method1086(-1, this.field2036, this.field2041, var2);
            if (var3 == -1) {
                break;
            }
            this.field2036 += var3;
            this.field2049 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)J")
    public final long method968(byte arg0) {
        field2048++;
        int var2 = 97 / ((arg0 - 36) / 32);
        return this.field2061;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZB)V")
    public static final void method969(boolean arg0, byte arg1) {
        class195.method1316(-108);
        field2046++;
        if (class42.field742 != 30 && class42.field742 != 25) {
            return;
        }
        class39.field691++;
        if (class39.field691 < 50 && !arg0) {
            return;
        }
        class39.field691 = 0;
        if (arg1 != 107) {
            field2057 = null;
        }
        if (!class125.field1846 && class22.field369 != null) {
            class59.field964.method1540(183, (byte) -2);
            class121.field1803++;
            try {
                class22.field369.method1715(class59.field964.field848, 109, 0, class59.field964.field887);
                class59.field964.field887 = 0;
            } catch (IOException var2) {
                class125.field1846 = true;
            }
        }
        class195.method1316(-55);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lde;II)V")
    public class142(class161 arg0, int arg1, int arg2) throws IOException {
        this.field2060 = arg0;
        this.field2061 = this.field2047 = arg0.method1089((byte) -119);
        this.field2041 = new byte[arg1];
        this.field2052 = 0L;
        this.field2056 = new byte[arg2];
    }
}
