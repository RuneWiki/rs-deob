import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class70 {

    @OriginalMember(owner = "client!td", name = "k", descriptor = "J")
    public long field1408 = 0L;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field1411 = 0;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
    public static int[] field1406 = new int[] { 0, 0, -2, 0, 0, -1, 0, 8, 0, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 24, 8, 8, 0, 7, 2, 0, 0, 0, 0, 0, -2, 0, 0, 8, 0, -2, 0, 0, 0, 8, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, -2, -1, 0, 0, 0, 12, 0, 2, 0, 12, 0, -1, 0, -1, 6, 0, 0, 0, 6, 0, 3, 0, 6, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 10, 0, 0, 5, 0, 0, 0, 0, 0, 3, 15, 0, 5, 3, 15, -1, 0, 0, 6, -1, 0, 0, 0, 0, 0, 0, 10, -2, -2, 0, -1, 0, 0, 1, 5, 0, 10, 20, 0, 4, 0, 0, 0, 0, -2, -2, -2, 0, 4, 0, -1, -2, -2, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 14, 0, 6, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 6, 0, 0, 14, 0, 0, 6, 1, 0, -1, 3, 2, 0, 0, 0, 0, -1, 3, -1, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 6, 5, 0, 0, 0, 4, 9, 0, 0, 0, 6, -1, 2, 7, 0, 0, 5, 0, 5, 1, 10, 2, 0, 0, 0, 0, -2, 0, 0, 0, -1, 0, 4, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 10 };

    @OriginalMember(owner = "client!td", name = "t", descriptor = "Lbb;")
    public static class88 field1417 = null;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Loh;")
    public static class263 field1420 = class253.method1681(-123, " <col=ffff00>");

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lnj;")
    public class139 field1398;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
    public static int[] field1409;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "[Lca;")
    public static class253[] field1415;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method446(int arg0, int arg1) {
        field1404++;
        if (!class166.method1090((byte) 32, arg1)) {
            return;
        }
        int var2 = 19 / ((60 - arg0) / 60);
        class21[] var3 = class164.field2974[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class21 var5 = var3[var4];
            if (var5 != null) {
                var5.field614 = 0;
                var5.field535 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method447(int arg0) {
        field1409 = null;
        field1415 = null;
        field1406 = null;
        field1417 = null;
        if (arg0 == 32428) {
            field1420 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
    public static final String method448(Throwable arg0, boolean arg1) throws IOException {
        field1421++;
        if (!arg1) {
            method446(124, -88);
        }
        String var2;
        if ((arg0 instanceof class207)) {
            class207 var3 = (class207) arg0;
            arg0 = var3.field3753;
            var2 = var3.field3748 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Z")
    public static final boolean method449(int arg0, int arg1) {
        if (arg1 != 4595) {
            field1415 = null;
        }
        field1401++;
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3;
        field1419++;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg2 - arg4;
        int var12 = arg7 - arg4;
        int var13 = arg2 * arg2;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = arg7 << 1;
        int var20 = var15 << 1;
        int var21 = var12 << 1;
        int var22 = var14 << 1;
        int var23 = (1 - var19) * var13 + var22;
        int var24 = var16 - ((var21 - 1) * var20);
        int var25 = (1 - var21) * var15 + var17;
        int var26 = var14 - (var19 - 1) * var18;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var16 << 2;
        int var30 = (var19 - 3) * var18;
        int var31 = var14 << 2;
        int var32 = var31;
        int var33 = (var21 - 3) * var20;
        int var34 = var17 * 3;
        int var35 = var22 * 3;
        int var36 = var29;
        if (class11.field249 <= arg1 && class276.field4831 >= arg1) {
            int[] var37 = class38.field870[arg1];
            int var38 = class98.method672(-257, class198.field3587, arg6 - arg2, class51.field1099);
            int var39 = class98.method672(arg3 ^ 0xFFFFFEFF, class198.field3587, arg2 + arg6, class51.field1099);
            int var40 = class98.method672(-257, class198.field3587, arg6 - var11, class51.field1099);
            int var41 = class98.method672(-257, class198.field3587, arg6 + var11, class51.field1099);
            class191.method1255(var38, arg5, var40, 97, var37);
            class191.method1255(var40, arg0, var41, 65, var37);
            class191.method1255(var41, arg5, var39, 119, var37);
        }
        int var42 = (var12 - 1) * var28;
        int var43 = (arg7 - 1) * var27;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var26 += var32;
                    var8++;
                    var32 += var31;
                    var23 += var35;
                    var35 += var31;
                }
            }
            if (var26 < 0) {
                var23 += var35;
                var8++;
                var26 += var32;
                var35 += var31;
                var32 += var31;
            }
            var9--;
            int var45 = arg1 + var9;
            var26 += -var30;
            var30 -= var27;
            var23 += -var43;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var24 += var36;
                        var36 += var29;
                        var10++;
                        var25 += var34;
                        var34 += var29;
                    }
                }
                if (var24 < 0) {
                    var10++;
                    var25 += var34;
                    var24 += var36;
                    var34 += var29;
                    var36 += var29;
                }
                var24 += -var33;
                var33 -= var28;
                var25 += -var42;
                var42 -= var28;
            }
            var43 -= var27;
            int var46 = arg1 - var9;
            if (class11.field249 <= var45 && class276.field4831 >= var46) {
                int var47 = class98.method672(-257, class198.field3587, arg6 + var8, class51.field1099);
                int var48 = class98.method672(-257, class198.field3587, arg6 - var8, class51.field1099);
                if (var44) {
                    int var49 = class98.method672(-257, class198.field3587, arg6 + var10, class51.field1099);
                    int var50 = class98.method672(-257, class198.field3587, arg6 - var10, class51.field1099);
                    if (var46 >= class11.field249) {
                        int[] var51 = class38.field870[var46];
                        class191.method1255(var48, arg5, var50, 70, var51);
                        class191.method1255(var50, arg0, var49, 81, var51);
                        class191.method1255(var49, arg5, var47, 122, var51);
                    }
                    if (class276.field4831 >= var45) {
                        int[] var52 = class38.field870[var45];
                        class191.method1255(var48, arg5, var50, 87, var52);
                        class191.method1255(var50, arg0, var49, arg3 + 59, var52);
                        class191.method1255(var49, arg5, var47, 78, var52);
                    }
                } else {
                    if (class11.field249 <= var46) {
                        class191.method1255(var48, arg5, var47, arg3 ^ 0x50, class38.field870[var46]);
                    }
                    if (class276.field4831 >= var45) {
                        class191.method1255(var48, arg5, var47, 76, class38.field870[var45]);
                    }
                }
            }
        }
    }
}
