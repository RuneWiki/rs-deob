import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class416 {

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field6018 = 0;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lct;")
    public static class104 field6016;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lct;")
    public static class104 field6020;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lkg;Lkg;I)V")
    public static final void method2582(class223 arg0, class223 arg1, int arg2) {
        class257.method1773((byte) -10, class420.field6083);
        field6015++;
        class243.field3608++;
        class159.field2132.method1721(25153, arg0.field3223);
        class159.field2132.method1748(arg0.field3363, (byte) -73);
        class159.field2132.method1764(false, arg1.field3223);
        class159.field2132.method1707(arg1.field3363, -115);
        class159.field2132.method1744((byte) -108, arg1.field3270);
        class159.field2132.method1707(arg0.field3270, -98);
        if (arg2 != 0) {
            method2583((byte) -93);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method2583(byte arg0) {
        if (arg0 != -71) {
            field6019 = 82;
        }
        field6020 = null;
        field6016 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method2584(boolean arg0, boolean arg1, String arg2) {
        field6017++;
        if (arg2 == null) {
            return;
        }
        if (class238.field3533 >= 100) {
            class328.method2147(128, class385.field5631.method2543(arg1, class153.field2073));
            return;
        }
        String var3 = class17.method223(0, arg2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg1) {
            method2583((byte) -30);
        }
        while (class238.field3533 > var4) {
            String var8 = class17.method223(0, class163.field2161[var4]);
            if (var8 != null && var8.equals(var3)) {
                class328.method2147(128, arg2 + class100.field1294.method2543(false, class153.field2073));
                return;
            }
            if (class334.field4937[var4] != null) {
                String var9 = class17.method223(0, class334.field4937[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class328.method2147(128, arg2 + class100.field1294.method2543(false, class153.field2073));
                    return;
                }
            }
            var4++;
        }
        for (int var5 = 0; var5 < class373.field5450; var5++) {
            String var6 = class17.method223(0, class271.field4015[var5]);
            if (var6 != null && var6.equals(var3)) {
                class328.method2147(128, class338.field4980.method2543(false, class153.field2073) + arg2 + class450.field6636.method2543(false, class153.field2073));
                return;
            }
            if (class419.field6077[var5] != null) {
                String var7 = class17.method223(0, class419.field6077[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class328.method2147(128, class338.field4980.method2543(false, class153.field2073) + arg2 + class450.field6636.method2543(false, class153.field2073));
                    return;
                }
            }
        }
        if (class17.method223(0, class187.field2619.field5587).equals(var3)) {
            class328.method2147(128, class139.field1908.method2543(false, class153.field2073));
            return;
        }
        class370.field5407++;
        class257.method1773((byte) -10, class357.field5180);
        class159.field2132.method1727(-128, class248.method1646(arg2, (byte) 84) + 1);
        class159.field2132.method1712(arg2, 104);
        class159.field2132.method1727(-128, arg0 ? 1 : 0);
    }

    static {
        new class409("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field6019 = 999999;
    }
}
