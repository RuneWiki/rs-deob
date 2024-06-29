import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class202 extends class155 {

    @OriginalMember(owner = "client!of", name = "D", descriptor = "Lkf;")
    public class265 field3244;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "[Lhl;")
    public static class229[] field3243 = new class229[4];

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
    public static final void method1418(int arg0, int arg1) {
        int var2 = -45 % ((-arg0 - 62) / 54);
        field3242++;
        class190.field3074.method97(118);
        class190.field3074 = new class17(arg1);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lkf;)V")
    public class202(class265 arg0) {
        this.field3244 = arg0;
    }

    @OriginalMember(owner = "client!of", name = "i", descriptor = "(I)V")
    public static void method1419(int arg0) {
        field3243 = null;
        if (arg0 != 25908) {
            method1419(117);
        }
    }
}
