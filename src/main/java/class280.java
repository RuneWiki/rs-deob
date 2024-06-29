import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class280 extends class52 {

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    private int field3871 = 0;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    private int field3882 = 0;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    private int field3869 = 0;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    private int field3883 = 0;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Z")
    private boolean field3879 = false;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    private int field3875;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    private int field3877;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "Lwr;")
    private class388 field3886;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "Lwn;")
    private class617 field3868;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "Z")
    private boolean field3887;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Z")
    private boolean field3867;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "Z")
    private boolean field3878;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "Z")
    private boolean field3865;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "Lej;")
    public static class104 field3888 = new class104("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    public static int field3889 = 0;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "[[I")
    public static int[][] field3890;

    @OriginalMember(owner = "client!jo", name = "ma", descriptor = "()I")
    public final int method432() {
        field3881++;
        return this.field3877 + this.field3869 + this.field3883;
    }

    @OriginalMember(owner = "client!jo", name = "ra", descriptor = "(IIIIIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3862++;
        class557 var8 = this.field3886.method2342((byte) -116);
        class557 var9 = this.field3886.method2289(-62);
        this.field3868.method1483(false, this.field3887 || this.field3867 ? class339.field4575 : class241.field3384);
        this.field3886.method2271(-28704);
        this.field3886.method2267(2, this.field3868);
        this.field3886.method2317(arg6, 9);
        this.field3886.method2334(arg4, (byte) 126);
        this.field3886.method2315(class610.field8770, 1, 8);
        this.field3886.method2326(106, 1, class610.field8770);
        this.field3886.method2309(arg5, -9683);
        var9.method3174(1.0F, (byte) 59, this.field3868.method1814(127, (float) this.field3875), this.field3868.method1815(25485, (float) this.field3877));
        if (this.field3879) {
            arg2 = this.field3875 * arg2 / this.method419();
            arg3 = this.field3877 * arg3 / this.method432();
            arg1 += this.field3869 * arg3 / this.field3877;
            arg0 += this.field3871 * arg2 / this.field3875;
        }
        var8.method3174(0.0F, (byte) 59, (float) arg2, (float) arg3);
        var8.method1051(arg0, arg1, 0);
        this.field3886.method2299(45, class510.field7141);
        this.field3886.method2286(21838);
        this.field3886.method2330((byte) 89);
        this.field3886.method2325(1);
        this.field3886.method2315(class459.field6466, 1, 8);
        this.field3886.method2326(104, 1, class459.field6466);
    }

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "(IIIIIII)V")
    public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3859++;
        class557 var8 = this.field3886.method2342((byte) -84);
        class557 var9 = this.field3886.method2289(-95);
        this.field3868.method1483(false, class339.field4575);
        this.field3886.method2271(-28704);
        this.field3886.method2267(2, this.field3868);
        this.field3886.method2317(arg6, 9);
        this.field3886.method2334(arg4, (byte) 117);
        this.field3886.method2315(class610.field8770, 1, 8);
        this.field3886.method2326(116, 1, class610.field8770);
        this.field3886.method2309(arg5, -9683);
        boolean var10 = this.field3865 && this.field3869 == 0 && this.field3883 == 0;
        boolean var11 = this.field3878 && this.field3871 == 0 && this.field3882 == 0;
        if ((var10 & var11)) {
            var9.method3174(1.0F, (byte) 59, this.field3868.method1814(122, (float) arg2), this.field3868.method1815(25485, (float) arg3));
            var8.method3174(0.0F, (byte) 59, (float) arg2, (float) arg3);
            var8.method1051(arg0, arg1, 0);
            this.field3886.method2299(104, class510.field7141);
            this.field3886.method2286(21838);
            this.field3886.method2330((byte) 51);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method432();
            var9.method3174(1.0F, (byte) 59, this.field3868.method1814(127, (float) arg2), this.field3868.method1815(25485, (float) this.field3877));
            this.field3886.method2299(124, class510.field7141);
            int var32 = this.field3869 + arg1;
            for (int var33 = this.field3877 + var32; var33 <= var30; var33 += var31) {
                var8.method3174(0.0F, (byte) 59, (float) arg2, (float) this.field3877);
                var8.method1051(arg0, var32, 0);
                this.field3886.method2286(21838);
                var32 += var31;
                this.field3886.method2330((byte) 68);
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method3174(1.0F, (byte) 59, this.field3868.method1814(124, (float) arg2), this.field3868.method1815(25485, (float) var34));
                this.field3886.method2299(78, class510.field7141);
                var8.method3174(0.0F, (byte) 59, (float) arg2, (float) var34);
                var8.method1051(arg0, var32, 0);
                this.field3886.method2286(21838);
                this.field3886.method2330((byte) 41);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method419();
            var9.method3174(1.0F, (byte) 59, this.field3868.method1814(127, (float) this.field3875), this.field3868.method1815(25485, (float) arg3));
            this.field3886.method2299(90, class510.field7141);
            int var27 = this.field3871 + arg0;
            int var28 = var27 + this.field3875;
            while (var28 <= var25) {
                var8.method3174(0.0F, (byte) 59, (float) this.field3875, (float) arg3);
                var8.method1051(var27, arg1, 0);
                this.field3886.method2286(21838);
                this.field3886.method2330((byte) 74);
                var28 += var26;
                var27 += var26;
            }
            if (var25 > var27) {
                int var29 = var25 - var27;
                var9.method3174(1.0F, (byte) 59, this.field3868.method1814(122, (float) var29), this.field3868.method1815(25485, (float) arg3));
                this.field3886.method2299(63, class510.field7141);
                var8.method3174(0.0F, (byte) 59, (float) var29, (float) arg3);
                var8.method1051(var27, arg1, 0);
                this.field3886.method2286(21838);
                this.field3886.method2330((byte) 104);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method419();
            int var15 = this.method432();
            int var16 = this.field3869 + arg1;
            for (int var17 = this.field3877 + var16; var17 <= var12; var17 += var15) {
                var9.method3174(1.0F, (byte) 59, this.field3868.method1814(127, (float) this.field3875), this.field3868.method1815(25485, (float) this.field3877));
                this.field3886.method2299(44, class510.field7141);
                int var22 = this.field3871 + arg0;
                int var23 = var22 + this.field3875;
                while (var13 >= var23) {
                    var8.method3174(0.0F, (byte) 59, (float) this.field3875, (float) this.field3877);
                    var8.method1051(var22, var16, 0);
                    this.field3886.method2286(21838);
                    this.field3886.method2330((byte) 95);
                    var23 += var14;
                    var22 += var14;
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method3174(1.0F, (byte) 59, this.field3868.method1814(125, (float) var24), this.field3868.method1815(25485, (float) this.field3877));
                    this.field3886.method2299(98, class510.field7141);
                    var8.method3174(0.0F, (byte) 59, (float) var24, (float) this.field3877);
                    var8.method1051(var22, var16, 0);
                    this.field3886.method2286(21838);
                    this.field3886.method2330((byte) 95);
                }
                var16 += var15;
            }
            if (var16 < var12) {
                int var18 = var12 - var16;
                var9.method3174(1.0F, (byte) 59, this.field3868.method1814(123, (float) this.field3875), this.field3868.method1815(25485, (float) var18));
                this.field3886.method2299(41, class510.field7141);
                int var19 = arg0 + this.field3871;
                int var20 = this.field3875 + var19;
                while (var13 >= var20) {
                    var8.method3174(0.0F, (byte) 59, (float) this.field3875, (float) var18);
                    var8.method1051(var19, var16, 0);
                    this.field3886.method2286(21838);
                    this.field3886.method2330((byte) 124);
                    var20 += var14;
                    var19 += var14;
                }
                if (var13 > var19) {
                    int var21 = var13 - var19;
                    var9.method3174(1.0F, (byte) 59, this.field3868.method1814(124, (float) var21), this.field3868.method1815(25485, (float) var18));
                    this.field3886.method2299(72, class510.field7141);
                    var8.method3174(0.0F, (byte) 59, (float) var21, (float) var18);
                    var8.method1051(var19, var16, 0);
                    this.field3886.method2286(21838);
                    this.field3886.method2330((byte) 67);
                }
            }
        }
        this.field3886.method2325(1);
        this.field3886.method2315(class459.field6466, 1, 8);
        this.field3886.method2326(91, 1, class459.field6466);
    }

    @OriginalMember(owner = "client!jo", name = "KA", descriptor = "(IIII)V")
    public final void method420(int arg0, int arg1, int arg2, int arg3) {
        this.field3869 = arg1;
        this.field3882 = arg2;
        this.field3883 = arg3;
        this.field3871 = arg0;
        field3863++;
        this.field3879 = this.field3871 != 0 || this.field3869 != 0 || this.field3882 != 0 || this.field3883 != 0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII[III)V")
    private final void method1804(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3868.method1813(arg4, arg6, arg1, (byte) 110, arg2, arg3, arg5, arg0);
        field3874++;
    }

    @OriginalMember(owner = "client!jo", name = "EA", descriptor = "()I")
    public final int method419() {
        field3872++;
        return this.field3882 + this.field3875 + this.field3871;
    }

    @OriginalMember(owner = "client!jo", name = "P", descriptor = "(IIIIII)V")
    public final void method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3873++;
        int[] var7 = this.field3886.method1361(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class73.method578(var7[var8], -16777216);
            }
            this.method1804(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    public static final void method1805(byte arg0) {
        int var1 = 22 % ((68 - arg0) / 44);
        field3884++;
        class472.field6626 = true;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method428(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class310 arg6, int arg7, int arg8) {
        field3860++;
        class557 var10 = this.field3886.method2342((byte) 31);
        class557 var11 = this.field3886.method2289(-54);
        class494 var12 = (class494) arg6;
        class617 var13 = var12.field6918;
        this.field3868.method1483(false, class241.field3384);
        this.field3886.method2271(-28704);
        this.field3886.method2267(2, this.field3868);
        this.field3886.method2317(1, 9);
        this.field3886.method2334(1, (byte) 95);
        if (this.field3879) {
            float var14 = (float) this.field3875 / (float) this.method419();
            float var15 = (float) this.field3877 / (float) this.method432();
            var10.method3167(0.0F, (arg2 - arg0) * var14, (arg3 - arg1) * var14, true, 1.0F, (arg5 - arg1) * var15, 0.0F, (arg4 - arg0) * var15, 0.0F, 0.0F);
            var10.method3180(((float) this.field3871 + arg0) * var14, 0.0F, ((float) this.field3869 + arg1) * var15, 64);
        } else {
            var10.method3167(0.0F, arg2 - arg0, -arg1 + arg3, true, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, 0.0F);
            var10.method3180(arg0, 0.0F, arg1, 107);
        }
        var11.method3174(1.0F, (byte) 59, this.field3868.method1814(125, (float) this.field3875), this.field3868.method1815(25485, (float) this.field3877));
        this.field3886.method2299(82, class510.field7141);
        this.field3886.method2296(0, 1);
        this.field3886.method2267(2, var13);
        this.field3886.method2313(class167.field2417, 127, class137.field2155);
        this.field3886.method2315(class459.field6466, 0, 8);
        class557 var16 = this.field3886.method2289(-95);
        var16.method1049(var10);
        var16.method1051(-arg7, -arg8, 0);
        var16.method3161(var13.method1814(121, 1.0F), 1.0F, -73, var13.method1815(25485, 1.0F));
        this.field3886.method2299(104, class510.field7141);
        this.field3886.method2286(21838);
        this.field3886.method2330((byte) 70);
        this.field3886.method2325(1);
        this.field3886.method2315(class583.field8185, 0, 8);
        this.field3886.method2313(class167.field2417, 99, class167.field2417);
        this.field3886.method2267(2, null);
        this.field3886.method2296(0, 0);
        this.field3886.method2325(1);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)I")
    public static final int method1806(byte arg0) {
        field3885++;
        if (arg0 < 33) {
            field3888 = null;
        }
        return class207.field2918++;
    }

    @OriginalMember(owner = "client!jo", name = "la", descriptor = "()I")
    public final int method422() {
        field3866++;
        return this.field3877;
    }

    @OriginalMember(owner = "client!jo", name = "DA", descriptor = "(IIIII)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3870++;
        class557 var6 = this.field3886.method2342((byte) 99);
        class557 var7 = this.field3886.method2289(-62);
        int var8 = this.field3869 + arg1;
        int var9 = this.field3871 + arg0;
        this.field3868.method1483(false, class339.field4575);
        this.field3886.method2271(-28704);
        this.field3886.method2267(2, this.field3868);
        this.field3886.method2317(arg4, 9);
        this.field3886.method2334(arg2, (byte) 72);
        this.field3886.method2315(class610.field8770, 1, 8);
        this.field3886.method2326(116, 1, class610.field8770);
        this.field3886.method2309(arg3, -9683);
        var6.method3174(0.0F, (byte) 59, (float) this.field3875, (float) this.field3877);
        var6.method1051(var9, var8, 0);
        var7.method3174(1.0F, (byte) 59, this.field3868.method1814(124, (float) this.field3875), this.field3868.method1815(25485, (float) this.field3877));
        this.field3886.method2299(87, class510.field7141);
        this.field3886.method2286(21838);
        this.field3886.method2330((byte) 126);
        this.field3886.method2325(1);
        this.field3886.method2315(class459.field6466, 1, 8);
        this.field3886.method2326(106, 1, class459.field6466);
    }

    @OriginalMember(owner = "client!jo", name = "BA", descriptor = "(III)V")
    public final void method502(int arg0, int arg1, int arg2) {
        field3880++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILpa;II)V")
    public final void method431(int arg0, int arg1, class310 arg2, int arg3, int arg4) {
        field3861++;
        class494 var6 = (class494) arg2;
        int var7 = this.field3871 + arg0;
        class617 var8 = var6.field6918;
        int var9 = this.field3869 + arg1;
        this.field3868.method1483(false, class339.field4575);
        this.field3886.method2271(-28704);
        this.field3886.method2267(2, this.field3868);
        this.field3886.method2317(1, 9);
        this.field3886.method2334(1, (byte) -64);
        class557 var10 = this.field3886.method2342((byte) 76);
        var10.method3174(0.0F, (byte) 59, (float) this.field3875, (float) this.field3877);
        var10.method1051(var7, var9, 0);
        this.field3886.method2286(21838);
        class557 var11 = this.field3886.method2289(-102);
        var11.method3174(1.0F, (byte) 59, this.field3868.method1814(126, (float) this.field3875), this.field3868.method1815(25485, (float) this.field3877));
        this.field3886.method2299(76, class510.field7141);
        this.field3886.method2296(0, 1);
        this.field3886.method2267(2, var8);
        this.field3886.method2313(class167.field2417, 108, class137.field2155);
        this.field3886.method2315(class459.field6466, 0, 8);
        class557 var12 = this.field3886.method2289(-103);
        var12.method3174(1.0F, (byte) 59, var8.method1814(122, (float) this.field3875), var8.method1815(25485, (float) this.field3877));
        var12.method3180(var8.method1814(121, (float) (var7 - arg3)), 0.0F, var8.method1815(25485, (float) (var9 - arg4)), 27);
        this.field3886.method2299(94, class510.field7141);
        this.field3886.method2330((byte) 121);
        this.field3886.method2325(1);
        this.field3886.method2315(class583.field8185, 0, 8);
        this.field3886.method2313(class167.field2417, 121, class167.field2417);
        this.field3886.method2267(2, null);
        this.field3886.method2296(0, 0);
        this.field3886.method2325(1);
    }

    @OriginalMember(owner = "client!jo", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method424(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field3864++;
        class557 var10 = this.field3886.method2342((byte) 76);
        class557 var11 = this.field3886.method2289(-116);
        this.field3868.method1483(false, this.field3887 || this.field3867 ? class339.field4575 : class241.field3384);
        this.field3886.method2271(-28704);
        this.field3886.method2267(2, this.field3868);
        this.field3886.method2317(arg8, 9);
        this.field3886.method2334(arg6, (byte) -90);
        this.field3886.method2315(class610.field8770, 1, 8);
        this.field3886.method2326(123, 1, class610.field8770);
        this.field3886.method2309(arg7, -9683);
        if (this.field3879) {
            float var12 = (float) this.method419();
            float var13 = (float) this.method432();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3869 * var16;
            float var19 = (float) this.field3869 * var17;
            float var20 = (float) this.field3871 * var14;
            float var21 = (float) this.field3871 * var15;
            float var22 = (float) this.field3882 * -var14;
            float var23 = (float) this.field3882 * -var15;
            float var24 = (float) this.field3883 * -var16;
            arg4 = arg4 + var20 + var24;
            float var25 = (float) this.field3883 * -var17;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        var10.method3167(0.0F, arg2 - arg0, arg3 - arg1, true, 1.0F, arg5 - arg1, 0.0F, arg4 - arg0, 0.0F, 0.0F);
        var10.method3180(arg0, 0.0F, arg1, 43);
        var11.method3174(1.0F, (byte) 59, this.field3868.method1814(127, (float) this.field3875), this.field3868.method1815(25485, (float) this.field3877));
        this.field3886.method2299(69, class510.field7141);
        this.field3886.method2286(21838);
        this.field3886.method2330((byte) 27);
        this.field3886.method2325(1);
        this.field3886.method2315(class459.field6466, 1, 8);
        this.field3886.method2326(92, 1, class459.field6466);
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lwr;IIZ)V")
    public class280(class388 arg0, int arg1, int arg2, boolean arg3) {
        this.field3875 = arg1;
        this.field3877 = arg2;
        this.field3886 = arg0;
        this.field3868 = arg0.method1650(class608.field8759, arg3 ? class49.field958 : class351.field4715, (byte) -26, arg2, arg1);
        this.field3887 = this.field3868.method1809(18814) != arg1;
        this.field3867 = this.field3868.method1808(false) != arg2;
        this.field3878 = !this.field3887 && this.field3868.method1811(3460);
        this.field3865 = !this.field3867 && this.field3868.method1811(3460);
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "()I")
    public final int method429() {
        field3876++;
        return this.field3875;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)V")
    public static void method1807(byte arg0) {
        field3888 = null;
        field3890 = null;
        int var1 = -121 % ((arg0 - 42) / 43);
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lwr;II[III)V")
    public class280(class388 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3875 = arg1;
        this.field3886 = arg0;
        this.field3877 = arg2;
        this.field3868 = arg0.method1606((byte) 103, arg4, arg2, false, arg5, arg3, arg1);
        this.field3887 = this.field3868.method1809(18814) != arg1;
        this.field3867 = this.field3868.method1808(false) != arg2;
        this.field3878 = !this.field3887 && this.field3868.method1811(3460);
        this.field3865 = !this.field3867 && this.field3868.method1811(3460);
    }
}
