import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 extends class577 {

    @OriginalMember(owner = "client!pja", name = "m", descriptor = "[S")
    public short[] field553;

    @OriginalMember(owner = "client!pja", name = "l", descriptor = "[B")
    public byte[] field552;

    @OriginalMember(owner = "client!pja", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class43(short[] arg0, byte[] arg1) {
        this.field553 = arg0;
        this.field552 = arg1;
    }
}
