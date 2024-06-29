import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class369 extends class393 {

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "B")
    public byte field4749;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "B")
    public byte field4746;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public int field4747;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "B")
    public byte field4748;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "B")
    public byte field4750;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[S")
    public short[] field4751;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[B")
    public byte[] field4745;

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class369(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4749 = (byte) arg0;
        this.field4746 = (byte) arg1;
        this.field4747 = arg2;
        this.field4748 = (byte) arg3;
        this.field4750 = (byte) arg4;
        this.field4751 = arg5;
        this.field4745 = arg6;
    }
}
