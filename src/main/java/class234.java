import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class234 extends class496 {

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "Llk;")
    public class383 field3443;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "S")
    public static short field3441;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "[I")
    public static int[] field3442;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "F")
    public static float field3444;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public static void method1520(int arg0) {
        if (arg0 != 1) {
            method1521(88, -107, 2);
        }
        field3442 = null;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Z")
    public static final boolean method1521(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field3441 = -65;
        }
        field3440++;
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Llk;)V")
    public class234(class383 arg0) {
        this.field3443 = arg0;
    }

    static {
        new class487("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field3441 = 1;
        field3442 = new int[] { 1, 2, 4, 8 };
    }
}
