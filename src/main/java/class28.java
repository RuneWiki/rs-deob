import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class28 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "[J")
    public static long[] field460 = new long[200];

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lub;")
    public static class227 field462 = class257.method1749("Spieler", 17263);

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lub;")
    public static class227 field461 = class257.method1749("Fps:", 17263);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method139(int arg0) {
        field461 = null;
        if (arg0 >= -101) {
            field462 = null;
        }
        field462 = null;
        field460 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBII)V")
    public static final void method140(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field452++;
        class176.field2935.field3879 = 0;
        class176.field2935.method1443(201, 0);
        class176.field2935.method1443(arg4, 0);
        class176.field2935.method1443(arg0, 0);
        class176.field2935.method1451(arg3, (byte) -110);
        class176.field2935.method1451(arg1, (byte) -125);
        class70.field1241 = 0;
        class145.field2508 = 1;
        class100.field1755 = 0;
        class257.field4505 = -3;
        if (arg2 != -14) {
            method141(47, 9, (class105[]) null);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[Lta;)V")
    public static final void method141(int arg0, int arg1, class105[] arg2) {
        field457++;
        int var3 = 0;
        if (arg1 != 201) {
            return;
        }
        while (arg2.length > var3) {
            class105 var4 = arg2[var3];
            if (var4 != null && var4.field1968 == arg0 && (!var4.field1853 || !client.method491(var4))) {
                label99: {
                    if (var4.field1829 == 0) {
                        if (!var4.field1853 && client.method491(var4) && class132.field2297 != var4) {
                            break label99;
                        }
                        method141(var4.field1861, 201, arg2);
                        if (var4.field1956 != null) {
                            method141(var4.field1861, 201, var4.field1956);
                        }
                        class182 var5 = (class182) class58.field1070.method1298(-120, (long) var4.field1861);
                        if (var5 != null) {
                            class106.method656(var5.field3106, arg1 - 325);
                        }
                    }
                    if (var4.field1829 == 6) {
                        if (var4.field1914 != -1 || var4.field1875 != -1) {
                            boolean var6 = class130.method794(var4, -19632);
                            int var7;
                            if (var6) {
                                var7 = var4.field1875;
                            } else {
                                var7 = var4.field1914;
                            }
                            if (var7 != -1) {
                                class51 var8 = class25.method127(true, var7);
                                if (var8 != null) {
                                    var4.field1908 += class85.field1481;
                                    while (var4.field1908 > var8.field899[var4.field1944]) {
                                        var4.field1908 -= var8.field899[var4.field1944];
                                        var4.field1944++;
                                        if (var4.field1944 >= var8.field910.length) {
                                            var4.field1944 -= var8.field905;
                                            if (var4.field1944 < 0 || var4.field1944 >= var8.field910.length) {
                                                var4.field1944 = 0;
                                            }
                                        }
                                        class198.method1268(90, var4);
                                    }
                                }
                            }
                        }
                        if (var4.field1948 != 0 && !var4.field1853) {
                            int var9 = var4.field1948 >> 16;
                            int var10 = class85.field1481 * var9;
                            var4.field1983 = var4.field1983 + var10 & 0x7FF;
                            int var11 = var4.field1948 << 16 >> 16;
                            int var12 = class85.field1481 * var11;
                            var4.field1844 = var4.field1844 + var12 & 0x7FF;
                            class198.method1268(82, var4);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILta;)V")
    public static final void method142(int arg0, int arg1, int arg2, class105 arg3) {
        field459++;
        if (class11.field219 != 0 && class11.field219 != 3 || !arg3.method651(arg0 ^ 0x69129E8F)) {
            return;
        }
        int var4 = arg3.field1859[arg2];
        if (arg1 < var4 || (arg3.field1843[arg2] + var4) < arg1) {
            return;
        }
        int var5 = arg2 - arg3.field1952 / 2;
        int var6 = class29.field476 + class254.field4462 & 0x7FF;
        int var7 = class62.field1136[var6];
        int var8 = arg1 - arg3.field1977 / 2;
        int var9 = class62.field1143[var6];
        int var10 = (class91.field1559 + 256) * var9 >> 8;
        int var11 = (class91.field1559 + 256) * var7 >> 8;
        int var12 = var5 * var11 + var8 * var10 >> 11;
        int var13 = class216.field3639.field50 + var12 >> 7;
        if (arg0 != 1762826763) {
            field460 = null;
        }
        int var14 = var5 * var10 - var8 * var11 >> 11;
        int var15 = class216.field3639.field99 - var14 >> 7;
        boolean var16 = class117.method736(105, 0, 0, var13, class216.field3639.field49[0], class216.field3639.field78[0], 0, 0, var15, 1, true, 0);
        if (!var16) {
            return;
        }
        class176.field2935.method1443(var8, 0);
        class176.field2935.method1443(var5, 0);
        class176.field2935.method1451(class29.field476, (byte) -115);
        class176.field2935.method1443(57, 0);
        class176.field2935.method1443(class254.field4462, 0);
        class176.field2935.method1443(class91.field1559, 0);
        class176.field2935.method1443(89, 0);
        class176.field2935.method1451(class216.field3639.field50, (byte) -114);
        class176.field2935.method1451(class216.field3639.field99, (byte) -113);
        class176.field2935.method1443(class193.field3295, 0);
        class176.field2935.method1443(63, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lfh;III)V")
    public static final void method143(class180 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class15.field285) {
            class108 var4 = class261.field4539[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2039 != null && var4.field2039.field2304.method550()) {
                arg0.method558(var4.field2039.field2304, 128, 0, 0, true);
            }
        }
        if (arg3 < class15.field285) {
            class108 var5 = class261.field4539[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2039 != null && var5.field2039.field2304.method550()) {
                arg0.method558(var5.field2039.field2304, 0, 0, 128, true);
            }
        }
        if (arg2 < class15.field285 && arg3 < class112.field2075) {
            class108 var6 = class261.field4539[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2039 != null && var6.field2039.field2304.method550()) {
                arg0.method558(var6.field2039.field2304, 128, 0, 128, true);
            }
        }
        if (arg2 < class15.field285 && arg3 > 0) {
            class108 var7 = class261.field4539[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2039 != null && var7.field2039.field2304.method550()) {
                arg0.method558(var7.field2039.field2304, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Leb;")
    public static final class260 method144(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class260 var4 = var3.field2019;
            var3.field2019 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[Lud;IB)V")
    public static final void method145(int arg0, class139[] arg1, int arg2, byte arg3) {
        if (arg3 >= -110) {
            method139(32);
        }
        field455++;
        if (arg0 <= arg2) {
            return;
        }
        int var4 = arg2 - 1;
        int var5 = arg0 + 1;
        int var6 = (arg0 + arg2) / 2;
        class139 var7 = arg1[var6];
        arg1[var6] = arg1[arg2];
        arg1[arg2] = var7;
        while (var4 < var5) {
            boolean var8 = true;
            do {
                var5--;
                for (int var9 = 0; var9 < 4; var9++) {
                    int var10;
                    int var11;
                    if (class32.field525[var9] == 2) {
                        var10 = arg1[var5].field2415;
                        var11 = var7.field2415;
                    } else if (class32.field525[var9] == 1) {
                        var10 = arg1[var5].field2410;
                        var11 = var7.field2410;
                        if (var10 == -1 && class168.field2808[var9] == 1) {
                            var10 = 2001;
                        }
                        if (var11 == -1 && class168.field2808[var9] == 1) {
                            var11 = 2001;
                        }
                    } else if (class32.field525[var9] == 3) {
                        var11 = var7.field2408 ? 1 : 0;
                        var10 = arg1[var5].field2408 ? 1 : 0;
                    } else {
                        var11 = var7.field2409;
                        var10 = arg1[var5].field2409;
                    }
                    if (var10 != var11) {
                        if ((class168.field2808[var9] != 1 || var10 <= var11) && (class168.field2808[var9] != 0 || var10 >= var11)) {
                            var8 = false;
                        }
                        break;
                    }
                    if (var9 == 3) {
                        var8 = false;
                    }
                }
            } while (var8);
            boolean var12 = true;
            do {
                var4++;
                for (int var13 = 0; var13 < 4; var13++) {
                    int var14;
                    int var15;
                    if (class32.field525[var13] == 2) {
                        var14 = var7.field2415;
                        var15 = arg1[var4].field2415;
                    } else if (class32.field525[var13] == 1) {
                        var14 = var7.field2410;
                        if (var14 == -1 && class168.field2808[var13] == 1) {
                            var14 = 2001;
                        }
                        var15 = arg1[var4].field2410;
                        if (var15 == -1 && class168.field2808[var13] == 1) {
                            var15 = 2001;
                        }
                    } else if (class32.field525[var13] == 3) {
                        var14 = var7.field2408 ? 1 : 0;
                        var15 = arg1[var4].field2408 ? 1 : 0;
                    } else {
                        var14 = var7.field2409;
                        var15 = arg1[var4].field2409;
                    }
                    if (var14 != var15) {
                        if ((class168.field2808[var13] != 1 || var15 >= var14) && (class168.field2808[var13] != 0 || var15 <= var14)) {
                            var12 = false;
                        }
                        break;
                    }
                    if (var13 == 3) {
                        var12 = false;
                    }
                }
            } while (var12);
            if (var4 < var5) {
                class139 var16 = arg1[var4];
                arg1[var4] = arg1[var5];
                arg1[var5] = var16;
            }
        }
        method145(var5, arg1, arg2, (byte) -124);
        method145(arg0, arg1, var5 + 1, (byte) -118);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lnj;I)Lse;")
    public static final class176 method146(class226 arg0, int arg1) {
        if (arg1 == -28300) {
            field456++;
            return new class176(arg0.method1433(116), arg0.method1433(110), arg0.method1433(125), arg0.method1433(121), arg0.method1444(171285352), arg0.method1471(255));
        } else {
            return null;
        }
    }
}
