import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class621 extends class177 {

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "B")
    public byte field9007;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "B")
    public byte field9005;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public int field9009;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "B")
    public byte field9004;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "B")
    public byte field9003;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "[S")
    public short[] field9006;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "[B")
    public byte[] field9008;

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class621(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field9007 = (byte) arg0;
        this.field9005 = (byte) arg1;
        this.field9009 = arg2;
        this.field9004 = (byte) arg3;
        this.field9003 = (byte) arg4;
        this.field9006 = arg5;
        this.field9008 = arg6;
    }
}
