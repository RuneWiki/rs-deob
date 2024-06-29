import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class158 extends class139 {

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Z")
    private boolean field2841 = false;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    private int field2868 = 0;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    private int field2851 = -32768;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    private int field2875 = 0;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    private int field2855;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!l", name = "X", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    private int field2870;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    private int field2838;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    private int field2861;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lfa;")
    private class240 field2843;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[S")
    public static short[] field2837 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!l", name = "D", descriptor = "Loh;")
    public static class263 field2856 = class253.method1681(-126, "Fps:");

    @OriginalMember(owner = "client!l", name = "V", descriptor = "Loh;")
    public static class263 field2874 = class253.method1681(-123, "leuchten2:");

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Loh;")
    public static class263 field2844 = class253.method1681(-128, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Z")
    public static boolean field2865 = false;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Loh;")
    private static class263 field2862 = class253.method1681(-121, "Allocated memory");

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Loh;")
    public static class263 field2846 = field2862;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Loh;")
    public static class263 field2873 = class253.method1681(-118, "(Z");

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field2877 = -1;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field2860 = 0;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "D")
    private double field2839;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "D")
    private double field2842;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "D")
    private double field2847;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "D")
    private double field2850;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "D")
    public double field2853;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "D")
    public double field2863;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "D")
    public double field2869;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "D")
    private double field2871;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public int field2878;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Z")
    public static boolean field2858;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final int method106() {
        field2849++;
        return this.field2851;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIII)V")
    public final void method1029(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2845++;
        if (!this.field2841) {
            double var6 = (double) (arg2 - this.field2857);
            double var8 = (double) (arg1 - this.field2870);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2869 = (double) this.field2861;
            this.field2853 = (double) this.field2838 * var6 / var10 + (double) this.field2857;
            this.field2863 = (double) this.field2838 * var8 / var10 + (double) this.field2870;
        }
        double var12 = (double) (this.field2848 + 1 - arg4);
        this.field2850 = ((double) arg1 - this.field2863) / var12;
        this.field2842 = ((double) arg2 - this.field2853) / var12;
        if (arg3 != 4205) {
            this.method105(-111, 60, 28, 28, -91, 60, 5, 67, -56L);
        }
        this.field2871 = Math.sqrt(this.field2850 * this.field2850 + this.field2842 * this.field2842);
        if (!this.field2841) {
            this.field2839 = -this.field2871 * Math.tan((double) this.field2855 * 0.02454369D);
        }
        this.field2847 = ((double) arg0 - this.field2869 - this.field2839 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method1030(byte arg0) {
        field2846 = null;
        field2862 = null;
        field2856 = null;
        field2844 = null;
        if (arg0 < -56) {
            field2837 = null;
            field2874 = null;
            field2873 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)V")
    public final void method1031(int arg0, byte arg1) {
        this.field2863 += (double) arg0 * this.field2850;
        this.field2841 = true;
        this.field2869 += this.field2847 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2839;
        field2864++;
        this.field2853 += (double) arg0 * this.field2842;
        int var3 = -124 % ((19 - arg1) / 37);
        this.field2839 += (double) arg0 * this.field2847;
        this.field2878 = (int) (Math.atan2(this.field2842, this.field2850) * 325.949D) + 1024 & 0x7FF;
        this.field2854 = (int) (Math.atan2(this.field2839, this.field2871) * 325.949D) & 0x7FF;
        if (this.field2843 == null) {
            return;
        }
        this.field2875 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2875 <= this.field2843.field4219[this.field2868]) {
                        return;
                    }
                    this.field2875 -= this.field2843.field4219[this.field2868];
                    this.field2868++;
                } while (this.field2868 < this.field2843.field4211.length);
                this.field2868 -= this.field2843.field4223;
            } while (this.field2868 >= 0 && this.field2868 < this.field2843.field4211.length);
            this.field2868 = 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2852++;
        class76 var11 = this.method1032(false);
        if (var11 != null) {
            var11.method105(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2851 = var11.method106();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)Lph;")
    private final class76 method1032(boolean arg0) {
        field2867++;
        class46 var2 = class46.method296(-68, this.field2876);
        class76 var3 = var2.method294(this.field2868, !arg0);
        if (var3 == null) {
            return null;
        } else {
            var3.method520(this.field2854);
            return arg0 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2855 = arg7;
        this.field2857 = arg2;
        this.field2866 = arg1;
        this.field2841 = false;
        this.field2876 = arg0;
        this.field2870 = arg3;
        this.field2848 = arg6;
        this.field2840 = arg10;
        this.field2859 = arg9;
        this.field2838 = arg8;
        this.field2861 = arg4;
        this.field2872 = arg5;
        int var12 = class46.method296(-121, this.field2876).field987;
        if (var12 == -1) {
            this.field2843 = null;
        } else {
            this.field2843 = class186.method1226(12828, var12);
        }
    }
}
