import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class435 extends class649 {

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6353 = null;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field6352 = -1;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        ++field6354;
        if (arg1 < -120) {
            super.field9223 = arg0;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)I")
    public final int method2689(int arg0) {
        if (arg0 != 3) {
            return 25;
        } else {
            ++field6350;
            return super.field9223;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method2690(byte arg0) {
        int var1 = 124 / ((arg0 - -29) / 47);
        field6353 = null;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static final void method2691(int arg0) {
        ++field6351;
        class719.field10078.method3895(2);
        if (arg0 >= -97) {
            field6352 = -59;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 > super.field9223 || super.field9223 > 3) {
            super.field9223 = this.method135(71);
        }
        ++field6346;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        if (arg0 != 18648) {
            this.method135(127);
        }
        ++field6348;
        return 1;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(ILhs;)V")
    public class435(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)V")
    public static final void method2692(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        ++field6349;
        class630.field8864 = arg0;
        class44.field747 = new class627[class648.field9214[class630.field8864] - -1];
        class329.field4860 = 0;
        class258.field4048 = 0;
        if (arg1 != -22123) {
            method2692(-64, 92);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = -31 / ((arg0 - -18) / 50);
        ++field6347;
        return super.field9224.method2290(-21318).method3482(-87) ? 3 : 2;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lhs;)V")
    public class435(class358 arg0) {
        super(arg0);
    }
}
