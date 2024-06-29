import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class221 extends class90 {

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "[I")
    public static int[] field4000 = new int[4096];

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "Llc;")
    public static class143 field4003 = class66.method374("::breakcon", -1);

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "[I")
    public static int[] field4002 = new int[25];

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field4001 = -1;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Ldb;")
    public static class161 field4004 = new class161();

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "[Llc;")
    public static class143[] field4005 = new class143[1000];

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Llc;")
    private static class143 field4006 = class66.method374("Close", -1);

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "Llc;")
    public static class143 field4007 = field4006;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
    public static void method1503(int arg0) {
        field4007 = null;
        field4005 = null;
        field4000 = null;
        field4002 = null;
        field4003 = null;
        field4006 = null;
        if (arg0 == 13626) {
            field4004 = null;
        }
    }
}
