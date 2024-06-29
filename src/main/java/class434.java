import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class434 extends class681 {

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "B")
    public byte field5781;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "B")
    public byte field5783;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "B")
    public byte field5782;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "B")
    public byte field5785;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "[S")
    public short[] field5786;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "[B")
    public byte[] field5784;

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class434(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5781 = (byte) arg0;
        this.field5783 = (byte) arg1;
        this.field5787 = arg2;
        this.field5782 = (byte) arg3;
        this.field5785 = (byte) arg4;
        this.field5786 = arg5;
        this.field5784 = arg6;
    }
}
