import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class562 extends class321 {

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "B")
    public byte field8036;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "B")
    public byte field8032;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public int field8035;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "B")
    public byte field8033;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "B")
    public byte field8030;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "[S")
    public short[] field8034;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "[B")
    public byte[] field8031;

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class562(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field8036 = (byte) arg0;
        this.field8032 = (byte) arg1;
        this.field8035 = arg2;
        this.field8033 = (byte) arg3;
        this.field8030 = (byte) arg4;
        this.field8034 = arg5;
        this.field8031 = arg6;
    }
}
