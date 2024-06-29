import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class10 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[[S")
    public static short[][] field119 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Loh;")
    private static class258 field116 = class153.method1046("glow2:", 87);

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Loh;")
    public static class258 field121 = field116;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Loh;")
    private static class258 field120 = class153.method1046("Drop", 117);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Loh;")
    public static class258 field124 = field120;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field115 = -1;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Loh;")
    public static class258 field117 = field116;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lgb;")
    public static class213 field123;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 23)
    public static final void method64(int arg0, int arg1) {
        field125++;
        if (arg0 != 9104) {
            field121 = (class258) null;
        }
        class286 var2 = class48.method389(arg1, 9, 10738);
        var2.method2010((byte) -38);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZI)Ls;", line = 48)
    public static final class171 method65(int arg0, boolean arg1, int arg2) {
        class171 var3 = class263.method1844(arg0, (byte) -70);
        field122++;
        if (arg1) {
            return (class171) null;
        } else if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field2982 == null || var3.field2982.length <= arg2) {
            return null;
        } else {
            return var3.field2982[arg2];
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 70)
    public static void method66(int arg0) {
        field121 = null;
        field123 = null;
        field124 = null;
        field117 = null;
        field116 = null;
        if (arg0 == -14002) {
            field119 = (short[][]) null;
            field120 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lgb;B)I", line = 113)
    public static final int method67(class213 arg0, byte arg1) {
        field126++;
        int var2 = 0;
        if (arg0.method1433((byte) -105, class13.field170)) {
            var2++;
        }
        if (arg0.method1433((byte) -48, class23.field295)) {
            var2++;
        }
        if (arg0.method1433((byte) -68, class110.field1933)) {
            var2++;
        }
        if (arg0.method1433((byte) -99, class72.field1270)) {
            var2++;
        }
        if (arg0.method1433((byte) -85, class7.field96)) {
            var2++;
        }
        if (arg0.method1433((byte) -96, class83.field1397)) {
            var2++;
        }
        if (arg0.method1433((byte) -40, class139.field2376)) {
            var2++;
        }
        int var3 = -11 % ((arg1 + 71) / 52);
        if (arg0.method1433((byte) -68, class93.field1640)) {
            var2++;
        }
        if (arg0.method1433((byte) -59, class130.field2296)) {
            var2++;
        }
        if (arg0.method1433((byte) -37, class231.field3995)) {
            var2++;
        }
        if (arg0.method1433((byte) -123, class86.field1465)) {
            var2++;
        }
        if (arg0.method1433((byte) -75, client.field619)) {
            var2++;
        }
        if (arg0.method1433((byte) -88, class94.field1650)) {
            var2++;
        }
        if (arg0.method1433((byte) -119, class14.field178)) {
            var2++;
        }
        if (arg0.method1433((byte) -62, class235.field4055)) {
            var2++;
        }
        if (arg0.method1433((byte) -42, class105.field1890)) {
            var2++;
        }
        return var2;
    }
}
