import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class401 extends class100 {

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "B")
    public byte field6108;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "B")
    public byte field6109;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public int field6107;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "B")
    public byte field6112;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "B")
    public byte field6106;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "[S")
    public short[] field6110;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[B")
    public byte[] field6111;

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class401(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6108 = (byte) arg0;
        this.field6109 = (byte) arg1;
        this.field6107 = arg2;
        this.field6112 = (byte) arg3;
        this.field6106 = (byte) arg4;
        this.field6110 = arg5;
        this.field6111 = arg6;
    }
}
