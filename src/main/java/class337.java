import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class337 extends class638 {

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "B")
    public byte field4929;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "B")
    public byte field4924;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "B")
    public byte field4927;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "B")
    public byte field4928;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "[S")
    public short[] field4926;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "[B")
    public byte[] field4930;

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class337(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field4929 = (byte) arg0;
        this.field4924 = (byte) arg1;
        this.field4925 = arg2;
        this.field4927 = (byte) arg3;
        this.field4928 = (byte) arg4;
        this.field4926 = arg5;
        this.field4930 = arg6;
    }
}
