import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class523 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lba;")
    public static class607 field7289 = new class607(8);

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field7290 = 0;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field7293;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field7292;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
    public static int[] field7291;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
    public static final void method2921(int arg0, int arg1) {
        field7285++;
        int var2 = class7.field61 - class189.field2447;
        if (arg0 != -1) {
            return;
        }
        if (var2 >= 100) {
            class621.field8952 = 1;
            return;
        }
        int var3 = (int) class568.field7951;
        if (var3 < (class610.field8773 >> 8)) {
            var3 = class610.field8773 >> 8;
        }
        if (class126.field1570[4] && var3 < class167.field2120[4] + 128) {
            var3 = class167.field2120[4] + 128;
        }
        int var4 = (int) class521.field7250 + class491.field6868 & 0x3FFF;
        class594.method3426((var3 >> 3) * 3 + 600 << 2, -973436530, var3, class21.field301, var4, class223.field2859, arg1, class341.method2147(class187.field2407, class147.field1899.field6362, 0, class147.field1899.field6368) - 200);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class434.field5901 = (int) ((float) (class434.field5901 - class591.field8542) * var5 + (float) class591.field8542);
        class186.field2364 = (int) ((float) (class186.field2364 - class356.field4984) * var5 + (float) class356.field4984);
        class196.field2555 = (int) ((float) (class196.field2555 - class126.field1567) * var5 + (float) class126.field1567);
        class627.field9131 = (int) ((float) (class627.field9131 - class358.field5002) * var5 + (float) class358.field5002);
        int var6 = class60.field838 - class89.field1182;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class60.field838 = (int) ((float) var6 * var5 + (float) class89.field1182);
        class60.field838 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[BI[BIIIII)V")
    public static final void method2922(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7288++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        int var11 = -arg4;
        if (arg8 > -29) {
            field7292 = null;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg3[var10001] = (byte) (arg3[var10001] - arg1[arg6++]);
                int var14 = arg5++;
                arg3[var14] = (byte) (arg3[var14] - arg1[arg6++]);
                int var15 = arg5++;
                arg3[var15] = (byte) (arg3[var15] - arg1[arg6++]);
                int var16 = arg5++;
                arg3[var16] = (byte) (arg3[var16] - arg1[arg6++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg3[var10001] = (byte) (arg3[var10001] - arg1[arg6++]);
            }
            arg5 += arg0;
            arg6 += arg2;
            var11++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZII)B")
    public static final byte method2923(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field7289 = null;
        }
        field7284++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public static void method2924(int arg0) {
        field7292 = null;
        field7289 = null;
        if (arg0 != 0) {
            method2923(true, -18, 101);
        }
        field7293 = null;
        field7291 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lfu;Z)Z")
    public static final boolean method2925(class450 arg0, boolean arg1) {
        boolean var2 = class501.field6947 == class353.field4949;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method143(true);
        if (arg0.field6361 < 0 || arg0.field6359 < 0 || arg0.field6357 >= class260.field3211 || arg0.field6367 >= class541.field7566) {
            return false;
        }
        for (int var6 = arg0.field6361; var6 <= arg0.field6357; var6++) {
            for (int var9 = arg0.field6359; var9 <= arg0.field6367; var9++) {
                class563 var10 = class423.method2492(arg0.field6358, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field6361) {
                        var11++;
                    }
                    if (var6 < arg0.field6357) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field6359) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field6367) {
                        var11 += 2;
                    }
                    class15 var12 = class436.method2533(var11, arg0, -19523);
                    class15 var13 = var10.field7894;
                    if (var13 == null) {
                        var10.field7894 = var12;
                    } else {
                        while (var13.field158 != null) {
                            var13 = var13.field158;
                        }
                        var13.field158 = var12;
                    }
                    var10.field7892 = (byte) (var10.field7892 | var11);
                    if (var2 && (class558.field7819[var6][var9] & 0xFF000000) != 0) {
                        var3 = class558.field7819[var6][var9];
                        var4 = class599.field8649[var6][var9];
                        var5 = class596.field8593[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field6361; var7 <= arg0.field6357; var7++) {
                for (int var8 = arg0.field6359; var8 <= arg0.field6367; var8++) {
                    if ((class558.field7819[var7][var8] & 0xFF000000) == 0) {
                        class558.field7819[var7][var8] = var3;
                        class599.field8649[var7][var8] = var4;
                        class596.field8593[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class315.field4364[class548.field7628++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2926(int arg0, String arg1) {
        field7286++;
        int var2 = arg1.length();
        int var3 = arg0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class373.method2274(false, arg1.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BIIII)V")
    public static final void method2927(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7287++;
        class632 var5 = class641.method3699(-126, 8, arg2);
        var5.method3656(0);
        var5.field9203 = arg3;
        var5.field9198 = arg1;
        if (arg0 != -60) {
            method2924(106);
        }
        var5.field9197 = arg4;
    }

    static {
        new class344("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
    }
}
