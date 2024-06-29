import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class364 extends class568 {

    @OriginalMember(owner = "client!ija", name = "l", descriptor = "[S")
    public short[] field5942;

    @OriginalMember(owner = "client!ija", name = "m", descriptor = "[B")
    public byte[] field5943;

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "([S[B)V")
    public class364(short[] arg0, byte[] arg1) {
        this.field5942 = arg0;
        this.field5943 = arg1;
    }
}
