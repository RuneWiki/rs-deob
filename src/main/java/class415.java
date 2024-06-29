import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class415 {

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Lkh;")
    public static class13 field6196 = new class13(64);

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field6197 = 0;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "F")
    public static float field6194;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lba;")
    public class265 field6193;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lt;")
    public class475 field6192;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static void method2605(int arg0) {
        if (arg0 >= 66) {
            field6196 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public static final void method2606(int arg0) {
        class372.field5543.method88(arg0 ^ 0x66);
        field6195++;
        if (arg0 != 0) {
            field6197 = 23;
        }
        class100.field1426.method88(125);
        class23.field282.method88(arg0 ^ 0x75);
        class48.field619.method88(110);
        class202.field3364.method88(92);
    }
}
