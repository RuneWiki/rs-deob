import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class386 extends class651 {

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "B")
    public byte field5639;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "B")
    public byte field5642;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public int field5643;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "B")
    public byte field5637;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "B")
    public byte field5638;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[S")
    public short[] field5640;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "[B")
    public byte[] field5641;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class386(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5639 = (byte) arg0;
        this.field5642 = (byte) arg1;
        this.field5643 = arg2;
        this.field5637 = (byte) arg3;
        this.field5638 = (byte) arg4;
        this.field5640 = arg5;
        this.field5641 = arg6;
    }
}
