import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class543 extends class177 {

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Lja;")
    public static class254 field7581 = new class254(1, 2, 2, 0);

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lsb;")
    public static class266 field7583 = new class266(22, 3);

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
    public static int[] field7584 = new int[14];

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field7573;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field7574;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field7575;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field7577;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public int field7579;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public int field7582;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Ljava/lang/String;")
    public String field7576;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lvr;Z)Z")
    public static final boolean method3127(class122 arg0, boolean arg1) {
        boolean var2 = class697.field9813 == class485.field6947;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method529(-1);
        if (arg0.field2220 < 0 || arg0.field2230 < 0 || arg0.field2227 >= class520.field7369 || arg0.field2222 >= class107.field1852) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field2220; var7 <= arg0.field2227; var7++) {
            for (int var11 = arg0.field2230; var11 <= arg0.field2222; var11++) {
                class370 var12 = class43.method570(arg0.field9814, var7, var11);
                if (var12 != null) {
                    class636 var13 = class474.method2837(arg0, 76);
                    class636 var14 = var12.field5497;
                    if (var14 == null) {
                        var12.field5497 = var13;
                    } else {
                        while (var14.field9171 != null) {
                            var14 = var14.field9171;
                        }
                        var14.field9171 = var13;
                    }
                    if (var2 && (class125.field2257[var7][var11] & 0xFF000000) != 0) {
                        var3 = class125.field2257[var7][var11];
                        var4 = class177.field2893[var7][var11];
                        var5 = class6.field501[var7][var11];
                    }
                    if (!arg1 && var12.field5494 != null && var12.field5494.field3319 > var6) {
                        var6 = var12.field5494.field3319;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field2220; var8 <= arg0.field2227; var8++) {
                for (int var9 = arg0.field2230; var9 <= arg0.field2222; var9++) {
                    if ((class125.field2257[var8][var9] & 0xFF000000) == 0) {
                        class125.field2257[var8][var9] = var3;
                        class177.field2893[var8][var9] = var4;
                        class6.field501[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class228.field3422[class200.field3106++] = arg0;
        } else {
            int var10 = class697.field9813 == class485.field6947 ? 1 : 0;
            if (!arg0.method522((byte) -36)) {
                class7.field513[var10][class575.field8353[var10]++] = arg0;
            } else if (arg0.method524(73)) {
                class368.field5462[var10][class43.field1090[var10]++] = arg0;
            } else {
                class148.field2552[var10][class338.field5048[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field9809 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIII)V")
    public static final void method3128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7572++;
        class19 var5 = class373.method2355(92, arg3, 10);
        var5.method432(99);
        if (arg0 < 76) {
            field7584 = null;
        }
        var5.field829 = arg2;
        var5.field827 = arg1;
        var5.field833 = arg4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
    public static final void method3129(boolean arg0, int arg1) {
        field7580++;
        class92.field1679++;
        class275 var2 = class185.method1355(arg1 ^ arg1, class127.field2322, class395.field5772);
        class140.method1141(var2, 19321);
        for (class601 var3 = (class601) class78.field1572.method2597((byte) 51); var3 != null; var3 = (class601) class78.field1572.method2594((byte) -122)) {
            if (!var3.method2589(arg1 - 8294)) {
                var3 = (class601) class78.field1572.method2597((byte) 80);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field8611 == 0) {
                class101.method937((byte) -71, arg0, true, var3);
            }
        }
        if (class265.field3940 != null) {
            class531.method3088(class265.field3940, (byte) 42);
            class265.field3940 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZZI)V")
    public static final void method3130(boolean arg0, boolean arg1, int arg2) {
        if (arg1) {
            class110.field1984--;
            if (class110.field1984 == 0) {
                class410.field5946 = null;
            }
        }
        field7578++;
        if (arg0) {
            class29.field935--;
            if (class29.field935 == 0) {
                class492.field7038 = null;
            }
        }
        if (arg2 < 65) {
            method3128(-1, 60, -10, 117, 26);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method3131(int arg0) {
        field7583 = null;
        field7584 = null;
        field7581 = null;
        if (arg0 != 6327) {
            method3127(null, false);
        }
    }
}
