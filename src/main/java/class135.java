import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class135 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2701 = 1;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[I")
    public static int[] field2700 = new int[25];

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public static int[] field2703 = new int[100];

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Ljd;")
    private static class92 field2709 = class202.method1325((byte) 90, "Please remove ");

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Ljd;")
    public static class92 field2707 = class202.method1325((byte) 90, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
    public static int[] field2710 = new int[2048];

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Ljd;")
    public static class92 field2704 = field2709;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[Lvh;")
    public static class205[] field2711 = new class205[4];

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljd;")
    public static class92 field2706 = field2709;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lbg;")
    public static class18 field2699 = new class18();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZZ)Lud;")
    public static final class192 method902(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        field2698++;
        if (arg2 != 1000000) {
            return null;
        }
        class108 var5 = null;
        if (class195.field3819 != null) {
            var5 = new class108(arg0, class195.field3819, class121.field2451[arg0], 1000000);
        }
        return new class192(var5, class46.field1015, arg0, arg4, arg3, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[[[I)V")
    public static final void method903(int arg0, int arg1, int arg2, int[][][] arg3) {
        class151.field3003 = arg0;
        class64.field1310 = arg1;
        class93.field1872 = arg2;
        class31.field698 = new class43[arg0][arg1][arg2];
        class81.field1643 = new int[arg0][arg1 + 1][arg2 + 1];
        class158.field3146 = arg3;
        class100.method695();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public static final int method904(int arg0, int arg1) {
        if (arg1 != -26322) {
            method905(20);
        }
        field2702++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method905(int arg0) {
        if (arg0 != -12277) {
            field2700 = null;
        }
        field2699 = null;
        field2707 = null;
        field2703 = null;
        field2709 = null;
        field2710 = null;
        field2706 = null;
        field2700 = null;
        field2704 = null;
        field2711 = null;
    }
}
