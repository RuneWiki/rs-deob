import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class380 extends class275 {

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "B")
    public byte field5706;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "B")
    public byte field5708;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public int field5707;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "B")
    public byte field5703;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "B")
    public byte field5705;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "[S")
    public short[] field5704;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "[B")
    public byte[] field5709;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class380(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5706 = (byte) arg0;
        this.field5708 = (byte) arg1;
        this.field5707 = arg2;
        this.field5703 = (byte) arg3;
        this.field5705 = (byte) arg4;
        this.field5704 = arg5;
        this.field5709 = arg6;
    }
}
