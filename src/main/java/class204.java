import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class204 {

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public int field2650 = 128;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public int field2660 = 128;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Ldq;")
    public static class493 field2649 = new class493(94, 16);

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "Lap;")
    public static class335 field2662 = new class335("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "I")
    public static int field2665 = 0;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!wt", name = "l", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "Ljs;")
    public static class218 field2664;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lwt;B)V", line = 4)
    public final void method1278(class204 arg0, byte arg1) {
        this.field2650 = arg0.field2650;
        this.field2656 = arg0.field2656;
        this.field2647 = arg0.field2647;
        field2651++;
        this.field2660 = arg0.field2660;
        this.field2652 = arg0.field2652;
        if (arg1 == -37) {
            this.field2659 = arg0.field2659;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)Lwt;", line = 21)
    public final class204 method1279(byte arg0) {
        field2657++;
        int var2 = 114 % ((arg0 - 9) / 56);
        return new class204(this.field2647, this.field2660, this.field2650, this.field2652, this.field2659, this.field2656);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)V", line = 32)
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 63 / ((arg0 - 49) / 61);
        field2658++;
        if (class353.field4542 == 1) {
            class223.field2828[class422.field5985 / 100].method130(class359.field4636 - 8, class203.field2646 + -8);
        }
        if (class353.field4542 == 2) {
            class223.field2828[(class422.field5985 / 100) + 4].method130(class359.field4636 - 8, class203.field2646 - 8);
        }
        class82.method673(-128);
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V", line = 91)
    public class204(int arg0) {
        this.field2647 = arg0;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(IIIIII)V", line = 98)
    private class204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2650 = arg2;
        this.field2659 = arg4;
        this.field2656 = arg5;
        this.field2660 = arg1;
        this.field2647 = arg0;
        this.field2652 = arg3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)V", line = 71)
    public static void method1281(boolean arg0) {
        field2664 = null;
        if (arg0) {
            field2664 = null;
        }
        field2662 = null;
        field2649 = null;
    }
}
