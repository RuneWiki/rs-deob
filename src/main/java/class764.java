import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class764 extends class540 {

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[S")
    public short[] field10511;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "[B")
    public byte[] field10512;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class764(short[] arg0, byte[] arg1) {
        this.field10511 = arg0;
        this.field10512 = arg1;
    }
}
