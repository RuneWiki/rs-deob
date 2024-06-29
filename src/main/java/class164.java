import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class164 extends class172 {

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field2604 = -1;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "[C")
    public static char[] field2602 = new char[] { '-', ' ', ' ', '_', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Z")
    public static boolean field2603 = true;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field2608 = 0;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "[[S")
    public static short[][] field2606 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 12)
    public static void method1306(int arg0) {
        field2606 = (short[][]) null;
        field2602 = null;
        if (arg0 != 7484) {
            field2608 = -69;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V", line = 34)
    public static final void method1307(byte arg0) {
        field2605++;
        if (class193.field3042 == null || class239.field3711 == null) {
            class239.field3711 = new int[256];
            class193.field3042 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class193.field3042[var1] = (int) (Math.sin(var2) * 4096.0D);
                class239.field3711[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 0) {
            method1308((byte[]) null, true);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BZ)Lbi;", line = 74)
    public static final class145 method1308(byte[] arg0, boolean arg1) {
        if (arg1) {
            return (class145) null;
        }
        field2607++;
        if (arg0 == null) {
            return null;
        }
        class145 var2;
        if (class240.field3737) {
            var2 = new class179(arg0, class150.field2449, class89.field1262, class358.field5694, class62.field957, class172.field2732);
        } else {
            var2 = new class70(arg0, class150.field2449, class89.field1262, class358.field5694, class62.field957, class172.field2732);
        }
        class29.method330(-1);
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 96)
    public class164() {
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V", line = 98)
    public class164(int arg0) {
        this.field2610 = arg0;
    }
}
