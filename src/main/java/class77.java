import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class77 {

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "Lgh;")
    public static class204 field1314 = null;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "[I")
    public static int[] field1317 = new int[1000];

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lmb;")
    private static class96 field1321 = class243.method1708("flash2:", (byte) 92);

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field1322 = -2;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "Lmb;")
    public static class96 field1313 = field1321;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Lmb;")
    public static class96 field1320 = field1321;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Lmb;")
    public static class96 field1319 = class243.method1708("::replacecanvas", (byte) 95);

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Luc;")
    public static class11 field1315 = new class11(30);

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lmb;")
    public static class96 field1323 = class243.method1708("<col=00ff00>", (byte) 106);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lpj;")
    public static class48 field1311;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1321 = null;
        field1323 = null;
        field1314 = null;
        field1311 = null;
        field1319 = null;
        if (arg0 == 7391) {
            field1313 = null;
            field1317 = null;
            field1320 = null;
            field1315 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static final void method554(int arg0) {
        class167.field2946.method83(0);
        field1318++;
        if (arg0 != 2047) {
            method555((byte) -6, 46, (class107[]) null);
        }
        class34.field604.method83(0);
        class241.field4190.method83(0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI[Lw;)V")
    public static final void method555(byte arg0, int arg1, class107[] arg2) {
        field1316++;
        int var3 = 0;
        if (arg0 >= -99) {
            return;
        }
        while (var3 < arg2.length) {
            class107 var4 = arg2[var3];
            if (var4 != null && var4.field1827 == arg1 && (!var4.field1867 || !client.method814(var4))) {
                label99: {
                    if (var4.field1833 == 0) {
                        if (!var4.field1867 && client.method814(var4) && class92.field1528 != var4) {
                            break label99;
                        }
                        method555((byte) -110, var4.field1896, arg2);
                        if (var4.field1842 != null) {
                            method555((byte) -108, var4.field1896, var4.field1842);
                        }
                        class168 var5 = (class168) class34.field606.method1081(0, (long) var4.field1896);
                        if (var5 != null) {
                            class189.method1331(var5.field2961, 2643);
                        }
                    }
                    if (var4.field1833 == 6) {
                        if (var4.field1888 != -1 || var4.field1868 != -1) {
                            boolean var6 = class39.method305(var4, 94);
                            int var7;
                            if (var6) {
                                var7 = var4.field1868;
                            } else {
                                var7 = var4.field1888;
                            }
                            if (var7 != -1) {
                                class67 var8 = class189.method1332(var7, 2);
                                if (var8 != null) {
                                    var4.field1910 += class62.field1063;
                                    while (var4.field1910 > var8.field1143[var4.field1952]) {
                                        var4.field1910 -= var8.field1143[var4.field1952];
                                        var4.field1952++;
                                        if (var8.field1140.length <= var4.field1952) {
                                            var4.field1952 -= var8.field1149;
                                            if (var4.field1952 < 0 || var4.field1952 >= var8.field1140.length) {
                                                var4.field1952 = 0;
                                            }
                                        }
                                        class53.method403(-83, var4);
                                    }
                                }
                            }
                        }
                        if (var4.field1936 != 0 && !var4.field1867) {
                            int var9 = var4.field1936 >> 16;
                            int var10 = var4.field1936 << 16 >> 16;
                            int var11 = class62.field1063 * var9;
                            var4.field1969 = var4.field1969 + var11 & 0x7FF;
                            int var12 = class62.field1063 * var10;
                            var4.field1840 = var4.field1840 + var12 & 0x7FF;
                            class53.method403(-107, var4);
                        }
                    }
                }
            }
            var3++;
        }
    }
}
