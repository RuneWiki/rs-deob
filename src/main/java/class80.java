import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class80 extends class513 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[S")
    public short[] field1164;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[B")
    public byte[] field1163;

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class80(short[] arg0, byte[] arg1) {
        this.field1164 = arg0;
        this.field1163 = arg1;
    }
}
