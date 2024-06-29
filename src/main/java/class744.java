import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class744 extends class618 {

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "B")
    public byte field10061;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "B")
    public byte field10062;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public int field10067;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "B")
    public byte field10063;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "B")
    public byte field10064;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "[S")
    public short[] field10065;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "[B")
    public byte[] field10066;

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class744(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field10061 = (byte) arg0;
        this.field10062 = (byte) arg1;
        this.field10067 = arg2;
        this.field10063 = (byte) arg3;
        this.field10064 = (byte) arg4;
        this.field10065 = arg5;
        this.field10066 = arg6;
    }
}
