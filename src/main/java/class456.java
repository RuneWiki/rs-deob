import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class456 {

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
    public static int[] field6846 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Lqa;")
    public static class165 field6845;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public static final void method2771(int arg0, int arg1, int arg2) {
        field6847++;
        class177 var3 = class344.method2229(7, arg0, (byte) 122);
        if (arg2 == -22642) {
            var3.method1191(-18);
            var3.field2372 = arg1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method2772(int arg0) {
        field6845 = null;
        if (arg0 == 0) {
            field6846 = null;
        }
    }
}
