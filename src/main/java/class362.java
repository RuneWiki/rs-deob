import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class362 {

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Lgh;")
    public static class388 field5300 = null;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "F")
    public static float field5295;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)Z")
    public static final boolean method2219(byte arg0, int arg1, int arg2) {
        if (arg0 != 32) {
            field5300 = null;
        }
        field5298++;
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2220(String arg0, byte arg1) {
        if (arg1 != -80) {
            field5300 = null;
        }
        field5296++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method2221(int arg0) {
        if (arg0 == -14233) {
            field5300 = null;
        }
    }
}
