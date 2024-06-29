import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class83 extends class238 {

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "B")
    public byte field878;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "B")
    public byte field881;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "B")
    public byte field877;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "B")
    public byte field879;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "[S")
    public short[] field883;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "[B")
    public byte[] field882;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field878 = (byte) arg0;
        this.field881 = (byte) arg1;
        this.field880 = arg2;
        this.field877 = (byte) arg3;
        this.field879 = (byte) arg4;
        this.field883 = arg5;
        this.field882 = arg6;
    }
}
