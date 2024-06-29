import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class297 extends class45 {

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[S")
    public short[] field4265;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[B")
    public byte[] field4264;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "([S[B)V")
    public class297(short[] arg0, byte[] arg1) {
        this.field4265 = arg0;
        this.field4264 = arg1;
    }
}
