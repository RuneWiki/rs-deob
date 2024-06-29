import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class158 extends class481 {

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "B")
    public byte field2414;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "B")
    public byte field2410;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "B")
    public byte field2412;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "B")
    public byte field2408;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "[S")
    public short[] field2411;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "[B")
    public byte[] field2409;

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class158(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2414 = (byte) arg0;
        this.field2410 = (byte) arg1;
        this.field2413 = arg2;
        this.field2412 = (byte) arg3;
        this.field2408 = (byte) arg4;
        this.field2411 = arg5;
        this.field2409 = arg6;
    }
}
