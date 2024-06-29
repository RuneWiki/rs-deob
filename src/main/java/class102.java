import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class102 extends class60 {

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "Lv;")
    public static class122 field2528 = class55.method425(-108, "Ignorieren");

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "I")
    public static int field2532 = 1;

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "Lv;")
    public static class122 field2533 = class55.method425(-75, "Menge eingeben:");

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!r", name = "sb", descriptor = "J")
    public static long field2537 = 0L;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!r", name = "rb", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
    public int field2538;

    @OriginalMember(owner = "client!r", name = "qb", descriptor = "Lkb;")
    public static class62 field2535;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "[[I")
    public static int[][] field2526;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)I", line = 19)
    public static final int method779(int arg0, int arg1, int arg2, int arg3) {
        field2534++;
        if (arg1 > 179) {
            arg2 /= 2;
        }
        if (arg1 > 192) {
            arg2 /= 2;
        }
        if (arg1 > 217) {
            arg2 /= 2;
        }
        if (arg1 > 243) {
            arg2 /= 2;
        }
        return arg1 / arg3 + (arg0 / 4 << 10) + (arg2 / 32 << 7);
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V", line = 46)
    public static void method780(int arg0) {
        if (arg0 == 2) {
            field2535 = null;
            field2528 = null;
            field2526 = null;
            field2533 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Llb;", line = 60)
    public final class68 method424(boolean arg0) {
        if (arg0) {
            field2532 = -80;
        }
        field2527++;
        return class5.method69(this.field2529, false).method102(true, 6064, this.field2538);
    }
}
