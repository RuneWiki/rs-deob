import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class690 extends class287 {

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "Lqr;")
    public class623 field9667;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field9668 = -1;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Lqk;")
    public static class148 field9669 = new class148(114, 3);

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lqr;)V", line = 5)
    public class690(class623 arg0) {
        this.field9667 = arg0;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V", line = 19)
    public static void method3930(byte arg0) {
        if (arg0 >= -93) {
            method3930((byte) 116);
        }
        field9669 = null;
    }
}
