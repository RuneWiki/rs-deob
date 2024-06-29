import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class335 extends class423 {

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "B")
    public byte field4945;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "B")
    public byte field4944;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "B")
    public byte field4946;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "B")
    public byte field4942;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "[S")
    public short[] field4940;

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "[B")
    public byte[] field4943;

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class335(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4945 = (byte) arg0;
        this.field4944 = (byte) arg1;
        this.field4941 = arg2;
        this.field4946 = (byte) arg3;
        this.field4942 = (byte) arg4;
        this.field4940 = arg5;
        this.field4943 = arg6;
    }
}
