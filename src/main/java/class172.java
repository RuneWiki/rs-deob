import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class172 {

    @OriginalMember(owner = "client!q", name = "m", descriptor = "B")
    public byte field2599;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lbc;")
    public class11 field2594;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lq;")
    public class172 field2592;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lne;")
    public class203 field2595;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Ldc;")
    public class336 field2603;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lww;")
    public class338 field2593;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Lww;")
    public class338 field2600;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lmb;")
    public class427 field2591;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lmb;")
    public class427 field2598;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "S")
    public short field2596;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "S")
    public short field2597;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "S")
    public short field2601;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "S")
    public short field2602;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Luf;I)V")
    public static final void method1268(class519 arg0, int arg1) {
        if (class267.field3779 == arg0.field7127) {
            class438.field6082[arg0.field7175] = true;
        }
        field2588++;
        if (arg1 >= -15) {
            field2587 = 90;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static int method1269(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
    public class172(int arg0) {
        this.field2599 = (byte) arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method1270(int arg0) {
        while (this.field2594 != null) {
            class11 var2 = this.field2594.field145;
            this.field2594.method155((byte) 125);
            this.field2594 = var2;
        }
        field2589++;
        if (arg0 != -17104) {
            this.field2592 = null;
        }
    }
}
