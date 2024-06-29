import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class576 extends class168 {

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "[S")
    public short[] field8091;

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "[B")
    public byte[] field8092;

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class576(short[] arg0, byte[] arg1) {
        this.field8091 = arg0;
        this.field8092 = arg1;
    }
}
