import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class277 extends class50 {

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "B")
    public byte field3607;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "B")
    public byte field3606;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "B")
    public byte field3604;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "B")
    public byte field3608;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "[S")
    public short[] field3603;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "[B")
    public byte[] field3609;

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class277(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3607 = (byte) arg0;
        this.field3606 = (byte) arg1;
        this.field3605 = arg2;
        this.field3604 = (byte) arg3;
        this.field3608 = (byte) arg4;
        this.field3603 = arg5;
        this.field3609 = arg6;
    }
}
