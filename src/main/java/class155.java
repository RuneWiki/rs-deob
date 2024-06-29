import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class155 extends class448 {

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "B")
    public byte field2218;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "B")
    public byte field2221;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "B")
    public byte field2220;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "B")
    public byte field2222;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[S")
    public short[] field2223;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "[B")
    public byte[] field2224;

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class155(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2218 = (byte) arg0;
        this.field2221 = (byte) arg1;
        this.field2219 = arg2;
        this.field2220 = (byte) arg3;
        this.field2222 = (byte) arg4;
        this.field2223 = arg5;
        this.field2224 = arg6;
    }
}
