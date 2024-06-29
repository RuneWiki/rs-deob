import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class18 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/lang/String;")
    public static String field190 = null;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lot;")
    public static class746 field191;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method177(int arg0, int arg1, int arg2) {
        field192++;
        if (arg0 < 59) {
            return false;
        } else {
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 19)
    public static void method178(byte arg0) {
        if (arg0 > 9) {
            field191 = null;
            field190 = null;
        }
    }
}
