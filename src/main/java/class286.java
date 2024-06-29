import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class286 extends class311 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "[S")
    public short[] field3877;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "[B")
    public byte[] field3876;

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class286(short[] arg0, byte[] arg1) {
        this.field3877 = arg0;
        this.field3876 = arg1;
    }
}
