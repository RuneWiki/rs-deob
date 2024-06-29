import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class9 extends class381 {

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "[S")
    public short[] field75;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[B")
    public byte[] field76;

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class9(short[] arg0, byte[] arg1) {
        this.field75 = arg0;
        this.field76 = arg1;
    }
}
