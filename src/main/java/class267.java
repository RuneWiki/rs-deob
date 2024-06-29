import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class267 extends class108 {

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[S")
    public short[] field3889;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[B")
    public byte[] field3888;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([S[B)V")
    public class267(short[] arg0, byte[] arg1) {
        this.field3889 = arg0;
        this.field3888 = arg1;
    }
}
