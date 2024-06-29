import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class25 {

    @OriginalMember(owner = "client!to", name = "j", descriptor = "B")
    public byte field79;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "B")
    public byte field77;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public int field81;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "B")
    public byte field80;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "B")
    public byte field82;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "[S")
    public short[] field83;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "[B")
    public byte[] field78;

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field79 = (byte) arg0;
        this.field77 = (byte) arg1;
        this.field81 = arg2;
        this.field80 = (byte) arg3;
        this.field82 = (byte) arg4;
        this.field83 = arg5;
        this.field78 = arg6;
    }
}
