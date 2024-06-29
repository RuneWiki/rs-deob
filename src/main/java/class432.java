import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class432 extends class121 {

    @OriginalMember(owner = "client!da", name = "m", descriptor = "B")
    public byte field6331;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "B")
    public byte field6332;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public int field6330;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "B")
    public byte field6326;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "B")
    public byte field6327;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[S")
    public short[] field6328;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[B")
    public byte[] field6329;

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class432(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6331 = (byte) arg0;
        this.field6332 = (byte) arg1;
        this.field6330 = arg2;
        this.field6326 = (byte) arg3;
        this.field6327 = (byte) arg4;
        this.field6328 = arg5;
        this.field6329 = arg6;
    }
}
