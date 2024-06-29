import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class616 extends class189 {

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "[S")
    public short[] field8619;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "[B")
    public byte[] field8620;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "([S[B)V")
    public class616(short[] arg0, byte[] arg1) {
        this.field8619 = arg0;
        this.field8620 = arg1;
    }
}
