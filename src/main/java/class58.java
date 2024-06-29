import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class58 {

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field684 = 0;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
    public static boolean field686 = true;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lnk;")
    public static class16 field683;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 7)
    public static void method347(byte arg0) {
        if (arg0 == 105) {
            field683 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)I", line = 25)
    public static final int method348(byte arg0, int arg1) {
        int var2 = -24 / ((arg0 - 50) / 62);
        field685++;
        return arg1 & 0x7F;
    }
}
