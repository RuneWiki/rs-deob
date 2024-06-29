import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class328 {

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "J")
    public static long field4855 = 0L;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field4859 = -1;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lvg;ZIILr;)V")
    public static final void method2062(class49 arg0, boolean arg1, int arg2, int arg3, class166 arg4) {
        field4853++;
        class617 var5 = arg0.method553(121, arg4);
        if (!arg1) {
            field4859 = 81;
        }
        if (var5 == null) {
            return;
        }
        arg4.method168(arg2, arg3, arg0.field967 + arg2, arg3 - -arg0.field877);
        if (class581.field8187 == 2 || class581.field8187 == 5 || class99.field1552 == null) {
            arg4.method169(-16777216, var5, arg2, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class43.field700 == 4) {
            var6 = class124.field1866;
            var7 = 4096;
            var8 = class72.field1267;
            var9 = (int) (-class630.field8811) & 0x3FFF;
        } else {
            var7 = 4096 - (class287.field4280 * 16);
            var8 = class648.field9106.field3024;
            var9 = (int) (-class630.field8811) + class252.field3880 & 0x3FFF;
            var6 = class648.field9106.field3029;
        }
        int var10 = var8 / 128 + 48 - (class199.field2812 * 2 - 208);
        int var11 = class232.field3611 * 4 + 48 - (var6 / 128) - ((class232.field3611 + -104) * 2);
        class99.field1552.method3913((float) arg0.field967 / 2.0F + (float) arg2, (float) arg0.field877 / 2.0F + (float) arg3, (float) var10, (float) var11, var7, var9 << 2, var5, arg2, arg3);
        for (class111 var12 = (class111) class33.field521.method472((byte) -33); var12 != null; var12 = (class111) class33.field521.method482(-50)) {
            int var58 = var12.field1683;
            int var59 = (class409.field5972.field8203[var58] >> 14 & 0x3FFF) - class109.field1672;
            int var60 = (class409.field5972.field8203[var58] & 0x3FFF) - class203.field2874;
            int var61 = var59 * 4 + 2 - (var8 / 128);
            int var62 = var60 * 4 + 2 - var6 / 128;
            class127.method958(var61, arg3, arg4, arg2, arg0, 64, var62, var5, class409.field5972.field8200[var58]);
        }
        for (int var13 = 0; var13 < class205.field2890; var13++) {
            int var55 = class638.field9008[var13] * 4 + 2 - (var8 / 128);
            int var56 = class21.field288[var13] * 4 + 2 - (var6 / 128);
            class550 var57 = class101.field1572.method2617((byte) -94, class307.field4552[var13]);
            if (var57.field7781 != null) {
                var57 = var57.method3124((byte) -2, class61.field1163);
                if (var57 == null || var57.field7740 == -1) {
                    continue;
                }
            }
            class127.method958(var55, arg3, arg4, arg2, arg0, 119, var56, var5, var57.field7740);
        }
        for (class44 var14 = (class44) class22.field296.method1407(-119); var14 != null; var14 = (class44) class22.field296.method1413(arg1)) {
            int var50 = (int) (var14.field9386 >> 28 & 0x3L);
            if (class293.field4323 == var50) {
                int var51 = (int) (var14.field9386 & 0x3FFFL) - class109.field1672;
                int var52 = (int) (var14.field9386 >> 14 & 0x3FFFL) - class203.field2874;
                int var53 = var51 * 4 + 2 - (var8 / 128);
                int var54 = var52 * 4 + 2 - var6 / 128;
                class326.method2049((byte) 62, var5, var53, arg0, arg3, arg2, var54, class124.field1863[0]);
            }
        }
        for (int var15 = 0; var15 < class217.field3042; var15++) {
            class16 var45 = (class16) class189.field2723.method1405((long) class85.field1396[var15], (byte) -25);
            if (var45 != null) {
                class577 var46 = var45.field174;
                if (var46.method3268((byte) 83) && class648.field9106.field3019 == var46.field3019) {
                    class592 var47 = var46.field8121;
                    if (var47 != null && var47.field8315 != null) {
                        var47 = var47.method3356(116, class61.field1163);
                    }
                    if (var47 != null && var47.field8337 && var47.field8352) {
                        int var48 = var46.field3024 / 128 - var8 / 128;
                        int var49 = var46.field3029 / 128 - (var6 / 128);
                        if (var47.field8319 == -1) {
                            class326.method2049((byte) 89, var5, var48, arg0, arg3, arg2, var49, class124.field1863[1]);
                        } else {
                            class127.method958(var48, arg3, arg4, arg2, arg0, 19, var49, var5, var47.field8319);
                        }
                    }
                }
            }
        }
        int var16 = class7.field65;
        int[] var17 = class629.field8801;
        for (int var18 = 0; var18 < var16; var18++) {
            class491 var37 = class141.field2087[var17[var18]];
            if (var37 != null && var37.method2849((byte) 123) && class648.field9106 != var37 && class648.field9106.field3019 == var37.field3019) {
                int var38 = var37.field3024 / 128 - (var8 / 128);
                int var39 = var37.field3029 / 128 - (var6 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class142.field2091; var41++) {
                    if (var37.field6981.equals(class124.field1865[var41]) && class182.field2580[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class433.field6341; var43++) {
                    if (var37.field6981.equals(class564.field7965[var43].field1800)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class648.field9106.field6970 != 0 && var37.field6970 != 0 && class648.field9106.field6970 == var37.field6970) {
                    var44 = true;
                }
                if (var37.field6999) {
                    class326.method2049((byte) 99, var5, var38, arg0, arg3, arg2, var39, class124.field1863[6]);
                } else if (var40) {
                    class326.method2049((byte) 84, var5, var38, arg0, arg3, arg2, var39, class124.field1863[3]);
                } else if (var42) {
                    class326.method2049((byte) 54, var5, var38, arg0, arg3, arg2, var39, class124.field1863[5]);
                } else if (var44) {
                    class326.method2049((byte) 39, var5, var38, arg0, arg3, arg2, var39, class124.field1863[4]);
                } else {
                    class326.method2049((byte) 59, var5, var38, arg0, arg3, arg2, var39, class124.field1863[2]);
                }
            }
        }
        class390[] var19 = class601.field8496;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class390 var23 = var19[var20];
            if (var23 != null && var23.field5787 != 0 && (class564.field7962 % 20) < 10) {
                if (var23.field5787 == 1) {
                    class16 var24 = (class16) class189.field2723.method1405((long) var23.field5786, (byte) -83);
                    if (var24 != null) {
                        class577 var25 = var24.field174;
                        int var26 = var25.field3024 / 128 - (var8 / 128);
                        int var27 = var25.field3029 / 128 - (var6 / 128);
                        class525.method3018(arg0, arg3, 360000L, var5, 65535, var27, var26, var23.field5788, arg2);
                    }
                }
                if (var23.field5787 == 2) {
                    int var28 = var23.field5791 / 128 - (var8 / 128);
                    int var29 = var23.field5785 / 128 - var6 / 128;
                    long var30 = (long) (var23.field5777 << 7);
                    long var32 = var30 * var30;
                    class525.method3018(arg0, arg3, var32, var5, 65535, var29, var28, var23.field5788, arg2);
                }
                if (var23.field5787 == 10 && var23.field5786 >= 0 && var23.field5786 < class141.field2087.length) {
                    class491 var34 = class141.field2087[var23.field5786];
                    if (var34 != null) {
                        int var35 = var34.field3024 / 128 - (var8 / 128);
                        int var36 = var34.field3029 / 128 - (var6 / 128);
                        class525.method3018(arg0, arg3, 360000L, var5, 65535, var36, var35, var23.field5788, arg2);
                    }
                }
            }
        }
        if (class43.field700 == 4) {
            return;
        }
        if (class535.field7508 != 0) {
            int var21 = class535.field7508 * 4 + class648.field9106.method2553((byte) 97) * 2 + 2 - (var8 / 128 - -2);
            int var22 = (class674.field9547 * 4 + ((class648.field9106.method2553((byte) 122) + -1) * 2) - (var6 / 128)) + 2;
            class326.method2049((byte) 64, var5, var21, arg0, arg3, arg2, var22, class83.field1371[class627.field8775 ? 1 : 0]);
        }
        arg4.method1150(3, arg3 + (arg0.field877 / 2) - 1, arg0.field967 / 2 + -1 + arg2, -1, -1, 3);
        return;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method2063(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != -1) {
            method2065(69);
        }
        field4856++;
        if ((arg0 + arg5) > arg3 && arg3 + arg7 > arg5) {
            return arg4 < (arg1 + arg8) && (arg4 + arg2) > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
    public static final boolean method2064(int arg0, int arg1, int arg2) {
        field4857++;
        if (arg2 != 128) {
            method2063(25, -31, -70, -112, -52, -80, 111, -106, 10);
        }
        if (class85.method746(arg1, 123, arg0)) {
            return class156.method1088(arg1, -17, arg0) | (arg1 & 0x9000) != 0 | class23.method279(false, arg1, arg0) ? true : (class272.method1797(arg2 ^ 0x2A0, arg0, arg1) | (arg1 & 0x2000) != 0 | class310.method1973(arg1, -18974, arg0)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static final void method2065(int arg0) {
        field4858++;
        if (~class676.field9555 == arg0) {
            class676.field9555 = 7;
        }
    }
}
