import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class class611 extends class152 {

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "Lwe;")
    public class428 field8196;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public int field8197;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "[Lne;")
    public static class338[] field8198 = new class338[14];

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lwe;I)V", line = 5)
    public class611(class428 arg0, int arg1) {
        this.field8196 = arg0;
        this.field8197 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V", line = 19)
    public static void method3462(int arg0) {
        field8198 = null;
        if (arg0 != 14) {
            field8198 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z")
    public abstract boolean method790(int arg0);

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method788(int arg0);
}
