import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class213 extends class294 {

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "B")
    public byte field3207;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "B")
    public byte field3209;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "B")
    public byte field3208;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "B")
    public byte field3203;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[S")
    public short[] field3206;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[B")
    public byte[] field3205;

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class213(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3207 = (byte) arg0;
        this.field3209 = (byte) arg1;
        this.field3204 = arg2;
        this.field3208 = (byte) arg3;
        this.field3203 = (byte) arg4;
        this.field3206 = arg5;
        this.field3205 = arg6;
    }
}
