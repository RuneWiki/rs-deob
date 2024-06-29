import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class516 extends class766 {

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[S")
    public short[] field7104;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "[B")
    public byte[] field7105;

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class516(short[] arg0, byte[] arg1) {
        this.field7104 = arg0;
        this.field7105 = arg1;
    }
}
