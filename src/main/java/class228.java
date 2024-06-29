import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class228 extends class260 {

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Ldi;")
    public static class83 field3240 = new class83(69, 7);

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lqp;")
    public static class466 field3241 = new class466("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "Lc;")
    public static class122 field3243;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "[I")
    public int[] field3236;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1416(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lsi;I)Luo;")
    public static final class405 method1417(class391 arg0, int arg1) {
        field3237++;
        if (arg1 != 28485) {
            method1418(98);
        }
        return new class405(arg0.method2311((byte) 123), arg0.method2311((byte) 127), arg0.method2311((byte) 123), arg0.method2311((byte) -75), arg0.method2338(true), arg0.method2338(true), arg0.method2348(arg1 - 28487));
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public static void method1418(int arg0) {
        field3240 = null;
        field3243 = null;
        if (arg0 < -91) {
            field3241 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public abstract void method1419(int arg0, byte arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method1420(int arg0, Canvas arg1);

    static {
        new class466("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field3242 = 0;
        field3244 = -1;
    }
}
