import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class255 extends class379 {

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "[Z")
    public static boolean[] field3745 = new boolean[8];

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "Lsp;")
    public static class448 field3743 = new class448("WTQA", 2);

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field3748 = 0;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public int field3740;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "Lr;")
    public class121 field3747;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
    public static void method1642(int arg0) {
        field3745 = null;
        field3743 = null;
        if (arg0 > -31) {
            method1643(68, 71L);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IJ)V")
    public static final void method1643(int arg0, long arg1) {
        field3741++;
        int var3 = field3748 + class435.field6375.field6335;
        int var4 = class478.field7040 + class435.field6375.field6334;
        if ((class231.field3380 - var3) < -500 || class231.field3380 - var3 > 500 || class49.field537 - var4 < -500 || class49.field537 - var4 > 500) {
            class231.field3380 = var3;
            class49.field537 = var4;
        }
        int var5 = -25 / ((arg0 + 1) / 61);
        if (class231.field3380 != var3) {
            int var6 = var3 - class231.field3380;
            int var7 = (int) ((long) var6 * arg1 / 320L);
            if (var6 > 0) {
                if (var7 == 0) {
                    var7 = 1;
                } else if (var7 > var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = -1;
            } else if (var7 < var6) {
                var7 = var6;
            }
            class231.field3380 += var7;
        }
        if (!class478.field7044.field3352) {
            class386.field5687 += (float) arg1 * class323.field4542 / 6.0F;
            class328.field4588 += (float) arg1 * class434.field6365 / 6.0F;
        }
        if (class49.field537 != var4) {
            int var8 = var4 - class49.field537;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 > 0) {
                if (var9 == 0) {
                    var9 = 1;
                } else if (var8 < var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = -1;
            } else if (var9 < var8) {
                var9 = var8;
            }
            class49.field537 += var9;
        }
        class494.method2961(39);
    }

    static {
        new class331("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
