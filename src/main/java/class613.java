import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class613 extends class642 {

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "Lfp;")
    public static class533 field8826;

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
    public class613() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(II)V")
    public static final void method3487(int arg0, int arg1) {
        class44 var2 = class603.field8695[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class44 var4 = class603.field8695[var3][arg0][arg1] = class603.field8695[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class361 var5 = var4.field667; var5 != null; var5 = var5.field5299) {
                    class293 var6 = var5.field5301;
                    if (var6.field4299 == arg0 && var6.field4300 == arg1) {
                        --var6.field7905;
                    }
                }
                if (var4.field672 != null) {
                    --var4.field672.field7905;
                }
                if (var4.field668 != null) {
                    --var4.field668.field7905;
                }
                if (var4.field670 != null) {
                    --var4.field670.field7905;
                }
                if (var4.field669 != null) {
                    --var4.field669.field7905;
                }
                if (var4.field675 != null) {
                    --var4.field675.field7905;
                }
            }
        }
        if (class603.field8695[0][arg0][arg1] == null) {
            class603.field8695[0][arg0][arg1] = new class44(0);
            class603.field8695[0][arg0][arg1].field677 = 1;
        }
        class603.field8695[0][arg0][arg1].field666 = var2;
        class603.field8695[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field8828;
        if (arg1 != -9) {
            return null;
        } else {
            int[] var3 = super.field9216.method1185(arg0, -104);
            if (super.field9216.field2418) {
                class667.method3738(var3, 0, class338.field4909, class400.field6026[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V")
    public static final void method3488(int arg0) {
        class139.method980(-1, -1, 255);
        if (arg0 != 17299) {
            method3488(60);
        }
        ++field8827;
    }

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "(I)V")
    public static void method3489(int arg0) {
        field8826 = null;
        int var1 = 3 / ((-40 - arg0) / 56);
    }
}
