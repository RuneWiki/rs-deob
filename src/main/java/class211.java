import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class211 extends class272 {

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "B")
    public byte field2845;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "B")
    public byte field2842;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "B")
    public byte field2847;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "B")
    public byte field2848;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[S")
    public short[] field2846;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[B")
    public byte[] field2844;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class211(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field2845 = (byte) arg0;
        this.field2842 = (byte) arg1;
        this.field2843 = arg2;
        this.field2847 = (byte) arg3;
        this.field2848 = (byte) arg4;
        this.field2846 = arg5;
        this.field2844 = arg6;
    }
}
