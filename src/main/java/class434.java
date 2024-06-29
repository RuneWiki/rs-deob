import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class434 extends class34 {

    @OriginalMember(owner = "client!te", name = "l", descriptor = "B")
    public byte field6436;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "B")
    public byte field6433;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field6438;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "B")
    public byte field6434;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "B")
    public byte field6439;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "[S")
    public short[] field6437;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[B")
    public byte[] field6435;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class434(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6436 = (byte) arg0;
        this.field6433 = (byte) arg1;
        this.field6438 = arg2;
        this.field6434 = (byte) arg3;
        this.field6439 = (byte) arg4;
        this.field6437 = arg5;
        this.field6435 = arg6;
    }
}
