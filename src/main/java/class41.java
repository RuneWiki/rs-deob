import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class41 {

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field479 = 0;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "Lgca;")
    public static class227 field476 = new class227();

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Ltb;")
    public static class365 field482 = new class365();

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field484 = 0;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field483 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lmu;")
    public static class272 field477;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILr;ILvda;Lwp;Z)Z", line = 4)
    public static final boolean method361(int arg0, class166 arg1, int arg2, class165 arg3, class163 arg4, boolean arg5) {
        field480++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field2366 != null) {
            var9 = class510.field7014 - (arg3.field2403 + arg4.field2343 - class510.field6997) * (class510.field7014 - class510.field6999) / (class510.field6998 - class510.field6997);
            var8 = class510.field7014 - ((class510.field7014 - class510.field6999) * (arg3.field2388 + arg4.field2343 - class510.field6997) / (class510.field6998 - class510.field6997));
            var6 = (arg3.field2380 + arg4.field2344 - class510.field6993) * (class510.field6994 - class510.field6996) / (class510.field7008 - class510.field6993) + class510.field6996;
            var7 = (arg3.field2411 + arg4.field2344 - class510.field6993) * (class510.field6994 - class510.field6996) / (class510.field7008 - class510.field6993) + class510.field6996;
        }
        class702 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field2405 != -1) {
            if (arg4.field2340 && arg3.field2396 != -1) {
                var10 = arg3.method1153(-13665, true, arg1);
            } else {
                var10 = arg3.method1153(-13665, false, arg1);
            }
            if (var10 != null) {
                var11 = arg4.field2339 - (var10.method1660() + 1 >> 1);
                var12 = arg4.field2339 + (var10.method1660() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg4.field2341 - (var10.method1661() + 1 >> 1);
                var14 = arg4.field2341 + (var10.method1661() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class215 var15 = null;
        if (!arg5) {
            field479 = -127;
        }
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field2406 != null) {
            var15 = class362.method2066((byte) -105, arg3.field2379);
            if (var15 != null) {
                var16 = class166.field2419.method1739(null, null, class442.field6114, arg3.field2406, false);
                int var23 = arg4.field2341;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1382() / 2;
                } else {
                    var17 = var23 - ((var10.method1661() >> 1) + (var15.method1384() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class442.field6114[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1381(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field2339 + arg0 - var18 / 2;
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg4.field2339 + arg0;
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = arg2 + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg2 + var15.method1384() * var16 + var17;
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class510.field6996 || class510.field6994 < var6 || class510.field6999 > var9 || var8 > class510.field7014) {
            return true;
        }
        if (arg3.field2366 != null) {
            int[] var27 = new int[arg3.field2366.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg3.field2366[var28 * 2] + arg4.field2344;
                int var31 = arg3.field2366[var28 * 2 + 1] + arg4.field2343;
                var27[var28 * 2] = (class510.field6994 - class510.field6996) * (var30 - class510.field6993) / (class510.field7008 - class510.field6993) + class510.field6996;
                var27[var28 * 2 + 1] = class510.field7014 - ((class510.field7014 - class510.field6999) * (var31 - class510.field6997) / (class510.field6998 - class510.field6997));
            }
            class642.method3575(arg1, var27, arg3.field2383);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg1.method1175(var27[var29 * 2 + 1], arg3.field2369, var27[var29 * 2], var27[var29 * 2 + 2], var27[(var29 + 1) * 2 + 1], 25821);
            }
            arg1.method1175(var27[var27.length - 1], arg3.field2369, var27[var27.length - 2], var27[0], var27[1], 25821);
        }
        if (var10 != null) {
            if (class657.field9137 > 0 && (class496.field6752 != -1 && class496.field6752 == arg4.field2338 || class675.field9530 != -1 && class675.field9530 == arg3.field2409)) {
                int var32;
                if (class593.field8304 <= 50) {
                    var32 = class593.field8304 * 2;
                } else {
                    var32 = 200 - (class593.field8304 * 2);
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg1.method1174(var33, var10.method1658() / 2 + 7, arg4.field2341, arg4.field2339, 1);
                arg1.method1174(var33, var10.method1658() / 2 + 5, arg4.field2341, arg4.field2339, 1);
                arg1.method1174(var33, var10.method1658() / 2 + 3, arg4.field2341, arg4.field2339, 1);
                arg1.method1174(var33, var10.method1658() / 2 + 1, arg4.field2341, arg4.field2339, 1);
                arg1.method1174(var33, var10.method1658() / 2, arg4.field2341, arg4.field2339, 1);
            }
            var10.method3927(arg4.field2339 - (var10.method1660() >> 1), arg4.field2341 + -(var10.method1661() >> 1));
        }
        if (arg3.field2406 != null && var15 != null) {
            class44.method374(arg4, (byte) -44, arg3, var17, var18, var16, var15, arg1);
        }
        if (arg3.field2405 != -1 || arg3.field2406 != null) {
            class69 var34 = new class69(arg4);
            var34.field930 = var19;
            var34.field936 = var11;
            var34.field931 = var13;
            var34.field937 = var21;
            var34.field935 = var22;
            var34.field941 = var20;
            var34.field934 = var12;
            var34.field939 = var14;
            class40.field470.method1441(var34, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B[[I)V", line = 221)
    public static final void method362(byte arg0, int[][] arg1) {
        class344.field4599 = arg1;
        if (arg0 < 47) {
            field477 = null;
        }
        field478++;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BC)Z", line = 232)
    public static final boolean method363(byte arg0, char arg1) {
        field481++;
        if (arg0 >= -92) {
            field483 = null;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 248)
    public static void method364(byte arg0) {
        field477 = null;
        field483 = null;
        field482 = null;
        if (arg0 < 76) {
            method363((byte) -17, (char) 65470);
        }
        field476 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Lml;", line = 269)
    public static final class353 method365(int arg0, int arg1, int arg2) {
        class390 var3 = class295.field4051[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5533;
    }
}
