import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class206 {

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[I")
    private int[] field3544;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field3534 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[I")
    public static int[] field3539 = new int[128];

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Lmb;")
    private static class96 field3537 = class243.method1708("You can(Wt add yourself to your own ignore list)3", (byte) 113);

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[I")
    public static int[] field3540 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Lmb;")
    private static class96 field3541 = class243.method1708("Choose Option", (byte) 94);

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "Lmb;")
    public static class96 field3538 = field3541;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lmb;")
    public static class96 field3532 = field3537;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field3543 = 0;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Ltf;")
    public static class106 field3531;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIZLw;)V")
    public static final void method1422(int arg0, int arg1, boolean arg2, class107 arg3) {
        field3542++;
        if (class90.field1494 != null || class170.field2981 || arg3 == null || class209.method1458(arg2, arg3) == null) {
            return;
        }
        class90.field1494 = arg3;
        class194.field3347 = class209.method1458(arg2, arg3);
        class57.field1011 = arg1;
        class252.field4361 = 0;
        class187.field3256 = arg0;
        class46.field787 = false;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static void method1423(byte arg0) {
        field3532 = null;
        field3539 = null;
        field3540 = null;
        field3537 = null;
        if (arg0 == 87) {
            field3531 = null;
            field3538 = null;
            field3541 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)I")
    public final int method1424(int arg0, byte arg1) {
        field3533++;
        int var3 = (this.field3544.length >> 1) - 1;
        if (arg1 != -64) {
            field3531 = null;
        }
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field3544[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3544[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([I)V")
    public class206(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field3544 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3544[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3544[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field3544[var5 + var5] = arg0[var4];
            this.field3544[var5 + var5 + 1] = var4++;
        }
    }
}
