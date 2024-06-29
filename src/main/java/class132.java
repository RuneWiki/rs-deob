import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class132 {

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lu;")
    private static class135 field3186 = class87.method676((byte) -108, "yellow:");

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lu;")
    public static class135 field3177 = field3186;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lu;")
    public static class135 field3188 = field3186;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lu;")
    public static class135 field3187 = class87.method676((byte) -51, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lda;")
    public static class23 field3178 = new class23();

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lu;")
    private static class135 field3196 = class87.method676((byte) -48, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lu;")
    public static class135 field3195 = field3196;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "J")
    public static long field3194;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lvb;")
    public class143 field3180;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lvb;")
    public class143 field3182;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lvb;")
    public class143 field3192;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "[[[B")
    public static byte[][][] field3197;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "[[[I")
    public static int[][][] field3199;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILvd;II)V")
    public static final void method1055(int arg0, class145 arg1, int arg2, int arg3) {
        if (arg0 != -4) {
            field3183 = -24;
        }
        field3190++;
        if (arg1.field170 == arg2 && arg2 != -1) {
            int var4 = class17.method108(arg2, arg0 ^ 0xFFFFFFFC).field2011;
            if (var4 == 1) {
                arg1.field180 = 0;
                arg1.field229 = 0;
                arg1.field194 = 0;
                arg1.field177 = arg3;
            }
            if (var4 == 2) {
                arg1.field229 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field170 == -1 || class17.method108(arg2, 0).field2010 >= class17.method108(arg1.field170, arg0 ^ 0xFFFFFFFC).field2010) {
            arg1.field187 = arg1.field195;
            arg1.field229 = 0;
            arg1.field194 = 0;
            arg1.field180 = 0;
            arg1.field170 = arg2;
            arg1.field177 = arg3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1056(int arg0) {
        field3177 = null;
        field3196 = null;
        field3199 = null;
        field3178 = null;
        field3186 = null;
        field3197 = null;
        if (arg0 == 7761) {
            field3188 = null;
            field3187 = null;
            field3195 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static final void method1057(boolean arg0) {
        class69.field1704++;
        class22.method175(true, 0);
        class105.method854(true, -1);
        field3191++;
        class22.method175(false, 0);
        class105.method854(arg0, -1);
        class9.method42(28);
        class38.method286(11412);
        if (!class106.field2548) {
            int var1 = class102.field2465;
            if (var1 < class113.field2728 / 256) {
                var1 = class113.field2728 / 256;
            }
            if (class146.field3585[4] && class115.field2763[4] + 128 > var1) {
                var1 = class115.field2763[4] + 128;
            }
            int var2 = class47.field1119 + class22.field550 & 0x7FF;
            class46.method355(client.field507, var2, class20.method148(class116.field2789.field173, class116.field2789.field172, class136.field3301, -2) - 50, var1, -26, class102.field2454, var1 * 3 + 600);
        }
        int var3;
        if (class106.field2548) {
            var3 = class9.method44(12307);
        } else {
            var3 = class151.method1221((byte) 2);
        }
        int var4 = class17.field386;
        int var5 = field3185;
        int var6 = class47.field1122;
        int var7 = class62.field1552;
        int var8 = class117.field2806;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class146.field3585[var9]) {
                int var10 = (int) (Math.random() * (double) (class82.field1944[var9] * 2 + 1) + Math.sin((double) class102.field2455[var9] / 100.0D * (double) class125.field2978[var9]) * (double) class115.field2763[var9] - (double) class82.field1944[var9]);
                if (var9 == 4) {
                    class62.field1552 += var10;
                    if (class62.field1552 < 128) {
                        class62.field1552 = 128;
                    }
                    if (class62.field1552 > 383) {
                        class62.field1552 = 383;
                    }
                }
                if (var9 == 2) {
                    class47.field1122 += var10;
                }
                if (var9 == 3) {
                    class117.field2806 = class117.field2806 + var10 & 0x7FF;
                }
                if (var9 == 1) {
                    class17.field386 += var10;
                }
                if (var9 == 0) {
                    field3185 += var10;
                }
            }
        }
        class86.method670(false);
        class91.field2170 = class53.field1278 - 4;
        class91.field2180 = 0;
        class91.field2155 = class76.field1798 - 4;
        class91.field2160 = true;
        class37.method282(true);
        class70.method560();
        class37.method282(!arg0);
        class100.field2418.method992(field3185, class17.field386, class47.field1122, class62.field1552, class117.field2806, var3);
        class37.method282(true);
        class100.field2418.method1002();
        class50.method379(false);
        class93.method757(-34);
        ((class85) class51.field1209).method662(11040, class20.field452);
        class19.method141((byte) 118);
        if (class124.field2947 && class107.method866(true, 10977, false) == 0) {
            class124.field2947 = false;
        }
        if (class124.field2947) {
            class86.method670(false);
            class70.method560();
            class12.method89(class108.field2606, -244, null, false);
        }
        class37.method282(true);
        class83.method645((byte) -48);
        field3185 = var5;
        class117.field2806 = var8;
        class47.field1122 = var6;
        class62.field1552 = var7;
        class17.field386 = var4;
    }
}
