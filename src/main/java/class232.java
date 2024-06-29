import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class232 extends class496 {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    private int field3354 = 0;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    private int field3373 = 0;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    private int field3376 = 0;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "Z")
    private boolean field3375 = false;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    private int field3357 = 0;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    private int field3374;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    private int field3368;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Lwga;")
    private class745 field3364;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Lwfa;")
    private class200 field3360;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Z")
    private boolean field3367;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Z")
    private boolean field3365;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Z")
    private boolean field3353;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Z")
    private boolean field3348;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field3355 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
    public final int method1614() {
        field3359++;
        return this.field3376 + this.field3354 + this.field3374;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(IIII)V")
    public final void method1615(int arg0, int arg1, int arg2, int arg3) {
        field3370++;
        this.field3376 = arg1;
        this.field3354 = arg3;
        this.field3357 = arg0;
        this.field3373 = arg2;
        this.field3375 = this.field3357 != 0 || this.field3376 != 0 || this.field3373 != 0 || this.field3354 != 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII[III)V")
    private final void method1616(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field3351++;
        this.field3360.method1013(arg6, 22809, arg4, arg0, arg5, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILcea;)Lou;")
    public static final class605 method1617(int arg0, class215 arg1) {
        field3362++;
        class140 var2 = class30.method412((byte) -118, arg1);
        if (arg0 != 743571200) {
            method1624(-21, 36, 81);
        }
        int var3 = arg1.method1533((byte) -126);
        int var4 = arg1.method1533((byte) -126);
        return new class605(var2.field2322, var2.field2327, var2.field2324, var2.field2313, var2.field2325, var2.field2317, var2.field2320, var2.field2319, var2.field2315, var3, var4);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
    public final int method1618() {
        field3356++;
        return this.field3373 + this.field3357 + this.field3368;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()I")
    public final int method1619() {
        field3361++;
        return this.field3374;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)Lfe;")
    public static final class570 method1620(int arg0, int arg1, int arg2) {
        field3372++;
        class570 var3 = new class570();
        var3.field7831 = arg2 + 6;
        var3.field7847 = -1;
        var3.field7837 = arg0 + 1 + 5;
        if (arg1 == 1) {
            var3.field7835 = -1;
            var3.field7832 = new int[var3.field7831][var3.field7837];
            var3.method3298(700);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1621(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field3350++;
        class81 var11 = this.field3364.method4150(-114);
        class81 var12 = this.field3364.method4077(false);
        this.field3360.method376(this.field3367 || this.field3365 || (arg9 & 0x1) == 0 ? class643.field8843 : class545.field7515, -22095);
        this.field3364.method4105(-5);
        this.field3364.method4097((byte) 78, this.field3360);
        this.field3364.method4076(81, arg8);
        this.field3364.method4144(true, arg6);
        this.field3364.method4096((byte) 47, 1, class4.field31);
        this.field3364.method4117(1, true, class4.field31);
        this.field3364.method4123(-28186, arg7);
        if (this.field3375) {
            float var13 = (float) this.method1618();
            float var14 = (float) this.method1614();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field3376 * var17;
            float var20 = (float) this.field3376 * var18;
            float var21 = (float) this.field3357 * var15;
            float var22 = (float) this.field3357 * var16;
            float var23 = (float) this.field3373 * -var15;
            float var24 = (float) this.field3373 * -var16;
            float var25 = (float) this.field3354 * -var17;
            float var26 = (float) this.field3354 * -var18;
            arg0 = arg0 + var21 + var19;
            arg4 = arg4 + var21 + var25;
            arg3 = arg3 + var24 + var20;
            arg2 = arg2 + var23 + var19;
            arg1 = arg1 + var22 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method779(1.0F, arg3 - arg1, -arg0 + arg4, 0.0F, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 0);
        var11.method757(arg1, false, 0.0F, arg0);
        var12.method775(1.0F, this.field3360.method1002((byte) -47, (float) this.field3374), this.field3360.method1004((float) this.field3368, 123), (byte) -66);
        this.field3364.method4099(-32, class620.field8440);
        this.field3364.method4138(0);
        this.field3364.method4149(-44);
        this.field3364.method4116(-8629);
        this.field3364.method4096((byte) 47, 1, class380.field5528);
        this.field3364.method4117(1, true, class380.field5528);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)V")
    public final void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3380++;
        class81 var8 = this.field3364.method4150(-80);
        class81 var9 = this.field3364.method4077(false);
        this.field3360.method376(class643.field8843, -22095);
        this.field3364.method4105(-20);
        this.field3364.method4097((byte) -46, this.field3360);
        this.field3364.method4076(98, arg6);
        this.field3364.method4144(true, arg4);
        this.field3364.method4096((byte) 47, 1, class4.field31);
        this.field3364.method4117(1, true, class4.field31);
        this.field3364.method4123(-28186, arg5);
        boolean var10 = this.field3348 && this.field3376 == 0 && this.field3354 == 0;
        boolean var11 = this.field3353 && this.field3357 == 0 && this.field3373 == 0;
        if ((var11 & var10)) {
            var9.method775(1.0F, this.field3360.method1002((byte) -26, (float) arg3), this.field3360.method1004((float) arg2, 118), (byte) -75);
            var8.method775(0.0F, (float) arg3, (float) arg2, (byte) -83);
            var8.method752(arg0, arg1, 0);
            this.field3364.method4099(-32, class620.field8440);
            this.field3364.method4138(0);
            this.field3364.method4149(-63);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1614();
            var9.method775(1.0F, this.field3360.method1002((byte) -99, (float) this.field3374), this.field3360.method1004((float) arg2, 110), (byte) -120);
            this.field3364.method4099(-32, class620.field8440);
            int var14 = this.field3376 + arg1;
            int var15 = var14 + this.field3374;
            while (var15 <= var12) {
                var8.method775(0.0F, (float) this.field3374, (float) arg2, (byte) -32);
                var8.method752(arg0, var14, 0);
                this.field3364.method4138(0);
                var15 += var13;
                var14 += var13;
                this.field3364.method4149(-57);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method775(1.0F, this.field3360.method1002((byte) -81, (float) var16), this.field3360.method1004((float) arg2, 127), (byte) -16);
                this.field3364.method4099(-32, class620.field8440);
                var8.method775(0.0F, (float) var16, (float) arg2, (byte) -101);
                var8.method752(arg0, var14, 0);
                this.field3364.method4138(0);
                this.field3364.method4149(-91);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method1618();
            var9.method775(1.0F, this.field3360.method1002((byte) -121, (float) arg3), this.field3360.method1004((float) this.field3368, 77), (byte) -27);
            this.field3364.method4099(-32, class620.field8440);
            int var32 = arg0 + this.field3357;
            for (int var33 = this.field3368 + var32; var33 <= var30; var33 += var31) {
                var8.method775(0.0F, (float) arg3, (float) this.field3368, (byte) -69);
                var8.method752(var32, arg1, 0);
                this.field3364.method4138(0);
                var32 += var31;
                this.field3364.method4149(-40);
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method775(1.0F, this.field3360.method1002((byte) -62, (float) arg3), this.field3360.method1004((float) var34, 119), (byte) -10);
                this.field3364.method4099(-32, class620.field8440);
                var8.method775(0.0F, (float) arg3, (float) var34, (byte) -120);
                var8.method752(var32, arg1, 0);
                this.field3364.method4138(0);
                this.field3364.method4149(-57);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1618();
            int var20 = this.method1614();
            int var21 = this.field3376 + arg1;
            int var22 = this.field3374 + var21;
            while (var17 >= var22) {
                var9.method775(1.0F, this.field3360.method1002((byte) -89, (float) this.field3374), this.field3360.method1004((float) this.field3368, 88), (byte) -16);
                this.field3364.method4099(-32, class620.field8440);
                int var27 = this.field3357 + arg0;
                for (int var28 = var27 + this.field3368; var28 <= var18; var28 += var19) {
                    var8.method775(0.0F, (float) this.field3374, (float) this.field3368, (byte) -65);
                    var8.method752(var27, var21, 0);
                    this.field3364.method4138(0);
                    var27 += var19;
                    this.field3364.method4149(-113);
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method775(1.0F, this.field3360.method1002((byte) -82, (float) this.field3374), this.field3360.method1004((float) var29, 86), (byte) -35);
                    this.field3364.method4099(-32, class620.field8440);
                    var8.method775(0.0F, (float) this.field3374, (float) var29, (byte) -26);
                    var8.method752(var27, var21, 0);
                    this.field3364.method4138(0);
                    this.field3364.method4149(-79);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var17 > var21) {
                int var23 = var17 - var21;
                var9.method775(1.0F, this.field3360.method1002((byte) -121, (float) var23), this.field3360.method1004((float) this.field3368, 102), (byte) -59);
                this.field3364.method4099(-32, class620.field8440);
                int var24 = this.field3357 + arg0;
                int var25 = this.field3368 + var24;
                while (var18 >= var25) {
                    var8.method775(0.0F, (float) var23, (float) this.field3368, (byte) -98);
                    var8.method752(var24, var21, 0);
                    this.field3364.method4138(0);
                    var24 += var19;
                    var25 += var19;
                    this.field3364.method4149(-69);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method775(1.0F, this.field3360.method1002((byte) -102, (float) var23), this.field3360.method1004((float) var26, 115), (byte) -90);
                    this.field3364.method4099(-32, class620.field8440);
                    var8.method775(0.0F, (float) var23, (float) var26, (byte) -95);
                    var8.method752(var24, var21, 0);
                    this.field3364.method4138(0);
                    this.field3364.method4149(-54);
                }
            }
        }
        this.field3364.method4116(-8629);
        this.field3364.method4096((byte) 47, 1, class380.field5528);
        this.field3364.method4117(1, true, class380.field5528);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1623(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class487 arg7, int arg8, int arg9) {
        field3347++;
        class81 var11 = this.field3364.method4150(-121);
        class81 var12 = this.field3364.method4077(false);
        class393 var13 = (class393) arg7;
        class200 var14 = var13.field5773;
        this.field3360.method376(this.field3367 || this.field3365 || (arg6 & 0x1) == 0 ? class643.field8843 : class545.field7515, -22095);
        this.field3364.method4105(101);
        this.field3364.method4097((byte) -102, this.field3360);
        this.field3364.method4076(86, 1);
        this.field3364.method4144(true, 1);
        if (this.field3375) {
            float var15 = (float) this.field3368 / (float) this.method1618();
            float var16 = (float) this.field3374 / (float) this.method1614();
            var11.method779(1.0F, (arg3 - arg1) * var15, (arg4 - arg0) * var16, 0.0F, 0.0F, (arg5 - arg1) * var16, 0.0F, 0.0F, (arg2 - arg0) * var15, 0);
            var11.method757(((float) this.field3376 + arg1) * var16, false, 0.0F, ((float) this.field3357 + arg0) * var15);
        } else {
            var11.method779(1.0F, arg3 - arg1, arg4 - arg0, 0.0F, 0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 0);
            var11.method757(arg1, false, 0.0F, arg0);
        }
        var12.method775(1.0F, this.field3360.method1002((byte) -87, (float) this.field3374), this.field3360.method1004((float) this.field3368, 75), (byte) -60);
        this.field3364.method4099(-32, class620.field8440);
        this.field3364.method4126(1, -4382);
        this.field3364.method4097((byte) -31, var14);
        this.field3364.method4112(class534.field7355, 127, class720.field9793);
        this.field3364.method4096((byte) 47, 0, class380.field5528);
        class81 var17 = this.field3364.method4077(false);
        var17.method778(var11);
        var17.method752(-arg8, -arg9, 0);
        var17.method743(var14.method1002((byte) -32, 1.0F), 1.0F, 0, var14.method1004(1.0F, 71));
        this.field3364.method4099(-32, class620.field8440);
        this.field3364.method4138(0);
        this.field3364.method4149(-109);
        this.field3364.method4116(-8629);
        this.field3364.method4096((byte) 47, 0, class755.field10544);
        this.field3364.method4112(class534.field7355, 118, class534.field7355);
        this.field3364.method4097((byte) 98, null);
        this.field3364.method4126(0, -4382);
        this.field3364.method4116(-8629);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public final void method1194(int arg0, int arg1, int arg2) {
        field3363++;
        int[] var4 = this.field3364.method359(arg0, arg1, this.field3368, this.field3374);
        int[] var5 = new int[this.field3374 * this.field3368];
        this.field3360.method1008(0, var5, this.field3368, 0, this.field3374, (byte) 112, 0);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field3374; var6++) {
                int var7 = this.field3368 * var6;
                for (int var8 = 0; var8 < this.field3368; var8++) {
                    var5[var7 + var8] = class418.method2577(class263.method1762(1828651008, var4[var7 + var8]) << 8, class263.method1762(var5[var7 + var8], 16777215));
                }
            }
        } else if (arg2 == 1) {
            for (int var9 = 0; var9 < this.field3374; var9++) {
                int var10 = this.field3368 * var9;
                for (int var11 = 0; var11 < this.field3368; var11++) {
                    var5[var10 + var11] = class418.method2577(class263.method1762(var5[var10 + var11], 16777215), class263.method1762(var4[var10 + var11], 743571200) << 16);
                }
            }
        } else if (arg2 == 2) {
            for (int var15 = 0; var15 < this.field3374; var15++) {
                int var16 = this.field3368 * var15;
                for (int var17 = 0; var17 < this.field3368; var17++) {
                    var5[var16 + var17] = class418.method2577(class263.method1762(var5[var16 + var17], 16777215), class263.method1762(-3725444, var4[var16 + var17] << 24));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field3374; var12++) {
                int var13 = this.field3368 * var12;
                for (int var14 = 0; var14 < this.field3368; var14++) {
                    var5[var13 + var14] = class418.method2577(var4[var13 + var14] == 0 ? 0 : -16777216, class263.method1762(16777215, var5[var13 + var14]));
                }
            }
        }
        this.method1616(0, 0, this.field3368, this.field3374, var5, 0, this.field3368);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(III)Z")
    public static final boolean method1624(int arg0, int arg1, int arg2) {
        field3358++;
        if ((class444.method2671(arg2, arg0, arg1 ^ 0x1FE) | (arg0 & 0x10000) != 0) || class564.method3272(arg0, arg2, true)) {
            return true;
        } else if (arg1 == -385) {
            return (arg2 & 0x37) == 0 && class418.method2576(arg0, 120, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3352++;
        class81 var9 = this.field3364.method4150(-95);
        class81 var10 = this.field3364.method4077(false);
        this.field3360.method376(this.field3367 || this.field3365 || (arg7 & 0x1) == 0 ? class643.field8843 : class545.field7515, -22095);
        this.field3364.method4105(81);
        this.field3364.method4097((byte) 65, this.field3360);
        this.field3364.method4076(58, arg6);
        this.field3364.method4144(true, arg4);
        this.field3364.method4096((byte) 47, 1, class4.field31);
        this.field3364.method4117(1, true, class4.field31);
        this.field3364.method4123(-28186, arg5);
        var10.method775(1.0F, this.field3360.method1002((byte) -44, (float) this.field3374), this.field3360.method1004((float) this.field3368, 101), (byte) -30);
        if (this.field3375) {
            arg2 = this.field3368 * arg2 / this.method1618();
            arg3 = this.field3374 * arg3 / this.method1614();
            arg0 += this.field3357 * arg2 / this.field3368;
            arg1 += this.field3376 * arg3 / this.field3374;
        }
        var9.method775(0.0F, (float) arg3, (float) arg2, (byte) -100);
        var9.method752(arg0, arg1, 0);
        this.field3364.method4099(-32, class620.field8440);
        this.field3364.method4138(0);
        this.field3364.method4149(-118);
        this.field3364.method4116(-8629);
        this.field3364.method4096((byte) 47, 1, class380.field5528);
        this.field3364.method4117(1, true, class380.field5528);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([I)V")
    public final void method1625(int[] arg0) {
        arg0[0] = this.field3357;
        arg0[1] = this.field3376;
        field3378++;
        arg0[3] = this.field3354;
        arg0[2] = this.field3373;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
    public final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3366++;
        class81 var6 = this.field3364.method4150(-92);
        class81 var7 = this.field3364.method4077(false);
        int var8 = this.field3357 + arg0;
        int var9 = this.field3376 + arg1;
        this.field3360.method376(class643.field8843, -22095);
        this.field3364.method4105(-82);
        this.field3364.method4097((byte) -67, this.field3360);
        this.field3364.method4076(96, arg4);
        this.field3364.method4144(true, arg2);
        this.field3364.method4096((byte) 47, 1, class4.field31);
        this.field3364.method4117(1, true, class4.field31);
        this.field3364.method4123(-28186, arg3);
        var6.method775(0.0F, (float) this.field3374, (float) this.field3368, (byte) -44);
        var6.method752(var8, var9, 0);
        var7.method775(1.0F, this.field3360.method1002((byte) -125, (float) this.field3374), this.field3360.method1004((float) this.field3368, 111), (byte) -19);
        this.field3364.method4099(-32, class620.field8440);
        this.field3364.method4138(0);
        this.field3364.method4149(-41);
        this.field3364.method4116(-8629);
        this.field3364.method4096((byte) 47, 1, class380.field5528);
        this.field3364.method4117(1, true, class380.field5528);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()I")
    public final int method1626() {
        field3377++;
        return this.field3368;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
    public final void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3349++;
        int[] var7 = this.field3364.method359(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class418.method2577(var7[var8], -16777216);
            }
            this.method1616(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILaa;II)V")
    public final void method1199(int arg0, int arg1, class487 arg2, int arg3, int arg4) {
        field3371++;
        class393 var6 = (class393) arg2;
        int var7 = this.field3376 + arg1;
        int var8 = this.field3357 + arg0;
        class200 var9 = var6.field5773;
        this.field3360.method376(class643.field8843, -22095);
        this.field3364.method4105(-81);
        this.field3364.method4097((byte) -35, this.field3360);
        this.field3364.method4076(110, 1);
        this.field3364.method4144(true, 1);
        class81 var10 = this.field3364.method4150(-120);
        var10.method775(0.0F, (float) this.field3374, (float) this.field3368, (byte) -55);
        var10.method752(var8, var7, 0);
        this.field3364.method4138(0);
        class81 var11 = this.field3364.method4077(false);
        var11.method775(1.0F, this.field3360.method1002((byte) -102, (float) this.field3374), this.field3360.method1004((float) this.field3368, 106), (byte) -33);
        this.field3364.method4099(-32, class620.field8440);
        this.field3364.method4126(1, -4382);
        this.field3364.method4097((byte) 101, var9);
        this.field3364.method4112(class534.field7355, 110, class720.field9793);
        this.field3364.method4096((byte) 47, 0, class380.field5528);
        class81 var12 = this.field3364.method4077(false);
        var12.method775(1.0F, var9.method1002((byte) -108, (float) this.field3374), var9.method1004((float) this.field3368, 95), (byte) -81);
        var12.method757(var9.method1002((byte) -27, (float) (var7 - arg4)), false, 0.0F, var9.method1004((float) (var8 - arg3), 122));
        this.field3364.method4099(-32, class620.field8440);
        this.field3364.method4149(-81);
        this.field3364.method4116(-8629);
        this.field3364.method4096((byte) 47, 0, class755.field10544);
        this.field3364.method4112(class534.field7355, 127, class534.field7355);
        this.field3364.method4097((byte) -84, null);
        this.field3364.method4126(0, -4382);
        this.field3364.method4116(-8629);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lwga;IIZ)V")
    public class232(class745 arg0, int arg1, int arg2, boolean arg3) {
        this.field3374 = arg2;
        this.field3368 = arg1;
        this.field3364 = arg0;
        this.field3360 = arg0.method2297(arg2, (byte) -84, arg1, class523.field7249, arg3 ? class746.field10332 : class19.field290);
        this.field3360.method1014(true, true, 25688);
        this.field3367 = this.field3360.method1009(false) != arg1;
        this.field3365 = this.field3360.method1010(-39) != arg2;
        this.field3353 = !this.field3367 && this.field3360.method1011(97);
        this.field3348 = !this.field3365 && this.field3360.method1011(119);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lwga;II[III)V")
    public class232(class745 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3364 = arg0;
        this.field3368 = arg1;
        this.field3374 = arg2;
        this.field3360 = arg0.method2284(arg1, arg3, false, (byte) -116, arg4, arg5, arg2);
        this.field3360.method1014(true, true, 25688);
        this.field3367 = this.field3360.method1009(false) != arg1;
        this.field3365 = this.field3360.method1010(-74) != arg2;
        this.field3353 = !this.field3367 && this.field3360.method1011(91);
        this.field3348 = !this.field3365 && this.field3360.method1011(101);
    }
}
