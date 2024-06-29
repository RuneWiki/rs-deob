import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class234 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lma;")
    public static class5 field3868 = class12.method119("::clientdrop", (byte) 95);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[Z")
    public static boolean[] field3872 = new boolean[112];

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Z")
    public static boolean field3870 = true;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lrj;")
    public static class237 field3869;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[[Lwh;")
    public static class56[][] field3864;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)I", line = 15)
    public static final int method1660(byte arg0, int arg1) {
        if (arg0 >= -54) {
            field3864 = (class56[][]) ((class56[][]) null);
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        field3866++;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILfk;Lfk;)V", line = 32)
    public static final void method1661(int arg0, class266 arg1, class266 arg2) {
        field3865++;
        if (arg0 < 20) {
            field3872 = (boolean[]) null;
        }
        if (arg1.field4544 != null) {
            arg1.method1828(-102);
        }
        arg1.field4544 = arg2;
        arg1.field4546 = arg2.field4546;
        arg1.field4544.field4546 = arg1;
        arg1.field4546.field4544 = arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 54)
    public static void method1662(int arg0) {
        field3864 = (class56[][]) null;
        if (arg0 != 40960) {
            field3872 = (boolean[]) null;
        }
        field3872 = null;
        field3869 = null;
        field3868 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILma;)Lpd;", line = 81)
    public static final class100 method1663(int arg0, class5 arg1) {
        field3867++;
        if (arg0 != -7643) {
            method1662(96);
        }
        for (class100 var2 = (class100) class280.field4746.method1475(14); var2 != null; var2 = (class100) class280.field4746.method1486(38)) {
            if (var2.field1486.method62(arg1, -23269)) {
                return var2;
            }
        }
        return null;
    }
}
