import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class319 extends class14 {

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "Lvj;")
    public static class304 field4181 = new class304("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "Lff;")
    public static class9 field4183;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "J")
    public static long field4182;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
    public static void method1841(int arg0) {
        if (arg0 != 1) {
            method1841(48);
        }
        field4181 = null;
        field4183 = null;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
    public class319() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field4179;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            field4182 = -81L;
        }
        if (super.field270.field5222) {
            int[][] var4 = this.method139(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class115.field1637 < ~var8; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] - -var7[var8]) / 3;
            }
        }
        return var3;
    }

    static {
        new class304((String) null, "geschickt werden.", (String) null, (String) null);
        new class304("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field4183 = new class9(8, -2);
    }
}
