import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class343 extends class539 {

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "[S")
    public short[] field4968;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "[B")
    public byte[] field4969;

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class343(short[] arg0, byte[] arg1) {
        this.field4968 = arg0;
        this.field4969 = arg1;
    }
}
