import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class102 extends class503 {

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field1462 = 999999;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "Loe;")
    public static class137 field1459 = new class137();

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lob;")
    public static class521 field1473;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "Lqd;")
    public static class315 field1474;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "S")
    public static short field1475;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
    public static final int method811(int arg0, int arg1) {
        return class368.field5403 != null ? class368.field5403[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)V")
    public final void method747(int arg0, int arg1, byte arg2) {
        if (arg2 != 39) {
            this.field1469 = -37;
        }
        ++field1466;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method812(boolean arg0) {
        field1473 = null;
        if (arg0) {
            field1459 = null;
            field1474 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZIIJZIZZ)V")
    public static final void method813(int arg0, String arg1, String arg2, int arg3, boolean arg4, int arg5, int arg6, long arg7, boolean arg8, int arg9, boolean arg10, boolean arg11) {
        ++field1463;
        if (arg10) {
            class179.method1198((byte) 127);
            if (class121.field1829.equals("")) {
                class182.field2723 = 39;
                return;
            }
        }
        int[] var13 = new int[4];
        for (int var14 = 0; var14 < 3; ++var14) {
            var13[var14] = (int) (9.9999999E7D * Math.random());
        }
        class217 var15 = new class217(128);
        var15.method1545(10, -124);
        var15.method1542((arg11 ? 4 : 0) | (arg8 ? 1 : 0) | (!arg4 ? 0 : 2), -2756);
        var15.method1507(arg7, (byte) -112);
        var15.method1566(true, var13[0]);
        if (arg9 == 19487) {
            var15.method1534(arg1, false);
            var15.method1566(true, var13[1]);
            var15.method1542(class341.field5067, arg9 ^ -18141);
            var15.method1545(arg5, -100);
            var15.method1545(arg6, -78);
            var15.method1566(true, var13[2]);
            var15.method1542(arg0, -2756);
            var15.method1542(arg3, -2756);
            var15.method1566(true, var13[3]);
            var15.method1514(class395.field5880, class471.field6811, 0);
            class217 var16 = new class217(366);
            var16.method1534(arg2, false);
            if (arg10) {
                var16.method1507(class257.method1712(class121.field1829, (byte) -8), (byte) -113);
                try {
                    var16.method1507(Long.parseLong(class99.field1419), (byte) -128);
                } catch (Exception var19) {
                    class182.field2723 = 39;
                    return;
                }
            }
            int var17 = -(var16.field3556 & 7) + 8;
            for (int var18 = 0; ~var18 > ~var17; ++var18) {
                var16.method1545((int) (Math.random() * 255.0D), -112);
            }
            var16.method1535(var13, (byte) 94);
            class71.field1020.field3556 = 0;
            class71.field1020.method1545(!arg10 ? class518.field7553.field1077 : class518.field7556.field1077, -109);
            class71.field1020.method1542(var16.field3556 + 28 - -var15.field3556, -2756);
            class71.field1020.method1542(594, arg9 + -22243);
            class71.field1020.method1545(class224.field3673, arg9 + -19549);
            class71.field1020.method1545(class312.field4691.field6918, -84);
            class224.method1598(-21635, class71.field1020);
            class71.field1020.method1516(var15.field3572, 26818, var15.field3556, 0);
            class71.field1020.method1516(var16.field3572, arg9 + 7331, var16.field3556, 0);
            class182.field2723 = -3;
            class517.field7517 = 0;
            class490.field7043 = 0;
            class197.field3291 = 1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBI)V")
    public final void method748(int arg0, byte arg1, int arg2) {
        ++field1460;
        int var4 = this.field1458 * arg0 >> 12;
        int var5 = this.field1471 * arg2 >> 12;
        int var6 = this.field1470 * arg0 >> 12;
        int var7 = this.field1469 * arg2 >> 12;
        int var8 = this.field1465 * arg0 >> 12;
        int var9 = this.field1467 * arg2 >> 12;
        int var10 = this.field1464 * arg0 >> 12;
        if (arg1 == 25) {
            int var11 = this.field1461 * arg2 >> 12;
            class27.method187(var5, var11, var6, super.field7261, var8, var9, var7, var4, var10, 0);
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(III)V")
    public final void method749(int arg0, int arg1, int arg2) {
        ++field1468;
        if (arg0 != -19475) {
            method814(-106, -103, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIB)V")
    public static final void method814(int arg0, int arg1, byte arg2) {
        int var3 = -37 / ((arg2 - -13) / 61);
        ++field1472;
        class211 var4 = class452.method2749(5, 126, arg1);
        var4.method1463(0);
        var4.field3441 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1470 = arg2;
        this.field1461 = arg7;
        this.field1469 = arg3;
        this.field1464 = arg6;
        this.field1458 = arg0;
        this.field1471 = arg1;
        this.field1467 = arg5;
        this.field1465 = arg4;
    }

    static {
        new class234("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field1473 = new class521(35, 2);
        field1474 = new class315("", 11);
        field1475 = 32767;
    }
}
