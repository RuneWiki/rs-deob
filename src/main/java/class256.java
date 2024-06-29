import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class256 extends class499 {

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "[S")
    public short[] field3551;

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "[B")
    public byte[] field3550;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class256(short[] arg0, byte[] arg1) {
        this.field3551 = arg0;
        this.field3550 = arg1;
    }
}
