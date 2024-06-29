import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class14 extends class251 {

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "Z")
    public static boolean field80 = false;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "Z")
    public static boolean field78 = false;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIIIZBII)V")
    public static final void method53(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, int arg7) {
        int var8 = 51 / ((51 - arg5) / 60);
        if ((arg4 ? class688.field9602.field8535.method1981((byte) -98) : class688.field9602.field8548.method1981((byte) -98)) != 0 && arg2 != 0 && ~class70.field770 > -51 && arg1 != -1) {
            class7.field40[class70.field770++] = new class22((byte) (arg4 ? 3 : 2), arg1, arg2, arg3, arg6, arg0, arg7, (class230) null);
        }
        ++field79;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IF)V")
    public final void method54(int arg0, float arg1) {
        super.field3737 = arg1;
        ++field81;
        int var3 = 6 / ((19 - arg0) / 55);
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(IIII)V")
    public final void method55(int arg0, int arg1, int arg2, int arg3) {
        super.field3730 = arg2;
        super.field3729 = arg3;
        ++field82;
        super.field3735 = arg0;
        if (arg1 != 26119132) {
            this.method54(-106, -0.0400723F);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILib;ILgs;I)V")
    public static final void method56(int arg0, class723 arg1, int arg2, class432 arg3, int arg4) {
        ++field84;
        byte var5 = -1;
        if ((32768 & arg2) != 0) {
            var5 = arg3.method2989(arg0 ^ -75);
        }
        if (~(2 & arg2) != -1) {
            class305.field4419[arg4] = arg3.method2980(false);
        }
        if ((arg2 & 16) != 0) {
            int var6 = arg3.method3004((byte) -106);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg3.method3032((byte) -103);
            int var8 = arg3.method3013(76);
            int var9 = var8 & 7;
            int var10 = 15 & var8 >> 3;
            if (~var10 == -16) {
                var10 = -1;
            }
            arg1.method3750(var6, var9, (byte) -46, 0, var7, var10);
        }
        if ((arg2 & 131072) != 0) {
            arg1.field9996 = arg3.method3036((byte) -57) == 1;
        }
        if (~(arg2 & 8) != -1) {
            arg1.field10013 = arg3.method3042((byte) -100);
            if (~arg1.field9215 == -1) {
                arg1.method3745(0, arg1.field10013);
                arg1.field10013 = -1;
            }
        }
        if (~(arg2 & 16384) != -1) {
            int var11 = arg3.method2982((byte) -101);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; var11 > var15; ++var15) {
                int var16 = arg3.method3004((byte) -128);
                if (~var16 == -65536) {
                    var16 = -1;
                }
                var12[var15] = var16;
                var13[var15] = arg3.method3036((byte) -57);
                var14[var15] = arg3.method3042((byte) -100);
            }
            class764.method4208(var12, arg1, var14, var13, false);
        }
        if ((arg2 & 8192) != 0) {
            arg1.field9204 = arg3.method2993((byte) -67);
            if (arg1.field9204.charAt(0) != '~') {
                if (class724.field10031 == arg1) {
                    class727.method4042(arg1.method4025(-51, false), arg1.method4030(true, (byte) 10), (byte) 69, arg1.field9973, 2, 0, arg1.field9204);
                }
            } else {
                arg1.field9204 = arg1.field9204.substring(1);
                class727.method4042(arg1.method4025(-78, false), arg1.method4030(true, (byte) 10), (byte) -108, arg1.field9973, 2, 0, arg1.field9204);
            }
            arg1.field9180 = 0;
            arg1.field9192 = 150;
            arg1.field9125 = 0;
        }
        if ((524288 & arg2) != 0) {
            int var17 = arg3.method3002(-1);
            if (~var17 == -65536) {
                var17 = -1;
            }
            int var18 = arg3.method3008(arg0 + 64);
            int var19 = arg3.method3036((byte) -57);
            int var20 = var19 & 7;
            int var21 = (var19 & 125) >> 3;
            if (~var21 == -16) {
                var21 = -1;
            }
            arg1.method3750(var17, var20, (byte) -7, 2, var18, var21);
        }
        if (~(arg2 & 4096) != -1) {
            arg1.field10008 = arg3.method3013(51) == 1;
        }
        if ((arg2 & 262144) != 0) {
            int var22 = arg3.method3013(-113);
            int[] var23 = new int[var22];
            int[] var24 = new int[var22];
            for (int var25 = 0; var22 > var25; ++var25) {
                int var26 = arg3.method3042((byte) -100);
                if ((var26 & 49152) == 49152) {
                    int var27 = arg3.method3006(false);
                    var23[var25] = class613.method3544(var26 << 16, var27);
                } else {
                    var23[var25] = var26;
                }
                var24[var25] = arg3.method3006(false);
            }
            arg1.method3741(var24, 20724, var23);
        }
        if ((1 & arg2) != arg0) {
            int[] var28 = new int[4];
            for (int var29 = 0; ~var29 > -5; ++var29) {
                var28[var29] = arg3.method3002(-1);
                if (~var28[var29] == -65536) {
                    var28[var29] = -1;
                }
            }
            int var30 = arg3.method2982((byte) -101);
            class764.method4220(var30, 10, arg1, var28);
        }
        if (~(512 & arg2) != -1) {
            int var31 = arg3.method3004((byte) -104);
            int var32 = arg3.method2975(-123);
            if (~var31 == -65536) {
                var31 = -1;
            }
            int var33 = arg3.method3036((byte) -57);
            int var34 = 7 & var33;
            int var35 = (var33 & 125) >> 3;
            if (~var35 == -16) {
                var35 = -1;
            }
            arg1.method3750(var31, var34, (byte) 122, 1, var32, var35);
        }
        if (~(4 & arg2) != -1) {
            int var36 = arg3.method3036((byte) -57);
            if (var36 > 0) {
                for (int var37 = 0; var36 > var37; ++var37) {
                    int var38 = -1;
                    int var39 = -1;
                    int var40 = -1;
                    int var41 = arg3.method3043(arg0 + -31927);
                    if (var41 == 32767) {
                        var41 = arg3.method3043(-31927);
                        var39 = arg3.method3043(arg0 + -31927);
                        var38 = arg3.method3043(arg0 + -31927);
                        var40 = arg3.method3043(-31927);
                    } else if (~var41 == -32767) {
                        var41 = -1;
                    } else {
                        var39 = arg3.method3043(-31927);
                    }
                    int var42 = arg3.method3043(-31927);
                    int var43 = arg3.method3036((byte) -57);
                    arg1.method3739(var42, var39, class533.field7336, var38, var43, var40, -1, var41);
                }
            }
        }
        if ((1024 & arg2) != 0) {
            arg1.field9174 = arg3.method3030(-25984);
            arg1.field9149 = arg3.method3023(arg0 ^ -22454);
            arg1.field9130 = arg3.method2989(arg0 + -92);
            arg1.field9145 = arg3.method2989(-101);
            arg1.field9183 = arg3.method3002(-1) - -class533.field7336;
            arg1.field9206 = arg3.method3006(false) + class533.field7336;
            arg1.field9140 = arg3.method3013(-105);
            arg1.field9216 = 0;
            if (arg1.field9963) {
                arg1.field9174 += arg1.field9978;
                arg1.field9130 += arg1.field9978;
                arg1.field9215 = 0;
                arg1.field9145 += arg1.field9977;
                arg1.field9149 += arg1.field9977;
            } else {
                arg1.field9215 = 1;
                arg1.field9130 += arg1.field9219[0];
                arg1.field9145 += arg1.field9214[0];
                arg1.field9174 += arg1.field9219[0];
                arg1.field9149 += arg1.field9214[0];
            }
        }
        if ((128 & arg2) != 0) {
            int var44 = arg3.method3004((byte) -100);
            if (~var44 == -65536) {
                var44 = -1;
            }
            arg1.field9137 = var44;
        }
        if ((arg2 & 256) != 0) {
            int var45 = arg3.method3004((byte) -122);
            arg1.field9163 = arg3.method2976(109);
            arg1.field9170 = arg3.method3013(-109);
            arg1.field9197 = var45 & 32767;
            arg1.field9201 = (32768 & var45) != 0;
            arg1.field9194 = class533.field7336 + arg1.field9163 + arg1.field9197;
        }
        if (~(32 & arg2) != -1) {
            int var46 = arg3.method2976(124);
            byte[] var47 = new byte[var46];
            class511 var48 = new class511(var47);
            arg3.method2992(var47, false, 0, var46);
            class546.field7594[arg4] = var48;
            arg1.method4026(-90, var48);
        }
        if ((65536 & arg2) != 0) {
            arg1.field9153 = arg3.method2980(false);
            arg1.field9119 = arg3.method2980(false);
            arg1.field9200 = arg3.method2980(false);
            arg1.field9182 = (byte) arg3.method3036((byte) -57);
            arg1.field9124 = class533.field7336 - -arg3.method3006(false);
            arg1.field9205 = class533.field7336 - -arg3.method3002(-1);
        }
        if (arg1.field9963) {
            if (var5 == 127) {
                arg1.method4019((byte) 36, arg1.field9978, arg1.field9977);
            } else {
                byte var49;
                if (~var5 != 0) {
                    var49 = var5;
                } else {
                    var49 = class305.field4419[arg4];
                }
                class439.method2633(var49, arg1, 0);
                arg1.method4027(arg1.field9977, arg1.field9978, 0, var49);
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIIF)V")
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;IIIIILha;I)V")
    public static final void method57(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class473 arg6, int arg7) {
        if (class382.field5481 == null || class595.field8361 == null) {
            if (class149.field1968.method1860(class722.field9955, (byte) 124) && class149.field1968.method1860(class702.field9787, (byte) 124)) {
                class382.field5481 = arg6.method192(class279.method1821(class149.field1968, class722.field9955, 0), true);
                class279 var8 = class279.method1821(class149.field1968, class702.field9787, 0);
                class595.field8361 = arg6.method192(var8, true);
                var8.method1814();
                class436.field6056 = arg6.method192(var8, true);
            } else {
                arg6.method233(arg2, arg5, arg4, arg3, class456.field6379 | -class726.field10050 + 255 << 24, 1);
            }
        }
        ++field83;
        if (class382.field5481 != null && class595.field8361 != null) {
            int var9 = (-(class595.field8361.method737() * 2) + arg4) / class382.field5481.method737();
            for (int var10 = 0; ~var10 > ~var9; ++var10) {
                class382.field5481.method2025(arg2 + class595.field8361.method737() + var10 * class382.field5481.method737(), arg5);
            }
            class595.field8361.method2025(arg2, arg5);
            class436.field6056.method2025(-class436.field6056.method737() + arg2 + arg4, arg5);
        }
        class386.field5515.method2653(arg5 + 14, arg1 + -18745, -16777216 | class773.field10643, -1, arg2 + 3, arg0);
        arg6.method233(arg2, arg3 + arg5, arg4, -arg3 + arg7, -class726.field10050 + 255 << 24 | class456.field6379, 1);
        if (arg1 != 18837) {
            method57((String) null, 34, -54, -4, 47, -59, (class473) null, -97);
        }
    }
}
