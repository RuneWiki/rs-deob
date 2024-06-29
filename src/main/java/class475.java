import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class475 extends class221 {

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "B")
    public byte field7262;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "B")
    public byte field7264;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public int field7263;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "B")
    public byte field7261;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "B")
    public byte field7266;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[S")
    public short[] field7265;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[B")
    public byte[] field7267;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class475(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field7262 = (byte) arg0;
        this.field7264 = (byte) arg1;
        this.field7263 = arg2;
        this.field7261 = (byte) arg3;
        this.field7266 = (byte) arg4;
        this.field7265 = arg5;
        this.field7267 = arg6;
    }
}
