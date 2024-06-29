import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class9 {

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lli;")
    public static class185 field175 = class245.method1649("Verbindung abgebrochen)3", -112);

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lli;")
    private static class185 field177 = class245.method1649("Oct", 123);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lli;")
    private static class185 field186 = class245.method1649("May", 125);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lli;")
    private static class185 field188 = class245.method1649("Jan", -88);

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lli;")
    private static class185 field185 = class245.method1649("Apr", -98);

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Lli;")
    private static class185 field178 = class245.method1649("Jul", -83);

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Lli;")
    private static class185 field183 = class245.method1649("Feb", -105);

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "[I")
    public static int[] field191 = new int[4096];

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lli;")
    private static class185 field174 = class245.method1649("Nov", 127);

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Lli;")
    private static class185 field192 = class245.method1649("Sep", 122);

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "Lli;")
    private static class185 field187 = class245.method1649("Mar", -14);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lli;")
    private static class185 field173 = class245.method1649("Aug", -115);

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "Lli;")
    private static class185 field194 = class245.method1649("Jun", 123);

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Lli;")
    private static class185 field195 = class245.method1649("Dec", -73);

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[Lli;")
    public static class185[] field189 = new class185[] { field188, field183, field187, field185, field186, field194, field178, field173, field192, field177, field174, field195 };

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lli;")
    public static class185 field181;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lhi;")
    public static class250 field180;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Z")
    public static final boolean method89(byte arg0, int arg1) {
        field176++;
        int var2 = 28 / ((-arg0 - 12) / 50);
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method90(byte arg0) {
        field177 = null;
        field181 = null;
        field180 = null;
        field188 = null;
        field194 = null;
        field191 = null;
        if (arg0 != 60) {
            return;
        }
        field189 = null;
        field185 = null;
        field183 = null;
        field178 = null;
        field186 = null;
        field173 = null;
        field192 = null;
        field175 = null;
        field174 = null;
        field195 = null;
        field187 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public static final int method91(int arg0, int arg1) {
        field190++;
        if (arg0 != 255) {
            method89((byte) -18, -25);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lli;ILjd;)I")
    public static final int method92(class185 arg0, int arg1, class118 arg2) {
        field172++;
        int var3 = arg2.field2155;
        arg2.method852(-23149, arg0.field3437);
        if (arg1 > -62) {
            method91(94, 50);
        }
        arg2.field2155 += class15.field265.method561(0, arg2.field2115, arg0.field3411, arg0.field3437, arg2.field2155, 0);
        return arg2.field2155 - var3;
    }
}
