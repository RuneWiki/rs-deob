import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class428 extends class430 {

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public int field6171;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public int field6169;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6173 = -1;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field6170 = 0;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(II)V")
    public class428(int arg0, int arg1) {
        this.field6171 = arg1;
        this.field6169 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)I")
    public static final int method2651(int arg0, byte arg1) {
        field6172++;
        int var2 = 79 % ((43 - arg1) / 45);
        return (arg0 & 0x3FE58) >> 11;
    }
}
