import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class130 implements class20 {

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "J")
    public static long field2126;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Lvj;", line = 6)
    public final class26 method117(int arg0) {
        field2125++;
        if (arg0 != 1) {
            field2123 = 117;
        }
        return class70.field1085;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V", line = 22)
    public class130(int arg0) {
        this.field2124 = arg0;
    }
}
