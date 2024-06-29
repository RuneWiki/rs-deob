import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class104 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lhb;")
    private static class44 field2653 = class102.method810("glow3:", -28606);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[Z")
    public static boolean[] field2655 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lhb;")
    public static class44 field2658 = field2653;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
    public static boolean field2652 = false;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lhb;")
    private static class44 field2656 = class102.method810("as it was used to break our rules)3", -28606);

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lhb;")
    public static class44 field2667 = class102.method810("sich mit einer anderen Welt zu verbinden)3", -28606);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lhb;")
    public static class44 field2659 = field2656;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Z")
    public static volatile boolean field2665 = true;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lhb;")
    public static class44 field2660 = class102.method810("60 Sekunden noch einmal)3)3)3", -28606);

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "[[[B")
    public static byte[][][] field2668 = new byte[4][104][104];

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lhb;")
    public static class44 field2664 = class102.method810("scape main", -28606);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lee;")
    public static class30 field2661;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILm;)Z", line = 37)
    public static final boolean method820(int arg0, class72 arg1) {
        field2662++;
        if (arg1.field1776 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field1776.length; var2++) {
            int var3 = class13.method86((byte) -108, var2, arg1);
            int var4 = arg1.field1783[var2];
            if (arg1.field1776[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field1776[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field1776[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != 3) {
            field2658 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 94)
    public static void method821(int arg0) {
        field2656 = null;
        field2660 = null;
        field2668 = null;
        field2655 = null;
        field2661 = null;
        field2659 = null;
        if (arg0 <= 34) {
            method822(-44, null, 80);
        }
        field2653 = null;
        field2664 = null;
        field2658 = null;
        field2667 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILtd;I)Lne;", line = 125)
    public static final class83 method822(int arg0, class116 arg1, int arg2) {
        field2657++;
        if (class105.method825(-61, arg0, arg1)) {
            int var3 = 56 / ((69 - arg2) / 50);
            return class130.method968(9178);
        } else {
            return null;
        }
    }
}
