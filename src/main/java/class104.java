import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class104 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[I")
    public static int[] field1865 = new int[2000];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lwh;")
    public static class236 field1864 = new class236(32);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Loc;")
    public static class151 field1867 = class137.method873(2, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "[[[I")
    public static int[][][] field1872 = new int[4][105][105];

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Loc;")
    private static class151 field1869 = class137.method873(2, "Malformed login packet)3");

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Z")
    public static boolean field1871 = false;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Loc;")
    public static class151 field1873 = field1869;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Loc;")
    private static class151 field1870 = class137.method873(2, "Loaded input handler");

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Loc;")
    public static class151 field1868 = field1870;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "J")
    public static long field1874;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public static final void method632(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 105) {
            return;
        }
        if (arg2 >= class233.field4281 && class154.field2793 >= arg2) {
            int var5 = class116.method704(class25.field524, arg0, 27104, class79.field1526);
            int var6 = class116.method704(class25.field524, arg4, 27104, class79.field1526);
            class174.method1109(var6, (byte) 121, arg2, var5, arg1);
        }
        field1866++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1868 = null;
        field1872 = null;
        field1865 = null;
        field1869 = null;
        field1873 = null;
        field1870 = null;
        field1867 = null;
        if (arg0 != 11703) {
            field1874 = 73L;
        }
        field1864 = null;
    }
}
