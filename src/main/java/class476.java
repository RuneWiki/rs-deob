import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class476 extends class57 {

    @OriginalMember(owner = "client!qp", name = "U", descriptor = "Lbd;")
    public static class44 field6933 = new class44("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!qp", name = "W", descriptor = "[I")
    public static int[] field6935 = new int[4096];

    @OriginalMember(owner = "client!qp", name = "X", descriptor = "S")
    public static short field6936 = 32767;

    @OriginalMember(owner = "client!qp", name = "Z", descriptor = "Z")
    public static boolean field6938 = false;

    @OriginalMember(owner = "client!qp", name = "Y", descriptor = "Z")
    public static boolean field6937 = false;

    @OriginalMember(owner = "client!qp", name = "V", descriptor = "[I")
    public static int[] field6934 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field6932;
        if (arg0 > -116) {
            this.method61(-66, 35);
        }
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528 && this.method482(24979)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1018 * super.field1018;
            for (int var8 = 0; ~class174.field2597 < ~var8; ++var8) {
                int var9 = super.field1022[var7 - -(var8 % super.field1020)];
                var6[var8] = class168.method1203(4080, var9 << 4);
                var5[var8] = class168.method1203(var9 >> 4, 4080);
                var4[var8] = class168.method1203(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)V")
    public static void method2819(int arg0) {
        field6935 = null;
        field6933 = null;
        field6934 = null;
        if (arg0 < 62) {
            field6937 = true;
        }
    }
}
