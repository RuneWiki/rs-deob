import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class398 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[I")
    private int[] field5394;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Leq;")
    public static class434 field5401;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method2455(int arg0) {
        class138.field1573.method2290(13831);
        field5395++;
        class325.field4342.method2290(arg0 ^ 0x6892);
        if (arg0 != 24213) {
            method2455(-123);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Lpd;")
    public static final class278 method2456(boolean arg0) {
        field5399++;
        if (!arg0) {
            field5401 = null;
        }
        if (class224.field2806 == null || class346.field4696 == null) {
            return null;
        }
        class346.field4696.method221(class224.field2806, 316392388);
        class278 var1 = (class278) class346.field4696.method227(1798357390);
        if (var1 == null) {
            return null;
        } else {
            class222 var2 = class339.method2178(false, var1.field3596);
            return var2 != null && var2.field2771 && var2.method1345((byte) 55) ? var1 : class394.method2441(-68);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lbg;II)V")
    public static final void method2457(class242 arg0, int arg1, int arg2) {
        if (class357.field4846 != null) {
            try {
                class357.field4846.method2634(-10092, 0L);
                class357.field4846.method2633(arg1, arg0.field3188, false, 24);
            } catch (Exception var3) {
            }
        }
        if (arg2 != -2117353759) {
            method2460(-51);
        }
        field5400++;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
    public static final void method2458(boolean arg0) {
        field5396++;
        class57.field660 = 0;
        class97.field1138.method1701(arg0);
        class97.field1138.method1696(false, class118.field1354);
        class57.field660++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)I")
    public final int method2459(byte arg0, int arg1) {
        field5397++;
        int var3 = (this.field5394.length >> 1) - 1;
        int var4 = arg1 & var3;
        if (arg0 != 35) {
            method2456(false);
        }
        while (true) {
            int var5 = this.field5394[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5394[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "([I)V")
    public class398(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field5394 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5394[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field5394[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field5394[var5 + var5] = arg0[var4];
            this.field5394[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static void method2460(int arg0) {
        field5401 = null;
        if (arg0 != 1) {
            method2455(-80);
        }
    }

    static {
        new class72("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field5401 = new class434();
        field5402 = 0;
    }
}
