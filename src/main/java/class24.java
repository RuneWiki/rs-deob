import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class24 extends class312 {

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "B")
    public byte field278;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "B")
    public byte field280;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public int field276;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "B")
    public byte field279;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "B")
    public byte field275;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[S")
    public short[] field281;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "[B")
    public byte[] field277;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field278 = (byte) arg0;
        this.field280 = (byte) arg1;
        this.field276 = arg2;
        this.field279 = (byte) arg3;
        this.field275 = (byte) arg4;
        this.field281 = arg5;
        this.field277 = arg6;
    }
}
