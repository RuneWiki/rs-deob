import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class176 extends class382 {

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "B")
    public byte field2862;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "B")
    public byte field2856;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field2860;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "B")
    public byte field2857;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "B")
    public byte field2861;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[S")
    public short[] field2859;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[B")
    public byte[] field2858;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class176(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2862 = (byte) arg0;
        this.field2856 = (byte) arg1;
        this.field2860 = arg2;
        this.field2857 = (byte) arg3;
        this.field2861 = (byte) arg4;
        this.field2859 = arg5;
        this.field2858 = arg6;
    }
}
