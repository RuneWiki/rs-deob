import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class224 extends class54 {

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3438 = new String[] { method1946(method1945("O\u0007\u000fn\u0001")), method1946(method1945("O\u0007\u000fk\u0001")), method1946(method1945("O\u0007\u000ff\u0001")), method1946(method1945("O\u0007\u000fa\u0001")), method1946(method1945("O\u0007\u000fe\u0001")), method1946(method1945("O\u0007\u000fg\u0001")), method1946(method1945("O\u0007\u000fb\u0001")), method1946(method1945("O\u0007\u000fd\u0001")), method1946(method1945("O\u0007\u000f`\u0001")), method1946(method1945("U\u0013MO")), method1946(method1945("@H\u000f\rT")) };

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Ldv;")
    public static class685 field3426 = new class685(15, 0, 1, 0);

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Lwia;")
    public static class790 field3435 = new class790(41, 2);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Lkda;")
    public static class408 field3436;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Llja;")
    public static class743 field3429;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 3)
    public static void method1940(int arg0) {
        try {
            int var1 = 78 / ((arg0 - 61) / 42);
            field3426 = null;
            field3435 = null;
            field3436 = null;
            field3429 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3438[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILjava/lang/String;ZLjava/lang/String;)V", line = 15)
    public static final void method1941(boolean arg0, int arg1, String arg2, boolean arg3, String arg4) {
        try {
            ++field3431;
            if (arg3) {
                class280 var5 = class454.method3475((byte) -104);
                var5.field4197.method1428((byte) -24, class27.field333.field9786);
                var5.field4197.method1406(0, 380332136);
                int var6 = var5.field4197.field2201;
                var5.field4197.method1406(652, 380332136);
                int[] var7 = class477.method3656(-24197, var5);
                int var8 = var5.field4197.field2201;
                var5.field4197.method1464(arg2, 255);
                var5.field4197.method1406(class676.field9805, 380332136);
                var5.field4197.method1464(arg4, 255);
                var5.field4197.method1443(class580.field8597, 255);
                var5.field4197.method1428((byte) -24, class167.field2300);
                var5.field4197.method1428((byte) -24, class447.field6576.field83);
                class638.method4684(74, var5.field4197);
                String var9 = class205.field3172;
                var5.field4197.method1428((byte) -24, var9 != null ? 1 : 0);
                if (var9 != null) {
                    var5.field4197.method1464(var9, 255);
                }
                var5.field4197.method1428((byte) -24, arg1);
                var5.field4197.method1428((byte) -24, arg0 ? 1 : 0);
                var5.field4197.field2201 += 7;
                var5.field4197.method1460(var8, var5.field4197.field2201, var7, false);
                var5.field4197.method1459((byte) 7, -var6 + var5.field4197.field2201);
                class106.method934((byte) 53, var5);
                class545.field8147 = 1;
                class325.field5130 = -3;
                class236.field3560 = 0;
                class388.field5854 = 0;
                if (~arg1 > -14) {
                    class559.field8323 = true;
                    class13.method90((byte) 94);
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field3438[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3438[10] : field3438[9]) + ',' + arg3 + ',' + (arg4 != null ? field3438[10] : field3438[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Z)I", line = 66)
    public final int method1942(boolean arg0) {
        try {
            ++field3433;
            if (arg0) {
                method1941(false, -4, (String) null, false, (String) null);
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3438[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIIIII)V", line = 77)
    public static final void method1943(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class352[] var7 = class708.field10260;
            if (!arg1) {
                field3435 = null;
            }
            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                class352 var9 = var7[var8];
                if (var9 != null && ~var9.field5432 == -3) {
                    class117.method1030(arg5 >> 1, arg0 >> 1, 1, var9.field5429 * 2, var9.field5431, arg4, var9.field5430, var9.field5436, arg3);
                    if (class694.field10139[0] > -1 && class375.field5711 % 20 < 10) {
                        class581 var10 = class715.field10345[var9.field5438];
                        int var11 = class694.field10139[0] - 12 + arg2;
                        int var12 = arg6 + -28 - -class694.field10139[1];
                        var10.method4347(var11, var12);
                        class758.method5495((byte) 50, var12 + var10.method997(), var12, var11 + var10.method988(), var11);
                    }
                }
            }
            ++field3430;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field3438[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lhia;)V", line = 117)
    public class224(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(ILhia;)V", line = 122)
    public class224(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)Z", line = 132)
    public final boolean method1944(int arg0) {
        try {
            ++field3427;
            int var2 = super.field589.method662(-94).method2132(96);
            if (arg0 != -10243) {
                method1940(-14);
            }
            return ~var2 <= -97;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3438[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)I", line = 150)
    public final int method111(boolean arg0) {
        try {
            ++field3432;
            if (arg0) {
                field3436 = null;
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3438[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)I", line = 163)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field3425;
            int var3 = super.field589.method662(-71).method2132(113);
            if (~var3 > -97) {
                return 3;
            } else if (~arg0 < -2 && var3 < 128) {
                return 3;
            } else {
                if (arg1 > -106) {
                    this.method113(93, 12);
                }
                return ~arg0 < -4 && ~var3 > -193 ? 3 : 1;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3438[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V", line = 189)
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            ++field3428;
            if (arg0 != 0) {
                this.method1944(64);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3438[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 201)
    public final void method115(boolean arg0) {
        try {
            ++field3434;
            int var2 = super.field589.method662(52).method2132(100);
            if (~var2 > -97) {
                super.field593 = 0;
            }
            if (~super.field593 < -2 && var2 < 128) {
                super.field593 = 1;
            }
            if (~super.field593 < -3 && ~var2 > -193) {
                super.field593 = 2;
            }
            if (!arg0) {
                method1941(false, 67, (String) null, true, (String) null);
            }
            if (~super.field593 > -1 || ~super.field593 < -4) {
                super.field593 = this.method111(!arg0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3438[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1945(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1946(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
