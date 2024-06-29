import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class652 extends class206 {

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "[S")
    public short[] field9423;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "[B")
    public byte[] field9422;

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class652(short[] arg0, byte[] arg1) {
        this.field9423 = arg0;
        this.field9422 = arg1;
    }
}
