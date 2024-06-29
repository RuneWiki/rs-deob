import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class7 extends class430 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "[S")
    public short[] field64;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[B")
    public byte[] field63;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class7(short[] arg0, byte[] arg1) {
        this.field64 = arg0;
        this.field63 = arg1;
    }
}
