import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class87 extends class604 {

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    private int field1174 = 0;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    private int field1176 = 0;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Z")
    private boolean field1182 = false;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    private int field1181 = 0;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    private int field1199 = 0;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lsf;")
    private class551 field1172;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "Lgl;")
    private class627 field1202;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Z")
    private boolean field1193;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Z")
    private boolean field1186;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "Z")
    private boolean field1201;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Z")
    private boolean field1183;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field1190 = 0;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Lcja;")
    public static class46 field1195 = new class46(16);

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "Lvl;")
    public static class15 field1203 = new class15(76, 15);

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "D")
    public static double field1204;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V", line = 10)
    public static final void method691(int arg0, int arg1) {
        if (arg0 >= -28) {
            field1190 = 99;
        }
        field1198++;
        class430 var2 = (class430) class524.field7128.method337((long) arg1, 1);
        if (var2 != null) {
            var2.field5860 = !var2.field5860;
            var2.field5868.method700(var2.field5860, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIII)V", line = 29)
    public final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1197++;
        class421 var9 = this.field1172.method3096(false);
        class421 var10 = this.field1172.method3125(0);
        this.field1202.method2034(this.field1193 || this.field1186 || (arg7 & 0x1) == 0 ? class642.field8891 : class782.field10751, (byte) 85);
        this.field1172.method3102((byte) 96);
        this.field1172.method3090(this.field1202, (byte) 76);
        this.field1172.method3117(arg6, true);
        this.field1172.method3113(-3334, arg4);
        this.field1172.method3143(class633.field8767, true, 1);
        this.field1172.method3168((byte) 113, 1, class633.field8767);
        this.field1172.method3130((byte) -113, arg5);
        var10.method2490(this.field1202.method2675((float) this.field1192, (byte) 104), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
        if (this.field1182) {
            arg2 = this.field1192 * arg2 / this.method224();
            arg3 = this.field1173 * arg3 / this.method218();
            arg1 += this.field1176 * arg3 / this.field1173;
            arg0 += this.field1199 * arg2 / this.field1192;
        }
        var9.method2490((float) arg2, (float) arg3, -14978, 0.0F);
        var9.method1860(arg0, arg1, 0);
        this.field1172.method3099(59, class462.field6288);
        this.field1172.method3126(48);
        this.field1172.method3123(-14626);
        this.field1172.method3108(3);
        this.field1172.method3143(class606.field8459, true, 1);
        this.field1172.method3168((byte) 110, 1, class606.field8459);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V", line = 66)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1187++;
        class421 var6 = this.field1172.method3096(false);
        class421 var7 = this.field1172.method3125(0);
        int var8 = this.field1199 + arg0;
        int var9 = this.field1176 + arg1;
        this.field1202.method2034(class642.field8891, (byte) 36);
        this.field1172.method3102((byte) -120);
        this.field1172.method3090(this.field1202, (byte) -109);
        this.field1172.method3117(arg4, true);
        this.field1172.method3113(-3334, arg2);
        this.field1172.method3143(class633.field8767, true, 1);
        this.field1172.method3168((byte) 45, 1, class633.field8767);
        this.field1172.method3130((byte) -66, arg3);
        var6.method2490((float) this.field1192, (float) this.field1173, -14978, 0.0F);
        var6.method1860(var8, var9, 0);
        var7.method2490(this.field1202.method2675((float) this.field1192, (byte) 111), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
        this.field1172.method3099(-125, class462.field6288);
        this.field1172.method3126(69);
        this.field1172.method3123(-14626);
        this.field1172.method3108(3);
        this.field1172.method3143(class606.field8459, true, 1);
        this.field1172.method3168((byte) 73, 1, class606.field8459);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 97)
    public final void method223(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        field1189++;
        class421 var11 = this.field1172.method3096(false);
        class421 var12 = this.field1172.method3125(0);
        class389 var13 = (class389) arg7;
        class627 var14 = var13.field5340;
        this.field1202.method2034(this.field1193 || this.field1186 || (arg6 & 0x1) == 0 ? class642.field8891 : class782.field10751, (byte) 59);
        this.field1172.method3102((byte) 37);
        this.field1172.method3090(this.field1202, (byte) -92);
        this.field1172.method3117(1, true);
        this.field1172.method3113(-3334, 1);
        if (this.field1182) {
            float var15 = (float) this.field1192 / (float) this.method224();
            float var16 = (float) this.field1173 / (float) this.method218();
            var11.method2472(0.0F, 0.0F, 1.0F, (byte) -120, (arg3 - arg1) * var15, 0.0F, (arg2 - arg0) * var15, (arg4 - arg0) * var16, (arg5 - arg1) * var16, 0.0F);
            var11.method2489(((float) this.field1199 + arg0) * var15, 0.0F, -124, ((float) this.field1176 + arg1) * var16);
        } else {
            var11.method2472(0.0F, 0.0F, 1.0F, (byte) -120, arg3 - arg1, 0.0F, arg2 - arg0, arg4 - arg0, arg5 - arg1, 0.0F);
            var11.method2489(arg0, 0.0F, 46, arg1);
        }
        var12.method2490(this.field1202.method2675((float) this.field1192, (byte) 119), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
        this.field1172.method3099(-88, class462.field6288);
        this.field1172.method3114(1, false);
        this.field1172.method3090(var14, (byte) -82);
        this.field1172.method3118(class671.field9318, class371.field5051, 0);
        this.field1172.method3143(class606.field8459, true, 0);
        class421 var17 = this.field1172.method3125(0);
        var17.method1874(var11);
        var17.method1860(-arg8, -arg9, 0);
        var17.method2487(1.0F, 22222, var14.method2675(1.0F, (byte) 103), var14.method2669(31463, 1.0F));
        this.field1172.method3099(-98, class462.field6288);
        this.field1172.method3126(86);
        this.field1172.method3123(-14626);
        this.field1172.method3108(3);
        this.field1172.method3143(class327.field4459, true, 0);
        this.field1172.method3118(class671.field9318, class671.field9318, 0);
        this.field1172.method3090(null, (byte) -119);
        this.field1172.method3114(0, false);
        this.field1172.method3108(3);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lsf;IIZ)V", line = 727)
    public class87(class551 arg0, int arg1, int arg2, boolean arg3) {
        this.field1173 = arg2;
        this.field1172 = arg0;
        this.field1192 = arg1;
        this.field1202 = arg0.method850(arg2, arg1, class497.field6799, true, arg3 ? class530.field7176 : class320.field4368);
        this.field1202.method2679(true, true, -17383);
        this.field1193 = this.field1202.method2670(-17271) != arg1;
        this.field1186 = this.field1202.method2678((byte) 31) != arg2;
        this.field1201 = !this.field1193 && this.field1202.method2680((byte) 108);
        this.field1183 = !this.field1186 && this.field1202.method2680((byte) 118);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lsf;II[III)V", line = 744)
    public class87(class551 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1192 = arg1;
        this.field1172 = arg0;
        this.field1173 = arg2;
        this.field1202 = arg0.method827(arg1, false, arg4, (byte) -106, arg2, arg5, arg3);
        this.field1202.method2679(true, true, -17383);
        this.field1193 = arg1 != this.field1202.method2670(-17271);
        this.field1186 = arg2 != this.field1202.method2678((byte) 31);
        this.field1201 = !this.field1193 && this.field1202.method2680((byte) 118);
        this.field1183 = !this.field1186 && this.field1202.method2680((byte) 122);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)V", line = 155)
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1175++;
        class421 var8 = this.field1172.method3096(false);
        class421 var9 = this.field1172.method3125(0);
        this.field1202.method2034(class642.field8891, (byte) 123);
        this.field1172.method3102((byte) 73);
        this.field1172.method3090(this.field1202, (byte) -72);
        this.field1172.method3117(arg6, true);
        this.field1172.method3113(-3334, arg4);
        this.field1172.method3143(class633.field8767, true, 1);
        this.field1172.method3168((byte) 112, 1, class633.field8767);
        this.field1172.method3130((byte) -125, arg5);
        boolean var10 = this.field1183 && this.field1176 == 0 && this.field1181 == 0;
        boolean var11 = this.field1201 && this.field1199 == 0 && this.field1174 == 0;
        if ((var11 & var10)) {
            var9.method2490(this.field1202.method2675((float) arg2, (byte) 97), this.field1202.method2669(31463, (float) arg3), -14978, 1.0F);
            var8.method2490((float) arg2, (float) arg3, -14978, 0.0F);
            var8.method1860(arg0, arg1, 0);
            this.field1172.method3099(82, class462.field6288);
            this.field1172.method3126(124);
            this.field1172.method3123(-14626);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method218();
            var9.method2490(this.field1202.method2675((float) arg2, (byte) 125), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
            this.field1172.method3099(-113, class462.field6288);
            int var14 = arg1 + this.field1176;
            for (int var15 = this.field1173 + var14; var15 <= var12; var15 += var13) {
                var8.method2490((float) arg2, (float) this.field1173, -14978, 0.0F);
                var8.method1860(arg0, var14, 0);
                this.field1172.method3126(68);
                this.field1172.method3123(-14626);
                var14 += var13;
            }
            if (var12 > var14) {
                int var16 = var12 - var14;
                var9.method2490(this.field1202.method2675((float) arg2, (byte) 119), this.field1202.method2669(31463, (float) var16), -14978, 1.0F);
                this.field1172.method3099(-107, class462.field6288);
                var8.method2490((float) arg2, (float) var16, -14978, 0.0F);
                var8.method1860(arg0, var14, 0);
                this.field1172.method3126(68);
                this.field1172.method3123(-14626);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method224();
            var9.method2490(this.field1202.method2675((float) this.field1192, (byte) 110), this.field1202.method2669(31463, (float) arg3), -14978, 1.0F);
            this.field1172.method3099(-93, class462.field6288);
            int var19 = arg0 + this.field1199;
            for (int var20 = this.field1192 + var19; var20 <= var17; var20 += var18) {
                var8.method2490((float) this.field1192, (float) arg3, -14978, 0.0F);
                var8.method1860(var19, arg1, 0);
                this.field1172.method3126(76);
                var19 += var18;
                this.field1172.method3123(-14626);
            }
            if (var19 < var17) {
                int var21 = var17 - var19;
                var9.method2490(this.field1202.method2675((float) var21, (byte) 121), this.field1202.method2669(31463, (float) arg3), -14978, 1.0F);
                this.field1172.method3099(101, class462.field6288);
                var8.method2490((float) var21, (float) arg3, -14978, 0.0F);
                var8.method1860(var19, arg1, 0);
                this.field1172.method3126(118);
                this.field1172.method3123(-14626);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method224();
            int var25 = this.method218();
            int var26 = this.field1176 + arg1;
            int var27 = this.field1173 + var26;
            while (var27 <= var22) {
                var9.method2490(this.field1202.method2675((float) this.field1192, (byte) 110), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
                this.field1172.method3099(-121, class462.field6288);
                int var32 = this.field1199 + arg0;
                int var33 = this.field1192 + var32;
                while (var33 <= var23) {
                    var8.method2490((float) this.field1192, (float) this.field1173, -14978, 0.0F);
                    var8.method1860(var32, var26, 0);
                    this.field1172.method3126(74);
                    this.field1172.method3123(-14626);
                    var33 += var24;
                    var32 += var24;
                }
                if (var32 < var23) {
                    int var34 = var23 - var32;
                    var9.method2490(this.field1202.method2675((float) var34, (byte) 112), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
                    this.field1172.method3099(71, class462.field6288);
                    var8.method2490((float) var34, (float) this.field1173, -14978, 0.0F);
                    var8.method1860(var32, var26, 0);
                    this.field1172.method3126(72);
                    this.field1172.method3123(-14626);
                }
                var27 += var25;
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method2490(this.field1202.method2675((float) this.field1192, (byte) 107), this.field1202.method2669(31463, (float) var28), -14978, 1.0F);
                this.field1172.method3099(-118, class462.field6288);
                int var29 = arg0 + this.field1199;
                int var30 = var29 + this.field1192;
                while (var23 >= var30) {
                    var8.method2490((float) this.field1192, (float) var28, -14978, 0.0F);
                    var8.method1860(var29, var26, 0);
                    this.field1172.method3126(53);
                    var29 += var24;
                    var30 += var24;
                    this.field1172.method3123(-14626);
                }
                if (var29 < var23) {
                    int var31 = var23 - var29;
                    var9.method2490(this.field1202.method2675((float) var31, (byte) 94), this.field1202.method2669(31463, (float) var28), -14978, 1.0F);
                    this.field1172.method3099(-115, class462.field6288);
                    var8.method2490((float) var31, (float) var28, -14978, 0.0F);
                    var8.method1860(var29, var26, 0);
                    this.field1172.method3126(70);
                    this.field1172.method3123(-14626);
                }
            }
        }
        this.field1172.method3108(3);
        this.field1172.method3143(class606.field8459, true, 1);
        this.field1172.method3168((byte) 70, 1, class606.field8459);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILaa;II)V", line = 361)
    public final void method211(int arg0, int arg1, class514 arg2, int arg3, int arg4) {
        field1194++;
        class389 var6 = (class389) arg2;
        int var7 = this.field1176 + arg1;
        class627 var8 = var6.field5340;
        int var9 = this.field1199 + arg0;
        this.field1202.method2034(class642.field8891, (byte) 60);
        this.field1172.method3102((byte) -86);
        this.field1172.method3090(this.field1202, (byte) -23);
        this.field1172.method3117(1, true);
        this.field1172.method3113(-3334, 1);
        class421 var10 = this.field1172.method3096(false);
        var10.method2490((float) this.field1192, (float) this.field1173, -14978, 0.0F);
        var10.method1860(var9, var7, 0);
        this.field1172.method3126(124);
        class421 var11 = this.field1172.method3125(0);
        var11.method2490(this.field1202.method2675((float) this.field1192, (byte) 118), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
        this.field1172.method3099(97, class462.field6288);
        this.field1172.method3114(1, false);
        this.field1172.method3090(var8, (byte) -97);
        this.field1172.method3118(class671.field9318, class371.field5051, 0);
        this.field1172.method3143(class606.field8459, true, 0);
        class421 var12 = this.field1172.method3125(0);
        var12.method2490(var8.method2675((float) this.field1192, (byte) 109), var8.method2669(31463, (float) this.field1173), -14978, 1.0F);
        var12.method2489(var8.method2675((float) (var9 - arg3), (byte) 98), 0.0F, -122, var8.method2669(31463, (float) (var7 - arg4)));
        this.field1172.method3099(-115, class462.field6288);
        this.field1172.method3123(-14626);
        this.field1172.method3108(3);
        this.field1172.method3143(class327.field4459, true, 0);
        this.field1172.method3118(class671.field9318, class671.field9318, 0);
        this.field1172.method3090(null, (byte) -18);
        this.field1172.method3114(0, false);
        this.field1172.method3108(3);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)V", line = 405)
    public final void method641(int arg0, int arg1, int arg2) {
        field1191++;
        int[] var4 = this.field1172.method484(arg0, arg1, this.field1192, this.field1173);
        int[] var5 = new int[this.field1192 * this.field1173];
        this.field1202.method2676(0, this.field1192, true, 0, var5, 0, this.field1173);
        if (arg2 == 0) {
            for (int var6 = 0; var6 < this.field1173; var6++) {
                int var7 = this.field1192 * var6;
                for (int var8 = 0; var8 < this.field1192; var8++) {
                    var5[var7 + var8] = class530.method3011(class204.method1456(var5[var7 + var8], 16777215), class204.method1456(var4[var7 + var8] << 8, -16777209));
                }
            }
        } else if (arg2 == 1) {
            for (int var9 = 0; var9 < this.field1173; var9++) {
                int var10 = this.field1192 * var9;
                for (int var11 = 0; var11 < this.field1192; var11++) {
                    var5[var10 + var11] = class530.method3011(class204.method1456(1500053248, var4[var10 + var11]) << 16, class204.method1456(16777215, var5[var10 + var11]));
                }
            }
        } else if (arg2 == 2) {
            for (int var12 = 0; var12 < this.field1173; var12++) {
                int var13 = this.field1192 * var12;
                for (int var14 = 0; var14 < this.field1192; var14++) {
                    var5[var13 + var14] = class530.method3011(class204.method1456(551494911, var4[var13 + var14]) << 24, class204.method1456(16777215, var5[var13 + var14]));
                }
            }
        } else if (arg2 == 3) {
            for (int var15 = 0; var15 < this.field1173; var15++) {
                int var16 = this.field1192 * var15;
                for (int var17 = 0; var17 < this.field1192; var17++) {
                    var5[var16 + var17] = class530.method3011(class204.method1456(var5[var16 + var17], 16777215), var4[var16 + var17] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method692(0, 0, this.field1192, this.field1173, var5, 0, this.field1192);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()I", line = 517)
    public final int method218() {
        field1188++;
        return this.field1176 + this.field1173 + this.field1181;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIII)V", line = 525)
    public final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1196++;
        int[] var7 = this.field1172.method484(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class530.method3011(var7[var8], -16777216);
            }
            this.method692(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([I)V", line = 547)
    public final void method212(int[] arg0) {
        field1179++;
        arg0[1] = this.field1176;
        arg0[2] = this.field1174;
        arg0[3] = this.field1181;
        arg0[0] = this.field1199;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII[III)V", line = 571)
    private final void method692(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field1202.method2671(arg4, arg1, 9842, arg0, arg6, arg5, arg3, arg2);
        field1185++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()I", line = 580)
    public final int method224() {
        field1180++;
        return this.field1199 + this.field1192 + this.field1174;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()I", line = 590)
    public final int method220() {
        field1200++;
        return this.field1192;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([II[J)V", line = 601)
    public static final void method693(int[] arg0, int arg1, long[] arg2) {
        class228.method1556(arg2.length - 1, 0, arg1 - 12989, arg0, arg2);
        field1184++;
        if (arg1 != 1) {
            method693(null, -90, null);
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()I", line = 615)
    public final int method214() {
        field1177++;
        return this.field1173;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFFIIII)V", line = 626)
    public final void method219(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field1171++;
        class421 var11 = this.field1172.method3096(false);
        class421 var12 = this.field1172.method3125(0);
        this.field1202.method2034(this.field1193 || this.field1186 || (arg9 & 0x1) == 0 ? class642.field8891 : class782.field10751, (byte) 117);
        this.field1172.method3102((byte) -100);
        this.field1172.method3090(this.field1202, (byte) 64);
        this.field1172.method3117(arg8, true);
        this.field1172.method3113(-3334, arg6);
        this.field1172.method3143(class633.field8767, true, 1);
        this.field1172.method3168((byte) 46, 1, class633.field8767);
        this.field1172.method3130((byte) -99, arg7);
        if (this.field1182) {
            float var13 = (float) this.method224();
            float var14 = (float) this.method218();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field1176 * var17;
            float var20 = (float) this.field1176 * var18;
            float var21 = (float) this.field1199 * var15;
            float var22 = (float) this.field1199 * var16;
            float var23 = (float) this.field1174 * -var15;
            float var24 = (float) this.field1174 * -var16;
            float var25 = (float) this.field1181 * -var17;
            float var26 = (float) this.field1181 * -var18;
            arg0 = arg0 + var21 + var19;
            arg4 = arg4 + var21 + var25;
            arg2 = arg2 + var23 + var19;
            arg3 = arg3 + var24 + var20;
            arg1 = arg1 + var22 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2472(0.0F, 0.0F, 1.0F, (byte) -120, arg3 - arg1, 0.0F, arg2 - arg0, -arg0 + arg4, arg5 - arg1, 0.0F);
        var11.method2489(arg0, 0.0F, -109, arg1);
        var12.method2490(this.field1202.method2675((float) this.field1192, (byte) 100), this.field1202.method2669(31463, (float) this.field1173), -14978, 1.0F);
        this.field1172.method3099(109, class462.field6288);
        this.field1172.method3126(113);
        this.field1172.method3123(-14626);
        this.field1172.method3108(3);
        this.field1172.method3143(class606.field8459, true, 1);
        this.field1172.method3168((byte) 98, 1, class606.field8459);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(IIII)V", line = 695)
    public final void method213(int arg0, int arg1, int arg2, int arg3) {
        this.field1174 = arg2;
        this.field1199 = arg0;
        field1178++;
        this.field1181 = arg3;
        this.field1176 = arg1;
        this.field1182 = this.field1199 != 0 || this.field1176 != 0 || this.field1174 != 0 || this.field1181 != 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 717)
    public static void method694(int arg0) {
        field1203 = null;
        if (arg0 != 0) {
            method694(-9);
        }
        field1195 = null;
    }
}
