import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class101 extends class30 {

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field2262 = 0;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "[I")
    public static int[] field2267 = new int[500];

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "Lje;")
    public static class67 field2270 = class85.method592(255, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "I")
    public static int field2279 = 0;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "Z")
    public static boolean field2277 = true;

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "Lje;")
    public static class67 field2282 = class85.method592(255, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Lje;")
    private static class67 field2258 = class85.method592(255, "Please contact customer support)3");

    @OriginalMember(owner = "client!od", name = "qb", descriptor = "Lje;")
    public static class67 field2281 = class85.method592(255, "Abbrechen");

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "Lje;")
    private static class67 field2271 = class85.method592(255, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "Lje;")
    public static class67 field2266 = field2258;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "Lje;")
    public static class67 field2272 = field2271;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "Lje;")
    private static class67 field2264 = class85.method592(255, "level)2");

    @OriginalMember(owner = "client!od", name = "tb", descriptor = "Lje;")
    public static class67 field2284 = field2264;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public int field2257;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
    public int field2278;

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!od", name = "ub", descriptor = "I")
    public int field2285;

    @OriginalMember(owner = "client!od", name = "vb", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!od", name = "wb", descriptor = "Lje;")
    public class67 field2287;

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "Z")
    public static boolean field2275;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "[I")
    public int[] field2263;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "[I")
    public int[] field2265;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "[Lje;")
    public class67[] field2268;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method799(boolean arg0) {
        field2276++;
        if (class64.field1263 != null) {
            class23 var1 = class64.field1263;
            synchronized (class64.field1263) {
                class64.field1263 = null;
            }
        }
        if (!arg0) {
            method802(49);
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
    public static void method800(byte arg0) {
        field2258 = null;
        field2282 = null;
        field2270 = null;
        field2266 = null;
        field2284 = null;
        if (arg0 < 27) {
            field2277 = false;
        }
        field2264 = null;
        field2272 = null;
        field2281 = null;
        field2267 = null;
        field2271 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BZLfd;Lfd;Loe;)V")
    public static final void method801(byte arg0, boolean arg1, class40 arg2, class40 arg3, class102 arg4) {
        class149.field3426 = arg1;
        field2256++;
        class66.field1288 = arg2;
        class12.field225 = arg3;
        class66.field1288.method263(10, (byte) -45);
        class23.field424 = arg4;
        int var5 = 61 / ((-arg0 - 81) / 43);
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    public static final void method802(int arg0) {
        class98.field2195++;
        class69.field1399.method285(45, (byte) 64);
        field2273++;
        class69.field1399.method656(-71, (long) arg0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    public static final boolean method803(int arg0, int arg1) {
        if (arg1 != 64) {
            field2258 = null;
        }
        field2259++;
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Lne;")
    public static final class95 method804(int arg0, int arg1) {
        class95 var2 = (class95) class89.field1955.method764((long) arg0, 24182);
        field2286++;
        if (arg1 >= -121) {
            method801((byte) 31, false, null, null, null);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class112.field2522.method267((byte) -124, arg0, 16);
        class95 var4 = new class95();
        if (var3 != null) {
            var4.method736(new class91(var3), true);
        }
        class89.field1955.method765((long) arg0, var4, (byte) -108);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
    public static final void method805(int arg0, int arg1, int arg2, int arg3) {
        field2269++;
        class72 var4 = class106.method836(arg3, arg0, 13);
        if (var4 != null && var4.field1501 != null) {
            class35 var5 = new class35();
            var5.field630 = var4.field1501;
            var5.field640 = var4;
            class71.method513((byte) -28, var5);
        }
        class38.field691 = true;
        class39.field708 = arg3;
        class12.field224 = arg0;
        class116.field2622 = arg1;
        class23.method160((byte) -29, var4);
        if (arg2 != 64) {
            method801((byte) 116, false, null, null, null);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZ)V")
    public static final void method806(int arg0, int arg1, boolean arg2) {
        field2260++;
        class4 var3 = class99.field2200[class128.field2817][arg0][arg1];
        if (var3 == null) {
            class134.field3044.method357(class128.field2817, arg0, arg1);
            return;
        }
        class39 var4 = (class39) var3.method26((byte) -88);
        int var5 = -99999999;
        class39 var6 = null;
        while (var4 != null) {
            class103 var11 = class123.method961(var4.field698, 1658);
            int var12 = var11.field2355;
            if (var11.field2356 == 1) {
                var12 = (var4.field694 + 1) * var12;
            }
            if (var5 < var12) {
                var5 = var12;
                var6 = var4;
            }
            var4 = (class39) var3.method18((byte) -128);
        }
        if (var6 == null) {
            class134.field3044.method357(class128.field2817, arg0, arg1);
            return;
        }
        var3.method28((byte) 113, var6);
        class39 var7 = (class39) var3.method26((byte) -67);
        class39 var8 = null;
        int var9 = (arg1 << 7) + arg0 + 1610612736;
        if (!arg2) {
            method801((byte) -116, true, null, null, null);
        }
        class39 var10 = null;
        while (var7 != null) {
            if (var6.field698 != var7.field698) {
                if (var8 == null) {
                    var8 = var7;
                }
                if (var7.field698 != var8.field698 && var10 == null) {
                    var10 = var7;
                }
            }
            var7 = (class39) var3.method18((byte) -128);
        }
        class134.field3044.method364(class128.field2817, arg0, arg1, class114.method924(arg0 * 128 + 64, class128.field2817, arg1 * 128 + 64, -106), var6, var9, var8, var10);
    }
}
