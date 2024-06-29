import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class693 extends class499 {

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "B")
    public byte field9648;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "B")
    public byte field9644;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public int field9645;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "B")
    public byte field9650;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "B")
    public byte field9647;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "[S")
    public short[] field9646;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "[B")
    public byte[] field9649;

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class693(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field9648 = (byte) arg0;
        this.field9644 = (byte) arg1;
        this.field9645 = arg2;
        this.field9650 = (byte) arg3;
        this.field9647 = (byte) arg4;
        this.field9646 = arg5;
        this.field9649 = arg6;
    }
}
