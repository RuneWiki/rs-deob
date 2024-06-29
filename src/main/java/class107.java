import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class107 extends class213 {

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "[B")
    public byte[] field1384;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
    public static int field1385 = 0;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public static int field1386 = 0;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([B)V", line = 10)
    public class107(byte[] arg0) {
        this.field1384 = arg0;
    }
}
