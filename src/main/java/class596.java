import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class596 extends class1 {

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "[I")
    public static int[] field8573 = new int[2];

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field8577 = 0;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Lju;")
    public static class102 field8580 = new class102(57, 8);

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Lig;")
    public class674 field8575;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
    public boolean field8578;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "[Lau;")
    public class247[] field8579;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIILha;)Z")
    public final boolean method3528(byte arg0, int arg1, int arg2, class545 arg3) {
        field8576++;
        int var5 = this.field8575.method376(0);
        if (this.field8579 != null) {
            for (int var6 = 0; var6 < this.field8579.length; var6++) {
                this.field8579[var6].field3432 <<= var5;
                if (this.field8579[var6].method1569(arg2, arg1) && this.field8575.method273(arg3, arg2, arg1, -1)) {
                    this.field8579[var6].field3432 >>= var5;
                    return true;
                }
                this.field8579[var6].field3432 >>= var5;
            }
        }
        return arg0 < 113;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
    public static void method3529(boolean arg0) {
        if (arg0) {
            field8573 = null;
        }
        field8573 = null;
        field8580 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    public static final void method3530(int arg0, int arg1) {
        class76.field1040 = arg0;
        if (arg1 > -17) {
            field8573 = null;
        }
        field8574++;
        class202.field2911.method3210(false);
    }
}
