import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class550 extends class91 {

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "B")
    public byte field7641;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "B")
    public byte field7636;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public int field7639;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "B")
    public byte field7640;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "B")
    public byte field7642;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "[S")
    public short[] field7638;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "[B")
    public byte[] field7637;

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class550(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field7641 = (byte) arg0;
        this.field7636 = (byte) arg1;
        this.field7639 = arg2;
        this.field7640 = (byte) arg3;
        this.field7642 = (byte) arg4;
        this.field7638 = arg5;
        this.field7637 = arg6;
    }
}
