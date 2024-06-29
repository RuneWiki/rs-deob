import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class470 extends class159 {

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "[S")
    public short[] field6637;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "[B")
    public byte[] field6638;

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "([S[B)V", line = 4)
    public class470(short[] arg0, byte[] arg1) {
        this.field6637 = arg0;
        this.field6638 = arg1;
    }
}
