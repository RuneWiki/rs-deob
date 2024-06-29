import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class161 extends class105 {

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "B")
    public byte field2391;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "B")
    public byte field2396;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "B")
    public byte field2392;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "B")
    public byte field2394;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "[S")
    public short[] field2395;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "[B")
    public byte[] field2393;

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class161(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2391 = (byte) arg0;
        this.field2396 = (byte) arg1;
        this.field2397 = arg2;
        this.field2392 = (byte) arg3;
        this.field2394 = (byte) arg4;
        this.field2395 = arg5;
        this.field2393 = arg6;
    }
}
