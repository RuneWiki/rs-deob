import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class180 extends class101 {

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public int field3433 = 0;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Ltg;")
    public static class184 field3426 = class135.method812("Ausw-=hlen", 3);

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field3431 = 0;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Ltg;")
    private static class184 field3428 = class135.method812("Please wait 1 minute and try again)3", 3);

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Ltg;")
    public static class184 field3429 = field3428;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Ltg;")
    public static class184 field3436 = class135.method812("<img=1>", 3);

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Ltg;")
    public static class184 field3430 = field3428;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lpc;")
    public static class144 field3434;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Lud;")
    public static class190 field3427;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Lj;")
    public static class87 field3435;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lka;B)V")
    public final void method1098(class97 arg0, byte arg1) {
        if (arg1 != -38) {
            method1100(-39);
        }
        while (true) {
            int var3 = arg0.method588((byte) -46);
            if (var3 == 0) {
                field3425++;
                return;
            }
            this.method1099(var3, (byte) 125, arg0);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLka;)V")
    private final void method1099(int arg0, byte arg1, class97 arg2) {
        if (arg0 == 2) {
            this.field3433 = arg2.method611(false);
        }
        if (arg1 < 98) {
            field3431 = 71;
        }
        field3432++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method1100(int arg0) {
        field3427 = null;
        if (arg0 > -58) {
            method1100(32);
        }
        field3434 = null;
        field3430 = null;
        field3435 = null;
        field3429 = null;
        field3428 = null;
        field3436 = null;
        field3426 = null;
    }
}
