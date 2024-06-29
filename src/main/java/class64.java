import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class64 extends class69 {

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[S")
    public short[] field711;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "[B")
    public byte[] field710;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class64(short[] arg0, byte[] arg1) {
        this.field711 = arg0;
        this.field710 = arg1;
    }
}
