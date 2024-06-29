import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class65 {

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)Lqv;", line = 7)
    public final class65 method539(int arg0, int arg1) {
        field887++;
        if (arg1 != -23991) {
            field884 = 107;
        }
        return new class65(this.field889, arg0, this.field886, this.field885);
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIII)V", line = 21)
    public class65(int arg0, int arg1, int arg2, int arg3) {
        this.field888 = arg1;
        this.field889 = arg0;
        this.field885 = arg3;
        this.field886 = arg2;
    }
}
