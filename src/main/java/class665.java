import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class665 extends class154 {

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "J")
    public long field9234;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public static int field9233 = 0;

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "Lwg;")
    public static class450 field9235 = new class450(11, 0, 1, 2);

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field9236;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V", line = 5)
    public static void method3759(int arg0) {
        field9236 = null;
        field9235 = null;
        if (arg0 != 2) {
            field9236 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V", line = 20)
    public class665() {
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(J)V", line = 23)
    public class665(long arg0) {
        this.field9234 = arg0;
    }
}
