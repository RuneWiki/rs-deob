import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 {

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lgf;")
    private class48 field2053 = new class48(256);

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lgf;")
    private class48 field2070 = new class48(256);

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lla;")
    private class77 field2065;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lla;")
    private class77 field2064;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lv;")
    private static class146 field2051 = class159.method1226((byte) -37, "This computers address has been blocked");

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lv;")
    public static class146 field2063 = field2051;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lhc;")
    public static class52 field2060 = null;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lv;")
    public static class146 field2056 = class159.method1226((byte) -37, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lv;")
    public static class146 field2068 = class159.method1226((byte) -37, ")2");

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lv;")
    private static class146 field2069 = class159.method1226((byte) -37, "Unable to find ");

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lv;")
    public static class146 field2062 = field2069;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lvf;")
    public static class152 field2057 = new class152();

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2071 = 0;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field2073 = 0;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2072 = new CRC32();

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static volatile int field2074 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Z")
    public static boolean field2075;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIZ)V")
    public static final void method691(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class151.field3485 = 0;
        for (int var5 = -1; var5 < class91.field2171 + class126.field2925; var5++) {
            class35 var21;
            if (var5 == -1) {
                var21 = class116.field2696;
            } else if (class126.field2925 <= var5) {
                var21 = class34.field735[class57.field1271[var5 - class126.field2925]];
            } else {
                var21 = class125.field2902[class136.field3080[var5]];
            }
            if (var21 != null && var21.method235(-118)) {
                if (var21 instanceof class38) {
                    class79 var22 = ((class38) var21).field849;
                    if (var22.field1935 != null) {
                        var22 = var22.method603(false);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (var5 >= class126.field2925) {
                    class79 var23 = ((class38) var21).field849;
                    if (var23.field1935 != null) {
                        var23 = var23.method603(false);
                    }
                    if (var23.field1914 >= 0 && class137.field3107.length > var23.field1914) {
                        class20.method113(var21.field769 + 15, var21, -5865);
                        if (class146.field3380 > -1) {
                            class137.field3107[var23.field1914].method423(arg2 + class146.field3380 - 12, class108.field2577 + arg3 - 30);
                        }
                    }
                    if (class41.field934 == 1 && class57.field1271[var5 - class126.field2925] == class157.field3615 && class94.field2229 % 20 < 10) {
                        class20.method113(var21.field769 + 15, var21, -5865);
                        if (class146.field3380 > -1) {
                            class119.field2766[0].method423(class146.field3380 + arg2 - 12, class108.field2577 + -28 + arg3);
                        }
                    }
                } else {
                    int var24 = 30;
                    class67 var25 = (class67) var21;
                    if (var25.field1517 != -1 || var25.field1527 != -1) {
                        class20.method113(var21.field769 + 15, var21, -5865);
                        if (class146.field3380 > -1) {
                            if (var25.field1517 != -1) {
                                class57.field1273[var25.field1517].method423(class146.field3380 + arg2 - 12, arg3 - -class108.field2577 + -var24);
                                var24 += 25;
                            }
                            if (var25.field1527 != -1) {
                                class137.field3107[var25.field1527].method423(arg2 + class146.field3380 - 12, arg3 - -class108.field2577 + -var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class41.field934 == 10 && class136.field3080[var5] == class78.field1895) {
                        class20.method113(var21.field769 + 15, var21, -5865);
                        if (class146.field3380 > -1) {
                            class119.field2766[1].method423(class146.field3380 + arg2 - 12, -var24 + arg3 - -class108.field2577);
                        }
                    }
                }
                if (var21.field762 != null && (var5 >= class126.field2925 || class26.field520 == 0 || class26.field520 == 3 || class26.field520 == 1 && class113.method878(-4509, ((class67) var21).field1506))) {
                    class20.method113(var21.field769, var21, -5865);
                    if (class146.field3380 > -1 && class151.field3485 < class2.field38) {
                        class2.field42[class151.field3485] = class151.field3483.method811(var21.field762) / 2;
                        class2.field32[class151.field3485] = class151.field3483.field2412;
                        class2.field31[class151.field3485] = class146.field3380;
                        class2.field41[class151.field3485] = class108.field2577;
                        class2.field17[class151.field3485] = var21.field771;
                        class2.field26[class151.field3485] = var21.field794;
                        class2.field20[class151.field3485] = var21.field741;
                        class2.field33[class151.field3485] = var21.field762;
                        class151.field3485++;
                    }
                }
                if (var21.field740 > class94.field2229) {
                    class20.method113(var21.field769 + 15, var21, -5865);
                    if (class146.field3380 > -1) {
                        int var26 = var21.field744 * 30 / var21.field783;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class56.method382(arg2 + class146.field3380 - 15, class108.field2577 + arg3 - 3, var26, 5, 65280);
                        class56.method382(arg2 + class146.field3380 + var26 - 15, class108.field2577 + arg3 + -3, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (class94.field2229 < var21.field782[var27]) {
                        class20.method113(var21.field769 / 2, var21, -5865);
                        if (class146.field3380 > -1) {
                            if (var27 == 1) {
                                class108.field2577 -= 20;
                            }
                            if (var27 == 2) {
                                class146.field3380 -= 15;
                                class108.field2577 -= 10;
                            }
                            if (var27 == 3) {
                                class146.field3380 += 15;
                                class108.field2577 -= 10;
                            }
                            class59.field1348[var21.field777[var27]].method423(class146.field3380 + arg2 - 12, class108.field2577 - 12 + arg3);
                            class103.field2508.method806(class75.method564(false, var21.field743[var27]), class146.field3380 + arg2 - 1, class108.field2577 + arg3 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg4) {
            method692((byte) -40);
        }
        for (int var6 = 0; var6 < class151.field3485; var6++) {
            int var7 = class2.field31[var6];
            int var8 = class2.field42[var6];
            int var9 = class2.field32[var6];
            boolean var10 = true;
            int var11 = class2.field41[var6];
            while (var10) {
                var10 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class2.field41[var20] - class2.field32[var20] < var11 + 2 && var11 - var9 < class2.field41[var20] - -2 && class2.field31[var20] + class2.field42[var20] > -var8 + var7 && class2.field31[var20] - class2.field42[var20] < var7 + var8 && var11 > class2.field41[var20] - class2.field32[var20]) {
                        var10 = true;
                        var11 = class2.field41[var20] - class2.field32[var20];
                    }
                }
            }
            class146.field3380 = class2.field31[var6];
            class108.field2577 = class2.field41[var6] = var11;
            class146 var12 = class2.field33[var6];
            if (class97.field2356 == 0) {
                int var13 = 16776960;
                if (class2.field17[var6] < 6) {
                    var13 = class57.field1272[class2.field17[var6]];
                }
                if (class2.field17[var6] == 6) {
                    var13 = class25.field431 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class2.field17[var6] == 7) {
                    var13 = class25.field431 % 20 < 10 ? 255 : 65535;
                }
                if (class2.field17[var6] == 8) {
                    var13 = class25.field431 % 20 < 10 ? 45056 : 8454016;
                }
                if (class2.field17[var6] == 9) {
                    int var14 = 150 - class2.field20[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 + 16384000 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = var14 * 5 + 65280 - 500;
                    }
                }
                if (class2.field17[var6] == 10) {
                    int var15 = 150 - class2.field20[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16384000 + 16711935 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 - (var15 + -100) * 5;
                    }
                }
                if (class2.field17[var6] == 11) {
                    int var16 = 150 - class2.field20[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = (var16 - 50) * 327685 + 65280;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class2.field26[var6] == 0) {
                    class151.field3483.method806(var12, class146.field3380 + arg2, arg3 - -class108.field2577, var13, 0);
                }
                if (class2.field26[var6] == 1) {
                    class151.field3483.method809(var12, arg2 + class146.field3380, class108.field2577 + arg3, var13, 0, class25.field431);
                }
                if (class2.field26[var6] == 2) {
                    class151.field3483.method826(var12, arg2 + class146.field3380, class108.field2577 + arg3, var13, 0, class25.field431);
                }
                if (class2.field26[var6] == 3) {
                    class151.field3483.method815(var12, arg2 + class146.field3380, arg3 - -class108.field2577, var13, 0, class25.field431, 150 - class2.field20[var6]);
                }
                if (class2.field26[var6] == 4) {
                    int var17 = (150 - class2.field20[var6]) * (class151.field3483.method811(var12) + 100) / 150;
                    class56.method378(class146.field3380 + arg2 - 50, arg3, arg2 + class146.field3380 + 50, arg0 + arg3);
                    class151.field3483.method827(var12, arg2 + class146.field3380 + 50 - var17, class108.field2577 + arg3, var13, 0);
                    class56.method387(arg2, arg3, arg1 + arg2, arg3 - -arg0);
                }
                if (class2.field26[var6] == 5) {
                    int var18 = 150 - class2.field20[var6];
                    class56.method378(arg2, class108.field2577 + arg3 - class151.field3483.field2412 - 1, arg1 + arg2, class108.field2577 + arg3 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class151.field3483.method806(var12, class146.field3380 + arg2, class108.field2577 + arg3 - -var19, var13, 0);
                    class56.method387(arg2, arg3, arg1 + arg2, arg0 + arg3);
                }
            } else {
                class151.field3483.method806(var12, class146.field3380 + arg2, class108.field2577 + arg3, 16776960, 0);
            }
        }
        field2054++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method692(byte arg0) {
        field2063 = null;
        field2068 = null;
        field2056 = null;
        if (arg0 != 20) {
            field2056 = null;
        }
        field2072 = null;
        field2051 = null;
        field2069 = null;
        field2062 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[II)Lpe;")
    public final class109 method693(int arg0, int[] arg1, int arg2) {
        field2066++;
        if (this.field2065.method580((byte) 104) == 1) {
            return this.method697(0, arg1, 29090, arg0);
        }
        int var4 = -53 / ((arg2 - 10) / 50);
        if (this.field2065.method578(arg0, 0) != 1) {
            throw new RuntimeException();
        }
        return this.method697(arg0, arg1, 29090, 0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Z")
    public static final boolean method694(int arg0) {
        field2052++;
        int var1 = -31 % ((arg0 - 28) / 58);
        return class58.field1300 == 0 ? class35.field760.method540(99) : true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II[I)Lpe;")
    public final class109 method695(int arg0, int arg1, int[] arg2) {
        field2059++;
        if (this.field2064.method580((byte) -30) == 1) {
            return this.method696(arg2, arg0, 0, true);
        } else if (arg1 == this.field2064.method578(arg0, arg1 ^ 0x1)) {
            return this.method696(arg2, 0, arg0, true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([IIIZ)Lpe;")
    private final class109 method696(int[] arg0, int arg1, int arg2, boolean arg3) {
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFFE) ^ arg1;
        int var6 = var5 | arg2 << 16;
        field2067++;
        long var7 = (long) var6;
        class109 var9 = (class109) this.field2070.method332((byte) -79, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class128 var10 = class128.method945(this.field2064, arg2, arg1);
            if (!arg3) {
                return null;
            } else if (var10 == null) {
                return null;
            } else {
                class109 var11 = var10.method946();
                this.field2070.method336(var7, var11, -8899);
                if (arg0 != null) {
                    arg0[0] -= var11.field2588.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[III)Lpe;")
    private final class109 method697(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = arg3 ^ ((arg0 & 0x10000FFF) << 4 | arg0 >>> 12);
        field2061++;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class109 var9 = (class109) this.field2070.method332((byte) -79, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class102 var10 = (class102) this.field2053.method332((byte) -79, var7);
            if (var10 == null) {
                var10 = class102.method841(this.field2065, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2053.method336(var7, var10, -8899);
            }
            if (arg2 != 29090) {
                return null;
            }
            class109 var11 = var10.method847(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method217(arg2 ^ 0xFFFF8AB2);
                this.field2070.method336(var7, var11, arg2 ^ 0xFFFFAC9F);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILkc;IBI)V")
    public static final void method698(int arg0, class72 arg1, int arg2, byte arg3, int arg4) {
        field2058++;
        if (class76.field1806 >= 50 || class44.field1001 == 0 || (arg1.field1665 == null || arg0 >= arg1.field1665.length)) {
            return;
        }
        int var5 = arg1.field1665[arg0];
        if (var5 == 0 || arg3 != 86) {
            return;
        }
        int var6 = var5 >> 8;
        int var7 = var5 >> 4 & 0x7;
        int var8 = var5 & 0xF;
        class81.field1964[class76.field1806] = var6;
        class98.field2381[class76.field1806] = var7;
        class77.field1859[class76.field1806] = 0;
        class81.field1967[class76.field1806] = null;
        int var9 = (arg4 - 64) / 128;
        int var10 = (arg2 - 64) / 128;
        class60.field1406[class76.field1806] = (var9 << 8) + (var10 << 16) + var8;
        class76.field1806++;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lla;Lla;)V")
    public class87(class77 arg0, class77 arg1) {
        this.field2065 = arg1;
        this.field2064 = arg0;
    }
}
