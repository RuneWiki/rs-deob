import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class614 extends class626 {

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "[S")
    public short[] field8877;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "[B")
    public byte[] field8876;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "([S[B)V")
    public class614(short[] arg0, byte[] arg1) {
        this.field8877 = arg0;
        this.field8876 = arg1;
    }
}
