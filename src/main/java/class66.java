import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class66 extends class338 {

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "[S")
    public short[] field685;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "[B")
    public byte[] field686;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "([S[B)V")
    public class66(short[] arg0, byte[] arg1) {
        this.field685 = arg0;
        this.field686 = arg1;
    }
}
