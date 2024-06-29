import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class230 extends class696 {

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "B")
    public byte field2996;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "B")
    public byte field2995;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "B")
    public byte field3001;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "B")
    public byte field2997;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[S")
    public short[] field2998;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[B")
    public byte[] field2999;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class230(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2996 = (byte) arg0;
        this.field2995 = (byte) arg1;
        this.field3000 = arg2;
        this.field3001 = (byte) arg3;
        this.field2997 = (byte) arg4;
        this.field2998 = arg5;
        this.field2999 = arg6;
    }
}
