import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 extends class496 {

    @OriginalMember(owner = "client!hba", name = "y", descriptor = "Z")
    private boolean field104 = false;

    @OriginalMember(owner = "client!hba", name = "G", descriptor = "I")
    private int field112 = 0;

    @OriginalMember(owner = "client!hba", name = "nb", descriptor = "Z")
    private boolean field145 = false;

    @OriginalMember(owner = "client!hba", name = "Y", descriptor = "Z")
    private boolean field130 = false;

    @OriginalMember(owner = "client!hba", name = "Xb", descriptor = "I")
    private int field181 = 0;

    @OriginalMember(owner = "client!hba", name = "Nb", descriptor = "I")
    private int field171 = 0;

    @OriginalMember(owner = "client!hba", name = "jc", descriptor = "I")
    private int field193 = 0;

    @OriginalMember(owner = "client!hba", name = "rc", descriptor = "I")
    private int field201 = 0;

    @OriginalMember(owner = "client!hba", name = "Z", descriptor = "Z")
    private boolean field131 = true;

    @OriginalMember(owner = "client!hba", name = "oc", descriptor = "Lqfa;")
    private class106 field198;

    @OriginalMember(owner = "client!hba", name = "Hb", descriptor = "Lei;")
    private class189 field165;

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "Lei;")
    private class189 field114;

    @OriginalMember(owner = "client!hba", name = "w", descriptor = "Lei;")
    private class189 field102;

    @OriginalMember(owner = "client!hba", name = "Bb", descriptor = "Lei;")
    private class189 field159;

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "Lqw;")
    private class82 field111;

    @OriginalMember(owner = "client!hba", name = "sc", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!hba", name = "wc", descriptor = "[I")
    private int[] field206;

    @OriginalMember(owner = "client!hba", name = "Zb", descriptor = "[I")
    private int[] field183;

    @OriginalMember(owner = "client!hba", name = "B", descriptor = "[I")
    private int[] field107;

    @OriginalMember(owner = "client!hba", name = "cb", descriptor = "[I")
    private int[] field134;

    @OriginalMember(owner = "client!hba", name = "mc", descriptor = "[S")
    private short[] field196;

    @OriginalMember(owner = "client!hba", name = "gb", descriptor = "[Loq;")
    private class378[] field138;

    @OriginalMember(owner = "client!hba", name = "xb", descriptor = "[Lgv;")
    private class88[] field155;

    @OriginalMember(owner = "client!hba", name = "ib", descriptor = "I")
    private int field140;

    @OriginalMember(owner = "client!hba", name = "xc", descriptor = "[Lwp;")
    private class191[] field207;

    @OriginalMember(owner = "client!hba", name = "mb", descriptor = "[Lrga;")
    private class251[] field144;

    @OriginalMember(owner = "client!hba", name = "Wb", descriptor = "[S")
    private short[] field180;

    @OriginalMember(owner = "client!hba", name = "cc", descriptor = "[F")
    private float[] field186;

    @OriginalMember(owner = "client!hba", name = "D", descriptor = "[S")
    private short[] field109;

    @OriginalMember(owner = "client!hba", name = "Cb", descriptor = "S")
    private short field160;

    @OriginalMember(owner = "client!hba", name = "U", descriptor = "[S")
    private short[] field126;

    @OriginalMember(owner = "client!hba", name = "zb", descriptor = "[S")
    private short[] field157;

    @OriginalMember(owner = "client!hba", name = "vb", descriptor = "S")
    private short field153;

    @OriginalMember(owner = "client!hba", name = "Vb", descriptor = "[S")
    private short[] field179;

    @OriginalMember(owner = "client!hba", name = "Jb", descriptor = "[B")
    private byte[] field167;

    @OriginalMember(owner = "client!hba", name = "wb", descriptor = "[S")
    private short[] field154;

    @OriginalMember(owner = "client!hba", name = "Yb", descriptor = "[F")
    private float[] field182;

    @OriginalMember(owner = "client!hba", name = "Q", descriptor = "[S")
    private short[] field122;

    @OriginalMember(owner = "client!hba", name = "W", descriptor = "[B")
    private byte[] field128;

    @OriginalMember(owner = "client!hba", name = "hc", descriptor = "[S")
    private short[] field191;

    @OriginalMember(owner = "client!hba", name = "R", descriptor = "[S")
    private short[] field123;

    @OriginalMember(owner = "client!hba", name = "kb", descriptor = "[S")
    private short[] field142;

    @OriginalMember(owner = "client!hba", name = "gc", descriptor = "[I")
    private int[] field190;

    @OriginalMember(owner = "client!hba", name = "V", descriptor = "[[I")
    private int[][] field127;

    @OriginalMember(owner = "client!hba", name = "Pb", descriptor = "[[I")
    private int[][] field173;

    @OriginalMember(owner = "client!hba", name = "Rb", descriptor = "[[I")
    private int[][] field175;

    @OriginalMember(owner = "client!hba", name = "N", descriptor = "B")
    private byte field119;

    @OriginalMember(owner = "client!hba", name = "u", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!hba", name = "x", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!hba", name = "E", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!hba", name = "J", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!hba", name = "L", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!hba", name = "M", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!hba", name = "O", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!hba", name = "T", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!hba", name = "X", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!hba", name = "ab", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!hba", name = "bb", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!hba", name = "db", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!hba", name = "eb", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!hba", name = "fb", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!hba", name = "hb", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!hba", name = "lb", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!hba", name = "ob", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!hba", name = "pb", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!hba", name = "qb", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!hba", name = "rb", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!hba", name = "sb", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!hba", name = "tb", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!hba", name = "ub", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!hba", name = "yb", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!hba", name = "Ab", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!hba", name = "Db", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!hba", name = "Fb", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!hba", name = "Gb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!hba", name = "Kb", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!hba", name = "Lb", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!hba", name = "Mb", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!hba", name = "Ob", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!hba", name = "Qb", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!hba", name = "Sb", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!hba", name = "Tb", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!hba", name = "Ub", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!hba", name = "ac", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!hba", name = "bc", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!hba", name = "dc", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!hba", name = "ec", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!hba", name = "ic", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!hba", name = "kc", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!hba", name = "lc", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!hba", name = "nc", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!hba", name = "qc", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!hba", name = "tc", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!hba", name = "uc", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!hba", name = "vc", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!hba", name = "yc", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!hba", name = "zc", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!hba", name = "Ac", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!hba", name = "Bc", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!hba", name = "m", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!hba", name = "q", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!hba", name = "S", descriptor = "Lkda;")
    private class408 field124;

    @OriginalMember(owner = "client!hba", name = "K", descriptor = "Laf;")
    private class458 field116;

    @OriginalMember(owner = "client!hba", name = "H", descriptor = "Lgda;")
    private class61 field113;

    @OriginalMember(owner = "client!hba", name = "A", descriptor = "S")
    private short field106;

    @OriginalMember(owner = "client!hba", name = "P", descriptor = "S")
    private short field121;

    @OriginalMember(owner = "client!hba", name = "jb", descriptor = "S")
    private short field141;

    @OriginalMember(owner = "client!hba", name = "Eb", descriptor = "S")
    private short field162;

    @OriginalMember(owner = "client!hba", name = "Ib", descriptor = "S")
    private short field166;

    @OriginalMember(owner = "client!hba", name = "fc", descriptor = "S")
    private short field189;

    @OriginalMember(owner = "client!hba", name = "pc", descriptor = "S")
    private short field199;

    @OriginalMember(owner = "client!hba", name = "t", descriptor = "S")
    private short field99;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V")
    private final void method63(byte arg0) {
        field164++;
        if (!this.field131) {
            return;
        }
        this.field131 = false;
        if (this.field155 == null && this.field138 == null && this.field207 == null && !class212.method1460(this.field91, 0, this.field202)) {
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            if (this.field134 != null && !class89.method669((byte) 86, this.field91, this.field202)) {
                if (this.field165 != null && this.field165.field2912 == null) {
                    this.field131 = true;
                } else {
                    if (!this.field130) {
                        this.method64(arg0 ^ 0xFFFFFFAD);
                    }
                    var2 = true;
                }
            }
            if (this.field183 != null && !class337.method2139((byte) 53, this.field202, this.field91)) {
                if (this.field165 != null && this.field165.field2912 == null) {
                    this.field131 = true;
                } else {
                    var3 = true;
                    if (!this.field130) {
                        this.method64(-83);
                    }
                }
            }
            if (this.field107 != null && !class214.method1473(this.field91, this.field202, arg0 - 37)) {
                if (this.field165 != null && this.field165.field2912 == null) {
                    this.field131 = true;
                } else {
                    var4 = true;
                    if (!this.field130) {
                        this.method64(arg0 ^ 0xFFFFFFA9);
                    }
                }
            }
            if (var2) {
                this.field134 = null;
            }
            if (var4) {
                this.field107 = null;
            }
            if (var3) {
                this.field183 = null;
            }
        }
        if (this.field157 != null && this.field134 == null && this.field183 == null && this.field107 == null) {
            this.field157 = null;
            this.field206 = null;
        }
        if (this.field128 != null && !class309.method1992(this.field202, this.field91, 55)) {
            if (this.field102 == null) {
                if (this.field159 != null && this.field159.field2912 == null) {
                    this.field131 = true;
                } else {
                    this.field128 = null;
                    this.field109 = this.field154 = this.field142 = null;
                }
            } else if (this.field102.field2912 == null) {
                this.field131 = true;
            } else {
                this.field128 = null;
                this.field109 = this.field154 = this.field142 = null;
            }
        }
        if (arg0 != 36) {
            return;
        }
        if (this.field122 != null && !class578.method3392(this.field202, this.field91, 25)) {
            if (this.field159 != null && this.field159.field2912 == null) {
                this.field131 = true;
            } else {
                this.field122 = null;
            }
        }
        if (this.field167 != null && !class632.method3620(this.field91, 0, this.field202)) {
            if (this.field159 != null && this.field159.field2912 == null) {
                this.field131 = true;
            } else {
                this.field167 = null;
            }
        }
        if (this.field186 != null && !class40.method305((byte) -128, this.field91, this.field202)) {
            if (this.field114 != null && this.field114.field2912 == null) {
                this.field131 = true;
            } else {
                this.field186 = this.field182 = null;
            }
        }
        if (this.field126 != null && !class733.method4096(arg0 ^ 0x45, this.field202, this.field91)) {
            if (this.field159 != null && this.field159.field2912 == null) {
                this.field131 = true;
            } else {
                this.field126 = null;
            }
        }
        if (this.field180 != null && !class629.method3603(false, this.field91, this.field202)) {
            if ((this.field111 == null || this.field111.field907 != null) && (this.field159 == null || this.field159.field2912 != null)) {
                this.field180 = this.field179 = this.field123 = null;
            } else {
                this.field131 = true;
            }
        }
        if (this.field175 != null && !class362.method2276((byte) -120, this.field91, this.field202)) {
            this.field191 = null;
            this.field175 = null;
        }
        if (this.field127 != null && !class297.method1931(this.field91, this.field202, 0)) {
            this.field196 = null;
            this.field127 = null;
        }
        if (this.field173 != null && !class248.method1635(this.field91, this.field202, (byte) -128)) {
            this.field173 = null;
        }
        if (this.field190 != null && (this.field91 & 0x800) == 0 && (this.field91 & 0x40000) == 0) {
            this.field190 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
    private final void method64(int arg0) {
        field203++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field171; var10++) {
            int var11 = this.field134[var10];
            int var12 = this.field183[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field107[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field99 = (short) var6;
        if (arg0 > -24) {
            this.field198 = null;
        }
        this.field162 = (short) var3;
        this.field199 = (short) var4;
        this.field166 = (short) var2;
        this.field106 = (short) var7;
        this.field121 = (short) var5;
        this.field189 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field141 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field130 = true;
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "()V")
    public final void method65() {
        field158++;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lqja;)V")
    public final void method66(class326 arg0) {
        field136++;
        class630 var2 = (class630) arg0;
        if (this.field155 != null) {
            for (int var3 = 0; var3 < this.field155.length; var3++) {
                class88 var4 = this.field155[var3];
                class88 var5 = var4;
                if (var4.field977 != null) {
                    var5 = var4.field977;
                }
                var5.field986 = (int) ((float) this.field107[var4.field979] * var2.field8826 + (float) this.field183[var4.field979] * var2.field8847 + (float) this.field134[var4.field979] * var2.field8825 + var2.field8835);
                var5.field974 = (int) ((float) this.field107[var4.field979] * var2.field8831 + (float) this.field183[var4.field979] * var2.field8852 + (float) this.field134[var4.field979] * var2.field8855 + var2.field8848);
                var5.field992 = (int) ((float) this.field107[var4.field979] * var2.field8850 + (float) this.field183[var4.field979] * var2.field8833 + (float) this.field134[var4.field979] * var2.field8853 + var2.field8824);
                var5.field985 = (int) ((float) this.field107[var4.field976] * var2.field8826 + (float) this.field183[var4.field976] * var2.field8847 + (float) this.field134[var4.field976] * var2.field8825 + var2.field8835);
                var5.field973 = (int) ((float) this.field107[var4.field976] * var2.field8831 + (float) this.field183[var4.field976] * var2.field8852 + (float) this.field134[var4.field976] * var2.field8855 + var2.field8848);
                var5.field988 = (int) ((float) this.field107[var4.field976] * var2.field8850 + (float) this.field183[var4.field976] * var2.field8833 + (float) this.field134[var4.field976] * var2.field8853 + var2.field8824);
                var5.field983 = (int) ((float) this.field107[var4.field989] * var2.field8826 + (float) this.field183[var4.field989] * var2.field8847 + (float) this.field134[var4.field989] * var2.field8825 + var2.field8835);
                var5.field982 = (int) ((float) this.field107[var4.field989] * var2.field8831 + (float) this.field183[var4.field989] * var2.field8852 + (float) this.field134[var4.field989] * var2.field8855 + var2.field8848);
                var5.field972 = (int) ((float) this.field107[var4.field989] * var2.field8850 + (float) this.field183[var4.field989] * var2.field8833 + (float) this.field134[var4.field989] * var2.field8853 + var2.field8824);
            }
        }
        if (this.field138 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field138.length; var6++) {
            class378 var7 = this.field138[var6];
            class378 var8 = var7;
            if (var7.field5213 != null) {
                var8 = var7.field5213;
            }
            if (var7.field5222 == null) {
                var7.field5222 = var2.method1872();
            } else {
                var7.field5222.method1884(var2);
            }
            var8.field5214 = (int) ((float) this.field107[var7.field5211] * var2.field8826 + (float) this.field183[var7.field5211] * var2.field8847 + (float) this.field134[var7.field5211] * var2.field8825 + var2.field8835);
            var8.field5216 = (int) ((float) this.field107[var7.field5211] * var2.field8831 + (float) this.field183[var7.field5211] * var2.field8852 + (float) this.field134[var7.field5211] * var2.field8855 + var2.field8848);
            var8.field5217 = (int) ((float) this.field107[var7.field5211] * var2.field8850 + (float) this.field183[var7.field5211] * var2.field8833 + (float) this.field134[var7.field5211] * var2.field8853 + var2.field8824);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method67(class496 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field188++;
        class10 var6 = (class10) arg0;
        if (this.field201 == 0 || var6.field201 == 0) {
            return;
        }
        int var7 = var6.field171;
        int[] var8 = var6.field134;
        int[] var9 = var6.field183;
        int[] var10 = var6.field107;
        short[] var11 = var6.field109;
        short[] var12 = var6.field154;
        short[] var13 = var6.field142;
        byte[] var14 = var6.field128;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field116 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var17 = this.field116.field6413;
            var18 = this.field116.field6412;
            var15 = this.field116.field6409;
            var16 = this.field116.field6407;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field116 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field116.field6412;
            var19 = var6.field116.field6409;
            var20 = var6.field116.field6413;
            var22 = var6.field116.field6407;
        }
        int[] var23 = var6.field206;
        short[] var24 = var6.field157;
        if (!var6.field130) {
            var6.method64(-65);
        }
        short var25 = var6.field162;
        short var26 = var6.field99;
        short var27 = var6.field166;
        short var28 = var6.field121;
        short var29 = var6.field199;
        short var30 = var6.field106;
        for (int var31 = 0; var31 < this.field171; var31++) {
            int var32 = this.field183[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field134[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field107[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field206[var31];
                        int var37 = this.field206[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field157[var38] - 1;
                            if (var35 == -1 || this.field128[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39 + 1];
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var41; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var16 == null) {
                                            this.field116 = new class458();
                                            var16 = this.field116.field6407 = class56.method389(1, this.field109);
                                            var15 = this.field116.field6409 = class56.method389(1, this.field154);
                                            var18 = this.field116.field6412 = class56.method389(1, this.field142);
                                            var17 = this.field116.field6413 = class466.method2787(true, this.field128);
                                        }
                                        if (var22 == null) {
                                            class458 var44 = var6.field116 = new class458();
                                            var22 = var44.field6407 = class56.method389(1, var11);
                                            var19 = var44.field6409 = class56.method389(1, var12);
                                            var21 = var44.field6412 = class56.method389(1, var13);
                                            var20 = var44.field6413 = class466.method2787(true, var14);
                                        }
                                        short var45 = this.field109[var35];
                                        short var46 = this.field154[var35];
                                        short var47 = this.field142[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field128[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var20[var52] += var50;
                                            }
                                        }
                                        short var53 = var13[var40];
                                        short var54 = var11[var40];
                                        int var55 = this.field206[var31];
                                        byte var56 = var14[var40];
                                        short var57 = var12[var40];
                                        int var58 = this.field206[var31 + 1];
                                        for (int var59 = var55; var59 < var58; var59++) {
                                            int var60 = this.field157[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var54;
                                                var15[var60] += var57;
                                                var18[var60] += var53;
                                                var17[var60] += var56;
                                            }
                                        }
                                        if (this.field102 == null && this.field159 != null) {
                                            this.field159.field2912 = null;
                                        }
                                        if (this.field102 != null) {
                                            this.field102.field2912 = null;
                                        }
                                        if (var6.field102 == null && var6.field159 != null) {
                                            var6.field159.field2912 = null;
                                        }
                                        if (var6.field102 != null) {
                                            var6.field102.field2912 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "ua", descriptor = "()I")
    public final int method68() {
        field92++;
        return this.field91;
    }

    @OriginalMember(owner = "client!hba", name = "RA", descriptor = "()I")
    public final int method69() {
        field161++;
        if (!this.field130) {
            this.method64(-33);
        }
        return this.field121;
    }

    @OriginalMember(owner = "client!hba", name = "ba", descriptor = "(Lr;)Lr;")
    public final class194 method70(class194 arg0) {
        field139++;
        if (this.field112 == 0) {
            return null;
        }
        if (!this.field130) {
            this.method64(-89);
        }
        int var2;
        int var3;
        if (this.field198.field1569 > 0) {
            var2 = this.field166 - (this.field198.field1569 * this.field99 >> 8) >> this.field198.field1439;
            var3 = this.field121 - (this.field198.field1569 * this.field162 >> 8) >> this.field198.field1439;
        } else {
            var2 = this.field166 - (this.field198.field1569 * this.field162 >> 8) >> this.field198.field1439;
            var3 = this.field121 - (this.field198.field1569 * this.field99 >> 8) >> this.field198.field1439;
        }
        int var4;
        int var5;
        if (this.field198.field1498 > 0) {
            var4 = this.field199 - (this.field198.field1498 * this.field99 >> 8) >> this.field198.field1439;
            var5 = this.field106 - (this.field198.field1498 * this.field162 >> 8) >> this.field198.field1439;
        } else {
            var4 = this.field199 - (this.field198.field1498 * this.field162 >> 8) >> this.field198.field1439;
            var5 = this.field106 - (this.field198.field1498 * this.field99 >> 8) >> this.field198.field1439;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class45 var8 = (class45) arg0;
        class45 var9;
        if (var8 != null && var8.method331(var7, var6, -64)) {
            var9 = var8;
            var8.method328((byte) -92);
        } else {
            var9 = new class45(this.field198, var6, var7);
        }
        var9.method330(-102, var5, var2, var4, var3);
        this.method80(var9, -1242681112);
        return var9;
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
    private final void method71(int arg0) {
        field208++;
        if (this.field207 != null) {
            class630 var2 = this.field198.field1434;
            this.field198.method823(arg0 ^ 0x6350);
            this.field198.method544(!this.field145);
            this.field198.method756(false, 93);
            this.field198.method754(null, this.field198.field1555, 125, this.field198.field1554, null);
            for (int var3 = 0; var3 < this.field140; var3++) {
                class191 var4 = this.field207[var3];
                class251 var5 = this.field144[var3];
                if (!var4.field2954 || !this.field198.method451()) {
                    float var6 = (float) (this.field134[var4.field2956] + this.field134[var4.field2950] + this.field134[var4.field2947]) * 0.3333333F;
                    float var7 = (float) (this.field183[var4.field2956] + this.field183[var4.field2947] + this.field183[var4.field2950]) * 0.3333333F;
                    float var8 = (float) (this.field107[var4.field2947] - (-this.field107[var4.field2956] - this.field107[var4.field2950])) * 0.3333333F;
                    float var9 = class290.field4246 * var8 + class567.field8025 * var6 + class284.field4197 * var7 + class504.field7152;
                    float var10 = class94.field1062 * var8 + class588.field8299 * var6 + class189.field2911 * var7 + class624.field8749;
                    float var11 = class705.field9827 * var8 + class87.field969 * var6 + class343.field4780 * var7 + class350.field4897;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field2958;
                    var2.method3610((byte) -106, var4.field2955 * var5.field3709 >> 7, (float) var5.field3702 + var9 - (var9 * var12), var11 * var12 + -var11, var10 * var12 + ((float) var5.field3708 - var10), var5.field3704, var4.field2953 * var5.field3706 >> 7);
                    this.field198.method744(arg0 ^ 0x632A, var2);
                    int var13 = var5.field3711;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field198.method747(var4.field2948, arg0 ^ 0x8049C5F2);
                    this.field198.method800(var4.field2952, 28276);
                    this.field198.method775((byte) -57, 0, 7, 4);
                }
            }
            this.field198.method544(true);
            this.field198.method765(arg0 - 15689);
        }
        if (arg0 != 25386) {
            this.field181 = 38;
        }
    }

    @OriginalMember(owner = "client!hba", name = "r", descriptor = "()Z")
    public final boolean method72() {
        field210++;
        return this.field104;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "()Z")
    public final boolean method73() {
        field117++;
        if (this.field126 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field126.length; var1++) {
            if (this.field126[var1] != -1 && !this.field198.field774.method1212(118, this.field126[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hba", name = "VA", descriptor = "(I)V")
    public final void method74(int arg0) {
        field125++;
        int var2 = class376.field5186[arg0];
        int var3 = class376.field5188[arg0];
        for (int var4 = 0; var4 < this.field171; var4++) {
            int var5 = this.field183[var4] * var2 + this.field134[var4] * var3 >> 14;
            this.field183[var4] = this.field183[var4] * var3 - (this.field134[var4] * var2) >> 14;
            this.field134[var4] = var5;
        }
        this.field130 = false;
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "ma", descriptor = "()I")
    public final int method75() {
        field115++;
        if (!this.field130) {
            this.method64(-72);
        }
        return this.field141;
    }

    @OriginalMember(owner = "client!hba", name = "P", descriptor = "(IIII)V")
    public final void method76(int arg0, int arg1, int arg2, int arg3) {
        field93++;
        if (arg0 == 0) {
            class81.field899 = 0;
            class89.field1004 = 0;
            int var5 = 0;
            class150.field2151 = 0;
            for (int var6 = 0; var6 < this.field171; var6++) {
                class150.field2151 += this.field134[var6];
                class81.field899 += this.field183[var6];
                class89.field1004 += this.field107[var6];
                var5++;
            }
            if (var5 <= 0) {
                class81.field899 = arg2;
                class89.field1004 = arg3;
                class150.field2151 = arg1;
            } else {
                class89.field1004 = class89.field1004 / var5 + arg3;
                class150.field2151 = class150.field2151 / var5 + arg1;
                class81.field899 = class81.field899 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field171; var7++) {
                this.field134[var7] += arg1;
                this.field183[var7] += arg2;
                this.field107[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field171; var8++) {
                this.field134[var8] -= class150.field2151;
                this.field183[var8] -= class81.field899;
                this.field107[var8] -= class89.field1004;
                if (arg3 != 0) {
                    int var9 = class376.field5186[arg3];
                    int var10 = class376.field5188[arg3];
                    int var11 = this.field134[var8] * var10 + this.field183[var8] * var9 + 16383 >> 14;
                    this.field183[var8] = this.field183[var8] * var10 + 16383 - (this.field134[var8] * var9) >> 14;
                    this.field134[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class376.field5186[arg1];
                    int var13 = class376.field5188[arg1];
                    int var14 = this.field183[var8] * var13 + 16383 - (this.field107[var8] * var12) >> 14;
                    this.field107[var8] = this.field183[var8] * var12 + this.field107[var8] * var13 + 16383 >> 14;
                    this.field183[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class376.field5186[arg2];
                    int var16 = class376.field5188[arg2];
                    int var17 = this.field134[var8] * var16 + this.field107[var8] * var15 + 16383 >> 14;
                    this.field107[var8] = this.field107[var8] * var16 + 16383 - (this.field134[var8] * var15) >> 14;
                    this.field134[var8] = var17;
                }
                this.field134[var8] += class150.field2151;
                this.field183[var8] += class81.field899;
                this.field107[var8] += class89.field1004;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field171; var18++) {
                this.field134[var18] -= class150.field2151;
                this.field183[var18] -= class81.field899;
                this.field107[var18] -= class89.field1004;
                this.field134[var18] = this.field134[var18] * arg1 / 128;
                this.field183[var18] = this.field183[var18] * arg2 / 128;
                this.field107[var18] = this.field107[var18] * arg3 / 128;
                this.field134[var18] += class150.field2151;
                this.field183[var18] += class81.field899;
                this.field107[var18] += class89.field1004;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field201; var19++) {
                int var23 = (this.field167[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field167[var19] = (byte) var23;
            }
            if (this.field159 != null) {
                this.field159.field2912 = null;
            }
            if (this.field207 != null) {
                for (int var20 = 0; var20 < this.field140; var20++) {
                    class191 var21 = this.field207[var20];
                    class251 var22 = this.field144[var20];
                    var22.field3711 = 255 - (this.field167[var21.field2951] & 0xFF) << 24 | var22.field3711 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field201; var24++) {
                int var28 = this.field122[var24] & 0xFFFF;
                int var29 = (var28 & 0xFCD4) >> 10;
                int var30 = (var28 & 0x3A0) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field122[var24] = (short) class746.method4158(class746.method4158(var32 << 7, var31 << 10), var34);
            }
            if (this.field159 != null) {
                this.field159.field2912 = null;
            }
            if (this.field207 != null) {
                for (int var25 = 0; var25 < this.field140; var25++) {
                    class191 var26 = this.field207[var25];
                    class251 var27 = this.field144[var25];
                    var27.field3711 = class779.field10694[this.field122[var26.field2951] & 0xFFFF] & 0xFFFFFF | var27.field3711 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field140; var35++) {
                class251 var36 = this.field144[var35];
                var36.field3702 += arg1;
                var36.field3708 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field140; var37++) {
                class251 var38 = this.field144[var37];
                var38.field3706 = var38.field3706 * arg2 >> 7;
                var38.field3709 = var38.field3709 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field140; var39++) {
                class251 var40 = this.field144[var39];
                var40.field3704 = var40.field3704 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IILqja;ZII)Z")
    public final boolean method77(int arg0, int arg1, class326 arg2, boolean arg3, int arg4, int arg5) {
        field118++;
        return this.method117(arg1, arg3, arg0, arg2, -98, arg5, arg4);
    }

    @OriginalMember(owner = "client!hba", name = "FA", descriptor = "(I)V")
    public final void method78(int arg0) {
        field143++;
        int var2 = class376.field5186[arg0];
        int var3 = class376.field5188[arg0];
        for (int var4 = 0; var4 < this.field171; var4++) {
            int var5 = this.field183[var4] * var3 - this.field107[var4] * var2 >> 14;
            this.field107[var4] = this.field183[var4] * var2 + this.field107[var4] * var3 >> 14;
            this.field183[var4] = var5;
        }
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
        this.field130 = false;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field94++;
        if (arg2 > arg1 && arg7 > arg1 && arg1 < arg8) {
            return false;
        } else if (arg2 < arg1 && arg7 < arg1 && arg8 < arg1) {
            return false;
        } else if (arg4 < arg3 && arg6 > arg4 && arg5 > arg4) {
            return false;
        } else {
            if (arg0 > -85) {
                this.field109 = null;
            }
            return arg4 <= arg3 || arg6 >= arg4 || arg5 >= arg4;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lvba;I)V")
    private final void method80(class45 arg0, int arg1) {
        if (arg1 != -1242681112) {
            this.method88(null, null, 8);
        }
        field200++;
        if (this.field198.field1586.length < this.field112) {
            this.field198.field1588 = new int[this.field112];
            this.field198.field1586 = new int[this.field112];
        }
        int[] var3 = this.field198.field1586;
        int[] var4 = this.field198.field1588;
        for (int var5 = 0; var5 < this.field171; var5++) {
            int var16 = (this.field134[var5] - (this.field183[var5] * this.field198.field1569 >> 8) >> this.field198.field1439) - arg0.field564;
            int var17 = (this.field107[var5] - (this.field183[var5] * this.field198.field1498 >> 8) >> this.field198.field1439) - arg0.field562;
            int var18 = this.field206[var5];
            int var19 = this.field206[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field157[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field193; var6++) {
            if (this.field167 == null || this.field167[var6] <= 128) {
                short var7 = this.field180[var6];
                short var8 = this.field179[var6];
                short var9 = this.field123[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg0.method329(var10, 1770388016, var13, var12, var15, var14, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "aa", descriptor = "(SS)V")
    public final void method81(short arg0, short arg1) {
        field211++;
        class160 var3 = this.field198.field774;
        for (int var4 = 0; var4 < this.field201; var4++) {
            if (this.field126[var4] == arg0) {
                this.field126[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class467 var7 = var3.method1208((byte) 47, arg0 & 0xFFFF);
            var6 = var7.field6579;
            var5 = var7.field6582;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class467 var10 = var3.method1208((byte) 47, arg1 & 0xFFFF);
            if (var10.field6577 != 0 || var10.field6569 != 0) {
                this.field104 = true;
            }
            var9 = var10.field6579;
            var8 = var10.field6582;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field207 != null) {
            for (int var11 = 0; var11 < this.field140; var11++) {
                class191 var12 = this.field207[var11];
                class251 var13 = this.field144[var11];
                var13.field3711 = var13.field3711 & 0xFF000000 | class779.field10694[this.field122[var12.field2951] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field159 != null) {
            this.field159.field2912 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method82(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field197++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class150.field2151 = 0;
            class81.field899 = 0;
            class89.field1004 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field127.length > var14) {
                    int[] var15 = this.field127[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class150.field2151 += this.field134[var17];
                        class81.field899 += this.field183[var17];
                        var12++;
                        class89.field1004 += this.field107[var17];
                    }
                }
            }
            if (var12 > 0) {
                class150.field2151 = class150.field2151 / var12 + var11;
                class81.field899 = class81.field899 / var12 + var9;
                class89.field1004 = class89.field1004 / var12 + var10;
            } else {
                class81.field899 = var9;
                class150.field2151 = var11;
                class89.field1004 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field127.length) {
                    int[] var23 = this.field127[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field134[var25] += var18;
                        this.field183[var25] += var19;
                        this.field107[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field127.length) {
                    int[] var46 = this.field127[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field134[var48] -= class150.field2151;
                            this.field183[var48] -= class81.field899;
                            this.field107[var48] -= class89.field1004;
                            if (arg4 != 0) {
                                int var49 = class376.field5186[arg4];
                                int var50 = class376.field5188[arg4];
                                int var51 = this.field183[var48] * var49 - (-(this.field134[var48] * var50) - 16383) >> 14;
                                this.field183[var48] = this.field183[var48] * var50 + 16383 - (this.field134[var48] * var49) >> 14;
                                this.field134[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class376.field5186[arg2];
                                int var53 = class376.field5188[arg2];
                                int var54 = this.field183[var48] * var53 + 16383 - this.field107[var48] * var52 >> 14;
                                this.field107[var48] = this.field183[var48] * var52 + this.field107[var48] * var53 + 16383 >> 14;
                                this.field183[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class376.field5186[arg3];
                                int var56 = class376.field5188[arg3];
                                int var57 = this.field134[var48] * var56 + this.field107[var48] * var55 + 16383 >> 14;
                                this.field107[var48] = this.field107[var48] * var56 + 16383 - (this.field134[var48] * var55) >> 14;
                                this.field134[var48] = var57;
                            }
                            this.field134[var48] += class150.field2151;
                            this.field183[var48] += class81.field899;
                            this.field107[var48] += class89.field1004;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field134[var59] -= class150.field2151;
                            this.field183[var59] -= class81.field899;
                            this.field107[var59] -= class89.field1004;
                            if (arg2 != 0) {
                                int var60 = class376.field5186[arg2];
                                int var61 = class376.field5188[arg2];
                                int var62 = this.field183[var59] * var61 + 16383 - (this.field107[var59] * var60) >> 14;
                                this.field107[var59] = this.field183[var59] * var60 + this.field107[var59] * var61 + 16383 >> 14;
                                this.field183[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class376.field5186[arg4];
                                int var64 = class376.field5188[arg4];
                                int var65 = this.field183[var59] * var63 + this.field134[var59] * var64 + 16383 >> 14;
                                this.field183[var59] = this.field183[var59] * var64 + 16383 - this.field134[var59] * var63 >> 14;
                                this.field134[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class376.field5186[arg3];
                                int var67 = class376.field5188[arg3];
                                int var68 = this.field107[var59] * var66 + this.field134[var59] * var67 + 16383 >> 14;
                                this.field107[var59] = this.field107[var59] * var67 - (this.field134[var59] * var66 - 16383) >> 14;
                                this.field134[var59] = var68;
                            }
                            this.field134[var59] += class150.field2151;
                            this.field183[var59] += class81.field899;
                            this.field107[var59] += class89.field1004;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field127.length > var28) {
                        int[] var29 = this.field127[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field206[var31];
                            int var33 = this.field206[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field157[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class376.field5186[arg4];
                                    int var37 = class376.field5188[arg4];
                                    int var38 = this.field154[var35] * var36 - (-(this.field109[var35] * var37) - 16383) >> 14;
                                    this.field154[var35] = (short) (this.field154[var35] * var37 + 16383 - (this.field109[var35] * var36) >> 14);
                                    this.field109[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class376.field5186[arg2];
                                    int var40 = class376.field5188[arg2];
                                    int var41 = this.field154[var35] * var40 + 16383 - (this.field142[var35] * var39) >> 14;
                                    this.field142[var35] = (short) (this.field154[var35] * var39 + this.field142[var35] * var40 + 16383 >> 14);
                                    this.field154[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class376.field5186[arg3];
                                    int var43 = class376.field5188[arg3];
                                    int var44 = this.field109[var35] * var43 + this.field142[var35] * var42 + 16383 >> 14;
                                    this.field142[var35] = (short) (this.field142[var35] * var43 + (16383 - (this.field109[var35] * var42)) >> 14);
                                    this.field109[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field102 == null && this.field159 != null) {
                    this.field159.field2912 = null;
                }
                if (this.field102 != null) {
                    this.field102.field2912 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field127.length) {
                    int[] var71 = this.field127[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field134[var73] -= class150.field2151;
                        this.field183[var73] -= class81.field899;
                        this.field107[var73] -= class89.field1004;
                        this.field134[var73] = this.field134[var73] * arg2 >> 7;
                        this.field183[var73] = this.field183[var73] * arg3 >> 7;
                        this.field107[var73] = this.field107[var73] * arg4 >> 7;
                        this.field134[var73] += class150.field2151;
                        this.field183[var73] += class81.field899;
                        this.field107[var73] += class89.field1004;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field175 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field175.length > var78) {
                        int[] var79 = this.field175[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field167[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field167[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field159 != null) {
                            this.field159.field2912 = null;
                        }
                    }
                }
                if (this.field207 != null) {
                    for (int var75 = 0; var75 < this.field140; var75++) {
                        class191 var76 = this.field207[var75];
                        class251 var77 = this.field144[var75];
                        var77.field3711 = 255 - (this.field167[var76.field2951] & 0xFF) << 24 | var77.field3711 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field175 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field175.length > var87) {
                        int[] var88 = this.field175[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field122[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFDE1) >> 10;
                            int var93 = (var91 & 0x3C6) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var91 & 0x7F;
                            int var96 = arg2 + var92 & 0x3F;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            int var97 = arg4 + var95;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field122[var90] = (short) class746.method4158(class746.method4158(var94 << 7, var96 << 10), var97);
                        }
                        if (var88.length > 0 && this.field159 != null) {
                            this.field159.field2912 = null;
                        }
                    }
                }
                if (this.field207 != null) {
                    for (int var84 = 0; var84 < this.field140; var84++) {
                        class191 var85 = this.field207[var84];
                        class251 var86 = this.field144[var84];
                        var86.field3711 = class779.field10694[this.field122[var85.field2951] & 0xFFFF] & 0xFFFFFF | var86.field3711 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field173 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field173.length > var99) {
                        int[] var100 = this.field173[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class251 var102 = this.field144[var100[var101]];
                            var102.field3708 += arg3;
                            var102.field3702 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field173 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field173.length > var104) {
                        int[] var105 = this.field173[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class251 var107 = this.field144[var105[var106]];
                            var107.field3706 = var107.field3706 * arg3 >> 7;
                            var107.field3709 = var107.field3709 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field173 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field173.length > var109) {
                    int[] var110 = this.field173[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class251 var112 = this.field144[var110[var111]];
                        var112.field3704 = var112.field3704 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IFIIFIIIJLdba;)S")
    private final short method83(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, long arg8, class100 arg9) {
        field177++;
        int var12 = this.field206[arg7];
        int var13 = this.field206[arg6 + arg7];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field157[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class345.field4812[var15] == arg8) {
                return (short) (var16 - 1);
            }
        }
        this.field157[var14] = (short) (this.field112 + 1);
        class345.field4812[var14] = arg8;
        this.field109[this.field112] = (short) arg3;
        this.field154[this.field112] = (short) arg2;
        this.field142[this.field112] = (short) arg0;
        this.field128[this.field112] = (byte) arg5;
        this.field186[this.field112] = arg4;
        this.field182[this.field112] = arg1;
        return (short) (this.field112++);
    }

    @OriginalMember(owner = "client!hba", name = "O", descriptor = "(III)V")
    public final void method84(int arg0, int arg1, int arg2) {
        field150++;
        for (int var4 = 0; var4 < this.field171; var4++) {
            if (arg0 != 128) {
                this.field134[var4] = this.field134[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field183[var4] = this.field183[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field107[var4] = this.field107[var4] * arg2 >> 7;
            }
        }
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
        this.field130 = false;
    }

    @OriginalMember(owner = "client!hba", name = "LA", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (this.field159 != null) {
            this.field159.field2912 = null;
        }
        this.field153 = (short) arg0;
        field120++;
        if (this.field102 != null) {
            this.field102.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BZ)V")
    private final void method86(byte arg0, boolean arg1) {
        if (arg0 < 56) {
            return;
        }
        field110++;
        boolean var3 = this.field159 != null && this.field159.field2912 == null;
        boolean var4 = this.field102 != null && this.field102.field2912 == null;
        boolean var5 = this.field165 != null && this.field165.field2912 == null;
        boolean var6 = this.field114 != null && this.field114.field2912 == null;
        if (arg1) {
            var6 &= (this.field119 & 0x8) != 0;
            var3 &= (this.field119 & 0x2) != 0;
            var5 &= (this.field119 & 0x1) != 0;
            var4 &= (this.field119 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field198.field1485.field7050.length >= this.field112 * var7) {
            this.field198.field1485.field7042 = 0;
        } else {
            this.field198.field1485 = new class538((this.field112 + 100) * var7);
        }
        class538 var12 = this.field198.field1485;
        if (var5) {
            if (this.field198.field1514) {
                for (int var21 = 0; var21 < this.field171; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field134[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field183[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field107[var21]);
                    int var25 = this.field206[var21];
                    int var26 = this.field206[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field157[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field7042 = var7 * var28;
                        var12.method2959(var22, (byte) -69);
                        var12.method2959(var23, (byte) -128);
                        var12.method2959(var24, (byte) -67);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field171; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field134[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field183[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field107[var13]);
                    int var17 = this.field206[var13];
                    int var18 = this.field206[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field157[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field7042 = var7 * var20;
                        var12.method2977(2, var14);
                        var12.method2977(2, var15);
                        var12.method2977(2, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field102 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field116 == null) {
                    var32 = this.field142;
                    var31 = this.field154;
                    var29 = this.field128;
                    var30 = this.field109;
                } else {
                    var29 = this.field116.field6413;
                    var30 = this.field116.field6407;
                    var31 = this.field116.field6409;
                    var32 = this.field116.field6412;
                }
                float var33 = this.field198.field1542[0];
                float var34 = this.field198.field1542[1];
                float var35 = this.field198.field1542[2];
                float var36 = this.field198.field1543;
                float var37 = this.field198.field1558 * 768.0F / (float) this.field153;
                float var38 = this.field198.field1535 * 768.0F / (float) this.field153;
                for (int var39 = 0; var39 < this.field201; var39++) {
                    int var40 = this.method104(this.field167[var39], 119, this.field122[var39], this.field160, this.field126[var39]);
                    float var41 = (float) (var40 >>> 24) * this.field198.field1536;
                    short var42 = this.field180[var39];
                    float var43 = (float) ((var40 & 0xFF95) >> 8) * this.field198.field1482;
                    float var44 = (float) ((var40 & 0xFF660B) >> 16) * this.field198.field1573;
                    short var45 = (short) var29[var42];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var32[var42] * var35 + (float) var30[var42] * var33 + (float) var31[var42] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var32[var42] * var35 + (float) var30[var42] * var33 + (float) var31[var42] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + var46 * (var46 < 0.0F ? var38 : var37);
                    int var48 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var44 * var47);
                    int var50 = (int) (var43 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field7042 = var9 + (var7 * var42);
                    var12.method2952(0, var48);
                    var12.method2952(0, var49);
                    var12.method2952(0, var50);
                    var12.method2952(0, 255 - (this.field167[var39] & 0xFF));
                    short var51 = this.field179[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var33 + (float) var31[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var33 + (float) var31[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = (var53 < 0.0F ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var41 * var54);
                    int var56 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var43 * var54);
                    var12.field7042 = var9 + (var7 * var51);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method2952(0, var55);
                    var12.method2952(0, var56);
                    var12.method2952(0, var57);
                    var12.method2952(0, 255 - (this.field167[var39] & 0xFF));
                    short var58 = this.field123[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var33 + (float) var31[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var33 + (float) var31[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = ((var60 < 0.0F) ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var44 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var43 * var61);
                    var12.field7042 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method2952(0, var62);
                    var12.method2952(0, var63);
                    var12.method2952(0, var64);
                    var12.method2952(0, 255 - (this.field167[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field201; var65++) {
                    int var66 = this.method104(this.field167[var65], 101, this.field122[var65], this.field160, this.field126[var65]);
                    var12.field7042 = this.field180[var65] * var7 + var9;
                    var12.method2959(var66, (byte) -86);
                    var12.field7042 = this.field179[var65] * var7 + var9;
                    var12.method2959(var66, (byte) -79);
                    var12.field7042 = var9 + (this.field123[var65] * var7);
                    var12.method2959(var66, (byte) -125);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field116 == null) {
                var67 = this.field128;
                var68 = this.field154;
                var69 = this.field109;
                var70 = this.field142;
            } else {
                var70 = this.field116.field6412;
                var67 = this.field116.field6413;
                var68 = this.field116.field6409;
                var69 = this.field116.field6407;
            }
            float var71 = 3.0F / (float) this.field153;
            float var72 = 3.0F / (float) (this.field153 / 2 + this.field153);
            var12.field7042 = var10;
            if (this.field198.field1514) {
                for (int var76 = 0; var76 < this.field112; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3229((float) var69[var76] * var72, (byte) 54);
                        var12.method3229((float) var68[var76] * var72, (byte) 113);
                        var12.method3229((float) var70[var76] * var72, (byte) 121);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3229((float) var69[var76] * var78, (byte) 98);
                        var12.method3229((float) var68[var76] * var78, (byte) 91);
                        var12.method3229((float) var70[var76] * var78, (byte) 68);
                    }
                    var12.field7042 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field112; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3232((float) var69[var73] * var72, true);
                        var12.method3232((float) var68[var73] * var72, true);
                        var12.method3232((float) var70[var73] * var72, true);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3232((float) var69[var73] * var75, true);
                        var12.method3232((float) var68[var73] * var75, true);
                        var12.method3232((float) var70[var73] * var75, true);
                    }
                    var12.field7042 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field7042 = var11;
            if (this.field198.field1514) {
                for (int var79 = 0; var79 < this.field112; var79++) {
                    var12.method3229(this.field186[var79], (byte) 75);
                    var12.method3229(this.field182[var79], (byte) 52);
                    var12.field7042 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field112; var80++) {
                    var12.method3232(this.field186[var80], true);
                    var12.method3232(this.field182[var80], true);
                    var12.field7042 += var7 - 8;
                }
            }
        }
        var12.field7042 = this.field112 * var7;
        class61 var81;
        if (arg1) {
            if (this.field113 == null) {
                this.field113 = this.field198.method794(var7, true, 0, var12.field7050, var12.field7042);
            } else {
                this.field113.method410(var12.field7042, -9859, var7, var12.field7050);
            }
            this.field119 = 0;
            var81 = this.field113;
        } else {
            var81 = this.field198.method794(var7, false, 0, var12.field7050, var12.field7042);
            this.field131 = true;
        }
        if (var5) {
            this.field165.field2912 = var81;
            this.field165.field2918 = var8;
        }
        if (var6) {
            this.field114.field2918 = var11;
            this.field114.field2912 = var81;
        }
        if (var3) {
            this.field159.field2912 = var81;
            this.field159.field2918 = var9;
        }
        if (var4) {
            this.field102.field2912 = var81;
            this.field102.field2918 = var10;
        }
    }

    @OriginalMember(owner = "client!hba", name = "C", descriptor = "(I)V")
    public final void method87(int arg0) {
        field209++;
        this.field160 = (short) arg0;
        if (this.field159 != null) {
            this.field159.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lqja;Lag;I)V")
    public final void method88(class326 arg0, class711 arg1, int arg2) {
        field132++;
        if (this.field112 == 0) {
            return;
        }
        class630 var4 = this.field198.field1468;
        class630 var5 = (class630) arg0;
        if (!this.field130) {
            this.method64(-43);
        }
        class350.field4897 = var4.field8850 * var5.field8824 + var4.field8853 * var5.field8835 + var4.field8833 * var5.field8848 + var4.field8824;
        class343.field4780 = var4.field8850 * var5.field8833 + var4.field8853 * var5.field8847 + var4.field8833 * var5.field8852;
        float var6 = (float) this.field162 * class343.field4780 + class350.field4897;
        float var7 = (float) this.field99 * class343.field4780 + class350.field4897;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field189 + var6;
            var9 = var7 - (float) this.field189;
        } else {
            var8 = (float) this.field189 + var7;
            var9 = var6 - (float) this.field189;
        }
        if ((this.field198.field1493 <= var9) || (var8 <= (float) this.field198.field1491)) {
            return;
        }
        class504.field7152 = var4.field8826 * var5.field8824 + var4.field8847 * var5.field8848 + var4.field8825 * var5.field8835 + var4.field8835;
        class284.field4197 = var4.field8826 * var5.field8833 + var4.field8847 * var5.field8852 + var4.field8825 * var5.field8847;
        float var10 = (float) this.field162 * class284.field4197 + class504.field7152;
        float var11 = (float) this.field99 * class284.field4197 + class504.field7152;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var13 = ((float) this.field189 + var10) * (float) this.field198.field1504;
            var12 = ((float) (-this.field189) + var11) * (float) this.field198.field1504;
        } else {
            var12 = ((float) (-this.field189) + var10) * (float) this.field198.field1504;
            var13 = ((float) this.field189 + var11) * (float) this.field198.field1504;
        }
        if ((this.field198.field1527 <= var12 / var8) || (this.field198.field1509 >= var13 / var8)) {
            return;
        }
        class189.field2911 = var4.field8831 * var5.field8833 + var4.field8855 * var5.field8847 + var4.field8852 * var5.field8852;
        class624.field8749 = var4.field8831 * var5.field8824 + var4.field8855 * var5.field8835 + var4.field8852 * var5.field8848 + var4.field8848;
        float var14 = (float) this.field162 * class189.field2911 + class624.field8749;
        float var15 = (float) this.field99 * class189.field2911 + class624.field8749;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = ((float) this.field189 + var14) * (float) this.field198.field1548;
            var17 = ((float) (-this.field189) + var15) * (float) this.field198.field1548;
        } else {
            var16 = ((float) this.field189 + var15) * (float) this.field198.field1548;
            var17 = ((float) (-this.field189) + var14) * (float) this.field198.field1548;
        }
        if ((this.field198.field1487 <= var17 / var8) || (var16 / var8 <= this.field198.field1484)) {
            return;
        }
        if (arg1 != null || this.field207 != null) {
            class94.field1062 = var4.field8831 * var5.field8850 + var4.field8855 * var5.field8826 + var4.field8852 * var5.field8831;
            class705.field9827 = var4.field8850 * var5.field8850 + var4.field8853 * var5.field8826 + var4.field8833 * var5.field8831;
            class87.field969 = var4.field8850 * var5.field8853 + var4.field8853 * var5.field8825 + var4.field8833 * var5.field8855;
            class588.field8299 = var4.field8831 * var5.field8853 + var4.field8855 * var5.field8825 + var4.field8852 * var5.field8855;
            class567.field8025 = var4.field8826 * var5.field8853 + var4.field8847 * var5.field8855 + var4.field8825 * var5.field8825;
            class290.field4246 = var4.field8826 * var5.field8850 + var4.field8847 * var5.field8831 + var4.field8825 * var5.field8826;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field166 + this.field121 >> 1;
            int var21 = this.field199 + this.field106 >> 1;
            int var22 = (int) ((float) var21 * class290.field4246 + (float) this.field162 * class284.field4197 + (float) var20 * class567.field8025 + class504.field7152);
            int var23 = (int) ((float) var21 * class94.field1062 + (float) this.field162 * class189.field2911 + (float) var20 * class588.field8299 + class624.field8749);
            int var24 = (int) ((float) var21 * class705.field9827 + (float) this.field162 * class343.field4780 + (float) var20 * class87.field969 + class350.field4897);
            if (var24 < this.field198.field1491) {
                var18 = true;
            } else {
                arg1.field9876 = this.field198.field1548 * var23 / var24 + this.field198.field1480;
                arg1.field9872 = this.field198.field1504 * var22 / var24 + this.field198.field1568;
            }
            int var25 = (int) ((float) var21 * class290.field4246 + (float) this.field99 * class284.field4197 + (float) var20 * class567.field8025 + class504.field7152);
            int var26 = (int) ((float) var21 * class94.field1062 + (float) this.field99 * class189.field2911 + (float) var20 * class588.field8299 + class624.field8749);
            int var27 = (int) ((float) var21 * class705.field9827 + (float) this.field99 * class343.field4780 + (float) var20 * class87.field969 + class350.field4897);
            if (var27 >= this.field198.field1491) {
                arg1.field9874 = this.field198.field1548 * var26 / var27 + this.field198.field1480;
                arg1.field9877 = this.field198.field1504 * var25 / var27 + this.field198.field1568;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field198.field1491 > var24 && this.field198.field1491 > var27) {
                    var19 = false;
                } else if (var24 < this.field198.field1491) {
                    int var31 = (var27 - this.field198.field1491 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field9872 = this.field198.field1504 * var32 / this.field198.field1491 + this.field198.field1568;
                    arg1.field9876 = this.field198.field1548 * var33 / this.field198.field1491 + this.field198.field1480;
                } else if (var27 < this.field198.field1491) {
                    int var28 = (var24 - this.field198.field1491 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field9872 = this.field198.field1504 * var29 / this.field198.field1491 + this.field198.field1568;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field9876 = this.field198.field1548 * var30 / this.field198.field1491 + this.field198.field1480;
                }
            }
            if (var19) {
                arg1.field9875 = true;
                if (var24 <= var27) {
                    arg1.field9873 = (this.field189 + var25) * this.field198.field1504 / var27 + this.field198.field1568 - arg1.field9877;
                } else {
                    arg1.field9873 = (this.field189 + var22) * this.field198.field1504 / var24 + this.field198.field1568 - arg1.field9872;
                }
            }
        }
        this.field198.method767(-223);
        this.field198.method759(1, var5);
        this.method94(-16383);
        this.field198.method765(9697);
        this.method71(25386);
    }

    @OriginalMember(owner = "client!hba", name = "wa", descriptor = "()V")
    public final void method89() {
        for (int var1 = 0; var1 < this.field181; var1++) {
            this.field134[var1] = this.field134[var1] + 7 >> 4;
            this.field183[var1] = this.field183[var1] + 7 >> 4;
            this.field107[var1] = this.field107[var1] + 7 >> 4;
        }
        field98++;
        this.field130 = false;
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "k", descriptor = "(I)V")
    public final void method90(int arg0) {
        field151++;
        int var2 = class376.field5186[arg0];
        int var3 = class376.field5188[arg0];
        for (int var4 = 0; var4 < this.field171; var4++) {
            int var7 = this.field134[var4] * var3 + this.field107[var4] * var2 >> 14;
            this.field107[var4] = this.field107[var4] * var3 - (this.field134[var4] * var2) >> 14;
            this.field134[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field112; var5++) {
            int var6 = this.field142[var5] * var2 + this.field109[var5] * var3 >> 14;
            this.field142[var5] = (short) (this.field142[var5] * var3 - (this.field109[var5] * var2) >> 14);
            this.field109[var5] = (short) var6;
        }
        if (this.field102 == null && this.field159 != null) {
            this.field159.field2912 = null;
        }
        if (this.field102 != null) {
            this.field102.field2912 = null;
        }
        this.field130 = false;
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "ia", descriptor = "(SS)V")
    public final void method91(short arg0, short arg1) {
        field95++;
        for (int var3 = 0; var3 < this.field201; var3++) {
            if (this.field122[var3] == arg0) {
                this.field122[var3] = arg1;
            }
        }
        if (this.field207 != null) {
            for (int var4 = 0; var4 < this.field140; var4++) {
                class191 var5 = this.field207[var4];
                class251 var6 = this.field144[var4];
                var6.field3711 = class779.field10694[this.field122[var5.field2951] & 0xFFFF] & 0xFFFFFF | var6.field3711 & 0xFF000000;
            }
        }
        if (this.field159 != null) {
            this.field159.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public final void method92(int arg0) {
        field133++;
        int var2 = class376.field5186[arg0];
        int var3 = class376.field5188[arg0];
        for (int var4 = 0; var4 < this.field171; var4++) {
            int var5 = this.field134[var4] * var3 + this.field107[var4] * var2 >> 14;
            this.field107[var4] = this.field107[var4] * var3 - (this.field134[var4] * var2) >> 14;
            this.field134[var4] = var5;
        }
        this.field130 = false;
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BIZ)Lka;")
    public final class496 method93(byte arg0, int arg1, boolean arg2) {
        field169++;
        class10 var4;
        class10 var5;
        if (arg0 == 1) {
            var4 = this.field198.field1571;
            var5 = this.field198.field1557;
        } else if (arg0 == 2) {
            var4 = this.field198.field1478;
            var5 = this.field198.field1511;
        } else if (arg0 == 3) {
            var5 = this.field198.field1519;
            var4 = this.field198.field1489;
        } else if (arg0 == 4) {
            var5 = this.field198.field1537;
            var4 = this.field198.field1479;
        } else if (arg0 == 5) {
            var5 = this.field198.field1541;
            var4 = this.field198.field1566;
        } else {
            var4 = var5 = new class10(this.field198);
        }
        return this.method112(false, var4, arg2, arg0 != 0, var5, arg1);
    }

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)V")
    private final void method94(int arg0) {
        field194++;
        if (this.field193 == 0) {
            return;
        }
        if (this.field119 != 0) {
            this.method86((byte) 127, true);
        }
        this.method86((byte) 84, false);
        if (this.field111 != null) {
            if (this.field111.field907 == null) {
                this.method99((this.field119 & 0x10) != 0, (byte) -107);
            }
            if (this.field111.field907 != null) {
                this.field198.method756(this.field102 != null, 90);
                this.field198.method754(this.field159, this.field114, arg0 + 16495, this.field165, this.field102);
                int var2 = this.field190.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field190[var3];
                    int var5 = this.field190[var3 + 1];
                    int var6 = this.field126[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field198.method750(this.field102 != null, 62, var6);
                    this.field198.method781(5889, var4 * 3, this.field111.field907, 4, (var5 - var4) * 3);
                }
            }
        }
        if (arg0 == -16383) {
            this.method63((byte) 36);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IILqja;ZI)Z")
    public final boolean method95(int arg0, int arg1, class326 arg2, boolean arg3, int arg4) {
        field108++;
        return this.method117(arg1, arg3, arg0, arg2, -82, -1, arg4);
    }

    @OriginalMember(owner = "client!hba", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method96(int arg0, int arg1, class294 arg2, class294 arg3, int arg4, int arg5, int arg6) {
        if (!this.field130) {
            this.method64(-54);
        }
        field170++;
        int var8 = arg4 + this.field166;
        int var9 = this.field121 + arg4;
        int var10 = this.field199 + arg6;
        int var11 = this.field106 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4289 <= arg2.field4284 + var9 >> arg2.field4285 || var10 < 0 || arg2.field4284 + var11 >> arg2.field4285 >= arg2.field4290) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4284 + var9 >> arg3.field4285 >= arg3.field4289 || var10 < 0 || (arg3.field4284 + var11 >> arg3.field4285) >= arg3.field4290) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4285;
            int var13 = arg2.field4284 + var9 - 1 >> arg2.field4285;
            int var14 = var10 >> arg2.field4285;
            int var15 = arg2.field4284 + var11 - 1 >> arg2.field4285;
            if (arg2.method1904(var14, (byte) -121, var12) == arg5 && arg2.method1904(var14, (byte) -124, var13) == arg5 && arg5 == arg2.method1904(var15, (byte) 33, var12) && arg2.method1904(var15, (byte) -128, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field171; var32++) {
                this.field183[var32] = this.field183[var32] + arg2.method1918(this.field134[var32] - -arg4, (byte) 126, this.field107[var32] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field162;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field171; var17++) {
                int var18 = (this.field183[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field183[var17] -= -((arg1 - var18) * (arg2.method1918(this.field134[var17] + arg4, (byte) 125, this.field107[var17] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = (arg1 >> 8 & 0xFF) * 4;
            int var30 = (arg1 >> 16 & 0xFF) << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var28 >> 1)) < 0 || arg2.field4289 << arg2.field4285 <= (var28 >> 1) + arg2.field4284 + arg4 || arg6 - (var29 >> 1) < 0 || arg6 + (var29 >> 1) + arg2.field4284 >= arg2.field4290 << arg2.field4285) {
                return;
            }
            this.method3017(arg2, arg5, var31, arg6, 108, var30, var28, arg4, var29);
        } else if (arg0 == 4) {
            int var19 = this.field99 - this.field162;
            for (int var20 = 0; var20 < this.field171; var20++) {
                this.field183[var20] = this.field183[var20] + var19 + arg3.method1918(this.field134[var20] + arg4, (byte) 127, this.field107[var20] - -arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field99 - this.field162;
            for (int var22 = 0; var22 < this.field171; var22++) {
                int var23 = this.field134[var22] + arg4;
                int var24 = this.field107[var22] + arg6;
                int var25 = arg2.method1918(var23, (byte) 127, var24);
                int var26 = arg3.method1918(var23, (byte) 126, var24);
                int var27 = var25 - var26 - arg1;
                this.field183[var22] = var25 - (arg5 - ((this.field183[var22] << 8) / var21 * var27 >> 8));
            }
        }
        this.field130 = false;
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "()[Lgv;")
    public final class88[] method97() {
        field100++;
        return this.field155;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field201; var5++) {
            int var9 = this.field122[var5] & 0xFFFF;
            int var10 = (var9 & 0xFD61) >> 10;
            int var11 = (var9 & 0x3BF) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field122[var5] = (short) class746.method4158(class746.method4158(var11 << 7, var10 << 10), var12);
        }
        field156++;
        if (this.field207 != null) {
            for (int var6 = 0; var6 < this.field140; var6++) {
                class191 var7 = this.field207[var6];
                class251 var8 = this.field144[var6];
                var8.field3711 = var8.field3711 & 0xFF000000 | class779.field10694[this.field122[var7.field2951] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field159 != null) {
            this.field159.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZB)V")
    private final void method99(boolean arg0, byte arg1) {
        if (this.field193 * 6 > this.field198.field1485.field7050.length) {
            this.field198.field1485 = new class538(this.field193 * 6 + 600);
        } else {
            this.field198.field1485.field7042 = 0;
        }
        field146++;
        class538 var3 = this.field198.field1485;
        if (this.field198.field1514) {
            for (int var4 = 0; var4 < this.field193; var4++) {
                var3.method2957(this.field180[var4], 1267307848);
                var3.method2957(this.field179[var4], 1267307848);
                var3.method2957(this.field123[var4], 1267307848);
            }
        } else {
            for (int var5 = 0; var5 < this.field193; var5++) {
                var3.method2965(this.field180[var5], (byte) 58);
                var3.method2965(this.field179[var5], (byte) 58);
                var3.method2965(this.field123[var5], (byte) 58);
            }
        }
        if (arg1 >= -41) {
            this.field102 = null;
        }
        if (var3.field7042 == 0) {
            return;
        }
        if (arg0) {
            if (this.field124 == null) {
                this.field124 = this.field198.method793(var3.field7050, var3.field7042, 5123, 64, true);
            } else {
                this.field124.method1240(5123, (byte) 76, var3.field7050, var3.field7042);
            }
            this.field111.field907 = this.field124;
        } else {
            this.field111.field907 = this.field198.method793(var3.field7050, var3.field7042, 5123, 64, false);
        }
        if (!arg0) {
            this.field131 = true;
        }
    }

    @OriginalMember(owner = "client!hba", name = "na", descriptor = "()I")
    public final int method100() {
        if (!this.field130) {
            this.method64(-29);
        }
        field152++;
        return this.field189;
    }

    @OriginalMember(owner = "client!hba", name = "v", descriptor = "()V")
    public final void method101() {
        field185++;
        for (int var1 = 0; var1 < this.field171; var1++) {
            this.field107[var1] = -this.field107[var1];
        }
        for (int var2 = 0; var2 < this.field112; var2++) {
            this.field142[var2] = (short) (-this.field142[var2]);
        }
        for (int var3 = 0; var3 < this.field201; var3++) {
            short var4 = this.field180[var3];
            this.field180[var3] = this.field123[var3];
            this.field123[var3] = var4;
        }
        if (this.field102 == null && this.field159 != null) {
            this.field159.field2912 = null;
        }
        if (this.field102 != null) {
            this.field102.field2912 = null;
        }
        this.field130 = false;
        if (this.field111 != null) {
            this.field111.field907 = null;
        }
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "EA", descriptor = "()I")
    public final int method102() {
        field184++;
        if (!this.field130) {
            this.method64(-72);
        }
        return this.field99;
    }

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "()[Loq;")
    public final class378[] method103() {
        field103++;
        return this.field138;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(BIIIS)I")
    private final int method104(byte arg0, int arg1, int arg2, int arg3, short arg4) {
        field147++;
        int var6 = class779.field10694[class118.method896(arg3, true, arg2)];
        if (arg1 < 97) {
            this.method70(null);
        }
        if (arg4 != -1) {
            class467 var7 = this.field198.field774.method1208((byte) 47, arg4 & 0xFFFF);
            int var8 = var7.field6582 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg3 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field6579 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + ((var13 & 0xE500FF00) << 8) + (var14 & 0xFF00);
            }
        }
        return -(arg0 & 0xFF) - (-(var6 << 8) - 255);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lqja;IZ)V")
    public final void method105(class326 arg0, int arg1, boolean arg2) {
        field172++;
        if (this.field196 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field171; var5++) {
            if ((arg1 & this.field196[var5]) != 0) {
                if (arg2) {
                    arg0.method1890(this.field134[var5], this.field183[var5], this.field107[var5], var4);
                } else {
                    arg0.method1885(this.field134[var5], this.field183[var5], this.field107[var5], var4);
                }
                this.field134[var5] = var4[0];
                this.field183[var5] = var4[1];
                this.field107[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lqja;Lag;II)V")
    public final void method106(class326 arg0, class711 arg1, int arg2, int arg3) {
        field105++;
        if (this.field112 == 0) {
            return;
        }
        class630 var5 = this.field198.field1468;
        class630 var6 = (class630) arg0;
        if (!this.field130) {
            this.method64(-57);
        }
        class343.field4780 = var5.field8850 * var6.field8833 + var5.field8853 * var6.field8847 + var5.field8833 * var6.field8852;
        class350.field4897 = var5.field8850 * var6.field8824 + var5.field8853 * var6.field8835 + var5.field8833 * var6.field8848 + var5.field8824;
        float var7 = (float) this.field162 * class343.field4780 + class350.field4897;
        float var8 = (float) this.field99 * class343.field4780 + class350.field4897;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var9 = (float) (-this.field189) + var8;
            var10 = (float) this.field189 + var7;
        } else {
            var9 = var7 - (float) this.field189;
            var10 = (float) this.field189 + var8;
        }
        if ((var9 >= this.field198.field1516) || ((float) this.field198.field1491 >= var10)) {
            return;
        }
        class284.field4197 = var5.field8826 * var6.field8833 + var5.field8847 * var6.field8852 + var5.field8825 * var6.field8847;
        class504.field7152 = var5.field8826 * var6.field8824 + var5.field8847 * var6.field8848 + var5.field8825 * var6.field8835 + var5.field8835;
        float var11 = (float) this.field162 * class284.field4197 + class504.field7152;
        float var12 = (float) this.field99 * class284.field4197 + class504.field7152;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) (-this.field189) + var12) * (float) this.field198.field1504;
            var13 = ((float) this.field189 + var11) * (float) this.field198.field1504;
        } else {
            var13 = ((float) this.field189 + var12) * (float) this.field198.field1504;
            var14 = ((float) (-this.field189) + var11) * (float) this.field198.field1504;
        }
        if ((var14 / (float) arg2 >= this.field198.field1527) || (this.field198.field1509 >= var13 / (float) arg2)) {
            return;
        }
        class624.field8749 = var5.field8831 * var6.field8824 + var5.field8855 * var6.field8835 + var5.field8852 * var6.field8848 + var5.field8848;
        class189.field2911 = var5.field8831 * var6.field8833 + var5.field8855 * var6.field8847 + var5.field8852 * var6.field8852;
        float var15 = (float) this.field162 * class189.field2911 + class624.field8749;
        float var16 = (float) this.field99 * class189.field2911 + class624.field8749;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) this.field189 + var15) * (float) this.field198.field1548;
            var17 = (var16 - (float) this.field189) * (float) this.field198.field1548;
        } else {
            var17 = (var15 - (float) this.field189) * (float) this.field198.field1548;
            var18 = ((float) this.field189 + var16) * (float) this.field198.field1548;
        }
        if ((var17 / (float) arg2 >= this.field198.field1487) || (var18 / (float) arg2 <= this.field198.field1484)) {
            return;
        }
        if (arg1 != null || this.field207 != null) {
            class290.field4246 = var5.field8826 * var6.field8850 + var5.field8847 * var6.field8831 + var5.field8825 * var6.field8826;
            class588.field8299 = var5.field8831 * var6.field8853 + var5.field8855 * var6.field8825 + var5.field8852 * var6.field8855;
            class705.field9827 = var5.field8850 * var6.field8850 + var5.field8853 * var6.field8826 + var5.field8833 * var6.field8831;
            class567.field8025 = var5.field8826 * var6.field8853 + var5.field8847 * var6.field8855 + var5.field8825 * var6.field8825;
            class94.field1062 = var5.field8831 * var6.field8850 + var5.field8855 * var6.field8826 + var5.field8852 * var6.field8831;
            class87.field969 = var5.field8850 * var6.field8853 + var5.field8853 * var6.field8825 + var5.field8833 * var6.field8855;
        }
        if (arg1 != null) {
            int var19 = this.field166 + this.field121 >> 1;
            int var20 = this.field199 + this.field106 >> 1;
            int var21 = (int) ((float) var20 * class290.field4246 + (float) this.field162 * class284.field4197 + (float) var19 * class567.field8025 + class504.field7152);
            int var22 = (int) ((float) var20 * class94.field1062 + (float) this.field162 * class189.field2911 + (float) var19 * class588.field8299 + class624.field8749);
            int var23 = (int) ((float) var20 * class705.field9827 + (float) this.field162 * class343.field4780 + (float) var19 * class87.field969 + class350.field4897);
            int var24 = (int) ((float) var20 * class290.field4246 + (float) this.field99 * class284.field4197 + (float) var19 * class567.field8025 + class504.field7152);
            int var25 = (int) ((float) var20 * class94.field1062 + (float) this.field99 * class189.field2911 + (float) var19 * class588.field8299 + class624.field8749);
            arg1.field9874 = this.field198.field1548 * var25 / arg2 + this.field198.field1480;
            int var26 = (int) ((float) var20 * class705.field9827 + (float) this.field99 * class343.field4780 + (float) var19 * class87.field969 + class350.field4897);
            arg1.field9877 = this.field198.field1504 * var24 / arg2 + this.field198.field1568;
            arg1.field9872 = this.field198.field1504 * var21 / arg2 + this.field198.field1568;
            arg1.field9876 = this.field198.field1548 * var22 / arg2 + this.field198.field1480;
            if (var23 >= this.field198.field1491 || this.field198.field1491 <= var26) {
                arg1.field9873 = (this.field189 + var21) * this.field198.field1504 / arg2 + this.field198.field1568 - arg1.field9872;
                arg1.field9875 = true;
            }
        }
        this.field198.method819(3, (float) arg2);
        this.field198.method777(-30909);
        this.field198.method759(1, var6);
        this.method94(-16383);
        this.field198.method765(9697);
        this.method71(25386);
    }

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "()V")
    public final void method107() {
        field168++;
        if (this.field112 <= 0 || this.field193 <= 0) {
            return;
        }
        this.method86((byte) 62, false);
        if ((this.field119 & 0x10) == 0 && this.field111.field907 == null) {
            this.method99(false, (byte) -78);
        }
        this.method63((byte) 36);
    }

    @OriginalMember(owner = "client!hba", name = "NA", descriptor = "()Z")
    public final boolean method108() {
        field129++;
        if (this.field127 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field181; var1++) {
            this.field134[var1] <<= 0x4;
            this.field183[var1] <<= 0x4;
            this.field107[var1] <<= 0x4;
        }
        class150.field2151 = 0;
        class81.field899 = 0;
        class89.field1004 = 0;
        return true;
    }

    @OriginalMember(owner = "client!hba", name = "WA", descriptor = "()I")
    public final int method109() {
        field137++;
        return this.field160;
    }

    @OriginalMember(owner = "client!hba", name = "da", descriptor = "()I")
    public final int method110() {
        field187++;
        return this.field153;
    }

    @OriginalMember(owner = "client!hba", name = "s", descriptor = "(I)V")
    public final void method111(int arg0) {
        this.field91 = arg0;
        field195++;
        if (this.field116 != null && (this.field91 & 0x10000) == 0) {
            this.field154 = this.field116.field6409;
            this.field109 = this.field116.field6407;
            this.field128 = this.field116.field6413;
            this.field142 = this.field116.field6412;
            this.field116 = null;
        }
        this.field131 = true;
        this.method63((byte) 36);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLhba;ZZLhba;I)Lka;")
    private final class496 method112(boolean arg0, class10 arg1, boolean arg2, boolean arg3, class10 arg4, int arg5) {
        arg1.field171 = this.field171;
        arg1.field153 = this.field153;
        arg1.field193 = this.field193;
        arg1.field160 = this.field160;
        arg1.field140 = this.field140;
        arg1.field119 = 0;
        arg1.field112 = this.field112;
        arg1.field202 = this.field202;
        arg1.field91 = arg5;
        arg1.field104 = this.field104;
        field178++;
        if (arg0) {
            this.field193 = 76;
        }
        if ((arg5 & 0x100) == 0) {
            arg1.field145 = this.field145;
        } else {
            arg1.field145 = true;
        }
        arg1.field201 = this.field201;
        arg1.field181 = this.field181;
        boolean var7 = class270.method1751(33, this.field202, arg5);
        boolean var8 = class169.method1253(this.field202, (byte) 109, arg5);
        boolean var9 = class611.method3550(this.field202, -17362, arg5);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg1.field134 = this.field134;
            } else if (arg4.field134 == null || this.field181 > arg4.field134.length) {
                arg1.field134 = arg4.field134 = new int[this.field181];
            } else {
                arg1.field134 = arg4.field134;
            }
            if (!var8) {
                arg1.field183 = this.field183;
            } else if (arg4.field183 == null || arg4.field183.length < this.field181) {
                arg1.field183 = arg4.field183 = new int[this.field181];
            } else {
                arg1.field183 = arg4.field183;
            }
            if (!var9) {
                arg1.field107 = this.field107;
            } else if (arg4.field107 == null || this.field181 > arg4.field107.length) {
                arg1.field107 = arg4.field107 = new int[this.field181];
            } else {
                arg1.field107 = arg4.field107;
            }
            for (int var11 = 0; var11 < this.field181; var11++) {
                if (var7) {
                    arg1.field134[var11] = this.field134[var11];
                }
                if (var8) {
                    arg1.field183[var11] = this.field183[var11];
                }
                if (var9) {
                    arg1.field107[var11] = this.field107[var11];
                }
            }
        } else {
            arg1.field107 = this.field107;
            arg1.field183 = this.field183;
            arg1.field134 = this.field134;
        }
        if (class147.method1033((byte) -4, this.field202, arg5)) {
            arg1.field165 = arg4.field165;
            if (arg3) {
                arg1.field119 = (byte) (arg1.field119 | 0x1);
            }
            arg1.field165.field2912 = this.field165.field2912;
            arg1.field165.field2918 = this.field165.field2918;
        } else if (class591.method3441(arg5, 102, this.field202)) {
            arg1.field165 = this.field165;
        } else {
            arg1.field165 = null;
        }
        if (class574.method3369((byte) -120, this.field202, arg5)) {
            if (arg4.field122 == null || this.field201 > arg4.field122.length) {
                arg1.field122 = arg4.field122 = new short[this.field201];
            } else {
                arg1.field122 = arg4.field122;
            }
            for (int var12 = 0; var12 < this.field201; var12++) {
                arg1.field122[var12] = this.field122[var12];
            }
        } else {
            arg1.field122 = this.field122;
        }
        if (class306.method1985((byte) 108, arg5, this.field202)) {
            if (arg4.field167 == null || arg4.field167.length < this.field201) {
                arg1.field167 = arg4.field167 = new byte[this.field201];
            } else {
                arg1.field167 = arg4.field167;
            }
            for (int var13 = 0; var13 < this.field201; var13++) {
                arg1.field167[var13] = this.field167[var13];
            }
        } else {
            arg1.field167 = this.field167;
        }
        if (class346.method2194(this.field202, arg5, (byte) -89)) {
            if (arg3) {
                arg1.field119 = (byte) (arg1.field119 | 0x2);
            }
            arg1.field159 = arg4.field159;
            arg1.field159.field2912 = this.field159.field2912;
            arg1.field159.field2918 = this.field159.field2918;
        } else if (class675.method3840(this.field202, (byte) -128, arg5)) {
            arg1.field159 = this.field159;
        } else {
            arg1.field159 = null;
        }
        if (class747.method4161(arg5, (byte) -50, this.field202)) {
            if (arg4.field109 == null || this.field112 > arg4.field109.length) {
                int var14 = this.field112;
                arg1.field142 = arg4.field142 = new short[var14];
                arg1.field109 = arg4.field109 = new short[var14];
                arg1.field154 = arg4.field154 = new short[var14];
            } else {
                arg1.field142 = arg4.field142;
                arg1.field109 = arg4.field109;
                arg1.field154 = arg4.field154;
            }
            if (this.field116 == null) {
                for (int var15 = 0; var15 < this.field112; var15++) {
                    arg1.field109[var15] = this.field109[var15];
                    arg1.field154[var15] = this.field154[var15];
                    arg1.field142[var15] = this.field142[var15];
                }
            } else {
                if (arg4.field116 == null) {
                    arg4.field116 = new class458();
                }
                class458 var16 = arg1.field116 = arg4.field116;
                if (var16.field6407 == null || var16.field6407.length < this.field112) {
                    int var17 = this.field112;
                    var16.field6409 = new short[var17];
                    var16.field6412 = new short[var17];
                    var16.field6413 = new byte[var17];
                    var16.field6407 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field112; var18++) {
                    arg1.field109[var18] = this.field109[var18];
                    arg1.field154[var18] = this.field154[var18];
                    arg1.field142[var18] = this.field142[var18];
                    var16.field6407[var18] = this.field116.field6407[var18];
                    var16.field6409[var18] = this.field116.field6409[var18];
                    var16.field6412[var18] = this.field116.field6412[var18];
                    var16.field6413[var18] = this.field116.field6413[var18];
                }
            }
            arg1.field128 = this.field128;
        } else {
            arg1.field109 = this.field109;
            arg1.field128 = this.field128;
            arg1.field116 = this.field116;
            arg1.field142 = this.field142;
            arg1.field154 = this.field154;
        }
        if (class176.method1279(this.field202, arg5, 0)) {
            if (arg3) {
                arg1.field119 = (byte) (arg1.field119 | 0x4);
            }
            arg1.field102 = arg4.field102;
            arg1.field102.field2918 = this.field102.field2918;
            arg1.field102.field2912 = this.field102.field2912;
        } else if (class474.method2815(false, arg5, this.field202)) {
            arg1.field102 = this.field102;
        } else {
            arg1.field102 = null;
        }
        if (class600.method3494((byte) -52, this.field202, arg5)) {
            if (arg4.field186 == null || arg4.field186.length < this.field201) {
                int var19 = this.field112;
                arg1.field182 = arg4.field182 = new float[var19];
                arg1.field186 = arg4.field186 = new float[var19];
            } else {
                arg1.field186 = arg4.field186;
                arg1.field182 = arg4.field182;
            }
            for (int var20 = 0; var20 < this.field112; var20++) {
                arg1.field186[var20] = this.field186[var20];
                arg1.field182[var20] = this.field182[var20];
            }
        } else {
            arg1.field186 = this.field186;
            arg1.field182 = this.field182;
        }
        if (class358.method2263(1064779144, this.field202, arg5)) {
            arg1.field114 = arg4.field114;
            if (arg3) {
                arg1.field119 = (byte) (arg1.field119 | 0x8);
            }
            arg1.field114.field2918 = this.field114.field2918;
            arg1.field114.field2912 = this.field114.field2912;
        } else if (class161.method1217(arg5, (byte) -53, this.field202)) {
            arg1.field114 = this.field114;
        } else {
            arg1.field114 = null;
        }
        if (class25.method238((byte) -78, this.field202, arg5)) {
            if (arg4.field180 == null || arg4.field180.length < this.field201) {
                int var21 = this.field201;
                arg1.field180 = arg4.field180 = new short[var21];
                arg1.field123 = arg4.field123 = new short[var21];
                arg1.field179 = arg4.field179 = new short[var21];
            } else {
                arg1.field180 = arg4.field180;
                arg1.field179 = arg4.field179;
                arg1.field123 = arg4.field123;
            }
            for (int var22 = 0; var22 < this.field201; var22++) {
                arg1.field180[var22] = this.field180[var22];
                arg1.field179[var22] = this.field179[var22];
                arg1.field123[var22] = this.field123[var22];
            }
        } else {
            arg1.field179 = this.field179;
            arg1.field123 = this.field123;
            arg1.field180 = this.field180;
        }
        if (class575.method3375(!arg0, this.field202, arg5)) {
            if (arg3) {
                arg1.field119 = (byte) (arg1.field119 | 0x10);
            }
            arg1.field111 = arg4.field111;
            arg1.field111.field907 = this.field111.field907;
        } else if (class132.method979(2048, this.field202, arg5)) {
            arg1.field111 = this.field111;
        } else {
            arg1.field111 = null;
        }
        if (class65.method496(32768, this.field202, arg5)) {
            if (arg4.field126 == null || this.field201 > arg4.field126.length) {
                int var23 = this.field201;
                arg1.field126 = arg4.field126 = new short[var23];
            } else {
                arg1.field126 = arg4.field126;
            }
            for (int var24 = 0; var24 < this.field201; var24++) {
                arg1.field126[var24] = this.field126[var24];
            }
        } else {
            arg1.field126 = this.field126;
        }
        if (!class216.method1481(arg5, this.field202, (byte) -103)) {
            arg1.field144 = this.field144;
        } else if (arg4.field144 == null || this.field140 > arg4.field144.length) {
            int var26 = this.field140;
            arg1.field144 = arg4.field144 = new class251[var26];
            for (int var27 = 0; var27 < this.field140; var27++) {
                arg1.field144[var27] = this.field144[var27].method1654((byte) -128);
            }
        } else {
            arg1.field144 = arg4.field144;
            for (int var25 = 0; var25 < this.field140; var25++) {
                arg1.field144[var25].method1653((byte) 104, this.field144[var25]);
            }
        }
        if (this.field130) {
            arg1.field166 = this.field166;
            arg1.field199 = this.field199;
            arg1.field121 = this.field121;
            arg1.field130 = true;
            arg1.field99 = this.field99;
            arg1.field189 = this.field189;
            arg1.field106 = this.field106;
            arg1.field141 = this.field141;
            arg1.field162 = this.field162;
        } else {
            arg1.field130 = false;
        }
        arg1.field190 = this.field190;
        arg1.field207 = this.field207;
        arg1.field157 = this.field157;
        arg1.field191 = this.field191;
        arg1.field155 = this.field155;
        arg1.field173 = this.field173;
        arg1.field175 = this.field175;
        arg1.field127 = this.field127;
        arg1.field206 = this.field206;
        arg1.field138 = this.field138;
        arg1.field196 = this.field196;
        return arg1;
    }

    @OriginalMember(owner = "client!hba", name = "HA", descriptor = "()I")
    public final int method113() {
        field135++;
        if (!this.field130) {
            this.method64(-41);
        }
        return this.field199;
    }

    @OriginalMember(owner = "client!hba", name = "H", descriptor = "(III)V")
    public final void method114(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field171; var4++) {
            if (arg0 != 0) {
                this.field134[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field183[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field107[var4] += arg2;
            }
        }
        field96++;
        this.field130 = false;
        if (this.field165 != null) {
            this.field165.field2912 = null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method115(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field148++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class89.field1004 = 0;
            class150.field2151 = 0;
            class81.field899 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field127.length > var15) {
                    int[] var16 = this.field127[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field196 == null || (this.field196[var18] & arg6) != 0) {
                            class150.field2151 += this.field134[var18];
                            class81.field899 += this.field183[var18];
                            var13++;
                            class89.field1004 += this.field107[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class150.field2151 = class150.field2151 / var13 + var12;
                class281.field4080 = true;
                class89.field1004 = class89.field1004 / var13 + var10;
                class81.field899 = class81.field899 / var13 + var11;
            } else {
                class89.field1004 = var10;
                class81.field899 = var11;
                class150.field2151 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 - (-(arg7[8] * arg4) - 8192) >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field127.length) {
                    int[] var27 = this.field127[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field196 == null || (arg6 & this.field196[var29]) != 0) {
                            this.field134[var29] += var23;
                            this.field183[var29] += var22;
                            this.field107[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field127.length > var49) {
                        int[] var50 = this.field127[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field196 == null || (this.field196[var52] & arg6) != 0) {
                                this.field134[var52] -= class150.field2151;
                                this.field183[var52] -= class81.field899;
                                this.field107[var52] -= class89.field1004;
                                if (arg4 != 0) {
                                    int var53 = class376.field5186[arg4];
                                    int var54 = class376.field5188[arg4];
                                    int var55 = this.field183[var52] * var53 + this.field134[var52] * var54 + 16383 >> 14;
                                    this.field183[var52] = this.field183[var52] * var54 + 16383 - (this.field134[var52] * var53) >> 14;
                                    this.field134[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class376.field5186[arg2];
                                    int var57 = class376.field5188[arg2];
                                    int var58 = this.field183[var52] * var57 + 16383 - (this.field107[var52] * var56) >> 14;
                                    this.field107[var52] = this.field107[var52] * var57 + this.field183[var52] * var56 + 16383 >> 14;
                                    this.field183[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class376.field5186[arg3];
                                    int var60 = class376.field5188[arg3];
                                    int var61 = this.field134[var52] * var60 + this.field107[var52] * var59 + 16383 >> 14;
                                    this.field107[var52] = this.field107[var52] * var60 + 16383 - this.field134[var52] * var59 >> 14;
                                    this.field134[var52] = var61;
                                }
                                this.field134[var52] += class150.field2151;
                                this.field183[var52] += class81.field899;
                                this.field107[var52] += class89.field1004;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field127.length) {
                            int[] var33 = this.field127[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field196 == null || (this.field196[var35] & arg6) != 0) {
                                    int var36 = this.field206[var35];
                                    int var37 = this.field206[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field157[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class376.field5186[arg4];
                                            int var41 = class376.field5188[arg4];
                                            int var42 = this.field154[var39] * var40 + (this.field109[var39] * var41) + 16383 >> 14;
                                            this.field154[var39] = (short) (this.field154[var39] * var41 + 16383 - (this.field109[var39] * var40) >> 14);
                                            this.field109[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class376.field5186[arg2];
                                            int var44 = class376.field5188[arg2];
                                            int var45 = this.field154[var39] * var44 + 16383 - this.field142[var39] * var43 >> 14;
                                            this.field142[var39] = (short) (this.field154[var39] * var43 + this.field142[var39] * var44 + 16383 >> 14);
                                            this.field154[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class376.field5186[arg3];
                                            int var47 = class376.field5188[arg3];
                                            int var48 = this.field142[var39] * var46 + (this.field109[var39] * var47) + 16383 >> 14;
                                            this.field142[var39] = (short) (this.field142[var39] * var47 + 16383 - (this.field109[var39] * var46) >> 14);
                                            this.field109[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field102 == null && this.field159 != null) {
                        this.field159.field2912 = null;
                    }
                    if (this.field102 != null) {
                        this.field102.field2912 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class281.field4080) {
                    int var68 = arg7[6] * class89.field1004 + arg7[3] * class81.field899 + arg7[0] * class150.field2151 + 8192 >> 14;
                    int var69 = arg7[7] * class89.field1004 + arg7[1] * class150.field2151 + arg7[4] * class81.field899 + 8192 >> 14;
                    int var70 = arg7[5] * class81.field899 + (arg7[8] * class89.field1004) + arg7[2] * class150.field2151 + 8192 >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    class150.field2151 = var72;
                    class81.field899 = var71;
                    int var73 = var67 + var70;
                    class89.field1004 = var73;
                    class281.field4080 = false;
                }
                int[] var74 = new int[9];
                int var75 = class376.field5188[arg2];
                int var76 = class376.field5186[arg2];
                int var77 = class376.field5188[arg3];
                int var78 = class376.field5186[arg3];
                int var79 = class376.field5188[arg4];
                int var80 = class376.field5186[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[7] = var78 * var80 + (var77 * var81) + 8192 >> 14;
                var74[0] = var77 * var79 + (var78 * var82) + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[5] = -var76;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                int var83 = var74[2] * -class89.field1004 + var74[0] * -class150.field2151 - (-(var74[1] * -class81.field899) - 8192) >> 14;
                int var84 = var74[3] * -class150.field2151 + (var74[4] * -class81.field899 + var74[5] * -class89.field1004 + 8192) >> 14;
                int var85 = var74[8] * -class89.field1004 + var74[7] * -class81.field899 + var74[6] * -class150.field2151 + 8192 >> 14;
                int var86 = class150.field2151 + var83;
                int var87 = class81.field899 + var84;
                int var88 = class89.field1004 + var85;
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
                int var91 = var74[0] * var65 + 8192 - (-(var74[1] * var66) - (var74[2] * var67)) >> 14;
                int var92 = var74[3] * var65 + var74[5] * var67 + var74[4] * var66 + 8192 >> 14;
                int var93 = var74[6] * var65 + (var74[8] * var67) + var74[7] * var66 + 8192 >> 14;
                int var94 = var86 + var91;
                int var95 = var87 + var92;
                int var96 = var88 + var93;
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
                int var99 = arg7[2] * var96 + arg7[1] * var95 + arg7[0] * var94 + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[3] * var94 - (-(arg7[4] * var95) - 8192) >> 14;
                int var101 = var62 + var99;
                int var102 = arg7[7] * var95 + arg7[6] * var94 - (-(arg7[8] * var96) + -8192) >> 14;
                int var103 = var63 + var100;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field127.length) {
                        int[] var107 = this.field127[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field196 == null || (this.field196[var109] & arg6) != 0) {
                                int var110 = this.field134[var109] * var97[0] + (this.field107[var109] * var97[2]) + this.field183[var109] * var97[1] + 8192 >> 14;
                                int var111 = this.field183[var109] * var97[4] + this.field134[var109] * var97[3] + (this.field107[var109] * var97[5]) + 8192 >> 14;
                                int var112 = var103 + var111;
                                int var113 = this.field134[var109] * var97[6] + (this.field183[var109] * var97[7] + (this.field107[var109] * var97[8]) + 8192) >> 14;
                                int var114 = var101 + var110;
                                this.field134[var109] = var114;
                                int var115 = var104 + var113;
                                this.field183[var109] = var112;
                                this.field107[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field127.length > var123) {
                        int[] var124 = this.field127[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field196 == null || (this.field196[var126] & arg6) != 0) {
                                this.field134[var126] -= class150.field2151;
                                this.field183[var126] -= class81.field899;
                                this.field107[var126] -= class89.field1004;
                                this.field134[var126] = this.field134[var126] * arg2 >> 7;
                                this.field183[var126] = this.field183[var126] * arg3 >> 7;
                                this.field107[var126] = this.field107[var126] * arg4 >> 7;
                                this.field134[var126] += class150.field2151;
                                this.field183[var126] += class81.field899;
                                this.field107[var126] += class89.field1004;
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
                if (class281.field4080) {
                    int var133 = arg7[0] * class150.field2151 + (arg7[3] * class81.field899 + (arg7[6] * class89.field1004) + 8192) >> 14;
                    int var134 = arg7[4] * class81.field899 + arg7[1] * class150.field2151 + arg7[7] * class89.field1004 + 8192 >> 14;
                    int var135 = arg7[2] * class150.field2151 + arg7[5] * class81.field899 + (arg7[8] * class89.field1004) + 8192 >> 14;
                    int var136 = var130 + var133;
                    int var137 = var131 + var134;
                    class150.field2151 = var136;
                    class81.field899 = var137;
                    int var138 = var132 + var135;
                    class281.field4080 = false;
                    class89.field1004 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class150.field2151 * var139 + 8192 >> 14;
                int var143 = -class81.field899 * var140 + 8192 >> 14;
                int var144 = -class89.field1004 * var141 + 8192 >> 14;
                int var145 = class150.field2151 + var142;
                int var146 = var143 + class81.field899;
                int var147 = var144 + class89.field1004;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var145 + var149;
                int var153 = var146 + var150;
                int var154 = var147 + var151;
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
                int var157 = arg7[0] * var152 + (arg7[1] * var153 + (arg7[2] * var154)) + 8192 >> 14;
                int var158 = arg7[4] * var153 + arg7[3] * var152 + arg7[5] * var154 + 8192 >> 14;
                int var159 = var128 + var158;
                int var160 = arg7[8] * var154 + arg7[6] * var152 + arg7[7] * var153 + 8192 >> 14;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field127.length) {
                        int[] var165 = this.field127[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field196 == null || (this.field196[var167] & arg6) != 0) {
                                int var168 = this.field134[var167] * var155[0] + (this.field183[var167] * var155[1] - (-(this.field107[var167] * var155[2]) - 8192)) >> 14;
                                int var169 = this.field183[var167] * var155[4] + this.field134[var167] * var155[3] + (this.field107[var167] * var155[5]) + 8192 >> 14;
                                int var170 = var159 + var169;
                                int var171 = this.field134[var167] * var155[6] + this.field183[var167] * var155[7] + this.field107[var167] * var155[8] + 8192 >> 14;
                                int var172 = var161 + var168;
                                this.field134[var167] = var172;
                                int var173 = var162 + var171;
                                this.field183[var167] = var170;
                                this.field107[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field175 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field175.length > var181) {
                        int[] var182 = this.field175[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field191 == null || (arg6 & this.field191[var184]) != 0) {
                                int var185 = (this.field167[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field167[var184] = (byte) var185;
                                if (this.field159 != null) {
                                    this.field159.field2912 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field207 != null) {
                    for (int var178 = 0; var178 < this.field140; var178++) {
                        class191 var179 = this.field207[var178];
                        class251 var180 = this.field144[var178];
                        var180.field3711 = 255 - (this.field167[var179.field2951] & 0xFF) << 24 | var180.field3711 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field175 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field175.length) {
                        int[] var191 = this.field175[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field191 == null || (this.field191[var193] & arg6) != 0) {
                                int var194 = this.field122[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var195 + arg2 & 0x3F;
                                int var198 = var194 & 0x7F;
                                int var199 = arg3 / 4 + var196;
                                int var200 = arg4 + var198;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field122[var193] = (short) class746.method4158(var200, class746.method4158(var199 << 7, var197 << 10));
                                if (this.field159 != null) {
                                    this.field159.field2912 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field207 != null) {
                    for (int var187 = 0; var187 < this.field140; var187++) {
                        class191 var188 = this.field207[var187];
                        class251 var189 = this.field144[var187];
                        var189.field3711 = var189.field3711 & 0xFF000000 | class779.field10694[this.field122[var188.field2951] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field173 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field173.length) {
                        int[] var203 = this.field173[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class251 var205 = this.field144[var203[var204]];
                            var205.field3708 += arg3;
                            var205.field3702 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field173 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field173.length > var207) {
                        int[] var208 = this.field173[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class251 var210 = this.field144[var208[var209]];
                            var210.field3706 = var210.field3706 * arg3 >> 7;
                            var210.field3709 = var210.field3709 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field173 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field173.length) {
                    int[] var213 = this.field173[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class251 var215 = this.field144[var213[var214]];
                        var215.field3704 = var215.field3704 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "V", descriptor = "()I")
    public final int method116() {
        if (!this.field130) {
            this.method64(-125);
        }
        field205++;
        return this.field166;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZILqja;III)Z")
    private final boolean method117(int arg0, boolean arg1, int arg2, class326 arg3, int arg4, int arg5, int arg6) {
        field101++;
        class630 var8 = (class630) arg3;
        class630 var9 = this.field198.field1468;
        float var10 = var8.field8824 * var9.field8826 + var8.field8848 * var9.field8847 + var8.field8835 * var9.field8825 + var9.field8835;
        float var11 = var8.field8824 * var9.field8831 + var8.field8848 * var9.field8852 + var8.field8835 * var9.field8855 + var9.field8848;
        class343.field4780 = var8.field8833 * var9.field8850 + var8.field8852 * var9.field8833 + var8.field8847 * var9.field8853;
        class94.field1062 = var8.field8850 * var9.field8831 + var8.field8831 * var9.field8852 + var8.field8826 * var9.field8855;
        if (arg4 > -53) {
            return true;
        }
        class290.field4246 = var8.field8850 * var9.field8826 + var8.field8831 * var9.field8847 + var8.field8826 * var9.field8825;
        class588.field8299 = var8.field8853 * var9.field8831 + var8.field8855 * var9.field8852 + var8.field8825 * var9.field8855;
        class189.field2911 = var8.field8833 * var9.field8831 + var8.field8852 * var9.field8852 + var8.field8847 * var9.field8855;
        class87.field969 = var8.field8853 * var9.field8850 + var8.field8855 * var9.field8833 + var8.field8825 * var9.field8853;
        class284.field4197 = var8.field8833 * var9.field8826 + var8.field8852 * var9.field8847 + var8.field8847 * var9.field8825;
        class705.field9827 = var8.field8850 * var9.field8850 + var8.field8831 * var9.field8833 + var8.field8826 * var9.field8853;
        class567.field8025 = var8.field8853 * var9.field8826 + var8.field8855 * var9.field8847 + var8.field8825 * var9.field8825;
        float var12 = var8.field8824 * var9.field8850 + var8.field8848 * var9.field8833 + var8.field8835 * var9.field8853 + var9.field8824;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field198.field1504;
        int var19 = this.field198.field1548;
        if (!this.field130) {
            this.method64(-121);
        }
        int var20 = this.field121 - this.field166 >> 1;
        int var21 = this.field99 - this.field162 >> 1;
        int var22 = this.field106 - this.field199 >> 1;
        int var23 = this.field166 + var20;
        int var24 = this.field162 + var21;
        int var25 = this.field199 + var22;
        int var26 = var23 - (var20 << arg6);
        int var27 = var24 - (var21 << arg6);
        int var28 = var25 - (var22 << arg6);
        int var29 = (var20 << arg6) + var23;
        int var30 = var24 + (var21 << arg6);
        class374.field5159[0] = var26;
        int var31 = (var22 << arg6) + var25;
        class254.field3746[0] = var27;
        class374.field5159[1] = var29;
        class625.field8757[0] = var28;
        class254.field3746[1] = var27;
        class625.field8757[1] = var28;
        class374.field5159[2] = var26;
        class254.field3746[2] = var30;
        class625.field8757[2] = var28;
        class374.field5159[3] = var29;
        class254.field3746[3] = var30;
        class625.field8757[3] = var28;
        class374.field5159[4] = var26;
        class254.field3746[4] = var27;
        class374.field5159[5] = var29;
        class625.field8757[4] = var31;
        class254.field3746[5] = var27;
        class374.field5159[6] = var26;
        class625.field8757[5] = var31;
        class254.field3746[6] = var30;
        class625.field8757[6] = var31;
        class374.field5159[7] = var29;
        class254.field3746[7] = var30;
        class625.field8757[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class254.field3746[var32];
            float var54 = (float) class374.field5159[var32];
            float var55 = (float) class625.field8757[var32];
            float var56 = class290.field4246 * var55 + class567.field8025 * var54 + class284.field4197 * var53 + var10;
            float var57 = class705.field9827 * var55 + class87.field969 * var54 + class343.field4780 * var53 + var12;
            float var58 = class94.field1062 * var55 + class588.field8299 * var54 + class189.field2911 * var53 + var11;
            if ((float) this.field198.field1491 <= var57) {
                if (arg5 > 0) {
                    var57 = arg5;
                }
                float var59 = (float) var18 * var56 / var57 + (float) this.field198.field1568;
                if (var15 < var59) {
                    var15 = var59;
                }
                float var60 = (float) var19 * var58 / var57 + (float) this.field198.field1480;
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var17 < var60) {
                    var17 = var60;
                }
                if (var16 > var60) {
                    var16 = var60;
                }
                var13 = true;
            }
        }
        if (var13 && var14 < (float) arg2 && (float) arg2 < var15 && (float) arg0 > var16 && (float) arg0 < var17) {
            if (arg1) {
                return true;
            }
            if (this.field198.field1586.length < this.field112) {
                this.field198.field1588 = new int[this.field112];
                this.field198.field1586 = new int[this.field112];
            }
            int[] var33 = this.field198.field1586;
            int[] var34 = this.field198.field1588;
            for (int var35 = 0; var35 < this.field171; var35++) {
                float var37 = (float) this.field107[var35];
                float var38 = (float) this.field134[var35];
                float var39 = (float) this.field183[var35];
                float var40 = class290.field4246 * var37 + class567.field8025 * var38 + class284.field4197 * var39 + var10;
                float var41 = class94.field1062 * var37 + class588.field8299 * var38 + class189.field2911 * var39 + var11;
                float var42 = class705.field9827 * var37 + class87.field969 * var38 + class343.field4780 * var39 + var12;
                if (((float) this.field198.field1491 <= var42)) {
                    if (arg5 > 0) {
                        var42 = arg5;
                    }
                    int var47 = (int) ((float) var18 * var40 / var42 + (float) this.field198.field1568);
                    int var48 = (int) ((float) var19 * var41 / var42 + (float) this.field198.field1480);
                    int var49 = this.field206[var35];
                    int var50 = this.field206[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field157[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[var52] = var47;
                        var34[var52] = var48;
                    }
                } else {
                    int var43 = this.field206[var35];
                    int var44 = this.field206[var35 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field157[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        var33[this.field157[var45] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field201; var36++) {
                if (var33[this.field180[var36]] != -999999 && var33[this.field179[var36]] != -999999 && var33[this.field123[var36]] != -999999 && this.method79(-89, arg0, var34[this.field180[var36]], var33[this.field180[var36]], arg2, var33[this.field123[var36]], var33[this.field179[var36]], var34[this.field179[var36]], var34[this.field123[var36]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hba", name = "fa", descriptor = "()I")
    public final int method118() {
        field174++;
        if (!this.field130) {
            this.method64(-122);
        }
        return this.field162;
    }

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "()V")
    public final void method119() {
        field149++;
    }

    @OriginalMember(owner = "client!hba", name = "G", descriptor = "()I")
    public final int method120() {
        field176++;
        if (!this.field130) {
            this.method64(-111);
        }
        return this.field106;
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lqfa;)V")
    public class10(class106 arg0) {
        this.field198 = arg0;
        this.field165 = new class189(null, 5126, 3, 0);
        this.field114 = new class189(null, 5126, 2, 0);
        this.field102 = new class189(null, 5126, 3, 0);
        this.field159 = new class189(null, 5121, 4, 0);
        this.field111 = new class82();
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lqfa;Ldba;IIII)V")
    public class10(class106 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field202 = arg5;
        this.field91 = arg2;
        this.field198 = arg0;
        if (class591.method3441(arg2, 102, arg5)) {
            this.field165 = new class189(null, 5126, 3, 0);
        }
        if (class161.method1217(arg2, (byte) -53, arg5)) {
            this.field114 = new class189(null, 5126, 2, 0);
        }
        if (class474.method2815(false, arg2, arg5)) {
            this.field102 = new class189(null, 5126, 3, 0);
        }
        if (class675.method3840(arg5, (byte) -108, arg2)) {
            this.field159 = new class189(null, 5121, 4, 0);
        }
        if (class132.method979(2048, arg5, arg2)) {
            this.field111 = new class82();
        }
        class160 var7 = arg0.field774;
        int[] var8 = new int[arg1.field1146];
        this.field206 = new int[arg1.field1172 + 1];
        for (int var9 = 0; var9 < arg1.field1146; var9++) {
            if (arg1.field1126 == null || arg1.field1126[var9] != 2) {
                if (arg1.field1161 != null && arg1.field1161[var9] != -1) {
                    class467 var173 = var7.method1208((byte) 47, arg1.field1161[var9] & 0xFFFF);
                    if (((this.field202 & 0x40) == 0 || !var173.field6570) && var173.field6563) {
                        continue;
                    }
                }
                var8[this.field201++] = var9;
                this.field206[arg1.field1175[var9]]++;
                this.field206[arg1.field1152[var9]]++;
                this.field206[arg1.field1158[var9]]++;
            }
        }
        this.field193 = this.field201;
        long[] var10 = new long[this.field201];
        boolean var11 = (this.field91 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field201; var12++) {
            int var156 = var8[var12];
            class467 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field1162 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field1162.length; var163++) {
                    class727 var164 = arg1.field1162[var163];
                    if (var164.field10042 == var156) {
                        class659 var165 = class144.method1022((byte) 43, var164.field10046);
                        if (var165.field9188) {
                            var162 = true;
                        }
                        if (var165.field9193 != -1) {
                            class467 var166 = var7.method1208((byte) 47, var165.field9193);
                            if (var166.field6581 == 2) {
                                this.field145 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field193--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field1161 != null) {
                var167 = arg1.field1161[var156];
                if (var167 != -1) {
                    var157 = var7.method1208((byte) 47, var167 & 0xFFFF);
                    if ((this.field202 & 0x40) != 0 && var157.field6570) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        if (var157.field6577 != 0 || var157.field6569 != 0) {
                            this.field104 = true;
                        }
                        var161 = var157.field6562;
                        var160 = var157.field6567;
                    }
                }
            }
            boolean var168 = arg1.field1122 != null && arg1.field1122[var156] != 0 || var157 != null && var157.field6581 != 0;
            if ((var11 || var168) && arg1.field1135 != null) {
                var158 += arg1.field1135[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = (var160 & 0xFF << 8) + var158;
            int var170 = ((var167 & 0xFFFF) << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + (long) var172;
            this.field104 |= var157 != null && (var157.field6577 != 0 || var157.field6569 != 0);
            this.field145 |= var168;
        }
        class685.method3863(var8, var10, 8);
        this.field171 = arg1.field1172;
        this.field183 = arg1.field1164;
        this.field107 = arg1.field1168;
        this.field134 = arg1.field1165;
        this.field196 = arg1.field1149;
        this.field181 = arg1.field1153;
        class92[] var13 = new class92[this.field171];
        this.field138 = arg1.field1160;
        this.field155 = arg1.field1142;
        if (arg1.field1162 != null) {
            this.field140 = arg1.field1162.length;
            this.field207 = new class191[this.field140];
            this.field144 = new class251[this.field140];
            for (int var14 = 0; var14 < this.field140; var14++) {
                class727 var15 = arg1.field1162[var14];
                class659 var16 = class144.method1022((byte) 92, var15.field10046);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field201; var18++) {
                    if (var8[var18] == var15.field10042) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class779.field10694[arg1.field1154[var15.field10042] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1122 == null ? 0 : arg1.field1122[var15.field10042]) << 24;
                this.field207[var14] = new class191(var17, arg1.field1175[var15.field10042], arg1.field1152[var15.field10042], arg1.field1158[var15.field10042], var16.field9190, var16.field9189, var16.field9193, var16.field9197, var16.field9192, var16.field9188, var16.field9196, var15.field10047);
                this.field144[var14] = new class251(var20);
            }
        }
        int var21 = this.field201 * 3;
        this.field180 = new short[this.field201];
        this.field186 = new float[var21];
        this.field109 = new short[var21];
        this.field160 = (short) arg3;
        this.field126 = new short[this.field201];
        this.field157 = new short[var21];
        this.field153 = (short) arg4;
        this.field179 = new short[this.field201];
        this.field167 = new byte[this.field201];
        this.field154 = new short[var21];
        this.field182 = new float[var21];
        this.field122 = new short[this.field201];
        this.field128 = new byte[var21];
        if (arg1.field1125 != null) {
            this.field191 = new short[this.field201];
        }
        class345.field4812 = new long[var21];
        this.field123 = new short[this.field201];
        this.field142 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1172; var23++) {
            int var155 = this.field206[var23];
            this.field206[var23] = var22;
            var22 += var155;
            var13[var23] = new class92();
        }
        this.field206[arg1.field1172] = var22;
        class301 var24 = class715.method4017(arg1, this.field201, 3, var8);
        class263[] var25 = new class263[arg1.field1146];
        for (int var26 = 0; var26 < arg1.field1146; var26++) {
            short var134 = arg1.field1175[var26];
            short var135 = arg1.field1152[var26];
            short var136 = arg1.field1158[var26];
            int var137 = this.field134[var135] - this.field134[var134];
            int var138 = this.field183[var135] - this.field183[var134];
            int var139 = this.field107[var135] - this.field107[var134];
            int var140 = this.field134[var136] - this.field134[var134];
            int var141 = this.field183[var136] - this.field183[var134];
            int var142 = this.field107[var136] - this.field107[var134];
            int var143 = var138 * var142 - var139 * var141;
            int var144 = var139 * var140 - (var137 * var142);
            int var145 = var137 * var141 - (var138 * var140);
            while (var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192) {
                var145 >>= 0x1;
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var144 * var144 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var145 * 256 / var146;
            int var149 = var144 * 256 / var146;
            byte var150 = arg1.field1126 == null ? 0 : arg1.field1126[var26];
            if (var150 == 0) {
                class92 var152 = var13[var134];
                var152.field1033 += var149;
                var152.field1031 += var147;
                var152.field1032 += var148;
                var152.field1028++;
                class92 var153 = var13[var135];
                var153.field1031 += var147;
                var153.field1032 += var148;
                var153.field1028++;
                var153.field1033 += var149;
                class92 var154 = var13[var136];
                var154.field1032 += var148;
                var154.field1033 += var149;
                var154.field1031 += var147;
                var154.field1028++;
            } else if (var150 == 1) {
                class263 var151 = var25[var26] = new class263();
                var151.field3851 = var148;
                var151.field3853 = var147;
                var151.field3857 = var149;
            }
        }
        for (int var27 = 0; var27 < this.field201; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field1154[var43] & 0xFFFF;
            int var45;
            if (arg1.field1174 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field1174[var43];
            }
            int var46;
            if (arg1.field1122 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field1122[var43] & 0xFF;
            }
            short var47 = arg1.field1161 == null ? -1 : arg1.field1161[var43];
            if (var47 != -1 && (this.field202 & 0x40) != 0) {
                class467 var48 = var7.method1208((byte) 47, var47 & 0xFFFF);
                if (var48.field6570) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var50 = 1.0F;
                    var55 = 1;
                    var51 = 1.0F;
                    var54 = 0.0F;
                    var52 = 1.0F;
                    var53 = 0.0F;
                    var49 = 0.0F;
                    var56 = 2;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field1163[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field1175[var43];
                        short var60 = arg1.field1152[var43];
                        short var61 = arg1.field1158[var43];
                        short var62 = arg1.field1170[var45];
                        short var63 = arg1.field1156[var45];
                        short var64 = arg1.field1131[var45];
                        float var65 = (float) arg1.field1165[var62];
                        float var66 = (float) arg1.field1164[var62];
                        float var67 = (float) arg1.field1168[var62];
                        float var68 = (float) arg1.field1165[var63] - var65;
                        float var69 = (float) arg1.field1164[var63] - var66;
                        float var70 = (float) arg1.field1168[var63] - var67;
                        float var71 = (float) arg1.field1165[var64] - var65;
                        float var72 = (float) arg1.field1164[var64] - var66;
                        float var73 = (float) arg1.field1168[var64] - var67;
                        float var74 = (float) arg1.field1165[var59] - var65;
                        float var75 = (float) arg1.field1164[var59] - var66;
                        float var76 = (float) arg1.field1168[var59] - var67;
                        float var77 = (float) arg1.field1165[var60] - var65;
                        float var78 = (float) arg1.field1164[var60] - var66;
                        float var79 = (float) arg1.field1168[var60] - var67;
                        float var80 = (float) arg1.field1165[var61] - var65;
                        float var81 = (float) arg1.field1164[var61] - var66;
                        float var82 = (float) arg1.field1168[var61] - var67;
                        float var83 = var69 * var73 - var70 * var72;
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - var69 * var71;
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - (var71 * var85);
                        float var88 = var71 * var84 - var72 * var83;
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        float var90 = var68 * var84 - (var69 * var83);
                        float var91 = var70 * var83 - (var68 * var85);
                        float var92 = var69 * var85 - var70 * var84;
                        float var93 = 1.0F / (var73 * var90 + var71 * var92 + var72 * var91);
                        var54 = (var82 * var90 + var80 * var92 + var81 * var91) * var93;
                        var52 = (var79 * var90 + var77 * var92 + var78 * var91) * var93;
                        var50 = (var76 * var90 + var74 * var92 + var75 * var91) * var93;
                    } else {
                        short var94 = arg1.field1175[var43];
                        short var95 = arg1.field1152[var43];
                        short var96 = arg1.field1158[var43];
                        int var97 = var24.field4337[var45];
                        int var98 = var24.field4339[var45];
                        int var99 = var24.field4343[var45];
                        float[] var100 = var24.field4346[var45];
                        byte var101 = arg1.field1145[var45];
                        float var102 = (float) arg1.field1177[var45] / 256.0F;
                        if (var58 == 1) {
                            float var120 = (float) arg1.field1151[var45] / 1024.0F;
                            class294.method1910(arg1.field1168[var94], var120, var102, var97, arg1.field1164[var94], var99, class514.field7279, var101, var98, arg1.field1165[var94], 0, var100);
                            var50 = class514.field7279[1];
                            var49 = class514.field7279[0];
                            class294.method1910(arg1.field1168[var95], var120, var102, var97, arg1.field1164[var95], var99, class514.field7279, var101, var98, arg1.field1165[var95], 0, var100);
                            var51 = class514.field7279[0];
                            var52 = class514.field7279[1];
                            class294.method1910(arg1.field1168[var96], var120, var102, var97, arg1.field1164[var96], var99, class514.field7279, var101, var98, arg1.field1165[var96], 0, var100);
                            var53 = class514.field7279[0];
                            var54 = class514.field7279[1];
                            float var121 = var120 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var121 < var53 - var49)) {
                                    var53 -= var120;
                                    var56 = 1;
                                } else if (var49 - var53 > var121) {
                                    var56 = 2;
                                    var53 += var120;
                                }
                                if ((var51 - var49 > var121)) {
                                    var51 -= var120;
                                    var55 = 1;
                                } else if (var49 - var51 > var121) {
                                    var51 += var120;
                                    var55 = 2;
                                }
                            } else {
                                if ((var52 - var50 > var121)) {
                                    var55 = 1;
                                    var52 -= var120;
                                } else if (var121 < var50 - var52) {
                                    var52 += var120;
                                    var55 = 2;
                                }
                                if (var54 - var50 > var121) {
                                    var56 = 1;
                                    var54 -= var120;
                                } else if (var121 < var50 - var54) {
                                    var56 = 2;
                                    var54 += var120;
                                }
                            }
                        } else if (var58 == 2) {
                            float var103 = (float) arg1.field1141[var45] / 256.0F;
                            float var104 = (float) arg1.field1176[var45] / 256.0F;
                            int var105 = arg1.field1165[var95] - arg1.field1165[var94];
                            int var106 = arg1.field1164[var95] - arg1.field1164[var94];
                            int var107 = arg1.field1168[var95] - arg1.field1168[var94];
                            int var108 = arg1.field1165[var96] - arg1.field1165[var94];
                            int var109 = arg1.field1164[var96] - arg1.field1164[var94];
                            int var110 = arg1.field1168[var96] - arg1.field1168[var94];
                            int var111 = var106 * var110 - (var107 * var109);
                            int var112 = var107 * var108 - (var105 * var110);
                            int var113 = var105 * var109 - (var106 * var108);
                            float var114 = 64.0F / (float) arg1.field1128[var45];
                            float var115 = 64.0F / (float) arg1.field1144[var45];
                            float var116 = 64.0F / (float) arg1.field1151[var45];
                            float var117 = (var100[2] * (float) var113 + var100[1] * (float) var112 + var100[0] * (float) var111) / var114;
                            float var118 = (var100[5] * (float) var113 + var100[3] * (float) var111 + var100[4] * (float) var112) / var115;
                            float var119 = (var100[8] * (float) var113 + var100[7] * (float) var112 + var100[6] * (float) var111) / var116;
                            var57 = class606.method3518(var118, var119, (byte) -85, var117);
                            class728.method4072(arg1.field1168[var94], var101, class514.field7279, var57, var104, var102, var97, var100, arg1.field1164[var94], arg1.field1165[var94], 1, var103, var98, var99);
                            var50 = class514.field7279[1];
                            var49 = class514.field7279[0];
                            class728.method4072(arg1.field1168[var95], var101, class514.field7279, var57, var104, var102, var97, var100, arg1.field1164[var95], arg1.field1165[var95], 1, var103, var98, var99);
                            var52 = class514.field7279[1];
                            var51 = class514.field7279[0];
                            class728.method4072(arg1.field1168[var96], var101, class514.field7279, var57, var104, var102, var97, var100, arg1.field1164[var96], arg1.field1165[var96], 1, var103, var98, var99);
                            var54 = class514.field7279[1];
                            var53 = class514.field7279[0];
                        } else if (var58 == 3) {
                            class6.method45(arg1.field1168[var94], var99, 5, var97, arg1.field1164[var94], var98, arg1.field1165[var94], var101, var100, var102, class514.field7279);
                            var50 = class514.field7279[1];
                            var49 = class514.field7279[0];
                            class6.method45(arg1.field1168[var95], var99, 5, var97, arg1.field1164[var95], var98, arg1.field1165[var95], var101, var100, var102, class514.field7279);
                            var52 = class514.field7279[1];
                            var51 = class514.field7279[0];
                            class6.method45(arg1.field1168[var96], var99, 5, var97, arg1.field1164[var96], var98, arg1.field1165[var96], var101, var100, var102, class514.field7279);
                            var53 = class514.field7279[0];
                            var54 = class514.field7279[1];
                            if ((var101 & 0x1) == 0) {
                                if ((var53 - var49 > 0.5F)) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                                if ((var51 - var49 > 0.5F)) {
                                    var55 = 1;
                                    var51--;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field1126 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field1126[var43];
            }
            if (var122 == 0) {
                long var123 = ((long) (var57 << 24) + (long) var46 + ((long) (var44 << 8)) << 32) + (long) (var45 << 2);
                short var125 = arg1.field1175[var43];
                short var126 = arg1.field1152[var43];
                short var127 = arg1.field1158[var43];
                class92 var128 = var13[var125];
                this.field180[var27] = this.method83(var128.field1032, var50, var128.field1033, var128.field1031, var49, var128.field1028, 1, var125, var123, arg1);
                class92 var129 = var13[var126];
                this.field179[var27] = this.method83(var129.field1032, var52, var129.field1033, var129.field1031, var51, var129.field1028, 1, var126, (long) var55 + var123, arg1);
                class92 var130 = var13[var127];
                this.field123[var27] = this.method83(var130.field1032, var54, var130.field1033, var130.field1031, var53, var130.field1028, 1, var127, (long) var56 + var123, arg1);
            } else if (var122 == 1) {
                class263 var131 = var25[var43];
                long var132 = (long) ((var45 << 2) + (var131.field3857 + 256 << 12) + (var131.field3851 - -256 << 22) + (var131.field3853 > 0 ? 1024 : 2048)) + ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32);
                this.field180[var27] = this.method83(var131.field3851, var50, var131.field3857, var131.field3853, var49, 0, 1, arg1.field1175[var43], var132, arg1);
                this.field179[var27] = this.method83(var131.field3851, var52, var131.field3857, var131.field3853, var51, 0, 1, arg1.field1152[var43], (long) var55 + var132, arg1);
                this.field123[var27] = this.method83(var131.field3851, var54, var131.field3857, var131.field3853, var53, 0, 1, arg1.field1158[var43], (long) var56 + var132, arg1);
            }
            if (arg1.field1122 != null) {
                this.field167[var27] = arg1.field1122[var43];
            }
            if (arg1.field1125 != null) {
                this.field191[var27] = arg1.field1125[var43];
            }
            this.field122[var27] = arg1.field1154[var43];
            this.field126[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field193; var30++) {
            short var42 = this.field126[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field190 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field193; var33++) {
            short var41 = this.field126[var33];
            if (var32 != var41) {
                this.field190[var31++] = var33;
                var32 = var41;
            }
        }
        this.field190[var31] = this.field193;
        class345.field4812 = null;
        this.field109 = class562.method3316(this.field112, (byte) -124, this.field109);
        this.field154 = class562.method3316(this.field112, (byte) -106, this.field154);
        this.field142 = class562.method3316(this.field112, (byte) -91, this.field142);
        this.field128 = class496.method3010(this.field128, this.field112, (byte) -76);
        this.field186 = class295.method1921(this.field112, 1, this.field186);
        this.field182 = class295.method1921(this.field112, 1, this.field182);
        if (arg1.field1173 != null && class297.method1931(arg2, this.field202, 0)) {
            this.field127 = arg1.method710(false, -9576);
        }
        if (arg1.field1162 != null && class248.method1635(arg2, this.field202, (byte) -124)) {
            this.field173 = arg1.method723(0);
        }
        if (arg1.field1138 != null && class362.method2276((byte) -123, arg2, this.field202)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field201; var36++) {
                int var40 = arg1.field1138[var8[var36]];
                if (var40 >= 0) {
                    if (var34 < var40) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field175 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field175[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field201; var38++) {
                int var39 = arg1.field1138[var8[var38]];
                if (var39 >= 0) {
                    this.field175[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hba", name = "F", descriptor = "()Z")
    public final boolean method121() {
        field163++;
        return this.field145;
    }
}
