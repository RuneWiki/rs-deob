import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class558 extends class424 {

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field7284;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public int field7283;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lpe;")
    public static class615 field7282;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 4)
    public static void method2987(byte arg0) {
        field7282 = null;
        if (arg0 != -3) {
            method2987((byte) 29);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(II)V", line = 19)
    public class558(int arg0, int arg1) {
        this.field7284 = arg1;
        this.field7283 = arg0;
    }
}
