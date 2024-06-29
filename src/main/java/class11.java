import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EHIGZZMD")
public class class11 {

    @OriginalMember(owner = "client!EHIGZZMD", name = "a", descriptor = "I")
    private int field631 = -23585;

    @OriginalMember(owner = "client!EHIGZZMD", name = "b", descriptor = "Z")
    private boolean field632 = true;

    @OriginalMember(owner = "client!EHIGZZMD", name = "c", descriptor = "I")
    private int field633;

    @OriginalMember(owner = "client!EHIGZZMD", name = "d", descriptor = "[LBLBQHZXT;")
    private class3[] field634;

    @OriginalMember(owner = "client!EHIGZZMD", name = "<init>", descriptor = "(II)V")
    public class11(int arg0, int arg1) {
        this.field633 = arg1;
        this.field634 = new class3[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class3 var4 = this.field634[var3] = new class3();
            var4.field49 = var4;
            var4.field50 = var4;
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!EHIGZZMD", name = "a", descriptor = "(J)LBLBQHZXT;")
    public class3 method185(long arg0) {
        class3 var3 = this.field634[(int) (arg0 & (long) (this.field633 - 1))];
        for (class3 var4 = var3.field49; var4 != var3; var4 = var4.field49) {
            if (var4.field48 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!EHIGZZMD", name = "a", descriptor = "(JLBLBQHZXT;I)V")
    public void method186(long arg0, class3 arg1, int arg2) {
        if (arg1.field50 != null) {
            arg1.method14();
        }
        class3 var5 = this.field634[(int) (arg0 & (long) (this.field633 - 1))];
        arg1.field50 = var5.field50;
        arg1.field49 = var5;
        arg1.field50.field49 = arg1;
        arg1.field49.field50 = arg1;
        if (arg2 == -42535) {
            arg1.field48 = arg0;
        }
    }
}
