import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class424 extends class42 {

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "[S")
    public short[] field5795;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "[B")
    public byte[] field5796;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "([S[B)V")
    public class424(short[] arg0, byte[] arg1) {
        this.field5795 = arg0;
        this.field5796 = arg1;
    }
}
