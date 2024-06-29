import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class236 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    public static int[] field3740 = new int[5];

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3743 = "purple:";

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Lkb;")
    public static class39 field3742;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 21)
    public static void method1686(byte arg0) {
        if (arg0 < 43) {
            method1686((byte) 35);
        }
        field3740 = null;
        field3742 = null;
        field3743 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BILok;I)V", line = 48)
    public static final void method1687(byte arg0, int arg1, class160 arg2, int arg3) {
        int var4 = 81 % ((-arg0 - 65) / 42);
        field3744++;
        if (class86.field1296 != null || class19.field274 || arg2 == null || class91.method660(arg2, 2000) == null) {
            return;
        }
        class86.field1296 = arg2;
        class341.field5315 = class91.method660(arg2, 2000);
        class248.field3944 = 0;
        class242.field3846 = false;
        class160.field2591 = arg1;
        class17.field231 = arg3;
    }
}
