import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class176 extends class320 {

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "[S")
    public short[] field2684;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[B")
    public byte[] field2683;

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "([S[B)V")
    public class176(short[] arg0, byte[] arg1) {
        this.field2684 = arg0;
        this.field2683 = arg1;
    }
}
