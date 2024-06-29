import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class180 extends class627 {

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "[S")
    public short[] field2369;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "[B")
    public byte[] field2370;

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class180(short[] arg0, byte[] arg1) {
        this.field2369 = arg0;
        this.field2370 = arg1;
    }
}
