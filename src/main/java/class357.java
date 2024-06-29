import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class357 extends class45 {

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "[S")
    public short[] field4756;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[B")
    public byte[] field4757;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class357(short[] arg0, byte[] arg1) {
        this.field4756 = arg0;
        this.field4757 = arg1;
    }
}
