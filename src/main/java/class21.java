import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HZUGKGVT")
public class class21 {

    @OriginalMember(owner = "HZUGKGVT", name = "a", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "HZUGKGVT", name = "b", descriptor = "[LTSSAWEFF;")
    private class53[] field755;

    @OriginalMember(owner = "HZUGKGVT", name = "<init>", descriptor = "(ZI)V")
    public class21(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field754 = arg1;
        this.field755 = new class53[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            class53 var5 = this.field755[var4] = new class53();
            var5.field1327 = var5;
            var5.field1328 = var5;
        }
    }

    @OriginalMember(owner = "HZUGKGVT", name = "a", descriptor = "(J)LTSSAWEFF;")
    public class53 method248(long arg0) {
        class53 var3 = this.field755[(int) (arg0 & (long) (this.field754 - 1))];
        for (class53 var4 = var3.field1327; var4 != var3; var4 = var4.field1327) {
            if (var4.field1326 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "HZUGKGVT", name = "a", descriptor = "(JZLTSSAWEFF;)V")
    public void method249(long arg0, boolean arg1, class53 arg2) {
        if (arg2.field1328 != null) {
            arg2.method492();
        }
        class53 var5 = this.field755[(int) (arg0 & (long) (this.field754 - 1))];
        if (arg1) {
            return;
        }
        arg2.field1328 = var5.field1328;
        arg2.field1327 = var5;
        arg2.field1328.field1327 = arg2;
        arg2.field1327.field1328 = arg2;
        arg2.field1326 = arg0;
    }
}
