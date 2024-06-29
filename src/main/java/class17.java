import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class17 extends class738 {

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field162 = 0;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lqp;")
    public static class715 field163 = new class715(16);

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Llc;")
    public static class435 field168 = new class435(101, 0);

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 4)
    public static void method81(boolean arg0) {
        field168 = null;
        if (arg0) {
            method82(-106, 44, 88, (class304) null);
        }
        field163 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 22)
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field167 = arg0;
        this.field161 = arg2;
        this.field165 = arg3;
        this.field159 = arg7;
        this.field174 = arg4;
        this.field172 = arg6;
        this.field171 = arg5;
        this.field166 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILip;)V", line = 38)
    public static final void method82(int arg0, int arg1, int arg2, class304 arg3) {
        ++field173;
        if (arg3 != null && class303.field4137.field8734 != arg3) {
            int var4 = arg3.field4146;
            int var5 = 69 / ((arg0 - 41) / 42);
            int var6 = arg3.field4159;
            int var7 = arg3.field4152;
            int var8 = (int) arg3.field4156;
            if (var7 >= 2000) {
                var7 -= 2000;
            }
            long var9 = arg3.field4156;
            if (~var7 == -16) {
                class424.field6145 = arg1;
                ++class641.field9122;
                class568.field8210 = 0;
                class133.field1842 = 2;
                class479.field6850 = arg2;
                class88 var11 = class448.method2741((byte) 53, class704.field9919, class583.field8319);
                var11.field1260.method2862((int) (var9 >>> 32) & Integer.MAX_VALUE, -1166933656);
                var11.field1260.method2881(class253.field3661.method2780(82, 90) ? 1 : 0, (byte) 117);
                var11.field1260.method2863(var4 - -class41.field693, (byte) -125);
                var11.field1260.method2914(class71.field1085 + var6, (byte) 51);
                class523.method3183(var11, (byte) 31);
                class46.method448(var9, var6, var4, (byte) -38);
            }
            if (~var7 == -19) {
                if (~class598.field8507 < -1 && class253.field3661.method2780(82, 76) && class253.field3661.method2780(81, 80)) {
                    class619.method3592(class71.field1085 + var6, class108.field1536.field3920, class41.field693 + var4, -54);
                } else {
                    class424.field6145 = arg1;
                    class133.field1842 = 1;
                    class479.field6850 = arg2;
                    class568.field8210 = 0;
                    ++class311.field4218;
                    class88 var12 = class448.method2741((byte) 39, class733.field10280, class583.field8319);
                    var12.field1260.method2863(class41.field693 - -var4, (byte) 91);
                    var12.field1260.method2887(class71.field1085 + var6, (byte) -116);
                    class523.method3183(var12, (byte) 31);
                }
            }
            if (~var7 == -10) {
                class639 var13 = class536.field7796[var8];
                if (var13 != null) {
                    ++class504.field7331;
                    class479.field6850 = arg2;
                    class568.field8210 = 0;
                    class133.field1842 = 2;
                    class424.field6145 = arg1;
                    class88 var14 = class448.method2741((byte) 105, class496.field7142, class583.field8319);
                    var14.field1260.method2887(var8, (byte) -96);
                    var14.field1260.method2864(!class253.field3661.method2780(82, 74) ? 0 : 1, (byte) 99);
                    class523.method3183(var14, (byte) 31);
                    class541.method3255(var13.method2053(true), 0, -2, var13.method2053(true), var13.field4645[0], var13.field4646[0], 0, (byte) -49, true);
                }
            }
            if (var7 == 11) {
                class568.field8210 = 0;
                class424.field6145 = arg1;
                ++class389.field5609;
                class133.field1842 = 2;
                class479.field6850 = arg2;
                class88 var15 = class448.method2741((byte) 70, class162.field2320, class583.field8319);
                var15.field1260.method2887(class71.field1085 + var6, (byte) -105);
                var15.field1260.method2863(class41.field693 + var4, (byte) 118);
                var15.field1260.method2881(class253.field3661.method2780(82, 81) ? 1 : 0, (byte) 109);
                var15.field1260.method2914(var8, (byte) 44);
                class523.method3183(var15, (byte) 31);
                class739.method4126(var4, var6, -1037);
            }
            if (~var7 == -48) {
                class133.field1842 = 1;
                ++class408.field5813;
                class424.field6145 = arg1;
                class568.field8210 = 0;
                class479.field6850 = arg2;
                class88 var16 = class448.method2741((byte) 106, class545.field7925, class583.field8319);
                var16.field1260.method2887(class191.field2688, (byte) -116);
                var16.field1260.method2887(class71.field1085 - -var6, (byte) -39);
                var16.field1260.method2863(class41.field693 - -var4, (byte) -128);
                var16.field1260.method2927((byte) -54, class231.field3475);
                var16.field1260.method2887(class250.field3640, (byte) -86);
                class523.method3183(var16, (byte) 31);
                class541.method3255(1, 0, -4, 1, var6, var4, 0, (byte) -49, true);
            }
            if (~var7 == -22) {
                class639 var17 = class536.field7796[var8];
                if (var17 != null) {
                    class568.field8210 = 0;
                    class133.field1842 = 2;
                    class479.field6850 = arg2;
                    class424.field6145 = arg1;
                    ++class538.field7817;
                    class88 var18 = class448.method2741((byte) 107, class589.field8384, class583.field8319);
                    var18.field1260.method2901(!class253.field3661.method2780(82, 93) ? 0 : 1, 128);
                    var18.field1260.method2914(var8, (byte) 47);
                    class523.method3183(var18, (byte) 31);
                    class541.method3255(var17.method2053(true), 0, -2, var17.method2053(true), var17.field4645[0], var17.field4646[0], 0, (byte) -49, true);
                }
            }
            if (~var7 == -18) {
                class639 var19 = class536.field7796[var8];
                if (var19 != null) {
                    class424.field6145 = arg1;
                    class568.field8210 = 0;
                    class479.field6850 = arg2;
                    ++class296.field4057;
                    class133.field1842 = 2;
                    class88 var20 = class448.method2741((byte) 32, class348.field5153, class583.field8319);
                    var20.field1260.method2877(!class253.field3661.method2780(82, 97) ? 0 : 1, 128);
                    var20.field1260.method2887(var8, (byte) -45);
                    class523.method3183(var20, (byte) 31);
                    class541.method3255(var19.method2053(true), 0, -2, var19.method2053(true), var19.field4645[0], var19.field4646[0], 0, (byte) -49, true);
                }
            }
            if (var7 == 3) {
                class639 var21 = class536.field7796[var8];
                if (var21 != null) {
                    ++class694.field9822;
                    class479.field6850 = arg2;
                    class133.field1842 = 2;
                    class568.field8210 = 0;
                    class424.field6145 = arg1;
                    class88 var22 = class448.method2741((byte) 64, class96.field1385, class583.field8319);
                    var22.field1260.method2887(var8, (byte) -94);
                    var22.field1260.method2877(!class253.field3661.method2780(82, 77) ? 0 : 1, 128);
                    class523.method3183(var22, (byte) 31);
                    class541.method3255(var21.method2053(true), 0, -2, var21.method2053(true), var21.field4645[0], var21.field4646[0], 0, (byte) -49, true);
                }
            }
            if (~var7 == -45) {
                class424.field6145 = arg1;
                ++class189.field2644;
                class479.field6850 = arg2;
                class133.field1842 = 2;
                class568.field8210 = 0;
                class88 var23 = class448.method2741((byte) 116, class539.field7825, class583.field8319);
                var23.field1260.method2914((int) (var9 >>> 32) & Integer.MAX_VALUE, (byte) 104);
                var23.field1260.method2901(!class253.field3661.method2780(82, 117) ? 0 : 1, 128);
                var23.field1260.method2887(class71.field1085 + var6, (byte) -70);
                var23.field1260.method2863(class41.field693 + var4, (byte) 10);
                class523.method3183(var23, (byte) 31);
                class46.method448(var9, var6, var4, (byte) -38);
            }
            if (~var7 == -24) {
                class133.field1842 = 2;
                class424.field6145 = arg1;
                class479.field6850 = arg2;
                ++class743.field10361;
                class568.field8210 = 0;
                class88 var24 = class448.method2741((byte) 27, class687.field9755, class583.field8319);
                var24.field1260.method2887(class108.field1536.field4592, (byte) -122);
                var24.field1260.method2914(class191.field2688, (byte) 103);
                var24.field1260.method2927((byte) -54, class231.field3475);
                var24.field1260.method2877(class253.field3661.method2780(82, 123) ? 1 : 0, 128);
                var24.field1260.method2914(class250.field3640, (byte) 127);
                class523.method3183(var24, (byte) 31);
            }
            if (var7 == 1011) {
                class133.field1842 = 2;
                class424.field6145 = arg1;
                class479.field6850 = arg2;
                class568.field8210 = 0;
                ++class453.field6475;
                class88 var25 = class448.method2741((byte) 73, class224.field3305, class583.field8319);
                var25.field1260.method2862(var8, -1166933656);
                class523.method3183(var25, (byte) 31);
            }
            if (var7 == 20) {
                class63 var26 = (class63) class389.field5608.method4020((long) var8, (byte) -93);
                if (var26 != null) {
                    ++class495.field7118;
                    class424.field6145 = arg1;
                    class568.field8210 = 0;
                    class479.field6850 = arg2;
                    class133.field1842 = 2;
                    class571 var27 = var26.field1004;
                    class88 var28 = class448.method2741((byte) 88, class275.field3883, class583.field8319);
                    var28.field1260.method2862(var8, -1166933656);
                    var28.field1260.method2901(!class253.field3661.method2780(82, 71) ? 0 : 1, 128);
                    class523.method3183(var28, (byte) 31);
                    class541.method3255(var27.method2053(true), 0, -2, var27.method2053(true), var27.field4645[0], var27.field4646[0], 0, (byte) -49, true);
                }
            }
            if (~var7 == -3) {
                class424.field6145 = arg1;
                class568.field8210 = 0;
                ++class385.field5566;
                class479.field6850 = arg2;
                class133.field1842 = 2;
                class88 var29 = class448.method2741((byte) 114, class334.field4531, class583.field8319);
                var29.field1260.method2887(var8, (byte) -63);
                var29.field1260.method2862(class41.field693 + var4, -1166933656);
                var29.field1260.method2901(class253.field3661.method2780(82, 77) ? 1 : 0, 128);
                var29.field1260.method2862(class71.field1085 + var6, -1166933656);
                class523.method3183(var29, (byte) 31);
                class739.method4126(var4, var6, -1037);
            }
            if (var7 == 13) {
                class63 var30 = (class63) class389.field5608.method4020((long) var8, (byte) -80);
                if (var30 != null) {
                    class479.field6850 = arg2;
                    ++class148.field2156;
                    class568.field8210 = 0;
                    class133.field1842 = 2;
                    class571 var31 = var30.field1004;
                    class424.field6145 = arg1;
                    class88 var32 = class448.method2741((byte) 100, class458.field6510, class583.field8319);
                    var32.field1260.method2862(class191.field2688, -1166933656);
                    var32.field1260.method2914(class250.field3640, (byte) 66);
                    var32.field1260.method2864(!class253.field3661.method2780(82, 82) ? 0 : 1, (byte) 99);
                    var32.field1260.method2888(class231.field3475, 79);
                    var32.field1260.method2862(var8, -1166933656);
                    class523.method3183(var32, (byte) 31);
                    class541.method3255(var31.method2053(true), 0, -2, var31.method2053(true), var31.field4645[0], var31.field4646[0], 0, (byte) -49, true);
                }
            }
            if (~var7 == -31) {
                class568.field8210 = 0;
                class479.field6850 = arg2;
                class133.field1842 = 2;
                class424.field6145 = arg1;
                ++class51.field828;
                class88 var33 = class448.method2741((byte) 51, class156.field2245, class583.field8319);
                var33.field1260.method2901(!class253.field3661.method2780(82, 75) ? 0 : 1, 128);
                var33.field1260.method2887(Integer.MAX_VALUE & (int) (var9 >>> 32), (byte) -36);
                var33.field1260.method2862(var6 - -class71.field1085, -1166933656);
                var33.field1260.method2914(class41.field693 + var4, (byte) 51);
                class523.method3183(var33, (byte) 31);
                class46.method448(var9, var6, var4, (byte) -38);
            }
            if (var7 == 1006 || var7 == 1008 || ~var7 == -1002 || ~var7 == -1008 || ~var7 == -1011) {
                class153.method1108(var4, var7, var8, 14065);
            }
            if (~var7 == -7) {
                class133.field1842 = 2;
                ++class386.field5579;
                class424.field6145 = arg1;
                class568.field8210 = 0;
                class479.field6850 = arg2;
                class88 var34 = class448.method2741((byte) 48, class311.field4212, class583.field8319);
                var34.field1260.method2901(class253.field3661.method2780(82, 109) ? 1 : 0, 128);
                var34.field1260.method2862(class41.field693 + var4, -1166933656);
                var34.field1260.method2863(class71.field1085 + var6, (byte) -114);
                var34.field1260.method2914(Integer.MAX_VALUE & (int) (var9 >>> 32), (byte) 106);
                class523.method3183(var34, (byte) 31);
                class46.method448(var9, var6, var4, (byte) -38);
            }
            if (var7 == 10) {
                class639 var35 = class536.field7796[var8];
                if (var35 != null) {
                    class568.field8210 = 0;
                    class133.field1842 = 2;
                    ++class206.field3102;
                    class479.field6850 = arg2;
                    class424.field6145 = arg1;
                    class88 var36 = class448.method2741((byte) 46, class118.field1621, class583.field8319);
                    var36.field1260.method2914(var8, (byte) 125);
                    var36.field1260.method2877(class253.field3661.method2780(82, 98) ? 1 : 0, 128);
                    class523.method3183(var36, (byte) 31);
                    class541.method3255(var35.method2053(true), 0, -2, var35.method2053(true), var35.field4645[0], var35.field4646[0], 0, (byte) -49, true);
                }
            }
            if (~var7 == -1005) {
                class479.field6850 = arg2;
                class568.field8210 = 0;
                class424.field6145 = arg1;
                class133.field1842 = 2;
                class63 var37 = (class63) class389.field5608.method4020((long) var8, (byte) -91);
                if (var37 != null) {
                    class571 var38 = var37.field1004;
                    class521 var39 = var38.field8235;
                    if (var39.field7535 != null) {
                        var39 = var39.method3166(class226.field3372, true);
                    }
                    if (var39 != null) {
                        ++class630.field8924;
                        class88 var40 = class448.method2741((byte) 92, class588.field8374, class583.field8319);
                        var40.field1260.method2862(var39.field7560, -1166933656);
                        class523.method3183(var40, (byte) 31);
                    }
                }
            }
            if (var7 == 48) {
                class479.field6850 = arg2;
                class568.field8210 = 0;
                class133.field1842 = 2;
                ++class715.field10087;
                class424.field6145 = arg1;
                class88 var41 = class448.method2741((byte) 84, class441.field6276, class583.field8319);
                var41.field1260.method2863(class71.field1085 + var6, (byte) 125);
                var41.field1260.method2887(var8, (byte) -121);
                var41.field1260.method2877(!class253.field3661.method2780(82, 85) ? 0 : 1, 128);
                var41.field1260.method2863(class41.field693 + var4, (byte) 48);
                class523.method3183(var41, (byte) 31);
                class739.method4126(var4, var6, -1037);
            }
            if (~var7 == -6) {
                if (class598.field8507 > 0 && class253.field3661.method2780(82, 87) && class253.field3661.method2780(81, 73)) {
                    class619.method3592(class71.field1085 + var6, class108.field1536.field3920, class41.field693 + var4, -116);
                } else {
                    class88 var42 = class256.method1709(var8, var6, var4, (byte) -121);
                    if (~var8 != -2) {
                        class479.field6850 = arg2;
                        class424.field6145 = arg1;
                        class133.field1842 = 1;
                        class568.field8210 = 0;
                    } else {
                        var42.field1260.method2881(-1, (byte) 127);
                        var42.field1260.method2881(-1, (byte) 121);
                        var42.field1260.method2862((int) class680.field9668, -1166933656);
                        var42.field1260.method2881(57, (byte) 115);
                        var42.field1260.method2881(class225.field3350, (byte) 111);
                        var42.field1260.method2881(field162, (byte) 120);
                        var42.field1260.method2881(89, (byte) 120);
                        var42.field1260.method2862(class108.field1536.field3923, -1166933656);
                        var42.field1260.method2862(class108.field1536.field3916, -1166933656);
                        var42.field1260.method2881(63, (byte) 110);
                    }
                    class523.method3183(var42, (byte) 31);
                    class541.method3255(1, 0, -4, 1, var6, var4, 0, (byte) -49, true);
                }
            }
            if (~var7 == -9) {
                class133.field1842 = 2;
                class479.field6850 = arg2;
                class424.field6145 = arg1;
                ++class416.field5911;
                class568.field8210 = 0;
                class88 var43 = class448.method2741((byte) 29, class464.field6620, class583.field8319);
                var43.field1260.method2914(class250.field3640, (byte) 116);
                var43.field1260.method2901(!class253.field3661.method2780(82, 76) ? 0 : 1, 128);
                var43.field1260.method2863(Integer.MAX_VALUE & (int) (var9 >>> 32), (byte) 10);
                var43.field1260.method2863(class41.field693 + var4, (byte) 8);
                var43.field1260.method2914(class191.field2688, (byte) 107);
                var43.field1260.method2887(class71.field1085 + var6, (byte) -49);
                var43.field1260.method2927((byte) -54, class231.field3475);
                class523.method3183(var43, (byte) 31);
                class46.method448(var9, var6, var4, (byte) -38);
            }
            if (~var7 == -61) {
                ++class513.field7425;
                class479.field6850 = arg2;
                class133.field1842 = 2;
                class568.field8210 = 0;
                class424.field6145 = arg1;
                class88 var44 = class448.method2741((byte) 93, class184.field2537, class583.field8319);
                var44.field1260.method2863(class41.field693 + var4, (byte) -47);
                var44.field1260.method2862(class71.field1085 + var6, -1166933656);
                var44.field1260.method2881(class253.field3661.method2780(82, 109) ? 1 : 0, (byte) 123);
                var44.field1260.method2862(var8, -1166933656);
                class523.method3183(var44, (byte) 31);
                class739.method4126(var4, var6, -1037);
            }
            if (var7 == 12) {
                class63 var45 = (class63) class389.field5608.method4020((long) var8, (byte) -79);
                if (var45 != null) {
                    class571 var46 = var45.field1004;
                    ++class343.field4710;
                    class133.field1842 = 2;
                    class568.field8210 = 0;
                    class424.field6145 = arg1;
                    class479.field6850 = arg2;
                    class88 var47 = class448.method2741((byte) 125, class502.field7303, class583.field8319);
                    var47.field1260.method2901(class253.field3661.method2780(82, 79) ? 1 : 0, 128);
                    var47.field1260.method2862(var8, -1166933656);
                    class523.method3183(var47, (byte) 31);
                    class541.method3255(var46.method2053(true), 0, -2, var46.method2053(true), var46.field4645[0], var46.field4646[0], 0, (byte) -49, true);
                }
            }
            if (var7 == 1012) {
                ++class507.field7360;
                class424.field6145 = arg1;
                class133.field1842 = 2;
                class479.field6850 = arg2;
                class568.field8210 = 0;
                class88 var48 = class448.method2741((byte) 91, class671.field9572, class583.field8319);
                var48.field1260.method2901(!class253.field3661.method2780(82, 95) ? 0 : 1, 128);
                var48.field1260.method2887((int) (var9 >>> 32) & Integer.MAX_VALUE, (byte) -81);
                var48.field1260.method2862(class71.field1085 + var6, -1166933656);
                var48.field1260.method2914(class41.field693 + var4, (byte) 113);
                class523.method3183(var48, (byte) 31);
                class46.method448(var9, var6, var4, (byte) -38);
            }
            if (~var7 == -60) {
                class63 var49 = (class63) class389.field5608.method4020((long) var8, (byte) -94);
                if (var49 != null) {
                    ++class293.field4025;
                    class424.field6145 = arg1;
                    class479.field6850 = arg2;
                    class133.field1842 = 2;
                    class568.field8210 = 0;
                    class571 var50 = var49.field1004;
                    class88 var51 = class448.method2741((byte) 102, class4.field28, class583.field8319);
                    var51.field1260.method2881(!class253.field3661.method2780(82, 67) ? 0 : 1, (byte) 122);
                    var51.field1260.method2887(var8, (byte) -65);
                    class523.method3183(var51, (byte) 31);
                    class541.method3255(var50.method2053(true), 0, -2, var50.method2053(true), var50.field4645[0], var50.field4646[0], 0, (byte) -49, true);
                }
            }
            if (~var7 == -58) {
                class479.field6850 = arg2;
                class133.field1842 = 2;
                class568.field8210 = 0;
                ++class539.field7822;
                class424.field6145 = arg1;
                class88 var52 = class448.method2741((byte) 33, class458.field6511, class583.field8319);
                var52.field1260.method2914(class250.field3640, (byte) 80);
                var52.field1260.method2914(var8, (byte) 35);
                var52.field1260.method2862(class71.field1085 + var6, -1166933656);
                var52.field1260.method2887(class191.field2688, (byte) -89);
                var52.field1260.method2864(class253.field3661.method2780(82, 69) ? 1 : 0, (byte) 99);
                var52.field1260.method2862(var4 - -class41.field693, -1166933656);
                var52.field1260.method2905(class231.field3475, 1859553720);
                class523.method3183(var52, (byte) 31);
                class739.method4126(var4, var6, -1037);
            }
            if (var7 == 22) {
                class639 var53 = class536.field7796[var8];
                if (var53 != null) {
                    class424.field6145 = arg1;
                    class133.field1842 = 2;
                    class568.field8210 = 0;
                    class479.field6850 = arg2;
                    ++class743.field10361;
                    class88 var54 = class448.method2741((byte) 31, class687.field9755, class583.field8319);
                    var54.field1260.method2887(var8, (byte) -33);
                    var54.field1260.method2914(class191.field2688, (byte) 106);
                    var54.field1260.method2927((byte) -54, class231.field3475);
                    var54.field1260.method2877(class253.field3661.method2780(82, 72) ? 1 : 0, 128);
                    var54.field1260.method2914(class250.field3640, (byte) 53);
                    class523.method3183(var54, (byte) 31);
                    class541.method3255(var53.method2053(true), 0, -2, var53.method2053(true), var53.field4645[0], var53.field4646[0], 0, (byte) -49, true);
                }
            }
            if (var7 == 19) {
                class63 var55 = (class63) class389.field5608.method4020((long) var8, (byte) -125);
                if (var55 != null) {
                    class133.field1842 = 2;
                    class568.field8210 = 0;
                    class424.field6145 = arg1;
                    class571 var56 = var55.field1004;
                    ++class42.field706;
                    class479.field6850 = arg2;
                    class88 var57 = class448.method2741((byte) 78, class732.field10258, class583.field8319);
                    var57.field1260.method2901(class253.field3661.method2780(82, 90) ? 1 : 0, 128);
                    var57.field1260.method2863(var8, (byte) 99);
                    class523.method3183(var57, (byte) 31);
                    class541.method3255(var56.method2053(true), 0, -2, var56.method2053(true), var56.field4645[0], var56.field4646[0], 0, (byte) -49, true);
                }
            }
            if (~var7 == -47) {
                class639 var58 = class536.field7796[var8];
                if (var58 != null) {
                    class568.field8210 = 0;
                    class479.field6850 = arg2;
                    class424.field6145 = arg1;
                    class133.field1842 = 2;
                    ++class124.field1703;
                    class88 var59 = class448.method2741((byte) 35, class519.field7486, class583.field8319);
                    var59.field1260.method2881(class253.field3661.method2780(82, 116) ? 1 : 0, (byte) 122);
                    var59.field1260.method2914(var8, (byte) 64);
                    class523.method3183(var59, (byte) 31);
                    class541.method3255(var58.method2053(true), 0, -2, var58.method2053(true), var58.field4645[0], var58.field4646[0], 0, (byte) -49, true);
                }
            }
            if (var7 == 4 && class310.field4186 == null) {
                class176.method1268(var4, var6, (byte) 73);
                class310.field4186 = class590.method3467(1, var6, var4);
                class401.method2439(1723, class310.field4186);
            }
            if (~var7 == -52) {
                class424.field6145 = arg1;
                class568.field8210 = 0;
                class479.field6850 = arg2;
                class133.field1842 = 2;
                ++class485.field6992;
                class88 var60 = class448.method2741((byte) 80, class443.field6323, class583.field8319);
                var60.field1260.method2914(var8, (byte) 108);
                var60.field1260.method2864(class253.field3661.method2780(82, 101) ? 1 : 0, (byte) 99);
                var60.field1260.method2914(class41.field693 + var4, (byte) 44);
                var60.field1260.method2862(class71.field1085 + var6, -1166933656);
                class523.method3183(var60, (byte) 31);
                class739.method4126(var4, var6, -1037);
            }
            if (~var7 == -51) {
                class639 var61 = class536.field7796[var8];
                if (var61 != null) {
                    class424.field6145 = arg1;
                    class568.field8210 = 0;
                    class479.field6850 = arg2;
                    ++class655.field9387;
                    class133.field1842 = 2;
                    class88 var62 = class448.method2741((byte) 81, class388.field5600, class583.field8319);
                    var62.field1260.method2864(!class253.field3661.method2780(82, 118) ? 0 : 1, (byte) 99);
                    var62.field1260.method2887(var8, (byte) -110);
                    class523.method3183(var62, (byte) 31);
                    class541.method3255(var61.method2053(true), 0, -2, var61.method2053(true), var61.field4645[0], var61.field4646[0], 0, (byte) -49, true);
                }
            }
            if (var7 == 45 || var7 == 1002) {
                class555.method3333(26952, arg3.field4158, var8, var4, var6);
            }
            if (~var7 == -59) {
                class639 var63 = class536.field7796[var8];
                if (var63 != null) {
                    ++class622.field8858;
                    class133.field1842 = 2;
                    class568.field8210 = 0;
                    class424.field6145 = arg1;
                    class479.field6850 = arg2;
                    class88 var64 = class448.method2741((byte) 118, class225.field3319, class583.field8319);
                    var64.field1260.method2901(class253.field3661.method2780(82, 114) ? 1 : 0, 128);
                    var64.field1260.method2862(var8, -1166933656);
                    class523.method3183(var64, (byte) 31);
                    class541.method3255(var63.method2053(true), 0, -2, var63.method2053(true), var63.field4645[0], var63.field4646[0], 0, (byte) -49, true);
                }
            }
            if (var7 == 16) {
                class146 var65 = class590.method3467(1, var6, var4);
                if (var65 != null) {
                    class61.method571(false);
                    class478 var66 = client.method2732(var65);
                    class355.method2260(var66.field6790, var65, 0, var66.method2860(false));
                    class297.field4060 = class242.method1663(var65, -116);
                    if (class297.field4060 == null) {
                        class297.field4060 = "Null";
                    }
                    class377.field5459 = var65.field2024 + "<col=ffffff>";
                }
            } else {
                if (var7 == 25) {
                    class146 var67 = class590.method3467(1, var6, var4);
                    if (var67 != null) {
                        class541.method3252(var67, -116);
                    }
                }
                if (~var7 == -1010) {
                    class424.field6145 = arg1;
                    class479.field6850 = arg2;
                    class568.field8210 = 0;
                    ++class483.field6977;
                    class133.field1842 = 2;
                    class88 var68 = class448.method2741((byte) 117, class346.field4914, class583.field8319);
                    var68.field1260.method2862(var8, -1166933656);
                    class523.method3183(var68, (byte) 31);
                }
                if (var7 == 49) {
                    class63 var69 = (class63) class389.field5608.method4020((long) var8, (byte) -89);
                    if (var69 != null) {
                        class479.field6850 = arg2;
                        class133.field1842 = 2;
                        class571 var70 = var69.field1004;
                        class424.field6145 = arg1;
                        ++class375.field5429;
                        class568.field8210 = 0;
                        class88 var71 = class448.method2741((byte) 118, class624.field8878, class583.field8319);
                        var71.field1260.method2887(var8, (byte) -109);
                        var71.field1260.method2864(!class253.field3661.method2780(82, 80) ? 0 : 1, (byte) 99);
                        class523.method3183(var71, (byte) 31);
                        class541.method3255(var70.method2053(true), 0, -2, var70.method2053(true), var70.field4645[0], var70.field4646[0], 0, (byte) -49, true);
                    }
                }
                if (class549.field7997) {
                    class61.method571(false);
                }
                if (class560.field8128 != null && ~class499.field7169 == -1) {
                    class401.method2439(1723, class560.field8128);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BII)V", line = 840)
    public final void method83(byte arg0, int arg1, int arg2) {
        ++field160;
        if (arg0 != 81) {
            this.method84(-92, -51, 79);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 853)
    public final void method84(int arg0, int arg1, int arg2) {
        ++field164;
        int var4 = this.field167 * arg1 >> 12;
        if (arg2 != 34065) {
            method82(-62, -127, 66, (class304) null);
        }
        int var5 = this.field166 * arg0 >> 12;
        int var6 = this.field161 * arg1 >> 12;
        int var7 = this.field165 * arg0 >> 12;
        int var8 = this.field174 * arg1 >> 12;
        int var9 = this.field171 * arg0 >> 12;
        int var10 = this.field172 * arg1 >> 12;
        int var11 = this.field159 * arg0 >> 12;
        class437.method2674(var7, var9, var8, 57, var6, super.field10305, var4, var11, var5, var10);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZI)V", line = 895)
    public final void method85(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method85(-11, true, 41);
        }
        ++field169;
    }
}
