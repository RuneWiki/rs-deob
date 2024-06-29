import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class433 extends class472 {

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "B")
    public byte field5958;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "B")
    public byte field5962;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field5961;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "B")
    public byte field5964;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "B")
    public byte field5959;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[S")
    public short[] field5963;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "[B")
    public byte[] field5960;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class433(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5958 = (byte) arg0;
        this.field5962 = (byte) arg1;
        this.field5961 = arg2;
        this.field5964 = (byte) arg3;
        this.field5959 = (byte) arg4;
        this.field5963 = arg5;
        this.field5960 = arg6;
    }
}
