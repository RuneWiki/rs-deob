import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class725 extends class362 {

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "[S")
    public short[] field9822;

    @OriginalMember(owner = "client!sha", name = "p", descriptor = "[B")
    public byte[] field9823;

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "([S[B)V")
    public class725(short[] arg0, byte[] arg1) {
        this.field9822 = arg0;
        this.field9823 = arg1;
    }
}
