import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class765 extends class461 {

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "B")
    public byte field10537;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "B")
    public byte field10532;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field10531;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "B")
    public byte field10534;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "B")
    public byte field10535;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[S")
    public short[] field10533;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "[B")
    public byte[] field10536;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class765(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field10537 = (byte) arg0;
        this.field10532 = (byte) arg1;
        this.field10531 = arg2;
        this.field10534 = (byte) arg3;
        this.field10535 = (byte) arg4;
        this.field10533 = arg5;
        this.field10536 = arg6;
    }
}
