import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class405 extends class35 {

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "[S")
    public short[] field5899;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "[B")
    public byte[] field5898;

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class405(short[] arg0, byte[] arg1) {
        this.field5899 = arg0;
        this.field5898 = arg1;
    }
}
