import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class241 {

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "B")
    private byte field3610;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public int field3608;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field3607;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public int field3605;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Z")
    public static boolean field3612 = false;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[I")
    public static int[] field3617;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)I")
    public final int method1526(byte arg0) {
        field3609++;
        return arg0 == 100 ? this.field3610 & 0x7 : -27;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method1527(int arg0) {
        field3617 = null;
        if (arg0 != -9) {
            field3615 = -13;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILrp;)Lqs;")
    public static final class394 method1528(int arg0, class276 arg1) {
        if (arg0 == 8) {
            field3606++;
            return new class394(arg1.method1702(-61), arg1.method1702(-118), arg1.method1702(arg0 - 102), arg1.method1702(-82), arg1.method1748(false), arg1.method1748(false), arg1.method1701(-23121));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)I")
    public final int method1529(int arg0) {
        if (arg0 < 42) {
            this.field3605 = -67;
        }
        field3616++;
        return (this.field3610 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class241() {
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lrp;)V")
    public class241(class276 arg0) {
        this.field3610 = arg0.method1715((byte) -69);
        this.field3608 = arg0.method1729(65280);
        this.field3611 = arg0.method1688(20402);
        this.field3607 = arg0.method1688(20402);
        this.field3605 = arg0.method1688(20402);
        this.field3613 = arg0.method1688(20402);
    }
}
