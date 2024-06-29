import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class302 extends class376 {

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "[S")
    public short[] field4176;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "[B")
    public byte[] field4175;

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([S[B)V")
    public class302(short[] arg0, byte[] arg1) {
        this.field4176 = arg0;
        this.field4175 = arg1;
    }
}
