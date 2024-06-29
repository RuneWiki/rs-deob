import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class367 extends class86 {

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[S")
    public short[] field5519;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[B")
    public byte[] field5520;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([S[B)V")
    public class367(short[] arg0, byte[] arg1) {
        this.field5519 = arg0;
        this.field5520 = arg1;
    }
}
