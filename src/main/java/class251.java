import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class251 extends class393 {

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "[S")
    public short[] field3652;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "[B")
    public byte[] field3653;

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "([S[B)V")
    public class251(short[] arg0, byte[] arg1) {
        this.field3652 = arg0;
        this.field3653 = arg1;
    }
}
