import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class484 extends class30 {

    @OriginalMember(owner = "client!wm", name = "fb", descriptor = "Lgj;")
    public class543 field6902;

    @OriginalMember(owner = "client!wm", name = "hb", descriptor = "Llu;")
    public static class610 field6904 = new class610(37, 7);

    @OriginalMember(owner = "client!wm", name = "db", descriptor = "F")
    public static float field6900;

    @OriginalMember(owner = "client!wm", name = "eb", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!wm", name = "ib", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!wm", name = "gb", descriptor = "[[Lvp;")
    public static class162[][] field6903;

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Llf;)V", line = 4)
    public class484(class201 arg0) {
        super(arg0);
        this.field6902 = new class543(arg0);
        super.field341 = new class265(super.field337);
        super.field374 = new class265(super.field337);
        super.field356 = new class265(super.field337);
        super.field383 = new class265(super.field337);
        super.field344 = new class265(super.field337);
        super.field351 = new class265(super.field337);
        super.field378 = new class265(super.field337);
        super.field346 = new class265(super.field337);
        super.field359 = new class265(super.field337);
        super.field362 = new class265(super.field337);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 25)
    public static void method2910(byte arg0) {
        field6904 = null;
        if (arg0 >= 86) {
            field6903 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V", line = 44)
    public final void method206(int arg0) {
        if (arg0 > -102) {
            field6900 = -0.56402034F;
        }
        this.field6902 = new class543((class201) super.field337);
        ++field6905;
    }
}
