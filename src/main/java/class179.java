import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class179 extends class424 {

    @OriginalMember(owner = "client!li", name = "n", descriptor = "[S")
    public short[] field2222;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[B")
    public byte[] field2223;

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class179(short[] arg0, byte[] arg1) {
        this.field2222 = arg0;
        this.field2223 = arg1;
    }
}
