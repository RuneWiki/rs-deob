import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class307 extends class383 {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[S")
    public short[] field3911;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[B")
    public byte[] field3910;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([S[B)V")
    public class307(short[] arg0, byte[] arg1) {
        this.field3911 = arg0;
        this.field3910 = arg1;
    }
}
