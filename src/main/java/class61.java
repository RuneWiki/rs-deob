import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class61 extends class272 {

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "B")
    public byte field765;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "B")
    public byte field759;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "B")
    public byte field760;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "B")
    public byte field762;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "[S")
    public short[] field761;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "[B")
    public byte[] field764;

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class61(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field765 = (byte) arg0;
        this.field759 = (byte) arg1;
        this.field763 = arg2;
        this.field760 = (byte) arg3;
        this.field762 = (byte) arg4;
        this.field761 = arg5;
        this.field764 = arg6;
    }
}
