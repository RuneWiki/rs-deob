import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class307 {

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "Lff;")
    public static class9 field4045 = new class9(1, 0);

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "Lvj;")
    public static class304 field4046 = new class304("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "[I")
    public static int[] field4047 = new int[8];

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field4048;

    static {
        new class304("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZ)V", line = 5)
    public static final void method1780(int arg0, int arg1, boolean arg2) {
        field4042++;
        class32 var3 = class222.method1397(arg2, arg0, false);
        if (var3 != null) {
            for (int var4 = arg1; var4 < var3.field527.length; var4++) {
                var3.field527[var4] = -1;
                var3.field524[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)[B", line = 30)
    public static final synchronized byte[] method1781(byte arg0, int arg1) {
        field4043++;
        if (arg1 == 100 && class490.field6832 > 0) {
            byte[] var2 = class199.field2768[--class490.field6832];
            class199.field2768[class490.field6832] = null;
            return var2;
        } else if (arg1 == 5000 && class52.field808 > 0) {
            byte[] var3 = class224.field3026[--class52.field808];
            class224.field3026[class52.field808] = null;
            return var3;
        } else {
            int var4 = -107 / ((arg0 + 35) / 58);
            if (arg1 == 30000 && class195.field2714 > 0) {
                byte[] var5 = class289.field3784[--class195.field2714];
                class289.field3784[class195.field2714] = null;
                return var5;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V", line = 68)
    public static void method1782(int arg0) {
        field4045 = null;
        if (arg0 > 124) {
            field4047 = null;
            field4046 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lcr;Lea;IIIIBJI)V", line = 84)
    public static final void method1783(class403 arg0, class381 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, long arg7, int arg8) {
        field4048++;
        int var10 = arg3 * arg3 + arg5 * arg5;
        if (((long) var10) > arg7) {
            return;
        }
        int var11 = -70 / ((arg6 + 12) / 43);
        int var12 = Math.min(arg0.field5450 / 2, arg0.field5404 / 2);
        if (var10 <= (var12 * var12)) {
            class482.method2778(arg8, arg0, arg5, class373.field5039[arg2], arg4, arg1, true, arg3);
            return;
        }
        var12 -= 10;
        int var13;
        if (class42.field623 == 4) {
            var13 = (int) class184.field2621 & 0x3FFF;
        } else {
            var13 = (int) class184.field2621 + class361.field4871 & 0x3FFF;
        }
        int var14 = class305.field4019[var13];
        int var15 = class305.field4022[var13];
        if (class42.field623 != 4) {
            var15 = var15 * 256 / (class514.field7589 + 256);
            var14 = var14 * 256 / (class514.field7589 + 256);
        }
        int var16 = arg3 * var15 + arg5 * var14 >> 15;
        int var17 = arg5 * var15 - (arg3 * var14) >> 15;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) (Math.sin(var18) * (double) var12);
        int var21 = (int) (Math.cos(var18) * (double) var12);
        class91.field1387[arg2].method3113((float) arg0.field5450 / 2.0F + (float) arg8 + (float) var20, (float) arg0.field5404 / 2.0F + (float) arg4 + (float) (-var21), 4096, (int) (-var18 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIBII)V", line = 135)
    public static final void method1784(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (class219 var5 = (class219) class201.field2786.method1672((byte) -107); var5 != null; var5 = (class219) class201.field2786.method1668(-1)) {
            class458.method2611(arg0, arg1, -1, var5, arg4, arg3);
        }
        if (arg2 >= -104) {
            field4046 = null;
        }
        field4041++;
        for (class219 var6 = (class219) class225.field3039.method1672((byte) -122); var6 != null; var6 = (class219) class225.field3039.method1668(-1)) {
            byte var11 = 1;
            class20 var12 = var6.field2954.method2600(56);
            if (var6.field2954.field6217) {
                var11 = 0;
            } else if (var6.field2954.field6172 == var12.field337 || var6.field2954.field6172 == var12.field333 || var6.field2954.field6172 == var12.field340 || var6.field2954.field6172 == var12.field370) {
                var11 = 2;
            } else if (var6.field2954.field6172 == var12.field339 || var6.field2954.field6172 == var12.field373 || var6.field2954.field6172 == var12.field357 || var6.field2954.field6172 == var12.field324) {
                var11 = 3;
            }
            if (var6.field2946 != var11) {
                int var13 = class302.method1760(-115, var6.field2954);
                if (var6.field2968 != var13) {
                    if (var6.field2959 != null) {
                        class318.field4175.method3070(var6.field2959);
                        var6.field2959 = null;
                    }
                    var6.field2968 = var13;
                }
                var6.field2946 = var11;
            }
            var6.field2958 = var6.field2954.field584;
            var6.field2951 = var6.field2954.field584 + (var6.field2954.method2590(0) << 6);
            var6.field2950 = var6.field2954.field574;
            var6.field2960 = var6.field2954.field574 + (var6.field2954.method2590(0) << 6);
            class458.method2611(arg0, arg1, -1, var6, arg4, arg3);
        }
        for (class219 var7 = (class219) class368.field4965.method181((byte) -70); var7 != null; var7 = (class219) class368.field4965.method179(1)) {
            byte var8 = 1;
            class20 var9 = var7.field2964.method2600(72);
            if (var7.field2964.field6217) {
                var8 = 0;
            } else if (var7.field2964.field6172 == var9.field337 || var7.field2964.field6172 == var9.field333 || var7.field2964.field6172 == var9.field340 || var7.field2964.field6172 == var9.field370) {
                var8 = 2;
            } else if (var7.field2964.field6172 == var9.field339 || var7.field2964.field6172 == var9.field373 || var7.field2964.field6172 == var9.field357 || var7.field2964.field6172 == var9.field324) {
                var8 = 3;
            }
            if (var7.field2946 != var8) {
                int var10 = class378.method2182((byte) -59, var7.field2964);
                if (var7.field2968 != var10) {
                    if (var7.field2959 != null) {
                        class318.field4175.method3070(var7.field2959);
                        var7.field2959 = null;
                    }
                    var7.field2968 = var10;
                }
                var7.field2946 = var8;
            }
            var7.field2958 = var7.field2964.field584;
            var7.field2951 = var7.field2964.field584 + (var7.field2964.method2590(0) << 6);
            var7.field2950 = var7.field2964.field574;
            var7.field2960 = var7.field2964.field574 + (var7.field2964.method2590(0) << 6);
            class458.method2611(arg0, arg1, -1, var7, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lcr;B)Z", line = 252)
    public static final boolean method1785(class403 arg0, byte arg1) {
        if (arg1 != 94) {
            return false;
        }
        field4044++;
        if (client.field2728 == arg0.field5468) {
            class265.field3500 = 250;
            return true;
        } else {
            return false;
        }
    }
}
