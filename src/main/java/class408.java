import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class408 extends class399 {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "B")
    public byte field5740;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "B")
    public byte field5741;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field5744;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "B")
    public byte field5742;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "B")
    public byte field5743;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[S")
    public short[] field5746;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "[B")
    public byte[] field5745;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class408(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5740 = (byte) arg0;
        this.field5741 = (byte) arg1;
        this.field5744 = arg2;
        this.field5742 = (byte) arg3;
        this.field5743 = (byte) arg4;
        this.field5746 = arg5;
        this.field5745 = arg6;
    }
}
