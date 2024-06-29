import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public abstract class class245 extends class5 {

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Lni;")
    public static class367 field3441 = new class367(21, 3);

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)I")
    public abstract int method1569(int arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1604(int arg0, String arg1) {
        field3443++;
        String var2 = class344.method2230(-113, class133.method904(arg1, 37));
        if (var2 == null) {
            var2 = "";
        }
        if (arg0 != 3) {
            field3441 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)I")
    public abstract int method1567(int arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
    public static final void method1605(byte arg0) {
        field3444++;
        if (class256.field3541) {
            return;
        }
        class508.field7475 = true;
        int var1 = 102 / ((30 - arg0) / 62);
        class256.field3541 = true;
        if (class203.field2716.field1180) {
            class536.field7870 = ((int) class536.field7870 - 17 & 0xFFFFFFF0);
        } else {
            class172.field2319 += (-12.0F - class172.field2319) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)I")
    public abstract int method1571(boolean arg0);

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)I")
    public abstract int method1570(int arg0);

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)J")
    public abstract long method1568(int arg0);

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "(I)V")
    public static void method1606(int arg0) {
        field3441 = null;
        if (arg0 != -22185) {
            method1605((byte) 100);
        }
    }

    static {
        new class446("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }
}
