import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class227 extends class147 {

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lmb;")
    public static class96 field3859 = class243.method1708("welle2:", (byte) 108);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "J")
    public static long field3862 = 0L;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lmb;")
    public static class96 field3866 = class243.method1708("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", (byte) 115);

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lmb;")
    public static class96 field3860 = class243.method1708("Konfig geladen)3", (byte) 110);

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field3861 = 0;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "[B")
    public static byte[] field3868;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lmb;")
    public static class96 field3871;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "Lle;")
    public static class110 field3870;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public static void method1545(byte arg0) {
        field3868 = null;
        field3859 = null;
        field3860 = null;
        if (arg0 != -50) {
            field3866 = null;
        }
        field3866 = null;
        field3871 = null;
        field3870 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILff;)I")
    public static final int method1546(int arg0, class3 arg1) {
        field3865++;
        int var2 = 0;
        if (arg1.method15(-69, class170.field2986)) {
            var2++;
        }
        if (arg1.method15(105, class234.field4016)) {
            var2++;
        }
        if (arg1.method15(-116, class83.field1402)) {
            var2++;
        }
        if (arg1.method15(122, class92.field1518)) {
            var2++;
        }
        if (arg1.method15(114, class254.field4388)) {
            var2++;
        }
        if (arg1.method15(110, class6.field121)) {
            var2++;
        }
        if (arg0 <= 35) {
            method1547(69);
        }
        if (arg1.method15(113, class96.field1577)) {
            var2++;
        }
        if (arg1.method15(99, class79.field1338)) {
            var2++;
        }
        if (arg1.method15(-99, class270.field4704)) {
            var2++;
        }
        if (arg1.method15(99, class276.field4802)) {
            var2++;
        }
        if (arg1.method15(118, class143.field2533)) {
            var2++;
        }
        if (arg1.method15(118, class68.field1175)) {
            var2++;
        }
        if (arg1.method15(97, class132.field2369)) {
            var2++;
        }
        if (arg1.method15(-53, class117.field2177)) {
            var2++;
        }
        if (arg1.method15(116, class103.field1744)) {
            var2++;
        }
        if (arg1.method15(110, class60.field1039)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lmb;")
    public static final class96 method1547(int arg0) {
        class96 var1 = class64.field1106;
        class96 var2 = class120.field2227;
        field3869++;
        if (class44.field755 != arg0) {
            var1 = class132.field2378;
        }
        if (class192.field3320 != null) {
            var2 = class36.method289(-5615, new class96[] { class9.field153, class192.field3320 });
        }
        return class36.method289(-5615, new class96[] { class176.field3058, var1, class244.field4223, class31.method205(class156.field2722, (byte) -78), class83.field1417, class31.method205(class73.field1255, (byte) -78), var2, class234.field4014 });
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public static final int method1548(int arg0, int arg1) {
        field3867++;
        if (arg1 != 127) {
            method1547(-65);
        }
        return arg0 & 0x7F;
    }

    static {
        int var0 = 0;
        field3868 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3868[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field3871 = class243.method1708(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 91);
    }
}
