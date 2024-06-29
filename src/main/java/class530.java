import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class530 extends class261 {

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "[S")
    public short[] field7723;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "[B")
    public byte[] field7724;

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class530(short[] arg0, byte[] arg1) {
        this.field7723 = arg0;
        this.field7724 = arg1;
    }
}
