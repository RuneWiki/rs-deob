import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class283 extends class179 {

    @OriginalMember(owner = "client!li", name = "k", descriptor = "[S")
    public short[] field4281;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "[B")
    public byte[] field4280;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([S[B)V")
    public class283(short[] arg0, byte[] arg1) {
        this.field4281 = arg0;
        this.field4280 = arg1;
    }
}
