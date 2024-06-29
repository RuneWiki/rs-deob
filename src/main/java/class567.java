import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class567 extends class417 {

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "[S")
    public short[] field8372;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "[B")
    public byte[] field8373;

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class567(short[] arg0, byte[] arg1) {
        this.field8372 = arg0;
        this.field8373 = arg1;
    }
}
