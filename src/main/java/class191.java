import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class191 extends class569 {

    @OriginalMember(owner = "client!we", name = "j", descriptor = "B")
    public byte field2383;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "B")
    public byte field2385;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "B")
    public byte field2386;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "B")
    public byte field2384;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[S")
    public short[] field2380;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[B")
    public byte[] field2382;

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class191(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2383 = (byte) arg0;
        this.field2385 = (byte) arg1;
        this.field2381 = arg2;
        this.field2386 = (byte) arg3;
        this.field2384 = (byte) arg4;
        this.field2380 = arg5;
        this.field2382 = arg6;
    }
}
