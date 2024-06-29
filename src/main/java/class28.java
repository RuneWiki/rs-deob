import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class28 extends class315 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "B")
    public byte field291;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "B")
    public byte field292;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field293;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "B")
    public byte field297;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "B")
    public byte field296;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[S")
    public short[] field295;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[B")
    public byte[] field294;

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field291 = (byte) arg0;
        this.field292 = (byte) arg1;
        this.field293 = arg2;
        this.field297 = (byte) arg3;
        this.field296 = (byte) arg4;
        this.field295 = arg5;
        this.field294 = arg6;
    }
}
