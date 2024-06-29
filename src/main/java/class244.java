import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class244 {

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field4045 = 0;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Lbd;")
    public static class162 field4051 = class17.method142(0, " <col=00ff80>");

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field4047 = 50;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "[I")
    public static int[] field4048 = new int[5];

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "[I")
    public static int[] field4049 = new int[field4047];

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "[I")
    public static int[] field4058 = new int[field4047];

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "[I")
    public static int[] field4063 = new int[field4047];

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "Lbd;")
    public static class162 field4062 = class17.method142(0, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
    public static int[] field4050 = new int[field4047];

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Lbd;")
    public static class162 field4053 = class17.method142(0, "");

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "[I")
    public static int[] field4064 = new int[field4047];

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Lbd;")
    public static class162 field4060 = class17.method142(0, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lbd;")
    public static class162 field4046 = field4053;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Lbd;")
    public static class162 field4057 = field4053;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "[I")
    public static int[] field4059 = new int[field4047];

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "[I")
    public static int[] field4054 = new int[field4047];

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "[Lbd;")
    public static class162[] field4061 = new class162[field4047];

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lda;")
    public static class143 field4052;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "Z")
    public static boolean field4065;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V", line = 34)
    public static final void method1724(int arg0, int arg1) {
        if (arg1 <= 114) {
            field4045 = -50;
        }
        class63 var2 = class46.method332(2, arg0, -12770);
        var2.method427(-22507);
        field4056++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 47)
    public static void method1725(int arg0) {
        field4046 = null;
        field4059 = null;
        field4051 = null;
        field4060 = null;
        field4052 = null;
        field4058 = null;
        field4054 = null;
        field4057 = null;
        field4063 = null;
        field4062 = null;
        field4048 = null;
        field4053 = null;
        field4050 = null;
        if (arg0 == 5) {
            field4049 = null;
            field4061 = null;
            field4064 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V", line = 88)
    public static final void method1726(int arg0, int arg1) {
        class225 var2 = class288.field4856[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class225 var4 = class288.field4856[var3][arg0][arg1] = class288.field4856[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3773--;
                for (int var5 = 0; var5 < var4.field3756; var5++) {
                    class43 var6 = var4.field3765[var5];
                    if ((var6.field697 >> 29 & 0x3L) == 2L && var6.field711 == arg0 && var6.field699 == arg1) {
                        var6.field705--;
                    }
                }
            }
        }
        if (class288.field4856[0][arg0][arg1] == null) {
            class288.field4856[0][arg0][arg1] = new class225(0, arg0, arg1);
        }
        class288.field4856[0][arg0][arg1].field3761 = var2;
        class288.field4856[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)V", line = 156)
    public static final void method1727(byte arg0, int arg1) {
        class63 var2 = class46.method332(9, arg1, -12770);
        field4066++;
        if (arg0 <= 71) {
            method1728(-103, -60, -27, 112, true, 0.9005667F, -122, 106, 87);
        }
        var2.method427(-22507);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIZFIII)[[I", line = 178)
    public static final int[][] method1728(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5, int arg6, int arg7, int arg8) {
        field4055++;
        class7 var9 = new class7();
        var9.field60 = (int) (arg5 * 4096.0F);
        var9.field70 = arg3;
        var9.field62 = arg7;
        var9.field82 = arg4;
        var9.field73 = arg1;
        int[][] var10 = new int[arg6][arg2];
        var9.method39((byte) 22);
        class260.method1795(arg8 + 19324, arg2, arg6);
        if (arg8 != -10497) {
            field4047 = 89;
        }
        for (int var11 = 0; var11 < arg6; var11++) {
            var9.method45(var10[var11], var11, 140534700);
        }
        return var10;
    }
}
