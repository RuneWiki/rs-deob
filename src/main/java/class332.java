import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class332 extends class112 {

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
    private int field4947 = 0;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    private int field4945 = 0;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    private int field4941 = 0;

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "I")
    private int field4967 = 0;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "Z")
    private boolean field4948 = false;

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "Lwk;")
    private class151 field4943;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!uea", name = "F", descriptor = "I")
    private int field4971;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "Lkt;")
    private class166 field4957;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "Z")
    private boolean field4946;

    @OriginalMember(owner = "client!uea", name = "x", descriptor = "Z")
    private boolean field4963;

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "Z")
    private boolean field4973;

    @OriginalMember(owner = "client!uea", name = "C", descriptor = "Z")
    private boolean field4968;

    @OriginalMember(owner = "client!uea", name = "u", descriptor = "I")
    public static int field4960 = -1;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!uea", name = "s", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!uea", name = "t", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!uea", name = "w", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!uea", name = "y", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!uea", name = "A", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!uea", name = "D", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!uea", name = "E", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!uea", name = "G", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIII)V", line = 3)
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4964++;
        int[] var7 = this.field4943.method400(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class281.method1904(var7[var8], -16777216);
            }
            this.method2149(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lcb;JIZIIII)V", line = 25)
    public static final void method2147(class544 arg0, long arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        class246.field3513 = arg4;
        class733.field10242 = null;
        field4954++;
        class664.field9319 = arg2;
        class368.field5295 = arg0;
        class763.field10505 = 10000;
        class420.field5909 = 1;
        class341.field5056 = arg7;
        class101.field1279 = arg5;
        class611.field8622 = arg3;
        class628.field8869 = arg1;
        int var9 = -98 % ((-arg6 - 91) / 35);
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "()I", line = 48)
    public final int method789() {
        field4972++;
        return this.field4971;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILaa;II)V", line = 56)
    public final void method800(int arg0, int arg1, class510 arg2, int arg3, int arg4) {
        field4959++;
        class739 var6 = (class739) arg2;
        class166 var7 = var6.field10304;
        int var8 = this.field4941 + arg0;
        int var9 = this.field4967 + arg1;
        this.field4957.method2161(class471.field6717, false);
        this.field4943.method1166(-9244);
        this.field4943.method1104(true, this.field4957);
        this.field4943.method1087((byte) -56, 1);
        this.field4943.method1088((byte) -31, 1);
        class468 var10 = this.field4943.method1115((byte) -99);
        var10.method2769(0.0F, (float) this.field4971, (float) this.field4949, -64);
        var10.method1952(var8, var9, 0);
        this.field4943.method1122((byte) -77);
        class468 var11 = this.field4943.method1043(false);
        var11.method2769(1.0F, this.field4957.method36(126, (float) this.field4971), this.field4957.method39(2170, (float) this.field4949), 109);
        this.field4943.method1073(class505.field7237, 25216);
        this.field4943.method1140((byte) -30, 1);
        this.field4943.method1104(true, var7);
        this.field4943.method1136((byte) -122, class438.field6278, class174.field2460);
        this.field4943.method1056(32, class490.field6967, 0);
        class468 var12 = this.field4943.method1043(false);
        var12.method2769(1.0F, var7.method36(126, (float) this.field4971), var7.method39(2170, (float) this.field4949), -84);
        var12.method2760(0.0F, var7.method39(2170, (float) (var8 - arg3)), 3, var7.method36(-4, (float) (var9 - arg4)));
        this.field4943.method1073(class505.field7237, 25216);
        this.field4943.method1118((byte) 102);
        this.field4943.method1048(true);
        this.field4943.method1056(32, class412.field5814, 0);
        this.field4943.method1136((byte) -93, class174.field2460, class174.field2460);
        this.field4943.method1104(true, null);
        this.field4943.method1140((byte) -52, 0);
        this.field4943.method1048(true);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 99)
    public final void method793(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
        field4969++;
        class468 var11 = this.field4943.method1115((byte) -99);
        class468 var12 = this.field4943.method1043(false);
        class739 var13 = (class739) arg7;
        class166 var14 = var13.field10304;
        this.field4957.method2161(this.field4946 || this.field4963 || (arg6 & 0x1) == 0 ? class471.field6717 : class480.field6804, false);
        this.field4943.method1166(-9244);
        this.field4943.method1104(true, this.field4957);
        this.field4943.method1087((byte) -68, 1);
        this.field4943.method1088((byte) -31, 1);
        if (this.field4948) {
            float var15 = (float) this.field4949 / (float) this.method781();
            float var16 = (float) this.field4971 / (float) this.method792();
            var11.method2780(0.0F, (arg5 - arg1) * var16, 0.0F, 0.0F, (arg2 - arg0) * var15, 1.0F, (arg4 - arg0) * var16, 0.0F, 112, (arg3 - arg1) * var15);
            var11.method2760(0.0F, ((float) this.field4941 + arg0) * var15, 3, ((float) this.field4967 + arg1) * var16);
        } else {
            var11.method2780(0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F, arg4 - arg0, 0.0F, 109, arg3 - arg1);
            var11.method2760(0.0F, arg0, 3, arg1);
        }
        var12.method2769(1.0F, this.field4957.method36(-118, (float) this.field4971), this.field4957.method39(2170, (float) this.field4949), 124);
        this.field4943.method1073(class505.field7237, 25216);
        this.field4943.method1140((byte) -20, 1);
        this.field4943.method1104(true, var14);
        this.field4943.method1136((byte) -113, class438.field6278, class174.field2460);
        this.field4943.method1056(32, class490.field6967, 0);
        class468 var17 = this.field4943.method1043(false);
        var17.method1950(var11);
        var17.method1952(-arg8, -arg9, 0);
        var17.method2777(1.0F, var14.method39(2170, 1.0F), var14.method36(127, 1.0F), true);
        this.field4943.method1073(class505.field7237, 25216);
        this.field4943.method1122((byte) 119);
        this.field4943.method1118((byte) 105);
        this.field4943.method1048(true);
        this.field4943.method1056(32, class412.field5814, 0);
        this.field4943.method1136((byte) -93, class174.field2460, class174.field2460);
        this.field4943.method1104(true, null);
        this.field4943.method1140((byte) -42, 0);
        this.field4943.method1048(true);
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lwk;IIZ)V", line = 832)
    public class332(class151 arg0, int arg1, int arg2, boolean arg3) {
        this.field4943 = arg0;
        this.field4949 = arg1;
        this.field4971 = arg2;
        this.field4957 = arg0.method1126(arg3 ? class12.field247 : class67.field898, -127, class770.field10614, arg1, arg2);
        this.field4957.method42(true, (byte) -114, true);
        this.field4946 = this.field4957.method34((byte) -109) != arg1;
        this.field4963 = arg2 != this.field4957.method38(113);
        this.field4973 = !this.field4946 && this.field4957.method40(27610);
        this.field4968 = !this.field4963 && this.field4957.method40(27610);
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lwk;II[III)V", line = 847)
    public class332(class151 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4971 = arg2;
        this.field4943 = arg0;
        this.field4949 = arg1;
        this.field4957 = arg0.method1041(arg2, false, -6647, arg3, arg4, arg1, arg5);
        this.field4957.method42(true, (byte) -120, true);
        this.field4946 = this.field4957.method34((byte) -109) != arg1;
        this.field4963 = arg2 != this.field4957.method38(-78);
        this.field4973 = !this.field4946 && this.field4957.method40(27610);
        this.field4968 = !this.field4963 && this.field4957.method40(27610);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "([I)V", line = 169)
    public final void method787(int[] arg0) {
        arg0[0] = this.field4941;
        arg0[1] = this.field4967;
        arg0[2] = this.field4945;
        field4965++;
        arg0[3] = this.field4947;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILha;ILwq;)V", line = 181)
    public static final void method2148(int arg0, int arg1, class66 arg2, int arg3, class176 arg4) {
        field4961++;
        int var5 = arg3;
        byte var6 = 7;
        for (int var7 = 63; var7 >= 0; var7--) {
            class211.method1486(false, true, (byte) 100);
            int var8 = var7 & 0x3F << 10 | var6 << 7 & 0x380 | var5 & 0x7F;
            int var9 = class444.field6323[var8];
            class209.method1485(false, (byte) 30, true);
            arg2.method474(arg0, arg1 + ((63 - var7) * arg4.field2664 >> 6), arg4.field2673, (arg4.field2664 >> 6) + 1, var9, 0);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIII[III)V", line = 208)
    private final void method2149(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field4957.method41(arg5, arg2, arg6, arg0, arg3, false, arg1, arg4);
        field4962++;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "()I", line = 216)
    public final int method781() {
        field4942++;
        return this.field4949 + this.field4941 + this.field4945;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "()I", line = 226)
    public final int method777() {
        field4958++;
        return this.field4949;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIII)V", line = 239)
    public final void method795(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4966++;
        class468 var6 = this.field4943.method1115((byte) -99);
        class468 var7 = this.field4943.method1043(false);
        int var8 = this.field4967 + arg1;
        int var9 = this.field4941 + arg0;
        this.field4957.method2161(class471.field6717, false);
        this.field4943.method1166(-9244);
        this.field4943.method1104(true, this.field4957);
        this.field4943.method1087((byte) -118, arg4);
        this.field4943.method1088((byte) -31, arg2);
        this.field4943.method1056(32, class490.field6966, 1);
        this.field4943.method1157(1, 1, class490.field6966);
        this.field4943.method1059(true, arg3);
        var6.method2769(0.0F, (float) this.field4971, (float) this.field4949, -38);
        var6.method1952(var9, var8, 0);
        var7.method2769(1.0F, this.field4957.method36(-125, (float) this.field4971), this.field4957.method39(2170, (float) this.field4949), -62);
        this.field4943.method1073(class505.field7237, 25216);
        this.field4943.method1122((byte) -100);
        this.field4943.method1118((byte) 106);
        this.field4943.method1048(true);
        this.field4943.method1056(32, class490.field6967, 1);
        this.field4943.method1157(1, 1, class490.field6967);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIIIIII)V", line = 272)
    public final void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4956++;
        class468 var9 = this.field4943.method1115((byte) -99);
        class468 var10 = this.field4943.method1043(false);
        this.field4957.method2161(this.field4946 || this.field4963 || (arg7 & 0x1) == 0 ? class471.field6717 : class480.field6804, false);
        this.field4943.method1166(-9244);
        this.field4943.method1104(true, this.field4957);
        this.field4943.method1087((byte) -67, arg6);
        this.field4943.method1088((byte) -31, arg4);
        this.field4943.method1056(32, class490.field6966, 1);
        this.field4943.method1157(1, 1, class490.field6966);
        this.field4943.method1059(true, arg5);
        var10.method2769(1.0F, this.field4957.method36(127, (float) this.field4971), this.field4957.method39(2170, (float) this.field4949), 125);
        if (this.field4948) {
            arg2 = this.field4949 * arg2 / this.method781();
            arg3 = this.field4971 * arg3 / this.method792();
            arg1 += this.field4967 * arg3 / this.field4971;
            arg0 += this.field4941 * arg2 / this.field4949;
        }
        var9.method2769(0.0F, (float) arg3, (float) arg2, 106);
        var9.method1952(arg0, arg1, 0);
        this.field4943.method1073(class505.field7237, 25216);
        this.field4943.method1122((byte) 122);
        this.field4943.method1118((byte) 120);
        this.field4943.method1048(true);
        this.field4943.method1056(32, class490.field6967, 1);
        this.field4943.method1157(1, 1, class490.field6967);
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(IIIIIII)V", line = 311)
    public final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4940++;
        class468 var8 = this.field4943.method1115((byte) -99);
        class468 var9 = this.field4943.method1043(false);
        this.field4957.method2161(class471.field6717, false);
        this.field4943.method1166(-9244);
        this.field4943.method1104(true, this.field4957);
        this.field4943.method1087((byte) -92, arg6);
        this.field4943.method1088((byte) -31, arg4);
        this.field4943.method1056(32, class490.field6966, 1);
        this.field4943.method1157(1, 1, class490.field6966);
        this.field4943.method1059(true, arg5);
        boolean var10 = this.field4968 && this.field4967 == 0 && this.field4947 == 0;
        boolean var11 = this.field4973 && this.field4941 == 0 && this.field4945 == 0;
        if ((var10 & var11)) {
            var9.method2769(1.0F, this.field4957.method36(-86, (float) arg3), this.field4957.method39(2170, (float) arg2), -45);
            var8.method2769(0.0F, (float) arg3, (float) arg2, 98);
            var8.method1952(arg0, arg1, 0);
            this.field4943.method1073(class505.field7237, 25216);
            this.field4943.method1122((byte) -39);
            this.field4943.method1118((byte) 123);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method792();
            var9.method2769(1.0F, this.field4957.method36(-117, (float) this.field4971), this.field4957.method39(2170, (float) arg2), 94);
            this.field4943.method1073(class505.field7237, 25216);
            int var32 = this.field4967 + arg1;
            int var33 = var32 + this.field4971;
            while (var33 <= var30) {
                var8.method2769(0.0F, (float) this.field4971, (float) arg2, -67);
                var8.method1952(arg0, var32, 0);
                this.field4943.method1122((byte) 1);
                var33 += var31;
                this.field4943.method1118((byte) 108);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2769(1.0F, this.field4957.method36(126, (float) var34), this.field4957.method39(2170, (float) arg2), 91);
                this.field4943.method1073(class505.field7237, 25216);
                var8.method2769(0.0F, (float) var34, (float) arg2, -7);
                var8.method1952(arg0, var32, 0);
                this.field4943.method1122((byte) -73);
                this.field4943.method1118((byte) 110);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method781();
            var9.method2769(1.0F, this.field4957.method36(-113, (float) arg3), this.field4957.method39(2170, (float) this.field4949), 95);
            this.field4943.method1073(class505.field7237, 25216);
            int var27 = this.field4941 + arg0;
            for (int var28 = this.field4949 + var27; var28 <= var25; var28 += var26) {
                var8.method2769(0.0F, (float) arg3, (float) this.field4949, 115);
                var8.method1952(var27, arg1, 0);
                this.field4943.method1122((byte) 112);
                var27 += var26;
                this.field4943.method1118((byte) 124);
            }
            if (var27 < var25) {
                int var29 = var25 - var27;
                var9.method2769(1.0F, this.field4957.method36(-39, (float) arg3), this.field4957.method39(2170, (float) var29), -78);
                this.field4943.method1073(class505.field7237, 25216);
                var8.method2769(0.0F, (float) arg3, (float) var29, 82);
                var8.method1952(var27, arg1, 0);
                this.field4943.method1122((byte) -25);
                this.field4943.method1118((byte) 116);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method781();
            int var15 = this.method792();
            int var16 = arg1 + this.field4967;
            int var17 = this.field4971 + var16;
            while (var17 <= var12) {
                var9.method2769(1.0F, this.field4957.method36(-23, (float) this.field4971), this.field4957.method39(2170, (float) this.field4949), -109);
                this.field4943.method1073(class505.field7237, 25216);
                int var22 = this.field4941 + arg0;
                for (int var23 = this.field4949 + var22; var23 <= var13; var23 += var14) {
                    var8.method2769(0.0F, (float) this.field4971, (float) this.field4949, 3);
                    var8.method1952(var22, var16, 0);
                    this.field4943.method1122((byte) 121);
                    var22 += var14;
                    this.field4943.method1118((byte) 109);
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method2769(1.0F, this.field4957.method36(127, (float) this.field4971), this.field4957.method39(2170, (float) var24), 104);
                    this.field4943.method1073(class505.field7237, 25216);
                    var8.method2769(0.0F, (float) this.field4971, (float) var24, 89);
                    var8.method1952(var22, var16, 0);
                    this.field4943.method1122((byte) 127);
                    this.field4943.method1118((byte) 125);
                }
                var17 += var15;
                var16 += var15;
            }
            if (var16 < var12) {
                int var18 = var12 - var16;
                var9.method2769(1.0F, this.field4957.method36(-91, (float) var18), this.field4957.method39(2170, (float) this.field4949), 82);
                this.field4943.method1073(class505.field7237, 25216);
                int var19 = this.field4941 + arg0;
                for (int var20 = this.field4949 + var19; var20 <= var13; var20 += var14) {
                    var8.method2769(0.0F, (float) var18, (float) this.field4949, -2);
                    var8.method1952(var19, var16, 0);
                    this.field4943.method1122((byte) 125);
                    this.field4943.method1118((byte) 102);
                    var19 += var14;
                }
                if (var19 < var13) {
                    int var21 = var13 - var19;
                    var9.method2769(1.0F, this.field4957.method36(127, (float) var18), this.field4957.method39(2170, (float) var21), -118);
                    this.field4943.method1073(class505.field7237, 25216);
                    var8.method2769(0.0F, (float) var18, (float) var21, -46);
                    var8.method1952(var19, var16, 0);
                    this.field4943.method1122((byte) -30);
                    this.field4943.method1118((byte) 120);
                }
            }
        }
        this.field4943.method1048(true);
        this.field4943.method1056(32, class490.field6967, 1);
        this.field4943.method1157(1, 1, class490.field6967);
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(IIII)V", line = 530)
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        field4952++;
        this.field4967 = arg1;
        this.field4945 = arg2;
        this.field4941 = arg0;
        this.field4947 = arg3;
        this.field4948 = this.field4941 != 0 || this.field4967 != 0 || this.field4945 != 0 || this.field4947 != 0;
    }

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "()I", line = 542)
    public final int method792() {
        field4955++;
        return this.field4971 + this.field4967 + this.field4947;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)V", line = 551)
    public static final void method2150(int arg0, int arg1) {
        field4970++;
        int var2 = -32 % ((arg1 - 61) / 36);
        class542 var3 = (class542) class622.field8773.method380((byte) -3, (long) arg0);
        if (var3 != null) {
            var3.field7595 = !var3.field7595;
            var3.field7597.method4267(false, var3.field7595);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(FFFFFFIIII)V", line = 569)
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field4953++;
        class468 var11 = this.field4943.method1115((byte) -99);
        class468 var12 = this.field4943.method1043(false);
        this.field4957.method2161(this.field4946 || this.field4963 || (arg9 & 0x1) == 0 ? class471.field6717 : class480.field6804, false);
        this.field4943.method1166(-9244);
        this.field4943.method1104(true, this.field4957);
        this.field4943.method1087((byte) -89, arg8);
        this.field4943.method1088((byte) -31, arg6);
        this.field4943.method1056(32, class490.field6966, 1);
        this.field4943.method1157(1, 1, class490.field6966);
        this.field4943.method1059(true, arg7);
        if (this.field4948) {
            float var13 = (float) this.method781();
            float var14 = (float) this.method792();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field4967 * var17;
            float var20 = (float) this.field4967 * var18;
            float var21 = (float) this.field4941 * var15;
            float var22 = (float) this.field4941 * var16;
            float var23 = (float) this.field4945 * -var15;
            float var24 = (float) this.field4945 * -var16;
            float var25 = (float) this.field4947 * -var17;
            arg2 = arg2 + var23 + var19;
            arg4 = arg4 + var21 + var25;
            float var26 = (float) this.field4947 * -var18;
            arg1 = arg1 + var22 + var20;
            arg0 = arg0 + var21 + var19;
            arg3 = arg3 + var24 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2780(0.0F, arg5 - arg1, 0.0F, 0.0F, arg2 - arg0, 1.0F, arg4 - arg0, 0.0F, 89, arg3 - arg1);
        var11.method2760(0.0F, arg0, 3, arg1);
        var12.method2769(1.0F, this.field4957.method36(-54, (float) this.field4971), this.field4957.method39(2170, (float) this.field4949), 116);
        this.field4943.method1073(class505.field7237, 25216);
        this.field4943.method1122((byte) 121);
        this.field4943.method1118((byte) 112);
        this.field4943.method1048(true);
        this.field4943.method1056(32, class490.field6967, 1);
        this.field4943.method1157(1, 1, class490.field6967);
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(III)I", line = 639)
    public static final int method2151(int arg0, int arg1, int arg2) {
        field4944++;
        if (class123.field1606 == -1) {
            return 1;
        }
        if (arg0 != class145.field1852.field9002.method2258((byte) -105)) {
            class148.method1027(true, true, class674.field9564.method3825((byte) -10, class526.field7494), arg0);
            if (arg0 != class145.field1852.field9002.method2258((byte) -116)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class359.field5219.getSize();
            int var4 = -10 / ((-arg2 - 9) / 47);
            class54.method348(class157.field2343, false, class564.field8008, class638.field8979, true, class674.field9564.method3825((byte) -10, class526.field7494));
            class229 var5 = class364.method2276(class358.field5213, (byte) -46, class123.field1606, 0);
            long var6 = class109.method731(80);
            class638.field8979.method463();
            class13.field256.method1959(0, class503.field7200, 0);
            class638.field8979.method445(class13.field256);
            class638.field8979.method409(var3.width / 2, var3.height / 2, 512, 512);
            class638.field8979.method506(1.0F);
            class638.field8979.method499(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class495 var8 = class638.field8979.method420(var5, 2048, 64, 64, 768);
            int var9 = 0;
            label41: for (int var10 = 0; var10 < 500; var10++) {
                class638.field8979.method417(0);
                class638.field8979.method449();
                for (int var11 = 15; var11 >= 0; var11--) {
                    for (int var12 = 0; var12 <= var11; var12++) {
                        class235.field3402.method1959((int) (((float) var12 - ((float) var11 / 2.0F)) * (float) class13.field254), 0, (var11 + 1) * class13.field254);
                        var8.method108(class235.field3402, null, 0);
                        var9++;
                        if (class109.method731(91) - var6 >= (long) arg1) {
                            break label41;
                        }
                    }
                }
            }
            class638.field8979.method392();
            long var13 = (long) (var9 * 1000) / (class109.method731(66) - var6);
            class638.field8979.method417(0);
            class638.field8979.method449();
            return (int) var13;
        } catch (Throwable var16) {
            var16.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V", line = 721)
    public final void method794(int arg0, int arg1, int arg2) {
        field4950++;
        int[] var4 = this.field4943.method400(arg0, arg1, this.field4949, this.field4971);
        int[] var5 = new int[this.field4971 * this.field4949];
        this.field4957.method37(var5, true, 0, this.field4949, 0, this.field4971, 0);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field4971; var15++) {
                int var16 = this.field4949 * var15;
                for (int var17 = 0; var17 < this.field4949; var17++) {
                    var5[var16 + var17] = class281.method1904(class111.method773(-2030108672, var4[var16 + var17]) << 8, class111.method773(16777215, var5[var16 + var17]));
                }
            }
        } else if (arg2 == 1) {
            for (int var12 = 0; var12 < this.field4971; var12++) {
                int var13 = this.field4949 * var12;
                for (int var14 = 0; var14 < this.field4949; var14++) {
                    var5[var13 + var14] = class281.method1904(class111.method773(16777215, var5[var13 + var14]), class111.method773(-16776290, var4[var13 + var14] << 16));
                }
            }
        } else if (arg2 == 2) {
            for (int var6 = 0; var6 < this.field4971; var6++) {
                int var7 = this.field4949 * var6;
                for (int var8 = 0; var8 < this.field4949; var8++) {
                    var5[var7 + var8] = class281.method1904(class111.method773(940261887, var4[var7 + var8]) << 24, class111.method773(var5[var7 + var8], 16777215));
                }
            }
        } else if (arg2 == 3) {
            for (int var9 = 0; var9 < this.field4971; var9++) {
                int var10 = this.field4949 * var9;
                for (int var11 = 0; var11 < this.field4949; var11++) {
                    var5[var10 + var11] = class281.method1904(var4[var10 + var11] == 0 ? 0 : -16777216, class111.method773(var5[var10 + var11], 16777215));
                }
            }
        }
        this.method2149(0, 0, this.field4949, this.field4971, var5, 0, this.field4949);
    }
}
