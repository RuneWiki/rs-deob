import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class460 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Z")
    public boolean field6567;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field6562 = -1;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
    public static int[] field6565 = new int[500];

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lbd;")
    public class180 field6560;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lbd;")
    public class180 field6566;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Z")
    public boolean field6564;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method2664(int arg0) {
        if (arg0 != -1) {
            field6562 = -63;
        }
        field6565 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)[Lpaa;")
    public static final class317[] method2665(boolean arg0) {
        field6569++;
        return arg0 ? new class317[] { class195.field2533, class544.field7584, class559.field7822, class82.field1106, class233.field2974, class237.field3041, class97.field1302, class375.field5223, class288.field3760, class493.field6883, class294.field3826, class179.field2306, class488.field6796, class501.field6952, class167.field2117 } : null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
    public final boolean method2666(int arg0) {
        field6563++;
        if (arg0 != 500) {
            field6561 = 48;
        }
        return this.field6564 && !this.field6567;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public final void method2667(byte arg0) {
        if (arg0 != 7) {
            field6562 = 44;
        }
        field6568++;
        if (this.field6560 != null) {
            this.field6560.method296((byte) 36);
        }
        this.field6564 = false;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Z)V")
    public class460(boolean arg0) {
        this.field6567 = arg0;
    }
}
