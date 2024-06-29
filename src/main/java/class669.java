import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class669 extends class154 {

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[S")
    public short[] field9305;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[B")
    public byte[] field9306;

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "([S[B)V")
    public class669(short[] arg0, byte[] arg1) {
        this.field9305 = arg0;
        this.field9306 = arg1;
    }
}
