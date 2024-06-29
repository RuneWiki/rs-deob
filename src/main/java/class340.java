import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class340 extends class108 {

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "[S")
    public short[] field4734;

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "[B")
    public byte[] field4733;

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "([S[B)V")
    public class340(short[] arg0, byte[] arg1) {
        this.field4734 = arg0;
        this.field4733 = arg1;
    }
}
