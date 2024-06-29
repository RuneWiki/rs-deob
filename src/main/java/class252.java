import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class252 extends class59 {

    @OriginalMember(owner = "client!he", name = "p", descriptor = "B")
    public byte field3900;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "B")
    public byte field3901;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "B")
    public byte field3896;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "B")
    public byte field3899;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[S")
    public short[] field3897;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "[B")
    public byte[] field3895;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class252(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3900 = (byte) arg0;
        this.field3901 = (byte) arg1;
        this.field3898 = arg2;
        this.field3896 = (byte) arg3;
        this.field3899 = (byte) arg4;
        this.field3897 = arg5;
        this.field3895 = arg6;
    }
}
