import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public int field531 = 0;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "[Lcf;")
    public static class93[] field536 = null;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field537 = 0;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Ltg;")
    public static class181 field538 = null;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Ldh;")
    public static class120 field530;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lfl;")
    public static final class240 method197(int arg0, int arg1) {
        if (arg0 > -108) {
            method198(5);
        }
        field532++;
        class240 var2 = (class240) class137.field2395.method302((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1418.method1271(class199.method1428(arg1, -1407770776), -2154, class80.method552(19, arg1));
        class240 var4 = new class240();
        var4.field4318 = arg1;
        if (var3 != null) {
            var4.method1633(-96, new class280(var3));
        }
        var4.method1626(-12734);
        if (var4.field4286) {
            var4.field4329 = false;
            var4.field4274 = 0;
        }
        if (!class249.field4484 && var4.field4291) {
            var4.field4331 = null;
        }
        class137.field2395.method297((long) arg1, var4, 10414);
        return var4;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method198(int arg0) {
        field538 = null;
        int var1 = 23 / ((-arg0 - 55) / 58);
        field536 = null;
        field530 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BI)Z")
    public static final boolean method199(byte[] arg0, int arg1) {
        class280 var2 = new class280(arg0);
        field534++;
        int var3 = var2.method1907(16832);
        if (arg1 != var3) {
            return false;
        }
        boolean var4 = var2.method1907(16832) == 1;
        if (var4) {
            class6.method28(var2, 28);
        }
        class78.method544(arg1 ^ 0xFFFFFFFE, var2);
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILee;I)V")
    private final void method200(int arg0, class280 arg1, int arg2) {
        if (arg0 != 0) {
            field536 = null;
        }
        if (arg2 == 5) {
            this.field531 = arg1.method1891(-114);
        }
        field535++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIIILgl;IZJ)Z")
    public static final boolean method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class211 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class270.field4815 == class233.field4151;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class210.field3821 || var24 >= class256.field4623) {
                    return false;
                }
                class41 var25 = class232.field4138[arg0][var15][var24];
                if (var25 != null && var25.field645 >= 5) {
                    return false;
                }
            }
        }
        class229 var16 = new class229();
        var16.field4094 = arg11;
        var16.field4108 = arg0;
        var16.field4109 = arg5;
        var16.field4102 = arg6;
        var16.field4107 = arg7;
        var16.field4104 = arg8;
        var16.field4096 = arg9;
        var16.field4095 = arg1;
        var16.field4099 = arg2;
        var16.field4100 = arg1 + arg3 - 1;
        var16.field4110 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class232.field4138[var22][var17][var20] == null) {
                        class232.field4138[var22][var17][var20] = new class41(var22, var17, var20);
                    }
                }
                class41 var23 = class232.field4138[arg0][var17][var20];
                var23.field637[var23.field645] = var16;
                var23.field634[var23.field645] = var21;
                var23.field648 |= var21;
                var23.field645++;
                if (var13 && class162.field2863[var17][var20] != 0) {
                    var14 = class162.field2863[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class162.field2863[var18][var19] == 0) {
                        class162.field2863[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class251.field4509[class24.field306++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lee;I)V")
    public final void method202(class280 arg0, int arg1) {
        field529++;
        while (true) {
            int var3 = arg0.method1907(16832);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field536 = null;
                    return;
                }
            }
            this.method200(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(JB)V")
    public static final void method203(long arg0, byte arg1) {
        field533++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 >= -116) {
            field536 = null;
        }
        for (int var3 = 0; var3 < class145.field2567; var3++) {
            if (class284.field5095[var3] == arg0) {
                class63.field1131++;
                class145.field2567--;
                for (int var4 = var3; var4 < class145.field2567; var4++) {
                    class171.field3004[var4] = class171.field3004[var4 + 1];
                    class220.field3999[var4] = class220.field3999[var4 + 1];
                    class210.field3825[var4] = class210.field3825[var4 + 1];
                    class284.field5095[var4] = class284.field5095[var4 + 1];
                    class24.field296[var4] = class24.field296[var4 + 1];
                    class267.field4745[var4] = class267.field4745[var4 + 1];
                }
                class9.field128 = class193.field3542;
                class285.field5105.method1568(135, (byte) 118);
                class285.field5105.method1882(arg0, (byte) -126);
                return;
            }
        }
    }
}
