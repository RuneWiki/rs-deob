import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class192 extends class282 {

    @OriginalMember(owner = "client!lu", name = "Lb", descriptor = "[I")
    private int[] field2776;

    @OriginalMember(owner = "client!lu", name = "Bb", descriptor = "I")
    private int field2766;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!lu", name = "kb", descriptor = "I")
    private int field2749;

    @OriginalMember(owner = "client!lu", name = "yb", descriptor = "[I")
    private int[] field2763;

    @OriginalMember(owner = "client!lu", name = "Ib", descriptor = "[I")
    private int[] field2773;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "[S")
    private short[] field2720;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!lu", name = "Ob", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!lu", name = "pb", descriptor = "[I")
    private int[] field2754;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "[Lvea;")
    private class647[] field2726;

    @OriginalMember(owner = "client!lu", name = "bc", descriptor = "[Lqv;")
    private class108[] field2792;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    private int field2702;

    @OriginalMember(owner = "client!lu", name = "T", descriptor = "[Lop;")
    private class412[] field2732;

    @OriginalMember(owner = "client!lu", name = "ob", descriptor = "[Lan;")
    private class136[] field2753;

    @OriginalMember(owner = "client!lu", name = "Gb", descriptor = "[S")
    private short[] field2771;

    @OriginalMember(owner = "client!lu", name = "Vb", descriptor = "[B")
    private byte[] field2786;

    @OriginalMember(owner = "client!lu", name = "Ic", descriptor = "[S")
    private short[] field2825;

    @OriginalMember(owner = "client!lu", name = "Qb", descriptor = "[S")
    private short[] field2781;

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "[S")
    private short[] field2738;

    @OriginalMember(owner = "client!lu", name = "Kb", descriptor = "S")
    private short field2775;

    @OriginalMember(owner = "client!lu", name = "Xb", descriptor = "[S")
    private short[] field2788;

    @OriginalMember(owner = "client!lu", name = "hc", descriptor = "S")
    private short field2798;

    @OriginalMember(owner = "client!lu", name = "rc", descriptor = "[F")
    private float[] field2808;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "[S")
    private short[] field2709;

    @OriginalMember(owner = "client!lu", name = "ab", descriptor = "[S")
    private short[] field2739;

    @OriginalMember(owner = "client!lu", name = "Ec", descriptor = "[S")
    private short[] field2821;

    @OriginalMember(owner = "client!lu", name = "qb", descriptor = "[S")
    private short[] field2755;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "[F")
    private float[] field2705;

    @OriginalMember(owner = "client!lu", name = "Pb", descriptor = "[S")
    private short[] field2780;

    @OriginalMember(owner = "client!lu", name = "Ab", descriptor = "[B")
    private byte[] field2765;

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "[S")
    private short[] field2737;

    @OriginalMember(owner = "client!lu", name = "Yb", descriptor = "[S")
    private short[] field2789;

    @OriginalMember(owner = "client!lu", name = "db", descriptor = "[I")
    private int[] field2742;

    @OriginalMember(owner = "client!lu", name = "vb", descriptor = "[I")
    private int[] field2760;

    @OriginalMember(owner = "client!lu", name = "tb", descriptor = "[I")
    private int[] field2758;

    @OriginalMember(owner = "client!lu", name = "Hc", descriptor = "I")
    private int field2824;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    private int field2707;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "[[I")
    private int[][] field2701;

    @OriginalMember(owner = "client!lu", name = "ic", descriptor = "[[I")
    private int[][] field2799;

    @OriginalMember(owner = "client!lu", name = "tc", descriptor = "[[I")
    private int[][] field2810;

    @OriginalMember(owner = "client!lu", name = "Tb", descriptor = "Z")
    private boolean field2784;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "Z")
    private boolean field2718;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "Z")
    private boolean field2706;

    @OriginalMember(owner = "client!lu", name = "Sb", descriptor = "Z")
    private boolean field2783;

    @OriginalMember(owner = "client!lu", name = "wc", descriptor = "Z")
    private boolean field2813;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "Lch;")
    private class38 field2731;

    @OriginalMember(owner = "client!lu", name = "ec", descriptor = "Lpga;")
    private class492 field2795;

    @OriginalMember(owner = "client!lu", name = "eb", descriptor = "Lpga;")
    private class492 field2743;

    @OriginalMember(owner = "client!lu", name = "Cb", descriptor = "Lpga;")
    private class492 field2767;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "Lpga;")
    private class492 field2708;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "Lwt;")
    private class449 field2704;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "[I")
    public static int[] field2700 = new int[32];

    @OriginalMember(owner = "client!lu", name = "Dc", descriptor = "[I")
    public static int[] field2820 = new int[2];

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!lu", name = "W", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
    private int field2736;

    @OriginalMember(owner = "client!lu", name = "bb", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!lu", name = "cb", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!lu", name = "fb", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!lu", name = "gb", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!lu", name = "hb", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!lu", name = "ib", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
    private int field2748;

    @OriginalMember(owner = "client!lu", name = "lb", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!lu", name = "mb", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!lu", name = "nb", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!lu", name = "rb", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!lu", name = "sb", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!lu", name = "ub", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!lu", name = "xb", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!lu", name = "zb", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!lu", name = "Db", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!lu", name = "Eb", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!lu", name = "Fb", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!lu", name = "Hb", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!lu", name = "Jb", descriptor = "I")
    private int field2774;

    @OriginalMember(owner = "client!lu", name = "Mb", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!lu", name = "Nb", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!lu", name = "Rb", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!lu", name = "Ub", descriptor = "I")
    private int field2785;

    @OriginalMember(owner = "client!lu", name = "Wb", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!lu", name = "Zb", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!lu", name = "ac", descriptor = "I")
    private int field2791;

    @OriginalMember(owner = "client!lu", name = "cc", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!lu", name = "dc", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!lu", name = "fc", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!lu", name = "gc", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!lu", name = "jc", descriptor = "I")
    private int field2800;

    @OriginalMember(owner = "client!lu", name = "kc", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!lu", name = "lc", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!lu", name = "mc", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!lu", name = "nc", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!lu", name = "oc", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!lu", name = "pc", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!lu", name = "qc", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!lu", name = "sc", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!lu", name = "uc", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!lu", name = "vc", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!lu", name = "xc", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!lu", name = "yc", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!lu", name = "zc", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!lu", name = "Ac", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!lu", name = "Bc", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!lu", name = "Cc", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!lu", name = "Fc", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!lu", name = "Gc", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!lu", name = "Jc", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!lu", name = "Kc", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!lu", name = "Lc", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "Lla;")
    public static class423 field2733;

    @OriginalMember(owner = "client!lu", name = "wb", descriptor = "Ltea;")
    private class562 field2761;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1350(int arg0, int arg1, int arg2) {
        int var3 = 71 % ((-arg2 - 15) / 49);
        field2759++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "(I)V", line = 13)
    public final void method520(int arg0) {
        field2745++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field2779; var4++) {
            int var7 = this.field2773[var4] * var2 + this.field2763[var4] * var3 >> 14;
            this.field2773[var4] = this.field2773[var4] * var3 - (this.field2763[var4] * var2) >> 14;
            this.field2763[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field2824; var5++) {
            int var6 = this.field2781[var5] * var2 + this.field2737[var5] * var3 >> 14;
            this.field2781[var5] = (short) (this.field2781[var5] * var3 - (this.field2737[var5] * var2) >> 14);
            this.field2737[var5] = (short) var6;
        }
        this.method1367((byte) 36);
        this.method1364(-21274);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZIILlu;Llu;Z)Lka;", line = 57)
    private final class282 method1351(boolean arg0, int arg1, int arg2, class192 arg3, class192 arg4, boolean arg5) {
        arg4.field2707 = this.field2707;
        arg4.field2718 = this.field2718;
        arg4.field2775 = this.field2775;
        arg4.field2702 = this.field2702;
        arg4.field2824 = this.field2824;
        if ((arg1 & 0x100) == 0) {
            arg4.field2784 = this.field2784;
        } else {
            arg4.field2784 = true;
        }
        if (arg2 != 29245) {
            this.method1356(-61, -0.099723764F, -104, -104, null, true, -0.19561516F, -86, -76, -11L, 29);
        }
        arg4.field2729 = this.field2729;
        field2794++;
        arg4.field2779 = this.field2779;
        arg4.field2766 = this.field2766;
        arg4.field2749 = arg1;
        arg4.field2713 = this.field2713;
        arg4.field2798 = this.field2798;
        boolean var7 = class734.method4090(29441, arg1, this.field2707);
        boolean var8 = class23.method105(false, arg1, this.field2707);
        boolean var9 = class499.method3032(52, arg1, this.field2707);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg4.field2763 = this.field2763;
            } else if (arg3.field2763 == null || arg3.field2763.length < this.field2713) {
                arg4.field2763 = arg3.field2763 = new int[this.field2713];
            } else {
                arg4.field2763 = arg3.field2763;
            }
            if (!var8) {
                arg4.field2754 = this.field2754;
            } else if (arg3.field2754 == null || this.field2713 > arg3.field2754.length) {
                arg4.field2754 = arg3.field2754 = new int[this.field2713];
            } else {
                arg4.field2754 = arg3.field2754;
            }
            if (!var9) {
                arg4.field2773 = this.field2773;
            } else if (arg3.field2773 == null || this.field2713 > arg3.field2773.length) {
                arg4.field2773 = arg3.field2773 = new int[this.field2713];
            } else {
                arg4.field2773 = arg3.field2773;
            }
            for (int var11 = 0; var11 < this.field2713; var11++) {
                if (var7) {
                    arg4.field2763[var11] = this.field2763[var11];
                }
                if (var8) {
                    arg4.field2754[var11] = this.field2754[var11];
                }
                if (var9) {
                    arg4.field2773[var11] = this.field2773[var11];
                }
            }
        } else {
            arg4.field2773 = this.field2773;
            arg4.field2763 = this.field2763;
            arg4.field2754 = this.field2754;
        }
        if (class297.method1855(arg1, this.field2707, arg2 ^ 0x721A)) {
            arg4.field2795 = arg3.field2795;
            arg4.field2795.field7084 = true;
            arg4.field2795.field7087 = this.field2795.field7087;
            arg4.field2795.field7085 = this.field2795.field7085;
        } else if (class718.method4036(115, this.field2707, arg1)) {
            arg4.field2795 = this.field2795;
        } else {
            arg4.field2795 = null;
        }
        if (class679.method3859(arg1, this.field2707, -1)) {
            if (arg3.field2788 == null || this.field2766 > arg3.field2788.length) {
                arg4.field2788 = arg3.field2788 = new short[this.field2766];
            } else {
                arg4.field2788 = arg3.field2788;
            }
            for (int var12 = 0; var12 < this.field2766; var12++) {
                arg4.field2788[var12] = this.field2788[var12];
            }
        } else {
            arg4.field2788 = this.field2788;
        }
        if (class353.method2248(this.field2707, arg1, -12647)) {
            if (arg3.field2765 == null || this.field2766 > arg3.field2765.length) {
                arg4.field2765 = arg3.field2765 = new byte[this.field2766];
            } else {
                arg4.field2765 = arg3.field2765;
            }
            for (int var13 = 0; var13 < this.field2766; var13++) {
                arg4.field2765[var13] = this.field2765[var13];
            }
        } else {
            arg4.field2765 = this.field2765;
        }
        if (class26.method116(arg2 - 29369, arg1, this.field2707)) {
            arg4.field2767 = arg3.field2767;
            arg4.field2767.field7084 = true;
            arg4.field2767.field7087 = this.field2767.field7087;
            arg4.field2767.field7085 = this.field2767.field7085;
        } else if (class90.method704(arg1, true, this.field2707)) {
            arg4.field2767 = this.field2767;
        } else {
            arg4.field2767 = null;
        }
        if (class275.method1780(this.field2707, arg1, arg2 - 29145)) {
            if (arg3.field2737 == null || arg3.field2737.length < this.field2824) {
                int var14 = this.field2824;
                arg4.field2737 = arg3.field2737 = new short[var14];
                arg4.field2789 = arg3.field2789 = new short[var14];
                arg4.field2781 = arg3.field2781 = new short[var14];
            } else {
                arg4.field2737 = arg3.field2737;
                arg4.field2781 = arg3.field2781;
                arg4.field2789 = arg3.field2789;
            }
            if (this.field2761 == null) {
                arg4.field2761 = null;
                for (int var18 = 0; var18 < this.field2824; var18++) {
                    arg4.field2737[var18] = this.field2737[var18];
                    arg4.field2789[var18] = this.field2789[var18];
                    arg4.field2781[var18] = this.field2781[var18];
                }
            } else {
                if (arg3.field2761 == null) {
                    arg3.field2761 = new class562();
                }
                class562 var15 = arg4.field2761 = arg3.field2761;
                if (var15.field8145 == null || var15.field8145.length < this.field2824) {
                    int var16 = this.field2824;
                    var15.field8146 = new short[var16];
                    var15.field8142 = new byte[var16];
                    var15.field8144 = new short[var16];
                    var15.field8145 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field2824; var17++) {
                    arg4.field2737[var17] = this.field2737[var17];
                    arg4.field2789[var17] = this.field2789[var17];
                    arg4.field2781[var17] = this.field2781[var17];
                    var15.field8145[var17] = this.field2761.field8145[var17];
                    var15.field8144[var17] = this.field2761.field8144[var17];
                    var15.field8146[var17] = this.field2761.field8146[var17];
                    var15.field8142[var17] = this.field2761.field8142[var17];
                }
            }
            arg4.field2786 = this.field2786;
        } else {
            arg4.field2781 = this.field2781;
            arg4.field2789 = this.field2789;
            arg4.field2786 = this.field2786;
            arg4.field2761 = this.field2761;
            arg4.field2737 = this.field2737;
        }
        if (class258.method1716(this.field2707, arg1, -17051)) {
            arg4.field2708 = arg3.field2708;
            arg4.field2708.field7087 = this.field2708.field7087;
            arg4.field2708.field7084 = true;
            arg4.field2708.field7085 = this.field2708.field7085;
        } else if (class705.method3953(arg1, this.field2707, 0)) {
            arg4.field2708 = this.field2708;
        } else {
            arg4.field2708 = null;
        }
        if (class699.method3926(arg1, arg2 ^ 0xFFFF8DC1, this.field2707)) {
            if (arg3.field2808 == null || this.field2766 > arg3.field2808.length) {
                int var19 = this.field2824;
                arg4.field2705 = arg3.field2705 = new float[var19];
                arg4.field2808 = arg3.field2808 = new float[var19];
            } else {
                arg4.field2808 = arg3.field2808;
                arg4.field2705 = arg3.field2705;
            }
            for (int var20 = 0; var20 < this.field2824; var20++) {
                arg4.field2808[var20] = this.field2808[var20];
                arg4.field2705[var20] = this.field2705[var20];
            }
        } else {
            arg4.field2808 = this.field2808;
            arg4.field2705 = this.field2705;
        }
        if (class30.method150(arg1, arg2 ^ 0x723F, this.field2707)) {
            arg4.field2743 = arg3.field2743;
            arg4.field2743.field7084 = true;
            arg4.field2743.field7087 = this.field2743.field7087;
            arg4.field2743.field7085 = this.field2743.field7085;
        } else if (class14.method70(this.field2707, (byte) -108, arg1)) {
            arg4.field2743 = this.field2743;
        } else {
            arg4.field2743 = null;
        }
        if (class514.method3126(this.field2707, 0, arg1)) {
            if (arg3.field2755 == null || this.field2766 > arg3.field2755.length) {
                int var21 = this.field2766;
                arg4.field2771 = arg3.field2771 = new short[var21];
                arg4.field2739 = arg3.field2739 = new short[var21];
                arg4.field2755 = arg3.field2755 = new short[var21];
            } else {
                arg4.field2771 = arg3.field2771;
                arg4.field2755 = arg3.field2755;
                arg4.field2739 = arg3.field2739;
            }
            for (int var22 = 0; var22 < this.field2766; var22++) {
                arg4.field2755[var22] = this.field2755[var22];
                arg4.field2771[var22] = this.field2771[var22];
                arg4.field2739[var22] = this.field2739[var22];
            }
        } else {
            arg4.field2755 = this.field2755;
            arg4.field2739 = this.field2739;
            arg4.field2771 = this.field2771;
        }
        if (class478.method2859((byte) -94, this.field2707, arg1)) {
            arg4.field2704 = arg3.field2704;
            arg4.field2704.field6430 = true;
            arg4.field2704.field6431 = this.field2704.field6431;
            arg4.field2704.field6432 = this.field2704.field6432;
        } else if (method1350(this.field2707, arg1, -105)) {
            arg4.field2704 = this.field2704;
        } else {
            arg4.field2704 = null;
        }
        if (class363.method2286(this.field2707, arg1, 542)) {
            if (arg3.field2709 == null || this.field2766 > arg3.field2709.length) {
                int var23 = this.field2766;
                arg4.field2709 = arg3.field2709 = new short[var23];
            } else {
                arg4.field2709 = arg3.field2709;
            }
            for (int var24 = 0; var24 < this.field2766; var24++) {
                arg4.field2709[var24] = this.field2709[var24];
            }
        } else {
            arg4.field2709 = this.field2709;
        }
        if (!class367.method2305(this.field2707, arg1, 0)) {
            arg4.field2732 = this.field2732;
        } else if (arg3.field2732 == null || this.field2702 > arg3.field2732.length) {
            int var26 = this.field2702;
            arg4.field2732 = arg3.field2732 = new class412[var26];
            for (int var27 = 0; var27 < this.field2702; var27++) {
                arg4.field2732[var27] = this.field2732[var27].method2491(arg2 - 29366);
            }
        } else {
            arg4.field2732 = arg3.field2732;
            for (int var25 = 0; var25 < this.field2702; var25++) {
                arg4.field2732[var25].method2493(128, this.field2732[var25]);
            }
        }
        arg4.field2742 = this.field2742;
        arg4.field2799 = this.field2799;
        arg4.field2720 = this.field2720;
        arg4.field2810 = this.field2810;
        if (this.field2783) {
            arg4.field2736 = this.field2736;
            arg4.field2774 = this.field2774;
            arg4.field2818 = this.field2818;
            arg4.field2785 = this.field2785;
            arg4.field2723 = this.field2723;
            arg4.field2800 = this.field2800;
            arg4.field2791 = this.field2791;
            arg4.field2748 = this.field2748;
            arg4.field2783 = true;
        } else {
            arg4.field2783 = false;
        }
        arg4.field2758 = this.field2758;
        arg4.field2701 = this.field2701;
        arg4.field2821 = this.field2821;
        arg4.field2760 = this.field2760;
        arg4.field2825 = this.field2825;
        arg4.field2753 = this.field2753;
        arg4.field2776 = this.field2776;
        arg4.field2792 = this.field2792;
        arg4.field2738 = this.field2738;
        arg4.field2780 = this.field2780;
        arg4.field2726 = this.field2726;
        return arg4;
    }

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "()Z", line = 518)
    public final boolean method504() {
        field2734++;
        return this.field2718;
    }

    @OriginalMember(owner = "client!lu", name = "da", descriptor = "()I", line = 527)
    public final int method495() {
        field2814++;
        return this.field2775;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILsk;ZI)Z", line = 536)
    public final boolean method496(int arg0, int arg1, class121 arg2, boolean arg3, int arg4) {
        field2724++;
        return this.method1357(arg2, arg0, -75, arg4, -1, arg1, arg3);
    }

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "(IILs;Ls;III)V", line = 548)
    public final void method516(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6) {
        field2728++;
        if (!this.field2783) {
            this.method1353(119);
        }
        int var8 = arg4 + this.field2736;
        int var9 = arg4 + this.field2818;
        int var10 = arg6 + this.field2748;
        int var11 = this.field2774 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || var9 + arg2.field4675 >> arg2.field4674 >= arg2.field4679 || var10 < 0 || arg2.field4672 <= arg2.field4675 + var11 >> arg2.field4674) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4675 + var9 >> arg3.field4674 >= arg3.field4679 || var10 < 0 || arg3.field4672 <= (arg3.field4675 + var11 >> arg3.field4674)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4674;
            int var13 = var9 + arg2.field4675 - 1 >> arg2.field4674;
            int var14 = var10 >> arg2.field4674;
            int var15 = arg2.field4675 + var11 - 1 >> arg2.field4674;
            if (arg5 == arg2.method2087(113, var12, var14) && arg2.method2087(96, var13, var14) == arg5 && arg5 == arg2.method2087(90, var12, var15) && arg2.method2087(87, var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field2779; var16++) {
                this.field2754[var16] = this.field2754[var16] + arg2.method2089(26448, this.field2763[var16] + arg4, this.field2773[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            int var17 = this.field2791;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field2779; var18++) {
                int var19 = (this.field2754[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field2754[var18] -= -((arg2.method2089(26448, this.field2763[var18] + arg4, this.field2773[var18] + arg6) - arg5) * (arg1 - var19) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = (arg1 >> 8 & 0xFF) * 4;
            int var31 = (arg1 >> 16 & 0xFF) << 6;
            int var32 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var29 >> 1)) < 0 || (arg2.field4679 << arg2.field4674) <= (arg4 + (var29 >> 1) + arg2.field4675) || arg6 - (var30 >> 1) < 0 || arg2.field4672 << arg2.field4674 <= (var30 >> 1) + arg2.field4675 + arg6) {
                return;
            }
            this.method1803((byte) -54, arg6, arg5, arg2, arg4, var32, var30, var31, var29);
        } else if (arg0 == 4) {
            int var20 = this.field2723 - this.field2791;
            for (int var21 = 0; var21 < this.field2779; var21++) {
                this.field2754[var21] = var20 + (this.field2754[var21] + arg3.method2089(26448, this.field2763[var21] + arg4, this.field2773[var21] + arg6)) - arg5;
            }
        } else if (arg0 == 5) {
            int var22 = this.field2723 - this.field2791;
            for (int var23 = 0; var23 < this.field2779; var23++) {
                int var24 = this.field2763[var23] + arg4;
                int var25 = this.field2773[var23] + arg6;
                int var26 = arg2.method2089(26448, var24, var25);
                int var27 = arg3.method2089(26448, var24, var25);
                int var28 = var26 - var27 - arg1;
                this.field2754[var23] = ((this.field2754[var23] << 8) / var22 * var28 >> 8) + (var26 - arg5);
            }
        }
        this.method1367((byte) 119);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "()V", line = 697)
    public final void method499() {
        field2711++;
        if (this.field2824 > 0 && this.field2729 > 0) {
            this.method1361(true);
            this.method1368((byte) -105);
            this.method1354(8);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BIZ)Lka;", line = 711)
    public final class282 method509(byte arg0, int arg1, boolean arg2) {
        field2746++;
        class192 var4;
        class192 var5;
        if (arg0 == 1) {
            var5 = this.field2731.field654;
            var4 = this.field2731.field652;
        } else if (arg0 == 2) {
            var4 = this.field2731.field655;
            var5 = this.field2731.field646;
        } else if (arg0 == 3) {
            var5 = this.field2731.field649;
            var4 = this.field2731.field650;
        } else if (arg0 == 4) {
            var5 = this.field2731.field641;
            var4 = this.field2731.field642;
        } else if (arg0 == 5) {
            var4 = this.field2731.field648;
            var5 = this.field2731.field656;
        } else {
            var4 = var5 = new class192(this.field2731, 0, 0, true, false);
        }
        return this.method1351(arg2, arg1, 29245, var5, var4, arg0 != 0);
    }

    @OriginalMember(owner = "client!lu", name = "HA", descriptor = "()I", line = 763)
    public final int method534() {
        if (!this.field2783) {
            this.method1353(68);
        }
        field2727++;
        return this.field2748;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 775)
    public final void method541(int arg0) {
        field2803++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field2779; var4++) {
            int var5 = this.field2773[var4] * var2 + this.field2763[var4] * var3 >> 14;
            this.field2773[var4] = this.field2773[var4] * var3 - this.field2763[var4] * var2 >> 14;
            this.field2763[var4] = var5;
        }
        this.method1367((byte) 83);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 805)
    private final void method1352(int arg0) {
        if (this.field2767 != null) {
            this.field2767.field7087 = false;
        }
        field2747++;
        if (arg0 != 1015) {
            this.field2765 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "(I[IIIIZI[I)V", line = 824)
    public final void method485(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field2807++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class494.field7112 = 0;
            class195.field2850 = 0;
            class523.field7608 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field2701.length) {
                    int[] var16 = this.field2701[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field2720 == null || (this.field2720[var18] & arg6) != 0) {
                            class523.field7608 += this.field2763[var18];
                            class494.field7112 += this.field2754[var18];
                            var13++;
                            class195.field2850 += this.field2773[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class281.field3939 = true;
                class195.field2850 = class195.field2850 / var13 + var10;
                class494.field7112 = class494.field7112 / var13 + var11;
                class523.field7608 = class523.field7608 / var13 + var12;
            } else {
                class494.field7112 = var11;
                class195.field2850 = var10;
                class523.field7608 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + (arg7[0] * arg2 - -8192) >> 14;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + (arg7[6] * arg2 + (arg7[7] * arg3)) + 8192 >> 14;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field2701.length) {
                    int[] var27 = this.field2701[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field2720 == null || (this.field2720[var29] & arg6) != 0) {
                            this.field2763[var29] += var22;
                            this.field2754[var29] += var23;
                            this.field2773[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field2701.length) {
                        int[] var50 = this.field2701[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field2720 == null || (arg6 & this.field2720[var52]) != 0) {
                                this.field2763[var52] -= class523.field7608;
                                this.field2754[var52] -= class494.field7112;
                                this.field2773[var52] -= class195.field2850;
                                if (arg4 != 0) {
                                    int var53 = class125.field1736[arg4];
                                    int var54 = class125.field1729[arg4];
                                    int var55 = this.field2763[var52] * var54 + this.field2754[var52] * var53 + 16383 >> 14;
                                    this.field2754[var52] = this.field2754[var52] * var54 - (this.field2763[var52] * var53 - 16383) >> 14;
                                    this.field2763[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class125.field1736[arg2];
                                    int var57 = class125.field1729[arg2];
                                    int var58 = this.field2754[var52] * var57 + 16383 - (this.field2773[var52] * var56) >> 14;
                                    this.field2773[var52] = this.field2773[var52] * var57 + this.field2754[var52] * var56 + 16383 >> 14;
                                    this.field2754[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class125.field1736[arg3];
                                    int var60 = class125.field1729[arg3];
                                    int var61 = this.field2773[var52] * var59 - (-(this.field2763[var52] * var60) - 16383) >> 14;
                                    this.field2773[var52] = this.field2773[var52] * var60 + 16383 - this.field2763[var52] * var59 >> 14;
                                    this.field2763[var52] = var61;
                                }
                                this.field2763[var52] += class523.field7608;
                                this.field2754[var52] += class494.field7112;
                                this.field2773[var52] += class195.field2850;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field2701.length) {
                            int[] var33 = this.field2701[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field2720 == null || (arg6 & this.field2720[var35]) != 0) {
                                    int var36 = this.field2776[var35];
                                    int var37 = this.field2776[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field2825[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class125.field1736[arg4];
                                            int var41 = class125.field1729[arg4];
                                            int var42 = this.field2789[var39] * var40 + (this.field2737[var39] * var41 + 16383) >> 14;
                                            this.field2789[var39] = (short) (this.field2789[var39] * var41 + 16383 - (this.field2737[var39] * var40) >> 14);
                                            this.field2737[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class125.field1736[arg2];
                                            int var44 = class125.field1729[arg2];
                                            int var45 = this.field2789[var39] * var44 + 16383 - (this.field2781[var39] * var43) >> 14;
                                            this.field2781[var39] = (short) (this.field2789[var39] * var43 + this.field2781[var39] * var44 + 16383 >> 14);
                                            this.field2789[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class125.field1736[arg3];
                                            int var47 = class125.field1729[arg3];
                                            int var48 = this.field2781[var39] * var46 + (this.field2737[var39] * var47) + 16383 >> 14;
                                            this.field2781[var39] = (short) (this.field2781[var39] * var47 + 16383 - (this.field2737[var39] * var46) >> 14);
                                            this.field2737[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method1364(-21274);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class281.field3939) {
                    int var68 = arg7[0] * class523.field7608 + arg7[6] * class195.field2850 + (arg7[3] * class494.field7112) + 8192 >> 14;
                    int var69 = arg7[4] * class494.field7112 + arg7[1] * class523.field7608 + arg7[7] * class195.field2850 + 8192 >> 14;
                    int var70 = var65 + var68;
                    int var71 = var66 + var69;
                    int var72 = arg7[8] * class195.field2850 + arg7[2] * class523.field7608 + arg7[5] * class494.field7112 + 8192 >> 14;
                    class523.field7608 = var70;
                    class494.field7112 = var71;
                    int var73 = var67 + var72;
                    class281.field3939 = false;
                    class195.field2850 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class125.field1729[arg2];
                int var76 = class125.field1736[arg2];
                int var77 = class125.field1729[arg3];
                int var78 = class125.field1736[arg3];
                int var79 = class125.field1729[arg4];
                int var80 = class125.field1736[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[5] = -var76;
                var74[0] = var77 * var79 + (var78 * var82 + 8192) >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[0] * -class523.field7608 + var74[2] * -class195.field2850 + var74[1] * -class494.field7112 + 8192 >> 14;
                int var84 = var74[4] * -class494.field7112 + var74[3] * -class523.field7608 + var74[5] * -class195.field2850 + 8192 >> 14;
                int var85 = var74[7] * -class494.field7112 + var74[6] * -class523.field7608 + var74[8] * -class195.field2850 + 8192 >> 14;
                int var86 = var83 + class523.field7608;
                int var87 = var84 + class494.field7112;
                int var88 = class195.field2850 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[0] * var65 - (-(var74[1] * var66) - var74[2] * var67 - 8192) >> 14;
                int var92 = var74[3] * var65 + (var74[5] * var67) + var74[4] * var66 + 8192 >> 14;
                int var93 = var87 + var92;
                int var94 = var86 + var91;
                int var95 = var74[6] * var65 + var74[7] * var66 + (var74[8] * var67) + 8192 >> 14;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[0] * var94 + arg7[1] * var93 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[3] * var94 + arg7[4] * var93 + 8192 >> 14;
                int var101 = arg7[8] * var96 + arg7[6] * var94 + (arg7[7] * var93) + 8192 >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field2701.length > var106) {
                        int[] var107 = this.field2701[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field2720 == null || (arg6 & this.field2720[var109]) != 0) {
                                int var110 = this.field2763[var109] * var97[0] + (this.field2754[var109] * var97[1]) + (this.field2773[var109] * var97[2]) + 8192 >> 14;
                                int var111 = this.field2763[var109] * var97[3] + 8192 - (-(this.field2773[var109] * var97[5]) - (this.field2754[var109] * var97[4])) >> 14;
                                int var112 = this.field2763[var109] * var97[6] + (this.field2773[var109] * var97[8]) + this.field2754[var109] * var97[7] + 8192 >> 14;
                                int var113 = var102 + var111;
                                int var114 = var103 + var110;
                                this.field2763[var109] = var114;
                                int var115 = var104 + var112;
                                this.field2754[var109] = var113;
                                this.field2773[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field2701.length > var123) {
                        int[] var124 = this.field2701[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field2720 == null || (this.field2720[var126] & arg6) != 0) {
                                this.field2763[var126] -= class523.field7608;
                                this.field2754[var126] -= class494.field7112;
                                this.field2773[var126] -= class195.field2850;
                                this.field2763[var126] = this.field2763[var126] * arg2 >> 7;
                                this.field2754[var126] = this.field2754[var126] * arg3 >> 7;
                                this.field2773[var126] = this.field2773[var126] * arg4 >> 7;
                                this.field2763[var126] += class523.field7608;
                                this.field2754[var126] += class494.field7112;
                                this.field2773[var126] += class195.field2850;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class281.field3939) {
                    int var133 = arg7[3] * class494.field7112 + (arg7[0] * class523.field7608 + (arg7[6] * class195.field2850)) + 8192 >> 14;
                    int var134 = arg7[4] * class494.field7112 + arg7[1] * class523.field7608 + (arg7[7] * class195.field2850) + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[8] * class195.field2850 + arg7[2] * class523.field7608 + arg7[5] * class494.field7112 + 8192 >> 14;
                    int var137 = var131 + var134;
                    class494.field7112 = var137;
                    class523.field7608 = var135;
                    int var138 = var132 + var136;
                    class195.field2850 = var138;
                    class281.field3939 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class523.field7608 * var139 + 8192 >> 14;
                int var143 = -class494.field7112 * var140 + 8192 >> 14;
                int var144 = -class195.field2850 * var141 + 8192 >> 14;
                int var145 = class523.field7608 + var142;
                int var146 = class494.field7112 + var143;
                int var147 = class195.field2850 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var145 + var149;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[0] * var152 + (arg7[2] * var154) + arg7[1] * var151 + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var152 - (-(arg7[4] * var151) - 8192) >> 14;
                int var159 = arg7[6] * var152 - (-(arg7[7] * var151) - arg7[8] * var154 - 8192) >> 14;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field2701.length > var164) {
                        int[] var165 = this.field2701[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field2720 == null || (arg6 & this.field2720[var167]) != 0) {
                                int var168 = this.field2763[var167] * var155[0] + this.field2754[var167] * var155[1] - (-(this.field2773[var167] * var155[2]) - 8192) >> 14;
                                int var169 = this.field2754[var167] * var155[4] + this.field2773[var167] * var155[5] + this.field2763[var167] * var155[3] + 8192 >> 14;
                                int var170 = this.field2763[var167] * var155[6] + this.field2754[var167] * var155[7] + (this.field2773[var167] * var155[8]) + 8192 >> 14;
                                int var171 = var161 + var168;
                                int var172 = var160 + var169;
                                int var173 = var162 + var170;
                                this.field2763[var167] = var171;
                                this.field2754[var167] = var172;
                                this.field2773[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2810 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field2810.length) {
                        int[] var183 = this.field2810[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field2780 == null || (this.field2780[var185] & arg6) != 0) {
                                int var186 = (this.field2765[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field2765[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field2753 != null) {
                        for (int var179 = 0; var179 < this.field2702; var179++) {
                            class136 var180 = this.field2753[var179];
                            class412 var181 = this.field2732[var179];
                            var181.field5872 = var181.field5872 & 0xFFFFFF | 255 - (this.field2765[var180.field1868] & 0xFF) << 24;
                        }
                    }
                    this.method1352(1015);
                }
            }
        } else if (arg0 == 7) {
            if (this.field2810 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field2810.length > var192) {
                        int[] var193 = this.field2810[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field2780 == null || (arg6 & this.field2780[var195]) != 0) {
                                int var196 = this.field2788[var195] & 0xFFFF;
                                int var197 = (var196 & 0xFDE9) >> 10;
                                int var198 = (var196 & 0x3FC) >> 7;
                                int var199 = arg2 + var197 & 0x3F;
                                int var200 = arg3 / 4 + var198;
                                int var201 = var196 & 0x7F;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 7) {
                                    var200 = 7;
                                }
                                int var202 = arg4 + var201;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field2788[var195] = (short) class430.method2658(var202, class430.method2658(var200 << 7, var199 << 10));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field2753 != null) {
                        for (int var189 = 0; var189 < this.field2702; var189++) {
                            class136 var190 = this.field2753[var189];
                            class412 var191 = this.field2732[var189];
                            var191.field5872 = var191.field5872 & 0xFF000000 | class519.field7479[this.field2788[var190.field1868] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method1352(1015);
                }
            }
        } else if (arg0 == 8) {
            if (this.field2799 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (this.field2799.length > var204) {
                        int[] var205 = this.field2799[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class412 var207 = this.field2732[var205[var206]];
                            var207.field5868 += arg3;
                            var207.field5875 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2799 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field2799.length) {
                        int[] var210 = this.field2799[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class412 var212 = this.field2732[var210[var211]];
                            var212.field5869 = var212.field5869 * arg2 >> 7;
                            var212.field5870 = var212.field5870 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2799 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field2799.length) {
                    int[] var215 = this.field2799[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class412 var217 = this.field2732[var215[var216]];
                        var217.field5867 = var217.field5867 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "aa", descriptor = "(SS)V", line = 1816)
    public final void method492(short arg0, short arg1) {
        field2741++;
        class267 var3 = this.field2731.field7881;
        for (int var4 = 0; var4 < this.field2766; var4++) {
            if (this.field2709[var4] == arg0) {
                this.field2709[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class679 var7 = var3.method962(arg0 & 0xFFFF, 2904);
            var6 = var7.field9651;
            var5 = var7.field9637;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class679 var10 = var3.method962(arg1 & 0xFFFF, 2904);
            if (var10.field9638 != 0 || var10.field9640 != 0) {
                this.field2718 = true;
            }
            var9 = var10.field9651;
            var8 = var10.field9637;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field2753 != null) {
            for (int var11 = 0; var11 < this.field2702; var11++) {
                class136 var12 = this.field2753[var11];
                class412 var13 = this.field2732[var11];
                var13.field5872 = var13.field5872 & 0xFF000000 | class519.field7479[this.field2788[var12.field1868] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method1352(1015);
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V", line = 1892)
    private final void method1353(int arg0) {
        field2770++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        if (arg0 <= 30) {
            this.field2758 = null;
        }
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2779; var10++) {
            int var11 = this.field2763[var10];
            int var12 = this.field2754[var10];
            int var13 = this.field2773[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var12 * var12 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field2774 = var7;
        this.field2791 = var3;
        this.field2818 = var5;
        this.field2723 = var6;
        this.field2748 = var4;
        this.field2736 = var2;
        this.field2785 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field2800 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field2783 = true;
    }

    @OriginalMember(owner = "client!lu", name = "VA", descriptor = "(I)V", line = 1975)
    public final void method488(int arg0) {
        field2796++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field2779; var4++) {
            int var5 = this.field2763[var4] * var3 + this.field2754[var4] * var2 >> 14;
            this.field2754[var4] = this.field2754[var4] * var3 - this.field2763[var4] * var2 >> 14;
            this.field2763[var4] = var5;
        }
        this.method1367((byte) 110);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[IIIIIZ)V", line = 2002)
    public final void method531(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2817++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class195.field2850 = 0;
            class494.field7112 = 0;
            class523.field7608 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field2701.length > var14) {
                    int[] var15 = this.field2701[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class523.field7608 += this.field2763[var17];
                        class494.field7112 += this.field2754[var17];
                        class195.field2850 += this.field2773[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class494.field7112 = var11;
                class523.field7608 = var9;
                class195.field2850 = var10;
            } else {
                class523.field7608 = class523.field7608 / var12 + var9;
                class195.field2850 = class195.field2850 / var12 + var10;
                class494.field7112 = class494.field7112 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field2701.length > var22) {
                    int[] var23 = this.field2701[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field2763[var25] += var19;
                        this.field2754[var25] += var18;
                        this.field2773[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field2701.length) {
                    int[] var46 = this.field2701[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field2763[var59] -= class523.field7608;
                            this.field2754[var59] -= class494.field7112;
                            this.field2773[var59] -= class195.field2850;
                            if (arg4 != 0) {
                                int var60 = class125.field1736[arg4];
                                int var61 = class125.field1729[arg4];
                                int var62 = this.field2754[var59] * var60 + (this.field2763[var59] * var61) + 16383 >> 14;
                                this.field2754[var59] = this.field2754[var59] * var61 + 16383 - (this.field2763[var59] * var60) >> 14;
                                this.field2763[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class125.field1736[arg2];
                                int var64 = class125.field1729[arg2];
                                int var65 = this.field2754[var59] * var64 + 16383 - (this.field2773[var59] * var63) >> 14;
                                this.field2773[var59] = this.field2754[var59] * var63 + this.field2773[var59] * var64 + 16383 >> 14;
                                this.field2754[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class125.field1736[arg3];
                                int var67 = class125.field1729[arg3];
                                int var68 = this.field2773[var59] * var66 + this.field2763[var59] * var67 + 16383 >> 14;
                                this.field2773[var59] = this.field2773[var59] * var67 + 16383 - (this.field2763[var59] * var66) >> 14;
                                this.field2763[var59] = var68;
                            }
                            this.field2763[var59] += class523.field7608;
                            this.field2754[var59] += class494.field7112;
                            this.field2773[var59] += class195.field2850;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field2763[var48] -= class523.field7608;
                            this.field2754[var48] -= class494.field7112;
                            this.field2773[var48] -= class195.field2850;
                            if (arg2 != 0) {
                                int var49 = class125.field1736[arg2];
                                int var50 = class125.field1729[arg2];
                                int var51 = this.field2754[var48] * var50 + 16383 - (this.field2773[var48] * var49) >> 14;
                                this.field2773[var48] = this.field2773[var48] * var50 + this.field2754[var48] * var49 + 16383 >> 14;
                                this.field2754[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class125.field1736[arg4];
                                int var53 = class125.field1729[arg4];
                                int var54 = this.field2763[var48] * var53 + this.field2754[var48] * var52 + 16383 >> 14;
                                this.field2754[var48] = this.field2754[var48] * var53 + 16383 - this.field2763[var48] * var52 >> 14;
                                this.field2763[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class125.field1736[arg3];
                                int var56 = class125.field1729[arg3];
                                int var57 = this.field2773[var48] * var55 + (this.field2763[var48] * var56 + 16383) >> 14;
                                this.field2773[var48] = this.field2773[var48] * var56 + 16383 - (this.field2763[var48] * var55) >> 14;
                                this.field2763[var48] = var57;
                            }
                            this.field2763[var48] += class523.field7608;
                            this.field2754[var48] += class494.field7112;
                            this.field2773[var48] += class195.field2850;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field2701.length > var28) {
                        int[] var29 = this.field2701[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field2776[var31];
                            int var33 = this.field2776[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field2825[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class125.field1736[arg4];
                                    int var37 = class125.field1729[arg4];
                                    int var38 = this.field2789[var35] * var36 + this.field2737[var35] * var37 + 16383 >> 14;
                                    this.field2789[var35] = (short) (this.field2789[var35] * var37 + 16383 - (this.field2737[var35] * var36) >> 14);
                                    this.field2737[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class125.field1736[arg2];
                                    int var40 = class125.field1729[arg2];
                                    int var41 = this.field2789[var35] * var40 + 16383 - (this.field2781[var35] * var39) >> 14;
                                    this.field2781[var35] = (short) (this.field2781[var35] * var40 + (this.field2789[var35] * var39 + 16383) >> 14);
                                    this.field2789[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class125.field1736[arg3];
                                    int var43 = class125.field1729[arg3];
                                    int var44 = this.field2781[var35] * var42 + this.field2737[var35] * var43 + 16383 >> 14;
                                    this.field2781[var35] = (short) (this.field2781[var35] * var43 + 16383 - (this.field2737[var35] * var42) >> 14);
                                    this.field2737[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method1364(-21274);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field2701.length) {
                    int[] var71 = this.field2701[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field2763[var73] -= class523.field7608;
                        this.field2754[var73] -= class494.field7112;
                        this.field2773[var73] -= class195.field2850;
                        this.field2763[var73] = this.field2763[var73] * arg2 >> 7;
                        this.field2754[var73] = this.field2754[var73] * arg3 >> 7;
                        this.field2773[var73] = this.field2773[var73] * arg4 >> 7;
                        this.field2763[var73] += class523.field7608;
                        this.field2754[var73] += class494.field7112;
                        this.field2773[var73] += class195.field2850;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field2810 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field2810.length > var79) {
                        int[] var80 = this.field2810[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field2765[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field2765[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field2753 != null) {
                        for (int var76 = 0; var76 < this.field2702; var76++) {
                            class136 var77 = this.field2753[var76];
                            class412 var78 = this.field2732[var76];
                            var78.field5872 = 255 - (this.field2765[var77.field1868] & 0xFF) << 24 | var78.field5872 & 0xFFFFFF;
                        }
                    }
                    this.method1352(1015);
                }
            }
        } else if (arg0 == 7) {
            if (this.field2810 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field2810.length) {
                        int[] var90 = this.field2810[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field2788[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = (var93 & 0x3F7) >> 7;
                            int var96 = var93 & 0x7F;
                            int var97 = arg3 / 4 + var95;
                            int var98 = arg2 + var94 & 0x3F;
                            int var99 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 7) {
                                var97 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field2788[var92] = (short) class430.method2658(var99, class430.method2658(var97 << 7, var98 << 10));
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field2753 != null) {
                        for (int var86 = 0; var86 < this.field2702; var86++) {
                            class136 var87 = this.field2753[var86];
                            class412 var88 = this.field2732[var86];
                            var88.field5872 = class519.field7479[this.field2788[var87.field1868] & 0xFFFF] & 0xFFFFFF | var88.field5872 & 0xFF000000;
                        }
                    }
                    this.method1352(1015);
                }
            }
        } else if (arg0 == 8) {
            if (this.field2799 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (this.field2799.length > var101) {
                        int[] var102 = this.field2799[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class412 var104 = this.field2732[var102[var103]];
                            var104.field5875 += arg2;
                            var104.field5868 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field2799 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field2799.length) {
                        int[] var107 = this.field2799[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class412 var109 = this.field2732[var107[var108]];
                            var109.field5869 = var109.field5869 * arg2 >> 7;
                            var109.field5870 = var109.field5870 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field2799 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field2799.length) {
                    int[] var112 = this.field2799[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class412 var114 = this.field2732[var112[var113]];
                        var114.field5867 = var114.field5867 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V", line = 2660)
    private final void method1354(int arg0) {
        field2721++;
        if (!this.field2706) {
            return;
        }
        this.field2706 = false;
        if (this.field2792 == null && this.field2726 == null && this.field2753 == null) {
            if (this.field2763 != null && !class13.method66(this.field2707, this.field2749, (byte) 124)) {
                if (this.field2795 == null || this.field2795.method2995(246)) {
                    if (!this.field2783) {
                        this.method1353(47);
                    }
                    this.field2763 = null;
                } else {
                    this.field2706 = true;
                }
            }
            if (this.field2754 != null && !client.method2734(this.field2749, this.field2707, (byte) -113)) {
                if (this.field2795 == null || this.field2795.method2995(246)) {
                    if (!this.field2783) {
                        this.method1353(42);
                    }
                    this.field2754 = null;
                } else {
                    this.field2706 = true;
                }
            }
            if (this.field2773 != null && !class496.method3012(this.field2707, -8192, this.field2749)) {
                if (this.field2795 == null || this.field2795.method2995(246)) {
                    if (!this.field2783) {
                        this.method1353(122);
                    }
                    this.field2773 = null;
                } else {
                    this.field2706 = true;
                }
            }
        }
        if (this.field2825 != null && this.field2763 == null && this.field2754 == null && this.field2773 == null) {
            this.field2776 = null;
            this.field2825 = null;
        }
        if (this.field2786 != null && !class485.method2960(this.field2707, this.field2749, 1)) {
            label207: {
                label206: {
                    boolean var10000;
                    if ((this.field2707 & 0x37) == 0) {
                        if (this.field2767 == null || this.field2767.method2995(246)) {
                            break label206;
                        }
                        var10000 = false;
                    } else {
                        if (this.field2708 == null || this.field2708.method2995(246)) {
                            break label206;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field2706 = true;
                        break label207;
                    }
                }
                this.field2786 = null;
                this.field2737 = this.field2789 = this.field2781 = null;
            }
        }
        if (this.field2788 != null && !class634.method3632((byte) 80, this.field2749, this.field2707)) {
            if (this.field2767 == null || this.field2767.method2995(246)) {
                this.field2788 = null;
            } else {
                this.field2706 = true;
            }
        }
        if (this.field2765 != null && !class80.method653(this.field2749, 100, this.field2707)) {
            if (this.field2767 == null || this.field2767.method2995(246)) {
                this.field2765 = null;
            } else {
                this.field2706 = true;
            }
        }
        if (arg0 != 8) {
            return;
        }
        if (this.field2808 != null && !class383.method2365(this.field2707, this.field2749, arg0 ^ 0xFFFFD289)) {
            if (this.field2743 == null || this.field2743.method2995(246)) {
                this.field2808 = this.field2705 = null;
            } else {
                this.field2706 = true;
            }
        }
        if (this.field2709 != null && !class415.method2502(this.field2707, this.field2749, false)) {
            if (this.field2767 == null || this.field2767.method2995(246)) {
                this.field2709 = null;
            } else {
                this.field2706 = true;
            }
        }
        if (this.field2755 != null && !class678.method3857((byte) -124, this.field2749, this.field2707)) {
            if ((this.field2704 == null || this.field2704.method2748(3)) && (this.field2767 == null || this.field2767.method2995(246))) {
                this.field2755 = this.field2771 = this.field2739 = null;
            } else {
                this.field2706 = true;
            }
        }
        if (this.field2738 != null) {
            if (this.field2795 == null || this.field2795.method2995(246)) {
                this.field2738 = null;
            } else {
                this.field2706 = true;
            }
        }
        if (this.field2821 != null) {
            if (this.field2767 == null || this.field2767.method2995(246)) {
                this.field2821 = null;
            } else {
                this.field2706 = true;
            }
        }
        if (this.field2810 != null && !class604.method3518(-99, this.field2749, this.field2707)) {
            this.field2810 = null;
            this.field2780 = null;
        }
        if (this.field2701 != null && !class167.method1189(this.field2749, this.field2707, -20298)) {
            this.field2701 = null;
            this.field2720 = null;
        }
        if (this.field2799 != null && !class647.method3739(-1, this.field2707, this.field2749)) {
            this.field2799 = null;
        }
        if (this.field2742 != null && (this.field2749 & 0x800) == 0 && (this.field2749 & 0x40000) == 0) {
            this.field2758 = null;
            this.field2742 = null;
            this.field2760 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V", line = 2845)
    public final void method1355(int arg0) {
        field2716++;
        if (this.field2795 != null) {
            this.field2795.method2997(true);
        }
        if (this.field2743 != null) {
            this.field2743.method2997(true);
        }
        if (this.field2767 != null) {
            this.field2767.method2997(true);
        }
        if (this.field2708 != null) {
            this.field2708.method2997(true);
        }
        if (this.field2704 != null) {
            this.field2704.method2745(arg0 + 45);
        }
        if (arg0 != 4) {
            this.method1361(true);
        }
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "()V", line = 2873)
    public final void method483() {
        field2809++;
    }

    @OriginalMember(owner = "client!lu", name = "FA", descriptor = "(I)V", line = 2880)
    public final void method500(int arg0) {
        field2714++;
        int var2 = class125.field1736[arg0];
        int var3 = class125.field1729[arg0];
        for (int var4 = 0; var4 < this.field2779; var4++) {
            int var5 = this.field2754[var4] * var3 - (this.field2773[var4] * var2) >> 14;
            this.field2773[var4] = this.field2754[var4] * var2 + (this.field2773[var4] * var3) >> 14;
            this.field2754[var4] = var5;
        }
        this.method1367((byte) 50);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "(I)V", line = 2909)
    public final void method484(int arg0) {
        field2778++;
        this.field2798 = (short) arg0;
        this.method1352(1015);
    }

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "()Z", line = 2920)
    public final boolean method497() {
        field2806++;
        return this.field2784;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "()[Lqv;", line = 2930)
    public final class108[] method517() {
        field2787++;
        return this.field2792;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IFIILfu;ZFIIJI)S", line = 2940)
    private final short method1356(int arg0, float arg1, int arg2, int arg3, class637 arg4, boolean arg5, float arg6, int arg7, int arg8, long arg9, int arg10) {
        field2772++;
        int var13 = this.field2776[arg7];
        int var14 = this.field2776[arg7 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field2825[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class382.field5536[var16] == arg9) {
                return (short) (var17 - 1);
            }
        }
        this.field2825[var15] = (short) (this.field2824 + 1);
        class382.field5536[var15] = arg9;
        this.field2821[this.field2824] = (short) arg3;
        this.field2738[this.field2824] = (short) arg7;
        if (!arg5) {
            this.method517();
        }
        this.field2737[this.field2824] = (short) arg2;
        this.field2789[this.field2824] = (short) arg8;
        this.field2781[this.field2824] = (short) arg0;
        this.field2786[this.field2824] = (byte) arg10;
        this.field2808[this.field2824] = arg6;
        this.field2705[this.field2824] = arg1;
        return (short) (this.field2824++);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lsk;IIIIIZ)Z", line = 2988)
    private final boolean method1357(class121 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2712++;
        class417 var8 = (class417) arg0;
        class417 var9 = this.field2731.field533;
        float var10 = var8.field5945 * var9.field5927 + var8.field5957 * var9.field5923 + var8.field5950 * var9.field5948 + var9.field5950;
        float var11 = var8.field5945 * var9.field5938 + var8.field5957 * var9.field5940 + var8.field5950 * var9.field5946 + var9.field5957;
        class645.field9291 = var8.field5939 * var9.field5938 + var8.field5948 * var9.field5946 + var8.field5946 * var9.field5940;
        float var12 = var8.field5945 * var9.field5961 + var8.field5957 * var9.field5968 + var8.field5950 * var9.field5939 + var9.field5945;
        class577.field8288 = var8.field5961 * var9.field5927 + var8.field5938 * var9.field5923 + var8.field5927 * var9.field5948;
        class80.field1145 = var8.field5968 * var9.field5961 + var8.field5940 * var9.field5968 + var8.field5923 * var9.field5939;
        class622.field8843 = var8.field5939 * var9.field5961 + var8.field5948 * var9.field5939 + var8.field5946 * var9.field5968;
        class214.field3214 = var8.field5968 * var9.field5927 + var8.field5940 * var9.field5923 + var8.field5923 * var9.field5948;
        class5.field53 = var8.field5968 * var9.field5938 + var8.field5940 * var9.field5940 + var8.field5923 * var9.field5946;
        class350.field5204 = var8.field5961 * var9.field5961 + var8.field5938 * var9.field5968 + var8.field5927 * var9.field5939;
        class714.field10083 = var8.field5939 * var9.field5927 + var8.field5948 * var9.field5948 + var8.field5946 * var9.field5923;
        class477.field6784 = var8.field5961 * var9.field5938 + var8.field5938 * var9.field5940 + var8.field5927 * var9.field5946;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field2731.field598;
        int var19 = this.field2731.field557;
        if (!this.field2783) {
            this.method1353(68);
        }
        int var20 = this.field2818 - this.field2736 >> 1;
        int var21 = this.field2723 - this.field2791 >> 1;
        int var22 = this.field2774 - this.field2748 >> 1;
        int var23 = this.field2736 + var20;
        int var24 = this.field2791 + var21;
        int var25 = this.field2748 + var22;
        int var26 = var23 - (var20 << arg3);
        int var27 = var24 - (var21 << arg3);
        int var28 = var25 - (var22 << arg3);
        int var29 = (var20 << arg3) + var23;
        int var30 = var24 + (var21 << arg3);
        int var31 = var25 + (var22 << arg3);
        class108.field1542[0] = var26;
        class724.field10185[0] = var27;
        class108.field1542[1] = var29;
        class732.field10260[0] = var28;
        if (arg2 >= -71) {
            this.method517();
        }
        class724.field10185[1] = var27;
        class108.field1542[2] = var26;
        class732.field10260[1] = var28;
        class724.field10185[2] = var30;
        class108.field1542[3] = var29;
        class732.field10260[2] = var28;
        class724.field10185[3] = var30;
        class108.field1542[4] = var26;
        class732.field10260[3] = var28;
        class724.field10185[4] = var27;
        class108.field1542[5] = var29;
        class732.field10260[4] = var31;
        class724.field10185[5] = var27;
        class108.field1542[6] = var26;
        class732.field10260[5] = var31;
        class724.field10185[6] = var30;
        class108.field1542[7] = var29;
        class732.field10260[6] = var31;
        class724.field10185[7] = var30;
        class732.field10260[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class732.field10260[var32];
            float var52 = (float) class724.field10185[var32];
            float var53 = (float) class108.field1542[var32];
            float var54 = class477.field6784 * var51 + class645.field9291 * var53 + class5.field53 * var52 + var11;
            float var55 = class350.field5204 * var51 + class80.field1145 * var52 + class622.field8843 * var53 + var12;
            float var56 = class577.field8288 * var51 + class714.field10083 * var53 + class214.field3214 * var52 + var10;
            if ((float) this.field2731.field538 <= var55) {
                if (arg4 > 0) {
                    var55 = arg4;
                }
                float var57 = (float) var18 * var56 / var55 + (float) this.field2731.field622;
                if (var15 < var57) {
                    var15 = var57;
                }
                if (var57 < var14) {
                    var14 = var57;
                }
                float var58 = (float) var19 * var54 / var55 + (float) this.field2731.field590;
                var13 = true;
                if (var16 > var58) {
                    var16 = var58;
                }
                if (var58 > var17) {
                    var17 = var58;
                }
            }
        }
        if (var13 && var14 < (float) arg1 && var15 > (float) arg1 && (float) arg5 > var16 && var17 > (float) arg5) {
            if (arg6) {
                return true;
            }
            if (this.field2824 > class211.field3167.length) {
                class81.field1151 = new int[this.field2824];
                class211.field3167 = new int[this.field2824];
            }
            for (int var33 = 0; var33 < this.field2779; var33++) {
                float var35 = (float) this.field2773[var33];
                float var36 = (float) this.field2763[var33];
                float var37 = (float) this.field2754[var33];
                float var38 = class350.field5204 * var35 + class80.field1145 * var37 + class622.field8843 * var36 + var12;
                float var39 = class477.field6784 * var35 + class645.field9291 * var36 + class5.field53 * var37 + var11;
                float var40 = class577.field8288 * var35 + class714.field10083 * var36 + class214.field3214 * var37 + var10;
                if ((var38 >= (float) this.field2731.field538)) {
                    if (arg4 > 0) {
                        var38 = arg4;
                    }
                    int var45 = (int) ((float) var18 * var40 / var38 + (float) this.field2731.field622);
                    int var46 = (int) ((float) var19 * var39 / var38 + (float) this.field2731.field590);
                    int var47 = this.field2776[var33];
                    int var48 = this.field2776[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field2825[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class211.field3167[var50] = var45;
                        class81.field1151[var50] = var46;
                    }
                } else {
                    int var41 = this.field2776[var33];
                    int var42 = this.field2776[var33 + 1];
                    for (int var43 = var41; var43 < var42; var43++) {
                        int var44 = this.field2825[var43] - 1;
                        if (var44 == -1) {
                            break;
                        }
                        class211.field3167[this.field2825[var43] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field2766; var34++) {
                if (class211.field3167[this.field2755[var34]] != -999999 && class211.field3167[this.field2771[var34]] != -999999 && class211.field3167[this.field2739[var34]] != -999999 && this.method1366(class81.field1151[this.field2755[var34]], class81.field1151[this.field2771[var34]], class211.field3167[this.field2739[var34]], class81.field1151[this.field2739[var34]], arg5, class211.field3167[this.field2771[var34]], arg1, 1, class211.field3167[this.field2755[var34]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lhm;B)V", line = 3230)
    private final void method1358(class416 arg0, byte arg1) {
        if (arg1 != 7) {
            this.method497();
        }
        field2730++;
        if (class211.field3167.length < this.field2824) {
            class211.field3167 = new int[this.field2824];
            class81.field1151 = new int[this.field2824];
        }
        for (int var3 = 0; var3 < this.field2779; var3++) {
            int var14 = (this.field2763[var3] - (this.field2754[var3] * this.field2731.field633 >> 8) >> this.field2731.field588) - arg0.field5909;
            int var15 = (this.field2773[var3] - (this.field2754[var3] * this.field2731.field539 >> 8) >> this.field2731.field588) - arg0.field5914;
            int var16 = this.field2776[var3];
            int var17 = this.field2776[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field2825[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class211.field3167[var19] = var14;
                class81.field1151[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field2729; var4++) {
            if (this.field2765 == null || this.field2765[var4] <= 128) {
                short var5 = this.field2755[var4];
                short var6 = this.field2771[var4];
                short var7 = this.field2739[var4];
                int var8 = class211.field3167[var5];
                int var9 = class211.field3167[var6];
                int var10 = class211.field3167[var7];
                int var11 = class81.field1151[var5];
                int var12 = class81.field1151[var6];
                int var13 = class81.field1151[var7];
                if ((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11)) > 0) {
                    arg0.method2512(var8, var9, var11, (byte) 107, var12, var13, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)Z", line = 3315)
    public static final boolean method1359(int arg0) {
        field2802++;
        boolean var1 = true;
        if (class542.field7868 == null) {
            if (class603.field8548.method2609(0, class625.field8881)) {
                class542.field7868 = class676.method3841(class603.field8548, class625.field8881);
            } else {
                var1 = false;
            }
        }
        if (class40.field680 == null) {
            if (class603.field8548.method2609(0, class347.field5124)) {
                class40.field680 = class676.method3841(class603.field8548, class347.field5124);
            } else {
                var1 = false;
            }
        }
        if (class463.field6618 == null) {
            if (class603.field8548.method2609(0, class624.field8867)) {
                class463.field6618 = class676.method3841(class603.field8548, class624.field8867);
            } else {
                var1 = false;
            }
        }
        if (class596.field8478 == null) {
            if (class726.field10209.method2609(0, class583.field8315)) {
                class596.field8478 = class534.method3234(class726.field10209, -121, class583.field8315);
            } else {
                var1 = false;
            }
        }
        if (class367.field5364 == null) {
            if (class603.field8548.method2609(0, class583.field8315)) {
                class367.field5364 = class676.method3847(class603.field8548, class583.field8315);
            } else {
                var1 = false;
            }
        }
        int var2 = 115 % ((arg0 + 10) / 56);
        return var1;
    }

    @OriginalMember(owner = "client!lu", name = "na", descriptor = "()I", line = 3385)
    public final int method514() {
        if (!this.field2783) {
            this.method1353(72);
        }
        field2751++;
        return this.field2785;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lch;Lfu;IIII)V", line = 3402)
    public class192(class38 arg0, class637 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class267 var7 = arg0.field7881;
        int[] var8 = new int[arg1.field8998];
        this.field2776 = new int[arg1.field8993 + 1];
        for (int var9 = 0; var9 < arg1.field8998; var9++) {
            if (arg1.field8987 == null || arg1.field8987[var9] != 2) {
                if (arg1.field9017 != null && arg1.field9017[var9] != -1) {
                    class679 var178 = var7.method962(arg1.field9017[var9] & 0xFFFF, 2904);
                    if (((this.field2707 & 0x40) == 0 || !var178.field9639) && var178.field9652) {
                        continue;
                    }
                }
                var8[this.field2766++] = var9;
                this.field2776[arg1.field9015[var9]]++;
                this.field2776[arg1.field9016[var9]]++;
                this.field2776[arg1.field9022[var9]]++;
            }
        }
        this.field2729 = this.field2766;
        long[] var10 = new long[this.field2766];
        boolean var11 = (this.field2749 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field2766; var12++) {
            int var161 = var8[var12];
            class679 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field9011 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field9011.length; var168++) {
                    class144 var169 = arg1.field9011[var168];
                    if (var169.field1955 == var161) {
                        class624 var170 = class183.method1299((byte) 80, var169.field1961);
                        if (var170.field8877) {
                            var167 = true;
                        }
                        if (var170.field8868 != -1) {
                            class679 var171 = var7.method962(var170.field8868, 2904);
                            if (var171.field9632 == 2) {
                                this.field2784 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field2729--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field9017 != null) {
                var172 = arg1.field9017[var161];
                if (var172 != -1) {
                    var162 = var7.method962(var172 & 0xFFFF, 2904);
                    if ((this.field2707 & 0x40) != 0 && var162.field9639) {
                        var162 = null;
                        var172 = -1;
                    } else {
                        var166 = var162.field9646;
                        var165 = var162.field9648;
                    }
                }
            }
            boolean var173 = arg1.field9003 != null && arg1.field9003[var161] != 0 || var162 != null && var162.field9632 != 0;
            if ((var11 || var173) && arg1.field9001 != null) {
                var163 += arg1.field9001[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = (var165 & 0xFF << 8) + var163;
            int var175 = (var172 & 0xFFFF << 16) + var164;
            int var176 = (var166 & 0xFF) + var174;
            int var177 = (var12 & 0xFFFF) + var175;
            var10[var12] = ((long) var176 << 32) + (long) var177;
            this.field2718 |= var162 != null && (var162.field9638 != 0 || var162.field9640 != 0);
            this.field2784 |= var173;
        }
        class634.method3634(var8, -110, var10);
        this.field2763 = arg1.field8985;
        this.field2773 = arg1.field8994;
        this.field2720 = arg1.field8984;
        this.field2713 = arg1.field9008;
        this.field2779 = arg1.field8993;
        this.field2754 = arg1.field8995;
        class265[] var13 = new class265[this.field2779];
        this.field2726 = arg1.field9026;
        this.field2792 = arg1.field9004;
        if (arg1.field9011 != null) {
            this.field2702 = arg1.field9011.length;
            this.field2732 = new class412[this.field2702];
            this.field2753 = new class136[this.field2702];
            for (int var14 = 0; var14 < this.field2702; var14++) {
                class144 var15 = arg1.field9011[var14];
                class624 var16 = class183.method1299((byte) 86, var15.field1961);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field2766; var18++) {
                    if (var8[var18] == var15.field1955) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class519.field7479[arg1.field8996[var15.field1955] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field9003 == null ? 0 : arg1.field9003[var15.field1955]) << 24;
                this.field2753[var14] = new class136(var17, arg1.field9015[var15.field1955], arg1.field9016[var15.field1955], arg1.field9022[var15.field1955], var16.field8873, var16.field8870, var16.field8868, var16.field8869, var16.field8871, var16.field8877, var16.field8875, var15.field1956);
                this.field2732[var14] = new class412(var20);
            }
        }
        int var21 = this.field2766 * 3;
        this.field2771 = new short[this.field2766];
        this.field2786 = new byte[var21];
        this.field2825 = new short[var21];
        this.field2781 = new short[var21];
        this.field2738 = new short[var21];
        this.field2775 = (short) arg4;
        this.field2788 = new short[this.field2766];
        this.field2798 = (short) arg3;
        this.field2808 = new float[var21];
        this.field2709 = new short[this.field2766];
        this.field2739 = new short[this.field2766];
        this.field2821 = new short[var21];
        this.field2755 = new short[this.field2766];
        this.field2705 = new float[var21];
        if (arg1.field9006 != null) {
            this.field2780 = new short[this.field2766];
        }
        this.field2765 = new byte[this.field2766];
        class382.field5536 = new long[var21];
        this.field2737 = new short[var21];
        this.field2789 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field8993; var23++) {
            int var160 = this.field2776[var23];
            this.field2776[var23] = var22;
            var22 += var160;
            var13[var23] = new class265();
        }
        this.field2776[arg1.field8993] = var22;
        class363 var24 = class283.method1813(this.field2766, arg1, var8, false);
        class751[] var25 = new class751[arg1.field8998];
        for (int var26 = 0; var26 < arg1.field8998; var26++) {
            short var139 = arg1.field9015[var26];
            short var140 = arg1.field9016[var26];
            short var141 = arg1.field9022[var26];
            int var142 = this.field2763[var140] - this.field2763[var139];
            int var143 = this.field2754[var140] - this.field2754[var139];
            int var144 = this.field2773[var140] - this.field2773[var139];
            int var145 = this.field2763[var141] - this.field2763[var139];
            int var146 = this.field2754[var141] - this.field2754[var139];
            int var147 = this.field2773[var141] - this.field2773[var139];
            int var148 = var143 * var147 - (var144 * var146);
            int var149 = var144 * var145 - (var142 * var147);
            int var150 = var142 * var146 - (var143 * var145);
            while (var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192) {
                var150 >>= 0x1;
                var149 >>= 0x1;
                var148 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var150 * var150 + (var148 * var148 + (var149 * var149))));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var148 * 256 / var151;
            int var153 = var149 * 256 / var151;
            int var154 = var150 * 256 / var151;
            byte var155 = arg1.field8987 == null ? 0 : arg1.field8987[var26];
            if (var155 == 0) {
                class265 var157 = var13[var139];
                var157.field3793 += var154;
                var157.field3794 += var152;
                var157.field3799 += var153;
                var157.field3800++;
                class265 var158 = var13[var140];
                var158.field3793 += var154;
                var158.field3799 += var153;
                var158.field3794 += var152;
                var158.field3800++;
                class265 var159 = var13[var141];
                var159.field3794 += var152;
                var159.field3800++;
                var159.field3793 += var154;
                var159.field3799 += var153;
            } else if (var155 == 1) {
                class751 var156 = var25[var26] = new class751();
                var156.field10466 = var152;
                var156.field10470 = var153;
                var156.field10464 = var154;
            }
        }
        for (int var27 = 0; var27 < this.field2766; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field8996[var48] & 0xFFFF;
            int var50;
            if (arg1.field9025 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field9025[var48];
            }
            int var51;
            if (arg1.field9003 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field9003[var48] & 0xFF;
            }
            short var52 = arg1.field9017 == null ? -1 : arg1.field9017[var48];
            if (var52 != -1 && (this.field2707 & 0x40) != 0) {
                class679 var53 = var7.method962(var52 & 0xFFFF, 2904);
                if (var53.field9639) {
                    var52 = -1;
                }
            }
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            byte var60 = 0;
            byte var61 = 0;
            int var62 = 0;
            if (var52 != -1) {
                if (var50 == -1) {
                    var60 = 1;
                    var59 = 0.0F;
                    var61 = 2;
                    var56 = 1.0F;
                    var58 = 0.0F;
                    var57 = 1.0F;
                    var54 = 0.0F;
                    var55 = 1.0F;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field9027[var50];
                    if (var63 == 0) {
                        short var64 = arg1.field9015[var48];
                        short var65 = arg1.field9016[var48];
                        short var66 = arg1.field9022[var48];
                        short var67 = arg1.field9030[var50];
                        short var68 = arg1.field9012[var50];
                        short var69 = arg1.field8983[var50];
                        float var70 = (float) arg1.field8985[var67];
                        float var71 = (float) arg1.field8995[var67];
                        float var72 = (float) arg1.field8994[var67];
                        float var73 = (float) arg1.field8985[var68] - var70;
                        float var74 = (float) arg1.field8995[var68] - var71;
                        float var75 = (float) arg1.field8994[var68] - var72;
                        float var76 = (float) arg1.field8985[var69] - var70;
                        float var77 = (float) arg1.field8995[var69] - var71;
                        float var78 = (float) arg1.field8994[var69] - var72;
                        float var79 = (float) arg1.field8985[var64] - var70;
                        float var80 = (float) arg1.field8995[var64] - var71;
                        float var81 = (float) arg1.field8994[var64] - var72;
                        float var82 = (float) arg1.field8985[var65] - var70;
                        float var83 = (float) arg1.field8995[var65] - var71;
                        float var84 = (float) arg1.field8994[var65] - var72;
                        float var85 = (float) arg1.field8985[var66] - var70;
                        float var86 = (float) arg1.field8995[var66] - var71;
                        float var87 = (float) arg1.field8994[var66] - var72;
                        float var88 = var74 * var78 - var75 * var77;
                        float var89 = var75 * var76 - var73 * var78;
                        float var90 = var73 * var77 - (var74 * var76);
                        float var91 = var77 * var90 - (var78 * var89);
                        float var92 = var78 * var88 - var76 * var90;
                        float var93 = var76 * var89 - var77 * var88;
                        float var94 = 1.0F / (var75 * var93 + var73 * var91 + var74 * var92);
                        var54 = (var81 * var93 + var79 * var91 + var80 * var92) * var94;
                        var56 = (var84 * var93 + var82 * var91 + var83 * var92) * var94;
                        var58 = (var87 * var93 + var85 * var91 + var86 * var92) * var94;
                        float var95 = var75 * var88 - var73 * var90;
                        float var96 = var74 * var90 - var75 * var89;
                        float var97 = var73 * var89 - (var74 * var88);
                        float var98 = 1.0F / (var78 * var97 + var76 * var96 + var77 * var95);
                        var59 = (var87 * var97 + var85 * var96 + var86 * var95) * var98;
                        var57 = (var84 * var97 + var82 * var96 + var83 * var95) * var98;
                        var55 = (var81 * var97 + var79 * var96 + var80 * var95) * var98;
                    } else {
                        short var99 = arg1.field9015[var48];
                        short var100 = arg1.field9016[var48];
                        short var101 = arg1.field9022[var48];
                        int var102 = var24.field5312[var50];
                        int var103 = var24.field5311[var50];
                        int var104 = var24.field5305[var50];
                        float[] var105 = var24.field5306[var50];
                        byte var106 = arg1.field8990[var50];
                        float var107 = (float) arg1.field9009[var50] / 256.0F;
                        if (var63 == 1) {
                            float var125 = (float) arg1.field9029[var50] / 1024.0F;
                            class179.method1272(arg1.field8995[var99], class702.field9895, var104, var106, 32476, var102, var107, var125, arg1.field8994[var99], arg1.field8985[var99], var105, var103);
                            var54 = class702.field9895[0];
                            var55 = class702.field9895[1];
                            class179.method1272(arg1.field8995[var100], class702.field9895, var104, var106, 32476, var102, var107, var125, arg1.field8994[var100], arg1.field8985[var100], var105, var103);
                            var57 = class702.field9895[1];
                            var56 = class702.field9895[0];
                            class179.method1272(arg1.field8995[var101], class702.field9895, var104, var106, 32476, var102, var107, var125, arg1.field8994[var101], arg1.field8985[var101], var105, var103);
                            var59 = class702.field9895[1];
                            var58 = class702.field9895[0];
                            float var126 = var125 / 2.0F;
                            if ((var106 & 0x1) == 0) {
                                if ((var56 - var54 > var126)) {
                                    var56 -= var125;
                                    var60 = 1;
                                } else if (var126 < var54 - var56) {
                                    var56 += var125;
                                    var60 = 2;
                                }
                                if ((var58 - var54 > var126)) {
                                    var61 = 1;
                                    var58 -= var125;
                                } else if (var126 < var54 - var58) {
                                    var58 += var125;
                                    var61 = 2;
                                }
                            } else {
                                if (var59 - var55 > var126) {
                                    var61 = 1;
                                    var59 -= var125;
                                } else if (var55 - var59 > var126) {
                                    var59 += var125;
                                    var61 = 2;
                                }
                                if (var57 - var55 > var126) {
                                    var60 = 1;
                                    var57 -= var125;
                                } else if (var126 < var55 - var57) {
                                    var57 += var125;
                                    var60 = 2;
                                }
                            }
                        } else if (var63 == 2) {
                            float var108 = (float) arg1.field9010[var50] / 256.0F;
                            float var109 = (float) arg1.field8986[var50] / 256.0F;
                            int var110 = arg1.field8985[var100] - arg1.field8985[var99];
                            int var111 = arg1.field8995[var100] - arg1.field8995[var99];
                            int var112 = arg1.field8994[var100] - arg1.field8994[var99];
                            int var113 = arg1.field8985[var101] - arg1.field8985[var99];
                            int var114 = arg1.field8995[var101] - arg1.field8995[var99];
                            int var115 = arg1.field8994[var101] - arg1.field8994[var99];
                            int var116 = var111 * var115 - (var112 * var114);
                            int var117 = var112 * var113 - var110 * var115;
                            int var118 = var110 * var114 - var111 * var113;
                            float var119 = 64.0F / (float) arg1.field9014[var50];
                            float var120 = 64.0F / (float) arg1.field8997[var50];
                            float var121 = 64.0F / (float) arg1.field9029[var50];
                            float var122 = (var105[2] * (float) var118 + var105[0] * (float) var116 + var105[1] * (float) var117) / var119;
                            float var123 = (var105[5] * (float) var118 + var105[4] * (float) var117 + var105[3] * (float) var116) / var120;
                            float var124 = (var105[8] * (float) var118 + var105[6] * (float) var116 + var105[7] * (float) var117) / var121;
                            var62 = class127.method901(var124, var122, var123, (byte) 120);
                            class125.method877(arg1.field8985[var99], class702.field9895, var108, var105, var102, var104, var62, arg1.field8995[var99], false, var106, arg1.field8994[var99], var103, var109, var107);
                            var54 = class702.field9895[0];
                            var55 = class702.field9895[1];
                            class125.method877(arg1.field8985[var100], class702.field9895, var108, var105, var102, var104, var62, arg1.field8995[var100], false, var106, arg1.field8994[var100], var103, var109, var107);
                            var56 = class702.field9895[0];
                            var57 = class702.field9895[1];
                            class125.method877(arg1.field8985[var101], class702.field9895, var108, var105, var102, var104, var62, arg1.field8995[var101], false, var106, arg1.field8994[var101], var103, var109, var107);
                            var59 = class702.field9895[1];
                            var58 = class702.field9895[0];
                        } else if (var63 == 3) {
                            class187.method1323(var107, var103, class702.field9895, arg1.field8994[var99], var102, 2048, arg1.field8995[var99], var104, var106, arg1.field8985[var99], var105);
                            var54 = class702.field9895[0];
                            var55 = class702.field9895[1];
                            class187.method1323(var107, var103, class702.field9895, arg1.field8994[var100], var102, 2048, arg1.field8995[var100], var104, var106, arg1.field8985[var100], var105);
                            var57 = class702.field9895[1];
                            var56 = class702.field9895[0];
                            class187.method1323(var107, var103, class702.field9895, arg1.field8994[var101], var102, 2048, arg1.field8995[var101], var104, var106, arg1.field8985[var101], var105);
                            var59 = class702.field9895[1];
                            var58 = class702.field9895[0];
                            if ((var106 & 0x1) == 0) {
                                if ((var58 - var54 > 0.5F)) {
                                    var58--;
                                    var61 = 1;
                                } else if (var54 - var58 > 0.5F) {
                                    var61 = 2;
                                    var58++;
                                }
                                if ((var56 - var54 > 0.5F)) {
                                    var60 = 1;
                                    var56--;
                                } else if (var54 - var56 > 0.5F) {
                                    var56++;
                                    var60 = 2;
                                }
                            } else {
                                if (var59 - var55 > 0.5F) {
                                    var61 = 1;
                                    var59--;
                                } else if (var55 - var59 > 0.5F) {
                                    var61 = 2;
                                    var59++;
                                }
                                if ((var57 - var55 > 0.5F)) {
                                    var60 = 1;
                                    var57--;
                                } else if (var55 - var57 > 0.5F) {
                                    var57++;
                                    var60 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field8987 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field8987[var48];
            }
            if (var127 == 0) {
                long var131 = ((long) (var62 << 24) - (-((long) (var49 << 8)) - ((long) var51)) << 32) + (long) (var50 << 2);
                short var133 = arg1.field9015[var48];
                short var134 = arg1.field9016[var48];
                short var135 = arg1.field9022[var48];
                class265 var136 = var13[var133];
                this.field2755[var27] = this.method1356(var136.field3793, var55, var136.field3794, var27, arg1, true, var54, var133, var136.field3799, var131, var136.field3800);
                class265 var137 = var13[var134];
                this.field2771[var27] = this.method1356(var137.field3793, var57, var137.field3794, var27, arg1, true, var56, var134, var137.field3799, (long) var60 + var131, var137.field3800);
                class265 var138 = var13[var135];
                this.field2739[var27] = this.method1356(var138.field3793, var59, var138.field3794, var27, arg1, true, var58, var135, var138.field3799, (long) var61 + var131, var138.field3800);
            } else if (var127 == 1) {
                class751 var128 = var25[var48];
                long var129 = ((long) (var49 << 8) + (long) (var62 << 24) + (long) var51 << 32) + (long) ((var128.field10464 + 256 << 22) + ((var50 << 2) + (var128.field10466 <= 0 ? 2048 : 1024) + (var128.field10470 + 256 << 12)));
                this.field2755[var27] = this.method1356(var128.field10464, var55, var128.field10466, var27, arg1, true, var54, arg1.field9015[var48], var128.field10470, var129, 0);
                this.field2771[var27] = this.method1356(var128.field10464, var57, var128.field10466, var27, arg1, true, var56, arg1.field9016[var48], var128.field10470, (long) var60 + var129, 0);
                this.field2739[var27] = this.method1356(var128.field10464, var59, var128.field10466, var27, arg1, true, var58, arg1.field9022[var48], var128.field10470, (long) var61 + var129, 0);
            }
            if (arg1.field9003 != null) {
                this.field2765[var27] = arg1.field9003[var48];
            }
            if (arg1.field9006 != null) {
                this.field2780[var27] = arg1.field9006[var48];
            }
            this.field2788[var27] = arg1.field8996[var48];
            this.field2709[var27] = var52;
        }
        if (this.field2729 > 0) {
            int var28 = 1;
            short var29 = this.field2709[0];
            for (int var30 = 0; var30 < this.field2729; var30++) {
                short var40 = this.field2709[var30];
                if (var29 != var40) {
                    var29 = var40;
                    var28++;
                }
            }
            this.field2742 = new int[var28 + 1];
            this.field2760 = new int[var28];
            this.field2758 = new int[var28];
            this.field2742[0] = 0;
            int var31 = this.field2824;
            short var32 = this.field2709[0];
            int var33 = 0;
            short var34 = 0;
            for (int var35 = 0; var35 < this.field2729; var35++) {
                short var36 = this.field2709[var35];
                if (var32 != var36) {
                    this.field2760[var33] = var31;
                    this.field2758[var33] = var34 + 1 - var31;
                    var33++;
                    this.field2742[var33] = var35;
                    var32 = var36;
                    var34 = 0;
                    var31 = this.field2824;
                }
                short var37 = this.field2755[var35];
                if (var37 < var31) {
                    var31 = var37;
                }
                if (var37 > var34) {
                    var34 = var37;
                }
                short var38 = this.field2771[var35];
                if (var38 > var34) {
                    var34 = var38;
                }
                if (var38 < var31) {
                    var31 = var38;
                }
                short var39 = this.field2739[var35];
                if (var31 > var39) {
                    var31 = var39;
                }
                if (var39 > var34) {
                    var34 = var39;
                }
            }
            this.field2760[var33] = var31;
            this.field2758[var33] = var34 + 1 - var31;
            var33++;
            this.field2742[var33] = this.field2729;
        }
        class382.field5536 = null;
        this.field2738 = class59.method559(this.field2738, this.field2824, 0);
        this.field2821 = class59.method559(this.field2821, this.field2824, 0);
        this.field2737 = class59.method559(this.field2737, this.field2824, 0);
        this.field2789 = class59.method559(this.field2789, this.field2824, 0);
        this.field2781 = class59.method559(this.field2781, this.field2824, 0);
        this.field2786 = class405.method2461(this.field2824, 13511, this.field2786);
        this.field2808 = class13.method69(this.field2824, 25189, this.field2808);
        this.field2705 = class13.method69(this.field2824, 25189, this.field2705);
        if (arg1.field8980 != null && class167.method1189(arg2, this.field2707, -20298)) {
            this.field2701 = arg1.method3665(false, -1);
        }
        if (arg1.field9011 != null && class647.method3739(-1, this.field2707, arg2)) {
            this.field2799 = arg1.method3675(15);
        }
        if (arg1.field8982 != null && class604.method3518(-10, arg2, this.field2707)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field2766; var43++) {
                int var47 = arg1.field8982[var8[var43]];
                if (var47 >= 0) {
                    int var10002 = var42[var47]++;
                    if (var47 > var41) {
                        var41 = var47;
                    }
                }
            }
            this.field2810 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field2810[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field2766; var45++) {
                int var46 = arg1.field8982[var8[var45]];
                if (var46 >= 0) {
                    this.field2810[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "(I)V", line = 4302)
    public static void method1360(int arg0) {
        field2820 = null;
        field2700 = null;
        if (arg0 == -625) {
            field2733 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "EA", descriptor = "()I", line = 4317)
    public final int method542() {
        if (!this.field2783) {
            this.method1353(101);
        }
        field2703++;
        return this.field2723;
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "()Z", line = 4329)
    public final boolean method543() {
        field2764++;
        if (this.field2709 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field2709.length; var1++) {
            if (this.field2709[var1] != -1 && !this.field2731.field7881.method963((byte) 41, this.field2709[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "()I", line = 4358)
    public final int method519() {
        if (!this.field2783) {
            this.method1353(39);
        }
        field2719++;
        return this.field2774;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)Z", line = 4370)
    private final boolean method1361(boolean arg0) {
        field2757++;
        boolean var2 = !this.field2767.field7087;
        boolean var3 = (this.field2707 & 0x37) != 0 && !this.field2708.field7087;
        boolean var4 = !this.field2795.field7087;
        boolean var5 = !this.field2743.field7087;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = arg0;
        if (var4) {
            if (this.field2795.field7089 == null) {
                this.field2795.field7089 = this.field2731.method327(this.field2813, false);
            }
            class436 var7 = this.field2795.field7089;
            var7.method1101(-32376, 12, this.field2824 * 12);
            Buffer var8 = var7.method1103((byte) 73, true);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field2731.field431.copyPositions(this.field2763, this.field2754, this.field2773, this.field2738, 0, 12, this.field2824, var8.getAddress());
                if (var7.method1099((byte) -105)) {
                    this.field2795.field7085 = var7;
                    this.field2795.field7087 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field2767.field7089 == null) {
                this.field2767.field7089 = this.field2731.method327(this.field2813, false);
            }
            class436 var9 = this.field2767.field7089;
            var9.method1101(-32376, 4, this.field2824 * 4);
            Buffer var10 = var9.method1103((byte) 73, true);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field2707 & 0x37) == 0) {
                    short[] var11;
                    short[] var12;
                    byte[] var13;
                    short[] var14;
                    if (this.field2761 == null) {
                        var11 = this.field2789;
                        var12 = this.field2781;
                        var13 = this.field2786;
                        var14 = this.field2737;
                    } else {
                        var12 = this.field2761.field8146;
                        var13 = this.field2761.field8142;
                        var14 = this.field2761.field8145;
                        var11 = this.field2761.field8144;
                    }
                    this.field2731.field431.copyLighting(this.field2788, this.field2765, this.field2709, var14, var11, var12, var13, this.field2798, this.field2775, this.field2821, 0, 4, this.field2824, var10.getAddress());
                } else {
                    this.field2731.field431.copyColours(this.field2788, this.field2765, this.field2709, this.field2798, this.field2821, 0, 4, this.field2824, var10.getAddress());
                }
                if (var9.method1099((byte) -123)) {
                    this.field2767.field7087 = true;
                    this.field2767.field7085 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field2708.field7089 == null) {
                this.field2708.field7089 = this.field2731.method327(this.field2813, !arg0);
            }
            class436 var15 = this.field2708.field7089;
            var15.method1101(-32376, 12, this.field2824 * 12);
            Buffer var16 = var15.method1103((byte) 73, true);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                short[] var18;
                byte[] var19;
                short[] var20;
                if (this.field2761 == null) {
                    var18 = this.field2789;
                    var17 = this.field2737;
                    var20 = this.field2781;
                    var19 = this.field2786;
                } else {
                    var17 = this.field2761.field8145;
                    var18 = this.field2761.field8144;
                    var19 = this.field2761.field8142;
                    var20 = this.field2761.field8146;
                }
                this.field2731.field431.copyNormals(var17, var18, var20, var19, 3.0F / (float) this.field2775, 3.0F / (float) (this.field2775 / 2 + this.field2775), 0, 12, this.field2824, var16.getAddress());
                if (var15.method1099((byte) -125)) {
                    this.field2708.field7085 = var15;
                    this.field2708.field7087 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field2743.field7089 == null) {
                this.field2743.field7089 = this.field2731.method327(this.field2813, false);
            }
            class436 var21 = this.field2743.field7089;
            var21.method1101(-32376, 8, this.field2824 * 8);
            Buffer var22 = var21.method1103((byte) 73, true);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field2731.field431.copyTexCoords(this.field2808, this.field2705, 0, 8, this.field2824, var22.getAddress());
                if (var21.method1099((byte) -126)) {
                    this.field2743.field7085 = var21;
                    this.field2743.field7087 = true;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lka;IIIZ)V", line = 4558)
    public final void method512(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2816++;
        class192 var6 = (class192) arg0;
        if (this.field2766 == 0 || var6.field2766 == 0) {
            return;
        }
        int var7 = var6.field2779;
        int[] var8 = var6.field2763;
        int[] var9 = var6.field2754;
        int[] var10 = var6.field2773;
        short[] var11 = var6.field2737;
        short[] var12 = var6.field2789;
        short[] var13 = var6.field2781;
        byte[] var14 = var6.field2786;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field2761 == null) {
            var16 = null;
            var17 = null;
            var15 = null;
            var18 = null;
        } else {
            var15 = this.field2761.field8146;
            var16 = this.field2761.field8142;
            var17 = this.field2761.field8145;
            var18 = this.field2761.field8144;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field2761 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field2761.field8144;
            var19 = var6.field2761.field8142;
            var21 = var6.field2761.field8145;
            var20 = var6.field2761.field8146;
        }
        int[] var23 = var6.field2776;
        short[] var24 = var6.field2825;
        if (!var6.field2783) {
            var6.method1353(100);
        }
        int var25 = var6.field2791;
        int var26 = var6.field2723;
        int var27 = var6.field2736;
        int var28 = var6.field2818;
        int var29 = var6.field2748;
        int var30 = var6.field2774;
        for (int var31 = 0; var31 < this.field2779; var31++) {
            int var32 = this.field2754[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field2763[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field2773[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field2776[var31];
                        int var37 = this.field2776[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field2825[var38] - 1;
                            if (var35 == -1 || this.field2786[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var17 == null) {
                                            this.field2761 = new class562();
                                            var17 = this.field2761.field8145 = class559.method3354(91, this.field2737);
                                            var18 = this.field2761.field8144 = class559.method3354(108, this.field2789);
                                            var15 = this.field2761.field8146 = class559.method3354(70, this.field2781);
                                            var16 = this.field2761.field8142 = class202.method1435((byte) 24, this.field2786);
                                        }
                                        if (var21 == null) {
                                            class562 var44 = var6.field2761 = new class562();
                                            var21 = var44.field8145 = class559.method3354(42, var11);
                                            var22 = var44.field8144 = class559.method3354(95, var12);
                                            var20 = var44.field8146 = class559.method3354(59, var13);
                                            var19 = var44.field8142 = class202.method1435((byte) 24, var14);
                                        }
                                        short var45 = this.field2737[var35];
                                        short var46 = this.field2789[var35];
                                        short var47 = this.field2781[var35];
                                        int var48 = var23[var39 + 1];
                                        int var49 = var23[var39];
                                        byte var50 = this.field2786[var35];
                                        for (int var51 = var49; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var19[var52] += var50;
                                            }
                                        }
                                        int var53 = this.field2776[var31 + 1];
                                        short var54 = var13[var40];
                                        short var55 = var12[var40];
                                        int var56 = this.field2776[var31];
                                        short var57 = var11[var40];
                                        byte var58 = var14[var40];
                                        for (int var59 = var56; var59 < var53; var59++) {
                                            int var60 = this.field2825[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var17[var60] += var57;
                                                var18[var60] += var55;
                                                var15[var60] += var54;
                                                var16[var60] += var58;
                                            }
                                        }
                                        var6.method1364(-21274);
                                        this.method1364(-21274);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "LA", descriptor = "(I)V", line = 4816)
    public final void method525(int arg0) {
        this.field2775 = (short) arg0;
        field2717++;
        this.method1367((byte) 110);
        this.method1364(-21274);
    }

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V", line = 4828)
    private final void method1362(int arg0) {
        field2735++;
        if (this.field2729 == 0) {
            return;
        }
        if (arg0 != 20021) {
            this.method1365(-66);
        }
        if (this.method1361(true) && this.method1368((byte) -29)) {
            this.field2731.method405(this.field2795.field7085, 0, (byte) 11);
            this.field2731.method405(this.field2767.field7085, 1, (byte) 11);
            this.field2731.method405(this.field2743.field7085, 2, (byte) 11);
            boolean var2;
            if ((this.field2707 & 0x37) == 0) {
                this.field2731.method299(true, false);
                var2 = false;
                this.field2731.method265(this.field2731.field659, (byte) -77);
            } else {
                this.field2731.method299(true, true);
                var2 = true;
                this.field2731.method405(this.field2708.field7085, 3, (byte) 11);
                this.field2731.method265(this.field2731.field651, (byte) -103);
            }
            for (int var3 = 0; var3 < this.field2760.length; var3++) {
                int var4 = this.field2742[var3];
                int var5 = this.field2742[var3 + 1];
                int var6 = this.field2709[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field2731.method223(true, var2, false, var6);
                this.field2731.method354(class262.field3771, this.field2760[var3], arg0 ^ 0xFFFFB1A2, this.field2758[var3], this.field2704.field6432, var5 - var4, var4 * 3);
            }
        }
        this.method1354(8);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 4887)
    private final void method1363(byte arg0) {
        int var2 = 118 / ((67 - arg0) / 47);
        field2782++;
        if (this.field2704 != null) {
            this.field2704.field6431 = false;
        }
    }

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "(I)V", line = 4903)
    public final void method487(int arg0) {
        field2797++;
        if (this.field2795 != null) {
            this.field2795.field7084 = class297.method1855(arg0, this.field2707, 70);
        }
        if (this.field2743 != null) {
            this.field2743.field7084 = class30.method150(arg0, 2, this.field2707);
        }
        if (this.field2767 != null) {
            this.field2767.field7084 = class26.method116(98, arg0, this.field2707);
        }
        if (this.field2708 != null) {
            this.field2708.field7084 = class258.method1716(this.field2707, arg0, -17051);
        }
        this.field2749 = arg0;
        if (this.field2761 != null && (this.field2749 & 0x10000) == 0) {
            this.field2781 = this.field2761.field8146;
            this.field2737 = this.field2761.field8145;
            this.field2786 = this.field2761.field8142;
            this.field2789 = this.field2761.field8144;
            this.field2761 = null;
        }
        this.field2706 = true;
        this.method1354(8);
    }

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "()V", line = 4939)
    public final void method506() {
        for (int var1 = 0; var1 < this.field2779; var1++) {
            this.field2773[var1] = -this.field2773[var1];
        }
        field2744++;
        for (int var2 = 0; var2 < this.field2824; var2++) {
            this.field2781[var2] = (short) (-this.field2781[var2]);
        }
        for (int var3 = 0; var3 < this.field2766; var3++) {
            short var4 = this.field2755[var3];
            this.field2755[var3] = this.field2739[var3];
            this.field2739[var3] = var4;
        }
        this.method1367((byte) 66);
        this.method1364(-21274);
        this.method1363((byte) 114);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "(I)V", line = 4978)
    private final void method1364(int arg0) {
        field2822++;
        if (arg0 != -21274) {
            this.field2788 = null;
        }
        if ((this.field2707 & 0x37) == 0) {
            if (this.field2767 == null) {
                return;
            }
            this.field2767.field7087 = false;
        } else if (this.field2708 != null) {
            this.field2708.field7087 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lch;IIZZ)V", line = 6348)
    public class192(class38 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field2713 = 0;
        this.field2718 = false;
        this.field2766 = 0;
        this.field2706 = true;
        this.field2784 = false;
        this.field2779 = 0;
        this.field2783 = false;
        this.field2824 = 0;
        this.field2813 = false;
        this.field2729 = 0;
        this.field2813 = arg4;
        this.field2707 = arg2;
        this.field2731 = arg0;
        this.field2749 = arg1;
        if (arg3 || class718.method4036(107, this.field2707, this.field2749)) {
            this.field2795 = new class492(class297.method1855(this.field2749, this.field2707, -128));
        }
        if (arg3 || class14.method70(this.field2707, (byte) -112, this.field2749)) {
            this.field2743 = new class492(class30.method150(this.field2749, 2, this.field2707));
        }
        if (arg3 || class90.method704(this.field2749, true, this.field2707)) {
            this.field2767 = new class492(class26.method116(8, this.field2749, this.field2707));
        }
        if (arg3 || class705.method3953(this.field2749, this.field2707, 0)) {
            this.field2708 = new class492(class258.method1716(this.field2707, this.field2749, -17051));
        }
        if (arg3 || method1350(this.field2707, this.field2749, -81)) {
            this.field2704 = new class449(class478.method2859((byte) -114, this.field2707, this.field2749));
        }
    }

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "(III)V", line = 5015)
    public final void method518(int arg0, int arg1, int arg2) {
        field2826++;
        for (int var4 = 0; var4 < this.field2779; var4++) {
            if (arg0 != 128) {
                this.field2763[var4] = this.field2763[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field2754[var4] = this.field2754[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field2773[var4] = this.field2773[var4] * arg2 >> 7;
            }
        }
        this.method1367((byte) 70);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "()I", line = 5046)
    public final int method539() {
        field2752++;
        if (!this.field2783) {
            this.method1353(115);
        }
        return this.field2736;
    }

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "(I)V", line = 5062)
    private final void method1365(int arg0) {
        int var2 = 73 % ((-arg0 - 54) / 36);
        if (this.field2753 != null) {
            this.field2731.method235(!this.field2784);
            this.field2731.method299(true, false);
            this.field2731.method230(class231.field3462, 1, 99);
            this.field2731.method242((byte) -114, class231.field3462, 1);
            for (int var3 = 0; var3 < this.field2702; var3++) {
                class136 var4 = this.field2753[var3];
                class412 var5 = this.field2732[var3];
                if (!var4.field1869 || !this.field2731.method1242()) {
                    float var6 = (float) (this.field2763[var4.field1873] + this.field2763[var4.field1865] + this.field2763[var4.field1876]) * 0.3333333F;
                    float var7 = (float) (this.field2754[var4.field1876] + this.field2754[var4.field1873] + this.field2754[var4.field1865]) * 0.3333333F;
                    float var8 = (float) (this.field2773[var4.field1876] + this.field2773[var4.field1865] + this.field2773[var4.field1873]) * 0.3333333F;
                    float var9 = class577.field8288 * var8 + class714.field10083 * var6 + class214.field3214 * var7 + class299.field4082;
                    float var10 = class477.field6784 * var8 + class645.field9291 * var6 + class5.field53 * var7 + class171.field2409;
                    float var11 = class350.field5204 * var8 + class80.field1145 * var7 + class622.field8843 * var6 + class397.field5693;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field1866;
                    class417 var13 = this.field2731.method345(0);
                    var13.method2535((float) var5.field5868 + var10 - (var10 * var12), (float) var5.field5875 + var9 + -(var9 * var12), true, var5.field5867, var4.field1874 * var5.field5870 >> 7, var11 - (var11 * var12), var4.field1862 * var5.field5869 >> 7);
                    var13.method2529(11, this.field2731.field534);
                    this.field2731.method384((byte) 19);
                    int var14 = var5.field5872;
                    this.field2731.method223(false, false, false, var4.field1870);
                    this.field2731.method355(var4.field1863, (byte) -61);
                    this.field2731.method213(var14, 3);
                    this.field2731.method337((byte) 18);
                }
            }
            this.field2731.method242((byte) -127, class401.field5746, 1);
            this.field2731.method230(class401.field5746, 1, 111);
            this.field2731.method235(true);
        }
        field2793++;
    }

    @OriginalMember(owner = "client!lu", name = "ua", descriptor = "()I", line = 5130)
    public final int method528() {
        field2815++;
        return this.field2749;
    }

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "(IIII)V", line = 5138)
    public final void method508(int arg0, int arg1, int arg2, int arg3) {
        field2725++;
        if (arg0 == 0) {
            class523.field7608 = 0;
            class195.field2850 = 0;
            class494.field7112 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field2779; var6++) {
                class523.field7608 += this.field2763[var6];
                class494.field7112 += this.field2754[var6];
                class195.field2850 += this.field2773[var6];
                var5++;
            }
            if (var5 > 0) {
                class494.field7112 = class494.field7112 / var5 + arg2;
                class195.field2850 = class195.field2850 / var5 + arg3;
                class523.field7608 = class523.field7608 / var5 + arg1;
            } else {
                class494.field7112 = arg2;
                class195.field2850 = arg3;
                class523.field7608 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field2779; var7++) {
                this.field2763[var7] += arg1;
                this.field2754[var7] += arg2;
                this.field2773[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field2779; var8++) {
                this.field2763[var8] -= class523.field7608;
                this.field2754[var8] -= class494.field7112;
                this.field2773[var8] -= class195.field2850;
                if (arg3 != 0) {
                    int var9 = class125.field1736[arg3];
                    int var10 = class125.field1729[arg3];
                    int var11 = this.field2754[var8] * var9 - (-(this.field2763[var8] * var10) - 16383) >> 14;
                    this.field2754[var8] = this.field2754[var8] * var10 + 16383 - (this.field2763[var8] * var9) >> 14;
                    this.field2763[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class125.field1736[arg1];
                    int var13 = class125.field1729[arg1];
                    int var14 = this.field2754[var8] * var13 - (this.field2773[var8] * var12 - 16383) >> 14;
                    this.field2773[var8] = this.field2773[var8] * var13 + (this.field2754[var8] * var12 + 16383) >> 14;
                    this.field2754[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class125.field1736[arg2];
                    int var16 = class125.field1729[arg2];
                    int var17 = this.field2773[var8] * var15 + this.field2763[var8] * var16 + 16383 >> 14;
                    this.field2773[var8] = this.field2773[var8] * var16 + 16383 - (this.field2763[var8] * var15) >> 14;
                    this.field2763[var8] = var17;
                }
                this.field2763[var8] += class523.field7608;
                this.field2754[var8] += class494.field7112;
                this.field2773[var8] += class195.field2850;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field2779; var18++) {
                this.field2763[var18] -= class523.field7608;
                this.field2754[var18] -= class494.field7112;
                this.field2773[var18] -= class195.field2850;
                this.field2763[var18] = this.field2763[var18] * arg1 / 128;
                this.field2754[var18] = this.field2754[var18] * arg2 / 128;
                this.field2773[var18] = this.field2773[var18] * arg3 / 128;
                this.field2763[var18] += class523.field7608;
                this.field2754[var18] += class494.field7112;
                this.field2773[var18] += class195.field2850;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field2766; var19++) {
                int var23 = (this.field2765[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field2765[var19] = (byte) var23;
            }
            if (this.field2753 != null) {
                for (int var20 = 0; var20 < this.field2702; var20++) {
                    class136 var21 = this.field2753[var20];
                    class412 var22 = this.field2732[var20];
                    var22.field5872 = var22.field5872 & 0xFFFFFF | 255 - (this.field2765[var21.field1868] & 0xFF) << 24;
                }
            }
            this.method1352(1015);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field2766; var24++) {
                int var28 = this.field2788[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x38F) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var31;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field2788[var24] = (short) class430.method2658(class430.method2658(var33 << 7, var32 << 10), var34);
            }
            if (this.field2753 != null) {
                for (int var25 = 0; var25 < this.field2702; var25++) {
                    class136 var26 = this.field2753[var25];
                    class412 var27 = this.field2732[var25];
                    var27.field5872 = var27.field5872 & 0xFF000000 | class519.field7479[this.field2788[var26.field1868] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method1352(1015);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field2702; var35++) {
                class412 var36 = this.field2732[var35];
                var36.field5868 += arg2;
                var36.field5875 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field2702; var37++) {
                class412 var38 = this.field2732[var37];
                var38.field5870 = var38.field5870 * arg2 >> 7;
                var38.field5869 = var38.field5869 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field2702; var39++) {
                class412 var40 = this.field2732[var39];
                var40.field5867 = var40.field5867 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIII)Z", line = 5443)
    private final boolean method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2750++;
        if (arg7 != 1) {
            return false;
        } else if (arg4 < arg0 && arg4 < arg1 && arg4 < arg3) {
            return false;
        } else if (arg0 < arg4 && arg1 < arg4 && arg3 < arg4) {
            return false;
        } else if (arg6 < arg8 && arg6 < arg5 && arg6 < arg2) {
            return false;
        } else {
            return arg6 <= arg8 || arg5 >= arg6 || arg2 >= arg6;
        }
    }

    @OriginalMember(owner = "client!lu", name = "ba", descriptor = "(Lr;)Lr;", line = 5469)
    public final class704 method540(class704 arg0) {
        field2828++;
        if (this.field2824 == 0) {
            return null;
        }
        if (!this.field2783) {
            this.method1353(52);
        }
        int var2;
        int var3;
        if (this.field2731.field633 <= 0) {
            var2 = this.field2736 - (this.field2731.field633 * this.field2791 >> 8) >> this.field2731.field588;
            var3 = this.field2818 - (this.field2731.field633 * this.field2723 >> 8) >> this.field2731.field588;
        } else {
            var2 = this.field2736 - (this.field2731.field633 * this.field2723 >> 8) >> this.field2731.field588;
            var3 = this.field2818 - (this.field2731.field633 * this.field2791 >> 8) >> this.field2731.field588;
        }
        int var4;
        int var5;
        if (this.field2731.field539 > 0) {
            var4 = this.field2748 - (this.field2731.field539 * this.field2723 >> 8) >> this.field2731.field588;
            var5 = this.field2774 - (this.field2731.field539 * this.field2791 >> 8) >> this.field2731.field588;
        } else {
            var4 = this.field2748 - (this.field2731.field539 * this.field2791 >> 8) >> this.field2731.field588;
            var5 = this.field2774 - (this.field2731.field539 * this.field2723 >> 8) >> this.field2731.field588;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class416 var8 = (class416) arg0;
        class416 var9;
        if (var8 != null && var8.method2510(var7, var6, 0)) {
            var9 = var8;
            var8.method2509((byte) 23);
        } else {
            var9 = new class416(this.field2731, var6, var7);
        }
        var9.method2513(var5, var4, var3, var2, 32428);
        this.method1358(var9, (byte) 7);
        return var9;
    }

    @OriginalMember(owner = "client!lu", name = "fa", descriptor = "()I", line = 5530)
    public final int method511() {
        if (!this.field2783) {
            this.method1353(62);
        }
        field2769++;
        return this.field2791;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lsk;)V", line = 5545)
    public final void method491(class121 arg0) {
        field2762++;
        class417 var2 = (class417) arg0;
        if (this.field2792 != null) {
            for (int var3 = 0; var3 < this.field2792.length; var3++) {
                class108 var4 = this.field2792[var3];
                class108 var5 = var4;
                if (var4.field1553 != null) {
                    var5 = var4.field1553;
                }
                var5.field1556 = (int) ((float) this.field2773[var4.field1558] * var2.field5927 + (float) this.field2763[var4.field1558] * var2.field5948 + (float) this.field2754[var4.field1558] * var2.field5923 + var2.field5950);
                var5.field1552 = (int) ((float) this.field2773[var4.field1558] * var2.field5938 + (float) this.field2763[var4.field1558] * var2.field5946 + (float) this.field2754[var4.field1558] * var2.field5940 + var2.field5957);
                var5.field1546 = (int) ((float) this.field2773[var4.field1558] * var2.field5961 + (float) this.field2763[var4.field1558] * var2.field5939 + (float) this.field2754[var4.field1558] * var2.field5968 + var2.field5945);
                var5.field1543 = (int) ((float) this.field2773[var4.field1550] * var2.field5927 + (float) this.field2763[var4.field1550] * var2.field5948 + (float) this.field2754[var4.field1550] * var2.field5923 + var2.field5950);
                var5.field1540 = (int) ((float) this.field2773[var4.field1550] * var2.field5938 + (float) this.field2763[var4.field1550] * var2.field5946 + (float) this.field2754[var4.field1550] * var2.field5940 + var2.field5957);
                var5.field1537 = (int) ((float) this.field2773[var4.field1550] * var2.field5961 + (float) this.field2763[var4.field1550] * var2.field5939 + (float) this.field2754[var4.field1550] * var2.field5968 + var2.field5945);
                var5.field1554 = (int) ((float) this.field2773[var4.field1547] * var2.field5927 + (float) this.field2763[var4.field1547] * var2.field5948 + (float) this.field2754[var4.field1547] * var2.field5923 + var2.field5950);
                var5.field1549 = (int) ((float) this.field2773[var4.field1547] * var2.field5938 + (float) this.field2763[var4.field1547] * var2.field5946 + (float) this.field2754[var4.field1547] * var2.field5940 + var2.field5957);
                var5.field1548 = (int) ((float) this.field2773[var4.field1547] * var2.field5961 + (float) this.field2763[var4.field1547] * var2.field5939 + (float) this.field2754[var4.field1547] * var2.field5968 + var2.field5945);
            }
        }
        if (this.field2726 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2726.length; var6++) {
            class647 var7 = this.field2726[var6];
            class647 var8 = var7;
            if (var7.field9326 != null) {
                var8 = var7.field9326;
            }
            if (var7.field9325 == null) {
                var7.field9325 = var2.method853();
            } else {
                var7.field9325.method841(var2);
            }
            var8.field9315 = (int) ((float) this.field2773[var7.field9323] * var2.field5927 + (float) this.field2763[var7.field9323] * var2.field5948 + (float) this.field2754[var7.field9323] * var2.field5923 + var2.field5950);
            var8.field9318 = (int) ((float) this.field2773[var7.field9323] * var2.field5938 + (float) this.field2763[var7.field9323] * var2.field5946 + (float) this.field2754[var7.field9323] * var2.field5940 + var2.field5957);
            var8.field9313 = (int) ((float) this.field2773[var7.field9323] * var2.field5961 + (float) this.field2763[var7.field9323] * var2.field5939 + (float) this.field2754[var7.field9323] * var2.field5968 + var2.field5945);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lsk;Lnl;I)V", line = 5611)
    public final void method533(class121 arg0, class373 arg1, int arg2) {
        field2812++;
        if (this.field2824 == 0) {
            return;
        }
        class417 var4 = this.field2731.field533;
        if (!this.field2783) {
            this.method1353(41);
        }
        class417 var5 = (class417) arg0;
        class80.field1145 = var4.field5961 * var5.field5968 + var4.field5968 * var5.field5940 + var4.field5939 * var5.field5923;
        class397.field5693 = var4.field5961 * var5.field5945 + var4.field5968 * var5.field5957 + var4.field5939 * var5.field5950 + var4.field5945;
        float var6 = (float) this.field2791 * class80.field1145 + class397.field5693;
        float var7 = (float) this.field2723 * class80.field1145 + class397.field5693;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field2785 + var6;
            var9 = (float) (-this.field2785) + var7;
        } else {
            var8 = (float) this.field2785 + var7;
            var9 = (float) (-this.field2785) + var6;
        }
        if ((var9 >= this.field2731.field637) || (var8 <= (float) this.field2731.field538)) {
            return;
        }
        class214.field3214 = var4.field5927 * var5.field5968 + var4.field5948 * var5.field5923 + var4.field5923 * var5.field5940;
        class299.field4082 = var4.field5927 * var5.field5945 + var4.field5948 * var5.field5950 + var4.field5923 * var5.field5957 + var4.field5950;
        float var10 = (float) this.field2791 * class214.field3214 + class299.field4082;
        float var11 = (float) this.field2723 * class214.field3214 + class299.field4082;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field2785 + var10) * (float) this.field2731.field598;
            var13 = ((float) (-this.field2785) + var11) * (float) this.field2731.field598;
        } else {
            var12 = ((float) this.field2785 + var11) * (float) this.field2731.field598;
            var13 = (var10 - (float) this.field2785) * (float) this.field2731.field598;
        }
        if ((var13 / var8 >= this.field2731.field603) || (this.field2731.field554 >= var12 / var8)) {
            return;
        }
        class171.field2409 = var4.field5938 * var5.field5945 + var4.field5946 * var5.field5950 + var4.field5940 * var5.field5957 + var4.field5957;
        class5.field53 = var4.field5938 * var5.field5968 + var4.field5946 * var5.field5923 + var4.field5940 * var5.field5940;
        float var14 = (float) this.field2791 * class5.field53 + class171.field2409;
        float var15 = (float) this.field2723 * class5.field53 + class171.field2409;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field2785 + var14) * (float) this.field2731.field557;
            var17 = ((float) (-this.field2785) + var15) * (float) this.field2731.field557;
        } else {
            var17 = (var14 - (float) this.field2785) * (float) this.field2731.field557;
            var16 = ((float) this.field2785 + var15) * (float) this.field2731.field557;
        }
        if ((var17 / var8 >= this.field2731.field617) || (var16 / var8 <= this.field2731.field543)) {
            return;
        }
        if (arg1 != null || this.field2753 != null) {
            class350.field5204 = var4.field5961 * var5.field5961 + var4.field5968 * var5.field5938 + var4.field5939 * var5.field5927;
            class714.field10083 = var4.field5927 * var5.field5939 + var4.field5948 * var5.field5948 + var4.field5923 * var5.field5946;
            class622.field8843 = var4.field5961 * var5.field5939 + var4.field5968 * var5.field5946 + var4.field5939 * var5.field5948;
            class477.field6784 = var4.field5938 * var5.field5961 + var4.field5946 * var5.field5927 + var4.field5940 * var5.field5938;
            class645.field9291 = var4.field5938 * var5.field5939 + var4.field5946 * var5.field5948 + var4.field5940 * var5.field5946;
            class577.field8288 = var4.field5927 * var5.field5961 + var4.field5948 * var5.field5927 + var4.field5923 * var5.field5938;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field2736 + this.field2818 >> 1;
            int var21 = this.field2774 + this.field2748 >> 1;
            int var22 = (int) ((float) var21 * class577.field8288 + (float) this.field2791 * class214.field3214 + (float) var20 * class714.field10083 + class299.field4082);
            int var23 = (int) ((float) var21 * class477.field6784 + (float) this.field2791 * class5.field53 + (float) var20 * class645.field9291 + class171.field2409);
            int var24 = (int) ((float) var21 * class350.field5204 + (float) this.field2791 * class80.field1145 + (float) var20 * class622.field8843 + class397.field5693);
            if (this.field2731.field538 <= var24) {
                arg1.field5410 = this.field2731.field557 * var23 / var24 + this.field2731.field590;
                arg1.field5407 = this.field2731.field598 * var22 / var24 + this.field2731.field622;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class577.field8288 + (float) this.field2723 * class214.field3214 + (float) var20 * class714.field10083 + class299.field4082);
            int var26 = (int) ((float) var21 * class477.field6784 + (float) this.field2723 * class5.field53 + (float) var20 * class645.field9291 + class171.field2409);
            int var27 = (int) ((float) var21 * class350.field5204 + (float) this.field2723 * class80.field1145 + (float) var20 * class622.field8843 + class397.field5693);
            if (this.field2731.field538 > var27) {
                var18 = true;
            } else {
                arg1.field5408 = this.field2731.field598 * var25 / var27 + this.field2731.field622;
                arg1.field5411 = this.field2731.field557 * var26 / var27 + this.field2731.field590;
            }
            if (var18) {
                if (var24 < this.field2731.field538 && this.field2731.field538 > var27) {
                    var19 = false;
                } else if (var24 < this.field2731.field538) {
                    int var31 = (var27 - this.field2731.field538 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    arg1.field5407 = this.field2731.field598 * var32 / this.field2731.field538 + this.field2731.field622;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field5410 = this.field2731.field557 * var33 / this.field2731.field538 + this.field2731.field590;
                } else if (this.field2731.field538 > var27) {
                    int var28 = (var24 - this.field2731.field538 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field5407 = this.field2731.field598 * var29 / this.field2731.field538 + this.field2731.field622;
                    arg1.field5410 = this.field2731.field557 * var30 / this.field2731.field538 + this.field2731.field590;
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field5412 = (this.field2785 + var22) * this.field2731.field598 / var24 + this.field2731.field622 - arg1.field5407;
                } else {
                    arg1.field5412 = this.field2731.field622 + ((this.field2785 + var25) * this.field2731.field598 / var27) - arg1.field5408;
                }
                arg1.field5409 = true;
            }
        }
        this.field2731.method248(22301);
        this.field2731.method333(-13267, var5);
        this.method1362(20021);
        this.method1365(-109);
    }

    @OriginalMember(owner = "client!lu", name = "RA", descriptor = "()I", line = 5810)
    public final int method522() {
        if (!this.field2783) {
            this.method1353(94);
        }
        field2811++;
        return this.field2818;
    }

    @OriginalMember(owner = "client!lu", name = "ia", descriptor = "(SS)V", line = 5823)
    public final void method486(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2766; var3++) {
            if (this.field2788[var3] == arg0) {
                this.field2788[var3] = arg1;
            }
        }
        field2710++;
        if (this.field2753 != null) {
            for (int var4 = 0; var4 < this.field2702; var4++) {
                class136 var5 = this.field2753[var4];
                class412 var6 = this.field2732[var4];
                var6.field5872 = class519.field7479[this.field2788[var5.field1868] & 0xFFFF] & 0xFFFFFF | var6.field5872 & 0xFF000000;
            }
        }
        this.method1352(1015);
    }

    @OriginalMember(owner = "client!lu", name = "wa", descriptor = "()V", line = 5863)
    public final void method537() {
        for (int var1 = 0; var1 < this.field2713; var1++) {
            this.field2763[var1] = this.field2763[var1] + 7 >> 4;
            this.field2754[var1] = this.field2754[var1] + 7 >> 4;
            this.field2773[var1] = this.field2773[var1] + 7 >> 4;
        }
        field2715++;
        this.method1367((byte) 63);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()[Lvea;", line = 5885)
    public final class647[] method502() {
        field2801++;
        return this.field2726;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lsk;IZ)V", line = 5897)
    public final void method523(class121 arg0, int arg1, boolean arg2) {
        field2722++;
        if (this.field2720 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field2779; var5++) {
            if ((arg1 & this.field2720[var5]) != 0) {
                if (arg2) {
                    arg0.method855(this.field2763[var5], this.field2754[var5], this.field2773[var5], var4);
                } else {
                    arg0.method859(this.field2763[var5], this.field2754[var5], this.field2773[var5], var4);
                }
                this.field2763[var5] = var4[0];
                this.field2754[var5] = var4[1];
                this.field2773[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "ma", descriptor = "()I", line = 5929)
    public final int method507() {
        field2823++;
        if (!this.field2783) {
            this.method1353(112);
        }
        return this.field2800;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "()V", line = 5941)
    public final void method489() {
        field2804++;
    }

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "(III)V", line = 5957)
    public final void method529(int arg0, int arg1, int arg2) {
        field2805++;
        for (int var4 = 0; var4 < this.field2779; var4++) {
            if (arg0 != 0) {
                this.field2763[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field2754[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field2773[var4] += arg2;
            }
        }
        this.method1367((byte) 66);
        this.field2783 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILsk;ZII)Z", line = 5992)
    public final boolean method538(int arg0, int arg1, class121 arg2, boolean arg3, int arg4, int arg5) {
        field2756++;
        return this.method1357(arg2, arg0, -122, arg4, arg5, arg1, arg3);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)V", line = 6001)
    public final void method524(int arg0, int arg1, int arg2, int arg3) {
        field2740++;
        for (int var5 = 0; var5 < this.field2766; var5++) {
            int var9 = this.field2788[var5] & 0xFFFF;
            int var10 = (var9 & 0xFFC9) >> 10;
            int var11 = var9 >> 7 & 0x7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field2788[var5] = (short) class430.method2658(var12, class430.method2658(var10 << 10, var11 << 7));
        }
        if (this.field2753 != null) {
            for (int var6 = 0; var6 < this.field2702; var6++) {
                class136 var7 = this.field2753[var6];
                class412 var8 = this.field2732[var6];
                var8.field5872 = var8.field5872 & 0xFF000000 | class519.field7479[this.field2788[var7.field1868] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method1352(1015);
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)V", line = 6065)
    private final void method1367(byte arg0) {
        if (arg0 < 28) {
            this.method1367((byte) 93);
        }
        field2768++;
        if (this.field2795 != null) {
            this.field2795.field7087 = false;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lsk;Lnl;II)V", line = 6084)
    public final void method503(class121 arg0, class373 arg1, int arg2, int arg3) {
        field2777++;
        if (this.field2824 == 0) {
            return;
        }
        class417 var5 = this.field2731.field533;
        if (!this.field2783) {
            this.method1353(49);
        }
        class417 var6 = (class417) arg0;
        class397.field5693 = var5.field5961 * var6.field5945 + var5.field5968 * var6.field5957 + var5.field5939 * var6.field5950 + var5.field5945;
        class80.field1145 = var5.field5961 * var6.field5968 + var5.field5968 * var6.field5940 + var5.field5939 * var6.field5923;
        float var7 = (float) this.field2791 * class80.field1145 + class397.field5693;
        float var8 = (float) this.field2723 * class80.field1145 + class397.field5693;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) (-this.field2785) + var8;
            var9 = (float) this.field2785 + var7;
        } else {
            var9 = (float) this.field2785 + var8;
            var10 = (float) (-this.field2785) + var7;
        }
        if ((var10 >= this.field2731.field578) || (var9 <= (float) this.field2731.field538)) {
            return;
        }
        class214.field3214 = var5.field5927 * var6.field5968 + var5.field5948 * var6.field5923 + var5.field5923 * var6.field5940;
        class299.field4082 = var5.field5927 * var6.field5945 + var5.field5948 * var6.field5950 + var5.field5923 * var6.field5957 + var5.field5950;
        float var11 = (float) this.field2791 * class214.field3214 + class299.field4082;
        float var12 = (float) this.field2723 * class214.field3214 + class299.field4082;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field2785 + var11) * (float) this.field2731.field598;
            var13 = (var12 - (float) this.field2785) * (float) this.field2731.field598;
        } else {
            var13 = (var11 - (float) this.field2785) * (float) this.field2731.field598;
            var14 = ((float) this.field2785 + var12) * (float) this.field2731.field598;
        }
        if ((this.field2731.field603 <= var13 / (float) arg2) || (this.field2731.field554 >= var14 / (float) arg2)) {
            return;
        }
        class5.field53 = var5.field5938 * var6.field5968 + var5.field5946 * var6.field5923 + var5.field5940 * var6.field5940;
        class171.field2409 = var5.field5938 * var6.field5945 + var5.field5946 * var6.field5950 + var5.field5940 * var6.field5957 + var5.field5957;
        float var15 = (float) this.field2791 * class5.field53 + class171.field2409;
        float var16 = (float) this.field2723 * class5.field53 + class171.field2409;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field2785 + var15) * (float) this.field2731.field557;
            var18 = (var16 - (float) this.field2785) * (float) this.field2731.field557;
        } else {
            var18 = (var15 - (float) this.field2785) * (float) this.field2731.field557;
            var17 = ((float) this.field2785 + var16) * (float) this.field2731.field557;
        }
        if ((this.field2731.field617 <= var18 / (float) arg2) || (this.field2731.field543 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field2753 != null) {
            class477.field6784 = var5.field5938 * var6.field5961 + var5.field5946 * var6.field5927 + var5.field5940 * var6.field5938;
            class577.field8288 = var5.field5927 * var6.field5961 + var5.field5948 * var6.field5927 + var5.field5923 * var6.field5938;
            class714.field10083 = var5.field5927 * var6.field5939 + var5.field5948 * var6.field5948 + var5.field5923 * var6.field5946;
            class622.field8843 = var5.field5961 * var6.field5939 + var5.field5968 * var6.field5946 + var5.field5939 * var6.field5948;
            class645.field9291 = var5.field5938 * var6.field5939 + var5.field5946 * var6.field5948 + var5.field5940 * var6.field5946;
            class350.field5204 = var5.field5961 * var6.field5961 + var5.field5968 * var6.field5938 + var5.field5939 * var6.field5927;
        }
        if (arg1 != null) {
            int var19 = this.field2818 + this.field2736 >> 1;
            int var20 = this.field2774 + this.field2748 >> 1;
            int var21 = (int) ((float) var20 * class577.field8288 + (float) this.field2791 * class214.field3214 + (float) var19 * class714.field10083 + class299.field4082);
            int var22 = (int) ((float) var20 * class477.field6784 + (float) this.field2791 * class5.field53 + (float) var19 * class645.field9291 + class171.field2409);
            int var23 = (int) ((float) var20 * class350.field5204 + (float) this.field2791 * class80.field1145 + (float) var19 * class622.field8843 + class397.field5693);
            int var24 = (int) ((float) var20 * class577.field8288 + (float) this.field2723 * class214.field3214 + (float) var19 * class714.field10083 + class299.field4082);
            int var25 = (int) ((float) var20 * class477.field6784 + (float) this.field2723 * class5.field53 + (float) var19 * class645.field9291 + class171.field2409);
            arg1.field5410 = this.field2731.field590 + (this.field2731.field557 * var22 / arg2);
            int var26 = (int) ((float) var20 * class350.field5204 + (float) this.field2723 * class80.field1145 + (float) var19 * class622.field8843 + class397.field5693);
            arg1.field5407 = this.field2731.field598 * var21 / arg2 + this.field2731.field622;
            arg1.field5408 = this.field2731.field622 + (this.field2731.field598 * var24 / arg2);
            arg1.field5411 = this.field2731.field590 + (this.field2731.field557 * var25 / arg2);
            if (this.field2731.field538 <= var23 || this.field2731.field538 <= var26) {
                arg1.field5409 = true;
                arg1.field5412 = this.field2731.field622 - (arg1.field5407 - ((this.field2785 + var21) * this.field2731.field598 / arg2));
            }
        }
        this.field2731.method312((byte) 30, (float) arg2);
        this.field2731.method243(119);
        this.field2731.method333(-13267, var6);
        this.method1362(20021);
        this.method1365(-6);
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)Z", line = 6232)
    private final boolean method1368(byte arg0) {
        field2790++;
        if (this.field2704.field6431) {
            return true;
        }
        if (this.field2704.field6426 == null) {
            this.field2704.field6426 = this.field2731.method366((byte) 125, this.field2813);
        }
        class33 var2 = this.field2704.field6426;
        var2.method174(this.field2729 * 6, (byte) 39);
        Buffer var3 = var2.method177(true, (byte) -128);
        if (var3 != null) {
            Stream var4 = this.field2731.method325((byte) -120, var3);
            if (Stream.method2551()) {
                for (int var6 = 0; var6 < this.field2729; var6++) {
                    var4.method2561(this.field2755[var6]);
                    var4.method2561(this.field2771[var6]);
                    var4.method2561(this.field2739[var6]);
                }
            } else {
                for (int var5 = 0; var5 < this.field2729; var5++) {
                    var4.method2560(this.field2755[var5]);
                    var4.method2560(this.field2771[var5]);
                    var4.method2560(this.field2739[var5]);
                }
            }
            var4.method2554();
            if (var2.method178((byte) -128)) {
                this.field2704.field6432 = var2;
                this.field2706 = true;
                this.field2704.field6431 = true;
                return true;
            }
        }
        if (arg0 >= -6) {
            this.method1354(-37);
        }
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "NA", descriptor = "()Z", line = 6307)
    public final boolean method536() {
        field2819++;
        if (this.field2701 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field2713; var1++) {
            this.field2763[var1] <<= 0x4;
            this.field2754[var1] <<= 0x4;
            this.field2773[var1] <<= 0x4;
        }
        class523.field7608 = 0;
        class494.field7112 = 0;
        class195.field2850 = 0;
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "WA", descriptor = "()I", line = 6336)
    public final int method521() {
        field2827++;
        return this.field2798;
    }
}
