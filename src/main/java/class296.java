import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class296 extends class468 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    private int field3765 = 0;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    private int field3777 = 0;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    private int field3787 = 0;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Z")
    private boolean field3792 = false;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    private int field3772 = 0;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    private int field3790;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "Lkea;")
    private class223 field3782;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lem;")
    private class212 field3766;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
    private boolean field3774;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Z")
    private boolean field3764;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Z")
    private boolean field3794;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "Z")
    private boolean field3788;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Z")
    public static boolean field3781 = false;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "J")
    public static long field3791;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "[[[I")
    public static int[][][] field3773;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lkea;IIZ)V", line = 582)
    public class296(class223 arg0, int arg1, int arg2, boolean arg3) {
        this.field3770 = arg2;
        this.field3790 = arg1;
        this.field3782 = arg0;
        this.field3766 = arg0.method313(arg2, arg3 ? class556.field6946 : class664.field9019, 9, class100.field1288, arg1);
        this.field3774 = arg1 != this.field3766.method37(-18693);
        this.field3764 = arg2 != this.field3766.method36(-24981);
        this.field3794 = !this.field3774 && this.field3766.method38((byte) 107);
        this.field3788 = !this.field3764 && this.field3766.method38((byte) 118);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lkea;II[III)V", line = 596)
    public class296(class223 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field3782 = arg0;
        this.field3770 = arg2;
        this.field3790 = arg1;
        this.field3766 = arg0.method339(arg2, 11, arg1, arg3, false, arg5, arg4);
        this.field3774 = this.field3766.method37(-18693) != arg1;
        this.field3764 = this.field3766.method36(-24981) != arg2;
        this.field3794 = !this.field3774 && this.field3766.method38((byte) 114);
        this.field3788 = !this.field3764 && this.field3766.method38((byte) 93);
    }

    @OriginalMember(owner = "client!vc", name = "sa", descriptor = "(FFFFFFIII)V", line = 20)
    public final void method1554(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field3767++;
        class581 var10 = this.field3782.method1329(1);
        class581 var11 = this.field3782.method1336(0);
        this.field3766.method43(-29198, this.field3774 || this.field3764 ? class681.field9273 : class396.field5036);
        this.field3782.method1296(-9151);
        this.field3782.method1349(this.field3766, false);
        this.field3782.method1321(-100, arg8);
        this.field3782.method1328((byte) 73, arg6);
        this.field3782.method1274((byte) -75, class666.field9048, 1);
        this.field3782.method1304(class666.field9048, 1, (byte) -27);
        this.field3782.method1341((byte) -128, arg7);
        if (this.field3792) {
            float var12 = (float) this.method1552();
            float var13 = (float) this.method1549();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field3765 * var16;
            float var19 = (float) this.field3765 * var17;
            float var20 = (float) this.field3772 * var14;
            float var21 = (float) this.field3772 * var15;
            float var22 = (float) this.field3777 * -var14;
            float var23 = (float) this.field3777 * -var15;
            float var24 = (float) this.field3787 * -var16;
            float var25 = (float) this.field3787 * -var17;
            arg4 = arg4 + var20 + var24;
            arg1 = arg1 + var21 + var19;
            arg2 = arg2 + var22 + var18;
            arg0 = arg0 + var20 + var18;
            arg3 = arg3 + var23 + var19;
            arg5 = arg5 + var21 + var25;
        }
        var10.method3210(16383, 0.0F, arg2 - arg0, arg3 - arg1, 0.0F, 0.0F, arg5 - arg1, -arg0 + arg4, 1.0F, 0.0F);
        var10.method3222(arg0, 2, 0.0F, arg1);
        var11.method3226(false, this.field3766.method42((byte) 126, (float) this.field3790), this.field3766.method39((float) this.field3770, -121), 1.0F);
        this.field3782.method1339(true, class228.field2942);
        this.field3782.method1348(87);
        this.field3782.method1335(true);
        this.field3782.method1324(0);
        this.field3782.method1274((byte) 94, class251.field3237, 1);
        this.field3782.method1304(class251.field3237, 1, (byte) 115);
    }

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "(III)V", line = 88)
    public final void method1550(int arg0, int arg1, int arg2) {
        field3780++;
    }

    @OriginalMember(owner = "client!vc", name = "ba", descriptor = "(IIIIIII)V", line = 95)
    public final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3769++;
        class581 var8 = this.field3782.method1329(1);
        class581 var9 = this.field3782.method1336(0);
        this.field3766.method43(-29198, class681.field9273);
        this.field3782.method1296(-9151);
        this.field3782.method1349(this.field3766, false);
        this.field3782.method1321(-99, arg6);
        this.field3782.method1328((byte) 81, arg4);
        this.field3782.method1274((byte) -113, class666.field9048, 1);
        this.field3782.method1304(class666.field9048, 1, (byte) 3);
        this.field3782.method1341((byte) 69, arg5);
        boolean var10 = this.field3788 && this.field3765 == 0 && this.field3787 == 0;
        boolean var11 = this.field3794 && this.field3772 == 0 && this.field3777 == 0;
        if ((var11 & var10)) {
            var9.method3226(false, this.field3766.method42((byte) 127, (float) arg2), this.field3766.method39((float) arg3, -85), 1.0F);
            var8.method3226(false, (float) arg2, (float) arg3, 0.0F);
            var8.method588(arg0, arg1, 0);
            this.field3782.method1339(true, class228.field2942);
            this.field3782.method1348(98);
            this.field3782.method1335(true);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1549();
            var9.method3226(false, this.field3766.method42((byte) 126, (float) arg2), this.field3766.method39((float) this.field3770, -120), 1.0F);
            this.field3782.method1339(true, class228.field2942);
            int var14 = arg1 + this.field3765;
            for (int var15 = var14 + this.field3770; var15 <= var12; var15 += var13) {
                var8.method3226(false, (float) arg2, (float) this.field3770, 0.0F);
                var8.method588(arg0, var14, 0);
                this.field3782.method1348(111);
                this.field3782.method1335(true);
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method3226(false, this.field3766.method42((byte) 127, (float) arg2), this.field3766.method39((float) var16, -100), 1.0F);
                this.field3782.method1339(true, class228.field2942);
                var8.method3226(false, (float) arg2, (float) var16, 0.0F);
                var8.method588(arg0, var14, 0);
                this.field3782.method1348(118);
                this.field3782.method1335(true);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method1552();
            var9.method3226(false, this.field3766.method42((byte) 127, (float) this.field3790), this.field3766.method39((float) arg3, -101), 1.0F);
            this.field3782.method1339(true, class228.field2942);
            int var19 = this.field3772 + arg0;
            int var20 = var19 + this.field3790;
            while (var20 <= var17) {
                var8.method3226(false, (float) this.field3790, (float) arg3, 0.0F);
                var8.method588(var19, arg1, 0);
                this.field3782.method1348(97);
                var20 += var18;
                var19 += var18;
                this.field3782.method1335(true);
            }
            if (var19 < var17) {
                int var21 = var17 - var19;
                var9.method3226(false, this.field3766.method42((byte) 127, (float) var21), this.field3766.method39((float) arg3, -123), 1.0F);
                this.field3782.method1339(true, class228.field2942);
                var8.method3226(false, (float) var21, (float) arg3, 0.0F);
                var8.method588(var19, arg1, 0);
                this.field3782.method1348(90);
                this.field3782.method1335(true);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method1552();
            int var25 = this.method1549();
            int var26 = arg1 + this.field3765;
            int var27 = this.field3770 + var26;
            while (var27 <= var22) {
                var9.method3226(false, this.field3766.method42((byte) 127, (float) this.field3790), this.field3766.method39((float) this.field3770, -80), 1.0F);
                this.field3782.method1339(true, class228.field2942);
                int var32 = this.field3772 + arg0;
                for (int var33 = this.field3790 + var32; var33 <= var23; var33 += var24) {
                    var8.method3226(false, (float) this.field3790, (float) this.field3770, 0.0F);
                    var8.method588(var32, var26, 0);
                    this.field3782.method1348(60);
                    var32 += var24;
                    this.field3782.method1335(true);
                }
                if (var32 < var23) {
                    int var34 = var23 - var32;
                    var9.method3226(false, this.field3766.method42((byte) 127, (float) var34), this.field3766.method39((float) this.field3770, -91), 1.0F);
                    this.field3782.method1339(true, class228.field2942);
                    var8.method3226(false, (float) var34, (float) this.field3770, 0.0F);
                    var8.method588(var32, var26, 0);
                    this.field3782.method1348(100);
                    this.field3782.method1335(true);
                }
                var27 += var25;
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method3226(false, this.field3766.method42((byte) 126, (float) this.field3790), this.field3766.method39((float) var28, -113), 1.0F);
                this.field3782.method1339(true, class228.field2942);
                int var29 = this.field3772 + arg0;
                int var30 = this.field3790 + var29;
                while (var30 <= var23) {
                    var8.method3226(false, (float) this.field3790, (float) var28, 0.0F);
                    var8.method588(var29, var26, 0);
                    this.field3782.method1348(82);
                    var30 += var24;
                    this.field3782.method1335(true);
                    var29 += var24;
                }
                if (var23 > var29) {
                    int var31 = var23 - var29;
                    var9.method3226(false, this.field3766.method42((byte) 126, (float) var31), this.field3766.method39((float) var28, -119), 1.0F);
                    this.field3782.method1339(true, class228.field2942);
                    var8.method3226(false, (float) var31, (float) var28, 0.0F);
                    var8.method588(var29, var26, 0);
                    this.field3782.method1348(64);
                    this.field3782.method1335(true);
                }
            }
        }
        this.field3782.method1324(0);
        this.field3782.method1274((byte) -98, class251.field3237, 1);
        this.field3782.method1304(class251.field3237, 1, (byte) 119);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFLfa;II)V", line = 300)
    public final void method1547(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class219 arg6, int arg7, int arg8) {
        field3793++;
        class581 var10 = this.field3782.method1329(1);
        class581 var11 = this.field3782.method1336(0);
        class422 var12 = (class422) arg6;
        class212 var13 = var12.field5357;
        this.field3766.method43(-29198, class396.field5036);
        this.field3782.method1296(-9151);
        this.field3782.method1349(this.field3766, false);
        this.field3782.method1321(-84, 1);
        this.field3782.method1328((byte) 82, 1);
        if (this.field3792) {
            float var14 = (float) this.field3790 / (float) this.method1552();
            float var15 = (float) this.field3770 / (float) this.method1549();
            var10.method3210(16383, 0.0F, (arg2 - arg0) * var14, (arg3 - arg1) * var14, 0.0F, 0.0F, (arg5 - arg1) * var15, (arg4 - arg0) * var15, 1.0F, 0.0F);
            var10.method3222(((float) this.field3772 + arg0) * var14, 2, 0.0F, ((float) this.field3765 + arg1) * var15);
        } else {
            var10.method3210(16383, 0.0F, arg2 - arg0, -arg1 + arg3, 0.0F, 0.0F, arg5 - arg1, arg4 - arg0, 1.0F, 0.0F);
            var10.method3222(arg0, 2, 0.0F, arg1);
        }
        var11.method3226(false, this.field3766.method42((byte) 127, (float) this.field3790), this.field3766.method39((float) this.field3770, -109), 1.0F);
        this.field3782.method1339(true, class228.field2942);
        this.field3782.method1298(28397, 1);
        this.field3782.method1349(var13, false);
        this.field3782.method1287(class607.field8276, (byte) 57, class291.field3672);
        this.field3782.method1274((byte) -106, class251.field3237, 0);
        class581 var16 = this.field3782.method1336(0);
        var16.method583(var10);
        var16.method588(-arg7, -arg8, 0);
        var16.method3217(1.0F, var13.method39(1.0F, -100), var13.method42((byte) 126, 1.0F), (byte) 40);
        this.field3782.method1339(true, class228.field2942);
        this.field3782.method1348(67);
        this.field3782.method1335(true);
        this.field3782.method1324(0);
        this.field3782.method1274((byte) 113, class290.field3662, 0);
        this.field3782.method1287(class607.field8276, (byte) 57, class607.field8276);
        this.field3782.method1349(null, false);
        this.field3782.method1298(28397, 0);
        this.field3782.method1324(0);
    }

    @OriginalMember(owner = "client!vc", name = "KA", descriptor = "(IIIIIII)V", line = 356)
    public final void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3783++;
        class581 var8 = this.field3782.method1329(1);
        class581 var9 = this.field3782.method1336(0);
        this.field3766.method43(-29198, this.field3774 || this.field3764 ? class681.field9273 : class396.field5036);
        this.field3782.method1296(-9151);
        this.field3782.method1349(this.field3766, false);
        this.field3782.method1321(-104, arg6);
        this.field3782.method1328((byte) 82, arg4);
        this.field3782.method1274((byte) -51, class666.field9048, 1);
        this.field3782.method1304(class666.field9048, 1, (byte) -106);
        this.field3782.method1341((byte) -122, arg5);
        var9.method3226(false, this.field3766.method42((byte) 126, (float) this.field3790), this.field3766.method39((float) this.field3770, -94), 1.0F);
        if (this.field3792) {
            arg2 = this.field3790 * arg2 / this.method1552();
            arg3 = this.field3770 * arg3 / this.method1549();
            arg0 += this.field3772 * arg2 / this.field3790;
            arg1 += this.field3765 * arg3 / this.field3770;
        }
        var8.method3226(false, (float) arg2, (float) arg3, 0.0F);
        var8.method588(arg0, arg1, 0);
        this.field3782.method1339(true, class228.field2942);
        this.field3782.method1348(127);
        this.field3782.method1335(true);
        this.field3782.method1324(0);
        this.field3782.method1274((byte) 86, class251.field3237, 1);
        this.field3782.method1304(class251.field3237, 1, (byte) -45);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII[III)V", line = 392)
    private final void method1778(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field3766.method35(arg4, arg5, arg3, arg2, arg1, arg6, 124, arg0);
        field3786++;
    }

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "(IIIII)V", line = 404)
    public final void method1543(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3771++;
        class581 var6 = this.field3782.method1329(1);
        class581 var7 = this.field3782.method1336(0);
        int var8 = this.field3765 + arg1;
        int var9 = this.field3772 + arg0;
        this.field3766.method43(-29198, class681.field9273);
        this.field3782.method1296(-9151);
        this.field3782.method1349(this.field3766, false);
        this.field3782.method1321(-120, arg4);
        this.field3782.method1328((byte) 47, arg2);
        this.field3782.method1274((byte) 127, class666.field9048, 1);
        this.field3782.method1304(class666.field9048, 1, (byte) -33);
        this.field3782.method1341((byte) -123, arg3);
        var6.method3226(false, (float) this.field3790, (float) this.field3770, 0.0F);
        var6.method588(var9, var8, 0);
        var7.method3226(false, this.field3766.method42((byte) 126, (float) this.field3790), this.field3766.method39((float) this.field3770, -113), 1.0F);
        this.field3782.method1339(true, class228.field2942);
        this.field3782.method1348(102);
        this.field3782.method1335(true);
        this.field3782.method1324(0);
        this.field3782.method1274((byte) -36, class251.field3237, 1);
        this.field3782.method1304(class251.field3237, 1, (byte) -4);
    }

    @OriginalMember(owner = "client!vc", name = "EA", descriptor = "(IIII)V", line = 434)
    public final void method1559(int arg0, int arg1, int arg2, int arg3) {
        this.field3772 = arg0;
        field3789++;
        this.field3765 = arg1;
        this.field3787 = arg3;
        this.field3777 = arg2;
        this.field3792 = this.field3772 != 0 || this.field3765 != 0 || this.field3777 != 0 || this.field3787 != 0;
    }

    @OriginalMember(owner = "client!vc", name = "GA", descriptor = "(IIIIII)V", line = 449)
    public final void method1546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3785++;
        int[] var7 = this.field3782.method396(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class364.method2113(var7[var8], -16777216);
            }
            this.method1778(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILfa;II)V", line = 472)
    public final void method1557(int arg0, int arg1, class219 arg2, int arg3, int arg4) {
        field3775++;
        class422 var6 = (class422) arg2;
        int var7 = this.field3772 + arg0;
        class212 var8 = var6.field5357;
        int var9 = this.field3765 + arg1;
        this.field3766.method43(-29198, class681.field9273);
        this.field3782.method1296(-9151);
        this.field3782.method1349(this.field3766, false);
        this.field3782.method1321(-125, 1);
        this.field3782.method1328((byte) 118, 1);
        class581 var10 = this.field3782.method1329(1);
        var10.method3226(false, (float) this.field3790, (float) this.field3770, 0.0F);
        var10.method588(var7, var9, 0);
        this.field3782.method1348(83);
        class581 var11 = this.field3782.method1336(0);
        var11.method3226(false, this.field3766.method42((byte) 126, (float) this.field3790), this.field3766.method39((float) this.field3770, -85), 1.0F);
        this.field3782.method1339(true, class228.field2942);
        this.field3782.method1298(28397, 1);
        this.field3782.method1349(var8, false);
        this.field3782.method1287(class607.field8276, (byte) 57, class291.field3672);
        this.field3782.method1274((byte) 99, class251.field3237, 0);
        class581 var12 = this.field3782.method1336(0);
        var12.method3226(false, var8.method42((byte) 126, (float) this.field3790), var8.method39((float) this.field3770, -96), 1.0F);
        var12.method3222(var8.method42((byte) 126, (float) (var7 - arg3)), 2, 0.0F, var8.method39((float) (var9 - arg4), -109));
        this.field3782.method1339(true, class228.field2942);
        this.field3782.method1335(true);
        this.field3782.method1324(0);
        this.field3782.method1274((byte) -46, class290.field3662, 0);
        this.field3782.method1287(class607.field8276, (byte) 57, class607.field8276);
        this.field3782.method1349(null, false);
        this.field3782.method1298(28397, 0);
        this.field3782.method1324(0);
    }

    @OriginalMember(owner = "client!vc", name = "QA", descriptor = "()I", line = 516)
    public final int method1556() {
        field3768++;
        return this.field3790;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I", line = 534)
    public final int method1544() {
        field3779++;
        return this.field3770;
    }

    @OriginalMember(owner = "client!vc", name = "AA", descriptor = "()I", line = 544)
    public final int method1552() {
        field3776++;
        return this.field3790 + this.field3777 + this.field3772;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 552)
    public static void method1779(byte arg0) {
        field3773 = null;
        if (arg0 != 10) {
            method1779((byte) 5);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I", line = 567)
    public final int method1549() {
        field3784++;
        return this.field3770 + this.field3765 + this.field3787;
    }
}
