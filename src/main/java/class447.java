import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class447 extends class670 {

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "B")
    public byte field6332;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "B")
    public byte field6328;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "B")
    public byte field6329;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "B")
    public byte field6326;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "[S")
    public short[] field6330;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[B")
    public byte[] field6327;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6332 = (byte) arg0;
        this.field6328 = (byte) arg1;
        this.field6331 = arg2;
        this.field6329 = (byte) arg3;
        this.field6326 = (byte) arg4;
        this.field6330 = arg5;
        this.field6327 = arg6;
    }
}
