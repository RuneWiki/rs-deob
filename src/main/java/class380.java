import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class380 extends class511 {

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    private int field4859 = 0;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    private int field4860 = 0;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "Z")
    private boolean field4863 = false;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    private int field4879 = 0;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    private int field4883 = 0;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    private int field4870;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    private int field4878;

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Lfc;")
    private class575 field4865;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "Lqaa;")
    private class309 field4881;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "Z")
    private boolean field4874;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Z")
    private boolean field4862;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "Z")
    private boolean field4869;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Z")
    private boolean field4855;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "Lnj;")
    public static class415 field4884 = new class415(35, 11);

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field4885 = -1;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "Lra;")
    public static class361 field4886 = new class361(103, -1);

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "[I")
    public static int[] field4887 = new int[32];

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "[I")
    public static int[] field4888 = new int[13];

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "(III)V", line = 4)
    public final void method597(int arg0, int arg1, int arg2) {
        field4871++;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "()I", line = 14)
    public final int method607() {
        field4873++;
        return this.field4878;
    }

    @OriginalMember(owner = "client!bv", name = "KA", descriptor = "(IIIIIII)V", line = 22)
    public final void method604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4857++;
        class131 var8 = this.field4865.method3106(113);
        class131 var9 = this.field4865.method3125((byte) 98);
        this.field4881.method1071(this.field4874 || this.field4862 ? class105.field1381 : class705.field9815, -30763);
        this.field4865.method3138(61);
        this.field4865.method3091(true, this.field4881);
        this.field4865.method3123(arg6, 1);
        this.field4865.method3072((byte) -57, arg4);
        this.field4865.method3115(1, 0, class425.field5511);
        this.field4865.method3143(4, class425.field5511, 1);
        this.field4865.method3142(arg5, -100);
        var9.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -105), 0, this.field4881.method1135(7886, (float) this.field4870));
        if (this.field4863) {
            arg2 = this.field4870 * arg2 / this.method602();
            arg3 = this.field4878 * arg3 / this.method595();
            arg1 += this.field4860 * arg3 / this.field4878;
            arg0 += this.field4879 * arg2 / this.field4870;
        }
        var8.method955(0.0F, (float) arg3, 0, (float) arg2);
        var8.method143(arg0, arg1, 0);
        this.field4865.method3140(30604, class34.field500);
        this.field4865.method3116(99);
        this.field4865.method3126((byte) 117);
        this.field4865.method3114(15);
        this.field4865.method3115(1, 0, class243.field3260);
        this.field4865.method3143(4, class243.field3260, 1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILfa;II)V", line = 62)
    public final void method594(int arg0, int arg1, class619 arg2, int arg3, int arg4) {
        field4876++;
        class677 var6 = (class677) arg2;
        class309 var7 = var6.field9337;
        int var8 = this.field4879 + arg0;
        int var9 = this.field4860 + arg1;
        this.field4881.method1071(class105.field1381, -30763);
        this.field4865.method3138(69);
        this.field4865.method3091(true, this.field4881);
        this.field4865.method3123(1, 1);
        this.field4865.method3072((byte) -57, 1);
        class131 var10 = this.field4865.method3106(112);
        var10.method955(0.0F, (float) this.field4878, 0, (float) this.field4870);
        var10.method143(var8, var9, 0);
        this.field4865.method3116(110);
        class131 var11 = this.field4865.method3125((byte) 100);
        var11.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -100), 0, this.field4881.method1135(7886, (float) this.field4870));
        this.field4865.method3140(30604, class34.field500);
        this.field4865.method3088((byte) 91, 1);
        this.field4865.method3091(true, var7);
        this.field4865.method3105(class219.field2875, true, class510.field6687);
        this.field4865.method3115(0, 0, class243.field3260);
        class131 var12 = this.field4865.method3125((byte) 108);
        var12.method955(1.0F, var7.method1136((float) this.field4878, (byte) -102), 0, var7.method1135(7886, (float) this.field4870));
        var12.method942(var7.method1136((float) (var9 - arg4), (byte) -100), 0.0F, var7.method1135(7886, (float) (var8 - arg3)), -3);
        this.field4865.method3140(30604, class34.field500);
        this.field4865.method3126((byte) 112);
        this.field4865.method3114(15);
        this.field4865.method3115(0, 0, class61.field833);
        this.field4865.method3105(class219.field2875, true, class219.field2875);
        this.field4865.method3091(true, null);
        this.field4865.method3088((byte) 91, 0);
        this.field4865.method3114(15);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lfc;IIZ)V", line = 620)
    public class380(class575 arg0, int arg1, int arg2, boolean arg3) {
        this.field4870 = arg1;
        this.field4878 = arg2;
        this.field4865 = arg0;
        this.field4881 = arg0.method192(arg2, 0, arg1, class6.field48, arg3 ? class135.field1774 : class82.field1117);
        this.field4874 = this.field4881.method1131((byte) 123) != arg1;
        this.field4862 = arg2 != this.field4881.method1130((byte) -91);
        this.field4869 = !this.field4874 && this.field4881.method1128(-9355);
        this.field4855 = !this.field4862 && this.field4881.method1128(-9355);
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lfc;II[III)V", line = 634)
    public class380(class575 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4870 = arg1;
        this.field4865 = arg0;
        this.field4878 = arg2;
        this.field4881 = arg0.method213(arg1, arg3, arg4, -8, arg5, false, arg2);
        this.field4874 = arg1 != this.field4881.method1131((byte) -47);
        this.field4862 = this.field4881.method1130((byte) -91) != arg2;
        this.field4869 = !this.field4874 && this.field4881.method1128(-9355);
        this.field4855 = !this.field4862 && this.field4881.method1128(-9355);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZ)V", line = 116)
    public static final void method2169(boolean arg0, boolean arg1) {
        class344.method1984(class196.field2562, arg1, class461.field6047, class519.field6796, (byte) 103);
        field4880++;
        if (!arg0) {
            field4887 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "()I", line = 128)
    public final int method595() {
        field4872++;
        return this.field4878 + this.field4860 + this.field4883;
    }

    @OriginalMember(owner = "client!bv", name = "ba", descriptor = "(IIIIIII)V", line = 137)
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4856++;
        class131 var8 = this.field4865.method3106(127);
        class131 var9 = this.field4865.method3125((byte) -102);
        this.field4881.method1071(class105.field1381, -30763);
        this.field4865.method3138(-87);
        this.field4865.method3091(true, this.field4881);
        this.field4865.method3123(arg6, 1);
        this.field4865.method3072((byte) -57, arg4);
        this.field4865.method3115(1, 0, class425.field5511);
        this.field4865.method3143(4, class425.field5511, 1);
        this.field4865.method3142(arg5, -14);
        boolean var10 = this.field4855 && this.field4860 == 0 && this.field4883 == 0;
        boolean var11 = this.field4869 && this.field4879 == 0 && this.field4859 == 0;
        if (var11 & var10) {
            var9.method955(1.0F, this.field4881.method1136((float) arg3, (byte) -95), 0, this.field4881.method1135(7886, (float) arg2));
            var8.method955(0.0F, (float) arg3, 0, (float) arg2);
            var8.method143(arg0, arg1, 0);
            this.field4865.method3140(30604, class34.field500);
            this.field4865.method3116(104);
            this.field4865.method3126((byte) 106);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method595();
            var9.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -104), 0, this.field4881.method1135(7886, (float) arg2));
            this.field4865.method3140(30604, class34.field500);
            int var32 = arg1 + this.field4860;
            int var33 = this.field4878 + var32;
            while (var33 <= var30) {
                var8.method955(0.0F, (float) this.field4878, 0, (float) arg2);
                var8.method143(arg0, var32, 0);
                this.field4865.method3116(119);
                var32 += var31;
                var33 += var31;
                this.field4865.method3126((byte) -2);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method955(1.0F, this.field4881.method1136((float) var34, (byte) -99), 0, this.field4881.method1135(7886, (float) arg2));
                this.field4865.method3140(30604, class34.field500);
                var8.method955(0.0F, (float) var34, 0, (float) arg2);
                var8.method143(arg0, var32, 0);
                this.field4865.method3116(120);
                this.field4865.method3126((byte) 100);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method602();
            var9.method955(1.0F, this.field4881.method1136((float) arg3, (byte) -97), 0, this.field4881.method1135(7886, (float) this.field4870));
            this.field4865.method3140(30604, class34.field500);
            int var27 = this.field4879 + arg0;
            for (int var28 = this.field4870 + var27; var28 <= var25; var28 += var26) {
                var8.method955(0.0F, (float) arg3, 0, (float) this.field4870);
                var8.method143(var27, arg1, 0);
                this.field4865.method3116(96);
                this.field4865.method3126((byte) -42);
                var27 += var26;
            }
            if (var27 < var25) {
                int var29 = var25 - var27;
                var9.method955(1.0F, this.field4881.method1136((float) arg3, (byte) -126), 0, this.field4881.method1135(7886, (float) var29));
                this.field4865.method3140(30604, class34.field500);
                var8.method955(0.0F, (float) arg3, 0, (float) var29);
                var8.method143(var27, arg1, 0);
                this.field4865.method3116(102);
                this.field4865.method3126((byte) 124);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method602();
            int var15 = this.method595();
            int var16 = this.field4860 + arg1;
            int var17 = this.field4878 + var16;
            while (var12 >= var17) {
                var9.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -104), 0, this.field4881.method1135(7886, (float) this.field4870));
                this.field4865.method3140(30604, class34.field500);
                int var22 = this.field4879 + arg0;
                for (int var23 = var22 + this.field4870; var23 <= var13; var23 += var14) {
                    var8.method955(0.0F, (float) this.field4878, 0, (float) this.field4870);
                    var8.method143(var22, var16, 0);
                    this.field4865.method3116(105);
                    var22 += var14;
                    this.field4865.method3126((byte) -116);
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -124), 0, this.field4881.method1135(7886, (float) var24));
                    this.field4865.method3140(30604, class34.field500);
                    var8.method955(0.0F, (float) this.field4878, 0, (float) var24);
                    var8.method143(var22, var16, 0);
                    this.field4865.method3116(-121);
                    this.field4865.method3126((byte) 125);
                }
                var17 += var15;
                var16 += var15;
            }
            if (var12 > var16) {
                int var18 = var12 - var16;
                var9.method955(1.0F, this.field4881.method1136((float) var18, (byte) -120), 0, this.field4881.method1135(7886, (float) this.field4870));
                this.field4865.method3140(30604, class34.field500);
                int var19 = this.field4879 + arg0;
                for (int var20 = this.field4870 + var19; var20 <= var13; var20 += var14) {
                    var8.method955(0.0F, (float) var18, 0, (float) this.field4870);
                    var8.method143(var19, var16, 0);
                    this.field4865.method3116(-128);
                    this.field4865.method3126((byte) 116);
                    var19 += var14;
                }
                if (var19 < var13) {
                    int var21 = var13 - var19;
                    var9.method955(1.0F, this.field4881.method1136((float) var18, (byte) -119), 0, this.field4881.method1135(7886, (float) var21));
                    this.field4865.method3140(30604, class34.field500);
                    var8.method955(0.0F, (float) var18, 0, (float) var21);
                    var8.method143(var19, var16, 0);
                    this.field4865.method3116(108);
                    this.field4865.method3126((byte) -55);
                }
            }
        }
        this.field4865.method3114(15);
        this.field4865.method3115(1, 0, class243.field3260);
        this.field4865.method3143(4, class243.field3260, 1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 350)
    public static void method2170(int arg0) {
        field4884 = null;
        field4888 = null;
        field4886 = null;
        if (arg0 > 0) {
            method2169(false, true);
        }
        field4887 = null;
    }

    @OriginalMember(owner = "client!bv", name = "EA", descriptor = "(IIII)V", line = 366)
    public final void method610(int arg0, int arg1, int arg2, int arg3) {
        this.field4879 = arg0;
        this.field4860 = arg1;
        this.field4859 = arg2;
        field4875++;
        this.field4883 = arg3;
        this.field4863 = this.field4879 != 0 || this.field4860 != 0 || this.field4859 != 0 || this.field4883 != 0;
    }

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "(IIIII)V", line = 378)
    public final void method606(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4868++;
        class131 var6 = this.field4865.method3106(119);
        class131 var7 = this.field4865.method3125((byte) 99);
        int var8 = this.field4879 + arg0;
        int var9 = this.field4860 + arg1;
        this.field4881.method1071(class105.field1381, -30763);
        this.field4865.method3138(-76);
        this.field4865.method3091(true, this.field4881);
        this.field4865.method3123(arg4, 1);
        this.field4865.method3072((byte) -57, arg2);
        this.field4865.method3115(1, 0, class425.field5511);
        this.field4865.method3143(4, class425.field5511, 1);
        this.field4865.method3142(arg3, 105);
        var6.method955(0.0F, (float) this.field4878, 0, (float) this.field4870);
        var6.method143(var8, var9, 0);
        var7.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -121), 0, this.field4881.method1135(7886, (float) this.field4870));
        this.field4865.method3140(30604, class34.field500);
        this.field4865.method3116(125);
        this.field4865.method3126((byte) -63);
        this.field4865.method3114(15);
        this.field4865.method3115(1, 0, class243.field3260);
        this.field4865.method3143(4, class243.field3260, 1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 411)
    public final void method609(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class619 arg6, int arg7, int arg8) {
        field4861++;
        class131 var10 = this.field4865.method3106(124);
        class131 var11 = this.field4865.method3125((byte) -92);
        class677 var12 = (class677) arg6;
        class309 var13 = var12.field9337;
        this.field4881.method1071(class705.field9815, -30763);
        this.field4865.method3138(90);
        this.field4865.method3091(true, this.field4881);
        this.field4865.method3123(1, 1);
        this.field4865.method3072((byte) -57, 1);
        if (this.field4863) {
            float var14 = (float) this.field4870 / (float) this.method602();
            float var15 = (float) this.field4878 / (float) this.method595();
            var10.method940(1.0F, 0.0F, 0.0F, 0.0F, (arg2 - arg0) * var14, 2, 0.0F, (arg3 - arg1) * var14, (arg4 - arg0) * var15, (arg5 - arg1) * var15);
            var10.method942(((float) this.field4860 + arg1) * var15, 0.0F, ((float) this.field4879 + arg0) * var14, -3);
        } else {
            var10.method940(1.0F, 0.0F, 0.0F, 0.0F, arg2 - arg0, 2, 0.0F, arg3 - arg1, arg4 - arg0, arg5 - arg1);
            var10.method942(arg1, 0.0F, arg0, -3);
        }
        var11.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -125), 0, this.field4881.method1135(7886, (float) this.field4870));
        this.field4865.method3140(30604, class34.field500);
        this.field4865.method3088((byte) 91, 1);
        this.field4865.method3091(true, var13);
        this.field4865.method3105(class219.field2875, true, class510.field6687);
        this.field4865.method3115(0, 0, class243.field3260);
        class131 var16 = this.field4865.method3125((byte) 97);
        var16.method133(var10);
        var16.method143(-arg7, -arg8, 0);
        var16.method951(var13.method1135(7886, 1.0F), 1.0F, (byte) 78, var13.method1136(1.0F, (byte) -105));
        this.field4865.method3140(30604, class34.field500);
        this.field4865.method3116(-88);
        this.field4865.method3126((byte) 126);
        this.field4865.method3114(15);
        this.field4865.method3115(0, 0, class61.field833);
        this.field4865.method3105(class219.field2875, true, class219.field2875);
        this.field4865.method3091(true, null);
        this.field4865.method3088((byte) 91, 0);
        this.field4865.method3114(15);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIII[III)V", line = 467)
    private final void method2171(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field4864++;
        this.field4881.method1132(arg4, arg1, (byte) 64, arg2, arg3, arg0, arg5, arg6);
    }

    @OriginalMember(owner = "client!bv", name = "AA", descriptor = "()I", line = 479)
    public final int method602() {
        field4866++;
        return this.field4870 + this.field4859 + this.field4879;
    }

    @OriginalMember(owner = "client!bv", name = "sa", descriptor = "(FFFFFFIII)V", line = 491)
    public final void method598(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field4882++;
        class131 var10 = this.field4865.method3106(123);
        class131 var11 = this.field4865.method3125((byte) -70);
        this.field4881.method1071(this.field4874 || this.field4862 ? class105.field1381 : class705.field9815, -30763);
        this.field4865.method3138(97);
        this.field4865.method3091(true, this.field4881);
        this.field4865.method3123(arg8, 1);
        this.field4865.method3072((byte) -57, arg6);
        this.field4865.method3115(1, 0, class425.field5511);
        this.field4865.method3143(4, class425.field5511, 1);
        this.field4865.method3142(arg7, -99);
        if (this.field4863) {
            float var12 = (float) this.method602();
            float var13 = (float) this.method595();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field4860 * var16;
            float var19 = (float) this.field4860 * var17;
            float var20 = (float) this.field4879 * var14;
            float var21 = (float) this.field4879 * var15;
            float var22 = (float) this.field4859 * -var14;
            float var23 = (float) this.field4859 * -var15;
            float var24 = (float) this.field4883 * -var16;
            float var25 = (float) this.field4883 * -var17;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg4 = arg4 + var20 + var24;
            arg5 = arg5 + var21 + var25;
        }
        var10.method940(1.0F, 0.0F, 0.0F, 0.0F, arg2 - arg0, 2, 0.0F, arg3 - arg1, arg4 - arg0, arg5 - arg1);
        var10.method942(arg1, 0.0F, arg0, -3);
        var11.method955(1.0F, this.field4881.method1136((float) this.field4878, (byte) -111), 0, this.field4881.method1135(7886, (float) this.field4870));
        this.field4865.method3140(30604, class34.field500);
        this.field4865.method3116(113);
        this.field4865.method3126((byte) 124);
        this.field4865.method3114(15);
        this.field4865.method3115(1, 0, class243.field3260);
        this.field4865.method3143(4, class243.field3260, 1);
    }

    @OriginalMember(owner = "client!bv", name = "QA", descriptor = "()I", line = 562)
    public final int method608() {
        field4877++;
        return this.field4870;
    }

    @OriginalMember(owner = "client!bv", name = "GA", descriptor = "(IIIIII)V", line = 570)
    public final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4858++;
        int[] var7 = this.field4865.method157(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class131.method954(var7[var8], -16777216);
            }
            this.method2171(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(IIII)I", line = 597)
    public static final int method2172(int arg0, int arg1, int arg2, int arg3) {
        field4867++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else {
            if (arg0 != 7) {
                method2170(-113);
            }
            return var4 == 2 ? 7 - arg2 : arg3;
        }
    }
}
