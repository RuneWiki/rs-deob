import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class199 extends class113 {

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "B")
    public byte field2971;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "B")
    public byte field2966;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "B")
    public byte field2969;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "B")
    public byte field2972;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[S")
    public short[] field2967;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[B")
    public byte[] field2968;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class199(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2971 = (byte) arg0;
        this.field2966 = (byte) arg1;
        this.field2970 = arg2;
        this.field2969 = (byte) arg3;
        this.field2972 = (byte) arg4;
        this.field2967 = arg5;
        this.field2968 = arg6;
    }
}
