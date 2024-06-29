import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class86 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field1213 = 1;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILmr;Lmr;IIII)V")
    public static final void method559(int arg0, int arg1, int arg2, int arg3, class145 arg4, class145 arg5, int arg6, int arg7, int arg8, int arg9) {
        field1211++;
        int var10 = arg4.method900((byte) 84);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class234 var12 = (class234) class296.field4486.method1491((long) var10, 0);
        if (var12 == null) {
            class4[] var13 = class4.method26(class427.field6274, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class196.field2965.method378(var13[0], true);
            class296.field4486.method1488(128, (long) var10, var12);
        }
        class88.method579(arg5.field1900, arg5.field1892, arg6, arg5.field1902, arg0 >> 1, arg3 >> 1, arg5.method911(0) * 64, (byte) 74, 0, arg9);
        int var14 = class212.field3189[0] + arg2 - 18;
        int var15 = arg1 / 4 * 18 + var14;
        int var16 = arg8 + class212.field3189[1] - 54 - 16;
        int var17 = arg1 % 4 * 18 + var16;
        var12.method1408(var15, var17);
        if (arg4 == arg5) {
            class196.field2965.method1621(18, var15 - 1, -256, var17 - 1, -17638, 18);
        }
        class236 var18 = class267.method1661(0);
        var18.field3534 = var17 + 16;
        var18.field3538 = arg4;
        var18.field3535 = var15 + 16;
        var18.field3533 = var15;
        int var19 = 45 % ((arg7 + 51) / 34);
        var18.field3539 = var17;
        class303.field4577.method2125(var18, -29983);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method560(int arg0, long arg1) {
        field1209++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else if (arg0 >= -6) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class411.field6124[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
    public static final void method561(int arg0, boolean arg1) {
        field1215++;
        if (arg1) {
            method563(11, 103, 11);
        }
        class43.field541 = arg0;
        class328.field4924.method1485(-22032);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method562(String arg0, boolean arg1) {
        field1214++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class171.method1054(0, arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (!arg1) {
            field1213 = 1;
        }
        while (class433.field6366 > var3) {
            String var4 = class289.field4400[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class171.method1054(0, var4);
            if (var5 != null && var5.equals(var2)) {
                class433.field6366--;
                for (int var6 = var3; var6 < class433.field6366; var6++) {
                    class289.field4400[var6] = class289.field4400[var6 + 1];
                    class246.field3687[var6] = class246.field3687[var6 + 1];
                    class458.field6793[var6] = class458.field6793[var6 + 1];
                    class68.field891[var6] = class68.field891[var6 + 1];
                    class75.field1020[var6] = class75.field1020[var6 + 1];
                }
                class443.field6519++;
                class72.field958 = class172.field2639;
                class177.method1082(class149.field2068, 0);
                class189.field2840.method2366(class386.method2384(-4580, arg0), true);
                class189.field2840.method2375(-88, arg0);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public static final void method563(int arg0, int arg1, int arg2) {
        field1210++;
        int var3 = class113.field1500.field2019[0];
        int var4 = class113.field1500.field2018[0];
        if (class466.field6855 == class17.field253) {
            if (class416.method2595(1, -70, arg2, 0, var3, var4, -2, arg0, 1, false, 0)) {
                return;
            }
            class416.method2595(1, -66, arg2, 0, var3, var4, -3, arg0, 1, false, 0);
        } else if (class416.method2595(1, -114, arg2, 0, var3, var4, -3, arg0, 1, false, 0)) {
            return;
        } else {
            class416.method2595(1, -113, arg2, 0, var3, var4, -2, arg0, 1, false, 0);
        }
        if (arg1 != 22696) {
            method560(-73, 47L);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILiq;)V")
    public static final void method564(int arg0, class134 arg1) {
        field1212++;
        class151.field2091 = 0;
        class414.field6157 = 0;
        class261.field3979 = new class354();
        class6.field66 = new class370[1024];
        if (arg0 == 2129) {
            class85.method555(arg1, true);
            class37.method209(arg1, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            method564(-22, (class134) null);
        }
        for (int var6 = arg4; var6 <= arg5; var6++) {
            class379.method2285(124, class292.field4448[var6], arg1, arg0, arg2);
        }
        field1208++;
    }

    static {
        new class151("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
