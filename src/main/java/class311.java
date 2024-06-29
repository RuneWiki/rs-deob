import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class311 {

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
    private int field4279;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
    private int field4285;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
    private int field4280;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public int field4282;

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4286 = new String[] { method2488(method2487("&<\u0005VT<0\r\fV}")), method2488(method2487("&<\u0005V*}")), method2488(method2487("&<\u0005V,}")), method2488(method2487("&<\u0005V+}")), method2488(method2487("&<\u0005V)}")) };

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "[[I")
    public static int[][] field4272 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "Lsb;")
    public static class261 field4277 = new class261(77, 6);

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 4)
    public static final void method2482(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class793.field11533 = true;
        class721.field10271 = class531.field7699.method198() > 0;
        class765.field10925 = arg15;
        class269.field3812 = arg1 >> class179.field2328;
        class98.field1331 = arg3 >> class179.field2328;
        class161.field2067 = arg1;
        class446.field6565 = arg3;
        class137.field1771 = arg2;
        class123.field1548 = class269.field3812 - class501.field7316;
        if (class123.field1548 < 0) {
            class727.field10412 = -class123.field1548;
            class123.field1548 = 0;
        } else {
            class727.field10412 = 0;
        }
        class32.field407 = class98.field1331 - class501.field7316;
        if (class32.field407 < 0) {
            class193.field2537 = -class32.field407;
            class32.field407 = 0;
        } else {
            class193.field2537 = 0;
        }
        class159.field2046 = class501.field7316 + class269.field3812;
        if (class159.field2046 > class508.field7455) {
            class159.field2046 = class508.field7455;
        }
        class618.field8815 = class98.field1331 + class501.field7316;
        if (class618.field8815 > class700.field9795) {
            class618.field8815 = class700.field9795;
        }
        boolean[][] var19 = class30.field385;
        boolean[][] var20 = class261.field3705;
        if (class765.field10925) {
            for (int var21 = 0; var21 < class501.field7316 + class501.field7316 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class501.field7316 + class501.field7316 + 2; var24++) {
                    if (var24 > 1) {
                        class285.field4010[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class269.field3812 + var21 - class501.field7316;
                    int var26 = class98.field1331 + var24 - class501.field7316;
                    if (var25 >= 0 && var26 >= 0 && var25 < class508.field7455 && var26 < class700.field9795) {
                        int var27 = var25 << class179.field2328;
                        int var28 = var26 << class179.field2328;
                        int var29 = class213.field3124[class213.field3124.length - 1].method5442(var25, var26, 31844) - (0x3E8 << class179.field2328 - 7);
                        int var30 = (class677.field9474 == null ? class213.field3124[0].method5442(var25, var26, 31844) + class768.field10975 : class677.field9474[0].method5442(var25, var26, 31844) + class768.field10975) + (0x3E8 << class179.field2328 - 7);
                        var23 = arg16 >= 0 ? class531.field7699.method173(var27, var29, var28, var27, var30, var28, arg16) : class531.field7699.method176(var27, var29, var28, var27, var30, var28);
                        class261.field3705[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class261.field3705[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class285.field4010[var24 - 1] & class285.field4010[var24] & var22 & var23;
                        class30.field385[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class285.field4010[class501.field7316 + class501.field7316] = var22;
                class285.field4010[class501.field7316 + class501.field7316 + 1] = var23;
            }
            if (arg16 >= 0) {
                class793.field11533 = false;
            } else {
                class130.field1625 = arg5;
                class393.field5719 = arg6;
                class263.field3721 = arg7;
                class502.field7335 = arg8;
                class559.field8140 = arg9;
                class251.method2045(class531.field7699, arg10, (byte) -127);
            }
        } else {
            if (class508.field7470 == null) {
                class508.field7470 = new boolean[class508.field7455 + class508.field7455 + 1][class700.field9795 + class508.field7455 + 1];
            }
            for (int var32 = 0; var32 < class508.field7470.length; var32++) {
                for (int var42 = 0; var42 < class508.field7470[0].length; var42++) {
                    class508.field7470[var32][var42] = true;
                }
            }
            class261.field3705 = class508.field7470;
            class30.field385 = class508.field7470;
            class123.field1548 = 0;
            class32.field407 = 0;
            class159.field2046 = class508.field7455;
            class618.field8815 = class700.field9795;
            class793.field11533 = false;
        }
        class552.method4129(false, class531.field7699);
        if (!class80.field1125.field3181) {
            class470 var33 = class80.field1125.field3178;
            for (class297 var34 = (class297) var33.method3617(false); var34 != null; var34 = (class297) var33.method3612(3)) {
                var34.method4736(0);
                class228.method1899(-201, var34);
            }
        }
        if (class721.field10271) {
            for (int var35 = 0; var35 < class156.field1988; var35++) {
                class678.field9526[var35].method3011(arg0, true, arg14);
            }
        }
        if (class335.field4851) {
            class744.field10566 = class531.field7699.method157();
            class531.field7699.method229(class487.field7144);
            int var36 = (class487.field7144[2] - class487.field7144[0]) / class433.field6280;
            for (int var37 = 0; var37 < class433.field6280 - 1; var37++) {
                class144.field1862[var37] = (var37 + 1) * var36 + class538.field7912[var37];
            }
            for (int var38 = 0; var38 < class650.field9243.length; var38++) {
                class650.field9243[var38].method249();
            }
        }
        if (class105.field1377 != null) {
            if (class335.field4851) {
                class47.method505(0);
            }
            class526.method3999(true);
            class531.field7699.method150(-1, 1583160, 40, 127);
            class768.method5546(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class335.field4851) {
                class5.method35();
            }
            class531.field7699.method169();
            class526.method3999(false);
        }
        class768.method5546(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class335.field4851) {
            for (int var39 = 0; var39 < class293.field4121; var39++) {
                class725.field10313[var39] = class173.field2290[var39];
            }
            class47.method505(0);
            for (int var40 = 0; var40 < class650.field9243.length; var40++) {
                class650.field9243[var40].method249();
            }
        }
        if (class335.field4851) {
            class5.method35();
            for (int var41 = 0; var41 < class293.field4121; var41++) {
                class173.field2290[var41] = class725.field10313[var41];
            }
            if (class643.field9161 == 2) {
                int var10002;
                if (class306.field4250[0] < class306.field4250[1]) {
                    if (class538.field7912[0] + class144.field1862[0] > class487.field7144[0]) {
                        var10002 = class538.field7912[0]++;
                    }
                } else if (class306.field4250[0] > class306.field4250[1] && class538.field7912[0] + class144.field1862[0] < class487.field7144[2]) {
                    var10002 = class538.field7912[0]--;
                }
            }
        }
        if (!class765.field10925) {
            class30.field385 = var19;
            class261.field3705 = var20;
        }
        class55.method583();
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BIII)Z", line = 298)
    public final boolean method2483(byte arg0, int arg1, int arg2, int arg3) {
        try {
            field4271++;
            if (arg1 < this.field4284 || this.field4275 < arg1) {
                return false;
            } else if (this.field4276 > arg3 || this.field4283 < arg3) {
                return false;
            } else if (arg2 >= this.field4273 && arg2 <= this.field4282) {
                if (arg0 < 48) {
                    this.field4276 = 106;
                }
                int var5 = arg1 - this.field4280;
                int var6 = arg2 - this.field4285;
                return var5 * var5 + var6 * var6 < this.field4279;
            } else {
                return false;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4286[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IZ)V", line = 324)
    public static final void method2484(int arg0, boolean arg1) {
        try {
            if (!arg1) {
                method2486(-33);
            }
            class651.field9252 = 1000000000L / (long) arg0;
            field4281++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4286[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIIIIIII)V", line = 335)
    public final void method2485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            if (arg9 <= -57) {
                this.field4280 = arg8;
                this.field4279 = arg3 * arg3;
                field4278++;
                this.field4274 = arg10;
                this.field4285 = arg6;
                this.field4273 = this.field4285 + arg7;
                this.field4283 = this.field4274 + arg5;
                this.field4284 = this.field4280 + arg4;
                this.field4282 = this.field4285 + arg2;
                this.field4276 = this.field4274 + arg1;
                this.field4275 = this.field4280 + arg0;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4286[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V", line = 362)
    public static void method2486(int arg0) {
        try {
            field4272 = null;
            int var1 = 69 / ((-arg0 - 2) / 48);
            field4277 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4286[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 371)
    public class311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            this.field4279 = arg3 * arg3;
            this.field4285 = arg2;
            this.field4280 = arg0;
            this.field4274 = arg1;
            this.field4273 = this.field4285 + arg8;
            this.field4282 = this.field4285 + arg9;
            this.field4275 = this.field4280 + arg5;
            this.field4284 = this.field4280 + arg4;
            this.field4276 = this.field4274 + arg6;
            this.field4283 = this.field4274 + arg7;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field4286[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2487(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2488(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
