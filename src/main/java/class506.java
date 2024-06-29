import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class506 extends class435 {

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "[S")
    public short[] field7342;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "[B")
    public byte[] field7343;

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "([S[B)V")
    public class506(short[] arg0, byte[] arg1) {
        this.field7342 = arg0;
        this.field7343 = arg1;
    }
}
