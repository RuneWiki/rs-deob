import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class247 extends class331 {

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "Llg;")
    public static class237 field3528 = new class237(50);

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "Z")
    public static boolean field3530 = false;

    @OriginalMember(owner = "client!ss", name = "S", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "Lva;")
    private class288 field3527;

    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "[I")
    public static int[] field3531;

    @OriginalMember(owner = "client!ss", name = "R", descriptor = "[I")
    public static int[] field3532;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
    public static void method1680(int arg0) {
        field3532 = null;
        field3531 = null;
        field3528 = null;
        if (arg0 != 1000000) {
            field3528 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILdg;)V")
    public final void method1681(int arg0, class236 arg1) {
        while (true) {
            int var3 = arg1.method1574(-114);
            if (var3 == 0) {
                field3524++;
                if (arg0 != -1) {
                    field3530 = true;
                    return;
                }
                return;
            }
            this.method1683((byte) 107, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
    public static final int method1682(int arg0, int arg1) {
        return class87.field992 == null ? 0 : class87.field992[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BILdg;)V")
    private final void method1683(byte arg0, int arg1, class236 arg2) {
        field3529++;
        if (arg0 <= 79 || arg1 != 249) {
            return;
        }
        int var4 = arg2.method1574(-74);
        if (this.field3527 == null) {
            int var5 = class328.method2123(var4, 20867);
            this.field3527 = new class288(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method1574(-97) == 1;
            int var8 = arg2.method1616(false);
            class406 var9;
            if (var7) {
                var9 = new class49(arg2.method1562(false));
            } else {
                var9 = new class25(arg2.method1597(3641));
            }
            this.field3527.method1886(var9, (long) var8, 1);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BII)I")
    public final int method1684(byte arg0, int arg1, int arg2) {
        field3521++;
        if (this.field3527 == null) {
            return arg2;
        } else {
            int var4 = -50 / ((77 - arg0) / 35);
            class25 var5 = (class25) this.field3527.method1888((long) arg1, (byte) -30);
            return var5 == null ? arg2 : var5.field311;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLon;)V")
    public static final void method1685(boolean arg0, class184 arg1) {
        field3522++;
        if (!class279.field3951) {
            return;
        }
        if (arg0) {
            method1685(true, (class184) null);
        }
        class154.field1900++;
        class62.field718.method2143(168, -2);
        class62.field718.method1603(arg1.field2584, 871);
        class62.field718.method1563(-2, arg1.field2668);
        class62.field718.method1612(class5.field81, -17029);
        class62.field718.method1612(arg1.field2635, -17029);
        class62.field718.method1612(class188.field2714, -17029);
        class62.field718.method1564(class408.field5883, 105);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Le;")
    public static final class313 method1686(byte arg0, int arg1) {
        field3526++;
        class313 var2 = (class313) class297.field4154.method1625((long) arg1, 0);
        if (arg0 >= -11) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class183.field2508.method2431((byte) 92, 0, arg1);
            class313 var4 = new class313();
            if (var3 != null) {
                var4.method2063(new class236(var3), -2069959176);
            }
            var4.method2070((byte) 121);
            class297.field4154.method1622((byte) 13, var4, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1687(int arg0, int arg1, String arg2) {
        field3525++;
        if (this.field3527 == null) {
            return arg2;
        }
        class49 var4 = (class49) this.field3527.method1888((long) arg0, (byte) -30);
        if (var4 == null) {
            return arg2;
        } else if (arg1 < 42) {
            return null;
        } else {
            return var4.field584;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZIIIZ)Ltq;")
    public static final class376 method1688(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 != -12017) {
            field3533 = 20;
        }
        field3523++;
        class117 var5 = null;
        if (class11.field146 != null) {
            var5 = new class117(arg3, class11.field146, class327.field4644[arg3], 1000000);
        }
        class448.field6437[arg3] = class141.field1740.method2563(class365.field5184, arg3, 0, var5);
        if (arg4) {
            class448.field6437[arg3].method2305(-7530);
        }
        return new class376(class448.field6437[arg3], arg0, arg2);
    }

    static {
        new class362("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field3533 = 0;
        new class362("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
    }
}
