import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class138 extends class476 {

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "B")
    public byte field2185;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "B")
    public byte field2183;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public int field2181;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "B")
    public byte field2184;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "B")
    public byte field2182;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "[S")
    public short[] field2187;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "[B")
    public byte[] field2186;

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class138(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2185 = (byte) arg0;
        this.field2183 = (byte) arg1;
        this.field2181 = arg2;
        this.field2184 = (byte) arg3;
        this.field2182 = (byte) arg4;
        this.field2187 = arg5;
        this.field2186 = arg6;
    }
}
