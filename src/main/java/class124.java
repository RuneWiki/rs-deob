import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class124 extends class406 {

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[S")
    public short[] field1520;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[B")
    public byte[] field1521;

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class124(short[] arg0, byte[] arg1) {
        this.field1520 = arg0;
        this.field1521 = arg1;
    }
}
