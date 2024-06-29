import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class474 extends class389 {

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "B")
    public byte field6177;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "B")
    public byte field6178;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public int field6172;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "B")
    public byte field6176;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "B")
    public byte field6174;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "[S")
    public short[] field6175;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "[B")
    public byte[] field6173;

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class474(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6177 = (byte) arg0;
        this.field6178 = (byte) arg1;
        this.field6172 = arg2;
        this.field6176 = (byte) arg3;
        this.field6174 = (byte) arg4;
        this.field6175 = arg5;
        this.field6173 = arg6;
    }
}
