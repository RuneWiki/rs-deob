import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class728 extends class298 {

    @OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
    private int field10111 = 0;

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
    private int field10114 = 0;

    @OriginalMember(owner = "client!lga", name = "u", descriptor = "Z")
    private boolean field10124 = false;

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
    private int field10119 = 0;

    @OriginalMember(owner = "client!lga", name = "J", descriptor = "I")
    private int field10139 = 0;

    @OriginalMember(owner = "client!lga", name = "F", descriptor = "I")
    private int field10135;

    @OriginalMember(owner = "client!lga", name = "E", descriptor = "I")
    private int field10134;

    @OriginalMember(owner = "client!lga", name = "A", descriptor = "Lrl;")
    private class232 field10130;

    @OriginalMember(owner = "client!lga", name = "i", descriptor = "Ldg;")
    private class19 field10112;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "Z")
    private boolean field10104;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "Z")
    private boolean field10115;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "Z")
    private boolean field10108;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "Z")
    private boolean field10120;

    @OriginalMember(owner = "client!lga", name = "g", descriptor = "I")
    public static int field10110 = 0;

    @OriginalMember(owner = "client!lga", name = "B", descriptor = "I")
    public static int field10131 = 0;

    @OriginalMember(owner = "client!lga", name = "D", descriptor = "I")
    public static int field10133 = -1;

    @OriginalMember(owner = "client!lga", name = "t", descriptor = "Z")
    public static boolean field10123 = false;

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!lga", name = "f", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!lga", name = "j", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!lga", name = "s", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!lga", name = "v", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!lga", name = "w", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!lga", name = "x", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!lga", name = "y", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!lga", name = "z", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!lga", name = "C", descriptor = "I")
    public static int field10132;

    @OriginalMember(owner = "client!lga", name = "G", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!lga", name = "H", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!lga", name = "I", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method4061(byte arg0, int arg1) {
        field10127++;
        if (arg0 >= -32) {
            field10123 = false;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIII)V", line = 15)
    public final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10136++;
        class474 var6 = this.field10130.method1428((byte) 86);
        class474 var7 = this.field10130.method1410((byte) -127);
        int var8 = this.field10139 + arg0;
        int var9 = this.field10111 + arg1;
        this.field10112.method1121(class352.field5092, (byte) 66);
        this.field10130.method1546((byte) -104);
        this.field10130.method1458(399403340, this.field10112);
        this.field10130.method1422(11665, arg4);
        this.field10130.method1503(arg2, (byte) 109);
        this.field10130.method1408(1, 0, class520.field7247);
        this.field10130.method1528(class520.field7247, false, 1);
        this.field10130.method1414(arg3, (byte) -100);
        var6.method2886(0.0F, (float) this.field10135, (float) this.field10134, (byte) -65);
        var6.method882(var8, var9, 0);
        var7.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
        this.field10130.method1460(class393.field5647, -127);
        this.field10130.method1443(0);
        this.field10130.method1440((byte) 38);
        this.field10130.method1459(0);
        this.field10130.method1408(1, 0, class231.field3142);
        this.field10130.method1528(class231.field3142, false, 1);
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "()I", line = 45)
    public final int method1961() {
        field10122++;
        return this.field10135 + this.field10119 + this.field10111;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IILaa;II)V", line = 53)
    public final void method1010(int arg0, int arg1, class573 arg2, int arg3, int arg4) {
        field10121++;
        class297 var6 = (class297) arg2;
        class19 var7 = var6.field4229;
        int var8 = this.field10111 + arg1;
        int var9 = this.field10139 + arg0;
        this.field10112.method1121(class352.field5092, (byte) 66);
        this.field10130.method1546((byte) -104);
        this.field10130.method1458(399403340, this.field10112);
        this.field10130.method1422(11665, 1);
        this.field10130.method1503(1, (byte) 104);
        class474 var10 = this.field10130.method1428((byte) 118);
        var10.method2886(0.0F, (float) this.field10135, (float) this.field10134, (byte) -65);
        var10.method882(var9, var8, 0);
        this.field10130.method1443(0);
        class474 var11 = this.field10130.method1410((byte) -125);
        var11.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
        this.field10130.method1460(class393.field5647, -127);
        this.field10130.method1431(0, 1);
        this.field10130.method1458(399403340, var7);
        this.field10130.method1388(class179.field2467, (byte) 52, class87.field1239);
        this.field10130.method1408(0, 0, class231.field3142);
        class474 var12 = this.field10130.method1410((byte) -127);
        var12.method2886(1.0F, var7.method97(-28409, (float) this.field10135), var7.method96((float) this.field10134, -21696), (byte) -65);
        var12.method2875(0.0F, var7.method96((float) (var9 - arg3), -21696), var7.method97(-28409, (float) (var8 - arg4)), -3758);
        this.field10130.method1460(class393.field5647, -126);
        this.field10130.method1440((byte) -127);
        this.field10130.method1459(0);
        this.field10130.method1408(0, 0, class15.field140);
        this.field10130.method1388(class179.field2467, (byte) 52, class179.field2467);
        this.field10130.method1458(399403340, null);
        this.field10130.method1431(0, 0);
        this.field10130.method1459(0);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIII)V", line = 97)
    public final void method1953(int arg0, int arg1, int arg2, int arg3) {
        this.field10111 = arg1;
        field10132++;
        this.field10119 = arg3;
        this.field10139 = arg0;
        this.field10114 = arg2;
        this.field10124 = this.field10139 != 0 || this.field10111 != 0 || this.field10114 != 0 || this.field10119 != 0;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 109)
    public final void method1962(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class573 arg7, int arg8, int arg9) {
        field10128++;
        class474 var11 = this.field10130.method1428((byte) 59);
        class474 var12 = this.field10130.method1410((byte) -120);
        class297 var13 = (class297) arg7;
        class19 var14 = var13.field4229;
        this.field10112.method1121(this.field10104 || this.field10115 || (arg6 & 0x1) == 0 ? class352.field5092 : class432.field6028, (byte) 66);
        this.field10130.method1546((byte) -104);
        this.field10130.method1458(399403340, this.field10112);
        this.field10130.method1422(11665, 1);
        this.field10130.method1503(1, (byte) 109);
        if (this.field10124) {
            float var15 = (float) this.field10134 / (float) this.method1963();
            float var16 = (float) this.field10135 / (float) this.method1961();
            var11.method2884(6741, 0.0F, (arg5 - arg1) * var16, 0.0F, 1.0F, 0.0F, (arg2 - arg0) * var15, (arg3 - arg1) * var15, 0.0F, (arg4 - arg0) * var16);
            var11.method2875(0.0F, ((float) this.field10139 + arg0) * var15, ((float) this.field10111 + arg1) * var16, -3758);
        } else {
            var11.method2884(6741, 0.0F, arg5 - arg1, 0.0F, 1.0F, 0.0F, arg2 - arg0, arg3 - arg1, 0.0F, arg4 - arg0);
            var11.method2875(0.0F, arg0, arg1, -3758);
        }
        var12.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
        this.field10130.method1460(class393.field5647, -124);
        this.field10130.method1431(0, 1);
        this.field10130.method1458(399403340, var14);
        this.field10130.method1388(class179.field2467, (byte) 52, class87.field1239);
        this.field10130.method1408(0, 0, class231.field3142);
        class474 var17 = this.field10130.method1410((byte) -126);
        var17.method900(var11);
        var17.method882(-arg8, -arg9, 0);
        var17.method2871((byte) -98, 1.0F, var14.method96(1.0F, -21696), var14.method97(-28409, 1.0F));
        this.field10130.method1460(class393.field5647, -127);
        this.field10130.method1443(0);
        this.field10130.method1440((byte) 101);
        this.field10130.method1459(0);
        this.field10130.method1408(0, 0, class15.field140);
        this.field10130.method1388(class179.field2467, (byte) 52, class179.field2467);
        this.field10130.method1458(399403340, null);
        this.field10130.method1431(0, 0);
        this.field10130.method1459(0);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(FFFFFFIIII)V", line = 170)
    public final void method1966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field10129++;
        class474 var11 = this.field10130.method1428((byte) 103);
        class474 var12 = this.field10130.method1410((byte) -127);
        this.field10112.method1121(this.field10104 || this.field10115 || (arg9 & 0x1) == 0 ? class352.field5092 : class432.field6028, (byte) 66);
        this.field10130.method1546((byte) -104);
        this.field10130.method1458(399403340, this.field10112);
        this.field10130.method1422(11665, arg8);
        this.field10130.method1503(arg6, (byte) 115);
        this.field10130.method1408(1, 0, class520.field7247);
        this.field10130.method1528(class520.field7247, false, 1);
        this.field10130.method1414(arg7, (byte) -100);
        if (this.field10124) {
            float var13 = (float) this.method1963();
            float var14 = (float) this.method1961();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field10111 * var17;
            float var20 = (float) this.field10111 * var18;
            float var21 = (float) this.field10139 * var15;
            float var22 = (float) this.field10139 * var16;
            float var23 = (float) this.field10114 * -var15;
            float var24 = (float) this.field10114 * -var16;
            float var25 = (float) this.field10119 * -var17;
            arg3 = arg3 + var24 + var20;
            arg1 = arg1 + var22 + var20;
            float var26 = (float) this.field10119 * -var18;
            arg2 = arg2 + var23 + var19;
            arg0 = arg0 + var21 + var19;
            arg4 = arg4 + var21 + var25;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2884(6741, 0.0F, arg5 - arg1, 0.0F, 1.0F, 0.0F, arg2 - arg0, -arg1 + arg3, 0.0F, arg4 - arg0);
        var11.method2875(0.0F, arg0, arg1, -3758);
        var12.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
        this.field10130.method1460(class393.field5647, -126);
        this.field10130.method1443(0);
        this.field10130.method1440((byte) -125);
        this.field10130.method1459(0);
        this.field10130.method1408(1, 0, class231.field3142);
        this.field10130.method1528(class231.field3142, false, 1);
    }

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "()I", line = 239)
    public final int method1963() {
        field10109++;
        return this.field10134 + this.field10114 + this.field10139;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lni;IB)V", line = 253)
    public static final void method4062(class515 arg0, int arg1, byte arg2) {
        if (arg0.field7105 != null) {
            int var3 = arg0.field7105[arg1 + 1];
            if (arg0.field7132 != var3) {
                arg0.field7132 = var3;
                arg0.field7164 = 1;
                arg0.field7123 = 0;
                arg0.field7131 = 0;
                arg0.field7199 = arg0.field7203;
                arg0.field7127 = 0;
                if (arg0.field7132 != -1) {
                    class123.method765(arg0.field7127, arg0, class607.field8188.method3001(-12575, arg0.field7132), false);
                }
            }
        }
        if (arg2 <= 7) {
            method4062(null, 97, (byte) 73);
        }
        field10125++;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIIII)V", line = 285)
    public final void method1965(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10113++;
        class474 var8 = this.field10130.method1428((byte) 118);
        class474 var9 = this.field10130.method1410((byte) -126);
        this.field10112.method1121(class352.field5092, (byte) 66);
        this.field10130.method1546((byte) -104);
        this.field10130.method1458(399403340, this.field10112);
        this.field10130.method1422(11665, arg6);
        this.field10130.method1503(arg4, (byte) 114);
        this.field10130.method1408(1, 0, class520.field7247);
        this.field10130.method1528(class520.field7247, false, 1);
        this.field10130.method1414(arg5, (byte) -100);
        boolean var10 = this.field10120 && this.field10111 == 0 && this.field10119 == 0;
        boolean var11 = this.field10108 && this.field10139 == 0 && this.field10114 == 0;
        if (var11 & var10) {
            var9.method2886(1.0F, this.field10112.method97(-28409, (float) arg3), this.field10112.method96((float) arg2, -21696), (byte) -65);
            var8.method2886(0.0F, (float) arg3, (float) arg2, (byte) -65);
            var8.method882(arg0, arg1, 0);
            this.field10130.method1460(class393.field5647, -124);
            this.field10130.method1443(0);
            this.field10130.method1440((byte) -125);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method1961();
            var9.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) arg2, -21696), (byte) -65);
            this.field10130.method1460(class393.field5647, -124);
            int var14 = this.field10111 + arg1;
            int var15 = this.field10135 + var14;
            while (var15 <= var12) {
                var8.method2886(0.0F, (float) this.field10135, (float) arg2, (byte) -65);
                var8.method882(arg0, var14, 0);
                this.field10130.method1443(0);
                var15 += var13;
                var14 += var13;
                this.field10130.method1440((byte) 61);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method2886(1.0F, this.field10112.method97(-28409, (float) var16), this.field10112.method96((float) arg2, -21696), (byte) -65);
                this.field10130.method1460(class393.field5647, -125);
                var8.method2886(0.0F, (float) var16, (float) arg2, (byte) -65);
                var8.method882(arg0, var14, 0);
                this.field10130.method1443(0);
                this.field10130.method1440((byte) -122);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method1963();
            var9.method2886(1.0F, this.field10112.method97(-28409, (float) arg3), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
            this.field10130.method1460(class393.field5647, -127);
            int var32 = arg0 + this.field10139;
            for (int var33 = this.field10134 + var32; var33 <= var30; var33 += var31) {
                var8.method2886(0.0F, (float) arg3, (float) this.field10134, (byte) -65);
                var8.method882(var32, arg1, 0);
                this.field10130.method1443(0);
                var32 += var31;
                this.field10130.method1440((byte) -108);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2886(1.0F, this.field10112.method97(-28409, (float) arg3), this.field10112.method96((float) var34, -21696), (byte) -65);
                this.field10130.method1460(class393.field5647, -127);
                var8.method2886(0.0F, (float) arg3, (float) var34, (byte) -65);
                var8.method882(var32, arg1, 0);
                this.field10130.method1443(0);
                this.field10130.method1440((byte) -125);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method1963();
            int var20 = this.method1961();
            int var21 = this.field10111 + arg1;
            for (int var22 = var21 + this.field10135; var22 <= var17; var22 += var20) {
                var9.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
                this.field10130.method1460(class393.field5647, -124);
                int var27 = this.field10139 + arg0;
                for (int var28 = this.field10134 + var27; var28 <= var18; var28 += var19) {
                    var8.method2886(0.0F, (float) this.field10135, (float) this.field10134, (byte) -65);
                    var8.method882(var27, var21, 0);
                    this.field10130.method1443(0);
                    var27 += var19;
                    this.field10130.method1440((byte) -111);
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) var29, -21696), (byte) -65);
                    this.field10130.method1460(class393.field5647, -124);
                    var8.method2886(0.0F, (float) this.field10135, (float) var29, (byte) -65);
                    var8.method882(var27, var21, 0);
                    this.field10130.method1443(0);
                    this.field10130.method1440((byte) -109);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2886(1.0F, this.field10112.method97(-28409, (float) var23), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
                this.field10130.method1460(class393.field5647, -127);
                int var24 = this.field10139 + arg0;
                for (int var25 = this.field10134 + var24; var25 <= var18; var25 += var19) {
                    var8.method2886(0.0F, (float) var23, (float) this.field10134, (byte) -65);
                    var8.method882(var24, var21, 0);
                    this.field10130.method1443(0);
                    this.field10130.method1440((byte) -114);
                    var24 += var19;
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method2886(1.0F, this.field10112.method97(-28409, (float) var23), this.field10112.method96((float) var26, -21696), (byte) -65);
                    this.field10130.method1460(class393.field5647, -128);
                    var8.method2886(0.0F, (float) var23, (float) var26, (byte) -65);
                    var8.method882(var24, var21, 0);
                    this.field10130.method1443(0);
                    this.field10130.method1440((byte) -118);
                }
            }
        }
        this.field10130.method1459(0);
        this.field10130.method1408(1, 0, class231.field3142);
        this.field10130.method1528(class231.field3142, false, 1);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "()I", line = 494)
    public final int method1952() {
        field10117++;
        return this.field10135;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIII[III)V", line = 503)
    private final void method4063(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field10126++;
        this.field10112.method101(arg6, arg3, arg4, -28425, arg1, arg5, arg2, arg0);
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(BI)V", line = 513)
    public static final void method4064(byte arg0, int arg1) {
        field10138++;
        class505.field7031 = -1;
        class293.field4201 = arg1;
        class224.field3017 = 3;
        if (arg0 != 110) {
            field10131 = 75;
        }
        class659.field8770 = 100;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIIIII)V", line = 531)
    public final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10106++;
        class474 var9 = this.field10130.method1428((byte) 111);
        class474 var10 = this.field10130.method1410((byte) -117);
        this.field10112.method1121(this.field10104 || this.field10115 || (arg7 & 0x1) == 0 ? class352.field5092 : class432.field6028, (byte) 66);
        this.field10130.method1546((byte) -104);
        this.field10130.method1458(399403340, this.field10112);
        this.field10130.method1422(11665, arg6);
        this.field10130.method1503(arg4, (byte) 114);
        this.field10130.method1408(1, 0, class520.field7247);
        this.field10130.method1528(class520.field7247, false, 1);
        this.field10130.method1414(arg5, (byte) -100);
        var10.method2886(1.0F, this.field10112.method97(-28409, (float) this.field10135), this.field10112.method96((float) this.field10134, -21696), (byte) -65);
        if (this.field10124) {
            arg2 = this.field10134 * arg2 / this.method1963();
            arg3 = this.field10135 * arg3 / this.method1961();
            arg0 += this.field10139 * arg2 / this.field10134;
            arg1 += this.field10111 * arg3 / this.field10135;
        }
        var9.method2886(0.0F, (float) arg3, (float) arg2, (byte) -65);
        var9.method882(arg0, arg1, 0);
        this.field10130.method1460(class393.field5647, -128);
        this.field10130.method1443(0);
        this.field10130.method1440((byte) 117);
        this.field10130.method1459(0);
        this.field10130.method1408(1, 0, class231.field3142);
        this.field10130.method1528(class231.field3142, false, 1);
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lrl;IIZ)V", line = 858)
    public class728(class232 arg0, int arg1, int arg2, boolean arg3) {
        this.field10135 = arg2;
        this.field10134 = arg1;
        this.field10130 = arg0;
        this.field10112 = arg0.method304(arg1, arg2, class38.field472, arg3 ? class623.field8394 : class218.field2855, 2);
        this.field10112.method100(true, true, 99);
        this.field10104 = this.field10112.method95((byte) -128) != arg1;
        this.field10115 = arg2 != this.field10112.method94(16949);
        this.field10108 = !this.field10104 && this.field10112.method93(125);
        this.field10120 = !this.field10115 && this.field10112.method93(119);
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lrl;II[III)V", line = 873)
    public class728(class232 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field10130 = arg0;
        this.field10135 = arg2;
        this.field10134 = arg1;
        this.field10112 = arg0.method343(arg5, arg4, arg1, false, arg3, arg2, -1);
        this.field10112.method100(true, true, 70);
        this.field10104 = arg1 != this.field10112.method95((byte) -65);
        this.field10115 = arg2 != this.field10112.method94(16949);
        this.field10108 = !this.field10104 && this.field10112.method93(111);
        this.field10120 = !this.field10115 && this.field10112.method93(126);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIIIII)V", line = 574)
    public final void method1015(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10118++;
        int[] var7 = this.field10130.method268(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class678.method3817(var7[var8], -16777216);
            }
            this.method4063(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "()I", line = 596)
    public final int method1955() {
        field10105++;
        return this.field10134;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V", line = 609)
    public final void method1014(int arg0, int arg1, int arg2) {
        field10116++;
        int[] var4 = this.field10130.method268(arg0, arg1, this.field10134, this.field10135);
        int[] var5 = new int[this.field10135 * this.field10134];
        this.field10112.method98(0, this.field10135, 0, var5, 4549, this.field10134, 0);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field10135; var15++) {
                int var16 = this.field10134 * var15;
                for (int var17 = 0; var17 < this.field10134; var17++) {
                    var5[var16 + var17] = class678.method3817(class665.method3759(var4[var16 + var17] << 8, -16777078), class665.method3759(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 1) {
            for (int var6 = 0; var6 < this.field10135; var6++) {
                int var7 = this.field10134 * var6;
                for (int var8 = 0; var8 < this.field10134; var8++) {
                    var5[var7 + var8] = class678.method3817(class665.method3759(-16737796, var4[var7 + var8] << 16), class665.method3759(16777215, var5[var7 + var8]));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field10135; var9++) {
                int var10 = this.field10134 * var9;
                for (int var11 = 0; var11 < this.field10134; var11++) {
                    var5[var10 + var11] = class678.method3817(class665.method3759(var5[var10 + var11], 16777215), class665.method3759(-972937473, var4[var10 + var11]) << 24);
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field10135; var12++) {
                int var13 = this.field10134 * var12;
                for (int var14 = 0; var14 < this.field10134; var14++) {
                    var5[var13 + var14] = class678.method3817(class665.method3759(var5[var13 + var14], 16777215), var4[var13 + var14] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method4063(0, 0, this.field10134, this.field10135, var5, 0, this.field10134);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "([I)V", line = 725)
    public final void method1967(int[] arg0) {
        arg0[1] = this.field10111;
        arg0[2] = this.field10114;
        arg0[0] = this.field10139;
        arg0[3] = this.field10119;
        field10137++;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 736)
    public static final void method4065(String arg0, byte arg1) {
        field10107++;
        if (arg0 == null) {
            return;
        }
        if (!(class239.field3558 < 200 || class630.field8463) || class239.field3558 >= 200) {
            class75.method566(4, true, class155.field2129.method978(class120.field1576, (byte) -116));
            String var2 = class155.field2130.method978(class120.field1576, (byte) -122);
            if (var2 != null) {
                class75.method566(4, true, var2);
            }
            return;
        }
        String var3 = class673.method3805(1, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class239.field3558; var4++) {
            String var9 = class673.method3805(1, class193.field2627[var4]);
            if (var9 != null && var9.equals(var3)) {
                class75.method566(4, true, arg0 + class155.field2157.method978(class120.field1576, (byte) -127));
                return;
            }
            if (class342.field4854[var4] != null) {
                String var10 = class673.method3805(1, class342.field4854[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class75.method566(4, true, arg0 + class155.field2157.method978(class120.field1576, (byte) -122));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class97.field1370; var5++) {
            String var7 = class673.method3805(1, class438.field6108[var5]);
            if (var7 != null && var7.equals(var3)) {
                class75.method566(4, true, class155.field2162.method978(class120.field1576, (byte) -115) + arg0 + class155.field2163.method978(class120.field1576, (byte) -127));
                return;
            }
            if (class747.field10288[var5] != null) {
                String var8 = class673.method3805(1, class747.field10288[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class75.method566(4, true, class155.field2162.method978(class120.field1576, (byte) -107) + arg0 + class155.field2163.method978(class120.field1576, (byte) -108));
                    return;
                }
            }
        }
        if (class673.method3805(1, class388.field5601.field1313).equals(var3)) {
            class75.method566(4, true, class155.field2160.method978(class120.field1576, (byte) -118));
            return;
        }
        class234.field3476++;
        class583 var6 = class54.method400(class213.field2800, (byte) -30, class757.field10569);
        if (arg1 <= 19) {
            field10131 = -20;
        }
        var6.field7963.method444(class712.method4007(arg0, 4927), 128);
        var6.field7963.method510(arg0, (byte) 61);
        class463.method2838(var6, (byte) 125);
    }
}
