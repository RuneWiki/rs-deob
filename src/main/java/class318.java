import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class318 {

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "[I")
    public static int[] field4521 = new int[1000];

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Lfba;")
    public static class27 field4523 = new class27(41, 6);

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "[I")
    public static int[] field4525 = new int[3];

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "Lbu;")
    public static class21 field4524 = new class21(99, 12);

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
    public static final void method2060(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4522++;
        if (class355.field5003 <= 1) {
            class21.field353.method4080(true, class21.field353.field10059, 2);
        } else {
            class21.field353.method4080(arg0, class21.field353.field10059, 4);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
    public static void method2061(int arg0) {
        field4521 = null;
        field4524 = null;
        field4523 = null;
        if (arg0 != 972836960) {
            method2060(true);
        }
        field4525 = null;
    }
}
