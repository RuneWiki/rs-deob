import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class598 extends class1 {

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "B")
    public byte field8592;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "B")
    public byte field8589;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
    public int field8590;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "B")
    public byte field8587;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "B")
    public byte field8591;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "[S")
    public short[] field8588;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "[B")
    public byte[] field8586;

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class598(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field8592 = (byte) arg0;
        this.field8589 = (byte) arg1;
        this.field8590 = arg2;
        this.field8587 = (byte) arg3;
        this.field8591 = (byte) arg4;
        this.field8588 = arg5;
        this.field8586 = arg6;
    }
}
