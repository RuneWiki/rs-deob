import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class149 extends class318 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    private int field1951 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    private int field1945 = 0;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    private int field1961 = 0;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    private boolean field1947 = false;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    private int field1974 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Llba;")
    private class223 field1948;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    private int field1970;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    private int field1952;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Lbw;")
    private class28 field1956;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
    private boolean field1950;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Z")
    private boolean field1971;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Z")
    private boolean field1975;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Z")
    private boolean field1959;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Z")
    public static boolean field1964 = true;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "Lae;")
    public static class283 field1968;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
    public final void method988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1967++;
        int[] var7 = this.field1948.method243(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class613.method3544(var7[var8], -16777216);
            }
            this.method990(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIII)V")
    public final void method741(int arg0, int arg1, int arg2, int arg3) {
        field1966++;
        this.field1945 = arg2;
        this.field1961 = arg1;
        this.field1951 = arg3;
        this.field1974 = arg0;
        this.field1947 = this.field1974 != 0 || this.field1961 != 0 || this.field1945 != 0 || this.field1951 != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([I)V")
    public final void method744(int[] arg0) {
        arg0[1] = this.field1961;
        arg0[0] = this.field1974;
        arg0[3] = this.field1951;
        arg0[2] = this.field1945;
        field1955++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILaa;II)V")
    public final void method747(int arg0, int arg1, class87 arg2, int arg3, int arg4) {
        field1957++;
        class592 var6 = (class592) arg2;
        class28 var7 = var6.field8340;
        int var8 = this.field1974 + arg0;
        int var9 = this.field1961 + arg1;
        this.field1956.method280((byte) 88, class22.field199);
        this.field1948.method1398(-81);
        this.field1948.method1492(this.field1956, 2);
        this.field1948.method1404((byte) -117, 1);
        this.field1948.method1509(4, 1);
        class517 var10 = this.field1948.method1466(true);
        var10.method3096((float) this.field1952, (float) this.field1970, 0.0F, -9950);
        var10.method47(var8, var9, 0);
        this.field1948.method1428(0);
        class517 var11 = this.field1948.method1470(51);
        var11.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
        this.field1948.method1475(43, class304.field4414);
        this.field1948.method1473(1, (byte) 80);
        this.field1948.method1492(var7, 2);
        this.field1948.method1494(class92.field1073, 775, class785.field10763);
        this.field1948.method1409(class224.field3416, 0, -118);
        class517 var12 = this.field1948.method1470(87);
        var12.method3096(var7.method126((float) this.field1952, 5263), var7.method128((float) this.field1970, true), 1.0F, -9950);
        var12.method3072(8929, 0.0F, var7.method126((float) (var8 - arg3), 5263), var7.method128((float) (var9 - arg4), true));
        this.field1948.method1475(50, class304.field4414);
        this.field1948.method1400(2);
        this.field1948.method1377(true);
        this.field1948.method1409(class157.field2039, 0, -109);
        this.field1948.method1494(class785.field10763, 775, class785.field10763);
        this.field1948.method1492(null, 2);
        this.field1948.method1473(0, (byte) 121);
        this.field1948.method1377(true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIII)V")
    public final void method735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1962++;
        class517 var9 = this.field1948.method1466(true);
        class517 var10 = this.field1948.method1470(126);
        this.field1956.method280((byte) 113, this.field1950 || this.field1971 || (arg7 & 0x1) == 0 ? class22.field199 : class109.field1320);
        this.field1948.method1398(-110);
        this.field1948.method1492(this.field1956, 2);
        this.field1948.method1404((byte) -114, arg6);
        this.field1948.method1509(4, arg4);
        this.field1948.method1409(class41.field423, 1, -123);
        this.field1948.method1455(1, -3, class41.field423);
        this.field1948.method1468((byte) 67, arg5);
        var10.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
        if (this.field1947) {
            arg2 = this.field1952 * arg2 / this.method749();
            arg3 = this.field1970 * arg3 / this.method736();
            arg1 += this.field1961 * arg3 / this.field1970;
            arg0 += this.field1974 * arg2 / this.field1952;
        }
        var9.method3096((float) arg2, (float) arg3, 0.0F, -9950);
        var9.method47(arg0, arg1, 0);
        this.field1948.method1475(77, class304.field4414);
        this.field1948.method1428(0);
        this.field1948.method1400(2);
        this.field1948.method1377(true);
        this.field1948.method1409(class224.field3416, 1, -118);
        this.field1948.method1455(1, -3, class224.field3416);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method745(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9) {
        field1954++;
        class517 var11 = this.field1948.method1466(true);
        class517 var12 = this.field1948.method1470(82);
        class592 var13 = (class592) arg7;
        class28 var14 = var13.field8340;
        this.field1956.method280((byte) -108, this.field1950 || this.field1971 || (arg6 & 0x1) == 0 ? class22.field199 : class109.field1320);
        this.field1948.method1398(107);
        this.field1948.method1492(this.field1956, 2);
        this.field1948.method1404((byte) -128, 1);
        this.field1948.method1509(4, 1);
        if (this.field1947) {
            float var15 = (float) this.field1952 / (float) this.method749();
            float var16 = (float) this.field1970 / (float) this.method736();
            var11.method3079(-12, 0.0F, 0.0F, (arg5 - arg1) * var16, 1.0F, 0.0F, (arg4 - arg0) * var16, (arg2 - arg0) * var15, (arg3 - arg1) * var15, 0.0F);
            var11.method3072(8929, 0.0F, ((float) this.field1974 + arg0) * var15, ((float) this.field1961 + arg1) * var16);
        } else {
            var11.method3079(-35, 0.0F, 0.0F, arg5 - arg1, 1.0F, 0.0F, arg4 - arg0, arg2 - arg0, arg3 - arg1, 0.0F);
            var11.method3072(8929, 0.0F, arg0, arg1);
        }
        var12.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
        this.field1948.method1475(119, class304.field4414);
        this.field1948.method1473(1, (byte) 38);
        this.field1948.method1492(var14, 2);
        this.field1948.method1494(class92.field1073, 775, class785.field10763);
        this.field1948.method1409(class224.field3416, 0, -108);
        class517 var17 = this.field1948.method1470(126);
        var17.method49(var11);
        var17.method47(-arg8, -arg9, 0);
        var17.method3086(7, var14.method128(1.0F, true), var14.method126(1.0F, 5263), 1.0F);
        this.field1948.method1475(38, class304.field4414);
        this.field1948.method1428(0);
        this.field1948.method1400(2);
        this.field1948.method1377(true);
        this.field1948.method1409(class157.field2039, 0, -111);
        this.field1948.method1494(class785.field10763, 775, class785.field10763);
        this.field1948.method1492(null, 2);
        this.field1948.method1473(0, (byte) 119);
        this.field1948.method1377(true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public final void method746(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1973++;
        class517 var6 = this.field1948.method1466(true);
        class517 var7 = this.field1948.method1470(69);
        int var8 = this.field1974 + arg0;
        int var9 = this.field1961 + arg1;
        this.field1956.method280((byte) -105, class22.field199);
        this.field1948.method1398(-94);
        this.field1948.method1492(this.field1956, 2);
        this.field1948.method1404((byte) -128, arg4);
        this.field1948.method1509(4, arg2);
        this.field1948.method1409(class41.field423, 1, -109);
        this.field1948.method1455(1, -3, class41.field423);
        this.field1948.method1468((byte) 67, arg3);
        var6.method3096((float) this.field1952, (float) this.field1970, 0.0F, -9950);
        var6.method47(var8, var9, 0);
        var7.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
        this.field1948.method1475(97, class304.field4414);
        this.field1948.method1428(0);
        this.field1948.method1400(2);
        this.field1948.method1377(true);
        this.field1948.method1409(class224.field3416, 1, -115);
        this.field1948.method1455(1, -3, class224.field3416);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
    public static void method989(boolean arg0) {
        field1968 = null;
        if (!arg0) {
            method989(true);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
    public final int method736() {
        field1972++;
        return this.field1970 + this.field1951 + this.field1961;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()I")
    public final int method749() {
        field1960++;
        return this.field1952 + this.field1945 + this.field1974;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
    public final int method738() {
        field1958++;
        return this.field1970;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V")
    public final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1949++;
        class517 var8 = this.field1948.method1466(true);
        class517 var9 = this.field1948.method1470(73);
        this.field1956.method280((byte) -42, class22.field199);
        this.field1948.method1398(-124);
        this.field1948.method1492(this.field1956, 2);
        this.field1948.method1404((byte) -113, arg6);
        this.field1948.method1509(4, arg4);
        this.field1948.method1409(class41.field423, 1, -122);
        this.field1948.method1455(1, -3, class41.field423);
        this.field1948.method1468((byte) 67, arg5);
        boolean var10 = this.field1959 && this.field1961 == 0 && this.field1951 == 0;
        boolean var11 = this.field1975 && this.field1974 == 0 && this.field1945 == 0;
        if ((var11 & var10)) {
            var9.method3096(this.field1956.method126((float) arg2, 5263), this.field1956.method128((float) arg3, true), 1.0F, -9950);
            var8.method3096((float) arg2, (float) arg3, 0.0F, -9950);
            var8.method47(arg0, arg1, 0);
            this.field1948.method1475(57, class304.field4414);
            this.field1948.method1428(0);
            this.field1948.method1400(2);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method736();
            var9.method3096(this.field1956.method126((float) arg2, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
            this.field1948.method1475(58, class304.field4414);
            int var14 = this.field1961 + arg1;
            for (int var15 = var14 + this.field1970; var15 <= var12; var15 += var13) {
                var8.method3096((float) arg2, (float) this.field1970, 0.0F, -9950);
                var8.method47(arg0, var14, 0);
                this.field1948.method1428(0);
                var14 += var13;
                this.field1948.method1400(2);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method3096(this.field1956.method126((float) arg2, 5263), this.field1956.method128((float) var16, true), 1.0F, -9950);
                this.field1948.method1475(38, class304.field4414);
                var8.method3096((float) arg2, (float) var16, 0.0F, -9950);
                var8.method47(arg0, var14, 0);
                this.field1948.method1428(0);
                this.field1948.method1400(2);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method749();
            var9.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) arg3, true), 1.0F, -9950);
            this.field1948.method1475(80, class304.field4414);
            int var19 = arg0 + this.field1974;
            int var20 = this.field1952 + var19;
            while (var17 >= var20) {
                var8.method3096((float) this.field1952, (float) arg3, 0.0F, -9950);
                var8.method47(var19, arg1, 0);
                this.field1948.method1428(0);
                var20 += var18;
                var19 += var18;
                this.field1948.method1400(2);
            }
            if (var17 > var19) {
                int var21 = var17 - var19;
                var9.method3096(this.field1956.method126((float) var21, 5263), this.field1956.method128((float) arg3, true), 1.0F, -9950);
                this.field1948.method1475(118, class304.field4414);
                var8.method3096((float) var21, (float) arg3, 0.0F, -9950);
                var8.method47(var19, arg1, 0);
                this.field1948.method1428(0);
                this.field1948.method1400(2);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method749();
            int var25 = this.method736();
            int var26 = this.field1961 + arg1;
            for (int var27 = this.field1970 + var26; var27 <= var22; var27 += var25) {
                var9.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
                this.field1948.method1475(94, class304.field4414);
                int var32 = this.field1974 + arg0;
                int var33 = this.field1952 + var32;
                while (var23 >= var33) {
                    var8.method3096((float) this.field1952, (float) this.field1970, 0.0F, -9950);
                    var8.method47(var32, var26, 0);
                    this.field1948.method1428(0);
                    var33 += var24;
                    this.field1948.method1400(2);
                    var32 += var24;
                }
                if (var23 > var32) {
                    int var34 = var23 - var32;
                    var9.method3096(this.field1956.method126((float) var34, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
                    this.field1948.method1475(52, class304.field4414);
                    var8.method3096((float) var34, (float) this.field1970, 0.0F, -9950);
                    var8.method47(var32, var26, 0);
                    this.field1948.method1428(0);
                    this.field1948.method1400(2);
                }
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) var28, true), 1.0F, -9950);
                this.field1948.method1475(71, class304.field4414);
                int var29 = this.field1974 + arg0;
                for (int var30 = this.field1952 + var29; var30 <= var23; var30 += var24) {
                    var8.method3096((float) this.field1952, (float) var28, 0.0F, -9950);
                    var8.method47(var29, var26, 0);
                    this.field1948.method1428(0);
                    this.field1948.method1400(2);
                    var29 += var24;
                }
                if (var23 > var29) {
                    int var31 = var23 - var29;
                    var9.method3096(this.field1956.method126((float) var31, 5263), this.field1956.method128((float) var28, true), 1.0F, -9950);
                    this.field1948.method1475(70, class304.field4414);
                    var8.method3096((float) var31, (float) var28, 0.0F, -9950);
                    var8.method47(var29, var26, 0);
                    this.field1948.method1428(0);
                    this.field1948.method1400(2);
                }
            }
        }
        this.field1948.method1377(true);
        this.field1948.method1409(class224.field3416, 1, -128);
        this.field1948.method1455(1, -3, class224.field3416);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method742(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field1965++;
        class517 var11 = this.field1948.method1466(true);
        class517 var12 = this.field1948.method1470(54);
        this.field1956.method280((byte) -83, this.field1950 || this.field1971 || (arg9 & 0x1) == 0 ? class22.field199 : class109.field1320);
        this.field1948.method1398(-8);
        this.field1948.method1492(this.field1956, 2);
        this.field1948.method1404((byte) -125, arg8);
        this.field1948.method1509(4, arg6);
        this.field1948.method1409(class41.field423, 1, -117);
        this.field1948.method1455(1, -3, class41.field423);
        this.field1948.method1468((byte) 67, arg7);
        if (this.field1947) {
            float var13 = (float) this.method749();
            float var14 = (float) this.method736();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field1961 * var17;
            float var20 = (float) this.field1961 * var18;
            float var21 = (float) this.field1974 * var15;
            float var22 = (float) this.field1974 * var16;
            float var23 = (float) this.field1945 * -var15;
            float var24 = (float) this.field1945 * -var16;
            float var25 = (float) this.field1951 * -var17;
            arg1 = arg1 + var22 + var20;
            arg4 = arg4 + var21 + var25;
            float var26 = (float) this.field1951 * -var18;
            arg0 = arg0 + var21 + var19;
            arg3 = arg3 + var24 + var20;
            arg2 = arg2 + var23 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method3079(1, 0.0F, 0.0F, arg5 - arg1, 1.0F, 0.0F, arg4 - arg0, arg2 - arg0, arg3 - arg1, 0.0F);
        var11.method3072(8929, 0.0F, arg0, arg1);
        var12.method3096(this.field1956.method126((float) this.field1952, 5263), this.field1956.method128((float) this.field1970, true), 1.0F, -9950);
        this.field1948.method1475(103, class304.field4414);
        this.field1948.method1428(0);
        this.field1948.method1400(2);
        this.field1948.method1377(true);
        this.field1948.method1409(class224.field3416, 1, -122);
        this.field1948.method1455(1, -3, class224.field3416);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
    public final int method737() {
        field1969++;
        return this.field1952;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII[III)V")
    private final void method990(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field1953++;
        this.field1956.method131(arg5, arg4, arg6, arg0, arg3, false, arg1, arg2);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V")
    public static final void method991(int arg0, int arg1, int arg2) {
        field1963++;
        if (arg2 != 28694) {
            field1968 = null;
        }
        if (class114.field1375 == 1) {
            class49.method413(arg0, (byte) 88, class268.field3884, arg1);
        } else if (class114.field1375 == 2) {
            if (class55.field651) {
                class59.method480(class339.method2149((byte) -102) + arg0, class236.method1611(-5110) + arg1, arg2 - 28694);
            } else {
                class59.method480(arg0, arg1, 0);
            }
        }
        class114.field1375 = 0;
        class268.field3884 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public final void method992(int arg0, int arg1, int arg2) {
        field1946++;
        int[] var4 = this.field1948.method243(arg0, arg1, this.field1952, this.field1970);
        int[] var5 = new int[this.field1970 * this.field1952];
        this.field1956.method125(-15104, 0, 0, this.field1970, var5, this.field1952, 0);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field1970; var15++) {
                int var16 = this.field1952 * var15;
                for (int var17 = 0; var17 < this.field1952; var17++) {
                    var5[var16 + var17] = class613.method3544(class407.method2490(16777215, var5[var16 + var17]), class407.method2490(-16777194, var4[var16 + var17] << 8));
                }
            }
        } else if (arg2 == 1) {
            for (int var6 = 0; var6 < this.field1970; var6++) {
                int var7 = this.field1952 * var6;
                for (int var8 = 0; var8 < this.field1952; var8++) {
                    var5[var7 + var8] = class613.method3544(class407.method2490(var4[var7 + var8], 422248192) << 16, class407.method2490(16777215, var5[var7 + var8]));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field1970; var9++) {
                int var10 = this.field1952 * var9;
                for (int var11 = 0; var11 < this.field1952; var11++) {
                    var5[var10 + var11] = class613.method3544(class407.method2490(-9497493, var4[var10 + var11] << 24), class407.method2490(16777215, var5[var10 + var11]));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field1970; var12++) {
                int var13 = this.field1952 * var12;
                for (int var14 = 0; var14 < this.field1952; var14++) {
                    var5[var13 + var14] = class613.method3544(class407.method2490(var5[var13 + var14], 16777215), var4[var13 + var14] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method990(0, 0, this.field1952, this.field1970, var5, 0, this.field1952);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Llba;IIZ)V")
    public class149(class223 arg0, int arg1, int arg2, boolean arg3) {
        this.field1948 = arg0;
        this.field1970 = arg2;
        this.field1952 = arg1;
        this.field1956 = arg0.method1495(arg3 ? class75.field837 : class661.field9302, arg1, class612.field8616, (byte) 103, arg2);
        this.field1956.method129(true, true, true);
        this.field1950 = this.field1956.method130((byte) 11) != arg1;
        this.field1971 = arg2 != this.field1956.method124((byte) 95);
        this.field1975 = !this.field1950 && this.field1956.method132(114);
        this.field1959 = !this.field1971 && this.field1956.method132(56);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Llba;II[III)V")
    public class149(class223 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1952 = arg1;
        this.field1948 = arg0;
        this.field1970 = arg2;
        this.field1956 = arg0.method1507(arg1, arg2, false, arg5, arg4, 0, arg3);
        this.field1956.method129(true, true, true);
        this.field1950 = arg1 != this.field1956.method130((byte) 11);
        this.field1971 = arg2 != this.field1956.method124((byte) 95);
        this.field1975 = !this.field1950 && this.field1956.method132(123);
        this.field1959 = !this.field1971 && this.field1956.method132(105);
    }
}
