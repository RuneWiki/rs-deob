import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class448 extends class498 {

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "[S")
    public short[] field6242;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[B")
    public byte[] field6241;

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([S[B)V")
    public class448(short[] arg0, byte[] arg1) {
        this.field6242 = arg0;
        this.field6241 = arg1;
    }
}
