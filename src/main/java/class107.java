import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class107 extends class359 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[S")
    public short[] field1238;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[B")
    public byte[] field1237;

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "([S[B)V")
    public class107(short[] arg0, byte[] arg1) {
        this.field1238 = arg0;
        this.field1237 = arg1;
    }
}
