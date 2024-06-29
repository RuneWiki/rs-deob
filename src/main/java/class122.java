import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class122 extends class5 {

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "[S")
    public short[] field1657;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "[B")
    public byte[] field1658;

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class122(short[] arg0, byte[] arg1) {
        this.field1657 = arg0;
        this.field1658 = arg1;
    }
}
