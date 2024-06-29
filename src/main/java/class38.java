import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class38 {

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "B")
    public byte field535;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field527 = 0;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lfw;")
    public class217 field539;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Lfw;")
    public class217 field540;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Lch;")
    public class38 field531;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Lc;")
    public class50 field532;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Lwp;")
    public class527 field537;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lsu;")
    public class590 field538;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lcea;")
    public class95 field533;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Lcea;")
    public class95 field542;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "S")
    public short field534;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "S")
    public short field536;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "S")
    public short field541;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "S")
    public short field544;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[I")
    public static int[] field530;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
    public static final void method262(int arg0, byte arg1) {
        if (arg1 == -54) {
            if (class278.field3722 == null || class278.field3722.length < arg0) {
                class278.field3722 = new int[arg0];
            }
            field543++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public final void method263(byte arg0) {
        while (this.field538 != null) {
            class590 var2 = this.field538.field8467;
            this.field538.method3505(500);
            this.field538 = var2;
        }
        field528++;
        if (arg0 < 122) {
            this.field537 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method264(int arg0) {
        if (arg0 == 0) {
            field530 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILpaa;B)V")
    public static final void method265(int arg0, int arg1, class712 arg2, byte arg3) {
        class431.field5928 = arg2;
        class586.field8433 = arg1;
        if (arg3 != -3) {
            field527 = 101;
        }
        field529++;
        class32.field485 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
    public class38(int arg0) {
        this.field535 = (byte) arg0;
    }
}
