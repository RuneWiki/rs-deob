import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class115 extends class223 {

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "[S")
    public short[] field1616;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "[B")
    public byte[] field1615;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([S[B)V")
    public class115(short[] arg0, byte[] arg1) {
        this.field1616 = arg0;
        this.field1615 = arg1;
    }
}
