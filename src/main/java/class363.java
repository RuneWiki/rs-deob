import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class363 extends class211 {

    @OriginalMember(owner = "client!j", name = "l", descriptor = "B")
    public byte field5349;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "B")
    public byte field5350;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public int field5353;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "B")
    public byte field5348;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "B")
    public byte field5351;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[S")
    public short[] field5352;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[B")
    public byte[] field5354;

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class363(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5349 = (byte) arg0;
        this.field5350 = (byte) arg1;
        this.field5353 = arg2;
        this.field5348 = (byte) arg3;
        this.field5351 = (byte) arg4;
        this.field5352 = arg5;
        this.field5354 = arg6;
    }
}
