import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class581 extends class90 {

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "B")
    public byte field8225;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "B")
    public byte field8222;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public int field8221;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "B")
    public byte field8226;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "B")
    public byte field8224;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "[S")
    public short[] field8227;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "[B")
    public byte[] field8223;

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class581(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field8225 = (byte) arg0;
        this.field8222 = (byte) arg1;
        this.field8221 = arg2;
        this.field8226 = (byte) arg3;
        this.field8224 = (byte) arg4;
        this.field8227 = arg5;
        this.field8223 = arg6;
    }
}
