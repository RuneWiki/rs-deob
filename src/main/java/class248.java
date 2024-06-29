import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class248 extends class356 {

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "Lme;")
    public class178 field3192;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "Lgl;")
    public static class547 field3193 = new class547(9, 6);

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "Lkfa;")
    public static class549 field3194 = new class549(64, 4);

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(III)Lfj;")
    public static final class599 method1430(int arg0, int arg1, int arg2) {
        class287 var3 = class97.field1074[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3678;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
    public static void method1431(byte arg0) {
        if (arg0 <= -119) {
            field3194 = null;
            field3193 = null;
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lme;)V")
    public class248(class178 arg0) {
        this.field3192 = arg0;
    }
}
