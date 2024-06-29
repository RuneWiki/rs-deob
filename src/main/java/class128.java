import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class128 extends class291 {

    @OriginalMember(owner = "client!op", name = "l", descriptor = "B")
    public byte field1718;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "B")
    public byte field1716;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public int field1720;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "B")
    public byte field1714;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "B")
    public byte field1717;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "[S")
    public short[] field1715;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "[B")
    public byte[] field1719;

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1718 = (byte) arg0;
        this.field1716 = (byte) arg1;
        this.field1720 = arg2;
        this.field1714 = (byte) arg3;
        this.field1717 = (byte) arg4;
        this.field1715 = arg5;
        this.field1719 = arg6;
    }
}
