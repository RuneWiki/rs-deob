import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class201 extends class111 {

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "B")
    public byte field2860;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "B")
    public byte field2857;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field2861;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "B")
    public byte field2859;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "B")
    public byte field2862;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[S")
    public short[] field2856;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[B")
    public byte[] field2858;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class201(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2860 = (byte) arg0;
        this.field2857 = (byte) arg1;
        this.field2861 = arg2;
        this.field2859 = (byte) arg3;
        this.field2862 = (byte) arg4;
        this.field2856 = arg5;
        this.field2858 = arg6;
    }
}
