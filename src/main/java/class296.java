import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class296 {

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "[S")
    public static short[] field4126;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "Ltq;")
    public static class376 field4120;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "Lbm;")
    public static class59 field4124;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lqm;B)V")
    public static final void method1953(class77 arg0, byte arg1) {
        field4125++;
        if (arg1 > -54) {
            field4124 = null;
        }
        if (class208.field2958 >= 400) {
            return;
        }
        class135 var2 = arg0.field912;
        if (var2.field1655 != null) {
            var2 = var2.method836((byte) 74);
            if (var2 == null) {
                return;
            }
        }
        if (!var2.field1664) {
            return;
        }
        String var3 = var2.field1640;
        if (var2.field1637 != 0) {
            String var4 = class384.field5425 == 1 ? class202.field2890.method2331(25, class271.field3836) : class105.field1262.method2331(25, class271.field3836);
            var3 = var3 + class452.method2798(class384.field5422.field465, var2.field1637, -87) + " (" + var4 + var2.field1637 + ")";
        }
        if (class279.field3951) {
            class41 var5 = class4.field52 == -1 ? null : class401.method2555(class4.field52, 1024);
            if ((class347.field4901 & 0x2) != 0) {
                if (var5 == null || var2.method841(class4.field52, 0, var5.field499) != var5.field499) {
                    class409.field5887++;
                    class421.method2660(0, class253.field3613 + " -> <col=ffff00>" + var3, class22.field279, class154.field1907, (long) arg0.field5620, 0, 18, (byte) 58);
                }
                return;
            }
            return;
        }
        String[] var6 = var2.field1663;
        if (class49.field589) {
            var6 = class278.method1831(var6, 339);
        }
        if (var6 != null) {
            for (int var7 = 4; var7 >= 0; var7--) {
                if (var6[var7] != null && (class384.field5425 != 0 || !var6[var7].equalsIgnoreCase(class144.field1769.method2331(25, class271.field3836)))) {
                    byte var8 = 0;
                    if (var7 == 0) {
                        var8 = 59;
                    }
                    int var9 = class403.field5780;
                    if (var7 == 1) {
                        var8 = 51;
                    }
                    if (var7 == 2) {
                        var8 = 60;
                    }
                    if (var7 == 3) {
                        var8 = 8;
                    }
                    if (var2.field1676 == var7) {
                        var9 = var2.field1695;
                    }
                    if (var7 == 4) {
                        var8 = 4;
                    }
                    if (var2.field1687 == var7) {
                        var9 = var2.field1630;
                    }
                    class73.field877++;
                    class421.method2660(0, "<col=ffff00>" + var3, var9, var6[var7], (long) arg0.field5620, 0, var8, (byte) 86);
                }
            }
        }
        if (class384.field5425 == 0 && var6 != null) {
            for (int var10 = 4; var10 >= 0; var10--) {
                if (var6[var10] != null && var6[var10].equalsIgnoreCase(class144.field1769.method2331(25, class271.field3836))) {
                    short var11 = 0;
                    if (var2.field1637 > class384.field5422.field465) {
                        var11 = 2000;
                    }
                    short var12 = 0;
                    if (var10 == 0) {
                        var12 = 59;
                    }
                    if (var10 == 1) {
                        var12 = 51;
                    }
                    if (var10 == 2) {
                        var12 = 60;
                    }
                    if (var10 == 3) {
                        var12 = 8;
                    }
                    if (var10 == 4) {
                        var12 = 4;
                    }
                    if (var12 != 0) {
                        var12 += var11;
                    }
                    class421.method2660(0, "<col=ffff00>" + var3, var2.field1678, var6[var10], (long) arg0.field5620, 0, var12, (byte) 126);
                    class394.field5563++;
                }
            }
        }
        class421.method2660(0, "<col=ffff00>" + var3, class355.field5008, class404.field5833.method2331(25, class271.field3836), (long) arg0.field5620, 0, 1010, (byte) 28);
        class409.field5892++;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[III)V")
    public static final void method1954(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        arg3--;
        field4121++;
        if (arg4 != -1) {
            method1955(true);
        }
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg2[var7] = arg0;
            int var8 = var7 + 1;
            arg2[var8] = arg0;
            int var9 = var8 + 1;
            arg2[var9] = arg0;
            int var10 = var9 + 1;
            arg2[var10] = arg0;
            int var11 = var10 + 1;
            arg2[var11] = arg0;
            int var12 = var11 + 1;
            arg2[var12] = arg0;
            int var13 = var12 + 1;
            arg2[var13] = arg0;
            arg3 = var13 + 1;
            arg2[arg3] = arg0;
        }
        while (arg3 < var6) {
            arg3++;
            arg2[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public static void method1955(boolean arg0) {
        if (arg0) {
            field4120 = null;
            field4126 = null;
            field4124 = null;
        }
    }

    static {
        new class362("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field4126 = new short[] { 10, 49, 20, 50, 30, 2, 47, 9 };
    }
}
