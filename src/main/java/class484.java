import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class484 {

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lda;")
    public class400 field6993 = null;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lpia;")
    public class54 field6992 = null;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "Ltm;")
    public static class334 field6994 = new class334(100, 3);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lda;)V", line = 50)
    public class484(class400 arg0) {
        this.field6993 = arg0;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lda;Lpia;)V", line = 57)
    public class484(class400 arg0, class54 arg1) {
        this.field6993 = arg0;
        this.field6992 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 13)
    public static void method2931(byte arg0) {
        if (arg0 == -123) {
            field6994 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZJ)V", line = 27)
    public static final void method2932(boolean arg0, long arg1) {
        field6991++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class164.method1231(30410, arg1 - 1L);
            class164.method1231(30410, 1L);
        } else {
            class164.method1231(30410, arg1);
        }
        if (!arg0) {
            field6994 = null;
        }
    }
}
