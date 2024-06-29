import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class258 extends class443 {

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "Lik;")
    public class642 field3746;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "Lbv;")
    public static class567 field3747 = new class567("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "Liu;")
    public static class517 field3750 = new class517(53, 8);

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3752;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "Luaa;")
    public static class395 field3753;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "Liu;")
    public static class517 field3754;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "F")
    public static float field3756;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "Lrl;")
    public static class633 field3751;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "Lvg;")
    public static class75 field3749;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1630(int arg0, String arg1) {
        if (arg0 != 1) {
            field3751 = null;
        }
        field3748++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class596.method3403(arg1, -95);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class404.field6020; var3++) {
            String var4 = class534.field7454[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class596.method3403(var4, -126);
            if (var5 != null && var5.equals(var2)) {
                class404.field6020--;
                for (int var6 = var3; var6 < class404.field6020; var6++) {
                    class534.field7454[var6] = class534.field7454[var6 + 1];
                    class301.field4344[var6] = class301.field4344[var6 + 1];
                    class41.field572[var6] = class41.field572[var6 + 1];
                    class289.field4189[var6] = class289.field4189[var6 + 1];
                    class233.field3424[var6] = class233.field3424[var6 + 1];
                    class289.field4193[var6] = class289.field4193[var6 + 1];
                }
                class137.field2179 = class498.field6986;
                class305.field4392++;
                class624.method3537(-115, class23.field320);
                class127.field2088.method1710(class51.method441((byte) -105, arg1), 91);
                class127.field2088.method1726((byte) -52, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lik;)V")
    public class258(class642 arg0) {
        this.field3746 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method1631(int arg0) {
        field3754 = null;
        if (arg0 > -48) {
            field3754 = null;
        }
        field3749 = null;
        field3751 = null;
        field3753 = null;
        field3752 = null;
        field3750 = null;
        field3747 = null;
    }

    static {
        new class567("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field3752 = null;
        field3753 = new class395(50);
        field3754 = new class517(18, 7);
    }
}
