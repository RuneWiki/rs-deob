import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class694 extends class504 {

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[S")
    public short[] field9752;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[B")
    public byte[] field9753;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([S[B)V")
    public class694(short[] arg0, byte[] arg1) {
        this.field9752 = arg0;
        this.field9753 = arg1;
    }
}
