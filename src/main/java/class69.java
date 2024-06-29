import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class69 {

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "Lvd;")
    public static class39 field977;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "Lkb;")
    public static class692 field979;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
    public static final void method601(int arg0) {
        class624.field8739 = new class83(8);
        field978++;
        class162.field2580 = 0;
        if (arg0 > 37) {
            for (class626 var1 = (class626) class493.field7031.method1615((byte) 90); var1 != null; var1 = (class626) class493.field7031.method1625(-77)) {
                var1.method3613();
            }
        }
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
    public static void method602(int arg0) {
        field977 = null;
        if (arg0 != 2471) {
            field979 = null;
        }
        field979 = null;
    }
}
