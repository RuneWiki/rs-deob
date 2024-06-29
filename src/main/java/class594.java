import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class594 extends class287 {

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "B")
    public byte field8775;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "B")
    public byte field8771;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field8772;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "B")
    public byte field8770;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "B")
    public byte field8773;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "[S")
    public short[] field8774;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "[B")
    public byte[] field8776;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class594(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field8775 = (byte) arg0;
        this.field8771 = (byte) arg1;
        this.field8772 = arg2;
        this.field8770 = (byte) arg3;
        this.field8773 = (byte) arg4;
        this.field8774 = arg5;
        this.field8776 = arg6;
    }
}
