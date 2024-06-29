import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class572 extends class618 {

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lnea;")
    public class665 field8108;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Llj;II[B)V", line = 7)
    public class572(class565 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8108 = class128.method910(false, arg1, arg3, arg0, 6406, (byte) 127, arg2, 6406);
        this.field8108.method1151(false, 101, false);
    }
}
