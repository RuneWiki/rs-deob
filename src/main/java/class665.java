import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class665 extends class425 {

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "[S")
    public short[] field9545;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "[B")
    public byte[] field9546;

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "([S[B)V")
    public class665(short[] arg0, byte[] arg1) {
        this.field9545 = arg0;
        this.field9546 = arg1;
    }
}
