import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class179 extends class191 {

    @OriginalMember(owner = "client!t", name = "K", descriptor = "Lja;")
    public static class90 field3670 = new class90(5000);

    @OriginalMember(owner = "client!t", name = "O", descriptor = "Ldd;")
    public static class35 field3674 = class180.method1196((byte) -93, "::fpson");

    @OriginalMember(owner = "client!t", name = "N", descriptor = "Ldd;")
    private static class35 field3673 = class180.method1196((byte) -10, "This computers address has been blocked");

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "Ldd;")
    public static class35 field3676 = field3673;

    @OriginalMember(owner = "client!t", name = "U", descriptor = "Ldd;")
    public static class35 field3680 = class180.method1196((byte) 127, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!t", name = "T", descriptor = "Ldd;")
    public static class35 field3679 = class180.method1196((byte) -93, "event_opbase");

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!t", name = "P", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!t", name = "S", descriptor = "[S")
    public static short[] field3678;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "[[[I")
    public static int[][][] field3677;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)I")
    public static final int method1190(int arg0, int arg1, int arg2) {
        int var3 = class197.method1286(4, (byte) 116, arg0 + 91923, arg2 + 45365) + (class197.method1286(2, (byte) 94, arg0 + 37821, arg2 + 10294) + -128 >> 1) + (class197.method1286(1, (byte) 119, arg0, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field3666++;
        if (arg1 != -20279) {
            return 56;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lce;IZ)V")
    private final void method1191(class26 arg0, int arg1, boolean arg2) {
        field3675++;
        if (arg2) {
            this.method1193(-28, null);
        }
        if (arg1 == 1) {
            this.field3667 = arg0.method256((byte) -78);
            this.field3668 = arg0.method221(-104);
            this.field3669 = arg0.method221(-96);
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static void method1192(int arg0) {
        field3674 = null;
        field3676 = null;
        field3673 = null;
        field3679 = null;
        field3680 = null;
        field3670 = null;
        field3678 = null;
        field3677 = null;
        if (arg0 > -59) {
            method1190(87, -22, 53);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILce;)V")
    public final void method1193(int arg0, class26 arg1) {
        field3671++;
        while (true) {
            int var3 = arg1.method221(-123);
            if (var3 == 0) {
                int var4 = -6 / ((70 - arg0) / 55);
                return;
            }
            this.method1191(arg1, var3, false);
        }
    }
}
