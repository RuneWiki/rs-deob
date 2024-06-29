import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class143 extends class276 {

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "[S")
    public short[] field2347;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "[B")
    public byte[] field2348;

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([S[B)V")
    public class143(short[] arg0, byte[] arg1) {
        this.field2347 = arg0;
        this.field2348 = arg1;
    }
}
