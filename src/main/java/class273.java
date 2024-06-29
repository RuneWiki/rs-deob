import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class273 extends class260 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[B")
    public byte[] field3761;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([B)V", line = 7)
    public class273(byte[] arg0) {
        this.field3761 = arg0;
    }
}
