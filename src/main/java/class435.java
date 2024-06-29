import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class435 {

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public int field6339;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public int[] field6340;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
    public int[] field6344;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lvh;")
    public static class240 field6343;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    public static int[] field6342;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method2593(int arg0) {
        if (arg0 <= 126) {
            return;
        }
        for (int var1 = 0; var1 < class292.field3915; var1++) {
            class20 var2 = class526.field7723[var1];
            if (var2.field209 == 2) {
                if (var2.field213 == null) {
                    var2.field201 = Integer.MIN_VALUE;
                } else {
                    class189.field2623.method942(var2.field213);
                }
            }
        }
        field6345++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
    public static final boolean method2594(int arg0, int arg1, int arg2) {
        if (arg1 > -28) {
            field6342 = null;
        }
        field6341++;
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method2595(byte arg0) {
        field6342 = null;
        if (arg0 > 42) {
            field6343 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I)V")
    public class435(int arg0) {
        this.field6339 = arg0;
        this.field6340 = new int[this.field6339];
        this.field6344 = new int[this.field6339];
    }

    static {
        new class83("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
