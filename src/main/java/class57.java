import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class57 extends class238 {

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "[S")
    public short[] field752;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "[B")
    public byte[] field751;

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([S[B)V")
    public class57(short[] arg0, byte[] arg1) {
        this.field752 = arg0;
        this.field751 = arg1;
    }
}
