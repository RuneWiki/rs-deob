import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class243 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    private int field3128;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Lss;")
    public class364 field3131;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILos;I)V", line = 3)
    private final void method1380(int arg0, class374 arg1, int arg2) {
        if (arg0 != -3) {
            this.method1382(-119);
        }
        if (arg2 == 1) {
            this.field3128 = arg1.method2136(false);
        } else if (arg2 == 2) {
            this.field3132 = arg1.method2129(-66);
            this.field3129 = arg1.method2129(-93);
        }
        field3125++;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1381(int arg0) {
        if (arg0 != 9407) {
            return;
        }
        field3126++;
        for (int var1 = 0; var1 < 5; var1++) {
            class637.field9150[var1] = false;
        }
        class225.field2767 = -1;
        class611.field8872 = 0;
        class268.field3503 = -1;
        class617.field8931 = 1;
        class189.field2280 = 0;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)Ldp;", line = 50)
    public final synchronized class3 method1382(int arg0) {
        field3130++;
        class3 var2 = (class3) this.field3131.field4785.method3682(arg0 ^ arg0, (long) this.field3128);
        if (var2 != null) {
            return var2;
        }
        class3 var3 = class3.method18(this.field3131.field4783, this.field3128, 0);
        if (var3 != null) {
            this.field3131.field4785.method3684(var3, 0, (long) this.field3128);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Los;I)V", line = 69)
    public final void method1383(class374 arg0, int arg1) {
        if (arg1 != -609) {
            this.field3129 = -55;
        }
        while (true) {
            int var3 = arg0.method2129(-75);
            if (var3 == 0) {
                field3127++;
                return;
            }
            this.method1380(arg1 + 606, arg0, var3);
        }
    }
}
