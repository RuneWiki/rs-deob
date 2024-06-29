import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class53 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[Lqd;")
    public static class231[] field782 = new class231[0];

    @OriginalMember(owner = "client!th", name = "c", descriptor = "S")
    public static short field784 = 1;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Ltl;")
    private static class59 field791 = class85.method639("You can(Wt add yourself to your own friend list)3", 9588);

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Ltl;")
    public static class59 field785 = class85.method639(")3", 9588);

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Ltl;")
    private static class59 field793 = class85.method639(" from your ignore list first)3", 9588);

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Ltl;")
    public static class59 field786 = class85.method639("Schrifts-=tze geladen)3", 9588);

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Ltl;")
    public static class59 field795 = field791;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Ltl;")
    public static class59 field790 = field793;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "La;")
    public static class270 field788;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Lme;")
    public static class295 field789;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "[I")
    public static int[] field787;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[[B")
    public static byte[][] field794;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)La;", line = 26)
    public static final class270 method370(int arg0, byte arg1, int arg2) {
        if (arg1 >= -17) {
            return (class270) null;
        }
        field783++;
        for (class270 var3 = (class270) class129.field2134.method536(2); var3 != null; var3 = (class270) class129.field2134.method533(24)) {
            if (var3.field4685 && var3.method1883((byte) -66, arg2, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 78)
    public static void method371(int arg0) {
        field785 = null;
        field789 = null;
        field788 = null;
        field786 = null;
        field793 = null;
        field791 = null;
        field790 = null;
        field795 = null;
        field794 = (byte[][]) null;
        field782 = null;
        field787 = null;
        if (arg0 != 1) {
            method371(76);
        }
    }
}
