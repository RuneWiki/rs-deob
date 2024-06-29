import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class510 extends class388 {

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "B")
    public byte field7188;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "B")
    public byte field7190;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public int field7194;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "B")
    public byte field7192;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "B")
    public byte field7193;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "[S")
    public short[] field7189;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "[B")
    public byte[] field7191;

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IIIII[S[B)V", line = 9)
    public class510(int arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        this.field7188 = (byte) arg0;
        this.field7190 = (byte) arg1;
        this.field7194 = arg2;
        this.field7192 = (byte) arg3;
        this.field7193 = (byte) arg4;
        this.field7189 = arg5;
        this.field7191 = arg6;
    }
}
