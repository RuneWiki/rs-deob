import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class738 extends class71 {

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "[S")
    public short[] field10202;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[B")
    public byte[] field10201;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "([S[B)V")
    public class738(short[] arg0, byte[] arg1) {
        this.field10202 = arg0;
        this.field10201 = arg1;
    }
}
