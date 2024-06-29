import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class15 extends class435 {

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Ljc;")
    public static class305 field154 = new class305("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lao;")
    public static class191 field156 = new class191(88, 1);

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Z")
    public static boolean field157;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI[Ljk;)V")
    public static final void method87(boolean arg0, int arg1, class450[] arg2) {
        field155++;
        int var3 = 0;
        if (!arg0) {
            return;
        }
        while (arg2.length > var3) {
            class450 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field6686 == 0) {
                    if (var4.field6643 != null) {
                        method87(true, arg1, var4.field6643);
                    }
                    class360 var5 = (class360) class152.field1989.method295((long) var4.field6558, -93);
                    if (var5 != null) {
                        class63.method379(arg1, var5.field4886, true);
                    }
                }
                if (arg1 == 0 && var4.field6611 != null) {
                    class293 var6 = new class293();
                    var6.field3866 = var4.field6611;
                    var6.field3877 = var4;
                    class432.method2657(var6);
                }
                if (arg1 == 1 && var4.field6589 != null) {
                    label62: {
                        if (var4.field6703 >= 0) {
                            class450 var7 = class406.method2490((byte) -116, var4.field6558);
                            if (var7 == null || var7.field6643 == null || var7.field6643.length <= var4.field6703 || var7.field6643[var4.field6703] != var4) {
                                break label62;
                            }
                        }
                        class293 var8 = new class293();
                        var8.field3866 = var4.field6589;
                        var8.field3877 = var4;
                        class432.method2657(var8);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Las;")
    public static final class106 method88(int arg0, int arg1, int arg2) {
        field159++;
        class106 var3 = new class106();
        var3.field1435 = arg0 + arg2 + 5;
        var3.field1420 = arg1 + 5 + 1;
        var3.field1440 = -1;
        var3.field1444 = -1;
        var3.field1421 = new int[var3.field1420][var3.field1435];
        var3.method661(-108);
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
    public static void method89(boolean arg0) {
        field154 = null;
        if (!arg0) {
            field158 = 45;
        }
        field156 = null;
    }

    static {
        new class305("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        new class305("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        field157 = false;
    }
}
