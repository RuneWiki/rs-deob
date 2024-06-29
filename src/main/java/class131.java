import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class131 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lok;")
    public static class41 field1960 = class137.method956(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 45);

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field1962 = 0;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
    public static int[] field1961 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lok;")
    public static class41 field1959 = class137.method956("Weiter", 45);

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
    public static int[] field1963 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Lok;")
    private static class41 field1967 = class137.method956("Starting 3d Library", 45);

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Lok;")
    public static class41 field1964 = field1967;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 18)
    public static void method921(int arg0) {
        field1961 = null;
        field1964 = null;
        field1967 = null;
        field1959 = null;
        field1963 = null;
        if (arg0 != 19529) {
            method921(109);
        }
        field1960 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 55)
    public static final void method922(byte arg0) {
        field1965++;
        class60.field862.method135(18436);
        if (arg0 != -68) {
            field1964 = (class41) null;
        }
        class2.field19.method135(18436);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lok;B)I", line = 85)
    public static final int method923(class41 arg0, byte arg1) {
        field1966++;
        if (arg1 != -87) {
            return -19;
        } else if (class268.field4273 == null || arg0.method275(false) == 0) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class268.field4273.field4760; var2++) {
                if (class268.field4273.field4754[var2].method302(class230.field3650, class285.field4644, -34).method277((byte) -62, arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }
}
