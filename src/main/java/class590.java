import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class590 extends class28 {

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "[S")
    public short[] field8094;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "[B")
    public byte[] field8093;

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class590(short[] arg0, byte[] arg1) {
        this.field8094 = arg0;
        this.field8093 = arg1;
    }
}
