import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class117 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lor;")
    public static class296 field1581 = null;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Lde;", line = 5)
    public static final class164 method822(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        return var3 == null ? null : var3.field123;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 17)
    public static void method824(int arg0) {
        if (arg0 != -7634) {
            method822(-37, 21, -32);
        }
        field1581 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lqq;I)Lqq;")
    public abstract class263 method823(class263 arg0, int arg1);
}
