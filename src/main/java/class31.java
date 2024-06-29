import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class31 extends class393 {

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "[B")
    public byte[] field526;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "Z")
    public static boolean field525 = false;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "[I")
    public static int[] field527;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 10)
    public static void method262(int arg0) {
        if (arg0 >= 71) {
            field527 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "([B)V", line = 20)
    public class31(byte[] arg0) {
        this.field526 = arg0;
    }
}
