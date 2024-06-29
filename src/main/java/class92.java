import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class92 extends class578 {

    @OriginalMember(owner = "client!du", name = "j", descriptor = "[S")
    public short[] field1275;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "[B")
    public byte[] field1276;

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "([S[B)V")
    public class92(short[] arg0, byte[] arg1) {
        this.field1275 = arg0;
        this.field1276 = arg1;
    }
}
