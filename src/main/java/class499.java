import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class499 extends class431 {

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[S")
    public short[] field7162;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[B")
    public byte[] field7163;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class499(short[] arg0, byte[] arg1) {
        this.field7162 = arg0;
        this.field7163 = arg1;
    }
}
