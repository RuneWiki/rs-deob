import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class47 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lte;")
    public static class244 field590 = new class244(16);

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field593 = "Connected to update server";

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field591 = new String[100];

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lwb;")
    public static class123 field595;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Ldl;")
    public static class27 field597;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I")
    public static final int method262(int arg0, int arg1, int arg2) {
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != -2) {
            method263(false);
        }
        field594++;
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public static void method263(boolean arg0) {
        field590 = null;
        field591 = null;
        field597 = null;
        field593 = null;
        if (!arg0) {
            method263(false);
        }
        field595 = null;
    }
}
