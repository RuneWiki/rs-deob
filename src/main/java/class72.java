import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class72 {

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field998 = -1;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "[[S")
    public static short[][] field1001 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Llp;")
    public static class272 field1002 = new class272(16);

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[J[I)V")
    public static final void method498(int arg0, long[] arg1, int[] arg2) {
        if (arg0 != 10304) {
            method498(-73, null, null);
        }
        class309.method1940(0, (byte) 123, arg1, arg1.length - 1, arg2);
        field1000++;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V")
    public static void method499(byte arg0) {
        field1002 = null;
        if (arg0 <= 80) {
            field998 = -37;
        }
        field1001 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static final void method500(int arg0) {
        if (arg0 != 4780) {
            method500(102);
        }
        field996++;
        if (class380.field5793 == 6) {
            class380.field5793 = 7;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BIII)V")
    public static final void method501(byte arg0, int arg1, int arg2, int arg3) {
        field999++;
        String var4 = "tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        int var5 = -64 % ((arg0 - 70) / 40);
        System.out.println(var4);
        class360.method2299(true, var4, false, (byte) 117);
    }
}
