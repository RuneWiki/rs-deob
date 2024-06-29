import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class55 {

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lec;")
    public static class28 field1264 = class28.method210(-46, ")3)3)3");

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1267 = 1;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lec;")
    public static class28 field1266 = class28.method210(-46, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Ln;")
    public static class78 field1259 = new class78();

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lec;")
    public static class28 field1273 = class28.method210(-46, ")1");

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lec;")
    public static class28 field1276 = class28.method210(-46, "You have not yet set*6nany contact details)3");

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1275 = 2;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lbb;")
    public static class9 field1258;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[I")
    public static int[] field1271;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[[[B")
    public static byte[][][] field1272;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method450(byte arg0) {
        field1262++;
        if (class80.field1847 == 0) {
            return;
        }
        int var1 = -88 % ((17 - arg0) / 39);
        int var2 = 0;
        if (class21.field482 != 0) {
            var2 = 1;
        }
        class54 var3 = class124.field2697;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class117.field2500[var4] != null) {
                int var5 = class22.field501[var4];
                class28 var6 = class125.field2705[var4];
                byte var7 = 0;
                if (var6 != null && var6.method208(class88.field1961, false)) {
                    var7 = 1;
                    var6 = var6.method218(5, false);
                }
                if (var6 != null && var6.method208(class63.field1394, false)) {
                    var6 = var6.method218(5, false);
                    var7 = 2;
                }
                if ((var5 == 3 || var5 == 7) && (var5 == 7 || class126.field2735 == 0 || class126.field2735 == 1 && class27.method200((byte) 25, var6))) {
                    int var8 = 329 - var2 * 13;
                    var2++;
                    byte var9 = 4;
                    var3.method449(class95.field2107, var9, var8, 0);
                    var3.method449(class95.field2107, var9, var8 - 1, 65535);
                    int var10 = var9 + var3.method437(class125.field2704);
                    if (var7 == 1) {
                        class20.field439[0].method977(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var7 == 2) {
                        class20.field439[1].method977(var10, var8 - 12);
                        var10 += 14;
                    }
                    var3.method449(class68.method537(1, new class28[] { var6, class2.field17, class117.field2500[var4] }), var10, var8, 0);
                    var3.method449(class68.method537(1, new class28[] { var6, class2.field17, class117.field2500[var4] }), var10, var8 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var5 == 5 && class126.field2735 < 2) {
                    int var11 = 329 - var2 * 13;
                    var3.method449(class117.field2500[var4], 4, var11, 0);
                    var3.method449(class117.field2500[var4], 4, var11 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var5 == 6 && class126.field2735 < 2) {
                    int var12 = 329 - var2 * 13;
                    var3.method449(class68.method537(1, new class28[] { class45.field998, var6, class2.field17, class117.field2500[var4] }), 4, var12, 0);
                    var3.method449(class68.method537(1, new class28[] { class45.field998, var6, class2.field17, class117.field2500[var4] }), 4, var12 - 1, 65535);
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILha;I)V")
    public static final void method451(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        if (arg2 != 4334) {
            field1259 = null;
        }
        field1261++;
        if (class37.field848 == arg3 || class114.field2435 >= 400) {
            return;
        }
        class28 var5;
        if (arg3.field920 == 0) {
            var5 = class68.method537(1, new class28[] { arg3.field919, class42.method335(626, class37.field848.field927, arg3.field927), client.field401, class5.method25(arg2 ^ 0x830, arg3.field927), class78.field1821 });
        } else {
            var5 = class68.method537(1, new class28[] { arg3.field919, class9.field167, class5.method25(6366, arg3.field920), class78.field1821 });
        }
        if (class76.field1691 == 1) {
            client.method124(arg2 - 12099, class68.method537(1, new class28[] { class43.field918, class1.field6, class8.field142, var5 }), arg4, arg1, 32, arg0);
            class45.field994++;
        } else if (class95.field2097 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class31.field665[var6] != null) {
                    class46.field1025++;
                    short var7 = 0;
                    int var8 = 0;
                    if (class31.field665[var6].method206(class72.field1598, true)) {
                        if (class37.field848.field927 < arg3.field927) {
                            var7 = 2000;
                        }
                        if (class37.field848.field932 != 0 && arg3.field932 != 0) {
                            if (class37.field848.field932 == arg3.field932) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class83.field1896[var6]) {
                        var7 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var7 + 48;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 16;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 54;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 21;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 42;
                    }
                    client.method124(arg2 - 12099, class68.method537(1, new class28[] { class31.field665[var6], class65.field1496, var5 }), arg4, arg1, var8, arg0);
                }
            }
        } else if ((class79.field1824 & 0x8) == 8) {
            class2.field15++;
            client.method124(-7765, class68.method537(arg2 - 4333, new class28[] { class37.field843, class65.field1496, var5 }), arg4, arg1, 18, arg0);
        }
        for (int var9 = 0; var9 < class114.field2435; var9++) {
            if (class74.field1636[var9] == 31) {
                class78.field1813[var9] = class68.method537(1, new class28[] { class49.field1145, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1273 = null;
        field1258 = null;
        field1259 = null;
        field1276 = null;
        field1271 = null;
        field1266 = null;
        field1264 = null;
        field1272 = null;
        int var1 = -22 / ((arg0 + 1) / 52);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)I")
    public static final int method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg0;
            arg0 = var8;
        }
        field1260++;
        if (arg1 < 27) {
            field1272 = null;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg4 - arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg0;
        } else {
            return arg4;
        }
    }
}
