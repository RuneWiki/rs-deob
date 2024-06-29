import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class248 extends class447 {

    @OriginalMember(owner = "client!up", name = "m", descriptor = "B")
    public byte field3707;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "B")
    public byte field3706;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "B")
    public byte field3711;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "B")
    public byte field3708;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "[S")
    public short[] field3705;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "[B")
    public byte[] field3710;

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class248(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3707 = (byte) arg0;
        this.field3706 = (byte) arg1;
        this.field3709 = arg2;
        this.field3711 = (byte) arg3;
        this.field3708 = (byte) arg4;
        this.field3705 = arg5;
        this.field3710 = arg6;
    }
}
