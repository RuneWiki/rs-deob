import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class23 extends class55 {

    @OriginalMember(owner = "client!an", name = "o", descriptor = "B")
    public byte field243;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "B")
    public byte field240;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "B")
    public byte field244;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "B")
    public byte field241;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "[S")
    public short[] field242;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "[B")
    public byte[] field238;

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field243 = (byte) arg0;
        this.field240 = (byte) arg1;
        this.field239 = arg2;
        this.field244 = (byte) arg3;
        this.field241 = (byte) arg4;
        this.field242 = arg5;
        this.field238 = arg6;
    }
}
