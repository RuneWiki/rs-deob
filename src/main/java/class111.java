import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class111 extends class88 {

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "Z")
    private boolean field2754 = false;

    @OriginalMember(owner = "client!qc", name = "Jb", descriptor = "I")
    private int field2779 = 0;

    @OriginalMember(owner = "client!qc", name = "Lb", descriptor = "I")
    private int field2781 = 0;

    @OriginalMember(owner = "client!qc", name = "Ab", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!qc", name = "Gb", descriptor = "I")
    private int field2776;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!qc", name = "Db", descriptor = "I")
    private int field2773;

    @OriginalMember(owner = "client!qc", name = "rb", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!qc", name = "Sb", descriptor = "I")
    private int field2788;

    @OriginalMember(owner = "client!qc", name = "zb", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!qc", name = "qb", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!qc", name = "lb", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!qc", name = "Ib", descriptor = "I")
    private int field2778;

    @OriginalMember(owner = "client!qc", name = "pb", descriptor = "Lle;")
    private class81 field2759;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "Loc;")
    public static class99 field2750 = class48.method402((byte) -104, "Spieler");

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "Loc;")
    public static class99 field2749 = class48.method402((byte) -104, "::fpsoff");

    @OriginalMember(owner = "client!qc", name = "Bb", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!qc", name = "ub", descriptor = "[I")
    public static int[] field2764 = new int[256];

    @OriginalMember(owner = "client!qc", name = "Hb", descriptor = "[I")
    public static int[] field2777 = new int[2000];

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "D")
    public double field2748;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "D")
    private double field2753;

    @OriginalMember(owner = "client!qc", name = "tb", descriptor = "D")
    private double field2763;

    @OriginalMember(owner = "client!qc", name = "Fb", descriptor = "D")
    public double field2775;

    @OriginalMember(owner = "client!qc", name = "Mb", descriptor = "D")
    private double field2782;

    @OriginalMember(owner = "client!qc", name = "Nb", descriptor = "D")
    public double field2783;

    @OriginalMember(owner = "client!qc", name = "Pb", descriptor = "D")
    private double field2785;

    @OriginalMember(owner = "client!qc", name = "Qb", descriptor = "D")
    private double field2786;

    @OriginalMember(owner = "client!qc", name = "ob", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!qc", name = "sb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!qc", name = "vb", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!qc", name = "wb", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!qc", name = "xb", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!qc", name = "yb", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!qc", name = "Cb", descriptor = "I")
    private int field2772;

    @OriginalMember(owner = "client!qc", name = "Eb", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!qc", name = "Kb", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!qc", name = "Ob", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!qc", name = "nb", descriptor = "Ldc;")
    public static class24 field2757;

    @OriginalMember(owner = "client!qc", name = "Rb", descriptor = "Ldc;")
    public static class24 field2787;

    @OriginalMember(owner = "client!qc", name = "mb", descriptor = "Lef;")
    public static class35 field2756;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)V")
    public final void method946(int arg0, int arg1) {
        this.field2783 += (double) arg0 * this.field2753;
        field2768++;
        this.field2775 += this.field2785 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2763;
        this.field2748 += (double) arg0 * this.field2782;
        this.field2754 = true;
        this.field2763 += (double) arg0 * this.field2785;
        this.field2758 = (int) (Math.atan2(this.field2753, this.field2782) * 325.949D) + 1024 & 0x7FF;
        if (arg1 > -35) {
            this.field2778 = 81;
        }
        this.field2772 = (int) (Math.atan2(this.field2763, this.field2786) * 325.949D) & 0x7FF;
        if (this.field2759 == null) {
            return;
        }
        this.field2779 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2779 <= this.field2759.field2016[this.field2781]) {
                        return;
                    }
                    this.field2779 -= this.field2759.field2016[this.field2781];
                    this.field2781++;
                } while (this.field2759.field2026.length > this.field2781);
                this.field2781 -= this.field2759.field2008;
            } while (this.field2781 >= 0 && this.field2759.field2026.length > this.field2781);
            this.field2781 = 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public static void method947(int arg0) {
        if (arg0 != -30709) {
            return;
        }
        field2777 = null;
        field2787 = null;
        field2764 = null;
        field2756 = null;
        field2749 = null;
        field2750 = null;
        field2757 = null;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(B)Ldd;")
    public final class26 method276(byte arg0) {
        class14 var2 = class52.method434(this.field2773, 25138);
        field2762++;
        class26 var3 = var2.method147(this.field2781, (byte) -103);
        if (arg0 != 19) {
            this.field2759 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method246(this.field2772);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BB)V")
    public static final void method948(byte[] arg0, byte arg1) {
        field2784++;
        if (arg1 != -98) {
            method947(-33);
        }
        class57 var2 = new class57(arg0);
        var2.field1477 = arg0.length - 2;
        class142.field3501 = var2.method506(arg1 + 97);
        class5.field96 = new int[class142.field3501];
        class95.field2319 = new int[class142.field3501];
        class86.field2142 = new byte[class142.field3501][];
        class119.field2929 = new int[class142.field3501];
        class74.field1887 = new int[class142.field3501];
        var2.field1477 = arg0.length - class142.field3501 * 8 - 7;
        class81.field1999 = var2.method506(arg1 + 97);
        class47.field1150 = var2.method506(-1);
        int var3 = (var2.method510(-118) & 0xFF) + 1;
        for (int var4 = 0; var4 < class142.field3501; var4++) {
            class5.field96[var4] = var2.method506(-1);
        }
        for (int var5 = 0; var5 < class142.field3501; var5++) {
            class74.field1887[var5] = var2.method506(-1);
        }
        for (int var6 = 0; var6 < class142.field3501; var6++) {
            class95.field2319[var6] = var2.method506(-1);
        }
        for (int var7 = 0; var7 < class142.field3501; var7++) {
            class119.field2929[var7] = var2.method506(arg1 + 97);
        }
        var2.field1477 = arg0.length - class142.field3501 * 8 - (var3 + -1) * 3 - 7;
        class21.field508 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class21.field508[var8] = var2.method483(false);
            if (class21.field508[var8] == 0) {
                class21.field508[var8] = 1;
            }
        }
        var2.field1477 = 0;
        for (int var9 = 0; var9 < class142.field3501; var9++) {
            int var10 = class95.field2319[var9];
            int var11 = class119.field2929[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class86.field2142[var9] = var13;
            int var14 = var2.method510(-121);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method485(104);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method485(104);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public static final void method949(int arg0) {
        field2767++;
        if (class47.field1142 != null) {
            class47.field1142.method1093(-123);
        }
        if (class114.field2853 != null) {
            class114.field2853.method1093(arg0 - 18769);
        }
        if (arg0 != 18645) {
            method948(null, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIIII)V")
    public final void method950(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2754) {
            double var6 = (double) (arg3 - this.field2751);
            double var8 = (double) (arg2 - this.field2778);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2783 = (double) this.field2788 * var8 / var10 + (double) this.field2778;
            this.field2775 = this.field2776;
            this.field2748 = (double) this.field2788 * var6 / var10 + (double) this.field2751;
        }
        double var12 = (double) (this.field2770 + 1 - arg4);
        if (arg0 <= 95) {
            this.field2753 = -1.5983160245724066D;
        }
        this.field2753 = ((double) arg2 - this.field2783) / var12;
        this.field2782 = ((double) arg3 - this.field2748) / var12;
        this.field2786 = Math.sqrt(this.field2782 * this.field2782 + this.field2753 * this.field2753);
        field2765++;
        if (!this.field2754) {
            this.field2763 = -this.field2786 * Math.tan((double) this.field2761 * 0.02454369D);
        }
        this.field2785 = ((double) arg1 - this.field2775 - this.field2763 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2770 = arg6;
        this.field2776 = arg4;
        this.field2751 = arg3;
        this.field2752 = arg1;
        this.field2773 = arg0;
        this.field2761 = arg7;
        this.field2788 = arg8;
        this.field2769 = arg9;
        this.field2760 = arg5;
        this.field2755 = arg10;
        this.field2778 = arg2;
        this.field2754 = false;
        int var12 = class52.method434(this.field2773, 25138).field325;
        if (var12 == -1) {
            this.field2759 = null;
        } else {
            this.field2759 = class142.method1163(-128, var12);
        }
    }
}
