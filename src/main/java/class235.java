import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class235 extends class544 {

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "[S")
    public short[] field2884;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "[B")
    public byte[] field2885;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class235(short[] arg0, byte[] arg1) {
        this.field2884 = arg0;
        this.field2885 = arg1;
    }
}
