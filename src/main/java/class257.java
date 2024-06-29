import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class257 extends class272 {

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Lth;")
    public class389 field3762;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lth;)V")
    public class257(class389 arg0) {
        this.field3762 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Lct;")
    public static final class88 method1605(int arg0, int arg1, int arg2) {
        if (class330.field4786[arg0][arg1][arg2] == null) {
            boolean var3 = class330.field4786[0][arg1][arg2] != null && class330.field4786[0][arg1][arg2].field1088 != null;
            if (var3 && arg0 >= class314.field4441 - 1) {
                return null;
            }
            class448.method2614(arg0, arg1, arg2);
        }
        return class330.field4786[arg0][arg1][arg2];
    }
}
