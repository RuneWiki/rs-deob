import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class377 {

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lrm;")
    public static class234 field5696 = new class234(64);

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field5698 = 0;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[I")
    public static int[] field5699 = new int[2];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lmo;")
    public static class447 field5700;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
    public static boolean field5695;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "[I")
    public static int[] field5697;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method2401(int arg0) {
        field5696 = null;
        field5700 = null;
        if (arg0 != -24255) {
            field5695 = false;
        }
        field5699 = null;
        field5697 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)V")
    public static final void method2402(int arg0, int arg1, byte arg2) {
        field5694++;
        class211 var3 = class281.method1921(5, arg0, (byte) -116);
        if (arg2 != -55) {
            method2402(17, -10, (byte) -43);
        }
        var3.method1490((byte) 117);
        var3.field3379 = arg1;
    }
}
