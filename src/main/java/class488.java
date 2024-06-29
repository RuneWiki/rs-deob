import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class488 extends class260 {

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[S")
    public short[] field7133;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "[B")
    public byte[] field7132;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class488(short[] arg0, byte[] arg1) {
        this.field7133 = arg0;
        this.field7132 = arg1;
    }
}
