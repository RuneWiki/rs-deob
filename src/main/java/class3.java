import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class3 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    public static int[] field89 = new int[1000];

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Ljb;")
    public static class107 field93;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    public static int[] field92;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
    public static final int method45(byte arg0, int arg1) {
        field90++;
        int var2 = -65 % ((19 - arg0) / 47);
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static void method46(byte arg0) {
        if (arg0 != 72) {
            field91 = 117;
        }
        field89 = null;
        field93 = null;
        field92 = null;
    }
}
