import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class228 extends class640 {

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "B")
    public byte field3479;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "B")
    public byte field3483;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "B")
    public byte field3481;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "B")
    public byte field3480;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "[S")
    public short[] field3478;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[B")
    public byte[] field3477;

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3479 = (byte) arg0;
        this.field3483 = (byte) arg1;
        this.field3482 = arg2;
        this.field3481 = (byte) arg3;
        this.field3480 = (byte) arg4;
        this.field3478 = arg5;
        this.field3477 = arg6;
    }
}
