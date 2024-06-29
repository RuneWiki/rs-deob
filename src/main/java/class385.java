import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class385 extends class467 {

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "[S")
    public short[] field5873;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "[B")
    public byte[] field5872;

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class385(short[] arg0, byte[] arg1) {
        this.field5873 = arg0;
        this.field5872 = arg1;
    }
}
