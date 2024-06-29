import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class474 implements class243 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Ljn;")
    private class668 field6632;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Ljn;")
    public static class668 field6631;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I", line = 5)
    public final int method365(int arg0) {
        if (arg0 <= 81) {
            return 1;
        } else {
            field6634++;
            return this.field6632.method3781(-20793) ? 100 : this.field6632.method3809(-2);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljn;)V", line = 20)
    public class474(class668 arg0) {
        this.field6632 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)I", line = 30)
    public static final int method2786(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class346.field4551 - 1; var2++) {
            if (arg0 < class91.field1281[var2] + class271.field3715[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class346.field4551 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Luv;", line = 51)
    public final class333 method360(int arg0) {
        field6630++;
        return arg0 == -21954 ? class333.field4426 : null;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V", line = 62)
    public static void method2787(int arg0) {
        if (arg0 != 100) {
            field6631 = null;
        }
        field6631 = null;
    }
}
