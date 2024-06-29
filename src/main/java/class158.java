import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class158 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lhj;")
    public static class69 field2938 = class181.method1318("runes", (byte) -116);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[[[Lrg;")
    public static class217[][][] field2935;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field2938 = null;
        if (arg0 >= -56) {
            method1191((byte) 50);
        }
        field2935 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLnc;)V")
    public static final void method1190(byte arg0, class83 arg1) {
        field2936++;
        if (arg0 > -121) {
            method1192(100, -55);
        }
        class58.field1045 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1191(byte arg0) {
        field2934++;
        if (class180.method1310(-14234) != 2) {
            return;
        }
        byte var1 = (byte) (class62.field1182 - 4 & 0xFF);
        int var2 = class62.field1182 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class202.field3655[var3][var2][var16] = var1;
            }
        }
        if (class52.field927 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class247.field4520[var4] = -1000000;
            class212.field3861[var4] = 1000000;
            class273.field4827[var4] = 0;
            class148.field2745[var4] = 1000000;
            class22.field300[var4] = 0;
        }
        if (arg0 >= -75) {
            return;
        }
        if (class265.field4711 != 1) {
            int var15 = class156.method1179(class127.field2327, class123.field2291, 79, class52.field927);
            if ((var15 - class31.field427) >= 800 || (class19.field246[class52.field927][class127.field2327 >> 7][class123.field2291 >> 7] & 0x4) == 0) {
                return;
            }
            class223.method1586(1, -79, class127.field2327 >> 7, false, class123.field2291 >> 7, field2935);
            return;
        }
        if ((class19.field246[class52.field927][class156.field2904.field3985 >> 7][class156.field2904.field4005 >> 7] & 0x4) != 0) {
            class223.method1586(0, -32, class156.field2904.field3985 >> 7, false, class156.field2904.field4005 >> 7, field2935);
        }
        if (class148.field2753 >= 310) {
            return;
        }
        int var5 = class127.field2327 >> 7;
        int var6 = class123.field2291 >> 7;
        int var7 = class156.field2904.field3985 >> 7;
        int var8 = class156.field2904.field4005 >> 7;
        int var9;
        if (var8 > var6) {
            var9 = var8 - var6;
        } else {
            var9 = var6 - var8;
        }
        int var10;
        if (var7 <= var5) {
            var10 = var5 - var7;
        } else {
            var10 = var7 - var5;
        }
        if (var9 < var10) {
            int var11 = var9 * 65536 / var10;
            int var12 = 32768;
            while (var5 != var7) {
                if (var5 < var7) {
                    var5++;
                } else if (var5 > var7) {
                    var5--;
                }
                if ((class19.field246[class52.field927][var5][var6] & 0x4) != 0) {
                    class223.method1586(1, 112, var5, false, var6, field2935);
                    return;
                }
                var12 += var11;
                if (var12 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    var12 -= 65536;
                    if ((class19.field246[class52.field927][var5][var6] & 0x4) != 0) {
                        class223.method1586(1, 95, var5, false, var6, field2935);
                        return;
                    }
                }
            }
            return;
        }
        int var13 = var10 * 65536 / var9;
        int var14 = 32768;
        while (var6 != var8) {
            if (var8 > var6) {
                var6++;
            } else if (var6 > var8) {
                var6--;
            }
            if ((class19.field246[class52.field927][var5][var6] & 0x4) != 0) {
                class223.method1586(1, -81, var5, false, var6, field2935);
                return;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                var14 -= 65536;
                if ((class19.field246[class52.field927][var5][var6] & 0x4) != 0) {
                    class223.method1586(1, -101, var5, false, var6, field2935);
                    return;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lhj;")
    public static final class69 method1192(int arg0, int arg1) {
        field2939++;
        if (arg0 != 1000000) {
            return null;
        } else if (arg1 < 100000) {
            return class9.method42(114, new class69[] { class155.field2902, class98.method727(-229, arg1), class82.field1569 });
        } else if (arg1 < 10000000) {
            return class9.method42(arg0 - 999919, new class69[] { class236.field4288, class98.method727(arg0 ^ 0xFFF0BD5B, arg1 / 1000), client.field2815, class82.field1569 });
        } else {
            return class9.method42(115, new class69[] { class256.field4604, class98.method727(arg0 - 1000229, arg1 / 1000000), class271.field4805, class82.field1569 });
        }
    }
}
