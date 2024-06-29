import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class625 extends class426 {

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "B")
    public byte field8979;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "B")
    public byte field8974;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field8975;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "B")
    public byte field8976;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "B")
    public byte field8980;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[S")
    public short[] field8977;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[B")
    public byte[] field8978;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class625(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field8979 = (byte) arg0;
        this.field8974 = (byte) arg1;
        this.field8975 = arg2;
        this.field8976 = (byte) arg3;
        this.field8980 = (byte) arg4;
        this.field8977 = arg5;
        this.field8978 = arg6;
    }
}
