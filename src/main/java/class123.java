import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class123 extends class264 {

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "[S")
    public short[] field1632;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "[B")
    public byte[] field1633;

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([S[B)V")
    public class123(short[] arg0, byte[] arg1) {
        this.field1632 = arg0;
        this.field1633 = arg1;
    }
}
