import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class451 extends class529 {

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "[S")
    public short[] field6981;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "[B")
    public byte[] field6982;

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "([S[B)V")
    public class451(short[] arg0, byte[] arg1) {
        this.field6981 = arg0;
        this.field6982 = arg1;
    }
}
