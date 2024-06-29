import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class124 {

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public int field2969 = 0;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "[Z")
    public static boolean[] field2964 = new boolean[112];

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lr;")
    public static class118 field2972 = class153.method1136(76, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Lie;")
    public static class61 field2970 = new class61();

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Lr;")
    public static class118 field2974 = class153.method1136(101, ":tradereq:");

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "[I")
    public static int[] field2963;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static void method1007(byte arg0) {
        field2964 = null;
        int var1 = -109 % ((-arg0 - 19) / 42);
        field2970 = null;
        field2972 = null;
        field2974 = null;
        field2963 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)V")
    public static final void method1008(byte arg0, int arg1) {
        field2966++;
        if (!class23.method211(arg1, 0)) {
            return;
        }
        class74[] var2 = class63.field1446[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class74 var4 = var2[var3];
            if (var4 != null) {
                var4.field1707 = 0;
                var4.field1810 = 0;
            }
        }
        if (arg0 != -111) {
            field2964 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lpa;Z)V")
    public final void method1009(class105 arg0, boolean arg1) {
        field2968++;
        while (true) {
            int var3 = arg0.method831((byte) 76);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    field2964 = null;
                    return;
                }
            }
            this.method1010(arg0, 847, var3);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lpa;II)V")
    private final void method1010(class105 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field2969 = arg0.method838((byte) 5);
        }
        field2967++;
        if (arg1 != 847) {
            field2963 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IBII)I")
    public static final int method1011(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field2965++;
        if (var4 == 0) {
            return arg0;
        }
        if (arg1 != 126) {
            method1008((byte) -97, -107);
        }
        if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }
}
