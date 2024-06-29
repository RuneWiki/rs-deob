import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class287 {

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public int field4472 = -1;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field4456 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[Z")
    public static boolean[] field4455 = new boolean[200];

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Z")
    public static boolean field4461 = true;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field4467 = 0;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field4476 = 500;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field4474 = 0;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public int field4459;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public int field4460;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public int field4464;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public int field4466;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public int field4479;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "Lck;")
    public static class1 field4471;

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "[I")
    public static int[] field4477;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "[I")
    public static int[] field4478;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)I")
    public static final int method1927(int arg0, byte arg1) {
        field4458++;
        if (arg1 < 86) {
            method1929(true, (String) null);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 + arg2;
        field4462++;
        int var8 = arg4 - arg2;
        if (arg6 != 0) {
            return;
        }
        int var9 = arg2 + arg3;
        int var10 = arg5 - arg2;
        for (int var11 = arg0; var11 < var7; var11++) {
            class76.method463(arg3, 0, arg1, arg5, class268.field3919[var11]);
        }
        for (int var12 = arg4; var12 > var8; var12--) {
            class76.method463(arg3, arg6, arg1, arg5, class268.field3919[var12]);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class268.field3919[var13];
            class76.method463(arg3, 0, arg1, var9, var14);
            class76.method463(var10, 0, arg1, arg5, var14);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1929(boolean arg0, String arg1) {
        field4475++;
        client.field4449 = arg1;
        if (class115.field1592.field664 == null) {
            return;
        }
        try {
            if (!arg0) {
                String var2 = class115.field1592.field664.getParameter("cookieprefix");
                String var3 = class115.field1592.field664.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg1.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class178.method1161(class86.method509(false) + 94608000000L, (byte) 24) + "; Max-Age=" + 94608000L;
                }
                class208.method1329(132, class115.field1592.field664, "document.cookie=\"" + var5 + "\"");
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method1930(int arg0) {
        field4477 = null;
        field4455 = null;
        if (arg0 != -25890) {
            field4476 = -52;
        }
        field4478 = null;
        field4471 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILoe;ILtl;ILgl;)V")
    public static final void method1931(int arg0, int arg1, int arg2, class54 arg3, int arg4, class240 arg5, int arg6, class273 arg7) {
        field4463++;
        class116 var8 = new class116();
        var8.field1615 = arg1 * arg4;
        var8.field1607 = arg2 * 128;
        var8.field1623 = arg6;
        if (arg7 != null) {
            var8.field1620 = arg7.field4056;
            var8.field1616 = arg7.field4054;
            var8.field1609 = arg7.field4018;
            var8.field1621 = arg7.field4025 * 128;
            var8.field1630 = arg7;
            var8.field1612 = arg7.field4067;
            var8.field1618 = arg7.field4007;
            int var10 = arg7.field4023;
            int var11 = arg7.field4008;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg7.field4023;
                var10 = arg7.field4008;
            }
            var8.field1603 = (arg4 + var11) * 128;
            var8.field1624 = (arg2 + var10) * 128;
            if (arg7.field3991 != null) {
                var8.field1626 = true;
                var8.method750(101);
            }
            if (var8.field1609 != null) {
                var8.field1611 = var8.field1620 + (int) (Math.random() * (double) (var8.field1618 - var8.field1620));
            }
            class72.field865.method1522(var8, arg1 - 5);
        } else if (arg3 != null) {
            var8.field1627 = arg3;
            class267 var9 = arg3.field636;
            if (var9.field3884 != null) {
                var8.field1626 = true;
                var9 = var9.method1707(-1);
            }
            if (var9 != null) {
                var8.field1624 = (var9.field3858 + arg2) * 128;
                var8.field1603 = (var9.field3858 + arg4) * 128;
                var8.field1612 = class290.method1943(arg1 - 129, arg3);
                var8.field1621 = var9.field3875 * 128;
                var8.field1616 = var9.field3889;
            }
            class254.field3665.method1522(var8, -64);
        } else if (arg5 != null) {
            var8.field1617 = arg5;
            var8.field1603 = (arg4 + arg5.method1556(3888)) * 128;
            var8.field1624 = (arg2 + arg5.method1556(3888)) * 128;
            var8.field1612 = class116.method745(arg1 - 128, arg5);
            var8.field1616 = arg5.field3491;
            var8.field1621 = arg5.field3475 * 128;
            class60.field715.method1894(-1, var8, class60.method370((byte) -8, arg5.field3466));
            return;
        }
    }
}
