import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class77 {

    @OriginalMember(owner = "client!te", name = "r", descriptor = "J")
    public long field1372 = 0L;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
    public static int[] field1370 = new int[32];

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field1358;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public int field1361;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "Luk;")
    public class98 field1367;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Loj;")
    public static final class159 method539(int arg0, int arg1) {
        field1375++;
        class159 var2 = (class159) class38.field657.method1811((long) arg0, -92);
        if (var2 != null) {
            return var2;
        }
        int var3 = -57 / ((12 - arg1) / 33);
        byte[] var4 = class55.field903.method1242(class269.method1778(arg0, -28112), class163.method1102(false, arg0), 6801);
        class159 var5 = new class159();
        if (var4 != null) {
            var5.method1084(new class261(var4), -7787);
        }
        class38.field657.method1817((long) arg0, 16, var5);
        return var5;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public static final void method540(int arg0, int arg1, int arg2) {
        field1368++;
        if (arg1 < class174.field3072) {
            class33.method274((byte) -119, class174.field3072);
            class174.field3072 = 0;
        }
        short var3 = 256;
        int var4 = class68.field1140 * arg0;
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class167.field2974[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var6 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class219.field3817[var6++];
                int var12 = class68.field1141[arg2 + (var4++)];
                if (var11 == 0) {
                    class127.field2207.field35[var5++] = var12;
                } else {
                    int var13 = 256 - var11 - 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = var11 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = class108.field1947[var11];
                    class127.field2207.field35[var5++] = class71.method502(-16711936, var13 * class71.method502(var12, 16711935) + class71.method502(var15, 16711935) * var14) + class71.method502(var13 * class71.method502(var12, 65280) + var14 * class71.method502(var15, 65280), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class127.field2207.field35[var5++] = class68.field1141[var4++ + arg2];
            }
            var4 += class68.field1140 - 128;
        }
        class127.field2207.method37(arg2, arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lw;Lw;ZZI)I")
    public static final int method541(class144 arg0, class144 arg1, boolean arg2, boolean arg3, int arg4) {
        field1360++;
        if (arg4 == 1) {
            int var5 = arg0.field4894;
            int var6 = arg1.field4894;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return arg0.method980((byte) -9).field4421.method685(15642, arg1.method980((byte) -9).field4421);
        } else if (arg4 == 3) {
            if (arg0.field2532.method679((byte) 3, class198.field3447)) {
                if (arg1.field2532.method679((byte) -126, class198.field3447)) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field2532.method679((byte) 45, class198.field3447)) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field2532.method685(15642, arg1.field2532);
            }
        } else if (arg4 != 4) {
            if (!arg2) {
                method541((class144) null, (class144) null, true, true, -12);
            }
            if (arg4 == 5) {
                if (arg0.method1841(121)) {
                    return arg1.method1841(122) ? 0 : 1;
                } else if (arg1.method1841(115)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 == 6) {
                if (arg0.method1838((byte) 121)) {
                    return arg1.method1838((byte) 127) ? 0 : 1;
                } else if (arg1.method1838((byte) 115)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg4 != 7) {
                return arg0.field2531 - arg1.field2531;
            } else if (arg0.method1840(16)) {
                return arg1.method1840(16) ? 0 : 1;
            } else if (arg1.method1840(16)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0.method1839(-1)) {
            return arg1.method1839(-1) ? 0 : 1;
        } else if (arg1.method1839(-1)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB)V")
    public static final void method542(int arg0, int arg1, byte arg2) {
        field1365++;
        class76 var3 = class32.field579[class255.field4407][arg1][arg0];
        if (var3 == null) {
            class172.method1155(class255.field4407, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class280 var5 = null;
        for (class280 var6 = (class280) var3.method529(10); var6 != null; var6 = (class280) var3.method533(96)) {
            class166 var13 = class222.method1468(1, var6.field4902.field1125);
            int var14 = var13.field2947;
            if (var13.field2920 == 1) {
                var14 = (var6.field4902.field1129 + 1) * var14;
            }
            if (var14 > var4) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class172.method1155(class255.field4407, arg1, arg0);
            return;
        }
        var3.method527(var5, 10);
        class67 var7 = null;
        if (arg2 >= -38) {
            field1364 = -113;
        }
        class280 var8 = (class280) var3.method529(10);
        class67 var9 = null;
        while (var8 != null) {
            class67 var12 = var8.field4902;
            if (var5.field4902.field1125 != var12.field1125) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field1125 != var12.field1125 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class280) var3.method533(56);
        }
        long var10 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class215.method1441(class255.field4407, arg1, arg0, class115.method777(-1, arg0 * 128 + 64, class255.field4407, arg1 * 128 + 64), var5.field4902, var10, var7, var9);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ltg;IIILtg;)Lge;")
    public static final class70 method543(class182 arg0, int arg1, int arg2, int arg3, class182 arg4) {
        field1366++;
        int var5 = -36 % ((arg2 - 80) / 37);
        return class153.method1016(arg3, 21451, arg0, arg1) ? class36.method284(arg4.method1242(arg1, arg3, 6801), (byte) 98) : null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method544(byte arg0) {
        field1370 = null;
        int var1 = 104 / ((arg0 + 22) / 63);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1356++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = class166.method1127(class79.field1395, arg1 + arg2, class197.field3437, 8946);
        int var9 = -1;
        int var10 = class166.method1127(class79.field1395, arg1 - arg2, class197.field3437, 8946);
        if (arg3 >= -39) {
            method542(78, 78, (byte) 105);
        }
        class175.method1174(class124.field2177[arg4], arg0, -7, var10, var8);
        while (var5 < var6) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                int var11 = arg4 - var6;
                var7 -= var6 << 1;
                int var12 = arg4 + var6;
                if (class178.field3101 <= var12 && class137.field2414 >= var11) {
                    int var13 = class166.method1127(class79.field1395, arg1 + var5, class197.field3437, 8946);
                    int var14 = class166.method1127(class79.field1395, arg1 - var5, class197.field3437, 8946);
                    if (class137.field2414 >= var12) {
                        class175.method1174(class124.field2177[var12], arg0, -7, var14, var13);
                    }
                    if (var11 >= class178.field3101) {
                        class175.method1174(class124.field2177[var11], arg0, -7, var14, var13);
                    }
                }
            }
            var5++;
            int var15 = arg4 + var5;
            int var16 = arg4 - var5;
            if (class178.field3101 <= var15 && var16 <= class137.field2414) {
                int var17 = class166.method1127(class79.field1395, arg1 + var6, class197.field3437, 8946);
                int var18 = class166.method1127(class79.field1395, arg1 - var6, class197.field3437, 8946);
                if (class137.field2414 >= var15) {
                    class175.method1174(class124.field2177[var15], arg0, -7, var18, var17);
                }
                if (var16 >= class178.field3101) {
                    class175.method1174(class124.field2177[var16], arg0, -7, var18, var17);
                }
            }
        }
    }
}
