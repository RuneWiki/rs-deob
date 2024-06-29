import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class126 {

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lig;")
    public static class136 field2089 = new class136(new byte[5000]);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lci;III)V")
    public static final void method923(class60 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class129.field2127) {
            class129 var4 = class26.field455[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2133 != null && var4.field2133.field3973.method468()) {
                arg0.method465(var4.field2133.field3973, 128, 0, 0, true);
            }
        }
        if (arg3 < class129.field2127) {
            class129 var5 = class26.field455[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2133 != null && var5.field2133.field3973.method468()) {
                arg0.method465(var5.field2133.field3973, 0, 0, 128, true);
            }
        }
        if (arg2 < class129.field2127 && arg3 < class130.field2161) {
            class129 var6 = class26.field455[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2133 != null && var6.field2133.field3973.method468()) {
                arg0.method465(var6.field2133.field3973, 128, 0, 128, true);
            }
        }
        if (arg2 < class129.field2127 && arg3 > 0) {
            class129 var7 = class26.field455[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2133 != null && var7.field2133.field3973.method468()) {
                arg0.method465(var7.field2133.field3973, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V")
    public static final void method924(boolean arg0, int arg1) {
        byte var2 = 4;
        byte[][] var3 = class216.field3474;
        int var4 = var3.length;
        field2091++;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var12 = null;
            int var13 = class268.field4291[var5] & 0xFF;
            int var14 = class268.field4291[var5] >> 8;
            byte[] var15 = var3[var5];
            int var16 = var13 * 64 - class170.field2787;
            int var17 = var14 * 64 - class256.field4082;
            if (var15 != null) {
                class260.method1738(true);
                var12 = class269.method1831(var15, class141.field2352, class170.field2787, class256.field4082, 107, arg0, var16, var17);
            }
            if (!arg0 && (class33.field551 / 8) == var14 && (class111.field1716 / 8) == var13) {
                if (var12 == null) {
                    class1.field2 = -1;
                } else {
                    class180.field2999 = var12[4];
                    class142.field2354 = var12[3];
                    class1.field2 = var12[0];
                    class240.field3781 = var12[2];
                    class107.field1632 = var12[1];
                }
            }
        }
        int var6 = 0;
        int var7 = -70 % ((arg1 + 23) / 42);
        while (var6 < var4) {
            int var8 = (class268.field4291[var6] >> 8) * 64 - class256.field4082;
            byte[] var9 = var3[var6];
            int var10 = (class268.field4291[var6] & 0xFF) * 64 - class170.field2787;
            if (var9 == null && class111.field1716 < 800) {
                class260.method1738(true);
                for (int var11 = 0; var11 < var2; var11++) {
                    class48.method414(var11, var8, 64, var10, 1, 64);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method925(int arg0) {
        field2089 = null;
        if (arg0 != 1555) {
            method925(31);
        }
    }
}
