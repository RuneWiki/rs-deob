import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class295 extends class176 {

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "[S")
    public short[] field4052;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "[B")
    public byte[] field4051;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([S[B)V")
    public class295(short[] arg0, byte[] arg1) {
        this.field4052 = arg0;
        this.field4051 = arg1;
    }
}
