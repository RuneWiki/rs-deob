import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class470 extends class35 {

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "[S")
    public short[] field6610;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[B")
    public byte[] field6611;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "([S[B)V")
    public class470(short[] arg0, byte[] arg1) {
        this.field6610 = arg0;
        this.field6611 = arg1;
    }
}
