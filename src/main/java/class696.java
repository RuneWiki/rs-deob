import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class696 {

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "Loe;")
    public static class202 field9719 = new class202(14, 0);

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "Loe;")
    public static class202 field9722 = new class202(15, 4);

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "Loe;")
    public static class202 field9723 = new class202(16, -2);

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "Loe;")
    public static class202 field9724 = new class202(17, 0);

    @OriginalMember(owner = "client!sfa", name = "i", descriptor = "Loe;")
    public static class202 field9725 = new class202(18, -2);

    @OriginalMember(owner = "client!sfa", name = "j", descriptor = "Loe;")
    public static class202 field9726 = new class202(19, -2);

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "Loe;")
    public static class202 field9727 = new class202(22, -2);

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "Loe;")
    public static class202 field9728 = new class202(23, 4);

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "Loe;")
    public static class202 field9729 = new class202(24, -1);

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "Loe;")
    public static class202 field9730 = new class202(26, 0);

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "Loe;")
    public static class202 field9731 = new class202(27, 0);

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "Loe;")
    public static class202 field9732 = new class202(28, -2);

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "[Loe;")
    private static class202[] field9733 = new class202[32];

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field9717;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "Lr;")
    public class184 field9720;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lka;")
    public class472 field9718;

    @OriginalMember(owner = "client!sfa", name = "r", descriptor = "[B")
    public static byte[] field9734;

    static {
        class202[] var0 = class340.method2006(0);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field9733[var0[var1].field2395] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V", line = 4)
    public static void method3927(int arg0) {
        field9730 = null;
        field9725 = null;
        field9732 = null;
        field9724 = null;
        field9731 = null;
        field9727 = null;
        field9726 = null;
        field9723 = null;
        field9729 = null;
        field9722 = null;
        field9719 = null;
        field9733 = null;
        int var1 = 119 % ((-arg0 - 53) / 55);
        field9734 = null;
        field9728 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lji;I)Lkr;", line = 33)
    public static final class746 method3928(class611 arg0, int arg1) {
        if (arg1 > -6) {
            method3929(-127, 96, 42);
        }
        field9721++;
        int var2 = arg0.method3418(-2);
        return new class746(var2);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method3929(int arg0, int arg1, int arg2) {
        field9717++;
        if (arg2 != 28) {
            method3928(null, -50);
        }
        return (arg1 & 0x70000) != 0 | class125.method803(true, arg1, arg0) || class335.method1994(-116, arg1, arg0);
    }
}
