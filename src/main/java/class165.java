import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class165 extends class54 {

    @OriginalMember(owner = "client!g", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2281 = new String[] { method1477(method1476("\u0018m\u001b\u0017")), method1477(method1476("\u0018m\u0018\u0017")), method1477(method1476("\u0018m\u001e\u0017")), method1477(method1476("\u0018m\u0015\u0017")), method1477(method1476("\u0018m\u0014\u0017")), method1477(method1476("\u001160S")), method1477(method1476("\u0018m\u001d\u0017")), method1477(method1476("\u0004mr\u00117")), method1477(method1476("\u0018m\u001a\u0017")), method1477(method1476("Dc\u0011^2R\u0002;Zw")), method1477(method1476("\u001c,3T#\u001a3.Z,\u0016;")), method1477(method1476("Dc*Z8\f*3QwNx|O+\u000b+a\u0010q_'3R+\u0016-a")), method1477(method1476("Dc\u0019G:\u001619Lw")), method1477(method1476("\u0018m\u001f\u0017")), method1477(method1476("\f&(K#\u0011$/\u0002")), method1477(method1476("\u001b,?J'\u001a-(\u0011)\u0010,7V/Ba")), method1477(method1476("Dc\u0019G:\u001619Lw++)\u0013jOrqu+\u0011nm\u0006}Ocl\u000fpOsf\u000fz_\u0004\u0011kq_\u000e=Gg>$9\u0002z")), method1477(method1476("\u001c,3T#\u001a+3L>")), method1477(method1476("\u0018m\u0019\u0017")) };

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lel;")
    public static class573 field2278 = new class573(91, 8);

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ILhia;)V")
    public class165(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLha;)V")
    public static final void method1471(boolean arg0, class66 arg1) {
        try {
            ++field2272;
            if (class12.field142 != class225.field3446.field6200) {
                if (class734.field10683 != null) {
                    if (class124.method1076(arg1, class225.field3446.field6200, (byte) 86)) {
                        class12.field142 = class225.field3446.field6200;
                    }
                    if (!arg0) {
                        method1473(false, 57);
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2281[6] + arg0 + ',' + (arg1 != null ? field2281[7] : field2281[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (~super.field593 != -2 && super.field593 != 0) {
                super.field593 = this.method111(false);
            }
            ++field2280;
            if (!arg0) {
                this.method113(-29, -99);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2281[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1472(int arg0, String arg1) {
        try {
            ++field2275;
            class335.field5229 = arg1;
            if (class629.field9206 != null) {
                try {
                    String var2 = class629.field9206.getParameter(field2281[10]);
                    String var3 = class629.field9206.getParameter(field2281[17]);
                    String var4 = var2 + field2281[14] + arg1 + field2281[11] + var3;
                    String var5;
                    if (arg1.length() == arg0) {
                        var5 = var4 + field2281[16];
                    } else {
                        var5 = var4 + field2281[12] + class361.method2936(94608000000L + class430.method3299(124), (byte) -13) + field2281[9] + 94608000L;
                    }
                    class600.method4459(field2281[15] + var5 + "\"", class629.field9206, arg0 + 114);
                } catch (Throwable var7) {
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field2281[13] + arg0 + ',' + (arg1 != null ? field2281[7] : field2281[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    public static final void method1473(boolean arg0, int arg1) {
        try {
            ++field2276;
            if (~class138.field1645 == -8) {
                if (~class251.field3897 == -1 && class545.field8147 == 0) {
                    if (!arg0) {
                        class591.field8684 = arg1;
                        class86.method728(9, (byte) -96);
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2281[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public static void method1474(int arg0) {
        try {
            field2278 = null;
            if (arg0 != -1) {
                field2278 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2281[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            ++field2273;
            return arg0 ? -77 : 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2281[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lhia;)V")
    public class165(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                method1474(-51);
            }
            ++field2277;
            return 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2281[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)I")
    public final int method1475(boolean arg0) {
        try {
            ++field2274;
            if (arg0) {
                field2278 = null;
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2281[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                method1472(-41, (String) null);
            }
            ++field2279;
            super.field593 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2281[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!g", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1476(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!g", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1477(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
