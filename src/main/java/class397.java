import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class397 extends class601 {

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "B")
    public byte field6042;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "B")
    public byte field6044;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public int field6041;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "B")
    public byte field6043;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "B")
    public byte field6039;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "[S")
    public short[] field6045;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "[B")
    public byte[] field6040;

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class397(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6042 = (byte) arg0;
        this.field6044 = (byte) arg1;
        this.field6041 = arg2;
        this.field6043 = (byte) arg3;
        this.field6039 = (byte) arg4;
        this.field6045 = arg5;
        this.field6040 = arg6;
    }
}
