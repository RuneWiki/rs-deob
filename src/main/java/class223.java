import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class223 extends class185 {

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    private int field3340 = 4096;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    private int field3346 = 0;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "J")
    public static long field3342 = 0L;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "[I")
    public static int[] field3344 = new int[200];

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)V")
    public static void method1426(boolean arg0) {
        field3344 = null;
        if (arg0) {
            method1426(false);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class223() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        ++field3345;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field3340 = arg1.method1575(false);
            }
        } else {
            this.field3346 = arg1.method1575(false);
        }
        if (arg2 != -6357) {
            this.method27(51, (class248) null, -99);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field3343;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (arg1 < 70) {
            return null;
        } else {
            if (super.field2804.field1384) {
                int[] var4 = this.method1146((byte) 121, arg0, 0);
                for (int var5 = 0; ~class174.field2648 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field3346 && ~var6 >= ~this.field3340 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}
