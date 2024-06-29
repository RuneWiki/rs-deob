import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class268 extends class145 {

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    private int field3610 = 4096;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
    private int field3615 = 0;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3606 = "cyan:";

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "Lbi;")
    public static class139 field3611 = null;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field3607 = new String[100];

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "Lfi;")
    public static class166 field3613 = new class166();

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 6)
    public class268() {
        super(1, true);
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V", line = 17)
    public static void method1724(int arg0) {
        field3611 = null;
        field3607 = null;
        if (arg0 == 0) {
            field3606 = null;
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lap;BI)V", line = 30)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field3608;
        int var4 = -10 / ((arg1 - 11) / 52);
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field3610 = arg0.method1853(-78);
            }
        } else {
            this.field3615 = arg0.method1853(120);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I", line = 66)
    public final int[] method3(int arg0, int arg1) {
        int var3 = 82 / ((16 - arg1) / 49);
        ++field3614;
        int[] var4 = super.field2218.method1614(99, arg0);
        if (super.field2218.field3396) {
            int[] var5 = this.method1119(0, 0, arg0);
            for (int var6 = 0; class156.field2364 > var6; ++var6) {
                int var7 = var5[var6];
                var4[var6] = this.field3615 <= var7 && ~this.field3610 <= ~var7 ? 4096 : 0;
            }
        }
        return var4;
    }
}
