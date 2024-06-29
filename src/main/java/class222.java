import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class222 extends class369 {

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Lbd;")
    public static class44 field3392 = new class44("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "Lqt;")
    public static class459 field3394 = new class459(74, -1);

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field3395;

    static {
        new class44("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)I", line = 3)
    public static final int method1506(byte arg0, int arg1) {
        if (arg0 <= 113) {
            return 39;
        } else {
            ++field3391;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIII)V", line = 14)
    public final void method1507(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = -31 % ((24 - arg0) / 54);
        super.field5332 = arg1;
        super.field5323 = arg2;
        super.field5321 = arg3;
        ++field3387;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 27)
    public static final String method1508(int arg0, String arg1) {
        ++field3390;
        String var2 = class6.method16(class512.method2995(arg1, 0), arg0 ^ 93);
        if (var2 == null) {
            var2 = "";
        }
        if (arg0 != -1) {
            field3392 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BF)V", line = 43)
    public final void method1509(byte arg0, float arg1) {
        if (arg0 == -88) {
            super.field5331 = arg1;
            ++field3393;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 54)
    public static void method1510(int arg0) {
        field3392 = null;
        field3394 = null;
        if (arg0 != 0) {
            field3392 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V", line = 68)
    public static final void method1511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3389;
        if (arg4 != 74) {
            method1512(-54, (byte) 84, -72, false);
        }
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class252.method1631(class176.field2630, class465.field6763, arg0 + arg3, arg4 ^ -32);
        int var10 = class252.method1631(class176.field2630, class465.field6763, arg0 - arg3, -20);
        class479.method2839(var9, var10, class271.field4078[arg1], 118, arg2);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg1;
                int var12 = arg1 + var6;
                if (~class424.field5996 >= ~var12 && var11 <= class333.field4936) {
                    int var13 = class252.method1631(class176.field2630, class465.field6763, arg0 + var5, arg4 ^ -6);
                    int var14 = class252.method1631(class176.field2630, class465.field6763, -var5 + arg0, -85);
                    if (var12 <= class333.field4936) {
                        class479.method2839(var13, var14, class271.field4078[var12], arg4 + 52, arg2);
                    }
                    if (var11 >= class424.field5996) {
                        class479.method2839(var13, var14, class271.field4078[var11], 80, arg2);
                    }
                }
            }
            ++var5;
            int var15 = -var5 + arg1;
            int var16 = arg1 - -var5;
            if (~class424.field5996 >= ~var16 && ~var15 >= ~class333.field4936) {
                int var17 = class252.method1631(class176.field2630, class465.field6763, arg0 + var6, arg4 ^ -9);
                int var18 = class252.method1631(class176.field2630, class465.field6763, -var6 + arg0, arg4 + -134);
                if (var16 <= class333.field4936) {
                    class479.method2839(var17, var18, class271.field4078[var16], arg4 + 39, arg2);
                }
                if (class424.field5996 <= var15) {
                    class479.method2839(var17, var18, class271.field4078[var15], 82, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBIZ)V", line = 143)
    public static final void method1512(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field3395;
        if (arg0 >= 8000 && ~arg0 >= -48001) {
            class385.field5498 = arg3;
            class120.field1877 = arg0;
            class87.field1407 = arg2;
            if (arg1 > -63) {
                field3392 = null;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIIF)V", line = 182)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
