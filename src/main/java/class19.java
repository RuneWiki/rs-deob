import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GRIRTYPY")
public class class19 {

    @OriginalMember(owner = "client!GRIRTYPY", name = "a", descriptor = "Z")
    private boolean field772 = true;

    @OriginalMember(owner = "client!GRIRTYPY", name = "b", descriptor = "I")
    private int field773 = -52;

    @OriginalMember(owner = "client!GRIRTYPY", name = "c", descriptor = "Z")
    private boolean field774 = true;

    @OriginalMember(owner = "client!GRIRTYPY", name = "d", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!GRIRTYPY", name = "e", descriptor = "[LXAQVXEIR;")
    private class66[] field776;

    @OriginalMember(owner = "client!GRIRTYPY", name = "<init>", descriptor = "(BI)V")
    public class19(byte arg0, int arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field772 = !this.field772;
        }
        this.field775 = arg1;
        this.field776 = new class66[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            class66 var5 = this.field776[var4] = new class66();
            var5.field1690 = var5;
            var5.field1691 = var5;
        }
    }

    @OriginalMember(owner = "client!GRIRTYPY", name = "a", descriptor = "(J)LXAQVXEIR;")
    public class66 method222(long arg0) {
        class66 var3 = this.field776[(int) (arg0 & (long) (this.field775 - 1))];
        for (class66 var4 = var3.field1690; var4 != var3; var4 = var4.field1690) {
            if (var4.field1689 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!GRIRTYPY", name = "a", descriptor = "(ILXAQVXEIR;J)V")
    public void method223(int arg0, class66 arg1, long arg2) {
        if (arg1.field1691 != null) {
            arg1.method589();
        }
        class66 var5 = this.field776[(int) (arg2 & (long) (this.field775 - 1))];
        if (arg0 <= 0) {
            return;
        }
        arg1.field1691 = var5.field1691;
        arg1.field1690 = var5;
        arg1.field1691.field1690 = arg1;
        arg1.field1690.field1691 = arg1;
        arg1.field1689 = arg2;
    }
}
