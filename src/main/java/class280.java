import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class280 extends class18 {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "B")
    public byte field3857;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "B")
    public byte field3860;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "B")
    public byte field3855;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "B")
    public byte field3858;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[S")
    public short[] field3859;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[B")
    public byte[] field3856;

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3857 = (byte) arg0;
        this.field3860 = (byte) arg1;
        this.field3854 = arg2;
        this.field3855 = (byte) arg3;
        this.field3858 = (byte) arg4;
        this.field3859 = arg5;
        this.field3856 = arg6;
    }
}
