import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class448 extends class476 {

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "[S")
    public short[] field6569;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "[B")
    public byte[] field6570;

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class448(short[] arg0, byte[] arg1) {
        this.field6569 = arg0;
        this.field6570 = arg1;
    }
}
