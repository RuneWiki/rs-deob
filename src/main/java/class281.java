import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class281 extends class27 {

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "B")
    public byte field3760;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "B")
    public byte field3754;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "B")
    public byte field3755;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "B")
    public byte field3757;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[S")
    public short[] field3756;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "[B")
    public byte[] field3759;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3760 = (byte) arg0;
        this.field3754 = (byte) arg1;
        this.field3758 = arg2;
        this.field3755 = (byte) arg3;
        this.field3757 = (byte) arg4;
        this.field3756 = arg5;
        this.field3759 = arg6;
    }
}
