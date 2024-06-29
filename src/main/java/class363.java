import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class363 extends class389 {

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "B")
    public byte field4653;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "B")
    public byte field4649;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
    public int field4651;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "B")
    public byte field4647;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "B")
    public byte field4652;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "[S")
    public short[] field4648;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "[B")
    public byte[] field4650;

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class363(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4653 = (byte) arg0;
        this.field4649 = (byte) arg1;
        this.field4651 = arg2;
        this.field4647 = (byte) arg3;
        this.field4652 = (byte) arg4;
        this.field4648 = arg5;
        this.field4650 = arg6;
    }
}
