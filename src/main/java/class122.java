import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class122 extends class97 {

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[S")
    public short[] field1599;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[B")
    public byte[] field1600;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([S[B)V")
    public class122(short[] arg0, byte[] arg1) {
        this.field1599 = arg0;
        this.field1600 = arg1;
    }
}
