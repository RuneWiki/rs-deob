import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class606 extends class101 {

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "B")
    public byte field8740;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "B")
    public byte field8741;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public int field8742;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "B")
    public byte field8738;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "B")
    public byte field8737;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    public short[] field8739;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[B")
    public byte[] field8743;

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class606(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field8740 = (byte) arg0;
        this.field8741 = (byte) arg1;
        this.field8742 = arg2;
        this.field8738 = (byte) arg3;
        this.field8737 = (byte) arg4;
        this.field8739 = arg5;
        this.field8743 = arg6;
    }
}
