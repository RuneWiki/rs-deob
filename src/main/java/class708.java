import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class708 {

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10265 = new String[] { method5169(method5168("VVW]w\u000b")), method5169(method5168("VVW]u\u000b")), method5169(method5168("VVW]t\u000b")), method5169(method5168("VVW]r\u000b")) };

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public static int field10262 = 0;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "[Lb;")
    public static class352[] field10260 = new class352[8];

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "D")
    public static double field10261;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field10259;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field10264;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
    public static final void method5164(byte arg0) {
        try {
            field10264++;
            class115.method1013(true, class69.field740);
            class31.field361++;
            if (class177.field2460 && class199.field3115) {
                int var1 = 0;
                if (arg0 != -94) {
                    method5164((byte) -64);
                }
                int var2 = 0;
                if (class235.field3549) {
                    var1 = class398.method3141(1);
                    var2 = class779.method5635((byte) 32);
                }
                int var3 = var1 + class606.field8875.method401(16428);
                int var4 = var2 + class606.field8875.method391((byte) 94);
                int var5 = var4 - class322.field5074;
                int var6 = var3 - class491.field7041;
                if (class190.field2583 > var6) {
                    var6 = class190.field2583;
                }
                if (class190.field2583 + class533.field7816.field8029 < var6 - -class69.field740.field8029) {
                    var6 = class190.field2583 + class533.field7816.field8029 - class69.field740.field8029;
                }
                if (class651.field9416 > var5) {
                    var5 = class651.field9416;
                }
                if (class651.field9416 + class533.field7816.field8045 < class69.field740.field8045 + var5) {
                    var5 = class651.field9416 + class533.field7816.field8045 - class69.field740.field8045;
                }
                int var7 = var6 + class533.field7816.field8014 - class190.field2583;
                int var8 = class533.field7816.field7957 + var5 - class651.field9416;
                if (class606.field8875.method1145((byte) -117)) {
                    if (class69.field740.field8001 < class31.field361) {
                        int var9 = var6 - class219.field3392;
                        int var10 = var5 - class491.field7037;
                        if (class69.field740.field7932 < var9 || (-class69.field740.field7932) > var9 || var10 > class69.field740.field7932 || (-class69.field740.field7932) > var10) {
                            class338.field5270 = true;
                        }
                    }
                    if (class69.field740.field8106 != null && class338.field5270) {
                        class86 var11 = new class86();
                        var11.field957 = class69.field740.field8106;
                        var11.field959 = class69.field740;
                        var11.field956 = var7;
                        var11.field961 = var8;
                        class782.method5663(var11);
                        return;
                    }
                } else {
                    if (class338.field5270) {
                        class431.method3305(-1);
                        if (class69.field740.field8060 != null) {
                            class86 var12 = new class86();
                            var12.field959 = class69.field740;
                            var12.field956 = var7;
                            var12.field961 = var8;
                            var12.field957 = class69.field740.field8060;
                            var12.field970 = class677.field9834;
                            class782.method5663(var12);
                        }
                        if (class677.field9834 != null && client.method2672(class69.field740) != null) {
                            class355.method2907(class69.field740, (byte) -82, class677.field9834);
                        }
                    } else if ((class74.field864 == 1 || class370.method2987((byte) -18)) && class593.field8707 > 2) {
                        class660.method4838(-19416, class491.field7041 + class219.field3392, class491.field7037 + class322.field5074);
                    } else if (class761.method5509(-13078)) {
                        class660.method4838(arg0 ^ 0x4B8A, class491.field7041 + class219.field3392, class491.field7037 + class322.field5074);
                    }
                    class69.field740 = null;
                }
            } else if (class31.field361 > 1) {
                class69.field740 = null;
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field10265[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public static void method5165(int arg0) {
        try {
            if (arg0 != 31138) {
                method5165(-101);
            }
            field10260 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10265[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V")
    public static final void method5166(boolean arg0) {
        try {
            field10259++;
            if (!class540.field7914) {
                class402.field5996 += (-class402.field5996 - 12.0F) / 2.0F;
                if (arg0) {
                    field10260 = null;
                }
                class540.field7914 = true;
                class597.field8773 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10265[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)V")
    public static final void method5167(byte arg0, int arg1) {
        try {
            int var2 = 16 % ((-arg0 - 21) / 60);
            field10263++;
            class313 var3 = class196.method1670((long) arg1, 4, -14);
            var3.method2635(true);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10265[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5168(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ufa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5169(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
