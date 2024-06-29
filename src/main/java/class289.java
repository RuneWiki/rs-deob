import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class289 extends class313 {

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "B")
    public byte field4627;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "B")
    public byte field4626;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "B")
    public byte field4629;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "B")
    public byte field4623;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "[S")
    public short[] field4628;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[B")
    public byte[] field4624;

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4627 = (byte) arg0;
        this.field4626 = (byte) arg1;
        this.field4625 = arg2;
        this.field4629 = (byte) arg3;
        this.field4623 = (byte) arg4;
        this.field4628 = arg5;
        this.field4624 = arg6;
    }
}
