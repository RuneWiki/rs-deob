import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class791 extends class379 {

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "[S")
    public short[] field10886;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "[B")
    public byte[] field10885;

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "([S[B)V")
    public class791(short[] arg0, byte[] arg1) {
        this.field10886 = arg0;
        this.field10885 = arg1;
    }
}
