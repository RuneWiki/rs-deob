import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class232 extends class42 {

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[S")
    public short[] field3473;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "[B")
    public byte[] field3472;

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([S[B)V")
    public class232(short[] arg0, byte[] arg1) {
        this.field3473 = arg0;
        this.field3472 = arg1;
    }
}
