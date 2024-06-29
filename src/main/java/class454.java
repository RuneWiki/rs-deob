import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class454 extends class588 {

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "B")
    public byte field6432;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "B")
    public byte field6434;

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "I")
    public int field6430;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "B")
    public byte field6436;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "B")
    public byte field6431;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "[S")
    public short[] field6433;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "[B")
    public byte[] field6435;

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class454(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6432 = (byte) arg0;
        this.field6434 = (byte) arg1;
        this.field6430 = arg2;
        this.field6436 = (byte) arg3;
        this.field6431 = (byte) arg4;
        this.field6433 = arg5;
        this.field6435 = arg6;
    }
}
