import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 extends class76 {

    @OriginalMember(owner = "client!l", name = "s", descriptor = "B")
    public byte field307;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "B")
    public byte field302;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public int field301;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "B")
    public byte field305;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "B")
    public byte field303;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "[S")
    public short[] field304;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[B")
    public byte[] field306;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field307 = (byte) arg0;
        this.field302 = (byte) arg1;
        this.field301 = arg2;
        this.field305 = (byte) arg3;
        this.field303 = (byte) arg4;
        this.field304 = arg5;
        this.field306 = arg6;
    }
}
