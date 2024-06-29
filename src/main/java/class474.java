import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class474 extends class182 {

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "B")
    public byte field7229;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "B")
    public byte field7232;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field7235;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "B")
    public byte field7233;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "B")
    public byte field7234;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[S")
    public short[] field7231;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[B")
    public byte[] field7230;

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class474(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field7229 = (byte) arg0;
        this.field7232 = (byte) arg1;
        this.field7235 = arg2;
        this.field7233 = (byte) arg3;
        this.field7234 = (byte) arg4;
        this.field7231 = arg5;
        this.field7230 = arg6;
    }
}
