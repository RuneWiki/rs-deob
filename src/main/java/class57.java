import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class57 extends class445 {

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "[S")
    public short[] field781;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "[B")
    public byte[] field780;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class57(short[] arg0, byte[] arg1) {
        this.field781 = arg0;
        this.field780 = arg1;
    }
}
