import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 extends class379 {

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "B")
    public byte field203;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "B")
    public byte field202;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public int field208;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "B")
    public byte field204;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "B")
    public byte field206;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[S")
    public short[] field205;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[B")
    public byte[] field207;

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field203 = (byte) arg0;
        this.field202 = (byte) arg1;
        this.field208 = arg2;
        this.field204 = (byte) arg3;
        this.field206 = (byte) arg4;
        this.field205 = arg5;
        this.field207 = arg6;
    }
}
