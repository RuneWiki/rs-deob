import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class109 extends class147 {

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "[S")
    public short[] field1309;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "[B")
    public byte[] field1308;

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class109(short[] arg0, byte[] arg1) {
        this.field1309 = arg0;
        this.field1308 = arg1;
    }
}
