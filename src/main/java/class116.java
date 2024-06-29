import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class116 extends class64 {

    @OriginalMember(owner = "client!s", name = "kb", descriptor = "Lrd;")
    public static class114 field2704 = class84.method656("bevor Sie den Vorgang wiederholen)3", (byte) 122);

    @OriginalMember(owner = "client!s", name = "qb", descriptor = "J")
    public static long field2710 = 0L;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "Z")
    public static boolean field2698 = false;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "Lrd;")
    private static class114 field2694 = class84.method656("glow3:", (byte) 120);

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "Lrd;")
    public static class114 field2695 = field2694;

    @OriginalMember(owner = "client!s", name = "rb", descriptor = "Lrd;")
    public static class114 field2711 = class84.method656("Mem:", (byte) 121);

    @OriginalMember(owner = "client!s", name = "ob", descriptor = "Lo;")
    public static class92 field2708 = new class92();

    @OriginalMember(owner = "client!s", name = "ub", descriptor = "Z")
    public static boolean field2714 = false;

    @OriginalMember(owner = "client!s", name = "wb", descriptor = "[Lrd;")
    public static class114[] field2716 = new class114[5];

    @OriginalMember(owner = "client!s", name = "vb", descriptor = "Ldd;")
    public static class26 field2715 = new class26(100);

    @OriginalMember(owner = "client!s", name = "yb", descriptor = "[I")
    public static int[] field2718 = new int[128];

    @OriginalMember(owner = "client!s", name = "zb", descriptor = "I")
    public static int field2719 = 0;

    @OriginalMember(owner = "client!s", name = "Ab", descriptor = "Ldd;")
    public static class26 field2720 = new class26(200);

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!s", name = "hb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!s", name = "ib", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!s", name = "mb", descriptor = "I")
    public int field2706;

    @OriginalMember(owner = "client!s", name = "nb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!s", name = "pb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!s", name = "tb", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!s", name = "jb", descriptor = "Lpb;")
    public static class100 field2703;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "Ljd;")
    public static class66 field2697;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "Lke;")
    public static class73 field2699;

    @OriginalMember(owner = "client!s", name = "lb", descriptor = "Z")
    public static boolean field2705;

    @OriginalMember(owner = "client!s", name = "xb", descriptor = "[I")
    public static int[] field2717;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILid;)V")
    private final void method897(int arg0, int arg1, class60 arg2) {
        if (arg0 != 21) {
            method902((byte) -27, 112);
        }
        field2702++;
        if (arg1 == 1) {
            this.field2706 = arg2.method467(255);
            this.field2696 = arg2.method462((byte) 116);
            this.field2700 = arg2.method462((byte) 116);
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static void method898(int arg0) {
        if (arg0 > -6) {
            field2697 = null;
        }
        field2717 = null;
        field2697 = null;
        field2704 = null;
        field2699 = null;
        field2708 = null;
        field2703 = null;
        field2695 = null;
        field2694 = null;
        field2716 = null;
        field2720 = null;
        field2715 = null;
        field2718 = null;
        field2711 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lid;I)V")
    public final void method899(class60 arg0, int arg1) {
        int var3 = -38 % ((-arg1 - 57) / 38);
        field2713++;
        while (true) {
            int var4 = arg0.method462((byte) 116);
            if (var4 == 0) {
                return;
            }
            this.method897(21, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    public static final void method900(byte arg0) {
        field2709++;
        if (class98.field2216 == null) {
            return;
        }
        if (arg0 > -52) {
            method900((byte) -27);
        }
        class20.method134(127);
        if (class110.field2575 > 0) {
            class98.field2216.method167(65535, 256);
            class110.field2575 = 0;
        }
        class98.field2216.method172(125);
        class98.field2216 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lnd;B)Z")
    public static final boolean method901(class90 arg0, byte arg1) {
        field2707++;
        int var2 = arg0.field2049;
        if (arg1 != 118) {
            return false;
        } else if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class106.field2437++;
            class82.field1827++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class3.method10(0, class101.method786((byte) 127, new class114[] { class128.field3073, class5.field64[var2] }), 0, (byte) 122, 9, class88.field1952, 0);
            class3.method10(0, class101.method786((byte) 125, new class114[] { class128.field3073, class5.field64[var2] }), 0, (byte) 123, 40, class117.field2721, 0);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class3.method10(0, class101.method786((byte) 126, new class114[] { class128.field3073, arg0.field2025 }), 0, (byte) 126, 21, class88.field1952, 0);
            class73.field1623++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Z")
    public static final boolean method902(byte arg0, int arg1) {
        if (arg0 != 116) {
            method900((byte) -55);
        }
        field2701++;
        return (arg1 & 0x1) != 0;
    }
}
