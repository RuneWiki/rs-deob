import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class399 extends class130 {

    @OriginalMember(owner = "client!t", name = "k", descriptor = "[S")
    public short[] field5889;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "[B")
    public byte[] field5890;

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([S[B)V")
    public class399(short[] arg0, byte[] arg1) {
        this.field5889 = arg0;
        this.field5890 = arg1;
    }
}
