import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class109 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[I")
    public static int[] field1855 = new int[2];

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Ldf;")
    private static class51 field1853 = class46.method233("Prepared sound engine", 100);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ldf;")
    public static class51 field1854 = field1853;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Ldf;")
    private static class51 field1860 = class46.method233("Close", 100);

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Lki;")
    public static class58 field1861 = null;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ldf;")
    public static class51 field1856 = field1860;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "[I")
    public static int[] field1850 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lu;")
    public static class111 field1859;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBII)V")
    public static final void method791(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -72) {
            field1862++;
            class51 var4 = class20.method104(-94, new class51[] { class26.field382, class51.method311(arg2, 10), class166.field2708, class51.method311(arg0 >> 6, 10), class166.field2708, class51.method311(arg3 >> 6, 10), class166.field2708, class51.method311(arg0 & 0x3F, 10), class166.field2708, class51.method311(arg3 & 0x3F, 10) });
            var4.method284((byte) 82);
            class3.method9(var4, 17601);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V")
    public static final void method792(byte arg0, int arg1) {
        field1858++;
        class167 var2 = class208.method1430(arg1, 2, (byte) -117);
        if (arg0 <= 5) {
            method791(-89, (byte) -18, -122, -78);
        }
        var2.method1166((byte) -73);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(BI)I")
    public static final int method793(byte arg0, int arg1) {
        if (arg0 != -57) {
            field1856 = null;
        }
        field1857++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method794(int arg0) {
        field1852++;
        int var1 = class234.field4071.length;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class234.field4071[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class1.field6; var4++) {
                    if (class182.field3003[var4] == class101.field1681[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class182.field3003[class1.field6] = class101.field1681[var2];
                    var3 = class1.field6++;
                }
                class121 var5 = new class121(class234.field4071[var2]);
                int var6 = 0;
                while (class234.field4071[var2].length > var5.field2026 && var6 < 511) {
                    int var7 = var5.method876(false);
                    int var8 = var3 | var6++ << 6;
                    int var9 = var7 >> 14;
                    int var10 = (var7 & 0x1FDE) >> 7;
                    int var11 = var7 & 0x3F;
                    int var12 = (class101.field1681[var2] >> 8) * 64 + var10 - class11.field160;
                    int var13 = (class101.field1681[var2] & 0xFF) * 64 + var11 - class241.field4179;
                    class11 var14 = class247.method1678((byte) -121, var5.method876(false));
                    if (class34.field512[var8] == null && (var14.field174 & 0x1) > 0 && class245.field4253 == var9 && var12 >= 0 && var14.field118 + var12 < 104 && var13 >= 0 && var14.field118 + var13 < 104) {
                        class34.field512[var8] = new class83();
                        class83 var15 = class34.field512[var8];
                        class193.field3242[class218.field3788++] = var8;
                        var15.field1392 = var14;
                        var15.field4345 = var15.field1392.field118;
                        var15.field4297 = var15.field1392.field113;
                        var15.field4309 = class179.field2960;
                        var15.field4312 = var15.field1392.field171;
                        var15.field4287 = var15.field1392.field135;
                        var15.field4298 = var15.field1392.field136;
                        var15.field4307 = var15.field1392.field119;
                        if (var15.field4307 == 0) {
                            var15.field4326 = 0;
                        }
                        var15.field4275 = var15.field1392.field173;
                        var15.field4341 = var15.field1392.field159;
                        var15.field4304 = var15.field1392.field130;
                        var15.method1683(var13, 2, var12, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)I")
    public static final int method795(int arg0, int arg1, int arg2) {
        field1851++;
        long var3 = (long) ((arg2 << 16) + arg0);
        if (arg1 != 539392550) {
            method792((byte) -110, -97);
        }
        return class129.field2156 != null && class129.field2156.field1760 == var3 ? (class237.field4139.field2026 * 99 / (class237.field4139.field2014.length - class129.field2156.field3976)) + 1 : 0;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static void method796(int arg0) {
        field1859 = null;
        field1853 = null;
        field1855 = null;
        field1861 = null;
        field1860 = null;
        int var1 = -25 / ((arg0 - 33) / 52);
        field1850 = null;
        field1854 = null;
        field1856 = null;
    }
}
