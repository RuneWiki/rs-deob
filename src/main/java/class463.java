import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class463 extends class180 {

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "[S")
    public short[] field6518;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "[B")
    public byte[] field6517;

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class463(short[] arg0, byte[] arg1) {
        this.field6518 = arg0;
        this.field6517 = arg1;
    }
}
