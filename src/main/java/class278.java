import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class278 extends class401 {

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "[S")
    public short[] field3819;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "[B")
    public byte[] field3820;

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "([S[B)V")
    public class278(short[] arg0, byte[] arg1) {
        this.field3819 = arg0;
        this.field3820 = arg1;
    }
}
