import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class48 extends class43 {

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[S")
    public short[] field564;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "[B")
    public byte[] field565;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "([S[B)V")
    public class48(short[] arg0, byte[] arg1) {
        this.field564 = arg0;
        this.field565 = arg1;
    }
}
