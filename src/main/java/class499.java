import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class499 extends class237 {

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "B")
    public byte field7350;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "B")
    public byte field7346;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public int field7351;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "B")
    public byte field7348;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "B")
    public byte field7347;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "[S")
    public short[] field7352;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "[B")
    public byte[] field7349;

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class499(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field7350 = (byte) arg0;
        this.field7346 = (byte) arg1;
        this.field7351 = arg2;
        this.field7348 = (byte) arg3;
        this.field7347 = (byte) arg4;
        this.field7352 = arg5;
        this.field7349 = arg6;
    }
}
