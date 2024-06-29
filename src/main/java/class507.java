import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class507 extends class712 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    private int field7146 = 0;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    private int field7160 = 0;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    private int field7164 = 0;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Z")
    private boolean field7162 = false;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    private int field7169 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    private int field7145;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    private int field7153;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lbm;")
    private class684 field7152;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "Lbaa;")
    private class620 field7170;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Z")
    private boolean field7166;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
    private boolean field7148;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Z")
    private boolean field7158;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Z")
    private boolean field7171;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Lan;")
    public static class182 field7167 = new class182(11, 3);

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "[I")
    public static int[] field7175 = new int[8];

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1883(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field7156++;
        class462 var11 = this.field7152.method3750((byte) 127);
        class462 var12 = this.field7152.method3729(1);
        this.field7170.method1466(this.field7166 || this.field7148 || (arg9 & 0x1) == 0 ? class211.field2698 : class650.field8933, 13584);
        this.field7152.method3778(false);
        this.field7152.method3711(false, this.field7170);
        this.field7152.method3737(3793, arg8);
        this.field7152.method3781(-3, arg6);
        this.field7152.method3777(false, 1, class663.field9083);
        this.field7152.method3713(class663.field9083, 1, (byte) -43);
        this.field7152.method3717(arg7, (byte) -101);
        if (this.field7162) {
            float var13 = (float) this.method1892();
            float var14 = (float) this.method1882();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field7146 * var17;
            float var20 = (float) this.field7146 * var18;
            float var21 = (float) this.field7160 * var15;
            float var22 = (float) this.field7160 * var16;
            float var23 = (float) this.field7169 * -var15;
            float var24 = (float) this.field7169 * -var16;
            float var25 = (float) this.field7164 * -var17;
            arg2 = arg2 + var23 + var19;
            arg3 = arg3 + var24 + var20;
            arg4 = arg4 + var21 + var25;
            float var26 = (float) this.field7164 * -var18;
            arg1 = arg1 + var22 + var20;
            arg0 = arg0 + var21 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2741(0.0F, arg4 - arg0, -arg1 + arg5, 1.0F, 0.0F, 0.0F, arg2 - arg0, arg3 - arg1, 0.0F, false);
        var11.method2719(-29278, arg0, arg1, 0.0F);
        var12.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
        this.field7152.method3771(0, class641.field8858);
        this.field7152.method3744(false);
        this.field7152.method3758((byte) -50);
        this.field7152.method3734((byte) -14);
        this.field7152.method3777(false, 1, class155.field1970);
        this.field7152.method3713(class155.field1970, 1, (byte) -84);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7150++;
        class462 var6 = this.field7152.method3750((byte) 121);
        class462 var7 = this.field7152.method3729(1);
        int var8 = this.field7146 + arg1;
        int var9 = this.field7160 + arg0;
        this.field7170.method1466(class211.field2698, 13584);
        this.field7152.method3778(false);
        this.field7152.method3711(false, this.field7170);
        this.field7152.method3737(3793, arg4);
        this.field7152.method3781(-3, arg2);
        this.field7152.method3777(false, 1, class663.field9083);
        this.field7152.method3713(class663.field9083, 1, (byte) 116);
        this.field7152.method3717(arg3, (byte) -111);
        var6.method2738((float) this.field7145, 0.0F, (float) this.field7153, 13);
        var6.method1973(var9, var8, 0);
        var7.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
        this.field7152.method3771(0, class641.field8858);
        this.field7152.method3744(false);
        this.field7152.method3758((byte) 99);
        this.field7152.method3734((byte) -14);
        this.field7152.method3777(false, 1, class155.field1970);
        this.field7152.method3713(class155.field1970, 1, (byte) -119);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V")
    public final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7173++;
        class462 var9 = this.field7152.method3750((byte) -73);
        class462 var10 = this.field7152.method3729(1);
        this.field7170.method1466(this.field7166 || this.field7148 || (arg7 & 0x1) == 0 ? class211.field2698 : class650.field8933, 13584);
        this.field7152.method3778(false);
        this.field7152.method3711(false, this.field7170);
        this.field7152.method3737(3793, arg6);
        this.field7152.method3781(-3, arg4);
        this.field7152.method3777(false, 1, class663.field9083);
        this.field7152.method3713(class663.field9083, 1, (byte) -73);
        this.field7152.method3717(arg5, (byte) -105);
        var10.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
        if (this.field7162) {
            arg2 = this.field7153 * arg2 / this.method1892();
            arg3 = this.field7145 * arg3 / this.method1882();
            arg1 += this.field7146 * arg3 / this.field7145;
            arg0 += this.field7160 * arg2 / this.field7153;
        }
        var9.method2738((float) arg3, 0.0F, (float) arg2, 13);
        var9.method1973(arg0, arg1, 0);
        this.field7152.method3771(0, class641.field8858);
        this.field7152.method3744(false);
        this.field7152.method3758((byte) 76);
        this.field7152.method3734((byte) -14);
        this.field7152.method3777(false, 1, class155.field1970);
        this.field7152.method3713(class155.field1970, 1, (byte) -52);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()I")
    public final int method1895() {
        field7157++;
        return this.field7153;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V")
    public final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7144++;
        class462 var8 = this.field7152.method3750((byte) -15);
        class462 var9 = this.field7152.method3729(1);
        this.field7170.method1466(class211.field2698, 13584);
        this.field7152.method3778(false);
        this.field7152.method3711(false, this.field7170);
        this.field7152.method3737(3793, arg6);
        this.field7152.method3781(-3, arg4);
        this.field7152.method3777(false, 1, class663.field9083);
        this.field7152.method3713(class663.field9083, 1, (byte) -85);
        this.field7152.method3717(arg5, (byte) -109);
        boolean var10 = this.field7171 && this.field7146 == 0 && this.field7164 == 0;
        boolean var11 = this.field7158 && this.field7160 == 0 && this.field7169 == 0;
        if ((var10 & var11)) {
            var9.method2738(this.field7170.method374((float) arg3, true), 1.0F, this.field7170.method376((float) arg2, -31566), 13);
            var8.method2738((float) arg3, 0.0F, (float) arg2, 13);
            var8.method1973(arg0, arg1, 0);
            this.field7152.method3771(0, class641.field8858);
            this.field7152.method3744(false);
            this.field7152.method3758((byte) -75);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method1882();
            var9.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) arg2, -31566), 13);
            this.field7152.method3771(0, class641.field8858);
            int var32 = arg1 + this.field7146;
            int var33 = this.field7145 + var32;
            while (var33 <= var30) {
                var8.method2738((float) this.field7145, 0.0F, (float) arg2, 13);
                var8.method1973(arg0, var32, 0);
                this.field7152.method3744(false);
                var33 += var31;
                this.field7152.method3758((byte) 102);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2738(this.field7170.method374((float) var34, true), 1.0F, this.field7170.method376((float) arg2, -31566), 13);
                this.field7152.method3771(0, class641.field8858);
                var8.method2738((float) var34, 0.0F, (float) arg2, 13);
                var8.method1973(arg0, var32, 0);
                this.field7152.method3744(false);
                this.field7152.method3758((byte) -80);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method1892();
            var9.method2738(this.field7170.method374((float) arg3, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
            this.field7152.method3771(0, class641.field8858);
            int var14 = this.field7160 + arg0;
            for (int var15 = this.field7153 + var14; var15 <= var12; var15 += var13) {
                var8.method2738((float) arg3, 0.0F, (float) this.field7153, 13);
                var8.method1973(var14, arg1, 0);
                this.field7152.method3744(false);
                this.field7152.method3758((byte) 119);
                var14 += var13;
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method2738(this.field7170.method374((float) arg3, true), 1.0F, this.field7170.method376((float) var16, -31566), 13);
                this.field7152.method3771(0, class641.field8858);
                var8.method2738((float) arg3, 0.0F, (float) var16, 13);
                var8.method1973(var14, arg1, 0);
                this.field7152.method3744(false);
                this.field7152.method3758((byte) 120);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1892();
            int var20 = this.method1882();
            int var21 = arg1 + this.field7146;
            for (int var22 = this.field7145 + var21; var22 <= var17; var22 += var20) {
                var9.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
                this.field7152.method3771(0, class641.field8858);
                int var27 = this.field7160 + arg0;
                int var28 = this.field7153 + var27;
                while (var28 <= var18) {
                    var8.method2738((float) this.field7145, 0.0F, (float) this.field7153, 13);
                    var8.method1973(var27, var21, 0);
                    this.field7152.method3744(false);
                    var28 += var19;
                    var27 += var19;
                    this.field7152.method3758((byte) 116);
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) var29, -31566), 13);
                    this.field7152.method3771(0, class641.field8858);
                    var8.method2738((float) this.field7145, 0.0F, (float) var29, 13);
                    var8.method1973(var27, var21, 0);
                    this.field7152.method3744(false);
                    this.field7152.method3758((byte) -128);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2738(this.field7170.method374((float) var23, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
                this.field7152.method3771(0, class641.field8858);
                int var24 = this.field7160 + arg0;
                int var25 = this.field7153 + var24;
                while (var25 <= var18) {
                    var8.method2738((float) var23, 0.0F, (float) this.field7153, 13);
                    var8.method1973(var24, var21, 0);
                    this.field7152.method3744(false);
                    var25 += var19;
                    this.field7152.method3758((byte) 100);
                    var24 += var19;
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method2738(this.field7170.method374((float) var23, true), 1.0F, this.field7170.method376((float) var26, -31566), 13);
                    this.field7152.method3771(0, class641.field8858);
                    var8.method2738((float) var23, 0.0F, (float) var26, 13);
                    var8.method1973(var24, var21, 0);
                    this.field7152.method3744(false);
                    this.field7152.method3758((byte) -97);
                }
            }
        }
        this.field7152.method3734((byte) -14);
        this.field7152.method3777(false, 1, class155.field1970);
        this.field7152.method3713(class155.field1970, 1, (byte) -90);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        field7161++;
        int[] var4 = this.field7152.method143(arg0, arg1, this.field7153, this.field7145);
        int[] var5 = new int[this.field7153 * this.field7145];
        this.field7170.method372(this.field7145, (byte) -100, 0, 0, 0, this.field7153, var5);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field7145; var6++) {
                int var7 = this.field7153 * var6;
                for (int var8 = 0; var8 < this.field7153; var8++) {
                    var5[var7 + var8] = class216.method1308(class272.method1629(16777215, var5[var7 + var8]), class272.method1629(var4[var7 + var8] << 8, -16777123));
                }
            }
        } else if (arg2 == 1) {
            for (int var15 = 0; var15 < this.field7145; var15++) {
                int var16 = this.field7153 * var15;
                for (int var17 = 0; var17 < this.field7153; var17++) {
                    var5[var16 + var17] = class216.method1308(class272.method1629(-1693319424, var4[var16 + var17]) << 16, class272.method1629(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field7145; var9++) {
                int var10 = this.field7153 * var9;
                for (int var11 = 0; var11 < this.field7153; var11++) {
                    var5[var10 + var11] = class216.method1308(class272.method1629(var4[var10 + var11] << 24, -8249536), class272.method1629(16777215, var5[var10 + var11]));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field7145; var12++) {
                int var13 = this.field7153 * var12;
                for (int var14 = 0; var14 < this.field7153; var14++) {
                    var5[var13 + var14] = class216.method1308(var4[var13 + var14] == 0 ? 0 : -16777216, class272.method1629(16777215, var5[var13 + var14]));
                }
            }
        }
        this.method2930(0, 0, this.field7153, this.field7145, var5, 0, this.field7153);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1887(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class81 arg7, int arg8, int arg9) {
        field7149++;
        class462 var11 = this.field7152.method3750((byte) -18);
        class462 var12 = this.field7152.method3729(1);
        class251 var13 = (class251) arg7;
        class620 var14 = var13.field3183;
        this.field7170.method1466(this.field7166 || this.field7148 || (arg6 & 0x1) == 0 ? class211.field2698 : class650.field8933, 13584);
        this.field7152.method3778(false);
        this.field7152.method3711(false, this.field7170);
        this.field7152.method3737(3793, 1);
        this.field7152.method3781(-3, 1);
        if (this.field7162) {
            float var15 = (float) this.field7153 / (float) this.method1892();
            float var16 = (float) this.field7145 / (float) this.method1882();
            var11.method2741(0.0F, (arg4 - arg0) * var16, (arg5 - arg1) * var16, 1.0F, 0.0F, 0.0F, (arg2 - arg0) * var15, (arg3 - arg1) * var15, 0.0F, false);
            var11.method2719(-29278, ((float) this.field7160 + arg0) * var15, ((float) this.field7146 + arg1) * var16, 0.0F);
        } else {
            var11.method2741(0.0F, arg4 - arg0, -arg1 + arg5, 1.0F, 0.0F, 0.0F, arg2 - arg0, -arg1 + arg3, 0.0F, false);
            var11.method2719(-29278, arg0, arg1, 0.0F);
        }
        var12.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
        this.field7152.method3771(0, class641.field8858);
        this.field7152.method3723(true, 1);
        this.field7152.method3711(false, var14);
        this.field7152.method3708(114, class155.field1901, class409.field5765);
        this.field7152.method3777(false, 0, class155.field1970);
        class462 var17 = this.field7152.method3729(1);
        var17.method1961(var11);
        var17.method1973(-arg8, -arg9, 0);
        var17.method2725(1.0F, var14.method374(1.0F, true), -29337, var14.method376(1.0F, -31566));
        this.field7152.method3771(0, class641.field8858);
        this.field7152.method3744(false);
        this.field7152.method3758((byte) 101);
        this.field7152.method3734((byte) -14);
        this.field7152.method3777(false, 0, class632.field8774);
        this.field7152.method3708(82, class155.field1901, class155.field1901);
        this.field7152.method3711(false, null);
        this.field7152.method3723(true, 0);
        this.field7152.method3734((byte) -14);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)V")
    public static final void method2929(int arg0, byte arg1) {
        field7168++;
        class548 var2 = class696.method3872(arg0, 16, -1633381944);
        var2.method3127((byte) -57);
        if (arg1 >= -121) {
            method2932(-98, 103, -36);
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()I")
    public final int method1892() {
        field7174++;
        return this.field7153 - (-this.field7169 - this.field7160);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([I)V")
    public final void method1873(int[] arg0) {
        arg0[3] = this.field7164;
        arg0[0] = this.field7160;
        arg0[2] = this.field7169;
        arg0[1] = this.field7146;
        field7147++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()I")
    public final int method1882() {
        field7163++;
        return this.field7146 + this.field7145 + this.field7164;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
    public final void method1874(int arg0, int arg1, int arg2, int arg3) {
        this.field7160 = arg0;
        this.field7164 = arg3;
        this.field7146 = arg1;
        this.field7169 = arg2;
        field7159++;
        this.field7162 = this.field7160 != 0 || this.field7146 != 0 || this.field7169 != 0 || this.field7164 != 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII[III)V")
    private final void method2930(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field7151++;
        this.field7170.method380(arg2, arg3, arg1, arg4, arg5, -19156, arg0, arg6);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method2931(int arg0) {
        field7175 = null;
        if (arg0 <= 13) {
            field7175 = null;
        }
        field7167 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)I")
    public static final int method2932(int arg0, int arg1, int arg2) {
        if (arg2 < 91) {
            method2929(-106, (byte) 57);
        }
        field7172++;
        return arg1 == 1 || arg1 == 3 ? class241.field3107[arg0 & 0x3] : class615.field8610[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILaa;II)V")
    public final void method691(int arg0, int arg1, class81 arg2, int arg3, int arg4) {
        field7155++;
        class251 var6 = (class251) arg2;
        int var7 = this.field7160 + arg0;
        int var8 = this.field7146 + arg1;
        class620 var9 = var6.field3183;
        this.field7170.method1466(class211.field2698, 13584);
        this.field7152.method3778(false);
        this.field7152.method3711(false, this.field7170);
        this.field7152.method3737(3793, 1);
        this.field7152.method3781(-3, 1);
        class462 var10 = this.field7152.method3750((byte) -101);
        var10.method2738((float) this.field7145, 0.0F, (float) this.field7153, 13);
        var10.method1973(var7, var8, 0);
        this.field7152.method3744(false);
        class462 var11 = this.field7152.method3729(1);
        var11.method2738(this.field7170.method374((float) this.field7145, true), 1.0F, this.field7170.method376((float) this.field7153, -31566), 13);
        this.field7152.method3771(0, class641.field8858);
        this.field7152.method3723(true, 1);
        this.field7152.method3711(false, var9);
        this.field7152.method3708(93, class155.field1901, class409.field5765);
        this.field7152.method3777(false, 0, class155.field1970);
        class462 var12 = this.field7152.method3729(1);
        var12.method2738(var9.method374((float) this.field7145, true), 1.0F, var9.method376((float) this.field7153, -31566), 13);
        var12.method2719(-29278, var9.method376((float) (var7 - arg3), -31566), var9.method374((float) (var8 - arg4), true), 0.0F);
        this.field7152.method3771(0, class641.field8858);
        this.field7152.method3758((byte) -76);
        this.field7152.method3734((byte) -14);
        this.field7152.method3777(false, 0, class632.field8774);
        this.field7152.method3708(111, class155.field1901, class155.field1901);
        this.field7152.method3711(false, null);
        this.field7152.method3723(true, 0);
        this.field7152.method3734((byte) -14);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
    public final void method688(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7154++;
        int[] var7 = this.field7152.method143(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class216.method1308(var7[var8], -16777216);
            }
            this.method2930(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
    public final int method1893() {
        field7165++;
        return this.field7145;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lbm;IIZ)V")
    public class507(class684 arg0, int arg1, int arg2, boolean arg3) {
        this.field7145 = arg2;
        this.field7153 = arg1;
        this.field7152 = arg0;
        this.field7170 = arg0.method1401(arg3 ? class440.field6178 : class300.field3868, arg1, class240.field3093, true, arg2);
        this.field7170.method381(true, -13021, true);
        this.field7166 = this.field7170.method378(3631) != arg1;
        this.field7148 = this.field7170.method373(-15836) != arg2;
        this.field7158 = !this.field7166 && this.field7170.method375((byte) 35);
        this.field7171 = !this.field7148 && this.field7170.method375((byte) 35);
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lbm;II[III)V")
    public class507(class684 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field7152 = arg0;
        this.field7153 = arg1;
        this.field7145 = arg2;
        this.field7170 = arg0.method1438(-95, arg2, arg1, arg3, false, arg4, arg5);
        this.field7170.method381(true, -13021, true);
        this.field7166 = this.field7170.method378(3631) != arg1;
        this.field7148 = arg2 != this.field7170.method373(-15836);
        this.field7158 = !this.field7166 && this.field7170.method375((byte) 35);
        this.field7171 = !this.field7148 && this.field7170.method375((byte) 35);
    }
}
