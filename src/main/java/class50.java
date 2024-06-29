import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class50 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lub;")
    private class18 field655;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lap;")
    public static class335 field658 = new class335("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Lkg;")
    public static class179 field661 = new class179(60, 3);

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lud;")
    public static class27 field662 = new class27(13, 0, 1, 0);

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field663 = -1;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lnd;")
    private class383 field654;

    static {
        new class335("Select", "Auswählen", "Sélectionner", "Selecionar");
        field664 = -1;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLub;)V", line = 6)
    public final void method510(byte arg0, class18 arg1) {
        this.field655 = arg1;
        if (arg0 == -34) {
            field657++;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 17)
    public static void method511(boolean arg0) {
        field658 = null;
        field662 = null;
        if (arg0) {
            method513(-16, 78);
        }
        field661 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Lnd;", line = 32)
    public final class383 method512(byte arg0) {
        field653++;
        class383 var2 = this.field654;
        if (this.field655.field268 == var2) {
            this.field654 = null;
            return null;
        } else {
            this.field654 = var2.field5042;
            return arg0 >= -7 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 55)
    public class50() {
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lpp;", line = 59)
    public static final class269 method513(int arg0, int arg1) {
        field656++;
        if (arg0 != -8931) {
            return null;
        }
        class269[] var2 = class267.method1591(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class269 var4 = var2[var3];
            if (var4.field3402 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Lnd;", line = 86)
    public final class383 method514(int arg0) {
        field660++;
        class383 var2 = this.field655.field268.field5042;
        if (this.field655.field268 == var2) {
            this.field654 = null;
            return null;
        } else if (arg0 > -69) {
            return null;
        } else {
            this.field654 = var2.field5042;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lub;)V", line = 116)
    public class50(class18 arg0) {
        this.field655 = arg0;
    }
}
