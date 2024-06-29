import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class14 {

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[I")
    public static int[] field184 = new int[32];

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lrd;")
    public static class185 field185;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ltq;")
    public static class376 field178;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[[I")
    public static int[][] field182;

    static {
        new class362("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZI)V", line = 12)
    public static final void method101(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class435 var5 = (class435) class273.field3872.method506((byte) -128);
        if (!arg3) {
            field178 = null;
        }
        while (var5 != null) {
            class263.method1751(arg2, arg1, arg4, arg0, var5, (byte) -85);
            var5 = (class435) class273.field3872.method514(arg3);
        }
        field181++;
        for (class435 var6 = (class435) class138.field1713.method506((byte) -128); var6 != null; var6 = (class435) class138.field1713.method514(true)) {
            byte var11 = 1;
            class306 var12 = var6.field6265.method2526(4);
            if (var6.field6265.field5613) {
                var11 = 0;
            } else if (var6.field6265.field5640 == var12.field4335 || var6.field6265.field5640 == var12.field4320 || var6.field6265.field5640 == var12.field4330 || var6.field6265.field5640 == var12.field4342) {
                var11 = 2;
            } else if (var6.field6265.field5640 == var12.field4290 || var6.field6265.field5640 == var12.field4319 || var6.field6265.field5640 == var12.field4311 || var6.field6265.field5640 == var12.field4309) {
                var11 = 3;
            }
            if (var6.field6252 != var11) {
                int var13 = class217.method1452(var6.field6265, (byte) -111);
                if (var6.field6249 != var13) {
                    if (var6.field6263 != null) {
                        class399.field5694.method1137(var6.field6263);
                        var6.field6263 = null;
                    }
                    var6.field6249 = var13;
                }
                var6.field6252 = var11;
            }
            var6.field6246 = var6.field6265.field3284;
            var6.field6247 = var6.field6265.field3284 + (var6.field6265.method242(-30129) * 64);
            var6.field6255 = var6.field6265.field3269;
            var6.field6269 = var6.field6265.field3269 + (var6.field6265.method242(-30129) * 64);
            class263.method1751(arg2, arg1, arg4, arg0, var6, (byte) -85);
        }
        for (class435 var7 = (class435) class11.field150.method1884(0); var7 != null; var7 = (class435) class11.field150.method1890(-1)) {
            byte var8 = 1;
            class306 var9 = var7.field6256.method2526(4);
            if (var7.field6256.field5613) {
                var8 = 0;
            } else if (var7.field6256.field5640 == var9.field4335 || var7.field6256.field5640 == var9.field4320 || var7.field6256.field5640 == var9.field4330 || var7.field6256.field5640 == var9.field4342) {
                var8 = 2;
            } else if (var7.field6256.field5640 == var9.field4290 || var7.field6256.field5640 == var9.field4319 || var7.field6256.field5640 == var9.field4311 || var7.field6256.field5640 == var9.field4309) {
                var8 = 3;
            }
            if (var7.field6252 != var8) {
                int var10 = class130.method808(var7.field6256, (byte) 72);
                if (var7.field6249 != var10) {
                    if (var7.field6263 != null) {
                        class399.field5694.method1137(var7.field6263);
                        var7.field6263 = null;
                    }
                    var7.field6249 = var10;
                }
                var7.field6252 = var8;
            }
            var7.field6246 = var7.field6256.field3284;
            var7.field6247 = var7.field6256.field3284 + var7.field6256.method242(-30129) * 64;
            var7.field6255 = var7.field6256.field3269;
            var7.field6269 = var7.field6256.field3269 + var7.field6256.method242(-30129) * 64;
            class263.method1751(arg2, arg1, arg4, arg0, var7, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lp;", line = 125)
    public static final class119 method102(int arg0, int arg1, int arg2) {
        if (arg0 > -108) {
            field185 = null;
        }
        field183++;
        class119 var3 = new class119();
        var3.field1466 = -1;
        var3.field1455 = -1;
        var3.field1459 = arg2 + 1 + 5;
        var3.field1465 = arg1 + 6;
        var3.field1468 = new int[var3.field1465][var3.field1459];
        var3.method741(false);
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILon;IZ)V", line = 145)
    public static final void method103(int arg0, class184 arg1, int arg2, boolean arg3) {
        field179++;
        class143.field1756 = arg2;
        class62.field721 = arg1;
        if (arg3) {
            class250.field3561 = arg0;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)V", line = 158)
    public static final void method104(int arg0, int arg1, int arg2) {
        field180++;
        class20 var3 = class369.method2351((byte) 85, arg0, arg1);
        var3.method146(106);
        var3.field252 = arg2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 176)
    public static void method105(boolean arg0) {
        if (!arg0) {
            field178 = null;
        }
        field178 = null;
        field182 = null;
        field184 = null;
        field185 = null;
    }
}
