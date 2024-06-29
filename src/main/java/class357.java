import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class357 extends class409 {

    @OriginalMember(owner = "client!od", name = "k", descriptor = "B")
    public byte field5188;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "B")
    public byte field5189;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public int field5184;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "B")
    public byte field5185;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "B")
    public byte field5187;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "[S")
    public short[] field5186;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "[B")
    public byte[] field5190;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class357(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5188 = (byte) arg0;
        this.field5189 = (byte) arg1;
        this.field5184 = arg2;
        this.field5185 = (byte) arg3;
        this.field5187 = (byte) arg4;
        this.field5186 = arg5;
        this.field5190 = arg6;
    }
}
