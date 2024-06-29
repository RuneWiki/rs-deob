import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class231 extends class324 {

    @OriginalMember(owner = "client!we", name = "r", descriptor = "S")
    public static short field3602 = 256;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[Z")
    public static boolean[] field3605 = new boolean[100];

    @OriginalMember(owner = "client!we", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3608 = new String[100];

    @OriginalMember(owner = "client!we", name = "z", descriptor = "Ll;")
    public static class66 field3610 = new class66(64);

    @OriginalMember(owner = "client!we", name = "A", descriptor = "[Lhg;")
    public static class162[] field3611 = new class162[14];

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)Z", line = 8)
    public static final boolean method1730(int arg0, int arg1) {
        if (arg0 > -58) {
            method1734(false);
        }
        field3601++;
        return arg1 == 4 || arg1 == 8;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V", line = 20)
    public static final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class283.method2059(arg0, class133.field2235[arg3], (byte) 88, arg4 + arg2, -arg2 + arg4);
        int var6 = arg5;
        field3607++;
        if (arg1 != 538023297) {
            field3602 = -97;
        }
        int var7 = arg5 * arg5;
        int var8 = 0;
        int var9 = arg2 * arg2;
        int var10 = var7 << 1;
        int var11 = var9 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var9 + var10;
        int var14 = var9 << 2;
        int var15 = var7 << 2;
        int var16 = var7 - ((var12 - 1) * var11);
        int var17 = ((var8 << 1) + 3) * var10;
        int var18 = (arg5 - 1) * var14;
        int var19 = ((arg5 << 1) - 3) * var11;
        int var20 = (var8 + 1) * var15;
        while (var6 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var8++;
                    var13 += var17;
                    var16 += var20;
                    var17 += var15;
                    var20 += var15;
                }
            }
            if (var16 < 0) {
                var13 += var17;
                var17 += var15;
                var16 += var20;
                var20 += var15;
                var8++;
            }
            var16 += -var19;
            var13 += -var18;
            var18 -= var14;
            var6--;
            int var21 = arg3 - var6;
            int var22 = arg3 + var6;
            var19 -= var14;
            int var23 = arg4 - var8;
            int var24 = arg4 + var8;
            class283.method2059(arg0, class133.field2235[var21], (byte) 102, var24, var23);
            class283.method2059(arg0, class133.field2235[var22], (byte) 90, var24, var23);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIB)Ljava/lang/String;", line = 109)
    public static final String method1732(boolean arg0, int arg1, byte arg2) {
        field3604++;
        if (arg2 >= -104) {
            field3611 = (class162[]) null;
        }
        return arg0 && arg1 >= 0 ? class154.method1267(10, arg1, 10, arg0) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;", line = 131)
    public static final String[] method1733(String arg0, int arg1, char arg2) {
        field3603++;
        int var3 = class268.method1964(true, arg2, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = arg1; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 164)
    public static void method1734(boolean arg0) {
        if (!arg0) {
            method1733((String) null, -95, (char) 65471);
        }
        field3610 = null;
        field3608 = null;
        field3605 = null;
        field3611 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IC)Z", line = 189)
    public static final boolean method1735(int arg0, char arg1) {
        if (arg0 != -18360) {
            return true;
        }
        field3606++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }
}
