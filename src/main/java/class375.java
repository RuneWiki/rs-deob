import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class375 extends class65 {

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "[S")
    public short[] field5659;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "[B")
    public byte[] field5658;

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class375(short[] arg0, byte[] arg1) {
        this.field5659 = arg0;
        this.field5658 = arg1;
    }
}
