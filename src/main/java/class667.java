import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class667 extends class571 {

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "B")
    public byte field9283;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "B")
    public byte field9282;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public int field9284;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "B")
    public byte field9288;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "B")
    public byte field9286;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "[S")
    public short[] field9287;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[B")
    public byte[] field9285;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class667(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field9283 = (byte) arg0;
        this.field9282 = (byte) arg1;
        this.field9284 = arg2;
        this.field9288 = (byte) arg3;
        this.field9286 = (byte) arg4;
        this.field9287 = arg5;
        this.field9285 = arg6;
    }
}
