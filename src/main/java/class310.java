import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class310 {

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "Z")
    public static boolean field4724 = false;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Loa;")
    public static class489 field4726;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Leh;", line = 7)
    public static final class241 method2028(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6370;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)Lob;", line = 14)
    public static final class517 method2029(int arg0, int arg1, int arg2, int arg3) {
        field4727++;
        class429 var4 = class380.field5761[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class517 var5 = null;
        int var6 = -1;
        if (arg3 > -28) {
            return null;
        }
        for (class166 var7 = var4.field6364; var7 != null; var7 = var7.field2572) {
            class417 var8 = var7.field2576;
            if (var8 instanceof class517) {
                class517 var9 = (class517) var8;
                int var10 = (var9.method1654(91) - 1) * 64 + 60;
                int var11 = var9.field6228 - var10 >> 7;
                int var12 = var9.field6233 - var10 >> 7;
                int var13 = var9.field6228 + var10 >> 7;
                int var14 = var9.field6233 + var10 >> 7;
                if (var11 <= arg1 && arg2 >= var12 && var13 >= arg1 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 77)
    public static final String method2030(byte arg0, String arg1) {
        field4728++;
        String var2 = class451.method2687(true, class20.method168(arg1, false));
        if (arg0 != 26) {
            method2031((byte) 53);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 93)
    public static final void method2031(byte arg0) {
        field4725++;
        class408 var1 = (class408) class431.field6415.method2427(121);
        if (arg0 != -76) {
            method2029(-67, 9, -79, 88);
        }
        while (var1 != null) {
            if (var1.field6120 > 0) {
                var1.field6120--;
            }
            if (var1.field6120 != 0) {
                if (var1.field6125 > 0) {
                    var1.field6125--;
                }
                if (var1.field6125 == 0 && var1.field6126 >= 1 && var1.field6119 >= 1 && class33.field662 - 2 >= var1.field6126 && var1.field6119 <= (class121.field1966 - 2) && (var1.field6121 < 0 || class118.method879((byte) -121, var1.field6118, var1.field6121))) {
                    class448.method2677((byte) -111, -1, var1.field6119, var1.field6126, var1.field6123, var1.field6115, var1.field6118, var1.field6121, var1.field6124);
                    var1.field6125 = -1;
                    if (var1.field6121 == var1.field6116 && var1.field6116 == -1) {
                        var1.method2090(-1);
                    } else if (var1.field6121 == var1.field6116 && var1.field6123 == var1.field6122 && var1.field6128 == var1.field6118) {
                        var1.method2090(-1);
                    }
                }
            } else if (var1.field6116 < 0 || class118.method879((byte) -113, var1.field6128, var1.field6116)) {
                class448.method2677((byte) 77, -1, var1.field6119, var1.field6126, var1.field6122, var1.field6115, var1.field6128, var1.field6116, var1.field6124);
                var1.method2090(-1);
            }
            var1 = (class408) class431.field6415.method2422(-102);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 148)
    public static void method2032(boolean arg0) {
        field4726 = null;
        if (!arg0) {
            field4724 = true;
        }
    }
}
