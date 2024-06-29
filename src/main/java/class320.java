import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class320 extends class263 {

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[S")
    public short[] field3992;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[B")
    public byte[] field3993;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "([S[B)V")
    public class320(short[] arg0, byte[] arg1) {
        this.field3992 = arg0;
        this.field3993 = arg1;
    }
}
