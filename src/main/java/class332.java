import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class332 extends class198 {

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "B")
    public byte field4395;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "B")
    public byte field4398;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "B")
    public byte field4397;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "B")
    public byte field4400;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "[S")
    public short[] field4399;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "[B")
    public byte[] field4396;

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class332(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4395 = (byte) arg0;
        this.field4398 = (byte) arg1;
        this.field4401 = arg2;
        this.field4397 = (byte) arg3;
        this.field4400 = (byte) arg4;
        this.field4399 = arg5;
        this.field4396 = arg6;
    }
}
