import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class245 extends class287 {

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Lrj;")
    public class492 field3352;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "[Z")
    public static boolean[] field3354 = new boolean[8];

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Lea;")
    public static class115 field3353 = new class115("LIVE", 0);

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)V", line = 5)
    public static void method1476(byte arg0) {
        field3353 = null;
        if (arg0 > -5) {
            method1476((byte) -101);
        }
        field3354 = null;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lrj;)V", line = 17)
    public class245(class492 arg0) {
        this.field3352 = arg0;
    }
}
