import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class209 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[I")
    public static int[] field3822 = new int[50];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public int field3820;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Llc;")
    public static class138 field3818;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILjd;)V")
    private final void method1473(int arg0, int arg1, class118 arg2) {
        field3821++;
        if (arg1 == 1) {
            this.field3819 = arg2.method827(255);
            this.field3820 = arg2.method867(false);
            this.field3823 = arg2.method867(false);
        }
        if (arg0 != 0) {
            method1475(75, -46, 39, -1, -100, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljd;I)V")
    public final void method1474(class118 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method867(false);
            if (var3 == 0) {
                field3815++;
                if (arg1 != -27951) {
                    this.field3819 = -16;
                    return;
                }
                return;
            }
            this.method1473(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var9 = arg1 + 1;
        class157.method1116(arg3, arg2, arg4, class145.field2757[arg1], -35);
        int var8 = arg0 - 1;
        class157.method1116(arg3, arg2, arg4, class145.field2757[arg0], -113);
        if (arg5 != 80) {
            return;
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class145.field2757[var6];
            var7[arg2] = var7[arg4] = arg3;
        }
        field3816++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method1476(byte arg0) {
        field3822 = null;
        field3818 = null;
        if (arg0 != 117) {
            field3818 = null;
        }
    }
}
