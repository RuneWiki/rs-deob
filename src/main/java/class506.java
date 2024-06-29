import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class506 extends class371 {

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "B")
    public byte field7399;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "B")
    public byte field7394;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public int field7397;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "B")
    public byte field7398;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "B")
    public byte field7395;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[S")
    public short[] field7396;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "[B")
    public byte[] field7400;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class506(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field7399 = (byte) arg0;
        this.field7394 = (byte) arg1;
        this.field7397 = arg2;
        this.field7398 = (byte) arg3;
        this.field7395 = (byte) arg4;
        this.field7396 = arg5;
        this.field7400 = arg6;
    }
}
