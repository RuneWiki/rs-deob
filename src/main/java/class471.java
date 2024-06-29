import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class471 extends class496 {

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "[S")
    public short[] field7241;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "[B")
    public byte[] field7242;

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "([S[B)V")
    public class471(short[] arg0, byte[] arg1) {
        this.field7241 = arg0;
        this.field7242 = arg1;
    }
}
