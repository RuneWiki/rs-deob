import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class217 extends class501 {

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "Z")
    public volatile boolean field3178 = true;

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "Lh;")
    public static class572 field3181 = new class572("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3182;

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "Z")
    public boolean field3177;

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "Z")
    public boolean field3179;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
    public static void method1414(byte arg0) {
        if (arg0 != -26) {
            field3181 = null;
        }
        field3181 = null;
        field3182 = null;
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I")
    public abstract int method209(byte arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)[B")
    public abstract byte[] method207(int arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1415(long arg0, int arg1) {
        field3180++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else if (arg1 >= -74) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class64.field799[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    static {
        new class572("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field3182 = null;
    }
}
