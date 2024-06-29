import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class56 extends class171 {

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[B")
    public static byte[] field804 = new byte[32896];

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Lhc;")
    public static class235 field803;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[[[B")
    public static byte[][][] field807;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public static void method347(int arg0) {
        field807 = null;
        if (arg0 != -14649) {
            method347(-37);
        }
        field803 = null;
        field804 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)V")
    public static final void method348(byte arg0, int arg1) {
        class235.field3583.method536(-52, arg1);
        class172.field2388.method536(65, arg1);
        class245.field3737.method536(-44, arg1);
        field806++;
        int var2 = -76 / ((arg0 - 46) / 46);
        class50.field727.method536(-114, arg1);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public static final void method349(int arg0) {
        if (class297.field4687 == 2) {
            if (class203.field2830 == class176.field2475 && class193.field2678 == class178.field2494) {
                class297.field4687 = 0;
                if (class273.field4202 && class138.field1928[81] && class68.field925 > 2) {
                    class247.method1663((byte) -110, class68.field925 - 2);
                } else {
                    class247.method1663((byte) -110, class68.field925 - 1);
                }
            }
        } else if (class27.field344 == class203.field2830 && class81.field1112 == class193.field2678) {
            class297.field4687 = 0;
            if (class273.field4202 && class138.field1928[81] && class68.field925 > 2) {
                class247.method1663((byte) -110, class68.field925 - 2);
            } else {
                class247.method1663((byte) -110, class68.field925 - 1);
            }
        } else {
            class176.field2475 = class27.field344;
            class178.field2494 = class81.field1112;
            class297.field4687 = 2;
        }
        if (arg0 != -12173) {
            field803 = null;
        }
        field811++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
    public static final void method350(byte arg0) {
        field805++;
        class236.method1583(class208.field2967, 0);
        class241.field3702++;
        if (class125.field1756 && class30.field409) {
            int var1 = class12.field124;
            int var2 = var1 - class42.field642;
            if (var2 < class202.field2812) {
                var2 = class202.field2812;
            }
            if (arg0 < 9) {
                field803 = null;
            }
            if (class202.field2812 + class225.field3414.field3112 < class208.field2967.field3112 + var2) {
                var2 = class202.field2812 + class225.field3414.field3112 - class208.field2967.field3112;
            }
            int var3 = var2 - class170.field2362;
            int var4 = class287.field4543;
            int var5 = var4 - class294.field4625;
            if (class297.field4683 > var5) {
                var5 = class297.field4683;
            }
            int var6 = class208.field2967.field3148;
            int var7 = class225.field3414.field3066 + var2 - class202.field2812;
            if ((class297.field4683 + class225.field3414.field3166) < (class208.field2967.field3166 + var5)) {
                var5 = class297.field4683 + class225.field3414.field3166 - class208.field2967.field3166;
            }
            int var8 = var5 - class173.field2405;
            int var9 = class225.field3414.field3031 + var5 - class297.field4683;
            if (class241.field3702 > class208.field2967.field3017 && (var6 < var3 || var3 < (-var6) || var8 > var6 || (-var6) > var8)) {
                class265.field3975 = true;
            }
            if (class208.field2967.field3069 != null && class265.field3975) {
                class27 var10 = new class27();
                var10.field338 = class208.field2967;
                var10.field337 = var7;
                var10.field348 = var9;
                var10.field341 = class208.field2967.field3069;
                class213.method1392(var10, 93);
            }
            if (class104.field1455 == 0) {
                if (class265.field3975) {
                    if (class208.field2967.field3138 != null) {
                        class27 var11 = new class27();
                        var11.field339 = class296.field4658;
                        var11.field337 = var7;
                        var11.field348 = var9;
                        var11.field338 = class208.field2967;
                        var11.field341 = class208.field2967.field3138;
                        class213.method1392(var11, -58);
                    }
                    if (class296.field4658 != null && client.method1050(class208.field2967) != null) {
                        class96.field1351++;
                        class281.field4359.method1864(236, (byte) -69);
                        class281.field4359.method1489(65280, class208.field2967.field3093);
                        class281.field4359.method1470(393660232, class296.field4658.field3042);
                        class281.field4359.method1435(-94, class296.field4658.field3093);
                        class281.field4359.method1470(393660232, class208.field2967.field3042);
                    }
                } else if ((class170.field2352 == 1 || class202.method1277(class68.field925 - 1, (byte) 83)) && class68.field925 > 2) {
                    class75.method483(1);
                } else if (class68.field925 > 0) {
                    method349(-12173);
                }
                class208.field2967 = null;
            }
        } else if (class241.field3702 > 1) {
            class208.field2967 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field804[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field809 = 0;
    }
}
