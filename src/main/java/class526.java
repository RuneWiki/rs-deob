import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class526 extends class609 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "B")
    public byte field7411;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "B")
    public byte field7413;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field7414;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "B")
    public byte field7416;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "B")
    public byte field7415;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "[S")
    public short[] field7412;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[B")
    public byte[] field7417;

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII[S[B)V")
    public class526(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field7411 = (byte) arg0;
        this.field7413 = (byte) arg1;
        this.field7414 = arg2;
        this.field7416 = (byte) arg3;
        this.field7415 = (byte) arg4;
        this.field7412 = arg5;
        this.field7417 = arg6;
    }
}
