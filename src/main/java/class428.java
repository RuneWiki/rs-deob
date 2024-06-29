import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class428 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lhp;")
    public static class277 field6354;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Lea;")
    public static class474 field6356;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lea;")
    public static class474 field6357;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lea;")
    public static class474 field6358;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field6353;

    static {
        new class474(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field6354 = new class277(8);
        field6355 = 0;
        field6356 = new class474("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        field6357 = new class474("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field6358 = new class474("Take", "Nehmen", "Prendre", "Pegar");
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method2672(int arg0, int arg1, int arg2, int arg3) {
        field6353++;
        int var4 = arg1 / arg2;
        int var5 = arg1 & arg2 - 1;
        int var6 = arg0 / arg2;
        if (arg3 != -24906) {
            method2673(-46);
        }
        int var7 = arg2 - 1 & arg0;
        int var8 = class49.method275(-25231, var6, var4);
        int var9 = class49.method275(-25231, var6, var4 + 1);
        int var10 = class49.method275(-25231, var6 + 1, var4);
        int var11 = class49.method275(-25231, var6 + 1, var4 + 1);
        int var12 = class308.method2045(var5, var9, arg2, 0, var8);
        int var13 = class308.method2045(var5, var11, arg2, 0, var10);
        return class308.method2045(var7, var13, arg2, 0, var12);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 43)
    public static void method2673(int arg0) {
        field6358 = null;
        field6354 = null;
        field6356 = null;
        if (arg0 <= -51) {
            field6357 = null;
        }
    }
}
