import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class450 extends class142 {

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "B")
    public byte field6362;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "B")
    public byte field6360;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "B")
    public byte field6361;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "B")
    public byte field6365;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[S")
    public short[] field6363;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[B")
    public byte[] field6366;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class450(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6362 = (byte) arg0;
        this.field6360 = (byte) arg1;
        this.field6364 = arg2;
        this.field6361 = (byte) arg3;
        this.field6365 = (byte) arg4;
        this.field6363 = arg5;
        this.field6366 = arg6;
    }
}
