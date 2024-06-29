import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class687 extends class430 {

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "Ljava/lang/String;")
    public String field9754;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lgr;")
    public static class530 field9755 = new class530(4, 11);

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field9757 = 0;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method3896(int arg0) {
        if (arg0 == 4) {
            field9755 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V")
    public static final void method3897(int arg0, int arg1) {
        field9756++;
        class172.field2412.method2207(arg0, 1);
        class207.field3137.method2207(arg0, arg1 ^ 0x5);
        if (arg1 != 4) {
            field9755 = null;
        }
        class445.field6357.method2207(arg0, 1);
        class56.field960.method2207(arg0, 1);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    public class687() {
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class687(String arg0) {
        this.field9754 = arg0;
    }
}
