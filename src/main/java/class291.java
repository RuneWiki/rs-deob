import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class291 extends class497 {

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4111 = new String[] { method2362(method2361("`6yq`")), method2362(method2361("`6yr`")), method2362(method2361("`6ys`")), method2362(method2361("`6yu`")), method2362(method2361("`6yp`")), method2362(method2361("`6yt`")), method2362(method2361("`6y~`")), method2362(method2361("`6yw`")) };

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "J")
    public static long field4101 = -1L;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field4106 = -1;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "J")
    public static long field4104;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (arg0 <= -70) {
                ++field4107;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4111[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static final void method2357(int arg0) {
        try {
            ++field4103;
            class476 var1 = class60.field916.field11099;
            while (var1.method3686((byte) -112, class60.field916.field11105) >= 15) {
                int var2 = var1.method3677(-67, 15);
                if (~var2 == -32768) {
                    break;
                }
                boolean var3 = false;
                class527 var4 = (class527) class479.field7063.method3693(false, (long) var2);
                if (var4 == null) {
                    class717 var5 = new class717();
                    var5.field2200 = var2;
                    var4 = new class527(var5);
                    class479.field7063.method3691(var4, (long) var2, -1);
                    class677.field9494[class715.field10182++] = var4;
                    var3 = true;
                }
                class717 var6 = var4.field7672;
                class343.field4987[class438.field6458++] = var2;
                var6.field2232 = class118.field1504;
                if (var6.field10229 != null && var6.field10229.method1169((byte) -71)) {
                    class249.method2028(var6, -2997);
                }
                int var7 = var1.method3677(-120, 5);
                if (~var7 < -16) {
                    var7 -= 32;
                }
                int var8 = var1.method3677(-61, 1);
                int var9 = var1.method3677(-101, 1);
                if (var9 == 1) {
                    class90.field1258[class225.field3274++] = var2;
                }
                int var10 = var1.method3677(-110, 2);
                var6.method5200(class321.field4379.method600(-90, var1.method3677(-95, 14)), -1);
                int var11 = var1.method3677(-121, 5);
                if (var11 > 15) {
                    var11 -= 32;
                }
                int var12 = 15597 & 4 + var1.method3677(-119, 3) << 11;
                var6.method1445(var6.field10229.field1717, 4978);
                var6.field2231 = var6.field10229.field1702 << 3;
                if (var3) {
                    var6.method1436(2, true, var12);
                }
                var6.method5205(class203.field2988.field2252[0] + var7, var6.method1437((byte) -28), ~var8 == -2, -12595, class203.field2988.field2256[0] + var11, var10);
                if (var6.field10229.method1169((byte) -114)) {
                    class54.method568((class339) null, var6.field2256[0], 0, var6.field2252[0], var6, (class789) null, var6.field2981, false);
                }
            }
            var1.method3681(-94);
            int var13 = -67 % ((arg0 - -7) / 53);
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field4111[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
    public static final void method2358(boolean arg0, int arg1) {
        try {
            class100.method978(-1);
            ++field4108;
            int var2 = class640.field9099.method1940(-15568, arg1).field1831;
            if (~var2 != -1) {
                int var3 = class734.field10459.field7178[arg1];
                if (arg0) {
                    if (~var2 == -6) {
                        class753.field10766 = var3;
                    }
                    if (~var2 == -7) {
                        class524.field7642 = var3;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4111[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(ILpp;)V")
    public class291(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lpp;)V")
    public class291(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            if (arg0 != 64) {
                field4104 = 7L;
            }
            ++field4102;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4111[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                field4106 = 87;
            }
            ++field4109;
            return 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4111[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                field4104 = 12L;
            }
            ++field4110;
            return 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4111[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
    public static final void method2359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            class335.field4844 = arg3;
            ++field4105;
            class557.field8113 = arg4;
            class50.field717 = arg0;
            class507.field7453 = arg2;
            if (arg1 != 4) {
                field4104 = 49L;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4111[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
    public final int method2360(int arg0) {
        try {
            ++field4100;
            return arg0 != 3 ? 116 : super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4111[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2361(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2362(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
