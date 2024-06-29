import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class408 implements class721 {

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field5596 = -1;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "[I")
    public static int[] field5598 = new int[1000];

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field5599 = 0;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field5600 = -1;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Len;")
    public static class339 field5594;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V", line = 13)
    public static void method2430(boolean arg0) {
        field5598 = null;
        if (!arg0) {
            field5598 = null;
        }
        field5594 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Laca;", line = 32)
    public final class758 method228(int arg0) {
        if (arg0 == 1) {
            field5595++;
            return class500.field6845;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V", line = 46)
    public class408(int arg0) {
        this.field5597 = arg0;
    }
}
