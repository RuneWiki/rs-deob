import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class640 extends class503 {

    @OriginalMember(owner = "client!cia", name = "o", descriptor = "B")
    public byte field8884;

    @OriginalMember(owner = "client!cia", name = "r", descriptor = "B")
    public byte field8887;

    @OriginalMember(owner = "client!cia", name = "s", descriptor = "I")
    public int field8888;

    @OriginalMember(owner = "client!cia", name = "q", descriptor = "B")
    public byte field8886;

    @OriginalMember(owner = "client!cia", name = "p", descriptor = "B")
    public byte field8885;

    @OriginalMember(owner = "client!cia", name = "u", descriptor = "[S")
    public short[] field8890;

    @OriginalMember(owner = "client!cia", name = "t", descriptor = "[B")
    public byte[] field8889;

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class640(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field8884 = (byte) arg0;
        this.field8887 = (byte) arg1;
        this.field8888 = arg2;
        this.field8886 = (byte) arg3;
        this.field8885 = (byte) arg4;
        this.field8890 = arg5;
        this.field8889 = arg6;
    }
}
