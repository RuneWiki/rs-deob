import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class584 {

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Lmu;")
    public static class303 field7986 = new class303(60, 0);

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[I")
    public static int[] field7987 = new int[200];

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 6)
    public static void method3340(int arg0) {
        field7987 = null;
        if (arg0 <= -123) {
            field7986 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lma;I)Lma;", line = 20)
    public static final class12 method3341(class12 arg0, int arg1) {
        field7985++;
        class12 var2 = arg0 == null ? new class12() : new class12(arg0);
        var2.method71(arg1, -94, 128);
        return var2;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I", line = 32)
    public static final int method3342(int arg0) {
        if (arg0 <= 17) {
            field7987 = null;
        }
        field7984++;
        return class498.field6967;
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V", line = 52)
    public static final void method3343(int arg0) {
        if (arg0 != -26162) {
            field7987 = null;
        }
        class124.field2128.method996(-118);
        field7988++;
        class493.field6825.method996(-89);
        class94.field1657.method996(-87);
        class566.field7800.method996(-95);
    }
}
