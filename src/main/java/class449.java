import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class449 extends class665 {

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "[S")
    public short[] field6483;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[B")
    public byte[] field6484;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class449(short[] arg0, byte[] arg1) {
        this.field6483 = arg0;
        this.field6484 = arg1;
    }
}
