import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HSZHZJQR")
public class class29 {

    @OriginalMember(owner = "HSZHZJQR", name = "a", descriptor = "Z")
    private boolean field886 = true;

    @OriginalMember(owner = "HSZHZJQR", name = "b", descriptor = "B")
    private byte field887 = 117;

    @OriginalMember(owner = "HSZHZJQR", name = "c", descriptor = "I")
    private int field888;

    @OriginalMember(owner = "HSZHZJQR", name = "d", descriptor = "[LIHAIACWA;")
    private class33[] field889;

    @OriginalMember(owner = "HSZHZJQR", name = "<init>", descriptor = "(ZI)V")
    public class29(boolean arg0, int arg1) {
        this.field888 = arg1;
        if (arg0) {
            this.field886 = !this.field886;
        }
        this.field889 = new class33[arg1];
        for (int var3 = 0; var3 < arg1; var3++) {
            class33 var4 = this.field889[var3] = new class33();
            var4.field1007 = var4;
            var4.field1008 = var4;
        }
    }

    @OriginalMember(owner = "HSZHZJQR", name = "a", descriptor = "(J)LIHAIACWA;")
    public class33 method343(long arg0) {
        class33 var3 = this.field889[(int) (arg0 & (long) (this.field888 - 1))];
        for (class33 var4 = var3.field1007; var4 != var3; var4 = var4.field1007) {
            if (var4.field1006 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "HSZHZJQR", name = "a", descriptor = "(BJLIHAIACWA;)V")
    public void method344(byte arg0, long arg1, class33 arg2) {
        if (arg2.field1008 != null) {
            arg2.method379();
        }
        class33 var5 = this.field889[(int) (arg1 & (long) (this.field888 - 1))];
        arg2.field1008 = var5.field1008;
        if (this.field887 != arg0) {
            this.field886 = !this.field886;
        }
        arg2.field1007 = var5;
        arg2.field1008.field1007 = arg2;
        arg2.field1007.field1008 = arg2;
        arg2.field1006 = arg1;
    }
}
