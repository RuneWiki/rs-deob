import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class52 extends class184 {

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[S")
    public short[] field746;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "[B")
    public byte[] field745;

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "([S[B)V")
    public class52(short[] arg0, byte[] arg1) {
        this.field746 = arg0;
        this.field745 = arg1;
    }
}
