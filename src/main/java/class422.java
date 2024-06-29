import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class422 extends class600 {

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "B")
    public byte field6022;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "B")
    public byte field6019;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public int field6020;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "B")
    public byte field6024;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "B")
    public byte field6021;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "[S")
    public short[] field6023;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "[B")
    public byte[] field6025;

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class422(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6022 = (byte) arg0;
        this.field6019 = (byte) arg1;
        this.field6020 = arg2;
        this.field6024 = (byte) arg3;
        this.field6021 = (byte) arg4;
        this.field6023 = arg5;
        this.field6025 = arg6;
    }
}
