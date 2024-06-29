import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class274 extends class329 {

    @OriginalMember(owner = "client!so", name = "l", descriptor = "[S")
    public short[] field3452;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "[B")
    public byte[] field3451;

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class274(short[] arg0, byte[] arg1) {
        this.field3452 = arg0;
        this.field3451 = arg1;
    }
}
