import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class273 extends class239 {

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    private final int field4786;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    private final int field4799;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    private final int field4789;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    private final int field4787;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Lsf;")
    private static class108 field4781 = class140.method973(255, "fr");

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lsf;")
    private static class108 field4782 = class140.method973(255, ")3pt");

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lsf;")
    private static class108 field4790 = class140.method973(255, "en");

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lsf;")
    private static class108 field4791 = class140.method973(255, ")3fr");

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Lsf;")
    private static class108 field4797 = class140.method973(255, ")3de");

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Lsf;")
    private static class108 field4793 = class140.method973(255, ")3en");

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Lsf;")
    private static class108 field4801 = class140.method973(255, "pt");

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Lsf;")
    private static class108 field4780 = class140.method973(255, "de");

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "[Lsf;")
    private static class108[] field4798 = new class108[] { field4793, field4797, field4791, field4782 };

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[Lsf;")
    public static class108[] field4784 = new class108[] { field4790, field4780, field4781, field4801 };

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Laj;")
    public static class1 field4794 = new class1();

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field4806 = 0;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "Z")
    public static boolean field4802 = true;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Lsf;")
    public static class108 field4804 = class140.method973(255, "Prendre");

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "Ljava/awt/Frame;")
    public static Frame field4805;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "[I")
    public static int[] field4795;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLa;La;IZZI)I", line = 5)
    public static final int method1972(byte arg0, class278 arg1, class278 arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field4783++;
        int var7 = class103.method709(arg1, arg3, arg2, arg4, 70);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class103.method709(arg1, arg6, arg2, arg5, 117);
            int var9 = 28 % ((arg0 - 23) / 58);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V", line = 57)
    public final void method1417(int arg0, int arg1, int arg2) {
        field4800++;
        if (arg1 != -1) {
            this.method1417(-114, -74, -76);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V", line = 68)
    public final void method1419(int arg0, int arg1, int arg2) {
        field4788++;
        int var4 = this.field4789 * arg0 >> 12;
        int var5 = this.field4786 * arg0 >> 12;
        int var6 = this.field4799 * arg2 >> 12;
        int var7 = this.field4787 * arg2 >> 12;
        if (arg1 == -1) {
            class252.method1782(var6, var5, var7, 349598156, var4, this.field4168);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILik;)V", line = 94)
    public static final void method1973(int arg0, class262 arg1) {
        field4796++;
        class55.field802 = arg1;
        if (arg0 != 868084428) {
            field4798 = (class108[]) null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[F)[F", line = 106)
    public static final float[] method1974(int arg0, float[] arg1) {
        field4792++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class23.method161(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 129)
    public static void method1975(int arg0) {
        field4791 = null;
        field4781 = null;
        field4782 = null;
        field4804 = null;
        field4797 = null;
        field4805 = null;
        field4780 = null;
        field4793 = null;
        int var1 = 61 / ((-arg0 - 52) / 46);
        field4795 = null;
        field4801 = null;
        field4798 = null;
        field4790 = null;
        field4784 = null;
        field4794 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIII)V", line = 159)
    public class273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4786 = arg2;
        this.field4799 = arg1;
        this.field4789 = arg0;
        this.field4787 = arg3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)V", line = 181)
    public final void method1420(boolean arg0, int arg1, int arg2) {
        field4785++;
        if (!arg0) {
            field4784 = (class108[]) null;
        }
    }
}
