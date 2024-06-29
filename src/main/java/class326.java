import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class326 extends class413 {

    @OriginalMember(owner = "client!el", name = "m", descriptor = "B")
    public byte field4634;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "B")
    public byte field4632;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "B")
    public byte field4633;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "B")
    public byte field4628;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[S")
    public short[] field4630;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[B")
    public byte[] field4631;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class326(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4634 = (byte) arg0;
        this.field4632 = (byte) arg1;
        this.field4629 = arg2;
        this.field4633 = (byte) arg3;
        this.field4628 = (byte) arg4;
        this.field4630 = arg5;
        this.field4631 = arg6;
    }
}
