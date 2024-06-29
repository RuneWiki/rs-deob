import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class318 extends class134 {

    @OriginalMember(owner = "client!en", name = "j", descriptor = "[S")
    public short[] field4066;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "[B")
    public byte[] field4067;

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "([S[B)V")
    public class318(short[] arg0, byte[] arg1) {
        this.field4066 = arg0;
        this.field4067 = arg1;
    }
}
