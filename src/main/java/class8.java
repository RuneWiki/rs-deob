import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class8 extends class256 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
    private boolean field219 = false;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    private int field237 = 0;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    private int field239 = 0;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    private int field241 = 0;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    private int field245 = 0;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lum;")
    private class528 field243;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "Lfj;")
    private class75 field249;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Z")
    private boolean field221;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
    private boolean field220;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
    private boolean field242;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Z")
    private boolean field227;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
    public static int[] field230 = new int[1000];

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!eb", name = "ca", descriptor = "()I")
    public final int method43() {
        field236++;
        return this.field241 + this.field222 + this.field239;
    }

    @OriginalMember(owner = "client!eb", name = "da", descriptor = "(IIIIII)V")
    public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field246++;
        int[] var7 = this.field243.method702(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class151.method1076(var7[var8], -16777216);
            }
            this.method59(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILps;)V")
    public static final void method45(int arg0, class5 arg1) {
        field240++;
        if (arg0 != 256) {
            method47(true);
        }
        if (class279.field3692 != arg1.field96) {
            return;
        }
        if (class321.field4681.field1094 == null) {
            arg1.field105 = 0;
            arg1.field185 = 0;
            return;
        }
        arg1.field164 = 150;
        arg1.field54 = (int) (Math.sin((double) class45.field685 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field142 = 5;
        arg1.field105 = class478.field6850;
        arg1.field185 = class323.method2004(class321.field4681.field1094, (byte) 59);
        arg1.field69 = 0;
        arg1.field51 = class321.field4681.field7334;
        arg1.field56 = class321.field4681.field7367;
        arg1.field115 = class321.field4681.field7414;
        class47 var2 = arg1.field51 == -1 ? null : class203.field2769.method2971(-61, arg1.field51);
        if (var2 != null) {
            class196.method1283(var2, 7, arg1.field56);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
    public static final void method46(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field226++;
        class489 var5 = class704.method3942(arg1, 4, 0);
        var5.method2797(-1);
        var5.field6942 = arg4;
        var5.field6945 = arg3;
        if (arg0 >= 41) {
            var5.field6952 = arg2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static final void method47(boolean arg0) {
        field231++;
        class692 var1 = class449.field6502;
        synchronized (class449.field6502) {
            class449.field6502.method3891(13747);
        }
        if (arg0) {
            field230 = null;
        }
        class692 var2 = class495.field7010;
        synchronized (class495.field7010) {
            class495.field7010.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "()I")
    public final int method48() {
        field238++;
        return this.field232;
    }

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field223++;
        class300 var6 = this.field243.method3014(-11433);
        class300 var7 = this.field243.method3032(-30);
        int var8 = this.field239 + arg1;
        int var9 = this.field237 + arg0;
        this.field249.method1215(class81.field1300, 19759);
        this.field243.method3023(0);
        this.field243.method3011(-127, this.field249);
        this.field243.method3068(122, arg4);
        this.field243.method3037(arg2, true);
        this.field243.method3025(class475.field6812, -1, 1);
        this.field243.method3019(1, 0, class475.field6812);
        this.field243.method3028(arg3, false);
        var6.method1867((float) this.field232, 0.0F, (float) this.field222, -109);
        var6.method893(var9, var8, 0);
        var7.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) this.field222, -73), -119);
        this.field243.method3045(-128, class635.field9152);
        this.field243.method2989((byte) -18);
        this.field243.method2995((byte) 115);
        this.field243.method3003(1);
        this.field243.method3025(class11.field273, -1, 1);
        this.field243.method3019(1, 0, class11.field273);
    }

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "()I")
    public final int method50() {
        field229++;
        return this.field237 + this.field232 + this.field245;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILua;II)V")
    public final void method51(int arg0, int arg1, class591 arg2, int arg3, int arg4) {
        field247++;
        class571 var6 = (class571) arg2;
        int var7 = this.field239 + arg1;
        int var8 = this.field237 + arg0;
        class75 var9 = var6.field8300;
        this.field249.method1215(class81.field1300, 19759);
        this.field243.method3023(0);
        this.field243.method3011(-128, this.field249);
        this.field243.method3068(123, 1);
        this.field243.method3037(1, true);
        class300 var10 = this.field243.method3014(-11433);
        var10.method1867((float) this.field232, 0.0F, (float) this.field222, -86);
        var10.method893(var8, var7, 0);
        this.field243.method2989((byte) -18);
        class300 var11 = this.field243.method3032(-30);
        var11.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) this.field222, -88), -97);
        this.field243.method3045(-118, class635.field9152);
        this.field243.method3050(1, 0);
        this.field243.method3011(-127, var9);
        this.field243.method3013(class519.field7276, 106, class492.field6998);
        this.field243.method3025(class11.field273, -1, 0);
        class300 var12 = this.field243.method3032(-30);
        var12.method1867(var9.method433(-27156, (float) this.field232), 1.0F, var9.method429((float) this.field222, -40), -128);
        var12.method1870(0.0F, 0, var9.method429((float) (var7 - arg4), -59), var9.method433(-27156, (float) (var8 - arg3)));
        this.field243.method3045(-126, class635.field9152);
        this.field243.method2995((byte) 105);
        this.field243.method3003(1);
        this.field243.method3025(class283.field3777, -1, 0);
        this.field243.method3013(class492.field6998, 105, class492.field6998);
        this.field243.method3011(-128, null);
        this.field243.method3050(0, 0);
        this.field243.method3003(1);
    }

    @OriginalMember(owner = "client!eb", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field224++;
        class300 var9 = this.field243.method3014(-11433);
        class300 var10 = this.field243.method3032(-30);
        this.field249.method1215(this.field221 || this.field220 || (arg7 & 0x1) == 0 ? class81.field1300 : class264.field3448, 19759);
        this.field243.method3023(0);
        this.field243.method3011(-128, this.field249);
        this.field243.method3068(124, arg6);
        this.field243.method3037(arg4, true);
        this.field243.method3025(class475.field6812, -1, 1);
        this.field243.method3019(1, 0, class475.field6812);
        this.field243.method3028(arg5, false);
        var10.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) this.field222, -87), -90);
        if (this.field219) {
            arg2 = this.field232 * arg2 / this.method50();
            arg3 = this.field222 * arg3 / this.method43();
            arg0 += this.field237 * arg2 / this.field232;
            arg1 += this.field239 * arg3 / this.field222;
        }
        var9.method1867((float) arg2, 0.0F, (float) arg3, -115);
        var9.method893(arg0, arg1, 0);
        this.field243.method3045(-128, class635.field9152);
        this.field243.method2989((byte) -18);
        this.field243.method2995((byte) 119);
        this.field243.method3003(1);
        this.field243.method3025(class11.field273, -1, 1);
        this.field243.method3019(1, 0, class11.field273);
    }

    @OriginalMember(owner = "client!eb", name = "DA", descriptor = "(IIIIIII)V")
    public final void method53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field244++;
        class300 var8 = this.field243.method3014(-11433);
        class300 var9 = this.field243.method3032(-30);
        this.field249.method1215(class81.field1300, 19759);
        this.field243.method3023(0);
        this.field243.method3011(-127, this.field249);
        this.field243.method3068(122, arg6);
        this.field243.method3037(arg4, true);
        this.field243.method3025(class475.field6812, -1, 1);
        this.field243.method3019(1, 0, class475.field6812);
        this.field243.method3028(arg5, false);
        boolean var10 = this.field227 && this.field239 == 0 && this.field241 == 0;
        boolean var11 = this.field242 && this.field237 == 0 && this.field245 == 0;
        if (var11 & var10) {
            var9.method1867(this.field249.method433(-27156, (float) arg2), 1.0F, this.field249.method429((float) arg3, -92), -97);
            var8.method1867((float) arg2, 0.0F, (float) arg3, -99);
            var8.method893(arg0, arg1, 0);
            this.field243.method3045(-127, class635.field9152);
            this.field243.method2989((byte) -18);
            this.field243.method2995((byte) 125);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method43();
            var9.method1867(this.field249.method433(-27156, (float) arg2), 1.0F, this.field249.method429((float) this.field222, -50), -83);
            this.field243.method3045(-125, class635.field9152);
            int var14 = this.field239 + arg1;
            int var15 = this.field222 + var14;
            while (var15 <= var12) {
                var8.method1867((float) arg2, 0.0F, (float) this.field222, -82);
                var8.method893(arg0, var14, 0);
                this.field243.method2989((byte) -18);
                var15 += var13;
                this.field243.method2995((byte) 109);
                var14 += var13;
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method1867(this.field249.method433(-27156, (float) arg2), 1.0F, this.field249.method429((float) var16, -45), -113);
                this.field243.method3045(-118, class635.field9152);
                var8.method1867((float) arg2, 0.0F, (float) var16, -82);
                var8.method893(arg0, var14, 0);
                this.field243.method2989((byte) -18);
                this.field243.method2995((byte) 121);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method50();
            var9.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) arg3, -125), -124);
            this.field243.method3045(-115, class635.field9152);
            int var32 = this.field237 + arg0;
            int var33 = var32 + this.field232;
            while (var33 <= var30) {
                var8.method1867((float) this.field232, 0.0F, (float) arg3, -97);
                var8.method893(var32, arg1, 0);
                this.field243.method2989((byte) -18);
                var33 += var31;
                var32 += var31;
                this.field243.method2995((byte) 115);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method1867(this.field249.method433(-27156, (float) var34), 1.0F, this.field249.method429((float) arg3, -84), -123);
                this.field243.method3045(-127, class635.field9152);
                var8.method1867((float) var34, 0.0F, (float) arg3, -100);
                var8.method893(var32, arg1, 0);
                this.field243.method2989((byte) -18);
                this.field243.method2995((byte) 123);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method50();
            int var20 = this.method43();
            int var21 = arg1 + this.field239;
            for (int var22 = this.field222 + var21; var22 <= var17; var22 += var20) {
                var9.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) this.field222, -117), -84);
                this.field243.method3045(-113, class635.field9152);
                int var27 = arg0 + this.field237;
                int var28 = this.field232 + var27;
                while (var28 <= var18) {
                    var8.method1867((float) this.field232, 0.0F, (float) this.field222, -113);
                    var8.method893(var27, var21, 0);
                    this.field243.method2989((byte) -18);
                    var28 += var19;
                    var27 += var19;
                    this.field243.method2995((byte) 120);
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method1867(this.field249.method433(-27156, (float) var29), 1.0F, this.field249.method429((float) this.field222, -118), -111);
                    this.field243.method3045(-116, class635.field9152);
                    var8.method1867((float) var29, 0.0F, (float) this.field222, -111);
                    var8.method893(var27, var21, 0);
                    this.field243.method2989((byte) -18);
                    this.field243.method2995((byte) 118);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) var23, -99), -91);
                this.field243.method3045(-120, class635.field9152);
                int var24 = this.field237 + arg0;
                for (int var25 = var24 + this.field232; var25 <= var18; var25 += var19) {
                    var8.method1867((float) this.field232, 0.0F, (float) var23, -117);
                    var8.method893(var24, var21, 0);
                    this.field243.method2989((byte) -18);
                    var24 += var19;
                    this.field243.method2995((byte) 119);
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method1867(this.field249.method433(-27156, (float) var26), 1.0F, this.field249.method429((float) var23, -81), -86);
                    this.field243.method3045(-117, class635.field9152);
                    var8.method1867((float) var26, 0.0F, (float) var23, -99);
                    var8.method893(var24, var21, 0);
                    this.field243.method2989((byte) -18);
                    this.field243.method2995((byte) 126);
                }
            }
        }
        this.field243.method3003(1);
        this.field243.method3025(class11.field273, -1, 1);
        this.field243.method3019(1, 0, class11.field273);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public static void method54(int arg0) {
        if (arg0 != 9029) {
            method47(false);
        }
        field230 = null;
    }

    @OriginalMember(owner = "client!eb", name = "xa", descriptor = "(III)V")
    public final void method55(int arg0, int arg1, int arg2) {
        field233++;
    }

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "()I")
    public final int method56() {
        field234++;
        return this.field222;
    }

    @OriginalMember(owner = "client!eb", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method57(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field228++;
        class300 var11 = this.field243.method3014(-11433);
        class300 var12 = this.field243.method3032(-30);
        this.field249.method1215(this.field221 || this.field220 || (arg9 & 0x1) == 0 ? class81.field1300 : class264.field3448, 19759);
        this.field243.method3023(0);
        this.field243.method3011(-127, this.field249);
        this.field243.method3068(126, arg8);
        this.field243.method3037(arg6, true);
        this.field243.method3025(class475.field6812, -1, 1);
        this.field243.method3019(1, 0, class475.field6812);
        this.field243.method3028(arg7, false);
        if (this.field219) {
            float var13 = (float) this.method50();
            float var14 = (float) this.method43();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field239 * var17;
            float var20 = (float) this.field239 * var18;
            float var21 = (float) this.field237 * var15;
            float var22 = (float) this.field237 * var16;
            float var23 = (float) this.field245 * -var15;
            float var24 = (float) this.field245 * -var16;
            float var25 = (float) this.field241 * -var17;
            arg3 = arg3 + var24 + var20;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            arg0 = arg0 + var21 + var19;
            arg2 = arg2 + var23 + var19;
            float var26 = (float) this.field241 * -var18;
            arg5 = arg5 + var22 + var26;
        }
        var11.method1873(0.0F, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, -arg0 + arg2, 0.0F, arg3 - arg1, 102, 0.0F);
        var11.method1870(0.0F, 0, arg1, arg0);
        var12.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) this.field222, -82), -121);
        this.field243.method3045(-122, class635.field9152);
        this.field243.method2989((byte) -18);
        this.field243.method2995((byte) 105);
        this.field243.method3003(1);
        this.field243.method3025(class11.field273, -1, 1);
        this.field243.method3019(1, 0, class11.field273);
    }

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "(IIII)V")
    public final void method58(int arg0, int arg1, int arg2, int arg3) {
        this.field245 = arg2;
        this.field237 = arg0;
        this.field239 = arg1;
        field248++;
        this.field241 = arg3;
        this.field219 = this.field237 != 0 || this.field239 != 0 || this.field245 != 0 || this.field241 != 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII[III)V")
    private final void method59(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field249.method430(arg6, arg0, arg4, arg5, arg3, arg1, arg2, 87);
        field235++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method60(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class591 arg7, int arg8, int arg9) {
        field225++;
        class300 var11 = this.field243.method3014(-11433);
        class300 var12 = this.field243.method3032(-30);
        class571 var13 = (class571) arg7;
        class75 var14 = var13.field8300;
        this.field249.method1215(this.field221 || this.field220 || (arg6 & 0x1) == 0 ? class81.field1300 : class264.field3448, 19759);
        this.field243.method3023(0);
        this.field243.method3011(-128, this.field249);
        this.field243.method3068(123, 1);
        this.field243.method3037(1, true);
        if (this.field219) {
            float var15 = (float) this.field232 / (float) this.method50();
            float var16 = (float) this.field222 / (float) this.method43();
            var11.method1873(0.0F, 1.0F, (arg5 - arg1) * var16, 0.0F, (arg4 - arg0) * var16, (arg2 - arg0) * var15, 0.0F, (arg3 - arg1) * var15, 103, 0.0F);
            var11.method1870(0.0F, 0, ((float) this.field239 + arg1) * var16, ((float) this.field237 + arg0) * var15);
        } else {
            var11.method1873(0.0F, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, arg2 - arg0, 0.0F, arg3 - arg1, 71, 0.0F);
            var11.method1870(0.0F, 0, arg1, arg0);
        }
        var12.method1867(this.field249.method433(-27156, (float) this.field232), 1.0F, this.field249.method429((float) this.field222, -87), -92);
        this.field243.method3045(-113, class635.field9152);
        this.field243.method3050(1, 0);
        this.field243.method3011(-128, var14);
        this.field243.method3013(class519.field7276, 67, class492.field6998);
        this.field243.method3025(class11.field273, -1, 0);
        class300 var17 = this.field243.method3032(-30);
        var17.method887(var11);
        var17.method893(-arg8, -arg9, 0);
        var17.method1885(var14.method429(1.0F, -72), var14.method433(-27156, 1.0F), 1, 1.0F);
        this.field243.method3045(-115, class635.field9152);
        this.field243.method2989((byte) -18);
        this.field243.method2995((byte) 125);
        this.field243.method3003(1);
        this.field243.method3025(class283.field3777, -1, 0);
        this.field243.method3013(class492.field6998, 126, class492.field6998);
        this.field243.method3011(-127, null);
        this.field243.method3050(0, 0);
        this.field243.method3003(1);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lum;IIZ)V")
    public class8(class528 arg0, int arg1, int arg2, boolean arg3) {
        this.field243 = arg0;
        this.field222 = arg2;
        this.field232 = arg1;
        this.field249 = arg0.method785(arg2, arg3 ? class564.field8245 : class348.field5157, (byte) -67, class106.field1573, arg1);
        this.field249.method432(true, true, (byte) 85);
        this.field221 = this.field249.method431(false) != arg1;
        this.field220 = arg2 != this.field249.method435(2367);
        this.field242 = !this.field221 && this.field249.method436((byte) 13);
        this.field227 = !this.field220 && this.field249.method436((byte) 13);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lum;II[III)V")
    public class8(class528 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field232 = arg1;
        this.field222 = arg2;
        this.field243 = arg0;
        this.field249 = arg0.method793(arg3, arg4, arg1, arg5, false, 4595, arg2);
        this.field249.method432(true, true, (byte) 100);
        this.field221 = this.field249.method431(false) != arg1;
        this.field220 = this.field249.method435(2367) != arg2;
        this.field242 = !this.field221 && this.field249.method436((byte) 13);
        this.field227 = !this.field220 && this.field249.method436((byte) 13);
    }
}
