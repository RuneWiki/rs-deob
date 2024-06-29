import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class209 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lij;")
    public static class50 field3467 = class78.method578(123, "<)4col> x");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lij;")
    public static class50 field3465 = class78.method578(126, "showingVideoAd");

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lij;")
    public static class50 field3469 = class78.method578(123, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lpe;")
    public static class100 field3473 = new class100(5);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lv;")
    public static class143 field3468;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
    public static final void method1399(boolean arg0, int arg1) {
        class235.field3929.method770(arg0, arg1);
        field3470++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method1400(int arg0) {
        field3465 = null;
        field3469 = null;
        field3473 = null;
        if (arg0 != 5) {
            method1399(true, 112);
        }
        field3468 = null;
        field3467 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I")
    public static final int method1401(int arg0, int arg1) {
        if (arg1 != 5) {
            method1399(true, 62);
        }
        field3466++;
        return arg0 & 0xFF;
    }
}
