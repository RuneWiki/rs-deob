import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class396 extends class337 {

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "[S")
    public short[] field5943;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[B")
    public byte[] field5944;

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class396(short[] arg0, byte[] arg1) {
        this.field5943 = arg0;
        this.field5944 = arg1;
    }
}
