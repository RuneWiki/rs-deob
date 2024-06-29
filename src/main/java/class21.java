import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class21 extends class66 {

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "[S")
    public short[] field334;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "[B")
    public byte[] field335;

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "([S[B)V")
    public class21(short[] arg0, byte[] arg1) {
        this.field334 = arg0;
        this.field335 = arg1;
    }
}
