import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class644 extends class55 {

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "[S")
    public short[] field8980;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "[B")
    public byte[] field8981;

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "([S[B)V")
    public class644(short[] arg0, byte[] arg1) {
        this.field8980 = arg0;
        this.field8981 = arg1;
    }
}
