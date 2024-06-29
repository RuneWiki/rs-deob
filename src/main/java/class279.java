import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class279 extends class435 {

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "[S")
    public short[] field3941;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[B")
    public byte[] field3940;

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class279(short[] arg0, byte[] arg1) {
        this.field3941 = arg0;
        this.field3940 = arg1;
    }
}
