import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class257 extends class190 {

    @OriginalMember(owner = "client!os", name = "n", descriptor = "B")
    public byte field3600;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "B")
    public byte field3597;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "B")
    public byte field3599;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "B")
    public byte field3596;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[S")
    public short[] field3595;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "[B")
    public byte[] field3601;

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field3600 = (byte) arg0;
        this.field3597 = (byte) arg1;
        this.field3598 = arg2;
        this.field3599 = (byte) arg3;
        this.field3596 = (byte) arg4;
        this.field3595 = arg5;
        this.field3601 = arg6;
    }
}
