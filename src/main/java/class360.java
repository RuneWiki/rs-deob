import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class360 extends class270 {

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "[S")
    public short[] field4710;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "[B")
    public byte[] field4709;

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "([S[B)V")
    public class360(short[] arg0, byte[] arg1) {
        this.field4710 = arg0;
        this.field4709 = arg1;
    }
}
