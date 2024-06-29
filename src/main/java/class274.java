import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class274 extends class95 {

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "Z")
    public static boolean field4054 = false;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field4057;

    static {
        new class32("", 76);
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class274(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method674(int arg0, int arg1, int arg2, int arg3) {
        ++field4057;
        if (arg2 == 16384) {
            super.field1239 = arg3;
            super.field1243 = arg1;
            super.field1231 = arg0;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(FI)V", line = 20)
    public final void method677(float arg0, int arg1) {
        if (arg1 != -24673) {
            field4056 = 94;
        }
        super.field1228 = arg0;
        ++field4055;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lza;III)V", line = 36)
    public static final void method1724(class290 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 5) {
            class140.field1843 = new class251[arg2][arg1];
            ++field4053;
            class134.field1759 = arg0;
            if (class469.field6553 != null) {
                class478.field6660 = class101.method701(class469.field6553[1], class469.field6553[5], class469.field6553[3], class469.field6553[0], (byte) 114, class469.field6553[4], class469.field6553[2]);
            }
            class43.field497 = new class251();
            class64.method510(116);
        }
    }
}
