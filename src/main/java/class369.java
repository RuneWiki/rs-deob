import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class369 extends class68 {

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "B")
    public byte field4770;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "B")
    public byte field4772;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "B")
    public byte field4771;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "B")
    public byte field4776;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[S")
    public short[] field4773;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "[B")
    public byte[] field4775;

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class369(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4770 = (byte) arg0;
        this.field4772 = (byte) arg1;
        this.field4774 = arg2;
        this.field4771 = (byte) arg3;
        this.field4776 = (byte) arg4;
        this.field4773 = arg5;
        this.field4775 = arg6;
    }
}
