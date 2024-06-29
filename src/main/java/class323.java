import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class323 extends class101 {

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[S")
    public short[] field4713;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "[B")
    public byte[] field4712;

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class323(short[] arg0, byte[] arg1) {
        this.field4713 = arg0;
        this.field4712 = arg1;
    }
}
