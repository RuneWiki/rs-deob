import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class699 extends class416 {

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "B")
    public byte field9857;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "B")
    public byte field9859;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public int field9858;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "B")
    public byte field9861;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "B")
    public byte field9862;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "[S")
    public short[] field9856;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "[B")
    public byte[] field9860;

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class699(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field9857 = (byte) arg0;
        this.field9859 = (byte) arg1;
        this.field9858 = arg2;
        this.field9861 = (byte) arg3;
        this.field9862 = (byte) arg4;
        this.field9856 = arg5;
        this.field9860 = arg6;
    }
}
