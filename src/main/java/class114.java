import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class114 extends class502 {

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "B")
    public byte field1969;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "B")
    public byte field1966;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "B")
    public byte field1967;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "B")
    public byte field1963;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "[S")
    public short[] field1964;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "[B")
    public byte[] field1968;

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1969 = (byte) arg0;
        this.field1966 = (byte) arg1;
        this.field1965 = arg2;
        this.field1967 = (byte) arg3;
        this.field1963 = (byte) arg4;
        this.field1964 = arg5;
        this.field1968 = arg6;
    }
}
