import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class391 extends class12 {

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "B")
    public byte field5722;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "B")
    public byte field5723;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public int field5719;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "B")
    public byte field5720;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "B")
    public byte field5717;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "[S")
    public short[] field5721;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "[B")
    public byte[] field5718;

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class391(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5722 = (byte) arg0;
        this.field5723 = (byte) arg1;
        this.field5719 = arg2;
        this.field5720 = (byte) arg3;
        this.field5717 = (byte) arg4;
        this.field5721 = arg5;
        this.field5718 = arg6;
    }
}
