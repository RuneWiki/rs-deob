import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class297 extends class333 {

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "[S")
    public short[] field3708;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[B")
    public byte[] field3707;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([S[B)V")
    public class297(short[] arg0, byte[] arg1) {
        this.field3708 = arg0;
        this.field3707 = arg1;
    }
}
