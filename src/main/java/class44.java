import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class44 extends class305 {

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field477 = 0;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lqe;")
    public static class469 field474 = new class469(33, 6);

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "Lqe;")
    public static class469 field479 = new class469(40, 0);

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(ILhb;)V")
    public class44(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        ++field472;
        super.field4320 = arg1;
        if (arg0 != -27751) {
            this.method306(-105, 95);
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)V")
    public static void method304(byte arg0) {
        if (arg0 > -39) {
            method304((byte) 103);
        }
        field479 = null;
        field474 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return 25;
        } else {
            ++field476;
            return 1;
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lhb;)V")
    public class44(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field473;
        if (arg0 != 31401) {
            field479 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)I")
    public final int method307(int arg0) {
        if (arg0 != 17503) {
            return -91;
        } else {
            ++field475;
            return super.field4320;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (super.field4320 != 1 && ~super.field4320 != -1) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 > -40) {
            this.method307(127);
        }
        ++field478;
    }
}
