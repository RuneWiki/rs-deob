import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class294 extends class62 {

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "B")
    public byte field3865;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "B")
    public byte field3863;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "B")
    public byte field3869;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "B")
    public byte field3864;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "[S")
    public short[] field3866;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "[B")
    public byte[] field3867;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class294(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3865 = (byte) arg0;
        this.field3863 = (byte) arg1;
        this.field3868 = arg2;
        this.field3869 = (byte) arg3;
        this.field3864 = (byte) arg4;
        this.field3866 = arg5;
        this.field3867 = arg6;
    }
}
