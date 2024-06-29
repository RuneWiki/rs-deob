import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class80 {

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1128 = new String[] { method799(method798("zHwIC")), method799(method798("zHwLC")), method799(method798("zHwNC")), method799(method798("zHwOC")), method799(method798("cY5a")), method799(method798("v\u0002w#\u0016")), method799(method798("zHwHC")) };

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[I")
    public static int[] field1121 = new int[6];

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lsb;")
    public static class261 field1122 = new class261(26, 3);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Lpi;")
    public static class217 field1124;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lpi;")
    public static class217 field1125 = field1124 = new class217(false);

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Luu;")
    public static class240 field1126 = new class240(4, 1);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "F")
    public static float field1127;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZII)I")
    public static final int method793(boolean arg0, int arg1, int arg2) {
        try {
            field1119++;
            if (!arg0) {
                field1122 = null;
            }
            int var3 = arg1 - 1 & arg2 >> 31;
            return (arg2 + (arg2 >>> 31)) % arg1 + var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1128[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
    public static final int method794(int arg0) {
        try {
            field1120++;
            if (class86.field1217) {
                return 6;
            } else if (class44.field639 == null) {
                return 0;
            } else {
                int var1 = class44.field639.field3311;
                if (class711.method5124(arg0 + 11404, var1)) {
                    return 1;
                } else if (class279.method2274(var1, (byte) -120)) {
                    return 2;
                } else if (class572.method4258((byte) -61, var1)) {
                    return 3;
                } else if (class161.method1354(var1, 2353)) {
                    return 4;
                } else {
                    if (arg0 != 7) {
                        method794(61);
                    }
                    if (class738.method5357(var1, arg0 - 5)) {
                        return 7;
                    } else if (var1 == 21) {
                        return 8;
                    } else {
                        return 5;
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1128[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method795(byte arg0) {
        try {
            field1121 = null;
            field1126 = null;
            field1125 = null;
            field1122 = null;
            int var1 = -117 % ((7 - arg0) / 37);
            field1124 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1128[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLjc;)Lsca;")
    public static final class667 method796(byte arg0, class711 arg1) {
        try {
            field1118++;
            String var2 = arg1.method5144(-16414);
            class252 var3 = class750.method5433((byte) 124)[arg1.method5128(0)];
            if (arg0 <= 75) {
                field1127 = 1.425203F;
            }
            class657 var4 = class240.method1988(79)[arg1.method5128(0)];
            int var5 = arg1.method5087((byte) -26);
            int var6 = arg1.method5087((byte) -26);
            int var7 = arg1.method5128(0);
            int var8 = arg1.method5128(0);
            int var9 = arg1.method5128(0);
            int var10 = arg1.method5116((byte) -108);
            int var11 = arg1.method5116((byte) -105);
            int var12 = arg1.method5113(18443);
            int var13 = arg1.method5113(18443);
            int var14 = arg1.method5113(18443);
            return new class667(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field1128[6] + arg0 + ',' + (arg1 == null ? field1128[4] : field1128[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method797(byte arg0) {
        try {
            if (arg0 != -75) {
                field1124 = null;
            }
            field1123++;
            class524.field7641 = 0;
            class369.field5339 = 0;
            class140.field1819 = 0;
            class650.field9233 = 0;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1128[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method798(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method799(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
