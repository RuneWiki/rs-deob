import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class351 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lhga;")
    public static class158 field5595 = new class158(72, 6);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public int field5596;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public int field5598;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method2358(int arg0) {
        if (arg0 == 6) {
            field5595 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BZ)V")
    public static final void method2359(byte arg0, boolean arg1) {
        class428.method2707(class56.field732, arg1, class528.field7706, class259.field4147, -1);
        field5594++;
        if (arg0 <= 64) {
            method2359((byte) -124, false);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)Lvb;")
    public static final class180 method2360(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4028;
    }
}
