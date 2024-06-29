import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class217 extends class425 {

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "[S")
    public short[] field3123;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "[B")
    public byte[] field3124;

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class217(short[] arg0, byte[] arg1) {
        this.field3123 = arg0;
        this.field3124 = arg1;
    }
}
