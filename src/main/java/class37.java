import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class37 extends class381 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "[S")
    public short[] field569;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[B")
    public byte[] field570;

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class37(short[] arg0, byte[] arg1) {
        this.field569 = arg0;
        this.field570 = arg1;
    }
}
