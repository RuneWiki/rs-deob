import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class516 extends class314 {

    @OriginalMember(owner = "client!fs", name = "P", descriptor = "I")
    public static int field7497 = -1;

    @OriginalMember(owner = "client!fs", name = "L", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!fs", name = "M", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!fs", name = "N", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!fs", name = "O", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILi;)V")
    public static final void method3123(int arg0, class37 arg1) {
        class587.field8346[arg0] = arg1;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIII)V")
    public static final void method3124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= class576.field8218 && arg1 <= class340.field5510) {
            int var5 = class160.method1320(0, arg3, class545.field7931, class585.field8331);
            int var6 = class160.method1320(0, arg4, class545.field7931, class585.field8331);
            class80.method766(var5, arg1, var6, arg2, (byte) -116);
        }
        if (arg0 == 21828) {
            ++field7493;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        if (arg1 < 109) {
            field7497 = -14;
        }
        ++field7495;
        int[] var3 = super.field4928.method534((byte) -108, arg0);
        if (super.field4928.field618) {
            class398.method2562(var3, 0, class81.field1009, class657.field9166[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
    public class516() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3125(int arg0, String arg1) {
        ++field7496;
        if (arg0 < 86) {
            field7497 = 6;
        }
        return arg1.length() - -1;
    }
}
