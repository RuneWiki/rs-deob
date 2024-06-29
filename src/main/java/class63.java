import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class63 extends class115 {

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "[S")
    public short[] field840;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "[B")
    public byte[] field839;

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class63(short[] arg0, byte[] arg1) {
        this.field840 = arg0;
        this.field839 = arg1;
    }
}
