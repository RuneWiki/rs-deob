import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class416 {

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lnn;")
    public static class151 field6177 = new class151("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!es", name = "d", descriptor = "F")
    public static float field6176;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Lkr;")
    public static class234 field6181;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Ltb;")
    public static class290 field6179;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "[I")
    public static int[] field6182;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public static void method2594(int arg0) {
        if (arg0 == 1) {
            field6182 = null;
            field6179 = null;
            field6181 = null;
            field6177 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIIIIIZI)Z")
    public static final boolean method2595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (arg1 >= -56) {
            return false;
        }
        field6174++;
        int var11 = class265.method1641(arg7, class113.field1500.method911(0), class465.field6846, arg0, class177.field2682, arg2, arg8, class449.field6599[class113.field1500.field1902], arg3, arg6, arg9, arg5, arg10, arg4, (byte) -72);
        if (var11 < 1) {
            return false;
        }
        class8.field80 = class177.field2682[var11 - 1];
        class452.field6685 = class465.field6846[var11 - 1];
        class381.field5557 = false;
        class351.method2111(58);
        return true;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ldr;Z)V")
    public static final void method2596(class261 arg0, boolean arg1) {
        field6175++;
        int var2 = class331.field4957;
        int var3 = class353.field5219;
        int var4 = class331.field4946;
        if (arg1) {
            return;
        }
        int var5 = class258.field3957;
        int var6 = -10660793;
        arg0.method1615(var4, var6, var5, var2, var3, (byte) -119);
        arg0.method1615(var4 - 2, -16777216, 16, var2 + 1, var3 + 1, (byte) -119);
        arg0.method1621(var5 - 19, var2 + 1, -16777216, var3 + 18, -17638, var4 - 2);
        class161.field2244.method873(class302.field4562.method937((byte) 107, class27.field356), 0, var3 + 14, var6, -1, var2 + 3);
        int var7 = class74.field1004.method505((byte) -107);
        int var8 = class74.field1004.method501(110);
        int var9 = 0;
        for (class306 var10 = (class306) class372.field5433.method2514((byte) 61); var10 != null; var10 = (class306) class372.field5433.method2511(-119)) {
            int var11 = var3 + ((class149.field2067 - var9 - 1) * 16) + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < (var2 + var4) && var8 > var11 - 13 && var8 < (var11 + 3) && var10.field4615) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class68.method466(23, var10.field4616)) {
                var13 = class186.field2796.method1106(50, (int) var10.field4626).field2357;
            } else if (class55.method316(126, var10.field4616)) {
                class155 var14 = class170.field2626[(int) var10.field4626];
                if (var14 != null) {
                    class271 var15 = var14.field2137;
                    if (var15.field4100 != null) {
                        var15 = var15.method1684(6);
                    }
                    if (var15 != null) {
                        var13 = var15.field4130;
                    }
                }
            } else if (class238.method1429(var10.field4616, -31)) {
                Object var16 = null;
                class85 var17;
                if (var10.field4616 == 1002) {
                    var17 = class411.method2575(0, (int) var10.field4626);
                } else {
                    var17 = class411.method2575(0, (int) (var10.field4626 >>> 32 & 0x7FFFFFFFL));
                }
                if (var17.field1133 != null) {
                    var17 = var17.method542(6796);
                }
                if (var17 != null) {
                    var13 = var17.field1177;
                }
            }
            String var18 = class324.method1991(var10, -1);
            if (var13 != null) {
                var18 = var18 + class106.method661((byte) -39, var13);
            }
            class161.field2244.method870(class407.field6065, class304.field4590, 0, 0, var2 + 3, var11, var18, var12);
            var9++;
            if (var10.field4622) {
                class153.field2101.method1408(class188.field2828.method1693(-121, var18) + var2 + 5, var11 + -12);
            }
        }
        class296.method1835(class353.field5219, -94, class331.field4957, class258.field3957, class331.field4946);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Ldr;B)V")
    public static final void method2597(class261 arg0, byte arg1) {
        if (class306.field4628) {
            class310.method1893((byte) -32, arg0);
        } else {
            class220.method1337(arg0, true);
        }
        field6178++;
        if (arg1 >= -99) {
            method2594(76);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2598(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6173++;
        if (arg2 != -2) {
            method2594(-31);
        }
        for (int var6 = arg1; var6 <= arg0; var6++) {
            for (int var7 = arg5; var7 <= arg3; var7++) {
                if (class99.field1363[var6][var7] == arg4 && class119.field1571[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
