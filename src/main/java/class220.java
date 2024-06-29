import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class220 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lna;")
    public static class26 field3509 = class69.method505("Versteckt", (byte) -123);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lsc;")
    public static class259 field3506 = new class259(512);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lve;")
    public static class266 field3510;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1478(boolean arg0) {
        field3506 = null;
        field3510 = null;
        field3509 = null;
        if (!arg0) {
            field3506 = (class259) null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1479(int arg0) {
        field3508++;
        for (int var1 = arg0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class139.field2127[var1][var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)V", line = 66)
    public static final void method1480(boolean arg0, byte arg1) {
        field3505++;
        if (arg1 > -31) {
            field3510 = (class266) null;
        }
        class196.method1318(class141.field2153, arg0, -1, class250.field4095, class38.field622);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lwa;Z)Lbn;", line = 106)
    public static final class66 method1481(class82 arg0, boolean arg1) {
        field3507++;
        class66 var2 = new class66(arg0.method615(arg1), arg0.method615(arg1), arg0.method576(1), arg0.method576(1), arg0.method587(-502942936), arg0.method642((byte) -91) == 1, arg0.method642((byte) -112));
        int var3 = arg0.method642((byte) -83);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field1046.method257(arg1, new class23(arg0.method576(1), arg0.method576(1), arg0.method576(1), arg0.method576(1)));
        }
        var2.method490((byte) 103);
        return var2;
    }
}
