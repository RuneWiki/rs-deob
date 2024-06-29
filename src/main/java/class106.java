import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 extends class112 {

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "Ltd;")
    public static class136 field2492 = class145.method1172("(Y", 45);

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "Ltd;")
    private static class136 field2504 = class145.method1172("RuneScape has been updated(Q", 45);

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "Ltd;")
    private static class136 field2497 = class145.method1172("FULL", 45);

    @OriginalMember(owner = "client!pb", name = "sb", descriptor = "Ltd;")
    private static class136 field2505 = class145.method1172("Loading fonts )2 ", 45);

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "Ltd;")
    public static class136 field2493 = class145.method1172("rect_debug=", 45);

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "[Lbb;")
    public static class10[] field2500 = new class10[1000];

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
    public static int field2502 = 0;

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "[Z")
    public static boolean[] field2503 = new boolean[5];

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field2494 = -1;

    @OriginalMember(owner = "client!pb", name = "ub", descriptor = "Ltd;")
    public static class136 field2507 = field2497;

    @OriginalMember(owner = "client!pb", name = "xb", descriptor = "Ltd;")
    public static class136 field2510 = field2505;

    @OriginalMember(owner = "client!pb", name = "wb", descriptor = "Ltd;")
    public static class136 field2509 = field2504;

    @OriginalMember(owner = "client!pb", name = "vb", descriptor = "Ltd;")
    private static class136 field2508 = class145.method1172("Examine", 45);

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "Ltd;")
    public static class136 field2496 = field2508;

    @OriginalMember(owner = "client!pb", name = "yb", descriptor = "B")
    public static byte field2511;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!pb", name = "tb", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!pb", name = "zb", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILmd;)V")
    public static final void method845(int arg0, class87 arg1) {
        field2512++;
        int var2 = 114 / ((arg0 + 39) / 56);
        class149.field3424 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)Lda;")
    public final class23 method93(int arg0) {
        int var2 = -79 / ((18 - arg0) / 63);
        field2506++;
        return class63.method472(this.field2499, (byte) 125).method939(-1, this.field2495);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)I")
    public static final int method846(int arg0, int arg1, int arg2) {
        field2498++;
        class79 var3 = (class79) class88.field2088.method109(65, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= arg1 && var3.field1809.length > arg2) {
            return var3.field1809[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)V")
    public static void method847(int arg0) {
        field2504 = null;
        field2510 = null;
        field2497 = null;
        field2496 = null;
        if (arg0 != 22340) {
            return;
        }
        field2493 = null;
        field2507 = null;
        field2509 = null;
        field2505 = null;
        field2500 = null;
        field2492 = null;
        field2503 = null;
        field2508 = null;
    }
}
