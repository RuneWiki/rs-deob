import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class144 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Loc;")
    private static class151 field2598 = class137.method873(2, "New User");

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Loc;")
    public static class151 field2602 = field2598;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2601 = -1;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2603 = 0;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lv;")
    public static class218 field2600 = new class218();

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[Lnd;")
    public static class142[] field2605 = new class142[256];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Loc;")
    public static class151 field2604 = null;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg4 - arg3;
        int var8 = arg1 + arg3;
        field2599++;
        if (arg6 < 121) {
            return;
        }
        int var9 = arg3 + arg5;
        int var10 = arg0 - arg3;
        for (int var11 = arg1; var11 < var8; var11++) {
            class55.method380(arg2, 122, class43.field887[var11], arg0, arg5);
        }
        for (int var12 = arg4; var12 > var7; var12--) {
            class55.method380(arg2, 107, class43.field887[var12], arg0, arg5);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class43.field887[var13];
            class55.method380(arg2, 111, var14, var9, arg5);
            class55.method380(arg2, 117, var14, arg0, var10);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method921(int arg0) {
        if (arg0 != -11234) {
            field2602 = null;
        }
        field2604 = null;
        field2602 = null;
        field2600 = null;
        field2605 = null;
        field2598 = null;
    }
}
