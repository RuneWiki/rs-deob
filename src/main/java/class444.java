import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class444 extends class631 {

    @OriginalMember(owner = "client!eea", name = "n", descriptor = "B")
    public byte field5879;

    @OriginalMember(owner = "client!eea", name = "m", descriptor = "B")
    public byte field5878;

    @OriginalMember(owner = "client!eea", name = "k", descriptor = "I")
    public int field5876;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "B")
    public byte field5874;

    @OriginalMember(owner = "client!eea", name = "o", descriptor = "B")
    public byte field5880;

    @OriginalMember(owner = "client!eea", name = "l", descriptor = "[S")
    public short[] field5877;

    @OriginalMember(owner = "client!eea", name = "j", descriptor = "[B")
    public byte[] field5875;

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class444(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field5879 = (byte) arg0;
        this.field5878 = (byte) arg1;
        this.field5876 = arg2;
        this.field5874 = (byte) arg3;
        this.field5880 = (byte) arg4;
        this.field5877 = arg5;
        this.field5875 = arg6;
    }
}
