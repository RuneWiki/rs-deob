import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class303 extends class324 {

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[S")
    public short[] field4468;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "[B")
    public byte[] field4467;

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "([S[B)V")
    public class303(short[] arg0, byte[] arg1) {
        this.field4468 = arg0;
        this.field4467 = arg1;
    }
}
