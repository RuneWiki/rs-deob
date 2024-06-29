import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class222 extends class435 {

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "B")
    public byte field3304;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "B")
    public byte field3307;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "B")
    public byte field3309;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "B")
    public byte field3308;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "[S")
    public short[] field3310;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "[B")
    public byte[] field3306;

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3304 = (byte) arg0;
        this.field3307 = (byte) arg1;
        this.field3305 = arg2;
        this.field3309 = (byte) arg3;
        this.field3308 = (byte) arg4;
        this.field3310 = arg5;
        this.field3306 = arg6;
    }
}
