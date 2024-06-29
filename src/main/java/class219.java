import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class219 extends class656 {

    @OriginalMember(owner = "client!cha", name = "i", descriptor = "[S")
    public short[] field3148;

    @OriginalMember(owner = "client!cha", name = "j", descriptor = "[B")
    public byte[] field3149;

    @OriginalMember(owner = "client!cha", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class219(short[] arg0, byte[] arg1) {
        this.field3148 = arg0;
        this.field3149 = arg1;
    }
}
