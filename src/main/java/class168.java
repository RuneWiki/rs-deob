import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class168 extends class390 {

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[S")
    public short[] field2315;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[B")
    public byte[] field2314;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([S[B)V")
    public class168(short[] arg0, byte[] arg1) {
        this.field2315 = arg0;
        this.field2314 = arg1;
    }
}
