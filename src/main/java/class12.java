import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class12 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public static int[] field163 = new int[5];

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lre;")
    public static class266 field165 = new class266();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "J")
    public static long field162;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method78(byte arg0) {
        if (arg0 <= 124) {
            field163 = null;
        }
        field165 = null;
        field163 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method79(int arg0, int arg1) {
        field161++;
        class194 var2 = (class194) class139.field2322.method1063((byte) -35, (long) arg0);
        if (var2 != null) {
            var2.method1074((byte) -116);
            if (arg1 != 5) {
                method79(47, -109);
            }
        }
    }
}
