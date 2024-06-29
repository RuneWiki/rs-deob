import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class171 extends class83 {

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Z")
    public boolean field2775 = false;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public int field2789 = 0;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Luc;")
    private class121 field2777 = new class121();

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    private int field2791 = 0;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Loj;")
    public class246 field2796 = new class246();

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    private int field2798 = 0;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Z")
    private boolean field2811 = false;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    private int field2803;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    private int field2804;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "[Lac;")
    public class135[] field2776;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "J")
    private long field2786;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field2778 = 0;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Z")
    private static boolean field2787 = false;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field2780 = 0;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lpa;")
    public static class291 field2779 = new class291(8);

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "[Z")
    private static boolean[] field2792 = new boolean[8];

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field2793 = 2;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    private static int field2794 = 0;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "[Z")
    private static boolean[] field2795 = new boolean[8];

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "J")
    private long field2774;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "J")
    public long field2785;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Luc;")
    private static class121 field2773;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[Lac;")
    public static class135[] field2782;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ldk;)V")
    public static final void method1236(class251 arg0) {
        field2778 = 0;
        field2780 = 0;
        field2773 = new class121();
        field2782 = new class135[1024];
        class81.method566(arg0, -1);
        class295.method1958(-91, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lpi;Z[I[I[I)V")
    private final void method1237(class207[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2795[var6] = false;
        }
        label82: for (class192 var7 = (class192) this.field2777.method856(-123); var7 != null; var7 = (class192) this.field2777.method855(true)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field3093) {
                        field2795[var12] = true;
                        var7.field3089 = false;
                        continue label82;
                    }
                }
            }
            if (!arg1) {
                if (var7.field3122 == 0) {
                    var7.method574(-70);
                    this.field2791--;
                } else {
                    var7.field3089 = true;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field2791 != 8; var8++) {
            if (!field2795[var8]) {
                class192 var9 = new class192(arg0[var8], this, this.field2785);
                this.field2777.method857(var9, -52);
                this.field2791++;
                field2795[var8] = true;
            }
        }
        for (class192 var10 = (class192) this.field2777.method856(-127); var10 != null; var10 = (class192) this.field2777.method855(true)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field2795[var11] && arg0[var11] == var10.field3093) {
                    var10.method1353(arg3[var10.field3093.field3289], arg2[var10.field3093.field3286], arg4[var10.field3093.field3289], -122, arg4[var10.field3093.field3286], arg4[var10.field3093.field3293], arg3[var10.field3093.field3286], arg3[var10.field3093.field3293], arg2[var10.field3093.field3293], arg2[var10.field3093.field3289]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
    public final void method1238() {
        this.field2811 = true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    private final void method1239(int arg0, int arg1) {
        for (class218 var3 = (class218) this.field2796.method1643((byte) 105); var3 != null; var3 = (class218) this.field2796.method1642((byte) 70)) {
            var3.field3577 = this.field2799 + var3.field3576;
            var3.field3573 = this.field2806 + var3.field3575;
            var3.field3588 = this.field2797 + var3.field3581;
            if (this.field2800 == 0) {
                var3.field3585 = var3.field3579.field1103.field3908;
                var3.field3578 = var3.field3579.field1103.field3891;
            } else {
                int var4 = var3.field3579.field1103.field3908;
                int var5 = var3.field3579.field1103.field3891;
                var3.field3585 = arg0 * var5 + arg1 * var4 >> 16;
                var3.field3578 = arg1 * var5 - arg0 * var4 >> 16;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
    public final void method1240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1250(arg0, arg1, class100.field1626 + arg2, class241.field3841 + arg3, class238.field3823 + arg4);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
    public static final void method1241() {
        field2779 = new class291(8);
        field2794 = 0;
        for (class171 var0 = (class171) field2773.method856(-127); var0 != null; var0 = (class171) field2773.method855(true)) {
            var0.method1252();
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    public static final void method1242(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method1243(int arg0) {
        field2793 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()I")
    public static final int method1244() {
        return field2793;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(J)V")
    public static final void method1245(long arg0) {
        field2783 = field2790;
        field2788 = 0;
        field2790 = 0;
        long var2 = class191.method1350((byte) 96);
        for (class171 var4 = (class171) field2773.method856(-127); var4 != null; var4 = (class171) field2773.method855(true)) {
            if (var4.method1251(arg0)) {
                field2788++;
            }
        }
        if (field2787 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + field2773.method853((byte) -57) + ", running: " + field2788 + ". Particles: " + field2790 + ". Time taken: " + (class191.method1350((byte) -80) - var2) + "ms");
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()V")
    public static void method1246() {
        field2773 = null;
        field2782 = null;
        field2779 = null;
        field2795 = null;
        field2792 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lea;Z[I[I[I)V")
    private final void method1247(class66[] arg0, boolean arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var6 = 0; var6 < 8; var6++) {
            field2792[var6] = false;
        }
        label91: for (class218 var7 = (class218) this.field2796.method1643((byte) -42); var7 != null; var7 = (class218) this.field2796.method1642((byte) 55)) {
            if (arg0 != null) {
                for (int var12 = 0; var12 < arg0.length; var12++) {
                    if (arg0[var12] == var7.field3579) {
                        field2792[var12] = true;
                        continue label91;
                    }
                }
            }
            if (!arg1) {
                var7.method913(-3542);
                this.field2798--;
                if (var7.method964(-12)) {
                    var7.method956(256);
                    field2794--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var8 = 0; var8 < arg0.length && this.field2798 != 8; var8++) {
            if (!field2792[var8]) {
                class218 var9 = null;
                if (arg0[var8].field1103.field3905 == 1 && field2794 < 32) {
                    var9 = new class218(arg0[var8], this);
                    field2779.method1940(var9, -23353, (long) arg0[var8].field1103.field3898);
                    field2794++;
                }
                if (var9 == null) {
                    var9 = new class218(arg0[var8], this);
                }
                this.field2796.method1646(true, var9);
                this.field2798++;
                field2792[var8] = true;
            }
        }
        for (class218 var10 = (class218) this.field2796.method1643((byte) -74); var10 != null; var10 = (class218) this.field2796.method1642((byte) 62)) {
            for (int var11 = 0; var11 < arg0.length; var11++) {
                if (field2792[var11] && arg0[var11] == var10.field3579) {
                    var10.method1509(arg3[var10.field3579.field1102], (byte) 47, arg4[var10.field3579.field1102], arg2[var10.field3579.field1102]);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([Lpi;[Lea;Z[I[I[I)V")
    public final void method1248(class207[] arg0, class66[] arg1, boolean arg2, int[] arg3, int[] arg4, int[] arg5) {
        if (!this.field2775) {
            this.method1237(arg0, arg2, arg3, arg4, arg5);
            this.method1247(arg1, arg2, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "()I")
    public final int method1249() {
        if (this.field2809 == this.field2808 && this.field2807 == this.field2805) {
            return 92;
        }
        int var1 = this.field2808 << 7;
        int var2 = (this.field2809 << 7) + 128;
        int var3 = this.field2807 << 7;
        int var4 = (this.field2805 << 7) + 128;
        int var5 = this.field2799 - var1;
        int var6 = var2 - this.field2799;
        if (var5 > var6) {
            int var7 = this.field2797 - var3;
            int var8 = var4 - this.field2797;
            return var7 > var8 ? (int) (Math.sqrt((double) (var5 * var5 + var7 * var7)) + 0.99D) : (int) (Math.sqrt((double) (var5 * var5 + var8 * var8)) + 0.99D);
        } else {
            int var9 = this.field2797 - var3;
            int var10 = var4 - this.field2797;
            return var9 > var10 ? (int) (Math.sqrt((double) (var6 * var6 + var9 * var9)) + 0.99D) : (int) (Math.sqrt((double) (var6 * var6 + var10 * var10)) + 0.99D);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIII)V")
    public final void method1250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (this.field2775) {
            return;
        }
        if (this.field2800 != arg0) {
            for (class192 var6 = (class192) this.field2777.method856(-126); var6 != null; var6 = (class192) this.field2777.method855(true)) {
                var6.field3109 = true;
            }
        }
        this.field2774 = this.field2785;
        this.field2800 = arg0;
        this.field2810 = arg1;
        this.field2799 = arg2;
        this.field2806 = arg3;
        this.field2797 = arg4;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(J)Z")
    private final boolean method1251(long arg0) {
        long var3;
        if (this.field2786 > this.field2774) {
            var3 = this.field2786;
        } else {
            var3 = this.field2774;
        }
        int var5 = (int) (this.field2785 - var3);
        if (var5 > 750) {
            this.method1252();
            return false;
        }
        if (this.field2774 > 0L) {
            this.field2808 = this.field2799 - (this.field2803 << 6) >> 7;
            this.field2809 = ((this.field2803 << 6) + this.field2799 >> 7) - 1;
            this.field2807 = this.field2797 - (this.field2804 << 6) >> 7;
            this.field2805 = ((this.field2804 << 6) + this.field2797 >> 7) - 1;
            this.field2802 = this.field2806;
            if (this.field2810 < 3) {
                this.field2801 = class267.field4304[this.field2810 + 1][this.field2809][this.field2807] + class267.field4304[this.field2810 + 1][this.field2808][this.field2807] + class267.field4304[this.field2810 + 1][this.field2808][this.field2805] + class267.field4304[this.field2810 + 1][this.field2809][this.field2805] >> 2;
            } else {
                this.field2801 = this.field2802 - 1024;
            }
            int var6 = class302.field4823[this.field2800];
            int var7 = class302.field4824[this.field2800];
            this.method1239(var6, var7);
            if (this.field2811) {
                class192 var8 = (class192) this.field2777.method856(-126);
                while (true) {
                    if (var8 == null) {
                        this.field2811 = false;
                        break;
                    }
                    for (int var9 = 0; var9 < var8.field3101.field4535; var9++) {
                        var8.method1354(var6, (byte) -40, var7, this.field2785, 1, true);
                    }
                    var8 = (class192) this.field2777.method855(true);
                }
            }
            int var10 = (int) (arg0 - this.field2785);
            for (class192 var11 = (class192) this.field2777.method856(-125); var11 != null; var11 = (class192) this.field2777.method855(true)) {
                var11.method1354(var6, (byte) -40, var7, arg0, var10, var5 < 10);
            }
        }
        this.field2785 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "()V")
    public final void method1252() {
        this.field2775 = true;
        for (class218 var1 = (class218) this.field2796.method1643((byte) 100); var1 != null; var1 = (class218) this.field2796.method1642((byte) 68)) {
            if (var1.field3579.field1103.field3905 == 1) {
                var1.method956(256);
            }
        }
        this.field2776 = new class135[8192];
        this.field2789 = 0;
        this.field2777 = new class121();
        this.field2791 = 0;
        this.field2796 = new class246();
        this.field2798 = 0;
        this.method574(-110);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V")
    public class171(int arg0, int arg1, int arg2) {
        this.field2803 = arg1;
        this.field2804 = arg2;
        this.field2776 = new class135[8192];
        this.field2786 = (long) arg0;
        this.field2811 = true;
        field2773.method857(this, -58);
    }

    static {
        new class162(131056);
    }
}
