import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class173 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[I")
    public static int[] field2564 = new int[2];

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[I")
    public static int[] field2571;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
    public static int[] field2567;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[I")
    public static int[] field2568;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "[I")
    public static int[] field2572;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field2574;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[I")
    public static int[] field2575;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "[I")
    public static int[] field2576;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lnj;")
    public static class162 field2569;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2566;

    static {
        new class466("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field2570 = -1;
        field2573 = 50;
        field2571 = new int[field2573];
        field2567 = new int[field2573];
        field2568 = new int[field2573];
        field2572 = new int[field2573];
        field2574 = new String[field2573];
        field2575 = new int[field2573];
        field2576 = new int[field2573];
        field2569 = new class162(4);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 3)
    public static void method1123(int arg0) {
        field2576 = null;
        field2572 = null;
        field2569 = null;
        if (arg0 != -5217) {
            return;
        }
        field2571 = null;
        field2568 = null;
        field2575 = null;
        field2567 = null;
        field2574 = null;
        field2564 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)Z", line = 25)
    public static final boolean method1124(boolean arg0) {
        for (int var1 = class354.field5189; var1 < class253.field3523; var1++) {
            class486[][] var2 = class89.field1305[var1];
            for (int var3 = -class110.field1656; var3 <= 0; var3++) {
                int var4 = class368.field5398 + var3;
                int var5 = class368.field5398 - var3;
                if (var4 >= class214.field2997 || var5 < class127.field1887) {
                    for (int var6 = -class110.field1656; var6 <= 0; var6++) {
                        int var7 = class403.field5916 + var6;
                        int var8 = class403.field5916 - var6;
                        if (var4 >= class214.field2997) {
                            if (var7 >= class149.field2153) {
                                class486 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7109) {
                                    class209.field2912 = arg0;
                                    class361.field5270.method2154(var9, -4093);
                                    class361.field5270.method2156(5000);
                                }
                            }
                            if (var8 < class526.field7780) {
                                class486 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7109) {
                                    class209.field2912 = arg0;
                                    class361.field5270.method2154(var10, -4093);
                                    class361.field5270.method2156(5000);
                                }
                            }
                        }
                        if (var5 < class127.field1887) {
                            if (var7 >= class149.field2153) {
                                class486 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7109) {
                                    class209.field2912 = arg0;
                                    class361.field5270.method2154(var11, -4093);
                                    class361.field5270.method2156(5000);
                                }
                            }
                            if (var8 < class526.field7780) {
                                class486 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7109) {
                                    class209.field2912 = arg0;
                                    class361.field5270.method2154(var12, -4093);
                                    class361.field5270.method2156(5000);
                                }
                            }
                        }
                        if (class294.field4053 == 0) {
                            if (class211.field2948) {
                                class361.field5270.method2164((byte) -3, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIZIII)V", line = 134)
    public static final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field2565++;
        class12 var10 = null;
        for (class12 var11 = (class12) class438.field6435.method2818((byte) 105); var11 != null; var11 = (class12) class438.field6435.method2820((byte) -58)) {
            if (var11.field189 == arg9 && var11.field190 == arg8 && var11.field191 == arg7 && var11.field187 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class12();
            var10.field191 = arg7;
            var10.field190 = arg8;
            var10.field187 = arg3;
            var10.field189 = arg9;
            if (arg8 >= 0 && arg7 >= 0 && arg8 < class527.field7799 && class422.field6182 > arg7) {
                class65.method562(var10, 0);
            }
            class438.field6435.method2809(var10, 2);
        }
        var10.field188 = arg5;
        var10.field175 = arg0;
        var10.field184 = arg4;
        var10.field179 = arg1;
        if (!arg6) {
            method1125(-111, 39, -115, -40, 61, -116, false, -125, -1, 112);
        }
        var10.field185 = arg2;
    }
}
