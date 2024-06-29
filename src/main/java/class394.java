import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class394 extends class236 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "B")
    public byte field5809;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "B")
    public byte field5810;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public int field5807;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "B")
    public byte field5812;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "B")
    public byte field5811;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[S")
    public short[] field5813;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "[B")
    public byte[] field5808;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class394(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5809 = (byte) arg0;
        this.field5810 = (byte) arg1;
        this.field5807 = arg2;
        this.field5812 = (byte) arg3;
        this.field5811 = (byte) arg4;
        this.field5813 = arg5;
        this.field5808 = arg6;
    }
}
