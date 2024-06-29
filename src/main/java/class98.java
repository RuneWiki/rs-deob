import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class class98 extends class27 {

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "Ltca;")
    public static class141 field1188 = new class141(1, 2);

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
    public static int field1192 = -1;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "I")
    public static int field1190;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qv", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field1193;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "[[[B")
    public static byte[][][] field1191;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method559(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "(I)Z", line = 7)
    public final boolean method164(int arg0) {
        ++field1186;
        int var2 = -44 / ((-42 - arg0) / 58);
        class634 var3 = class116.method683(super.field385, super.field398 >> class62.field762, super.field397 >> class62.field762);
        return var3 != null && var3.field8767.field415 ? class244.method1496(super.field398 >> class62.field762, var3.field8767.method176((byte) -118) - -this.method176((byte) -128), 100, super.field397 >> class62.field762, super.field385) : class454.method2559(super.field398 >> class62.field762, super.field385, 1, super.field397 >> class62.field762);
    }

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "(I)Z", line = 24)
    public final boolean method166(int arg0) {
        ++field1183;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)Z", line = 35)
    public final boolean method171(boolean arg0) {
        if (arg0) {
            field1192 = 25;
        }
        ++field1187;
        return class165.field2371[(super.field398 >> class62.field762) - class501.field6888 - -class312.field4204][(super.field397 >> class62.field762) - class377.field4997 - -class312.field4204];
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 48)
    public static void method556(int arg0) {
        field1191 = null;
        field1188 = null;
        if (arg0 != -1713569622) {
            field1191 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIII)V", line = 58)
    public class98(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field386 = (byte) arg4;
        super.field385 = (byte) arg3;
        super.field398 = arg0;
        super.field397 = arg2;
        super.field388 = arg1;
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(B)V", line = 70)
    public final void method175(byte arg0) {
        ++field1190;
        if (arg0 >= 24) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 86)
    public static final void method557(String arg0, int arg1, int arg2) {
        ++field1182;
        class256 var3 = class592.method3279((byte) -40, 3, arg2);
        var3.method1549(-32042);
        var3.field3352 = arg0;
        if (arg1 <= 10) {
            field1191 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILir;ZILr;IB)V", line = 100)
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        ++field1184;
        if (arg6 > -117) {
            field1192 = 27;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "([Lqea;B)I", line = 112)
    public final int method170(class392[] arg0, byte arg1) {
        if (arg1 < 9) {
            field1188 = null;
        }
        ++field1185;
        return this.method178(super.field398 >> class62.field762, arg0, 1, super.field397 >> class62.field762);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILr;I)Z", line = 123)
    public static final boolean method558(int arg0, class562 arg1, int arg2) {
        ++field1189;
        int var3 = (class703.field9886 + -104) / 2;
        int var4 = (class431.field5789 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~var6 > ~(var3 + 104); ++var6) {
            for (int var57 = var4; var4 + 104 > var57; ++var57) {
                for (int var58 = arg0; var58 <= 3; ++var58) {
                    if (class452.method2541(arg0, var57, var58, var6, 0)) {
                        int var59 = var58;
                        if (class8.method44(var57, var6, 15090)) {
                            var59 = var58 - 1;
                        }
                        if (~var59 <= -1) {
                            var5 &= class657.method3754(var57, var59, 14, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class28.field406 = arg1.method1122(var7, 0, 512, 512, 512);
            class95.method540(-200);
            int var9 = -16777216 | 238 - -((int) (Math.random() * 20.0D)) + -10 + (228 - -((int) (20.0D * Math.random())) << 16) + (-10 + (int) (20.0D * Math.random()) + 238 << 8);
            int var10 = -16777216 | 228 + (int) (Math.random() * 20.0D) << 16;
            if (arg2 >= -39) {
                return true;
            } else {
                int var11 = (int) (8.0D * Math.random()) << 16 | (int) (8.0D * Math.random()) << 8 | (int) (Math.random() * 8.0D);
                boolean[][] var12 = new boolean[class224.field2901 - -1][class224.field2901 - -1];
                for (int var13 = var3; var3 + 104 > var13; var13 += class224.field2901) {
                    for (int var36 = var4; var4 + 104 > var36; var36 += class224.field2901) {
                        int var37 = 0;
                        int var38 = 0;
                        int var39 = var13;
                        if (var13 > 0) {
                            var39 = var13 - 1;
                            var37 += 4;
                        }
                        int var40 = var36;
                        if (var36 > 0) {
                            var40 = var36 - 1;
                        }
                        int var41 = class224.field2901 + var13;
                        if (~var41 > -105) {
                            ++var41;
                        }
                        int var42 = class224.field2901 + var36;
                        if (var42 < 104) {
                            ++var42;
                            var38 += 4;
                        }
                        arg1.method1042(0, 0, class224.field2901 * 4 + var37, class224.field2901 * 4 + var38);
                        arg1.method1146(-16777216);
                        for (int var43 = arg0; var43 <= 3; ++var43) {
                            for (int var50 = 0; ~class224.field2901 <= ~var50; ++var50) {
                                for (int var56 = 0; ~class224.field2901 <= ~var56; ++var56) {
                                    var12[var50][var56] = class452.method2541(arg0, var40 + var56, var43, var39 + var50, 0);
                                }
                            }
                            class454.field5981[var43].method1360(0, 0, 1024, var39, var40, var41, var42, var12);
                            if (!class151.field2068) {
                                for (int var51 = -4; var51 < class224.field2901; ++var51) {
                                    for (int var52 = -4; var52 < class224.field2901; ++var52) {
                                        int var53 = var13 - -var51;
                                        int var54 = var36 + var52;
                                        if (var3 <= var53 && ~var4 >= ~var54 && class452.method2541(arg0, var54, var43, var53, 0)) {
                                            int var55 = var43;
                                            if (class8.method44(var54, var53, 15090)) {
                                                var55 = var43 - 1;
                                            }
                                            if (~var55 <= -1) {
                                                class600.method3329(var53, var9, var54, arg1, var55, var37 - -(var51 * 4), 31, (class224.field2901 - var52) * 4 + -4 + var38, var10);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (class151.field2068) {
                            class593 var44 = class322.field4302[arg0];
                            for (int var45 = 0; class224.field2901 > var45; ++var45) {
                                for (int var46 = 0; var46 < class224.field2901; ++var46) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 + var46;
                                    int var49 = var44.field8191[var47 - var44.field8177][-var44.field8184 + var48];
                                    if ((var49 & 1076101120) != 0) {
                                        arg1.method3118(true, 4, var45 * 4 + var37, (-var46 + class224.field2901) * 4 + var38 + -4, 4, -1713569622);
                                    } else if ((8388608 & var49) != 0) {
                                        arg1.method3122(1, var37 - -(var45 * 4), (class224.field2901 - var46) * 4 + var38 - 4, -1713569622, 4);
                                    } else if ((var49 & 33554432) == 0) {
                                        if ((134217728 & var49) == 0) {
                                            if (~(var49 & 536870912) != -1) {
                                                arg1.method3123(4, -1713569622, var37 - -(var45 * 4), 1, (-var46 + class224.field2901) * 4 + (var38 - 4));
                                            }
                                        } else {
                                            arg1.method3122(1, var45 * 4 + var37, (-var46 + class224.field2901) * 4 + var38 + -4 + 3, -1713569622, 4);
                                        }
                                    } else {
                                        arg1.method3123(4, -1713569622, var37 - (-(var45 * 4) + -3), 1, var38 - (-((class224.field2901 - var46) * 4) - -4));
                                    }
                                }
                            }
                        }
                        arg1.method1113(var37, var38, class224.field2901 * 4, class224.field2901 * 4, var11, 2);
                        class28.field406.method215((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class224.field2901 * 4), class224.field2901 * 4, class224.field2901 * 4, var37, var38);
                    }
                }
                arg1.method1044();
                arg1.method1146(-16777215);
                class398.method2275(-1);
                class204.field2744 = 0;
                class378.field5002.method2512(-11558);
                if (!class151.field2068) {
                    for (int var14 = var3; var14 < var3 + 104; ++var14) {
                        for (int var20 = var4; var4 - -104 > var20; ++var20) {
                            for (int var21 = arg0; var21 <= arg0 + 1 && ~var21 >= -4; ++var21) {
                                if (class452.method2541(arg0, var20, var21, var14, 0)) {
                                    class599 var22 = (class599) class50.method266(var21, var14, var20);
                                    if (var22 == null) {
                                        var22 = (class599) class303.method1782(var21, var14, var20, field1193 != null ? field1193 : (field1193 = method559("ge")));
                                    }
                                    if (var22 == null) {
                                        var22 = (class599) class41.method225(var21, var14, var20);
                                    }
                                    if (var22 == null) {
                                        var22 = (class599) class595.method3304(var21, var14, var20);
                                    }
                                    if (var22 != null) {
                                        class600 var23 = class118.field1510.method3921(var22.method710((byte) 96), -98);
                                        if (!var23.field8299 || class414.field5431) {
                                            int var24 = var23.field8332;
                                            if (var23.field8257 != null) {
                                                for (int var25 = 0; var23.field8257.length > var25; ++var25) {
                                                    if (var23.field8257[var25] != -1) {
                                                        class600 var26 = class118.field1510.method3921(var23.field8257[var25], -87);
                                                        if (~var26.field8332 <= -1) {
                                                            var24 = var26.field8332;
                                                        }
                                                    }
                                                }
                                            }
                                            if (~var24 <= -1) {
                                                boolean var27 = false;
                                                if (var24 >= 0) {
                                                    class83 var28 = class506.field6989.method2158(var24, (byte) -123);
                                                    if (var28 != null && var28.field968) {
                                                        var27 = true;
                                                    }
                                                }
                                                int var29 = var14;
                                                int var30 = var20;
                                                if (var27) {
                                                    int[][] var31 = class322.field4302[var21].field8191;
                                                    int var32 = class322.field4302[var21].field8177;
                                                    int var33 = class322.field4302[var21].field8184;
                                                    for (int var34 = 0; ~var34 > -11; ++var34) {
                                                        int var35 = (int) (4.0D * Math.random());
                                                        if (var35 == 0 && var29 > var3 && var14 + -3 < var29 && (var31[var29 + -1 - var32][-var33 + var30] & 2883848) == 0) {
                                                            --var29;
                                                        }
                                                        if (~var35 == -2 && var3 + 104 + -1 > var29 && var14 + 3 > var29 && (2883968 & var31[var29 - var32 + 1][-var33 + var30]) == 0) {
                                                            ++var29;
                                                        }
                                                        if (var35 == 2 && ~var4 > ~var30 && var20 + -3 < var30 && ~(2883842 & var31[-var32 + var29][-var33 + var30 + -1]) == -1) {
                                                            --var30;
                                                        }
                                                        if (~var35 == -4 && ~(var4 + 103) < ~var30 && var20 + 3 > var30 && ~(var31[-var32 + var29][var30 - var33 + 1] & 2883872) == -1) {
                                                            ++var30;
                                                        }
                                                    }
                                                }
                                                class353.field4714[class204.field2744] = var23.field8345;
                                                class685.field9687[class204.field2744] = var29;
                                                class636.field8791[class204.field2744] = var30;
                                                ++class204.field2744;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class448.field5932 != null) {
                        class82.field947.field4445 = 1;
                        class506.field6989.method2155(64, 1024, (byte) 125);
                        for (int var15 = 0; class448.field5932.field8161 > var15; ++var15) {
                            int var16 = class448.field5932.field8156[var15];
                            if (~(var16 >> 28) == ~class408.field5369.field385) {
                                int var17 = ((var16 & 268425620) >> 14) - class125.field1745;
                                int var18 = (var16 & 16383) - class4.field23;
                                if (var17 >= 0 && ~class703.field9886 < ~var17 && var18 >= 0 && ~var18 > ~class431.field5789) {
                                    class378.field5002.method2507(new class37(var15), (byte) -128);
                                } else {
                                    class83 var19 = class506.field6989.method2158(class448.field5932.field8163[var15], (byte) -126);
                                    if (var19.field975 != null && ~(var17 - -var19.field971) <= -1 && class703.field9886 > var17 - -var19.field976 && ~(var19.field978 + var18) <= -1 && ~(var19.field961 + var18) > ~class431.field5789) {
                                        class378.field5002.method2507(new class37(var15), (byte) -126);
                                    }
                                }
                            }
                        }
                        class506.field6989.method2155(64, 128, (byte) 116);
                        class82.field947.field4445 = 2;
                        class82.field947.method1951(116);
                    }
                }
                return true;
            }
        }
    }
}
