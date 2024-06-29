import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class229 extends class726 {

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "B")
    public byte field3320;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "B")
    public byte field3318;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "B")
    public byte field3314;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "B")
    public byte field3317;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "[S")
    public short[] field3315;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "[B")
    public byte[] field3316;

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3320 = (byte) arg0;
        this.field3318 = (byte) arg1;
        this.field3319 = arg2;
        this.field3314 = (byte) arg3;
        this.field3317 = (byte) arg4;
        this.field3315 = arg5;
        this.field3316 = arg6;
    }
}
