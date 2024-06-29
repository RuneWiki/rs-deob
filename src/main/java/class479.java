import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class479 extends class702 {

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    private int field6596 = 0;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    private int field6602 = 0;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "Z")
    private boolean field6608 = false;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    private int field6598 = 0;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    private int field6592 = 0;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lnv;")
    private class382 field6587;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    private int field6588;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    private int field6615;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "Lcm;")
    private class679 field6612;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "Z")
    private boolean field6599;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "Z")
    private boolean field6616;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Z")
    private boolean field6586;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "Z")
    private boolean field6601;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "Lon;")
    public static class306 field6600;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
    public static boolean field6590;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "[I")
    public static int[] field6610;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "[[B")
    public static byte[][] field6606;

    @OriginalMember(owner = "client!fo", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method1657(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field6609++;
        class274 var11 = this.field6587.method2224((byte) 99);
        class274 var12 = this.field6587.method2235(2);
        this.field6612.method1259(this.field6599 || this.field6616 || (arg9 & 0x1) == 0 ? class216.field3051 : class544.field7382, (byte) 94);
        this.field6587.method2272(0);
        this.field6587.method2241(this.field6612, (byte) 44);
        this.field6587.method2230(arg8, -78);
        this.field6587.method2246(arg6, 26770);
        this.field6587.method2264(9, class452.field6221, 1);
        this.field6587.method2223(1, class452.field6221, (byte) -58);
        this.field6587.method2233(false, arg7);
        if (this.field6608) {
            float var13 = (float) this.method1660();
            float var14 = (float) this.method1661();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field6598 * var17;
            float var20 = (float) this.field6598 * var18;
            float var21 = (float) this.field6592 * var15;
            float var22 = (float) this.field6592 * var16;
            float var23 = (float) this.field6602 * -var15;
            float var24 = (float) this.field6602 * -var16;
            float var25 = (float) this.field6596 * -var17;
            arg1 = arg1 + var22 + var20;
            float var26 = (float) this.field6596 * -var18;
            arg2 = arg2 + var23 + var19;
            arg4 = arg4 + var21 + var25;
            arg3 = arg3 + var24 + var20;
            arg0 = arg0 + var21 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method1714(arg3 - arg1, arg4 - arg0, arg2 - arg0, 0.0F, 0.0F, 0.0F, 0.0F, (byte) -68, 1.0F, arg5 - arg1);
        var11.method1716(arg1, (byte) -7, 0.0F, arg0);
        var12.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 111, (float) this.field6615), 1.0F, 6);
        this.field6587.method2227(class41.field482, (byte) -99);
        this.field6587.method2219(0);
        this.field6587.method2202(true);
        this.field6587.method2234(-104);
        this.field6587.method2264(9, class78.field1179, 1);
        this.field6587.method2223(1, class78.field1179, (byte) -88);
    }

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "()I")
    public final int method1658() {
        field6611++;
        return this.field6588;
    }

    @OriginalMember(owner = "client!fo", name = "xa", descriptor = "(III)V")
    public final void method939(int arg0, int arg1, int arg2) {
        field6595++;
    }

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "()I")
    public final int method1653() {
        field6607++;
        return this.field6615;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public static void method2696(boolean arg0) {
        field6600 = null;
        field6610 = null;
        field6606 = null;
        if (arg0) {
            method2696(true);
        }
    }

    @OriginalMember(owner = "client!fo", name = "V", descriptor = "(IIIII)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6597++;
        class274 var6 = this.field6587.method2224((byte) 99);
        class274 var7 = this.field6587.method2235(2);
        int var8 = this.field6592 + arg0;
        int var9 = this.field6598 + arg1;
        this.field6612.method1259(class216.field3051, (byte) 127);
        this.field6587.method2272(0);
        this.field6587.method2241(this.field6612, (byte) 44);
        this.field6587.method2230(arg4, -66);
        this.field6587.method2246(arg2, 26770);
        this.field6587.method2264(9, class452.field6221, 1);
        this.field6587.method2223(1, class452.field6221, (byte) -4);
        this.field6587.method2233(false, arg3);
        var6.method1703((float) this.field6588, (float) this.field6615, 0.0F, 6);
        var6.method687(var8, var9, 0);
        var7.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 115, (float) this.field6615), 1.0F, 6);
        this.field6587.method2227(class41.field482, (byte) -95);
        this.field6587.method2219(0);
        this.field6587.method2202(true);
        this.field6587.method2234(-87);
        this.field6587.method2264(9, class78.field1179, 1);
        this.field6587.method2223(1, class78.field1179, (byte) -98);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII[III)V")
    private final void method2697(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field6612.method2134(arg5, arg3, 19390, arg4, arg1, arg0, arg2, arg6);
        field6593++;
    }

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "()I")
    public final int method1660() {
        field6591++;
        return this.field6592 + this.field6588 + this.field6602;
    }

    @OriginalMember(owner = "client!fo", name = "DA", descriptor = "(IIIIIII)V")
    public final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6589++;
        class274 var8 = this.field6587.method2224((byte) 99);
        class274 var9 = this.field6587.method2235(2);
        this.field6612.method1259(class216.field3051, (byte) 75);
        this.field6587.method2272(0);
        this.field6587.method2241(this.field6612, (byte) 44);
        this.field6587.method2230(arg6, -15);
        this.field6587.method2246(arg4, 26770);
        this.field6587.method2264(9, class452.field6221, 1);
        this.field6587.method2223(1, class452.field6221, (byte) -85);
        this.field6587.method2233(false, arg5);
        boolean var10 = this.field6601 && this.field6598 == 0 && this.field6596 == 0;
        boolean var11 = this.field6586 && this.field6592 == 0 && this.field6602 == 0;
        if ((var11 & var10)) {
            var9.method1703(this.field6612.method2135((byte) -84, (float) arg2), this.field6612.method2138((byte) 103, (float) arg3), 1.0F, 6);
            var8.method1703((float) arg2, (float) arg3, 0.0F, 6);
            var8.method687(arg0, arg1, 0);
            this.field6587.method2227(class41.field482, (byte) -108);
            this.field6587.method2219(0);
            this.field6587.method2202(true);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method1661();
            var9.method1703(this.field6612.method2135((byte) -84, (float) arg2), this.field6612.method2138((byte) 107, (float) this.field6615), 1.0F, 6);
            this.field6587.method2227(class41.field482, (byte) -101);
            int var32 = this.field6598 + arg1;
            int var33 = var32 + this.field6615;
            while (var30 >= var33) {
                var8.method1703((float) arg2, (float) this.field6615, 0.0F, 6);
                var8.method687(arg0, var32, 0);
                this.field6587.method2219(0);
                this.field6587.method2202(true);
                var33 += var31;
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method1703(this.field6612.method2135((byte) -84, (float) arg2), this.field6612.method2138((byte) 101, (float) var34), 1.0F, 6);
                this.field6587.method2227(class41.field482, (byte) -127);
                var8.method1703((float) arg2, (float) var34, 0.0F, 6);
                var8.method687(arg0, var32, 0);
                this.field6587.method2219(0);
                this.field6587.method2202(true);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method1660();
            var9.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 122, (float) arg3), 1.0F, 6);
            this.field6587.method2227(class41.field482, (byte) -118);
            int var27 = this.field6592 + arg0;
            for (int var28 = this.field6588 + var27; var28 <= var25; var28 += var26) {
                var8.method1703((float) this.field6588, (float) arg3, 0.0F, 6);
                var8.method687(var27, arg1, 0);
                this.field6587.method2219(0);
                var27 += var26;
                this.field6587.method2202(true);
            }
            if (var27 < var25) {
                int var29 = var25 - var27;
                var9.method1703(this.field6612.method2135((byte) -84, (float) var29), this.field6612.method2138((byte) 101, (float) arg3), 1.0F, 6);
                this.field6587.method2227(class41.field482, (byte) -109);
                var8.method1703((float) var29, (float) arg3, 0.0F, 6);
                var8.method687(var27, arg1, 0);
                this.field6587.method2219(0);
                this.field6587.method2202(true);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method1660();
            int var15 = this.method1661();
            int var16 = this.field6598 + arg1;
            for (int var17 = this.field6615 + var16; var17 <= var12; var17 += var15) {
                var9.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 126, (float) this.field6615), 1.0F, 6);
                this.field6587.method2227(class41.field482, (byte) -101);
                int var22 = arg0 + this.field6592;
                int var23 = this.field6588 + var22;
                while (var23 <= var13) {
                    var8.method1703((float) this.field6588, (float) this.field6615, 0.0F, 6);
                    var8.method687(var22, var16, 0);
                    this.field6587.method2219(0);
                    var23 += var14;
                    this.field6587.method2202(true);
                    var22 += var14;
                }
                if (var13 > var22) {
                    int var24 = var13 - var22;
                    var9.method1703(this.field6612.method2135((byte) -84, (float) var24), this.field6612.method2138((byte) 127, (float) this.field6615), 1.0F, 6);
                    this.field6587.method2227(class41.field482, (byte) -118);
                    var8.method1703((float) var24, (float) this.field6615, 0.0F, 6);
                    var8.method687(var22, var16, 0);
                    this.field6587.method2219(0);
                    this.field6587.method2202(true);
                }
                var16 += var15;
            }
            if (var16 < var12) {
                int var18 = var12 - var16;
                var9.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 100, (float) var18), 1.0F, 6);
                this.field6587.method2227(class41.field482, (byte) -106);
                int var19 = this.field6592 + arg0;
                for (int var20 = this.field6588 + var19; var20 <= var13; var20 += var14) {
                    var8.method1703((float) this.field6588, (float) var18, 0.0F, 6);
                    var8.method687(var19, var16, 0);
                    this.field6587.method2219(0);
                    var19 += var14;
                    this.field6587.method2202(true);
                }
                if (var19 < var13) {
                    int var21 = var13 - var19;
                    var9.method1703(this.field6612.method2135((byte) -84, (float) var21), this.field6612.method2138((byte) 95, (float) var18), 1.0F, 6);
                    this.field6587.method2227(class41.field482, (byte) -114);
                    var8.method1703((float) var21, (float) var18, 0.0F, 6);
                    var8.method687(var19, var16, 0);
                    this.field6587.method2219(0);
                    this.field6587.method2202(true);
                }
            }
        }
        this.field6587.method2234(-102);
        this.field6587.method2264(9, class78.field1179, 1);
        this.field6587.method2223(1, class78.field1179, (byte) -65);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILua;II)V")
    public final void method932(int arg0, int arg1, class618 arg2, int arg3, int arg4) {
        field6604++;
        class525 var6 = (class525) arg2;
        int var7 = this.field6598 + arg1;
        class679 var8 = var6.field7121;
        int var9 = this.field6592 + arg0;
        this.field6612.method1259(class216.field3051, (byte) 103);
        this.field6587.method2272(0);
        this.field6587.method2241(this.field6612, (byte) 44);
        this.field6587.method2230(1, -98);
        this.field6587.method2246(1, 26770);
        class274 var10 = this.field6587.method2224((byte) 99);
        var10.method1703((float) this.field6588, (float) this.field6615, 0.0F, 6);
        var10.method687(var9, var7, 0);
        this.field6587.method2219(0);
        class274 var11 = this.field6587.method2235(2);
        var11.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 98, (float) this.field6615), 1.0F, 6);
        this.field6587.method2227(class41.field482, (byte) -125);
        this.field6587.method2201((byte) 126, 1);
        this.field6587.method2241(var8, (byte) 44);
        this.field6587.method2199(class276.field3814, 9797, class334.field4505);
        this.field6587.method2264(9, class78.field1179, 0);
        class274 var12 = this.field6587.method2235(2);
        var12.method1703(var8.method2135((byte) -84, (float) this.field6588), var8.method2138((byte) 99, (float) this.field6615), 1.0F, 6);
        var12.method1716(var8.method2138((byte) 123, (float) (var7 - arg4)), (byte) -7, 0.0F, var8.method2135((byte) -84, (float) (var9 - arg3)));
        this.field6587.method2227(class41.field482, (byte) -127);
        this.field6587.method2202(true);
        this.field6587.method2234(-90);
        this.field6587.method2264(9, class262.field3553, 0);
        this.field6587.method2199(class334.field4505, 9797, class334.field4505);
        this.field6587.method2241(null, (byte) 44);
        this.field6587.method2201((byte) -76, 0);
        this.field6587.method2234(-111);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class618 arg7, int arg8, int arg9) {
        field6605++;
        class274 var11 = this.field6587.method2224((byte) 99);
        class274 var12 = this.field6587.method2235(2);
        class525 var13 = (class525) arg7;
        class679 var14 = var13.field7121;
        this.field6612.method1259(this.field6599 || this.field6616 || (arg6 & 0x1) == 0 ? class216.field3051 : class544.field7382, (byte) 127);
        this.field6587.method2272(0);
        this.field6587.method2241(this.field6612, (byte) 44);
        this.field6587.method2230(1, -80);
        this.field6587.method2246(1, 26770);
        if (this.field6608) {
            float var15 = (float) this.field6588 / (float) this.method1660();
            float var16 = (float) this.field6615 / (float) this.method1661();
            var11.method1714((arg3 - arg1) * var15, (arg4 - arg0) * var16, (arg2 - arg0) * var15, 0.0F, 0.0F, 0.0F, 0.0F, (byte) -68, 1.0F, (arg5 - arg1) * var16);
            var11.method1716(((float) this.field6598 + arg1) * var16, (byte) -7, 0.0F, ((float) this.field6592 + arg0) * var15);
        } else {
            var11.method1714(arg3 - arg1, -arg0 + arg4, arg2 - arg0, 0.0F, 0.0F, 0.0F, 0.0F, (byte) -68, 1.0F, arg5 - arg1);
            var11.method1716(arg1, (byte) -7, 0.0F, arg0);
        }
        var12.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 127, (float) this.field6615), 1.0F, 6);
        this.field6587.method2227(class41.field482, (byte) -122);
        this.field6587.method2201((byte) 30, 1);
        this.field6587.method2241(var14, (byte) 44);
        this.field6587.method2199(class276.field3814, 9797, class334.field4505);
        this.field6587.method2264(9, class78.field1179, 0);
        class274 var17 = this.field6587.method2235(2);
        var17.method675(var11);
        var17.method687(-arg8, -arg9, 0);
        var17.method1704(1.0F, var14.method2135((byte) -84, 1.0F), var14.method2138((byte) 106, 1.0F), 109);
        this.field6587.method2227(class41.field482, (byte) -126);
        this.field6587.method2219(0);
        this.field6587.method2202(true);
        this.field6587.method2234(-110);
        this.field6587.method2264(9, class262.field3553, 0);
        this.field6587.method2199(class334.field4505, 9797, class334.field4505);
        this.field6587.method2241(null, (byte) 44);
        this.field6587.method2201((byte) 121, 0);
        this.field6587.method2234(-125);
    }

    @OriginalMember(owner = "client!fo", name = "da", descriptor = "(IIIIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6613++;
        int[] var7 = this.field6587.method148(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class647.method3617(var7[var8], -16777216);
            }
            this.method2697(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
    public static final boolean method2698(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            field6590 = false;
        }
        field6614++;
        return class315.method1909(arg0, arg1, (byte) -36) & class493.method2786(arg0, arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "(IIII)V")
    public final void method1663(int arg0, int arg1, int arg2, int arg3) {
        this.field6602 = arg2;
        this.field6596 = arg3;
        field6585++;
        this.field6592 = arg0;
        this.field6598 = arg1;
        this.field6608 = this.field6592 != 0 || this.field6598 != 0 || this.field6602 != 0 || this.field6596 != 0;
    }

    @OriginalMember(owner = "client!fo", name = "ca", descriptor = "()I")
    public final int method1661() {
        field6603++;
        return this.field6615 + this.field6598 + this.field6596;
    }

    @OriginalMember(owner = "client!fo", name = "YA", descriptor = "(IIIIIIII)V")
    public final void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6594++;
        class274 var9 = this.field6587.method2224((byte) 99);
        class274 var10 = this.field6587.method2235(2);
        this.field6612.method1259(this.field6599 || this.field6616 || (arg7 & 0x1) == 0 ? class216.field3051 : class544.field7382, (byte) 107);
        this.field6587.method2272(0);
        this.field6587.method2241(this.field6612, (byte) 44);
        this.field6587.method2230(arg6, -117);
        this.field6587.method2246(arg4, 26770);
        this.field6587.method2264(9, class452.field6221, 1);
        this.field6587.method2223(1, class452.field6221, (byte) -106);
        this.field6587.method2233(false, arg5);
        var10.method1703(this.field6612.method2135((byte) -84, (float) this.field6588), this.field6612.method2138((byte) 118, (float) this.field6615), 1.0F, 6);
        if (this.field6608) {
            arg2 = this.field6588 * arg2 / this.method1660();
            arg3 = this.field6615 * arg3 / this.method1661();
            arg0 += this.field6592 * arg2 / this.field6588;
            arg1 += this.field6598 * arg3 / this.field6615;
        }
        var9.method1703((float) arg2, (float) arg3, 0.0F, 6);
        var9.method687(arg0, arg1, 0);
        this.field6587.method2227(class41.field482, (byte) -105);
        this.field6587.method2219(0);
        this.field6587.method2202(true);
        this.field6587.method2234(-123);
        this.field6587.method2264(9, class78.field1179, 1);
        this.field6587.method2223(1, class78.field1179, (byte) -32);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lnv;IIZ)V")
    public class479(class382 arg0, int arg1, int arg2, boolean arg3) {
        this.field6587 = arg0;
        this.field6588 = arg1;
        this.field6615 = arg2;
        this.field6612 = arg0.method1025((byte) 59, arg3 ? class129.field1851 : class46.field554, arg2, class309.field4271, arg1);
        this.field6612.method2137(true, 111, true);
        this.field6599 = this.field6612.method2139(-122) != arg1;
        this.field6616 = arg2 != this.field6612.method2141(4845);
        this.field6586 = !this.field6599 && this.field6612.method2140(17615);
        this.field6601 = !this.field6616 && this.field6612.method2140(17615);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lnv;II[III)V")
    public class479(class382 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field6588 = arg1;
        this.field6587 = arg0;
        this.field6615 = arg2;
        this.field6612 = arg0.method1063(false, arg3, arg1, arg5, arg4, arg2, 1);
        this.field6612.method2137(true, 43, true);
        this.field6599 = arg1 != this.field6612.method2139(13);
        this.field6616 = arg2 != this.field6612.method2141(4845);
        this.field6586 = !this.field6599 && this.field6612.method2140(17615);
        this.field6601 = !this.field6616 && this.field6612.method2140(17615);
    }
}
