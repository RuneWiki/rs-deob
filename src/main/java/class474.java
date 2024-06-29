import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class474 extends class112 {

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "B")
    public byte field6606;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "B")
    public byte field6604;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public int field6605;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "B")
    public byte field6603;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "B")
    public byte field6601;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "[S")
    public short[] field6600;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[B")
    public byte[] field6602;

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class474(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field6606 = (byte) arg0;
        this.field6604 = (byte) arg1;
        this.field6605 = arg2;
        this.field6603 = (byte) arg3;
        this.field6601 = (byte) arg4;
        this.field6600 = arg5;
        this.field6602 = arg6;
    }
}
