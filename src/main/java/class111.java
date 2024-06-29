import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class111 extends class428 {

    @OriginalMember(owner = "client!st", name = "k", descriptor = "B")
    public byte field1358;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "B")
    public byte field1357;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "B")
    public byte field1356;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "B")
    public byte field1361;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "[S")
    public short[] field1360;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "[B")
    public byte[] field1359;

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field1358 = (byte) arg0;
        this.field1357 = (byte) arg1;
        this.field1355 = arg2;
        this.field1356 = (byte) arg3;
        this.field1361 = (byte) arg4;
        this.field1360 = arg5;
        this.field1359 = arg6;
    }
}
