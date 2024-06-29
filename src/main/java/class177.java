import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class177 extends class546 {

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "B")
    public byte field2541;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "B")
    public byte field2539;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "B")
    public byte field2538;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "B")
    public byte field2537;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "[S")
    public short[] field2536;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[B")
    public byte[] field2535;

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2541 = (byte) arg0;
        this.field2539 = (byte) arg1;
        this.field2540 = arg2;
        this.field2538 = (byte) arg3;
        this.field2537 = (byte) arg4;
        this.field2536 = arg5;
        this.field2535 = arg6;
    }
}
