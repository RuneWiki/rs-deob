import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class113 extends class12 {

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lvf;")
    public static class265 field1980 = class87.method582(-46, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lvf;")
    public static class265 field1979 = class87.method582(-46, " ");

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "[I")
    public static int[] field1982 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field1990 = -1;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field1994 = -1;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "B")
    public byte field1993;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lfl;")
    public static class192 field1981;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Lfl;")
    public static class192 field1983;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lvf;")
    public class265 field1985;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Lvf;")
    public class265 field1987;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)I")
    public static final int method744(byte arg0, int arg1) {
        field1986++;
        if (arg0 > -39) {
            method746(22, 14);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZI)V")
    public static final void method745(int arg0, boolean arg1, int arg2) {
        class36.field842 = arg2 - class269.field4796;
        field1988++;
        int var3 = class36.field842 - ((int) ((float) class186.field3365.field89 / class101.field1793));
        class174.field3125 = class155.field2871 + class176.field3141 - arg0 - 1;
        int var4 = (int) ((float) class186.field3365.field89 / class101.field1793) + class36.field842;
        if (var3 < 0) {
            class36.field842 = (int) ((float) class186.field3365.field89 / class101.field1793);
        }
        if (class213.field3824 < var4) {
            class36.field842 = class213.field3824 - ((int) ((float) class186.field3365.field89 / class101.field1793));
        }
        int var5 = class174.field3125 - (int) ((float) class186.field3365.field84 / class101.field1793);
        int var6 = class174.field3125 + ((int) ((float) class186.field3365.field84 / class101.field1793));
        if (var5 < 0) {
            class174.field3125 = (int) ((float) class186.field3365.field84 / class101.field1793);
        }
        if (var6 > class155.field2871) {
            class174.field3125 = class155.field2871 - ((int) ((float) class186.field3365.field84 / class101.field1793));
        }
        if (!arg1) {
            method745(-104, false, 92);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z")
    public static final boolean method746(int arg0, int arg1) {
        field1984++;
        if (arg1 != 3878) {
            method744((byte) -31, -66);
        }
        return arg0 >= 48 && arg0 <= 57;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public static final void method747(int arg0) {
        class126.field2261.method1893(-94);
        field1991++;
        if (arg0 != -58) {
            field1990 = -95;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public static void method748(int arg0) {
        field1982 = null;
        field1979 = null;
        field1981 = null;
        field1983 = null;
        field1980 = null;
        if (arg0 > -35) {
            field1981 = null;
        }
    }
}
