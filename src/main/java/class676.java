import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class676 extends class140 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    private int field9039 = 0;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
    private boolean field9045 = false;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field9055 = 0;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    private int field9044 = 0;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    private int field9068 = 0;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    private int field9062;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field9056;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Lee;")
    private class703 field9057;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Lfk;")
    private class678 field9058;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "Z")
    private boolean field9049;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
    private boolean field9052;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Z")
    private boolean field9060;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
    private boolean field9061;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "[[I")
    public static int[][] field9050 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field9069 = -1;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "[I")
    public static int[] field9067 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "Lofa;")
    public static class347 field9054;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3726(int arg0) {
        field9040++;
        for (int var1 = 0; var1 < class441.field6352; var1++) {
            int var3 = class693.method3780(class279.field4047 + var1, class441.field6352, -441893025) * class1.field2;
            for (int var4 = 0; var4 < class1.field2; var4++) {
                int var5 = var3 + class693.method3780(class743.field10049 + var4, class1.field2, -441893025);
                if (class562.field7701[var5] == class600.field8184) {
                    class204.field2635[var5].method3505(0, 0, class533.field7397, class607.field8210, class533.field7397 * var4, class607.field8210 * var1, true, true);
                }
            }
        }
        int var2 = 60 / ((-arg0 - 67) / 34);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V", line = 35)
    public final void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9065++;
        class532 var9 = this.field9057.method3864((byte) -118);
        class532 var10 = this.field9057.method3877(3);
        this.field9058.method706((byte) -122, this.field9049 || this.field9052 || (arg7 & 0x1) == 0 ? class164.field2195 : class177.field2332);
        this.field9057.method3899(0);
        this.field9057.method3882(0, this.field9058);
        this.field9057.method3893(106, arg6);
        this.field9057.method3871(0, arg4);
        this.field9057.method3859(117, 1, class64.field840);
        this.field9057.method3867((byte) 18, class64.field840, 1);
        this.field9057.method3838(arg5, Integer.MAX_VALUE);
        var10.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
        if (this.field9045) {
            arg2 = this.field9062 * arg2 / this.method343();
            arg3 = this.field9056 * arg3 / this.method340();
            arg1 += this.field9055 * arg3 / this.field9056;
            arg0 += this.field9039 * arg2 / this.field9062;
        }
        var9.method3080((float) arg3, (float) arg2, 0.0F, (byte) -89);
        var9.method818(arg0, arg1, 0);
        this.field9057.method3883((byte) 105, class525.field7284);
        this.field9057.method3852(true);
        this.field9057.method3900(240957680);
        this.field9057.method3878((byte) 86);
        this.field9057.method3859(119, 1, class417.field6010);
        this.field9057.method3867((byte) 18, class417.field6010, 1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII[III)V", line = 73)
    private final void method3727(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field9058.method620(arg5, arg1, arg2, arg0, arg6, arg4, 84, arg3);
        field9046++;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIII)V", line = 83)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9066++;
        class532 var8 = this.field9057.method3864((byte) -111);
        class532 var9 = this.field9057.method3877(3);
        this.field9058.method706((byte) -105, class164.field2195);
        this.field9057.method3899(0);
        this.field9057.method3882(0, this.field9058);
        this.field9057.method3893(-23, arg6);
        this.field9057.method3871(0, arg4);
        this.field9057.method3859(126, 1, class64.field840);
        this.field9057.method3867((byte) 18, class64.field840, 1);
        this.field9057.method3838(arg5, Integer.MAX_VALUE);
        boolean var10 = this.field9061 && this.field9055 == 0 && this.field9068 == 0;
        boolean var11 = this.field9060 && this.field9039 == 0 && this.field9044 == 0;
        if ((var10 & var11)) {
            var9.method3080(this.field9058.method621(20490, (float) arg3), this.field9058.method617((float) arg2, false), 1.0F, (byte) -89);
            var8.method3080((float) arg3, (float) arg2, 0.0F, (byte) -89);
            var8.method818(arg0, arg1, 0);
            this.field9057.method3883((byte) 123, class525.field7284);
            this.field9057.method3852(true);
            this.field9057.method3900(240957680);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method340();
            var9.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) arg2, false), 1.0F, (byte) -89);
            this.field9057.method3883((byte) 114, class525.field7284);
            int var14 = this.field9055 + arg1;
            int var15 = var14 + this.field9056;
            while (var15 <= var12) {
                var8.method3080((float) this.field9056, (float) arg2, 0.0F, (byte) -89);
                var8.method818(arg0, var14, 0);
                this.field9057.method3852(true);
                var14 += var13;
                var15 += var13;
                this.field9057.method3900(240957680);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method3080(this.field9058.method621(20490, (float) var16), this.field9058.method617((float) arg2, false), 1.0F, (byte) -89);
                this.field9057.method3883((byte) 52, class525.field7284);
                var8.method3080((float) var16, (float) arg2, 0.0F, (byte) -89);
                var8.method818(arg0, var14, 0);
                this.field9057.method3852(true);
                this.field9057.method3900(240957680);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method343();
            var9.method3080(this.field9058.method621(20490, (float) arg3), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
            this.field9057.method3883((byte) 60, class525.field7284);
            int var19 = this.field9039 + arg0;
            for (int var20 = this.field9062 + var19; var20 <= var17; var20 += var18) {
                var8.method3080((float) arg3, (float) this.field9062, 0.0F, (byte) -89);
                var8.method818(var19, arg1, 0);
                this.field9057.method3852(true);
                var19 += var18;
                this.field9057.method3900(240957680);
            }
            if (var19 < var17) {
                int var21 = var17 - var19;
                var9.method3080(this.field9058.method621(20490, (float) arg3), this.field9058.method617((float) var21, false), 1.0F, (byte) -89);
                this.field9057.method3883((byte) 82, class525.field7284);
                var8.method3080((float) arg3, (float) var21, 0.0F, (byte) -89);
                var8.method818(var19, arg1, 0);
                this.field9057.method3852(true);
                this.field9057.method3900(240957680);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method343();
            int var25 = this.method340();
            int var26 = this.field9055 + arg1;
            for (int var27 = this.field9056 + var26; var27 <= var22; var27 += var25) {
                var9.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
                this.field9057.method3883((byte) 94, class525.field7284);
                int var32 = arg0 + this.field9039;
                for (int var33 = var32 + this.field9062; var33 <= var23; var33 += var24) {
                    var8.method3080((float) this.field9056, (float) this.field9062, 0.0F, (byte) -89);
                    var8.method818(var32, var26, 0);
                    this.field9057.method3852(true);
                    var32 += var24;
                    this.field9057.method3900(240957680);
                }
                if (var23 > var32) {
                    int var34 = var23 - var32;
                    var9.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) var34, false), 1.0F, (byte) -89);
                    this.field9057.method3883((byte) 116, class525.field7284);
                    var8.method3080((float) this.field9056, (float) var34, 0.0F, (byte) -89);
                    var8.method818(var32, var26, 0);
                    this.field9057.method3852(true);
                    this.field9057.method3900(240957680);
                }
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method3080(this.field9058.method621(20490, (float) var28), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
                this.field9057.method3883((byte) 122, class525.field7284);
                int var29 = arg0 + this.field9039;
                for (int var30 = this.field9062 + var29; var30 <= var23; var30 += var24) {
                    var8.method3080((float) var28, (float) this.field9062, 0.0F, (byte) -89);
                    var8.method818(var29, var26, 0);
                    this.field9057.method3852(true);
                    var29 += var24;
                    this.field9057.method3900(240957680);
                }
                if (var29 < var23) {
                    int var31 = var23 - var29;
                    var9.method3080(this.field9058.method621(20490, (float) var28), this.field9058.method617((float) var31, false), 1.0F, (byte) -89);
                    this.field9057.method3883((byte) 77, class525.field7284);
                    var8.method3080((float) var28, (float) var31, 0.0F, (byte) -89);
                    var8.method818(var29, var26, 0);
                    this.field9057.method3852(true);
                    this.field9057.method3900(240957680);
                }
            }
        }
        this.field9057.method3878((byte) 86);
        this.field9057.method3859(123, 1, class417.field6010);
        this.field9057.method3867((byte) 18, class417.field6010, 1);
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "()I", line = 288)
    public final int method351() {
        field9048++;
        return this.field9056;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(FFFFFFIIII)V", line = 297)
    public final void method353(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field9043++;
        class532 var11 = this.field9057.method3864((byte) -113);
        class532 var12 = this.field9057.method3877(3);
        this.field9058.method706((byte) -101, this.field9049 || this.field9052 || (arg9 & 0x1) == 0 ? class164.field2195 : class177.field2332);
        this.field9057.method3899(0);
        this.field9057.method3882(0, this.field9058);
        this.field9057.method3893(-39, arg8);
        this.field9057.method3871(0, arg6);
        this.field9057.method3859(119, 1, class64.field840);
        this.field9057.method3867((byte) 18, class64.field840, 1);
        this.field9057.method3838(arg7, Integer.MAX_VALUE);
        if (this.field9045) {
            float var13 = (float) this.method343();
            float var14 = (float) this.method340();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field9055 * var17;
            float var20 = (float) this.field9055 * var18;
            float var21 = (float) this.field9039 * var15;
            float var22 = (float) this.field9039 * var16;
            float var23 = (float) this.field9044 * -var15;
            float var24 = (float) this.field9044 * -var16;
            float var25 = (float) this.field9068 * -var17;
            arg2 = arg2 + var23 + var19;
            arg0 = arg0 + var21 + var19;
            arg4 = arg4 + var21 + var25;
            float var26 = (float) this.field9068 * -var18;
            arg1 = arg1 + var22 + var20;
            arg3 = arg3 + var24 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3090(0.0F, arg2 - arg0, -arg0 + arg4, 1.0F, 0.0F, arg3 - arg1, 0.0F, 99, 0.0F, arg5 - arg1);
        var11.method3093(arg0, 0.0F, 16383, arg1);
        var12.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
        this.field9057.method3883((byte) 67, class525.field7284);
        this.field9057.method3852(true);
        this.field9057.method3900(240957680);
        this.field9057.method3878((byte) 86);
        this.field9057.method3859(121, 1, class417.field6010);
        this.field9057.method3867((byte) 18, class417.field6010, 1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V", line = 363)
    public final void method345(int arg0, int arg1, int arg2) {
        field9047++;
        int[] var4 = this.field9057.method439(arg0, arg1, this.field9062, this.field9056);
        int[] var5 = new int[this.field9062 * this.field9056];
        this.field9058.method629(0, var5, 0, 0, -14191, this.field9056, this.field9062);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field9056; var15++) {
                int var16 = this.field9062 * var15;
                for (int var17 = 0; var17 < this.field9062; var17++) {
                    var5[var16 + var17] = class670.method3699(class519.method3018(16777215, var5[var16 + var17]), class519.method3018(var4[var16 + var17] << 8, -16777196));
                }
            }
        } else if (arg2 == 1) {
            for (int var12 = 0; var12 < this.field9056; var12++) {
                int var13 = this.field9062 * var12;
                for (int var14 = 0; var14 < this.field9062; var14++) {
                    var5[var13 + var14] = class670.method3699(class519.method3018(-152568064, var4[var13 + var14]) << 16, class519.method3018(16777215, var5[var13 + var14]));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field9056; var9++) {
                int var10 = this.field9062 * var9;
                for (int var11 = 0; var11 < this.field9062; var11++) {
                    var5[var10 + var11] = class670.method3699(class519.method3018(var5[var10 + var11], 16777215), class519.method3018(var4[var10 + var11], 1290944767) << 24);
                }
            }
        } else if (arg2 == 3) {
            for (int var6 = 0; var6 < this.field9056; var6++) {
                int var7 = this.field9062 * var6;
                for (int var8 = 0; var8 < this.field9062; var8++) {
                    var5[var7 + var8] = class670.method3699(var4[var7 + var8] == 0 ? 0 : -16777216, class519.method3018(16777215, var5[var7 + var8]));
                }
            }
        }
        this.method3727(0, 0, this.field9062, this.field9056, var5, 0, this.field9062);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V", line = 472)
    public final void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9051++;
        int[] var7 = this.field9057.method439(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class670.method3699(var7[var8], -16777216);
            }
            this.method3727(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V", line = 493)
    public final void method358(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9053++;
        class532 var6 = this.field9057.method3864((byte) -71);
        class532 var7 = this.field9057.method3877(3);
        int var8 = this.field9055 + arg1;
        int var9 = this.field9039 + arg0;
        this.field9058.method706((byte) -102, class164.field2195);
        this.field9057.method3899(0);
        this.field9057.method3882(0, this.field9058);
        this.field9057.method3893(103, arg4);
        this.field9057.method3871(0, arg2);
        this.field9057.method3859(126, 1, class64.field840);
        this.field9057.method3867((byte) 18, class64.field840, 1);
        this.field9057.method3838(arg3, Integer.MAX_VALUE);
        var6.method3080((float) this.field9056, (float) this.field9062, 0.0F, (byte) -89);
        var6.method818(var9, var8, 0);
        var7.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
        this.field9057.method3883((byte) 48, class525.field7284);
        this.field9057.method3852(true);
        this.field9057.method3900(240957680);
        this.field9057.method3878((byte) 86);
        this.field9057.method3859(117, 1, class417.field6010);
        this.field9057.method3867((byte) 18, class417.field6010, 1);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()I", line = 523)
    public final int method340() {
        field9064++;
        return this.field9056 + this.field9055 + this.field9068;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIIIII[Lofa;IIII)V", line = 534)
    public static final void method3728(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class347[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field9042++;
        if (arg3 >= -115) {
            return;
        }
        class375.field5490.method453(arg2, arg1, arg10, arg5);
        for (int var11 = 0; var11 < arg6.length; var11++) {
            class347 var12 = arg6[var11];
            if (var12 != null && (var12.field4921 == arg4 || arg4 == -1412584499 && class528.field7306 == var12)) {
                int var13 = var12.field4934 + arg9;
                int var14 = var12.field4887 + arg7;
                int var15 = var13 + var12.field4986 + 1;
                int var16 = var14 + var12.field4940 + 1;
                int var17;
                if (arg8 == -1) {
                    class561.field7691[class689.field9209].setBounds(var12.field4934 + arg9, var12.field4887 + arg7, var12.field4986, var12.field4940);
                    var17 = class689.field9209++;
                } else {
                    var17 = arg8;
                }
                var12.field4973 = var17;
                var12.field5029 = class572.field7788;
                if (!client.method2034(var12)) {
                    if (var12.field4970 != 0) {
                        class720.method3975(false, var12);
                    }
                    int var18 = var12.field4934 + arg9;
                    int var19 = var12.field4887 + arg7;
                    int var20 = 0;
                    int var21 = 0;
                    if (class24.field246) {
                        var20 = class186.method1252(0);
                        var21 = class550.method3163(16383);
                    }
                    int var22 = var12.field4877;
                    if (class341.field4764 && (client.method2055(var12).field4635 != 0 || var12.field4884 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class528.field7306 == var12) {
                        if (arg4 != -1412584499 && (class414.field5966 == var12.field4959 || class342.field4801 == var12.field4959)) {
                            class612.field8277 = arg9;
                            class683.field9125 = arg6;
                            class511.field7119 = arg7;
                            continue;
                        }
                        if (class425.field6177 && class178.field2351) {
                            int var23 = class494.field6961.method1652(0) + var20;
                            int var24 = var21 + class494.field6961.method1663((byte) 123);
                            int var25 = var24 - class99.field1441;
                            int var26 = var23 - class723.field9822;
                            if (var26 < class154.field2089) {
                                var26 = class154.field2089;
                            }
                            if (var25 < class350.field5105) {
                                var25 = class350.field5105;
                            }
                            if (class154.field2089 + class237.field3155.field4986 < var12.field4986 + var26) {
                                var26 = class154.field2089 + class237.field3155.field4986 - var12.field4986;
                            }
                            var18 = var26;
                            if ((var12.field4940 + var25) > (class350.field5105 + class237.field3155.field4940)) {
                                var25 = class237.field3155.field4940 + class350.field5105 - var12.field4940;
                            }
                            var19 = var25;
                        }
                        if (class342.field4801 == var12.field4959) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field4884 == 2) {
                        var30 = arg2;
                        var31 = arg10;
                        var29 = arg1;
                        var32 = arg5;
                    } else {
                        int var27 = var12.field4986 + var18;
                        int var28 = var12.field4940 + var19;
                        var29 = arg1 >= var19 ? arg1 : var19;
                        var30 = arg2 >= var18 ? arg2 : var18;
                        if (var12.field4884 == 9) {
                            var28++;
                            var27++;
                        }
                        var31 = arg10 <= var27 ? arg10 : var27;
                        var32 = var28 >= arg5 ? arg5 : var28;
                    }
                    if (var31 > var30 && var29 < var32) {
                        if (var12.field4970 != 0) {
                            if (class386.field5614 == var12.field4970 || class730.field9896 == var12.field4970) {
                                class260.method1763(var12, var19, -104, var18);
                                if (!class24.field246) {
                                    class152.method1064(var12.field4940, var19, var18, false, class730.field9896 == var12.field4970, var12.field4986);
                                    class375.field5490.method453(arg2, arg1, arg10, arg5);
                                }
                                class753.field10199[var17] = true;
                                continue;
                            }
                            if (class480.field6742 == var12.field4970) {
                                if (var12.method2214((byte) 78, class375.field5490) != null) {
                                    class324.method2095(-78);
                                    class759.method4167(var19, var18, -5915, class375.field5490, var12);
                                    class600.field8182[var17] = true;
                                    class375.field5490.method453(arg2, arg1, arg10, arg5);
                                    if (class24.field246) {
                                        if (arg0) {
                                            class199.method1300(var14, var15, 8963, var13, var16);
                                        } else {
                                            class626.method3463((byte) -43, var16, var13, var15, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class93.field1301 == var12.field4970) {
                                class272.method1806(-77, var12, var19, var18, class375.field5490);
                                continue;
                            }
                            if (class95.field1358 == var12.field4970) {
                                class235.method1493(var18, var12.field4944 % 64, (byte) -64, var12, class375.field5490, var19);
                                continue;
                            }
                            if (class444.field6394 == var12.field4970) {
                                if (var12.method2214((byte) 33, class375.field5490) != null) {
                                    class763.method4204(var18, var19, var12, true);
                                    class600.field8182[var17] = true;
                                    class375.field5490.method453(arg2, arg1, arg10, arg5);
                                    if (class24.field246) {
                                        if (arg0) {
                                            class199.method1300(var14, var15, 8963, var13, var16);
                                        } else {
                                            class626.method3463((byte) -112, var16, var13, var15, var14);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class341.field4782 == var12.field4970) {
                                class395.method2424(var12.field4940, true, var19, class375.field5490, class655.field8851, var12.field4986, var18);
                                class753.field10199[var17] = true;
                                class375.field5490.method453(arg2, arg1, arg10, arg5);
                                continue;
                            }
                            if (class751.field10149 == var12.field4970) {
                                class312.method2006(var12.field4986, var12.field4940, var19, var18, -124, class375.field5490);
                                class753.field10199[var17] = true;
                                class375.field5490.method453(arg2, arg1, arg10, arg5);
                                continue;
                            }
                            if (class701.field9291 == var12.field4970) {
                                if (!class275.field3992 && !class572.field7794) {
                                    continue;
                                }
                                int var33 = var12.field4986 + var18;
                                if (class24.field246) {
                                    if (arg0) {
                                        class199.method1300(var14, var15, 8963, var13, var16);
                                    } else {
                                        class626.method3463((byte) -75, var16, var13, var15, var14);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class275.field3992) {
                                    int var35 = -256;
                                    if (class697.field9248 < 20) {
                                        var35 = -65536;
                                    }
                                    class166.field2202.method560(var34, var33, (byte) 125, -1, var35, "Fps:" + class697.field9248);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class368.field5315) {
                                            class792.method4330(-1);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class743.method4082(-126, 4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class166.field2202.method560(var34, var33, (byte) 125, -1, var38, "Mem:" + var37 + "k");
                                    var34 += 15;
                                    class166.field2202.method560(var34, var33, (byte) 125, -1, -256, "In:" + class732.field9909 + "B/s Out:" + class34.field370 + "B/s");
                                    var34 += 15;
                                    int var40 = class375.field5490.method496() / 1024;
                                    class166.field2202.method560(var34, var33, (byte) 125, -1, ~var40 >= -65537 ? -256 : -65536, "Offheap:" + var40 + "k");
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class186.field2442[var44] != null) {
                                            var41 += class186.field2442[var44].method2606(false);
                                            var42 += class186.field2442[var44].method2607(false);
                                            var43 += class186.field2442[var44].method2611((byte) -122);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class219.method1403(7, 0, 2, (long) var46, true) + "% (" + var45 + "%)";
                                    class734.field9957.method560(var34, var33, (byte) 125, -1, -256, var47);
                                    var34 += 12;
                                }
                                if (class428.field6216 > 0) {
                                    class734.field9957.method560(var34, var33, (byte) 125, -1, -256, "Particles: " + class605.field8202 + " / " + class428.field6216);
                                }
                                var34 += 12;
                                if (class572.field7794) {
                                    class734.field9957.method560(var34, var33, (byte) 125, -1, -256, "Polys: " + class375.field5490.method445() + " Models: " + class375.field5490.method494());
                                    var34 += 12;
                                    class734.field9957.method560(var34, var33, (byte) 125, -1, -256, "Ls: " + class247.field3226 + " La: " + class235.field3123 + " NPC: " + class453.field6502 + " Pl: " + class646.field8702);
                                    class679.method3731(0);
                                    var34 += 12;
                                }
                                class753.field10199[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field4884 == 0) {
                            if (class493.field6942 == var12.field4970 && class375.field5490.method472()) {
                                class375.field5490.method486(var18, var19, var12.field4986, var12.field4940);
                            }
                            method3728(arg0, var29, var30, -123, var12.field5003, var32, arg6, var19 - var12.field4949, var17, var18 - var12.field5004, var31);
                            if (var12.field4928 != null) {
                                method3728(arg0, var29, var30, -125, var12.field5003, var32, var12.field4928, var19 - var12.field4949, var17, var18 - var12.field5004, var31);
                            }
                            class73 var48 = (class73) class355.field5178.method1248(122, (long) var12.field5003);
                            if (var48 != null) {
                                class91.method718(var29, var32, var30, var19, var18, -1, var17, var31, var48.field985);
                            }
                            if (class493.field6942 == var12.field4970 && class375.field5490.method472()) {
                                class375.field5490.method527();
                            }
                            class375.field5490.method453(arg2, arg1, arg10, arg5);
                        }
                        if (class261.field3864[var17] || class81.field1126 > 1) {
                            if (var12.field4884 == 3) {
                                if (var22 == 0) {
                                    if (var12.field4885) {
                                        class375.field5490.method434(var18, var19, var12.field4986, var12.field4940, var12.field4944, 0);
                                    } else {
                                        class375.field5490.method539(var18, var19, var12.field4986, var12.field4940, var12.field4944, 0);
                                    }
                                } else if (var12.field4885) {
                                    class375.field5490.method434(var18, var19, var12.field4986, var12.field4940, 255 - (var22 & 0xFF) << 24 | var12.field4944 & 0xFFFFFF, 1);
                                } else {
                                    class375.field5490.method539(var18, var19, var12.field4986, var12.field4940, var12.field4944 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                }
                                if (class24.field246) {
                                    if (arg0) {
                                        class199.method1300(var14, var15, 8963, var13, var16);
                                    } else {
                                        class626.method3463((byte) -102, var16, var13, var15, var14);
                                    }
                                }
                            } else if (var12.field4884 == 4) {
                                class67 var49 = var12.method2217((byte) 119, class375.field5490);
                                if (var49 != null) {
                                    int var50 = var12.field4944;
                                    String var51 = var12.field4890;
                                    if (var12.field4956 != -1) {
                                        class369 var52 = class16.field156.method2121(var12.field4956, 25928);
                                        var51 = var52.field5349;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field5367 == 1 || var12.field5028 != 1) && var12.field5028 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class435.method2613(var12.field5028, false);
                                        }
                                    }
                                    if (var12.field4875 != -1) {
                                        var51 = class64.method428(var12.field4875, -121);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class186.field2440 == var12) {
                                        var51 = class58.field728.method365(class55.field647, (byte) 102);
                                        var50 = var12.field4944;
                                    }
                                    if (class492.field6929) {
                                        class375.field5490.method525(var18, var19, var12.field4986 + var18, var12.field4940 + var19);
                                    }
                                    var49.method570(var12.field4991 ? 255 - (var22 & 0xFF) << 24 : -1, var12.field4986, -1, var18, var51, 0, null, var12.field4940, var19, var12.field4982, var50 | 255 - (var22 & 0xFF) << 24, var12.field4894, class603.field8192, var12.field5035, var12.field4966, 0, null);
                                    if (class492.field6929) {
                                        class375.field5490.method453(arg2, arg1, arg10, arg5);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class492.field6929) {
                                            class651 var53 = class649.method3606(13, var12.field4898, class375.field5490);
                                            int var54 = var53.method3626(class603.field8192, var51, true, var12.field4986);
                                            int var55 = var53.method3616(class603.field8192, var12.field4982, (byte) 54, var12.field4986, var51);
                                            if (class24.field246) {
                                                if (arg0) {
                                                    class199.method1300(var19, var18 + var54, 8963, var18, var19 + var55);
                                                } else {
                                                    class626.method3463((byte) -101, var19 + var55, var18, var18 + var54, var19);
                                                }
                                            }
                                        } else if (class24.field246) {
                                            if (arg0) {
                                                class199.method1300(var14, var15, 8963, var13, var16);
                                            } else {
                                                class626.method3463((byte) -125, var16, var13, var15, var14);
                                            }
                                        }
                                    }
                                } else if (class92.field1294) {
                                    class151.method1062((byte) -99, var12);
                                }
                            } else if (var12.field4884 == 5) {
                                if (var12.field4873 < 0) {
                                    class140 var57;
                                    if (var12.field4956 != -1) {
                                        class201 var56 = var12.field4938 ? class625.field8475.field10355 : null;
                                        var57 = class16.field156.method2132(var12.field5014, var12.field5028, var12.field5038 | 0xFF000000, (byte) 104, class375.field5490, var12.field4956, var12.field4893, var56);
                                    } else if (var12.field4875 == -1) {
                                        var57 = var12.method2225(0, class375.field5490);
                                    } else {
                                        var57 = class255.method1739(-129, class375.field5490, var12.field4875);
                                    }
                                    if (var57 != null) {
                                        int var58 = var57.method343();
                                        int var59 = var57.method340();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field4944 == 0 ? 16777215 : var12.field4944 & 0xFFFFFF);
                                        if (var12.field4919) {
                                            class375.field5490.method525(var18, var19, var18 + var12.field4986, var12.field4940 + var19);
                                            if (var12.field4942 != 0) {
                                                int var61 = (var12.field4986 + var58 - 1) / var58;
                                                int var62 = (var12.field4940 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field4944 == 0) {
                                                            var57.method973((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field4942);
                                                        } else {
                                                            var57.method970((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var19 - -(var59 * var64)), 4096, var12.field4942, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field4944 == 0 && var22 == 0) {
                                                var57.method978(var18, var19, var12.field4986, var12.field4940);
                                            } else {
                                                var57.method344(var18, var19, var12.field4986, var12.field4940, 0, var60, 1);
                                            }
                                            class375.field5490.method453(arg2, arg1, arg10, arg5);
                                        } else if (var12.field4944 == 0 && var22 == 0) {
                                            if (var12.field4942 != 0) {
                                                var57.method973((float) var12.field4986 / 2.0F + (float) var18, (float) var12.field4940 / 2.0F + (float) var19, var12.field4986 * 4096 / var58, var12.field4942);
                                            } else if (var12.field4986 == var58 && var12.field4940 == var59) {
                                                var57.method968(var18, var19);
                                            } else {
                                                var57.method971(var18, var19, var12.field4986, var12.field4940);
                                            }
                                        } else if (var12.field4942 != 0) {
                                            var57.method970((float) var12.field4986 / 2.0F + (float) var18, (float) var12.field4940 / 2.0F + (float) var19, var12.field4986 * 4096 / var58, var12.field4942, 0, var60, 1);
                                        } else if (var12.field4986 == var58 && var12.field4940 == var59) {
                                            var57.method358(var18, var19, 0, var60, 1);
                                        } else {
                                            var57.method976(var18, var19, var12.field4986, var12.field4940, 0, var60, 1);
                                        }
                                    } else if (class92.field1294) {
                                        class151.method1062((byte) -126, var12);
                                    }
                                } else {
                                    var12.method2218(458233568, class297.field4200, class629.field8517).method2179(var19, class375.field5490, 0, var12.field4972 << 3, 0, var12.field4986, (byte) 20, var12.field4940, var12.field4936 << 3, var18);
                                }
                                if (class24.field246) {
                                    if (arg0) {
                                        class199.method1300(var14, var15, 8963, var13, var16);
                                    } else {
                                        class626.method3463((byte) -40, var16, var13, var15, var14);
                                    }
                                }
                            } else if (var12.field4884 == 6) {
                                class133.method941((byte) 118);
                                Object var65 = null;
                                class497 var66 = null;
                                int var67 = 0;
                                if (var12.field4956 != -1) {
                                    class369 var75 = class16.field156.method2121(var12.field4956, 25928);
                                    if (var75 != null) {
                                        class369 var76 = var75.method2322((byte) -90, var12.field5028);
                                        class317 var77 = var12.field4992 == -1 ? null : class693.field9223.method2388(var12.field4992, 0);
                                        class201 var78 = var12.field4938 ? class625.field8475.field10355 : null;
                                        var66 = var76.method2309(class375.field5490, var78, var77, var12.field4984, var12.field5022, 93, 1, 2048, var12.field4906);
                                        if (var66 == null) {
                                            class151.method1062((byte) -112, var12);
                                        } else {
                                            var67 = -var66.method265() >> 1;
                                        }
                                    }
                                } else if (var12.field4985 == 5) {
                                    int var72 = var12.field5037;
                                    if (var72 >= 0 && var72 < 2048) {
                                        class758 var73 = class84.field1204[var72];
                                        class317 var74 = var12.field4992 == -1 ? null : class693.field9223.method2388(var12.field4992, 0);
                                        if (var73 != null && (class349.field5065 == var72 || class411.method2470(-112, var73.field10367) == var12.field4925)) {
                                            var66 = var73.field10355.method1323(-1, class175.field2314, var74, null, 0, var12.field4984, 0, class16.field156, class107.field1507, 0, var12.field5022, var12.field4906, class480.field6740, class693.field9223, null, null, class345.field4846, 2048, true, class375.field5490, 0);
                                        }
                                    }
                                } else if (var12.field4985 == 8 || var12.field4985 == 9) {
                                    class358 var69 = class559.method3192(var12.field5037, false, Integer.MIN_VALUE);
                                    class317 var70 = var12.field4992 == -1 ? null : class693.field9223.method2388(var12.field4992, 0);
                                    if (var69 != null) {
                                        class201 var71 = var12.field4938 ? class625.field8475.field10355 : null;
                                        var66 = var69.method2271(var70, var12.field4985 == 9, 0, class375.field5490, var12.field4984, 2048, var12.field5022, var12.field4925, var71, var12.field4906);
                                    }
                                } else if (var12.field4992 == -1) {
                                    var66 = var12.method2206(-1, class345.field4846, -1, 2048, class107.field1507, 0, -1, class693.field9223, class16.field156, class175.field2314, class480.field6740, (class400) var65, null, class625.field8475.field10355, class375.field5490);
                                    if (var66 == null && class92.field1294) {
                                        class151.method1062((byte) -114, var12);
                                    }
                                } else {
                                    class317 var68 = class693.field9223.method2388(var12.field4992, 0);
                                    var66 = var12.method2206(var12.field4984, class345.field4846, var12.field4906, 2048, class107.field1507, var12.field5022, -1, class693.field9223, class16.field156, class175.field2314, class480.field6740, (class400) var65, var68, class625.field8475.field10355, class375.field5490);
                                    if (var66 == null && class92.field1294) {
                                        class151.method1062((byte) -120, var12);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field5024 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field4986 << 9) / var12.field5024;
                                    }
                                    int var80;
                                    if (var12.field4874 <= 0) {
                                        var80 = 512;
                                    } else {
                                        var80 = (var12.field4940 << 9) / var12.field4874;
                                    }
                                    int var81 = var12.field4986 / 2 + var18;
                                    int var82 = var12.field4940 / 2 + var19;
                                    if (!var12.field4997) {
                                        var82 += var12.field4920 * var80 >> 9;
                                        var81 += var12.field5027 * var79 >> 9;
                                    }
                                    class33.field312.method822();
                                    class375.field5490.method509(class33.field312);
                                    class375.field5490.method436(var81, var82, var79, var80);
                                    class375.field5490.method547();
                                    if (var12.field4882) {
                                        class375.field5490.method508(false);
                                    }
                                    if (var12.field4997) {
                                        class559.field7670.method825(var12.field5001);
                                        class559.field7670.method817(var12.field5010);
                                        class559.field7670.method824(var12.field4916);
                                        class559.field7670.method818(var12.field5027, var12.field4920, var12.field4872);
                                    } else {
                                        int var83 = (var12.field4888 << 2) * class110.field1524[var12.field5001 << 3] >> 14;
                                        int var84 = (var12.field4888 << 2) * class110.field1523[var12.field5001 << 3] >> 14;
                                        class559.field7670.method821(-var12.field4916 << 3);
                                        class559.field7670.method817(var12.field5010 << 3);
                                        class559.field7670.method818(var12.field5011 << 2, var83 + (var12.field4994 << 2) + var67, (var12.field4994 << 2) + var84);
                                        class559.field7670.method811(var12.field5001 << 3);
                                    }
                                    var12.method2208(-99, class572.field7788, class559.field7670, class375.field5490, var66);
                                    if (class492.field6929) {
                                        class375.field5490.method525(var18, var19, var12.field4986 + var18, var12.field4940 + var19);
                                    }
                                    if (var12.field4997) {
                                        if (var12.field5016) {
                                            var66.method258(class559.field7670, null, var12.field4888, 1);
                                        } else {
                                            var66.method254(class559.field7670, null, 1);
                                            if (var12.field4910 != null) {
                                                class375.field5490.method534(var12.field4910.method1053());
                                            }
                                        }
                                    } else if (var12.field5016) {
                                        var66.method258(class559.field7670, null, var12.field4888 << 2, 1);
                                    } else {
                                        var66.method254(class559.field7670, null, 1);
                                        if (var12.field4910 != null) {
                                            class375.field5490.method534(var12.field4910.method1053());
                                        }
                                    }
                                    if (class492.field6929) {
                                        class375.field5490.method453(arg2, arg1, arg10, arg5);
                                    }
                                    if (var12.field4882) {
                                        class375.field5490.method508(true);
                                    }
                                }
                                if (class24.field246) {
                                    if (arg0) {
                                        class199.method1300(var14, var15, 8963, var13, var16);
                                    } else {
                                        class626.method3463((byte) -54, var16, var13, var15, var14);
                                    }
                                }
                            } else if (var12.field4884 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field5026) {
                                    var86 = var12.field4986 + var18;
                                    var85 = var19;
                                    var88 = var18;
                                    var87 = var12.field4940 + var19;
                                } else {
                                    var85 = var19 + var12.field4940;
                                    var86 = var12.field4986 + var18;
                                    var87 = var19;
                                    var88 = var18;
                                }
                                if (var12.field5005 == 1) {
                                    class375.field5490.method487(var88, var87, var86, var85, var12.field4944, 0);
                                } else {
                                    class375.field5490.method513(var88, var87, var86, var85, var12.field4944, var12.field5005, 0);
                                }
                                if (class24.field246) {
                                    if (arg0) {
                                        class199.method1300(var14, var15, 8963, var13, var16);
                                    } else {
                                        class626.method3463((byte) -36, var16, var13, var15, var14);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lee;IIZ)V", line = 1605)
    public class676(class703 arg0, int arg1, int arg2, boolean arg3) {
        this.field9062 = arg1;
        this.field9056 = arg2;
        this.field9057 = arg0;
        this.field9058 = arg0.method2793(class415.field5986, arg2, (byte) -89, arg1, arg3 ? class109.field1521 : class442.field6353);
        this.field9058.method622(true, true, true);
        this.field9049 = arg1 != this.field9058.method623(false);
        this.field9052 = this.field9058.method627(-7840) != arg2;
        this.field9060 = !this.field9049 && this.field9058.method628(15501);
        this.field9061 = !this.field9052 && this.field9058.method628(15501);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lee;II[III)V", line = 1620)
    public class676(class703 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field9062 = arg1;
        this.field9057 = arg0;
        this.field9056 = arg2;
        this.field9058 = arg0.method2814(false, arg4, arg2, arg1, arg3, -105, arg5);
        this.field9058.method622(true, true, true);
        this.field9049 = arg1 != this.field9058.method623(false);
        this.field9052 = arg2 != this.field9058.method627(-7840);
        this.field9060 = !this.field9049 && this.field9058.method628(15501);
        this.field9061 = !this.field9052 && this.field9058.method628(15501);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 1410)
    public final void method356(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9) {
        field9038++;
        class532 var11 = this.field9057.method3864((byte) -83);
        class532 var12 = this.field9057.method3877(3);
        class237 var13 = (class237) arg7;
        class678 var14 = var13.field3156;
        this.field9058.method706((byte) -98, this.field9049 || this.field9052 || (arg6 & 0x1) == 0 ? class164.field2195 : class177.field2332);
        this.field9057.method3899(0);
        this.field9057.method3882(0, this.field9058);
        this.field9057.method3893(-42, 1);
        this.field9057.method3871(0, 1);
        if (this.field9045) {
            float var15 = (float) this.field9062 / (float) this.method343();
            float var16 = (float) this.field9056 / (float) this.method340();
            var11.method3090(0.0F, (arg2 - arg0) * var15, (arg4 - arg0) * var16, 1.0F, 0.0F, (arg3 - arg1) * var15, 0.0F, 24, 0.0F, (arg5 - arg1) * var16);
            var11.method3093(((float) this.field9039 + arg0) * var15, 0.0F, 16383, ((float) this.field9055 + arg1) * var16);
        } else {
            var11.method3090(0.0F, arg2 - arg0, -arg0 + arg4, 1.0F, 0.0F, arg3 - arg1, 0.0F, 89, 0.0F, arg5 - arg1);
            var11.method3093(arg0, 0.0F, 16383, arg1);
        }
        var12.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
        this.field9057.method3883((byte) 78, class525.field7284);
        this.field9057.method3886(75, 1);
        this.field9057.method3882(0, var14);
        this.field9057.method3911(22228, class291.field4152, class117.field1574);
        this.field9057.method3859(121, 0, class417.field6010);
        class532 var17 = this.field9057.method3877(3);
        var17.method816(var11);
        var17.method818(-arg8, -arg9, 0);
        var17.method3079(var14.method617(1.0F, false), var14.method621(20490, 1.0F), 0, 1.0F);
        this.field9057.method3883((byte) 109, class525.field7284);
        this.field9057.method3852(true);
        this.field9057.method3900(240957680);
        this.field9057.method3878((byte) 86);
        this.field9057.method3859(119, 0, class790.field10851);
        this.field9057.method3911(22228, class291.field4152, class291.field4152);
        this.field9057.method3882(0, null);
        this.field9057.method3886(88, 0);
        this.field9057.method3878((byte) 86);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()I", line = 1466)
    public final int method343() {
        field9070++;
        return this.field9044 + this.field9039 + this.field9062;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 1474)
    public static void method3729(byte arg0) {
        field9050 = null;
        field9054 = null;
        field9067 = null;
        if (arg0 <= 113) {
            method3726(51);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()I", line = 1492)
    public final int method350() {
        field9071++;
        return this.field9062;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIII)V", line = 1500)
    public final void method347(int arg0, int arg1, int arg2, int arg3) {
        field9063++;
        this.field9055 = arg1;
        this.field9044 = arg2;
        this.field9068 = arg3;
        this.field9039 = arg0;
        this.field9045 = this.field9039 != 0 || this.field9055 != 0 || this.field9044 != 0 || this.field9068 != 0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILaa;II)V", line = 1530)
    public final void method352(int arg0, int arg1, class512 arg2, int arg3, int arg4) {
        field9041++;
        class237 var6 = (class237) arg2;
        int var7 = this.field9039 + arg0;
        class678 var8 = var6.field3156;
        int var9 = this.field9055 + arg1;
        this.field9058.method706((byte) -77, class164.field2195);
        this.field9057.method3899(0);
        this.field9057.method3882(0, this.field9058);
        this.field9057.method3893(122, 1);
        this.field9057.method3871(0, 1);
        class532 var10 = this.field9057.method3864((byte) -53);
        var10.method3080((float) this.field9056, (float) this.field9062, 0.0F, (byte) -89);
        var10.method818(var7, var9, 0);
        this.field9057.method3852(true);
        class532 var11 = this.field9057.method3877(3);
        var11.method3080(this.field9058.method621(20490, (float) this.field9056), this.field9058.method617((float) this.field9062, false), 1.0F, (byte) -89);
        this.field9057.method3883((byte) 74, class525.field7284);
        this.field9057.method3886(33, 1);
        this.field9057.method3882(0, var8);
        this.field9057.method3911(22228, class291.field4152, class117.field1574);
        this.field9057.method3859(124, 0, class417.field6010);
        class532 var12 = this.field9057.method3877(3);
        var12.method3080(var8.method621(20490, (float) this.field9056), var8.method617((float) this.field9062, false), 1.0F, (byte) -89);
        var12.method3093(var8.method617((float) (var7 - arg3), false), 0.0F, 16383, var8.method621(20490, (float) (var9 - arg4)));
        this.field9057.method3883((byte) 64, class525.field7284);
        this.field9057.method3900(240957680);
        this.field9057.method3878((byte) 86);
        this.field9057.method3859(121, 0, class790.field10851);
        this.field9057.method3911(22228, class291.field4152, class291.field4152);
        this.field9057.method3882(0, null);
        this.field9057.method3886(98, 0);
        this.field9057.method3878((byte) 86);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([I)V", line = 1584)
    public final void method346(int[] arg0) {
        arg0[1] = this.field9055;
        field9059++;
        arg0[3] = this.field9068;
        arg0[0] = this.field9039;
        arg0[2] = this.field9044;
    }
}
