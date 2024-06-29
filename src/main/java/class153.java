import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class153 extends class217 {

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public int field2763 = 0;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field2764 = 0;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "Llc;")
    public static class143 field2765 = class66.method374("Ausw-=hlen", -1);

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "[S")
    public static short[] field2773 = new short[256];

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "Llc;")
    public static class143 field2775 = class66.method374("1", -1);

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "[Llc;")
    public static class143[] field2769 = new class143[100];

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "[I")
    public static int[] field2766;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "[[[B")
    public static byte[][][] field2771;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)I")
    public static final int method1010(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method1012(-45);
        }
        field2772++;
        int var3 = class75.method430(arg1 - 1, 2, arg2 - 1) + class75.method430(arg1 + 1, 2, arg2 - 1) + (class75.method430(arg1 + -1, 2, arg2 - -1) - -class75.method430(arg1 + 1, 2, arg2 + 1));
        int var4 = class75.method430(arg1 - 1, 2, arg2) - (-class75.method430(arg1 + 1, 2, arg2) - class75.method430(arg1, 2, arg2 - 1)) + class75.method430(arg1, 2, arg2 - -1);
        int var5 = class75.method430(arg1, 2, arg2);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lh;II)V")
    private final void method1011(class190 arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            this.field2763 = arg0.method1275(128);
        }
        field2774++;
        int var4 = 72 / ((-arg1 - 9) / 57);
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
    public static void method1012(int arg0) {
        field2773 = null;
        field2769 = null;
        field2775 = null;
        field2765 = null;
        field2771 = null;
        field2766 = null;
        if (arg0 != 1) {
            field2771 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLh;)V")
    public final void method1013(boolean arg0, class190 arg1) {
        while (true) {
            int var3 = arg1.method1265(117);
            if (var3 == 0) {
                field2768++;
                if (!arg0) {
                    field2771 = null;
                    return;
                }
                return;
            }
            this.method1011(arg1, 62, var3);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZI)I")
    public static final int method1014(int arg0, boolean arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1) {
            field2769 = null;
        }
        field2767++;
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }
}
