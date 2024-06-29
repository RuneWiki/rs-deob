import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class482 extends class101 {

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "Ljava/lang/String;")
    public String field6664;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "Laj;")
    public static class333 field6665;

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "Laj;")
    public static class333 field6667;

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "Z")
    public static boolean field6670;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lrs;I)Z")
    public static final boolean method2804(class680 arg0, int arg1) {
        field6669++;
        if (arg1 != -2080) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else if (!arg0.field9513) {
            return false;
        } else if (!arg0.method3759((byte) -107, class375.field5419)) {
            return false;
        } else if (class504.field6974.method3953((long) arg0.field9505, arg1 + 2094) == null) {
            return class516.field7054.method3953((long) arg0.field9512, 14) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V")
    public class482() {
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class482(String arg0) {
        this.field6664 = arg0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
    public static void method2805(byte arg0) {
        field6667 = null;
        if (arg0 != 25) {
            method2805((byte) 4);
        }
        field6665 = null;
    }
}
