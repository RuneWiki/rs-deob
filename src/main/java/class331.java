import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class331 extends class449 {

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "[S")
    public short[] field4604;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "[B")
    public byte[] field4603;

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class331(short[] arg0, byte[] arg1) {
        this.field4604 = arg0;
        this.field4603 = arg1;
    }
}
