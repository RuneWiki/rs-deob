import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class767 extends class337 {

    @OriginalMember(owner = "client!hka", name = "m", descriptor = "[S")
    public short[] field10435;

    @OriginalMember(owner = "client!hka", name = "l", descriptor = "[B")
    public byte[] field10434;

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "([S[B)V")
    public class767(short[] arg0, byte[] arg1) {
        this.field10435 = arg0;
        this.field10434 = arg1;
    }
}
