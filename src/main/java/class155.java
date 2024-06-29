import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class155 {

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2264 = new String[100];

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2268 = "flash2:";

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field2269 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field2270 = 64;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ldb;")
    public static class39 field2273 = new class39(32);

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2278 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public int field2276;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Lo;")
    public static class84 field2274;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lpk;III)Lji;")
    public static final class256 method1047(class237 arg0, int arg1, int arg2, int arg3) {
        field2272++;
        if (arg3 == 19161) {
            return class223.method1526(arg1, arg2, (byte) 112, arg0) ? class90.method683(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIII)V")
    public static final void method1048(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2265++;
        if (class175.field2557 <= arg2 && arg2 <= class91.field1381) {
            int var5 = class251.method1710(arg4, (byte) 27, class196.field2961, class84.field1287);
            int var6 = class251.method1710(arg1, (byte) 27, class196.field2961, class84.field1287);
            class130.method893(var6, var5, 51, arg2, arg3);
        }
        if (arg0) {
            method1055((byte) -95);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Z")
    public final boolean method1049(int arg0) {
        field2277++;
        if (arg0 < 117) {
            return true;
        } else {
            return (this.field2276 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    public static final void method1050(int arg0, int arg1, int arg2, int arg3) {
        class201 var4 = class3.field40[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class67 var5 = var4.field3025;
        if (var5 != null) {
            var5.field1111 = var5.field1111 * arg3 / 16;
            var5.field1101 = var5.field1101 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)Z")
    public final boolean method1051(int arg0) {
        if (arg0 != -26072) {
            this.field2263 = -85;
        }
        field2260++;
        return (this.field2276 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method1052(boolean arg0) {
        field2268 = null;
        if (!arg0) {
            method1052(false);
        }
        field2274 = null;
        field2264 = null;
        field2273 = null;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static final void method1053(int arg0) {
        if (arg0 != -22022) {
            method1055((byte) 50);
        }
        field2266++;
        for (class92 var1 = (class92) class21.field349.method1894((byte) -90); var1 != null; var1 = (class92) class21.field349.method1886(-66)) {
            class239 var2 = var1.field1390;
            if (class260.field3986 != var2.field3695 || class120.field1794 > var2.field3712) {
                var1.method1193(112);
            } else if (var2.field3701 <= class120.field1794) {
                if (var2.field3715 > 0) {
                    class87 var3 = class243.field3762[var2.field3715 - 1];
                    if (var3 != null && var3.field425 >= 0 && var3.field425 < 13312 && var3.field455 >= 0 && var3.field455 < 13312) {
                        var2.method1639(class268.method1810(var2.field3695, var3.field425, (byte) 118, var3.field455) - var2.field3713, class120.field1794, var3.field425, arg0 - 896125560, var3.field455);
                    }
                }
                if (var2.field3715 < 0) {
                    int var4 = -var2.field3715 - 1;
                    class224 var5;
                    if (class138.field1996 == var4) {
                        var5 = class185.field2687;
                    } else {
                        var5 = class166.field2438[var4];
                    }
                    if (var5 != null && var5.field425 >= 0 && var5.field425 < 13312 && var5.field455 >= 0 && var5.field455 < 13312) {
                        var2.method1639(class268.method1810(var2.field3695, var5.field425, (byte) 118, var5.field455) - var2.field3713, class120.field1794, var5.field425, -896147582, var5.field455);
                    }
                }
                var2.method1640(class177.field2599, -85);
                class232.method1579(class260.field3986, (int) var2.field3702, (int) var2.field3680, (int) var2.field3688, 60, var2, var2.field3681, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Z")
    public final boolean method1054(int arg0) {
        if (arg0 != 18601) {
            this.field2275 = 29;
        }
        field2267++;
        return (this.field2276 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method1055(byte arg0) {
        field2271++;
        class159.field2317.method940(23);
        if (arg0 >= -100) {
            field2268 = null;
        }
        class197.field2976.method940(120);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)Z")
    public final boolean method1056(boolean arg0) {
        field2262++;
        if (arg0) {
            field2274 = null;
        }
        return (this.field2276 & 0x8) != 0;
    }
}
