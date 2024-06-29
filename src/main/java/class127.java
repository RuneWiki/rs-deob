import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class127 extends class81 {

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field2470 = 0;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[I")
    public static int[] field2472 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "[[S")
    public static short[][] field2473 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "[[B")
    public static byte[][] field2478 = new byte[1000][];

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Lmc;")
    public static class151 field2471;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "Llh;")
    public static class19 field2469;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Lsg;")
    public class30 field2479;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "[I")
    public int[] field2464;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "[I")
    public int[] field2465;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "[Lka;")
    public class157[] field2467;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "[Lsg;")
    public class30[] field2468;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)Z")
    public static final boolean method948(int arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg2 != 2397) {
            method948(109, -54, -2);
        }
        field2463++;
        class40 var3 = class195.method1415(-123, arg1);
        return var3.method423(true, arg0);
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public static void method949(int arg0) {
        field2472 = null;
        field2473 = null;
        if (arg0 != 10304) {
            method949(71);
        }
        field2471 = null;
        field2478 = null;
        field2469 = null;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public static final void method950(int arg0) {
        if (arg0 != -9186) {
            field2473 = null;
        }
        class123.field2419.method1652(-8259);
        field2474++;
    }
}
