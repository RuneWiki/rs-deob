import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class121 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public int field2003 = 0;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public int field2006 = 2048;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public int field2011 = 2048;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public int field2005 = 0;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Lsk;")
    public static class423 field2009 = new class423("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "Lpm;")
    public static class396 field2015;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)B", line = 3)
    public static final byte method838(int arg0, int arg1, int arg2) {
        field2004++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == arg1 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V", line = 19)
    public static void method839(int arg0) {
        field2015 = null;
        field2009 = null;
        if (arg0 != 6724) {
            method839(-9);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;IC)I", line = 35)
    public static final int method840(String arg0, int arg1, char arg2) {
        field2012++;
        int var3 = 0;
        int var4 = arg0.length();
        if (arg1 != 14921) {
            return -114;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg0.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lha;IB)V", line = 66)
    private final void method841(class40 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2003 = arg0.method257((byte) 91);
        } else if (arg1 == 2) {
            this.field2011 = arg0.method254((byte) -105);
        } else if (arg1 == 3) {
            this.field2006 = arg0.method254((byte) -52);
        } else if (arg1 == 4) {
            this.field2005 = arg0.method249(false);
        }
        if (arg2 > 1) {
            field2013++;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZIBZI)V", line = 96)
    public static final void method842(boolean arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field2007++;
        if (!arg0 && class178.field2783 == arg4 && class451.field6933 == arg1 && class455.field6976 == class362.field5339 || class463.field7116.method75(-1, class30.field395)) {
            return;
        }
        class451.field6933 = arg1;
        class455.field6976 = class362.field5339;
        class178.field2783 = arg4;
        if (class463.field7116.method75(-1, class30.field395)) {
            class455.field6976 = 0;
        }
        if (arg3) {
            class189.method1196(28, arg2 ^ 0x2FA5);
        } else {
            class189.method1196(25, -12254);
        }
        class277.method1681(true, class217.field3343, class494.field7520.method2473(class406.field5898, -74), (byte) 105);
        int var5 = class381.field5550;
        int var6 = class320.field4827;
        class381.field5550 = (class178.field2783 - (class150.field2422 >> 4)) * 8;
        class320.field4827 = (class451.field6933 - (class21.field272 >> 4)) * 8;
        class56.field918 = class492.method2967(class178.field2783 * 8, class451.field6933 * 8);
        class383.field5575 = null;
        int var7 = class381.field5550 - var5;
        if (arg2 != -121) {
            method839(124);
        }
        int var8 = class320.field4827 - var6;
        if (arg3) {
            class352.field5175 = 0;
            int var9 = (class150.field2422 - 1) * 128;
            int var10 = (class21.field272 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class249 var12 = class195.field3085[var11];
                if (var12 != null) {
                    var12.field3218 -= var7 * 128;
                    var12.field3222 -= var8 * 128;
                    if (var12.field3218 >= 0 && var12.field3218 <= var9 && var12.field3222 >= 0 && var10 >= var12.field3222) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field2232[var14] -= var7;
                            var12.field2239[var14] -= var8;
                            if (var12.field2232[var14] < 0 || var12.field2232[var14] >= class150.field2422 || var12.field2239[var14] < 0 || var12.field2239[var14] >= class21.field272) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class437.field6440[class352.field5175++] = var11;
                        } else {
                            class195.field3085[var11].method1507((byte) -86, null);
                            class195.field3085[var11] = null;
                        }
                    } else {
                        class195.field3085[var11].method1507((byte) -86, null);
                        class195.field3085[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class249 var23 = class195.field3085[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field2232[var24] -= var7;
                        var23.field2239[var24] -= var8;
                    }
                    var23.field3222 -= var8 * 128;
                    var23.field3218 -= var7 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class47 var21 = class224.field3450[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field2232[var22] -= var7;
                    var21.field2239[var22] -= var8;
                }
                var21.field3218 -= var7 * 128;
                var21.field3222 -= var8 * 128;
            }
        }
        class97[] var17 = class228.field3487;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class97 var20 = var17[var18];
            if (var20 != null) {
                var20.field1753 -= var7 * 128;
                var20.field1749 -= var8 * 128;
            }
        }
        class480.method2896(var7, (byte) -54, var8);
        for (class76 var19 = (class76) class170.field2648.method8((byte) -98); var19 != null; var19 = (class76) class170.field2648.method17((byte) 43)) {
            var19.field1367 -= var7;
            var19.field1359 -= var8;
            if (class21.field269 != 3 && (var19.field1367 < 0 || var19.field1359 < 0 || var19.field1367 >= class150.field2422 || var19.field1359 >= class21.field272)) {
                var19.method1121(false);
            }
        }
        if (class402.field5846 != 0) {
            class402.field5846 -= var7;
            class312.field4695 -= var8;
        }
        class59.method421(arg2 ^ 0x15);
        if (arg3) {
            class182.field2874 -= var7;
            class280.field4258 -= var8;
            class282.field4278 -= var7;
            class161.field2530 -= var8;
            class290.field4403 -= var8 * 128;
            class243.field3655 -= var7 * 128;
            if (Math.abs(var7) > class150.field2422 || Math.abs(var8) > class21.field272) {
                class216.method1330(true);
            }
        } else if (class408.field5928 == 4) {
            class493.field7515 -= var8 * 128;
            class10.field132 -= var8 * 128;
            class394.field5754 -= var7 * 128;
            class158.field2488 -= var7 * 128;
        } else {
            class408.field5928 = 1;
        }
        class359.method2191((byte) 60);
        class286.method1742(-1);
        class480.field7334.method13(false);
        class311.field4686.method13(false);
        class310.field4673.method1317(3);
        class234.method1406(98);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lha;I)V", line = 326)
    public final void method843(class40 arg0, int arg1) {
        if (arg1 != 0) {
            method842(false, 26, (byte) 12, true, 24);
        }
        while (true) {
            int var3 = arg0.method257((byte) 125);
            if (var3 == 0) {
                field2008++;
                return;
            }
            this.method841(arg0, var3, (byte) 11);
        }
    }
}
