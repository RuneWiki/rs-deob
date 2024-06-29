import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class740 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field10208;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static final void method4123(byte arg0) {
        field10207++;
        if (class18.field237 || arg0 < 84) {
            return;
        }
        class107.method784(class483.field6607, (byte) 120);
        if (class681.field9516 != null) {
            class107.method784(class681.field9516, (byte) 127);
        }
        class18.field237 = true;
    }
}
