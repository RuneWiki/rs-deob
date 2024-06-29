import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class506 extends class439 {

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "[S")
    public short[] field7410;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "[B")
    public byte[] field7411;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "([S[B)V")
    public class506(short[] arg0, byte[] arg1) {
        this.field7410 = arg0;
        this.field7411 = arg1;
    }
}
