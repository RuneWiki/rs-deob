import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class329 extends class330 {

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lvq;")
    public static class24 field4897;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lbt;")
    public static class363 field4898;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method2150(byte arg0) {
        if (arg0 == 95) {
            field4897 = null;
            field4898 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I")
    public static final int method2151(int arg0) {
        field4893++;
        if (arg0 != 0) {
            method2153((class50) null, 106);
        }
        if (class359.field5222 == null) {
            return class37.field526 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public static final void method2152(int arg0, int arg1, int arg2) {
        field4894++;
        class125 var3 = class56.method428(arg1, 1, -3636);
        var3.method846(arg0 ^ 0x799);
        var3.field1657 = arg2;
        if (arg0 != 28537) {
            field4899 = -111;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lar;I)V")
    public static final void method2153(class50 arg0, int arg1) {
        if (arg0.field629 != null) {
            arg0.field629.field6826 = 0;
        }
        field4895++;
        arg0.field627 = false;
        for (class50 var2 = arg0.method283(); var2 != null; var2 = arg0.method281()) {
            method2153(var2, arg1);
        }
        if (arg1 != 0) {
            field4897 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
    public static final void method2154(int arg0, int arg1) {
        field4896++;
        if (arg1 == 1) {
            class125 var2 = class56.method428(arg0, 11, arg1 - 3637);
            var2.method847(arg1 + 87);
        }
    }

    static {
        new class409((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field4897 = new class24(10, -1);
        field4898 = new class363(50);
        field4900 = 2;
    }
}
