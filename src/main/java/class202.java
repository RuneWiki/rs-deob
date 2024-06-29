import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class202 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lui;")
    public static class98 field3101 = new class98(64);

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Lkm;")
    public class162 field3100;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "Lnm;")
    public static class221 field3109;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "Lfo;")
    public class239 field3108;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "[[B")
    public static byte[][] field3107;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 9)
    public static void method1378(int arg0) {
        field3109 = null;
        if (arg0 != 667102028) {
            method1380(33);
        }
        field3101 = null;
        field3107 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)I", line = 23)
    public static final int method1379(byte arg0, int arg1) {
        if (arg0 > -31) {
            field3101 = (class98) null;
        }
        field3103++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 38)
    public static final void method1380(int arg0) {
        class12.method85(5, -1);
        class37.method304(0, 5);
        class329.method2350(5, false);
        field3104++;
        class18.method116(5, 0);
        class2.method10(125, 5);
        class44.method339(5, 14);
        class219.method1478(5, (byte) 16);
        class329.method2351(5, (byte) 101);
        class287.method2026(5, true);
        class320.method2305(0, 5);
        class139.method984(5, (byte) -63);
        class324.method2321(-45, 5);
        class262.method1838(5, false);
        class325.method2327(5, -128);
        class166.method1159((byte) 30, 5);
        class30.method258(-1031, 5);
        class74.method508(5, 57);
        class180.method1260(5, (byte) 24);
        int var1 = 13 / ((arg0 - 35) / 34);
        class50.method370((byte) 63, 50);
        class278.method1975(127, 5);
        class201.method1374(false, 5);
        class79.field1170.method645(5, (byte) -105);
        class287.field4702.method645(5, (byte) -48);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZII)V", line = 70)
    public static final void method1381(boolean arg0, int arg1, int arg2) {
        field3099++;
        if (!arg0) {
            class211 var3 = class17.method115(6, arg1, 4086);
            var3.method1433(true);
            var3.field3210 = arg2;
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 86)
    public static final void method1382(int arg0) {
        for (int var1 = -1; var1 < class38.field561; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class150.field2410[var1];
            }
            class39 var3 = class130.field1984[var2];
            if (var3 != null && var3.field4728 > 0) {
                var3.field4728--;
                if (var3.field4728 == 0) {
                    var3.field4793 = null;
                }
            }
        }
        field3102++;
        if (arg0 != -9488) {
            field3105 = -122;
        }
        for (int var4 = 0; var4 < class294.field4892; var4++) {
            int var5 = class243.field3843[var4];
            class233 var6 = class329.field5377[var5];
            if (var6 != null && var6.field4728 > 0) {
                var6.field4728--;
                if (var6.field4728 == 0) {
                    var6.field4793 = null;
                }
            }
        }
    }
}
