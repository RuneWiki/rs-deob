import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class124 extends class17 {

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Z")
    public static boolean field2186 = false;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Lvf;")
    public static class30 field2187 = new class30(5000);

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ltb;IIIII)V")
    public static final void method850(class184 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class193.field3126 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class191.field3084) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class277.field4439 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class109 var14 = class79.field1367[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class95.field1642[var11][var12 + 1][var13] + class95.field1642[var11][var12][var13] + class95.field1642[var11][var12][var13 + 1] + class95.field1642[var11][var12 + 1][var13 + 1]) / 4 - (class95.field1642[arg1][arg2 + 1][arg3] + class95.field1642[arg1][arg2][arg3] + class95.field1642[arg1][arg2][arg3 + 1] + class95.field1642[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class212 var16 = var14.field1957;
                                    if (var16 != null) {
                                        if (var16.field3572.method1209()) {
                                            arg0.method1206(var16.field3572, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3575 != null && var16.field3575.method1209()) {
                                            arg0.method1206(var16.field3575, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1968; var17++) {
                                        class173 var18 = var14.field1961[var17];
                                        if (var18 != null && var18.field2842.method1209() && (var18.field2840 == var12 || var7 == var12) && (var18.field2839 == var13 || var9 == var13)) {
                                            int var19 = var18.field2855 + 1 - var18.field2840;
                                            int var20 = var18.field2843 + 1 - var18.field2839;
                                            arg0.method1206(var18.field2842, (var18.field2840 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2839 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method851(int arg0) {
        field2187 = null;
        if (arg0 != -4398) {
            method853(1);
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V")
    public static final void method852(int arg0, int arg1) {
        if (arg1 != 3204) {
            field2187 = null;
        }
        class134.field2325.method63(0, arg0);
        field2185++;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
    public static final void method853(int arg0) {
        int var1 = class22.field340;
        field2183++;
        int var2 = class144.field2469;
        int var3 = class127.field2244;
        int var4 = class95.field1641;
        int var5 = 6116423;
        class283.method1855(var2, var1, var4, var3, var5);
        class283.method1855(var2 + 1, var1 - -1, var4 - 2, 16, 0);
        class283.method1846(var2 + 1, var1 + 18, var4 - 2, arg0 + var3, 0);
        class290.field4636.method1626(class240.field3949, var2 + 3, var1 - -14, var5, -1);
        int var6 = class48.field839;
        int var7 = class256.field4182;
        for (int var8 = 0; var8 < class275.field4399; var8++) {
            int var9 = 16777215;
            int var10 = (class275.field4399 - var8 - 1) * 15 + var1 + 31;
            if (var2 < var6 && var6 < var2 + var4 && var7 > (var10 - 13) && (var10 + 3) > var7) {
                var9 = 16776960;
            }
            class290.field4636.method1626(class245.method1639((byte) -99, var8), var2 + 3, var10, var9, 0);
        }
        class237.method1573(class127.field2244, class95.field1641, class22.field340, (byte) -23, class144.field2469);
    }
}
