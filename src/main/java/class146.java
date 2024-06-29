import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class146 {

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "J")
    public long field2803 = 0L;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Llk;")
    public static class232 field2802 = new class232(64);

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "[I")
    public static int[] field2806 = new int[25];

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field2789;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public int field2790;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Lnc;")
    public static class119 field2807;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Lhf;")
    public static class165 field2805;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lni;")
    public class20 field2798;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lni;")
    public class20 field2800;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1072(int arg0) {
        field2802 = null;
        field2807 = null;
        field2805 = null;
        field2806 = null;
        if (arg0 != 10) {
            field2806 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1073(byte arg0, String arg1) {
        int var2 = -40 % ((38 - arg0) / 52);
        field2804++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIIII)V")
    public static final void method1074(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class68 var5 = class103.method830(arg2, 4, 10);
        var5.method608(false);
        var5.field1486 = arg1;
        if (!arg0) {
            field2802 = null;
        }
        var5.field1490 = arg3;
        field2795++;
        var5.field1484 = arg4;
    }
}
