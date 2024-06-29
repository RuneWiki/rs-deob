import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class360 extends class345 {

    @OriginalMember(owner = "client!o", name = "j", descriptor = "B")
    public byte field5517;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "B")
    public byte field5523;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public int field5518;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "B")
    public byte field5521;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "B")
    public byte field5522;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "[S")
    public short[] field5519;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[B")
    public byte[] field5520;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class360(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5517 = (byte) arg0;
        this.field5523 = (byte) arg1;
        this.field5518 = arg2;
        this.field5521 = (byte) arg3;
        this.field5522 = (byte) arg4;
        this.field5519 = arg5;
        this.field5520 = arg6;
    }
}
